package abcd;

@abcd.Interfacexu
class Ml extends java.lang.Thread {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Ol FH;

    static {
        abcd.wu.j6(abcd.Ml.class, -5925735092384612688L, -3471751321666830100L);
    }

    Ml(abcd.Ol r1, java.lang.String r2) {
        this.FH = r1;
        super(r2);
    }

    @Override
    @abcd.Interfacesu(method = -683558885977978496L)
    public void run() {
    L52:
        th = move-exception;
        if (DW == false) goto L57;
        abcd.wu.j6(th, -4717426943430638892L, this);
    L57:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4717426943430638892L, this);     // Catch: java.lang.Throwable -> L52
    L6:
        byte[] r3 = new byte[6];
        if (abcd.Ol.Zo(this.FH) == null) goto L40;
        int r0 = com.a.a(abcd.Ol.Zo(this.FH), r3);     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L36
    L10:
        if (r0 <= 0) goto L27;
        java.lang.Object r1 = abcd.Ol.VH(this.FH);     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L36
        monitor-enter(r1);     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L36
    L23:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L36
    L14:
        if (abcd.Ol.gn(this.FH) == true) goto L15;
        monitor-exit(r1);     // Catch: java.lang.Throwable -> L23
        if (abcd.Ol.u7(this.FH) == null) goto L21;
        abcd.Ol.u7(this.FH).write(r3, 0, r0);     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L36
    L21:
        r0 = com.a.a(abcd.Ol.Zo(this.FH), r3);     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L36
        goto L10
    L15:
        monitor-exit(r1);     // Catch: java.lang.Throwable -> L23
    L27:
        if (abcd.Ol.u7(this.FH) == null) goto L40;
        abcd.Ol r2 = this.FH;     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L62
    L29:
        abcd.Ol.u7(r2).close();     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L62
    L31:
        th = move-exception;
        if (abcd.Ol.u7(this.FH) == null) goto L35;
        abcd.Ol.u7(this.FH).close();     // Catch: java.io.IOException -> L61 java.lang.Throwable -> L62
    L35:
        throw th;     // Catch: java.lang.Throwable -> L62
    L37:
        if (abcd.Ol.u7(this.FH) == null) goto L40;
        r2 = this.FH;     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L62
    L40:
        abcd.Ol r4 = this.FH;     // Catch: java.lang.Throwable -> L62
        monitor-enter(r4);     // Catch: java.lang.Throwable -> L62
        abcd.Ol.Hw(this.FH);     // Catch: java.lang.Throwable -> L48
        if (abcd.Ol.FH(this.FH) > 0) goto L46;
        this.FH.notifyAll();     // Catch: java.lang.Throwable -> L48
        abcd.Ol.v5(this.FH).j6();     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L48
    L46:
        monitor-exit(r4);     // Catch: java.lang.Throwable -> L48
        goto L82
    L51:
        return;
    L48:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L62
    }
}
