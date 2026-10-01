package com.crashlytics.android.answers;

class n implements abcd.Interfaceyz {
    private final com.crashlytics.android.answers.A DW;
    private final com.crashlytics.android.answers.E j6;

    n(com.crashlytics.android.answers.E r1, com.crashlytics.android.answers.A r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public static com.crashlytics.android.answers.n j6(com.crashlytics.android.answers.E r5) {
        return new com.crashlytics.android.answers.n(r5, new com.crashlytics.android.answers.A(new abcd.rz(new com.crashlytics.android.answers.z(new abcd.pz(1000, 8), 0.1d), new abcd.oz(5))));
    }

    @Override
    public boolean j6(java.util.List<java.io.File> r5) {
        long r0 = 0L;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = java.lang.System.nanoTime();
                    if (this.DW.j6(r0) == true) { $pc0 = 5; continue $sw0; }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    return false;
                }
                case 5: {
                    if (this.j6.j6(r5) == false) { $pc0 = 8; continue $sw0; }
                    this.DW.j6();
                    return true;
                }
                case 8: {
                    this.DW.DW(r0);
                    { $pc0 = 9; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
