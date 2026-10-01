package com.crashlytics.android.answers;

class E extends io.fabric.sdk.android.services.common.Abstracta implements abcd.Interfaceyz {
    private final java.lang.String VH;

    public E(io.fabric.sdk.android.Kit r7, java.lang.String r8, java.lang.String r9, abcd.Jz r10, java.lang.String r11) {
        super(r7, r8, r9, r10, abcd.Fz.DW);
        this.VH = r11;
    }

    @Override
    public boolean j6(java.util.List<java.io.File> r10) {
        abcd.Hz r0 = null;
        java.util.Iterator<java.io.File> r1 = null;
        int r3 = 0;
        java.io.File r4 = null;
        int r11 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = j6();
                    r0.FH("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
                    r0.FH("X-CRASHLYTICS-API-CLIENT-VERSION", this.Zo.getVersion());
                    r0.FH("X-CRASHLYTICS-API-KEY", this.VH);
                    r1 = r10.iterator();
                    r3 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    r4 = r1.next();
                    r0.j6("session_analytics_file_" + r3, r4.getName(), "application/vnd.crashlytics.android.events", r4);
                    r3 = r3 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Sending " + r10.size() + " analytics files to " + DW());
                    r11 = r0.VH();
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Response code for analytics file send is " + r11);
                    if (io.fabric.sdk.android.services.common.A.j6(r11) != 0) { $pc0 = 11; continue $sw0; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
