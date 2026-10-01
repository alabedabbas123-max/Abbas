package a.e;

import a.b.g.s;
import a.b.k;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import a.b.ClassE;
import a.b.e.ClassA;
import a.b.e.ClassB;
import a.b.f.ClassI;
import a.b.f.ClassZ;

public class ClassF implements Interfacem {

    private final boolean f643a;

    private final boolean f644b;

    private final boolean f645c;

    private final ClassZ f646d;

    private final s f647e;

    public ClassF(boolean z, boolean z2, boolean z3, ClassZ c0094z, s sVar) {
        this.f643a = z;
        this.f644b = z2;
        this.f645c = z3;
        this.f646d = c0094z;
        this.f647e = sVar;
    }

    @Override
    public void mo1720a(Interfaceg interfaceC0267g) throws IOException {
        ClassE kVar;
        try {
            DataInputStream dataInputStream = new DataInputStream(interfaceC0267g.mo1724c());
            if (this.f643a) {
                kVar = new ClassE();
                kVar.a(new ClassA(dataInputStream, this.f644b, this.f645c));
            } else {
                kVar = new k();
                kVar.a(new ClassB(dataInputStream));
            }
            String strB = kVar.b();
            if (strB != null) {
                String strMo1721a = interfaceC0267g.mo1721a();
                if (!strMo1721a.equals("module-info.class") && !strMo1721a.replace(File.pathSeparatorChar, '/').equals(strB + ".class") && this.f646d != null) {
                    this.f646d.m941a(strB, "Warning: class [" + interfaceC0267g.mo1721a() + "] unexpectedly contains class [" + ClassI.m764c(strB) + "]");
                }
                kVar.a(this.f647e);
            }
            interfaceC0267g.mo1725d();
        } catch (Exception e) {
            throw ((IOException) new IOException("Can't process class [" + interfaceC0267g.mo1721a() + "] (" + e.getMessage() + ")").initCause(e));
        }
    }
}
