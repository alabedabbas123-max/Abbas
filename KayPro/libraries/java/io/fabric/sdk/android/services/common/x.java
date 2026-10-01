package io.fabric.sdk.android.services.common;

public class x {
    private final Qy<java.lang.String> DW;
    private final Sy<java.lang.String> j6;

    public x() {
        this.j6 = new io.fabric.sdk.android.services.common.w(this);
        this.DW = new abcd.Qy();
    }

    public java.lang.String j6(android.content.Context r5) {
        java.lang.String r6 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r6 = (java.lang.String) this.DW.j6(r5, this.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 7; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ("".equals(r6) == true) { $pc0 = 6; continue $sw0; }
                    return r6;
                }
                case 6: {
                    return null;
                }
                case 7: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to determine installer package name", e);
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
