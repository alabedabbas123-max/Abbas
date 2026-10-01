package abcd;

@abcd.Interfacexu
class Rk implements java.util.Comparator<abcd.Sk.a> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Sk FH;

    static {
        abcd.wu.j6(abcd.Rk.class, -510280536001576560L, -4040728634786110904L);
    }

    Rk(abcd.Sk r1) {
        this.FH = r1;
    }

    @Override
    public int compare(abcd.Sk.a r1, abcd.Sk.a r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 778114950652043056L)
    public int j6(abcd.Sk.a r8, abcd.Sk.a r9) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5108201626007046819L, this, r8, r9);
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(5108201626007046819L, this, r8, r9);     // Catch: java.lang.Throwable -> L8
    L5:
        return r8.VH.EQ - r9.VH.EQ;
    }
}
