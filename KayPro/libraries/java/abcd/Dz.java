package abcd;

class Dz {
    static final int[] j6 = null;

    static {
        j6 = new int[abcd.Fz.values().length];
        j6[abcd.Fz.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L8
    L12:
        j6[abcd.Fz.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L9
    L14:
        j6[abcd.Fz.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L10
    L18:
        j6[abcd.Fz.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L11
        return;
    }
}
