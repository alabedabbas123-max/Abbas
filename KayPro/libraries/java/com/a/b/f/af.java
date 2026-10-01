package com.a.b.f;

import com.a.b.a.b.ClassY;
import com.a.b.e.b.ClassO;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.d.Interfaced;
import java.util.BitSet;
import java.util.List;

public class af {

    ap f3343a;

    private final BitSet f3344b;

    private af(ap c1270ap) {
        this.f3343a = c1270ap;
        this.f3344b = new BitSet(c1270ap.m5294g());
    }

    private void m5180a() {
        int iM5294g = this.f3343a.m5294g();
        for (int i = 0; i < iM5294g; i++) {
            Abstractan abstractC1268anM5288c = this.f3343a.m5288c(i);
            if (abstractC1268anM5288c != null && abstractC1268anM5288c.m5261o().mo3827c() == 0) {
                this.f3344b.set(i);
            }
        }
        while (true) {
            int iNextSetBit = this.f3344b.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            this.f3344b.clear(iNextSetBit);
            if (m5183a((ac) this.f3343a.m5288c(iNextSetBit))) {
                List listM5290d = this.f3343a.m5290d(iNextSetBit);
                int size = listM5290d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Abstractan abstractC1268an = (Abstractan) listM5290d.get(i2);
                    ClassU c1194uM5261o = abstractC1268an.m5261o();
                    if (c1194uM5261o != null && (abstractC1268an instanceof ac)) {
                        this.f3344b.set(c1194uM5261o.m4894g());
                    }
                }
            }
        }
    }

    public static void m5181a(ap c1270ap) {
        new af(c1270ap).m5180a();
    }

    private static boolean m5182a(ClassO c1188o, ClassO c1188o2) {
        return c1188o == c1188o2 || (c1188o != null && c1188o.equals(c1188o2));
    }

    boolean m5183a(ac c1257ac) {
        c1257ac.m5170a(this.f3343a);
        ClassX c1197xMo5171b = c1257ac.mo5171b();
        int i = -1;
        int iD_ = c1197xMo5171b.m5476d_();
        int i2 = 0;
        ClassU c1194u = null;
        while (i2 < iD_) {
            ClassU c1194uM4916b = c1197xMo5171b.m4916b(i2);
            if (c1194uM4916b.mo3827c() != 0) {
                i = i2;
            } else {
                c1194uM4916b = c1194u;
            }
            i2++;
            c1194u = c1194uM4916b;
        }
        if (c1194u == null) {
            return false;
        }
        ClassO c1188oM4896i = c1194u.m4896i();
        Interfaced interfaceC1237dMo3825a = c1194u.mo3825a();
        boolean z = true;
        for (int i3 = 0; i3 < iD_; i3++) {
            if (i3 != i) {
                ClassU c1194uM4916b2 = c1197xMo5171b.m4916b(i3);
                if (c1194uM4916b2.mo3827c() != 0) {
                    z = z && m5182a(c1188oM4896i, c1194uM4916b2.m4896i());
                    interfaceC1237dMo3825a = ClassY.m4079a(interfaceC1237dMo3825a, c1194uM4916b2.mo3825a());
                }
            }
        }
        if (interfaceC1237dMo3825a == null) {
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < iD_; i4++) {
                sb.append(c1197xMo5171b.m4916b(i4).toString());
                sb.append(' ');
            }
            throw new RuntimeException("Couldn't map types in phi insn:" + ((Object) sb));
        }
        ClassO c1188o = z ? c1188oM4896i : null;
        ClassU c1194uO = c1257ac.m5261o();
        if (c1194uO.m4895h() == interfaceC1237dMo3825a && m5182a(c1188o, c1194uO.m4896i())) {
            return false;
        }
        c1257ac.m5167a(interfaceC1237dMo3825a, c1188o);
        return true;
    }
}
