package com.jcraft.jsch;

public class IO {
    java.io.OutputStream DW;
    java.io.OutputStream FH;
    private boolean Hw;
    private boolean Zo;
    java.io.InputStream j6;
    private boolean v5;

    public IO() {
        this.Hw = false;
        this.v5 = false;
        this.Zo = false;
    }

    int DW() {
        return this.j6.read();
    }

    void DW(java.io.OutputStream r1) {
        this.DW = r1;
    }

    void DW(java.io.OutputStream r1, boolean r2) {
        this.v5 = r2;
        DW(r1);
    }

    void DW(byte[] r2, int r3, int r4) {
        this.DW.write(r2, r3, r4);
        this.DW.flush();
    }

    void FH() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.DW != null) { $pc0 = 5; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    try {
                        this.DW = null;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    if (this.v5 == true) { $pc0 = 7; continue $sw0; }
                    try {
                        this.DW.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void FH(byte[] r2, int r3, int r4) {
        this.FH.write(r2, r3, r4);
        this.FH.flush();
    }

    public void j6() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.j6 != null) { $pc1 = 6; continue $sw1; }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    try {
                        this.j6 = null;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 17; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc1 = 9; continue $sw1; }
                }
                case 6: {
                    if (this.Hw == true) { $pc1 = 8; continue $sw1; }
                    try {
                        this.j6.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 17; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    FH();
                    if (this.FH != null) { $pc1 = 13; continue $sw1; }
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    try {
                        this.FH = null;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 18; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 13: {
                    if (this.Zo == true) { $pc1 = 15; continue $sw1; }
                    try {
                        this.FH.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 18; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.jcraft.jsch.Packet r4) {
        java.io.OutputStream r0 = this.DW;
        com.jcraft.jsch.Buffer r5 = r4.DW;
        r0.write(r5.DW, 0, r5.FH);
        this.DW.flush();
    }

    void j6(java.io.InputStream r1) {
        this.j6 = r1;
    }

    void j6(java.io.InputStream r1, boolean r2) {
        this.Hw = r2;
        j6(r1);
    }

    void j6(java.io.OutputStream r1) {
        this.FH = r1;
    }

    void j6(java.io.OutputStream r1, boolean r2) {
        this.Zo = r2;
        j6(r1);
    }

    void j6(byte[] r2, int r3, int r4) {
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 2;
        $sw2: while (true) {
            switch ($pc2) {
                case 2: {
                    r0 = this.j6.read(r2, r3, r4);
                    if (r0 < 0) { $pc2 = 8; continue $sw2; }
                    r3 = r3 + r0;
                    r4 = r4 - r0;
                    if (r4 > 0) { $pc2 = 2; continue $sw2; }
                    return;
                }
                case 8: {
                    throw new java.io.IOException("End of IO Stream Read");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
