package abcd;

public class DB extends dB<java.util.Collection<java.lang.String>> {
    private final java.util.Collection<java.lang.String> FH;

    public DB(abcd.UE r1) {
        super(r1);
        this.FH = new java.util.ArrayList();
    }

    public java.lang.Object call() {
        return m3call();
    }

    public java.util.Collection<java.lang.String> m3call() {
        j6();
        abcd.YH r0 = abcd.YH.j6(this.j6);     // Catch: abcd.XC -> L26 java.io.IOException -> L29
        if (this.FH.isEmpty() == true) goto L6;
        r0.j6(abcd.hK.DW(this.FH));     // Catch: abcd.XC -> L26 java.io.IOException -> L29
    L6:
        abcd.AbstractjF r1 = this.j6.Zo();     // Catch: abcd.XC -> L26 java.io.IOException -> L29
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: abcd.XC -> L26 java.io.IOException -> L29
    L8:
        if (r0.EQ() == false) goto L10;
        if (r0.DW() != null) goto L8;
        java.lang.String r3 = r0.gn();     // Catch: abcd.XC -> L26 java.io.IOException -> L29
        java.lang.String r4 = r0.u7();     // Catch: abcd.XC -> L26 java.io.IOException -> L29
        java.lang.String r5 = r0.v5();     // Catch: abcd.XC -> L26 java.io.IOException -> L29
        if (r4 == null) goto L20;
        r1.j6("submodule", r3, "url", r4);     // Catch: abcd.XC -> L26 java.io.IOException -> L29
    L20:
        if (r5 == null) goto L22;
        r1.j6("submodule", r3, "update", r5);     // Catch: abcd.XC -> L26 java.io.IOException -> L29
    L22:
        if (r4 != null) goto L24;
        if (r5 == null) goto L8;
    L24:
        r2.add(r3);     // Catch: abcd.XC -> L26 java.io.IOException -> L29
        goto L8
    L10:
        if (r2.isEmpty() == true) goto L12;
        r1.v5();     // Catch: abcd.XC -> L26 java.io.IOException -> L29
    L12:
        return r2;
    L26:
        e = move-exception;
        throw new abcd.SB(e.getMessage(), e);
    L29:
        e = move-exception;
        throw new abcd.SB(e.getMessage(), e);
    }
}
