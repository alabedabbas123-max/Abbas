package com.crashlytics.android.answers;

class z implements abcd.Interfacenz {
    final java.util.Random DW;
    final double FH;
    final abcd.Interfacenz j6;

    public z(abcd.Interfacenz r2, double r3) {
        this(r2, r3, new java.util.Random());
    }

    public z(abcd.Interfacenz r4, double r5, java.util.Random r7) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r5 < 0.0d) { $pc0 = 15; continue $sw0; }
                    if (r5 > 1.0d) { $pc0 = 15; continue $sw0; }
                    if (r4 == null) { $pc0 = 13; continue $sw0; }
                    if (r7 == null) { $pc0 = 11; continue $sw0; }
                    this.j6 = r4;
                    this.FH = r5;
                    this.DW = r7;
                    return;
                }
                case 11: {
                    throw new java.lang.NullPointerException("random must not be null");
                }
                case 13: {
                    throw new java.lang.NullPointerException("backoff must not be null");
                }
                case 15: {
                    throw new java.lang.IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    double j6() {
        double r0 = this.FH;
        double r4 = 1.0d - r0;
        double r1 = (r0 + 1.0d) - r4;
        return r4 + (r1 * this.DW.nextDouble());
    }

    @Override
    public long j6(int r5) {
        double r0 = j6();
        double r2 = this.j6.j6(r5);
        java.lang.Double.isNaN(r2);
        return (long) (r0 * r2);
    }
}
