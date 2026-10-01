package abcd;

class Uo {
    static final int[] j6 = null;

    static {
        j6 = new int[abcd.Ir.values().length];
        j6[abcd.Ir.DW.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L7
    L10:
        j6[abcd.Ir.j6.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L8
    L12:
        j6[abcd.Ir.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L9
        return;
    }
}
