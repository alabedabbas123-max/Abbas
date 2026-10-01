package a.j;

import java.util.List;

public class ClassO implements Interfaceu {

    private List f1339a;

    public ClassO() {
        this(null);
    }

    public ClassO(List list) {
        this.f1339a = list;
    }

    private int m3168a(String str, int i) {
        if (this.f1339a == null || str.charAt(i) != '<') {
            return 0;
        }
        int iIndexOf = str.indexOf(62, i);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Missing closing angular bracket");
        }
        try {
            int i2 = Integer.parseInt(str.substring(i + 1, iIndexOf));
            if (i2 < 1 || i2 > this.f1339a.size()) {
                throw new IllegalArgumentException("Invalid reference to wildcard (" + i2 + ", must lie between 1 and " + this.f1339a.size() + ")");
            }
            return i2;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private ClassY m3169a(int i) {
        return (ClassY) this.f1339a.get(i);
    }

    private ClassY m3170a(ClassY c0519y) {
        if (this.f1339a != null) {
            this.f1339a.add(c0519y);
        }
        return c0519y;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0092  */
    /* JADX WARN: Code duplicated, block: B:9:0x0038  */
    @Override
    public Abstractt mo3150a(String str) {
        Abstractt abstractC0515tM3170a;
        ClassF c0501f = new ClassF();
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '*') {
                ClassS c0514s = new ClassS();
                abstractC0515tM3170a = m3170a(new ClassY(null, null, 0, Integer.MAX_VALUE, c0514s));
                c0514s.m3176a(mo3150a(str.substring(i + 1)));
            } else if (str.charAt(i) == '?') {
                ClassS c0514s2 = new ClassS();
                abstractC0515tM3170a = m3170a(new ClassY(null, null, 1, 1, c0514s2));
                c0514s2.m3176a(mo3150a(str.substring(i + 1)));
            } else {
                int iM3168a = m3168a(str, i);
                if (iM3168a > 0) {
                    abstractC0515tM3170a = new ClassM(m3169a(iM3168a - 1), mo3150a(str.substring(str.indexOf(62, i + 1) + 1)));
                } else {
                    i++;
                }
            }
            return i != 0 ? new ClassI(str.substring(0, i), abstractC0515tM3170a) : abstractC0515tM3170a;
        }
        abstractC0515tM3170a = c0501f;
        if (i != 0) {
        }
    }
}
