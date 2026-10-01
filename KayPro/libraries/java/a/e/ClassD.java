package a.e;

import a.b.b;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacei;
import a.b.f.ClassI;

public class ClassD extends w implements aq, Interfaceo {

    private final b f637a;

    private final Interfaceo f638b;

    private boolean f639c = false;

    private boolean f640d = false;

    public ClassD(b bVar, Interfaceo interfaceC0275o) {
        this.f637a = bVar;
        this.f638b = interfaceC0275o;
    }

    private void m1748a(PrintWriter printWriter, b bVar) {
        Iterator itB = bVar.b();
        while (itB.hasNext()) {
            String str = (String) itB.next();
            StringBuilder sb = new StringBuilder();
            sb.append(ClassI.m764c(str));
            sb.append(",");
            k kVar = (k) bVar.a(str);
            sb.append(ClassI.m764c(kVar.b()));
            sb.append(",");
            sb.append((((kVar.d & 131072) != 0) || m1749b(kVar)) ? 1 : 0);
            sb.append(",");
            sb.append((((kVar.d & 262144) != 0) || m1750c(kVar)) ? 1 : 0);
            printWriter.println(sb.toString());
        }
    }

    private boolean m1749b(k kVar) {
        this.f639c = false;
        kVar.b(this);
        return this.f639c;
    }

    private boolean m1750c(k kVar) {
        this.f640d = false;
        kVar.a(this);
        return this.f640d;
    }

    @Override
    public void mo1715a() {
        this.f638b.mo1715a();
    }

    public void m1751a(c cVar, Interfacei interfaceC0161i) {
    }

    public void m1752a(k kVar, ClassL c0163l) {
        this.f640d = ((c0163l.mo945a() & 65536) != 0) | this.f640d;
    }

    public void m1753a(k kVar, ClassN c0165n) {
        this.f639c = ((c0165n.mo945a() & 65536) != 0) | this.f639c;
    }

    @Override
    public boolean mo1716a(Interfaceg interfaceC0267g) {
        return this.f638b.mo1716a(interfaceC0267g);
    }

    @Override
    public boolean mo1717a(Interfaceg interfaceC0267g, Interfaceg interfaceC0267g2) {
        return this.f638b.mo1717a(interfaceC0267g, interfaceC0267g2);
    }

    @Override
    public OutputStream mo1718b(Interfaceg interfaceC0267g) {
        OutputStream outputStreamMo1718b = this.f638b.mo1718b(interfaceC0267g);
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStreamMo1718b));
        m1748a(printWriter, this.f637a);
        printWriter.close();
        return outputStreamMo1718b;
    }
}
