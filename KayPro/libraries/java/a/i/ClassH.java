package a.i;

import a.b.c;
import a.b.g.aq;
import a.b.g.s;
import a.b.Interfacei;

final class ClassH {

    private final boolean f1289a;

    private final String f1290b;

    private final int f1291c;

    private c f1292d;

    private Interfacei f1293e;

    public ClassH(ClassH c0480h, String str, int i, c cVar) {
        this(c0480h, str, i, cVar, null);
    }

    public ClassH(ClassH c0480h, String str, int i, c cVar, Interfacei interfaceC0161i) {
        this.f1289a = true;
        this.f1290b = str;
        this.f1291c = c0480h.f1291c + i;
        this.f1292d = cVar;
        this.f1293e = interfaceC0161i;
    }

    public ClassH(ClassH c0480h, boolean z) {
        this.f1289a = z;
        this.f1290b = c0480h.f1290b;
        this.f1291c = c0480h.f1291c;
        this.f1292d = c0480h.f1292d;
        this.f1293e = c0480h.f1293e;
    }

    public ClassH(String str) {
        this.f1289a = true;
        this.f1290b = str;
        this.f1291c = 0;
    }

    public void m3000a(aq aqVar) {
        if (this.f1292d == null || this.f1293e == null) {
            return;
        }
        this.f1293e.mo947a(this.f1292d, aqVar);
    }

    public void m3001a(s sVar) {
        if (this.f1292d == null || this.f1293e != null) {
            return;
        }
        this.f1292d.a(sVar);
    }

    public boolean m3002a() {
        return this.f1289a;
    }

    public boolean m3003a(c cVar) {
        return cVar.equals(this.f1292d);
    }

    public boolean m3004a(ClassH c0480h) {
        return this.f1291c < c0480h.f1291c;
    }

    public String m3005b() {
        return this.f1290b;
    }

    public String toString() {
        return "certain=" + this.f1289a + ", depth=" + this.f1291c + ": " + this.f1290b + (this.f1292d != null ? this.f1292d.b() : "(none)") + ": " + (this.f1293e != null ? this.f1293e.mo946a(this.f1292d) : "(none)");
    }
}
