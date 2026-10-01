package a.g;

import a.b.a.d.a;
import a.b.a.d.k;
import a.b.b;
import a.b.d.a.d;
import a.b.g.s;
import java.util.List;
import a.b.c.ClassV;
import a.b.d.a.ClassC;
import a.b.d.a.ClassE;
import a.b.g.ClassD;
import a.b.g.Interfacebb;
import a.g.b.ClassZ;
import a.g.c.ClassA;
import a.g.c.ClassJ;
import a.g.c.ClassV;

class ClassT implements Interfacebb {

    final b f1177a;

    final b f1178b;

    final ClassC f1179c;

    final ClassC f1180d;

    final ClassC f1181e;

    final ClassC f1182f;

    final ClassC f1183g;

    final ClassC f1184h;

    final ClassC f1185i;

    final ClassC f1186j;

    final ClassC f1187k;

    final ClassM f1188l;

    ClassT(ClassM c0453m, b bVar, b bVar2, ClassC c0045c, ClassC c0045c2, ClassC c0045c3, ClassC c0045c4, ClassC c0045c5, ClassC c0045c6, ClassC c0045c7, ClassC c0045c8, ClassC c0045c9) {
        this.f1188l = c0453m;
        this.f1177a = bVar;
        this.f1178b = bVar2;
        this.f1179c = c0045c;
        this.f1180d = c0045c2;
        this.f1181e = c0045c3;
        this.f1182f = c0045c4;
        this.f1183g = c0045c5;
        this.f1184h = c0045c6;
        this.f1185i = c0045c7;
        this.f1186j = c0045c8;
        this.f1187k = c0045c9;
    }

    @Override
    public s mo1026a() {
        ClassA c0409a = new ClassA();
        ClassV c0036v = new ClassV();
        List listM2892a = this.f1188l.m2892a(new ClassJ(this.f1177a, this.f1178b), c0409a, c0036v, this.f1179c, this.f1180d, this.f1181e, this.f1182f, this.f1183g, this.f1184h, this.f1185i, this.f1186j, this.f1187k);
        d[] dVarArr = new d[listM2892a.size()];
        listM2892a.toArray(dVarArr);
        return new ClassD(new a(new k("Peephole optimizations", new ClassZ(new ClassV(c0409a, c0036v, new ClassE(dVarArr))))));
    }
}
