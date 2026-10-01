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
        abcd.Tz r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.gn;
                    if (r0 != null) { $pc0 = 6; continue $sw0; }
                    return super.Zo();
                }
                case 6: {
                    return r0.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.Tz r1) {
        this.gn = r1;
    }

    protected int v5() {
        abcd.Tz r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.gn;
                    if (r0 != null) { $pc1 = 6; continue $sw1; }
                    return super.v5();
                }
                case 6: {
                    return r0.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
