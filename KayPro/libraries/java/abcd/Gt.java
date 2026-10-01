package abcd;

class Gt {
    static final int[] j6 = null;

    static {
        j6 = new int[abcd.Ht.a.values().length];
        j6[abcd.Ht.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L7
    L10:
        j6[abcd.Ht.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L8
    L12:
        j6[abcd.Ht.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L9
        return;
    }
}
