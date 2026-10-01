package a;

public class ae {

    public int f14a;
    public int b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.util.List f;

    public ae() {
        this(0, 0, null, null, null);
    }

    public ae(int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        this.f = null;
        this.f14a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
    }

    public boolean equals(java.lang.Object r4) {
        if (r4 != null) goto L5;
        return false;
    L5:
        if (getClass() != r4.getClass()) goto L33;
        a.ae r5 = (a.ae) r4;
        if (this.f14a == r5.f14a) goto L10;
        return false;
    L10:
        if (this.b == r5.b) goto L12;
        return false;
    L12:
        if (this.c != null) goto L25;
        if (r5.c == null) goto L16;
        return false;
    L16:
        if (this.d != null) goto L28;
        if (r5.d == null) goto L20;
        return false;
    L20:
        if (this.e != null) goto L31;
        if (r5.e != null) goto L38;
    L23:
        return true;
    L38:
        return false;
    L31:
        if (this.e.equals(r5.e) == true) goto L23;
        return false;
    L28:
        if (this.d.equals(r5.d) == true) goto L20;
        return false;
    L25:
        if (this.c.equals(r5.c) == true) goto L16;
        return false;
    L33:
        return false;
    }

    public int hashCode() {
        int r1 = 0;
        int r2 = this.b ^ this.f14a;
        if (this.c != null) goto L12;
        int r0 = 0;
    L5:
        int r3 = r2 ^ r0;
        if (this.d != null) goto L13;
        int r4 = 0;
    L8:
        int r5 = r4 ^ r3;
        if (this.e == null) goto L11;
        r1 = this.e.hashCode();
    L11:
        return r5 ^ r1;
    L13:
        r4 = this.d.hashCode();
        goto L8
    L12:
        r0 = this.c.hashCode();
        goto L5
    }
}
