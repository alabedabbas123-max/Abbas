package com.crashlytics.android.core;

interface Ka {

    public static final enum a extends java.lang.Enum<com.crashlytics.android.core.Ka.a> {
        public static final com.crashlytics.android.core.Ka.a DW = null;
        private static final com.crashlytics.android.core.Ka.a[] FH = null;
        public static final com.crashlytics.android.core.Ka.a j6 = null;

        static {
            j6 = new com.crashlytics.android.core.Ka.a("JAVA", 0);
            DW = new com.crashlytics.android.core.Ka.a("NATIVE", 1);
            FH = new com.crashlytics.android.core.Ka.a[]{j6, DW};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static com.crashlytics.android.core.Ka.a valueOf(java.lang.String r1) {
            return (com.crashlytics.android.core.Ka.a) java.lang.Enum.valueOf(com.crashlytics.android.core.Ka.a.class, r1);
        }

        public static com.crashlytics.android.core.Ka.a[] values() {
            return (com.crashlytics.android.core.Ka.a[]) FH.clone();
        }
    }

    java.lang.String DW();

    java.io.File FH();

    java.io.File[] Hw();

    java.lang.String getFileName();

    com.crashlytics.android.core.Ka.a getType();

    java.util.Map<java.lang.String, java.lang.String> j6();

    void remove();
}
