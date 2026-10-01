package com.aide.uidesigner;

@abcd.Interfacexu
public class ClassC {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.lang.Object FH;

    @abcd.Interfaceru(field = 5111116989851028860L)
    private java.util.Map<java.lang.Class<?>, java.lang.Object> Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassC.class, 2256145217945788433L, 2256145217945788433L);
    }

    public ClassC(java.lang.Object r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1580482911114830853L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1580482911114830853L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.Hw = new java.util.HashMap();
                        this.FH = r6;
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

    public void j6(com.aide.uidesigner.N.a r8, java.lang.Object r9) {
        java.lang.Object r0 = null;
        java.lang.Class<?> r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 20: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 24; continue $sw1; }
                    abcd.wu.j6(th, 464675855987012964L, this, r8, r9);
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(464675855987012964L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 20; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    if (r9 != null) { $pc1 = 26; continue $sw1; }
                    return;
                }
                case 26: {
                    try {
                        r0 = this.FH;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 25; continue $sw1;
                    }
                    if (r8.v5 == null) { $pc1 = 13; continue $sw1; }
                    try {
                        r0 = this.Hw.get(r8.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 25; continue $sw1;
                    }
                    if (r0 != null) { $pc1 = 13; continue $sw1; }
                    try {
                        r0 = r8.v5.getConstructor(new java.lang.Class[]{java.lang.Object.class}).newInstance(new java.lang.Object[]{this.FH});
                        this.Hw.put(r8.v5, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 25; continue $sw1;
                    }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    if (r8.Hw.endsWith("()") == false) { $pc1 = 18; continue $sw1; }
                    try {
                        r1 = r8.VH.Mr;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 25; continue $sw1;
                    }
                    if (r1 != java.lang.Enum.class) { $pc1 = 17; continue $sw1; }
                    try {
                        r1 = r8.gn;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 25; continue $sw1;
                    }
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    try {
                        r0.getClass().getMethod(r8.Hw.substring(0, r8.Hw.length() - 2), new java.lang.Class[]{r1}).invoke(r0, new java.lang.Object[]{r9});
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 25; continue $sw1;
                    }
                    return;
                }
                case 18: {
                    try {
                        r0.getClass().getField(r8.Hw).set(r0, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 25; continue $sw1;
                    }
                    return;
                }
                case 25: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(com.aide.uidesigner.N.a r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 13: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 17; continue $sw2; }
                    abcd.wu.j6(th, -455720109614450317L, this, r5);
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(-455720109614450317L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r5.FH == null) { $pc2 = 11; continue $sw2; }
                    if (r5.FH.isInstance(this.FH) == false) { $pc2 = 11; continue $sw2; }
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
