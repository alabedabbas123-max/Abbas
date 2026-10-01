package com.aide.ui;

@abcd.Interfacexu
class Binderd extends com.aide.engine.service.o.a {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfacevu
    final com.aide.ui.ClassJ Zo;

    @abcd.Interfaceru(field = -2520756610768463740L)
    private java.util.List<com.aide.engine.SourceEntity> v5;

    static {
        abcd.wu.j6(com.aide.ui.Binderd.class, 1778539205842150985L, -7057479416484808744L);
    }

    Binderd(com.aide.ui.ClassJ r1) {
        this.Zo = r1;
        this.v5 = new java.util.ArrayList();
    }

    @Override
    @abcd.Interfacesu(method = 1159331326330560675L)
    public void Hw(java.util.List r6) {
        java.util.Iterator r2 = null;
        com.aide.engine.SourceEntity r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 16: {
                    th = $ex0;
                    if (Hw == false) { $pc0 = 21; continue $sw0; }
                    abcd.wu.j6(th, 2859758183347652895L, this, r6);
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2859758183347652895L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = r6.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc0 = 15; continue $sw0; }
                    try {
                        r3 = (com.aide.engine.SourceEntity) r2.next();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    if (com.aide.ui.ClassJ.j6(this.Zo) == true) { $pc0 = 13; continue $sw0; }
                    if (r3.j3() == true) { $pc0 = 7; continue $sw0; }
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    try {
                        this.v5.add(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    { $pc0 = 7; continue $sw0; }
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 167240921394471565L)
    public void j6(java.lang.String r10, long r11, int r13, int r14) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 9: {
                    th = $ex1;
                    if (Hw == false) { $pc1 = 13; continue $sw1; }
                    abcd.wu.j6(th, 917661025685274759L, this, r10, new java.lang.Long(r11), new java.lang.Integer(r13), new java.lang.Integer(r14));
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(917661025685274759L, this, r10, new java.lang.Long(r11), new java.lang.Integer(r13), new java.lang.Integer(r14));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 9; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r10.equals(com.aide.ui.U.er().DW()) == false) { $pc1 = 16; continue $sw1; }
                    try {
                        com.aide.ui.U.j6(new com.aide.ui.RunnableC1727a(this));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 9; continue $sw1;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 4911125035837846176L)
    public void j6(java.lang.String r6, long r7, int r9, int r10, int r11, com.aide.engine.SourceEntity r12, java.lang.String r13) {
        java.util.List<com.aide.engine.SourceEntity> r8 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (FH == false) { $pc2 = 6; continue $sw2; }
                    abcd.wu.j6(372754244901186504L, this, new java.lang.Object[]{r6, new java.lang.Long(r7), new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11), r12, r13});
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r6.equals(com.aide.ui.U.er().DW()) == true) { $pc2 = 8; continue $sw2; }
                    return;
                }
                case 8: {
                    if (r7 == com.aide.ui.U.er().FH()) { $pc2 = 10; continue $sw2; }
                    return;
                }
                case 10: {
                    if (this.v5.size() >= 1000) { $pc2 = 12; continue $sw2; }
                    java.util.Collections.sort(this.v5, new com.aide.ui.ClassB(this));
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    r8 = this.v5;
                    this.v5 = null;
                    com.aide.ui.U.j6(new com.aide.ui.RunnableC1779c(this, r9, r11, r8));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 1424925237601204352L)
    public void k2() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (Hw == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -1916804816764552296L, this);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-1916804816764552296L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        this.v5 = new java.util.ArrayList();
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
}
