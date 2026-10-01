package com.a.b.f.a;

import com.a.b.f.ai;
import com.a.b.g.Interfaceo;
import java.util.ArrayList;

public class ClassI {

    private final ArrayList f3306a;

    public ClassI(int i) {
        this.f3306a = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f3306a.add(ai.m5200b(i));
        }
    }

    private void m5130a(int i) {
        this.f3306a.ensureCapacity(i);
        for (int size = this.f3306a.size(); size < i; size++) {
            this.f3306a.add(ai.m5200b(i));
        }
    }

    public void m5131a(int i, int i2) {
        m5130a(Math.max(i, i2) + 1);
        ((Interfaceo) this.f3306a.get(i)).mo5411a(i2);
        ((Interfaceo) this.f3306a.get(i2)).mo5411a(i);
    }

    public void m5132a(int i, Interfaceo interfaceC1317o) {
        if (i < this.f3306a.size()) {
            interfaceC1317o.mo5412a((Interfaceo) this.f3306a.get(i));
        }
    }
}
