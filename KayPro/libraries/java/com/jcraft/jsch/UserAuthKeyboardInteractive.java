package com.jcraft.jsch;

class UserAuthKeyboardInteractive extends com.jcraft.jsch.UserAuth {
    UserAuthKeyboardInteractive() {
    }

    @Override
    public boolean j6(com.jcraft.jsch.Session r18) {
        com.jcraft.jsch.UserInfo r2 = null;
        java.lang.String r3 = null;
        byte[] r4 = null;
        byte[] r10 = null;
        boolean r5 = false;
        byte[] r14 = null;
        boolean r13 = false;
        boolean r6 = false;
        int r7 = 0;
        java.lang.String r8 = null;
        java.lang.String r9 = null;
        int r15 = 0;
        java.lang.String[] r11 = null;
        boolean[] r12 = null;
        int r16 = 0;
        boolean r17 = false;
        byte[] r19 = null;
        com.jcraft.jsch.UserInfo r20 = null;
        java.lang.String[] r21 = null;
        byte[][] r22 = null;
        int r23 = 0;
        int r24 = 0;
        int r25 = 0;
        byte[] r26 = null;
        byte[] r27 = null;
        java.lang.String r28 = null;
        com.jcraft.jsch.UserInfo r29 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super.j6(r18);
                    r2 = this.j6;
                    if (r2 != null) { $pc0 = 5; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r3 = java.lang.String.valueOf(this.Hw) + "@" + r18.lp;
                    if (r18.br == 22) { $pc0 = 10; continue $sw0; }
                    r3 = java.lang.String.valueOf(r3) + ":" + r18.br;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r4 = r18.kQ;
                    r10 = com.jcraft.jsch.Util.FH(this.Hw);
                    r5 = false;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r18.aj >= r18.sy) { $pc0 = 13; continue $sw0; }
                    this.DW.DW();
                    this.FH.j6((byte) 50);
                    this.FH.Hw(r10);
                    this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));
                    this.FH.Hw(com.jcraft.jsch.Util.FH("keyboard-interactive"));
                    this.FH.Hw(com.jcraft.jsch.Util.FH);
                    this.FH.Hw(com.jcraft.jsch.Util.FH);
                    r18.DW(this.DW);
                    r14 = r4;
                    r13 = r5;
                    r6 = true;
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    this.FH = r18.j6(this.FH);
                    r7 = this.FH.DW() & 255;
                    if (r7 == 52) { $pc0 = 17; continue $sw0; }
                    if (r7 == 53) { $pc0 = 20; continue $sw0; }
                    if (r7 == 51) { $pc0 = 25; continue $sw0; }
                    if (r7 != 60) { $pc0 = 87; continue $sw0; }
                    this.FH.FH();
                    this.FH.j6();
                    this.FH.j6();
                    r8 = com.jcraft.jsch.Util.j6(this.FH.tp());
                    r9 = com.jcraft.jsch.Util.j6(this.FH.tp());
                    com.jcraft.jsch.Util.j6(this.FH.tp());
                    r15 = this.FH.FH();
                    r11 = new java.lang.String[r15];
                    r12 = new boolean[r15];
                    r16 = 0;
                    $pc0 = 39; continue $sw0;
                }
                case 39: {
                    if (r16 >= r15) { $pc0 = 40; continue $sw0; }
                    r11[r16] = com.jcraft.jsch.Util.j6(this.FH.tp());
                    if (this.FH.j6() == 0) { $pc0 = 85; continue $sw0; }
                    r17 = true;
                    $pc0 = 86; continue $sw0;
                }
                case 86: {
                    r12[r16] = r17;
                    r16 = r16 + 1;
                    { $pc0 = 39; continue $sw0; }
                }
                case 85: {
                    r17 = false;
                    { $pc0 = 86; continue $sw0; }
                }
                case 40: {
                    r19 = null;
                    if (r14 != null) { $pc0 = 43; continue $sw0; }
                    $pc0 = 49; continue $sw0;
                }
                case 49: {
                    if (r15 <= 0) { $pc0 = 51; continue $sw0; }
                    $pc0 = 54; continue $sw0;
                }
                case 54: {
                    r20 = this.j6;
                    if (r20 == null) { $pc0 = 63; continue $sw0; }
                    r21 = ((com.jcraft.jsch.UIKeyboardInteractive) r20).j6(r3, r8, r9, r11, r12);
                    if (r21 == null) { $pc0 = 63; continue $sw0; }
                    r22 = new byte[r21.length][];
                    r23 = 0;
                    $pc0 = 60; continue $sw0;
                }
                case 60: {
                    if (r23 >= r21.length) { $pc0 = 64; continue $sw0; }
                    r22[r23] = com.jcraft.jsch.Util.FH(r21[r23]);
                    r23 = r23 + 1;
                    $pc0 = 64; continue $sw0;
                }
                case 64: {
                    r19 = r14;
                    $pc0 = 65; continue $sw0;
                }
                case 65: {
                    this.DW.DW();
                    this.FH.j6((byte) 61);
                    if (r15 <= 0) { $pc0 = 78; continue $sw0; }
                    if (r22 != null) { $pc0 = 69; continue $sw0; }
                    $pc0 = 70; continue $sw0;
                }
                case 70: {
                    if (r22 != null) { $pc0 = 75; continue $sw0; }
                    this.FH.FH(r15);
                    r24 = 0;
                    $pc0 = 72; continue $sw0;
                }
                case 72: {
                    if (r24 >= r15) { $pc0 = 76; continue $sw0; }
                    this.FH.Hw(com.jcraft.jsch.Util.FH);
                    r24 = r24 + 1;
                    $pc0 = 76; continue $sw0;
                }
                case 76: {
                    if (r22 != null) { $pc0 = 80; continue $sw0; }
                    r13 = true;
                    $pc0 = 80; continue $sw0;
                }
                case 80: {
                    r18.DW(this.DW);
                    r14 = r19;
                    r6 = false;
                    { $pc0 = 15; continue $sw0; }
                }
                case 75: {
                    this.FH.FH(0);
                    { $pc0 = 76; continue $sw0; }
                }
                case 69: {
                    if (r15 != r22.length) { $pc0 = 70; continue $sw0; }
                    $pc0 = 78; continue $sw0;
                }
                case 78: {
                    this.FH.FH(r15);
                    r25 = 0;
                    $pc0 = 79; continue $sw0;
                }
                case 79: {
                    if (r25 >= r15) { $pc0 = 80; continue $sw0; }
                    this.FH.Hw(r22[r25]);
                    r25 = r25 + 1;
                    $pc0 = 63; continue $sw0;
                }
                case 63: {
                    r22 = null;
                    { $pc0 = 64; continue $sw0; }
                }
                case 51: {
                    if (r8.length() > 0) { $pc0 = 54; continue $sw0; }
                    if (r9.length() <= 0) { $pc0 = 63; continue $sw0; }
                    $pc0 = 43; continue $sw0;
                }
                case 43: {
                    if (r11.length != 1) { $pc0 = 49; continue $sw0; }
                    if (r12[0] == true) { $pc0 = 49; continue $sw0; }
                    if (r11[0].toLowerCase().indexOf("password:") < 0) { $pc0 = 49; continue $sw0; }
                    r22 = new byte[][]{r14};
                    { $pc0 = 65; continue $sw0; }
                }
                case 87: {
                    return false;
                }
                case 25: {
                    this.FH.FH();
                    this.FH.j6();
                    this.FH.j6();
                    r26 = this.FH.tp();
                    if (this.FH.j6() != 0) { $pc0 = 35; continue $sw0; }
                    if (r6 == true) { $pc0 = 28; continue $sw0; }
                    r18.aj++;
                    if (r13 == true) { $pc0 = 33; continue $sw0; }
                    r5 = r13;
                    r4 = r14;
                    { $pc0 = 12; continue $sw0; }
                }
                case 33: {
                    throw new com.jcraft.jsch.JSchAuthCancelException("keyboard-interactive");
                }
                case 28: {
                    return false;
                }
                case 35: {
                    throw new com.jcraft.jsch.JSchPartialAuthException(com.jcraft.jsch.Util.j6(r26));
                }
                case 20: {
                    this.FH.FH();
                    this.FH.j6();
                    this.FH.j6();
                    r27 = this.FH.tp();
                    this.FH.tp();
                    r28 = com.jcraft.jsch.Util.j6(r27);
                    r29 = this.j6;
                    if (r29 == null) { $pc0 = 15; continue $sw0; }
                    r29.DW(r28);
                    { $pc0 = 15; continue $sw0; }
                }
                case 17: {
                    return true;
                }
                case 13: {
                    return false;
                }
                case 5: {
                    if ((r2 instanceof com.jcraft.jsch.UIKeyboardInteractive) == true) { $pc0 = 7; continue $sw0; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
