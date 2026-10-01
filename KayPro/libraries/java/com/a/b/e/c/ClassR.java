package com.a.b.e.c;

import com.baidu.mobstat.Config;
import com.a.b.e.d.ClassA;
import com.a.b.e.d.ClassC;
import java.util.ArrayList;
import java.util.List;

public final class ClassR extends Abstracta {

    private final int f3179a;

    private final aa f3180b;

    private final ClassA f3181c;

    private ae f3182d;

    private ClassI f3183e;

    private final List f3184f = new ArrayList();

    private ClassR(int i, aa c1201aa) {
        this.f3179a = i;
        this.f3180b = c1201aa;
        this.f3181c = ClassA.m5036b(c1201aa.m4945b().mo3828d());
    }

    public static ClassR m5004a(int i, aa c1201aa) {
        return new ClassR(i, c1201aa);
    }

    public ClassJ m5005a() {
        ClassJ c1217j = new ClassJ(this, this.f3184f.size());
        this.f3184f.add(c1217j);
        return c1217j;
    }

    public void m5006a(ae c1205ae) {
        if (this.f3182d != null) {
            throw new IllegalArgumentException("already added declaring class");
        }
        if (c1205ae == null) {
            throw new NullPointerException("declaringClass == null");
        }
        this.f3182d = c1205ae;
    }

    public void m5007a(ClassI c1216i) {
        if (this.f3183e != null) {
            throw new IllegalArgumentException("already added call site");
        }
        if (c1216i == null) {
            throw new NullPointerException("callSite == null");
        }
        this.f3183e = c1216i;
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        ClassR c1225r = (ClassR) abstractC1200a;
        int iM5009c = this.f3179a - c1225r.m5009c();
        if (iM5009c != 0) {
            return iM5009c;
        }
        int iA = this.f3180b.compareTo(c1225r.m5010e());
        if (iA != 0) {
            return iA;
        }
        int iA2 = this.f3182d.compareTo((Abstracta) c1225r.m5013j());
        return iA2 == 0 ? this.f3183e.compareTo(c1225r.m5014k()) : iA2;
    }

    public List m5008b() {
        return this.f3184f;
    }

    public int m5009c() {
        return this.f3179a;
    }

    @Override
    public String mo3828d() {
        return "InvokeDynamic(" + (this.f3182d != null ? this.f3182d.mo3828d() : "Unknown") + Config.TRACE_TODAY_VISIT_SPLIT + this.f3179a + ", " + this.f3180b.mo3828d() + ")";
    }

    public aa m5010e() {
        return this.f3180b;
    }

    public ClassA m5011f() {
        return this.f3181c;
    }

    @Override
    public boolean mo4942g() {
        return false;
    }

    @Override
    public String mo4943h() {
        return "InvokeDynamic";
    }

    public ClassC m5012i() {
        return this.f3181c.m5041b();
    }

    public ae m5013j() {
        return this.f3182d;
    }

    public ClassI m5014k() {
        return this.f3183e;
    }

    public String toString() {
        return mo3828d();
    }
}
