package abcd;

public interface ME {

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.ME.a DW = new abcd.ME.a("LOOSE", 1, true, false);
        public static final abcd.ME.a FH = new abcd.ME.a("PACKED", 2, false, true);
        public static final abcd.ME.a Hw = new abcd.ME.a("LOOSE_PACKED", 3, true, true);
        private static final abcd.ME.a[] Zo = new abcd.ME.a[]{j6, DW, FH, Hw, v5};
        public static final abcd.ME.a j6 = new abcd.ME.a("NEW", 0, true, false);
        public static final abcd.ME.a v5 = new abcd.ME.a("NETWORK", 4, false, false);
        private final boolean VH;
        private final boolean gn;



        private a(java.lang.String r1, int r2, boolean r3, boolean r4) {
            super(r1, r2);
            this.VH = r3;
            this.gn = r4;
        }

        public static abcd.ME.a valueOf(java.lang.String r1) {
            return (abcd.ME.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.ME.a.values(), r1);
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
