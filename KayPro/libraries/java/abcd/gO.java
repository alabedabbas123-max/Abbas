package abcd;

class gO {
    static abcd.HL j6(java.util.List r2) {
        abcd.rL r0 = null;
        java.util.Iterator r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new abcd.rL();
                    r3 = r2.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    r0.j6((abcd.InterfaceqL) r3.next());
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    return new abcd.WL(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.io.OutputStream j6(java.io.OutputStream r0) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r0 == null) { $pc1 = 4; continue $sw1; }
                    return r0;
                }
                case 4: {
                    return new abcd.jO();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.io.OutputStream j6(java.io.OutputStream r1, java.io.OutputStream r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r1 == null) { $pc2 = 8; continue $sw2; }
                    if (r2 != null) { $pc2 = 7; continue $sw2; }
                    return j6(r1);
                }
                case 7: {
                    return new abcd.YP(r1, r2);
                }
                case 8: {
                    return j6(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.io.OutputStream j6(java.util.Collection r1, java.io.OutputStream r2) {
        java.util.Iterator r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r3 = r1.iterator();
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc3 = 5; continue $sw3; }
                    r2 = j6(r2, ((abcd.kO) r3.next()).DW());
                    { $pc3 = 4; continue $sw3; }
                }
                case 5: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.security.Provider j6(java.lang.String r3) {
        java.security.Provider r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r3 == null) { $pc4 = 8; continue $sw4; }
                    r0 = java.security.Security.getProvider(r3);
                    if (r0 == null) { $pc4 = 7; continue $sw4; }
                    return r0;
                }
                case 7: {
                    throw new java.security.NoSuchProviderException("provider " + r3 + " not found.");
                }
                case 8: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.util.List j6(abcd.SP r2) {
        java.util.ArrayList r0 = null;
        java.util.Iterator r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.util.ArrayList();
                    try {
                        r3 = r2.j6(null).iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.ClassCastException) { $pc5 = 9; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    if (r3.hasNext() == false) { $pc5 = 6; continue $sw5; }
                    try {
                        r0.add(((abcd.SN) r3.next()).j6());
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.ClassCastException) { $pc5 = 9; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc5 = 5; continue $sw5; }
                }
                case 6: {
                    return r0;
                }
                case 9: {
                    e = $ex5;
                    throw new abcd.XN("error processing certs", e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
