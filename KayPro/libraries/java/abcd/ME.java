package abcd;

public interface ME {

    public static final enum a extends java.lang.Enum<abcd.ME.a> {
        public static final abcd.ME.a DW = null;
        public static final abcd.ME.a FH = null;
        public static final abcd.ME.a Hw = null;
        private static final abcd.ME.a[] Zo = null;
        public static final abcd.ME.a j6 = null;
        public static final abcd.ME.a v5 = null;
        private final boolean VH;
        private final boolean gn;

        static {
            j6 = new abcd.ME.a("NEW", 0, true, false);
            DW = new abcd.ME.a("LOOSE", 1, true, false);
            FH = new abcd.ME.a("PACKED", 2, false, true);
            Hw = new abcd.ME.a("LOOSE_PACKED", 3, true, true);
            v5 = new abcd.ME.a("NETWORK", 4, false, false);
            Zo = new abcd.ME.a[]{j6, DW, FH, Hw, v5};
        }

        private a(java.lang.String r1, int r2, boolean r3, boolean r4) {
            super(r1, r2);
            this.VH = r3;
            this.gn = r4;
        }

        public static abcd.ME.a valueOf(java.lang.String r1) {
            return (abcd.ME.a) java.lang.Enum.valueOf(abcd.ME.a.class, r1);
        }

        public static abcd.ME.a[] values() {
            abcd.ME.a[] r0 = Zo;
            int r1 = r0.length;
            abcd.ME.a[] r2 = new abcd.ME.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }

        public boolean Hw() {
            return this.VH;
        }

        public boolean Zo() {
            return this.gn;
        }
    }

    abcd.yE DW();

    abcd.yE FH();

    boolean Hw();

    boolean Zo();

    java.lang.String getName();

    abcd.ME getTarget();

    abcd.ME.a j6();

    abcd.ME v5();
}
