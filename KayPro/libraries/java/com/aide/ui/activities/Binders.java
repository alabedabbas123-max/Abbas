package com.aide.ui.activities;

@abcd.Interfacexu
class Binders extends com.aide.engine.service.r.a {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfacevu
    final com.aide.ui.activities.GotoBrowserActivity v5;

    static {
        abcd.wu.j6(com.aide.ui.activities.Binders.class, -667729815873843261L, 3104761253864004480L);
    }

    Binders(com.aide.ui.activities.GotoBrowserActivity r1) {
        this.v5 = r1;
    }

    @Override
    @abcd.Interfacesu(method = 5309698220497313201L)
    public void Hw(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (Hw == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -804868531923086595L, this, r5);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-804868531923086595L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.v5.runOnUiThread(new com.aide.ui.activities.Runnablep(this));
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

    @Override
    @abcd.Interfacesu(method = -1952466175485904680L)
    public void j6(com.aide.engine.SourceEntity r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (Hw == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -1674852924305127600L, this, r5);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-1674852924305127600L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.v5.runOnUiThread(new com.aide.ui.activities.r(this, r5));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -2736941365033543083L)
    public void j6(java.lang.String r8, java.util.List r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (Hw == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, -4856570968139944599L, this, r8, r9);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-4856570968139944599L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        this.v5.runOnUiThread(new com.aide.ui.activities.Runnableq(this, r9, r8));
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
}
