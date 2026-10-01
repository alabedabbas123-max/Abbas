package org.a.a.a;

import org.a.a.a.c.ClassH;

final class ClassJ extends Abstracth {

    static final boolean f5321e;

    private final int[] f5322f;

    static {
        f5321e = !Abstracth.class.desiredAssertionStatus();
    }

    private ClassJ(int i, int i2, String str, int[] iArr, int i3) {
        super(i, i2, str, null);
        this.f5322f = iArr;
        if (!f5321e && i3 != 0) {
            throw new AssertionError();
        }
    }

    ClassJ(int i, int i2, String str, int[] iArr, int i3, ClassJ c1784j) {
        this(i, i2, str, iArr, i3);
    }

    @Override
    public String mo7367a(ClassH c1771h) {
        int iMin = Math.min(c1771h.f5286d, this.f5316a);
        return new String(this.f5322f, iMin, Math.min((c1771h.f5287e - c1771h.f5286d) + 1, this.f5316a - iMin));
    }

    @Override
    public int mo7442c(int i) {
        switch (Integer.signum(i)) {
            case -1:
                int i2 = this.f5318c + i;
                if (i2 < 0) {
                    return -1;
                }
                return this.f5322f[i2];
            case 0:
                return 0;
            case 1:
                int i3 = (this.f5318c + i) - 1;
                if (i3 < this.f5316a) {
                    return this.f5322f[i3];
                }
                return -1;
            default:
                throw new UnsupportedOperationException("Not reached");
        }
    }
}
