package abcd;

public abstract class AbstracteC {
    private static int[] DW;
    private static int[] j6;

    public static final enum a extends java.lang.Enum<abcd.AbstracteC.a> {
        public static final abcd.AbstracteC.a DW = null;
        private static final abcd.AbstracteC.a[] FH = null;
        public static final abcd.AbstracteC.a j6 = null;

        static {
            j6 = new abcd.AbstracteC.a("MYERS", 0);
            DW = new abcd.AbstracteC.a("HISTOGRAM", 1);
            FH = new abcd.AbstracteC.a[]{j6, DW};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.AbstracteC.a valueOf(java.lang.String r1) {
            return (abcd.AbstracteC.a) java.lang.Enum.valueOf(abcd.AbstracteC.a.class, r1);
        }

        public static abcd.AbstracteC.a[] values() {
            abcd.AbstracteC.a[] r0 = FH;
            int r1 = r0.length;
            abcd.AbstracteC.a[] r2 = new abcd.AbstracteC.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public AbstracteC() {
    }

    static int[] DW() {
        int[] r0 = DW;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.jC.a.values().length];
        r1[abcd.jC.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L12
    L16:
        r1[abcd.jC.a.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L13
    L20:
        r1[abcd.jC.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L14
    L22:
        r1[abcd.jC.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L15
    L10:
        DW = r1;
        return r1;
    }

    public static abcd.AbstracteC j6(abcd.AbstracteC.a r1) {
        int r2 = j6()[r1.ordinal()];
        if (r2 == 1) goto L11;
        if (r2 != 2) goto L9;
        return new abcd.oC();
    L9:
        throw new java.lang.IllegalArgumentException();
    L11:
        return abcd.sC.j6;
    }

    private static <S extends abcd.CC> abcd.jC j6(S r2, S r3) {
        return new abcd.jC(0, r2.j6(), 0, r3.j6());
    }

    static int[] j6() {
        int[] r0 = j6;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.AbstracteC.a.values().length];
        r1[abcd.AbstracteC.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L10
    L12:
        r1[abcd.AbstracteC.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L11
    L8:
        j6 = r1;
        return r1;
    }

    public abstract <S extends abcd.CC> abcd.kC DW(DC<? super S> r1, S r2, S r3);

    public <S extends abcd.CC> abcd.kC j6(DC<? super S> r5, S r6, S r7) {
        abcd.jC r0 = r5.j6(r6, r7, j6(r6, r7));
        int r1 = DW()[r0.gn().ordinal()];
        if (r1 == 1) goto L24;
        if (r1 == 2) goto L24;
        if (r1 != 3) goto L9;
        DC<? super S> r2 = new abcd.HC(r5);
        abcd.GC r8 = abcd.GC.j6(r6, r0);
        abcd.GC r3 = abcd.GC.DW(r7, r0);
        abcd.kC r4 = DW(r2, r8, r3);
        abcd.GC.j6(r4, r8, r3);
        abcd.jC r9 = r4.get(r4.size() - 1);
        if (r9.gn() == abcd.jC.a.j6) goto L17;
    L22:
        return r4;
    L17:
        if (r9.Hw >= r7.j6()) goto L22;
        if (r5.j6(r7, r9.FH, r7, r9.Hw) == false) goto L22;
        r9.j6++;
        r9.DW++;
        r9.FH++;
        r9.Hw++;
        goto L17
    L9:
        if (r1 != 4) goto L13;
        return new abcd.kC(0);
    L13:
        throw new java.lang.IllegalStateException();
    L24:
        return abcd.kC.j6(r0);
    }
}
