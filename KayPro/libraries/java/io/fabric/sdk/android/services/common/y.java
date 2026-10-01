package io.fabric.sdk.android.services.common;

class y implements io.fabric.sdk.android.services.common.z.c {
    final java.lang.StringBuilder DW;
    final io.fabric.sdk.android.services.common.z FH;
    boolean j6;

    y(io.fabric.sdk.android.services.common.z r1, java.lang.StringBuilder r2) {
        this.FH = r1;
        this.DW = r2;
        this.j6 = true;
    }

    @Override
    public void j6(java.io.InputStream r2, int r3) {
        if (this.j6 == false) goto L5;
        this.j6 = false;
    L6:
        this.DW.append(r3);
        return;
    L5:
        this.DW.append(", ");
        goto L6
    }
}
