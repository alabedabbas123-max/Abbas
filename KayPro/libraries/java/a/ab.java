package a;

public class ab extends a.g {

    private final boolean f11a;
    private final boolean b;
    private final boolean c;

    public ab(boolean r1, boolean r2, boolean r3) {
        this.f11a = r1;
        this.b = r2;
        this.c = r3;
    }

    private a.b.g.n a(a.aa r13, a.b.g.s r14, a.b.g.aq r15, a.b.g.aq r16, a.b.a.d.i r17, java.util.List r18) {
        if (r13.l == false) goto L7;
        a.b.g.at r11 = new a.b.g.at();
        a.b.g.n r10 = a(r13, r11, new java.util.ArrayList(r18));
        r11.a(a(r13.h, r13.i, r13.j, r14, r15, r16, r17, r18));
        return r10;
    L7:
        return super.a(r13, r14, r15, r16, r17, r18);
    }

    public a.b.g.n a(a.aa r10, a.b.g.s r11, a.b.g.aq r12, a.b.g.aq r13, a.b.a.d.i r14) {
        java.util.ArrayList r6 = new java.util.ArrayList();
        if (r10.m == false) goto L27;
        if (r11 == null) goto L27;
        if (r12 != null) goto L22;
        a.b.g.aq r15 = new a.b.g.an(r11);
    L7:
        if (r13 != null) goto L23;
        a.b.g.aq r0 = new a.b.g.an(r11);
    L9:
        a.b.g.aq r4 = r0;
        a.b.g.aq r3 = r15;
    L11:
        if (r10.k == false) goto L13;
    L26:
        a.b.g.s r2 = r11;
    L16:
        if (r10.n == false) goto L24;
        a.b.a.d.g r5 = new a.b.a.d.g("Code", r14);
    L18:
        a.f r1 = r10.r;
        if (r1 == null) goto L28;
        a.b.g.as r8 = new a.b.g.as();
        a.b.g.n r7 = a(r1, r8, r6);
        r8.a(a(r10, r2, r3, r4, r5, r6));
        return r7;
    L28:
        return a(r10, r2, r3, r4, r5, r6);
    L24:
        r5 = null;
        goto L18
    L13:
        if (r10.l == true) goto L26;
        r2 = null;
        goto L16
    L23:
        r0 = new a.b.g.av(new a.b.g.aq[]{r13, new a.b.g.an(r11)});
        goto L9
    L22:
        r15 = new a.b.g.av(new a.b.g.aq[]{r12, new a.b.g.an(r11)});
    L27:
        r4 = r13;
        r3 = r12;
        goto L11
    }

    @Override
    public a.b.g.n a(java.util.List r9, a.b.g.s r10, a.b.g.aq r11, a.b.g.aq r12, a.b.a.d.i r13) {
        a.b.g.as r7 = new a.b.g.as();
        if (r9 == null) goto L21;
        int r0 = 0;
    L5:
        int r6 = r0;
        if (r6 >= r9.size()) goto L21;
        a.aa r1 = (a.aa) r9.get(r6);
        if (this.f11a == false) goto L12;
        if (r1.o == true) goto L12;
    L19:
        r7.a(a(r1, r10, r11, r12, r13));
    L20:
        r0 = r6 + 1;
    L12:
        if (this.b == false) goto L16;
        if (r1.p == false) goto L19;
    L16:
        if (this.c == false) goto L20;
        if (r1.q == true) goto L20;
    L21:
        return r7;
    }
}
