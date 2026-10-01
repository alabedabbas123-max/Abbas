package com.aide.ui.views;

@abcd.Interfacexu
public class CompletionListView extends com.aide.ui.views.CustomKeysListView {

    @abcd.Interfacetu
    private static boolean Hw;

    @abcd.Interfaceuu
    private static boolean v5;

    @abcd.Interfaceru(field = 2045108703843522643L)
    private com.aide.common.KeyStrokeDetector.a VH;

    @abcd.Interfaceru(field = 1982564770279018035L)
    private com.aide.common.KeyStrokeDetector Zo;

    static {
        abcd.wu.j6(com.aide.ui.views.CompletionListView.class, 85373884122756255L, 85373884122756255L);
    }

    public CompletionListView(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (v5 == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1012263937666637019L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Hw == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1012263937666637019L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        super(r6);
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

    public CompletionListView(android.content.Context r8, android.util.AttributeSet r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (v5 == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, -8763854125042118644L, null, r8, r9);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Hw == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-8763854125042118644L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        super(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public CompletionListView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (v5 == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, -1619114962724624595L, null, r9, r10, new java.lang.Integer(r11));
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Hw == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-1619114962724624595L, null, r9, r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        super(r9, r10, r11);
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

    @Override
    public boolean onCheckIsTextEditor() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 11: {
                    th = $ex3;
                    if (v5 == false) { $pc3 = 15; continue $sw3; }
                    abcd.wu.j6(th, 5402945009408630112L, this);
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Hw == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(5402945009408630112L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (this.Zo == null) { $pc3 = 9; continue $sw3; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 12: {
                    th = $ex4;
                    if (v5 == false) { $pc4 = 16; continue $sw4; }
                    abcd.wu.j6(th, -507097421382997161L, this, r5);
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Hw == false) { $pc4 = 7; continue $sw4; }
                    try {
                        abcd.wu.j6(-507097421382997161L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (com.aide.common.ClassG.Ws(getContext()) == false) { $pc4 = 9; continue $sw4; }
                    try {
                        r5.imeOptions = 1073741825;
                        r5.inputType = 131217;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    return this.Zo.j6(this, this.VH);
                }
                case 9: {
                    try {
                        r5.imeOptions = 1073741825;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    { $pc4 = 10; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onKeyDown(int r8, android.view.KeyEvent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 27: {
                    th = $ex5;
                    if (v5 == false) { $pc5 = 31; continue $sw5; }
                    abcd.wu.j6(th, 61320235065127605L, this, new java.lang.Integer(r8), r9);
                    $pc5 = 31; continue $sw5;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Hw == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(61320235065127605L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 27; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    if (r8 == 19) { $pc5 = 26; continue $sw5; }
                    if (r8 == 20) { $pc5 = 26; continue $sw5; }
                    if (r8 == 23) { $pc5 = 26; continue $sw5; }
                    if (r8 == 66) { $pc5 = 26; continue $sw5; }
                    if (r8 == 96) { $pc5 = 26; continue $sw5; }
                    if (r8 == 92) { $pc5 = 26; continue $sw5; }
                    if (r8 == 93) { $pc5 = 26; continue $sw5; }
                    if (r8 == 122) { $pc5 = 26; continue $sw5; }
                    if (r8 == 123) { $pc5 = 26; continue $sw5; }
                    return super.onKeyDown(r8, r9);
                }
                case 26: {
                    return j6(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onKeyUp(int r8, android.view.KeyEvent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 27: {
                    th = $ex6;
                    if (v5 == false) { $pc6 = 31; continue $sw6; }
                    abcd.wu.j6(th, 3286524981524102004L, this, new java.lang.Integer(r8), r9);
                    $pc6 = 31; continue $sw6;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Hw == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(3286524981524102004L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 27; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (r8 == 19) { $pc6 = 26; continue $sw6; }
                    if (r8 == 20) { $pc6 = 26; continue $sw6; }
                    if (r8 == 23) { $pc6 = 26; continue $sw6; }
                    if (r8 == 66) { $pc6 = 26; continue $sw6; }
                    if (r8 == 96) { $pc6 = 26; continue $sw6; }
                    if (r8 == 92) { $pc6 = 26; continue $sw6; }
                    if (r8 == 93) { $pc6 = 26; continue $sw6; }
                    if (r8 == 122) { $pc6 = 26; continue $sw6; }
                    if (r8 == 123) { $pc6 = 26; continue $sw6; }
                    return super.onKeyUp(r8, r9);
                }
                case 26: {
                    return DW(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setKeyStrokeDetector(com.aide.common.KeyStrokeDetector r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (v5 == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, -5549793282224567904L, this, r5);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Hw == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-5549793282224567904L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        this.Zo = r5;
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

    public void setKeyStrokeHandler(com.aide.common.KeyStrokeDetector.a r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (v5 == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, 5792652026469602632L, this, r5);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Hw == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(5792652026469602632L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        this.VH = r5;
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
}
