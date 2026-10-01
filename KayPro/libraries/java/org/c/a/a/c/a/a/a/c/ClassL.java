package org.c.a.a.c.a.a.a.c;

import java.util.Iterator;

public class ClassL extends ClassB {
    public ClassL() {
        super(null, null);
    }

    @Override
    public Abstracta mo8343a(int i) {
        if (i < this.f6051b.length) {
            return this.f6051b[i];
        }
        return null;
    }

    @Override
    public void mo8356c() {
        if (this.f6053d != null) {
            Iterator it = this.f6053d.iterator();
            while (it.hasNext()) {
                ((ClassB) it.next()).mo8356c();
            }
        }
    }
}
