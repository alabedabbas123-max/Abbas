package a.b.c;

import a.b.a.a;
import a.b.a.b;
import a.b.a.d.i;
import a.b.a.d.j;
import a.b.c;
import a.b.c.ag;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import a.b.o;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttBootstrapMethods;
import java.util.Arrays;
import a.b.ClassE;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.g.ClassG;

public class ClassO extends w implements i, j, d, aq, s {

    private static final Object f75a = new Object();

    private int[] f76b = new int[16];

    private final ClassL f77c = new ClassL(true);

    private int f78d = -1;

    private boolean f79e = false;

    private int m160a(b[] bVarArr, int i) {
        int i2;
        if (this.f76b.length < i) {
            this.f76b = new int[i];
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            b bVar = bVarArr[i3];
            if (m162a((o) bVar)) {
                this.f76b[i3] = i4;
                i2 = i4 + 1;
                bVarArr[i4] = bVar;
            } else {
                this.f76b[i3] = -1;
                i2 = i4;
            }
            i3++;
            i4 = i2;
        }
        Arrays.fill(bVarArr, i4, i, (Object) null);
        return i4;
    }

    private void m161a(b bVar) {
        bVar.a(f75a);
    }

    private boolean m162a(o oVar) {
        return oVar.f() == f75a;
    }

    public void m163a(c cVar, a aVar) {
    }

    public void m164a(c cVar, b bVar) {
        m161a(bVar);
    }

    public void m165a(c cVar, a.b.a.c cVar2) {
        if (this.f78d > -1) {
            cVar2.a(cVar, this.f78d, this);
            return;
        }
        int iM160a = m160a(cVar2.d, cVar2.c);
        if (iM160a < cVar2.c) {
            this.f79e = true;
            cVar2.c = iM160a;
            if (cVar2.c != 0) {
                this.f77c.m156a(this.f76b);
                cVar.a(this.f77c);
            } else {
                ClassJ c0024j = new ClassJ((k) cVar, false);
                c0024j.m150b(AttBootstrapMethods.ATTRIBUTE_NAME);
                cVar.a(new ClassP(this, c0024j));
            }
        }
    }

    public void m166a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        dVar.a(cVar, interfaceC0162j, this);
    }

    public void m167a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        if (c0047b.f147c == -70) {
            k kVar = (k) cVar;
            this.f78d = kVar.l(c0047b.f139a).b();
            kVar.a(this);
            this.f78d = -1;
        }
    }

    public void m168a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m169a(ClassE c0057e) {
    }

    public void m170a(k kVar) {
        this.f79e = false;
        this.f76b = new int[16];
        kVar.a(new ClassG());
        kVar.b(this);
        kVar.a(this);
        if (this.f79e) {
            kVar.a(new ag());
        }
    }

    public void m171a(k kVar, ClassN c0165n) {
        c0165n.mo1267a(kVar, (i) this);
    }
}
