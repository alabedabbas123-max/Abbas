package abcd;

public class fE {
    private static final byte[] DW = null;
    private static final byte[] FH = null;
    private static final byte[] Hw = null;
    private static final byte[] Zo = null;
    private static final abcd.yE[] j6 = null;
    private static final byte[] v5 = null;
    private java.lang.String EQ;
    private abcd.yE VH;
    private abcd.yE[] gn;
    private abcd.KE tp;
    private abcd.KE u7;
    private java.nio.charset.Charset we;

    static {
        j6 = new abcd.yE[0];
        DW = abcd.hE.DW("tree");
        FH = abcd.hE.DW("parent");
        Hw = abcd.hE.DW("author");
        v5 = abcd.hE.DW("committer");
        Zo = abcd.hE.DW("encoding");
    }

    public fE() {
        this.gn = j6;
        this.we = abcd.hE.Zo;
    }

    public abcd.KE DW() {
        return this.u7;
    }

    public void DW(abcd.KE r1) {
        this.tp = r1;
    }

    public abcd.KE FH() {
        return this.tp;
    }

    public java.nio.charset.Charset Hw() {
        return this.we;
    }

    public abcd.yE VH() {
        return this.VH;
    }

    public abcd.yE[] Zo() {
        return this.gn;
    }

    public void j6(abcd.KE r1) {
        this.u7 = r1;
    }

    public void j6(abcd.YD r1) {
        this.VH = r1.Hw();
    }

    public void j6(java.lang.String r1) {
        this.EQ = r1;
    }

    public void j6(java.util.List<? extends abcd.YD> r4) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.gn = new abcd.yE[r4.size()];
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= r4.size()) { $pc0 = 5; continue $sw0; }
                    this.gn[r0] = r4.get(r0).Hw();
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] j6() {
        java.io.ByteArrayOutputStream r0 = null;
        java.io.OutputStreamWriter r1 = null;
        abcd.yE[] r4 = null;
        int r5 = 0;
        int r6 = 0;
        abcd.yE r7 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.io.ByteArrayOutputStream();
                    r1 = new java.io.OutputStreamWriter(r0, Hw());
                    try {
                        r0.write(DW);
                        r0.write(32);
                        VH().DW(r0);
                        r0.write(10);
                        r4 = Zo();
                        r5 = r4.length;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r6 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r6 >= r5) { $pc1 = 5; continue $sw1; }
                    try {
                        r7 = r4[r6];
                        r0.write(FH);
                        r0.write(32);
                        r7.DW(r0);
                        r0.write(10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r6 = r6 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    try {
                        r0.write(Hw);
                        r0.write(32);
                        r1.write(DW().Hw());
                        r1.flush();
                        r0.write(10);
                        r0.write(v5);
                        r0.write(32);
                        r1.write(FH().Hw());
                        r1.flush();
                        r0.write(10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (Hw() == abcd.hE.Zo) { $pc1 = 8; continue $sw1; }
                    try {
                        r0.write(Zo);
                        r0.write(32);
                        r0.write(abcd.hE.DW(Hw().name()));
                        r0.write(10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    try {
                        r0.write(10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (v5() == null) { $pc1 = 12; continue $sw1; }
                    try {
                        r1.write(v5());
                        r1.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    return r0.toByteArray();
                }
                case 15: {
                    e = $ex1;
                    throw new java.lang.RuntimeException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        abcd.yE r1 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        abcd.yE[] r4 = null;
        int r5 = 0;
        int r6 = 0;
        abcd.yE r7 = null;
        abcd.KE r8 = null;
        java.lang.String r9 = null;
        abcd.KE r10 = null;
        java.nio.charset.Charset r11 = null;
        java.lang.String r12 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("Commit");
                    r0.append("={\n");
                    r0.append("tree ");
                    r1 = this.VH;
                    r2 = "NOT_SET";
                    if (r1 == null) { $pc2 = 5; continue $sw2; }
                    r3 = r1.we();
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r0.append(r3);
                    r0.append("\n");
                    r4 = this.gn;
                    r5 = r4.length;
                    r6 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r6 >= r5) { $pc2 = 8; continue $sw2; }
                    r7 = r4[r6];
                    r0.append("parent ");
                    r0.append(r7.we());
                    r0.append("\n");
                    r6 = r6 + 1;
                    { $pc2 = 7; continue $sw2; }
                }
                case 8: {
                    r0.append("author ");
                    r8 = this.u7;
                    if (r8 == null) { $pc2 = 11; continue $sw2; }
                    r9 = r8.toString();
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    r0.append(r9);
                    r0.append("\n");
                    r0.append("committer ");
                    r10 = this.tp;
                    if (r10 == null) { $pc2 = 15; continue $sw2; }
                    r2 = r10.toString();
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    r0.append(r2);
                    r0.append("\n");
                    r11 = this.we;
                    if (r11 != null) { $pc2 = 18; continue $sw2; }
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    r0.append("\n");
                    r12 = this.EQ;
                    if (r12 != null) { $pc2 = 24; continue $sw2; }
                    r12 = "";
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    r0.append(r12);
                    r0.append("}");
                    return r0.toString();
                }
                case 18: {
                    if (r11 == abcd.hE.Zo) { $pc2 = 20; continue $sw2; }
                    r0.append("encoding ");
                    r0.append(this.we.name());
                    r0.append("\n");
                    { $pc2 = 20; continue $sw2; }
                }
                case 11: {
                    r9 = "NOT_SET";
                    { $pc2 = 12; continue $sw2; }
                }
                case 5: {
                    r3 = "NOT_SET";
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String v5() {
        return this.EQ;
    }
}
