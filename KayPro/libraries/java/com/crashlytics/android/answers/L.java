package com.crashlytics.android.answers;

class L {
    private final io.fabric.sdk.android.services.common.v DW;
    private final java.lang.String FH;
    private final java.lang.String Hw;
    private final android.content.Context j6;

    public L(android.content.Context r1, io.fabric.sdk.android.services.common.v r2, java.lang.String r3, java.lang.String r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    public com.crashlytics.android.answers.J j6() {
        java.util.Map<io.fabric.sdk.android.services.common.v.a, java.lang.String> r0 = this.DW.v5();
        java.lang.String r3 = this.DW.FH();
        java.lang.String r5 = this.DW.Hw();
        java.lang.Boolean r6 = this.DW.EQ();
        java.lang.String r7 = r0.get(io.fabric.sdk.android.services.common.v.a.FH);
        java.lang.String r8 = io.fabric.sdk.android.services.common.i.J8(this.j6);
        java.lang.String r9 = this.DW.tp();
        java.lang.String r10 = this.DW.VH();
        return new com.crashlytics.android.answers.J(r3, java.util.UUID.randomUUID().toString(), r5, r6, r7, r8, r9, r10, this.FH, this.Hw);
    }
}
