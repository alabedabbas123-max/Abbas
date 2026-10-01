package abcd;

@abcd.Interfacexu
class Runnableyj implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;
    final int Hw;

    @abcd.Interfacevu
    final abcd.Kj Zo;
    final int v5;

    static {
        abcd.wu.j6(abcd.Runnableyj.class, 144659656370786727L, 288338879671579264L);
    }

    Runnableyj(abcd.Kj r1, java.lang.String r2, int r3, int r4) {
        this.Zo = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
    }

    @Override
    @abcd.Interfacesu(method = -739274325783699537L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -572253849773162640L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-572253849773162640L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.Kj.FH(this.Zo, this.FH);     // Catch: java.lang.Throwable -> L8
        abcd.Kj.FH(this.Zo, this.Hw);     // Catch: java.lang.Throwable -> L8
        abcd.Kj.DW(this.Zo, this.v5);     // Catch: java.lang.Throwable -> L8
        abcd.Kj.Hw(this.Zo);     // Catch: java.lang.Throwable -> L8
    }
}
