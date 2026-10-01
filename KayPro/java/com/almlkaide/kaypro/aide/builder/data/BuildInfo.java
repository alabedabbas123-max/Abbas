package com.almlkaide.kaypro.aide.builder.data;

import android.os.Parcel;
import android.os.Parcelable;

public class BuildInfo implements Parcelable {
    public static final int BUILD_TYPE_DEBUG = 0;
    public static final int BUILD_TYPE_RELEASE = 1;
    public static final Parcelable.Creator<BuildInfo> CREATOR = new BuildInfoCreator();
    private int buildType;
    private String project;

    public BuildInfo() {
    }

    protected BuildInfo(Parcel parcel) {
        this.project = parcel.readString();
        this.buildType = parcel.readInt();
    }

    public BuildInfo setProject(String str) {
        this.project = str;
        return this;
    }

    public String getProject() {
        return this.project;
    }

    public BuildInfo setBuildType(int i) {
        this.buildType = i;
        return this;
    }

    public int getBuildType() {
        return this.buildType;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.project);
        parcel.writeInt(this.buildType);
    }

    public static final class BuildInfoCreator implements Parcelable.Creator<BuildInfo> {
        @Override
        public BuildInfo createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override
        public BuildInfo[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        @SuppressWarnings("unchecked")
        public BuildInfo createFromParcel(Parcel parcel) {
            return new BuildInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public BuildInfo[] newArray(int i) {
            return new BuildInfo[i];
        }
    }
}
