package io.fabric.sdk.android.services.common;

public final enum m extends java.lang.Enum<io.fabric.sdk.android.services.common.m> {
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
        if ("io.crash.air".equals(r1) == true) goto L5;
        if (r1 == null) goto L10;
        return Hw;
    L10:
        return j6;
    L5:
        return FH;
    }

    public static io.fabric.sdk.android.services.common.m valueOf(java.lang.String r1) {
        return (io.fabric.sdk.android.services.common.m) java.lang.Enum.valueOf(io.fabric.sdk.android.services.common.m.class, r1);
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
