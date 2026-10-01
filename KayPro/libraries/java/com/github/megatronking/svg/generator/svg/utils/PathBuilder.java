package com.github.megatronking.svg.generator.svg.utils;

import com.baidu.android.common.util.DeviceId;
import com.baidu.mobstat.Config;

public class PathBuilder {
    private StringBuilder mPathData = new StringBuilder();

    private String booleanToString(boolean z) {
        return z ? "1" : DeviceId.CUIDInfo.I_EMPTY;
    }

    public PathBuilder absoluteArcTo(float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4) {
        this.mPathData.append("A").append(f).append(",").append(f2).append(",").append(booleanToString(z)).append(",").append(booleanToString(z2)).append(",").append(booleanToString(z3)).append(",").append(f3).append(",").append(f4);
        return this;
    }

    public PathBuilder absoluteClose() {
        this.mPathData.append("Z");
        return this;
    }

    public PathBuilder absoluteHorizontalTo(float f) {
        this.mPathData.append("H").append(f);
        return this;
    }

    public PathBuilder absoluteLineTo(float f, float f2) {
        this.mPathData.append("L").append(f).append(",").append(f2);
        return this;
    }

    public PathBuilder absoluteMoveTo(float f, float f2) {
        this.mPathData.append("M").append(f).append(",").append(f2);
        return this;
    }

    public PathBuilder absoluteVerticalTo(float f) {
        this.mPathData.append("V").append(f);
        return this;
    }

    public PathBuilder relativeArcTo(float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4) {
        this.mPathData.append(Config.APP_VERSION_CODE).append(f).append(",").append(f2).append(",").append(booleanToString(z)).append(",").append(booleanToString(z2)).append(",").append(booleanToString(z3)).append(",").append(f3).append(",").append(f4);
        return this;
    }

    public PathBuilder relativeClose() {
        this.mPathData.append("z");
        return this;
    }

    public PathBuilder relativeHorizontalTo(float f) {
        this.mPathData.append("h").append(f);
        return this;
    }

    public PathBuilder relativeLineTo(float f, float f2) {
        this.mPathData.append("l").append(f).append(",").append(f2);
        return this;
    }

    public PathBuilder relativeMoveTo(float f, float f2) {
        this.mPathData.append(Config.MODEL).append(f).append(",").append(f2);
        return this;
    }

    public PathBuilder relativeVerticalTo(float f) {
        this.mPathData.append("v").append(f);
        return this;
    }

    public String toString() {
        return this.mPathData.toString();
    }
}
