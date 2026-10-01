package com.jcraft.jsch;

public abstract class KeyExchange {
    protected com.jcraft.jsch.HASH DW;
    protected byte[] FH;
    protected byte[] Hw;
    protected com.jcraft.jsch.Session j6;
    protected byte[] v5;

    public KeyExchange() {
        this.j6 = null;
        this.DW = null;
        this.FH = null;
        this.Hw = null;
        this.v5 = null;
    }

    protected static java.lang.String[] j6(byte[] r14, byte[] r15) {
        java.lang.String[] r1 = null;
        com.jcraft.jsch.Buffer r2 = null;
        com.jcraft.jsch.Buffer r3 = null;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        byte[] r19 = null;
        byte[] r6 = null;
        int r7 = 0;
        int r8 = 0;
        java.lang.String r9 = null;
        int r10 = 0;
        int r12 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = new java.lang.String[10];
                    r2 = new com.jcraft.jsch.Buffer(r14);
                    r2.Hw(17);
                    r3 = new com.jcraft.jsch.Buffer(r15);
                    r3.Hw(17);
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc0 = 11; continue $sw0; }
                    r16 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    if (r16 >= 10) { $pc0 = 6; continue $sw0; }
                    com.jcraft.jsch.JSch.v5().j6(1, "kex: server: " + com.jcraft.jsch.Util.j6(r2.tp()));
                    r16 = r16 + 1;
                    { $pc0 = 5; continue $sw0; }
                }
                case 6: {
                    r17 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r17 >= 10) { $pc0 = 8; continue $sw0; }
                    com.jcraft.jsch.JSch.v5().j6(1, "kex: client: " + com.jcraft.jsch.Util.j6(r3.tp()));
                    r17 = r17 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 8: {
                    r2.Hw(17);
                    r3.Hw(17);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r18 = 0;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r18 >= 10) { $pc0 = 14; continue $sw0; }
                    r19 = r2.tp();
                    r6 = r3.tp();
                    r7 = 0;
                    r8 = 0;
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    if (r7 >= r6.length) { $pc0 = 44; continue $sw0; }
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    if (r7 >= r6.length) { $pc0 = 27; continue $sw0; }
                    if (r6[r7] == 44) { $pc0 = 27; continue $sw0; }
                    r7 = r7 + 1;
                    $pc0 = 27; continue $sw0;
                }
                case 27: {
                    if (r8 == r7) { $pc0 = 28; continue $sw0; }
                    r9 = com.jcraft.jsch.Util.j6(r6, r8, r7 - r8);
                    r10 = 0;
                    r12 = 0;
                    $pc0 = 31; continue $sw0;
                }
                case 31: {
                    if (r10 >= r19.length) { $pc0 = 32; continue $sw0; }
                    $pc0 = 34; continue $sw0;
                }
                case 34: {
                    if (r10 >= r19.length) { $pc0 = 39; continue $sw0; }
                    if (r19[r10] == 44) { $pc0 = 39; continue $sw0; }
                    r10 = r10 + 1;
                    $pc0 = 39; continue $sw0;
                }
                case 39: {
                    if (r12 == r10) { $pc0 = 40; continue $sw0; }
                    if (r9.equals(com.jcraft.jsch.Util.j6(r19, r12, r10 - r12)) == true) { $pc0 = 43; continue $sw0; }
                    r12 = r10 + 1;
                    r10 = r12;
                    { $pc0 = 31; continue $sw0; }
                }
                case 43: {
                    r1[r18] = r9;
                    { $pc0 = 44; continue $sw0; }
                }
                case 40: {
                    return null;
                }
                case 32: {
                    r8 = r7 + 1;
                    r7 = r8;
                    { $pc0 = 19; continue $sw0; }
                }
                case 28: {
                    return null;
                }
                case 44: {
                    if (r7 != 0) { $pc0 = 47; continue $sw0; }
                    r1[r18] = "";
                    $pc0 = 49; continue $sw0;
                }
                case 49: {
                    r18 = r18 + 1;
                    { $pc0 = 12; continue $sw0; }
                }
                case 47: {
                    if (r1[r18] != null) { $pc0 = 49; continue $sw0; }
                    return null;
                }
                case 14: {
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc0 = 16; continue $sw0; }
                    com.jcraft.jsch.JSch.v5().j6(1, "kex: server->client " + r1[3] + " " + r1[5] + " " + r1[7]);
                    com.jcraft.jsch.JSch.v5().j6(1, "kex: client->server " + r1[2] + " " + r1[4] + " " + r1[6]);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    byte[] DW() {
        return this.Hw;
    }

    com.jcraft.jsch.HASH FH() {
        return this.DW;
    }

    byte[] Hw() {
        return this.v5;
    }

    public abstract int VH();

    public abstract java.lang.String Zo();

    public java.lang.String j6() {
        com.jcraft.jsch.HASH r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        r0 = (com.jcraft.jsch.HASH) java.lang.Class.forName(this.j6.DW("md5")).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 4; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return com.jcraft.jsch.Util.j6(r0, Hw());
                }
                case 4: {
                    e = $ex1;
                    java.lang.System.err.println("getFingerPrint: " + e);
                    r0 = null;
                    { $pc1 = 7; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract void j6(com.jcraft.jsch.Session r1, byte[] r2, byte[] r3, byte[] r4, byte[] r5);

    public abstract boolean j6(com.jcraft.jsch.Buffer r1);

    protected byte[] j6(byte[] r5) {
        byte[] r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5.length > 1) { $pc2 = 5; continue $sw2; }
                    return r5;
                }
                case 5: {
                    if (r5[0] == 0) { $pc2 = 7; continue $sw2; }
                    return r5;
                }
                case 7: {
                    if ((r5[1] & 128) != 0) { $pc2 = 12; continue $sw2; }
                    r2 = new byte[r5.length - 1];
                    java.lang.System.arraycopy(r5, 1, r2, 0, r2.length);
                    return j6(r2);
                }
                case 12: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    byte[] v5() {
        return this.FH;
    }
}
