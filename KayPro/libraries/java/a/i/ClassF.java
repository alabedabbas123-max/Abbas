package a.i;

import a.b.b.a;
import a.b.b.a.f;
import a.b.c;
import a.b.f.w;
import a.b.g.s;
import a.b.k;
import a.b.o;
import a.b.ClassE;

public class ClassF extends w implements f, s {

    private final ClassN f1283a;

    private boolean f1284b;

    private boolean f1285c;

    public ClassF(ClassN c0486n) {
        this.f1283a = c0486n;
    }

    public void m2987a(c cVar, a aVar) {
        boolean zMo3074c = this.f1283a.mo3074c(aVar);
        if (!zMo3074c) {
            aVar.a(this);
            zMo3074c = this.f1284b;
            if (zMo3074c) {
                this.f1283a.mo3068a((o) aVar);
                cVar.a(aVar.a, this);
            }
        }
        this.f1284b = zMo3074c;
        this.f1285c = zMo3074c | this.f1285c;
    }

    public void m2988a(c cVar, a.b.b.s sVar) {
        if (this.f1283a.mo3074c(sVar)) {
            return;
        }
        this.f1283a.mo3068a((o) sVar);
    }

    public void m2989a(ClassE c0057e) {
        this.f1284b = true;
        this.f1285c = true;
    }

    public void m2990a(k kVar) {
        boolean zMo3074c = this.f1283a.mo3074c(kVar);
        boolean zMo3077f = this.f1283a.mo3077f(kVar);
        if (zMo3074c || zMo3077f) {
            boolean z = this.f1285c;
            this.f1285c = false;
            kVar.c(this);
            zMo3074c |= this.f1285c;
            this.f1285c = z;
            if (zMo3077f) {
                if (zMo3074c) {
                    this.f1283a.mo3068a((o) kVar);
                    kVar.d(this);
                    kVar.b(this);
                } else {
                    this.f1283a.m3099h(kVar);
                }
            }
        }
        this.f1284b = zMo3074c;
    }
}
