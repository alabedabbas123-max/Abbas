package com.almlkaide.kaypro.data;

import com.baidu.mobstat.Config;
import com.google.gson.annotations.SerializedName;

public class OutputApk {

    @SerializedName("apkData")
    private ApkData apkData;

    @SerializedName("outputType")
    private OutputType outputType;

    @SerializedName(Config.FEED_LIST_ITEM_PATH)
    private String path;

    @SerializedName("properties")
    private Properties properties;

    public static class Properties {
    }

    public OutputApk setOutputType(OutputType outputType) {
        this.outputType = outputType;
        return this;
    }

    public OutputType getOutputType() {
        return this.outputType;
    }

    public OutputApk setApkData(ApkData apkData) {
        this.apkData = apkData;
        return this;
    }

    public ApkData getApkData() {
        return this.apkData;
    }

    public OutputApk setPath(String str) {
        this.path = str;
        return this;
    }

    public String getPath() {
        return this.path;
    }

    public OutputApk setProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public Properties getProperties() {
        return this.properties;
    }

    public static class OutputType {

        @SerializedName("type")
        private String type;

        public OutputType setType(String str) {
            this.type = str;
            return this;
        }

        public String getType() {
            return this.type;
        }
    }

    public static class ApkData {

        @SerializedName("baseName")
        private String baseName;

        @SerializedName("dirName")
        private String dirName;

        @SerializedName("enabled")
        private boolean enabled;

        @SerializedName("fullName")
        private String fullName;

        @SerializedName("outputFile")
        private String outputFile;

        @SerializedName("type")
        private String type;

        @SerializedName("versionCode")
        private int versionCode;

        @SerializedName("versionName")
        private String versionName;

        public ApkData setType(String str) {
            this.type = str;
            return this;
        }

        public String getType() {
            return this.type;
        }

        public ApkData setVersionCode(int i) {
            this.versionCode = i;
            return this;
        }

        public int getVersionCode() {
            return this.versionCode;
        }

        public ApkData setVersionName(String str) {
            this.versionName = str;
            return this;
        }

        public String getVersionName() {
            return this.versionName;
        }

        public ApkData setEnabled(boolean z) {
            this.enabled = z;
            return this;
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public ApkData setOutputFile(String str) {
            this.outputFile = str;
            return this;
        }

        public String getOutputFile() {
            return this.outputFile;
        }

        public ApkData setFullName(String str) {
            this.fullName = str;
            return this;
        }

        public String getFullName() {
            return this.fullName;
        }

        public ApkData setBaseName(String str) {
            this.baseName = str;
            return this;
        }

        public String getBaseName() {
            return this.baseName;
        }

        public ApkData setDirName(String str) {
            this.dirName = str;
            return this;
        }

        public String getDirName() {
            return this.dirName;
        }
    }
}
