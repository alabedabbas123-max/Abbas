package abcd;

public class NA {
    static abcd.InterfacetA j6;
    java.io.OutputStream DW;
    int FH;
    java.util.List<abcd.IA> Hw;
    java.util.Set<java.lang.String> v5;

    public NA(java.io.OutputStream r2) {
        this.DW = null;
        this.FH = 0;
        this.Hw = new java.util.LinkedList();
        this.v5 = new java.util.HashSet();
        this.DW = r2;
    }

    private static abcd.InterfacetA FH() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6 != null) { $pc0 = 6; continue $sw0; }
                    j6 = abcd.uA.j6(abcd.NA.class.getName());
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        return this.FH;
    }

    public void j6() {
        abcd.HA r0 = null;
        short r1 = 0;
        java.util.Iterator<abcd.IA> r2 = null;
        java.io.OutputStream r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new abcd.HA();
                    r0.gn = DW();
                    r1 = (short) this.Hw.size();
                    r0.Zo = r1;
                    r0.v5 = r1;
                    r2 = this.Hw.iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc1 = 6; continue $sw1; }
                    r2.next().j6(this);
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    r0.VH = DW() - r0.gn;
                    r0.u7 = "";
                    r0.j6(this);
                    r3 = this.DW;
                    if (r3 == null) { $pc1 = 14; continue $sw1; }
                    try {
                        r3.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    return;
                }
                case 15: {
                    return;
                }
                case 10: {
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r5) {
        byte[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r1 = new byte[4];
                    r2 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r2 >= 4) { $pc2 = 5; continue $sw2; }
                    r1[r2] = (byte) (r5 & 255);
                    r5 = r5 >> 8;
                    r2 = r2 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 5: {
                    this.DW.write(r1);
                    this.FH += 4;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.IA r4) {
        java.lang.String r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r4.EQ();
                    if (this.v5.contains(r0) == false) { $pc3 = 6; continue $sw3; }
                    FH().DW("Skipping duplicate file in output: " + r0);
                    return;
                }
                case 6: {
                    r4.DW(this);
                    this.Hw.add(r4);
                    this.v5.add(r0);
                    if (FH().isDebugEnabled() == false) { $pc3 = 10; continue $sw3; }
                    abcd.MA.j6(FH(), r4);
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r2) {
        byte[] r3 = r2.getBytes();
        this.DW.write(r3);
        this.FH += r3.length;
    }

    public void j6(short r5) {
        byte[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r1 = new byte[2];
                    r2 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r2 >= 2) { $pc4 = 5; continue $sw4; }
                    r1[r2] = (byte) (r5 & 255);
                    r5 = (short) (r5 >> 8);
                    r2 = r2 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 5: {
                    this.DW.write(r1);
                    this.FH += 2;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(byte[] r2) {
        this.DW.write(r2);
        this.FH += r2.length;
    }

    public void j6(byte[] r2, int r3, int r4) {
        this.DW.write(r2, r3, r4);
        this.FH += r4;
    }
}
