package org.c.a.a.c.d;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.c.a.a.b.b.Abstractc;
import org.c.a.a.b.b.Abstractd;
import org.c.a.a.b.b.Interfacee;
import org.c.a.a.b.e.ClassA;
import org.c.a.a.c.d.a.ClassA;
import org.c.a.a.c.d.b.ClassA;
import org.c.a.a.c.d.c.ClassC;
import org.c.a.a.c.d.c.ClassD;
import org.c.a.a.d.ClassC;

public class ClassA {
    /* JADX WARN: Multi-variable type inference failed */
    public void m8796a(ClassA c2066a) {
        boolean z;
        int iIntValue = ((Integer) c2066a.m8169a("maxLineNumber", 0)).intValue();
        boolean zBooleanValue = ((Boolean) c2066a.m8169a("containsByteCode", Boolean.FALSE)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) c2066a.m8169a("showBridgeAndSynthetic", Boolean.FALSE)).booleanValue();
        Map map = (Map) c2066a.m8168a("configuration");
        Object obj = map == null ? "false" : map.get("realignLineNumbers");
        boolean z2 = (obj == null || "false".equals(obj.toString())) ? false : true;
        List list = (List) c2066a.m8167a();
        if (iIntValue == 0 || zBooleanValue || zBooleanValue2 || !z2) {
            return;
        }
        ClassC c2235c = new ClassC();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Interfacee) it.next()).mo7688a(c2235c);
        }
        ClassC<ClassA> c2247cM8828a = c2235c.m8828a();
        ClassA c2228a = new ClassA();
        ClassD c2236d = new ClassD();
        int size = c2247cM8828a.size() * 2;
        int i = size > 20 ? 20 : size;
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        while (i2 < i) {
            c2236d.m8829a();
            for (ClassA c2226a : c2247cM8828a) {
                Iterator it2 = c2226a.m8799a().iterator();
                while (it2.hasNext()) {
                    ((Abstractd) it2.next()).mo7688a(c2236d);
                }
                if (c2226a.m8804b() != null) {
                    c2226a.m8804b().mo7688a(c2236d);
                }
            }
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= 10) {
                    break;
                }
                boolean zM8803a = false;
                Iterator<E> it3 = c2247cM8828a.iterator();
                while (true) {
                    z = zM8803a;
                    if (!it3.hasNext()) {
                        break;
                    } else {
                        zM8803a = ((ClassA) it3.next()).m8803a(false) | z;
                    }
                }
                if (!z) {
                    break;
                } else {
                    i4 = i5 + 1;
                }
            }
            ClassA c2226a2 = (ClassA) c2247cM8828a.get(0);
            int iM8810e = 0;
            ClassA c2226a3 = c2226a2;
            for (ClassA c2226a4 : c2247cM8828a) {
                c2226a4.m8811f();
                if (c2226a3.m8810e() < c2226a4.m8810e()) {
                    c2226a3 = c2226a4;
                }
                iM8810e = c2226a4.m8810e() + iM8810e;
            }
            if (c2226a3.m8810e() == 0 || i3 <= iM8810e || !c2226a3.m8802a(c2228a)) {
                break;
            }
            i2++;
            i3 = iM8810e;
        }
        Iterator<E> it4 = c2247cM8828a.iterator();
        while (it4.hasNext()) {
            ((ClassA) it4.next()).m8803a(true);
        }
        list.clear();
        for (ClassA c2226a5 : c2247cM8828a) {
            list.addAll(c2226a5.m8799a());
            Abstractc abstractC1880cM8804b = c2226a5.m8804b();
            if (abstractC1880cM8804b != null) {
                list.add(abstractC1880cM8804b);
            }
        }
    }
}
