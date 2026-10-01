package com.a.b.c.c;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ClassI;
import com.a.b.e.c.ClassJ;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class ClassH extends Abstractbg {

    private final TreeMap f2448a;

    private final TreeMap f2449b;

    public ClassH(ClassT c1113t) {
        super("call_site_ids", c1113t, 4);
        this.f2448a = new TreeMap();
        this.f2449b = new TreeMap();
    }

    public Abstractaf m4596a(Abstracta abstractC1200a) {
        if (abstractC1200a == null) {
            throw new NullPointerException("cst == null");
        }
        m4544j();
        Abstractaf abstractC1065af = (Abstractaf) this.f2448a.get((ClassJ) abstractC1200a);
        if (abstractC1065af == null) {
            throw new IllegalArgumentException("not found");
        }
        return abstractC1065af;
    }

    ClassI m4597a(ClassI c1216i) {
        if (c1216i == null) {
            throw new NullPointerException("callSite == null");
        }
        return (ClassI) this.f2449b.get(c1216i);
    }

    @Override
    protected void mo4485a() {
        Iterator it = this.f2448a.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((ClassG) it.next()).m4487a(i);
            i++;
        }
    }

    void m4598a(ClassI c1216i, ClassI c1102i) {
        if (c1216i == null) {
            throw new NullPointerException("callSite == null");
        }
        if (c1102i == null) {
            throw new NullPointerException("callSiteItem == null");
        }
        this.f2449b.put(c1216i, c1102i);
    }

    public synchronized void m4599a(ClassJ c1217j) {
        try {
            if (c1217j == null) {
                throw new NullPointerException("cstRef");
            }
            m4545k();
            if (((ClassG) this.f2448a.get(c1217j)) == null) {
                this.f2448a.put(c1217j, new ClassG(c1217j));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public Collection mo4482b() {
        return this.f2448a.values();
    }
}
