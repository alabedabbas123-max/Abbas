package abcd;

public final class Ot {
    public static int DW(int[] r0) {
        return r0.length * 32;
    }

    public static int DW(int[] r3, int r4) {
        int r0 = r3.length;
        int r1 = r4 & 31;
        int r5 = r4 >> 5;
    L3:
        if (r5 >= r0) goto L11;
        int r2 = r3[r5];
        if (r2 == 0) goto L10;
        int r6 = j6(r2, r1);
        if (r6 < 0) goto L10;
        return (r5 << 5) + r6;
    L10:
        r1 = 0;
        r5 = r5 + 1;
        goto L3
    L11:
        return -1;
    }

    public static boolean FH(int[] r4) {
        int r0 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        if (r4[r2] != 0) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return false;
    L8:
        return true;
    }

    public static boolean FH(int[] r2, int r3) {
        int r0 = r3 >> 5;
        int r4 = r2[r0];
        if ((r4 & (1 << (r3 & 31))) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    public static void Hw(int[] r2, int r3) {
        int r0 = r3 >> 5;
        r2[r0] = (1 << (r3 & 31)) | r2[r0];
    }

    public static int j6(int r1, int r2) {
        int r3 = java.lang.Integer.numberOfTrailingZeros(r1 & (((1 << r2) - 1) ^ (-1)));
        if (r3 != 32) goto L6;
        return -1;
    L6:
        return r3;
    }

    public static int j6(int[] r4) {
        int r0 = r4.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r2 = r2 + java.lang.Integer.bitCount(r4[r1]);
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    public static void j6(int[] r2, int r3) {
        int r0 = r3 >> 5;
        int r4 = (1 << (r3 & 31)) ^ (-1);
        r2[r0] = r4 & r2[r0];
    }

    public static void j6(int[] r2, int r3, boolean r4) {
        int r0 = r3 >> 5;
        int r5 = 1 << (r3 & 31);
        if (r4 == false) goto L5;
        r2[r0] = r5 | r2[r0];
        return;
    L5:
        int r6 = r5 ^ (-1);
        r2[r0] = r6 & r2[r0];
    }

    public static void j6(int[] r3, int[] r4) {
        int r0 = 0;
    L4:
        if (r0 >= r4.length) goto L6;
        r3[r0] = r3[r0] | r4[r0];
        r0 = r0 + 1;
        goto L4
    }

    public static boolean j6(int[] r0, int r1, int r2) {
        int r3 = DW(r0, r1);
        if (r3 < 0) goto L6;
        if (r3 >= r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static int[] j6(int r0) {
        return new int[(r0 + 31) >> 5];
    }
}
