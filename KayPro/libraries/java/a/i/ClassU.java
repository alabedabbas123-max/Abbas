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
import com.baidu.mobstat.Config;
import java.io.PrintStream;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.f.ClassI;

public class ClassU extends w implements i, aq, s {

    private final ClassN f1317a;

    private final boolean f1318b;

    private final PrintStream f1319c;

    private String f1320d;

    public ClassU(ClassN c0486n, boolean z, PrintStream printStream) {
        this.f1317a = c0486n;
        this.f1318b = z;
        this.f1319c = printStream;
    }

    private void m3110a() {
        if (this.f1320d != null) {
            this.f1319c.println(ClassI.m764c(this.f1320d) + Config.TRACE_TODAY_VISIT_SPLIT);
            this.f1320d = null;
        }
    }

    public void m3111a(c cVar, a aVar) {
    }

    public void m3112a(c cVar, Interfacej interfaceC0162j, d dVar) {
        dVar.b(cVar, interfaceC0162j, this);
    }

    public void m3113a(c cVar, Interfacej interfaceC0162j, d dVar, n nVar) {
        this.f1319c.print(nVar.a() + Config.TRACE_TODAY_VISIT_SPLIT + nVar.b() + Config.TRACE_TODAY_VISIT_SPLIT);
    }

    public void m3114a(k kVar) {
        if (!this.f1317a.mo3074c(kVar)) {
            if (this.f1318b) {
                this.f1319c.println(ClassI.m764c(kVar.b()));
            }
        } else {
            if (!this.f1318b) {
                this.f1319c.println(ClassI.m764c(kVar.b()));
                return;
            }
            this.f1320d = kVar.b();
            kVar.a(this);
            kVar.b(this);
            this.f1320d = null;
        }
    }

    public void m3115a(k kVar, ClassL c0163l) {
        if (this.f1317a.mo3074c(c0163l) ^ this.f1318b) {
            m3110a();
            this.f1319c.println("    " + ClassI.m749a(c0163l.mo945a(), c0163l.mo946a((c) kVar), c0163l.mo949b(kVar)));
        }
    }

    public void m3116a(k kVar, ClassN c0165n) {
        if (this.f1317a.mo3074c(c0165n) ^ this.f1318b) {
            m3110a();
            this.f1319c.print("    ");
            c0165n.mo1267a(kVar, (i) this);
            this.f1319c.println(ClassI.m751a(kVar.b(), c0165n.mo945a(), c0165n.mo946a((c) kVar), c0165n.mo949b(kVar)));
        }
    }
}
