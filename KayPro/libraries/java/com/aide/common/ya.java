package com.aide.common;

@abcd.Interfacexu
class ya implements android.text.TextWatcher {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.SeekBar FH;
    final android.widget.EditText Hw;

    @abcd.Interfacevu
    final com.aide.common.Fa v5;

    static {
        abcd.wu.j6(com.aide.common.ya.class, -6420951009284476296L, 7362391223106751152L);
    }

    ya(com.aide.common.Fa r1, android.widget.SeekBar r2, android.widget.EditText r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 4568724083502597700L)
    public void afterTextChanged(android.text.Editable r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -4737701181732788500L, this, r5);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-4737701181732788500L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    @abcd.Interfacesu(method = 3764571094947455363L)
    public void beforeTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, -1233092246697293477L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(-1233092246697293477L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L6
        return;
    }

    @Override
    @abcd.Interfacesu(method = -1402329216411462903L)
    public void onTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 107688213966559649L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(107688213966559649L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.common.Fa.j6(this.v5, true);     // Catch: java.lang.Throwable -> L7
        com.aide.common.Fa.DW(this.v5, this.FH, this.Hw.getText().toString());     // Catch: java.lang.Throwable -> L7
        com.aide.common.Fa.j6(this.v5, false);     // Catch: java.lang.Throwable -> L7
    }
}
