package com.baidu.mobstat;

public class cn extends Exception {

    private int f4453a;

    public cn(int i) {
        this.f4453a = i;
    }

    public cn(int i, String str) {
        super(str);
        this.f4453a = i;
    }

    public cn(int i, Throwable th) {
        super(th);
        this.f4453a = i;
    }

    public int m6692a() {
        return this.f4453a;
    }
}
