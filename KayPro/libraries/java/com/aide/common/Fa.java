package com.aide.common;

@abcd.Interfacexu
public class Fa extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = -72918645820836816L)
    private java.lang.Runnable EQ;

    @abcd.Interfaceru(field = -2059477075892605824L)
    private boolean J0;

    @abcd.Interfaceru(field = 526748407653482907L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = -1476668194691602173L)
    private com.aide.common.ab<java.lang.String> tp;

    @abcd.Interfaceru(field = 3030110207485413615L)
    private java.lang.String u7;

    @abcd.Interfaceru(field = 2274064310390856345L)
    private android.app.AlertDialog we;

    static {
        abcd.wu.j6(com.aide.common.Fa.class, -6420951009284476296L, -6420951009284476296L);
    }

    public Fa(java.lang.String r10, java.lang.String r11, com.aide.common.ab<java.lang.String> r12, java.lang.Runnable r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 3893062001227811984L, null, r10, r11, r12, r13);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(3893062001227811984L, null, r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.gn = r10;
                        this.u7 = r11;
                        this.tp = r12;
                        this.EQ = r13;
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

    static java.lang.Runnable DW(com.aide.common.Fa r0) {
        return r0.EQ;
    }

    static java.lang.String DW(com.aide.common.Fa r0, java.lang.String r1) {
        return r0.j6(r1);
    }

    @abcd.Interfacesu(method = 854311022255287488L)
    private java.lang.String DW(java.lang.String r6) {
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 24: {
                    th = $ex1;
                    if (VH == false) { $pc1 = 29; continue $sw1; }
                    abcd.wu.j6(th, -573741704658576779L, this, r6);
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(-573741704658576779L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r6.length() == 0) { $pc1 = 22; continue $sw1; }
                    r2 = 0;
                    if (java.lang.Character.isDigit(r6.charAt(0)) == true) { $pc1 = 14; continue $sw1; }
                    if (r6.charAt(0) == '-') { $pc1 = 14; continue $sw1; }
                    return null;
                }
                case 14: {
                    if (r2 >= r6.length()) { $pc1 = 20; continue $sw1; }
                    if (java.lang.Character.isDigit(r6.charAt(r2)) == true) { $pc1 = 19; continue $sw1; }
                    if (r6.charAt(r2) != '-') { $pc1 = 20; continue $sw1; }
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    try {
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    return r6.substring(r2, r6.length());
                }
                case 22: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -6621029045346984135L)
    private void DW(android.widget.SeekBar r8, java.lang.String r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (VH == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, 1198041819787012080L, this, r8, r9);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(1198041819787012080L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        r8.setProgress(java.lang.Math.max(0, java.lang.Math.min(100, FH(r9))));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void DW(com.aide.common.Fa r0, android.widget.SeekBar r1, java.lang.String r2) {
        r0.DW(r1, r2);
    }

    @abcd.Interfacesu(method = -1112348375437288585L)
    private int FH(java.lang.String r7) {
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 18: {
                    th = $ex3;
                    if (VH == false) { $pc3 = 23; continue $sw3; }
                    abcd.wu.j6(th, 1495379695836042936L, this, r7);
                    $pc3 = 23; continue $sw3;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(1495379695836042936L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 18; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    r3 = 0;
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    if (r3 < r7.length()) { $pc3 = 10; continue $sw3; }
                    $pc3 = 25; continue $sw3;
                }
                case 25: {
                    return java.lang.Integer.parseInt(r7.substring(0, r3));
                }
                case 17: {
                    return 0;
                }
                case 10: {
                    if (java.lang.Character.isDigit(r7.charAt(r3)) == true) { $pc3 = 14; continue $sw3; }
                    if (r7.charAt(r3) != '-') { $pc3 = 25; continue $sw3; }
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    r3 = r3 + 1;
                    { $pc3 = 8; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.aide.common.ab FH(com.aide.common.Fa r0) {
        return r0.tp;
    }

    static android.app.AlertDialog Hw(com.aide.common.Fa r0) {
        return r0.we;
    }

    @abcd.Interfacesu(method = -1776586152585643448L)
    private java.lang.String Hw(java.lang.String r6) {
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 10: {
                    th = $ex4;
                    if (VH == false) { $pc4 = 14; continue $sw4; }
                    abcd.wu.j6(th, 1045010856604870935L, this, r6);
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(1045010856604870935L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 10; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        r2 = DW(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 10; continue $sw4;
                    }
                    if (r2 == null) { $pc4 = 17; continue $sw4; }
                    return (FH(r6) + 1) + r2;
                }
                case 17: {
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1409482166785352559L)
    private java.lang.String j6(android.widget.SeekBar r8, java.lang.String r9) {
        java.lang.String r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 10: {
                    th = $ex5;
                    if (VH == false) { $pc5 = 14; continue $sw5; }
                    abcd.wu.j6(th, -3706177497023204184L, this, r8, r9);
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(-3706177497023204184L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 10; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    try {
                        r0 = DW(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 10; continue $sw5;
                    }
                    if (r0 != null) { $pc5 = 8; continue $sw5; }
                    r0 = "";
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    return r8.getProgress() + r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(com.aide.common.Fa r0, android.widget.SeekBar r1, java.lang.String r2) {
        return r0.j6(r1, r2);
    }

    static java.lang.String j6(com.aide.common.Fa r0, java.lang.String r1) {
        return r0.Hw(r1);
    }

    @abcd.Interfacesu(method = 1125999168538804308L)
    private java.lang.String j6(java.lang.String r6) {
        java.lang.String r2 = null;
        java.lang.StringBuilder r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 10: {
                    th = $ex6;
                    if (VH == false) { $pc6 = 14; continue $sw6; }
                    abcd.wu.j6(th, 173761071234035681L, this, r6);
                    $pc6 = 14; continue $sw6;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(173761071234035681L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 10; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        r2 = DW(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 10; continue $sw6;
                    }
                    if (r2 == null) { $pc6 = 17; continue $sw6; }
                    try {
                        r3 = new java.lang.StringBuilder();
                        r3.append(FH(r6) - 1);
                        r3.append(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 10; continue $sw6;
                    }
                    return r3.toString();
                }
                case 17: {
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(com.aide.common.Fa r0) {
        return r0.J0;
    }

    static boolean j6(com.aide.common.Fa r0, boolean r1) {
        r0.J0 = r1;
        return r1;
    }

    @Override
    @abcd.Interfacesu(method = -83764276660784727L)
    protected android.app.Dialog j6(android.app.Activity r9) {
        android.view.View r2 = null;
        android.widget.EditText r3 = null;
        android.widget.SeekBar r4 = null;
        android.app.AlertDialog.Builder r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 11: {
                    th = $ex7;
                    if (VH == false) { $pc7 = 15; continue $sw7; }
                    abcd.wu.j6(th, 312834692866214584L, this, r9);
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(312834692866214584L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        r2 = android.view.LayoutInflater.from(r9).inflate(com.aide.ui.Oa.designer_sizedialog, null);
                        r3 = (android.widget.EditText) r2.findViewById(com.aide.ui.Na.designersizedialogEditText);
                        r3.setText(this.u7);
                        r4 = (android.widget.SeekBar) r2.findViewById(com.aide.ui.Na.designersizedialogSeekBar);
                        r4.setMax(100);
                        DW(r4, this.u7);
                        r4.setOnSeekBarChangeListener(new com.aide.common.xa(this, r3, r4));
                        r3.addTextChangedListener(new com.aide.common.ya(this, r4, r3));
                        ((android.widget.TextView) r2.findViewById(com.aide.ui.Na.designersizedialogPlusButton)).setOnClickListener(new com.aide.common.ViewOnClickListenerza(this, r3, r4));
                        ((android.widget.TextView) r2.findViewById(com.aide.ui.Na.designersizedialogMinusButton)).setOnClickListener(new com.aide.common.Aa(this, r3, r4));
                        r5 = new android.app.AlertDialog.Builder(r9);
                        r5.setView(r2).setCancelable(true).setPositiveButton(17039370, new com.aide.common.Da(this, r9, r3)).setNegativeButton(17039360, new com.aide.common.Ca(this, r9, r3)).setNeutralButton(com.almlkaide.kaypro.R.string.dialog_bt_none, new com.aide.common.Ba(this, r9, r3));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    if (this.gn == null) { $pc7 = 9; continue $sw7; }
                    try {
                        r5.setTitle(this.gn);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    try {
                        this.we = r5.create();
                        r3.setOnEditorActionListener(new com.aide.common.Ea(this, r9, r3));
                        this.we.setCanceledOnTouchOutside(true);
                        this.we.getWindow().setSoftInputMode(2);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    return this.we;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
