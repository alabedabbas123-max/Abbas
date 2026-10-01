package a.e;

import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;
import a.j.ClassN;

public class ClassS implements Interfaceo {

    private final ClassN f657a;

    private final Set f658b;

    private final Interfaceo f659c;

    private final Interfaceo f660d;

    private final String f661e;

    public ClassS(ClassN c0509n, Interfaceo interfaceC0275o, Interfaceo interfaceC0275o2, String str) {
        this.f658b = new HashSet();
        this.f657a = c0509n;
        this.f659c = interfaceC0275o;
        this.f660d = interfaceC0275o2;
        this.f661e = str;
    }

    public ClassS(String str, Interfaceo interfaceC0275o, Interfaceo interfaceC0275o2) {
        this(new ClassN(), interfaceC0275o, interfaceC0275o2, null);
        this.f657a.m3166a((Object) null, str);
    }

    private void m1761a(Interfaceg interfaceC0267g, String str) {
        Set<String> setM3165a = this.f657a.m3165a(str);
        if (setM3165a != null) {
            for (String str2 : setM3165a) {
                if (!this.f658b.contains(str2)) {
                    ah c0252ah = new ah(interfaceC0267g, this.f661e != null ? str2 + this.f661e : str2);
                    this.f660d.mo1718b(c0252ah);
                    this.f658b.add(str2);
                    m1762c(c0252ah);
                }
            }
        }
    }

    private void m1762c(Interfaceg interfaceC0267g) {
        String strMo1721a = interfaceC0267g.mo1721a();
        if (this.f661e != null && strMo1721a.endsWith(this.f661e)) {
            strMo1721a = strMo1721a.substring(0, strMo1721a.length() - this.f661e.length());
        }
        m1761a(interfaceC0267g, strMo1721a);
    }

    @Override
    public void mo1715a() {
        this.f659c.mo1715a();
    }

    @Override
    public boolean mo1716a(Interfaceg interfaceC0267g) {
        return this.f659c.mo1716a(interfaceC0267g);
    }

    @Override
    public boolean mo1717a(Interfaceg interfaceC0267g, Interfaceg interfaceC0267g2) {
        return this.f659c.mo1717a(interfaceC0267g, interfaceC0267g2);
    }

    @Override
    public OutputStream mo1718b(Interfaceg interfaceC0267g) {
        m1761a(interfaceC0267g, (String) null);
        m1762c(interfaceC0267g);
        return this.f659c.mo1718b(interfaceC0267g);
    }
}
