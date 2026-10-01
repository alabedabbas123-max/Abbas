package io.fabric.sdk.android.services.common;

class w implements Sy<java.lang.String> {
    final io.fabric.sdk.android.services.common.x j6;

    w(io.fabric.sdk.android.services.common.x r1) {
        this.j6 = r1;
    }

    public java.lang.Object j6(android.content.Context r1) {
        return m43j6(r1);
    }

    public java.lang.String m43j6(android.content.Context r2) {
        java.lang.String r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r3 = r2.getPackageManager().getInstallerPackageName(r2.getPackageName());
                    if (r3 != null) { $pc0 = 6; continue $sw0; }
                    return "";
                }
                case 6: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
