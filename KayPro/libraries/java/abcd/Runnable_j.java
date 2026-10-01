package abcd;

@abcd.Interfacexu
class Runnable_j implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.ck FH;

    static {
        abcd.wu.j6(abcd.Runnable_j.class, 7280145652699390275L, 4898525565594056116L);
    }

    Runnable_j(abcd.ck r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 2595839563360278180L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 558932496391935312L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(558932496391935312L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.ck.FH(this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
