package com.crashlytics.android.answers;

class D extends uz<com.crashlytics.android.answers.I> {
    private abcd.Tz gn;

    D(android.content.Context r7, com.crashlytics.android.answers.K r8, io.fabric.sdk.android.services.common.k r9, abcd.Interfacevz r10) {
        super(r7, r8, r9, r10, 100);
    }

    protected java.lang.String FH() {
        return "sa_" + java.util.UUID.randomUUID().toString() + "_" + this.FH.j6() + ".tap";
    }

    protected int Zo() {
        abcd.Tz r0 = this.gn;
        if (r0 != null) goto L6;
        return super.Zo();
    L6:
        return r0.v5;
    }

    void j6(abcd.Tz r1) {
        this.gn = r1;
    }

    protected int v5() {
        abcd.Tz r0 = this.gn;
        if (r0 != null) goto L6;
        return super.v5();
    L6:
        return r0.FH;
    }
}
