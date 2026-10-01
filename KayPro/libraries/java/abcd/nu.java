package abcd;

public final class nu {
    public static int j6(int r4, int r5) {
        if (r4 != r5) goto L6;
        return 0;
    L6:
        if ((((long) r4) & 4294967295L) >= (((long) r5) & 4294967295L)) goto L8;
        return -1;
    L8:
        return 1;
    }

    public static int j6(short r1, short r2) {
        if (r1 != r2) goto L6;
        return 0;
    L6:
        if ((r1 & 65535) >= (r2 & 65535)) goto L8;
        return -1;
    L8:
        return 1;
    }
}
