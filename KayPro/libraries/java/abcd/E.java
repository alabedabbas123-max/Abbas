package abcd;

abstract class E implements android.view.animation.Interpolator {
    private final float DW;
    private final float[] j6;

    public E(float[] r2) {
        this.j6 = r2;
        this.DW = 1.0f / (this.j6.length - 1);
    }

    @Override
    public float getInterpolation(float r5) {
        float[] r0 = null;
        int r1 = 0;
        float r2 = 0.0f;
        float r6 = 0.0f;
        float[] r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r5 < 1.0f) { $pc0 = 6; continue $sw0; }
                    return 1.0f;
                }
                case 6: {
                    if (r5 > 0.0f) { $pc0 = 8; continue $sw0; }
                    return 0.0f;
                }
                case 8: {
                    r0 = this.j6;
                    r1 = java.lang.Math.min((int) ((r0.length - 1) * r5), r0.length - 2);
                    r2 = this.DW;
                    r6 = (r5 - (r1 * r2)) / r2;
                    r3 = this.j6;
                    return r3[r1] + (r6 * (r3[r1 + 1] - r3[r1]));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
