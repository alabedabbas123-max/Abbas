package abcd;

public class Lw extends abcd.Jw {
    public Lw(java.io.BufferedReader r3) {
        super("failed to parse: " + j6(r3));
    }

    public Lw(java.lang.String r1) {
        super(r1);
    }

    public static java.lang.String j6(java.io.BufferedReader r2) {
        if (r2 != null) goto L13;
    L4:
        java.lang.StringBuffer r0 = new java.lang.StringBuffer();
    L15:
        java.lang.String r1 = r2.readLine();     // Catch: java.io.IOException -> L12
        if (r1 == null) goto L10;
        r0.append(r1);     // Catch: java.io.IOException -> L12
    L10:
        return r0.toString();
    L13:
        r2.reset();     // Catch: java.io.IOException -> L11
        goto L4
    }
}
