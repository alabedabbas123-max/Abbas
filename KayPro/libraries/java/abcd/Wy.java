package abcd;

class Wy {
    static final int[] j6 = null;

    static {
        j6 = new int[abcd.Xy.d.values().length];
        j6[abcd.Xy.d.DW.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L6
    L8:
        j6[abcd.Xy.d.FH.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L7
        return;
    }
}
