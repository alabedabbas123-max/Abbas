package abcd;

public abstract class GK {
    public static final abcd.GK.a DW = null;
    public static final abcd.GK.b FH = null;
    public static final abcd.GK.c j6 = null;

    public static class a extends abcd.GK {
        public a() {
        }

        public java.lang.String j6(java.lang.String r7) {
            java.lang.StringBuilder r0 = null;
            int r2 = 0;
            int r3 = 0;
            char r4 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = new java.lang.StringBuilder();
                        r0.append('\'');
                        r2 = 0;
                        r3 = 0;
                        $pc0 = 4; continue $sw0;
                    }
                    case 4: {
                        if (r2 >= r7.length()) { $pc0 = 5; continue $sw0; }
                        r4 = r7.charAt(r2);
                        if (r4 == '!') { $pc0 = 11; continue $sw0; }
                        if (r4 == '\'') { $pc0 = 11; continue $sw0; }
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        r2 = r2 + 1;
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        r0.append(r7, r3, r2);
                        r0.append('\'');
                        r0.append('\\');
                        r0.append(r7.charAt(r2));
                        r0.append('\'');
                        r3 = r2 + 1;
                        { $pc0 = 12; continue $sw0; }
                    }
                    case 5: {
                        r0.append(r7, r3, r2);
                        r0.append('\'');
                        return r0.toString();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public static class b extends abcd.GK.a {
        public b() {
        }

        @Override
        public java.lang.String j6(java.lang.String r4) {
            int r0 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (r4.matches("^~[A-Za-z0-9_-]+$") == false) { $pc1 = 7; continue $sw1; }
                        return java.lang.String.valueOf(r4) + "/";
                    }
                    case 7: {
                        if (r4.matches("^~[A-Za-z0-9_-]*/.*$") == false) { $pc1 = 14; continue $sw1; }
                        r0 = r4.indexOf(47) + 1;
                        if (r0 != r4.length()) { $pc1 = 12; continue $sw1; }
                        return r4;
                    }
                    case 12: {
                        return java.lang.String.valueOf(r4.substring(0, r0)) + super.j6(r4.substring(r0));
                    }
                    case 14: {
                        return super.j6(r4);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public static final class c extends abcd.GK {
        private static final byte[] Hw = null;

        static {
            int r0 = 0;
            int r1 = 0;
            int r2 = 0;
            byte[] r3 = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        Hw = new byte[128];
                        java.util.Arrays.fill(Hw, (byte) -1);
                        r0 = 48;
                        $pc2 = 4; continue $sw2;
                    }
                    case 4: {
                        if (r0 > 57) { $pc2 = 5; continue $sw2; }
                        Hw[r0] = 0;
                        r0 = r0 + 1;
                        { $pc2 = 4; continue $sw2; }
                    }
                    case 5: {
                        r1 = 97;
                        $pc2 = 7; continue $sw2;
                    }
                    case 7: {
                        if (r1 > 122) { $pc2 = 8; continue $sw2; }
                        Hw[r1] = 0;
                        r1 = r1 + 1;
                        { $pc2 = 7; continue $sw2; }
                    }
                    case 8: {
                        r2 = 65;
                        $pc2 = 10; continue $sw2;
                    }
                    case 10: {
                        if (r2 > 90) { $pc2 = 11; continue $sw2; }
                        Hw[r2] = 0;
                        r2 = r2 + 1;
                        { $pc2 = 10; continue $sw2; }
                    }
                    case 11: {
                        r3 = Hw;
                        r3[32] = 0;
                        r3[36] = 0;
                        r3[37] = 0;
                        r3[38] = 0;
                        r3[42] = 0;
                        r3[43] = 0;
                        r3[44] = 0;
                        r3[45] = 0;
                        r3[46] = 0;
                        r3[47] = 0;
                        r3[58] = 0;
                        r3[59] = 0;
                        r3[61] = 0;
                        r3[63] = 0;
                        r3[64] = 0;
                        r3[95] = 0;
                        r3[94] = 0;
                        r3[124] = 0;
                        r3[126] = 0;
                        r3[7] = 97;
                        r3[8] = 98;
                        r3[12] = 102;
                        r3[10] = 110;
                        r3[13] = 114;
                        r3[9] = 116;
                        r3[11] = 118;
                        r3[92] = 92;
                        r3[34] = 34;
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private c() {
        }

        c(abcd.GK.c r1) {
            this();
        }

        private static java.lang.String DW(byte[] r8, int r9, int r10) {
            byte[] r0 = null;
            int r2 = 0;
            int r3 = 0;
            byte r11 = 0;
            byte r4 = 0;
            int r5 = 0;
            int r6 = 0;
            int r7 = 0;
            int r12 = 0;
            byte r13 = 0;
            int r14 = 0;
            int r15 = 0;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = new byte[r10 - r9];
                        r2 = 0;
                        $pc3 = 3; continue $sw3;
                    }
                    case 3: {
                        if (r9 >= r10) { $pc3 = 4; continue $sw3; }
                        r3 = r9 + 1;
                        r11 = r8[r9];
                        if (r11 != 92) { $pc3 = 7; continue $sw3; }
                        if (r3 == r10) { $pc3 = 10; continue $sw3; }
                        r9 = r3 + 1;
                        r4 = r8[r3];
                        if (r4 == 34) { $pc3 = 50; continue $sw3; }
                        if (r4 == 92) { $pc3 = 50; continue $sw3; }
                        if (r4 == 102) { $pc3 = 49; continue $sw3; }
                        if (r4 == 110) { $pc3 = 48; continue $sw3; }
                        if (r4 == 114) { $pc3 = 47; continue $sw3; }
                        if (r4 == 116) { $pc3 = 46; continue $sw3; }
                        if (r4 == 118) { $pc3 = 45; continue $sw3; }
                        if (r4 == 97) { $pc3 = 44; continue $sw3; }
                        if (r4 != 98) { $pc3 = 30; continue $sw3; }
                        r5 = r2 + 1;
                        r0[r2] = 8;
                        $pc3 = 51; continue $sw3;
                    }
                    case 51: {
                        r2 = r5;
                        { $pc3 = 3; continue $sw3; }
                    }
                    case 30: {
                        switch(r4) {
                            case 48: { $pc3 = 32; continue $sw3; }
                            case 49: { $pc3 = 32; continue $sw3; }
                            case 50: { $pc3 = 32; continue $sw3; }
                            case 51: { $pc3 = 32; continue $sw3; }
                            default: { $pc3 = 31; continue $sw3; }
                        };
                    }
                    case 31: {
                        r6 = r2 + 1;
                        r0[r2] = 92;
                        r2 = r6 + 1;
                        r0[r6] = r8[r9 - 1];
                        { $pc3 = 3; continue $sw3; }
                    }
                    case 32: {
                        r7 = r8[r9 - 1] - 48;
                        r12 = 1;
                        $pc3 = 34; continue $sw3;
                    }
                    case 34: {
                        if (r12 >= 3) { $pc3 = 42; continue $sw3; }
                        if (r9 >= r10) { $pc3 = 42; continue $sw3; }
                        r13 = r8[r9];
                        if (48 > r13) { $pc3 = 42; continue $sw3; }
                        if (r13 > 55) { $pc3 = 42; continue $sw3; }
                        r7 = (r7 << 3) | (r13 - 48);
                        r9 = r9 + 1;
                        r12 = r12 + 1;
                        $pc3 = 42; continue $sw3;
                    }
                    case 42: {
                        r14 = r2 + 1;
                        r0[r2] = (byte) r7;
                        $pc3 = 8; continue $sw3;
                    }
                    case 8: {
                        r2 = r14;
                        { $pc3 = 3; continue $sw3; }
                    }
                    case 44: {
                        r5 = r2 + 1;
                        r0[r2] = 7;
                        { $pc3 = 51; continue $sw3; }
                    }
                    case 45: {
                        r5 = r2 + 1;
                        r0[r2] = 11;
                        { $pc3 = 51; continue $sw3; }
                    }
                    case 46: {
                        r5 = r2 + 1;
                        r0[r2] = 9;
                        { $pc3 = 51; continue $sw3; }
                    }
                    case 47: {
                        r5 = r2 + 1;
                        r0[r2] = 13;
                        { $pc3 = 51; continue $sw3; }
                    }
                    case 48: {
                        r5 = r2 + 1;
                        r0[r2] = 10;
                        { $pc3 = 51; continue $sw3; }
                    }
                    case 49: {
                        r5 = r2 + 1;
                        r0[r2] = 12;
                        $pc3 = 50; continue $sw3;
                    }
                    case 50: {
                        r5 = r2 + 1;
                        r0[r2] = r8[r9 - 1];
                        { $pc3 = 51; continue $sw3; }
                    }
                    case 10: {
                        r15 = r2 + 1;
                        r0[r2] = 92;
                        $pc3 = 12; continue $sw3;
                    }
                    case 12: {
                        return abcd.IK.j6(abcd.hE.Zo, r0, 0, r15);
                    }
                    case 7: {
                        r14 = r2 + 1;
                        r0[r2] = r11;
                        r9 = r3;
                        { $pc3 = 8; continue $sw3; }
                    }
                    case 4: {
                        r15 = r2;
                        { $pc3 = 12; continue $sw3; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.lang.String j6(java.lang.String r11) {
            byte[] r0 = null;
            java.lang.StringBuilder r1 = null;
            int r3 = 0;
            boolean r5 = false;
            int r6 = 0;
            byte[] r7 = null;
            byte r8 = 0;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        if (r11.length() != 0) { $pc4 = 6; continue $sw4; }
                        return "\"\"";
                    }
                    case 6: {
                        r0 = abcd.hE.j6(r11);
                        r1 = new java.lang.StringBuilder(r0.length + 2);
                        r1.append('\"');
                        r3 = 0;
                        r5 = true;
                        $pc4 = 8; continue $sw4;
                    }
                    case 8: {
                        if (r3 >= r0.length) { $pc4 = 9; continue $sw4; }
                        r6 = r0[r3] & 255;
                        r7 = Hw;
                        if (r6 >= r7.length) { $pc4 = 20; continue $sw4; }
                        r8 = r7[r6];
                        if (r8 != 0) { $pc4 = 18; continue $sw4; }
                        r1.append((char) r6);
                        $pc4 = 22; continue $sw4;
                    }
                    case 22: {
                        r3 = r3 + 1;
                        { $pc4 = 8; continue $sw4; }
                    }
                    case 18: {
                        if (r8 <= 0) { $pc4 = 20; continue $sw4; }
                        r1.append('\\');
                        r1.append((char) r8);
                        $pc4 = 21; continue $sw4;
                    }
                    case 21: {
                        r5 = false;
                        $pc4 = 20; continue $sw4;
                    }
                    case 20: {
                        r1.append('\\');
                        r1.append((char) (((r6 >> 6) & 3) + 48));
                        r1.append((char) (((r6 >> 3) & 7) + 48));
                        r1.append((char) (((r6 >> 0) & 7) + 48));
                        { $pc4 = 21; continue $sw4; }
                    }
                    case 9: {
                        if (r5 == false) { $pc4 = 11; continue $sw4; }
                        return r11;
                    }
                    case 11: {
                        r1.append('\"');
                        return r1.toString();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.lang.String j6(byte[] r4, int r5, int r6) {
            int r0 = 0;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        if (2 > (r6 - r5)) { $pc5 = 11; continue $sw5; }
                        if (r4[r5] != 34) { $pc5 = 11; continue $sw5; }
                        r0 = r6 - 1;
                        if (r4[r0] != 34) { $pc5 = 11; continue $sw5; }
                        return DW(r4, r5 + 1, r0);
                    }
                    case 11: {
                        return abcd.IK.j6(abcd.hE.Zo, r4, r5, r6);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        j6 = new abcd.GK.c(null);
        DW = new abcd.GK.a();
        FH = new abcd.GK.b();
    }

    public GK() {
    }
}
