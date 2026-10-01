package com.jcraft.jsch;

public class UserAuthGSSAPIWithMIC extends com.jcraft.jsch.UserAuth {
    private static final java.lang.String[] Zo = null;
    private static final byte[][] v5 = null;

    static {
        v5 = new byte[][]{new byte[]{6, 9, 42, -122, 72, -122, -9, 18, 1, 2, 2}};
        Zo = new java.lang.String[]{"gssapi-with-mic.krb5"};
    }

    public UserAuthGSSAPIWithMIC() {
    }

    @Override
    public boolean j6(com.jcraft.jsch.Session r12) {
        byte[] r0 = null;
        int r5 = 0;
        byte[][] r6 = null;
        java.lang.String r7 = null;
        int r8 = 0;
        byte[] r9 = null;
        java.lang.String r10 = null;
        com.jcraft.jsch.UserInfo r11 = null;
        byte[] r13 = null;
        int r14 = 0;
        byte[][] r15 = null;
        com.jcraft.jsch.GSSContext r16 = null;
        byte[] r17 = null;
        int r18 = 0;
        byte r19 = 0;
        com.jcraft.jsch.Buffer r20 = null;
        byte[] r1 = null;
        int r110 = 0;
        byte[] r111 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super.j6(r12);
                    r0 = com.jcraft.jsch.Util.FH(this.Hw);
                    this.DW.DW();
                    this.FH.j6((byte) 50);
                    this.FH.Hw(r0);
                    this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));
                    this.FH.Hw(com.jcraft.jsch.Util.FH("gssapi-with-mic"));
                    this.FH.FH(v5.length);
                    r5 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r6 = v5;
                    if (r5 >= r6.length) { $pc0 = 5; continue $sw0; }
                    this.FH.Hw(r6[r5]);
                    r5 = r5 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    r12.DW(this.DW);
                    r7 = null;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.FH = r12.j6(this.FH);
                    r8 = this.FH.DW() & 255;
                    if (r8 == 51) { $pc0 = 8; continue $sw0; }
                    if (r8 == 60) { $pc0 = 11; continue $sw0; }
                    if (r8 != 53) { $pc0 = 60; continue $sw0; }
                    this.FH.FH();
                    this.FH.j6();
                    this.FH.j6();
                    r9 = this.FH.tp();
                    this.FH.tp();
                    r10 = com.jcraft.jsch.Util.j6(r9);
                    r11 = this.j6;
                    if (r11 == null) { $pc0 = 6; continue $sw0; }
                    r11.DW(r10);
                    { $pc0 = 6; continue $sw0; }
                }
                case 60: {
                    return false;
                }
                case 11: {
                    this.FH.FH();
                    this.FH.j6();
                    this.FH.j6();
                    r13 = this.FH.tp();
                    r14 = 0;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r15 = v5;
                    if (r14 >= r15.length) { $pc0 = 18; continue $sw0; }
                    if (com.jcraft.jsch.Util.j6(r13, r15[r14]) == true) { $pc0 = 17; continue $sw0; }
                    r14 = r14 + 1;
                    { $pc0 = 12; continue $sw0; }
                }
                case 17: {
                    r7 = Zo[r14];
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    if (r7 != null) { $pc0 = 62; continue $sw0; }
                    return false;
                }
                case 62: {
                    try {
                        r16 = (com.jcraft.jsch.GSSContext) java.lang.Class.forName(r12.DW(r7)).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 53; continue $sw0;
                    }
                    r16.j6(this.Hw, r12.lp);
                    r17 = new byte[0];
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    if (r16.DW() == true) { $pc0 = 24; continue $sw0; }
                    try {
                        r17 = r16.j6(r17, 0, r17.length);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 53; continue $sw0;
                    }
                    if (r17 == null) { $pc0 = 42; continue $sw0; }
                    this.DW.DW();
                    this.FH.j6((byte) 61);
                    this.FH.Hw(r17);
                    r12.DW(this.DW);
                    $pc0 = 42; continue $sw0;
                }
                case 42: {
                    if (r16.DW() == true) { $pc0 = 23; continue $sw0; }
                    this.FH = r12.j6(this.FH);
                    r18 = this.FH.DW() & 255;
                    if (r18 != 64) { $pc0 = 48; continue $sw0; }
                    this.FH = r12.j6(this.FH);
                    r19 = this.FH.DW();
                    $pc0 = 46; continue $sw0;
                }
                case 46: {
                    r18 = r19 & 255;
                    $pc0 = 50; continue $sw0;
                }
                case 50: {
                    if (r18 == 51) { $pc0 = 51; continue $sw0; }
                    this.FH.FH();
                    this.FH.j6();
                    this.FH.j6();
                    r17 = this.FH.tp();
                    { $pc0 = 23; continue $sw0; }
                }
                case 51: {
                    return false;
                }
                case 48: {
                    if (r18 != 65) { $pc0 = 50; continue $sw0; }
                    this.FH = r12.j6(this.FH);
                    r19 = this.FH.DW();
                    { $pc0 = 46; continue $sw0; }
                }
                case 24: {
                    r20 = new com.jcraft.jsch.Buffer();
                    r20.Hw(r12.Zo());
                    r20.j6((byte) 50);
                    r20.Hw(r0);
                    r20.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));
                    r20.Hw(com.jcraft.jsch.Util.FH("gssapi-with-mic"));
                    r1 = r16.DW(r20.DW, 0, r20.Hw());
                    if (r1 != null) { $pc0 = 27; continue $sw0; }
                    return false;
                }
                case 27: {
                    this.DW.DW();
                    this.FH.j6((byte) 66);
                    this.FH.Hw(r1);
                    r12.DW(this.DW);
                    r16.j6();
                    this.FH = r12.j6(this.FH);
                    r110 = this.FH.DW() & 255;
                    if (r110 != 52) { $pc0 = 31; continue $sw0; }
                    return true;
                }
                case 31: {
                    if (r110 != 51) { $pc0 = 37; continue $sw0; }
                    this.FH.FH();
                    this.FH.j6();
                    this.FH.j6();
                    r111 = this.FH.tp();
                    if (this.FH.j6() == 0) { $pc0 = 37; continue $sw0; }
                    throw new com.jcraft.jsch.JSchPartialAuthException(com.jcraft.jsch.Util.j6(r111));
                }
                case 37: {
                    return false;
                }
                case 53: {
                    return false;
                }
                case 8: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
