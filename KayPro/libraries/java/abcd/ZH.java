package abcd;

class ZH extends abcd.RK.d {
    private final java.lang.String EQ;
    private final java.lang.String VH;
    final abcd._H Zo;
    private final java.lang.String gn;
    private final abcd.LE tp;
    private final java.security.MessageDigest u7;

    ZH(abcd._H r1, java.lang.String r2, java.lang.String r3, java.security.MessageDigest r4, abcd.LE r5, java.lang.String r6) {
        this.Zo = r1;
        this.VH = r2;
        this.gn = r3;
        this.u7 = r4;
        this.tp = r5;
        this.EQ = r6;
    }

    @Override
    public void close() {
        super.close();
        abcd._H.j6(this.Zo, this.VH, this.gn, this.u7.digest(), this, this.tp, this.EQ);     // Catch: java.lang.Throwable -> L6
        j6();
        return;
    L6:
        th = move-exception;
        j6();
        throw th;
    }
}
