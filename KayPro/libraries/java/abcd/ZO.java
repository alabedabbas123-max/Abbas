package abcd;

public abstract class ZO {
    public static long DW(byte[] r4, int r5) {
        int r0 = j6(r4, r5);
        long r6 = ((long) j6(r4, r5 + 4)) & 4294967295L;
        return r6 | ((((long) r0) & 4294967295L) << 32);
    }

    public static void DW(int r1, byte[] r2, int r3) {
        r2[r3] = (byte) r1;
        int r4 = r3 + 1;
        r2[r4] = (byte) (r1 >>> 8);
        int r5 = r4 + 1;
        r2[r5] = (byte) (r1 >>> 16);
        r2[r5 + 1] = (byte) (r1 >>> 24);
    }

    public static void DW(long r2, byte[] r4, int r5) {
        DW((int) (4294967295L & r2), r4, r5);
        DW((int) (r2 >>> 32), r4, r5 + 4);
    }

    public static int j6(byte[] r2, int r3) {
        int r0 = r2[r3] << 24;
        int r4 = r3 + 1;
        int r1 = r0 | ((r2[r4] & 255) << 16);
        int r5 = r4 + 1;
        int r6 = r1 | ((r2[r5] & 255) << 8);
        return (r2[r5 + 1] & 255) | r6;
    }

    public static void j6(int r1, byte[] r2, int r3) {
        r2[r3] = (byte) (r1 >>> 24);
        int r4 = r3 + 1;
        r2[r4] = (byte) (r1 >>> 16);
        int r5 = r4 + 1;
        r2[r5] = (byte) (r1 >>> 8);
        r2[r5 + 1] = (byte) r1;
    }

    public static void j6(long r2, byte[] r4, int r5) {
        j6((int) (r2 >>> 32), r4, r5);
        j6((int) (r2 & 4294967295L), r4, r5 + 4);
    }
}
