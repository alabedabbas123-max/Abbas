package org.c.a.a.b.d.e;

import org.c.a.a.d.ClassC;

public class ClassS extends ClassC implements Interfacef {

    static final boolean f5877a;

    static {
        f5877a = !ClassS.class.desiredAssertionStatus();
    }

    @Override
    public void mo8142a(Interfaceu interfaceC2061u) {
        interfaceC2061u.mo8136a(this);
    }

    @Override
    public ClassC mo7868l_() {
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((ClassQ) get(0)).toString());
        int i = 1;
        while (true) {
            int i2 = i;
            if (i2 >= size()) {
                return sb.toString();
            }
            sb.append(" & ");
            sb.append(((ClassQ) get(i2)).toString());
            i = i2 + 1;
        }
    }
}
