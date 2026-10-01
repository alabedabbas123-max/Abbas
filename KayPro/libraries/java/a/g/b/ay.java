package a.g.b;

import a.b.a.a;
import a.b.a.d.i;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import java.util.Arrays;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassK;

public class ay extends w implements i, d {

    private boolean[] f969a = new boolean[64];

    public void m2486a(c cVar, a aVar) {
    }

    public void m2487a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        int i = dVar.d;
        if (this.f969a.length < i) {
            this.f969a = new boolean[i];
        } else {
            Arrays.fill(this.f969a, 0, i, false);
        }
        dVar.a(cVar, interfaceC0162j, this);
    }

    public void m2488a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2489a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        this.f969a[c0056k.f156b] = true;
        if (c0056k.mo349a(cVar) == 2 || c0056k.mo367b(cVar) == 2) {
            this.f969a[c0056k.f156b + 1] = true;
        }
    }

    public boolean m2490a(int i) {
        return this.f969a[i];
    }
}
