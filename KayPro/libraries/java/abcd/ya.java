package abcd;

@abcd.Interfacexu
class ya implements java.util.Comparator<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.za FH;

    static {
        abcd.wu.j6(abcd.ya.class, -138465097617559095L, -6266991932506816560L);
    }

    ya(abcd.za r1) {
        this.FH = r1;
    }

    @Override
    public int compare(java.lang.String r1, java.lang.String r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 949169310741728555L)
    public int j6(java.lang.String r11, java.lang.String r12) {
    L38:
        th = move-exception;
        if (DW == false) goto L43;
        abcd.wu.j6(th, -233427564669915015L, this, r11, r12);
    L43:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-233427564669915015L, this, r11, r12);     // Catch: java.lang.Throwable -> L38
    L5:
        int r0 = r11.length() - 6;     // Catch: java.lang.Throwable -> L38
        int r1 = r12.length() - 6;     // Catch: java.lang.Throwable -> L38
        if (r0 >= r1) goto L8;
        int r2 = r0;
    L9:
        int r4 = 0;
    L11:
        if (r4 >= r2) goto L33;
        char r7 = r11.charAt(r4);     // Catch: java.lang.Throwable -> L38
        char r8 = r12.charAt(r4);     // Catch: java.lang.Throwable -> L38
        if (r7 != '$') goto L17;
        if (r7 == r8) goto L17;
        return -1;
    L17:
        if (r8 != '$') goto L21;
        if (r7 == r8) goto L21;
        return 1;
    L21:
        if (r7 != '+') goto L24;
        if (r7 == r8) goto L24;
        return -1;
    L24:
        if (r8 != '+') goto L27;
        if (r7 == r8) goto L27;
        return 1;
    L27:
        int r9 = r7 - r8;
        if (r9 < 0) goto L29;
        if (r9 > 0) goto L31;
        r4 = r4 + 1;
        goto L11
    L31:
        return 1;
    L29:
        return -1;
    L33:
        if (r0 >= r1) goto L35;
        return -1;
    L35:
        if (r0 <= r1) goto L37;
        return 1;
    L37:
        return 0;
    L8:
        r2 = r1;
        goto L9
    }
}
