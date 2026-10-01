package com.aide.common;

@abcd.Interfacexu
public class Za extends android.graphics.drawable.Drawable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 530367287756106504L)
    private android.content.Context FH;

    @abcd.Interfaceru(field = 1089982636806485568L)
    private android.graphics.drawable.Drawable Hw;

    @abcd.Interfaceru(field = 1107372641231293568L)
    private java.lang.String[] v5;

    static {
        abcd.wu.j6(com.aide.common.Za.class, 719480879837168673L, 719480879837168673L);
    }

    public Za(android.content.Context r9, int r10, java.lang.String[] r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -707788385893162448L, null, r9, new java.lang.Integer(r10), r11);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-707788385893162448L, null, r9, new java.lang.Integer(r10), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.FH = r9;
                        this.v5 = r11;
                        this.Hw = r9.getResources().getDrawable(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.app.ActionBar r8, int r9, java.lang.String[] r10) {
        android.content.Context r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 10: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 14; continue $sw1; }
                    abcd.wu.j6(th, -6349990907778744920L, null, r8, new java.lang.Integer(r9), r10);
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-6349990907778744920L, null, r8, new java.lang.Integer(r9), r10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        r0 = r8.getThemedContext();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    if (com.aide.common.ClassG.QX(r0) == false) { $pc1 = 8; continue $sw1; }
                    try {
                        r8.setDisplayShowTitleEnabled(true);
                        r8.setIcon(r9);
                        r8.setTitle(r10[0]);
                        r8.setSubtitle(r10[1]);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    return;
                }
                case 8: {
                    try {
                        r8.setDisplayShowTitleEnabled(false);
                        r8.setLogo(new com.aide.common.Za(r0, r9, r10));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void draw(android.graphics.Canvas r9) {
        android.graphics.Paint r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 541004158327237965L, this, r9);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(541004158327237965L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r2 = new android.graphics.Paint();
                        r2.setColor(-13421773);
                        r2.setAntiAlias(true);
                        r2.setTextSize(40.0f);
                        r2.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
                        r9.drawText(this.v5[0], 120.0f, 40.0f, r2);
                        r2.setTextSize(35.0f);
                        r2.setTypeface(android.graphics.Typeface.DEFAULT);
                        r9.drawText(this.v5[1], 120.0f, 90.0f, r2);
                        this.Hw.setBounds(0, 0, 100, 100);
                        this.Hw.draw(r9);
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

    @Override
    public int getIntrinsicHeight() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 5348465685662353408L, this);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 15; continue $sw3; }
                    try {
                        abcd.wu.j6(5348465685662353408L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return 100;
                }
                case 15: {
                    return 100;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int getIntrinsicWidth() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 2281900910868417475L, this);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 15; continue $sw4; }
                    try {
                        abcd.wu.j6(2281900910868417475L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    return 400;
                }
                case 15: {
                    return 400;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int getOpacity() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -1519488372921239203L, this);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 15; continue $sw5; }
                    try {
                        abcd.wu.j6(-1519488372921239203L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return -1;
                }
                case 15: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void setAlpha(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 7: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 11; continue $sw6; }
                    abcd.wu.j6(th, 343205115111904437L, this, new java.lang.Integer(r5));
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 14; continue $sw6; }
                    try {
                        abcd.wu.j6(343205115111904437L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 7; continue $sw6;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void setColorFilter(android.graphics.ColorFilter r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 7: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 11; continue $sw7; }
                    abcd.wu.j6(th, -1514245693360453476L, this, r5);
                    $pc7 = 11; continue $sw7;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 14; continue $sw7; }
                    try {
                        abcd.wu.j6(-1514245693360453476L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 7; continue $sw7;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
