package com.a.b.c.c;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ClassY;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class an extends Abstractbg {

    private final TreeMap f2384a;

    public an(ClassT c1113t) {
        super("method_handles", c1113t, 8);
        this.f2384a = new TreeMap();
    }

    public Abstractaf m4501a(Abstracta abstractC1200a) {
        if (abstractC1200a == null) {
            throw new NullPointerException("cst == null");
        }
        m4544j();
        Abstractaf abstractC1065af = (Abstractaf) this.f2384a.get((ClassY) abstractC1200a);
        if (abstractC1065af == null) {
            throw new IllegalArgumentException("not found");
        }
        return abstractC1065af;
    }

    @Override
    protected void mo4485a() {
        Iterator it = this.f2384a.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((am) it.next()).m4487a(i);
            i++;
        }
    }

    public void m4502a(ClassY c1232y) {
        if (c1232y == null) {
            throw new NullPointerException("methodHandle == null");
        }
        m4545k();
        if (((am) this.f2384a.get(c1232y)) == null) {
            this.f2384a.put(c1232y, new am(c1232y));
        }
    }

    int m4503b(ClassY c1232y) {
        return ((am) this.f2384a.get(c1232y)).m4489g();
    }

    @Override
    public Collection mo4482b() {
        return this.f2384a.values();
    }
}
