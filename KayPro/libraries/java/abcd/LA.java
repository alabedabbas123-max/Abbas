package abcd;

public class LA {
    static abcd.InterfacetA j6;
    public java.lang.String DW;
    java.io.RandomAccessFile FH;
    long Hw;
    abcd.HA VH;
    java.util.Map<java.lang.String, abcd.IA> Zo;
    int v5;

    public LA(java.lang.String r3) {
        this.FH = null;
        this.v5 = 0;
        this.Zo = new java.util.LinkedHashMap();
        this.DW = r3;
        this.FH = new java.io.RandomAccessFile(new java.io.File(this.DW), "r");
        this.Hw = this.FH.length();
    }

    private static abcd.InterfacetA Zo() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6 != null) { $pc0 = 6; continue $sw0; }
                    j6 = abcd.uA.j6(abcd.LA.class.getName());
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.LA j6(java.lang.String r1) {
        abcd.LA r0 = new abcd.LA(r1);
        r0.v5();
        return r0;
    }

    private void v5() {
        boolean r0 = false;
        int r1 = 0;
        abcd.IA r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        this.FH.seek(FH(256));
                        this.VH = abcd.HA.j6(this);
                        r0 = Zo().isDebugEnabled();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 13; continue $sw1;
                    }
                    r1 = 0;
                    if (r0 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        Zo().FH(java.lang.String.format("EOCD found in %d iterations", new java.lang.Object[]{java.lang.Integer.valueOf(this.v5)}));
                        Zo().FH(java.lang.String.format("Directory entries=%d, size=%d, offset=%d/0x%08x", new java.lang.Object[]{java.lang.Short.valueOf(this.VH.Zo), java.lang.Integer.valueOf(this.VH.VH), java.lang.Integer.valueOf(this.VH.gn), java.lang.Integer.valueOf(this.VH.gn)}));
                        abcd.MA.j6(Zo());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 13; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.FH.seek(this.VH.gn);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 13; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r1 >= this.VH.Zo) { $pc1 = 21; continue $sw1; }
                    try {
                        r2 = abcd.IA.j6(this);
                        this.Zo.put(r2.EQ(), r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 13; continue $sw1;
                    }
                    if (r0 == false) { $pc1 = 12; continue $sw1; }
                    try {
                        abcd.MA.j6(Zo(), r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 13; continue $sw1;
                    }
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    r1 = r1 + 1;
                    { $pc1 = 7; continue $sw1; }
                }
                case 21: {
                    return;
                }
                case 13: {
                    th = $ex1;
                    th.printStackTrace();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long DW() {
        return this.FH.getFilePointer();
    }

    public java.lang.String DW(int r4) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new byte[r4];
                    r1 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r1 >= r4) { $pc2 = 6; continue $sw2; }
                    r0[r1] = this.FH.readByte();
                    r1 = r1 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 6: {
                    return new java.lang.String(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0 >= 4) { $pc3 = 6; continue $sw3; }
                    r1 = r1 | (this.FH.readUnsignedByte() << (r0 * 8));
                    r0 = r0 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 6: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long FH(int r8) {
        long r0 = 0L;
        long r2 = 0L;
        int r1 = 0;
        byte[] r3 = null;
        long r5 = 0L;
        int r4 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r8;
                    r2 = this.Hw;
                    if (r0 > r2) { $pc4 = 22; continue $sw4; }
                    if (r8 > 65536) { $pc4 = 22; continue $sw4; }
                    r1 = (int) java.lang.Math.min(r2, r0);
                    r3 = new byte[r1];
                    r5 = r1;
                    this.FH.seek(this.Hw - r5);
                    this.FH.readFully(r3);
                    r4 = r1 - 22;
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r4 < 0) { $pc4 = 20; continue $sw4; }
                    this.v5++;
                    if (r3[r4] != 80) { $pc4 = 18; continue $sw4; }
                    if (r3[r4 + 1] != 75) { $pc4 = 18; continue $sw4; }
                    if (r3[r4 + 2] != 5) { $pc4 = 18; continue $sw4; }
                    if (r3[r4 + 3] != 6) { $pc4 = 18; continue $sw4; }
                    return (this.Hw - r5) + ((long) r4);
                }
                case 18: {
                    r4 = r4 - 1;
                    { $pc4 = 7; continue $sw4; }
                }
                case 20: {
                    return FH(r8 * 2);
                }
                case 22: {
                    throw new java.lang.IllegalStateException("End of central directory not found in " + this.DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public short Hw() {
        int r0 = 0;
        short r1 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r0 >= 2) { $pc5 = 6; continue $sw5; }
                    r1 = (short) (r1 | (this.FH.readUnsignedByte() << (r0 * 8)));
                    r0 = r0 + 1;
                    { $pc5 = 4; continue $sw5; }
                }
                case 6: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Map<java.lang.String, abcd.IA> j6() {
        return this.Zo;
    }

    public void j6(long r2) {
        this.FH.seek(r2);
    }

    public byte[] j6(int r4) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new byte[r4];
                    r1 = 0;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r1 >= r4) { $pc6 = 5; continue $sw6; }
                    r0[r1] = this.FH.readByte();
                    r1 = r1 + 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
