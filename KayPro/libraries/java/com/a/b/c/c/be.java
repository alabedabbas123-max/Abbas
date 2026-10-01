package com.a.b.c.c;

import com.a.a.ClassC;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ae;
import com.a.b.e.d.ClassC;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class be extends Abstractbg {

    private final TreeMap f2422a;

    public be(ClassT c1113t) {
        super("type_ids", c1113t, 4);
        this.f2422a = new TreeMap();
    }

    public Abstractaf m4561a(Abstracta abstractC1200a) {
        if (abstractC1200a == null) {
            throw new NullPointerException("cst == null");
        }
        m4544j();
        Abstractaf abstractC1065af = (Abstractaf) this.f2422a.get(((ae) abstractC1200a).m4966i());
        if (abstractC1065af == null) {
            throw new IllegalArgumentException("not found: " + abstractC1200a);
        }
        return abstractC1065af;
    }

    public synchronized bd m4562a(ae c1205ae) {
        bd c1090bd;
        try {
            if (c1205ae == null) {
                throw new NullPointerException("type == null");
            }
            m4545k();
            ClassC c1236cM4966i = c1205ae.m4966i();
            c1090bd = (bd) this.f2422a.get(c1236cM4966i);
            if (c1090bd == null) {
                c1090bd = new bd(c1205ae);
                this.f2422a.put(c1236cM4966i, c1090bd);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1090bd;
    }

    public synchronized bd m4563a(ClassC c1236c) {
        bd c1090bd;
        try {
            if (c1236c == null) {
                throw new NullPointerException("type == null");
            }
            m4545k();
            c1090bd = (bd) this.f2422a.get(c1236c);
            if (c1090bd == null) {
                c1090bd = new bd(new ae(c1236c));
                this.f2422a.put(c1236c, c1090bd);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1090bd;
    }

    @Override
    protected void mo4485a() {
        int i = 0;
        Iterator it = mo4482b().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return;
            }
            ((bd) it.next()).m4487a(i2);
            i = i2 + 1;
        }
    }

    public int m4564b(ae c1205ae) {
        if (c1205ae == null) {
            throw new NullPointerException("type == null");
        }
        return m4565b(c1205ae.m4966i());
    }

    public int m4565b(ClassC c1236c) {
        if (c1236c == null) {
            throw new NullPointerException("type == null");
        }
        m4544j();
        bd c1090bd = (bd) this.f2422a.get(c1236c);
        if (c1090bd == null) {
            throw new IllegalArgumentException("not found: " + c1236c);
        }
        return c1090bd.m4489g();
    }

    @Override
    public Collection mo4482b() {
        return this.f2422a.values();
    }

    public void m4566b(Interfacea interfaceC1303a) {
        m4544j();
        int size = this.f2422a.size();
        int iH = size == 0 ? 0 : m4542h();
        if (size > 65536) {
            throw new ClassC(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(mo4482b().size()), 65536));
        }
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(4, "type_ids_size:   " + ClassK.m5480a(size));
            interfaceC1303a.mo5403a(4, "type_ids_off:    " + ClassK.m5480a(iH));
        }
        interfaceC1303a.mo5457d(size);
        interfaceC1303a.mo5457d(iH);
    }
}
