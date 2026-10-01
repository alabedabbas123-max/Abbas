package org.c.a.a.b.d.a;

import java.util.Iterator;
import org.c.a.a.d.ClassC;

public class ClassS extends ClassC implements Interfaced {

    static final boolean f5673a;

    static {
        f5673a = !ClassS.class.desiredAssertionStatus();
    }

    public ClassS() {
    }

    public ClassS(int i) {
        super(i);
    }

    @Override
    public void mo7869a(Interfacem interfaceC1937m) {
        interfaceC1937m.mo7779a(this);
    }

    @Override
    public void mo7899a(ClassQ c1941q) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ClassR) it.next()).mo7899a(c1941q);
        }
    }

    @Override
    public ClassC mo7868l_() {
        return this;
    }
}
