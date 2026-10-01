package a.i;

import a.ab;
import a.b.a.d.a;
import a.b.a.d.i;
import a.b.a.d.s;
import a.b.b;
import a.g;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import a.ClassH;
import a.b.g.at;
import a.b.g.ay;
import a.b.g.ClassG;
import a.b.g.ClassM;
import a.b.g.Interfacen;
import a.j.ClassL;

public class ClassM {

    private final ClassH f1303a;

    public ClassM(ClassH c0467h) {
        this.f1303a = c0467h;
    }

    public b m3096a(b bVar, b bVar2) throws IOException {
        if (this.f1303a.f1237i == null) {
            throw new IOException("You have to specify '-keep' options for the shrinking step.");
        }
        bVar.a(new ClassG());
        bVar2.a(new ClassG());
        ClassN c0486n = this.f1303a.f1241m == null ? new ClassN() : new ClassI();
        Interfacen interfaceC0148nA = new ab(true, false, false).a(this.f1303a.f1237i, new at(c0486n, new ay("<init>", "()V", c0486n)), c0486n, c0486n, c0486n);
        bVar.a(interfaceC0148nA);
        bVar2.a(interfaceC0148nA);
        bVar2.a(c0486n);
        bVar.a(new ClassF(c0486n));
        bVar.a(new ClassV(c0486n, new a(true, new s(new i[]{new ClassE(c0486n), new ClassA(c0486n), new ClassG(c0486n)}))));
        if (this.f1303a.f1241m != null) {
            ClassL.m3160a();
            ClassL c0484l = new ClassL((ClassI) c0486n, this.f1303a.f1222R);
            Interfacen interfaceC0148nA2 = new g().a(this.f1303a.f1241m, c0484l, c0484l, c0484l, (i) null);
            bVar.a(interfaceC0148nA2);
            bVar2.a(interfaceC0148nA2);
        }
        if (this.f1303a.f1240l != null) {
            PrintStream printStream = this.f1303a.f1240l == ClassH.f1204a ? System.out : new PrintStream(new BufferedOutputStream(new FileOutputStream(this.f1303a.f1240l)));
            bVar.b(new ClassU(c0486n, true, printStream));
            if (printStream == System.out) {
                printStream.flush();
            } else {
                printStream.close();
            }
        }
        int iC = bVar.c();
        b bVar3 = new b();
        bVar.a(new ClassV(c0486n, new at(new ClassB(c0486n), new ClassM(bVar3))));
        bVar.a();
        bVar2.a(new ClassB(c0486n));
        int iC2 = bVar3.c();
        if (this.f1303a.f1222R) {
            ClassL.m3161a("Removing unused program classes and class elements...");
            ClassL.m3161a("  Original number of program classes: " + iC);
            ClassL.m3161a("  Final number of program classes:    " + iC2);
        }
        if (iC2 == 0 && (this.f1303a.f1224T == null || !this.f1303a.f1224T.isEmpty())) {
            if (!this.f1303a.f1225U) {
                throw new IOException("The output jar is empty. Did you specify the proper '-keep' options?");
            }
            ClassL.m3161a("Warning: the output jar is empty. Did you specify the proper '-keep' options?");
        }
        return bVar3;
    }
}
