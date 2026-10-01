package abcd;

public final class pq {
    public static boolean DW(int r4) {
        if (r4 >= (-1)) goto L6;
        return false;
    L6:
        if (r4 != (-1)) goto L8;
        return true;
    L8:
        int r1 = r4 & 255;
        if (r1 != 0) goto L11;
    L17:
        return true;
    L11:
        if (r1 == 255) goto L17;
        if ((r4 & 65280) != 0) goto L18;
        return true;
    L18:
        return false;
    }

    public static boolean j6(int r1) {
        if (r1 < 255) goto L5;
        return true;
    L5:
        return false;
    }
}
