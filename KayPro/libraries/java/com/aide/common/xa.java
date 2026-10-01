package com.aide.common;

@abcd.Interfacexu
class xa implements android.widget.SeekBar.OnSeekBarChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.EditText FH;
    final android.widget.SeekBar Hw;

    @abcd.Interfacevu
    final com.aide.common.Fa v5;

    static {
        abcd.wu.j6(com.aide.common.xa.class, -6420951009284476296L, 7362269361799739625L);
    }

    xa(com.aide.common.Fa r1, android.widget.EditText r2, android.widget.SeekBar r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -2652385375895288505L)
    public void onProgressChanged(android.widget.SeekBar r9, int r10, boolean r11) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 2585311504734508900L, this, r9, new java.lang.Integer(r10), new java.lang.Boolean(r11));
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(2585311504734508900L, this, r9, new java.lang.Integer(r10), new java.lang.Boolean(r11));     // Catch: java.lang.Throwable -> L9
    L6:
        if (com.aide.common.Fa.j6(this.v5) == true) goto L16;
        this.FH.setText(com.aide.common.Fa.j6(this.v5, this.Hw, this.FH.getText().toString()));     // Catch: java.lang.Throwable -> L9
        return;
    }

    @Override
    @abcd.Interfacesu(method = 164368036752438480L)
    public void onStartTrackingTouch(android.widget.SeekBar r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2017023948132460155L, this, r5);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(2017023948132460155L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    @abcd.Interfacesu(method = 3902482114945473360L)
    public void onStopTrackingTouch(android.widget.SeekBar r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 290907118009294735L, this, r5);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(290907118009294735L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }
}
