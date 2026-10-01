package com.a.b.f;

import com.a.b.e.b.Abstractj;
import com.a.b.e.b.aa;
import com.a.b.e.b.ac;
import com.a.b.e.b.ClassR;
import com.a.b.e.b.ClassS;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractv;
import com.a.b.e.d.Interfaced;
import java.util.ArrayList;

public class ClassS {

    private final ap f3451a;

    private ClassS(ap c1270ap) {
        this.f3451a = c1270ap;
    }

    private void m5376a() {
        this.f3451a.m5280a(new ClassT(this, aa.m5160b()));
    }

    public static void m5377a(ap c1270ap) {
        new ClassS(c1270ap).m5376a();
    }

    public void m5379a(ClassZ c1302z, ClassX c1197x, int i, Abstracta abstractC1200a) {
        Abstractj abstractC1183jMo5174f = c1302z.mo5174f();
        aa c1167aaM4749a = ac.m4749a(i, c1302z.m5261o(), c1197x, abstractC1200a);
        ClassZ c1302z2 = new ClassZ(abstractC1200a == null ? new ClassS(c1167aaM4749a, abstractC1183jMo5174f.m4841g(), c1302z.m5261o(), c1197x) : new ClassR(c1167aaM4749a, abstractC1183jMo5174f.m4841g(), c1302z.m5261o(), c1197x, abstractC1200a), c1302z.m5262p());
        ArrayList arrayListM5222c = c1302z.m5262p().m5222c();
        this.f3451a.m5286b(c1302z);
        arrayListM5222c.set(arrayListM5222c.lastIndexOf(c1302z), c1302z2);
        this.f3451a.m5276a(c1302z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m5382a(ClassZ c1302z) {
        aa c1167aaM4840f = c1302z.mo5174f().m4840f();
        ClassU c1194uO = c1302z.m5261o();
        if (c1194uO != null && !this.f3451a.m5283a(c1194uO) && c1167aaM4840f.m4737a() != 5) {
            Interfaced interfaceC1237dM4895h = c1302z.m5261o().m4895h();
            if (interfaceC1237dM4895h.mo3830f() && interfaceC1237dM4895h.mo3827c() == 6) {
                m5379a(c1302z, ClassX.f3113a, 5, (Abstracta) interfaceC1237dM4895h);
                if (c1167aaM4840f.m4737a() == 56) {
                    ArrayList arrayListM5222c = ((aj) this.f3451a.m5297j().get(c1302z.m5262p().m5230h().nextSetBit(0))).m5222c();
                    m5379a((ClassZ) arrayListM5222c.get(arrayListM5222c.size() - 1), ClassX.f3113a, 6, null);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean m5383b(ClassU c1194u) {
        Interfaced interfaceC1237dM4895h = c1194u.m4895h();
        return (interfaceC1237dM4895h instanceof Abstractv) && ((Abstractv) interfaceC1237dM4895h).mo5017k() == 0;
    }
}
