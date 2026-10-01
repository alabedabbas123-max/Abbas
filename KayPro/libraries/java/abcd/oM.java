package abcd;

public class oM extends abcd.EL {
    private static abcd.zL[][] j6;
    java.lang.String DW;
    private byte[] FH;

    static {
        j6 = new abcd.zL[255][];
    }

    public oM(java.lang.String r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (DW(r4) == false) { $pc0 = 7; continue $sw0; }
                    this.DW = r4;
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("string " + r4 + " not an OID");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    oM(byte[] r18) {
        java.lang.StringBuffer r1 = null;
        java.math.BigInteger r10 = null;
        long r8 = 0L;
        int r7 = 0;
        boolean r11 = false;
        int r13 = 0;
        int r12 = 0;
        long r14 = 0L;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = new java.lang.StringBuffer();
                    r10 = null;
                    r8 = 0;
                    r7 = 0;
                    r11 = true;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r7 == r18.length) { $pc1 = 5; continue $sw1; }
                    r13 = r18[r7] & 255;
                    if (r8 >= 36028797018963968L) { $pc1 = 21; continue $sw1; }
                    r8 = (r8 * 128) + ((long) (r13 & 127));
                    if ((r13 & 128) != 0) { $pc1 = 27; continue $sw1; }
                    if (r11 == false) { $pc1 = 20; continue $sw1; }
                    r12 = ((int) r8) / 40;
                    if (r12 == 0) { $pc1 = 18; continue $sw1; }
                    if (r12 == 1) { $pc1 = 17; continue $sw1; }
                    r1.append('2');
                    r14 = 80;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    r8 = r8 - r14;
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    r11 = false;
                    { $pc1 = 20; continue $sw1; }
                }
                case 17: {
                    r1.append('1');
                    r14 = 40;
                    { $pc1 = 16; continue $sw1; }
                }
                case 18: {
                    r1.append('0');
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    r1.append('.');
                    r1.append(r8);
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    r8 = 0;
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    r7 = r7 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 21: {
                    if (r10 != null) { $pc1 = 23; continue $sw1; }
                    r10 = java.math.BigInteger.valueOf(r8);
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    r10 = r10.shiftLeft(7).or(java.math.BigInteger.valueOf(r13 & 127));
                    if ((r13 & 128) != 0) { $pc1 = 27; continue $sw1; }
                    r1.append('.');
                    r1.append(r10);
                    r10 = null;
                    { $pc1 = 26; continue $sw1; }
                }
                case 5: {
                    this.DW = r1.toString();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.zL DW(byte[] r5) {
        int r0 = 0;
        abcd.zL[][] r2 = null;
        abcd.zL[] r3 = null;
        int r4 = 0;
        abcd.zL r6 = null;
        abcd.zL r1 = null;
        int r7 = 0;
        abcd.zL[][] r8 = null;
        abcd.zL[] r9 = null;
        abcd.zL r10 = null;
        abcd.zL r11 = null;
        int r12 = 0;
        abcd.zL r13 = null;
        abcd.zL r14 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5.length < 3) { $pc2 = 5; continue $sw2; }
                    r0 = r5[r5.length - 2] & 255;
                    r2 = j6;
                    r3 = r2[r0];
                    if (r3 != null) { $pc2 = 9; continue $sw2; }
                    r3 = new abcd.zL[255];
                    r2[r0] = r3;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    r4 = r5[r5.length - 1] & 255;
                    r6 = r3[r4];
                    if (r6 != null) { $pc2 = 14; continue $sw2; }
                    r1 = new abcd.zL(r5);
                    r3[r4] = r1;
                    return r1;
                }
                case 14: {
                    if (abcd.OP.j6(r5, r6.u7()) == false) { $pc2 = 16; continue $sw2; }
                    return r6;
                }
                case 16: {
                    r7 = (r0 + 1) % 256;
                    r8 = j6;
                    r9 = r8[r7];
                    if (r9 != null) { $pc2 = 19; continue $sw2; }
                    r9 = new abcd.zL[255];
                    r8[r7] = r9;
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    r10 = r9[r4];
                    if (r10 != null) { $pc2 = 24; continue $sw2; }
                    r11 = new abcd.zL(r5);
                    r9[r4] = r11;
                    return r11;
                }
                case 24: {
                    if (abcd.OP.j6(r5, r10.u7()) == false) { $pc2 = 26; continue $sw2; }
                    return r10;
                }
                case 26: {
                    r12 = (r4 + 1) % 256;
                    r13 = r9[r12];
                    if (r13 != null) { $pc2 = 31; continue $sw2; }
                    r14 = new abcd.zL(r5);
                    r9[r12] = r14;
                    return r14;
                }
                case 31: {
                    if (abcd.OP.j6(r5, r13.u7()) == false) { $pc2 = 34; continue $sw2; }
                    return r13;
                }
                case 34: {
                    return new abcd.zL(r5);
                }
                case 5: {
                    return new abcd.zL(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean DW(java.lang.String r8) {
        char r2 = 0;
        int r3 = 0;
        boolean r5 = false;
        char r6 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r8.length() >= 3) { $pc3 = 5; continue $sw3; }
                    $pc3 = 26; continue $sw3;
                }
                case 26: {
                    return false;
                }
                case 5: {
                    if (r8.charAt(1) != '.') { $pc3 = 26; continue $sw3; }
                    r2 = r8.charAt(0);
                    if (r2 < '0') { $pc3 = 26; continue $sw3; }
                    if (r2 > '2') { $pc3 = 26; continue $sw3; }
                    r3 = r8.length() - 1;
                    r5 = false;
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    if (r3 < 2) { $pc3 = 15; continue $sw3; }
                    r6 = r8.charAt(r3);
                    if ('0' <= r6) { $pc3 = 19; continue $sw3; }
                    $pc3 = 21; continue $sw3;
                }
                case 21: {
                    if (r6 != '.') { $pc3 = 26; continue $sw3; }
                    if (r5 == false) { $pc3 = 23; continue $sw3; }
                    r5 = false;
                    $pc3 = 25; continue $sw3;
                }
                case 25: {
                    r3 = r3 - 1;
                    { $pc3 = 14; continue $sw3; }
                }
                case 23: {
                    return false;
                }
                case 19: {
                    if (r6 > '9') { $pc3 = 21; continue $sw3; }
                    r5 = true;
                    { $pc3 = 25; continue $sw3; }
                }
                case 15: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.zL j6(java.lang.Object r3) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r3 == null) { $pc4 = 13; continue $sw4; }
                    if ((r3 instanceof abcd.zL) == true) { $pc4 = 13; continue $sw4; }
                    if ((r3 instanceof abcd.oM) == false) { $pc4 = 11; continue $sw4; }
                    return new abcd.zL(((abcd.oM) r3).tp());
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("illegal object in getInstance: " + r3.getClass().getName());
                }
                case 13: {
                    return (abcd.zL) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.io.ByteArrayOutputStream r5) {
        abcd.NM r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new abcd.NM(this.DW);
                    j6(r5, (java.lang.Integer.parseInt(r0.DW()) * 40) + java.lang.Integer.parseInt(r0.DW()));
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r0.j6() == false) { $pc5 = 5; continue $sw5; }
                    r1 = r0.DW();
                    if (r1.length() < 18) { $pc5 = 8; continue $sw5; }
                    j6(r5, new java.math.BigInteger(r1));
                    { $pc5 = 4; continue $sw5; }
                }
                case 8: {
                    j6(r5, java.lang.Long.parseLong(r1));
                    { $pc5 = 4; continue $sw5; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.io.ByteArrayOutputStream r7, long r8) {
        byte[] r1 = null;
        int r3 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r1 = new byte[9];
                    r3 = 8;
                    r1[8] = (byte) (((int) r8) & 127);
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r8 < 128) { $pc6 = 5; continue $sw6; }
                    r8 = r8 >> 7;
                    r3 = r3 - 1;
                    r1[r3] = (byte) ((((int) r8) & 127) | 128);
                    { $pc6 = 4; continue $sw6; }
                }
                case 5: {
                    r7.write(r1, r3, 9 - r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.io.ByteArrayOutputStream r7, java.math.BigInteger r8) {
        int r0 = 0;
        byte[] r3 = null;
        int r1 = 0;
        java.math.BigInteger r4 = null;
        int r9 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = (r8.bitLength() + 6) / 7;
                    if (r0 != 0) { $pc7 = 5; continue $sw7; }
                    r7.write(0);
                    return;
                }
                case 5: {
                    r3 = new byte[r0];
                    r1 = r0 - 1;
                    r4 = r8;
                    r9 = r1;
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (r9 < 0) { $pc7 = 7; continue $sw7; }
                    r3[r9] = (byte) ((r4.intValue() & 127) | 128);
                    r4 = r4.shiftRight(7);
                    r9 = r9 - 1;
                    { $pc7 = 6; continue $sw7; }
                }
                case 7: {
                    r3[r1] = (byte) (r3[r1] & 127);
                    r7.write(r3, 0, r3.length);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public int hashCode() {
        return this.DW.hashCode();
    }

    @Override
    void j6(abcd.CL r3) {
        byte[] r0 = u7();
        r3.j6(6);
        r3.DW(r0.length);
        r3.j6(r0);
    }

    @Override
    boolean j6(abcd.EL r2) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if ((r2 instanceof abcd.oM) == true) { $pc8 = 7; continue $sw8; }
                    return false;
                }
                case 7: {
                    return this.DW.equals(((abcd.oM) r2).DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return tp();
    }

    public java.lang.String tp() {
        return this.DW;
    }

    protected byte[] u7() {
        java.io.ByteArrayOutputStream r0 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (this.FH != null) { $pc9 = 6; continue $sw9; }
                    r0 = new java.io.ByteArrayOutputStream();
                    j6(r0);
                    this.FH = r0.toByteArray();
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    int v5() {
        int r0 = u7().length;
        return (abcd.OM.j6(r0) + 1) + r0;
    }
}
