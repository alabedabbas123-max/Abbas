package abcd;

public class Gr {
    private byte[] DW;
    private int FH;
    private java.lang.StringBuffer Hw;
    private abcd.Dr j6;
    private java.lang.StringBuffer v5;

    public Gr() {
        this.j6 = new abcd.Dr();
        this.DW = new byte[8192];
        this.Hw = new java.lang.StringBuffer();
        this.v5 = new java.lang.StringBuffer();
    }

    private int j6(byte[] r6, int r7, int r8, int r9) {
        if (r8 == 0) goto L18;
        byte[] r0 = this.DW;
        this.j6.DW.j6(r9);
    L5:
        if (this.j6.DW.j6() == false) goto L15;
        int r1 = this.j6.DW.Hw();
        if ((r1 + r8) > this.FH) goto L5;
        int r2 = 0;
    L9:
        if (r2 >= r8) goto L14;
        if (r0[r1 + r2] != r6[r7 + r2]) goto L5;
        r2 = r2 + 1;
        goto L9
    L14:
        return r1;
    L15:
        j6(this.FH + r8);
        byte[] r3 = this.DW;
        int r4 = this.FH;
        java.lang.System.arraycopy(r6, r7, r3, r4, r8);
        this.FH += r8;
        this.j6.j6(r9, r4);
        return r4;
    L18:
        throw new java.lang.IllegalArgumentException();
    }

    private void j6(int r4) {
        byte[] r0 = this.DW;
        if (r0.length >= r4) goto L12;
        int r1 = r0.length;
    L5:
        r1 = r1 * 2;
        if (r1 < r4) goto L5;
        byte[] r5 = new byte[r1];
        java.lang.System.arraycopy(this.DW, 0, r5, 0, this.FH);
        this.DW = r5;
        return;
    }

    private void j6(int r6, java.lang.StringBuffer r7) {
        byte[] r0 = this.DW;
    L4:
        if (r6 >= r0.length) goto L23;
        int r1 = r6 + 1;
        int r8 = r0[r6] & 255;
        if (r8 == 0) goto L36;
        switch((r8 >> 4)) {
            case 0: goto L22;
            case 1: goto L22;
            case 2: goto L22;
            case 3: goto L22;
            case 4: goto L22;
            case 5: goto L22;
            case 6: goto L22;
            case 7: goto L22;
            case 8: goto L11;
            case 9: goto L11;
            case 10: goto L11;
            case 11: goto L11;
            case 12: goto L18;
            case 13: goto L18;
            case 14: goto L12;
            default: goto L11;
        };
    L11:
        throw new java.lang.RuntimeException(new java.io.UTFDataFormatException("Malformed input"));
    L18:
        if (r1 >= r0.length) goto L21;
        int r2 = r1 + 1;
        r7.append((char) (((r8 & 31) << 6) | ((r0[r1] & 255) & 63)));
        r6 = r2;
        goto L4
    L21:
        throw new java.lang.RuntimeException(new java.io.UTFDataFormatException("End index not on boundary"));
    L22:
        r7.append((char) r8);
        r6 = r1;
        goto L4
    L12:
        int r3 = r1 + 1;
        if (r3 >= r0.length) goto L16;
        int r4 = r0[r1] & 255;
        int r5 = r3 + 1;
        r7.append((char) ((((r8 & 15) << 12) | ((r4 & 63) << 6)) | (((r0[r3] & 255) & 63) << 0)));
        r6 = r5;
        goto L4
    L16:
        throw new java.lang.RuntimeException(new java.io.UTFDataFormatException("End index not on boundary"));
    L36:
        return;
    }

    public int DW() {
        return this.j6.FH();
    }

    public int FH() {
        return this.FH;
    }

    public int j6(int r13, int r14) {
        byte[] r0 = this.DW;
        int r2 = 0;
        int r3 = 0;
    L3:
        int r4 = r13 + 1;
        int r15 = r0[r13] & 255;
        r2 = r2 | ((r15 & 127) << (r3 * 7));
        boolean r5 = true;
        r3 = r3 + 1;
        int r16 = r15 & 128;
        if (r16 != 128) goto L9;
        if (r3 >= 5) goto L9;
        r13 = r4;
    L9:
        if (r16 == 128) goto L36;
        int r17 = 0;
        int r8 = 0;
    L11:
        int r9 = r14 + 1;
        int r18 = r0[r14] & 255;
        r17 = r17 | ((r18 & 127) << (r8 * 7));
        r8 = r8 + 1;
        int r19 = r18 & 128;
        if (r19 != 128) goto L16;
        if (r8 >= 5) goto L16;
        r14 = r9;
    L16:
        if (r19 == 128) goto L34;
        int r110 = java.lang.Math.min(r2 + 1, r17 + 1);
        int r111 = 0;
    L18:
        if (r111 >= r110) goto L28;
        int r6 = r0[r4 + r111] & 255;
        int r7 = r0[r9 + r111] & 255;
        if ((r6 & 128) != 0) goto L29;
        if ((r7 & 128) != 0) goto L29;
        int r10 = r6 - r7;
        if (r10 != 0) goto L26;
        r111 = r111 + 1;
        goto L18
    L26:
        return r10;
    L29:
        if (r5 == true) goto L31;
        return 0;
    L31:
        this.Hw.setLength(0);
        j6(r4, this.Hw);
        this.v5.setLength(0);
        j6(r9, this.v5);
        return j6(this.Hw.toString(), this.v5.toString());
    L28:
        r5 = false;
        goto L29
    L34:
        throw new abcd.Ut("invalid LEB128 sequence");
    L36:
        throw new abcd.Ut("invalid LEB128 sequence");
    }

    public int j6(java.lang.String r7, java.lang.String r8) {
        int r0 = r7.length();
        int r1 = r8.length();
        int r2 = java.lang.Math.min(r0, r1);
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L10;
        char r4 = r7.charAt(r3);
        char r5 = r8.charAt(r3);
        if (r4 != r5) goto L7;
        r3 = r3 + 1;
        goto L3
    L7:
        return r4 - r5;
    L10:
        return r0 - r1;
    }

    public int j6(byte[] r5, int r6) {
        int r0 = r6;
        int r1 = 0;
    L3:
        int r2 = r0 + 1;
        int r3 = r5[r0] & 255;
        r1 = (r1 * 37) + r3;
        if ((r3 & 128) != 128) goto L5;
        r0 = r2;
    L5:
        int r4 = r2 + 1;
        byte r7 = r5[r2];
        if (r7 == 0) goto L9;
        r1 = (r1 * 37) + r7;
        r2 = r4;
        goto L5
    L9:
        return j6(r5, r6, r4 - r6, r1);
    }

    public byte[] j6() {
        return this.DW;
    }
}
