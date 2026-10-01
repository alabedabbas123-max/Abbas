package abcd;

@abcd.Interfacexu
public class ve {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.ve.class, -928767759730210080L, -928767759730210080L);
    }

    public ve() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2143294532172941568L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2143294532172941568L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static void j6(java.io.Reader r7, java.io.Writer r8) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -7490126094935077683L, null, r7, r8);
    L24:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-7490126094935077683L, null, r7, r8);     // Catch: java.lang.Throwable -> L19
    L5:
        char[] r0 = new char[4096];     // Catch: java.lang.Throwable -> L19
    L26:
        int r1 = r7.read(r0);     // Catch: java.lang.Throwable -> L13
        if (r1 == (-1)) goto L10;
        r8.write(r0, 0, r1);     // Catch: java.lang.Throwable -> L13
    L10:
        r7.close();     // Catch: java.lang.Throwable -> L16
        r8.close();     // Catch: java.lang.Throwable -> L19
        return;
    L13:
        th = move-exception;
        r7.close();     // Catch: java.lang.Throwable -> L16
        throw th;     // Catch: java.lang.Throwable -> L16
    L16:
        th = move-exception;
        r8.close();     // Catch: java.lang.Throwable -> L19
        throw th;     // Catch: java.lang.Throwable -> L19
    }
}
