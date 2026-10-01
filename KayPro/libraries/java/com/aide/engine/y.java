package com.aide.engine;

@abcd.Interfacexu
public class y implements com.aide.engine.s {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -1520873204300764084L)
    private final boolean FH;

    @abcd.Interfaceru(field = -2981413012288138571L)
    private final java.lang.String Hw;

    @abcd.Interfaceru(field = 138260020958461672L)
    private final java.util.List<com.aide.engine.s> VH;

    @abcd.Interfaceru(field = -1098430244318508924L)
    private final java.lang.String Zo;

    @abcd.Interfaceru(field = 2059369227098108529L)
    private final com.aide.engine.s gn;

    @abcd.Interfaceru(field = -2255612768569473520L)
    private final java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.engine.y.class, -3077738511138984000L, -3077738511138984000L);
    }

    public y(boolean r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.List<com.aide.engine.s> r11, com.aide.engine.s r12) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    abcd.wu.j6(-2480695073251961676L, null, new java.lang.Object[]{new java.lang.Boolean(r7), r8, r9, r10, r11, r12});
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.FH = r7;
                    this.Hw = r8;
                    this.v5 = r9;
                    this.Zo = r10;
                    this.VH = r11;
                    this.gn = r12;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r3 = null;
        java.lang.String r4 = null;
        java.lang.String r0 = null;
        java.util.Iterator<com.aide.engine.s> r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 16: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 21; continue $sw1; }
                    abcd.wu.j6(th, -243976993083577568L, this);
                    $pc1 = 21; continue $sw1;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-243976993083577568L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 16; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r3 = new java.lang.StringBuilder();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 16; continue $sw1;
                    }
                    if (this.FH == false) { $pc1 = 9; continue $sw1; }
                    r4 = "";
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    try {
                        r3.append(r4);
                        r3.append("(");
                        r3.append(this.Hw);
                        r3.append(").");
                        r3.append(this.v5);
                        r3.append("(");
                        r0 = r3.toString();
                        r5 = this.VH.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 16; continue $sw1;
                    }
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    if (r5.hasNext() == false) { $pc1 = 14; continue $sw1; }
                    try {
                        r0 = r0 + r5.next() + ",";
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 16; continue $sw1;
                    }
                    { $pc1 = 12; continue $sw1; }
                }
                case 14: {
                    return r0 + ")";
                }
                case 9: {
                    try {
                        r4 = this.gn + ".";
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 16; continue $sw1;
                    }
                    { $pc1 = 10; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
