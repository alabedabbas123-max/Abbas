package org.xutils.http.request;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.cache.LruDiskCache;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;

public class ResRequest extends UriRequest {
    private static long lastModifiedTime = 0;
    protected long contentLength;
    protected InputStream inputStream;

    public ResRequest(RequestParams requestParams, Type type) throws Throwable {
        super(requestParams, type);
        this.contentLength = 0L;
    }

    @Override
    public void sendRequest() throws Throwable {
    }

    @Override
    public boolean isLoading() {
        return true;
    }

    @Override
    public String getCacheKey() {
        return this.queryUrl;
    }

    @Override
    public Object loadResult() throws Throwable {
        return this.loader.load(this);
    }

    @Override
    public Object loadResultFromCache() throws Throwable {
        Date lastModify;
        DiskCacheEntity diskCacheEntityM9037get = LruDiskCache.getDiskCache(this.params.getCacheDirName()).setMaxSize(this.params.getCacheSize()).m9037get(getCacheKey());
        if (diskCacheEntityM9037get == null || (lastModify = diskCacheEntityM9037get.getLastModify()) == null || lastModify.getTime() < getLastModified()) {
            return null;
        }
        return this.loader.loadFromCache(diskCacheEntityM9037get);
    }

    @Override
    public void clearCacheHeader() {
    }

    private int getResId() {
        int i = 0;
        String strReplace = this.queryUrl.substring("res:".length()).replace("/", "");
        if (TextUtils.isDigitsOnly(strReplace)) {
            i = Integer.parseInt(strReplace);
        }
        if (i <= 0) {
            throw new IllegalArgumentException("resId not found in url:" + this.queryUrl);
        }
        return i;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        if (this.inputStream == null) {
            this.inputStream = this.params.getContext().getResources().openRawResource(getResId());
            this.contentLength = this.inputStream.available();
        }
        return this.inputStream;
    }

    @Override
    public void close() throws IOException {
        IOUtil.closeQuietly(this.inputStream);
        this.inputStream = null;
    }

    @Override
    public long getContentLength() {
        try {
            getInputStream();
            return this.contentLength;
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
            return -1L;
        }
    }

    @Override
    public int getResponseCode() throws IOException {
        return getInputStream() != null ? 200 : 404;
    }

    @Override
    public String getResponseMessage() throws IOException {
        return null;
    }

    @Override
    public long getExpiration() {
        return Long.MAX_VALUE;
    }

    @Override
    public long getLastModified() {
        if (lastModifiedTime == 0) {
            try {
                File file = new File(this.params.getContext().getApplicationInfo().sourceDir);
                if (file.exists()) {
                    lastModifiedTime = file.lastModified();
                }
            } catch (Throwable th) {
                LogUtil.m9052w(th.getMessage(), th);
                lastModifiedTime = 0L;
            } finally {
                if (lastModifiedTime == 0) {
                    lastModifiedTime = System.currentTimeMillis();
                }
            }
        }
        return lastModifiedTime;
    }

    @Override
    public String getETag() {
        return null;
    }

    @Override
    public String getResponseHeader(String str) {
        return null;
    }

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        return null;
    }

    @Override
    public long getHeaderFieldDate(String str, long j) {
        return j;
    }
}
