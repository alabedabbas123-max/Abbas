package abcd;

public interface Interfaceze {

    @abcd.Interfacexu
    public static final enum a extends java.lang.Enum<abcd.Interfaceze.a> {
        public static final abcd.Interfaceze.a DW = null;
        public static final abcd.Interfaceze.a FH = null;
        public static final abcd.Interfaceze.a Hw = null;

        @abcd.Interfaceuu
        private static boolean VH;

        @abcd.Interfacetu
        private static boolean Zo;
        public static final abcd.Interfaceze.a j6 = null;
        private static final abcd.Interfaceze.a[] v5 = null;

        static {
            abcd.wu.j6(abcd.Interfaceze.a.class, -1032729843049214907L, -1032729843049214907L);     // Catch: java.lang.Throwable -> L8
            if (Zo == false) goto L6;
            abcd.wu.j6(1952775956320630320L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            j6 = new abcd.Interfaceze.a("ANDROID", 0);     // Catch: java.lang.Throwable -> L8
            DW = new abcd.Interfaceze.a("JAVA", 1);     // Catch: java.lang.Throwable -> L8
            FH = new abcd.Interfaceze.a("WEBSITE", 2);     // Catch: java.lang.Throwable -> L8
            Hw = new abcd.Interfaceze.a("JAVASCRIPT", 3);     // Catch: java.lang.Throwable -> L8
            v5 = new abcd.Interfaceze.a[]{j6, DW, FH, Hw};     // Catch: java.lang.Throwable -> L8
            return;
        L8:
            th = move-exception;
            if (VH == false) goto L12;
            abcd.wu.j6(th, 1952775956320630320L, null);
        L12:
            throw th;
        }

        @abcd.Interfacesu(method = -21109671708643977L)
        private a(java.lang.String r8, int r9) {
        L7:
            th = move-exception;
            if (VH == false) goto L11;
            abcd.wu.j6(th, -1469245076757936909L, null, r8, new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if (Zo == false) goto L5;
            abcd.wu.j6(-1469245076757936909L, null, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            super(r8, r9);     // Catch: java.lang.Throwable -> L7
        }

        public static abcd.Interfaceze.a valueOf(java.lang.String r5) {
        L8:
            th = move-exception;
            if (VH == false) goto L12;
            abcd.wu.j6(th, -125781036344767424L, null, r5);
        L12:
            throw th;
        L4:
            if (Zo == false) goto L6;
            abcd.wu.j6(-125781036344767424L, null, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return (abcd.Interfaceze.a) java.lang.Enum.valueOf(abcd.Interfaceze.a.class, r5);
        }

        public static abcd.Interfaceze.a[] values() {
        L8:
            th = move-exception;
            if (VH == false) goto L12;
            abcd.wu.j6(th, 438565460104147908L, null);
        L12:
            throw th;
        L4:
            if (Zo == false) goto L6;
            abcd.wu.j6(438565460104147908L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            return (abcd.Interfaceze.a[]) v5.clone();
        }
    }

    abcd.Interfaceze.a Zo();

    int j6();
}
