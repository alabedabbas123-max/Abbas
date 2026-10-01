package com.a.b.c.c;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ClassN;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.Collection;
import java.util.TreeMap;

public final class ab extends Abstractak {

    private final TreeMap f2342a;

    public ab(ClassT c1113t) {
        super("field_ids", c1113t);
        this.f2342a = new TreeMap();
    }

    public synchronized aa m4478a(ClassN c1221n) {
        aa c1060aa;
        try {
            if (c1221n == null) {
                throw new NullPointerException("field == null");
            }
            m4545k();
            c1060aa = (aa) this.f2342a.get(c1221n);
            if (c1060aa == null) {
                c1060aa = new aa(c1221n);
                this.f2342a.put(c1221n, c1060aa);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1060aa;
    }

    public Abstractaf m4479a(Abstracta abstractC1200a) {
        if (abstractC1200a == null) {
            throw new NullPointerException("cst == null");
        }
        m4544j();
        Abstractaf abstractC1065af = (Abstractaf) this.f2342a.get((ClassN) abstractC1200a);
        if (abstractC1065af == null) {
            throw new IllegalArgumentException("not found");
        }
        return abstractC1065af;
    }

    public void m4480a(Interfacea interfaceC1303a) {
        m4544j();
        int size = this.f2342a.size();
        int iH = size == 0 ? 0 : m4542h();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(4, "field_ids_size:  " + ClassK.m5480a(size));
            interfaceC1303a.mo5403a(4, "field_ids_off:   " + ClassK.m5480a(iH));
        }
        interfaceC1303a.mo5457d(size);
        interfaceC1303a.mo5457d(iH);
    }

    public int m4481b(ClassN c1221n) {
        if (c1221n == null) {
            throw new NullPointerException("ref == null");
        }
        m4544j();
        aa c1060aa = (aa) this.f2342a.get(c1221n);
        if (c1060aa == null) {
            throw new IllegalArgumentException("not found");
        }
        return c1060aa.m4489g();
    }

    @Override
    public Collection mo4482b() {
        return this.f2342a.values();
    }
}
