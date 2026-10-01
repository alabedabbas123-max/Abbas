package abcd;

class Ep {
    static final int[] j6 = null;

    static {
        j6 = new int[abcd.Fp.a.values().length];
        j6[abcd.Fp.a.FH.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L6
    L8:
        j6[abcd.Fp.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L7
        return;
    }
}
