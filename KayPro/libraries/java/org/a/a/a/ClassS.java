package org.a.a.a;

import java.util.Collection;
import java.util.Iterator;

public class ClassS implements Interfacea {

    private final Collection f5353a;

    public ClassS(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("delegates");
        }
        this.f5353a = collection;
    }

    @Override
    public void mo7239a(Abstractu abstractC1795u, Object obj, int i, int i2, String str, ClassT c1794t) {
        Iterator it = this.f5353a.iterator();
        while (it.hasNext()) {
            ((Interfacea) it.next()).mo7239a(abstractC1795u, obj, i, i2, str, c1794t);
        }
    }
}
