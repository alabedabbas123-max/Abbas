package a.e;

import java.io.IOException;
import java.io.OutputStream;
import a.j.ClassX;

class ao {

    final am f621a;

    private boolean f622b;

    private int f623c;

    private int f624d;

    private long f625e;

    private long f626f;

    private long f627g;

    private String f628h;

    private byte[] f629i;

    private String f630j;

    private ao(am c0257am, String str, boolean z, int i, byte[] bArr, String str2) {
        this.f621a = c0257am;
        this.f628h = str;
        this.f622b = z;
        this.f623c = i;
        this.f629i = bArr;
        this.f630j = str2;
    }

    public void m1745c() throws IOException {
        this.f621a.m1733b(67324752);
        this.f621a.m1728a(10);
        this.f621a.m1728a(0);
        this.f621a.m1728a(this.f622b ? 8 : 0);
        this.f621a.m1733b(this.f623c);
        this.f621a.m1733b(this.f624d);
        this.f621a.m1729a(this.f625e);
        this.f621a.m1729a(this.f626f);
        byte[] bArrM3178a = ClassX.m3178a(this.f628h);
        int length = bArrM3178a.length;
        int length2 = this.f629i != null ? this.f629i.length : 0;
        this.f621a.m1728a(length);
        this.f621a.m1728a(length2);
        this.f621a.f615a.write(bArrM3178a);
        if (this.f629i != null) {
            this.f621a.f615a.write(this.f629i);
        }
    }

    public OutputStream m1746a() {
        C0258an c0258an = null;
        return this.f622b ? new ap(this) : new aq(this);
    }

    public void m1747b() throws IOException {
        this.f621a.m1733b(33639248);
        this.f621a.m1728a(10);
        this.f621a.m1728a(10);
        this.f621a.m1728a(0);
        this.f621a.m1728a(this.f622b ? 8 : 0);
        this.f621a.m1733b(this.f623c);
        this.f621a.m1733b(this.f624d);
        this.f621a.m1729a(this.f625e);
        this.f621a.m1729a(this.f626f);
        byte[] bArrM3178a = ClassX.m3178a(this.f628h);
        byte[] bArrM3178a2 = this.f630j == null ? null : ClassX.m3178a(this.f630j);
        this.f621a.m1728a(bArrM3178a.length);
        this.f621a.m1728a(this.f629i == null ? 0 : this.f629i.length);
        this.f621a.m1728a(bArrM3178a2 == null ? 0 : bArrM3178a2.length);
        this.f621a.m1728a(0);
        this.f621a.m1728a(0);
        this.f621a.m1733b(0);
        this.f621a.m1729a(this.f627g);
        this.f621a.f615a.write(bArrM3178a);
        if (this.f629i != null) {
            this.f621a.f615a.write(this.f629i);
        }
        if (bArrM3178a2 != null) {
            this.f621a.f615a.write(bArrM3178a2);
        }
    }
}
