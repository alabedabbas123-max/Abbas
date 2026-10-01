package abcd;

@abcd.Interfacexu
class oc extends abcd.Abstractpc {

    @abcd.Interfaceuu
    private static boolean Zo;

    @abcd.Interfacetu
    private static boolean v5;

    static {
        abcd.wu.j6(abcd.oc.class, 6961425216133458609L, -362198004114028544L);
    }

    oc() {
    }

    @Override
    @abcd.Interfacesu(method = -665451922478599980L)
    public boolean j6(java.lang.String r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (Zo == false) goto L11;
        abcd.wu.j6(th, 2838271493419175280L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (v5 == false) goto L5;
        abcd.wu.j6(2838271493419175280L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return r8.toLowerCase().endsWith(r9.substring(1, r9.length()).toLowerCase());
    }
}
