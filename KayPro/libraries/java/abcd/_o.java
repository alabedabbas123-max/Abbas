package abcd;

public final class _o {
    private abcd.Rn DW;
    private byte[] FH;
    private int Hw;
    private final abcd.Un j6;
    private java.util.TreeMap<abcd.Qn, java.lang.Integer> v5;

    public _o(abcd.Un r2) {
        this.j6 = r2;
        this.DW = null;
        this.FH = null;
        this.Hw = 0;
        this.v5 = null;
    }

    private void FH() {
        if (this.DW != null) goto L6;
        this.DW = this.j6.DW();
        return;
    }

    private static void j6(abcd.Qn r1, int r2, int r3, java.lang.String r4, java.io.PrintWriter r5, abcd.Lt r6) {
        java.lang.String r7 = r1.j6(r4, abcd.Yt.v5(r2) + ": ");
        if (r5 == null) goto L5;
        r5.println(r7);
    L5:
        r6.j6(r3, r7);
    }

    private void j6(java.lang.String r16, java.io.PrintWriter r17, abcd.Lt r18) {
        FH();
        int r2 = 0;
        if (r18 == null) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L8;
        int r4 = 6;
    L9:
        if (r3 == false) goto L11;
        int r5 = 2;
    L12:
        int r6 = this.DW.size();
        java.lang.String r9 = r16 + "  ";
        if (r3 == false) goto L15;
        r18.j6(0, r16 + "tries:");
    L16:
        int r10 = 0;
    L17:
        if (r10 >= r6) goto L23;
        abcd.Rn.a r11 = this.DW.get(r10);
        abcd.Qn r12 = r11.Zo();
        java.lang.String r13 = r9 + "try " + abcd.Yt.Zo(r11.VH()) + ".." + abcd.Yt.Zo(r11.Hw());
        java.lang.String r14 = r12.j6(r9, "");
        if (r3 == false) goto L21;
        r18.j6(r4, r13);
        r18.j6(r5, r14);
    L22:
        r10 = r10 + 1;
        goto L17
    L21:
        r17.println(r13);
        r17.println(r14);
        goto L22
    L23:
        if (r3 == true) goto L25;
        return;
    L25:
        r18.j6(0, r16 + "handlers:");
        r18.j6(this.Hw, r9 + "size: " + abcd.Yt.v5(this.v5.size()));
        abcd.Qn r1 = null;
        java.util.Iterator<java.util.Map.Entry<abcd.Qn, java.lang.Integer>> r15 = this.v5.entrySet().iterator();
    L27:
        if (r15.hasNext() == false) goto L32;
        java.util.Map.Entry<abcd.Qn, java.lang.Integer> r7 = r15.next();
        abcd.Qn r19 = r7.getKey();
        int r110 = r7.getValue().intValue();
        if (r1 == null) goto L31;
        j6(r1, r2, r110 - r2, r9, r17, r18);
    L31:
        r1 = r19;
        r2 = r110;
        goto L27
    L32:
        j6(r1, r2, this.FH.length - r2, r9, r17, r18);
        return;
    L15:
        r17.println(r16 + "tries:");
        goto L16
    L11:
        r5 = 0;
        goto L12
    L8:
        r4 = 0;
        goto L9
    L5:
        r3 = false;
        goto L6
    }

    public int DW() {
        return (j6() * 8) + this.FH.length;
    }

    public int j6() {
        FH();
        return this.DW.size();
    }

    public void j6(abcd.jp r10) {
        FH();
        abcd.Qp r11 = r10.Ws();
        int r0 = this.DW.size();
        this.v5 = new java.util.TreeMap();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L6;
        this.v5.put(this.DW.get(r2).Zo(), null);
        r2 = r2 + 1;
        goto L3
    L6:
        if (this.v5.size() > 65535) goto L22;
        abcd.Qt r1 = new abcd.Qt();
        this.Hw = r1.DW(this.v5.size());
        java.util.Iterator<java.util.Map.Entry<abcd.Qn, java.lang.Integer>> r3 = this.v5.entrySet().iterator();
    L9:
        if (r3.hasNext() == false) goto L19;
        java.util.Map.Entry<abcd.Qn, java.lang.Integer> r4 = r3.next();
        abcd.Qn r5 = r4.getKey();
        int r6 = r5.size();
        boolean r7 = r5.rN();
        r4.setValue(java.lang.Integer.valueOf(r1.v5()));
        if (r7 == false) goto L13;
        r1.v5(-(r6 - 1));
        r6 = r6 - 1;
    L14:
        int r8 = 0;
    L15:
        if (r8 >= r6) goto L17;
        abcd.Qn.a r9 = r5.get(r8);
        r1.DW(r11.j6(r9.Hw()));
        r1.DW(r9.Zo());
        r8 = r8 + 1;
        goto L15
    L17:
        if (r7 == false) goto L9;
        r1.DW(r5.get(r6).Zo());
        goto L9
    L13:
        r1.v5(r6);
        goto L14
    L19:
        this.FH = r1.gn();
        return;
    L22:
        throw new java.lang.UnsupportedOperationException("too many catch handlers");
    }

    public void j6(abcd.jp r7, abcd.Lt r8) {
        FH();
        if (r8.Hw() == false) goto L5;
        j6("  ", null, r8);
    L5:
        int r9 = this.DW.size();
        int r0 = 0;
    L6:
        if (r0 >= r9) goto L12;
        abcd.Rn.a r1 = this.DW.get(r0);
        int r2 = r1.VH();
        int r3 = r1.Hw();
        int r4 = r3 - r2;
        if (r4 >= 65536) goto L11;
        r8.writeInt(r2);
        r8.writeShort(r4);
        r8.writeShort(this.v5.get(r1.Zo()).intValue());
        r0 = r0 + 1;
        goto L6
    L11:
        throw new java.lang.UnsupportedOperationException("bogus exception range: " + abcd.Yt.gn(r2) + ".." + abcd.Yt.gn(r3));
    L12:
        r8.write(this.FH);
    }
}
