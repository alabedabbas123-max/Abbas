package org.xutils.http.loader;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Date;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.cache.DiskCacheFile;
import org.xutils.cache.LruDiskCache;
import org.xutils.common.Callback;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.common.util.ProcessLock;
import org.xutils.http.RequestParams;
import org.xutils.http.request.UriRequest;
import org.xutils.ex.FileLockedException;
import org.xutils.ex.HttpException;

public class FileLoader extends Loader<File> {
    private static final int CHECK_SIZE = 512;
    private long contentLength;
    private DiskCacheFile diskCacheFile;
    private boolean isAutoRename;
    private boolean isAutoResume;
    private RequestParams params;
    private String responseFileName;
    private String saveFilePath;
    private String tempSaveFilePath;

    @Override
    public Loader<File> newInstance() {
        return new FileLoader();
    }

    @Override
    public void setParams(RequestParams requestParams) {
        if (requestParams != null) {
            this.params = requestParams;
            this.isAutoResume = requestParams.isAutoResume();
            this.isAutoRename = requestParams.isAutoRename();
        }
    }

    protected File load(InputStream inputStream) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        try {
            File file = new File(this.tempSaveFilePath);
            if (file.isDirectory()) {
                throw new IOException("could not create the file: " + this.tempSaveFilePath);
            }
            if (!file.exists()) {
                File parentFile = file.getParentFile();
                if ((!parentFile.exists() && !parentFile.mkdirs()) || !parentFile.isDirectory()) {
                    throw new IOException("could not create the dir: " + parentFile.getAbsolutePath());
                }
            }
            long length = file.length();
            if (this.isAutoResume && length > 0) {
                long j = length - 512;
                try {
                    if (j <= 0) {
                        IOUtil.deleteFileOrDir(file);
                        throw new RuntimeException("need retry");
                    }
                    fileInputStream = new FileInputStream(file);
                    try {
                        if (!Arrays.equals(IOUtil.readBytes(inputStream, 0L, 512), IOUtil.readBytes(fileInputStream, j, 512))) {
                            IOUtil.closeQuietly(fileInputStream);
                            IOUtil.deleteFileOrDir(file);
                            throw new RuntimeException("need retry");
                        }
                        this.contentLength -= 512;
                        IOUtil.closeQuietly(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        IOUtil.closeQuietly(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = null;
                }
            }
            if (this.isAutoResume) {
                fileOutputStream = new FileOutputStream(file, true);
            } else {
                fileOutputStream = new FileOutputStream(file);
                length = 0;
            }
            long j2 = this.contentLength + length;
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                try {
                    if (this.progressHandler != null && !this.progressHandler.updateProgress(j2, length, true)) {
                        throw new Callback.CancelledException("download stopped!");
                    }
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = bufferedInputStream2.read(bArr);
                        if (i == -1) {
                            bufferedOutputStream2.flush();
                            if (this.diskCacheFile != null) {
                                file = this.diskCacheFile.commit();
                            }
                            if (this.progressHandler != null) {
                                this.progressHandler.updateProgress(j2, length, true);
                            }
                            IOUtil.closeQuietly(bufferedInputStream2);
                            IOUtil.closeQuietly(bufferedOutputStream2);
                            return autoRename(file);
                        }
                        if (!file.getParentFile().exists()) {
                            file.getParentFile().mkdirs();
                            throw new IOException("parent be deleted!");
                        }
                        bufferedOutputStream2.write(bArr, 0, i);
                        length += (long) i;
                        if (this.progressHandler != null && !this.progressHandler.updateProgress(j2, length, false)) {
                            bufferedOutputStream2.flush();
                            throw new Callback.CancelledException("download stopped!");
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = bufferedOutputStream2;
                    bufferedInputStream = bufferedInputStream2;
                    IOUtil.closeQuietly(bufferedInputStream);
                    IOUtil.closeQuietly(bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
                bufferedInputStream = bufferedInputStream2;
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            bufferedInputStream = null;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public File load(UriRequest uriRequest) throws Throwable {
        ProcessLock processLock;
        File fileAutoRename;
        long j;
        ProcessLock processLock2 = null;
        try {
            try {
                this.saveFilePath = this.params.getSaveFilePath();
                this.diskCacheFile = null;
                if (!TextUtils.isEmpty(this.saveFilePath)) {
                    this.tempSaveFilePath = this.saveFilePath + ".tmp";
                } else {
                    if (this.progressHandler != null && !this.progressHandler.updateProgress(0L, 0L, false)) {
                        throw new Callback.CancelledException("download stopped!");
                    }
                    initDiskCacheFile(uriRequest);
                }
                if (this.progressHandler != null && !this.progressHandler.updateProgress(0L, 0L, false)) {
                    throw new Callback.CancelledException("download stopped!");
                }
                ProcessLock processLockTryLock = ProcessLock.tryLock(this.saveFilePath + "_lock", true);
                if (processLockTryLock != null) {
                    try {
                        if (processLockTryLock.isValid()) {
                            this.params = uriRequest.getParams();
                            if (this.isAutoResume) {
                                File file = new File(this.tempSaveFilePath);
                                long length = file.length();
                                if (length <= 512) {
                                    IOUtil.deleteFileOrDir(file);
                                    j = 0;
                                } else {
                                    j = length - 512;
                                }
                            } else {
                                j = 0;
                            }
                            this.params.setHeader("Range", "bytes=" + j + "-");
                            if (this.progressHandler != null && !this.progressHandler.updateProgress(0L, 0L, false)) {
                                throw new Callback.CancelledException("download stopped!");
                            }
                            uriRequest.sendRequest();
                            this.contentLength = uriRequest.getContentLength();
                            if (this.isAutoRename) {
                                this.responseFileName = getResponseFileName(uriRequest);
                            }
                            if (this.isAutoResume) {
                                this.isAutoResume = isSupportRange(uriRequest);
                            }
                            if (this.progressHandler != null && !this.progressHandler.updateProgress(0L, 0L, false)) {
                                throw new Callback.CancelledException("download stopped!");
                            }
                            if (this.diskCacheFile != null) {
                                try {
                                    DiskCacheEntity cacheEntity = this.diskCacheFile.getCacheEntity();
                                    cacheEntity.setLastAccess(System.currentTimeMillis());
                                    cacheEntity.setEtag(uriRequest.getETag());
                                    cacheEntity.setExpires(uriRequest.getExpiration());
                                    cacheEntity.setLastModify(new Date(uriRequest.getLastModified()));
                                } catch (Throwable th) {
                                    LogUtil.m9046e(th.getMessage(), th);
                                }
                            }
                            fileAutoRename = load(uriRequest.getInputStream());
                            IOUtil.closeQuietly(processLockTryLock);
                            IOUtil.closeQuietly(this.diskCacheFile);
                            return fileAutoRename;
                        }
                    } catch (HttpException e) {
                        e = e;
                        processLock = processLockTryLock;
                        try {
                            if (e.getCode() != 416) {
                                throw e;
                            }
                            File fileCommit = this.diskCacheFile != null ? this.diskCacheFile.commit() : new File(this.tempSaveFilePath);
                            if (fileCommit == null || !fileCommit.exists()) {
                                IOUtil.deleteFileOrDir(fileCommit);
                                throw new IllegalStateException("cache file not found" + uriRequest.getCacheKey());
                            }
                            if (this.isAutoRename) {
                                this.responseFileName = getResponseFileName(uriRequest);
                            }
                            fileAutoRename = autoRename(fileCommit);
                            IOUtil.closeQuietly(processLock);
                            IOUtil.closeQuietly(this.diskCacheFile);
                        } catch (Throwable th2) {
                            th = th2;
                            processLock2 = processLock;
                            IOUtil.closeQuietly(processLock2);
                            IOUtil.closeQuietly(this.diskCacheFile);
                            throw th;
                        }
                    }
                }
                throw new FileLockedException("download exists: " + this.saveFilePath);
            } catch (Throwable th3) {
                th = th3;
                IOUtil.closeQuietly(processLock2);
                IOUtil.closeQuietly(this.diskCacheFile);
                throw th;
            }
        } catch (HttpException e2) {
            e = e2;
            processLock = null;
        }
    }

    private void initDiskCacheFile(UriRequest uriRequest) throws Throwable {
        DiskCacheEntity diskCacheEntity = new DiskCacheEntity();
        diskCacheEntity.setKey(uriRequest.getCacheKey());
        this.diskCacheFile = LruDiskCache.getDiskCache(this.params.getCacheDirName()).createDiskCacheFile(diskCacheEntity);
        if (this.diskCacheFile != null) {
            this.saveFilePath = this.diskCacheFile.getAbsolutePath();
            this.tempSaveFilePath = this.saveFilePath;
            this.isAutoRename = false;
            return;
        }
        throw new IOException("create cache file error:" + uriRequest.getCacheKey());
    }

    private File autoRename(File file) {
        if (this.isAutoRename && file.exists() && !TextUtils.isEmpty(this.responseFileName)) {
            File file2 = new File(file.getParent(), this.responseFileName);
            while (file2.exists()) {
                file2 = new File(file.getParent(), System.currentTimeMillis() + this.responseFileName);
            }
            if (!file.renameTo(file2)) {
                file2 = file;
            }
            return file2;
        }
        if (!this.saveFilePath.equals(this.tempSaveFilePath)) {
            File file3 = new File(this.saveFilePath);
            return file.renameTo(file3) ? file3 : file;
        }
        return file;
    }

    private static String getResponseFileName(UriRequest uriRequest) {
        int iIndexOf;
        if (uriRequest == null) {
            return null;
        }
        String responseHeader = uriRequest.getResponseHeader("Content-Disposition");
        if (!TextUtils.isEmpty(responseHeader) && (iIndexOf = responseHeader.indexOf("filename=")) > 0) {
            int i = iIndexOf + 9;
            int iIndexOf2 = responseHeader.indexOf(";", i);
            if (iIndexOf2 < 0) {
                iIndexOf2 = responseHeader.length();
            }
            if (iIndexOf2 > i) {
                try {
                    String strDecode = URLDecoder.decode(responseHeader.substring(i, iIndexOf2), uriRequest.getParams().getCharset());
                    if (strDecode.startsWith("\"") && strDecode.endsWith("\"")) {
                        return strDecode.substring(1, strDecode.length() - 1);
                    }
                    return strDecode;
                } catch (UnsupportedEncodingException e) {
                    LogUtil.m9046e(e.getMessage(), e);
                }
            }
        }
        return null;
    }

    private static boolean isSupportRange(UriRequest uriRequest) {
        if (uriRequest == null) {
            return false;
        }
        String responseHeader = uriRequest.getResponseHeader("Accept-Ranges");
        if (responseHeader != null) {
            return responseHeader.contains("bytes");
        }
        String responseHeader2 = uriRequest.getResponseHeader("Content-Range");
        return responseHeader2 != null && responseHeader2.contains("bytes");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public File loadFromCache(DiskCacheEntity diskCacheEntity) throws Throwable {
        return LruDiskCache.getDiskCache(this.params.getCacheDirName()).getDiskCacheFile(diskCacheEntity.getKey());
    }

    @Override
    public void save2Cache(UriRequest uriRequest) {
    }
}
