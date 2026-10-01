package a.g.c;

import a.b.a.d.a;
import a.b.a.d.i;
import a.b.a.d.l;
import a.b.a.d.o;
import a.b.a.h;
import a.b.a.j;
import a.b.a.m;
import a.b.a.n;
import a.b.b.a.f;
import a.b.b.q;
import a.b.c;
import a.b.c.ad;
import a.b.c.al;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import java.util.Stack;
import org.apache.commons.io.FilenameUtils;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.c.ClassU;
import a.b.d.Abstractc;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.b.d.ClassK;
import a.b.d.a.ClassA;
import a.b.d.a.ClassE;
import a.b.f.ClassI;
import a.b.f.ClassQ;
import a.g.ClassF;
import a.g.ClassL;
import a.g.b.ClassA;
import a.g.b.ai;
import a.g.b.am;
import a.g.b.at;
import a.g.b.au;
import a.g.b.ClassB;
import a.g.b.ClassC;
import a.g.b.ClassI;
import a.g.b.ClassP;
import a.g.b.ClassQ;
import a.g.b.ClassX;
import a.j.ClassL;

public class ClassU extends w implements i, l, o, f, d, aq {

    private static final int f1077a = Integer.parseInt(System.getProperty("maximum.inlined.code.length", "8"));

    private static final int f1078b = Integer.parseInt(System.getProperty("maximum.inlined.code.length", "32"));

    private static final int f1079c = Integer.parseInt(System.getProperty("maximum.resulting.code.length", "7000"));

    private static final int f1080d = Integer.parseInt(System.getProperty("maximum.resulting.code.length", "2000"));

    private boolean f1081A;

    private boolean f1082B;

    private String f1083C;

    private int f1084D;

    private final boolean f1085e;

    private final boolean f1086f;

    private final boolean f1087g;

    private final boolean f1088h;

    private final d f1089i;

    private k f1094n;

    private ClassN f1095o;

    private ad f1096p;

    private al f1097q;

    private int f1098r;

    private boolean f1099s;

    private boolean f1101u;

    private boolean f1102v;

    private int f1103w;

    private int f1104x;

    private int f1105y;

    private boolean f1106z;

    private final ClassU f1090j = new ClassU();

    private final aq f1091k = new ClassL(new a(new ClassA(new ClassE(new at(), new ClassA()))));

    private final i f1092l = new ClassA(new ClassP());

    private final a.b.a.d.w f1093m = new a.b.a.d.w();

    private Stack f1100t = new Stack();

    public ClassU(boolean z, boolean z2, boolean z3, boolean z4, d dVar) {
        this.f1085e = z;
        this.f1086f = z2;
        this.f1087g = z3;
        this.f1088h = z4;
        this.f1089i = dVar;
    }

    private void m2774a(c cVar, Interfacej interfaceC0162j) {
        byte b;
        String strB = interfaceC0162j.mo949b(cVar);
        boolean z = (interfaceC0162j.mo945a() & 8) != 0;
        ClassI.m797t(strB);
        int iM798u = ClassI.m798u(strB);
        int i = z ? 0 : 1;
        String[] strArr = new String[iM798u];
        ClassQ c0086q = new ClassQ(strB);
        int i2 = 0;
        while (i2 < iM798u) {
            String strM899e = c0086q.m899e();
            strArr[i2] = strM899e;
            if (ClassI.m799v(strM899e) == 2) {
                i2++;
            }
            i2++;
        }
        this.f1090j.m235a(iM798u + 1);
        for (int i3 = iM798u - 1; i3 >= 0; i3--) {
            String str = strArr[i3];
            if (str != null) {
                switch (str.charAt(0)) {
                    case 'B':
                    case 'C':
                    case 'I':
                    case 'S':
                    case 'Z':
                        b = 54;
                        break;
                    case 'D':
                        b = 57;
                        break;
                    case 'F':
                        b = 56;
                        break;
                    case 'J':
                        b = 55;
                        break;
                    default:
                        b = 58;
                        break;
                }
                this.f1090j.m236a((iM798u - i3) - 1, new ClassK(b, this.f1105y + i + i3));
            }
        }
        if (!z) {
            this.f1090j.m236a(iM798u, new ClassK((byte) 58, this.f1105y));
        }
        this.f1090j.m259b();
    }

    private void m2775c(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f1090j.m235a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this);
        this.f1090j.m260b(dVar.e);
        dVar.a(cVar, interfaceC0162j, this.f1097q);
        this.f1082B = false;
        this.f1084D = 0;
        dVar.b(cVar, interfaceC0162j, this);
        if (!this.f1082B) {
            this.f1084D = this.f1090j.m232a(this.f1084D, (m) new j(0, 0, this.f1099s ? cVar.b() + FilenameUtils.EXTENSION_SEPARATOR + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + ":0:0" : null)) + 1;
        }
        if (this.f1099s) {
            this.f1084D = this.f1090j.m232a(this.f1084D, (m) new j(dVar.e, -1, cVar.b() + FilenameUtils.EXTENSION_SEPARATOR + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + ":0:0")) + 1;
        }
        this.f1090j.m259b();
    }

    public void m2776a(c cVar, a.b.a.a aVar) {
    }

    public void m2777a(c cVar, q qVar) {
        qVar.a(this);
    }

    public void m2778a(c cVar, Interfacei interfaceC0161i) {
    }

    public void m2779a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        try {
            m2788b(cVar, interfaceC0162j, dVar);
        } catch (RuntimeException e) {
            ClassL.m3161a("Unexpected error while inlining method:");
            ClassL.m3161a("  Target class   = [" + this.f1094n.b() + "]");
            ClassL.m3161a("  Target method  = [" + this.f1095o.mo946a((c) this.f1094n) + this.f1095o.mo949b(this.f1094n) + "]");
            if (this.f1099s) {
                ClassL.m3161a("  Inlined class  = [" + cVar.b() + "]");
                ClassL.m3161a("  Inlined method = [" + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + "]");
            }
            ClassL.m3161a("  Exception      = [" + e.getClass().getName() + "] (" + e.getMessage() + ")");
            e.printStackTrace();
            ClassL.m3161a("Not inlining this method");
        }
    }

    public void m2780a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -74:
            case -73:
            case -72:
            case -71:
                this.f1106z = false;
                this.f1090j.m260b(i);
                this.f1101u = !this.f1099s && this.f1093m.a(i) && this.f1093m.c(i) == 0;
                this.f1105y += dVar.d;
                this.f1102v = false;
                this.f1103w = 0;
                dVar.a(cVar, interfaceC0162j, i, this);
                this.f1102v = this.f1103w > 0 ? this.f1102v : true;
                cVar.a(c0047b.f139a, this);
                this.f1105y -= dVar.d;
                if (this.f1106z) {
                    if (this.f1089i != null) {
                        this.f1089i.a(cVar, interfaceC0162j, dVar, i, c0047b);
                        return;
                    }
                    return;
                }
                break;
            case -69:
                this.f1104x++;
                break;
        }
        if (this.f1099s) {
            c0047b.f139a = this.f1096p.a(cVar, c0047b.f139a);
        }
        this.f1090j.m236a(i, c0047b);
    }

    public void m2781a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        this.f1090j.m236a(i, abstractC0048c);
    }

    public void m2782a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        if (this.f1099s) {
            switch (c0053h.f147c) {
                case -84:
                case -83:
                case -82:
                case -81:
                case -80:
                case -79:
                    if (i >= dVar.e - 1) {
                        this.f1090j.m260b(i);
                    } else {
                        this.f1090j.m236a(i, new ClassA((byte) -56, dVar.e - i));
                    }
                    break;
            }
        }
        this.f1090j.m236a(i, c0053h);
    }

    public void m2783a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        if (this.f1099s) {
            c0056k.f156b += this.f1105y;
        }
        this.f1090j.m236a(i, c0056k);
    }

    public void m2784a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, h hVar) {
        this.f1103w++;
        this.f1102v = (hVar.d == 0) | this.f1102v;
    }

    public void m2785a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, m mVar) {
        try {
            String strA = mVar.a() != null ? mVar.a() : this.f1083C;
            this.f1084D = this.f1090j.m232a(this.f1084D, (m) (strA != null ? new j(mVar.b, mVar.c, strA) : new m(mVar.b, mVar.c))) + 1;
        } catch (IllegalArgumentException e) {
        }
    }

    public void m2786a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, n nVar) {
        this.f1083C = this.f1099s ? cVar.b() + FilenameUtils.EXTENSION_SEPARATOR + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + ':' + nVar.a() + ':' + nVar.b() : null;
        nVar.a(cVar, interfaceC0162j, dVar, this);
        this.f1082B = true;
    }

    public void m2787a(k kVar, ClassN c0165n) {
        int iA = c0165n.mo945a();
        if (ClassF.m2861a(c0165n) || (iA & 26) == 0 || (iA & 1312) != 0 || c0165n.mo946a((c) kVar).equals("<init>") || ((c0165n.equals(this.f1095o) && kVar.equals(this.f1094n)) || this.f1100t.contains(c0165n) || this.f1094n.a < kVar.a || (((at.m2471a(c0165n) || ClassI.m2528a(c0165n)) && !kVar.equals(this.f1094n)) || ((ClassB.m2499a(c0165n) && this.f1104x != 0) || ((!this.f1087g && ((ClassA.m2226a(c0165n) && !kVar.equals(this.f1094n)) || (ClassA.m2227b(c0165n) && !ClassI.m743B(kVar.b()).equals(ClassI.m743B(this.f1094n.b()))))) || ((ClassA.m2228c(c0165n) && !kVar.equals(this.f1094n)) || ((au.m2476a(c0165n) && !this.f1102v) || ((ClassC.m2504a(c0165n) && !this.f1101u) || ClassX.m2599a(c0165n) || am.m2442a(this.f1094n, kVar, c0165n))))))))) {
            if (c0165n.mo946a((c) kVar).equals("<init>")) {
                this.f1104x--;
                return;
            }
            return;
        }
        boolean z = this.f1099s;
        this.f1099s = true;
        this.f1100t.push(c0165n);
        c0165n.mo1267a(kVar, (i) this);
        if (!ClassF.m2861a(this.f1095o)) {
            ai.m2350b(this.f1095o).m2374a(ClassQ.m2566a(c0165n));
        }
        c0165n.mo1267a(kVar, this.f1092l);
        this.f1099s = z;
        this.f1100t.pop();
    }

    public void m2788b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        if (this.f1099s) {
            if (!this.f1088h) {
                if (dVar.e > (this.f1086f ? f1078b : f1077a)) {
                    return;
                }
            } else if (ClassP.m2557a(interfaceC0162j) != 1) {
                return;
            }
            if (dVar.e + this.f1098r < (this.f1085e ? f1080d : f1079c)) {
                this.f1098r += dVar.e;
                m2774a(cVar, interfaceC0162j);
                m2775c(cVar, interfaceC0162j, dVar);
                this.f1106z = true;
                this.f1081A = true;
                return;
            }
            return;
        }
        this.f1094n = (k) cVar;
        this.f1095o = (ClassN) interfaceC0162j;
        this.f1096p = new ad(this.f1094n);
        this.f1097q = new al(this.f1094n, this.f1090j);
        this.f1098r = dVar.e;
        this.f1100t.clear();
        this.f1104x = interfaceC0162j.mo946a(cVar).equals("<init>") ? 1 : 0;
        this.f1081A = false;
        this.f1090j.m234a();
        this.f1093m.a(cVar, interfaceC0162j, dVar);
        m2775c(cVar, interfaceC0162j, dVar);
        if (this.f1081A) {
            this.f1090j.m239a(cVar, interfaceC0162j, dVar);
            interfaceC0162j.mo947a(cVar, this.f1091k);
        }
        this.f1094n = null;
        this.f1095o = null;
        this.f1096p = null;
    }
}
