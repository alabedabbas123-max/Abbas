package abcd;

@abcd.Interfacexu
public class fc extends java.io.DataOutputStream {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.fc.class, 717918435269879089L, 717918435269879089L);
    }

    public fc(java.lang.String r8, java.util.zip.Deflater r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 134178129447885271L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(134178129447885271L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(new java.io.BufferedOutputStream(new java.util.zip.DeflaterOutputStream(new java.io.FileOutputStream(r8), r9)));     // Catch: java.lang.Throwable -> L7
    }
}
