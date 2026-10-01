package abcd;

public final class Hx {
    private static final int DW = 0;
    private static final abcd.Ix j6 = null;

    static final class a extends abcd.Ix {
        a() {
        }

        @Override
        public final void j6(java.lang.Throwable r1, java.lang.Throwable r2) {
        }
    }

    static {
        int r0 = 0;
        java.lang.Integer r1 = null;
        java.io.PrintStream r3 = null;
        java.lang.String r4 = null;
        java.lang.StringBuilder r6 = null;
        abcd.Ix r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 1;
                    try {
                        r1 = j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    if (r1 == null) { $pc0 = 9; continue $sw0; }
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    th = th;
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    r3 = java.lang.System.err;
                    r4 = abcd.Hx.a.class.getName();
                    r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 132);
                    r6.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
                    r6.append(r4);
                    r6.append("will be used. The error is: ");
                    r3.println(r6.toString());
                    th.printStackTrace(java.lang.System.err);
                    r2 = new abcd.Hx.a();
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    j6 = r2;
                    if (r1 == null) { $pc0 = 22; continue $sw0; }
                    r0 = r1.intValue();
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    DW = r0;
                    return;
                }
                case 6: {
                    if (r1.intValue() < 19) { $pc0 = 9; continue $sw0; }
                    try {
                        r2 = new abcd.Mx();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if ((!java.lang.Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) == false) { $pc0 = 11; continue $sw0; }
                    try {
                        r2 = new abcd.Lx();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    { $pc0 = 24; continue $sw0; }
                }
                case 11: {
                    try {
                        r2 = new abcd.Hx.a();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    th = th;
                    r1 = null;
                    { $pc0 = 17; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.Integer j6() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return (java.lang.Integer) java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                }
                case 5: {
                    e = $ex1;
                    java.lang.System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                    e.printStackTrace(java.lang.System.err);
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.Throwable r1, java.lang.Throwable r2) {
        j6.j6(r1, r2);
    }
}
