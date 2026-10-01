package a.b.f;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.c;
import a.b.f.w;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassE;

class ClassE extends w implements i {

    private final i f207a;

    public ClassE(i iVar) {
        this.f207a = iVar;
    }

    public void m699a(c cVar, a aVar) {
    }

    public void m700a(c cVar, Interfacej interfaceC0162j, d dVar) {
        boolean z = false;
        int iMo322a = 0;
        while (iMo322a < dVar.e) {
            Abstractc abstractC0048cM387a = ClassE.m387a(dVar.f, iMo322a);
            if (abstractC0048cM387a.f147c == -68) {
                z = true;
                break;
            }
            iMo322a += abstractC0048cM387a.mo322a(iMo322a);
        }
        if (z) {
            this.f207a.a(cVar, interfaceC0162j, dVar);
        }
    }
}
