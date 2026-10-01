package abcd;

final class Ly {
    private static byte[] j6;
    int DW;
    private int EQ;
    int FH;
    long Hw;
    private byte[] J0;
    abcd.Hy J8;
    int VH;
    private java.io.ByteArrayOutputStream Ws;
    int Zo;
    int gn;
    private final abcd.Oy tp;
    abcd.Iy u7;
    long v5;
    private int we;

    class a extends java.lang.Exception {
        final abcd.Ly DW;
        int j6;

        a(abcd.Ly r1, int r2) {
            this.DW = r1;
            this.j6 = r2;
        }
    }

    static {
        j6 = new byte[]{0, 0, -1, -1};
    }

    Ly(abcd.Oy r3) {
        this.Hw = -1;
        this.we = -1;
        this.J0 = new byte[4];
        this.J8 = null;
        this.Ws = null;
        this.tp = r3;
    }

    private int DW(int r6, int r7) {
        if (this.Ws != null) goto L5;
        this.Ws = new java.io.ByteArrayOutputStream();
    L5:
        abcd.Oy r0 = this.tp;
        int r1 = r0.FH;
        if (r1 == 0) goto L15;
        r0.FH = r1 - 1;
        r0.Hw++;
        byte[] r8 = r0.j6;
        int r2 = r0.DW;
        byte r3 = r8[r2];
        if (r3 == 0) goto L10;
        this.Ws.write(r8, r2, 1);
    L10:
        abcd.Oy r9 = this.tp;
        r9.J0.update(r9.j6, r9.DW, 1);
        this.tp.DW++;
        if (r3 == 0) goto L12;
        r6 = r7;
        goto L5
    L12:
        return r7;
    L15:
        throw new abcd.Ly.a(this, r6);
    }

    private int j6(int r6, int r7) {
        if (this.Ws != null) goto L6;
        this.Ws = new java.io.ByteArrayOutputStream();
    L6:
        if (this.v5 <= 0) goto L7;
        abcd.Oy r0 = this.tp;
        int r1 = r0.FH;
        if (r1 == 0) goto L12;
        r0.FH = r1 - 1;
        r0.Hw++;
        byte[] r8 = r0.j6;
        int r2 = r0.DW;
        byte r3 = r8[r2];
        this.Ws.write(r8, r2, 1);
        abcd.Oy r9 = this.tp;
        r9.J0.update(r9.j6, r9.DW, 1);
        this.tp.DW++;
        this.v5--;
        r6 = r7;
        goto L6
    L12:
        throw new abcd.Ly.a(this, r6);
    L7:
        return r6;
    }

    private int j6(int r8, int r9, int r10) {
        if (this.we != (-1)) goto L5;
        this.we = r8;
        this.v5 = 0;
    L5:
        int r0 = this.we;
        if (r0 <= 0) goto L8;
        abcd.Oy r2 = this.tp;
        int r3 = r2.FH;
        if (r3 == 0) goto L19;
        r2.FH = r3 - 1;
        r2.Hw++;
        long r4 = this.v5;
        byte[] r11 = r2.j6;
        int r5 = r2.DW;
        r2.DW = r5 + 1;
        this.v5 = r4 | ((long) ((r11[r5] & 255) << ((r8 - r0) * 8)));
        this.we = r0 - 1;
        r9 = r10;
        goto L5
    L19:
        throw new abcd.Ly.a(this, r9);
    L8:
        if (r8 != 2) goto L11;
        this.v5 &= 65535;
    L13:
        this.we = -1;
        return r9;
    L11:
        if (r8 != 4) goto L13;
        this.v5 &= 4294967295L;
        goto L13
    }

    private void j6(int r6, long r7) {
        long r1 = r7;
        int r8 = 0;
    L3:
        if (r8 >= r6) goto L4;
        this.J0[r8] = (byte) (255 & r1);
        r1 = r1 >> 8;
        r8 = r8 + 1;
        goto L3
    L4:
        this.tp.J0.update(this.J0, 0, r6);
    }

    int DW() {
        abcd.Oy r0 = this.tp;
        if (r0 != null) goto L6;
        return -2;
    L6:
        r0.gn = 0;
        r0.Hw = 0;
        r0.u7 = null;
        this.DW = 14;
        this.we = -1;
        this.u7.DW();
        return 0;
    }

    int DW(int r7) {
        this.tp.u7 = null;
        this.u7 = null;
        this.VH = 0;
        if (r7 >= 0) goto L6;
        r7 = -r7;
    L18:
        if (r7 >= 8) goto L20;
    L29:
        j6();
        return -2;
    L20:
        if (r7 > 15) goto L29;
        abcd.Iy r3 = this.u7;
        if (r3 != null) goto L25;
    L27:
        this.gn = r7;
        this.u7 = new abcd.Iy(this.tp, 1 << r7);
        DW();
        return 0;
    L25:
        if (this.gn == r7) goto L27;
        r3.j6();
        this.u7 = null;
        goto L27
    L6:
        if ((1073741824 & r7) == 0) goto L11;
        this.VH = 4;
        r7 = r7 & (-1073741825);
        if (r7 >= 48) goto L18;
    L13:
        r7 = r7 & 15;
        goto L18
    L11:
        if ((r7 & (-32)) == 0) goto L14;
        this.VH = 4;
        goto L13
    L14:
        this.VH = (r7 >> 4) + 1;
        if (r7 >= 48) goto L18;
        goto L13
    }

    int j6() {
        abcd.Iy r0 = this.u7;
        if (r0 == null) goto L7;
        r0.j6();
        return 0;
    L7:
        return 0;
    }

    int j6(int r22) {
        abcd.Oy r2 = this.tp;
        if (r2 == null) goto L255;
        if (r2.j6 == null) goto L255;
        if (r22 != 4) goto L9;
        int r0 = -5;
    L10:
        int r3 = -5;
    L12:
        switch(this.DW) {
            case 2: goto L237;
            case 3: goto L241;
            case 4: goto L245;
            case 5: goto L236;
            case 6: goto L234;
            case 7: goto L172;
            case 8: goto L183;
            case 9: goto L187;
            case 10: goto L191;
            case 11: goto L195;
            case 12: goto L233;
            case 13: goto L170;
            case 14: goto L125;
            case 15: goto L211;
            case 16: goto L260;
            case 17: goto L264;
            case 18: goto L46;
            case 19: goto L62;
            case 20: goto L78;
            case 21: goto L92;
            case 22: goto L106;
            case 23: goto L266;
            default: goto L13;
        };
    L260:
        r3 = j6(4, r3, r0);     // Catch: abcd.Ly.a -> L121
        abcd.Hy r6 = this.J8;
        if (r6 == null) goto L34;
        r6.FH = this.v5;
    L34:
        if ((this.EQ & 512) == 0) goto L36;
        j6(4, this.v5);
    L36:
        this.DW = 17;
    L121:
        e = move-exception;
        return e.j6;
    L264:
        r3 = j6(2, r3, r0);     // Catch: abcd.Ly.a -> L118
        abcd.Hy r7 = this.J8;
        if (r7 == null) goto L42;
        long r12 = this.v5;
        r7.Hw = ((int) r12) & 255;
        r7.v5 = (((int) r12) >> 8) & 255;
    L42:
        if ((this.EQ & 512) == 0) goto L44;
        j6(2, this.v5);
    L44:
        this.DW = 18;
    L118:
        e = move-exception;
        return e.j6;
    L266:
        r3 = j6(2, r3, r0);     // Catch: abcd.Ly.a -> L26
        long r13 = this.v5;
        this.EQ = ((int) r13) & 65535;
        int r8 = this.EQ;
        if ((r8 & 255) == 8) goto L20;
        this.tp.u7 = "unknown compression method";
        this.DW = 13;
        goto L12
    L20:
        if ((57344 & r8) == 0) goto L23;
        this.tp.u7 = "unknown header flags set";
        this.DW = 13;
        goto L12
    L23:
        if ((r8 & 512) == 0) goto L25;
        j6(2, r13);
    L25:
        this.DW = 16;
    L26:
        e = move-exception;
        return e.j6;
    L13:
        return -2;
    L78:
        if ((this.EQ & 2048) != 0) goto L262;
        abcd.Hy r9 = this.J8;
        if (r9 == null) goto L90;
        r9.VH = null;
    L90:
        this.DW = 21;
        goto L92
    L262:
        DW(r3, r0);     // Catch: abcd.Ly.a -> L84
        if (this.J8 == null) goto L82;
        this.J8.VH = this.Ws.toByteArray();     // Catch: abcd.Ly.a -> L84
    L82:
        this.Ws = null;     // Catch: abcd.Ly.a -> L84
        r3 = r0;
    L84:
        e = move-exception;
        return e.j6;
    L92:
        if ((this.EQ & 4096) != 0) goto L272;
        abcd.Hy r10 = this.J8;
        if (r10 == null) goto L104;
        r10.gn = null;
    L104:
        this.DW = 22;
        goto L106
    L272:
        DW(r3, r0);     // Catch: abcd.Ly.a -> L98
        if (this.J8 == null) goto L96;
        this.J8.gn = this.Ws.toByteArray();     // Catch: abcd.Ly.a -> L98
    L96:
        this.Ws = null;     // Catch: abcd.Ly.a -> L98
        r3 = r0;
    L98:
        e = move-exception;
        return e.j6;
    L106:
        if ((this.EQ & 512) == 0) goto L117;
        r3 = j6(2, r3, r0);     // Catch: abcd.Ly.a -> L114
        abcd.Hy r4 = this.J8;
        if (r4 == null) goto L112;
        r4.u7 = (int) (this.v5 & 65535);
    L112:
        if (this.v5 == (this.tp.J0.getValue() & 65535)) goto L117;
        this.DW = 13;
        this.tp.u7 = "header crc mismatch";
        this.Zo = 5;
    L114:
        e = move-exception;
        return e.j6;
    L117:
        this.tp.J0 = new abcd.Ey();
        this.DW = 7;
        goto L12
    L125:
        if (this.VH == 0) goto L126;
        r3 = j6(2, r3, r0);     // Catch: abcd.Ly.a -> L167
        int r11 = this.VH;
        if (r11 == 4) goto L133;
        if ((r11 & 2) != 0) goto L133;
    L141:
        int r14 = this.VH;
        if ((r14 & 2) != 0) goto L143;
        this.EQ = 0;
        long r15 = this.v5;
        this.FH = ((int) r15) & 255;
        int r16 = ((int) (r15 >> 8)) & 255;
        if ((r14 & 1) == 0) goto L149;
        if ((((this.FH << 8) + r16) % 31) != 0) goto L149;
    L155:
        if ((this.FH & 15) != 8) goto L156;
        if (this.VH != 4) goto L161;
        this.VH = 1;
    L161:
        if (((this.FH >> 4) + 8) > this.gn) goto L162;
        this.tp.J0 = new abcd.Dy();
        if ((r16 & 32) != 0) goto L166;
        this.DW = 7;
        goto L12
    L166:
        this.DW = 2;
        goto L237
    L162:
        this.DW = 13;
        this.tp.u7 = "invalid window size";
        goto L12
    L156:
        this.DW = 13;
        this.tp.u7 = "unknown compression method";
    L149:
        if ((this.FH & 15) == 8) goto L155;
        if (this.VH == 4) goto L152;
        this.DW = 13;
        this.tp.u7 = "incorrect header check";
        goto L12
    L152:
        abcd.Oy r17 = this.tp;
        r17.DW -= 2;
        r17.FH += 2;
        r17.Hw -= 2;
        this.VH = 0;
        this.DW = 7;
        goto L12
    L143:
        this.DW = 13;
        this.tp.u7 = "incorrect header check";
    L133:
        if (this.v5 != 35615) goto L141;
        if (this.VH != 4) goto L137;
        this.VH = 2;
    L137:
        this.tp.J0 = new abcd.Ey();
        j6(2, this.v5);
        if (this.J8 != null) goto L140;
        this.J8 = new abcd.Hy();
    L140:
        this.DW = 23;
    L167:
        e = move-exception;
        return e.j6;
    L126:
        this.DW = 7;
        goto L12
    L170:
        return -3;
    L172:
        r3 = this.u7.DW(r3);
        if (r3 == (-3)) goto L174;
        if (r3 != 0) goto L177;
        r3 = r0;
    L177:
        if (r3 != 1) goto L178;
        this.Hw = this.tp.J0.getValue();
        this.u7.DW();
        if (this.VH == 0) goto L181;
        this.DW = 8;
        r3 = r0;
        goto L183
    L181:
        this.DW = 12;
        r3 = r0;
        goto L12
    L178:
        return r3;
    L174:
        this.DW = 13;
        this.Zo = 0;
    L183:
        abcd.Oy r5 = this.tp;
        int r18 = r5.FH;
        if (r18 == 0) goto L185;
        r5.FH = r18 - 1;
        r5.Hw++;
        byte[] r19 = r5.j6;
        int r20 = r5.DW;
        r5.DW = r20 + 1;
        this.v5 = ((long) ((r19[r20] & 255) << 24)) & 4278190080L;
        this.DW = 9;
        r3 = r0;
        goto L187
    L185:
        return r3;
    L187:
        abcd.Oy r21 = this.tp;
        int r23 = r21.FH;
        if (r23 == 0) goto L189;
        r21.FH = r23 - 1;
        r21.Hw++;
        long r110 = this.v5;
        byte[] r24 = r21.j6;
        int r25 = r21.DW;
        r21.DW = r25 + 1;
        this.v5 = r110 + (((long) ((r24[r25] & 255) << 16)) & 16711680);
        this.DW = 10;
        r3 = r0;
        goto L191
    L189:
        return r3;
    L191:
        abcd.Oy r26 = this.tp;
        int r27 = r26.FH;
        if (r27 == 0) goto L193;
        r26.FH = r27 - 1;
        r26.Hw++;
        long r28 = this.v5;
        byte[] r29 = r26.j6;
        int r30 = r26.DW;
        r26.DW = r30 + 1;
        this.v5 = r28 + (((long) ((r29[r30] & 255) << 8)) & 65280);
        this.DW = 11;
        r3 = r0;
        goto L195
    L193:
        return r3;
    L195:
        abcd.Oy r31 = this.tp;
        int r32 = r31.FH;
        if (r32 == 0) goto L197;
        r31.FH = r32 - 1;
        r31.Hw++;
        long r33 = this.v5;
        byte[] r34 = r31.j6;
        int r35 = r31.DW;
        r31.DW = r35 + 1;
        this.v5 = r33 + (((long) r34[r35]) & 255);
        if (this.EQ == 0) goto L201;
        long r36 = this.v5;
        this.v5 = (((r36 & 65535) << 24) | (((((-16777216) & r36) >> 24) | ((16711680 & r36) >> 8)) | ((65280 & r36) << 8))) & 4294967295L;
    L201:
        int r37 = (int) this.Hw;
        long r38 = this.v5;
        if (r37 == ((int) r38)) goto L205;
        this.tp.u7 = "incorrect data check";
    L209:
        this.DW = 15;
        r3 = r0;
        goto L211
    L205:
        if (this.EQ == 0) goto L209;
        abcd.Hy r39 = this.J8;
        if (r39 == null) goto L209;
        r39.tp = r38;
        goto L209
    L197:
        return r3;
    L211:
        if (this.VH == 0) goto L227;
        if (this.EQ == 0) goto L227;
        r3 = j6(4, r3, r0);     // Catch: abcd.Ly.a -> L224
        java.lang.String r40 = this.tp.u7;
        if (r40 == null) goto L220;
        if (r40.equals("incorrect data check") == false) goto L220;
        this.DW = 13;
        this.Zo = 5;
    L220:
        long r41 = this.v5;
        abcd.Oy r42 = this.tp;
        if (r41 == (r42.gn & 4294967295L)) goto L223;
        r42.u7 = "incorrect length check";
        this.DW = 13;
        goto L12
    L223:
        r42.u7 = null;
    L232:
        this.DW = 12;
    L224:
        e = move-exception;
        return e.j6;
    L227:
        java.lang.String r43 = this.tp.u7;
        if (r43 == null) goto L232;
        if (r43.equals("incorrect data check") == false) goto L232;
        this.DW = 13;
        this.Zo = 5;
    L233:
        return 1;
    L234:
        this.DW = 13;
        this.tp.u7 = "need dictionary";
        this.Zo = 0;
        return -2;
    L236:
        r0 = r3;
    L249:
        abcd.Oy r44 = this.tp;
        int r45 = r44.FH;
        if (r45 != 0) goto L252;
        return r0;
    L252:
        r44.FH = r45 - 1;
        r44.Hw++;
        long r46 = this.v5;
        byte[] r1 = r44.j6;
        int r47 = r44.DW;
        r44.DW = r47 + 1;
        this.v5 = r46 + (((long) r1[r47]) & 255);
        r44.J0.j6(this.v5);
        this.DW = 6;
        return 2;
    L237:
        abcd.Oy r48 = this.tp;
        int r49 = r48.FH;
        if (r49 != 0) goto L240;
        return r3;
    L240:
        r48.FH = r49 - 1;
        r48.Hw++;
        byte[] r50 = r48.j6;
        int r51 = r48.DW;
        r48.DW = r51 + 1;
        this.v5 = ((long) ((r50[r51] & 255) << 24)) & 4278190080L;
        this.DW = 3;
        r3 = r0;
    L241:
        abcd.Oy r52 = this.tp;
        int r53 = r52.FH;
        if (r53 != 0) goto L244;
        return r3;
    L244:
        r52.FH = r53 - 1;
        r52.Hw++;
        long r111 = this.v5;
        byte[] r54 = r52.j6;
        int r55 = r52.DW;
        r52.DW = r55 + 1;
        this.v5 = r111 + (((long) ((r54[r55] & 255) << 16)) & 16711680);
        this.DW = 4;
        r3 = r0;
    L245:
        abcd.Oy r56 = this.tp;
        int r57 = r56.FH;
        if (r57 != 0) goto L248;
        return r3;
    L248:
        r56.FH = r57 - 1;
        r56.Hw++;
        long r58 = this.v5;
        byte[] r59 = r56.j6;
        int r60 = r56.DW;
        r56.DW = r60 + 1;
        this.v5 = r58 + (((long) ((r59[r60] & 255) << 8)) & 65280);
        this.DW = 5;
    L46:
        if ((this.EQ & 1024) != 0) goto L278;
        abcd.Hy r61 = this.J8;
        if (r61 == null) goto L60;
        r61.Zo = null;
    L60:
        this.DW = 19;
        goto L62
    L278:
        r3 = j6(2, r3, r0);     // Catch: abcd.Ly.a -> L54
        abcd.Hy r62 = this.J8;
        if (r62 == null) goto L52;
        r62.Zo = new byte[((int) this.v5) & 65535];
    L52:
        if ((this.EQ & 512) == 0) goto L60;
        j6(2, this.v5);
    L54:
        e = move-exception;
        return e.j6;
    L62:
        if ((this.EQ & 1024) == 0) goto L73;
        r3 = j6(r3, r0);     // Catch: abcd.Ly.a -> L70
        if (this.J8 == null) goto L76;
        byte[] r63 = this.Ws.toByteArray();     // Catch: abcd.Ly.a -> L70
        this.Ws = null;     // Catch: abcd.Ly.a -> L70
        if (r63.length != this.J8.Zo.length) goto L68;
        java.lang.System.arraycopy(r63, 0, this.J8.Zo, 0, r63.length);     // Catch: abcd.Ly.a -> L70
        goto L76
    L68:
        this.tp.u7 = "bad extra field length";     // Catch: abcd.Ly.a -> L70
        this.DW = 13;     // Catch: abcd.Ly.a -> L70
    L76:
        this.DW = 20;
    L70:
        e = move-exception;
        return e.j6;
    L73:
        abcd.Hy r64 = this.J8;
        if (r64 == null) goto L76;
        r64.Zo = null;
        goto L76
    L9:
        r0 = 0;
    L255:
        if (r22 == 4) goto L257;
    L259:
        return -2;
    L257:
        if (this.DW != 14) goto L259;
        return 0;
    }
}
