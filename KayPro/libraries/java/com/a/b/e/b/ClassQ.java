package com.a.b.e.b;

import com.a.b.g.ClassT;
import java.util.HashMap;

public final class ClassQ extends ClassT {

    private final int f3101a;

    private final ClassZ f3102b;

    private final ClassZ[] f3103c;

    private final HashMap f3104d;

    public ClassQ(ab c1168ab) {
        if (c1168ab == null) {
            throw new NullPointerException("method == null");
        }
        ClassD c1177dM4746a = c1168ab.m4746a();
        int iJ = c1177dM4746a.m5515j();
        this.f3101a = c1177dM4746a.m4826e();
        this.f3102b = new ClassZ(this.f3101a);
        this.f3103c = new ClassZ[iJ];
        this.f3104d = new HashMap(c1177dM4746a.m4827f());
        this.f3102b.mo3944c_();
    }

    private ClassZ m4865c(int i) {
        try {
            return this.f3103c[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    public ClassU m4866a(Abstractj abstractC1183j) {
        return (ClassU) this.f3104d.get(abstractC1183j);
    }

    public ClassZ m4867a(int i) {
        ClassZ c1199zM4865c = m4865c(i);
        return c1199zM4865c != null ? c1199zM4865c : this.f3102b;
    }

    public ClassZ m4868a(ClassB c1175b) {
        return m4867a(c1175b.mo3961a());
    }

    public void m4869a(int i, ClassZ c1199z) {
        m5518l();
        if (c1199z == null) {
            throw new NullPointerException("specs == null");
        }
        try {
            this.f3103c[i] = c1199z;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    public void m4870a(Abstractj abstractC1183j, ClassU c1194u) {
        m5518l();
        if (abstractC1183j == null) {
            throw new NullPointerException("insn == null");
        }
        if (c1194u == null) {
            throw new NullPointerException("spec == null");
        }
        this.f3104d.put(abstractC1183j, c1194u);
    }

    public int m4871b() {
        return this.f3104d.size();
    }

    public ClassZ m4872b(int i) {
        ClassZ c1199zM4865c = m4865c(i);
        return c1199zM4865c != null ? c1199zM4865c.m4939e() : new ClassZ(this.f3101a);
    }

    public boolean m4873b(int i, ClassZ c1199z) {
        ClassZ c1199zM4865c = m4865c(i);
        if (c1199zM4865c == null) {
            m4869a(i, c1199z);
            return true;
        }
        ClassZ c1199zM4939e = c1199zM4865c.m4939e();
        if (c1199zM4865c.m4937d() != 0) {
            c1199zM4939e.m4932a(c1199z, true);
        } else {
            c1199zM4939e = c1199z.m4939e();
        }
        if (c1199zM4865c.equals(c1199zM4939e)) {
            return false;
        }
        c1199zM4939e.mo3944c_();
        m4869a(i, c1199zM4939e);
        return true;
    }
}
