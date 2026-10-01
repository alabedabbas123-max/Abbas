package abcd;

class tK extends abcd.AbstractrK {
    private static final java.lang.reflect.Method Hw = null;
    private static final java.lang.reflect.Method v5 = null;

    static {
        Hw = j6(java.io.File.class, "canExecute", new java.lang.Class[0]);
        v5 = j6(java.io.File.class, "setExecutable", new java.lang.Class[]{java.lang.Boolean.TYPE});
    }

    tK() {
    }

    static boolean gn() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (Hw != null) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    if (v5 == null) { $pc0 = 10; continue $sw0; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.reflect.Method j6(java.lang.Class<?> r1, java.lang.String r2, java.lang.Class<?>... r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return r1.getMethod(r2, r3);
                }
                case 5: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean Hw() {
        return false;
    }

    @Override
    public boolean j6(java.io.File r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    return ((java.lang.Boolean) Hw.invoke(r3, null)).booleanValue();
                }
                case 7: {
                    e = $ex2;
                    throw new java.lang.Error(e);
                }
                case 10: {
                    e = $ex2;
                    throw new java.lang.Error(e);
                }
                case 4: {
                    e = $ex2;
                    throw new java.lang.Error(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6(java.io.File r4, boolean r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    return ((java.lang.Boolean) v5.invoke(r4, new java.lang.Object[]{java.lang.Boolean.valueOf(r5)})).booleanValue();
                }
                case 7: {
                    e = $ex3;
                    throw new java.lang.Error(e);
                }
                case 10: {
                    e = $ex3;
                    throw new java.lang.Error(e);
                }
                case 4: {
                    e = $ex3;
                    throw new java.lang.Error(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean v5() {
        return true;
    }
}
