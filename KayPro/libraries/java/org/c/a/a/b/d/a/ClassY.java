package org.c.a.a.b.d.a;

import org.c.a.a.d.ClassC;

public class ClassY extends ClassC implements Interfacef {

    static final boolean f5690a;

    static {
        f5690a = !ClassY.class.desiredAssertionStatus();
    }

    public ClassY() {
    }

    public ClassY(int i) {
        super(i);
    }

    @Override
    public int mo7900a() {
        if (isEmpty()) {
            return 0;
        }
        return ((ClassX) get(0)).mo7900a();
    }

    @Override
    public void mo7869a(Interfacem interfaceC1937m) {
        interfaceC1937m.mo7785a(this);
    }

    @Override
    public ClassC mo7868l_() {
        return this;
    }
}
