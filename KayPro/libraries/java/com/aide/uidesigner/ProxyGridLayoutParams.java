package com.aide.uidesigner;

@abcd.Interfacexu
public class ProxyGridLayoutParams {

    @abcd.Interfacetu
    private static boolean $ON_ENTER_TOGGLE;

    @abcd.Interfaceuu
    private static boolean $ON_THROW_TOGGLE;

    @abcd.Interfaceru(field = -640223411509054965L)
    private int column;

    @abcd.Interfaceru(field = -2671813512724193285L)
    private int columnSpan;

    @abcd.Interfaceru(field = 1056228196367979055L)
    private int gravity;

    @abcd.Interfaceru(field = 3259080872989361193L)
    private android.widget.GridLayout.LayoutParams params;

    @abcd.Interfaceru(field = -2045049457975934011L)
    private int row;

    @abcd.Interfaceru(field = 934012362398310305L)
    private int rowSpan;

    static {
        abcd.wu.j6(com.aide.uidesigner.ProxyGridLayoutParams.class, -2193318701393846241L, -2193318701393846241L);
    }

    public ProxyGridLayoutParams(java.lang.Object r6) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -987499445710607329L, null, r6);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-987499445710607329L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.column = 0;     // Catch: java.lang.Throwable -> L8
        this.row = 0;     // Catch: java.lang.Throwable -> L8
        this.columnSpan = 1;     // Catch: java.lang.Throwable -> L8
        this.rowSpan = 1;     // Catch: java.lang.Throwable -> L8
        this.gravity = 0;     // Catch: java.lang.Throwable -> L8
        this.params = (android.widget.GridLayout.LayoutParams) r6;     // Catch: java.lang.Throwable -> L8
        updateSpecs();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -2955670765779420141L)
    private static android.widget.GridLayout.Alignment getAlignment(int r7, boolean r8) {
    L35:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L39;
        abcd.wu.j6(th, -4201092629835051187L, null, new java.lang.Integer(r7), new java.lang.Boolean(r8));
    L39:
        throw th;
    L3:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-4201092629835051187L, null, new java.lang.Integer(r7), new java.lang.Boolean(r8));     // Catch: java.lang.Throwable -> L35
    L6:
        if (r8 == false) goto L8;
        int r2 = 7;
    L9:
        if (r8 == false) goto L11;
        int r3 = 0;
    L12:
        int r4 = (r2 & r7) >> r3;
        if (r4 == 1) goto L34;
        if (r4 != 3) goto L17;
        if (r8 == false) goto L32;
        return android.widget.GridLayout.LEFT;
    L32:
        return android.widget.GridLayout.TOP;
    L17:
        if (r4 == 5) goto L25;
        if (r4 == 7) goto L24;
        java.lang.reflect.Field r0 = android.widget.GridLayout.class.getDeclaredField("UNDEFINED_ALIGNMENT");     // Catch: java.lang.Throwable -> L21
        r0.setAccessible(true);     // Catch: java.lang.Throwable -> L21
        return (android.widget.GridLayout.Alignment) r0.get(null);
    L22:
        return android.widget.GridLayout.CENTER;
    L24:
        return android.widget.GridLayout.FILL;
    L25:
        if (r8 == false) goto L28;
        return android.widget.GridLayout.RIGHT;
    L28:
        return android.widget.GridLayout.BOTTOM;
    L34:
        return android.widget.GridLayout.CENTER;
    L11:
        r3 = 4;
        goto L12
    L8:
        r2 = 112;
        goto L9
    }

    @abcd.Interfacesu(method = 3049136925501491865L)
    private void updateSpecs() {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 2587538496136358523L, this);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2587538496136358523L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        android.widget.GridLayout.LayoutParams r2 = this.params;     // Catch: java.lang.Throwable -> L8
        r2.columnSpec = android.widget.GridLayout.spec(this.column, this.columnSpan, getAlignment(this.gravity, true));     // Catch: java.lang.Throwable -> L8
        android.widget.GridLayout.LayoutParams r3 = this.params;     // Catch: java.lang.Throwable -> L8
        r3.rowSpec = android.widget.GridLayout.spec(this.row, this.rowSpan, getAlignment(this.gravity, false));     // Catch: java.lang.Throwable -> L8
    }

    public void setColumn(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -541604021149905175L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-541604021149905175L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.column = r5;     // Catch: java.lang.Throwable -> L8
        updateSpecs();     // Catch: java.lang.Throwable -> L8
    }

    public void setColumnSpan(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 215497799183866665L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(215497799183866665L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.columnSpan = r5;     // Catch: java.lang.Throwable -> L8
        updateSpecs();     // Catch: java.lang.Throwable -> L8
    }

    public void setGravity(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -2292289876693872069L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-2292289876693872069L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.gravity = r5;     // Catch: java.lang.Throwable -> L8
        updateSpecs();     // Catch: java.lang.Throwable -> L8
    }

    public void setRow(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -45032572400686827L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-45032572400686827L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.row = r5;     // Catch: java.lang.Throwable -> L8
        updateSpecs();     // Catch: java.lang.Throwable -> L8
    }

    public void setRowSpan(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 1723409251806024133L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(1723409251806024133L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.rowSpan = r5;     // Catch: java.lang.Throwable -> L8
        updateSpecs();     // Catch: java.lang.Throwable -> L8
    }
}
