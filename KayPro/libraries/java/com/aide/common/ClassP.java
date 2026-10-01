package com.aide.common;

@abcd.Interfacexu
class ClassP implements android.text.TextWatcher {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.common.ColorPickerView FH;

    @abcd.Interfacevu
    final com.aide.common.ClassT Hw;

    static {
        abcd.wu.j6(com.aide.common.ClassP.class, 2649604467815608996L, 3887831664087072096L);
    }

    ClassP(com.aide.common.ClassT r1, com.aide.common.ColorPickerView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 4810235020329635935L)
    public void afterTextChanged(android.text.Editable r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3638906623784591393L, this, r5);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(3638906623784591393L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    @abcd.Interfacesu(method = 1187401018499193468L)
    public void beforeTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, 1830596934681658528L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(1830596934681658528L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L6
        return;
    }

    @Override
    @abcd.Interfacesu(method = -4595652138330262112L)
    public void onTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, -2729822879843132820L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2729822879843132820L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L9
    L6:
        if (com.aide.common.ClassT.DW(this.Hw) == true) goto L16;
        com.aide.common.ClassT.j6(this.Hw, true);     // Catch: java.lang.Throwable -> L9
        this.FH.setCurrentColor(r10.toString());     // Catch: java.lang.Throwable -> L9
        com.aide.common.ClassT.j6(this.Hw, false);     // Catch: java.lang.Throwable -> L9
        return;
    }
}
