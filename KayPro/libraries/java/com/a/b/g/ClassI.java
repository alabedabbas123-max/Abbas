package com.a.b.g;

class ClassI {

    private final int f3487a;

    private int f3488b;

    private final String f3489c;

    public ClassI(int i, int i2, String str) {
        this.f3487a = i;
        this.f3488b = i2;
        this.f3489c = str;
    }

    public ClassI(int i, String str) {
        this(i, Integer.MAX_VALUE, str);
    }

    public int m5466a() {
        return this.f3487a;
    }

    public void m5467a(int i) {
        if (this.f3488b == Integer.MAX_VALUE) {
            this.f3488b = i;
        }
    }

    public int m5468b() {
        return this.f3488b;
    }

    public void m5469b(int i) {
        this.f3488b = i;
    }

    public String m5470c() {
        return this.f3489c;
    }
}
