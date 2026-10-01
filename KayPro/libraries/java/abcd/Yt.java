package abcd;

public final class Yt {
    public static java.lang.String DW(int r6) {
        char[] r0 = new char[5];
        int r1 = 0;
        if (r6 >= 0) goto L5;
        r0[0] = '-';
        r6 = -r6;
    L7:
        if (r1 >= 4) goto L10;
        r0[4 - r1] = java.lang.Character.forDigit(r6 & 15, 16);
        r6 = r6 >> 4;
        r1 = r1 + 1;
        goto L7
    L10:
        return new java.lang.String(r0);
    L5:
        r0[0] = '+';
        goto L7
    }

    public static java.lang.String DW(long r5) {
        char[] r1 = new char[16];
        int r2 = 0;
    L3:
        if (r2 >= 16) goto L6;
        r1[15 - r2] = java.lang.Character.forDigit(((int) r5) & 15, 16);
        r5 = r5 >> 4;
        r2 = r2 + 1;
        goto L3
    L6:
        return new java.lang.String(r1);
    }

    public static java.lang.String FH(int r5) {
        char[] r0 = new char[9];
        int r1 = 0;
        if (r5 >= 0) goto L5;
        r0[0] = '-';
        r5 = -r5;
    L7:
        if (r1 >= 8) goto L10;
        r0[8 - r1] = java.lang.Character.forDigit(r5 & 15, 16);
        r5 = r5 >> 4;
        r1 = r1 + 1;
        goto L7
    L10:
        return new java.lang.String(r0);
    L5:
        r0[0] = '+';
        goto L7
    }

    public static java.lang.String Hw(int r6) {
        char[] r1 = new char[2];
        int r2 = 0;
    L3:
        if (r2 >= 2) goto L6;
        r1[1 - r2] = java.lang.Character.forDigit(r6 & 15, 16);
        r6 = r6 >> 4;
        r2 = r2 + 1;
        goto L3
    L6:
        return new java.lang.String(r1);
    }

    public static java.lang.String VH(int r6) {
        char[] r1 = new char[6];
        int r2 = 0;
    L3:
        if (r2 >= 6) goto L6;
        r1[5 - r2] = java.lang.Character.forDigit(r6 & 15, 16);
        r6 = r6 >> 4;
        r2 = r2 + 1;
        goto L3
    L6:
        return new java.lang.String(r1);
    }

    public static java.lang.String Zo(int r1) {
        if (r1 != ((char) r1)) goto L7;
        return v5(r1);
    L7:
        return gn(r1);
    }

    public static java.lang.String gn(int r6) {
        char[] r1 = new char[8];
        int r2 = 0;
    L3:
        if (r2 >= 8) goto L6;
        r1[7 - r2] = java.lang.Character.forDigit(r6 & 15, 16);
        r6 = r6 >> 4;
        r2 = r2 + 1;
        goto L3
    L6:
        return new java.lang.String(r1);
    }

    public static java.lang.String j6(int r5) {
        char[] r0 = new char[3];
        int r1 = 0;
        if (r5 >= 0) goto L5;
        r0[0] = '-';
        r5 = -r5;
    L7:
        if (r1 >= 2) goto L10;
        r0[2 - r1] = java.lang.Character.forDigit(r5 & 15, 16);
        r5 = r5 >> 4;
        r1 = r1 + 1;
        goto L7
    L10:
        return new java.lang.String(r0);
    L5:
        r0[0] = '+';
        goto L7
    }

    public static java.lang.String j6(long r5) {
        char[] r0 = new char[17];
        int r1 = 0;
        if (r5 >= 0) goto L5;
        r0[0] = '-';
        r5 = -r5;
    L7:
        if (r1 >= 16) goto L10;
        r0[16 - r1] = java.lang.Character.forDigit(((int) r5) & 15, 16);
        r5 = r5 >> 4;
        r1 = r1 + 1;
        goto L7
    L10:
        return new java.lang.String(r0);
    L5:
        r0[0] = '+';
        goto L7
    }

    public static java.lang.String j6(byte[] r6, int r7, int r8, int r9, int r10, int r11) {
        int r0 = r7 + r8;
        if (((r7 | r8) | r0) < 0) goto L38;
        if (r0 > r6.length) goto L38;
        if (r9 < 0) goto L36;
        if (r8 != 0) goto L10;
        return "";
    L10:
        java.lang.StringBuffer r1 = new java.lang.StringBuffer((r8 * 4) + 6);
        int r3 = r7;
        int r12 = 0;
    L12:
        if (r8 <= 0) goto L31;
        if (r12 != 0) goto L25;
        if (r11 != 2) goto L17;
        java.lang.String r5 = Hw(r9);
    L23:
        r1.append(r5);
        r1.append(": ");
    L27:
        r1.append(Hw(r6[r3]));
        r9 = r9 + 1;
        r3 = r3 + 1;
        r12 = r12 + 1;
        if (r12 != r10) goto L30;
        r1.append('\n');
        r12 = 0;
    L30:
        r8 = r8 - 1;
        goto L12
    L17:
        if (r11 == 4) goto L21;
        if (r11 == 6) goto L20;
        r5 = gn(r9);
        goto L23
    L20:
        r5 = VH(r9);
        goto L23
    L21:
        r5 = v5(r9);
        goto L23
    L25:
        if ((r12 & 1) != 0) goto L27;
        r1.append(' ');
        goto L27
    L31:
        if (r12 == 0) goto L34;
        r1.append('\n');
    L34:
        return r1.toString();
    L36:
        throw new java.lang.IllegalArgumentException("outOffset < 0");
    L38:
        throw new java.lang.IndexOutOfBoundsException("arr.length " + r6.length + "; " + r7 + "..!" + r0);
    }

    public static java.lang.String u7(int r2) {
        return new java.lang.String(new char[]{java.lang.Character.forDigit(r2 & 15, 16)});
    }

    public static java.lang.String v5(int r6) {
        char[] r1 = new char[4];
        int r2 = 0;
    L3:
        if (r2 >= 4) goto L6;
        r1[3 - r2] = java.lang.Character.forDigit(r6 & 15, 16);
        r6 = r6 >> 4;
        r2 = r2 + 1;
        goto L3
    L6:
        return new java.lang.String(r1);
    }
}
