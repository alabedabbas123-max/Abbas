package com.a.b.e.b;

import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import com.a.b.g.Interfacew;

public abstract class Abstractj implements Interfacew {

    private final aa f3084a;

    private final ad f3085b;

    private final ClassU f3086c;

    private final ClassX f3087d;

    public Abstractj(aa c1167aa, ad c1170ad, ClassU c1194u, ClassX c1197x) {
        if (c1167aa == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c1170ad == null) {
            throw new NullPointerException("position == null");
        }
        if (c1197x == null) {
            throw new NullPointerException("sources == null");
        }
        this.f3084a = c1167aa;
        this.f3085b = c1170ad;
        this.f3086c = c1194u;
        this.f3087d = c1197x;
    }

    private static boolean m4837a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public abstract Abstractj mo4802a(ClassU c1194u, ClassX c1197x);

    public abstract Abstractj mo4803a(ClassC c1236c);

    public String mo4804a() {
        return null;
    }

    protected final String m4838a(String str) {
        StringBuilder sb = new StringBuilder(80);
        sb.append("Insn{");
        sb.append(this.f3085b);
        sb.append(' ');
        sb.append(this.f3084a);
        if (str != null) {
            sb.append(' ');
            sb.append(str);
        }
        sb.append(" :: ");
        if (this.f3086c != null) {
            sb.append(this.f3086c);
            sb.append(" <- ");
        }
        sb.append(this.f3087d);
        sb.append('}');
        return sb.toString();
    }

    public abstract void mo4805a(Interfacel interfaceC1185l);

    public boolean mo4806a(Abstractj abstractC1183j) {
        return this.f3084a == abstractC1183j.m4840f() && this.f3085b.equals(abstractC1183j.m4841g()) && getClass() == abstractC1183j.getClass() && m4837a(this.f3086c, abstractC1183j.m4842h()) && m4837a(this.f3087d, abstractC1183j.m4844j()) && ClassB.m5048a(mo4807b(), abstractC1183j.mo4807b());
    }

    public abstract Interfacee mo4807b();

    protected final String m4839b(String str) {
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.f3085b);
        sb.append(": ");
        sb.append(this.f3084a.m4743g());
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        if (this.f3086c == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(this.f3086c.mo3828d());
        }
        sb.append(" <-");
        int iD_ = this.f3087d.m5476d_();
        if (iD_ == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < iD_; i++) {
                sb.append(" ");
                sb.append(this.f3087d.m4916b(i).mo3828d());
            }
        }
        return sb.toString();
    }

    @Override
    public String mo3828d() {
        return m4839b(mo4804a());
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final aa m4840f() {
        return this.f3084a;
    }

    public final ad m4841g() {
        return this.f3085b;
    }

    public final ClassU m4842h() {
        return this.f3086c;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final ClassU m4843i() {
        ClassU c1194uM4916b = this.f3084a.m4737a() == 54 ? this.f3087d.m4916b(0) : this.f3086c;
        if (c1194uM4916b == null || c1194uM4916b.m4896i() == null) {
            return null;
        }
        return c1194uM4916b;
    }

    public final ClassX m4844j() {
        return this.f3087d;
    }

    public final boolean m4845k() {
        return this.f3084a.m4744h();
    }

    public Abstractj mo4846l() {
        return this;
    }

    public String toString() {
        return m4838a(mo4804a());
    }
}
