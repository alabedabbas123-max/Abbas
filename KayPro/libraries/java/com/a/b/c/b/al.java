package com.a.b.c.b;

import com.a.b.e.b.ad;
import com.a.b.e.b.ClassX;
import com.a.b.g.ClassK;
import com.a.b.g.ClassN;
import com.a.b.g.Interfacea;

public final class al extends Abstractan {

    private final ClassH f2052a;

    private final ClassN f2053b;

    private final ClassH[] f2054c;

    private final boolean f2055d;

    public al(ad c1170ad, ClassH c1040h, ClassN c1316n, ClassH[] c1040hArr) {
        super(c1170ad, ClassX.f3113a);
        if (c1040h == null) {
            throw new NullPointerException("user == null");
        }
        if (c1316n == null) {
            throw new NullPointerException("cases == null");
        }
        if (c1040hArr == null) {
            throw new NullPointerException("targets == null");
        }
        int iM5496b = c1316n.m5496b();
        if (iM5496b != c1040hArr.length) {
            throw new IllegalArgumentException("cases / targets mismatch");
        }
        if (iM5496b > 65535) {
            throw new IllegalArgumentException("too many cases");
        }
        this.f2052a = c1040h;
        this.f2053b = c1316n;
        this.f2054c = c1040hArr;
        this.f2055d = m4322c(c1316n);
    }

    private static long m4320a(ClassN c1316n) {
        long jM5497b = (((((long) c1316n.m5497b(c1316n.m5496b() - 1)) - ((long) c1316n.m5497b(0))) + 1) * 2) + 4;
        if (jM5497b <= 2147483647L) {
            return jM5497b;
        }
        return -1L;
    }

    private static long m4321b(ClassN c1316n) {
        return (((long) c1316n.m5496b()) * 4) + 2;
    }

    private static boolean m4322c(ClassN c1316n) {
        if (c1316n.m5496b() < 2) {
            return true;
        }
        long jM4320a = m4320a(c1316n);
        return jM4320a >= 0 && jM4320a <= (m4321b(c1316n) * 5) / 4;
    }

    @Override
    public int mo4229a() {
        return this.f2055d ? (int) m4320a(this.f2053b) : (int) m4321b(this.f2053b);
    }

    @Override
    public Abstractl mo4230a(ClassX c1197x) {
        return new al(m4380k(), this.f2052a, this.f2053b, this.f2054c);
    }

    @Override
    protected String mo4231a(boolean z) {
        int i = this.f2052a.m4378i();
        StringBuilder sb = new StringBuilder(100);
        int length = this.f2054c.length;
        sb.append(this.f2055d ? "packed" : "sparse");
        sb.append("-switch-payload // for switch @ ");
        sb.append(ClassK.m5485c(i));
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f2054c[i2].m4378i();
            sb.append("\n  ");
            sb.append(this.f2053b.m5497b(i2));
            sb.append(": ");
            sb.append(ClassK.m5480a(i3));
            sb.append(" // ");
            sb.append(ClassK.m5489g(i3 - i));
        }
        return sb.toString();
    }

    @Override
    public void mo4232a(Interfacea interfaceC1303a) {
        int i;
        int i2 = 0;
        int i3 = this.f2052a.m4378i();
        int iMo4234a = ClassO.f2106S.m4395c().mo4234a();
        int length = this.f2054c.length;
        if (!this.f2055d) {
            interfaceC1303a.mo5456c(512);
            interfaceC1303a.mo5456c(length);
            for (int i4 = 0; i4 < length; i4++) {
                interfaceC1303a.mo5457d(this.f2053b.m5497b(i4));
            }
            while (i2 < length) {
                interfaceC1303a.mo5457d(this.f2054c[i2].m4378i() - i3);
                i2++;
            }
            return;
        }
        int iM5497b = length == 0 ? 0 : this.f2053b.m5497b(0);
        int iM5497b2 = ((length == 0 ? 0 : this.f2053b.m5497b(length - 1)) - iM5497b) + 1;
        interfaceC1303a.mo5456c(256);
        interfaceC1303a.mo5456c(iM5497b2);
        interfaceC1303a.mo5457d(iM5497b);
        for (int i5 = 0; i5 < iM5497b2; i5++) {
            if (this.f2053b.m5497b(i2) > iM5497b + i5) {
                i = iMo4234a;
            } else {
                i = this.f2054c[i2].m4378i() - i3;
                i2++;
            }
            interfaceC1303a.mo5457d(i);
        }
    }

    @Override
    protected String mo4233b() {
        StringBuilder sb = new StringBuilder(100);
        int length = this.f2054c.length;
        for (int i = 0; i < length; i++) {
            sb.append("\n    ");
            sb.append(this.f2053b.m5497b(i));
            sb.append(": ");
            sb.append(this.f2054c[i]);
        }
        return sb.toString();
    }

    public boolean m4323c() {
        return this.f2055d;
    }
}
