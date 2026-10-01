package com.crashlytics.android.core;

@android.annotation.SuppressLint({"CommitPrefEdits"})
class Ea {
    private final com.crashlytics.android.core.ca DW;
    private final abcd.Qz j6;

    public Ea(abcd.Qz r1, com.crashlytics.android.core.ca r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public static com.crashlytics.android.core.Ea j6(abcd.Qz r1, com.crashlytics.android.core.ca r2) {
        return new com.crashlytics.android.core.Ea(r1, r2);
    }

    void j6(boolean r4) {
        abcd.Qz r0 = this.j6;
        r0.j6(r0.edit().putBoolean("always_send_reports_opt_in", r4));
    }

    boolean j6() {
        abcd.Rz r0 = null;
        boolean r4 = false;
        boolean r1 = false;
        abcd.Qz r5 = null;
        abcd.Qz r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6.get().contains("preferences_migration_complete") == true) { $pc0 = 14; continue $sw0; }
                    r0 = new abcd.Rz(this.DW);
                    if (this.j6.get().contains("always_send_reports_opt_in") == false) { $pc0 = 7; continue $sw0; }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    r4 = false;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if (r4 == false) { $pc0 = 12; continue $sw0; }
                    r1 = r0.get().getBoolean("always_send_reports_opt_in", false);
                    r5 = this.j6;
                    r5.j6(r5.edit().putBoolean("always_send_reports_opt_in", r1));
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r2 = this.j6;
                    r2.j6(r2.edit().putBoolean("preferences_migration_complete", true));
                    { $pc0 = 14; continue $sw0; }
                }
                case 7: {
                    if (r0.get().contains("always_send_reports_opt_in") == false) { $pc0 = 9; continue $sw0; }
                    r4 = true;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    return this.j6.get().getBoolean("always_send_reports_opt_in", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
