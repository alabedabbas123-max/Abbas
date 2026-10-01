package org.a.a.a;

import com.myopicmobile.textwarrior.common.Language;
import org.a.a.a.c.ClassH;

final class ClassI extends Abstracth {

    static final boolean f5319e;

    private final char[] f5320f;

    static {
        f5319e = !Abstracth.class.desiredAssertionStatus();
    }

    private ClassI(int i, int i2, String str, char[] cArr, int i3) {
        super(i, i2, str, null);
        this.f5320f = cArr;
        if (!f5319e && i3 != 0) {
            throw new AssertionError();
        }
    }

    ClassI(int i, int i2, String str, char[] cArr, int i3, ClassI c1783i) {
        this(i, i2, str, cArr, i3);
    }

    @Override
    public String mo7367a(ClassH c1771h) {
        int iMin = Math.min(c1771h.f5286d, this.f5316a);
        return new String(this.f5320f, iMin, Math.min((c1771h.f5287e - c1771h.f5286d) + 1, this.f5316a - iMin));
    }

    @Override
    public int mo7442c(int i) {
        switch (Integer.signum(i)) {
            case -1:
                int i2 = this.f5318c + i;
                if (i2 < 0) {
                    return -1;
                }
                return this.f5320f[i2] & Language.f4831EOF;
            case 0:
                return 0;
            case 1:
                int i3 = (this.f5318c + i) - 1;
                if (i3 < this.f5316a) {
                    return this.f5320f[i3] & Language.f4831EOF;
                }
                return -1;
            default:
                throw new UnsupportedOperationException("Not reached");
        }
    }
}
