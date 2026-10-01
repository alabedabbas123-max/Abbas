package a.g.b;

import a.b.a.a;
import a.b.a.d.i;
import a.b.b.b;
import a.b.b.d;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import com.blankj.utilcode.constant.MemoryConstants;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.b.d.ClassK;
import a.b.f.ClassI;
import a.b.f.ClassP;
import a.d.a.Abstractbd;
import a.g.a.ah;

public class az extends w implements i, aq, s {

    private final b[] f970a = {new d(1073741827, 1073741828, (c) null, (Interfacei) null)};

    private final Abstractc[] f971b = {new ClassK((byte) 42, 0), new ClassK((byte) 43, 1), new ClassB((byte) -75, 0), new ClassK((byte) 42, 0), new ClassB((byte) -73, MemoryConstants.f4579GB), new ClassH((byte) -79)};

    private final ClassP f972c = new ClassP(this.f970a, this.f971b);

    private c f973d;

    private int f974e;

    private static void m2491a(c cVar, c cVar2) {
        ae.m2304f(cVar).m2307c(cVar2);
    }

    public static c m2492b(c cVar) {
        return ClassF.m2515b(cVar).mo2319m();
    }

    public void m2493a(c cVar, a aVar) {
    }

    public void m2494a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        if (dVar.e != 10) {
            this.f974e = Integer.MIN_VALUE;
            return;
        }
        this.f972c.m858a();
        dVar.a(cVar, interfaceC0162j, this.f972c);
        if (!this.f972c.m885b()) {
            this.f974e = Integer.MIN_VALUE;
            return;
        }
        if (cVar.e(this.f972c.m891d(1073741827)).equals(cVar.b())) {
            this.f974e++;
        } else {
            this.f974e = Integer.MIN_VALUE;
        }
    }

    public void m2495a(k kVar) {
        if (kVar.o == null || kVar.o.length == 0) {
            this.f973d = null;
            this.f974e = 0;
            kVar.a(this);
            if (this.f974e == 1) {
                this.f974e = 0;
                kVar.b(this);
                if (this.f974e == 1) {
                    m2491a((c) kVar, this.f973d);
                }
            }
        }
    }

    public void m2496a(k kVar, ClassL c0163l) {
        if ((c0163l.mo945a() & 8) != 0 || !ClassI.m784j(c0163l.mo949b(kVar)) || ClassI.m773f(c0163l.mo949b(kVar))) {
            this.f974e = Integer.MIN_VALUE;
            return;
        }
        this.f973d = c0163l.f429a;
        if (this.f973d != null) {
            this.f974e++;
        } else {
            this.f974e = Integer.MIN_VALUE;
        }
    }

    public void m2497a(k kVar, ClassN c0165n) {
        if (ClassI.m795r(c0165n.mo946a((c) kVar))) {
            if (ClassI.m797t(c0165n.mo949b(kVar)) != 1) {
                this.f974e = Integer.MIN_VALUE;
                return;
            }
            Abstractbd abstractC0206bdM1996a = ah.m1996a(c0165n, 1);
            if (abstractC0206bdM1996a != null && abstractC0206bdM1996a.mo1331j() == 5 && abstractC0206bdM1996a.mo1558l_().m1560n() == 1) {
                c0165n.mo1267a(kVar, (i) this);
            } else {
                this.f974e = Integer.MIN_VALUE;
            }
        }
    }
}
