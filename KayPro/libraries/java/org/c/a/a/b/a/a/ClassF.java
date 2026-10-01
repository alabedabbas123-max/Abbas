package org.c.a.a.b.a.a;

import java.util.Map;

public class ClassF implements Interfacec {

    protected int f5511a;

    protected int f5512b;

    protected byte[] f5513c;

    protected ClassW[] f5514d;

    protected Map f5515e;

    public ClassF(int i, int i2, byte[] bArr, ClassW[] c1858wArr, Map map) {
        this.f5511a = i;
        this.f5512b = i2;
        this.f5513c = bArr;
        this.f5514d = c1858wArr;
        this.f5515e = map;
    }

    public Interfacec m7634a(String str) {
        if (this.f5515e == null) {
            return null;
        }
        return (Interfacec) this.f5515e.get(str);
    }

    public byte[] m7635a() {
        return this.f5513c;
    }

    public ClassW[] m7636b() {
        return this.f5514d;
    }
}
