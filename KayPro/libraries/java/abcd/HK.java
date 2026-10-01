package abcd;

public class HK {
    private static final boolean[] j6 = null;

    static {
        j6 = new boolean[256];
        boolean[] r0 = j6;
        r0[13] = true;
        r0[10] = true;
        r0[9] = true;
        r0[32] = true;
    }

    public static int DW(byte[] r1, int r2, int r3) {
        int r4 = r3 - 1;
    L3:
        if (r2 > r4) goto L9;
        if (j6(r1[r4]) == false) goto L9;
        r4 = r4 - 1;
    L9:
        return r4 + 1;
    }

    public static int j6(byte[] r1, int r2, int r3) {
    L2:
        if (r2 >= r3) goto L7;
        if (j6(r1[r2]) == false) goto L7;
        r2 = r2 + 1;
    L7:
        return r2;
    }

    public static boolean j6(byte r1) {
        return j6[r1 & 255];
    }
}
