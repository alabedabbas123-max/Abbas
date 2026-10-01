package a.j;

import java.util.List;

public class ClassC implements Interfaceu {

    private static final char[] f1326a = {'V', 'Z', 'B', 'C', 'S', 'I', 'J', 'F', 'D'};

    private List f1327b;

    public ClassC() {
        this(null);
    }

    public ClassC(List list) {
        this.f1327b = list;
    }

    private int m3146a(String str, int i) {
        if (str.charAt(i) != '<') {
            return 0;
        }
        int iIndexOf = str.indexOf(62, i);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Missing closing angular bracket");
        }
        if (this.f1327b == null) {
            ClassL.m3161a(str);
            throw new IllegalArgumentException("References to wildcards are not supported in this argument");
        }
        String strSubstring = str.substring(i + 1, iIndexOf);
        try {
            int i2 = Integer.parseInt(strSubstring);
            if (i2 < 1 || i2 > this.f1327b.size()) {
                throw new IllegalArgumentException("Invalid reference to wildcard (" + i2 + ", must lie between 1 and " + this.f1327b.size() + ")");
            }
            return i2;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Reference to wildcard must be a number (" + strSubstring + ")");
        }
    }

    private ClassY m3147a(int i) {
        return (ClassY) this.f1327b.get(i);
    }

    private ClassY m3148a(Abstractt abstractC0515t) {
        return new ClassY(new char[]{'['}, null, 0, 255, new ClassQ(new ClassY(f1326a, null, 1, 1, abstractC0515t), new ClassY(new char[]{'L'}, null, 1, 1, new ClassY(null, new char[]{';'}, 0, Integer.MAX_VALUE, new ClassY(new char[]{';'}, null, 1, 1, abstractC0515t)))));
    }

    private ClassY m3149a(ClassY c0519y) {
        if (this.f1327b != null) {
            this.f1327b.add(c0519y);
        }
        return c0519y;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x014c  */
    /* JADX WARN: Code duplicated, block: B:9:0x003f  */
    @Override
    public Abstractt mo3150a(String str) {
        Abstractt abstractC0515tM3149a;
        ClassF c0501f = new ClassF();
        int i = 0;
        while (i < str.length()) {
            if (str.regionMatches(i, "L///;", 0, 5)) {
                ClassS c0514s = new ClassS();
                abstractC0515tM3149a = m3149a(new ClassY(null, new char[]{')'}, 0, Integer.MAX_VALUE, c0514s));
                c0514s.m3176a(mo3150a(str.substring(i + 5)));
            } else if (str.regionMatches(i, "L***;", 0, 5)) {
                ClassS c0514s2 = new ClassS();
                abstractC0515tM3149a = m3149a(m3148a(c0514s2));
                c0514s2.m3176a(mo3150a(str.substring(i + 5)));
            } else if (str.regionMatches(i, "**", 0, 2)) {
                ClassS c0514s3 = i + 2 == str.length() ? null : new ClassS();
                abstractC0515tM3149a = m3149a(new ClassY(null, new char[]{';'}, 0, Integer.MAX_VALUE, c0514s3));
                if (c0514s3 != null) {
                    c0514s3.m3176a(mo3150a(str.substring(i + 2)));
                }
            } else if (str.charAt(i) == '*') {
                ClassS c0514s4 = new ClassS();
                abstractC0515tM3149a = m3149a(new ClassY(null, new char[]{';', '/'}, 0, Integer.MAX_VALUE, c0514s4));
                c0514s4.m3176a(mo3150a(str.substring(i + 1)));
            } else if (str.charAt(i) == '?') {
                ClassS c0514s5 = new ClassS();
                abstractC0515tM3149a = m3149a(new ClassY(null, new char[]{';', '/'}, 1, 1, c0514s5));
                c0514s5.m3176a(mo3150a(str.substring(i + 1)));
            } else if (str.charAt(i) == '%') {
                ClassS c0514s6 = new ClassS();
                abstractC0515tM3149a = m3149a(new ClassY(f1326a, null, 1, 1, c0514s6));
                c0514s6.m3176a(mo3150a(str.substring(i + 1)));
            } else {
                int iM3146a = m3146a(str, i);
                if (iM3146a > 0) {
                    abstractC0515tM3149a = new ClassM(m3147a(iM3146a - 1), mo3150a(str.substring(str.indexOf(62, i + 1) + 1)));
                } else {
                    i++;
                }
            }
            return i != 0 ? new ClassI(str.substring(0, i), abstractC0515tM3149a) : abstractC0515tM3149a;
        }
        abstractC0515tM3149a = c0501f;
        if (i != 0) {
        }
    }
}
