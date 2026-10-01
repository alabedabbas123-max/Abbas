package com.a.b.c.c;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractf;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.Collection;
import java.util.TreeMap;

public final class ap extends Abstractak {

    private final TreeMap f2385a;

    public ap(ClassT c1113t) {
        super("method_ids", c1113t);
        this.f2385a = new TreeMap();
    }

    public Abstractaf m4505a(Abstracta abstractC1200a) {
        if (abstractC1200a == null) {
            throw new NullPointerException("cst == null");
        }
        m4544j();
        Abstractaf abstractC1065af = (Abstractaf) this.f2385a.get((Abstractf) abstractC1200a);
        if (abstractC1065af == null) {
            throw new IllegalArgumentException("not found");
        }
        return abstractC1065af;
    }

    public synchronized ao m4506a(Abstractf abstractC1213f) {
        ao c1074ao;
        try {
            if (abstractC1213f == null) {
                throw new NullPointerException("method == null");
            }
            m4545k();
            c1074ao = (ao) this.f2385a.get(abstractC1213f);
            if (c1074ao == null) {
                c1074ao = new ao(abstractC1213f);
                this.f2385a.put(abstractC1213f, c1074ao);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1074ao;
    }

    public void m4507a(Interfacea interfaceC1303a) {
        m4544j();
        int size = this.f2385a.size();
        int iH = size == 0 ? 0 : m4542h();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(4, "method_ids_size: " + ClassK.m5480a(size));
            interfaceC1303a.mo5403a(4, "method_ids_off:  " + ClassK.m5480a(iH));
        }
        interfaceC1303a.mo5457d(size);
        interfaceC1303a.mo5457d(iH);
    }

    public int m4508b(Abstractf abstractC1213f) {
        if (abstractC1213f == null) {
            throw new NullPointerException("ref == null");
        }
        m4544j();
        ao c1074ao = (ao) this.f2385a.get(abstractC1213f);
        if (c1074ao == null) {
            throw new IllegalArgumentException("not found");
        }
        return c1074ao.m4489g();
    }

    @Override
    public Collection mo4482b() {
        return this.f2385a.values();
    }
}
