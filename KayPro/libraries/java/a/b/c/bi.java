package a.b.c;

import a.b.a.a;
import a.b.a.d.i;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.q;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.f.ClassI;

public class bi extends w implements i, f, d {

    private final ClassV f7a = new ClassV();

    private c f8b;

    private c f9c;

    private Interfacei f10d;

    public void m27a(c cVar, a aVar) {
    }

    public void m28a(c cVar, a.b.b.a aVar) {
        this.f8b = aVar.b;
    }

    public void m29a(c cVar, b bVar) {
    }

    public void m30a(c cVar, q qVar) {
        if (ClassI.m773f(qVar.a(cVar))) {
            this.f8b = qVar.c;
        } else {
            cVar.a(qVar.a, this);
        }
        this.f9c = qVar.c;
        this.f10d = qVar.e;
    }

    public void m31a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f7a.m277a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this);
        this.f7a.m284a(cVar, interfaceC0162j, dVar);
    }

    public void m32a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        int i2 = c0047b.f139a;
        this.f10d = null;
        cVar.a(i2, this);
        if (this.f8b == null || this.f10d == null) {
            return;
        }
        byte b = c0047b.f147c;
        if ((this.f10d.mo945a() & 8) != 0) {
            if (b != -72) {
                this.f7a.m311b(i, new ClassB((byte) -72, i2));
                return;
            }
            return;
        }
        if ((this.f10d.mo945a() & 2) != 0 || this.f10d.mo946a(this.f9c).equals("<init>")) {
            if (b != -73) {
                this.f7a.m311b(i, new ClassB((byte) -73, i2));
                return;
            }
            return;
        }
        if ((this.f8b.a() & 512) == 0) {
            if (b != -74) {
                if (b == -73 && !cVar.equals(this.f8b) && cVar.b(this.f8b)) {
                    return;
                }
                this.f7a.m311b(i, new ClassB((byte) -74, i2));
                return;
            }
            return;
        }
        int iM758b = ClassI.m758b(this.f10d.mo949b(this.f9c), false) << 8;
        if (b == -73 && (this.f10d.mo945a() & 1024) == 0) {
            return;
        }
        if (b == -71 && c0047b.f140b == iM758b) {
            return;
        }
        this.f7a.m311b(i, new ClassB((byte) -71, i2, iM758b));
    }

    public void m33a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }
}
