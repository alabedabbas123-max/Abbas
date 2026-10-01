package com.a.b.e.b;

import com.a.b.g.ClassK;
import com.a.b.g.ClassN;

public final class ab {

    private final ClassD f2838a;

    private final int f2839b;

    private ClassN[] f2840c;

    private ClassN f2841d;

    public ab(ClassD c1177d, int i) {
        if (c1177d == null) {
            throw new NullPointerException("blocks == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("firstLabel < 0");
        }
        this.f2838a = c1177d;
        this.f2839b = i;
        this.f2840c = null;
        this.f2841d = null;
    }

    private void m4745c() {
        int iJ = this.f2838a.m5515j();
        ClassN[] c1316nArr = new ClassN[iJ];
        ClassN c1316n = new ClassN(10);
        int iD_ = this.f2838a.m5476d_();
        for (int i = 0; i < iD_; i++) {
            ClassB c1175bM4821a = this.f2838a.m4821a(i);
            int iMo3961a = c1175bM4821a.mo3961a();
            ClassN c1316nM4814c = c1175bM4821a.m4814c();
            int iM5496b = c1316nM4814c.m5496b();
            if (iM5496b == 0) {
                c1316n.m5499c(iMo3961a);
            } else {
                for (int i2 = 0; i2 < iM5496b; i2++) {
                    int iM5497b = c1316nM4814c.m5497b(i2);
                    ClassN c1316n2 = c1316nArr[iM5497b];
                    if (c1316n2 == null) {
                        c1316n2 = new ClassN(10);
                        c1316nArr[iM5497b] = c1316n2;
                    }
                    c1316n2.m5499c(iMo3961a);
                }
            }
        }
        for (int i3 = 0; i3 < iJ; i3++) {
            ClassN c1316n3 = c1316nArr[i3];
            if (c1316n3 != null) {
                c1316n3.m5508g();
                c1316n3.mo3944c_();
            }
        }
        c1316n.m5508g();
        c1316n.mo3944c_();
        if (c1316nArr[this.f2839b] == null) {
            c1316nArr[this.f2839b] = ClassN.f3497a;
        }
        this.f2840c = c1316nArr;
        this.f2841d = c1316n;
    }

    public ClassD m4746a() {
        return this.f2838a;
    }

    public ClassN m4747a(int i) {
        if (this.f2841d == null) {
            m4745c();
        }
        ClassN c1316n = this.f2840c[i];
        if (c1316n == null) {
            throw new RuntimeException("no such block: " + ClassK.m5485c(i));
        }
        return c1316n;
    }

    public int m4748b() {
        return this.f2839b;
    }
}
