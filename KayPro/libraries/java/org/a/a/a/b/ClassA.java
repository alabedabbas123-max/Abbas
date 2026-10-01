package org.a.a.a.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.a.a.a.ae;
import org.a.a.a.Interfacead;
import org.a.a.a.a.Abstractx;
import org.a.a.a.a.bi;
import org.a.a.a.a.ClassC;

public class ClassA {

    public final Map f5246a = new HashMap();

    public volatile ClassD f5247b;

    public final int f5248c;

    public final Abstractx f5249d;

    private final boolean f5250e;

    public ClassA(Abstractx abstractC1748x, int i) {
        boolean z;
        this.f5249d = abstractC1748x;
        this.f5248c = i;
        if ((abstractC1748x instanceof bi) && ((bi) abstractC1748x).f5184j) {
            z = true;
            ClassD c1761d = new ClassD(new ClassC());
            c1761d.f5256c = new ClassD[0];
            c1761d.f5257d = false;
            c1761d.f5260g = false;
            this.f5247b = c1761d;
        } else {
            z = false;
        }
        this.f5250e = z;
    }

    public String m7362a(Interfacead interfaceC1754ad) {
        return this.f5247b == null ? "" : new ClassC(this, interfaceC1754ad).toString();
    }

    public List m7363a() {
        ArrayList arrayList = new ArrayList(this.f5246a.keySet());
        Collections.sort(arrayList, new ClassB(this));
        return arrayList;
    }

    public String toString() {
        return m7362a(ae.f5240a);
    }
}
