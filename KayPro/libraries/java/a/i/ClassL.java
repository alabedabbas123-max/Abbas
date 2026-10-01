package a.i;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.a.n;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.o;
import com.baidu.mobstat.Config;
import java.io.PrintStream;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.f.ClassI;

public class ClassL extends w implements i, aq, s {

    private final ClassI f1300a;

    private final boolean f1301b;

    private final PrintStream f1302c;

    public ClassL(ClassI c0481i, boolean z) {
        this(c0481i, z, System.out);
    }

    public ClassL(ClassI c0481i, boolean z, PrintStream printStream) {
        this.f1300a = c0481i;
        this.f1301b = z;
        this.f1302c = printStream;
    }

    private void m3086a(o oVar) {
        if (!this.f1300a.mo3074c(oVar)) {
            this.f1302c.println("  is not being kept.\n");
            return;
        }
        ClassH c0480hM3078g = this.f1300a.m3078g(oVar);
        this.f1302c.print("  " + c0480hM3078g.m3005b());
        c0480hM3078g.m3001a((s) this);
        c0480hM3078g.m3000a((aq) this);
    }

    public void m3087a(c cVar, a aVar) {
    }

    public void m3088a(c cVar, Interfacej interfaceC0162j, d dVar) {
        dVar.b(cVar, interfaceC0162j, this);
    }

    public void m3089a(c cVar, Interfacej interfaceC0162j, d dVar, n nVar) {
        this.f1302c.print(" (" + nVar.a() + Config.TRACE_TODAY_VISIT_SPLIT + nVar.b() + ")");
    }

    public void m3090a(ClassE c0057e) {
        this.f1302c.println(ClassI.m764c(c0057e.m415b()));
        this.f1302c.println("  is a library class.\n");
    }

    public void m3091a(ClassE c0057e, ClassF c0069f) {
        String strA = c0069f.mo946a((c) c0057e);
        this.f1302c.println(ClassI.m764c(c0057e.m415b()) + (this.f1301b ? ": " + ClassI.m749a(0, strA, c0069f.mo949b(c0057e)) : "." + strA));
        this.f1302c.println("  is a library field.\n");
    }

    public void m3092a(ClassE c0057e, ClassH c0160h) {
        String strA = c0160h.mo946a((c) c0057e);
        this.f1302c.println(ClassI.m764c(c0057e.m415b()) + (this.f1301b ? ": " + ClassI.m751a(c0057e.m415b(), 0, strA, c0160h.mo949b(c0057e)) : "." + strA));
        this.f1302c.println("  is a library method.\n");
    }

    public void m3093a(k kVar) {
        this.f1302c.println(ClassI.m764c(kVar.b()));
        m3086a((o) kVar);
    }

    public void m3094a(k kVar, ClassL c0163l) {
        String strA = c0163l.mo946a((c) kVar);
        this.f1302c.println(ClassI.m764c(kVar.b()) + (this.f1301b ? ": " + ClassI.m749a(0, strA, c0163l.mo949b(kVar)) : "." + strA));
        m3086a(c0163l);
    }

    public void m3095a(k kVar, ClassN c0165n) {
        String strA = c0165n.mo946a((c) kVar);
        this.f1302c.print(ClassI.m764c(kVar.b()) + (this.f1301b ? ": " + ClassI.m751a(kVar.b(), 0, strA, c0165n.mo949b(kVar)) : "." + strA));
        c0165n.mo1267a(kVar, (i) this);
        this.f1302c.println();
        m3086a(c0165n);
    }
}
