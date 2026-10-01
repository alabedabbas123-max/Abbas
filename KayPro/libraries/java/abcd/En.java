package abcd;

public final class En {
    public static int j6(byte[] r3) {
        if (r3.length == 8) goto L6;
        return -1;
    L6:
        if (r3[0] == 100) goto L8;
    L24:
        return -1;
    L8:
        if (r3[1] != 101) goto L24;
        if (r3[2] != 120) goto L24;
        if (r3[3] != 10) goto L24;
        if (r3[7] != 0) goto L24;
        java.lang.String r4 = "" + ((char) r3[4]) + ((char) r3[5]) + ((char) r3[6]);
        if (r4.equals("036") == false) goto L21;
        return 14;
    L21:
        if (r4.equals("035") == false) goto L24;
        return 13;
    }

    public static java.lang.String j6(int r2) {
        if (r2 < 14) goto L5;
        java.lang.String r3 = "036";
    L7:
        return "dex\n" + r3 + "\u0000";
    L5:
        r3 = "035";
        goto L7
    }
}
