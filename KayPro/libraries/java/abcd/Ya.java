package abcd;

@abcd.Interfacexu
public class Ya extends abcd.AbstractAa {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = -1541761228820740032L)
    private final abcd.C0085Ba gn;

    @abcd.Interfaceru(field = 108073525200960352L)
    private int u7;

    static {
        abcd.wu.j6(abcd.Ya.class, -4577603281820369208L, -4577603281820369208L);
    }

    @abcd.Interfacesu(method = -1386101709857685L)
    protected Ya(abcd.C0133Ea r8, abcd.C0085Ba r9) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, 1450301756344583936L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(1450301756344583936L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        this.gn = r9;     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 1136331645086119440L)
    protected Ya(abcd.C0133Ea r9, abcd.C0085Ba r10, int r11) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, 396193940350913493L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(396193940350913493L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10);     // Catch: java.lang.Throwable -> L7
        this.gn = r10;     // Catch: java.lang.Throwable -> L7
        this.u7 = r11;     // Catch: java.lang.Throwable -> L7
    }

    public abcd.Ya DW(abcd.Da r16, abcd.Interfacena r17, int r18, boolean r19, abcd.C1381ua r20, Yb<abcd.C0197Ia> r21) {
        if (Zo == false) goto L6;
        abcd.wu.j6(-1037000693900011832L, this, new java.lang.Object[]{r16, r17, new java.lang.Integer(r18), new java.lang.Boolean(r19), r20, r21});
    L6:
        r21.j6();
        if (P8() == false) goto L54;
        if (((abcd.C0292Oa) this).aj().DW(r16, r17, r18, r19, r20, r21) != null) goto L11;
        return null;
    L11:
        return this;
    L54:
        if (lg() == false) goto L17;
        abcd.C1381ua r6 = this.gn.Hw(r16, r17);     // Catch: abcd.jc -> L49
        return r6.DW(r16, r17, r18, r19, r6, r21);
    L17:
        if (ei() == false) goto L30;
        abcd.C0308Pa r13 = (abcd.C0308Pa) this;
        if (r13.Qq() == 1) goto L21;
        int r14 = 0;
    L24:
        if (r14 >= r13.Qq()) goto L46;
        abcd.Ya r1 = ((abcd.C0308Pa) this).j6(r14).DW(r16, r17, r18, r19, r20, r21);     // Catch: abcd.jc -> L47
        if (r1 == null) goto L28;
        return r1;
    L28:
        r14 = r14 + 1;
        goto L24
    L21:
        return sh().DW(r16, r17, r18, r19, r20, r21);
    L30:
        if (gW() == false) goto L43;
        abcd.C0212Ja r15 = (abcd.C0212Ja) this;
        if (r15.x9() == 1) goto L34;
        int r110 = 0;
    L37:
        if (r110 >= r15.x9()) goto L46;
        abcd.Ya r2 = ((abcd.C0212Ja) this).j6(r110).DW(r16, r17, r18, r19, r20, r21);     // Catch: abcd.jc -> L48
        if (r2 == null) goto L41;
        return r2;
    L41:
        r110 = r110 + 1;
        goto L37
    L34:
        return sh().DW(r16, r17, r18, r19, r20, r21);
    L43:
        if (BT() == false) goto L46;
        return ((abcd.C0228Ka) this).x9().DW(r16, r17, r18, r19, r20, r21);
    L46:
        return null;
    }

    public boolean DW(abcd.Da r9, abcd.Interfacena r10, abcd.Ya r11) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, 282574458505998252L, this, r9, r10, r11);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(282574458505998252L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    L5:
        return this.gn.j6(r9, r10, this, r11);
    }

    public boolean DW(abcd.Ya r8) {
    L25:
        th = move-exception;
        if (VH == false) goto L29;
        abcd.wu.j6(th, -1047988397835713675L, this, r8);
    L29:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(-1047988397835713675L, this, r8);     // Catch: java.lang.Throwable -> L25
    L7:
        if (this != r8) goto L10;
        return true;
    L10:
        if (dx() == 16) goto L15;
        if (dx() != r8.dx()) goto L15;
        return true;
    L15:
        if (lg() == true) goto L17;
        return false;
    L17:
        if (r8.lg() == false) goto L32;
        abcd.C1296sa r3 = (abcd.C1296sa) this;     // Catch: java.lang.Throwable -> L25
        abcd.C1296sa r4 = (abcd.C1296sa) r8;     // Catch: java.lang.Throwable -> L25
        if (r3.Qq() != r4.Qq()) goto L33;
        if (r3.sy().DW(r4.sy()) == false) goto L34;
        return true;
    L34:
        return false;
    L33:
        return false;
    L32:
        return false;
    }

    public boolean DW(abcd.Ya r9, abcd.C0197Ia r10, abcd.C0197Ia r11) {
    L44:
        th = move-exception;
        if (VH == false) goto L49;
        abcd.wu.j6(th, -2980722199022127L, this, r9, r10, r11);
    L49:
        throw th;
    L3:
        if (Zo == false) goto L6;
        abcd.wu.j6(-2980722199022127L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L44
    L6:
        if (this != r9) goto L9;
        return true;
    L9:
        if (gW() == false) goto L20;
        if (r9.gW() == false) goto L20;
        if (((abcd.C0212Ja) this).Qq() == r10) goto L15;
    L43:
        return false;
    L15:
        if (((abcd.C0212Ja) r9).Qq() != r11) goto L43;
        if (((abcd.C0212Ja) this).sy() != ((abcd.C0212Ja) r9).sy()) goto L43;
        return true;
    L20:
        if (lg() == false) goto L29;
        if (r9.lg() == false) goto L29;
        if (((abcd.C1296sa) this).Qq() == ((abcd.C1296sa) r9).Qq()) goto L27;
        return false;
    L27:
        return ((abcd.C1296sa) this).sy().DW(((abcd.C1296sa) r9).sy(), r10, r11);
    L29:
        if (P8() == false) goto L43;
        if (r9.P8() == false) goto L43;
        if (((abcd.C0292Oa) this).aj().v5(((abcd.C0292Oa) r9).aj()) == true) goto L35;
        return false;
    L35:
        abcd.Ya[] r1 = ((abcd.C0292Oa) this).x9();     // Catch: java.lang.Throwable -> L44
        abcd.Ya[] r3 = ((abcd.C0292Oa) r9).x9();     // Catch: java.lang.Throwable -> L44
        int r4 = 0;
    L37:
        if (r4 >= r1.length) goto L42;
        if (r1[r4].j6(r3[r4], r10, r11) == false) goto L40;
        r4 = r4 + 1;
        goto L37
    L40:
        return false;
    L42:
        return true;
    }

    public abcd.Ya FH(abcd.Da r13, abcd.Interfacena r14, int r15, boolean r16, abcd.C1381ua r17, Yb<abcd.C0197Ia> r18) {
        if (Zo == false) goto L9;
        abcd.wu.j6(101381141870867136L, this, new java.lang.Object[]{r13, r14, new java.lang.Integer(r15), new java.lang.Boolean(r16), r17, r18});
    L9:
        abcd.Ya r5 = sG();     // Catch: abcd.jc -> L8
        r5.j6(r13, r14, r15, r16, (abcd.C1381ua) r5.sh(), r18);     // Catch: abcd.jc -> L8
    L7:
        return this;
    }

    public boolean FH(abcd.Da r9, abcd.Interfacena r10, abcd.Ya r11) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, -73380670447637785L, this, r9, r10, r11);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(-73380670447637785L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    L5:
        return this.gn.DW(r9, r10, this, r11);
    }

    public abcd.Ya Hw(abcd.Da r13, abcd.Interfacena r14, int r15, boolean r16, abcd.C1381ua r17, Yb<abcd.C0197Ia> r18) {
        if (Zo == false) goto L9;
        abcd.wu.j6(-2011361891969323907L, this, new java.lang.Object[]{r13, r14, new java.lang.Integer(r15), new java.lang.Boolean(r16), r17, r18});
    L9:
        abcd.Ya r5 = sG();     // Catch: abcd.jc -> L8
        r5.DW(r13, r14, r15, r16, (abcd.C1381ua) r5.sh(), r18);     // Catch: abcd.jc -> L8
    L7:
        return this;
    }

    public boolean Hw(abcd.Da r11, abcd.Interfacena r12, abcd.Ya r13) {
    L80:
        th = move-exception;
        if (VH == false) goto L85;
        abcd.wu.j6(th, -4624206117923033733L, this, r11, r12, r13);
    L85:
        throw th;
    L3:
        if (Zo == false) goto L6;
        abcd.wu.j6(-4624206117923033733L, this, r11, r12, r13);     // Catch: java.lang.Throwable -> L80
    L6:
        if (rN() == false) goto L8;
        Yb<abcd.Ya> r0 = ((abcd.C1381ua) this).Xa();     // Catch: java.lang.Throwable -> L80
    L10:
        if (r0.j6(r13) == false) goto L12;
        return true;
    L12:
        r0.Hw.DW();     // Catch: java.lang.Throwable -> L80
    L90:
        if (r0.Hw.j6() == false) goto L79;
        abcd.Ya r3 = (abcd.Ya) r0.Hw.FH();     // Catch: abcd.jc -> L87 java.lang.Throwable -> L80
        if (r3.P8() == false) goto L90;
        if (r13.P8() == false) goto L90;
        if (((abcd.C0292Oa) r3).aj() != ((abcd.C0292Oa) r13).aj()) goto L90;
        int[] r1 = ((abcd.C0292Oa) r3).Qq();     // Catch: abcd.jc -> L87 java.lang.Throwable -> L80
        int[] r4 = ((abcd.C0292Oa) r13).Qq();     // Catch: abcd.jc -> L87 java.lang.Throwable -> L80
        abcd.Ya[] r5 = ((abcd.C0292Oa) r3).x9();     // Catch: abcd.jc -> L87 java.lang.Throwable -> L80
        abcd.Ya[] r6 = ((abcd.C0292Oa) r13).x9();     // Catch: abcd.jc -> L87 java.lang.Throwable -> L80
        int r7 = 0;
    L23:
        if (r7 >= r4.length) goto L78;
        int r8 = r1[r7];     // Catch: abcd.jc -> L87 java.lang.Throwable -> L80
        if (r8 == 0) goto L62;
        if (r8 == 1) goto L53;
        if (r8 == 2) goto L43;
        if (r8 != 3) goto L77;
        int r9 = r4[r7];     // Catch: abcd.jc -> L87 java.lang.Throwable -> L80
        if (r9 == 0) goto L42;
        if (r9 == 1) goto L41;
        if (r9 == 2) goto L41;
        if (r9 != 3) goto L77;
        if (r6[r7].FH(r11, r12, r5[r7]) == true) goto L77;
        return false;
    L41:
        if (r6[r7] == this.gn.v5(r11, r12)) goto L77;
    L42:
        return false;
    L77:
        r7 = r7 + 1;
        goto L23
    L43:
        int r10 = r4[r7];     // Catch: abcd.jc -> L87 java.lang.Throwable -> L80
        if (r10 == 0) goto L52;
        if (r10 == 1) goto L51;
        if (r10 == 2) goto L51;
        if (r10 != 3) goto L77;
        return false;
    L51:
        if (r5[r7].FH(r11, r12, r6[r7]) == true) goto L77;
    L52:
        return false;
    L53:
        int r14 = r4[r7];     // Catch: abcd.jc -> L87 java.lang.Throwable -> L80
        if (r14 == 0) goto L61;
        if (r14 == 2) goto L60;
        if (r14 != 3) goto L77;
        return false;
    L60:
        if (r5[r7].FH(r11, r12, r6[r7]) == true) goto L77;
    L61:
        return false;
    L62:
        int r15 = r4[r7];     // Catch: abcd.jc -> L87 java.lang.Throwable -> L80
        if (r15 == 0) goto L75;
        if (r15 == 1) goto L72;
        if (r15 == 2) goto L72;
        if (r15 != 3) goto L77;
        if (r6[r7].FH(r11, r12, r5[r7]) == true) goto L77;
        return false;
    L72:
        if (r5[r7].FH(r11, r12, r6[r7]) == true) goto L77;
        return false;
    L75:
        if (r5[r7].DW(r6[r7]) == true) goto L77;
        return false;
    L78:
        return true;
    L79:
        return false;
    L8:
        r0 = ((abcd.C0292Oa) this).sy();     // Catch: java.lang.Throwable -> L80
        goto L10
    }

    public boolean I() {
    L13:
        th = move-exception;
        if (VH == false) goto L17;
        abcd.wu.j6(th, 3786484008820160320L, this);
    L17:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(3786484008820160320L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (rN() == false) goto L11;
        if (((abcd.C1381ua) this).jw() <= 0) goto L11;
        return true;
    L11:
        return false;
    }

    public boolean Mz() {
    L17:
        th = move-exception;
        if (VH == false) goto L22;
        abcd.wu.j6(th, -5547227514440503725L, this);
    L22:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(-5547227514440503725L, this);     // Catch: java.lang.Throwable -> L17
    L7:
        if (P8() == false) goto L16;
        int[] r2 = ((abcd.C0292Oa) this).Qq();     // Catch: java.lang.Throwable -> L17
        int r4 = 0;
    L9:
        if (r4 >= r2.length) goto L16;
        if (r2[r4] != 0) goto L13;
        r4 = r4 + 1;
        goto L9
    L13:
        return true;
    L16:
        return false;
    }

    public boolean Sf() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 18459360761337573L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L15;
        abcd.wu.j6(18459360761337573L, this);     // Catch: java.lang.Throwable -> L8
        return false;
    L15:
        return false;
    }

    public boolean ca() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -2544422229701644464L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L15;
        abcd.wu.j6(-2544422229701644464L, this);     // Catch: java.lang.Throwable -> L8
        return false;
    L15:
        return false;
    }

    public abcd.Ya cb() {
    L26:
        th = move-exception;
        if (VH == false) goto L31;
        abcd.wu.j6(th, 962144518704111269L, this);
    L31:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(962144518704111269L, this);     // Catch: java.lang.Throwable -> L26
    L7:
        if (cn() == true) goto L10;
        return this;
    L10:
        if (BT() == false) goto L14;
        return ((abcd.C0228Ka) this).x9().sh();
    L14:
        if (lg() == false) goto L18;
        return this.gn.j6(((abcd.C1296sa) this).sy().cb(), ((abcd.C1296sa) this).Qq());
    L18:
        if (P8() == false) goto L25;
        abcd.Ya[] r2 = ((abcd.C0292Oa) this).x9();     // Catch: java.lang.Throwable -> L26
        int[] r3 = ((abcd.C0292Oa) this).Qq();     // Catch: java.lang.Throwable -> L26
        abcd.Ya[] r4 = new abcd.Ya[r2.length];     // Catch: java.lang.Throwable -> L26
        int r5 = 0;
    L21:
        if (r5 >= r2.length) goto L24;
        r4[r5] = r2[r5].cb();     // Catch: java.lang.Throwable -> L26
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L26
        goto L21
    L24:
        return this.gn.j6(((abcd.C0292Oa) this).aj(), r4, r3);
    L25:
        return this;
    }

    public boolean cn() {
    L23:
        th = move-exception;
        if (VH == false) goto L28;
        abcd.wu.j6(th, 4564526607867477375L, this);
    L28:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(4564526607867477375L, this);     // Catch: java.lang.Throwable -> L23
    L7:
        if (BT() == false) goto L10;
        return true;
    L10:
        if (lg() == false) goto L14;
        return ((abcd.C1296sa) this).sy().cn();
    L14:
        if (P8() == false) goto L22;
        abcd.Ya[] r2 = ((abcd.C0292Oa) this).x9();     // Catch: java.lang.Throwable -> L23
        int r5 = 0;
    L17:
        if (r5 >= r2.length) goto L22;
        if (r2[r5].cn() == true) goto L20;
        r5 = r5 + 1;
        goto L17
    L20:
        return true;
    L22:
        return false;
    }

    public int dx() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 2793893587266670400L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(2793893587266670400L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.u7;
    }

    public boolean ef() {
    L17:
        th = move-exception;
        if (VH == false) goto L22;
        abcd.wu.j6(th, 5689566381993643940L, this);
    L22:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(5689566381993643940L, this);     // Catch: java.lang.Throwable -> L17
    L7:
        if (P8() == false) goto L16;
        int[] r2 = ((abcd.C0292Oa) this).Qq();     // Catch: java.lang.Throwable -> L17
        int r4 = 0;
    L9:
        if (r4 >= r2.length) goto L15;
        if (r2[r4] != 1) goto L13;
        r4 = r4 + 1;
        goto L9
    L13:
        return false;
    L15:
        return true;
    L16:
        return false;
    }

    public boolean g3() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 5573383900168181461L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L15;
        abcd.wu.j6(5573383900168181461L, this);     // Catch: java.lang.Throwable -> L8
        return false;
    L15:
        return false;
    }

    public abcd.Ya j6(int r10, boolean r11, int r12, abcd.AbstractAa r13, abcd.Da r14, abcd.Interfacena r15) {
        if (Zo == false) goto L6;
        abcd.wu.j6(-7894368560949483272L, this, new java.lang.Object[]{new java.lang.Integer(r10), new java.lang.Boolean(r11), new java.lang.Integer(r12), r13, r14, r15});
    L6:
        if (rN() == false) goto L10;
        return ((abcd.C1381ua) this).DW(r10, r11, r12, r13, r14, r15);
    L10:
        if (P8() == false) goto L14;
        return ((abcd.C0292Oa) this).j6(r10, r11, r12, r13, r14, r15);
    L14:
        if (ei() == false) goto L22;
        if (((abcd.C0308Pa) this).Qq() != 1) goto L20;
        return sh().j6(r10, r11, r12, r13, r14, r15);
    L20:
        return this.gn.v5(r14, r15).j6(r10, r11, r12, r13, r14, r15);
    L22:
        if (gW() == false) goto L30;
        if (((abcd.C0212Ja) this).x9() != 1) goto L28;
        return sh().j6(r10, r11, r12, r13, r14, r15);
    L28:
        return this.gn.v5(r14, r15).j6(r10, r11, r12, r13, r14, r15);
    L30:
        throw new abcd.jc();
    }

    public abcd.Ya j6(abcd.Da r16, abcd.Interfacena r17, int r18, boolean r19, abcd.C1381ua r20, Yb<abcd.C0197Ia> r21) {
        if (Zo == false) goto L6;
        abcd.wu.j6(7621775829524722255L, this, new java.lang.Object[]{r16, r17, new java.lang.Integer(r18), new java.lang.Boolean(r19), r20, r21});
    L6:
        r21.j6();
        if (P8() == false) goto L54;
        if (((abcd.C0292Oa) this).aj().j6(r16, r17, r18, r19, r20, r21) != null) goto L11;
        return null;
    L11:
        return this;
    L54:
        if (lg() == false) goto L17;
        abcd.C1381ua r6 = this.gn.Hw(r16, r17);     // Catch: abcd.jc -> L49
        return r6.j6(r16, r17, r18, r19, r6, r21);
    L17:
        if (ei() == false) goto L30;
        abcd.C0308Pa r13 = (abcd.C0308Pa) this;
        if (r13.Qq() == 1) goto L21;
        int r14 = 0;
    L24:
        if (r14 >= r13.Qq()) goto L46;
        abcd.Ya r1 = ((abcd.C0308Pa) this).j6(r14).j6(r16, r17, r18, r19, r20, r21);     // Catch: abcd.jc -> L47
        if (r1 == null) goto L28;
        return r1;
    L28:
        r14 = r14 + 1;
        goto L24
    L21:
        return sh().j6(r16, r17, r18, r19, r20, r21);
    L30:
        if (gW() == false) goto L43;
        abcd.C0212Ja r15 = (abcd.C0212Ja) this;
        if (r15.x9() == 1) goto L34;
        int r110 = 0;
    L37:
        if (r110 >= r15.x9()) goto L46;
        abcd.Ya r2 = ((abcd.C0212Ja) this).j6(r110).j6(r16, r17, r18, r19, r20, r21);     // Catch: abcd.jc -> L48
        if (r2 == null) goto L41;
        return r2;
    L41:
        r110 = r110 + 1;
        goto L37
    L34:
        return sh().j6(r16, r17, r18, r19, r20, r21);
    L43:
        if (BT() == false) goto L46;
        return ((abcd.C0228Ka) this).x9().j6(r16, r17, r18, r19, r20, r21);
    L46:
        return null;
    }

    public abcd.Ya j6(abcd.Da r9, abcd.Interfacena r10, abcd.Ya r11) {
    L63:
        th = move-exception;
        if (VH == false) goto L68;
        abcd.wu.j6(th, -2010235859923054200L, this, r9, r10, r11);
    L68:
        throw th;
    L3:
        if (Zo == false) goto L6;
        abcd.wu.j6(-2010235859923054200L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L63
    L6:
        if (rN() == true) goto L10;
        if (P8() == true) goto L10;
    L15:
        return this.gn.v5(r9, r10);
    L10:
        if (r11.rN() == false) goto L12;
    L16:
        abcd.C1381ua r0 = this.gn.v5(r9, r10);     // Catch: java.lang.Throwable -> L63
        Yb<abcd.C1381ua> r1 = ((abcd.C1381ua) sh()).CU();     // Catch: java.lang.Throwable -> L63
        Yb<abcd.C1381ua> r2 = ((abcd.C1381ua) r11.sh()).CU();     // Catch: java.lang.Throwable -> L63
        r1.Hw.DW();     // Catch: java.lang.Throwable -> L63
        abcd.Ya r3 = r0;
    L18:
        if (r1.Hw.j6() == false) goto L30;
        abcd.C1381ua r4 = (abcd.C1381ua) r1.Hw.FH();     // Catch: java.lang.Throwable -> L63
        if (r2.j6(r4) == false) goto L18;
        if (r4.CU().j6(r3) == true) goto L28;
        if (r3.g3() == false) goto L18;
        if (r4.g3() == true) goto L18;
        if (r4 == r0) goto L18;
    L28:
        r3 = r4;
        goto L18
    L30:
        if (P8() == false) goto L32;
        Yb<abcd.Ya> r5 = ((abcd.C0292Oa) this).sy();     // Catch: java.lang.Throwable -> L63
    L34:
        if (P8() == false) goto L36;
        Yb<abcd.Ya> r6 = ((abcd.C0292Oa) this).sy();     // Catch: java.lang.Throwable -> L63
    L37:
        r5.Hw.DW();     // Catch: java.lang.Throwable -> L63
    L39:
        if (r5.Hw.j6() == false) goto L45;
        abcd.Ya r7 = (abcd.Ya) r5.Hw.FH();     // Catch: java.lang.Throwable -> L63
        if (r7.sh() != r3) goto L39;
        if (r11.FH(r9, r10, r7) == false) goto L39;
        r3 = r7;
        goto L39
    L45:
        r6.Hw.DW();     // Catch: java.lang.Throwable -> L63
    L47:
        if (r6.Hw.j6() == false) goto L54;
        abcd.Ya r8 = (abcd.Ya) r6.Hw.FH();     // Catch: java.lang.Throwable -> L63
        if (r8.sh() != r3) goto L47;
        if (FH(r9, r10, r8) == false) goto L47;
        r3 = r8;
        goto L47
    L54:
        if (P8() == true) goto L56;
        return r3;
    L56:
        if (r11.P8() == true) goto L58;
        return r3;
    L58:
        if (r3.rN() == true) goto L60;
        return r3;
    L60:
        if (((abcd.C1381ua) r3).jw() > 0) goto L62;
        return r3;
    L62:
        return this.gn.v5(r9, r10);
    L36:
        r6 = ((abcd.C1381ua) this).Xa();     // Catch: java.lang.Throwable -> L63
        goto L37
    L32:
        r5 = ((abcd.C1381ua) this).Xa();     // Catch: java.lang.Throwable -> L63
        goto L34
    L12:
        if (r11.P8() == false) goto L15;
        goto L15
    }

    public abcd.Ya j6(abcd.C0197Ia r8, abcd.C0197Ia r9) {
    L24:
        th = move-exception;
        if (VH == false) goto L29;
        abcd.wu.j6(th, -3643506772391069280L, this, r8, r9);
    L29:
        throw th;
    L3:
        if (Zo == false) goto L6;
        abcd.wu.j6(-3643506772391069280L, this, r8, r9);     // Catch: java.lang.Throwable -> L24
    L6:
        if (gW() == false) goto L12;
        abcd.C0212Ja r0 = (abcd.C0212Ja) this;     // Catch: java.lang.Throwable -> L24
        if (r0.Qq() == r9) goto L10;
    L23:
        return this;
    L10:
        return r0.DW(r8);
    L12:
        if (lg() == false) goto L16;
        return this.gn.j6(((abcd.C1296sa) this).sy().j6(r8, r9), ((abcd.C1296sa) this).Qq());
    L16:
        if (P8() == false) goto L23;
        abcd.Ya[] r1 = ((abcd.C0292Oa) this).x9();     // Catch: java.lang.Throwable -> L24
        int[] r2 = ((abcd.C0292Oa) this).Qq();     // Catch: java.lang.Throwable -> L24
        abcd.Ya[] r3 = new abcd.Ya[r1.length];     // Catch: java.lang.Throwable -> L24
        int r4 = 0;
    L19:
        if (r4 >= r1.length) goto L22;
        r3[r4] = r1[r4].j6(r8, r9);     // Catch: java.lang.Throwable -> L24
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L24
        goto L19
    L22:
        return this.gn.j6(((abcd.C0292Oa) this).aj(), r3, r2);
    }

    public abcd.Ya j6(abcd.C1381ua r8, Yb<abcd.C0197Ia> r9) {
    L12:
        th = move-exception;
        if (VH == false) goto L16;
        abcd.wu.j6(th, 328285255180400935L, this, r8, r9);
    L16:
        throw th;
    L3:
        if (Zo == false) goto L6;
        abcd.wu.j6(328285255180400935L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
    L6:
        if (P8() == false) goto L11;
        if (((abcd.C0292Oa) this).aj().j6(r8, r9) != null) goto L10;
        return null;
    L10:
        return this;
    L11:
        return null;
    }

    @Override
    @abcd.Interfacesu(method = 6550923602133858605L)
    protected void j6(abcd.ec r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -4110764438232284324L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-4110764438232284324L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        super.j6(r5);     // Catch: java.lang.Throwable -> L8
        this.u7 = r5.readInt();     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = 7553165345952777625L)
    protected void j6(abcd.fc r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -4439326592595176344L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-4439326592595176344L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        super.j6(r5);     // Catch: java.lang.Throwable -> L8
        r5.writeInt(this.u7);     // Catch: java.lang.Throwable -> L8
    }

    public boolean j6(abcd.Da r8, abcd.Interfacena r9) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, 2903552185441332528L, this, r8, r9);
    L15:
        throw th;
    L3:
        if (Zo == false) goto L6;
        abcd.wu.j6(2903552185441332528L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (Zo() == null) goto L9;
        return Zo().FH(r8);
    L9:
        return true;
    }

    public boolean j6(abcd.Ya r8) {
    L23:
        th = move-exception;
        if (VH == false) goto L28;
        abcd.wu.j6(th, -2954892805335229759L, this, r8);
    L28:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(-2954892805335229759L, this, r8);     // Catch: java.lang.Throwable -> L23
    L7:
        if (this != r8) goto L10;
        return true;
    L10:
        if (lg() == false) goto L14;
        return ((abcd.C1296sa) this).sy().j6(r8);
    L14:
        if (P8() == false) goto L22;
        abcd.Ya[] r3 = ((abcd.C0292Oa) this).x9();     // Catch: java.lang.Throwable -> L23
        int r5 = 0;
    L17:
        if (r5 >= r3.length) goto L22;
        if (r3[r5].j6(r8) == true) goto L20;
        r5 = r5 + 1;
        goto L17
    L20:
        return true;
    L22:
        return false;
    }

    public boolean j6(abcd.Ya r9, abcd.C0197Ia r10, abcd.C0197Ia r11) {
    L41:
        th = move-exception;
        if (VH == false) goto L46;
        abcd.wu.j6(th, -2150863138186846175L, this, r9, r10, r11);
    L46:
        throw th;
    L3:
        if (Zo == false) goto L6;
        abcd.wu.j6(-2150863138186846175L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L41
    L6:
        if (DW(r9) == false) goto L9;
        return true;
    L9:
        if (gW() == false) goto L20;
        if (r9.gW() == false) goto L20;
        if (((abcd.C0212Ja) this).Qq() == r10) goto L15;
    L40:
        return false;
    L15:
        if (((abcd.C0212Ja) r9).Qq() != r11) goto L40;
        if (((abcd.C0212Ja) this).sy() != ((abcd.C0212Ja) r9).sy()) goto L40;
        return true;
    L20:
        if (lg() == false) goto L26;
        if (r9.lg() == false) goto L26;
        return ((abcd.C1296sa) this).sy().j6(((abcd.C1296sa) r9).sy(), r10, r11);
    L26:
        if (P8() == false) goto L40;
        if (r9.P8() == false) goto L40;
        if (((abcd.C0292Oa) this).aj() == ((abcd.C0292Oa) r9).aj()) goto L32;
        return false;
    L32:
        abcd.Ya[] r0 = ((abcd.C0292Oa) this).x9();     // Catch: java.lang.Throwable -> L41
        abcd.Ya[] r3 = ((abcd.C0292Oa) r9).x9();     // Catch: java.lang.Throwable -> L41
        int r4 = 0;
    L34:
        if (r4 >= r0.length) goto L39;
        if (r0[r4].j6(r3[r4], r10, r11) == false) goto L37;
        r4 = r4 + 1;
        goto L34
    L37:
        return false;
    L39:
        return true;
    }

    public abcd.Ya sG() {
    L12:
        th = move-exception;
        if (VH == false) goto L16;
        abcd.wu.j6(th, -2240802841791857409L, this);
    L16:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(-2240802841791857409L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (P8() == false) goto L11;
        return ((abcd.C0292Oa) this).FH(((abcd.C0292Oa) this).aj().sG());
    L11:
        throw new abcd.jc();     // Catch: java.lang.Throwable -> L12
    }

    public abcd.Ya sh() {
    L27:
        th = move-exception;
        if (VH == false) goto L31;
        abcd.wu.j6(th, 3913092196837904212L, this);
    L31:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(3913092196837904212L, this);     // Catch: java.lang.Throwable -> L27
    L7:
        if (P8() == false) goto L11;
        return ((abcd.C0292Oa) this).aj();
    L11:
        if (ei() == false) goto L15;
        return ((abcd.C0308Pa) this).sh().sh();
    L15:
        if (gW() == false) goto L19;
        return ((abcd.C0212Ja) this).sh().sh();
    L19:
        if (BT() == false) goto L23;
        return ((abcd.C0228Ka) this).x9().sh();
    L23:
        if (lg() == true) goto L25;
        return this;
    L25:
        return this.gn.j6(((abcd.C1296sa) this).sy().sh(), ((abcd.C1296sa) this).Qq());
    }

    public java.lang.String toString() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 1657582695435195636L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(1657582695435195636L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return VH();
    }

    public boolean vJ() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 2671559309092425915L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L15;
        abcd.wu.j6(2671559309092425915L, this);     // Catch: java.lang.Throwable -> L8
        return false;
    L15:
        return false;
    }
}
