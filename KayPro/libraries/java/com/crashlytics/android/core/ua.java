package com.crashlytics.android.core;

class ua {
    private static final com.crashlytics.android.core.ua.b j6 = null;
    private final android.content.Context DW;
    private final com.crashlytics.android.core.ua.a FH;
    private com.crashlytics.android.core.Interfacera Hw;

    public interface a {
        java.io.File j6();
    }

    private static final class b implements com.crashlytics.android.core.Interfacera {
        private b() {
        }

        b(com.crashlytics.android.core.ta r1) {
            this();
        }

        @Override
        public com.crashlytics.android.core.ClassD DW() {
            return null;
        }

        @Override
        public byte[] FH() {
            return null;
        }

        @Override
        public void Hw() {
        }

        @Override
        public void j6() {
        }

        @Override
        public void j6(long r1, java.lang.String r3) {
        }
    }

    static {
        j6 = new com.crashlytics.android.core.ua.b(null);
    }

    ua(android.content.Context r2, com.crashlytics.android.core.ua.a r3) {
        this(r2, r3, null);
    }

    ua(android.content.Context r1, com.crashlytics.android.core.ua.a r2, java.lang.String r3) {
        this.DW = r1;
        this.FH = r2;
        this.Hw = j6;
        j6(r3);
    }

    private java.io.File DW(java.lang.String r3) {
        return new java.io.File(this.FH.j6(), "crashlytics-userlog-" + r3 + ".temp");
    }

    private java.lang.String j6(java.io.File r3) {
        java.lang.String r4 = r3.getName();
        int r0 = r4.lastIndexOf(".temp");
        if (r0 != (-1)) goto L6;
        return r4;
    L6:
        return r4.substring(20, r0);
    }

    com.crashlytics.android.core.ClassD DW() {
        return this.Hw.DW();
    }

    byte[] FH() {
        return this.Hw.FH();
    }

    void j6() {
        this.Hw.Hw();
    }

    void j6(long r2, java.lang.String r4) {
        this.Hw.j6(r2, r4);
    }

    void j6(java.io.File r2, int r3) {
        this.Hw = new com.crashlytics.android.core.Ia(r2, r3);
    }

    final void j6(java.lang.String r4) {
        this.Hw.j6();
        this.Hw = j6;
        if (r4 != null) goto L6;
        return;
    L6:
        if (io.fabric.sdk.android.services.common.i.j6(this.DW, "com.crashlytics.CollectCustomLogs", true) == true) goto L9;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
        return;
    L9:
        j6(DW(r4), 65536);
    }

    void j6(java.util.Set<java.lang.String> r6) {
        java.io.File[] r0 = this.FH.j6().listFiles();
        if (r0 == null) goto L10;
        int r1 = r0.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L14;
        java.io.File r3 = r0[r2];
        if (r6.contains(j6(r3)) == true) goto L9;
        r3.delete();
    L9:
        r2 = r2 + 1;
        goto L5
    L14:
        return;
    }
}
