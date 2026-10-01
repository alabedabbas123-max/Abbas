package a.e;

import a.b.b;
import a.b.c;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import a.b.e.ClassC;

public class ClassB implements Interfaceo {

    private final b f635a;

    private final Interfaceo f636b;

    public ClassB(b bVar, Interfaceo interfaceC0275o) {
        this.f635a = bVar;
        this.f636b = interfaceC0275o;
    }

    @Override
    public void mo1715a() {
        this.f636b.mo1715a();
    }

    @Override
    public boolean mo1716a(Interfaceg interfaceC0267g) {
        return this.f636b.mo1716a(interfaceC0267g);
    }

    @Override
    public boolean mo1717a(Interfaceg interfaceC0267g, Interfaceg interfaceC0267g2) {
        return this.f636b.mo1717a(interfaceC0267g, interfaceC0267g2);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x009e */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OutputStream mo1718b(Interfaceg interfaceC0267g) {
        String strMo1721a = interfaceC0267g.mo1721a();
        if (!interfaceC0267g.mo1721a().endsWith(".class")) {
            return this.f636b.mo1718b(interfaceC0267g);
        }
        String strSubstring = strMo1721a.substring(0, strMo1721a.length() - ".class".length());
        c cVarA = this.f635a.a(strSubstring);
        if (cVarA != null) {
            String strB = cVarA.b();
            if (!strSubstring.equals(strB)) {
                interfaceC0267g = new ah(interfaceC0267g, strB + ".class");
            }
            OutputStream outputStreamMo1718b = this.f636b.mo1718b(interfaceC0267g);
            if (outputStreamMo1718b != null) {
                DataOutputStream dataOutputStream = new DataOutputStream(outputStreamMo1718b);
                try {
                    cVarA.a(new ClassC(dataOutputStream));
                    dataOutputStream.close();
                } catch (RuntimeException e) {
                    throw ((RuntimeException) new RuntimeException("Unexpected error while writing class [" + strSubstring + "] (" + e.getMessage() + ")").initCause(e));
                }
            }
        }
        return new FilterOutputStream(null);
    }
}
