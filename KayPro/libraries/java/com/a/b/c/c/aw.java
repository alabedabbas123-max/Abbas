package com.a.b.c.c;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ab;
import com.a.b.e.d.ClassA;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class aw extends Abstractbg {

    private final TreeMap f2406a;

    public aw(ClassT c1113t) {
        super("proto_ids", c1113t, 4);
        this.f2406a = new TreeMap();
    }

    public Abstractaf m4531a(Abstracta abstractC1200a) {
        if (abstractC1200a == null) {
            throw new NullPointerException("cst == null");
        }
        if (!(abstractC1200a instanceof ab)) {
            throw new IllegalArgumentException("cst not instance of CstProtoRef");
        }
        m4544j();
        Abstractaf abstractC1065af = (Abstractaf) this.f2406a.get(((ab) abstractC1200a).m4950i());
        if (abstractC1065af == null) {
            throw new IllegalArgumentException("not found");
        }
        return abstractC1065af;
    }

    public synchronized av m4532a(ClassA c1234a) {
        av c1081av;
        try {
            if (c1234a == null) {
                throw new NullPointerException("prototype == null");
            }
            m4545k();
            c1081av = (av) this.f2406a.get(c1234a);
            if (c1081av == null) {
                c1081av = new av(c1234a);
                this.f2406a.put(c1234a, c1081av);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1081av;
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
            ((av) it.next()).m4487a(i2);
            i = i2 + 1;
        }
    }

    public int m4533b(ClassA c1234a) {
        if (c1234a == null) {
            throw new NullPointerException("prototype == null");
        }
        m4544j();
        av c1081av = (av) this.f2406a.get(c1234a);
        if (c1081av == null) {
            throw new IllegalArgumentException("not found");
        }
        return c1081av.m4489g();
    }

    @Override
    public Collection mo4482b() {
        return this.f2406a.values();
    }

    public void m4534b(Interfacea interfaceC1303a) {
        m4544j();
        int size = this.f2406a.size();
        int iH = size == 0 ? 0 : m4542h();
        if (size > 65536) {
            throw new UnsupportedOperationException("too many proto ids");
        }
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(4, "proto_ids_size:  " + ClassK.m5480a(size));
            interfaceC1303a.mo5403a(4, "proto_ids_off:   " + ClassK.m5480a(iH));
        }
        interfaceC1303a.mo5457d(size);
        interfaceC1303a.mo5457d(iH);
    }
}
