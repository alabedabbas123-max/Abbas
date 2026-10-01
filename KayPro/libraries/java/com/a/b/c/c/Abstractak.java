package com.a.b.c.c;

import com.a.a.ClassC;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Abstractak extends Abstractbg {
    public Abstractak(String str, ClassT c1113t) {
        super(str, c1113t, 4);
    }

    private String m4496d() {
        TreeMap treeMap = new TreeMap();
        Iterator it = mo4482b().iterator();
        while (it.hasNext()) {
            String strM4968k = ((Abstractaj) it.next()).m4486e().m4968k();
            AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(strM4968k);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                treeMap.put(strM4968k, atomicInteger);
            }
            atomicInteger.incrementAndGet();
        }
        Formatter formatter = new Formatter();
        try {
            formatter.format("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:", this instanceof ap ? "method" : "field", Integer.valueOf(mo4482b().size()), 65536);
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format("%n%6d %s", Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey());
            }
            return formatter.toString();
        } finally {
            formatter.close();
        }
    }

    @Override
    protected void mo4485a() {
        int i = 0;
        if (mo4482b().size() > 65536) {
            throw new ClassC(m4496d());
        }
        Iterator it = mo4482b().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return;
            }
            ((Abstractaj) it.next()).m4487a(i2);
            i = i2 + 1;
        }
    }
}
