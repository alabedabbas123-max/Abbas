package a;

import a.b.b;
import java.io.IOException;
import a.b.f.ClassZ;
import a.b.g.ClassM;
import a.b.g.ClassO;
import a.e.ClassC;
import a.e.ClassF;
import a.e.ClassQ;
import a.e.Interfacem;
import a.j.ClassL;

public class ClassY {

    private static final boolean f1378a;

    private final ClassH f1379b;

    static {
        f1378a = System.getProperty("favor.library.classes") != null;
    }

    public ClassY(ClassH c0467h) {
        this.f1379b = c0467h;
    }

    private void m3279a(String str, ClassD c0173d, Interfacem interfaceC0273m) throws IOException {
        m3282a(str, c0173d, 0, c0173d.m1295b(), interfaceC0273m);
    }

    private void m3280a(String str, ClassE c0243e, Interfacem interfaceC0273m) throws IOException {
        try {
            new ClassQ(c0243e.m1690b()).m1759a(ClassM.m3243a(str, c0243e, interfaceC0273m));
        } catch (IOException e) {
            throw ((IOException) new IOException("Can't read [" + c0243e + "] (" + e.getMessage() + ")").initCause(e));
        }
    }

    public void m3281a(b bVar, b bVar2) throws IOException {
        ClassZ c0094z = new ClassZ(this.f1379b.f1224T);
        ClassZ c0094z2 = new ClassZ(this.f1379b.f1223S);
        ClassP c0525p = new ClassP(c0094z2);
        if (f1378a && this.f1379b.f1231c != null) {
            m3279a("Reading library ", this.f1379b.f1231c, new ClassC(new ClassF(true, this.f1379b.f1232d, this.f1379b.f1233e, c0094z, new ClassO(bVar2, c0525p, new ClassM(bVar2)))));
        }
        m3279a("Reading program ", this.f1379b.f1230b, new ClassC(new ClassF(false, this.f1379b.f1232d, this.f1379b.f1233e, c0094z, new ClassO(bVar, c0525p, new ClassO(bVar2, c0525p, new ClassM(bVar))))));
        if (bVar.c() == 0) {
            throw new IOException("The input doesn't contain any classes. Did you specify the proper '-injars' options?");
        }
        if (!f1378a && this.f1379b.f1231c != null) {
            m3279a("Reading library ", this.f1379b.f1231c, new ClassC(new ClassF(true, this.f1379b.f1232d, this.f1379b.f1233e, c0094z, new ClassO(bVar, c0525p, new ClassO(bVar2, c0525p, new ClassM(bVar2))))));
        }
        int iM940a = c0094z2.m940a();
        if (iM940a > 0) {
            ClassL.m3161a("Note: there were " + iM940a + " duplicate class definitions.");
            ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#duplicateclass)");
        }
        int iM940a2 = c0094z.m940a();
        if (iM940a2 > 0) {
            ClassL.m3161a("Warning: there were " + iM940a2 + " classes in incorrectly named files.");
            ClassL.m3161a("         You should make sure all file names correspond to their class names.");
            ClassL.m3161a("         The directory hierarchies must correspond to the package hierarchies.");
            ClassL.m3161a("         (http://proguard.sourceforge.net/manual/troubleshooting.html#unexpectedclass)");
            if (this.f1379b.f1225U) {
                return;
            }
            ClassL.m3161a("         If you don't mind the mentioned classes not being written out,");
            ClassL.m3161a("         you could try your luck using the '-ignorewarnings' option.");
            throw new IOException("Please correct the above warnings first.");
        }
    }

    public void m3282a(String str, ClassD c0173d, int i, int i2, Interfacem interfaceC0273m) throws IOException {
        while (i < i2) {
            ClassE c0243eM1292a = c0173d.m1292a(i);
            if (!c0243eM1292a.m1693c()) {
                m3280a(str, c0243eM1292a, interfaceC0273m);
            }
            i++;
        }
    }
}
