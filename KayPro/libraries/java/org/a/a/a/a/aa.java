package org.a.a.a.a;

import org.a.a.a.c.ClassK;
import org.a.a.a.c.ClassL;

public class aa extends ClassB {

    private final ae f5114f;

    private final boolean f5115g;

    public aa(aa c1686aa, Abstractn abstractC1738n) {
        super(c1686aa, abstractC1738n, c1686aa.f5167c, c1686aa.f5169e);
        this.f5114f = c1686aa.f5114f;
        this.f5115g = m7244a(c1686aa, abstractC1738n);
    }

    public aa(aa c1686aa, Abstractn abstractC1738n, ae c1690ae) {
        super(c1686aa, abstractC1738n, c1686aa.f5167c, c1686aa.f5169e);
        this.f5114f = c1690ae;
        this.f5115g = m7244a(c1686aa, abstractC1738n);
    }

    public aa(aa c1686aa, Abstractn abstractC1738n, Abstractax abstractC1709ax) {
        super(c1686aa, abstractC1738n, abstractC1709ax, c1686aa.f5169e);
        this.f5114f = c1686aa.f5114f;
        this.f5115g = m7244a(c1686aa, abstractC1738n);
    }

    public aa(Abstractn abstractC1738n, int i, Abstractax abstractC1709ax) {
        super(abstractC1738n, i, abstractC1709ax, Abstractbd.f5175a);
        this.f5115g = false;
        this.f5114f = null;
    }

    private static boolean m7244a(aa c1686aa, Abstractn abstractC1738n) {
        return c1686aa.f5115g || ((abstractC1738n instanceof Abstractx) && ((Abstractx) abstractC1738n).f5238i);
    }

    @Override
    public boolean mo7245a(ClassB c1712b) {
        if (this == c1712b) {
            return true;
        }
        if (!(c1712b instanceof aa)) {
            return false;
        }
        aa c1686aa = (aa) c1712b;
        if (this.f5115g == c1686aa.f5115g && ClassL.f5292a.mo7322a(this.f5114f, c1686aa.f5114f)) {
            return super.mo7245a(c1712b);
        }
        return false;
    }

    public final ae m7246c() {
        return this.f5114f;
    }

    public final boolean m7247d() {
        return this.f5115g;
    }

    @Override
    public int hashCode() {
        return ClassK.m7408b(ClassK.m7407a(ClassK.m7406a(ClassK.m7407a(ClassK.m7407a(ClassK.m7406a(ClassK.m7406a(ClassK.m7405a(7), this.f5165a.f5221c), this.f5166b), this.f5167c), this.f5169e), this.f5115g ? 1 : 0), this.f5114f), 6);
    }
}
