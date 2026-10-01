package com.a.b.e.b;

import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassJ;
import java.util.BitSet;

public final class ClassX extends ClassJ implements Interfacee {

    public static final ClassX f3113a = new ClassX(0);

    public ClassX(int i) {
        super(i);
    }

    public static ClassX m4909a(ClassU c1194u) {
        ClassX c1197x = new ClassX(1);
        c1197x.m4915a(0, c1194u);
        return c1197x;
    }

    public static ClassX m4910a(ClassU c1194u, ClassU c1194u2) {
        ClassX c1197x = new ClassX(2);
        c1197x.m4915a(0, c1194u);
        c1197x.m4915a(1, c1194u2);
        return c1197x;
    }

    public ClassX m4913a(int i, boolean z, BitSet bitSet) {
        int iD_ = m5476d_();
        if (iD_ == 0) {
            return this;
        }
        ClassY c1198y = new ClassY(this, bitSet, i, z, null);
        for (int i2 = 0; i2 < iD_; i2++) {
            c1198y.m4925a(i2);
        }
        return c1198y.m4923a();
    }

    public ClassX m4914a(BitSet bitSet) {
        int iD_ = m5476d_() - bitSet.cardinality();
        if (iD_ == 0) {
            return f3113a;
        }
        ClassX c1197x = new ClassX(iD_);
        int i = 0;
        for (int i2 = 0; i2 < m5476d_(); i2++) {
            if (!bitSet.get(i2)) {
                c1197x.m5474a(i, m5477e(i2));
                i++;
            }
        }
        if (m5517k()) {
            c1197x.mo3944c_();
        }
        return c1197x;
    }

    @Override
    public ClassC mo4145a(int i) {
        return m4916b(i).mo3825a().mo3825a();
    }

    @Override
    public Interfacee mo4146a(ClassC c1236c) {
        throw new UnsupportedOperationException("unsupported");
    }

    public void m4915a(int i, ClassU c1194u) {
        m5474a(i, (Object) c1194u);
    }

    public ClassU m4916b(int i) {
        return (ClassU) m5477e(i);
    }

    public ClassX m4917b(ClassU c1194u) {
        int iD_ = m5476d_();
        ClassX c1197x = new ClassX(iD_ + 1);
        for (int i = 0; i < iD_; i++) {
            c1197x.m5474a(i + 1, m5477e(i));
        }
        c1197x.m5474a(0, (Object) c1194u);
        if (m5517k()) {
            c1197x.mo3944c_();
        }
        return c1197x;
    }

    public int m4918c(int i) {
        int iD_ = m5476d_();
        for (int i2 = 0; i2 < iD_; i2++) {
            if (m4916b(i2).m4894g() == i) {
                return i2;
            }
        }
        return -1;
    }

    public ClassX m4919d(int i) {
        int iD_ = m5476d_();
        if (iD_ == 0) {
            return this;
        }
        ClassX c1197x = new ClassX(iD_);
        for (int i2 = 0; i2 < iD_; i2++) {
            ClassU c1194u = (ClassU) m5477e(i2);
            if (c1194u != null) {
                c1197x.m5474a(i2, (Object) c1194u.m4893c(i));
            }
        }
        if (m5517k()) {
            c1197x.mo3944c_();
        }
        return c1197x;
    }

    public int m4920e() {
        int iD_ = m5476d_();
        int iM5066j = 0;
        for (int i = 0; i < iD_; i++) {
            iM5066j += mo4145a(i).m5066j();
        }
        return iM5066j;
    }

    public ClassX m4921f() {
        int iD_ = m5476d_() - 1;
        if (iD_ == 0) {
            return f3113a;
        }
        ClassX c1197x = new ClassX(iD_);
        for (int i = 0; i < iD_; i++) {
            c1197x.m5474a(i, m5477e(i + 1));
        }
        if (!m5517k()) {
            return c1197x;
        }
        c1197x.mo3944c_();
        return c1197x;
    }

    public ClassX m4922g() {
        int iD_ = m5476d_() - 1;
        if (iD_ == 0) {
            return f3113a;
        }
        ClassX c1197x = new ClassX(iD_);
        for (int i = 0; i < iD_; i++) {
            c1197x.m5474a(i, m5477e(i));
        }
        if (!m5517k()) {
            return c1197x;
        }
        c1197x.mo3944c_();
        return c1197x;
    }
}
