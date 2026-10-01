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
        if (r5 < 1.0f) goto L6;
        return 1.0f;
    L6:
        if (r5 > 0.0f) goto L8;
        return 0.0f;
    L8:
        float[] r0 = this.j6;
        int r1 = java.lang.Math.min((int) ((r0.length - 1) * r5), r0.length - 2);
        float r2 = this.DW;
        float r6 = (r5 - (r1 * r2)) / r2;
        float[] r3 = this.j6;
        return r3[r1] + (r6 * (r3[r1 + 1] - r3[r1]));
    }
}
