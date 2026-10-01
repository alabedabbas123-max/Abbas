package com.a.b.e.b;

import com.a.b.g.ClassD;
import com.a.b.g.ClassN;

public final class ClassP {

    private final ab f3097a;

    private final ClassD f3098b;

    private final ClassQ f3099c;

    private final int[] f3100d;

    private ClassP(ab c1168ab) {
        if (c1168ab == null) {
            throw new NullPointerException("method == null");
        }
        ClassD c1177dM4746a = c1168ab.m4746a();
        int iJ = c1177dM4746a.m5515j();
        this.f3097a = c1168ab;
        this.f3098b = c1177dM4746a;
        this.f3099c = new ClassQ(c1168ab);
        this.f3100d = ClassD.m5423a(iJ);
    }

    private ClassQ m4862a() {
        int iM4748b = this.f3097a.m4748b();
        while (iM4748b >= 0) {
            ClassD.m5427c(this.f3100d, iM4748b);
            m4864a(iM4748b);
            iM4748b = ClassD.m5428d(this.f3100d, 0);
        }
        this.f3099c.mo3944c_();
        return this.f3099c;
    }

    public static ClassQ m4863a(ab c1168ab) {
        return new ClassP(c1168ab).m4862a();
    }

    private void m4864a(int i) {
        ClassZ c1199zM4872b = this.f3099c.m4872b(i);
        ClassB c1175bM4825b = this.f3098b.m4825b(i);
        ClassM c1186mM4813b = c1175bM4825b.m4813b();
        int iD_ = c1186mM4813b.m5476d_();
        boolean z = c1175bM4825b.m4820i() && c1186mM4813b.m4851e().m4842h() != null;
        int i2 = iD_ - 1;
        ClassZ c1199zM4939e = c1199zM4872b;
        for (int i3 = 0; i3 < iD_; i3++) {
            if (z && i3 == i2) {
                c1199zM4939e.mo3944c_();
                c1199zM4939e = c1199zM4939e.m4939e();
            }
            Abstractj abstractC1183jM4847a = c1186mM4813b.m4847a(i3);
            ClassU c1194uM4843i = abstractC1183jM4847a.m4843i();
            if (c1194uM4843i == null) {
                ClassU c1194uM4842h = abstractC1183jM4847a.m4842h();
                if (c1194uM4842h != null && c1199zM4939e.m4928a(c1194uM4842h.m4894g()) != null) {
                    c1199zM4939e.m4936c(c1199zM4939e.m4928a(c1194uM4842h.m4894g()));
                }
            } else {
                ClassU c1194uM4901n = c1194uM4843i.m4901n();
                if (!c1194uM4901n.equals(c1199zM4939e.m4930a(c1194uM4901n))) {
                    ClassU c1194uM4929a = c1199zM4939e.m4929a(c1194uM4901n.m4896i());
                    if (c1194uM4929a != null && c1194uM4929a.m4894g() != c1194uM4901n.m4894g()) {
                        c1199zM4939e.m4936c(c1194uM4929a);
                    }
                    this.f3099c.m4870a(abstractC1183jM4847a, c1194uM4901n);
                    c1199zM4939e.m4938d(c1194uM4901n);
                }
            }
        }
        c1199zM4939e.mo3944c_();
        ClassN c1316nM4814c = c1175bM4825b.m4814c();
        int iM5496b = c1316nM4814c.m5496b();
        int iM4815d = c1175bM4825b.m4815d();
        for (int i4 = 0; i4 < iM5496b; i4++) {
            int iM5497b = c1316nM4814c.m5497b(i4);
            if (this.f3099c.m4873b(iM5497b, iM5497b == iM4815d ? c1199zM4939e : c1199zM4872b)) {
                ClassD.m5424b(this.f3100d, iM5497b);
            }
        }
    }
}
