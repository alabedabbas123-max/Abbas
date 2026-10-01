package com.crashlytics.android.answers;

class m {
    private final abcd.Qz j6;

    m(abcd.Qz r1) {
        this.j6 = r1;
    }

    public static com.crashlytics.android.answers.m j6(android.content.Context r2) {
        return new com.crashlytics.android.answers.m(new abcd.Rz(r2, "settings"));
    }

    @android.annotation.SuppressLint({"CommitPrefEdits"})
    public void DW() {
        abcd.Qz r0 = this.j6;
        r0.j6(r0.edit().putBoolean("analytics_launched", true));
    }

    @android.annotation.SuppressLint({"CommitPrefEdits"})
    public boolean j6() {
        return this.j6.get().getBoolean("analytics_launched", false);
    }
}
