package org.c.a.a.c.d.c;

public abstract class Abstractb extends Abstracta {

    protected int[] f6383d = new int[10];

    protected int f6384e;

    protected boolean f6385f;

    public int m8824a(int i) {
        return this.f6383d[i];
    }

    @Override
    public void mo8820a() {
        this.f6384e = 0;
        this.f6381b = 1;
        this.f6382c = 0;
        this.f6385f = true;
    }

    public int m8825e() {
        return this.f6384e;
    }

    public boolean m8826f() {
        return this.f6385f;
    }

    protected void m8827g() {
        if (this.f6384e == this.f6383d.length) {
            int[] iArr = new int[this.f6384e * 2];
            System.arraycopy(this.f6383d, 0, iArr, 0, this.f6384e);
            this.f6383d = iArr;
        }
        int[] iArr2 = this.f6383d;
        int i = this.f6384e;
        this.f6384e = i + 1;
        iArr2[i] = this.f6382c;
    }
}
