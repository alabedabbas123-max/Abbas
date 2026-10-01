package com.aide.common;

@abcd.Interfacexu
class I implements com.aide.common.ab<java.util.List<java.lang.Integer>> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.common.ab FH;
    final java.util.List Hw;

    static {
        abcd.wu.j6(com.aide.common.I.class, 5024868934807443193L, 6163089110917039588L);
    }

    I(com.aide.common.ab r1, java.util.List r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    public void j6(java.util.List<java.lang.Integer> r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = -7576421390331842895L)
    public void j62(java.util.List<java.lang.Integer> r7) {
        java.lang.String r2 = null;
        java.util.Iterator<java.lang.Integer> r3 = null;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 18: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 23; continue $sw0; }
                    abcd.wu.j6(th, 1553030859183131929L, this, r7);
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(1553030859183131929L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 18; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r7.size() != 0) { $pc0 = 9; continue $sw0; }
                    try {
                        this.FH.j6(null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 18; continue $sw0;
                    }
                    return;
                }
                case 9: {
                    r2 = "";
                    try {
                        r3 = r7.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 18; continue $sw0;
                    }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    if (r3.hasNext() == false) { $pc0 = 16; continue $sw0; }
                    try {
                        r4 = r3.next().intValue();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 18; continue $sw0;
                    }
                    if (r2.length() <= 0) { $pc0 = 15; continue $sw0; }
                    try {
                        r2 = r2 + "|";
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 18; continue $sw0;
                    }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    try {
                        r2 = r2 + ((java.lang.String) this.Hw.get(r4));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 18; continue $sw0;
                    }
                    { $pc0 = 11; continue $sw0; }
                }
                case 16: {
                    try {
                        this.FH.j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 18; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
