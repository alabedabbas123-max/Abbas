package com.aide.common;

@abcd.Interfacexu
public class wa {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common.wa.class, 4303922799090801297L, 4303922799090801297L);
    }

    public wa() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 4528397624089618344L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(4528397624089618344L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.Object j6(java.lang.String r7, java.lang.Object r8) {
        java.lang.Object r9 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 10: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 14; continue $sw1; }
                    abcd.wu.j6(th, -3466118415688901700L, null, r7, r8);
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-3466118415688901700L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    if (r7 != null) { $pc1 = 18; continue $sw1; }
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    return r8;
                }
                case 18: {
                    try {
                        r9 = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(com.aide.common.ClassJ.j6(r7))).readObject();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 15; continue $sw1; }
                        $pc1 = 10; continue $sw1;
                    }
                    if (r9 == null) { $pc1 = 9; continue $sw1; }
                    return r9;
                    { $pc1 = 9; continue $sw1; }
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.Object r5) {
        java.io.ByteArrayOutputStream r3 = null;
        java.io.ObjectOutputStream r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 11: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 15; continue $sw2; }
                    abcd.wu.j6(th, 1114976387404153443L, null, r5);
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(1114976387404153443L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r5 != null) { $pc2 = 16; continue $sw2; }
                    return null;
                }
                case 16: {
                    try {
                        r3 = new java.io.ByteArrayOutputStream();
                        r4 = new java.io.ObjectOutputStream(r3);
                        r4.writeObject(r5);
                        r4.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 10; continue $sw2; }
                        $pc2 = 11; continue $sw2;
                    }
                    return new java.lang.String(com.aide.common.ClassJ.j6(r3.toByteArray()));
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
