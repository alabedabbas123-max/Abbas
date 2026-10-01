package com.baidu.mobstat;

public class bb extends Abstractaz {

    private static bb f4295c = new bb();

    private boolean f4296b;

    private bb() {
    }

    public static bb m6313c() {
        return f4295c;
    }

    public void m6314a(boolean z) {
        this.f4296b = z;
    }

    @Override
    public String mo6299a() {
        return "BaiduMobStat";
    }

    @Override
    public boolean mo6306b() {
        return this.f4296b;
    }
}
