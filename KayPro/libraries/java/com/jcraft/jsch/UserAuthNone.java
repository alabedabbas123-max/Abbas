package com.jcraft.jsch;

class UserAuthNone extends com.jcraft.jsch.UserAuth {
    private java.lang.String v5;

    UserAuthNone() {
        this.v5 = null;
    }

    java.lang.String j6() {
        return this.v5;
    }

    @Override
    public boolean j6(com.jcraft.jsch.Session r6) {
        boolean r0 = false;
        byte[] r1 = null;
        int r2 = 0;
        byte[] r3 = null;
        java.lang.String r4 = null;
        com.jcraft.jsch.UserInfo r5 = null;
        byte[] r7 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super.j6(r6);
                    this.DW.DW();
                    this.FH.j6((byte) 5);
                    this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-userauth"));
                    r6.DW(this.DW);
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc0 = 5; continue $sw0; }
                    com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_SERVICE_REQUEST sent");
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.FH = r6.j6(this.FH);
                    if (this.FH.DW() != 6) { $pc0 = 8; continue $sw0; }
                    r0 = true;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc0 = 12; continue $sw0; }
                    com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_SERVICE_ACCEPT received");
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r0 == true) { $pc0 = 14; continue $sw0; }
                    return false;
                }
                case 14: {
                    r1 = com.jcraft.jsch.Util.FH(this.Hw);
                    this.DW.DW();
                    this.FH.j6((byte) 50);
                    this.FH.Hw(r1);
                    this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));
                    this.FH.Hw(com.jcraft.jsch.Util.FH("none"));
                    r6.DW(this.DW);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    this.FH = r6.j6(this.FH);
                    r2 = this.FH.DW() & 255;
                    if (r2 == 52) { $pc0 = 17; continue $sw0; }
                    if (r2 != 53) { $pc0 = 26; continue $sw0; }
                    this.FH.FH();
                    this.FH.j6();
                    this.FH.j6();
                    r3 = this.FH.tp();
                    this.FH.tp();
                    r4 = com.jcraft.jsch.Util.j6(r3);
                    r5 = this.j6;
                    if (r5 == null) { $pc0 = 15; continue $sw0; }
                    try {
                        r5.DW(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc0 = 24; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 15; continue $sw0; }
                }
                case 26: {
                    if (r2 != 51) { $pc0 = 30; continue $sw0; }
                    this.FH.FH();
                    this.FH.j6();
                    this.FH.j6();
                    r7 = this.FH.tp();
                    this.FH.j6();
                    this.v5 = com.jcraft.jsch.Util.j6(r7);
                    return false;
                }
                case 30: {
                    throw new com.jcraft.jsch.JSchException("USERAUTH fail (" + r2 + ")");
                }
                case 17: {
                    return true;
                }
                case 8: {
                    r0 = false;
                    { $pc0 = 10; continue $sw0; }
                }
                case 24: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
