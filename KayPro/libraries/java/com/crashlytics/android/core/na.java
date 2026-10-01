package com.crashlytics.android.core;

class na extends io.fabric.sdk.android.services.common.Abstracta implements com.crashlytics.android.core.Interfaceka {
    public na(io.fabric.sdk.android.Kit r7, java.lang.String r8, java.lang.String r9, abcd.Jz r10) {
        super(r7, r8, r9, r10, abcd.Fz.DW);
    }

    private abcd.Hz j6(abcd.Hz r13, com.crashlytics.android.core.Ka r14) {
        java.io.File[] r0 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        java.io.File r8 = null;
        java.lang.StringBuilder r9 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r13.v5("report[identifier]", r14.DW());
                    if (r14.Hw().length != 1) { $pc0 = 6; continue $sw0; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Adding single file " + r14.getFileName() + " to report " + r14.DW());
                    r13.j6("report[file]", r14.getFileName(), "application/octet-stream", r14.FH());
                    return r13;
                }
                case 6: {
                    r0 = r14.Hw();
                    r5 = r0.length;
                    r6 = 0;
                    r7 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r6 >= r5) { $pc0 = 9; continue $sw0; }
                    r8 = r0[r6];
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Adding file " + r8.getName() + " to report " + r14.DW());
                    r9 = new java.lang.StringBuilder();
                    r9.append("report[file");
                    r9.append(r7);
                    r9.append("]");
                    r13.j6(r9.toString(), r8.getName(), "application/octet-stream", r8);
                    r7 = r7 + 1;
                    r6 = r6 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 9: {
                    return r13;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Hz j6(abcd.Hz r3, com.crashlytics.android.core.ja r4) {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r3.FH("X-CRASHLYTICS-API-KEY", r4.j6);
                    r3.FH("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
                    r3.FH("X-CRASHLYTICS-API-CLIENT-VERSION", this.Zo.getVersion());
                    r5 = r4.DW.j6().entrySet().iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r5.hasNext() == false) { $pc1 = 6; continue $sw1; }
                    r3.j6(r5.next());
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6(com.crashlytics.android.core.ja r6) {
        abcd.Hz r0 = null;
        int r7 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = j6();
                    j6(r0, r6);
                    j6(r0, r6.DW);
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Sending report to: " + DW());
                    r7 = r0.VH();
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Create report request ID: " + r0.Hw("X-REQUEST-ID"));
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Result was: " + r7);
                    if (io.fabric.sdk.android.services.common.A.j6(r7) != 0) { $pc2 = 5; continue $sw2; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
