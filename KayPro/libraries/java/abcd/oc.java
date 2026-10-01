package abcd;

@abcd.Interfacexu
class oc extends abcd.Abstractpc {

    @abcd.Interfaceuu
    private static boolean Zo;

    @abcd.Interfacetu
    private static boolean v5;

    static {
        abcd.wu.j6(abcd.oc.class, 6961425216133458609L, -362198004114028544L);
    }

    oc() {
    }

    @Override
    @abcd.Interfacesu(method = -665451922478599980L)
    public boolean j6(java.lang.String r8, java.lang.String r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (Zo == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 2838271493419175280L, this, r8, r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (v5 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(2838271493419175280L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    return r8.toLowerCase().endsWith(r9.substring(1, r9.length()).toLowerCase());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
