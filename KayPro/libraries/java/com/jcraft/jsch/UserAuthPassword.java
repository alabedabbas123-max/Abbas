package com.jcraft.jsch;

class UserAuthPassword extends com.jcraft.jsch.UserAuth {
    private final int v5;

    UserAuthPassword() {
        this.v5 = 60;
    }

    @Override
    public boolean j6(com.jcraft.jsch.Session r15) {
        byte[] r1 = null;
        java.lang.String r2 = null;
        java.lang.String r8 = null;
        byte[] r11 = null;
        int r3 = 0;
        byte[] r4 = null;
        java.lang.String[] r5 = null;
        byte[] r6 = null;
        byte[] r7 = null;
        byte[] r9 = null;
        java.lang.String r10 = null;
        java.lang.String r12 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super.j6(r15);
                    r1 = r15.kQ;
                    r2 = java.lang.String.valueOf(this.Hw) + "@" + r15.lp;
                    if (r15.br == 22) { $pc0 = 5; continue $sw0; }
                    r2 = java.lang.String.valueOf(r2) + ":" + r15.br;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r8 = r2;
                    $pc0 = 74; continue $sw0;
                }
                case 74: {
                    $pc0 = 72; continue $sw0;
                }
                case 68: {
                    th = $ex0;
                    if (r1 == null) { $pc0 = 72; continue $sw0; }
                    com.jcraft.jsch.Util.DW(r1);
                    $pc0 = 72; continue $sw0;
                }
                case 72: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    if (r15.aj >= r15.sy) { $pc0 = 14; continue $sw0; }
                    if (r1 == null) { $pc0 = 13; continue $sw0; }
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    try {
                        r11 = com.jcraft.jsch.Util.FH(this.Hw);
                        this.DW.DW();
                        this.FH.j6((byte) 50);
                        this.FH.Hw(r11);
                        this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));
                        this.FH.Hw(com.jcraft.jsch.Util.FH("password"));
                        this.FH.j6((byte) 0);
                        this.FH.Hw(r1);
                        r15.DW(this.DW);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    $pc0 = 27; continue $sw0;
                }
                case 27: {
                    try {
                        this.FH = r15.j6(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    r3 = this.FH.DW() & 255;
                    if (r3 == 52) { $pc0 = 30; continue $sw0; }
                    if (r3 == 53) { $pc0 = 35; continue $sw0; }
                    if (r3 != 60) { $pc0 = 57; continue $sw0; }
                    try {
                        this.FH.FH();
                        this.FH.j6();
                        this.FH.j6();
                        r4 = this.FH.tp();
                        this.FH.tp();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    if (this.j6 == null) { $pc0 = 51; continue $sw0; }
                    if ((this.j6 instanceof com.jcraft.jsch.UIKeyboardInteractive) == false) { $pc0 = 51; continue $sw0; }
                    try {
                        r5 = ((com.jcraft.jsch.UIKeyboardInteractive) this.j6).j6(r8, "Password Change Required", com.jcraft.jsch.Util.j6(r4), new java.lang.String[]{"New Password: "}, new boolean[1]);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    if (r5 == null) { $pc0 = 49; continue $sw0; }
                    try {
                        r6 = com.jcraft.jsch.Util.FH(r5[0]);
                        this.DW.DW();
                        this.FH.j6((byte) 50);
                        this.FH.Hw(r11);
                        this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));
                        this.FH.Hw(com.jcraft.jsch.Util.FH("password"));
                        this.FH.j6((byte) 1);
                        this.FH.Hw(r1);
                        this.FH.Hw(r6);
                        com.jcraft.jsch.Util.DW(r6);
                        r15.DW(this.DW);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    { $pc0 = 27; continue $sw0; }
                }
                case 49: {
                    try {
                        throw new com.jcraft.jsch.JSchAuthCancelException("password");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                }
                case 51: {
                    if (this.j6 == null) { $pc0 = 53; continue $sw0; }
                    try {
                        this.j6.DW("Password must be changed.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    $pc0 = 53; continue $sw0;
                }
                case 53: {
                    if (r1 == null) { $pc0 = 55; continue $sw0; }
                    com.jcraft.jsch.Util.DW(r1);
                    $pc0 = 55; continue $sw0;
                }
                case 55: {
                    return false;
                }
                case 57: {
                    if (r3 != 51) { $pc0 = 65; continue $sw0; }
                    try {
                        this.FH.FH();
                        this.FH.j6();
                        this.FH.j6();
                        r7 = this.FH.tp();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    if (this.FH.j6() != 0) { $pc0 = 64; continue $sw0; }
                    try {
                        r15.aj++;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    if (r1 == null) { $pc0 = 74; continue $sw0; }
                    try {
                        com.jcraft.jsch.Util.DW(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    r1 = null;
                    { $pc0 = 74; continue $sw0; }
                }
                case 64: {
                    try {
                        throw new com.jcraft.jsch.JSchPartialAuthException(com.jcraft.jsch.Util.j6(r7));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                }
                case 65: {
                    if (r1 == null) { $pc0 = 67; continue $sw0; }
                    com.jcraft.jsch.Util.DW(r1);
                    $pc0 = 67; continue $sw0;
                }
                case 67: {
                    return false;
                }
                case 35: {
                    try {
                        this.FH.FH();
                        this.FH.j6();
                        this.FH.j6();
                        r9 = this.FH.tp();
                        this.FH.tp();
                        r10 = com.jcraft.jsch.Util.j6(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    if (this.j6 == null) { $pc0 = 27; continue $sw0; }
                    try {
                        this.j6.DW(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    { $pc0 = 27; continue $sw0; }
                }
                case 30: {
                    if (r1 == null) { $pc0 = 32; continue $sw0; }
                    com.jcraft.jsch.Util.DW(r1);
                    $pc0 = 32; continue $sw0;
                }
                case 32: {
                    return true;
                }
                case 13: {
                    if (this.j6 == null) { $pc0 = 14; continue $sw0; }
                    if (this.j6.j6("Password for " + r8) == false) { $pc0 = 25; continue $sw0; }
                    try {
                        r12 = this.j6.getPassword();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    if (r12 == null) { $pc0 = 23; continue $sw0; }
                    try {
                        r1 = com.jcraft.jsch.Util.FH(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                    { $pc0 = 26; continue $sw0; }
                }
                case 23: {
                    try {
                        throw new com.jcraft.jsch.JSchAuthCancelException("password");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                }
                case 25: {
                    try {
                        throw new com.jcraft.jsch.JSchAuthCancelException("password");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 68; continue $sw0;
                    }
                }
                case 14: {
                    if (r1 == null) { $pc0 = 16; continue $sw0; }
                    com.jcraft.jsch.Util.DW(r1);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
