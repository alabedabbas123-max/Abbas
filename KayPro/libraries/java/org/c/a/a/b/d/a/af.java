package org.c.a.a.b.d.a;

import java.util.List;

public class af {

    protected String f5632a;

    protected int f5633b;

    protected List f5634c;

    public af(String str, int i, List list) {
        this.f5632a = str;
        this.f5633b = i;
        this.f5634c = list;
    }

    public String m7887a() {
        return this.f5632a;
    }

    public List m7888b() {
        return this.f5634c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PackageInfo{internalName=").append(this.f5632a);
        sb.append(", flags=").append(this.f5633b);
        if (this.f5634c != null) {
            sb.append(", moduleInfoNames=").append(this.f5634c);
        }
        return sb.append("}").toString();
    }
}
