package com.a.b.c.c;

import com.a.b.e.a.ClassA;
import com.a.b.e.a.ClassE;
import com.a.b.e.a.Enumb;
import com.a.b.g.ClassH;
import com.a.b.g.Interfacea;
import java.util.Arrays;

public final class ClassA extends Abstractat {

    private static final ClassB f2337a = new ClassB(null);

    private static int[] f2338e;

    private final ClassA f2339b;

    private bd f2340c;

    private byte[] f2341d;

    public ClassA(ClassA c1161a, ClassT c1113t) {
        super(1, -1);
        if (c1161a == null) {
            throw new NullPointerException("annotation == null");
        }
        this.f2339b = c1161a;
        this.f2340c = null;
        this.f2341d = null;
        mo4471a(c1113t);
    }

    public static void m4466a(ClassA[] c1059aArr) {
        Arrays.sort(c1059aArr, f2337a);
    }

    static int[] m4467c() {
        int[] iArr = f2338e;
        if (iArr == null) {
            iArr = new int[Enumb.valuesCustom().length];
            try {
                iArr[Enumb.BUILD.ordinal()] = 2;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Enumb.EMBEDDED.ordinal()] = 4;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Enumb.RUNTIME.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Enumb.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            f2338e = iArr;
        }
        return iArr;
    }

    @Override
    protected int mo4468a(Abstractat abstractC1079at) {
        return this.f2339b.compareTo(((ClassA) abstractC1079at).f2339b);
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_ANNOTATION_ITEM;
    }

    @Override
    protected void mo4470a(Abstractax abstractC1083ax, int i) {
        ClassH c1310h = new ClassH();
        new bi(abstractC1083ax.m4540f(), c1310h).m4576a(this.f2339b, false);
        this.f2341d = c1310h.m5461f();
        m4520a(this.f2341d.length + 1);
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        this.f2340c = c1113t.m4680j().m4562a(this.f2339b.m4709b());
        bi.m4572a(c1113t, this.f2339b);
    }

    public void m4472a(Interfacea interfaceC1303a, String str) {
        interfaceC1303a.mo5403a(0, String.valueOf(str) + "visibility: " + this.f2339b.m4711e().mo3828d());
        interfaceC1303a.mo5403a(0, String.valueOf(str) + "type: " + this.f2339b.m4709b().mo3828d());
        for (ClassE c1165e : this.f2339b.m4712f()) {
            interfaceC1303a.mo5403a(0, String.valueOf(str) + c1165e.m4724a().mo3828d() + ": " + bi.m4574b(c1165e.m4725b()));
        }
    }

    @Override
    protected void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        boolean zMo5405a = interfaceC1303a.mo5405a();
        Enumb enumC1162bM4711e = this.f2339b.m4711e();
        if (zMo5405a) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4525g()) + " annotation");
            interfaceC1303a.mo5403a(1, "  visibility: VISBILITY_" + enumC1162bM4711e);
        }
        switch (m4467c()[enumC1162bM4711e.ordinal()]) {
            case 1:
                interfaceC1303a.mo3755a(1);
                break;
            case 2:
                interfaceC1303a.mo3755a(0);
                break;
            case 3:
                interfaceC1303a.mo3755a(2);
                break;
            default:
                throw new RuntimeException("shouldn't happen");
        }
        if (zMo5405a) {
            new bi(c1113t, interfaceC1303a).m4576a(this.f2339b, true);
        } else {
            interfaceC1303a.mo5453a(this.f2341d);
        }
    }

    @Override
    public String mo4474b() {
        return this.f2339b.mo3828d();
    }

    public int hashCode() {
        return this.f2339b.hashCode();
    }
}
