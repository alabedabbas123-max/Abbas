package com.a.b.c.c;

import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.ArrayList;

public final class ai extends Abstractat {

    private final Enumah f2374a;

    private final Abstractax f2375b;

    private final Abstractag f2376c;

    private final Abstractag f2377d;

    private final int f2378e;

    private ai(Enumah enumC1067ah, Abstractax abstractC1083ax, Abstractag abstractC1066ag, Abstractag abstractC1066ag2, int i) {
        super(4, 12);
        if (enumC1067ah == null) {
            throw new NullPointerException("type == null");
        }
        if (abstractC1083ax == null) {
            throw new NullPointerException("section == null");
        }
        if (abstractC1066ag == null) {
            throw new NullPointerException("firstItem == null");
        }
        if (abstractC1066ag2 == null) {
            throw new NullPointerException("lastItem == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("itemCount <= 0");
        }
        this.f2374a = enumC1067ah;
        this.f2375b = abstractC1083ax;
        this.f2376c = abstractC1066ag;
        this.f2377d = abstractC1066ag2;
        this.f2378e = i;
    }

    private ai(Abstractax abstractC1083ax) {
        super(4, 12);
        if (abstractC1083ax == null) {
            throw new NullPointerException("section == null");
        }
        this.f2374a = Enumah.TYPE_MAP_LIST;
        this.f2375b = abstractC1083ax;
        this.f2376c = null;
        this.f2377d = null;
        this.f2378e = 1;
    }

    public static void m4494a(Abstractax[] abstractC1083axArr, aq c1076aq) {
        if (abstractC1083axArr == null) {
            throw new NullPointerException("sections == null");
        }
        if (c1076aq.mo4482b().size() != 0) {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arrayList = new ArrayList(50);
        for (Abstractax abstractC1083ax : abstractC1083axArr) {
            int i = 0;
            Abstractag abstractC1066ag = null;
            Abstractag abstractC1066ag2 = null;
            Enumah enumC1067ah = null;
            for (Abstractag abstractC1066ag3 : abstractC1083ax.mo4482b()) {
                Enumah enumC1067ahMo4469a = abstractC1066ag3.mo4469a();
                if (enumC1067ahMo4469a != enumC1067ah) {
                    if (i != 0) {
                        arrayList.add(new ai(enumC1067ah, abstractC1083ax, abstractC1066ag2, abstractC1066ag, i));
                    }
                    i = 0;
                    abstractC1066ag2 = abstractC1066ag3;
                    enumC1067ah = enumC1067ahMo4469a;
                }
                i++;
                abstractC1066ag = abstractC1066ag3;
            }
            if (i != 0) {
                arrayList.add(new ai(enumC1067ah, abstractC1083ax, abstractC1066ag2, abstractC1066ag, i));
            } else if (abstractC1083ax == c1076aq) {
                arrayList.add(new ai(c1076aq));
            }
        }
        c1076aq.m4511a((Abstractat) new bh(Enumah.TYPE_MAP_LIST, arrayList));
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_MAP_ITEM;
    }

    @Override
    public void mo4471a(ClassT c1113t) {
    }

    @Override
    protected void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        int iM4492a = this.f2374a.m4492a();
        int iM4542h = this.f2376c == null ? this.f2375b.m4542h() : this.f2375b.mo4510a(this.f2376c);
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4525g()) + ' ' + this.f2374a.m4493b() + " map");
            interfaceC1303a.mo5403a(2, "  type:   " + ClassK.m5485c(iM4492a) + " // " + this.f2374a.toString());
            interfaceC1303a.mo5403a(2, "  unused: 0");
            interfaceC1303a.mo5403a(4, "  size:   " + ClassK.m5480a(this.f2378e));
            interfaceC1303a.mo5403a(4, "  offset: " + ClassK.m5480a(iM4542h));
        }
        interfaceC1303a.mo5456c(iM4492a);
        interfaceC1303a.mo5456c(0);
        interfaceC1303a.mo5457d(this.f2378e);
        interfaceC1303a.mo5457d(iM4542h);
    }

    @Override
    public final String mo4474b() {
        return toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(this.f2375b.toString());
        sb.append(' ');
        sb.append(this.f2374a.mo3828d());
        sb.append('}');
        return sb.toString();
    }
}
