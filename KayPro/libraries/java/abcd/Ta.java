package abcd;

@abcd.Interfacexu
public class Ta {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -4408429266308845455L)
    private java.util.Map<abcd.Sa, abcd.Cb> FH;

    @abcd.Interfaceru(field = 2426137970212272804L)
    private java.util.Map<abcd.Sa, abcd.qb> Hw;

    static {
        abcd.wu.j6(abcd.Ta.class, 96016040932816416L, 96016040932816416L);
    }

    public Ta() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -873453566750144912L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-873453566750144912L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        this.Hw = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -2413201307543230776L)
    private void Zo(abcd.Sa r8, int r9) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 1052038899316812672L, this, r8, new java.lang.Integer(r9));
    L17:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1052038899316812672L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L12
    L5:
        int r0 = r8.we(r9);     // Catch: java.lang.Throwable -> L12
        if (r0 <= 0) goto L10;
        int r1 = 0;
    L8:
        if (r1 >= r0) goto L21;
        Zo(r8, r8.Zo(r9, r1));     // Catch: java.lang.Throwable -> L12
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L12
        goto L8
    L21:
        return;
    L10:
        j6(r8, r9);     // Catch: java.lang.Throwable -> L12
    }

    public int DW(abcd.Sa r8, int r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 1277736828765881303L, this, r8, new java.lang.Integer(r9));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(1277736828765881303L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L17
    L6:
        if (this.Hw.containsKey(r8) == false) goto L16;
        abcd.qb r0 = this.Hw.get(r8);     // Catch: java.lang.Throwable -> L17
        abcd.Cb r1 = this.FH.get(r8);     // Catch: java.lang.Throwable -> L17
        if (r0.j6(r9) == false) goto L12;
        return r1.DW(r0.DW(r9) + 4);
    L12:
        if (r8.we(r9) <= 0) goto L16;
        return DW(r8, r8.Zo(r9, r8.we(r9) - 1));
    L16:
        return r8.Ws(r9);
    }

    public void DW(int r9, int r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -283645023438969500L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-283645023438969500L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r9, r10, -r11);     // Catch: java.lang.Throwable -> L7
    }

    public int FH(abcd.Sa r8, int r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 1140192021243084387L, this, r8, new java.lang.Integer(r9));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(1140192021243084387L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L17
    L6:
        if (this.Hw.containsKey(r8) == false) goto L16;
        abcd.qb r0 = this.Hw.get(r8);     // Catch: java.lang.Throwable -> L17
        abcd.Cb r1 = this.FH.get(r8);     // Catch: java.lang.Throwable -> L17
        if (r0.j6(r9) == false) goto L12;
        return r1.DW(r0.DW(r9) + 3);
    L12:
        if (r8.we(r9) <= 0) goto L16;
        return FH(r8, r8.Zo(r9, r8.we(r9) - 1));
    L16:
        return r8.QX(r9);
    }

    public int Hw(abcd.Sa r8, int r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 3681006031549009852L, this, r8, new java.lang.Integer(r9));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(3681006031549009852L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L17
    L6:
        if (this.Hw.containsKey(r8) == false) goto L16;
        abcd.qb r0 = this.Hw.get(r8);     // Catch: java.lang.Throwable -> L17
        abcd.Cb r1 = this.FH.get(r8);     // Catch: java.lang.Throwable -> L17
        if (r0.j6(r9) == false) goto L12;
        return r1.DW(r0.DW(r9) + 2);
    L12:
        if (r8.we(r9) <= 0) goto L16;
        return Hw(r8, r8.Zo(r9, 0));
    L16:
        return r8.BT(r9);
    }

    public int j6(int r7) {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -757305739484004480L, this, new java.lang.Integer(r7));
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-757305739484004480L, this, r7);     // Catch: java.lang.Throwable -> L15
    L6:
        java.util.Iterator<java.util.Map.Entry<abcd.Sa, abcd.qb>> r2 = this.Hw.entrySet().iterator();     // Catch: java.lang.Throwable -> L15
    L8:
        if (r2.hasNext() == false) goto L13;
        abcd.Sa r3 = r2.next().getKey();     // Catch: java.lang.Throwable -> L15
        abcd.qb r4 = this.Hw.get(r3);     // Catch: java.lang.Throwable -> L15
        abcd.Cb r5 = this.FH.get(r3);     // Catch: java.lang.Throwable -> L15
        if (r4.j6(r7) == false) goto L8;
        return r5.DW(r4.DW(r7) + 3);
    L13:
        return 0;
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -214772319762607887L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-214772319762607887L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.clear();     // Catch: java.lang.Throwable -> L8
        this.Hw.clear();     // Catch: java.lang.Throwable -> L8
    }

    public void j6(int r12, int r13) {
    L26:
        th = move-exception;
        if (DW == false) goto L31;
        abcd.wu.j6(th, -3395920819695763320L, this, new java.lang.Integer(r12), new java.lang.Integer(r13));
    L31:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3395920819695763320L, this, new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L26
    L5:
        java.util.Iterator<java.util.Map.Entry<abcd.Sa, abcd.qb>> r0 = this.Hw.entrySet().iterator();     // Catch: java.lang.Throwable -> L26
    L6:
        if (r0.hasNext() == false) goto L25;
        abcd.Sa r1 = r0.next().getKey();     // Catch: java.lang.Throwable -> L26
        abcd.Cb r2 = this.FH.get(r1);     // Catch: java.lang.Throwable -> L26
        int r3 = 0;
    L10:
        if (r3 >= r2.Hw()) goto L6;
        int r4 = r3 + 1;     // Catch: java.lang.Throwable -> L26
        int r5 = r2.DW(r4);     // Catch: java.lang.Throwable -> L26
        int r6 = r3 + 2;     // Catch: java.lang.Throwable -> L26
        int r7 = r2.DW(r6);     // Catch: java.lang.Throwable -> L26
        int r8 = r3 + 3;     // Catch: java.lang.Throwable -> L26
        int r9 = r2.DW(r8);     // Catch: java.lang.Throwable -> L26
        int r10 = r3 + 4;     // Catch: java.lang.Throwable -> L26
        int r11 = r2.DW(r10);     // Catch: java.lang.Throwable -> L26
        if (r9 < r12) goto L24;
        if (r5 <= r12) goto L16;
        r2.j6(r4, r5 + 1);     // Catch: java.lang.Throwable -> L26
    L19:
        if (r9 <= r12) goto L21;
        r2.j6(r8, r9 + 1);     // Catch: java.lang.Throwable -> L26
        goto L24
    L21:
        if (r9 != r12) goto L24;
        if (r11 <= r13) goto L24;
        r2.j6(r8, r9 + 1);     // Catch: java.lang.Throwable -> L26
        r2.j6(r10, (r11 - r13) + 1);     // Catch: java.lang.Throwable -> L26
        goto L24
    L16:
        if (r5 != r12) goto L19;
        if (r7 < r13) goto L19;
        r2.j6(r4, r5 + 1);     // Catch: java.lang.Throwable -> L26
        r2.j6(r6, (r7 - r13) + 1);     // Catch: java.lang.Throwable -> L26
    L24:
        r3 = r3 + 5;
        goto L10
    }

    public void j6(int r9, int r10, int r11) {
    L23:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, 2162255955349383045L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
    L28:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2162255955349383045L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L23
    L5:
        java.util.Iterator<java.util.Map.Entry<abcd.Sa, abcd.qb>> r0 = this.Hw.entrySet().iterator();     // Catch: java.lang.Throwable -> L23
    L6:
        if (r0.hasNext() == false) goto L22;
        abcd.Sa r1 = r0.next().getKey();     // Catch: java.lang.Throwable -> L23
        abcd.qb r2 = this.Hw.get(r1);     // Catch: java.lang.Throwable -> L23
        abcd.Cb r3 = this.FH.get(r1);     // Catch: java.lang.Throwable -> L23
        int r4 = 0;
    L10:
        if (r4 >= r3.Hw()) goto L6;
        if (r3.DW(r4 + 1) != r9) goto L17;
        int r5 = r4 + 2;     // Catch: java.lang.Throwable -> L23
        if (r3.DW(r5) < r10) goto L17;
        r3.j6(r5, r3.DW(r5) + r11);     // Catch: java.lang.Throwable -> L23
    L17:
        if (r3.DW(r4 + 3) != r9) goto L21;
        int r6 = r4 + 4;     // Catch: java.lang.Throwable -> L23
        if (r3.DW(r6) <= r10) goto L21;
        r3.j6(r6, r3.DW(r6) + r11);     // Catch: java.lang.Throwable -> L23
    L21:
        r4 = r4 + 5;
        goto L10
    }

    public void j6(int r10, int r11, int r12, int r13) {
    L21:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, -2809025266160866140L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L26:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2809025266160866140L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L21
    L5:
        if (r10 != r12) goto L7;
        DW(r10, r11, r13 - r11);     // Catch: java.lang.Throwable -> L21
        return;
    L7:
        DW(r12, 1, r13 - r11);     // Catch: java.lang.Throwable -> L21
        java.util.Iterator<java.util.Map.Entry<abcd.Sa, abcd.qb>> r0 = this.Hw.entrySet().iterator();     // Catch: java.lang.Throwable -> L21
    L9:
        if (r0.hasNext() == false) goto L33;
        abcd.Sa r1 = r0.next().getKey();     // Catch: java.lang.Throwable -> L21
        abcd.qb r2 = this.Hw.get(r1);     // Catch: java.lang.Throwable -> L21
        abcd.Cb r3 = this.FH.get(r1);     // Catch: java.lang.Throwable -> L21
        int r4 = 0;
    L12:
        if (r4 >= r3.Hw()) goto L9;
        int r5 = r4 + 1;     // Catch: java.lang.Throwable -> L21
        if (r3.DW(r5) <= r10) goto L16;
        r3.j6(r5, r3.DW(r5) - (r12 - r10));     // Catch: java.lang.Throwable -> L21
    L16:
        int r6 = r4 + 3;     // Catch: java.lang.Throwable -> L21
        if (r3.DW(r6) <= r10) goto L19;
        r3.j6(r6, r3.DW(r6) - (r12 - r10));     // Catch: java.lang.Throwable -> L21
    L19:
        r4 = r4 + 5;
        goto L12
    }

    public void j6(int r11, int r12, int r13, int r14, int r15) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 3205626306066977772L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(3205626306066977772L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L10
    L6:
        if (this.Hw.containsKey(null) == true) goto L8;
        this.Hw.put(null, new abcd.qb());     // Catch: java.lang.Throwable -> L10
        this.FH.put(null, new abcd.Cb());     // Catch: java.lang.Throwable -> L10
    L8:
        abcd.qb r0 = this.Hw.get(null);     // Catch: java.lang.Throwable -> L10
        abcd.Cb r1 = this.FH.get(null);     // Catch: java.lang.Throwable -> L10
        r0.j6(r11, r1.Hw());     // Catch: java.lang.Throwable -> L10
        r1.FH(r11);     // Catch: java.lang.Throwable -> L10
        r1.FH(r12);     // Catch: java.lang.Throwable -> L10
        r1.FH(r13);     // Catch: java.lang.Throwable -> L10
        r1.FH(r14);     // Catch: java.lang.Throwable -> L10
        r1.FH(r15);     // Catch: java.lang.Throwable -> L10
    }

    public void j6(int r7, int r8, int r9, int r10, int r11, int r12) {
        if (j6 == false) goto L5;
        abcd.wu.j6(-4984097205316103937L, this, new java.lang.Object[]{new java.lang.Integer(r7), new java.lang.Integer(r8), new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12)});
    L5:
        if (r9 != r11) goto L7;
        j6(r7, r8, r12 - r10);
        return;
    L7:
        j6(r7, r8, r12 - 1);
    L8:
        if (r9 >= r11) goto L12;
        j6(r7, r8);
        r9 = r9 + 1;
        goto L8
    }

    public void j6(int r11, int r12, int r13, int r14, java.lang.String r15) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 4866245994654730920L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), r15);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4866245994654730920L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), r15);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L7
        j6(r11, r12, r15);     // Catch: java.lang.Throwable -> L7
    }

    public void j6(int r9, int r10, java.lang.String r11) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -2594195630149333344L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);
    L24:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2594195630149333344L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L19
    L6:
        if (r11.lastIndexOf(10) != (-1)) goto L8;
        j6(r9, r10, r11.length());     // Catch: java.lang.Throwable -> L19
        return;
    L8:
        j6(r9, r10, (r11.length() - r11.lastIndexOf(10)) - 1);     // Catch: java.lang.Throwable -> L19
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L10:
        if (r2 >= r11.length()) goto L15;
        if (r11.charAt(r2) != '\n') goto L14;
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L19
    L14:
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L19
    L15:
        if (r1 >= r3) goto L31;
        j6(r9, r10);     // Catch: java.lang.Throwable -> L19
        r1 = r1 + 1;
        goto L15
    }

    public void j6(abcd.Sa r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -6826933370259925461L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6826933370259925461L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        Zo(r5, r5.aM());     // Catch: java.lang.Throwable -> L8
    }

    public void j6(abcd.Sa r8, int r9) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1221348338000899797L, this, r8, new java.lang.Integer(r9));
    L17:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1221348338000899797L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L13
    L6:
        if (this.Hw.containsKey(r8) == true) goto L8;
        this.Hw.put(r8, new abcd.qb());     // Catch: java.lang.Throwable -> L13
        this.FH.put(r8, new abcd.Cb());     // Catch: java.lang.Throwable -> L13
    L8:
        abcd.qb r0 = this.Hw.get(r8);     // Catch: java.lang.Throwable -> L13
        abcd.Cb r1 = this.FH.get(r8);     // Catch: java.lang.Throwable -> L13
        if (r0.j6(r9) == false) goto L11;
        return;
    L11:
        r0.j6(r9, r1.Hw());     // Catch: java.lang.Throwable -> L13
        r1.FH(r9);     // Catch: java.lang.Throwable -> L13
        r1.FH(r8.vy(r9));     // Catch: java.lang.Throwable -> L13
        r1.FH(r8.BT(r9));     // Catch: java.lang.Throwable -> L13
        r1.FH(r8.QX(r9));     // Catch: java.lang.Throwable -> L13
        r1.FH(r8.Ws(r9));     // Catch: java.lang.Throwable -> L13
    }

    public void j6(java.util.List<abcd.Sa> r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 372526027980523928L, this, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(372526027980523928L, this, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.Iterator<abcd.Sa> r2 = r5.iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r2.hasNext() == false) goto L11;
        j6(r2.next());     // Catch: java.lang.Throwable -> L12
        goto L7
    }

    public int v5(abcd.Sa r8, int r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -2334318062169731040L, this, r8, new java.lang.Integer(r9));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2334318062169731040L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L17
    L6:
        if (this.Hw.containsKey(r8) == false) goto L16;
        abcd.qb r0 = this.Hw.get(r8);     // Catch: java.lang.Throwable -> L17
        abcd.Cb r1 = this.FH.get(r8);     // Catch: java.lang.Throwable -> L17
        if (r0.j6(r9) == false) goto L12;
        return r1.DW(r0.DW(r9) + 1);
    L12:
        if (r8.we(r9) <= 0) goto L16;
        return v5(r8, r8.Zo(r9, 0));
    L16:
        return r8.vy(r9);
    }
}
