package com.aide.engine.service;

@abcd.Interfacexu
class h implements com.aide.engine.Interfacea {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.engine.service.m FH;
    final com.aide.engine.service.l Hw;

    static {
        abcd.wu.j6(com.aide.engine.service.h.class, 2006115082471780797L, 1368956332848887277L);
    }

    h(com.aide.engine.service.l r1, com.aide.engine.service.m r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3922418246167969815L)
    public void VH(boolean r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, -2704888140872914048L, this, new java.lang.Boolean(r5));
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 16; continue $sw0; }
                    try {
                        abcd.wu.j6(-2704888140872914048L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    try {
                        this.FH.VH(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof android.os.RemoteException) { $pc0 = 8; continue $sw0; }
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    return;
                }
                case 8: {
                    e = $ex0;
                    try {
                        com.aide.common.ClassH.DW(e);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -2901379604506166601L)
    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 75389976675091700L, this);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 14; continue $sw1; }
                    try {
                        abcd.wu.j6(75389976675091700L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
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
    @abcd.Interfacesu(method = 1573320024123382584L)
    public void j6(java.io.IOException r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 11: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 15; continue $sw2; }
                    abcd.wu.j6(th, -492438592167743455L, this, r5);
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 18; continue $sw2; }
                    try {
                        abcd.wu.j6(-492438592167743455L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    try {
                        this.FH.Zo(r5.getMessage());
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof android.os.RemoteException) { $pc2 = 8; continue $sw2; }
                        $pc2 = 11; continue $sw2;
                    }
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    return;
                }
                case 8: {
                    e = $ex2;
                    try {
                        com.aide.common.ClassH.DW(e);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 552211874479699347L)
    public void j6(java.util.Set<java.lang.String> r8, java.util.Map<java.lang.String, byte[]> r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 6: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 10; continue $sw3; }
                    abcd.wu.j6(th, 5203260692578726488L, this, r8, r9);
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 13; continue $sw3; }
                    try {
                        abcd.wu.j6(5203260692578726488L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 6; continue $sw3;
                    }
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -1783120922091719928L)
    public void j6(java.util.Set<java.lang.String> r9, java.util.Set<java.lang.String> r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 6: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 10; continue $sw4; }
                    abcd.wu.j6(th, -890763423036739021L, this, r9, r10, r11);
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 13; continue $sw4; }
                    try {
                        abcd.wu.j6(-890763423036739021L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 6; continue $sw4;
                    }
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
