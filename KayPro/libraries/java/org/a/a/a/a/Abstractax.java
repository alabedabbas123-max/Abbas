package org.a.a.a.a;

import java.util.Arrays;
import java.util.HashMap;
import org.a.a.a.c.ClassD;
import org.a.a.a.c.ClassK;

public abstract class Abstractax {

    public static final ClassY f5157d;

    public static int f5158e;

    static final boolean f5159h;

    public final int f5160f;

    public final int f5161g;

    static {
        f5159h = !Abstractax.class.desiredAssertionStatus();
        f5157d = new ClassY();
        f5158e = 0;
    }

    protected Abstractax(int i) {
        int i2 = f5158e;
        f5158e = i2 + 1;
        this.f5160f = i2;
        this.f5161g = i;
    }

    protected static int m7289a(Abstractax abstractC1709ax, int i) {
        return ClassK.m7408b(ClassK.m7406a(ClassK.m7407a(ClassK.m7405a(1), abstractC1709ax), i), 2);
    }

    protected static int m7290a(Abstractax[] abstractC1709axArr, int[] iArr) {
        int iM7405a = ClassK.m7405a(1);
        int length = abstractC1709axArr.length;
        int i = 0;
        while (i < length) {
            int iM7407a = ClassK.m7407a(iM7405a, abstractC1709axArr[i]);
            i++;
            iM7405a = iM7407a;
        }
        for (int i2 : iArr) {
            iM7405a = ClassK.m7406a(iM7405a, i2);
        }
        return ClassK.m7408b(iM7405a, abstractC1709axArr.length * 2);
    }

    public static Abstractax m7291a(Abstractax abstractC1709ax, Abstractax abstractC1709ax2, boolean z, ClassD c1767d) {
        if (!f5159h && (abstractC1709ax == null || abstractC1709ax2 == null)) {
            throw new AssertionError();
        }
        if (abstractC1709ax == abstractC1709ax2 || abstractC1709ax.equals(abstractC1709ax2)) {
            return abstractC1709ax;
        }
        if ((abstractC1709ax instanceof bg) && (abstractC1709ax2 instanceof bg)) {
            return m7293a((bg) abstractC1709ax, (bg) abstractC1709ax2, z, c1767d);
        }
        if (z) {
            if (abstractC1709ax instanceof ClassY) {
                return abstractC1709ax;
            }
            if (abstractC1709ax2 instanceof ClassY) {
                return abstractC1709ax2;
            }
        }
        return m7294a((ClassR) (abstractC1709ax instanceof bg ? new ClassR((bg) abstractC1709ax) : abstractC1709ax), (ClassR) (abstractC1709ax2 instanceof bg ? new ClassR((bg) abstractC1709ax2) : abstractC1709ax2), z, c1767d);
    }

    public static Abstractax m7292a(bg c1719bg, bg c1719bg2, boolean z) {
        if (z) {
            if (c1719bg == f5157d || c1719bg2 == f5157d) {
                return f5157d;
            }
        } else {
            if (c1719bg == f5157d && c1719bg2 == f5157d) {
                return f5157d;
            }
            if (c1719bg == f5157d) {
                int[] iArr = {c1719bg2.f5182b, Integer.MAX_VALUE};
                Abstractax[] abstractC1709axArr = new Abstractax[2];
                abstractC1709axArr[0] = c1719bg2.f5181a;
                return new ClassR(abstractC1709axArr, iArr);
            }
            if (c1719bg2 == f5157d) {
                int[] iArr2 = {c1719bg.f5182b, Integer.MAX_VALUE};
                Abstractax[] abstractC1709axArr2 = new Abstractax[2];
                abstractC1709axArr2[0] = c1719bg.f5181a;
                return new ClassR(abstractC1709axArr2, iArr2);
            }
        }
        return null;
    }

    public static Abstractax m7293a(bg c1719bg, bg c1719bg2, boolean z, ClassD c1767d) {
        if (c1767d != null) {
            Abstractax abstractC1709ax = (Abstractax) c1767d.m7375a(c1719bg, c1719bg2);
            if (abstractC1709ax != null) {
                return abstractC1709ax;
            }
            Abstractax abstractC1709ax2 = (Abstractax) c1767d.m7375a(c1719bg2, c1719bg);
            if (abstractC1709ax2 != null) {
                return abstractC1709ax2;
            }
        }
        Abstractax abstractC1709axM7292a = m7292a(c1719bg, c1719bg2, z);
        if (abstractC1709axM7292a != null) {
            if (c1767d == null) {
                return abstractC1709axM7292a;
            }
            c1767d.m7376a(c1719bg, c1719bg2, abstractC1709axM7292a);
            return abstractC1709axM7292a;
        }
        if (c1719bg.f5182b == c1719bg2.f5182b) {
            Abstractax abstractC1709axM7291a = m7291a(c1719bg.f5181a, c1719bg2.f5181a, z, c1767d);
            if (abstractC1709axM7291a == c1719bg.f5181a) {
                return c1719bg;
            }
            if (abstractC1709axM7291a == c1719bg2.f5181a) {
                return c1719bg2;
            }
            bg c1719bgM7307b = bg.m7307b(abstractC1709axM7291a, c1719bg.f5182b);
            if (c1767d == null) {
                return c1719bgM7307b;
            }
            c1767d.m7376a(c1719bg, c1719bg2, c1719bgM7307b);
            return c1719bgM7307b;
        }
        Abstractax abstractC1709ax3 = null;
        if (c1719bg == c1719bg2 || (c1719bg.f5181a != null && c1719bg.f5181a.equals(c1719bg2.f5181a))) {
            abstractC1709ax3 = c1719bg.f5181a;
        }
        if (abstractC1709ax3 != null) {
            int[] iArr = {c1719bg.f5182b, c1719bg2.f5182b};
            if (c1719bg.f5182b > c1719bg2.f5182b) {
                iArr[0] = c1719bg2.f5182b;
                iArr[1] = c1719bg.f5182b;
            }
            ClassR c1742r = new ClassR(new Abstractax[]{abstractC1709ax3, abstractC1709ax3}, iArr);
            if (c1767d == null) {
                return c1742r;
            }
            c1767d.m7376a(c1719bg, c1719bg2, c1742r);
            return c1742r;
        }
        int[] iArr2 = {c1719bg.f5182b, c1719bg2.f5182b};
        Abstractax[] abstractC1709axArr = {c1719bg.f5181a, c1719bg2.f5181a};
        if (c1719bg.f5182b > c1719bg2.f5182b) {
            iArr2[0] = c1719bg2.f5182b;
            iArr2[1] = c1719bg.f5182b;
            abstractC1709axArr = new Abstractax[]{c1719bg2.f5181a, c1719bg.f5181a};
        }
        ClassR c1742r2 = new ClassR(abstractC1709axArr, iArr2);
        if (c1767d != null) {
            c1767d.m7376a(c1719bg, c1719bg2, c1742r2);
        }
        return c1742r2;
    }

    public static Abstractax m7294a(ClassR c1742r, ClassR c1742r2, boolean z, ClassD c1767d) {
        int i;
        Abstractax[] abstractC1709axArr;
        int[] iArrCopyOf;
        if (c1767d != null) {
            Abstractax abstractC1709ax = (Abstractax) c1767d.m7375a(c1742r, c1742r2);
            if (abstractC1709ax != null) {
                return abstractC1709ax;
            }
            Abstractax abstractC1709ax2 = (Abstractax) c1767d.m7375a(c1742r2, c1742r);
            if (abstractC1709ax2 != null) {
                return abstractC1709ax2;
            }
        }
        int[] iArr = new int[c1742r.f5233b.length + c1742r2.f5233b.length];
        Abstractax[] abstractC1709axArr2 = new Abstractax[c1742r.f5233b.length + c1742r2.f5233b.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < c1742r.f5233b.length && i3 < c1742r2.f5233b.length) {
            Abstractax abstractC1709ax3 = c1742r.f5232a[i4];
            Abstractax abstractC1709ax4 = c1742r2.f5232a[i3];
            if (c1742r.f5233b[i4] == c1742r2.f5233b[i3]) {
                int i5 = c1742r.f5233b[i4];
                boolean z2 = i5 == Integer.MAX_VALUE && abstractC1709ax3 == null && abstractC1709ax4 == null;
                boolean z3 = (abstractC1709ax3 == null || abstractC1709ax4 == null || !abstractC1709ax3.equals(abstractC1709ax4)) ? false : true;
                if (z2 || z3) {
                    abstractC1709axArr2[i2] = abstractC1709ax3;
                    iArr[i2] = i5;
                } else {
                    abstractC1709axArr2[i2] = m7291a(abstractC1709ax3, abstractC1709ax4, z, c1767d);
                    iArr[i2] = i5;
                }
                i4++;
                i3++;
            } else if (c1742r.f5233b[i4] < c1742r2.f5233b[i3]) {
                abstractC1709axArr2[i2] = abstractC1709ax3;
                iArr[i2] = c1742r.f5233b[i4];
                i4++;
            } else {
                abstractC1709axArr2[i2] = abstractC1709ax4;
                iArr[i2] = c1742r2.f5233b[i3];
                i3++;
            }
            i2++;
        }
        if (i4 < c1742r.f5233b.length) {
            while (i4 < c1742r.f5233b.length) {
                abstractC1709axArr2[i2] = c1742r.f5232a[i4];
                iArr[i2] = c1742r.f5233b[i4];
                i2++;
                i4++;
            }
            i = i2;
        } else {
            while (i3 < c1742r2.f5233b.length) {
                abstractC1709axArr2[i2] = c1742r2.f5232a[i3];
                iArr[i2] = c1742r2.f5233b[i3];
                i2++;
                i3++;
            }
            i = i2;
        }
        if (i >= abstractC1709axArr2.length) {
            abstractC1709axArr = abstractC1709axArr2;
            iArrCopyOf = iArr;
        } else {
            if (i == 1) {
                bg c1719bgM7307b = bg.m7307b(abstractC1709axArr2[0], iArr[0]);
                if (c1767d == null) {
                    return c1719bgM7307b;
                }
                c1767d.m7376a(c1742r, c1742r2, c1719bgM7307b);
                return c1719bgM7307b;
            }
            abstractC1709axArr = (Abstractax[]) Arrays.copyOf(abstractC1709axArr2, i);
            iArrCopyOf = Arrays.copyOf(iArr, i);
        }
        ClassR c1742r3 = new ClassR(abstractC1709axArr, iArrCopyOf);
        if (c1742r3.equals(c1742r)) {
            if (c1767d != null) {
                c1767d.m7376a(c1742r, c1742r2, c1742r);
            }
            return c1742r;
        }
        if (c1742r3.equals(c1742r2)) {
            if (c1767d != null) {
                c1767d.m7376a(c1742r, c1742r2, c1742r2);
            }
            return c1742r2;
        }
        m7295a(abstractC1709axArr);
        if (c1767d != null) {
            c1767d.m7376a(c1742r, c1742r2, c1742r3);
        }
        return c1742r3;
    }

    protected static void m7295a(Abstractax[] abstractC1709axArr) {
        HashMap map = new HashMap();
        for (Abstractax abstractC1709ax : abstractC1709axArr) {
            if (!map.containsKey(abstractC1709ax)) {
                map.put(abstractC1709ax, abstractC1709ax);
            }
        }
        for (int i = 0; i < abstractC1709axArr.length; i++) {
            abstractC1709axArr[i] = (Abstractax) map.get(abstractC1709axArr[i]);
        }
    }

    protected static int m7296d() {
        return ClassK.m7408b(ClassK.m7405a(1), 0);
    }

    public abstract Abstractax mo7297a(int i);

    public boolean mo7298a() {
        return this == f5157d;
    }

    public abstract int mo7299b();

    public abstract int mo7300b(int i);

    public boolean m7301c() {
        return mo7300b(mo7299b() + (-1)) == Integer.MAX_VALUE;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        return this.f5161g;
    }
}
