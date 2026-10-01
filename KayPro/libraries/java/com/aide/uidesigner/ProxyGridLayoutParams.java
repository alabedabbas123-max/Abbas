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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if ($ON_THROW_TOGGLE == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -987499445710607329L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-987499445710607329L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.column = 0;
                        this.row = 0;
                        this.columnSpan = 1;
                        this.rowSpan = 1;
                        this.gravity = 0;
                        this.params = (android.widget.GridLayout.LayoutParams) r6;
                        updateSpecs();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2955670765779420141L)
    private static android.widget.GridLayout.Alignment getAlignment(int r7, boolean r8) {
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.reflect.Field r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 35: {
                    th = $ex1;
                    if ($ON_THROW_TOGGLE == false) { $pc1 = 39; continue $sw1; }
                    abcd.wu.j6(th, -4201092629835051187L, null, new java.lang.Integer(r7), new java.lang.Boolean(r8));
                    $pc1 = 39; continue $sw1;
                }
                case 39: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if ($ON_ENTER_TOGGLE == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-4201092629835051187L, null, new java.lang.Integer(r7), new java.lang.Boolean(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 35; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r8 == false) { $pc1 = 8; continue $sw1; }
                    r2 = 7;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (r8 == false) { $pc1 = 11; continue $sw1; }
                    r3 = 0;
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    r4 = (r2 & r7) >> r3;
                    if (r4 == 1) { $pc1 = 34; continue $sw1; }
                    if (r4 != 3) { $pc1 = 17; continue $sw1; }
                    if (r8 == false) { $pc1 = 32; continue $sw1; }
                    return android.widget.GridLayout.LEFT;
                }
                case 32: {
                    return android.widget.GridLayout.TOP;
                }
                case 17: {
                    if (r4 == 5) { $pc1 = 25; continue $sw1; }
                    if (r4 == 7) { $pc1 = 24; continue $sw1; }
                    try {
                        r0 = android.widget.GridLayout.class.getDeclaredField("UNDEFINED_ALIGNMENT");
                        r0.setAccessible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 21; continue $sw1;
                    }
                    return (android.widget.GridLayout.Alignment) r0.get(null);
                }
                case 22: {
                    return android.widget.GridLayout.CENTER;
                }
                case 24: {
                    return android.widget.GridLayout.FILL;
                }
                case 25: {
                    if (r8 == false) { $pc1 = 28; continue $sw1; }
                    return android.widget.GridLayout.RIGHT;
                }
                case 28: {
                    return android.widget.GridLayout.BOTTOM;
                }
                case 34: {
                    return android.widget.GridLayout.CENTER;
                }
                case 11: {
                    r3 = 4;
                    { $pc1 = 12; continue $sw1; }
                }
                case 8: {
                    r2 = 112;
                    { $pc1 = 9; continue $sw1; }
                }
                case 21: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3049136925501491865L)
    private void updateSpecs() {
        android.widget.GridLayout.LayoutParams r2 = null;
        android.widget.GridLayout.LayoutParams r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if ($ON_THROW_TOGGLE == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 2587538496136358523L, this);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(2587538496136358523L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r2 = this.params;
                        r2.columnSpec = android.widget.GridLayout.spec(this.column, this.columnSpan, getAlignment(this.gravity, true));
                        r3 = this.params;
                        r3.rowSpec = android.widget.GridLayout.spec(this.row, this.rowSpan, getAlignment(this.gravity, false));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setColumn(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if ($ON_THROW_TOGGLE == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -541604021149905175L, this, new java.lang.Integer(r5));
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-541604021149905175L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        this.column = r5;
                        updateSpecs();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setColumnSpan(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if ($ON_THROW_TOGGLE == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 215497799183866665L, this, new java.lang.Integer(r5));
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(215497799183866665L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        this.columnSpan = r5;
                        updateSpecs();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setGravity(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if ($ON_THROW_TOGGLE == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -2292289876693872069L, this, new java.lang.Integer(r5));
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-2292289876693872069L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        this.gravity = r5;
                        updateSpecs();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setRow(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if ($ON_THROW_TOGGLE == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, -45032572400686827L, this, new java.lang.Integer(r5));
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-45032572400686827L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        this.row = r5;
                        updateSpecs();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setRowSpan(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if ($ON_THROW_TOGGLE == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 1723409251806024133L, this, new java.lang.Integer(r5));
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(1723409251806024133L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        this.rowSpan = r5;
                        updateSpecs();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
