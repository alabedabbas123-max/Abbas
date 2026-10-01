package abcd;

public class AH {
    public static long j6(byte[] r7) {
        int r0 = 0;
        int r1 = 0;
    L3:
        int r2 = r1 + 1;
        if (((r7[r1] & 255) & 128) == 0) goto L5;
        r1 = r2;
        goto L3
    L5:
        long r3 = 0;
    L6:
        int r4 = r2 + 1;
        int r5 = r7[r2] & 255;
        r3 = r3 | ((long) ((r5 & 127) << r0));
        r0 = r0 + 7;
        if ((r5 & 128) == 0) goto L8;
        r2 = r4;
        goto L6
    L8:
        return r3;
    }

    public static final byte[] j6(byte[] r1, byte[] r2) {
        return j6(r1, r2, null);
    }

    public static final byte[] j6(byte[] r7, byte[] r8, byte[] r9) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L3:
        int r4 = r1 + 1;
        int r5 = r8[r1] & 255;
        r2 = r2 | ((r5 & 127) << r3);
        r3 = r3 + 7;
        if ((r5 & 128) == 0) goto L6;
        r1 = r4;
        goto L3
    L6:
        if (r7.length != r2) goto L55;
        int r6 = 0;
        int r10 = 0;
    L8:
        int r11 = r4 + 1;
        int r12 = r8[r4] & 255;
        r6 = r6 | ((r12 & 127) << r10);
        r10 = r10 + 7;
        if ((r12 & 128) == 0) goto L10;
        r4 = r11;
        goto L8
    L10:
        if (r9 != null) goto L13;
        r9 = new byte[r6];
    L14:
        int r13 = 0;
    L16:
        if (r11 >= r8.length) goto L17;
        int r14 = r11 + 1;
        int r15 = r8[r11] & 255;
        if ((r15 & 128) != 0) goto L21;
        if (r15 == 0) goto L50;
        java.lang.System.arraycopy(r8, r14, r9, r13, r15);
        r13 = r13 + r15;
        r11 = r14 + r15;
        goto L16
    L50:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().unsupportedCommand0);
    L21:
        if ((r15 & 1) == 0) goto L23;
        int r16 = r14 + 1;
        int r17 = r8[r14] & 255;
    L25:
        if ((r15 & 2) == 0) goto L28;
        int r18 = r16 + 1;
        r17 = r17 | ((r8[r16] & 255) << 8);
        r16 = r18;
    L28:
        if ((r15 & 4) == 0) goto L31;
        int r19 = r16 + 1;
        r17 = r17 | ((r8[r16] & 255) << 16);
        r16 = r19;
    L31:
        if ((r15 & 8) == 0) goto L34;
        int r20 = r16 + 1;
        r17 = r17 | ((r8[r16] & 255) << 24);
        r16 = r20;
    L34:
        if ((r15 & 16) == 0) goto L36;
        int r21 = r16 + 1;
        int r22 = r8[r16] & 255;
    L38:
        if ((r15 & 32) == 0) goto L41;
        int r23 = r21 + 1;
        r22 = r22 | ((r8[r21] & 255) << 8);
        r21 = r23;
    L41:
        if ((r15 & 64) == 0) goto L43;
        r11 = r21 + 1;
        r22 = r22 | ((r8[r21] & 255) << 16);
    L44:
        if (r22 != 0) goto L46;
        r22 = 65536;
    L46:
        java.lang.System.arraycopy(r7, r17, r9, r13, r22);
        r13 = r13 + r22;
        goto L16
    L43:
        r11 = r21;
        goto L44
    L36:
        r21 = r16;
        r22 = 0;
        goto L38
    L23:
        r16 = r14;
        r17 = 0;
        goto L25
    L17:
        return r9;
    L13:
        if (r9.length == r6) goto L14;
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().resultLengthIncorrect);
    L55:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().baseLengthIncorrect);
    }
}
