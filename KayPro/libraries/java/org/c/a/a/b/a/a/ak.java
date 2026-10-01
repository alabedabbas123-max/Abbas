package org.c.a.a.b.a.a;

public class ak {

    protected String f5500a;

    protected int f5501b;

    protected String f5502c;

    public ak(String str, int i, String str2) {
        this.f5500a = str;
        this.f5501b = i;
        this.f5502c = str2;
    }

    public String m7623a() {
        return this.f5500a;
    }

    public int m7624b() {
        return this.f5501b;
    }

    public String m7625c() {
        return this.f5502c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ModuleInfo{name=").append(this.f5500a);
        sb.append(", flags=").append(this.f5501b);
        if (this.f5502c != null) {
            sb.append(", version=").append(this.f5502c);
        }
        return sb.append("}").toString();
    }
}
