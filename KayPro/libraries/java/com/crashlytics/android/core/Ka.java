package com.crashlytics.android.core;

interface Ka {

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final com.crashlytics.android.core.Ka.a DW = new com.crashlytics.android.core.Ka.a("NATIVE", 1);
        private static final com.crashlytics.android.core.Ka.a[] FH = new com.crashlytics.android.core.Ka.a[]{j6, DW};
        public static final com.crashlytics.android.core.Ka.a j6 = new com.crashlytics.android.core.Ka.a("JAVA", 0);



        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static com.crashlytics.android.core.Ka.a valueOf(java.lang.String r1) {
            return (com.crashlytics.android.core.Ka.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(com.crashlytics.android.core.Ka.a.values(), r1);
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
