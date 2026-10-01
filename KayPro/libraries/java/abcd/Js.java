package abcd;

public final class Js extends abcd.Ms {
    public static final abcd.Js j6 = null;
    private final java.lang.String DW;
    private final abcd.Pt FH;

    static {
        j6 = new abcd.Js("");
    }

    public Js(abcd.Pt r2) {
        if (r2 == null) goto L7;
        this.FH = r2;
        this.DW = j6(r2).intern();
        return;
    L7:
        throw new java.lang.NullPointerException("bytes == null");
    }

    public Js(java.lang.String r2) {
        if (r2 == null) goto L7;
        this.DW = r2.intern();
        this.FH = new abcd.Pt(j6(r2));
        return;
    L7:
        throw new java.lang.NullPointerException("string == null");
    }

    private static java.lang.String j6(int r3, int r4) {
        throw new java.lang.IllegalArgumentException("bad utf-8 byte " + abcd.Yt.Hw(r3) + " at offset " + abcd.Yt.gn(r4));
    }

    public static java.lang.String j6(abcd.Pt r12) {
        int r0 = r12.FH();
        char[] r1 = new char[r0];
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r0 <= 0) goto L47;
        int r5 = r12.v5(r4);
        switch((r5 >> 4)) {
            case 0: goto L39;
            case 1: goto L39;
            case 2: goto L39;
            case 3: goto L39;
            case 4: goto L39;
            case 5: goto L39;
            case 6: goto L39;
            case 7: goto L39;
            case 8: goto L6;
            case 9: goto L6;
            case 10: goto L6;
            case 11: goto L6;
            case 12: goto L24;
            case 13: goto L24;
            case 14: goto L7;
            default: goto L6;
        };
    L7:
        r0 = r0 - 3;
        if (r0 < 0) goto L22;
        int r6 = r4 + 1;
        int r9 = r12.v5(r6);
        int r10 = r9 & 192;
        if (r10 != 128) goto L20;
        int r7 = r4 + 2;
        int r11 = r12.v5(r7);
        if (r10 != 128) goto L18;
        int r8 = (((r5 & 15) << 12) | ((r9 & 63) << 6)) | (r11 & 63);
        if (r8 < 2048) goto L16;
        char r13 = (char) r8;
        r4 = r4 + 3;
    L42:
        r1[r3] = r13;
        r3 = r3 + 1;
        goto L3
    L16:
        j6(r11, r7);
        throw null;
    L18:
        j6(r11, r7);
        throw null;
    L20:
        j6(r9, r6);
        throw null;
    L22:
        j6(r5, r4);
        throw null;
    L24:
        r0 = r0 - 2;
        if (r0 < 0) goto L37;
        int r14 = r4 + 1;
        int r15 = r12.v5(r14);
        if ((r15 & 192) != 128) goto L35;
        int r16 = ((r5 & 31) << 6) | (r15 & 63);
        if (r16 == 0) goto L34;
        if (r16 >= 128) goto L34;
        j6(r15, r14);
        throw null;
    L34:
        r13 = (char) r16;
        r4 = r4 + 2;
        goto L42
    L35:
        j6(r15, r14);
        throw null;
    L37:
        j6(r5, r4);
        throw null;
    L39:
        r0 = r0 - 1;
        if (r5 == 0) goto L43;
        r13 = (char) r5;
        r4 = r4 + 1;
        goto L42
    L43:
        j6(r5, r4);
        throw null;
    L6:
        j6(r5, r4);
        throw null;
    L47:
        return new java.lang.String(r1, 0, r3);
    }

    public static byte[] j6(java.lang.String r9) {
        int r0 = r9.length();
        byte[] r1 = new byte[r0 * 3];
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r0) goto L13;
        char r5 = r9.charAt(r3);
        if (r5 == 0) goto L9;
        if (r5 >= 128) goto L9;
        r1[r4] = (byte) r5;
        r4 = r4 + 1;
    L12:
        r3 = r3 + 1;
    L9:
        if (r5 >= 2048) goto L11;
        r1[r4] = (byte) (((r5 >> 6) & 31) | 192);
        r1[r4 + 1] = (byte) ((r5 & '?') | 128);
        r4 = r4 + 2;
        goto L12
    L11:
        r1[r4] = (byte) (((r5 >> '\f') & 15) | 224);
        r1[r4 + 1] = (byte) (((r5 >> 6) & 63) | 128);
        r1[r4 + 2] = (byte) ((r5 & '?') | 128);
        r4 = r4 + 3;
        goto L12
    L13:
        byte[] r10 = new byte[r4];
        java.lang.System.arraycopy(r1, 0, r10, 0, r4);
        return r10;
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
        int r0 = this.DW.length();
        java.lang.StringBuilder r1 = new java.lang.StringBuilder((r0 * 3) / 2);
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L46;
        char r4 = this.DW.charAt(r3);
        if (r4 < ' ') goto L14;
        if (r4 >= 127) goto L14;
        if (r4 != '\'') goto L10;
    L12:
        r1.append('\\');
    L13:
        r1.append(r4);
    L44:
        r3 = r3 + 1;
        goto L3
    L10:
        if (r4 == '\"') goto L12;
        if (r4 != '\\') goto L13;
    L14:
        if (r4 <= 127) goto L16;
        r1.append("\\u");
        r1.append(java.lang.Character.forDigit(r4 >> '\f', 16));
        r1.append(java.lang.Character.forDigit((r4 >> '\b') & 15, 16));
        r1.append(java.lang.Character.forDigit((r4 >> 4) & 15, 16));
        r1.append(java.lang.Character.forDigit(r4 & 15, 16));
        goto L44
    L16:
        if (r4 != '\t') goto L18;
        r1.append("\\t");
        goto L44
    L18:
        if (r4 != '\n') goto L20;
        r1.append("\\n");
        goto L44
    L20:
        if (r4 != '\r') goto L22;
        r1.append("\\r");
        goto L44
    L22:
        if (r3 >= (r0 - 1)) goto L24;
        char r5 = this.DW.charAt(r3 + 1);
    L26:
        if (r5 >= '0') goto L28;
    L30:
        boolean r6 = false;
    L31:
        r1.append('\\');
        int r7 = 6;
    L32:
        if (r7 < 0) goto L38;
        char r9 = (char) (((r4 >> r7) & 7) + 48);
        if (r9 != '0') goto L36;
        if (r6 == true) goto L36;
    L37:
        r7 = r7 - 3;
    L36:
        r1.append(r9);
        r6 = true;
        goto L37
    L38:
        if (r6 == true) goto L44;
        r1.append('0');
        goto L44
    L28:
        if (r5 > '7') goto L30;
        r6 = true;
        goto L31
    L24:
        r5 = 0;
        goto L26
    L46:
        return r1.toString();
    }

    public boolean equals(java.lang.Object r2) {
        if ((r2 instanceof abcd.Js) == true) goto L7;
        return false;
    L7:
        return this.DW.equals(((abcd.Js) r2).DW);
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.aM;
    }

    public int hashCode() {
        return this.DW.hashCode();
    }

    public java.lang.String j6(int r4) {
        java.lang.String r0 = aM();
        if (r0.length() > (r4 - 2)) goto L5;
        java.lang.String r5 = "";
    L7:
        return '\"' + r0 + r5 + '\"';
    L5:
        r0 = r0.substring(0, r4 - 5);
        r5 = "...";
        goto L7
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
