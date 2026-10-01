package com.a.b.a.a;

import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassU;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttExceptions;

public final class ClassG extends Abstractu {

    private final Interfacee f1747a;

    public ClassG(Interfacee interfaceC1238e) {
        super(AttExceptions.ATTRIBUTE_NAME);
        try {
            if (interfaceC1238e.mo4147b_()) {
                throw new ClassU("exceptions.isMutable()");
            }
            this.f1747a = interfaceC1238e;
        } catch (NullPointerException e) {
            throw new NullPointerException("exceptions == null");
        }
    }

    @Override
    public int mo3765a() {
        return (this.f1747a.mo4148d_() * 2) + 8;
    }

    public Interfacee m3776b() {
        return this.f1747a;
    }
}
