package abcd;

@abcd.Interfacexu
class Ql implements abcd.InterfacePl {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final abcd.Ol FH;
    final java.io.ByteArrayOutputStream Hw;
    final java.io.ByteArrayOutputStream v5;

    static {
        abcd.wu.j6(abcd.Ql.class, -308329056398801275L, -212157866923620808L);
    }

    Ql(abcd.Ol r1, java.io.ByteArrayOutputStream r2, java.io.ByteArrayOutputStream r3) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
    }

    @Override
    @abcd.Interfacesu(method = 246923349937611165L)
    public int DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1794138113038964256L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1794138113038964256L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.j6();
    }

    @Override
    @abcd.Interfacesu(method = 2100054865063494939L)
    public byte[] j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4386298280030347744L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4386298280030347744L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw.toByteArray();
    }
}
