package org.c.a.a.b.b;

public abstract class Abstractd implements Interfacee {

    protected final int f5572a;

    protected int f5573b;

    protected int f5574c;

    protected int f5575d;

    protected final int f5576e;

    protected final String f5577f;

    public Abstractd(int i, int i2, int i3, int i4, String str) {
        this.f5572a = i;
        this.f5573b = i3;
        this.f5575d = i2;
        this.f5574c = i2;
        this.f5576e = i4;
        this.f5577f = str;
    }

    public void m7691a() {
        this.f5575d = this.f5574c;
    }

    @Override
    public void mo7688a(Interfacef interfaceC1883f) {
        interfaceC1883f.mo7703a(this);
    }

    public boolean mo7692a(boolean z) {
        if (this.f5575d >= this.f5573b) {
            return false;
        }
        this.f5575d++;
        return true;
    }

    public int m7693b() {
        return this.f5572a;
    }

    public boolean mo7694b(boolean z) {
        if (this.f5575d <= this.f5572a) {
            return false;
        }
        this.f5575d--;
        return true;
    }

    public int m7695c() {
        return this.f5573b;
    }

    public int m7696d() {
        return this.f5574c;
    }

    public int mo7697e() {
        return this.f5575d;
    }

    public int m7698f() {
        return this.f5576e;
    }

    public String m7699g() {
        return this.f5577f;
    }

    public String toString() {
        return "{minimal-line-count=" + m7693b() + ", maximal-line-count=" + m7695c() + ", initial-line-count=" + m7696d() + ", line-count=" + mo7697e() + ", weight=" + m7698f() + (m7699g() != null ? ", label='" + this.f5577f + "'}" : "}");
    }
}
