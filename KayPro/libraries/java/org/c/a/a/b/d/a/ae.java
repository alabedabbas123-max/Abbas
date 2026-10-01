package org.c.a.a.b.d.a;

public class ae {

    protected String f5629a;

    protected int f5630b;

    protected String f5631c;

    public ae(String str, int i, String str2) {
        this.f5629a = str;
        this.f5630b = i;
        this.f5631c = str2;
    }

    public String m7885a() {
        return this.f5629a;
    }

    public int m7886b() {
        return this.f5630b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ModuleInfo{name=").append(this.f5629a);
        sb.append(", flags=").append(this.f5630b);
        if (this.f5631c != null) {
            sb.append(", version=").append(this.f5631c);
        }
        return sb.append("}").toString();
    }
}
