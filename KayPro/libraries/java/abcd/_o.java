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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.DW != null) { $pc0 = 6; continue $sw0; }
                    this.DW = this.j6.DW();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(abcd.Qn r1, int r2, int r3, java.lang.String r4, java.io.PrintWriter r5, abcd.Lt r6) {
        java.lang.String r7 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r7 = r1.j6(r4, abcd.Yt.v5(r2) + ": ");
                    if (r5 == null) { $pc1 = 5; continue $sw1; }
                    r5.println(r7);
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r6.j6(r3, r7);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.lang.String r16, java.io.PrintWriter r17, abcd.Lt r18) {
        int r2 = 0;
        boolean r3 = false;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.String r9 = null;
        int r10 = 0;
        abcd.Rn.a r11 = null;
        abcd.Qn r12 = null;
        java.lang.String r13 = null;
        java.lang.String r14 = null;
        abcd.Qn r1 = null;
        java.util.Iterator<java.util.Map.Entry<abcd.Qn, java.lang.Integer>> r15 = null;
        java.util.Map.Entry<abcd.Qn, java.lang.Integer> r7 = null;
        abcd.Qn r19 = null;
        int r110 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    FH();
                    r2 = 0;
                    if (r18 == null) { $pc2 = 5; continue $sw2; }
                    r3 = true;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r3 == false) { $pc2 = 8; continue $sw2; }
                    r4 = 6;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (r3 == false) { $pc2 = 11; continue $sw2; }
                    r5 = 2;
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    r6 = this.DW.size();
                    r9 = r16 + "  ";
                    if (r3 == false) { $pc2 = 15; continue $sw2; }
                    r18.j6(0, r16 + "tries:");
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    r10 = 0;
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    if (r10 >= r6) { $pc2 = 23; continue $sw2; }
                    r11 = this.DW.get(r10);
                    r12 = r11.Zo();
                    r13 = r9 + "try " + abcd.Yt.Zo(r11.VH()) + ".." + abcd.Yt.Zo(r11.Hw());
                    r14 = r12.j6(r9, "");
                    if (r3 == false) { $pc2 = 21; continue $sw2; }
                    r18.j6(r4, r13);
                    r18.j6(r5, r14);
                    $pc2 = 22; continue $sw2;
                }
                case 22: {
                    r10 = r10 + 1;
                    { $pc2 = 17; continue $sw2; }
                }
                case 21: {
                    r17.println(r13);
                    r17.println(r14);
                    { $pc2 = 22; continue $sw2; }
                }
                case 23: {
                    if (r3 == true) { $pc2 = 25; continue $sw2; }
                    return;
                }
                case 25: {
                    r18.j6(0, r16 + "handlers:");
                    r18.j6(this.Hw, r9 + "size: " + abcd.Yt.v5(this.v5.size()));
                    r1 = null;
                    r15 = this.v5.entrySet().iterator();
                    $pc2 = 27; continue $sw2;
                }
                case 27: {
                    if (r15.hasNext() == false) { $pc2 = 32; continue $sw2; }
                    r7 = r15.next();
                    r19 = r7.getKey();
                    r110 = r7.getValue().intValue();
                    if (r1 == null) { $pc2 = 31; continue $sw2; }
                    j6(r1, r2, r110 - r2, r9, r17, r18);
                    $pc2 = 31; continue $sw2;
                }
                case 31: {
                    r1 = r19;
                    r2 = r110;
                    { $pc2 = 27; continue $sw2; }
                }
                case 32: {
                    j6(r1, r2, this.FH.length - r2, r9, r17, r18);
                    return;
                }
                case 15: {
                    r17.println(r16 + "tries:");
                    { $pc2 = 16; continue $sw2; }
                }
                case 11: {
                    r5 = 0;
                    { $pc2 = 12; continue $sw2; }
                }
                case 8: {
                    r4 = 0;
                    { $pc2 = 9; continue $sw2; }
                }
                case 5: {
                    r3 = false;
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        return (j6() * 8) + this.FH.length;
    }

    public int j6() {
        FH();
        return this.DW.size();
    }

    public void j6(abcd.jp r10) {
        abcd.Qp r11 = null;
        int r0 = 0;
        int r2 = 0;
        abcd.Qt r1 = null;
        java.util.Iterator<java.util.Map.Entry<abcd.Qn, java.lang.Integer>> r3 = null;
        java.util.Map.Entry<abcd.Qn, java.lang.Integer> r4 = null;
        abcd.Qn r5 = null;
        int r6 = 0;
        boolean r7 = false;
        int r8 = 0;
        abcd.Qn.a r9 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    FH();
                    r11 = r10.Ws();
                    r0 = this.DW.size();
                    this.v5 = new java.util.TreeMap();
                    r2 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r2 >= r0) { $pc3 = 6; continue $sw3; }
                    this.v5.put(this.DW.get(r2).Zo(), null);
                    r2 = r2 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 6: {
                    if (this.v5.size() > 65535) { $pc3 = 22; continue $sw3; }
                    r1 = new abcd.Qt();
                    this.Hw = r1.DW(this.v5.size());
                    r3 = this.v5.entrySet().iterator();
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    if (r3.hasNext() == false) { $pc3 = 19; continue $sw3; }
                    r4 = r3.next();
                    r5 = r4.getKey();
                    r6 = r5.size();
                    r7 = r5.rN();
                    r4.setValue(java.lang.Integer.valueOf(r1.v5()));
                    if (r7 == false) { $pc3 = 13; continue $sw3; }
                    r1.v5(-(r6 - 1));
                    r6 = r6 - 1;
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    r8 = 0;
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    if (r8 >= r6) { $pc3 = 17; continue $sw3; }
                    r9 = r5.get(r8);
                    r1.DW(r11.j6(r9.Hw()));
                    r1.DW(r9.Zo());
                    r8 = r8 + 1;
                    { $pc3 = 15; continue $sw3; }
                }
                case 17: {
                    if (r7 == false) { $pc3 = 9; continue $sw3; }
                    r1.DW(r5.get(r6).Zo());
                    { $pc3 = 9; continue $sw3; }
                }
                case 13: {
                    r1.v5(r6);
                    { $pc3 = 14; continue $sw3; }
                }
                case 19: {
                    this.FH = r1.gn();
                    return;
                }
                case 22: {
                    throw new java.lang.UnsupportedOperationException("too many catch handlers");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.jp r7, abcd.Lt r8) {
        int r9 = 0;
        int r0 = 0;
        abcd.Rn.a r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    FH();
                    if (r8.Hw() == false) { $pc4 = 5; continue $sw4; }
                    j6("  ", null, r8);
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    r9 = this.DW.size();
                    r0 = 0;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r0 >= r9) { $pc4 = 12; continue $sw4; }
                    r1 = this.DW.get(r0);
                    r2 = r1.VH();
                    r3 = r1.Hw();
                    r4 = r3 - r2;
                    if (r4 >= 65536) { $pc4 = 11; continue $sw4; }
                    r8.writeInt(r2);
                    r8.writeShort(r4);
                    r8.writeShort(this.v5.get(r1.Zo()).intValue());
                    r0 = r0 + 1;
                    { $pc4 = 6; continue $sw4; }
                }
                case 11: {
                    throw new java.lang.UnsupportedOperationException("bogus exception range: " + abcd.Yt.gn(r2) + ".." + abcd.Yt.gn(r3));
                }
                case 12: {
                    r8.write(this.FH);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
