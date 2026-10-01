package a.j;

public class ClassY extends Abstractt {

    private final char[] f1344a;

    private final char[] f1345b;

    private final int f1346c;

    private final int f1347d;

    private final Abstractt f1348e;

    private String f1349f;

    private int f1350g;

    private int f1351h;

    private String f1352i;

    public ClassY(char[] cArr, char[] cArr2, int i, int i2, Abstractt abstractC0515t) {
        this.f1344a = cArr;
        this.f1345b = cArr2;
        this.f1346c = i;
        this.f1347d = i2;
        this.f1348e = abstractC0515t;
    }

    private boolean m3179a(char c) {
        if (this.f1344a != null) {
            for (int i = 0; i < this.f1344a.length; i++) {
                if (this.f1344a[i] == c) {
                    return true;
                }
            }
            return false;
        }
        if (this.f1345b != null) {
            for (int i2 = 0; i2 < this.f1345b.length; i2++) {
                if (this.f1345b[i2] == c) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean m3180a(String str, int i, int i2, int i3) {
        m3183c(str, i, i2);
        return this.f1348e.mo3119a(str, i2, i3);
    }

    private void m3181b() {
        this.f1349f = null;
        this.f1350g = 0;
        this.f1351h = 0;
        this.f1352i = null;
    }

    private boolean m3182b(String str, int i, int i2) {
        while (i < i2) {
            if (!m3179a(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    private void m3183c(String str, int i, int i2) {
        this.f1349f = str;
        this.f1350g = i;
        this.f1351h = i2;
        this.f1352i = null;
    }

    public String m3184a() {
        if (this.f1349f == null) {
            throw new UnsupportedOperationException("Can't handle regular expression with referenced wildcard");
        }
        if (this.f1352i != null) {
            return this.f1352i;
        }
        String strSubstring = this.f1349f.substring(this.f1350g, this.f1351h);
        this.f1352i = strSubstring;
        return strSubstring;
    }

    @Override
    protected boolean mo3119a(String str, int i, int i2) {
        int i3 = i2 - i;
        if (this.f1348e == null) {
            boolean z = i3 >= this.f1346c && i3 <= this.f1347d && m3182b(str, i, i2);
            if (z) {
                m3183c(str, i, i2);
                return z;
            }
            m3181b();
            return z;
        }
        if (i3 < this.f1346c || !m3182b(str, i, this.f1346c + i)) {
            m3181b();
            return false;
        }
        int iMin = Math.min(this.f1347d, i3);
        for (int i4 = this.f1346c; i4 < iMin; i4++) {
            int i5 = i + i4;
            if (m3180a(str, i, i5, i2)) {
                return true;
            }
            if (!m3179a(str.charAt(i5))) {
                m3181b();
                return false;
            }
        }
        if (m3180a(str, i, i + iMin, i2)) {
            return true;
        }
        m3181b();
        return false;
    }
}
