package org.c.a.a.b.c;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import org.c.a.a.b.b.Abstractd;
import org.c.a.a.d.ClassC;

public class ClassH extends Abstractd implements Interfacek {

    protected static final ClassJ f5586g;

    static final boolean f5587i;

    protected final HashMap f5588h;

    static {
        f5587i = !ClassH.class.desiredAssertionStatus();
        f5586g = new ClassJ();
    }

    public ClassH(int i) {
        super(0, -1, -1, i, "Imports");
        this.f5588h = new HashMap();
    }

    public void m7717a(String str, String str2) {
        ClassI c1896i = (ClassI) this.f5588h.get(str);
        if (c1896i == null) {
            this.f5588h.put(str, new ClassI(str, str2));
        } else {
            c1896i.m7725d();
        }
    }

    @Override
    public void mo7710a(Interfacel interfaceC1899l) {
        interfaceC1899l.mo7734a(this);
    }

    public boolean m7718a(String str) {
        return this.f5588h.containsKey(str);
    }

    @Override
    public int mo7697e() {
        if (f5587i || this.f5575d != -1) {
            return this.f5575d;
        }
        throw new AssertionError("Call initLineCounts() before");
    }

    public boolean m7719h() {
        return this.f5588h.isEmpty();
    }

    public void m7720i() {
        int size = this.f5588h.size();
        this.f5575d = size;
        this.f5574c = size;
        this.f5573b = size;
    }

    public Collection m7721j() {
        int iMo7697e = mo7697e();
        int size = this.f5588h.size();
        if (iMo7697e >= size) {
            return this.f5588h.values();
        }
        ClassC c2247c = new ClassC(this.f5588h.values());
        Collections.sort(c2247c, f5586g);
        c2247c.subList(iMo7697e, size).clear();
        return c2247c;
    }
}
