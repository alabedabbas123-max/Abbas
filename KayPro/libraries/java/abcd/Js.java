package abcd;

public final class Js extends abcd.Ms {
    public static final abcd.Js j6 = null;
    private final java.lang.String DW;
    private final abcd.Pt FH;

    static {
        j6 = new abcd.Js("");
    }

    public Js(abcd.Pt r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.FH = r2;
                    this.DW = j6(r2).intern();
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("bytes == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public Js(java.lang.String r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 == null) { $pc1 = 7; continue $sw1; }
                    this.DW = r2.intern();
                    this.FH = new abcd.Pt(j6(r2));
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("string == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(int r3, int r4) {
        throw new java.lang.IllegalArgumentException("bad utf-8 byte " + abcd.Yt.Hw(r3) + " at offset " + abcd.Yt.gn(r4));
    }

    public static java.lang.String j6(abcd.Pt r12) {
        int r0 = 0;
        char[] r1 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r9 = 0;
        int r10 = 0;
        int r7 = 0;
        int r11 = 0;
        int r8 = 0;
        char r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r12.FH();
                    r1 = new char[r0];
                    r3 = 0;
                    r4 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r0 <= 0) { $pc2 = 47; continue $sw2; }
                    r5 = r12.v5(r4);
                    switch((r5 >> 4)) {
                        case 0: { $pc2 = 39; continue $sw2; }
                        case 1: { $pc2 = 39; continue $sw2; }
                        case 2: { $pc2 = 39; continue $sw2; }
                        case 3: { $pc2 = 39; continue $sw2; }
                        case 4: { $pc2 = 39; continue $sw2; }
                        case 5: { $pc2 = 39; continue $sw2; }
                        case 6: { $pc2 = 39; continue $sw2; }
                        case 7: { $pc2 = 39; continue $sw2; }
                        case 8: { $pc2 = 6; continue $sw2; }
                        case 9: { $pc2 = 6; continue $sw2; }
                        case 10: { $pc2 = 6; continue $sw2; }
                        case 11: { $pc2 = 6; continue $sw2; }
                        case 12: { $pc2 = 24; continue $sw2; }
                        case 13: { $pc2 = 24; continue $sw2; }
                        case 14: { $pc2 = 7; continue $sw2; }
                        default: { $pc2 = 6; continue $sw2; }
                    };
                }
                case 7: {
                    r0 = r0 - 3;
                    if (r0 < 0) { $pc2 = 22; continue $sw2; }
                    r6 = r4 + 1;
                    r9 = r12.v5(r6);
                    r10 = r9 & 192;
                    if (r10 != 128) { $pc2 = 20; continue $sw2; }
                    r7 = r4 + 2;
                    r11 = r12.v5(r7);
                    if (r10 != 128) { $pc2 = 18; continue $sw2; }
                    r8 = (((r5 & 15) << 12) | ((r9 & 63) << 6)) | (r11 & 63);
                    if (r8 < 2048) { $pc2 = 16; continue $sw2; }
                    r13 = (char) r8;
                    r4 = r4 + 3;
                    $pc2 = 42; continue $sw2;
                }
                case 42: {
                    r1[r3] = r13;
                    r3 = r3 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 16: {
                    j6(r11, r7);
                    throw null;
                }
                case 18: {
                    j6(r11, r7);
                    throw null;
                }
                case 20: {
                    j6(r9, r6);
                    throw null;
                }
                case 22: {
                    j6(r5, r4);
                    throw null;
                }
                case 24: {
                    r0 = r0 - 2;
                    if (r0 < 0) { $pc2 = 37; continue $sw2; }
                    r14 = r4 + 1;
                    r15 = r12.v5(r14);
                    if ((r15 & 192) != 128) { $pc2 = 35; continue $sw2; }
                    r16 = ((r5 & 31) << 6) | (r15 & 63);
                    if (r16 == 0) { $pc2 = 34; continue $sw2; }
                    if (r16 >= 128) { $pc2 = 34; continue $sw2; }
                    j6(r15, r14);
                    throw null;
                }
                case 34: {
                    r13 = (char) r16;
                    r4 = r4 + 2;
                    { $pc2 = 42; continue $sw2; }
                }
                case 35: {
                    j6(r15, r14);
                    throw null;
                }
                case 37: {
                    j6(r5, r4);
                    throw null;
                }
                case 39: {
                    r0 = r0 - 1;
                    if (r5 == 0) { $pc2 = 43; continue $sw2; }
                    r13 = (char) r5;
                    r4 = r4 + 1;
                    { $pc2 = 42; continue $sw2; }
                }
                case 43: {
                    j6(r5, r4);
                    throw null;
                }
                case 6: {
                    j6(r5, r4);
                    throw null;
                }
                case 47: {
                    return new java.lang.String(r1, 0, r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static byte[] j6(java.lang.String r9) {
        int r0 = 0;
        byte[] r1 = null;
        int r3 = 0;
        int r4 = 0;
        char r5 = 0;
        byte[] r10 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r9.length();
                    r1 = new byte[r0 * 3];
                    r3 = 0;
                    r4 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r3 >= r0) { $pc3 = 13; continue $sw3; }
                    r5 = r9.charAt(r3);
                    if (r5 == 0) { $pc3 = 9; continue $sw3; }
                    if (r5 >= 128) { $pc3 = 9; continue $sw3; }
                    r1[r4] = (byte) r5;
                    r4 = r4 + 1;
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    r3 = r3 + 1;
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    if (r5 >= 2048) { $pc3 = 11; continue $sw3; }
                    r1[r4] = (byte) (((r5 >> 6) & 31) | 192);
                    r1[r4 + 1] = (byte) ((r5 & '?') | 128);
                    r4 = r4 + 2;
                    { $pc3 = 12; continue $sw3; }
                }
                case 11: {
                    r1[r4] = (byte) (((r5 >> '\f') & 15) | 224);
                    r1[r4 + 1] = (byte) (((r5 >> 6) & 63) | 128);
                    r1[r4 + 2] = (byte) ((r5 & '?') | 128);
                    r4 = r4 + 3;
                    { $pc3 = 12; continue $sw3; }
                }
                case 13: {
                    r10 = new byte[r4];
                    java.lang.System.arraycopy(r1, 0, r10, 0, r4);
                    return r10;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected int DW(abcd.Abstractms r2) {
        return this.DW.compareTo(((abcd.Js) r2).DW);
    }

    @Override
    public boolean Hw() {
        return false;
    }

    public int J8() {
        return this.DW.length();
    }

    public abcd.Pt VH() {
        return this.FH;
    }

    public int Ws() {
        return this.FH.FH();
    }

    @Override
    public java.lang.String Zo() {
        return "utf8";
    }

    @Override
    public java.lang.String aM() {
        int r0 = 0;
        java.lang.StringBuilder r1 = null;
        int r3 = 0;
        char r4 = 0;
        char r5 = 0;
        boolean r6 = false;
        int r7 = 0;
        char r9 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.DW.length();
                    r1 = new java.lang.StringBuilder((r0 * 3) / 2);
                    r3 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r3 >= r0) { $pc4 = 46; continue $sw4; }
                    r4 = this.DW.charAt(r3);
                    if (r4 < ' ') { $pc4 = 14; continue $sw4; }
                    if (r4 >= 127) { $pc4 = 14; continue $sw4; }
                    if (r4 != '\'') { $pc4 = 10; continue $sw4; }
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    r1.append('\\');
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    r1.append(r4);
                    $pc4 = 44; continue $sw4;
                }
                case 44: {
                    r3 = r3 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 10: {
                    if (r4 == '\"') { $pc4 = 12; continue $sw4; }
                    if (r4 != '\\') { $pc4 = 13; continue $sw4; }
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    if (r4 <= 127) { $pc4 = 16; continue $sw4; }
                    r1.append("\\u");
                    r1.append(java.lang.Character.forDigit(r4 >> '\f', 16));
                    r1.append(java.lang.Character.forDigit((r4 >> '\b') & 15, 16));
                    r1.append(java.lang.Character.forDigit((r4 >> 4) & 15, 16));
                    r1.append(java.lang.Character.forDigit(r4 & 15, 16));
                    { $pc4 = 44; continue $sw4; }
                }
                case 16: {
                    if (r4 != '\t') { $pc4 = 18; continue $sw4; }
                    r1.append("\\t");
                    { $pc4 = 44; continue $sw4; }
                }
                case 18: {
                    if (r4 != '\n') { $pc4 = 20; continue $sw4; }
                    r1.append("\\n");
                    { $pc4 = 44; continue $sw4; }
                }
                case 20: {
                    if (r4 != '\r') { $pc4 = 22; continue $sw4; }
                    r1.append("\\r");
                    { $pc4 = 44; continue $sw4; }
                }
                case 22: {
                    if (r3 >= (r0 - 1)) { $pc4 = 24; continue $sw4; }
                    r5 = this.DW.charAt(r3 + 1);
                    $pc4 = 26; continue $sw4;
                }
                case 26: {
                    if (r5 >= '0') { $pc4 = 28; continue $sw4; }
                    $pc4 = 30; continue $sw4;
                }
                case 30: {
                    r6 = false;
                    $pc4 = 31; continue $sw4;
                }
                case 31: {
                    r1.append('\\');
                    r7 = 6;
                    $pc4 = 32; continue $sw4;
                }
                case 32: {
                    if (r7 < 0) { $pc4 = 38; continue $sw4; }
                    r9 = (char) (((r4 >> r7) & 7) + 48);
                    if (r9 != '0') { $pc4 = 36; continue $sw4; }
                    if (r6 == true) { $pc4 = 36; continue $sw4; }
                    $pc4 = 37; continue $sw4;
                }
                case 37: {
                    r7 = r7 - 3;
                    $pc4 = 36; continue $sw4;
                }
                case 36: {
                    r1.append(r9);
                    r6 = true;
                    { $pc4 = 37; continue $sw4; }
                }
                case 38: {
                    if (r6 == true) { $pc4 = 44; continue $sw4; }
                    r1.append('0');
                    { $pc4 = 44; continue $sw4; }
                }
                case 28: {
                    if (r5 > '7') { $pc4 = 30; continue $sw4; }
                    r6 = true;
                    { $pc4 = 31; continue $sw4; }
                }
                case 24: {
                    r5 = 0;
                    { $pc4 = 26; continue $sw4; }
                }
                case 46: {
                    return r1.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if ((r2 instanceof abcd.Js) == true) { $pc5 = 7; continue $sw5; }
                    return false;
                }
                case 7: {
                    return this.DW.equals(((abcd.Js) r2).DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.aM;
    }

    public int hashCode() {
        return this.DW.hashCode();
    }

    public java.lang.String j6(int r4) {
        java.lang.String r0 = null;
        java.lang.String r5 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = aM();
                    if (r0.length() > (r4 - 2)) { $pc6 = 5; continue $sw6; }
                    r5 = "";
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    return '\"' + r0 + r5 + '\"';
                }
                case 5: {
                    r0 = r0.substring(0, r4 - 5);
                    r5 = "...";
                    { $pc6 = 7; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String lg() {
        return '\"' + aM() + '\"';
    }

    public java.lang.String toString() {
        return "string{\"" + aM() + "\"}";
    }

    public java.lang.String we() {
        return this.DW;
    }
}
