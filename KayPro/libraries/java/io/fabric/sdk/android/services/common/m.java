package io.fabric.sdk.android.services.common;

public final class m extends com.almlkaide.kaypro.internal.EnumBase {
    public static final io.fabric.sdk.android.services.common.m DW = null;
    public static final io.fabric.sdk.android.services.common.m FH = null;
    public static final io.fabric.sdk.android.services.common.m Hw = null;
    public static final io.fabric.sdk.android.services.common.m j6 = null;
    private static final io.fabric.sdk.android.services.common.m[] v5 = null;
    private final int Zo;

    static {
        j6 = new io.fabric.sdk.android.services.common.m("DEVELOPER", 0, 1);
        DW = new io.fabric.sdk.android.services.common.m("USER_SIDELOAD", 1, 2);
        FH = new io.fabric.sdk.android.services.common.m("TEST_DISTRIBUTION", 2, 3);
        Hw = new io.fabric.sdk.android.services.common.m("APP_STORE", 3, 4);
        v5 = new io.fabric.sdk.android.services.common.m[]{j6, DW, FH, Hw};
    }

    private m(java.lang.String r1, int r2, int r3) {
        super(r1, r2);
        this.Zo = r3;
    }

    public static io.fabric.sdk.android.services.common.m j6(java.lang.String r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ("io.crash.air".equals(r1) == true) { $pc0 = 5; continue $sw0; }
                    if (r1 == null) { $pc0 = 10; continue $sw0; }
                    return Hw;
                }
                case 10: {
                    return j6;
                }
                case 5: {
                    return FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static io.fabric.sdk.android.services.common.m valueOf(java.lang.String r1) {
        return (io.fabric.sdk.android.services.common.m) com.almlkaide.kaypro.internal.EnumBase.valueOf(io.fabric.sdk.android.services.common.m.values(), r1);
    }

    public static io.fabric.sdk.android.services.common.m[] values() {
        return (io.fabric.sdk.android.services.common.m[]) v5.clone();
    }

    public int getId() {
        return this.Zo;
    }

    @Override
    public java.lang.String toString() {
        return java.lang.Integer.toString(this.Zo);
    }
}
