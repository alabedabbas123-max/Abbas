package a.b.f;

import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.g.ag;
import a.b.g.aj;
import a.b.g.am;
import a.b.g.ao;
import a.b.g.ax;
import a.b.g.ay;
import a.b.g.ClassB;
import a.b.g.ClassD;

public class ClassR extends w implements aq {

    private static final ClassT f298a = new ClassT();

    private final boolean f299b;

    private c f300c;

    private Interfacei f301d;

    public ClassR() {
        this(true);
    }

    public ClassR(boolean z) {
        this.f299b = z;
    }

    public c m901a() {
        return this.f300c;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[Catch: t -> 0x006e, TryCatch #0 {t -> 0x006e, blocks: (B:5:0x0006, B:7:0x000c, B:15:0x0027, B:17:0x002f, B:19:0x0035, B:20:0x003a, B:23:0x0044, B:24:0x0053, B:29:0x005e, B:33:0x0072, B:34:0x0078, B:10:0x0016, B:12:0x001e), top: B:36:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e A[Catch: t -> 0x006e, TRY_ENTER, TryCatch #0 {t -> 0x006e, blocks: (B:5:0x0006, B:7:0x000c, B:15:0x0027, B:17:0x002f, B:19:0x0035, B:20:0x003a, B:23:0x0044, B:24:0x0053, B:29:0x005e, B:33:0x0072, B:34:0x0078, B:10:0x0016, B:12:0x001e), top: B:36:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[Catch: t -> 0x006e, TryCatch #0 {t -> 0x006e, blocks: (B:5:0x0006, B:7:0x000c, B:15:0x0027, B:17:0x002f, B:19:0x0035, B:20:0x003a, B:23:0x0044, B:24:0x0053, B:29:0x005e, B:33:0x0072, B:34:0x0078, B:10:0x0016, B:12:0x001e), top: B:36:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0078 A[Catch: t -> 0x006e, TRY_LEAVE, TryCatch #0 {t -> 0x006e, blocks: (B:5:0x0006, B:7:0x000c, B:15:0x0027, B:17:0x002f, B:19:0x0035, B:20:0x003a, B:23:0x0044, B:24:0x0053, B:29:0x005e, B:33:0x0072, B:34:0x0078, B:10:0x0016, B:12:0x001e), top: B:36:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public Interfacei m902a(c cVar, c cVar2, String str, String str2, boolean z) {
        boolean z2;
        aq c0106aj;
        s c0120ay;
        if (str != null) {
            try {
                if (str.indexOf(42) >= 0 || str.indexOf(63) >= 0) {
                    z2 = true;
                } else if (str2 != null || (str2.indexOf(42) < 0 && str2.indexOf(63) < 0)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f300c = null;
                this.f301d = null;
                if (cVar != null || cVar.b() == null) {
                    c0106aj = this;
                } else {
                    c0106aj = new aj(cVar, this);
                }
                boolean z3 = this.f299b;
                boolean z4 = this.f299b;
                if (z2) {
                    if (z) {
                        c0120ay = new ClassB(new ao(str, new am(str2, c0106aj)));
                    } else {
                        c0120ay = new ClassD(new ao(str, new am(str2, c0106aj)));
                    }
                } else if (z) {
                    c0120ay = new ax(str, str2, c0106aj);
                } else {
                    c0120ay = new ay(str, str2, c0106aj);
                }
                cVar2.a(true, z3, z4, false, c0120ay);
            } catch (ClassT e) {
            }
        } else {
            if (str2 != null) {
            }
            z2 = false;
            this.f300c = null;
            this.f301d = null;
            if (cVar != null) {
                c0106aj = this;
            } else {
                c0106aj = this;
            }
            boolean z5 = this.f299b;
            boolean z6 = this.f299b;
            if (z2) {
                if (z) {
                    c0120ay = new ClassB(new ao(str, new am(str2, c0106aj)));
                } else {
                    c0120ay = new ClassD(new ao(str, new am(str2, c0106aj)));
                }
            } else if (z) {
                c0120ay = new ax(str, str2, c0106aj);
            } else {
                c0120ay = new ay(str, str2, c0106aj);
            }
            cVar2.a(true, z5, z6, false, c0120ay);
        }
        return this.f301d;
    }

    public Interfacei m903a(c cVar, String str, String str2, boolean z) {
        return m902a(null, cVar, str, str2, z);
    }

    public Interfacej m904a(c cVar, c cVar2, String str, String str2) {
        return (Interfacej) m902a(cVar, cVar2, str, str2, false);
    }

    public void m905a(c cVar, Interfacei interfaceC0161i) {
        this.f300c = cVar;
        this.f301d = interfaceC0161i;
        throw f298a;
    }

    public boolean m906a(c cVar, Interfacej interfaceC0162j) {
        String strA = interfaceC0162j.mo946a(cVar);
        String strB = interfaceC0162j.mo949b(cVar);
        try {
            this.f300c = null;
            this.f301d = null;
            cVar.a(false, false, false, true, new ay(strA, strB, new ag(0, 2, this)));
            return false;
        } catch (ClassT e) {
            return true;
        }
    }
}
