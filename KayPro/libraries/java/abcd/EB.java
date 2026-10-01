package abcd;

public class EB extends dB<java.util.Map<java.lang.String, abcd.WH>> {
    private final java.util.Collection<java.lang.String> FH;

    public EB(abcd.UE r1) {
        super(r1);
        this.FH = new java.util.ArrayList();
    }

    private abcd.WH j6(abcd.YH r5) {
        abcd.yE r0 = r5.VH();
        java.lang.String r1 = r5.gn();
        if (r5.Hw() != null) goto L7;
        return new abcd.WH(abcd.XH.j6, r1, r0);
    L7:
        if (r5.DW() == null) goto L9;
        abcd.UE r6 = r5.tp();
        if (r6 == null) goto L13;
        abcd.yE r7 = r6.FH("HEAD");
        if (r7 != null) goto L19;
        return new abcd.WH(abcd.XH.DW, r1, r0, r7);
    L19:
        if (r7.DW(r0) == true) goto L23;
        return new abcd.WH(abcd.XH.Hw, r1, r0, r7);
    L23:
        return new abcd.WH(abcd.XH.FH, r1, r0, r7);
    L13:
        return new abcd.WH(abcd.XH.DW, r1, r0);
    L9:
        return new abcd.WH(abcd.XH.DW, r1, r0);
    }

    public java.lang.Object call() {
        return m4call();
    }

    public java.util.Map<java.lang.String, abcd.WH> m4call() {
        j6();
        abcd.YH r0 = abcd.YH.j6(this.j6);     // Catch: abcd.XC -> L12 java.io.IOException -> L15
        if (this.FH.isEmpty() == true) goto L6;
        r0.j6(abcd.hK.DW(this.FH));     // Catch: abcd.XC -> L12 java.io.IOException -> L15
    L6:
        java.util.HashMap r1 = new java.util.HashMap();     // Catch: abcd.XC -> L12 java.io.IOException -> L15
    L7:
        if (r0.EQ() == false) goto L9;
        abcd.WH r2 = j6(r0);     // Catch: abcd.XC -> L12 java.io.IOException -> L15
        r1.put(r2.j6(), r2);     // Catch: abcd.XC -> L12 java.io.IOException -> L15
        goto L7
    L9:
        return r1;
    L12:
        e = move-exception;
        throw new abcd.SB(e.getMessage(), e);
    L15:
        e = move-exception;
        throw new abcd.SB(e.getMessage(), e);
    }
}
