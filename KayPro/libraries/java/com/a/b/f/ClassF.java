package com.a.b.f;

import com.a.b.e.b.ClassU;
import java.util.BitSet;

class ClassF implements Interfaceao {

    BitSet f3411a;

    public ClassF(BitSet bitSet) {
        this.f3411a = bitSet;
    }

    @Override
    public void mo5119a(ac c1257ac) {
        if (ClassE.m5339b(c1257ac)) {
            return;
        }
        this.f3411a.set(c1257ac.m5261o().m4894g());
    }

    @Override
    public void mo5120a(ClassZ c1302z) {
        if (ClassE.m5339b(c1302z)) {
            return;
        }
        this.f3411a.set(c1302z.m5261o().m4894g());
    }

    @Override
    public void mo5121b(ClassZ c1302z) {
        ClassU c1194uO = c1302z.m5261o();
        if (ClassE.m5339b(c1302z) || c1194uO == null) {
            return;
        }
        this.f3411a.set(c1194uO.m4894g());
    }
}
