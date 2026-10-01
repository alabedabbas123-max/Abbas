package abcd;

@abcd.Interfacexu
class Uh implements android.text.TextWatcher {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.AlertDialog FH;

    @abcd.Interfacevu
    final abcd.Yh Hw;

    static {
        abcd.wu.j6(abcd.Uh.class, 4518137094473097045L, 275190878524207133L);
    }

    Uh(abcd.Yh r1, android.app.AlertDialog r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -4049602498583525145L)
    public void afterTextChanged(android.text.Editable r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 32561115964374529L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(32561115964374529L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.j6(this.FH);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -3453644568292718900L)
    public void beforeTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, 190838533775794516L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(190838533775794516L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L6
        return;
    }

    @Override
    @abcd.Interfacesu(method = -3919527213295438656L)
    public void onTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, 2259552954681966488L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(2259552954681966488L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L6
        return;
    }
}
