package org.a.a.a;

import org.a.a.a.c.ClassH;

final class ClassK extends Abstracth {

    static final boolean f5323e;

    private final byte[] f5324f;

    static {
        f5323e = !Abstracth.class.desiredAssertionStatus();
    }

    private ClassK(int i, int i2, String str, byte[] bArr, int i3) {
        super(i, i2, str, null);
        if (!f5323e && i3 != 0) {
            throw new AssertionError();
        }
        this.f5324f = bArr;
    }

    ClassK(int i, int i2, String str, byte[] bArr, int i3, ClassK c1785k) {
        this(i, i2, str, bArr, i3);
    }

    @Override
    public String mo7367a(ClassH c1771h) {
        int iMin = Math.min(c1771h.f5286d, this.f5316a);
        return new String(this.f5324f, iMin, Math.min((c1771h.f5287e - c1771h.f5286d) + 1, this.f5316a - iMin), ClassD.f5296b);
    }

    @Override
    public int mo7442c(int i) {
        switch (Integer.signum(i)) {
            case -1:
                int i2 = this.f5318c + i;
                if (i2 < 0) {
                    return -1;
                }
                return this.f5324f[i2] & 255;
            case 0:
                return 0;
            case 1:
                int i3 = (this.f5318c + i) - 1;
                if (i3 < this.f5316a) {
                    return this.f5324f[i3] & 255;
                }
                return -1;
            default:
                throw new UnsupportedOperationException("Not reached");
        }
    }
}
