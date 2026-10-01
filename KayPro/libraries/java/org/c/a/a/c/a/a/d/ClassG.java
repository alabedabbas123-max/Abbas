package org.c.a.a.c.a.a.d;

import org.c.a.a.b.d.e.Abstracta;
import org.c.a.a.b.d.e.ClassG;
import org.c.a.a.b.d.e.ClassH;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.c.a.a.c.aa;

public class ClassG extends Abstracta {

    static final boolean f6207b;

    protected String f6208a;

    static {
        f6207b = !ClassG.class.desiredAssertionStatus();
    }

    public String m8655a() {
        return this.f6208a;
    }

    @Override
    public void mo8129a(ClassG c2047g) {
        this.f6208a = c2047g.m8144b();
    }

    @Override
    public void mo8130a(ClassH c2048h) {
        this.f6208a = c2048h.m8152j();
    }

    @Override
    public void mo8131a(ClassI c2049i) {
        this.f6208a = c2049i.m8152j();
    }

    @Override
    public void mo8132a(ClassK c2051k) {
        switch (aa.m8407b(c2051k.m8157g())) {
            case 1:
                this.f6208a = "Boolean";
                return;
            case 2:
                this.f6208a = "Char";
                return;
            case 4:
                this.f6208a = "Float";
                return;
            case 8:
                this.f6208a = "Double";
                return;
            case 16:
                this.f6208a = "Byte";
                return;
            case 32:
                this.f6208a = "Short";
                return;
            case 64:
                this.f6208a = "Int";
                return;
            case 128:
                this.f6208a = "Long";
                return;
            default:
                if (!f6207b) {
                    throw new AssertionError();
                }
                return;
        }
    }
}
