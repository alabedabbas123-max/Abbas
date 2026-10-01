package com.aide.uidesigner;

@abcd.Interfacexu
class M implements java.util.Comparator<com.aide.uidesigner.N.a> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.M.class, -175704537702267603L, 2361452621816598336L);
    }

    M() {
    }

    @Override
    public int compare(com.aide.uidesigner.N.a r1, com.aide.uidesigner.N.a r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 3490068158378061936L)
    public int j6(com.aide.uidesigner.N.a r8, com.aide.uidesigner.N.a r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5995427104692423916L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5995427104692423916L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return r8.j6().compareTo(r9.j6());
    }
}
