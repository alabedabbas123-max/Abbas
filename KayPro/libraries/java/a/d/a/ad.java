package a.d.a;

public class ad extends Abstractd {

    private int[] f481c;

    private static final int[] f480b = new int[0];

    public static final ad f479a = new ad(f480b);

    public ad(int i) {
        this.f481c = new int[]{i};
    }

    public ad(int[] iArr) {
        this.f481c = iArr;
    }

    public int m1317a(int i) {
        return this.f481c[i] & 33554431;
    }

    public final ad m1318a(ad c0179ad) {
        int length;
        int[] iArr = this.f481c;
        if (iArr.length == 0) {
            return c0179ad;
        }
        int[] iArr2 = c0179ad.f481c;
        if (iArr2.length == 0) {
            return this;
        }
        int length2 = iArr.length;
        for (int i : iArr2) {
            if (!m1320b(i)) {
                length2++;
            }
        }
        if (length2 == iArr2.length) {
            return c0179ad;
        }
        if (length2 == this.f481c.length && iArr2.length == 1 && iArr[iArr.length - 1] == iArr2[0]) {
            return this;
        }
        int[] iArr3 = new int[length2];
        if (length2 == iArr.length + iArr2.length) {
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            length = iArr.length;
        } else {
            length = 0;
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (!c0179ad.m1320b(iArr[i2])) {
                    iArr3[length] = iArr[i2];
                    length++;
                }
            }
        }
        System.arraycopy(iArr2, 0, iArr3, length, iArr2.length);
        return new ad(iArr3);
    }

    @Override
    public final Abstractbd mo1319a(Abstractbd abstractC0206bd) {
        return m1318a(abstractC0206bd.mo1335n_());
    }

    public boolean m1320b(int i) {
        for (int i2 = 0; i2 < this.f481c.length; i2++) {
            if (this.f481c[i2] == i) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean mo1321c() {
        return true;
    }

    public boolean m1322c(int i) {
        return (this.f481c[i] & 16777216) != 0;
    }

    public int m1323d(int i) {
        return this.f481c[i] & (-16777217);
    }

    @Override
    public boolean mo1309d() {
        return true;
    }

    public int m1324e() {
        return this.f481c.length;
    }

    public boolean m1325e(int i) {
        return (this.f481c[i] & 33554432) != 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ad c0179ad = (ad) obj;
        if (this.f481c == c0179ad.f481c) {
            return true;
        }
        if (this.f481c == null || c0179ad.f481c == null || this.f481c.length != c0179ad.f481c.length) {
            return false;
        }
        for (int i = 0; i < c0179ad.f481c.length; i++) {
            if (!m1320b(c0179ad.f481c[i])) {
                return false;
            }
        }
        return true;
    }

    public int m1326f() {
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < this.f481c.length; i2++) {
            int i3 = this.f481c[i2] & 33554431;
            if (i < i3) {
                i = i3;
            }
        }
        return i;
    }

    public boolean m1327f(int i) {
        return (this.f481c[i] & 67108864) != 0;
    }

    public boolean m1328g(int i) {
        return (this.f481c[i] & 134217728) != 0;
    }

    public boolean m1329h(int i) {
        return (this.f481c[i] & 268435456) != 0;
    }

    public int hashCode() {
        int iHashCode = getClass().hashCode();
        if (this.f481c != null) {
            for (int i = 0; i < this.f481c.length; i++) {
                iHashCode ^= this.f481c[i];
            }
        }
        return iHashCode;
    }

    public boolean m1330i(int i) {
        return (this.f481c[i] & 536870912) != 0;
    }

    @Override
    public final int mo1331j() {
        return 6;
    }

    public ad m1332j(int i) {
        if (m1320b(i)) {
            return this;
        }
        int[] iArr = new int[this.f481c.length + 1];
        System.arraycopy(this.f481c, 0, iArr, 0, this.f481c.length);
        iArr[this.f481c.length] = i;
        return new ad(iArr);
    }

    public ad m1333k(int i) {
        for (int i2 = 0; i2 < this.f481c.length; i2++) {
            if (this.f481c[i2] == i) {
                int[] iArr = new int[this.f481c.length - 1];
                System.arraycopy(this.f481c, 0, iArr, 0, i2);
                System.arraycopy(this.f481c, i2 + 1, iArr, i2, (this.f481c.length - i2) - 1);
                return new ad(iArr);
            }
        }
        return this;
    }

    @Override
    public final String mo1334k() {
        return String.valueOf('I');
    }

    @Override
    public final ad mo1335n_() {
        return this;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f481c != null) {
            for (int i = 0; i < this.f481c.length; i++) {
                if (i > 0) {
                    stringBuffer.append(',');
                }
                if (this.f481c[i] < 0) {
                    stringBuffer.append(this.f481c[i]);
                } else {
                    if (m1322c(i)) {
                        stringBuffer.append('P');
                    }
                    if (m1325e(i)) {
                        stringBuffer.append('M');
                    }
                    if (m1327f(i)) {
                        stringBuffer.append('F');
                    }
                    if (m1328g(i)) {
                        stringBuffer.append('N');
                    }
                    if (m1329h(i)) {
                        stringBuffer.append('C');
                    }
                    if (m1330i(i)) {
                        stringBuffer.append('E');
                    }
                    stringBuffer.append(this.f481c[i] & 65535);
                }
            }
        }
        return stringBuffer.append(':').toString();
    }
}
