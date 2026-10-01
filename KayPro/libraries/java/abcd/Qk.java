package abcd;

@abcd.Interfacexu
class Qk implements java.util.Comparator<abcd.Sk.a> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Sk FH;

    static {
        abcd.wu.j6(abcd.Qk.class, -510280536001576560L, -4040612867491146039L);
    }

    Qk(abcd.Sk r1) {
        this.FH = r1;
    }

    @Override
    public int compare(abcd.Sk.a r1, abcd.Sk.a r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = -92436774594053925L)
    public int j6(abcd.Sk.a r8, abcd.Sk.a r9) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2419461140002384611L, this, r8, r9);
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2419461140002384611L, this, r8, r9);     // Catch: java.lang.Throwable -> L8
    L5:
        return r8.VH.EQ - r9.VH.EQ;
    }
}
