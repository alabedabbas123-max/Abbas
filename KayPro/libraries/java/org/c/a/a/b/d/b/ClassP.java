package org.c.a.a.b.d.b;

import java.util.Collection;
import org.c.a.a.d.ClassC;

public class ClassP extends ClassC implements Interfacef {

    static final boolean f5739a;

    static {
        f5739a = !ClassP.class.desiredAssertionStatus();
    }

    public ClassP() {
    }

    public ClassP(int i) {
        super(i);
    }

    public ClassP(Collection collection) {
        super(collection);
        if (f5739a) {
            return;
        }
        if (collection == null || collection.size() <= 1) {
            throw new AssertionError("Uses 'Expression' or sub class instead");
        }
    }

    @Override
    public void mo7957a(Interfaceo interfaceC1979o) {
        interfaceC1979o.mo7808a(this);
    }

    @Override
    public ClassC mo7868l_() {
        return this;
    }
}
