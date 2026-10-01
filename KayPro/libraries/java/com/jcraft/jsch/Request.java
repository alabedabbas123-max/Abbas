package com.jcraft.jsch;

abstract class Request {
    private com.jcraft.jsch.Session DW;
    private com.jcraft.jsch.Channel FH;
    private boolean j6;

    Request() {
        this.j6 = false;
        this.DW = null;
        this.FH = null;
    }

    void j6(com.jcraft.jsch.Packet r9) {
        long r2 = 0L;
        long r4 = 0L;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 == false) { $pc0 = 5; continue $sw0; }
                    this.FH.j3 = -1;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.DW.DW(r9);
                    if (this.j6 == false) { $pc0 = 27; continue $sw0; }
                    r2 = java.lang.System.currentTimeMillis();
                    r4 = this.FH.Mr;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (this.FH.J0() == false) { $pc0 = 23; continue $sw0; }
                    if (this.FH.j3 != (-1)) { $pc0 = 23; continue $sw0; }
                    try {
                        java.lang.Thread.sleep(10);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 28; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    if (r4 <= 0) { $pc0 = 9; continue $sw0; }
                    if ((java.lang.System.currentTimeMillis() - r2) <= r4) { $pc0 = 9; continue $sw0; }
                    this.FH.j3 = 0;
                    throw new com.jcraft.jsch.JSchException("channel request: timeout");
                }
                case 23: {
                    if (this.FH.j3 == 0) { $pc0 = 26; continue $sw0; }
                    return;
                }
                case 26: {
                    throw new com.jcraft.jsch.JSchException("failed to send channel request");
                }
                case 27: {
                    $pc0 = 28; continue $sw0;
                }
                case 28: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(com.jcraft.jsch.Session r1, com.jcraft.jsch.Channel r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.DW = r1;
                    this.FH = r2;
                    if (r2.Mr <= 0) { $pc1 = 6; continue $sw1; }
                    j6(true);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(boolean r1) {
        this.j6 = r1;
    }

    boolean j6() {
        return this.j6;
    }
}
