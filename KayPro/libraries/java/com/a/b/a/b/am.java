package com.a.b.a.b;

import com.a.b.c.ClassA;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.ClassC;

public class am {

    static final boolean f1834a;

    private final Interfacex f1835b;

    private final ClassK f1836c;

    private ClassO f1837d;

    private final ClassT f1838e;

    private final an f1839f;

    private final ClassA f1840g;

    static {
        f1834a = !am.class.desiredAssertionStatus();
    }

    public am(Interfacex interfaceC0952x, ClassO c0943o, ClassA c0984a) {
        if (interfaceC0952x == null) {
            throw new NullPointerException("machine == null");
        }
        if (c0943o == null) {
            throw new NullPointerException("method == null");
        }
        if (c0984a == null) {
            throw new NullPointerException("dexOptions == null");
        }
        this.f1835b = interfaceC0952x;
        this.f1836c = c0943o.m4008m();
        this.f1837d = c0943o;
        this.f1838e = c0943o.m4010o();
        this.f1839f = new an(this);
        this.f1840g = c0984a;
        if (c0943o.m3997b()) {
            m3917a(c0943o);
        }
    }

    public void m3911a(int i) {
        if (this.f1840g.m4203a(26)) {
            return;
        }
        m3919a(String.format("invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)", Integer.valueOf(i), 26, Integer.valueOf(this.f1840g.f1961b)));
    }

    public void m3912a(int i, ClassZ c1233z) {
        boolean zM4203a;
        if (i == 185 || this.f1840g.m4203a(24)) {
            return;
        }
        boolean z = this.f1840g.f1963d;
        if (i == 184) {
            zM4203a = z & this.f1840g.m4203a(21);
        } else {
            if (!f1834a && i != 183 && i != 182) {
                throw new AssertionError();
            }
            zM4203a = z;
        }
        String str = i == 184 ? "static" : "default";
        if (zM4203a) {
            m3925b(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (experimental at current API level %d)", str, c1233z.m5022n().mo3828d(), c1233z.m5023o().mo3828d(), 24, Integer.valueOf(this.f1840g.f1961b)));
        } else {
            m3919a(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)", str, c1233z.m5022n().mo3828d(), c1233z.m5023o().mo3828d(), 24, Integer.valueOf(this.f1840g.f1961b)));
        }
    }

    private void m3917a(ClassO c0943o) {
        if (this.f1840g.m4203a(24)) {
            return;
        }
        Object[] objArr = new Object[5];
        objArr[0] = c0943o.m3998c() ? "static" : "default";
        objArr[1] = 24;
        objArr[2] = Integer.valueOf(this.f1840g.f1961b);
        objArr[3] = c0943o.mo4004i().mo3828d();
        objArr[4] = c0943o.mo3999d().mo3828d();
        m3925b(String.format("defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s", objArr));
    }

    public void m3918a(Abstracta abstractC1200a) {
        if (this.f1840g.m4203a(28)) {
            return;
        }
        m3919a(String.format("invalid constant type %s requires --min-sdk-version >= %d (currently %d)", abstractC1200a.mo4943h(), 28, Integer.valueOf(this.f1840g.f1961b)));
    }

    public void m3919a(String str) {
        throw new al(String.format("ERROR in %s.%s: %s", this.f1837d.mo4004i().mo3828d(), this.f1837d.mo3999d().mo3828d(), str));
    }

    public static al m3920b() {
        return new al("stack mismatch: illegal top-of-stack for opcode");
    }

    public static ClassC m3922b(ClassC c1236c, ClassC c1236c2) {
        if (c1236c2 == ClassC.f3259j) {
            return c1236c.m5071o() ? ClassC.f3259j : c1236c.m5076t();
        }
        if (c1236c == ClassC.f3267r && c1236c2.m5072p() && c1236c2.m5077u().m5071o()) {
            return c1236c2;
        }
        return (c1236c == ClassC.f3251b && c1236c2 == ClassC.f3240E) ? ClassC.f3240E : c1236c.m5076t();
    }

    public void m3923b(int i) {
        if (!this.f1840g.m4203a(26)) {
            m3919a(String.format("invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)", 26, Integer.valueOf(this.f1840g.f1961b)));
        } else if (i != 182) {
            m3919a("Unsupported signature polymorphic invocation (" + ClassJ.m3982a(i) + ")");
        }
    }

    private void m3925b(String str) {
        this.f1840g.f1964e.println(String.format("WARNING in %s.%s: %s", this.f1837d.mo4004i().mo3828d(), this.f1837d.mo3999d().mo3828d(), str));
    }

    public void m3926a(ClassF c0934f, ClassQ c0945q) {
        int iM3963c = c0934f.m3963c();
        this.f1839f.m3937a(c0945q);
        try {
            int iM3962b = c0934f.m3962b();
            while (iM3962b < iM3963c) {
                int iM3988a = this.f1836c.m3988a(iM3962b, this.f1839f);
                this.f1839f.mo3929a(iM3962b);
                iM3962b += iM3988a;
            }
        } catch (al e) {
            c0945q.m4033a(e);
            throw e;
        }
    }
}
