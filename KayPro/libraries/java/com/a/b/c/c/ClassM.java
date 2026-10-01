package com.a.b.c.c;

import com.a.b.e.c.ae;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class ClassM extends Abstractbg {

    private final TreeMap f2473a;

    private ArrayList f2474b;

    public ClassM(ClassT c1113t) {
        super("class_defs", c1113t, 4);
        this.f2473a = new TreeMap();
        this.f2474b = null;
    }

    private int m4629a(ClassC c1236c, int i, int i2) {
        ClassL c1105l = (ClassL) this.f2473a.get(c1236c);
        if (c1105l == null || c1105l.m4488f()) {
            return i;
        }
        if (i2 < 0) {
            throw new RuntimeException("class circularity with " + c1236c);
        }
        int i3 = i2 - 1;
        ae c1205aeM4627d = c1105l.m4627d();
        if (c1205aeM4627d != null) {
            i = m4629a(c1205aeM4627d.m4966i(), i, i3);
        }
        Interfacee interfaceC1238eM4628e = c1105l.m4628e();
        int iMo4148d_ = interfaceC1238eM4628e.mo4148d_();
        for (int i4 = 0; i4 < iMo4148d_; i4++) {
            i = m4629a(interfaceC1238eM4628e.mo4145a(i4), i, i3);
        }
        c1105l.m4487a(i);
        this.f2474b.add(c1105l);
        return i + 1;
    }

    @Override
    protected void mo4485a() {
        int size = this.f2473a.size();
        int iM4629a = 0;
        this.f2474b = new ArrayList(size);
        Iterator it = this.f2473a.keySet().iterator();
        while (true) {
            int i = iM4629a;
            if (!it.hasNext()) {
                return;
            } else {
                iM4629a = m4629a((ClassC) it.next(), i, size - i);
            }
        }
    }

    public void m4630a(ClassL c1105l) {
        try {
            ClassC c1236cM4966i = c1105l.m4626c().m4966i();
            m4545k();
            if (this.f2473a.get(c1236cM4966i) != null) {
                throw new IllegalArgumentException("already added: " + c1236cM4966i);
            }
            this.f2473a.put(c1236cM4966i, c1105l);
        } catch (NullPointerException e) {
            throw new NullPointerException("clazz == null");
        }
    }

    public void m4631a(Interfacea interfaceC1303a) {
        m4544j();
        int size = this.f2473a.size();
        int iH = size == 0 ? 0 : m4542h();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(4, "class_defs_size: " + ClassK.m5480a(size));
            interfaceC1303a.mo5403a(4, "class_defs_off:  " + ClassK.m5480a(iH));
        }
        interfaceC1303a.mo5457d(size);
        interfaceC1303a.mo5457d(iH);
    }

    @Override
    public Collection mo4482b() {
        return this.f2474b != null ? this.f2474b : this.f2473a.values();
    }
}
