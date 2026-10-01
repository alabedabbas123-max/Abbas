package com.crashlytics.android.core;

class E extends java.util.HashMap<java.lang.String, java.lang.Object> {
    final com.crashlytics.android.core.F j6;

    E(com.crashlytics.android.core.F r2) {
        java.lang.String r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = r2;
                    put("app_identifier", this.j6.j6);
                    put("api_key", com.crashlytics.android.core.W.Hw(this.j6.Zo).j6);
                    put("version_code", this.j6.DW);
                    put("version_name", this.j6.FH);
                    put("install_uuid", this.j6.Hw);
                    put("delivery_mechanism", java.lang.Integer.valueOf(this.j6.v5));
                    if (android.text.TextUtils.isEmpty(com.crashlytics.android.core.W.v5(this.j6.Zo)) == false) { $pc0 = 5; continue $sw0; }
                    r3 = "";
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    put("unity_version", r3);
                    return;
                }
                case 5: {
                    r3 = com.crashlytics.android.core.W.v5(this.j6.Zo);
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
