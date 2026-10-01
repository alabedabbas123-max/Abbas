package com.tencent.mm.resourceproguard;

import com.tencent.mm.androlib.res.util.StringUtil;
import java.io.File;
import java.util.ArrayList;

public class InputParam {
    public final String apkPath;
    public final ArrayList<String> compressFilePattern;
    public final String digestAlg;
    public final String finalApkBackupPath;
    public final String fixedResName;
    public final boolean keepRoot;
    public final String keypass;
    public final File mappingFile;
    public final boolean mergeDuplicatedRes;
    public final String metaName;
    public final int minSDKVersion;
    public final String outFolder;
    public final String sevenZipPath;
    public final File signFile;
    public final SignatureType signatureType;
    public final String storealias;
    public final String storepass;
    public final boolean use7zip;
    public final boolean useSign;
    public final ArrayList<String> whiteList;
    public final String zipAlignPath;

    public static class Builder {
        private String apkPath;
        private ArrayList<String> compressFilePattern;
        private String digestAlg;
        private String finalApkBackupPath;
        private String fixedResName;
        private String keypass;
        private File mappingFile;
        private boolean mergeDuplicatedRes;
        private String metaName;
        private int minSDKVersion;
        private String outFolder;
        private String sevenZipPath;
        private File signFile;
        private String storealias;
        private String storepass;
        private boolean useSign;
        private ArrayList<String> whiteList;
        private String zipAlignPath;
        private boolean use7zip = false;
        private boolean keepRoot = false;
        private SignatureType signatureType = SignatureType.SchemaV1;

        public InputParam create() {
            return new InputParam(this.mappingFile, this.use7zip, this.useSign, this.keepRoot, this.mergeDuplicatedRes, this.whiteList, this.compressFilePattern, this.apkPath, this.outFolder, this.signFile, this.keypass, this.storealias, this.storepass, this.metaName, this.fixedResName, this.zipAlignPath, this.sevenZipPath, this.signatureType, this.finalApkBackupPath, this.digestAlg, this.minSDKVersion);
        }

        public Builder setApkPath(String str) {
            this.apkPath = str;
            return this;
        }

        public Builder setCompressFilePattern(ArrayList<String> arrayList) {
            if (arrayList.contains(Configuration.ASRC_FILE)) {
                System.out.printf("[Warning] compress %s will prevent optimization at runtime", Configuration.ASRC_FILE);
            }
            this.compressFilePattern = arrayList;
            return this;
        }

        public Builder setDigestAlg(String str) {
            if (StringUtil.isPresent(str)) {
                this.digestAlg = str;
            } else {
                this.digestAlg = Configuration.DEFAULT_DIGEST_ALG;
            }
            return this;
        }

        public Builder setFinalApkBackupPath(String str) {
            this.finalApkBackupPath = str;
            return this;
        }

        public Builder setFixedResName(String str) {
            this.fixedResName = str;
            return this;
        }

        public Builder setKeepRoot(boolean z) {
            this.keepRoot = z;
            return this;
        }

        public Builder setKeypass(String str) {
            this.keypass = str;
            return this;
        }

        public Builder setMappingFile(File file) {
            this.mappingFile = file;
            return this;
        }

        public Builder setMergeDuplicatedRes(boolean z) {
            this.mergeDuplicatedRes = z;
            return this;
        }

        public Builder setMetaName(String str) {
            this.metaName = str;
            return this;
        }

        public Builder setMinSDKVersion(int i) {
            this.minSDKVersion = i;
            return this;
        }

        public Builder setOutBuilder(String str) {
            this.outFolder = str;
            return this;
        }

        public Builder setSevenZipPath(String str) {
            this.sevenZipPath = str;
            return this;
        }

        public Builder setSignFile(File file) {
            this.signFile = file;
            return this;
        }

        public Builder setSignatureType(SignatureType signatureType) {
            this.signatureType = signatureType;
            return this;
        }

        public Builder setStorealias(String str) {
            this.storealias = str;
            return this;
        }

        public Builder setStorepass(String str) {
            this.storepass = str;
            return this;
        }

        public Builder setUse7zip(boolean z) {
            this.use7zip = z;
            return this;
        }

        public Builder setUseSign(boolean z) {
            this.useSign = z;
            return this;
        }

        public Builder setWhiteList(ArrayList<String> arrayList) {
            this.whiteList = arrayList;
            return this;
        }

        public Builder setZipAlign(String str) {
            this.zipAlignPath = str;
            return this;
        }
    }

    public enum SignatureType {
        SchemaV1,
        SchemaV2;

        public static SignatureType valueOf(String str) {
            for (SignatureType signatureType : values()) {
                if (signatureType.name().equals(str)) {
                    return signatureType;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    InputParam(File file, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str, String str2, File file2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SignatureType signatureType, String str10, String str11, int i) {
        this.mappingFile = file;
        this.use7zip = z;
        this.useSign = z2;
        this.keepRoot = z3;
        this.mergeDuplicatedRes = z4;
        this.whiteList = arrayList;
        this.compressFilePattern = arrayList2;
        this.apkPath = str;
        this.outFolder = str2;
        this.signFile = file2;
        this.keypass = str3;
        this.storealias = str4;
        this.storepass = str5;
        this.metaName = str6;
        this.fixedResName = str7;
        this.zipAlignPath = str8;
        this.sevenZipPath = str9;
        this.signatureType = signatureType;
        this.finalApkBackupPath = str10;
        this.digestAlg = str11;
        this.minSDKVersion = i;
    }
}
