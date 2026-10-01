package abcd;

public final class Br {
    private static final byte[] j6 = null;

    static {
        j6 = new byte[255];
        int r2 = 1;
    L3:
        if (r2 >= 255) goto L23;
        abcd.oq.a r3 = abcd.oq.j6(r2);     // Catch: java.lang.IllegalArgumentException -> L24
        abcd.Enummq r4 = r3.DW();     // Catch: java.lang.IllegalArgumentException -> L24
        abcd.Enumer r5 = r3.j6();     // Catch: java.lang.IllegalArgumentException -> L24
        if (r4 != abcd.Enummq.DW) goto L7;
        j6[r2] = j6(r5);     // Catch: java.lang.IllegalArgumentException -> L24
        goto L22
    L7:
        byte r6 = j6(r5);     // Catch: java.lang.IllegalArgumentException -> L24
        int r7 = abcd.Ar.j6[r4.ordinal()];     // Catch: java.lang.IllegalArgumentException -> L24
        if (r7 != 1) goto L10;
        int r8 = r6 | 16;     // Catch: java.lang.IllegalArgumentException -> L24
    L21:
        j6[r2] = (byte) r8;     // Catch: java.lang.IllegalArgumentException -> L24
        goto L22
    L10:
        if (r7 != 2) goto L12;
        r8 = r6 | 32;     // Catch: java.lang.IllegalArgumentException -> L24
        goto L21
    L12:
        if (r7 != 3) goto L14;
        r8 = r6 | 48;     // Catch: java.lang.IllegalArgumentException -> L24
        goto L21
    L14:
        if (r7 != 4) goto L17;
        r8 = r6 | 64;     // Catch: java.lang.IllegalArgumentException -> L24
        goto L21
    L17:
        throw new java.lang.RuntimeException("Unknown index type: " + r4);     // Catch: java.lang.IllegalArgumentException -> L24
    L22:
        r2 = r2 + 1;
        goto L3
    }

    private static byte j6(abcd.Enumer r2) {
        switch(abcd.Ar.DW[r2.ordinal()]) {
            case 1: goto L25;
            case 2: goto L22;
            case 3: goto L22;
            case 4: goto L22;
            case 5: goto L22;
            case 6: goto L22;
            case 7: goto L20;
            case 8: goto L20;
            case 9: goto L20;
            case 10: goto L20;
            case 11: goto L20;
            case 12: goto L20;
            case 13: goto L20;
            case 14: goto L20;
            case 15: goto L20;
            case 16: goto L20;
            case 17: goto L20;
            case 18: goto L19;
            case 19: goto L19;
            case 20: goto L16;
            case 21: goto L16;
            case 22: goto L16;
            case 23: goto L16;
            case 24: goto L16;
            case 25: goto L16;
            case 26: goto L16;
            case 27: goto L16;
            case 28: goto L16;
            case 29: goto L15;
            case 30: goto L15;
            case 31: goto L15;
            case 32: goto L15;
            case 33: goto L13;
            case 34: goto L11;
            case 35: goto L8;
            case 36: goto L7;
            case 37: goto L7;
            default: goto L5;
        };
    L8:
        return 5;
    L16:
        return 3;
    L20:
        return 2;
    L22:
        return 1;
    L5:
        throw new java.lang.RuntimeException("Unknown opcode format");
    L7:
        throw new java.lang.RuntimeException("Jumbo opcodes not supported");
    L11:
        throw new java.lang.RuntimeException("Jumbo opcodes not supported");
    L13:
        throw new java.lang.RuntimeException("Unexpected format");
    L15:
        throw new java.lang.RuntimeException("Unexpected format");
    L19:
        throw new java.lang.RuntimeException("Unexpected format");
    L25:
        throw new java.lang.RuntimeException("Unexpected format");
    }

    public static void j6(short[] r7, abcd.yr r8) {
        byte[] r0 = j6;
        int r1 = 0;
    L4:
        if (r1 >= r7.length) goto L49;
        int r2 = r7[r1] & 255;
        if (r2 != 0) goto L8;
        int r3 = r7[r1] & 65535;
        if (r3 != 256) goto L40;
        int r4 = (r7[r1 + 1] & 65535) * 2;
    L47:
        int r5 = r4 + 3;
    L30:
        r1 = r1 + r5;
    L48:
        r1 = r1 + 1;
        goto L4
    L40:
        if (r3 != 512) goto L42;
        r5 = ((r7[r1 + 1] & 65535) * 4) + 1;
        goto L30
    L42:
        if (r3 != 768) goto L48;
        r4 = (((r7[r1 + 1] & 65535) * (r7[r1 + 2] & 65535)) + 1) / 2;
        goto L47
    L8:
        if (r2 == 27) goto L36;
        if (r2 == 255) goto L34;
        byte r6 = r0[r2];
        if (r6 == 0) goto L32;
        if (r6 >= 15) goto L15;
        r1 = r1 + (r6 - 1);
        goto L48
    L15:
        int r9 = r6 & 240;
        if (r9 != 16) goto L18;
        int r10 = r1 + 1;
        r7[r10] = (short) r8.tp(65535 & r7[r10]);
    L29:
        r5 = (r6 & 15) - 1;
        goto L30
    L18:
        if (r9 != 32) goto L20;
        int r11 = r1 + 1;
        r7[r11] = (short) r8.u7(65535 & r7[r11]);
        goto L29
    L20:
        if (r9 != 48) goto L22;
        int r12 = r1 + 1;
        r7[r12] = (short) r8.Zo(65535 & r7[r12]);
        goto L29
    L22:
        if (r9 != 64) goto L25;
        int r13 = r1 + 1;
        r7[r13] = (short) r8.VH(65535 & r7[r13]);
        goto L29
    L25:
        throw new java.lang.RuntimeException("Unexpected mask");
    L32:
        throw new java.lang.RuntimeException("Opcode size not found for opcode " + java.lang.Integer.toHexString(r2));
    L34:
        throw new java.lang.RuntimeException("Extended opcodes not supported");
    L36:
        throw new java.lang.RuntimeException("Extended opcodes not supported");
    }
}
