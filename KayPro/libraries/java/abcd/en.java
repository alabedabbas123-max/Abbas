package abcd;

public final class en {
    private final abcd.Ls DW;
    private final int[] FH;
    private int Hw;
    private final abcd.Pt j6;
    private abcd.Interfacexn v5;

    public en(abcd.Pt r2) {
        int r0 = r2.Zo(8);
        this.j6 = r2;
        this.DW = new abcd.Ls(r0);
        this.FH = new int[r0];
        this.Hw = -1;
    }

    private void FH() {
        int r1 = 1;
        int r2 = 10;
    L3:
        int[] r3 = this.FH;
        if (r1 >= r3.length) goto L15;
        r3[r1] = r2;
        int r4 = this.j6.v5(r2);
        switch(r4) {
            case 1: goto L12;
            case 2: goto L7;
            case 3: goto L11;
            case 4: goto L11;
            case 5: goto L10;
            case 6: goto L10;
            case 7: goto L9;
            case 8: goto L9;
            case 9: goto L11;
            case 10: goto L11;
            case 11: goto L11;
            case 12: goto L11;
            default: goto L7;
        };
    L9:
        r2 = r2 + 3;
    L13:
        int r5 = 1;
    L14:
        r1 = r1 + r5;
        goto L3
    L10:
        r5 = 2;
        r2 = r2 + 9;
        goto L14
    L11:
        r2 = r2 + 5;
        goto L13
    L12:
        r2 = r2 + (this.j6.Zo(r2 + 1) + 3);
        goto L13
    L7:
        abcd.wn r0 = new abcd.wn("unknown tag byte: " + abcd.Yt.Hw(r4));
        r0.j6("...while preparsing cst " + abcd.Yt.v5(r1) + " at offset " + abcd.Yt.gn(r2));
        throw r0;
    L15:
        this.Hw = r2;
    }

    private void Hw() {
        FH();
        abcd.Interfacexn r0 = this.v5;
        int r2 = 1;
        if (r0 == null) goto L5;
        r0.j6(this.j6, 8, 2, "constant_pool_count: " + abcd.Yt.v5(this.FH.length));
        this.v5.j6(this.j6, 10, 0, "\nconstant_pool:");
        this.v5.j6(1);
    L5:
        java.util.BitSet r1 = new java.util.BitSet(this.FH.length);
        int r3 = 1;
    L6:
        int[] r4 = this.FH;
        if (r3 >= r4.length) goto L15;
        if (r4[r3] == 0) goto L13;
        if (this.DW.DW(r3) != null) goto L13;
        j6(r3, r1);
    L13:
        r3 = r3 + 1;
        goto L6
    L15:
        if (this.v5 != null) goto L17;
        return;
    L17:
        if (r2 >= this.FH.length) goto L34;
        abcd.Abstractms r5 = this.DW.DW(r2);
        if (r5 == null) goto L33;
        int r6 = this.FH[r2];
        int r7 = this.Hw;
        int r8 = r2 + 1;
    L22:
        int[] r9 = this.FH;
        if (r8 >= r9.length) goto L29;
        int r10 = r9[r8];
        if (r10 != 0) goto L26;
        r8 = r8 + 1;
        goto L22
    L26:
        r7 = r10;
    L29:
        if (r1.get(r2) == false) goto L31;
        java.lang.StringBuilder r11 = new java.lang.StringBuilder();
        r11.append(abcd.Yt.v5(r2));
        r11.append(": utf8{\"");
        r11.append(r5.aM());
        java.lang.String r12 = "\"}";
    L32:
        r11.append(r12);
        this.v5.j6(this.j6, r6, r7 - r6, r11.toString());
        goto L33
    L31:
        r11 = new java.lang.StringBuilder();
        r11.append(abcd.Yt.v5(r2));
        r11.append(": ");
        r12 = r5.toString();
    L33:
        r2 = r2 + 1;
        goto L17
    L34:
        this.v5.j6(-1);
        this.v5.j6(this.j6, this.Hw, 0, "end constant_pool");
    }

    private abcd.Js j6(int r3) {
        int r0 = this.j6.Zo(r3 + 1);
        int r4 = r3 + 3;
        return new abcd.Js(this.j6.j6(r4, r0 + r4));
    L5:
        e = move-exception;
        throw new abcd.wn(e);
    }

    private abcd.Abstractms j6(int r7, java.util.BitSet r8) {
        abcd.Abstractms r2 = this.DW.DW(r7);
        if (r2 == null) goto L5;
        return r2;
    L5:
        int r3 = this.FH[r7];
    L26:
        e = move-exception;
        e.j6("...while parsing cst " + abcd.Yt.v5(r7) + " at offset " + abcd.Yt.gn(r3));
        throw e;
    L23:
        e = move-exception;
        abcd.wn r4 = new abcd.wn(e);
        r4.j6("...while parsing cst " + abcd.Yt.v5(r7) + " at offset " + abcd.Yt.gn(r3));
        throw r4;
    L7:
        switch(this.j6.v5(r3)) {
            case 1: goto L20;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L18;
            case 5: goto L17;
            case 6: goto L16;
            case 7: goto L15;
            case 8: goto L14;
            case 9: goto L12;
            case 10: goto L11;
            case 11: goto L10;
            case 12: goto L9;
            default: goto L21;
        };     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
    L9:
        abcd.Abstractms r5 = new abcd.Hs((abcd.Js) j6(this.j6.Zo(r3 + 1), r8), (abcd.Js) j6(this.j6.Zo(r3 + 3), r8));     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
    L13:
        r2 = r5;
        goto L21
    L10:
        r5 = new abcd.zs((abcd.Ks) j6(this.j6.Zo(r3 + 1), r8), (abcd.Hs) j6(this.j6.Zo(r3 + 3), r8));     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
        goto L13
    L11:
        r5 = new abcd.Gs((abcd.Ks) j6(this.j6.Zo(r3 + 1), r8), (abcd.Hs) j6(this.j6.Zo(r3 + 3), r8));     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
        goto L13
    L12:
        r5 = new abcd.ws((abcd.Ks) j6(this.j6.Zo(r3 + 1), r8), (abcd.Hs) j6(this.j6.Zo(r3 + 3), r8));     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
        goto L13
    L14:
        r2 = j6(this.j6.Zo(r3 + 1), r8);     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
        goto L21
    L15:
        r2 = new abcd.Ks(abcd.Qs.DW(((abcd.Js) j6(this.j6.Zo(r3 + 1), r8)).we()));     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
        goto L21
    L16:
        r2 = abcd.us.j6(this.j6.FH(r3 + 1));     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
        goto L21
    L17:
        r2 = abcd.Es.j6(this.j6.FH(r3 + 1));     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
        goto L21
    L18:
        r2 = abcd.xs.j6(this.j6.DW(r3 + 1));     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
        goto L21
    L19:
        r2 = abcd.ys.j6(this.j6.DW(r3 + 1));     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
        goto L21
    L20:
        r2 = j6(r3);     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
        r8.set(r7);     // Catch: java.lang.RuntimeException -> L23 abcd.wn -> L26
    L21:
        this.DW.j6(r7, r2);
        return r2;
    }

    private void v5() {
        if (this.Hw >= 0) goto L6;
        Hw();
        return;
    }

    public abcd.Ls DW() {
        v5();
        return this.DW;
    }

    public int j6() {
        v5();
        return this.Hw;
    }

    public void j6(abcd.Interfacexn r1) {
        this.v5 = r1;
    }
}
