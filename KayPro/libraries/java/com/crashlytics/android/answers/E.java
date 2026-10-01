package com.crashlytics.android.answers;

class E extends io.fabric.sdk.android.services.common.Abstracta implements abcd.Interfaceyz {
    private final java.lang.String VH;

    public E(io.fabric.sdk.android.Kit r7, java.lang.String r8, java.lang.String r9, abcd.Jz r10, java.lang.String r11) {
        super(r7, r8, r9, r10, abcd.Fz.DW);
        this.VH = r11;
    }

    @Override
    public boolean j6(java.util.List<java.io.File> r10) {
        abcd.Hz r0 = j6();
        r0.FH("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        r0.FH("X-CRASHLYTICS-API-CLIENT-VERSION", this.Zo.getVersion());
        r0.FH("X-CRASHLYTICS-API-KEY", this.VH);
        java.util.Iterator<java.io.File> r1 = r10.iterator();
        int r3 = 0;
    L4:
        if (r1.hasNext() == false) goto L6;
        java.io.File r4 = r1.next();
        r0.j6("session_analytics_file_" + r3, r4.getName(), "application/vnd.crashlytics.android.events", r4);
        r3 = r3 + 1;
        goto L4
    L6:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Sending " + r10.size() + " analytics files to " + DW());
        int r11 = r0.VH();
        io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Response code for analytics file send is " + r11);
        if (io.fabric.sdk.android.services.common.A.j6(r11) != 0) goto L11;
        return true;
    L11:
        return false;
    }
}
