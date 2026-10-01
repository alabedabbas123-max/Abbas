package a.c;

import a.b.a.d.a;
import a.b.b;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import java.io.IOException;
import a.ClassH;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.f.ClassF;
import a.b.f.ClassG;
import a.b.f.ClassI;
import a.b.g.at;
import a.b.g.ClassD;
import a.b.g.ClassK;
import a.b.g.ClassM;
import a.e.ClassE;
import a.e.ClassF;
import a.g.c.ClassA;
import a.g.c.ClassV;
import a.j.ClassN;

public class ClassC extends w implements d {

    private final ClassH f453a;

    private ClassN f454b;

    public ClassC(ClassH c0467h) {
        this.f453a = c0467h;
    }

    public void m1287a(b bVar, b bVar2, ClassN c0509n) {
        ClassF c0266f = new ClassF(false, false, false, null, new at(new ClassM(bVar), new ClassF(bVar, bVar2), new ClassG()));
        try {
            c0266f.mo1720a(new ClassE(ClassB.class));
            c0266f.mo1720a(new ClassE(Runnablea.class));
            ClassD c0170d = new ClassD(bVar, bVar2);
            ClassA c0409a = new ClassA();
            ClassV c0036v = new ClassV();
            this.f454b = c0509n;
            bVar.a(new ClassK("!proguard/**", new ClassD(new a(new ClassV(c0409a, c0036v, new ClassF(c0170d.f457b, c0170d.f456a, c0409a, c0036v, this))))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void m1288a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        this.f454b.m3166a(cVar.b(), ClassI.m760b(Runnablea.class.getName()));
        this.f454b.m3166a(cVar.b(), ClassI.m760b(ClassB.class.getName()));
    }
}
