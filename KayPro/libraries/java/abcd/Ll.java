package abcd;

@abcd.Interfacexu
class Ll extends java.lang.Thread {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Ol FH;

    static {
        abcd.wu.j6(abcd.Ll.class, -5925735092384612688L, -3471693816017974185L);
    }

    Ll(abcd.Ol r1, java.lang.String r2) {
        this.FH = r1;
        super(r2);
    }

    @Override
    @abcd.Interfacesu(method = 1232421720753091416L)
    public void run() {
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -4719406164269163991L, this);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L27;
        abcd.wu.j6(-4719406164269163991L, this);     // Catch: java.lang.Throwable -> L19
    L27:
        abcd.Ol.j6(this.FH).waitFor();     // Catch: java.lang.InterruptedException -> L24 java.lang.Throwable -> L26
        abcd.Ol.j6(this.FH, abcd.Ol.j6(this.FH).exitValue());     // Catch: java.lang.InterruptedException -> L24 java.lang.Throwable -> L26
    L7:
        abcd.Ol r0 = this.FH;     // Catch: java.lang.Throwable -> L26
        monitor-enter(r0);     // Catch: java.lang.Throwable -> L26
        abcd.Ol.Hw(this.FH);     // Catch: java.lang.Throwable -> L15
        if (abcd.Ol.FH(this.FH) > 0) goto L13;
        this.FH.notifyAll();     // Catch: java.lang.Throwable -> L15
        abcd.Ol.v5(this.FH).j6();     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L15
    L13:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L15
        goto L36
    L18:
        return;
    L15:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L26
    }
}
