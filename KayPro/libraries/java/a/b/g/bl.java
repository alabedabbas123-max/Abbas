package a.b.g;

import a.b.c;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import java.io.PrintWriter;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.f.ClassI;

public class bl implements aq, s {

    private final boolean f385a;

    private final PrintWriter f386b;

    public bl(boolean z, PrintWriter printWriter) {
        this.f385a = z;
        this.f386b = printWriter;
    }

    public void m1069a(ClassE c0057e) {
        this.f386b.println(ClassI.m748a(this.f385a ? c0057e.m399a() : 0, c0057e.m415b()));
    }

    public void m1070a(ClassE c0057e, ClassF c0069f) {
        this.f386b.println(ClassI.m748a(this.f385a ? c0057e.m399a() : 0, c0057e.m415b()) + ": " + ClassI.m749a(this.f385a ? c0069f.mo945a() : 0, c0069f.mo946a((c) c0057e), c0069f.mo949b(c0057e)));
    }

    public void m1071a(ClassE c0057e, ClassH c0160h) {
        this.f386b.println(ClassI.m748a(this.f385a ? c0057e.m399a() : 0, c0057e.m415b()) + ": " + ClassI.m751a(c0057e.m415b(), this.f385a ? c0160h.mo945a() : 0, c0160h.mo946a((c) c0057e), c0160h.mo949b(c0057e)));
    }

    public void m1072a(k kVar) {
        this.f386b.println(ClassI.m748a(this.f385a ? kVar.a() : 0, kVar.b()));
    }

    public void m1073a(k kVar, ClassL c0163l) {
        this.f386b.println(ClassI.m748a(this.f385a ? kVar.a() : 0, kVar.b()) + ": " + ClassI.m749a(this.f385a ? c0163l.mo945a() : 0, c0163l.mo946a((c) kVar), c0163l.mo949b(kVar)));
    }

    public void m1074a(k kVar, ClassN c0165n) {
        this.f386b.println(ClassI.m748a(this.f385a ? kVar.a() : 0, kVar.b()) + ": " + ClassI.m751a(kVar.b(), this.f385a ? c0165n.mo945a() : 0, c0165n.mo946a((c) kVar), c0165n.mo949b(kVar)));
    }
}
