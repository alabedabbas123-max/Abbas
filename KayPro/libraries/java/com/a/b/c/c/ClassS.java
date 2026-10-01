package com.a.b.c.c;

import com.a.a.a.ClassB;
import com.a.b.c.b.ac;
import com.a.b.c.b.ClassJ;
import com.a.b.c.b.ClassM;
import com.a.b.c.b.ClassS;
import com.a.b.e.c.ClassZ;
import com.a.b.g.Interfacea;
import java.io.PrintWriter;

public class ClassS extends Abstractat {

    private final ClassJ f2500a;

    private byte[] f2501b;

    private final boolean f2502c;

    private final ClassZ f2503d;

    public ClassS(ClassJ c1042j, boolean z, ClassZ c1233z) {
        super(1, -1);
        if (c1042j == null) {
            throw new NullPointerException("code == null");
        }
        this.f2500a = c1042j;
        this.f2502c = z;
        this.f2503d = c1233z;
    }

    private byte[] m4661a(ClassT c1113t, String str, PrintWriter printWriter, Interfacea interfaceC1303a, boolean z) {
        return m4662b(c1113t, str, printWriter, interfaceC1303a, z);
    }

    private byte[] m4662b(ClassT c1113t, String str, PrintWriter printWriter, Interfacea interfaceC1303a, boolean z) {
        ac c1021acM4367h = this.f2500a.m4367h();
        ClassS c1051sM4368i = this.f2500a.m4368i();
        ClassM c1045mM4365f = this.f2500a.m4365f();
        ClassP c1109p = new ClassP(c1021acM4367h, c1051sM4368i, c1113t, c1045mM4365f.m4390e(), c1045mM4365f.m4391f(), this.f2502c, this.f2503d);
        return (printWriter == null && interfaceC1303a == null) ? c1109p.m4657a() : c1109p.m4658a(str, printWriter, interfaceC1303a, z);
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_DEBUG_INFO_ITEM;
    }

    @Override
    protected void mo4470a(Abstractax abstractC1083ax, int i) {
        try {
            this.f2501b = m4661a(abstractC1083ax.m4540f(), null, null, null, false);
            m4520a(this.f2501b.length);
        } catch (RuntimeException e) {
            throw ClassB.m3756a(e, "...while placing debug info for " + this.f2503d.mo3828d());
        }
    }

    @Override
    public void mo4471a(ClassT c1113t) {
    }

    public void m4663a(ClassT c1113t, Interfacea interfaceC1303a, String str) {
        m4661a(c1113t, str, null, interfaceC1303a, false);
    }

    @Override
    protected void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5404a(String.valueOf(m4525g()) + " debug info");
            m4661a(c1113t, null, null, interfaceC1303a, true);
        }
        interfaceC1303a.mo5453a(this.f2501b);
    }

    @Override
    public String mo4474b() {
        throw new RuntimeException("unsupported");
    }
}
