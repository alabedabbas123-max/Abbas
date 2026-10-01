package com.aide.common;

@abcd.Interfacexu
class ViewOnClickListenerza implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.EditText FH;
    final android.widget.SeekBar Hw;

    @abcd.Interfacevu
    final com.aide.common.Fa v5;

    static {
        abcd.wu.j6(com.aide.common.ViewOnClickListenerza.class, -6420951009284476296L, 7362513084417825973L);
    }

    ViewOnClickListenerza(com.aide.common.Fa r1, android.widget.EditText r2, android.widget.SeekBar r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -246993986925465240L)
    public void onClick(android.view.View r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 665434883221780992L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(665434883221780992L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.setText(com.aide.common.Fa.j6(this.v5, this.FH.getText().toString()));     // Catch: java.lang.Throwable -> L8
        com.aide.common.Fa.DW(this.v5, this.Hw, this.FH.getText().toString());     // Catch: java.lang.Throwable -> L8
    }
}
