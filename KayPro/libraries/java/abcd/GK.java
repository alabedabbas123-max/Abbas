package abcd;

public abstract class GK {
    public static final abcd.GK.a DW = null;
    public static final abcd.GK.b FH = null;
    public static final abcd.GK.c j6 = null;

    public static class a extends abcd.GK {
        public a() {
        }

        public java.lang.String j6(java.lang.String r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder();
            r0.append('\'');
            int r2 = 0;
            int r3 = 0;
        L4:
            if (r2 >= r7.length()) goto L5;
            char r4 = r7.charAt(r2);
            if (r4 == '!') goto L11;
            if (r4 == '\'') goto L11;
        L12:
            r2 = r2 + 1;
        L11:
            r0.append(r7, r3, r2);
            r0.append('\'');
            r0.append('\\');
            r0.append(r7.charAt(r2));
            r0.append('\'');
            r3 = r2 + 1;
            goto L12
        L5:
            r0.append(r7, r3, r2);
            r0.append('\'');
            return r0.toString();
        }
    }

    public static class b extends abcd.GK.a {
        public b() {
        }

        @Override
        public java.lang.String j6(java.lang.String r4) {
            if (r4.matches("^~[A-Za-z0-9_-]+$") == false) goto L7;
            return java.lang.String.valueOf(r4) + "/";
        L7:
            if (r4.matches("^~[A-Za-z0-9_-]*/.*$") == false) goto L14;
            int r0 = r4.indexOf(47) + 1;
            if (r0 != r4.length()) goto L12;
            return r4;
        L12:
            return java.lang.String.valueOf(r4.substring(0, r0)) + super.j6(r4.substring(r0));
        L14:
            return super.j6(r4);
        }
    }

    public static final class c extends abcd.GK {
        private static final byte[] Hw = null;

        static {
            Hw = new byte[128];
            java.util.Arrays.fill(Hw, (byte) -1);
            int r0 = 48;
        L4:
            if (r0 > 57) goto L5;
            Hw[r0] = 0;
            r0 = r0 + 1;
            goto L4
        L5:
            int r1 = 97;
        L7:
            if (r1 > 122) goto L8;
            Hw[r1] = 0;
            r1 = r1 + 1;
            goto L7
        L8:
            int r2 = 65;
        L10:
            if (r2 > 90) goto L11;
            Hw[r2] = 0;
            r2 = r2 + 1;
            goto L10
        L11:
            byte[] r3 = Hw;
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
            r3[124(0x7c, float:1.74E-43)] = 0;
            r3[126(0x7e, float:1.77E-43)] = 0;
            r3[7] = 97;
            r3[8] = 98;
            r3[12] = 102;
            r3[10] = 110;
            r3[13] = 114;
            r3[9] = 116;
            r3[11] = 118;
            r3[92] = 92;
            r3[34] = 34;
        }

        private c() {
        }

        c(abcd.GK.c r1) {
            this();
        }

        private static java.lang.String DW(byte[] r8, int r9, int r10) {
            byte[] r0 = new byte[r10 - r9];
            int r2 = 0;
        L3:
            if (r9 >= r10) goto L4;
            int r3 = r9 + 1;
            byte r11 = r8[r9];
            if (r11 != 92) goto L7;
            if (r3 == r10) goto L10;
            r9 = r3 + 1;
            byte r4 = r8[r3];
            if (r4 == 34) goto L50;
            if (r4 == 92) goto L50;
            if (r4 == 102) goto L49;
            if (r4 == 110) goto L48;
            if (r4 == 114) goto L47;
            if (r4 == 116) goto L46;
            if (r4 == 118) goto L45;
            if (r4 == 97) goto L44;
            if (r4 != 98) goto L30;
            int r5 = r2 + 1;
            r0[r2] = 8;
        L51:
            r2 = r5;
            goto L3
        L30:
            switch(r4) {
                case 48: goto L32;
                case 49: goto L32;
                case 50: goto L32;
                case 51: goto L32;
                default: goto L31;
            };
        L31:
            int r6 = r2 + 1;
            r0[r2] = 92;
            r2 = r6 + 1;
            r0[r6] = r8[r9 - 1];
            goto L3
        L32:
            int r7 = r8[r9 - 1] - 48;
            int r12 = 1;
        L34:
            if (r12 >= 3) goto L42;
            if (r9 >= r10) goto L42;
            byte r13 = r8[r9];
            if (48 > r13) goto L42;
            if (r13 > 55) goto L42;
            r7 = (r7 << 3) | (r13 - 48);
            r9 = r9 + 1;
            r12 = r12 + 1;
        L42:
            int r14 = r2 + 1;
            r0[r2] = (byte) r7;
        L8:
            r2 = r14;
            goto L3
        L44:
            r5 = r2 + 1;
            r0[r2] = 7;
            goto L51
        L45:
            r5 = r2 + 1;
            r0[r2] = 11;
            goto L51
        L46:
            r5 = r2 + 1;
            r0[r2] = 9;
            goto L51
        L47:
            r5 = r2 + 1;
            r0[r2] = 13;
            goto L51
        L48:
            r5 = r2 + 1;
            r0[r2] = 10;
            goto L51
        L49:
            r5 = r2 + 1;
            r0[r2] = 12;
        L50:
            r5 = r2 + 1;
            r0[r2] = r8[r9 - 1];
            goto L51
        L10:
            int r15 = r2 + 1;
            r0[r2] = 92;
        L12:
            return abcd.IK.j6(abcd.hE.Zo, r0, 0, r15);
        L7:
            r14 = r2 + 1;
            r0[r2] = r11;
            r9 = r3;
            goto L8
        L4:
            r15 = r2;
            goto L12
        }

        public java.lang.String j6(java.lang.String r11) {
            if (r11.length() != 0) goto L6;
            return "\"\"";
        L6:
            byte[] r0 = abcd.hE.j6(r11);
            java.lang.StringBuilder r1 = new java.lang.StringBuilder(r0.length + 2);
            r1.append('\"');
            int r3 = 0;
            boolean r5 = true;
        L8:
            if (r3 >= r0.length) goto L9;
            int r6 = r0[r3] & 255;
            byte[] r7 = Hw;
            if (r6 >= r7.length) goto L20;
            byte r8 = r7[r6];
            if (r8 != 0) goto L18;
            r1.append((char) r6);
        L22:
            r3 = r3 + 1;
            goto L8
        L18:
            if (r8 <= 0) goto L20;
            r1.append('\\');
            r1.append((char) r8);
        L21:
            r5 = false;
        L20:
            r1.append('\\');
            r1.append((char) (((r6 >> 6) & 3) + 48));
            r1.append((char) (((r6 >> 3) & 7) + 48));
            r1.append((char) (((r6 >> 0) & 7) + 48));
            goto L21
        L9:
            if (r5 == false) goto L11;
            return r11;
        L11:
            r1.append('\"');
            return r1.toString();
        }

        public java.lang.String j6(byte[] r4, int r5, int r6) {
            if (2 > (r6 - r5)) goto L11;
            if (r4[r5] != 34) goto L11;
            int r0 = r6 - 1;
            if (r4[r0] != 34) goto L11;
            return DW(r4, r5 + 1, r0);
        L11:
            return abcd.IK.j6(abcd.hE.Zo, r4, r5, r6);
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
