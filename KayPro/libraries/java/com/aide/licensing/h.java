package com.aide.licensing;

@abcd.Interfacexu
class h implements java.util.Comparator<android.accounts.Account> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.licensing.h.class, 5040490317030669360L, 3745435933143277831L);
    }

    h() {
    }

    @Override
    public int compare(android.accounts.Account r1, android.accounts.Account r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 1219894917722413947L)
    public int j6(android.accounts.Account r8, android.accounts.Account r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 7010002508793731072L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(7010002508793731072L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return com.aide.licensing.i.j6(r8.name).compareTo(com.aide.licensing.i.j6(r9.name));
    }
}
