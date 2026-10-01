package com.a.b.c.c;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ad;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class bc extends Abstractbg {

    private final TreeMap f2421a;

    public bc(ClassT c1113t) {
        super("string_ids", c1113t, 4);
        this.f2421a = new TreeMap();
    }

    public Abstractaf m4556a(Abstracta abstractC1200a) {
        if (abstractC1200a == null) {
            throw new NullPointerException("cst == null");
        }
        m4544j();
        Abstractaf abstractC1065af = (Abstractaf) this.f2421a.get((ad) abstractC1200a);
        if (abstractC1065af == null) {
            throw new IllegalArgumentException("not found");
        }
        return abstractC1065af;
    }

    public synchronized bb m4557a(bb c1088bb) {
        bb c1088bb2;
        try {
            if (c1088bb == null) {
                throw new NullPointerException("string == null");
            }
            m4545k();
            ad c1204adM4555c = c1088bb.m4555c();
            c1088bb2 = (bb) this.f2421a.get(c1204adM4555c);
            if (c1088bb2 == null) {
                this.f2421a.put(c1204adM4555c, c1088bb);
                c1088bb2 = c1088bb;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1088bb2;
    }

    public bb m4558a(ad c1204ad) {
        return m4557a(new bb(c1204ad));
    }

    @Override
    protected void mo4485a() {
        int i = 0;
        Iterator it = this.f2421a.values().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return;
            }
            ((bb) it.next()).m4487a(i2);
            i = i2 + 1;
        }
    }

    public int m4559b(ad c1204ad) {
        if (c1204ad == null) {
            throw new NullPointerException("string == null");
        }
        m4544j();
        bb c1088bb = (bb) this.f2421a.get(c1204ad);
        if (c1088bb == null) {
            throw new IllegalArgumentException("not found");
        }
        return c1088bb.m4489g();
    }

    @Override
    public Collection mo4482b() {
        return this.f2421a.values();
    }

    public void m4560b(Interfacea interfaceC1303a) {
        m4544j();
        int size = this.f2421a.size();
        int iH = size == 0 ? 0 : m4542h();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(4, "string_ids_size: " + ClassK.m5480a(size));
            interfaceC1303a.mo5403a(4, "string_ids_off:  " + ClassK.m5480a(iH));
        }
        interfaceC1303a.mo5457d(size);
        interfaceC1303a.mo5457d(iH);
    }
}
