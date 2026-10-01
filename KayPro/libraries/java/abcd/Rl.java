package abcd;

@abcd.Interfacexu
public class Rl {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.Rl.class, -308329056398801275L, -308329056398801275L);
    }

    public Rl() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4489823954854448053L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4489823954854448053L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static abcd.InterfacePl j6(java.util.List<java.lang.String> r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, boolean r9, java.io.OutputStream r10, byte[] r11) {
        if (j6 == false) goto L5;
        abcd.wu.j6(4958579833176135095L, null, new java.lang.Object[]{r6, r7, r8, new java.lang.Boolean(r9), r10, r11});
    L5:
        java.lang.String[] r0 = new java.lang.String[r6.size()];
        r6.toArray(r0);
        abcd.Ol r12 = new abcd.Ol(r0, r8, r7, r9);
        java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream();
        java.io.ByteArrayOutputStream r14 = new java.io.ByteArrayOutputStream();
        r12.DW(new abcd.Kl(r13, r10));
        r12.j6(new abcd.Kl(r14, r10));
        java.io.OutputStream r15 = r12.FH();
        if (r15 == null) goto L22;
        if (r11 != null) goto L9;
    L12:
        r15.close();
        goto L22
    L9:
        if (r11.length == 0) goto L12;
        r15.write(r11);     // Catch: java.io.InterruptedIOException -> L19
    L11:
        r15.flush();
    L22:
        r12.Hw();     // Catch: java.lang.InterruptedException -> L16
        return new abcd.Ql(r12, r13, r14);
    L16:
        e = move-exception;
        r12.DW();
        throw e;
    }
}
