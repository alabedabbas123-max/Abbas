package abcd;

public class kO {
    private final abcd.WN DW;
    private final abcd.WN FH;
    private final abcd.InterfacevP Hw;
    private final abcd._N VH;
    private final abcd.InterfaceyP Zo;
    private byte[] gn;
    private final abcd.XM j6;
    private abcd.SN u7;
    private final abcd.InterfacezP v5;

    kO(abcd.XM r7, abcd.InterfacevP r8, abcd.AP r9, abcd._N r10) {
        this(r7, r8, r9, r10, false);
    }

    kO(abcd.XM r2, abcd.InterfacevP r3, abcd.AP r4, abcd._N r5, abcd.WN r6, abcd.WN r7) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.Zo = new abcd.wP();
                    this.gn = null;
                    this.j6 = r2;
                    this.Hw = r3;
                    if (r4 == null) { $pc0 = 5; continue $sw0; }
                    this.v5 = r4.j6(this.Zo.j6(r3.DW()));
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.DW = r6;
                    this.FH = r7;
                    this.VH = r5;
                    return;
                }
                case 5: {
                    this.v5 = null;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    kO(abcd.XM r2, abcd.InterfacevP r3, abcd.AP r4, abcd._N r5, boolean r6) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.Zo = new abcd.wP();
                    this.gn = null;
                    this.j6 = r2;
                    this.Hw = r3;
                    if (r4 == null) { $pc1 = 5; continue $sw1; }
                    this.v5 = r4.j6(this.Zo.j6(r3.DW()));
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r6 == false) { $pc1 = 8; continue $sw1; }
                    this.DW = null;
                    this.FH = null;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    this.VH = r5;
                    return;
                }
                case 8: {
                    this.DW = new abcd.iO();
                    this.FH = null;
                    { $pc1 = 9; continue $sw1; }
                }
                case 5: {
                    this.v5 = null;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public kO(abcd.kO r2, abcd.WN r3, abcd.WN r4) {
        this.Zo = new abcd.wP();
        this.gn = null;
        this.j6 = r2.j6;
        this.Hw = r2.Hw;
        this.v5 = r2.v5;
        this.VH = r2.VH;
        this.DW = r3;
        this.FH = r4;
    }

    private abcd.HL j6(abcd.RM r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 != null) { $pc2 = 4; continue $sw2; }
                    return null;
                }
                case 4: {
                    return new abcd.vM(r2.j6());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.util.Map j6(abcd.oM r3, abcd.wN r4, byte[] r5) {
        java.util.HashMap r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.util.HashMap();
                    if (r3 == null) { $pc3 = 5; continue $sw3; }
                    r0.put("contentType", r3);
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r0.put("digestAlgID", r4);
                    r0.put("digest", r5.clone());
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.OutputStream DW() {
        abcd.InterfacezP r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.v5;
                    if (r0 == null) { $pc4 = 11; continue $sw4; }
                    if (this.DW != null) { $pc4 = 9; continue $sw4; }
                    return new abcd.YP(r0.j6(), this.Hw.j6());
                }
                case 9: {
                    return r0.j6();
                }
                case 11: {
                    return this.Hw.j6();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.YM j6(abcd.zL r10) {
        abcd.HL r1 = null;
        abcd.wN r0 = null;
        abcd.HL r2 = null;
        java.io.OutputStream r3 = null;
        abcd.wN r4 = null;
        abcd.HL r5 = null;
        byte[] r6 = null;
        java.util.Map r11 = null;
        abcd.HL r8 = null;
        abcd.wN r7 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r1 = null;
                    if (this.DW == null) { $pc5 = 6; continue $sw5; }
                    try {
                        r0 = this.v5.DW();
                        this.gn = this.v5.FH();
                        r2 = j6(this.DW.getAttributes(java.util.Collections.unmodifiableMap(j6(r10, this.v5.DW(), this.gn))));
                        r3 = this.Hw.j6();
                        r3.write(r2.j6("DER"));
                        r3.close();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 15; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r4 = r0;
                    r5 = r2;
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    try {
                        r6 = this.Hw.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 15; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.FH == null) { $pc5 = 13; continue $sw5; }
                    try {
                        r11 = j6(r10, r4, this.gn);
                        r11.put("encryptedDigest", r6.clone());
                        r1 = j6(this.FH.getAttributes(java.util.Collections.unmodifiableMap(r11)));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 15; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    r8 = r1;
                    return new abcd.YM(this.j6, r4, r5, this.VH.j6(this.Hw.DW()), new abcd.pM(r6), r8);
                }
                case 6: {
                    if (this.v5 == null) { $pc5 = 8; continue $sw5; }
                    try {
                        r7 = this.v5.DW();
                        this.gn = this.v5.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 15; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    r4 = r7;
                    r5 = null;
                    { $pc5 = 10; continue $sw5; }
                }
                case 8: {
                    try {
                        r7 = this.Zo.j6(this.Hw.DW());
                        this.gn = null;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 15; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    throw new java.lang.IllegalStateException();
                }
                case 15: {
                    e = $ex5;
                    throw new abcd.XN("encoding error.", e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.SN r1) {
        this.u7 = r1;
    }

    public byte[] j6() {
        byte[] r0 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.gn;
                    if (r0 != null) { $pc6 = 5; continue $sw6; }
                    return null;
                }
                case 5: {
                    return (byte[]) r0.clone();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
