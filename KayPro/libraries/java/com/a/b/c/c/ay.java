package com.a.b.c.c;

import com.a.b.g.Interfacea;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public final class ay {

    private final HashMap f2412a = new HashMap(50);

    public void m4546a(Abstractag abstractC1066ag) {
        String strM4491i = abstractC1066ag.m4491i();
        az c1085az = (az) this.f2412a.get(strM4491i);
        if (c1085az == null) {
            this.f2412a.put(strM4491i, new az(abstractC1066ag, strM4491i));
        } else {
            c1085az.m4551a(abstractC1066ag);
        }
    }

    public void m4547a(Abstractax abstractC1083ax) {
        Iterator it = abstractC1083ax.mo4482b().iterator();
        while (it.hasNext()) {
            m4546a((Abstractag) it.next());
        }
    }

    public final void m4548a(Interfacea interfaceC1303a) {
        if (this.f2412a.size() == 0) {
            return;
        }
        interfaceC1303a.mo5403a(0, "\nstatistics:\n");
        TreeMap treeMap = new TreeMap();
        for (az c1085az : this.f2412a.values()) {
            treeMap.put(c1085az.f2413a, c1085az);
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            ((az) it.next()).m4552a(interfaceC1303a);
        }
    }
}
