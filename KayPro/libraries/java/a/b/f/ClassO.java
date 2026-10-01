package a.b.f;

import a.b.a.a.b.g;
import a.b.a.a.h;
import a.b.a.a.i;
import a.b.a.d.a;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.r;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.Interfaced;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.a.ClassA;

public class ClassO extends w implements g, f, d {

    private aq f274a = new a(new ClassA(this));

    private String f275b;

    private String f276c;

    private boolean f277d;

    private c f278e;

    private Interfaced f279f;

    public void m844a(c cVar, a.b.a.a.a aVar, h hVar) {
    }

    public void m845a(c cVar, a.b.a.a.a aVar, i iVar) {
        if (iVar.g == null || iVar.g.length <= 0) {
            return;
        }
        this.f278e = iVar.g[0];
        if (this.f278e != null) {
            this.f275b = iVar.a(cVar);
            this.f276c = iVar.c(cVar);
            this.f279f = null;
            this.f278e.a("<clinit>", "()V", this.f274a);
            if (this.f279f == null) {
                this.f279f = this.f278e.a(this.f276c, this.f275b);
            }
            iVar.h = this.f279f;
        }
    }

    public void m846a(c cVar, b bVar) {
    }

    public void m847a(c cVar, a.b.b.d dVar) {
        if (this.f277d) {
            if (this.f275b.equals(dVar.c(cVar))) {
                this.f279f = (Interfaced) dVar.e;
            }
            this.f277d = false;
        }
    }

    public void m848a(c cVar, r rVar) {
        this.f277d = this.f276c.equals(rVar.a(cVar));
    }

    public void m849a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -77:
            case 18:
            case 19:
                cVar.a(c0047b.f139a, this);
                break;
        }
    }

    public void m850a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }
}
