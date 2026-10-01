package a.a;

public class e {

    public a.b.k f5a;
    public int b;
    public a.b.a.b c;
    public java.lang.String d;
    public java.lang.String[] e;
    public java.lang.String[] f;
    public java.lang.String g;
    public java.lang.String h;
    public int i;
    public java.lang.String j;
    public java.lang.String k;
    public java.lang.String l;
    public a.b.c m;
    public a.b.j n;
    public a.b.k o;

    public e(a.b.k r1, int r2, a.b.a.b r3, java.lang.String r4, java.lang.String[] r5, java.lang.String[] r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, a.b.c r13, a.b.j r14) {
        this.f5a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
        this.k = r11;
        this.l = r12;
        this.m = r13;
        this.n = r14;
    }

    public java.lang.String a() {
        return java.lang.String.format("%s$$Lambda$%d", new java.lang.Object[]{this.f5a.b(), java.lang.Integer.valueOf(this.b)});
    }

    public java.lang.String b() {
        if (d() == false) goto L7;
        return "()V";
    L7:
        return this.d.substring(0, this.d.indexOf(41) + 1) + 'V';
    }

    public boolean c() {
        java.lang.String[] r2 = this.e;
        int r3 = r2.length;
        int r1 = 0;
    L3:
        if (r1 >= r3) goto L11;
        if ("java/io/Serializable".equals(r2[r1]) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return true;
    L11:
        return false;
    }

    public boolean d() {
        if (a.b.f.i.t(this.d) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean e() {
        if (this.i == 6) goto L5;
    L10:
        return false;
    L5:
        if (this.m == null) goto L10;
        if ((this.m.a() & 512) == 0) goto L10;
        return true;
    }

    public boolean f() {
        if (this.m != null) goto L5;
    L8:
        return false;
    L5:
        if (new a.b.f.r().a(this.o, this.m, this.k, this.l) != null) goto L8;
        return true;
    }
}
