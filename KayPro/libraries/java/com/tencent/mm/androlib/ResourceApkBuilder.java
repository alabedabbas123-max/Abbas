package com.tencent.mm.androlib;

import com.baidu.mobstat.Config;
import com.tencent.mm.androlib.res.decoder.ARSCDecoder;
import com.tencent.mm.resourceproguard.Configuration;
import com.tencent.mm.util.FileOperation;
import com.tencent.mm.util.TypedValue;
import com.tencent.mm.util.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResourceApkBuilder {
    private static boolean $assertionsDisabled;
    private final Configuration config;
    private File finalApkFile;
    private File m7ZipApk;
    private File m7zipOutPutDir;
    private File mAlignedApk;
    private File mAlignedWith7ZipApk;
    private String mApkName;
    private File mOutDir;
    private File mSignedApk;
    private File mSignedWith7ZipApk;
    private File mUnSignedApk;

    static {
        try {
            $assertionsDisabled = !Class.forName("com.tencent.mm.androlib.ResourceApkBuilder").desiredAssertionStatus();
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public ResourceApkBuilder(Configuration configuration) {
        this.config = configuration;
    }

    private void addNonSignatureFiles(List<File> list, File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                if (!name.endsWith(".MF") && !name.endsWith(".RSA") && !name.endsWith(".SF")) {
                    System.out.println(String.format("add meta file %s", file2.getAbsolutePath()));
                    list.add(file2);
                }
            }
        }
    }

    private void addStoredFileIn7Zip(ArrayList<String> arrayList, File file) throws Throwable {
        System.out.printf("[addStoredFileIn7Zip]rewrite the stored file into the 7zip, file count: %d\n", new Integer(arrayList.size()));
        if (arrayList.size() == 0) {
            return;
        }
        String string = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.mOutDir.getAbsolutePath()).append(File.separator).toString()).append("storefiles").toString()).append(File.separator).toString();
        String string2 = new StringBuffer().append(this.m7zipOutPutDir.getAbsolutePath()).append(File.separator).toString();
        for (String str : arrayList) {
            FileOperation.copyFileUsingStream(new File(new StringBuffer().append(string2).append(str).toString()), new File(new StringBuffer().append(string).append(str).toString()));
        }
        Utils.runCmd(Utils.isPresent(this.config.m7zipPath) ? this.config.m7zipPath : TypedValue.COMMAND_7ZIP, Config.APP_VERSION_CODE, "-tzip", file.getAbsolutePath(), new StringBuffer().append(new StringBuffer().append(string).append(File.separator).toString()).append("*").toString(), "-mx0");
    }

    private void alignApk(File file, File file2) throws Throwable {
        System.out.printf("zipaligning apk: %s, exists:%b\n", file.getAbsolutePath(), new Boolean(file.exists()));
        if (!file.exists()) {
            throw new IOException(String.format("can not found the raw apk file to zipalign, path=%s", file.getAbsolutePath()));
        }
        Utils.runCmd(Utils.isPresent(this.config.mZipalignPath) ? this.config.mZipalignPath : TypedValue.COMMAND_ZIPALIGIN, "4", file.getAbsolutePath(), file2.getAbsolutePath());
        if (!file2.exists()) {
            throw new IOException(String.format("can not found the aligned apk file, the ZipAlign path is correct? path=%s", this.mAlignedApk.getAbsolutePath()));
        }
    }

    private void alignApks() throws Throwable {
        if (this.config.mUseSignAPK) {
            if (!this.mSignedApk.exists() && !this.mSignedWith7ZipApk.exists()) {
                throw new IOException("Can not found any signed apk file");
            }
            if (this.mSignedApk.exists()) {
                alignApk(this.mSignedApk, this.mAlignedApk);
            }
            if (this.mSignedWith7ZipApk.exists()) {
                alignApk(this.mSignedWith7ZipApk, this.mAlignedWith7ZipApk);
            }
        }
    }

    private void copyFinalApkV1() throws Throwable {
        if (this.finalApkFile != null) {
            System.out.println(String.format("Backup Final APk(V1) to %s", this.finalApkFile));
            if (this.mSignedWith7ZipApk.exists()) {
                FileOperation.copyFileUsingStream(this.mAlignedWith7ZipApk, this.finalApkFile);
            } else if (this.mSignedApk.exists()) {
                FileOperation.copyFileUsingStream(this.mAlignedApk, this.finalApkFile);
            }
        }
    }

    private void copyFinalApkV2() throws Throwable {
        if (!this.mSignedApk.exists() || this.finalApkFile == null) {
            return;
        }
        System.out.println(String.format("Backup Final APk(V2) to %s", this.finalApkFile));
        FileOperation.copyFileUsingStream(this.mSignedApk, this.finalApkFile);
    }

    private String formatHashAlgorithName(String str) {
        return str.replace("-", "");
    }

    private void generalRaw7zip(File file) throws Throwable {
        Utils.runCmd(Utils.isPresent(this.config.m7zipPath) ? this.config.m7zipPath : TypedValue.COMMAND_7ZIP, Config.APP_VERSION_CODE, "-tzip", file.getAbsolutePath(), new StringBuffer().append(new StringBuffer().append(this.m7zipOutPutDir.getAbsoluteFile().getAbsolutePath()).append(File.separator).toString()).append("*").toString(), "-mx9");
    }

    private void generalUnsignApk(HashMap<String, Integer> map) throws InterruptedException, IOException {
        System.out.printf("General unsigned apk: %s\n", this.mUnSignedApk.getName());
        File file = new File(this.mOutDir.getAbsolutePath(), TypedValue.UNZIP_FILE_PATH);
        if (!file.exists()) {
            System.err.printf("Missing apk unzip files, path=%s\n", file.getAbsolutePath());
            throw new IOException(new StringBuffer().append("Missing apk unzip files, path=%s\n").append(file.getAbsolutePath()).toString());
        }
        File[] fileArrListFiles = file.listFiles();
        if (!$assertionsDisabled && fileArrListFiles == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            if (!name.equals("res") && !name.equals("resources.arsc")) {
                if (name.equals(this.config.mMetaName)) {
                    addNonSignatureFiles(arrayList, file2);
                } else {
                    arrayList.add(file2);
                }
            }
        }
        File file3 = new File(this.mOutDir.getAbsolutePath(), "res");
        if (!this.config.mKeepRoot && FileOperation.getlist(file3) == 0) {
            file3 = new File(this.mOutDir.getAbsolutePath(), "r");
        }
        File file4 = new File(new StringBuffer().append(new StringBuffer().append(file.getAbsolutePath()).append(File.separator).toString()).append("res").toString());
        System.out.printf("DestResDir %d rawResDir %d\n", new Long(FileOperation.getlist(file3)), new Long(FileOperation.getlist(file4)));
        if (FileOperation.getlist(file3) != FileOperation.getlist(file4) - ((long) ARSCDecoder.mMergeDuplicatedResCount)) {
            throw new IOException(String.format("the file count of %s, and the file count of %s is not equal, there must be some problem\n", file4.getAbsolutePath(), file3.getAbsolutePath()));
        }
        if (!file3.exists()) {
            throw new IOException(new StringBuffer().append("Missing res files, path=%s\n").append(file3.getAbsolutePath()).toString());
        }
        arrayList.add(file3);
        File file5 = new File(new StringBuffer().append(new StringBuffer().append(this.mOutDir.getAbsolutePath()).append(File.separator).toString()).append("resources.arsc").toString());
        if (!file5.exists()) {
            throw new IOException(new StringBuffer().append("Missing resources.arsc files, path=%s\n").append(file5.getAbsolutePath()).toString());
        }
        arrayList.add(file5);
        FileOperation.zipFiles(arrayList, file, this.mUnSignedApk, map);
        if (!this.mUnSignedApk.exists()) {
            throw new IOException(String.format("can not found the unsign apk file path=%s", this.mUnSignedApk.getAbsolutePath()));
        }
    }

    private String getSignatureAlgorithm(String str) throws Exception {
        String str2;
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(new FileInputStream(this.config.mSignatureFile), this.config.mStorePass.toCharArray());
        Key key = keyStore.getKey(this.config.mStoreAlias, this.config.mKeyPass.toCharArray());
        if (key == null) {
            throw new RuntimeException("Can't get private key, please check if storepass storealias and keypass are correct");
        }
        String algorithm = key.getAlgorithm();
        String hashAlgorithName = formatHashAlgorithName(str);
        if (algorithm.equalsIgnoreCase("DSA")) {
            str2 = "DSA";
        } else if (algorithm.equalsIgnoreCase("RSA")) {
            str2 = "RSA";
        } else {
            if (!algorithm.equalsIgnoreCase("EC")) {
                throw new RuntimeException("private key is not a DSA or RSA key");
            }
            str2 = "ECDSA";
        }
        return String.format("%swith%s", hashAlgorithName, str2);
    }

    private void insureFileNameV1() {
        this.mUnSignedApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_unsigned.apk").toString());
        this.mSignedWith7ZipApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_signed_7zip.apk").toString());
        this.mSignedApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_signed.apk").toString());
        this.mAlignedApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_signed_aligned.apk").toString());
        this.mAlignedWith7ZipApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_signed_7zip_aligned.apk").toString());
        this.m7zipOutPutDir = new File(this.mOutDir.getAbsolutePath(), TypedValue.OUT_7ZIP_FILE_PATH);
    }

    private void insureFileNameV2() {
        this.mUnSignedApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_unsigned.apk").toString());
        this.m7ZipApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_7zip_unsigned.apk").toString());
        if (this.config.mUse7zip) {
            this.mAlignedApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_7zip_aligned_unsigned.apk").toString());
            this.mSignedApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_7zip_aligned_signed.apk").toString());
        } else {
            this.mAlignedApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_aligned_unsigned.apk").toString());
            this.mSignedApk = new File(this.mOutDir.getAbsolutePath(), new StringBuffer().append(this.mApkName).append("_aligned_signed.apk").toString());
        }
        this.m7zipOutPutDir = new File(this.mOutDir.getAbsolutePath(), TypedValue.OUT_7ZIP_FILE_PATH);
    }

    private void signApkV1(File file, File file2) throws Throwable {
        if (this.config.mUseSignAPK) {
            System.out.printf("signing apk: %s\n", file2.getName());
            if (file2.exists()) {
                file2.delete();
            }
            signWithV1sign(file, file2);
            if (!file2.exists()) {
                throw new IOException("Can't Generate signed APK. Plz check your v1sign info is correct.");
            }
        }
    }

    private void signApkV2(File file, File file2, int i) throws Exception {
        if (this.config.mUseSignAPK) {
            System.out.printf("signing apk: %s\n", file2.getName());
            signWithV2sign(file, file2, i);
            if (!file2.exists()) {
                throw new IOException("Can't Generate signed APK v2. Plz check your v2sign info is correct.");
            }
        }
    }

    private void signWithV1sign(File file, File file2) throws Throwable {
        String signatureAlgorithm = "MD5withRSA";
        try {
            signatureAlgorithm = getSignatureAlgorithm(this.config.digestAlg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Utils.runExec(new String[]{"jarsigner", "-sigalg", signatureAlgorithm, "-digestalg", this.config.digestAlg, "-keystore", this.config.mSignatureFile.getAbsolutePath(), "-storepass", this.config.mStorePass, "-keypass", this.config.mKeyPass, "-signedjar", file2.getAbsolutePath(), file.getAbsolutePath(), this.config.mStoreAlias});
    }

    private void signWithV2sign(File file, File file2, int i) throws Exception {
        String[] strArr = {"sign", "--ks", this.config.mSignatureFile.getAbsolutePath(), "--ks-pass", new StringBuffer().append("pass:").append(this.config.mStorePass).toString(), "--min-sdk-version", String.valueOf(i), "--ks-key-alias", this.config.mStoreAlias, "--key-pass", new StringBuffer().append("pass:").append(this.config.mKeyPass).toString(), "--out", file2.getAbsolutePath(), file.getAbsolutePath()};
    }

    private boolean use7zApk(HashMap<String, Integer> map, File file, File file2) throws Throwable {
        if (!this.config.mUse7zip) {
            return false;
        }
        if (!this.config.mUseSignAPK) {
            throw new IOException("if you want to use 7z, you must enable useSign in the config file first");
        }
        if (!file.exists()) {
            throw new IOException(String.format(new StringBuffer().append("can not found the signed apk file to 7z, if you want to use 7z, ").append("you must fill the sign data in the config file path=%s").toString(), file.getAbsolutePath()));
        }
        System.out.printf("use 7zip to repackage: %s, will cost much more time\n", file2.getName());
        FileOperation.unZipAPk(file.getAbsolutePath(), this.m7zipOutPutDir.getAbsolutePath());
        generalRaw7zip(file2);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : map.keySet()) {
            if (new File(this.m7zipOutPutDir.getAbsolutePath(), str).exists() && map.get(str).intValue() == 0) {
                arrayList.add(str);
            }
        }
        addStoredFileIn7Zip(arrayList, file2);
        if (file2.exists()) {
            return true;
        }
        throw new IOException(String.format("[use7zApk]7z repackage signed apk fail,you must install 7z command line version first, linux: zip, window: 7za, path=%s", this.mSignedWith7ZipApk.getAbsolutePath()));
    }

    public void buildApkWithV1sign(HashMap<String, Integer> map) throws Throwable {
        insureFileNameV1();
        generalUnsignApk(map);
        signApkV1(this.mUnSignedApk, this.mSignedApk);
        use7zApk(map, this.mSignedApk, this.mSignedWith7ZipApk);
        alignApks();
        copyFinalApkV1();
    }

    public void buildApkWithV2sign(HashMap<String, Integer> map, int i) throws Exception {
        insureFileNameV2();
        generalUnsignApk(map);
        if (use7zApk(map, this.mUnSignedApk, this.m7ZipApk)) {
            alignApk(this.m7ZipApk, this.mAlignedApk);
        } else {
            alignApk(this.mUnSignedApk, this.mAlignedApk);
        }
        signApkV2(this.mAlignedApk, this.mSignedApk, i);
        copyFinalApkV2();
    }

    public void setOutDir(File file, String str, File file2) throws AndrolibException {
        this.mOutDir = file;
        this.mApkName = str;
        this.finalApkFile = file2;
    }
}
