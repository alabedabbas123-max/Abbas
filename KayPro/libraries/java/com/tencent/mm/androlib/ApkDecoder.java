package com.tencent.mm.androlib;

import android.util.Log;
import com.tencent.mm.androlib.res.data.ResPackage;
import com.tencent.mm.androlib.res.decoder.ARSCDecoder;
import com.tencent.mm.androlib.res.decoder.RawARSCDecoder;
import com.tencent.mm.androlib.res.util.ExtFile;
import com.tencent.mm.directory.DirectoryException;
import com.tencent.mm.resourceproguard.Configuration;
import com.tencent.mm.util.FileOperation;
import com.tencent.mm.util.TypedValue;
import com.tencent.mm.util.Utils;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class ApkDecoder {

    private String f5096TAG;
    private final ExtFile apkFile;
    private final Configuration config;
    private HashMap<String, Integer> mCompressData;
    private File mMergeDuplicatedResMappingFile;
    private File mOutARSCFile;
    private File mOutDir;
    private File mOutResFile;
    private File mOutTempARSCFile;
    private File mOutTempDir;
    private File mRawResFile;
    final HashSet<File> mRawResourceFiles = new HashSet<>();
    private File mResMappingFile;

    public ApkDecoder(Configuration configuration, File file) {
        try {
            this.f5096TAG = Class.forName("com.tencent.mm.androlib.ApkDecoder").getSimpleName();
            this.config = configuration;
            this.apkFile = new ExtFile(file);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private void addDirAllFile(File file) {
        File[] fileArrListFiles = file == null ? (File[]) null : file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    addDirAllFile(file2);
                } else {
                    this.mRawResourceFiles.add(file2);
                }
            }
        }
    }

    private void copyOtherResFiles() throws Throwable {
        if (this.mRawResourceFiles.size() == 0) {
            Log.e(this.f5096TAG, "mRawResourceFiles size for empty");
            return;
        }
        URI uri = this.mRawResFile.toURI();
        URI uri2 = this.mOutResFile.toURI();
        for (File file : this.mRawResourceFiles) {
            FileOperation.copyFileUsingStream(file, new File(uri2.resolve(uri.relativize(file.toURI()))));
        }
    }

    private void dealWithCompressConfig() {
        if (this.config.mUseCompress) {
            HashSet<Pattern> hashSet = this.config.mCompressPatterns;
            if (hashSet.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, Integer>> it = this.mCompressData.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                Iterator<Pattern> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    if (it2.next().matcher(key).matches()) {
                        this.mCompressData.put(key, new Integer(8));
                    }
                }
            }
        }
    }

    private void ensureFilePath() throws IOException {
        Utils.cleanDir(this.mOutDir);
        String absolutePath = new File(this.mOutDir, TypedValue.UNZIP_FILE_PATH).getAbsolutePath();
        System.out.printf("unziping apk to %s\n", absolutePath);
        this.mCompressData = FileOperation.unZipAPk(this.apkFile.getAbsoluteFile().getAbsolutePath(), absolutePath);
        dealWithCompressConfig();
        if (this.config.mKeepRoot) {
            this.mOutResFile = new File(new StringBuffer().append(new StringBuffer().append(this.mOutDir.getAbsolutePath()).append(File.separator).toString()).append("res").toString());
        } else {
            this.mOutResFile = new File(new StringBuffer().append(new StringBuffer().append(this.mOutDir.getAbsolutePath()).append(File.separator).toString()).append("r").toString());
        }
        this.mRawResFile = new File(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.mOutDir.getAbsoluteFile().getAbsolutePath()).append(File.separator).toString()).append(TypedValue.UNZIP_FILE_PATH).toString()).append(File.separator).toString()).append("res").toString());
        this.mOutTempDir = new File(new StringBuffer().append(new StringBuffer().append(this.mOutDir.getAbsoluteFile().getAbsolutePath()).append(File.separator).toString()).append(TypedValue.UNZIP_FILE_PATH).toString());
        Log.i("mRawResFile", this.mRawResFile.getAbsolutePath());
        addDirAllFile(this.mRawResFile);
        Log.i("mRawResourceFilesSize", new StringBuffer().append(this.mRawResourceFiles.size()).append("").toString());
        if (!this.mRawResFile.exists() || !this.mRawResFile.isDirectory()) {
            throw new IOException("can not found res dir in the apk or it is not a dir");
        }
        this.mOutTempARSCFile = new File(new StringBuffer().append(new StringBuffer().append(this.mOutDir.getAbsoluteFile().getAbsolutePath()).append(File.separator).toString()).append("resources_temp.arsc").toString());
        this.mOutARSCFile = new File(new StringBuffer().append(new StringBuffer().append(this.mOutDir.getAbsoluteFile().getAbsolutePath()).append(File.separator).toString()).append("resources.arsc").toString());
        String strSubstring = this.apkFile.getName().substring(0, this.apkFile.getName().indexOf(".apk"));
        this.mResMappingFile = new File(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.mOutDir.getAbsoluteFile().getAbsolutePath()).append(File.separator).toString()).append(TypedValue.RES_MAPPING_FILE).toString()).append(strSubstring).toString()).append(TypedValue.TXT_FILE).toString());
        this.mMergeDuplicatedResMappingFile = new File(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.mOutDir.getAbsoluteFile().getAbsolutePath()).append(File.separator).toString()).append(TypedValue.MERGE_DUPLICATED_RES_MAPPING_FILE).toString()).append(strSubstring).toString()).append(TypedValue.TXT_FILE).toString());
    }

    public void decode() throws Throwable {
        if (hasResources()) {
            ensureFilePath();
            System.out.printf("decoding resources.arsc\n", new Object[0]);
            RawARSCDecoder.decode(this.apkFile.getDirectory().getFileInput("resources.arsc"));
            ResPackage[] resPackageArrDecode = ARSCDecoder.decode(this.apkFile.getDirectory().getFileInput("resources.arsc"), this);
            copyOtherResFiles();
            ARSCDecoder.write(this.apkFile.getDirectory().getFileInput("resources.arsc"), this, resPackageArrDecode);
        }
    }

    public HashMap<String, Integer> getCompressData() {
        return this.mCompressData;
    }

    public Configuration getConfig() {
        return this.config;
    }

    public File getMergeDuplicatedResMappingFile() {
        return this.mMergeDuplicatedResMappingFile;
    }

    public File getOutARSCFile() {
        return this.mOutARSCFile;
    }

    public File getOutDir() {
        return this.mOutDir;
    }

    public File getOutResFile() {
        return this.mOutResFile;
    }

    public File getOutTempARSCFile() {
        return this.mOutTempARSCFile;
    }

    public File getOutTempDir() {
        return this.mOutTempDir;
    }

    public File getRawResFile() {
        return this.mRawResFile;
    }

    public File getResMappingFile() {
        return this.mResMappingFile;
    }

    public boolean hasResources() throws AndrolibException {
        try {
            return this.apkFile.getDirectory().containsFile("resources.arsc");
        } catch (DirectoryException e) {
            throw new AndrolibException(e);
        }
    }

    public void removeCopiedResFile(File file) {
        this.mRawResourceFiles.remove(file);
    }

    public void setOutDir(File file) throws AndrolibException {
        this.mOutDir = file;
    }
}
