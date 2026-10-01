package com.a.b.f;

import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.f.a.ClassI;
import com.a.b.g.ClassB;
import com.a.b.g.Interfaceo;
import java.util.ArrayList;

public class ClassR extends ClassA {

    private final ArrayList f3449a;

    private final ClassI f3450b;

    public ClassR(ClassI c1248i, int i) {
        super(i);
        this.f3449a = new ArrayList();
        this.f3450b = c1248i;
    }

    private void m5372a(int i, int i2) {
        this.f3449a.ensureCapacity(i + 1);
        while (i >= this.f3449a.size()) {
            this.f3449a.add(new ClassB(i + 1));
        }
        this.f3450b.m5132a(i2, (Interfaceo) this.f3449a.get(i));
    }

    @Override
    public void mo5081a(int i, int i2, int i3) {
        super.mo5081a(i, i2, i3);
        m5372a(i2, i);
        if (i3 == 2) {
            m5372a(i2 + 1, i);
        }
    }

    public boolean m5373a(ClassU c1194u, int i) {
        return m5375b(c1194u.m4894g(), i, c1194u.m4898k());
    }

    public boolean m5374a(ClassX c1197x, int i, int i2) {
        int iD_ = c1197x.m5476d_();
        for (int i3 = 0; i3 < iD_; i3++) {
            ClassU c1194uM4916b = c1197x.m4916b(i3);
            int iA = m5079a(c1194uM4916b.m4894g());
            if (iA == i || ((c1194uM4916b.m4898k() == 2 && iA + 1 == i) || (i2 == 2 && iA == i + 1))) {
                return true;
            }
        }
        return false;
    }

    public boolean m5375b(int i, int i2, int i3) {
        Interfaceo interfaceC1317o;
        if (i2 < this.f3449a.size() && (interfaceC1317o = (Interfaceo) this.f3449a.get(i2)) != null) {
            if (i3 == 1) {
                return interfaceC1317o.mo5414b(i);
            }
            return interfaceC1317o.mo5414b(i) || m5375b(i, i2 + 1, i3 + (-1));
        }
        return false;
    }
}
