package a.b.f;

import a.b.a.a;
import a.b.a.d.i;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.n;
import a.b.b.q;
import a.b.b.r;
import a.b.c;
import a.b.f.w;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;
import a.b.Interfacei;

public class ClassY extends w implements i, f, s {

    private String f309a;

    private String f310b;

    public void m930a(c cVar, a aVar) {
        this.f309a = aVar.a(cVar).intern();
        cVar.a(aVar.a, this);
    }

    public void m931a(c cVar, a.b.b.a aVar) {
        c cVar2 = aVar.b;
        if (cVar2 != null) {
            this.f309a = cVar2.b();
            cVar.a(aVar.a, this);
        }
    }

    public void m932a(c cVar, b bVar) {
    }

    public void m933a(c cVar, n nVar) {
        if (this.f309a != null) {
            cVar.a(nVar.a, this);
            this.f309a = this.f310b;
            cVar.a(nVar.b, this);
        }
    }

    public void m934a(c cVar, r rVar) {
        Interfacei interfaceC0161i = rVar.c;
        if (interfaceC0161i != null) {
            this.f309a = interfaceC0161i.mo946a(rVar.b);
            cVar.a(rVar.a, this);
        }
    }

    public void m935a(c cVar, a.b.b.s sVar) {
        if (this.f309a != null) {
            if (this.f309a.equals(sVar.c())) {
                sVar.a(this.f309a);
            }
            this.f309a = null;
        }
    }

    public void m936a(ClassE c0057e) {
        c cVar = c0057e.f164g;
        if (cVar != null) {
            c0057e.f160c = cVar.b();
        }
        if (c0057e.f161d != null) {
            String[] strArr = c0057e.f161d;
            c[] cVarArr = new c[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                c cVar2 = cVarArr[i];
                if (cVar2 != null) {
                    strArr[i] = cVar2.b();
                }
            }
        }
    }

    public void m937a(k kVar) {
        kVar.a(this);
        kVar.a(this);
    }

    public void m938b(c cVar, q qVar) {
        Interfacei interfaceC0161i = qVar.e;
        if (interfaceC0161i != null) {
            c cVar2 = qVar.c;
            this.f309a = interfaceC0161i.mo946a(cVar2);
            this.f310b = interfaceC0161i.mo949b(cVar2);
            cVar.a(qVar.b, this);
        }
    }
}
