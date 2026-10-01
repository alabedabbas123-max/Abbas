package abcd;

public final class Wt {
    public static boolean j6(java.lang.String r1) {
        if (r1.endsWith(".zip") == false) goto L5;
    L10:
        return true;
    L5:
        if (r1.endsWith(".jar") == true) goto L10;
        if (r1.endsWith(".apk") == true) goto L10;
        return false;
    }
}
