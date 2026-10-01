package com.a.b.f;

import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassZ;
import com.a.b.g.ClassT;
import java.util.ArrayList;
import java.util.HashMap;

public class ClassV extends ClassT {

    private final int f3458a;

    private final ClassZ f3459b;

    private final ClassZ[] f3460c;

    private final HashMap f3461d;

    public ClassV(ap c1270ap) {
        if (c1270ap == null) {
            throw new NullPointerException("method == null");
        }
        ArrayList arrayListM5297j = c1270ap.m5297j();
        this.f3458a = c1270ap.m5294g();
        this.f3459b = new ClassZ(this.f3458a);
        this.f3460c = new ClassZ[arrayListM5297j.size()];
        this.f3461d = new HashMap();
        this.f3459b.mo3944c_();
    }

    private ClassZ m5387c(int i) {
        try {
            return this.f3460c[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    public ClassZ m5388a(int i) {
        ClassZ c1199zM5387c = m5387c(i);
        return c1199zM5387c != null ? c1199zM5387c : this.f3459b;
    }

    public void m5389a(int i, ClassZ c1199z) {
        m5518l();
        if (c1199z == null) {
            throw new NullPointerException("specs == null");
        }
        try {
            this.f3460c[i] = c1199z;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    public void m5390a(Abstractan abstractC1268an, ClassU c1194u) {
        m5518l();
        if (abstractC1268an == null) {
            throw new NullPointerException("insn == null");
        }
        if (c1194u == null) {
            throw new NullPointerException("spec == null");
        }
        this.f3461d.put(abstractC1268an, c1194u);
    }

    public ClassZ m5391b(int i) {
        ClassZ c1199zM5387c = m5387c(i);
        return c1199zM5387c != null ? c1199zM5387c.m4939e() : new ClassZ(this.f3458a);
    }

    public boolean m5392b(int i, ClassZ c1199z) {
        ClassZ c1199zM5387c = m5387c(i);
        if (c1199zM5387c == null) {
            m5389a(i, c1199z);
            return true;
        }
        ClassZ c1199zM4939e = c1199zM5387c.m4939e();
        c1199zM4939e.m4932a(c1199z, true);
        if (c1199zM5387c.equals(c1199zM4939e)) {
            return false;
        }
        c1199zM4939e.mo3944c_();
        m5389a(i, c1199zM4939e);
        return true;
    }
}
