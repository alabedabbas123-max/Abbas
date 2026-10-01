package org.c.a.a.c.a.a.c;

import java.util.Iterator;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.c.a.a.a.b.b.ClassB;
import org.c.a.a.c.a.a.a.b.c.ClassE;
import org.c.a.a.c.a.a.a.c.Abstracta;

public class am extends Abstracta {

    protected Abstracta f6116a;

    public am(Abstracta abstractC2115a) {
        this.f6116a = abstractC2115a;
    }

    @Override
    public void mo7855a(ClassU c2035u) {
        if (c2035u.isEmpty()) {
            return;
        }
        Iterator it = c2035u.iterator();
        while (it.hasNext()) {
            Interfacer interfaceC2032r = (Interfacer) it.next();
            if (interfaceC2032r.getClass() == ClassE.class) {
                ClassE c2112e = (ClassE) interfaceC2032r;
                if (c2112e.m8314d().getClass() == ClassB.class && ((ClassB) c2112e.m8314d()).m8306g() == this.f6116a) {
                    it.remove();
                }
            } else {
                interfaceC2032r.mo8055a(this);
            }
        }
    }
}
