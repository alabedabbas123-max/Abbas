package org.a.a.a.a;

import com.blankj.utilcode.constant.MemoryConstants;
import org.a.a.a.Abstractu;
import org.a.a.a.c.ClassK;

public class ClassB {

    public final Abstractn f5165a;

    public final int f5166b;

    public Abstractax f5167c;

    public int f5168d;

    public final Abstractbd f5169e;

    public ClassB(ClassB c1712b, Abstractn abstractC1738n, Abstractax abstractC1709ax, Abstractbd abstractC1716bd) {
        this.f5165a = abstractC1738n;
        this.f5166b = c1712b.f5166b;
        this.f5167c = abstractC1709ax;
        this.f5169e = abstractC1716bd;
        this.f5168d = c1712b.f5168d;
    }

    public ClassB(Abstractn abstractC1738n, int i, Abstractax abstractC1709ax, Abstractbd abstractC1716bd) {
        this.f5165a = abstractC1738n;
        this.f5166b = i;
        this.f5167c = abstractC1709ax;
        this.f5169e = abstractC1716bd;
    }

    public final int m7303a() {
        return this.f5168d & (-1073741825);
    }

    public String m7304a(Abstractu abstractC1795u, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f5165a);
        if (z) {
            sb.append(",");
            sb.append(this.f5166b);
        }
        if (this.f5167c != null) {
            sb.append(",[");
            sb.append(this.f5167c.toString());
            sb.append("]");
        }
        if (this.f5169e != null && this.f5169e != Abstractbd.f5175a) {
            sb.append(",");
            sb.append(this.f5169e);
        }
        if (m7303a() > 0) {
            sb.append(",up=").append(m7303a());
        }
        sb.append(')');
        return sb.toString();
    }

    public final void m7305a(boolean z) {
        if (z) {
            this.f5168d |= MemoryConstants.f4579GB;
        } else {
            this.f5168d &= -1073741825;
        }
    }

    public boolean mo7245a(ClassB c1712b) {
        if (this == c1712b) {
            return true;
        }
        if (c1712b == null) {
            return false;
        }
        return this.f5165a.f5221c == c1712b.f5165a.f5221c && this.f5166b == c1712b.f5166b && (this.f5167c == c1712b.f5167c || (this.f5167c != null && this.f5167c.equals(c1712b.f5167c))) && this.f5169e.equals(c1712b.f5169e) && m7306b() == c1712b.m7306b();
    }

    public final boolean m7306b() {
        return (this.f5168d & MemoryConstants.f4579GB) != 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClassB) {
            return mo7245a((ClassB) obj);
        }
        return false;
    }

    public int hashCode() {
        return ClassK.m7408b(ClassK.m7407a(ClassK.m7407a(ClassK.m7406a(ClassK.m7406a(ClassK.m7405a(7), this.f5165a.f5221c), this.f5166b), this.f5167c), this.f5169e), 4);
    }

    public String toString() {
        return m7304a(null, true);
    }
}
