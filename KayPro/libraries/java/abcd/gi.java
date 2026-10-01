package abcd;

@abcd.Interfacexu
class gi implements android.text.TextWatcher {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.AlertDialog FH;

    @abcd.Interfacevu
    final abcd.ii Hw;

    static {
        abcd.wu.j6(abcd.gi.class, 1005502431686740692L, 326119207969906179L);
    }

    gi(abcd.ii r1, android.app.AlertDialog r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -2406843055279833793L)
    public void afterTextChanged(android.text.Editable r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3806265420746266800L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3806265420746266800L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.ii.DW(this.Hw, this.FH);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = 2691604077837167916L)
    public void beforeTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, -3617428141940603875L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(-3617428141940603875L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L6
        return;
    }

    @Override
    @abcd.Interfacesu(method = -626349458356271560L)
    public void onTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, -7352888224605779361L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(-7352888224605779361L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L6
        return;
    }
}
