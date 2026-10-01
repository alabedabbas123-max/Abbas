package abcd;

public final class Gn {
    public final abcd.Gn.a DW;
    public final abcd.Gn.a EQ;
    public final abcd.Gn.a FH;
    public final abcd.Gn.a Hw;
    public final abcd.Gn.a J0;
    public final abcd.Gn.a J8;
    public int Mr;
    public final abcd.Gn.a QX;
    public byte[] U2;
    public final abcd.Gn.a VH;
    public final abcd.Gn.a Ws;
    public final abcd.Gn.a XL;
    public final abcd.Gn.a Zo;
    public int a8;
    public final abcd.Gn.a aM;
    public int er;
    public final abcd.Gn.a gn;
    public final abcd.Gn.a[] j3;
    public final abcd.Gn.a j6;
    public int lg;
    public int rN;
    public final abcd.Gn.a tp;
    public final abcd.Gn.a u7;
    public final abcd.Gn.a v5;
    public final abcd.Gn.a we;
    public int yS;

    public static class a implements java.lang.Comparable<abcd.Gn.a> {
        public int DW;
        public int FH;
        public int Hw;
        public final short j6;

        public a(int r3) {
            this.DW = 0;
            this.FH = -1;
            this.Hw = 0;
            this.j6 = (short) r3;
        }

        public boolean Hw() {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.DW <= 0) { $pc0 = 5; continue $sw0; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public int compareTo(abcd.Gn.a r1) {
            return j6(r1);
        }

        public int j6(abcd.Gn.a r2) {
            int r0 = 0;
            int r3 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = this.FH;
                        r3 = r2.FH;
                        if (r0 == r3) { $pc1 = 8; continue $sw1; }
                        if (r0 >= r3) { $pc1 = 6; continue $sw1; }
                        return -1;
                    }
                    case 6: {
                        return 1;
                    }
                    case 8: {
                        return 0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.lang.String toString() {
            return java.lang.String.format("Section[type=%#x,off=%#x,size=%#x]", new java.lang.Object[]{java.lang.Short.valueOf(this.j6), java.lang.Integer.valueOf(this.FH), java.lang.Integer.valueOf(this.DW)});
        }
    }

    public Gn() {
        this.j6 = new abcd.Gn.a(0);
        this.DW = new abcd.Gn.a(1);
        this.FH = new abcd.Gn.a(2);
        this.Hw = new abcd.Gn.a(3);
        this.v5 = new abcd.Gn.a(4);
        this.Zo = new abcd.Gn.a(5);
        this.VH = new abcd.Gn.a(6);
        this.gn = new abcd.Gn.a(4096);
        this.u7 = new abcd.Gn.a(4097);
        this.tp = new abcd.Gn.a(4098);
        this.EQ = new abcd.Gn.a(4099);
        this.we = new abcd.Gn.a(8192);
        this.J0 = new abcd.Gn.a(8193);
        this.J8 = new abcd.Gn.a(8194);
        this.Ws = new abcd.Gn.a(8195);
        this.QX = new abcd.Gn.a(8196);
        this.XL = new abcd.Gn.a(8197);
        this.aM = new abcd.Gn.a(8198);
        this.j3 = new abcd.Gn.a[]{this.j6, this.DW, this.FH, this.Hw, this.v5, this.Zo, this.VH, this.gn, this.u7, this.tp, this.EQ, this.we, this.J0, this.J8, this.Ws, this.QX, this.XL, this.aM};
        this.U2 = new byte[20];
    }

    private void DW(abcd.iq.a r10) {
        int r0 = 0;
        abcd.Gn.a r1 = null;
        int r2 = 0;
        short r3 = 0;
        abcd.Gn.a r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r10.XL();
                    r1 = null;
                    r2 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r2 >= r0) { $pc2 = 21; continue $sw2; }
                    r3 = r10.Mr();
                    r10.Mr();
                    r4 = j6(r3);
                    r5 = r10.XL();
                    r6 = r10.XL();
                    r7 = r4.DW;
                    if (r7 == 0) { $pc2 = 7; continue $sw2; }
                    if (r7 == r5) { $pc2 = 7; continue $sw2; }
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw new abcd.Ut("Unexpected map value for 0x" + java.lang.Integer.toHexString(r3));
                }
                case 7: {
                    r8 = r4.FH;
                    if (r8 == (-1)) { $pc2 = 13; continue $sw2; }
                    if (r8 != r6) { $pc2 = 12; continue $sw2; }
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    r4.DW = r5;
                    r4.FH = r6;
                    if (r1 == null) { $pc2 = 20; continue $sw2; }
                    if (r1.FH <= r4.FH) { $pc2 = 20; continue $sw2; }
                    throw new abcd.Ut("Map is unsorted at " + r1 + ", " + r4);
                }
                case 20: {
                    r2 = r2 + 1;
                    r1 = r4;
                    { $pc2 = 3; continue $sw2; }
                }
                case 21: {
                    java.util.Arrays.sort(this.j3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Gn.a j6(short r6) {
        abcd.Gn.a[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        abcd.Gn.a r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.j3;
                    r1 = r0.length;
                    r2 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r2 >= r1) { $pc3 = 9; continue $sw3; }
                    r3 = r0[r2];
                    if (r3.j6 == r6) { $pc3 = 6; continue $sw3; }
                    r2 = r2 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 6: {
                    return r3;
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("No such map item: " + r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.iq.a r4) {
        byte[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r4.v5(8);
                    if (abcd.En.j6(r0) < 0) { $pc4 = 19; continue $sw4; }
                    this.Mr = r4.XL();
                    this.U2 = r4.v5(20);
                    this.a8 = r4.XL();
                    r1 = r4.XL();
                    if (r1 != 112) { $pc4 = 17; continue $sw4; }
                    r2 = r4.XL();
                    if (r2 != 305419896) { $pc4 = 15; continue $sw4; }
                    this.lg = r4.XL();
                    this.rN = r4.XL();
                    this.gn.FH = r4.XL();
                    if (this.gn.FH == 0) { $pc4 = 13; continue $sw4; }
                    this.DW.DW = r4.XL();
                    this.DW.FH = r4.XL();
                    this.FH.DW = r4.XL();
                    this.FH.FH = r4.XL();
                    this.Hw.DW = r4.XL();
                    this.Hw.FH = r4.XL();
                    this.v5.DW = r4.XL();
                    this.v5.FH = r4.XL();
                    this.Zo.DW = r4.XL();
                    this.Zo.FH = r4.XL();
                    this.VH.DW = r4.XL();
                    this.VH.FH = r4.XL();
                    this.er = r4.XL();
                    this.yS = r4.XL();
                    return;
                }
                case 13: {
                    throw new abcd.Ut("Cannot merge dex files that do not contain a map");
                }
                case 15: {
                    throw new abcd.Ut("Unexpected endian tag: 0x" + java.lang.Integer.toHexString(r2));
                }
                case 17: {
                    throw new abcd.Ut("Unexpected header: 0x" + java.lang.Integer.toHexString(r1));
                }
                case 19: {
                    throw new abcd.Ut("Unexpected magic: " + java.util.Arrays.toString(r0));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        int r0 = 0;
        int r1 = 0;
        abcd.Gn.a r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.yS + this.er;
                    r1 = this.j3.length - 1;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r1 < 0) { $pc5 = 12; continue $sw5; }
                    r2 = this.j3[r1];
                    r3 = r2.FH;
                    if (r3 == (-1)) { $pc5 = 9; continue $sw5; }
                    if (r3 > r0) { $pc5 = 11; continue $sw5; }
                    r2.Hw = r0 - r3;
                    r0 = r3;
                    { $pc5 = 9; continue $sw5; }
                }
                case 11: {
                    throw new abcd.Ut("Map is unsorted at " + r2);
                }
                case 9: {
                    r1 = r1 - 1;
                    { $pc5 = 3; continue $sw5; }
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.iq r2) {
        j6(r2.DW(0));
        DW(r2.DW(this.gn.FH));
        j6();
    }
}
