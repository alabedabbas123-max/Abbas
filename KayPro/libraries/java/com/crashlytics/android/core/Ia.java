package com.crashlytics.android.core;

class Ia implements com.crashlytics.android.core.Interfacera {
    private final int DW;
    private io.fabric.sdk.android.services.common.z FH;
    private final java.io.File j6;

    public class a {
        public final int DW;
        final com.crashlytics.android.core.Ia FH;
        public final byte[] j6;

        public a(com.crashlytics.android.core.Ia r1, byte[] r2, int r3) {
            this.FH = r1;
            this.j6 = r2;
            this.DW = r3;
        }
    }

    public Ia(java.io.File r1, int r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    private void DW(long r5, java.lang.String r7) {
        if (this.FH != null) goto L5;
        return;
    L5:
        if (r7 != null) goto L20;
        r7 = "null";
    L20:
        int r1 = this.DW / 4;     // Catch: java.io.IOException -> L17
        if (r7.length() <= r1) goto L10;
        r7 = "..." + r7.substring(r7.length() - r1);     // Catch: java.io.IOException -> L17
    L10:
        this.FH.j6(java.lang.String.format(java.util.Locale.US, "%d %s%n", new java.lang.Object[]{java.lang.Long.valueOf(r5), r7.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes("UTF-8"));     // Catch: java.io.IOException -> L17
    L11:
        if (this.FH.DW() == true) goto L24;
        if (this.FH.Hw() <= this.DW) goto L25;
        this.FH.FH();     // Catch: java.io.IOException -> L17
        goto L11
    L25:
        return;
    L24:
        return;
    L17:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", e);
    }

    private void Zo() {
        if (this.FH != null) goto L11;
        this.FH = new io.fabric.sdk.android.services.common.z(this.j6);     // Catch: java.io.IOException -> L6
        return;
    L6:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Could not open log file: " + this.j6, e);
        return;
    }

    private com.crashlytics.android.core.Ia.a v5() {
        if (this.j6.exists() == true) goto L5;
        return null;
    L5:
        Zo();
        io.fabric.sdk.android.services.common.z r0 = this.FH;
        if (r0 != null) goto L8;
        return null;
    L8:
        int[] r1 = {0};
        byte[] r2 = new byte[r0.Hw()];
        this.FH.j6(new com.crashlytics.android.core.Ha(this, r2, r1));     // Catch: java.io.IOException -> L11
    L14:
        return new com.crashlytics.android.core.Ia.a(this, r2, r1[0]);
    L11:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", e);
        goto L14
    }

    @Override
    public com.crashlytics.android.core.ClassD DW() {
        com.crashlytics.android.core.Ia.a r0 = v5();
        if (r0 != null) goto L6;
        return null;
    L6:
        return com.crashlytics.android.core.ClassD.j6(r0.j6, 0, r0.DW);
    }

    @Override
    public byte[] FH() {
        com.crashlytics.android.core.Ia.a r0 = v5();
        if (r0 != null) goto L6;
        return null;
    L6:
        return r0.j6;
    }

    @Override
    public void Hw() {
        j6();
        this.j6.delete();
    }

    @Override
    public void j6() {
        io.fabric.sdk.android.services.common.i.j6(this.FH, "There was a problem closing the Crashlytics log file.");
        this.FH = null;
    }

    @Override
    public void j6(long r1, java.lang.String r3) {
        Zo();
        DW(r1, r3);
    }
}
