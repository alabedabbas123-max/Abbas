package com.crashlytics.android.answers;

final class I {
    public final long DW;
    public final com.crashlytics.android.answers.I.b FH;
    public final java.util.Map<java.lang.String, java.lang.String> Hw;
    public final java.lang.String VH;
    public final java.util.Map<java.lang.String, java.lang.Object> Zo;
    public final java.util.Map<java.lang.String, java.lang.Object> gn;
    public final com.crashlytics.android.answers.J j6;
    private java.lang.String u7;
    public final java.lang.String v5;

    static class a {
        final long DW;
        java.util.Map<java.lang.String, java.lang.String> FH;
        java.lang.String Hw;
        java.util.Map<java.lang.String, java.lang.Object> VH;
        java.lang.String Zo;
        final com.crashlytics.android.answers.I.b j6;
        java.util.Map<java.lang.String, java.lang.Object> v5;

        public a(com.crashlytics.android.answers.I.b r3) {
            this.j6 = r3;
            this.DW = java.lang.System.currentTimeMillis();
            this.FH = null;
            this.Hw = null;
            this.v5 = null;
            this.Zo = null;
            this.VH = null;
        }

        public com.crashlytics.android.answers.I.a DW(java.util.Map<java.lang.String, java.lang.String> r1) {
            this.FH = r1;
            return this;
        }

        public com.crashlytics.android.answers.I.a j6(java.util.Map<java.lang.String, java.lang.Object> r1) {
            this.v5 = r1;
            return this;
        }

        public com.crashlytics.android.answers.I j6(com.crashlytics.android.answers.J r13) {
            return new com.crashlytics.android.answers.I(r13, this.DW, this.j6, this.FH, this.Hw, this.v5, this.Zo, this.VH, null);
        }
    }

    static final enum b extends java.lang.Enum<com.crashlytics.android.answers.I.b> {
        public static final com.crashlytics.android.answers.I.b DW = null;
        public static final com.crashlytics.android.answers.I.b FH = null;
        public static final com.crashlytics.android.answers.I.b Hw = null;
        public static final com.crashlytics.android.answers.I.b VH = null;
        public static final com.crashlytics.android.answers.I.b Zo = null;
        public static final com.crashlytics.android.answers.I.b gn = null;
        public static final com.crashlytics.android.answers.I.b j6 = null;
        private static final com.crashlytics.android.answers.I.b[] u7 = null;
        public static final com.crashlytics.android.answers.I.b v5 = null;

        static {
            j6 = new com.crashlytics.android.answers.I.b("START", 0);
            DW = new com.crashlytics.android.answers.I.b("RESUME", 1);
            FH = new com.crashlytics.android.answers.I.b("PAUSE", 2);
            Hw = new com.crashlytics.android.answers.I.b("STOP", 3);
            v5 = new com.crashlytics.android.answers.I.b("CRASH", 4);
            Zo = new com.crashlytics.android.answers.I.b("INSTALL", 5);
            VH = new com.crashlytics.android.answers.I.b("CUSTOM", 6);
            gn = new com.crashlytics.android.answers.I.b("PREDEFINED", 7);
            u7 = new com.crashlytics.android.answers.I.b[]{j6, DW, FH, Hw, v5, Zo, VH, gn};
        }

        private b(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static com.crashlytics.android.answers.I.b valueOf(java.lang.String r1) {
            return (com.crashlytics.android.answers.I.b) java.lang.Enum.valueOf(com.crashlytics.android.answers.I.b.class, r1);
        }

        public static com.crashlytics.android.answers.I.b[] values() {
            return (com.crashlytics.android.answers.I.b[]) u7.clone();
        }
    }

    private I(com.crashlytics.android.answers.J r1, long r2, com.crashlytics.android.answers.I.b r4, java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.Object> r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r4;
        this.Hw = r5;
        this.v5 = r6;
        this.Zo = r7;
        this.VH = r8;
        this.gn = r9;
    }

    I(com.crashlytics.android.answers.J r1, long r2, com.crashlytics.android.answers.I.b r4, java.util.Map r5, java.lang.String r6, java.util.Map r7, java.lang.String r8, java.util.Map r9, com.crashlytics.android.answers.H r10) {
        this(r1, r2, r4, r5, r6, r7, r8, r9);
    }

    public static com.crashlytics.android.answers.I.a j6(long r2) {
        com.crashlytics.android.answers.I.a r0 = new com.crashlytics.android.answers.I.a(com.crashlytics.android.answers.I.b.Zo);
        r0.DW(java.util.Collections.singletonMap("installedAt", java.lang.String.valueOf(r2)));
        return r0;
    }

    public static com.crashlytics.android.answers.I.a j6(com.crashlytics.android.answers.I.b r1, android.app.Activity r2) {
        java.util.Map<java.lang.String, java.lang.String> r3 = java.util.Collections.singletonMap("activity", r2.getClass().getName());
        com.crashlytics.android.answers.I.a r0 = new com.crashlytics.android.answers.I.a(r1);
        r0.DW(r3);
        return r0;
    }

    public static com.crashlytics.android.answers.I.a j6(java.lang.String r2) {
        java.util.Map<java.lang.String, java.lang.String> r3 = java.util.Collections.singletonMap("sessionId", r2);
        com.crashlytics.android.answers.I.a r0 = new com.crashlytics.android.answers.I.a(com.crashlytics.android.answers.I.b.v5);
        r0.DW(r3);
        return r0;
    }

    public static com.crashlytics.android.answers.I.a j6(java.lang.String r1, java.lang.String r2) {
        com.crashlytics.android.answers.I.a r3 = j6(r1);
        r3.j6(java.util.Collections.singletonMap("exceptionName", r2));
        return r3;
    }

    public java.lang.String toString() {
        if (this.u7 != null) goto L6;
        this.u7 = "[" + com.crashlytics.android.answers.I.class.getSimpleName() + ": timestamp=" + this.DW + ", type=" + this.FH + ", details=" + this.Hw + ", customType=" + this.v5 + ", customAttributes=" + this.Zo + ", predefinedType=" + this.VH + ", predefinedAttributes=" + this.gn + ", metadata=[" + this.j6 + "]]";
    L6:
        return this.u7;
    }
}
