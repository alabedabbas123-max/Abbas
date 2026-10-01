package abcd;

public final class FK {
    public static int DW(byte[] r1, int r2) {
        int r0 = (r1[r2] & 255) << 8;
        return (r1[r2 + 1] & 255) | r0;
    }

    public static void DW(byte[] r2, int r3, int r4) {
        r2[r3 + 3] = (byte) r4;
        int r5 = r4 >>> 8;
        r2[r3 + 2] = (byte) r5;
        int r6 = r5 >>> 8;
        r2[r3 + 1] = (byte) r6;
        r2[r3] = (byte) (r6 >>> 8);
    }

    public static long FH(byte[] r2, int r3) {
        int r0 = ((((r2[r3 + 1] & 255) << 8) | (r2[r3 + 2] & 255)) << 8) | (r2[r3 + 3] & 255);
        return (((long) (r2[r3] & 255)) << 24) | ((long) r0);
    }

    public static long Hw(byte[] r3, int r4) {
        long r0 = FH(r3, r4) << 32;
        return FH(r3, r4 + 4) | r0;
    }

    public static int j6(int r2, int r3) {
        int r0 = (r2 >>> 1) - (r3 >>> 1);
        if (r0 == 0) goto L6;
        return r0;
    L6:
        return (r2 & 1) - (r3 & 1);
    }

    public static int j6(byte[] r2, int r3) {
        int r0 = ((((r2[r3] << 8) | (r2[r3 + 1] & 255)) << 8) | (r2[r3 + 2] & 255)) << 8;
        return (r2[r3 + 3] & 255) | r0;
    }

    public static void j6(byte[] r2, int r3, int r4) {
        r2[r3 + 1] = (byte) r4;
        r2[r3] = (byte) (r4 >>> 8);
    }

    public static void j6(byte[] r3, int r4, long r5) {
        r3[r4 + 7] = (byte) r5;
        long r6 = r5 >>> 8;
        r3[r4 + 6] = (byte) r6;
        long r7 = r6 >>> 8;
        r3[r4 + 5] = (byte) r7;
        long r8 = r7 >>> 8;
        r3[r4 + 4] = (byte) r8;
        long r9 = r8 >>> 8;
        r3[r4 + 3] = (byte) r9;
        long r10 = r9 >>> 8;
        r3[r4 + 2] = (byte) r10;
        long r11 = r10 >>> 8;
        r3[r4 + 1] = (byte) r11;
        r3[r4] = (byte) (r11 >>> 8);
    }
}
