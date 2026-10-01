package com.a.b.e.b;

import com.a.b.g.ClassK;
import com.a.b.g.ClassN;
import com.a.b.g.Interfacep;

public final class ClassB implements Interfacep {

    private final int f3056a;

    private final ClassM f3057b;

    private final ClassN f3058c;

    private final int f3059d;

    public ClassB(int i, ClassM c1186m, ClassN c1316n, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        try {
            c1186m.m5519m();
            int iD_ = c1186m.m5476d_();
            if (iD_ == 0) {
                throw new IllegalArgumentException("insns.size() == 0");
            }
            for (int i3 = iD_ - 2; i3 >= 0; i3--) {
                if (c1186m.m4847a(i3).m4840f().m4740d() != 1) {
                    throw new IllegalArgumentException("insns[" + i3 + "] is a branch or can throw");
                }
            }
            if (c1186m.m4847a(iD_ - 1).m4840f().m4740d() == 1) {
                throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
            }
            try {
                c1316n.m5519m();
                if (i2 < -1) {
                    throw new IllegalArgumentException("primarySuccessor < -1");
                }
                if (i2 >= 0 && !c1316n.m5509h(i2)) {
                    throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + c1316n);
                }
                this.f3056a = i;
                this.f3057b = c1186m;
                this.f3058c = c1316n;
                this.f3059d = i2;
            } catch (NullPointerException e) {
                throw new NullPointerException("successors == null");
            }
        } catch (NullPointerException e2) {
            throw new NullPointerException("insns == null");
        }
    }

    @Override
    public int mo3961a() {
        return this.f3056a;
    }

    public ClassM m4813b() {
        return this.f3057b;
    }

    public ClassN m4814c() {
        return this.f3058c;
    }

    public int m4815d() {
        return this.f3059d;
    }

    public int m4816e() {
        if (this.f3058c.m5496b() != 2) {
            throw new UnsupportedOperationException("block doesn't have exactly two successors");
        }
        int iM5497b = this.f3058c.m5497b(0);
        return iM5497b == this.f3059d ? this.f3058c.m5497b(1) : iM5497b;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public Abstractj m4817f() {
        return this.f3057b.m4847a(0);
    }

    public Abstractj m4818g() {
        return this.f3057b.m4851e();
    }

    public boolean m4819h() {
        return this.f3057b.m4851e().m4845k();
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public boolean m4820i() {
        return this.f3057b.m4851e().mo4807b().mo4148d_() != 0;
    }

    public String toString() {
        return String.valueOf('{') + ClassK.m5485c(this.f3056a) + '}';
    }
}
