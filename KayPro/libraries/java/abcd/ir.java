package abcd;

public final class ir {
    public final abcd.ir.a DW;
    public final abcd.ir.a EQ;
    public final abcd.ir.a FH;
    public final abcd.ir.a Hw;
    public final abcd.ir.a J0;
    public final abcd.ir.a J8;
    public final int Mr;
    public final abcd.ir.a QX;
    public final byte[] U2;
    public final abcd.ir.a VH;
    public final abcd.ir.a Ws;
    public final abcd.ir.a XL;
    public final abcd.ir.a Zo;
    public int a8;
    public final abcd.ir.a aM;
    public int er;
    public final abcd.ir.a gn;
    public final java.util.List<abcd.ir.a> j3;
    public final abcd.ir.a j6;
    public final int lg;
    public final int rN;
    public final abcd.ir.a tp;
    public final abcd.ir.a u7;
    public final abcd.ir.a v5;
    public final abcd.ir.a we;
    public int yS;

    public static class a implements java.lang.Comparable<abcd.ir.a> {
        public int DW;
        public int FH;
        public final short j6;

        public a(int r2) {
            this.DW = 0;
            this.FH = -1;
            this.j6 = (short) r2;
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
        public int compareTo(abcd.ir.a r1) {
            return j6(r1);
        }

        public int j6(abcd.ir.a r2) {
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

    public ir() {
        this.j6 = new abcd.ir.a(0);
        this.DW = new abcd.ir.a(1);
        this.FH = new abcd.ir.a(2);
        this.Hw = new abcd.ir.a(3);
        this.v5 = new abcd.ir.a(4);
        this.Zo = new abcd.ir.a(5);
        this.VH = new abcd.ir.a(6);
        this.gn = new abcd.ir.a(4096);
        this.u7 = new abcd.ir.a(4097);
        this.tp = new abcd.ir.a(4098);
        this.EQ = new abcd.ir.a(4099);
        this.we = new abcd.ir.a(8192);
        this.J0 = new abcd.ir.a(8193);
        this.J8 = new abcd.ir.a(8194);
        this.Ws = new abcd.ir.a(8195);
        this.QX = new abcd.ir.a(8196);
        this.XL = new abcd.ir.a(8197);
        this.aM = new abcd.ir.a(8198);
        this.j3 = new java.util.ArrayList();
        this.Mr = 0;
        this.U2 = new byte[20];
        this.lg = 0;
        this.rN = 0;
    }

    public void j6(abcd.hr.a r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        r3.write(abcd.En.j6(13).getBytes("UTF-8"));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc2 = 6; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r3.writeInt(0);
                    r3.write(this.U2);
                    r3.writeInt(this.a8);
                    r3.writeInt(112);
                    r3.writeInt(305419896);
                    r3.writeInt(0);
                    r3.writeInt(0);
                    r3.writeInt(this.gn.FH);
                    r3.writeInt(this.DW.DW);
                    r3.writeInt(this.DW.FH);
                    r3.writeInt(this.FH.DW);
                    r3.writeInt(this.FH.FH);
                    r3.writeInt(this.Hw.DW);
                    r3.writeInt(this.Hw.FH);
                    r3.writeInt(this.v5.DW);
                    r3.writeInt(this.v5.FH);
                    r3.writeInt(this.Zo.DW);
                    r3.writeInt(this.Zo.FH);
                    r3.writeInt(this.VH.DW);
                    r3.writeInt(this.VH.FH);
                    r3.writeInt(this.er);
                    r3.writeInt(this.yS);
                    return;
                }
                case 6: {
                    e = $ex2;
                    throw new java.lang.RuntimeException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.hr.a r5, java.util.List<abcd.ir.a> r6) {
        java.util.Iterator<abcd.ir.a> r0 = null;
        int r2 = 0;
        java.util.Iterator<abcd.ir.a> r7 = null;
        abcd.ir.a r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r6.iterator();
                    r2 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc3 = 8; continue $sw3; }
                    if (r0.next().Hw() == false) { $pc3 = 4; continue $sw3; }
                    r2 = r2 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 8: {
                    r5.writeInt(r2);
                    r7 = r6.iterator();
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    if (r7.hasNext() == false) { $pc3 = 14; continue $sw3; }
                    r1 = r7.next();
                    if (r1.Hw() == false) { $pc3 = 10; continue $sw3; }
                    r5.j6(r1.j6);
                    r5.j6(0);
                    r5.writeInt(r1.DW);
                    r5.writeInt(r1.FH);
                    { $pc3 = 10; continue $sw3; }
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
