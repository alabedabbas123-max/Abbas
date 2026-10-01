package org.c.a.a.b.a.a;

public class al {

    protected String f5503a;

    protected int f5504b;

    protected String[] f5505c;

    public al(String str, int i, String[] strArr) {
        this.f5503a = str;
        this.f5504b = i;
        this.f5505c = strArr;
    }

    public String m7626a() {
        return this.f5503a;
    }

    public int m7627b() {
        return this.f5504b;
    }

    public String[] m7628c() {
        return this.f5505c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PackageInfo{internalName=").append(this.f5503a);
        sb.append(", flags=").append(this.f5504b);
        if (this.f5505c != null) {
            sb.append(", moduleInfoNames=").append(this.f5505c);
        }
        return sb.append("}").toString();
    }
}
