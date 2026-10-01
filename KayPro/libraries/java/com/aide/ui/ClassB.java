package com.aide.ui;

@abcd.Interfacexu
class ClassB implements java.util.Comparator<com.aide.engine.SourceEntity> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.Binderd FH;

    static {
        abcd.wu.j6(com.aide.ui.ClassB.class, 1778539205842150985L, -179235748457578440L);
    }

    ClassB(com.aide.ui.Binderd r1) {
        this.FH = r1;
    }

    @Override
    public int compare(com.aide.engine.SourceEntity r1, com.aide.engine.SourceEntity r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 1020758115910731345L)
    public int j6(com.aide.engine.SourceEntity r8, com.aide.engine.SourceEntity r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -5702188855058932111L, this, r8, r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-5702188855058932111L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    return r8.we().toLowerCase().compareTo(r9.we().toLowerCase());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
