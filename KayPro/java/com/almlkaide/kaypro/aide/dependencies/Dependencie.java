package com.almlkaide.kaypro.aide.dependencies;

import com.baidu.mobstat.Config;

public class Dependencie {

    private boolean f6740androidx;
    private String dependencies;

    public Dependencie(String str, boolean z) {
        this.dependencies = str;
        this.f6740androidx = z;
    }

    public Dependencie(String str) {
        this.dependencies = str;
    }

    public void setAndroidx(boolean z) {
        this.f6740androidx = z;
    }

    public boolean isAndroidx() {
        return this.f6740androidx;
    }

    String getName() {
        return this.dependencies;
    }

    public void setDependencies(String str) {
        this.dependencies = str;
    }

    public String getDependencies() {
        return this.dependencies;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.dependencies);
        stringBuffer.append(Config.TRACE_TODAY_VISIT_SPLIT).append(this.f6740androidx ? "+" : "+");
        return stringBuffer.toString();
    }
}
