package com.a.b.f.a;

import com.a.b.e.b.ac;
import com.a.b.f.Abstractan;
import com.a.b.f.aj;
import com.a.b.f.Interfaceal;
import java.util.ArrayList;
import java.util.BitSet;

class ClassN implements Interfaceal {

    final ClassM f3326a;

    private final ArrayList f3327b;

    ClassN(ClassM c1252m, ArrayList arrayList) {
        this.f3326a = c1252m;
        this.f3327b = arrayList;
    }

    @Override
    public void mo5153a(aj c1264aj, aj c1264aj2) {
        ArrayList arrayListM5222c = c1264aj.m5222c();
        if (arrayListM5222c.size() == 1 && ((Abstractan) arrayListM5222c.get(0)).mo5173e() == ac.f3041s) {
            BitSet bitSet = (BitSet) c1264aj.m5230h().clone();
            for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                ((aj) this.f3327b.get(iNextSetBit)).m5210a(c1264aj.m5227e(), c1264aj.m5233k());
            }
        }
    }
}
