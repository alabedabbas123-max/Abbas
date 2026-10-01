package abcd;

public class Mn {
    private static java.util.HashSet<java.lang.String> DW;
    private static boolean FH;
    private static java.util.HashSet<java.lang.String> j6;

    private static java.util.HashSet<java.lang.String> DW(java.lang.String r4) {
        java.util.HashSet<java.lang.String> r0 = new java.util.HashSet();
        java.io.FileReader r1 = new java.io.FileReader(r4);     // Catch: java.io.IOException -> L9
        java.io.BufferedReader r2 = new java.io.BufferedReader(r1);     // Catch: java.io.IOException -> L9
    L4:
        java.lang.String r3 = r2.readLine();     // Catch: java.io.IOException -> L9
        if (r3 == null) goto L7;
        r0.add(r3);     // Catch: java.io.IOException -> L9
        goto L4
    L7:
        r1.close();     // Catch: java.io.IOException -> L9
        return r0;
    L9:
        e = move-exception;
        throw new java.lang.RuntimeException("Error with optimize list: " + r4, e);
    }

    public static void j6(java.lang.String r1, java.lang.String r2) {
        if (FH == false) goto L5;
        return;
    L5:
        if (r1 == null) goto L10;
        if (r2 == null) goto L10;
        throw new java.lang.RuntimeException("optimize and don't optimize lists  are mutually exclusive.");
    L10:
        if (r1 == null) goto L12;
        j6 = DW(r1);
    L12:
        if (r2 == null) goto L14;
        DW = DW(r2);
    L14:
        FH = true;
    }

    public static boolean j6(java.lang.String r2) {
        java.util.HashSet<java.lang.String> r0 = j6;
        if (r0 != null) goto L5;
        java.util.HashSet<java.lang.String> r1 = DW;
        if (r1 != null) goto L9;
        return true;
    L9:
        return !r1.contains(r2);
    L5:
        return r0.contains(r2);
    }
}
