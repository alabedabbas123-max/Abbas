package a.b.f;

import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.o;
import java.util.HashMap;
import java.util.Map;
import a.b.Abstractg;
import a.b.Interfacei;
import a.b.g.ag;
import a.b.g.ClassD;

public class ClassU extends w implements aq, s {

    private final Map f302a = new HashMap();

    public static Interfacei m907a(Interfacei interfaceC0161i) {
        while (interfaceC0161i.f() != null && (interfaceC0161i.f() instanceof Interfacei)) {
            interfaceC0161i = (Interfacei) interfaceC0161i.f();
        }
        return interfaceC0161i;
    }

    public static o m908a(o oVar) {
        while (oVar.f() != null && (oVar.f() instanceof o)) {
            oVar = (o) oVar.f();
        }
        return oVar;
    }

    private static void m909a(Interfacei interfaceC0161i, Interfacei interfaceC0161i2) {
        Interfacei interfaceC0161iM907a = m907a(interfaceC0161i);
        Interfacei interfaceC0161iM907a2 = m907a(interfaceC0161i2);
        if (interfaceC0161iM907a.equals(interfaceC0161iM907a2)) {
            return;
        }
        if (interfaceC0161iM907a2 instanceof Abstractg) {
            interfaceC0161iM907a.a(interfaceC0161iM907a2);
        } else {
            interfaceC0161iM907a2.a(interfaceC0161iM907a);
        }
    }

    public void m910a(c cVar) {
        cVar.a(true, true, true, false, new ClassD(new ag(0, 10, this)));
        this.f302a.clear();
    }

    public void m911a(c cVar, Interfacei interfaceC0161i) {
        String strMo946a = interfaceC0161i.mo946a(cVar);
        String strMo949b = interfaceC0161i.mo949b(cVar);
        if (ClassI.m795r(strMo946a)) {
            return;
        }
        String str = strMo946a + ' ' + strMo949b;
        Interfacei interfaceC0161i2 = (Interfacei) this.f302a.get(str);
        if (interfaceC0161i2 != null) {
            m909a(interfaceC0161i, interfaceC0161i2);
        } else {
            this.f302a.put(str, m907a(interfaceC0161i));
        }
    }
}
