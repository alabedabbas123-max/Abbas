package com.a.b.c.b;

import com.a.b.e.b.ad;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.f.Abstractag;
import com.a.b.g.ClassK;
import com.a.b.g.ClassX;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public abstract class Abstractl {

    private int f2078a;

    private final ClassN f2079b;

    private final ad f2080c;

    private final ClassX f2081d;

    public Abstractl(ClassN c1046n, ad c1170ad, ClassX c1197x) {
        if (c1046n == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c1170ad == null) {
            throw new NullPointerException("position == null");
        }
        if (c1197x == null) {
            throw new NullPointerException("registers == null");
        }
        this.f2078a = -1;
        this.f2079b = c1046n;
        this.f2080c = c1170ad;
        this.f2081d = c1197x;
    }

    public static aj m4369a(ad c1170ad, ClassU c1194u, ClassU c1194u2) {
        ClassN c1046n;
        boolean z = c1194u.m4898k() == 1;
        boolean zM5071o = c1194u.mo3825a().m5071o();
        int iM4894g = c1194u.m4894g();
        if ((c1194u2.m4894g() | iM4894g) < 16) {
            if (zM5071o) {
                c1046n = ClassO.f2296i;
            } else {
                c1046n = z ? ClassO.f2220c : ClassO.f2293f;
            }
        } else if (iM4894g < 256) {
            if (zM5071o) {
                c1046n = ClassO.f2297j;
            } else {
                c1046n = z ? ClassO.f2273d : ClassO.f2294g;
            }
        } else if (zM5071o) {
            c1046n = ClassO.f2298k;
        } else {
            c1046n = z ? ClassO.f2292e : ClassO.f2295h;
        }
        return new aj(c1046n, c1170ad, ClassX.m4910a(c1194u, c1194u2));
    }

    public abstract int mo4229a();

    public final int m4370a(BitSet bitSet) {
        boolean zM4382m = m4382m();
        int iD_ = this.f2081d.m5476d_();
        int iM4898k = (!zM4382m || bitSet.get(0)) ? 0 : this.f2081d.m4916b(0).m4898k();
        int iM4898k2 = 0;
        for (int i = zM4382m ? 1 : 0; i < iD_; i++) {
            if (!bitSet.get(i)) {
                iM4898k2 += this.f2081d.m4916b(i).m4898k();
            }
        }
        return Math.max(iM4898k2, iM4898k);
    }

    public abstract Abstractl mo4312a(ClassN c1046n);

    public abstract Abstractl mo4230a(ClassX c1197x);

    public Abstractl mo4371a(Abstractag abstractC1261ag) {
        return mo4230a(abstractC1261ag.m5184a(m4381l()));
    }

    public final String m4372a(String str, int i, boolean z) {
        String strMo4231a = mo4231a(z);
        if (strMo4231a == null) {
            return null;
        }
        String str2 = String.valueOf(str) + m4384o() + ": ";
        int length = str2.length();
        return ClassX.m5520a(str2, length, "", strMo4231a, i == 0 ? strMo4231a.length() : i - length);
    }

    protected abstract String mo4231a(boolean z);

    public abstract void mo4232a(Interfacea interfaceC1303a);

    public Abstractl m4373b(BitSet bitSet) {
        ClassX c1197x = this.f2081d;
        boolean z = bitSet.get(0);
        if (m4382m()) {
            bitSet.set(0);
        }
        ClassX c1197xM4914a = c1197x.m4914a(bitSet);
        if (m4382m()) {
            bitSet.set(0, z);
        }
        if (c1197xM4914a.m5476d_() == 0) {
            return null;
        }
        return new ClassQ(this.f2080c, c1197xM4914a);
    }

    protected abstract String mo4233b();

    public Abstractl m4374c(BitSet bitSet) {
        if (!m4382m() || bitSet.get(0)) {
            return null;
        }
        ClassU c1194uM4916b = this.f2081d.m4916b(0);
        return m4369a(this.f2080c, c1194uM4916b, c1194uM4916b.m4890b(0));
    }

    public final void m4375c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        this.f2078a = i;
    }

    public abstract Abstractl mo4329d(int i);

    public Abstractl m4376d(BitSet bitSet) {
        return mo4230a(this.f2081d.m4913a(0, m4382m(), bitSet));
    }

    public String mo4356f() {
        throw new UnsupportedOperationException("Not supported.");
    }

    public String mo4357g() {
        throw new UnsupportedOperationException("Not supported.");
    }

    public final boolean m4377h() {
        return this.f2078a >= 0;
    }

    public final int m4378i() {
        if (this.f2078a < 0) {
            throw new RuntimeException("address not yet known");
        }
        return this.f2078a;
    }

    public final ClassN m4379j() {
        return this.f2079b;
    }

    public final ad m4380k() {
        return this.f2080c;
    }

    public final ClassX m4381l() {
        return this.f2081d;
    }

    public final boolean m4382m() {
        return this.f2079b.m4396d();
    }

    public Abstractl m4383n() {
        return mo4230a(this.f2081d.m4913a(0, m4382m(), (BitSet) null));
    }

    public final String m4384o() {
        return this.f2078a != -1 ? String.format("%04x", Integer.valueOf(this.f2078a)) : ClassK.m5480a(System.identityHashCode(this));
    }

    public final int m4385p() {
        return m4378i() + mo4229a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(m4384o());
        sb.append(' ');
        sb.append(this.f2080c);
        sb.append(": ");
        sb.append(this.f2079b.m4397e());
        boolean z = false;
        if (this.f2081d.m5476d_() != 0) {
            sb.append(this.f2081d.m5475b(" ", ", ", null));
            z = true;
        }
        String strMo4233b = mo4233b();
        if (strMo4233b != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strMo4233b);
        }
        return sb.toString();
    }
}
