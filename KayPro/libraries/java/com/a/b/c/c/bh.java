package com.a.b.c.c;

import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.Iterator;
import java.util.List;

public final class bh extends Abstractat {

    private final Enumah f2424a;

    private final List f2425b;

    public bh(Enumah enumC1067ah, List list) {
        super(m4568a(list), m4569b(list));
        if (enumC1067ah == null) {
            throw new NullPointerException("itemType == null");
        }
        this.f2425b = list;
        this.f2424a = enumC1067ah;
    }

    private static int m4568a(List list) {
        try {
            return Math.max(4, ((Abstractat) list.get(0)).m4524f());
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException e2) {
            throw new NullPointerException("items == null");
        }
    }

    private static int m4569b(List list) {
        Abstractat abstractC1079at = (Abstractat) list.get(0);
        return (abstractC1079at.mo4484e_() * list.size()) + m4568a(list);
    }

    private int m4570d() {
        return m4524f();
    }

    @Override
    public Enumah mo4469a() {
        return this.f2424a;
    }

    @Override
    protected void mo4470a(Abstractax abstractC1083ax, int i) {
        int iM4570d = i + m4570d();
        boolean z = true;
        int iM4521b = iM4570d;
        int iM4524f = -1;
        int i2 = -1;
        for (Abstractat abstractC1079at : this.f2425b) {
            int iMo4484e_ = abstractC1079at.mo4484e_();
            if (z) {
                iM4524f = abstractC1079at.m4524f();
                z = false;
                i2 = iMo4484e_;
            } else {
                if (iMo4484e_ != i2) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (abstractC1079at.m4524f() != iM4524f) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            }
            iM4521b = abstractC1079at.m4521b(abstractC1083ax, iM4521b) + iMo4484e_;
        }
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        Iterator it = this.f2425b.iterator();
        while (it.hasNext()) {
            ((Abstractat) it.next()).mo4471a(c1113t);
        }
    }

    @Override
    protected void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        int size = this.f2425b.size();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4525g()) + " " + m4491i());
            interfaceC1303a.mo5403a(4, "  size: " + ClassK.m5480a(size));
        }
        interfaceC1303a.mo5457d(size);
        Iterator it = this.f2425b.iterator();
        while (it.hasNext()) {
            ((Abstractat) it.next()).mo4483a(c1113t, interfaceC1303a);
        }
    }

    @Override
    public final String mo4474b() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{");
        boolean z = true;
        for (Abstractat abstractC1079at : this.f2425b) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(abstractC1079at.mo4474b());
        }
        sb.append("}");
        return sb.toString();
    }

    public final List m4571c() {
        return this.f2425b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append(this.f2425b);
        return sb.toString();
    }
}
