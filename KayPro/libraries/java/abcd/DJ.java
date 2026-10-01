package abcd;

public abstract class DJ {
    private static int[] j6;

    public static final enum a extends java.lang.Enum<abcd.DJ.a> {
        public static final abcd.DJ.a DW = null;
        public static final abcd.DJ.a FH = null;
        public static final abcd.DJ.a Hw = null;
        private static final abcd.DJ.a[] Zo = null;
        public static final abcd.DJ.a j6 = null;
        public static final abcd.DJ.a v5 = null;

        static {
            j6 = new abcd.DJ.a("USER", 0);
            DW = new abcd.DJ.a("PASS", 1);
            FH = new abcd.DJ.a("HOST", 2);
            Hw = new abcd.DJ.a("PORT", 3);
            v5 = new abcd.DJ.a("PATH", 4);
            Zo = new abcd.DJ.a[]{j6, DW, FH, Hw, v5};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.DJ.a valueOf(java.lang.String r1) {
            return (abcd.DJ.a) java.lang.Enum.valueOf(abcd.DJ.a.class, r1);
        }

        public static abcd.DJ.a[] values() {
            abcd.DJ.a[] r0 = Zo;
            int r1 = r0.length;
            abcd.DJ.a[] r2 = new abcd.DJ.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public DJ() {
    }

    static int[] j6() {
        int[] r0 = j6;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.DJ.a.values().length];
        r1[abcd.DJ.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L13
    L18:
        r1[abcd.DJ.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L14
    L24:
        r1[abcd.DJ.a.v5.ordinal()] = 5;     // Catch: java.lang.NoSuchFieldError -> L15
    L26:
        r1[abcd.DJ.a.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L16
    L20:
        r1[abcd.DJ.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L17
    L11:
        j6 = r1;
        return r1;
    }

    public abstract abcd.AbstractjJ DW(abcd.HJ r1, abcd.UE r2, java.lang.String r3);

    public abstract java.lang.String DW();

    public java.util.Set<abcd.DJ.a> FH() {
        return java.util.Collections.emptySet();
    }

    public java.util.Set<abcd.DJ.a> Hw() {
        return java.util.Collections.unmodifiableSet(java.util.EnumSet.of(abcd.DJ.a.v5));
    }

    public boolean j6(abcd.HJ r2) {
        return j6(r2, null, null);
    }

    public boolean j6(abcd.HJ r4, abcd.UE r5, java.lang.String r6) {
        if (v5().isEmpty() == false) goto L5;
    L7:
        java.util.Iterator<abcd.DJ.a> r7 = Hw().iterator();
    L9:
        if (r7.hasNext() == false) goto L10;
        abcd.DJ.a r0 = r7.next();
        int r1 = j6()[r0.ordinal()];
        if (r1 != 1) goto L39;
        if (r4.gn() == null) goto L69;
        if (r4.gn().length() != 0) goto L9;
    L69:
        return false;
    L39:
        if (r1 != 2) goto L41;
        if (r4.FH() == null) goto L64;
        if (r4.FH().length() != 0) goto L9;
    L64:
        return false;
    L41:
        if (r1 != 3) goto L43;
        if (r4.j6() == null) goto L59;
        if (r4.j6().length() != 0) goto L9;
    L59:
        return false;
    L43:
        if (r1 != 4) goto L45;
        if (r4.v5() > 0) goto L9;
        return false;
    L45:
        if (r1 != 5) goto L46;
        if (r4.Hw() == null) goto L51;
        if (r4.Hw().length() != 0) goto L9;
    L51:
        return false;
    L46:
        return false;
    L10:
        java.util.EnumSet r8 = java.util.EnumSet.copyOf(Hw());
        r8.addAll(FH());
        if (r4.gn() == null) goto L16;
        if (r8.contains(abcd.DJ.a.j6) == true) goto L16;
        return false;
    L16:
        if (r4.FH() == null) goto L21;
        if (r8.contains(abcd.DJ.a.DW) == true) goto L21;
        return false;
    L21:
        if (r4.j6() == null) goto L26;
        if (r8.contains(abcd.DJ.a.FH) == true) goto L26;
        return false;
    L26:
        if (r4.v5() <= 0) goto L31;
        if (r8.contains(abcd.DJ.a.Hw) == true) goto L31;
        return false;
    L31:
        if (r4.Hw() != null) goto L33;
    L35:
        return true;
    L33:
        if (r8.contains(abcd.DJ.a.v5) == true) goto L35;
        return false;
    L5:
        if (v5().contains(r4.VH()) == true) goto L7;
        return false;
    }

    public java.util.Set<java.lang.String> v5() {
        return java.util.Collections.emptySet();
    }
}
