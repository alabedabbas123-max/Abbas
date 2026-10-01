package com.aide.uidesigner;

@abcd.Interfacexu
public class ClassS extends com.aide.common.ClassN {

    @abcd.Interfacetu
    private static boolean gn;

    @abcd.Interfaceuu
    private static boolean u7;

    @abcd.Interfaceru(field = 224562302322451389L)
    private com.aide.uidesigner.ClassC EQ;

    @abcd.Interfaceru(field = -1894959334754137872L)
    private com.aide.uidesigner.Pa J0;

    @abcd.Interfaceru(field = 2467908523754801685L)
    private com.aide.uidesigner.ClassS J8;

    @abcd.Interfaceru(field = -871566903097814784L)
    private int Ws;

    @abcd.Interfaceru(field = 1728932783690474857L)
    private org.w3c.dom.Element tp;

    @abcd.Interfaceru(field = -3556725367138142672L)
    private com.aide.uidesigner.ClassC we;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassS.class, -706587840109084875L, -706587840109084875L);
    }

    public ClassS(android.content.Context r7, android.view.View r8, org.w3c.dom.Element r9, com.aide.uidesigner.ClassC r10, com.aide.uidesigner.ClassC r11, com.aide.uidesigner.ClassS r12, int r13, com.aide.uidesigner.Pa r14) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (gn == false) { $pc0 = 5; continue $sw0; }
                    abcd.wu.j6(-1628815987762237804L, null, new java.lang.Object[]{r7, r8, r9, r10, r11, r12, new java.lang.Integer(r13), r14});
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    super(r7, r8);
                    this.tp = r9;
                    this.EQ = r10;
                    this.we = r11;
                    this.J0 = r14;
                    this.J8 = r12;
                    this.Ws = r13;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 111422129680084600L)
    private void j6(com.aide.uidesigner.ClassB r8, com.aide.uidesigner.N.a r9) {
        java.lang.String r0 = null;
        java.lang.String r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 10: {
                    th = $ex1;
                    if (u7 == false) { $pc1 = 14; continue $sw1; }
                    abcd.wu.j6(th, -262745760184814144L, this, r8, r9);
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (gn == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-262745760184814144L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        r0 = getViewID();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    if (r0 != null) { $pc1 = 8; continue $sw1; }
                    try {
                        r0 = EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r6 = r0;
                    try {
                        this.J0.j6(getParentView().tp, r8, this.tp, r9, r6);
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

    @abcd.Interfacesu(method = 4149385309121686447L)
    private boolean we() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 15: {
                    th = $ex2;
                    if (u7 == false) { $pc2 = 19; continue $sw2; }
                    abcd.wu.j6(th, 1592452833680740647L, this);
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(1592452833680740647L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (this.EQ != null) { $pc2 = 9; continue $sw2; }
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    return false;
                }
                case 9: {
                    if ((this.EQ.FH instanceof android.view.ViewGroup) == false) { $pc2 = 13; continue $sw2; }
                    if ((this.EQ.FH instanceof android.widget.AdapterView) == true) { $pc2 = 13; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(com.aide.uidesigner.ClassB r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 11: {
                    th = $ex3;
                    if (u7 == false) { $pc3 = 15; continue $sw3; }
                    abcd.wu.j6(th, 521311967931615669L, this, r5);
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc3 = 7; continue $sw3; }
                    try {
                        abcd.wu.j6(521311967931615669L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (getParentView().gn() == false) { $pc3 = 9; continue $sw3; }
                    try {
                        j6(r5, com.aide.uidesigner.N.DW);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    return;
                }
                case 9: {
                    try {
                        this.J0.j6(this.tp, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 13: {
                    th = $ex4;
                    if (u7 == false) { $pc4 = 17; continue $sw4; }
                    abcd.wu.j6(th, -2917501330826488552L, this);
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc4 = 7; continue $sw4; }
                    try {
                        abcd.wu.j6(-2917501330826488552L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (u7() == true) { $pc4 = 11; continue $sw4; }
                    if (getParentView().gn() == false) { $pc4 = 11; continue $sw4; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String EQ() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (u7 == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -1747891648708810256L, this);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-1747891648708810256L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return this.J0.FH(this.tp);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(com.aide.uidesigner.ClassB r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 11: {
                    th = $ex6;
                    if (u7 == false) { $pc6 = 15; continue $sw6; }
                    abcd.wu.j6(th, -4022161658055400264L, this, r5);
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc6 = 7; continue $sw6; }
                    try {
                        abcd.wu.j6(-4022161658055400264L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (getParentView().gn() == false) { $pc6 = 9; continue $sw6; }
                    try {
                        j6(r5, com.aide.uidesigner.N.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    return;
                }
                case 9: {
                    try {
                        this.J0.DW(this.tp, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 9: {
                    th = $ex7;
                    if (u7 == false) { $pc7 = 13; continue $sw7; }
                    abcd.wu.j6(th, -2873787071630574400L, this);
                    $pc7 = 13; continue $sw7;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-2873787071630574400L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 9; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    return !u7();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw(com.aide.uidesigner.ClassB r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (u7 == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, 1158415758373284875L, this, r5);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(1158415758373284875L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        j6(r5, com.aide.uidesigner.N.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 9: {
                    th = $ex9;
                    if (u7 == false) { $pc9 = 13; continue $sw9; }
                    abcd.wu.j6(th, -2868549134115936999L, this);
                    $pc9 = 13; continue $sw9;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(-2868549134115936999L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 9; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    return !u7();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void VH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (u7 == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, -2556865680408999701L, this);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-2556865680408999701L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    try {
                        this.J0.j6(this.tp);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Zo(com.aide.uidesigner.ClassB r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (u7 == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, -3872641062152939447L, this, r5);
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(-3872641062152939447L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    try {
                        this.J0.Hw(this.tp, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Zo() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 8: {
                    th = $ex12;
                    if (u7 == false) { $pc12 = 12; continue $sw12; }
                    abcd.wu.j6(th, 1826432615644948693L, this);
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(1826432615644948693L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    return we();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<java.lang.String> getAllIDs() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (u7 == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, -233750301492986935L, this);
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(-233750301492986935L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    return this.J0.Hw();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<java.lang.String> getAllUserDrawables() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 8: {
                    th = $ex14;
                    if (u7 == false) { $pc14 = 12; continue $sw14; }
                    abcd.wu.j6(th, 5726123150203421175L, this);
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(5726123150203421175L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    return this.J0.v5();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<java.lang.String> getAllUserStyles() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 8: {
                    th = $ex15;
                    if (u7 == false) { $pc15 = 12; continue $sw15; }
                    abcd.wu.j6(th, 5897349360065094236L, this);
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc15 = 6; continue $sw15; }
                    try {
                        abcd.wu.j6(5897349360065094236L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 8; continue $sw15;
                    }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    return this.J0.Zo();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<com.aide.uidesigner.ClassA> getAttributes() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 8: {
                    th = $ex16;
                    if (u7 == false) { $pc16 = 12; continue $sw16; }
                    abcd.wu.j6(th, -4175529149073282717L, this);
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(-4175529149073282717L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    return this.J0.j6(this.EQ, this.we, this.tp);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int getDepth() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 8: {
                    th = $ex17;
                    if (u7 == false) { $pc17 = 12; continue $sw17; }
                    abcd.wu.j6(th, 1013293843477500763L, this);
                    $pc17 = 12; continue $sw17;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(1013293843477500763L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 8; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    return this.Ws;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String getNodeName() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 8: {
                    th = $ex18;
                    if (u7 == false) { $pc18 = 12; continue $sw18; }
                    abcd.wu.j6(th, 526405200586421405L, this);
                    $pc18 = 12; continue $sw18;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc18 = 6; continue $sw18; }
                    try {
                        abcd.wu.j6(526405200586421405L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 8; continue $sw18;
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    return this.tp.getNodeName();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public com.aide.uidesigner.ClassS getParentView() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 4;
        $sw19: while (true) {
            switch ($pc19) {
                case 8: {
                    th = $ex19;
                    if (u7 == false) { $pc19 = 12; continue $sw19; }
                    abcd.wu.j6(th, -1068956617206192667L, this);
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc19 = 6; continue $sw19; }
                    try {
                        abcd.wu.j6(-1068956617206192667L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    return this.J8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String getPath() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 12: {
                    th = $ex20;
                    if (u7 == false) { $pc20 = 16; continue $sw20; }
                    abcd.wu.j6(th, -1394422998855237901L, this);
                    $pc20 = 16; continue $sw20;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc20 = 7; continue $sw20; }
                    try {
                        abcd.wu.j6(-1394422998855237901L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 12; continue $sw20;
                    }
                    $pc20 = 7; continue $sw20;
                }
                case 7: {
                    if (this.J8 == null) { $pc20 = 11; continue $sw20; }
                    return this.J8.getPath() + " > " + getNodeName();
                }
                case 11: {
                    return getNodeName();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int getSourceColumn() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 4;
        $sw21: while (true) {
            switch ($pc21) {
                case 8: {
                    th = $ex21;
                    if (u7 == false) { $pc21 = 12; continue $sw21; }
                    abcd.wu.j6(th, 629531352497565041L, this);
                    $pc21 = 12; continue $sw21;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc21 = 6; continue $sw21; }
                    try {
                        abcd.wu.j6(629531352497565041L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 8; continue $sw21;
                    }
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    return java.lang.Integer.parseInt((java.lang.String) this.tp.getUserData("column"));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int getSourceLine() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 4;
        $sw22: while (true) {
            switch ($pc22) {
                case 8: {
                    th = $ex22;
                    if (u7 == false) { $pc22 = 12; continue $sw22; }
                    abcd.wu.j6(th, -3679638924770922367L, this);
                    $pc22 = 12; continue $sw22;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc22 = 6; continue $sw22; }
                    try {
                        abcd.wu.j6(-3679638924770922367L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 8; continue $sw22;
                    }
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    return java.lang.Integer.parseInt((java.lang.String) this.tp.getUserData("line"));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String getStyle() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 4;
        $sw23: while (true) {
            switch ($pc23) {
                case 8: {
                    th = $ex23;
                    if (u7 == false) { $pc23 = 12; continue $sw23; }
                    abcd.wu.j6(th, 1737418395914239101L, this);
                    $pc23 = 12; continue $sw23;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc23 = 6; continue $sw23; }
                    try {
                        abcd.wu.j6(1737418395914239101L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    $pc23 = 6; continue $sw23;
                }
                case 6: {
                    return this.J0.DW(this.tp);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String getViewID() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 4;
        $sw24: while (true) {
            switch ($pc24) {
                case 8: {
                    th = $ex24;
                    if (u7 == false) { $pc24 = 12; continue $sw24; }
                    abcd.wu.j6(th, 2146379560382166228L, this);
                    $pc24 = 12; continue $sw24;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc24 = 6; continue $sw24; }
                    try {
                        abcd.wu.j6(2146379560382166228L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 8; continue $sw24;
                    }
                    $pc24 = 6; continue $sw24;
                }
                case 6: {
                    return this.J0.j6(this.tp);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean gn() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 4;
        $sw25: while (true) {
            switch ($pc25) {
                case 13: {
                    th = $ex25;
                    if (u7 == false) { $pc25 = 17; continue $sw25; }
                    abcd.wu.j6(th, 5305899016871590800L, this);
                    $pc25 = 17; continue $sw25;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc25 = 7; continue $sw25; }
                    try {
                        abcd.wu.j6(5305899016871590800L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 13; continue $sw25;
                    }
                    $pc25 = 7; continue $sw25;
                }
                case 7: {
                    if (this.EQ == null) { $pc25 = 11; continue $sw25; }
                    if ((this.EQ.FH instanceof android.widget.RelativeLayout) == false) { $pc25 = 11; continue $sw25; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -2336004718696859640L)
    protected void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = 4;
        $sw26: while (true) {
            switch ($pc26) {
                case 8: {
                    th = $ex26;
                    if (u7 == false) { $pc26 = 12; continue $sw26; }
                    abcd.wu.j6(th, -1528670939420321216L, this);
                    $pc26 = 12; continue $sw26;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc26 = 6; continue $sw26; }
                    try {
                        abcd.wu.j6(-1528670939420321216L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 8; continue $sw26;
                    }
                    $pc26 = 6; continue $sw26;
                }
                case 6: {
                    try {
                        this.J0.DW(this);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 8; continue $sw26;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.aide.common.ab<com.aide.uidesigner.ClassS> r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = 4;
        $sw27: while (true) {
            switch ($pc27) {
                case 8: {
                    th = $ex27;
                    if (u7 == false) { $pc27 = 12; continue $sw27; }
                    abcd.wu.j6(th, 1509307065945923040L, this, r5);
                    $pc27 = 12; continue $sw27;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc27 = 6; continue $sw27; }
                    try {
                        abcd.wu.j6(1509307065945923040L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 8; continue $sw27;
                    }
                    $pc27 = 6; continue $sw27;
                }
                case 6: {
                    try {
                        this.J0.j6(this.tp, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 8; continue $sw27;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.aide.uidesigner.XmlLayoutDesignActivity r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 4;
        $sw28: while (true) {
            switch ($pc28) {
                case 8: {
                    th = $ex28;
                    if (u7 == false) { $pc28 = 12; continue $sw28; }
                    abcd.wu.j6(th, -2329136150321508339L, this, r5);
                    $pc28 = 12; continue $sw28;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc28 = 6; continue $sw28; }
                    try {
                        abcd.wu.j6(-2329136150321508339L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 8; continue $sw28;
                    }
                    $pc28 = 6; continue $sw28;
                }
                case 6: {
                    try {
                        r5.j6(getSourceLine(), getSourceColumn());
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 8; continue $sw28;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.aide.uidesigner.ClassA r9, com.aide.uidesigner.ClassS r10, java.lang.String r11) {
        com.aide.uidesigner.Pa r0 = null;
        org.w3c.dom.Element r1 = null;
        com.aide.uidesigner.N.a r2 = null;
        org.w3c.dom.Element r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = 3;
        $sw29: while (true) {
            switch ($pc29) {
                case 11: {
                    th = $ex29;
                    if (u7 == false) { $pc29 = 15; continue $sw29; }
                    abcd.wu.j6(th, 177431308788048107L, this, r9, r10, r11);
                    $pc29 = 15; continue $sw29;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (gn == false) { $pc29 = 5; continue $sw29; }
                    try {
                        abcd.wu.j6(177431308788048107L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 11; continue $sw29;
                    }
                    $pc29 = 5; continue $sw29;
                }
                case 5: {
                    try {
                        r0 = this.J0;
                        r1 = this.tp;
                        r2 = r9.FH;
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 11; continue $sw29;
                    }
                    if (r10 != null) { $pc29 = 8; continue $sw29; }
                    r3 = null;
                    $pc29 = 9; continue $sw29;
                }
                case 9: {
                    try {
                        r0.j6(r1, r2, r3, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 11; continue $sw29;
                    }
                    return;
                }
                case 8: {
                    try {
                        r3 = r10.tp;
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 11; continue $sw29;
                    }
                    { $pc29 = 9; continue $sw29; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.aide.uidesigner.ClassA r8, java.lang.String r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = 3;
        $sw30: while (true) {
            switch ($pc30) {
                case 7: {
                    th = $ex30;
                    if (u7 == false) { $pc30 = 11; continue $sw30; }
                    abcd.wu.j6(th, 1117778902033477729L, this, r8, r9);
                    $pc30 = 11; continue $sw30;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (gn == false) { $pc30 = 5; continue $sw30; }
                    try {
                        abcd.wu.j6(1117778902033477729L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 7; continue $sw30;
                    }
                    $pc30 = 5; continue $sw30;
                }
                case 5: {
                    try {
                        this.J0.j6(this.tp, r8.FH, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 7; continue $sw30;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.aide.uidesigner.ClassB r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = 4;
        $sw31: while (true) {
            switch ($pc31) {
                case 8: {
                    th = $ex31;
                    if (u7 == false) { $pc31 = 12; continue $sw31; }
                    abcd.wu.j6(th, 917907031588883819L, this, r5);
                    $pc31 = 12; continue $sw31;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc31 = 6; continue $sw31; }
                    try {
                        abcd.wu.j6(917907031588883819L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 8; continue $sw31;
                    }
                    $pc31 = 6; continue $sw31;
                }
                case 6: {
                    try {
                        j6(r5, com.aide.uidesigner.N.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 8; continue $sw31;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r8, android.content.Intent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = 3;
        $sw32: while (true) {
            switch ($pc32) {
                case 7: {
                    th = $ex32;
                    if (u7 == false) { $pc32 = 11; continue $sw32; }
                    abcd.wu.j6(th, -2363206505147598096L, this, r8, r9);
                    $pc32 = 11; continue $sw32;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (gn == false) { $pc32 = 5; continue $sw32; }
                    try {
                        abcd.wu.j6(-2363206505147598096L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 7; continue $sw32;
                    }
                    $pc32 = 5; continue $sw32;
                }
                case 5: {
                    try {
                        this.J0.j6(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 7; continue $sw32;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setStyle(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = 4;
        $sw33: while (true) {
            switch ($pc33) {
                case 8: {
                    th = $ex33;
                    if (u7 == false) { $pc33 = 12; continue $sw33; }
                    abcd.wu.j6(th, 971021530899392667L, this, r5);
                    $pc33 = 12; continue $sw33;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc33 = 6; continue $sw33; }
                    try {
                        abcd.wu.j6(971021530899392667L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 8; continue $sw33;
                    }
                    $pc33 = 6; continue $sw33;
                }
                case 6: {
                    try {
                        this.J0.j6(this.tp, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 8; continue $sw33;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setViewID(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = 4;
        $sw34: while (true) {
            switch ($pc34) {
                case 8: {
                    th = $ex34;
                    if (u7 == false) { $pc34 = 12; continue $sw34; }
                    abcd.wu.j6(th, -597241802526823664L, this, r5);
                    $pc34 = 12; continue $sw34;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc34 = 6; continue $sw34; }
                    try {
                        abcd.wu.j6(-597241802526823664L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 8; continue $sw34;
                    }
                    $pc34 = 6; continue $sw34;
                }
                case 6: {
                    try {
                        this.J0.DW(this.tp, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 8; continue $sw34;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String tp() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex35 = null;
        int $pc35 = 4;
        $sw35: while (true) {
            switch ($pc35) {
                case 8: {
                    th = $ex35;
                    if (u7 == false) { $pc35 = 12; continue $sw35; }
                    abcd.wu.j6(th, 56860918993370208L, this);
                    $pc35 = 12; continue $sw35;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc35 = 6; continue $sw35; }
                    try {
                        abcd.wu.j6(56860918993370208L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 8; continue $sw35;
                    }
                    $pc35 = 6; continue $sw35;
                }
                case 6: {
                    return this.J0.QX();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean u7() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex36 = null;
        int $pc36 = 4;
        $sw36: while (true) {
            switch ($pc36) {
                case 8: {
                    th = $ex36;
                    if (u7 == false) { $pc36 = 12; continue $sw36; }
                    abcd.wu.j6(th, 1610904284143631925L, this);
                    $pc36 = 12; continue $sw36;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc36 = 6; continue $sw36; }
                    try {
                        abcd.wu.j6(1610904284143631925L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 8; continue $sw36;
                    }
                    $pc36 = 6; continue $sw36;
                }
                case 6: {
                    return this.tp.getParentNode() instanceof org.w3c.dom.Document;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5(com.aide.uidesigner.ClassB r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex37 = null;
        int $pc37 = 4;
        $sw37: while (true) {
            switch ($pc37) {
                case 8: {
                    th = $ex37;
                    if (u7 == false) { $pc37 = 12; continue $sw37; }
                    abcd.wu.j6(th, 3675099219237646200L, this, r5);
                    $pc37 = 12; continue $sw37;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc37 = 6; continue $sw37; }
                    try {
                        abcd.wu.j6(3675099219237646200L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 8; continue $sw37;
                    }
                    $pc37 = 6; continue $sw37;
                }
                case 6: {
                    try {
                        this.J0.FH(this.tp, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 8; continue $sw37;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex38 = null;
        int $pc38 = 4;
        $sw38: while (true) {
            switch ($pc38) {
                case 13: {
                    th = $ex38;
                    if (u7 == false) { $pc38 = 17; continue $sw38; }
                    abcd.wu.j6(th, -2856060604732147600L, this);
                    $pc38 = 17; continue $sw38;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc38 = 7; continue $sw38; }
                    try {
                        abcd.wu.j6(-2856060604732147600L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 13; continue $sw38;
                    }
                    $pc38 = 7; continue $sw38;
                }
                case 7: {
                    if (u7() == true) { $pc38 = 11; continue $sw38; }
                    if (getParentView().gn() == false) { $pc38 = 11; continue $sw38; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
