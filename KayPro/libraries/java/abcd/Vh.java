package abcd;

@abcd.Interfacexu
class Vh implements android.text.TextWatcher {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.AlertDialog FH;

    @abcd.Interfacevu
    final abcd.Yh Hw;

    static {
        abcd.wu.j6(abcd.Vh.class, 4518137094473097045L, 275254164365652720L);
    }

    Vh(abcd.Yh r1, android.app.AlertDialog r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3491187804474347635L)
    public void afterTextChanged(android.text.Editable r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 32809655489832920L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(32809655489832920L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.j6(this.FH);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -1734380030054442400L)
    public void beforeTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, -76129848003339711L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(-76129848003339711L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L6
        return;
    }

    @Override
    @abcd.Interfacesu(method = 1672343814893898000L)
    public void onTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, 1410254381452526095L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(1410254381452526095L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L6
        return;
    }
}
