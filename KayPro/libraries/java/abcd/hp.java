package abcd;

public final class hp {
    private final abcd.co DW;
    private abcd.Lt EQ;
    private final abcd.Qt FH;
    private final abcd.jp Hw;
    private java.lang.String J0;
    private boolean J8;
    private final abcd.Os VH;
    private final abcd.co.b[] Ws;
    private final int Zo;
    private final boolean gn;
    private final abcd.io j6;
    private int tp;
    private int u7;
    private final int v5;
    private java.io.PrintWriter we;

    public hp(abcd.io r2, abcd.co r3, abcd.jp r4, int r5, int r6, boolean r7, abcd.Gs r8) {
        this.u7 = 0;
        this.tp = 1;
        this.j6 = r2;
        this.DW = r3;
        this.Hw = r4;
        this.VH = r8.J8();
        this.gn = r7;
        this.v5 = r5;
        this.Zo = r6;
        this.FH = new abcd.Qt();
        this.Ws = new abcd.co.b[r6];
    }

    private java.util.ArrayList<abcd.io.a> DW() {
        abcd.io r0 = this.j6;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        java.util.ArrayList<abcd.io.a> r3 = new java.util.ArrayList(r2);
    L7:
        if (r1 >= r2) goto L9;
        r3.add(this.j6.get(r1));
        r1 = r1 + 1;
        goto L7
    L9:
        java.util.Collections.sort(r3, new abcd.fp(this));
        return r3;
    L5:
        r2 = r0.size();
        goto L6
    }

    private void DW(int r4) {
        int r0 = this.FH.v5();
        this.FH.writeByte(1);
        this.FH.DW(r4);
        this.u7 += r4;
        if (this.EQ == null) goto L5;
    L6:
        j6(this.FH.v5() - r0, java.lang.String.format("%04x: advance pc", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7)}));
        return;
    L5:
        if (this.we != null) goto L6;
    }

    private void DW(abcd.co.b r5) {
        int r0 = this.FH.v5();
        this.FH.writeByte(6);
        Hw(r5.we());
        if (this.EQ == null) goto L5;
    L6:
        j6(this.FH.v5() - r0, java.lang.String.format("%04x: +local restart %s", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7), v5(r5)}));
        return;
    L5:
        if (this.we != null) goto L6;
    }

    private int FH(int r6) {
        int r0 = this.DW.size();
    L3:
        if (r6 >= r0) goto L24;
        if (this.DW.get(r6).Hw() != this.u7) goto L24;
        int r2 = r6 + 1;
        abcd.co.b r7 = this.DW.get(r6);
        int r1 = r7.we();
        abcd.co.b[] r3 = this.Ws;
        abcd.co.b r4 = r3[r1];
        if (r7 == r4) goto L23;
        r3[r1] = r7;
        if (r7.j3() == false) goto L21;
        if (r4 != null) goto L13;
    L19:
        FH(r7);
        goto L23
    L13:
        if (r7.DW(r4) == false) goto L19;
        if (r4.j3() == true) goto L18;
        DW(r7);
        goto L23
    L18:
        throw new java.lang.RuntimeException("shouldn't happen");
    L21:
        if (r7.Zo() == abcd.co.a.FH) goto L23;
        j6(r7);
    L23:
        r6 = r2;
    L24:
        return r6;
    }

    private void FH(abcd.co.b r5) {
        if (r5.Ws() == null) goto L6;
        Hw(r5);
        return;
    L6:
        int r0 = this.FH.v5();
        this.FH.writeByte(3);
        Hw(r5.we());
        j6(r5.VH());
        j6(r5.aM());
        if (this.EQ == null) goto L9;
    L10:
        j6(this.FH.v5() - r0, java.lang.String.format("%04x: +local %s", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7), v5(r5)}));
        return;
    L9:
        if (this.we != null) goto L10;
    }

    private byte[] FH() {
        java.util.ArrayList<abcd.io.a> r0 = DW();
        j6(r0, v5());
        this.FH.writeByte(7);
        int r2 = 0;
        if (this.EQ == null) goto L5;
    L6:
        j6(1, java.lang.String.format("%04x: prologue end", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7)}));
    L7:
        int r1 = r0.size();
        int r3 = this.DW.size();
        int r4 = 0;
    L8:
        r2 = FH(r2);
        r4 = j6(r4, r0);
        if (r2 >= r3) goto L11;
        int r6 = this.DW.get(r2).Hw();
    L12:
        if (r4 >= r1) goto L14;
        int r7 = r0.get(r4).j6();
    L15:
        int r8 = java.lang.Math.min(r7, r6);
        if (r8 == Integer.MAX_VALUE) goto L22;
        if (r8 != this.v5) goto L24;
        if (r6 != Integer.MAX_VALUE) goto L24;
        if (r7 == Integer.MAX_VALUE) goto L22;
    L24:
        if (r8 == r7) goto L25;
        DW(r8 - this.u7);
        goto L8
    L25:
        j6(r0.get(r4));
        r4 = r4 + 1;
    L22:
        Hw();
        return this.FH.gn();
    L14:
        r7 = Integer.MAX_VALUE;
        goto L15
    L11:
        r6 = Integer.MAX_VALUE;
        goto L12
    L5:
        if (this.we == null) goto L7;
        goto L6
    }

    private void Hw() {
        this.FH.writeByte(0);
        if (this.EQ == null) goto L5;
    L6:
        j6(1, "end sequence");
        return;
    L5:
        if (this.we != null) goto L6;
    }

    private void Hw(int r4) {
        if (r4 < 0) goto L6;
        this.FH.DW(r4);
        return;
    L6:
        throw new java.lang.RuntimeException("Signed value where unsigned required: " + r4);
    }

    private void Hw(abcd.co.b r5) {
        int r0 = this.FH.v5();
        this.FH.writeByte(4);
        Hw(r5.we());
        j6(r5.VH());
        j6(r5.aM());
        j6(r5.Ws());
        if (this.EQ == null) goto L5;
    L6:
        j6(this.FH.v5() - r0, java.lang.String.format("%04x: +localx %s", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7), v5(r5)}));
        return;
    L5:
        if (this.we != null) goto L6;
    }

    private int Zo() {
        return (this.Zo - this.VH.VH().rN()) - (!this.gn ? 1 : 0);
    }

    private static int j6(int r2, int r3) {
        if (r2 < (-4)) goto L9;
        if (r2 > 10) goto L9;
        return ((r2 - (-4)) + (r3 * 15)) + 10;
    L9:
        throw new java.lang.RuntimeException("Parameter out of range");
    }

    private int j6(int r4, java.util.ArrayList<abcd.io.a> r5) {
        int r0 = r5.size();
    L3:
        if (r4 >= r0) goto L7;
        if (r5.get(r4).j6() != this.u7) goto L7;
        int r1 = r4 + 1;
        j6(r5.get(r4));
        r4 = r1;
    L7:
        return r4;
    }

    private void j6(int r4) {
        int r0 = this.FH.v5();
        this.FH.writeByte(2);
        this.FH.v5(r4);
        this.tp += r4;
        if (this.EQ == null) goto L5;
    L6:
        j6(this.FH.v5() - r0, java.lang.String.format("line = %d", new java.lang.Object[]{java.lang.Integer.valueOf(this.tp)}));
        return;
    L5:
        if (this.we != null) goto L6;
    }

    private void j6(int r3, java.lang.String r4) {
        if (this.J0 == null) goto L5;
        r4 = this.J0 + r4;
    L5:
        abcd.Lt r0 = this.EQ;
        if (r0 != null) goto L8;
    L12:
        java.io.PrintWriter r5 = this.we;
        if (r5 == null) goto L16;
        r5.println(r4);
        return;
    L16:
        return;
    L8:
        if (this.J8 == true) goto L11;
        r3 = 0;
    L11:
        r0.j6(r3, r4);
        goto L12
    }

    private void j6(abcd.Js r3) {
        if (r3 == null) goto L7;
        abcd.jp r0 = this.Hw;
        if (r0 == null) goto L7;
        this.FH.DW(r0.J8().j6(r3) + 1);
        return;
    L7:
        this.FH.DW(0);
    }

    private void j6(abcd.Ks r3) {
        if (r3 == null) goto L7;
        abcd.jp r0 = this.Hw;
        if (r0 == null) goto L7;
        this.FH.DW(r0.Ws().j6(r3) + 1);
        return;
    L7:
        this.FH.DW(0);
    }

    private void j6(abcd.co.b r5) {
        int r0 = this.FH.v5();
        this.FH.writeByte(5);
        this.FH.DW(r5.we());
        if (this.EQ == null) goto L5;
    L6:
        j6(this.FH.v5() - r0, java.lang.String.format("%04x: -local %s", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7), v5(r5)}));
        return;
    L5:
        if (this.we != null) goto L6;
    }

    private void j6(abcd.io.a r5) {
        int r0 = r5.DW().j6();
        int r6 = r5.j6();
        int r1 = r0 - this.tp;
        int r7 = r6 - this.u7;
        if (r7 < 0) goto L22;
        if (r1 >= (-4)) goto L7;
    L8:
        j6(r1);
        r1 = 0;
    L9:
        int r2 = j6(r1, r7);
        if ((r2 & (-256)) <= 0) goto L15;
        DW(r7);
        r2 = j6(r1, 0);
        if ((r2 & (-256)) <= 0) goto L14;
        j6(r1);
        r2 = j6(0, 0);
        r7 = 0;
        r1 = 0;
        goto L15
    L14:
        r7 = 0;
    L15:
        this.FH.writeByte(r2);
        this.tp += r1;
        this.u7 += r7;
        if (this.EQ == null) goto L18;
    L19:
        j6(1, java.lang.String.format("%04x: line %d", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7), java.lang.Integer.valueOf(this.tp)}));
        return;
    L18:
        if (this.we != null) goto L19;
        return;
    L7:
        if (r1 <= 10) goto L9;
    L22:
        throw new java.lang.RuntimeException("Position entries must be in ascending address order");
    }

    private void j6(java.util.ArrayList<abcd.io.a> r12, java.util.ArrayList<abcd.co.b> r13) {
        int r1 = 0;
        if (this.EQ == null) goto L5;
    L8:
        boolean r0 = true;
    L9:
        int r3 = this.FH.v5();
        if (r12.size() <= 0) goto L12;
        this.tp = r12.get(0).DW().j6();
    L12:
        this.FH.DW(this.tp);
        if (r0 == false) goto L15;
        j6(this.FH.v5() - r3, "line_start: " + this.tp);
    L15:
        int r14 = Zo();
        abcd.Ps r4 = this.VH.VH();
        int r5 = r4.size();
        if (this.gn == true) goto L24;
        java.util.Iterator<abcd.co.b> r6 = r13.iterator();
    L19:
        if (r6.hasNext() == false) goto L23;
        abcd.co.b r7 = r6.next();
        if (r14 != r7.we()) goto L19;
        this.Ws[r14] = r7;
    L23:
        r14 = r14 + 1;
    L24:
        int r8 = this.FH.v5();
        this.FH.DW(r5);
        if (r0 == false) goto L27;
        j6(this.FH.v5() - r8, java.lang.String.format("parameters_size: %04x", new java.lang.Object[]{java.lang.Integer.valueOf(r5)}));
    L27:
        int r2 = r14;
        int r15 = 0;
    L28:
        if (r15 >= r5) goto L51;
        abcd.Qs r9 = r4.get(r15);
        int r10 = this.FH.v5();
        java.util.Iterator<abcd.co.b> r11 = r13.iterator();
    L31:
        if (r11.hasNext() == false) goto L39;
        abcd.co.b r16 = r11.next();
        if (r2 != r16.we()) goto L31;
        if (r16.Ws() == null) goto L37;
        j6(null);
    L38:
        this.Ws[r2] = r16;
    L40:
        if (r16 != null) goto L42;
        j6(null);
    L42:
        if (r0 == false) goto L50;
        if (r16 != null) goto L45;
    L48:
        java.lang.String r17 = "<unnamed>";
    L49:
        j6(this.FH.v5() - r10, "parameter " + r17 + " v" + r2);
        goto L50
    L45:
        if (r16.Ws() != null) goto L48;
        r17 = r16.VH().aM();
    L50:
        r2 = r2 + r9.Zo();
        r15 = r15 + 1;
        goto L28
    L37:
        j6(r16.VH());
        goto L38
    L39:
        r16 = null;
        goto L40
    L51:
        abcd.co.b[] r18 = this.Ws;
        int r19 = r18.length;
    L52:
        if (r1 >= r19) goto L60;
        abcd.co.b r20 = r18[r1];
        if (r20 == null) goto L59;
        if (r20.Ws() == null) goto L59;
        Hw(r20);
    L59:
        r1 = r1 + 1;
        goto L52
    L60:
        return;
    L5:
        if (this.we != null) goto L8;
        r0 = false;
        goto L9
    }

    private java.lang.String v5(abcd.co.b r5) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("v");
        r0.append(r5.we());
        r0.append(' ');
        abcd.Js r2 = r5.VH();
        if (r2 != null) goto L5;
        r0.append("null");
    L6:
        r0.append(' ');
        abcd.Ks r3 = r5.aM();
        if (r3 != null) goto L9;
        r0.append("null");
    L10:
        abcd.Js r6 = r5.Ws();
        if (r6 == null) goto L14;
        r0.append(' ');
        r0.append(r6.aM());
    L14:
        return r0.toString();
    L9:
        r0.append(r3.aM());
        goto L10
    L5:
        r0.append(r2.aM());
        goto L6
    }

    private java.util.ArrayList<abcd.co.b> v5() {
        java.util.ArrayList<abcd.co.b> r0 = new java.util.ArrayList(this.VH.VH().size());
        int r1 = Zo();
        java.util.BitSet r2 = new java.util.BitSet(this.Zo - r1);
        int r3 = this.DW.size();
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L12;
        abcd.co.b r5 = this.DW.get(r4);
        int r6 = r5.we();
        if (r6 < r1) goto L11;
        int r7 = r6 - r1;
        if (r2.get(r7) == true) goto L11;
        r2.set(r7);
        r0.add(r5);
    L11:
        r4 = r4 + 1;
        goto L3
    L12:
        java.util.Collections.sort(r0, new abcd.gp(this));
        return r0;
    }

    public byte[] j6() {
        return FH();
    L4:
        e = move-exception;
        throw abcd.Vt.j6(e, "...while encoding debug info");
    }

    public byte[] j6(java.lang.String r1, java.io.PrintWriter r2, abcd.Lt r3, boolean r4) {
        this.J0 = r1;
        this.we = r2;
        this.EQ = r3;
        this.J8 = r4;
        return j6();
    }
}
