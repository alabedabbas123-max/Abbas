package com.a.b.f.a;

class ClassG {

    private final int[] f3300a;

    private final int[] f3301b;

    private int f3302c = 0;

    public ClassG(int i) {
        this.f3300a = new int[i];
        this.f3301b = new int[i];
    }

    public int m5123a() {
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < this.f3302c; i4++) {
            if (i < this.f3301b[i4]) {
                i2 = this.f3300a[i4];
                i = this.f3301b[i4];
                i3 = i4;
            }
        }
        this.f3301b[i3] = 0;
        return i2;
    }

    public void m5124a(int i) {
        for (int i2 = 0; i2 < this.f3302c; i2++) {
            if (this.f3300a[i2] == i) {
                int[] iArr = this.f3301b;
                iArr[i2] = iArr[i2] + 1;
                return;
            }
        }
        this.f3300a[this.f3302c] = i;
        this.f3301b[this.f3302c] = 1;
        this.f3302c++;
    }

    public int m5125b() {
        return this.f3302c;
    }
}
