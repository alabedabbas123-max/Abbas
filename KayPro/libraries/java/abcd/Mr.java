package abcd;

public final class Mr {
    public static java.lang.String DW(int r2) {
        return j6(r2, 20703, 2);
    }

    public static java.lang.String FH(int r2) {
        return j6(r2, 30239, 1);
    }

    public static boolean Hw(int r0) {
        if ((r0 & 1024) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static boolean VH(int r0) {
        if ((r0 & 2) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static boolean Zo(int r0) {
        if ((r0 & 256) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static boolean gn(int r0) {
        if ((r0 & 8) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static java.lang.String j6(int r2) {
        return j6(r2, 30257, 1);
    }

    private static java.lang.String j6(int r4, int r5, int r6) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(80);
        int r1 = (r5 ^ (-1)) & r4;
        int r7 = r4 & r5;
        if ((r7 & 1) == 0) goto L6;
        r0.append("|public");
    L6:
        if ((r7 & 2) == 0) goto L9;
        r0.append("|private");
    L9:
        if ((r7 & 4) == 0) goto L12;
        r0.append("|protected");
    L12:
        if ((r7 & 8) == 0) goto L15;
        r0.append("|static");
    L15:
        if ((r7 & 16) == 0) goto L18;
        r0.append("|final");
    L18:
        if ((r7 & 32) == 0) goto L23;
        if (r6 != 1) goto L21;
        r0.append("|super");
        goto L23
    L21:
        r0.append("|synchronized");
    L23:
        if ((r7 & 64) == 0) goto L28;
        if (r6 != 3) goto L26;
        r0.append("|bridge");
        goto L28
    L26:
        r0.append("|volatile");
    L28:
        if ((r7 & 128) == 0) goto L33;
        if (r6 != 3) goto L31;
        r0.append("|varargs");
        goto L33
    L31:
        r0.append("|transient");
    L33:
        if ((r7 & 256) == 0) goto L36;
        r0.append("|native");
    L36:
        if ((r7 & 512) == 0) goto L39;
        r0.append("|interface");
    L39:
        if ((r7 & 1024) == 0) goto L42;
        r0.append("|abstract");
    L42:
        if ((r7 & 2048) == 0) goto L45;
        r0.append("|strictfp");
    L45:
        if ((r7 & 4096) == 0) goto L48;
        r0.append("|synthetic");
    L48:
        if ((r7 & 8192) == 0) goto L51;
        r0.append("|annotation");
    L51:
        if ((r7 & 16384) == 0) goto L54;
        r0.append("|enum");
    L54:
        if ((65536 & r7) == 0) goto L57;
        r0.append("|constructor");
    L57:
        if ((r7 & 131072) == 0) goto L59;
        r0.append("|declared_synchronized");
    L59:
        if (r1 == 0) goto L61;
    L62:
        r0.append('|');
        r0.append(abcd.Yt.v5(r1));
    L64:
        return r0.substring(1);
    L61:
        if (r0.length() != 0) goto L64;
        goto L62
    }

    public static java.lang.String tp(int r2) {
        return j6(r2, 204287, 3);
    }

    public static boolean u7(int r0) {
        if ((r0 & 32) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static boolean v5(int r0) {
        if ((r0 & 8192) == 0) goto L5;
        return true;
    L5:
        return false;
    }
}
