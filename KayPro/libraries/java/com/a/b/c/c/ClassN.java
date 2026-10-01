package com.a.b.c.c;

import com.a.a.a.ClassB;
import com.a.b.c.b.ClassJ;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.Iterator;

public final class ClassN extends Abstractat {

    private final ClassZ f2475a;

    private final ClassJ f2476b;

    private ClassJ f2477c;

    private final boolean f2478d;

    private final Interfacee f2479e;

    private ClassS f2480f;

    public ClassN(ClassZ c1233z, ClassJ c1042j, boolean z, Interfacee interfaceC1238e) {
        super(4, -1);
        if (c1233z == null) {
            throw new NullPointerException("ref == null");
        }
        if (c1042j == null) {
            throw new NullPointerException("code == null");
        }
        if (interfaceC1238e == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.f2475a = c1233z;
        this.f2476b = c1042j;
        this.f2478d = z;
        this.f2479e = interfaceC1238e;
        this.f2477c = null;
        this.f2480f = null;
    }

    private void m4632b(ClassT c1113t, Interfacea interfaceC1303a) {
        try {
            this.f2476b.m4365f().m4389a(interfaceC1303a);
        } catch (RuntimeException e) {
            throw ClassB.m3756a(e, "...while writing instructions for " + this.f2475a.mo3828d());
        }
    }

    private int m4633c() {
        return this.f2475a.m4982b(this.f2478d);
    }

    private int m4634d() {
        return this.f2476b.m4365f().m4392g();
    }

    private int m4635h() {
        return this.f2476b.m4365f().m4391f();
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_CODE_ITEM;
    }

    @Override
    protected void mo4470a(Abstractax abstractC1083ax, int i) {
        int iM4607b;
        ClassT c1113tM4540f = abstractC1083ax.m4540f();
        this.f2476b.m4359a(new ClassO(this, c1113tM4540f));
        if (this.f2477c != null) {
            this.f2477c.m4605a(c1113tM4540f);
            iM4607b = this.f2477c.m4607b();
        } else {
            iM4607b = 0;
        }
        int iM4390e = this.f2476b.m4365f().m4390e();
        if ((iM4390e & 1) != 0) {
            iM4390e++;
        }
        m4520a(iM4607b + (iM4390e * 2) + 16);
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        aq c1076aqM4686p = c1113t.m4686p();
        be c1091beM4680j = c1113t.m4680j();
        if (this.f2476b.m4360a() || this.f2476b.m4361b()) {
            this.f2480f = new ClassS(this.f2476b, this.f2478d, this.f2475a);
            c1076aqM4686p.m4511a((Abstractat) this.f2480f);
        }
        if (this.f2476b.m4362c()) {
            Iterator it = this.f2476b.m4363d().iterator();
            while (it.hasNext()) {
                c1091beM4680j.m4563a((ClassC) it.next());
            }
            this.f2477c = new ClassJ(this.f2476b);
        }
        Iterator it2 = this.f2476b.m4364e().iterator();
        while (it2.hasNext()) {
            c1113t.m4669a((Abstracta) it2.next());
        }
    }

    @Override
    protected void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        boolean zMo5405a = interfaceC1303a.mo5405a();
        int iM4635h = m4635h();
        int iM4634d = m4634d();
        int iM4633c = m4633c();
        int iM4390e = this.f2476b.m4365f().m4390e();
        boolean z = (iM4390e & 1) != 0;
        int iM4604a = this.f2477c == null ? 0 : this.f2477c.m4604a();
        int iE = this.f2480f == null ? 0 : this.f2480f.m4523e();
        if (zMo5405a) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4525g()) + ' ' + this.f2475a.mo3828d());
            interfaceC1303a.mo5403a(2, "  registers_size: " + ClassK.m5485c(iM4635h));
            interfaceC1303a.mo5403a(2, "  ins_size:       " + ClassK.m5485c(iM4633c));
            interfaceC1303a.mo5403a(2, "  outs_size:      " + ClassK.m5485c(iM4634d));
            interfaceC1303a.mo5403a(2, "  tries_size:     " + ClassK.m5485c(iM4604a));
            interfaceC1303a.mo5403a(4, "  debug_off:      " + ClassK.m5480a(iE));
            interfaceC1303a.mo5403a(4, "  insns_size:     " + ClassK.m5480a(iM4390e));
            if (this.f2479e.mo4148d_() != 0) {
                interfaceC1303a.mo5403a(0, "  throws " + ClassB.m5047a(this.f2479e));
            }
        }
        interfaceC1303a.mo5456c(iM4635h);
        interfaceC1303a.mo5456c(iM4633c);
        interfaceC1303a.mo5456c(iM4634d);
        interfaceC1303a.mo5456c(iM4604a);
        interfaceC1303a.mo5457d(iE);
        interfaceC1303a.mo5457d(iM4390e);
        m4632b(c1113t, interfaceC1303a);
        if (this.f2477c != null) {
            if (z) {
                if (zMo5405a) {
                    interfaceC1303a.mo5403a(2, "  padding: 0");
                }
                interfaceC1303a.mo5456c(0);
            }
            this.f2477c.m4606a(c1113t, interfaceC1303a);
        }
        if (!zMo5405a || this.f2480f == null) {
            return;
        }
        interfaceC1303a.mo5403a(0, "  debug info");
        this.f2480f.m4663a(c1113t, interfaceC1303a, "    ");
    }

    @Override
    public String mo4474b() {
        return this.f2475a.mo3828d();
    }

    public String toString() {
        return "CodeItem{" + mo4474b() + "}";
    }
}
