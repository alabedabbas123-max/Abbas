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
        if (this.j6.get().contains("preferences_migration_complete") == true) goto L14;
        abcd.Rz r0 = new abcd.Rz(this.DW);
        if (this.j6.get().contains("always_send_reports_opt_in") == false) goto L7;
    L9:
        boolean r4 = false;
    L10:
        if (r4 == false) goto L12;
        boolean r1 = r0.get().getBoolean("always_send_reports_opt_in", false);
        abcd.Qz r5 = this.j6;
        r5.j6(r5.edit().putBoolean("always_send_reports_opt_in", r1));
    L12:
        abcd.Qz r2 = this.j6;
        r2.j6(r2.edit().putBoolean("preferences_migration_complete", true));
        goto L14
    L7:
        if (r0.get().contains("always_send_reports_opt_in") == false) goto L9;
        r4 = true;
    L14:
        return this.j6.get().getBoolean("always_send_reports_opt_in", false);
    }
}
