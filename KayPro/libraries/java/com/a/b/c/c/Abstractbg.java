package com.a.b.c.c;

import com.a.b.g.Interfacea;
import java.util.Collection;
import java.util.Iterator;

public abstract class Abstractbg extends Abstractax {
    public Abstractbg(String str, ClassT c1113t, int i) {
        super(str, c1113t, i);
    }

    @Override
    public final int mo4510a(Abstractag abstractC1066ag) {
        Abstractaf abstractC1065af = (Abstractaf) abstractC1066ag;
        return m4537c(abstractC1065af.m4489g() * abstractC1065af.mo4484e_());
    }

    protected abstract void mo4485a();

    @Override
    protected final void mo4513a_(Interfacea interfaceC1303a) {
        ClassT c1113tF = m4540f();
        int iG = m4541g();
        Iterator it = mo4482b().iterator();
        while (it.hasNext()) {
            ((Abstractag) it.next()).mo4483a(c1113tF, interfaceC1303a);
            interfaceC1303a.mo5465h(iG);
        }
    }

    @Override
    protected final void mo4515c() {
        ClassT c1113tF = m4540f();
        mo4485a();
        Iterator it = mo4482b().iterator();
        while (it.hasNext()) {
            ((Abstractag) it.next()).mo4471a(c1113tF);
        }
    }

    @Override
    public final int mo4517f_() {
        Collection collectionB = mo4482b();
        int size = collectionB.size();
        if (size == 0) {
            return 0;
        }
        return ((Abstractag) collectionB.iterator().next()).mo4484e_() * size;
    }
}
