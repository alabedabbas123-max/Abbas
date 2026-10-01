package com.aide.uidesigner;

@abcd.Interfacexu
class Na extends android.widget.BaseExpandableListAdapter {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.uidesigner.Pa FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.Na.class, -1505387028266607057L, 1578126810207181311L);
    }

    Na(com.aide.uidesigner.Pa r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 982916760897295677L)
    public java.lang.Object getChild(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 3812158390644098649L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 14; continue $sw0; }
                    try {
                        abcd.wu.j6(3812158390644098649L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return null;
                }
                case 14: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -2455592382232554624L)
    public long getChildId(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 156678578588808L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 14; continue $sw1; }
                    try {
                        abcd.wu.j6(156678578588808L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return 0;
                }
                case 14: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -2227456186571250175L)
    public android.view.View getChildView(int r11, int r12, boolean r13, android.view.View r14, android.view.ViewGroup r15) {
        android.view.View r1 = null;
        android.widget.TextView r2 = null;
        java.lang.StringBuilder r3 = null;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 11: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 15; continue $sw2; }
                    abcd.wu.j6(th, 1370934711070881999L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Boolean(r13), r14, r15);
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(1370934711070881999L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Boolean(r13), r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r14 != null) { $pc2 = 8; continue $sw2; }
                    try {
                        r1 = android.view.LayoutInflater.from(com.aide.uidesigner.Pa.DW(this.FH)).inflate(17367047, r15, false);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    try {
                        r2 = (android.widget.TextView) r1.findViewById(16908308);
                        r3 = new java.lang.StringBuilder();
                        r3.append("Item ");
                        r4 = r12 + 1;
                        r3.append(r4);
                        r2.setText(r3.toString());
                        ((android.widget.TextView) r1.findViewById(16908309)).setText("Item " + r4);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    return r1;
                }
                case 8: {
                    r1 = r14;
                    { $pc2 = 9; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -4982255037806816224L)
    public int getChildrenCount(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -3742943147527237168L, this, new java.lang.Integer(r5));
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 15; continue $sw3; }
                    try {
                        abcd.wu.j6(-3742943147527237168L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return 2;
                }
                case 15: {
                    return 2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -913490219873276773L)
    public java.lang.Object getGroup(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -128065633659257303L, this, new java.lang.Integer(r5));
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 15; continue $sw4; }
                    try {
                        abcd.wu.j6(-128065633659257303L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    return null;
                }
                case 15: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -5495115976507608203L)
    public int getGroupCount() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, 4796115743598909483L, this);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 15; continue $sw5; }
                    try {
                        abcd.wu.j6(4796115743598909483L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return 30;
                }
                case 15: {
                    return 30;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -895106342997241056L)
    public long getGroupId(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 44237693808139780L, this, new java.lang.Integer(r5));
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 7; continue $sw6; }
                    try {
                        abcd.wu.j6(44237693808139780L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -3540904556454270291L)
    public android.view.View getGroupView(int r10, boolean r11, android.view.View r12, android.view.ViewGroup r13) {
        android.view.View r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 10: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 14; continue $sw7; }
                    abcd.wu.j6(th, 5110418311299742197L, this, new java.lang.Integer(r10), new java.lang.Boolean(r11), r12, r13);
                    $pc7 = 14; continue $sw7;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 5; continue $sw7; }
                    try {
                        abcd.wu.j6(5110418311299742197L, this, new java.lang.Integer(r10), new java.lang.Boolean(r11), r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    if (r12 != null) { $pc7 = 7; continue $sw7; }
                    try {
                        r0 = android.view.LayoutInflater.from(com.aide.uidesigner.Pa.DW(this.FH)).inflate(17367046, r13, false);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    try {
                        ((android.widget.TextView) r0.findViewById(16908308)).setText("Group " + (r10 + 1));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    return r0;
                }
                case 7: {
                    r0 = r12;
                    { $pc7 = 8; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 4655885736357998472L)
    public boolean hasStableIds() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, 3357678628057742380L, this);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 15; continue $sw8; }
                    try {
                        abcd.wu.j6(3357678628057742380L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    return true;
                }
                case 15: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -35363442974433009L)
    public boolean isChildSelectable(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 7: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 11; continue $sw9; }
                    abcd.wu.j6(th, 8449732978807418109L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc9 = 14; continue $sw9; }
                    try {
                        abcd.wu.j6(8449732978807418109L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 7; continue $sw9;
                    }
                    return true;
                }
                case 14: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
