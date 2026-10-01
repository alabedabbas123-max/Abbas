package com.a.b.a.b;

import com.a.b.e.d.ClassC;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class ae {

    final ab f1798a;

    private final Map f1799b;

    private ae(ab c0915ab) {
        this.f1798a = c0915ab;
        this.f1799b = new HashMap();
    }

    ae(ab c0915ab, ae c0918ae) {
        this(c0915ab);
    }

    af m3875a(ClassC c1236c) {
        af c0919af = (af) this.f1799b.get(c1236c);
        if (c0919af != null) {
            return c0919af;
        }
        af c0919af2 = new af(c1236c, this.f1798a.f1793n.mo3879a());
        this.f1799b.put(c1236c, c0919af2);
        return c0919af2;
    }

    Collection m3876a() {
        return this.f1799b.values();
    }
}
