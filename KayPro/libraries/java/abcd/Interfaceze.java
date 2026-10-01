package abcd;

public interface Interfaceze {

    @abcd.Interfacexu
    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.Interfaceze.a DW = null;
        public static final abcd.Interfaceze.a FH = null;
        public static final abcd.Interfaceze.a Hw = null;

        @abcd.Interfaceuu
        private static boolean VH;

        @abcd.Interfacetu
        private static boolean Zo;
        public static final abcd.Interfaceze.a j6 = null;
        private static final abcd.Interfaceze.a[] v5 = null;



        @abcd.Interfacesu(method = -21109671708643977L)
        private a(java.lang.String r8, int r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 7: {
                        th = $ex0;
                        if (VH == false) { $pc0 = 11; continue $sw0; }
                        abcd.wu.j6(th, -1469245076757936909L, null, r8, new java.lang.Integer(r9));
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (Zo == false) { $pc0 = 5; continue $sw0; }
                        try {
                            abcd.wu.j6(-1469245076757936909L, null, r8, new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        try {
                            super(r8, r9);
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

        public static abcd.Interfaceze.a valueOf(java.lang.String r5) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 4;
            $sw1: while (true) {
                switch ($pc1) {
                    case 8: {
                        th = $ex1;
                        if (VH == false) { $pc1 = 12; continue $sw1; }
                        abcd.wu.j6(th, -125781036344767424L, null, r5);
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (Zo == false) { $pc1 = 6; continue $sw1; }
                        try {
                            abcd.wu.j6(-125781036344767424L, null, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 8; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        return (abcd.Interfaceze.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Interfaceze.a.values(), r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static abcd.Interfaceze.a[] values() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 4;
            $sw2: while (true) {
                switch ($pc2) {
                    case 8: {
                        th = $ex2;
                        if (VH == false) { $pc2 = 12; continue $sw2; }
                        abcd.wu.j6(th, 438565460104147908L, null);
                        $pc2 = 12; continue $sw2;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (Zo == false) { $pc2 = 6; continue $sw2; }
                        try {
                            abcd.wu.j6(438565460104147908L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 8; continue $sw2;
                        }
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        return (abcd.Interfaceze.a[]) v5.clone();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    abcd.Interfaceze.a Zo();

    int j6();
}
