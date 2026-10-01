package com.jcraft.jsch;

public class HostKey {
    private static final byte[] DW = null;
    private static final byte[] j6 = null;
    protected java.lang.String FH;
    protected java.lang.String Hw;
    protected java.lang.String VH;
    protected byte[] Zo;
    protected int v5;

    static {
        j6 = com.jcraft.jsch.Util.FH("ssh-dss");
        DW = com.jcraft.jsch.Util.FH("ssh-rsa");
    }

    public HostKey(java.lang.String r2, int r3, byte[] r4) {
        this(r2, r3, r4, null);
    }

    public HostKey(java.lang.String r7, int r8, byte[] r9, java.lang.String r10) {
        this("", r7, r8, r9, r10);
    }

    public HostKey(java.lang.String r1, java.lang.String r2, int r3, byte[] r4, java.lang.String r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.FH = r1;
                    this.Hw = r2;
                    if (r3 == 0) { $pc0 = 5; continue $sw0; }
                    this.v5 = r3;
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    this.Zo = r4;
                    this.VH = r5;
                    return;
                }
                case 5: {
                    if (r4[8] != 100) { $pc0 = 8; continue $sw0; }
                    this.v5 = 1;
                    { $pc0 = 13; continue $sw0; }
                }
                case 8: {
                    if (r4[8] != 114) { $pc0 = 11; continue $sw0; }
                    this.v5 = 2;
                    { $pc0 = 13; continue $sw0; }
                }
                case 11: {
                    throw new com.jcraft.jsch.JSchException("invalid key type");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public HostKey(java.lang.String r2, byte[] r3) {
        this(r2, 0, r3);
    }

    private boolean DW(java.lang.String r12) {
        java.lang.String r6 = null;
        int r7 = 0;
        int r8 = 0;
        int r2 = 0;
        int r10 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r6 = this.Hw;
                    r7 = r6.length();
                    r8 = r12.length();
                    r2 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r2 >= r7) { $pc1 = 4; continue $sw1; }
                    r10 = r6.indexOf(44, r2);
                    if (r10 == (-1)) { $pc1 = 8; continue $sw1; }
                    if (r8 != (r10 - r2)) { $pc1 = 18; continue $sw1; }
                    if (r6.regionMatches(true, r2, r12, 0, r8) == false) { $pc1 = 18; continue $sw1; }
                    return true;
                }
                case 18: {
                    r2 = r10 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 8: {
                    if (r8 == (r7 - r2)) { $pc1 = 11; continue $sw1; }
                    return false;
                }
                case 11: {
                    return r6.regionMatches(true, r2, r12, 0, r8);
                }
                case 4: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String DW() {
        return this.Hw;
    }

    public java.lang.String FH() {
        byte[] r0 = this.Zo;
        return com.jcraft.jsch.Util.j6(com.jcraft.jsch.Util.FH(r0, 0, r0.length));
    }

    public java.lang.String Hw() {
        return this.FH;
    }

    public java.lang.String j6() {
        return this.VH;
    }

    boolean j6(java.lang.String r1) {
        return DW(r1);
    }

    public java.lang.String v5() {
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.v5;
                    if (r0 != 1) { $pc2 = 7; continue $sw2; }
                    return com.jcraft.jsch.Util.j6(j6);
                }
                case 7: {
                    if (r0 == 2) { $pc2 = 9; continue $sw2; }
                    return "UNKNOWN";
                }
                case 9: {
                    return com.jcraft.jsch.Util.j6(DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
