package a.g.a;

import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.b.d.ClassK;

class ClassP extends w implements d {

    final ClassJ f827a;

    private ClassP(ClassJ c0337j) {
        this.f827a = c0337j;
    }

    public void m2156a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        if (c0042a.f147c == -88 || c0042a.f147c == -55) {
            this.f827a.m2107f(i, 0);
        } else {
            this.f827a.m2087a(cVar, i, c0042a);
        }
    }

    public void m2157a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        this.f827a.m2087a(cVar, i, c0047b);
    }

    public void m2158a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        this.f827a.m2087a(cVar, i, abstractC0048c);
    }

    public void m2159a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        switch (c0053h.f147c) {
            case 89:
                this.f827a.m2102c(i, 0, 0);
                this.f827a.m2102c(i, 1, 0);
                break;
            case 90:
                this.f827a.m2102c(i, 0, 0);
                this.f827a.m2102c(i, 1, 1);
                this.f827a.m2102c(i, 2, 0);
                break;
            case 91:
                this.f827a.m2102c(i, 0, 0);
                this.f827a.m2102c(i, 1, 1);
                this.f827a.m2102c(i, 2, 2);
                this.f827a.m2102c(i, 3, 0);
                break;
            case 92:
                this.f827a.m2102c(i, 0, 0);
                this.f827a.m2102c(i, 1, 1);
                this.f827a.m2102c(i, 2, 0);
                this.f827a.m2102c(i, 3, 1);
                break;
            case 93:
                this.f827a.m2102c(i, 0, 0);
                this.f827a.m2102c(i, 1, 1);
                this.f827a.m2102c(i, 2, 2);
                this.f827a.m2102c(i, 3, 0);
                this.f827a.m2102c(i, 4, 1);
                break;
            case 94:
                this.f827a.m2102c(i, 0, 0);
                this.f827a.m2102c(i, 1, 1);
                this.f827a.m2102c(i, 2, 2);
                this.f827a.m2102c(i, 3, 3);
                this.f827a.m2102c(i, 4, 0);
                this.f827a.m2102c(i, 5, 1);
                break;
            case 95:
                this.f827a.m2102c(i, 0, 1);
                this.f827a.m2102c(i, 1, 0);
                break;
            default:
                this.f827a.m2087a(cVar, i, c0053h);
                break;
        }
    }

    public void m2160a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        if (c0056k.m398g()) {
            this.f827a.m2105d(i, c0056k.f156b);
        } else {
            this.f827a.m2087a(cVar, i, c0056k);
        }
    }
}
