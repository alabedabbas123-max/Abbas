package com.aide.engine;

@abcd.Interfacexu
public class x implements com.aide.engine.s {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 99165816560974272L)
    private final boolean FH;

    @abcd.Interfaceru(field = -170320190808196716L)
    private final boolean Hw;

    @abcd.Interfaceru(field = -1061912428789299759L)
    private final com.aide.engine.s VH;

    @abcd.Interfaceru(field = 3363066909263371761L)
    private final java.lang.String Zo;

    @abcd.Interfaceru(field = 1702402661245362377L)
    private final java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.engine.x.class, 7418598902998530225L, 7418598902998530225L);
    }

    public x(boolean r11, boolean r12, java.lang.String r13, java.lang.String r14, com.aide.engine.s r15) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -1357907814218154240L, null, new java.lang.Boolean(r11), new java.lang.Boolean(r12), r13, r14, r15);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-1357907814218154240L, null, new java.lang.Boolean(r11), new java.lang.Boolean(r12), r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.FH = r11;
                        this.Hw = r12;
                        this.v5 = r13;
                        this.Zo = r14;
                        this.VH = r15;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 12: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 16; continue $sw1; }
                    abcd.wu.j6(th, 3476766796497400048L, this);
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(3476766796497400048L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r2 = new java.lang.StringBuilder();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    if (this.FH == false) { $pc1 = 9; continue $sw1; }
                    r3 = "";
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    try {
                        r2.append(r3);
                        r2.append("(");
                        r2.append(this.v5);
                        r2.append(").");
                        r2.append(this.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    return r2.toString();
                }
                case 9: {
                    try {
                        r3 = this.VH + ".";
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    { $pc1 = 10; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
