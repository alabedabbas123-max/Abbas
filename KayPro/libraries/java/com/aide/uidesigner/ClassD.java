package com.aide.uidesigner;

@abcd.Interfacexu
class ClassD implements java.util.Comparator<java.io.File> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassD.class, -2705139259622029791L, 5069638513269065968L);
    }

    ClassD() {
    }

    @Override
    public int compare(java.io.File r1, java.io.File r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 16011194074055168L)
    public int j6(java.io.File r8, java.io.File r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 5530343609321838021L, this, r8, r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(5530343609321838021L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    return r8.getName().compareTo(r9.getName());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
