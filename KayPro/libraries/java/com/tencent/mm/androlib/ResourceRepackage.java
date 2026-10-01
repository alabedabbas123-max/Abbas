package com.tencent.mm.androlib;

import com.baidu.mobstat.Config;
import com.tencent.mm.util.FileOperation;
import com.tencent.mm.util.TypedValue;
import com.tencent.mm.util.Utils;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.HashMap;

public class ResourceRepackage {
    private File m7zipOutPutDir;
    private File mAlignedWith7ZipApk;
    private String mApkName;
    private File mOutDir;
    private File mSignedApk;
    private File mSignedWith7ZipApk;
    private File mStoredOutPutDir;
    private final String sevenZipPath;
    private final String zipalignPath;

    public ResourceRepackage(String str, String str2, File file) {
        this.zipalignPath = str;
        this.sevenZipPath = str2;
        this.mSignedApk = file;
    }

    private void addStoredFileIn7Zip(ArrayList<String> arrayList) throws Throwable {
        System.out.printf("[addStoredFileIn7Zip]rewrite the stored file into the 7zip, file count:%d\n", new Integer(arrayList.size()));
        String string = new StringBuffer().append(this.mStoredOutPutDir.getAbsolutePath()).append(File.separator).toString();
        String string2 = new StringBuffer().append(this.m7zipOutPutDir.getAbsolutePath()).append(File.separator).toString();
        for (String str : arrayList) {
            FileOperation.copyFileUsingStream(new File(new StringBuffer().append(string2).append(str).toString()), new File(new StringBuffer().append(string).append(str).toString()));
        }
        Process processStart = new ProcessBuilder(Utils.isPresent(this.sevenZipPath) ? this.sevenZipPath : TypedValue.COMMAND_7ZIP, Config.APP_VERSION_CODE, "-tzip", this.mSignedWith7ZipApk.getAbsolutePath(), new StringBuffer().append(new StringBuffer().append(string).append(File.separator).toString()).append("*").toString(), "-mx0").start();
        while (new LineNumberReader(new InputStreamReader(processStart.getInputStream())).readLine() != null) {
        }
        processStart.waitFor();
        processStart.destroy();
    }

    private void alignApk() throws InterruptedException, IOException {
        if (this.mSignedWith7ZipApk.exists()) {
            alignApk(this.mSignedWith7ZipApk, this.mAlignedWith7ZipApk);
        }
    }

    private void alignApk(File file, File file2) throws InterruptedException, IOException {
        System.out.printf("zipaligning apk: %s\n", file.getName());
        if (!file.exists()) {
            throw new IOException(String.format("can not found the raw apk file to zipalign, path=%s", file.getAbsolutePath()));
        }
        Process processStart = new ProcessBuilder(Utils.isPresent(this.zipalignPath) ? this.zipalignPath : TypedValue.COMMAND_ZIPALIGIN, "4", file.getAbsolutePath(), file2.getAbsolutePath()).start();
        processStart.waitFor();
        processStart.destroy();
    }

    private void deleteUnusedFiles() {
        FileOperation.deleteDir(this.m7zipOutPutDir);
        FileOperation.deleteDir(this.mStoredOutPutDir);
        if (this.mSignedWith7ZipApk.exists()) {
            this.mSignedWith7ZipApk.delete();
        }
    }

    private void generalRaw7zip() throws InterruptedException, IOException {
        System.out.printf("general the raw 7zip file\n", new Object[0]);
        Process processStart = new ProcessBuilder(Utils.isPresent(this.sevenZipPath) ? this.sevenZipPath : TypedValue.COMMAND_7ZIP, Config.APP_VERSION_CODE, "-tzip", this.mSignedWith7ZipApk.getAbsolutePath(), new StringBuffer().append(new StringBuffer().append(this.m7zipOutPutDir.getAbsoluteFile().getAbsolutePath()).append(File.separator).toString()).append("*").toString(), "-mx9").start();
        while (new LineNumberReader(new InputStreamReader(processStart.getInputStream())).readLine() != null) {
        }
        processStart.waitFor();
        processStart.destroy();
    }

    private void insureFileName() throws IOException {
        if (!this.mSignedApk.exists()) {
            throw new IOException(String.format(new StringBuffer().append("can not found the signed apk file to repackage").append(", path=%s").toString(), this.mSignedApk.getAbsolutePath()));
        }
        String name = this.mSignedApk.getName();
        this.mApkName = name.substring(0, name.indexOf(".apk"));
        if (this.mOutDir == null) {
            this.mOutDir = new File(this.mSignedApk.getAbsoluteFile().getParent(), this.mApkName);
        }
        this.mSignedWith7ZipApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_channel_7zip.apk").toString());
        this.mAlignedWith7ZipApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_channel_7zip_aligned.apk").toString());
        this.m7zipOutPutDir = new File(this.mOutDir.getAbsolutePath(), TypedValue.OUT_7ZIP_FILE_PATH);
        this.mStoredOutPutDir = new File(this.mOutDir.getAbsolutePath(), "storefiles");
        FileOperation.deleteDir(this.m7zipOutPutDir);
        FileOperation.deleteDir(this.mStoredOutPutDir);
        FileOperation.deleteDir(this.mSignedWith7ZipApk);
        FileOperation.deleteDir(this.mAlignedWith7ZipApk);
    }

    private void repackageWith7z() throws Throwable {
        System.out.printf("use 7zip to repackage: %s, will cost much more time\n", this.mSignedWith7ZipApk.getName());
        HashMap<String, Integer> mapUnZipAPk = FileOperation.unZipAPk(this.mSignedApk.getAbsolutePath(), this.m7zipOutPutDir.getAbsolutePath());
        generalRaw7zip();
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : mapUnZipAPk.keySet()) {
            if (new File(this.m7zipOutPutDir.getAbsolutePath(), str).exists() && mapUnZipAPk.get(str).intValue() == 0) {
                arrayList.add(str);
            }
        }
        addStoredFileIn7Zip(arrayList);
        if (!this.mSignedWith7ZipApk.exists()) {
            throw new IOException(String.format("[repackageWith7z]7z repackage signed apk fail,you must install 7z command line version first, linux: zip, window: 7za, path=%s", this.mSignedWith7ZipApk.getAbsolutePath()));
        }
    }

    public void repackageApk() throws Throwable {
        insureFileName();
        repackageWith7z();
        alignApk();
        deleteUnusedFiles();
    }

    public void setOutDir(File file) {
        this.mOutDir = file;
    }
}
