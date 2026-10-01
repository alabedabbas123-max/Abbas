package org.c.a.a.b.c;

import java.util.Iterator;
import java.util.List;
import org.c.a.a.b.b.Abstractc;
import org.c.a.a.b.f.Interfacep;

public class ClassM extends Abstractc implements Interfacek {

    static final boolean f5592d;

    protected List f5593c;

    static {
        f5592d = !ClassM.class.desiredAssertionStatus();
    }

    public ClassM(List list) {
        super(m7747a(list), m7748b(list));
        if (!f5592d && this.f5570a == 0) {
            throw new AssertionError("Uses 'TokensFragment' instead");
        }
        this.f5593c = list;
    }

    protected static int m7747a(List list) {
        ClassN c1901n = new ClassN();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Interfacep) it.next()).mo8184a(c1901n);
            if (c1901n.f5594a != 0) {
                return c1901n.f5594a - c1901n.f5595b;
            }
        }
        return 0;
    }

    protected static int m7748b(List list) {
        ClassN c1901n = new ClassN();
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return 0;
            }
            ((Interfacep) list.get(i)).mo8184a(c1901n);
            if (c1901n.f5594a != 0) {
                return c1901n.f5594a + c1901n.f5595b;
            }
            size = i;
        }
    }

    @Override
    public void mo7710a(Interfacel interfaceC1899l) {
        interfaceC1899l.mo7735a(this);
    }

    public List m7749c() {
        return this.f5593c;
    }
}
