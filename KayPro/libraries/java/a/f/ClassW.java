package a.f;

import a.ab;
import a.b.a.d.a;
import a.b.a.d.d;
import a.b.a.d.g;
import a.b.a.d.i;
import a.b.a.d.t;
import a.b.a.d.v;
import a.b.b;
import a.b.b.a.e;
import a.b.c.ag;
import a.b.c.ao;
import a.b.g.s;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttBootstrapMethods;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import a.ClassH;
import a.b.c.bg;
import a.b.c.ClassQ;
import a.b.c.ClassT;
import a.b.f.ClassU;
import a.b.f.ClassZ;
import a.b.g.ab;
import a.b.g.ag;
import a.b.g.at;
import a.b.g.bi;
import a.b.g.ClassC;
import a.b.g.ClassD;
import a.b.g.ClassE;
import a.b.g.ClassF;
import a.b.g.ClassG;
import a.b.g.ClassJ;
import a.b.g.ClassQ;
import a.b.g.ClassV;
import a.b.g.Interfacen;
import a.j.ClassL;

public class ClassW {

    private final ClassH f727a;

    public ClassW(ClassH c0467h) {
        this.f727a = c0467h;
    }

    public void m1873a(b bVar, b bVar2) throws IOException {
        if (this.f727a.f1237i == null && this.f727a.f1253y == null && this.f727a.f1252x == null) {
            throw new IOException("You have to specify '-keep' options for the obfuscation step.");
        }
        bVar.a(new ClassG());
        bVar2.a(new ClassG());
        s c0137c = this.f727a.f1208D ? new ClassC(new ClassU()) : new ClassE(new ClassU());
        bVar.a(c0137c);
        bVar2.a(c0137c);
        ClassU c0311u = new ClassU();
        Interfacen interfaceC0148nA = new ab(false, false, true).a(this.f727a.f1237i, c0311u, c0311u, c0311u, (i) null);
        bVar.a(interfaceC0148nA);
        bVar2.a(interfaceC0148nA);
        bVar2.a(c0311u);
        bVar2.a(new ClassC(c0311u));
        bVar.a(new ClassQ(3342336, new a(new g(AttBootstrapMethods.ATTRIBUTE_NAME, new a.b.a.d.b(new a.b.b.a.a(new e(7, new bi(new ab(new ClassJ(true, false, true, false, new ClassD(new ag(1024, 0, c0311u))))))))))));
        bVar.a(new ClassQ(3342336, new a.b.b.a.b(new ClassV(new ab(new ClassJ(true, false, true, false, new ClassD(new ag(1024, 0, c0311u))))))));
        t tVar = new t(new ClassB());
        bVar.a(new a(true, new v(tVar, this.f727a.f1213I == null ? null : new g(this.f727a.f1213I, tVar))));
        if (this.f727a.f1214J) {
            bVar.a(new ClassD(new ClassO(new a(true, new ClassX(tVar)))));
        }
        bVar.a(new ClassA());
        if (this.f727a.f1253y != null) {
            ClassZ c0094z = new ClassZ(this.f727a.f1224T);
            new ClassL(this.f727a.f1253y).m1833a(new ClassS(new Interfacek[]{new ClassI(bVar, c0094z), new ClassI(bVar2, null)}));
            int iM940a = c0094z.m940a();
            if (iM940a > 0) {
                ClassL.m3161a("Warning: there were " + iM940a + " kept classes and class members that were remapped anyway.");
                ClassL.m3161a("         You should adapt your configuration or edit the mapping file.");
                if (!this.f727a.f1225U) {
                    ClassL.m3161a("         If you are sure this remapping won't hurt, you could try your luck");
                    ClassL.m3161a("         using the '-ignorewarnings' option.");
                }
                ClassL.m3161a("         (http://proguard.sourceforge.net/manual/troubleshooting.html#mappingconflict1)");
                if (!this.f727a.f1225U) {
                    throw new IOException("Please correct the above warnings first.");
                }
            }
        }
        bVar.a(new ClassC(bVar, bVar2, this.f727a.f1205A != null ? new ClassG(this.f727a.f1205A, (Interfacet) null) : null, this.f727a.f1206B != null ? new ClassG(this.f727a.f1206B, (Interfacet) null) : null, this.f727a.f1209E, this.f727a.f1210F, this.f727a.f1211G, this.f727a.f1212H, this.f727a.f1249u));
        aa c0288aa = new aa();
        Interfacet c0297g = this.f727a.f1254z != null ? new ClassG(this.f727a.f1254z, c0288aa) : c0288aa;
        ClassZ c0094z2 = new ClassZ(this.f727a.f1224T);
        HashMap map = new HashMap();
        if (this.f727a.f1208D) {
            bVar.a(new ClassC(new ClassM(this.f727a.f1207C, map)));
            bVar.a(new ClassC(new ClassP(this.f727a.f1207C, c0297g, map)));
        } else {
            bVar.a(new at(new ClassJ(true, false, false, true, new ClassC(new ag(2, 0, new ClassM(this.f727a.f1207C, map)))), new ClassJ(true, true, true, true, new ClassC(new ag(0, 2, new ClassM(this.f727a.f1207C, map)))), new ClassC(new ag(0, 2, new ClassP(this.f727a.f1207C, c0297g, map))), new ClassH(map)));
            bVar.a(new at(new ClassC(new ClassM(this.f727a.f1207C, map)), new ClassJ(false, true, true, false, new ClassC(new ag(0, 2, new ClassM(this.f727a.f1207C, map)))), new ClassJ(false, false, false, true, new ClassF(1024, 0, new ClassJ(false, false, true, false, new ClassC(new ClassM(this.f727a.f1207C, map))))), new ClassJ(false, false, false, true, new ClassJ(false, false, true, false, new ClassD(new ag(0, 1032, new ClassM(this.f727a.f1207C, map))))), new ClassC(new ag(2, 0, new ClassP(this.f727a.f1207C, c0297g, map))), new ClassH(map)));
        }
        ac c0290ac = new ac(new aa());
        HashMap map2 = new HashMap();
        bVar.a(new ClassC(new ClassR(new ClassM(this.f727a.f1207C, map2))));
        bVar2.a(new ClassC(new ClassR(new ClassM(this.f727a.f1207C, map2))));
        bVar.a(new at(new ClassJ(true, false, false, true, new ClassC(new ag(2, 0, new ClassM(this.f727a.f1207C, map)))), new ClassJ(true, true, true, false, new ClassC(new ag(0, 2, new ClassM(this.f727a.f1207C, map)))), new ClassJ(true, true, true, false, new ClassC(new ag(0, 2, new ClassN(this.f727a.f1207C, map, c0094z2, new ClassP(this.f727a.f1207C, c0290ac, map2))))), new ClassH(map)));
        bVar.a(new at(new ClassC(new ClassM(this.f727a.f1207C, map)), new ClassJ(false, true, true, false, new ClassC(new ag(0, 2, new ClassM(this.f727a.f1207C, map)))), new ClassC(new ag(2, 0, new ClassN(this.f727a.f1207C, map, c0094z2, new ClassP(this.f727a.f1207C, c0290ac, map2)))), new ClassH(map)));
        int iM940a2 = c0094z2.m940a();
        if (iM940a2 > 0) {
            ClassL.m3161a("Warning: there were " + iM940a2 + " conflicting class member name mappings.");
            ClassL.m3161a("         Your configuration may be inconsistent.");
            if (!this.f727a.f1225U) {
                ClassL.m3161a("         If you are sure the conflicts are harmless,");
                ClassL.m3161a("         you could try your luck using the '-ignorewarnings' option.");
            }
            ClassL.m3161a("         (http://proguard.sourceforge.net/manual/troubleshooting.html#mappingconflict2)");
            if (!this.f727a.f1225U) {
                throw new IOException("Please correct the above warnings first.");
            }
        }
        if (this.f727a.f1252x != null) {
            PrintStream printStream = this.f727a.f1252x == ClassH.f1204a ? System.out : new PrintStream(new BufferedOutputStream(new FileOutputStream(this.f727a.f1252x)));
            bVar.b(new ClassJ(printStream));
            if (printStream == System.out) {
                printStream.flush();
            } else {
                printStream.close();
            }
        }
        if (this.f727a.f1228X) {
            bVar.a(new ClassZ());
        }
        bVar.a(new ClassF());
        bVar2.a(new ClassF());
        bVar.a(new ClassT(false));
        bVar2.a(new ClassT(false));
        bVar.a(new bg());
        if (this.f727a.f1212H != null && this.f727a.f1249u) {
            bVar.a(new a.b.c.a());
            bVar.a(new a(new d(new ao())));
        }
        bVar.a(new ClassD(new ClassQ()));
        if (this.f727a.f1215K != null) {
            bVar.a(new ab(this.f727a.f1215K));
        }
        bVar.a(new ag());
    }
}
