package a.i;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.d.m;
import a.b.a.k;
import a.b.a.l;
import a.b.b.a.f;
import a.b.c;
import a.b.f.w;
import a.b.g.s;
import a.b.o;
import a.b.ClassE;

public class ClassE extends w implements i, m, f, s {

    private final ClassN f1280a;

    private boolean f1281b;

    private boolean f1282c;

    public ClassE(ClassN c0486n) {
        this.f1280a = c0486n;
    }

    private void m2979a(c cVar, int i) {
        cVar.a(i, this);
    }

    public void m2980a(c cVar, a aVar) {
    }

    public void m2981a(c cVar, k kVar) {
        this.f1281b = false;
        kVar.a(cVar, this);
        if (this.f1281b) {
            this.f1280a.mo3068a((o) kVar);
            m2979a(cVar, kVar.a);
        }
    }

    public void m2982a(c cVar, l lVar) {
        boolean zMo3074c = this.f1280a.mo3074c(lVar);
        if (!zMo3074c) {
            this.f1282c = true;
            lVar.a(cVar, this);
            boolean z = this.f1282c;
            this.f1282c = true;
            lVar.b(cVar, this);
            zMo3074c = z & this.f1282c;
            if (zMo3074c) {
                this.f1280a.mo3068a((o) lVar);
                lVar.c(cVar, this);
            }
        }
        this.f1281b = zMo3074c | this.f1281b;
    }

    public void m2983a(c cVar, a.b.b.a aVar) {
        this.f1282c = this.f1280a.mo3074c(aVar);
        if (this.f1282c) {
            return;
        }
        this.f1282c = true;
        aVar.a(this);
        if (this.f1282c) {
            this.f1280a.mo3068a((o) aVar);
            m2979a(cVar, aVar.a);
        }
    }

    public void m2984a(c cVar, a.b.b.s sVar) {
        this.f1280a.mo3068a((o) sVar);
    }

    public void m2985a(ClassE c0057e) {
        this.f1282c = true;
    }

    public void m2986a(a.b.k kVar) {
        this.f1282c = this.f1280a.mo3074c(kVar);
    }
}
