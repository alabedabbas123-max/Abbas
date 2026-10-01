package io.fabric.sdk.android.services.common;

public class x {
    private final Qy<java.lang.String> DW;
    private final Sy<java.lang.String> j6;

    public x() {
        this.j6 = new io.fabric.sdk.android.services.common.w(this);
        this.DW = new abcd.Qy();
    }

    public java.lang.String j6(android.content.Context r5) {
        java.lang.String r6 = (java.lang.String) this.DW.j6(r5, this.j6);     // Catch: java.lang.Exception -> L7
        if ("".equals(r6) == true) goto L6;
        return r6;
    L6:
        return null;
    L7:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to determine installer package name", e);
        return null;
    }
}
