package org.a.a.a.a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ClassA {

    public ba[] f5106c;

    public bb[] f5107d;

    public final Enumo f5109f;

    public final int f5110g;

    public int[] f5111h;

    public Interfacead[] f5112i;

    public final List f5104a = new ArrayList();

    public final List f5105b = new ArrayList();

    public final Map f5108e = new LinkedHashMap();

    public final List f5113j = new ArrayList();

    public ClassA(Enumo enumC1739o, int i) {
        this.f5109f = enumC1739o;
        this.f5110g = i;
    }

    public int m7240a() {
        return this.f5105b.size();
    }

    public int m7241a(Abstractx abstractC1748x) {
        this.f5105b.add(abstractC1748x);
        abstractC1748x.f5237h = this.f5105b.size() - 1;
        return abstractC1748x.f5237h;
    }

    public Abstractx m7242a(int i) {
        if (this.f5105b.isEmpty()) {
            return null;
        }
        return (Abstractx) this.f5105b.get(i);
    }

    public void m7243a(Abstractn abstractC1738n) {
        if (abstractC1738n != null) {
            abstractC1738n.f5220b = this;
            abstractC1738n.f5221c = this.f5104a.size();
        }
        this.f5104a.add(abstractC1738n);
    }
}
