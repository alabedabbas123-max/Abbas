package com.aide.uidesigner;

@abcd.Interfacexu
public class ClassB {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.lang.String FH;
    public java.util.Map<java.lang.String, java.lang.String> Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassB.class, -3736683392650432837L, -3736683392650432837L);
    }

    public ClassB(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -700862474932712448L, null, r8, r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-700862474932712448L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.FH = r8;
                        this.Hw = r9;
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
}
