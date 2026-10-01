package com.crashlytics.android.core;

class La {
    private static final short[] DW = null;
    static final java.util.Map<java.lang.String, java.lang.String> j6 = null;
    private final java.lang.Object FH;
    private final com.crashlytics.android.core.Interfaceka Hw;
    private final com.crashlytics.android.core.La.b VH;
    private final com.crashlytics.android.core.La.c Zo;
    private java.lang.Thread gn;
    private final java.lang.String v5;

    static final class a implements com.crashlytics.android.core.La.d {
        a() {
        }

        @Override
        public boolean j6() {
            return true;
        }
    }

    interface b {
        boolean j6();
    }

    interface c {
        java.io.File[] DW();

        java.io.File[] FH();

        java.io.File[] j6();
    }

    interface d {
        boolean j6();
    }

    private class e extends io.fabric.sdk.android.services.common.g {
        private final com.crashlytics.android.core.La.d DW;
        final com.crashlytics.android.core.La FH;
        private final float j6;

        e(com.crashlytics.android.core.La r1, float r2, com.crashlytics.android.core.La.d r3) {
            this.FH = r1;
            this.j6 = r2;
            this.DW = r3;
        }

        private void DW() {
            io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Starting report processing in " + this.j6 + " second(s)...");
            float r0 = this.j6;
            if (r0 > 0.0f) goto L40;
        L9:
            java.util.List<com.crashlytics.android.core.Ka> r1 = this.FH.DW();
            if (com.crashlytics.android.core.La.j6(this.FH).j6() == false) goto L13;
            return;
        L13:
            if (r1.isEmpty() == false) goto L15;
        L21:
            int r2 = 0;
        L23:
            if (r1.isEmpty() == true) goto L50;
            if (com.crashlytics.android.core.La.j6(this.FH).j6() == true) goto L26;
            io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Attempting to send " + r1.size() + " report(s)");
            java.util.Iterator<com.crashlytics.android.core.Ka> r3 = r1.iterator();
        L29:
            if (r3.hasNext() == false) goto L31;
            this.FH.j6(r3.next());
            goto L29
        L31:
            r1 = this.FH.DW();
            if (r1.isEmpty() == true) goto L23;
            int r4 = r2 + 1;
            long r5 = com.crashlytics.android.core.La.j6()[java.lang.Math.min(r2, com.crashlytics.android.core.La.j6().length - 1)];
            io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Report submisson: scheduling delayed retry in " + r5 + " seconds");
            java.lang.Thread.sleep(r5 * 1000);     // Catch: java.lang.InterruptedException -> L36
            r2 = r4;
        L36:
            java.lang.Thread.currentThread().interrupt();
            return;
        L26:
            return;
        L50:
            return;
        L15:
            if (this.DW.j6() == true) goto L21;
            io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "User declined to send. Removing " + r1.size() + " Report(s).");
            java.util.Iterator<com.crashlytics.android.core.Ka> r6 = r1.iterator();
        L18:
            if (r6.hasNext() == false) goto L20;
            r6.next().remove();
            goto L18
        L20:
            return;
        L40:
            java.lang.Thread.sleep((long) (r0 * 1000.0f));     // Catch: java.lang.InterruptedException -> L7
        L7:
            java.lang.Thread.currentThread().interrupt();
        }

        @Override
        public void j6() {
            DW();     // Catch: java.lang.Exception -> L4
        L6:
            com.crashlytics.android.core.La.j6(this.FH, null);
            return;
        L4:
            e = move-exception;
            io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", e);
            goto L6
        }
    }

    static {
        j6 = java.util.Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
        DW = new short[]{10, 20, 30, 60, 120, 300};
    }

    public La(java.lang.String r2, com.crashlytics.android.core.Interfaceka r3, com.crashlytics.android.core.La.c r4, com.crashlytics.android.core.La.b r5) {
        this.FH = new java.lang.Object();
        if (r3 == null) goto L7;
        this.Hw = r3;
        this.v5 = r2;
        this.Zo = r4;
        this.VH = r5;
        return;
    L7:
        throw new java.lang.IllegalArgumentException("createReportCall must not be null.");
    }

    static com.crashlytics.android.core.La.b j6(com.crashlytics.android.core.La r0) {
        return r0.VH;
    }

    static java.lang.Thread j6(com.crashlytics.android.core.La r0, java.lang.Thread r1) {
        r0.gn = r1;
        return r1;
    }

    static short[] j6() {
        return DW;
    }

    java.util.List<com.crashlytics.android.core.Ka> DW() {
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Checking for crash reports...");
        java.lang.Object r0 = this.FH;
        monitor-enter(r0);
        java.io.File[] r1 = this.Zo.FH();     // Catch: java.lang.Throwable -> L31
        java.io.File[] r2 = this.Zo.DW();     // Catch: java.lang.Throwable -> L31
        java.io.File[] r3 = this.Zo.j6();     // Catch: java.lang.Throwable -> L31
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L31
        java.util.LinkedList r4 = new java.util.LinkedList();
        int r5 = 0;
        if (r1 == null) goto L11;
        int r6 = r1.length;
        int r7 = 0;
    L9:
        if (r7 >= r6) goto L11;
        java.io.File r8 = r1[r7];
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Found crash report " + r8.getPath());
        r4.add(new com.crashlytics.android.core.Oa(r8));
        r7 = r7 + 1;
    L11:
        java.util.HashMap r9 = new java.util.HashMap();
        if (r2 == null) goto L19;
        int r10 = r2.length;
        int r11 = 0;
    L14:
        if (r11 >= r10) goto L19;
        java.io.File r12 = r2[r11];
        java.lang.String r13 = com.crashlytics.android.core.W.j6(r12);
        if (r9.containsKey(r13) == true) goto L18;
        r9.put(r13, new java.util.LinkedList());
    L18:
        ((java.util.List) r9.get(r13)).add(r12);
        r11 = r11 + 1;
    L19:
        java.util.Iterator r14 = r9.keySet().iterator();
    L21:
        if (r14.hasNext() == false) goto L23;
        java.lang.String r15 = (java.lang.String) r14.next();
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Found invalid session: " + r15);
        java.util.List r16 = (java.util.List) r9.get(r15);
        r4.add(new com.crashlytics.android.core.sa(r15, (java.io.File[]) r16.toArray(new java.io.File[r16.size()])));
        goto L21
    L23:
        if (r3 == null) goto L28;
        int r17 = r3.length;
    L25:
        if (r5 >= r17) goto L28;
        r4.add(new com.crashlytics.android.core.Ca(r3[r5]));
        r5 = r5 + 1;
    L28:
        if (r4.isEmpty() == false) goto L30;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "No reports found.");
    L30:
        return r4;
    L31:
        th = move-exception;
        throw th;
    }

    public synchronized void j6(float r2, com.crashlytics.android.core.La.d r3) {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.gn == null) goto L8;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Report upload has already been started.");     // Catch: java.lang.Throwable -> L11
        monitor-exit(this);
        return;
    L8:
        this.gn = new java.lang.Thread(new com.crashlytics.android.core.La.e(this, r2, r3), "Crashlytics Report Uploader");     // Catch: java.lang.Throwable -> L11
        this.gn.start();     // Catch: java.lang.Throwable -> L11
        monitor-exit(this);
    }

    boolean j6(com.crashlytics.android.core.Ka r8) {
        java.lang.Object r0 = this.FH;
        monitor-enter(r0);
        boolean r1 = false;
        boolean r2 = this.Hw.j6(new com.crashlytics.android.core.ja(this.v5, r8));     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        io.fabric.sdk.android.m r3 = io.fabric.sdk.android.Fabric.getLogger();     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        java.lang.StringBuilder r5 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        r5.append("Crashlytics report upload ");     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        if (r2 == false) goto L8;
        java.lang.String r6 = "complete: ";
    L9:
        r5.append(r6);     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        r5.append(r8.DW());     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        r3.v5("CrashlyticsCore", r5.toString());     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        if (r2 == false) goto L17;
        r8.remove();     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        r1 = true;
        goto L17
    L17:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L13
        return r1;
    L8:
        r6 = "FAILED: ";
    L13:
        th = move-exception;
        throw th;
    L15:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error occurred sending report " + r8, e);     // Catch: java.lang.Throwable -> L13
        goto L17
    }
}
