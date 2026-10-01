package org.c.a.a.c.a.a.c;

import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ClassR;

public class ah extends Abstracta {

    protected String f6111a;

    protected boolean f6112b;

    protected ah() {
    }

    public void m8452a(String str) {
        this.f6111a = str;
        this.f6112b = false;
    }

    @Override
    public void mo7764a(ac c1918ac) {
        this.f6112b |= c1918ac.m7872d().equals(this.f6111a);
    }

    @Override
    public void mo7778a(ClassR c1942r) {
        this.f6112b |= c1942r.m7929e().equals(this.f6111a);
    }

    public boolean m8453a() {
        return this.f6112b;
    }
}
