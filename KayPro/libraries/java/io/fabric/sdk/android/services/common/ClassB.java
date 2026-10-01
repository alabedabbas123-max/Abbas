package io.fabric.sdk.android.services.common;

class ClassB {
    public final boolean DW;
    public final java.lang.String j6;

    ClassB(java.lang.String r1, boolean r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public boolean equals(java.lang.Object r5) {
        io.fabric.sdk.android.services.common.ClassB r6 = null;
        java.lang.String r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this != r5) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    if (r5 != null) { $pc0 = 8; continue $sw0; }
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    return false;
                }
                case 8: {
                    if (io.fabric.sdk.android.services.common.ClassB.class != r5.getClass()) { $pc0 = 22; continue $sw0; }
                    r6 = (io.fabric.sdk.android.services.common.ClassB) r5;
                    if (this.DW == r6.DW) { $pc0 = 13; continue $sw0; }
                    return false;
                }
                case 13: {
                    r2 = this.j6;
                    if (r2 == null) { $pc0 = 19; continue $sw0; }
                    if (r2.equals(r6.j6) == false) { $pc0 = 20; continue $sw0; }
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    return true;
                }
                case 20: {
                    return false;
                }
                case 19: {
                    if (r6.j6 == null) { $pc0 = 21; continue $sw0; }
                    { $pc0 = 20; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        java.lang.String r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6;
                    if (r0 == null) { $pc1 = 5; continue $sw1; }
                    r1 = r0.hashCode();
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return (r1 * 31) + (this.DW ? 1 : 0);
                }
                case 5: {
                    r1 = 0;
                    { $pc1 = 7; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
