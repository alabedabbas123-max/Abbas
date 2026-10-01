package a;

public class f implements java.lang.Cloneable {

    public final java.lang.String f133a;
    public int b;
    public int c;
    public final java.lang.String d;
    public java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.util.List h;
    public java.util.List i;
    public java.util.List j;

    public f() {
        this(null, 0, 0, null, null, null, null);
    }

    public f(a.f r11) {
        this(r11.f133a, r11.b, r11.c, r11.d, r11.e, r11.f, r11.g, r11.i, r11.j);
    }

    public f(java.lang.String r11, int r12, int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        this(r11, r12, r13, r14, r15, r16, r17, null, null);
    }

    public f(java.lang.String r2, int r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.List r9, java.util.List r10) {
        this.h = null;
        this.f133a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.i = r9;
        this.j = r10;
    }

    public void a(a.ae r2) {
        if (this.i != null) goto L5;
        this.i = new java.util.ArrayList();
    L5:
        this.i.add(r2);
    }

    public void b(a.ae r2) {
        if (this.j != null) goto L5;
        this.j = new java.util.ArrayList();
    L5:
        this.j.add(r2);
    }

    public java.lang.Object clone() {
        return super.clone();
    L5:
        return null;
    }

    public boolean equals(java.lang.Object r4) {
        if (r4 != null) goto L5;
        return false;
    L5:
        if (getClass() != r4.getClass()) goto L54;
        a.f r5 = (a.f) r4;
        if (this.b == r5.b) goto L10;
        return false;
    L10:
        if (this.c == r5.c) goto L12;
        return false;
    L12:
        if (this.d != null) goto L37;
        if (r5.d == null) goto L16;
        return false;
    L16:
        if (this.e != null) goto L40;
        if (r5.e == null) goto L20;
        return false;
    L20:
        if (this.f != null) goto L43;
        if (r5.f == null) goto L24;
        return false;
    L24:
        if (this.g != null) goto L46;
        if (r5.g == null) goto L28;
        return false;
    L28:
        if (this.i != null) goto L49;
        if (r5.i == null) goto L32;
        return false;
    L32:
        if (this.j != null) goto L52;
        if (r5.j != null) goto L62;
    L35:
        return true;
    L62:
        return false;
    L52:
        if (this.j.equals(r5.j) == true) goto L35;
        return false;
    L49:
        if (this.i.equals(r5.i) == true) goto L32;
        return false;
    L46:
        if (this.g.equals(r5.g) == true) goto L28;
        return false;
    L43:
        if (this.f.equals(r5.f) == true) goto L24;
        return false;
    L40:
        if (this.e.equals(r5.e) == true) goto L20;
        return false;
    L37:
        if (this.d.equals(r5.d) == true) goto L16;
        return false;
    L54:
        return false;
    }

    public int hashCode() {
        int r1 = 0;
        int r2 = this.c ^ this.b;
        if (this.d != null) goto L21;
        int r0 = 0;
    L5:
        int r3 = r2 ^ r0;
        if (this.e != null) goto L22;
        int r4 = 0;
    L8:
        int r5 = r3 ^ r4;
        if (this.f != null) goto L23;
        int r6 = 0;
    L11:
        int r7 = r5 ^ r6;
        if (this.g != null) goto L24;
        int r8 = 0;
    L14:
        int r9 = r7 ^ r8;
        if (this.i != null) goto L25;
        int r10 = 0;
    L17:
        int r11 = r10 ^ r9;
        if (this.j == null) goto L20;
        r1 = this.j.hashCode();
    L20:
        return r11 ^ r1;
    L25:
        r10 = this.i.hashCode();
        goto L17
    L24:
        r8 = this.g.hashCode();
        goto L14
    L23:
        r6 = this.f.hashCode();
        goto L11
    L22:
        r4 = this.e.hashCode();
        goto L8
    L21:
        r0 = this.d.hashCode();
        goto L5
    }
}
