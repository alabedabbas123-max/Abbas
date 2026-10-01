package com.tencent.mm.resourceproguard;

import com.tencent.mm.androlib.ApkDecoder;
import com.tencent.mm.androlib.ResourceApkBuilder;
import com.tencent.mm.androlib.res.decoder.ARSCDecoder;
import com.tencent.mm.androlib.res.util.StringUtil;
import com.tencent.mm.util.FileOperation;
import java.io.File;
import java.io.IOException;

public class Main {
    public static final int ERRNO_ERRORS = 1;
    public static final int ERRNO_USAGE = 2;
    protected static long mBeginTime;
    protected static long mRawApkSize;
    protected static String mRunningLocation;
    protected Configuration config;
    public String m7zipPath;
    public String mFinalApkBackPath;
    protected File mOutDir;
    public boolean mSetMappingThroughCmd;
    public boolean mSetSignThroughCmd;
    public String mZipalignPath;

    private void buildApk(ApkDecoder apkDecoder, File file, File file2, InputParam.SignatureType signatureType, int i) throws Exception {
        ResourceApkBuilder resourceApkBuilder = new ResourceApkBuilder(this.config);
        String name = file.getName();
        resourceApkBuilder.setOutDir(this.mOutDir, name.substring(0, name.indexOf(".apk")), file2);
        System.out.printf("[AndResGuard] buildApk signatureType: %s\n", signatureType);
        if (signatureType == InputParam.SignatureType.SchemaV1) {
            resourceApkBuilder.buildApkWithV1sign(apkDecoder.getCompressData());
        } else if (signatureType == InputParam.SignatureType.SchemaV2) {
            resourceApkBuilder.buildApkWithV2sign(apkDecoder.getCompressData(), i);
        }
    }

    private void decodeResource(File file, ApkDecoder apkDecoder, File file2) throws Throwable {
        if (file == null) {
            this.mOutDir = new File(mRunningLocation, file2.getName().substring(0, file2.getName().indexOf(".apk")));
        } else {
            this.mOutDir = file;
        }
        apkDecoder.setOutDir(this.mOutDir.getAbsoluteFile());
        apkDecoder.decode();
    }

    public static void gradleRun(InputParam inputParam) {
        new Main().m7238run(inputParam);
    }

    private void loadConfigFromGradle(InputParam inputParam) {
        try {
            this.config = new Configuration(inputParam);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void m7238run(InputParam inputParam) {
        try {
            synchronized (Class.forName("com.tencent.mm.resourceproguard.Main")) {
                loadConfigFromGradle(inputParam);
                this.mFinalApkBackPath = inputParam.finalApkBackupPath;
                Thread threadCurrentThread = Thread.currentThread();
                System.out.printf("\n-->AndResGuard starting! Current thread# id: %d, name: %s\n", new Long(threadCurrentThread.getId()), threadCurrentThread.getName());
                resourceProguard(new File(inputParam.outFolder), StringUtil.isPresent(inputParam.finalApkBackupPath) ? new File(inputParam.finalApkBackupPath) : (File) null, inputParam.apkPath, inputParam.signatureType, inputParam.minSDKVersion);
                System.out.printf("<--AndResGuard Done! You can find the output in %s\n", this.mOutDir.getAbsolutePath());
                clean();
            }
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    protected void clean() {
        this.config = (Configuration) null;
        ARSCDecoder.mTableStringsResguard.clear();
        ARSCDecoder.mMergeDuplicatedResCount = 0;
    }

    protected void resourceProguard(File file, File file2, String str, InputParam.SignatureType signatureType) throws Throwable {
        resourceProguard(file, file2, str, signatureType, 14);
    }

    protected void resourceProguard(File file, File file2, String str, InputParam.SignatureType signatureType, int i) throws Throwable {
        File file3 = new File(str);
        if (!file3.exists()) {
            throw new RuntimeException(new StringBuffer().append("The input apk %s does not exist").append(file3.getAbsolutePath()).toString());
        }
        mRawApkSize = FileOperation.getFileSizes(file3);
        try {
            ApkDecoder apkDecoder = new ApkDecoder(this.config, file3);
            decodeResource(file, apkDecoder, file3);
            buildApk(apkDecoder, file3, file2, signatureType, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
