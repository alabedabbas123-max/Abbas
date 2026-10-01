package abcd;

class yH {
    static final gE.b<abcd.yH> j6 = null;
    private final int DW;
    private final boolean FH;
    private final boolean Hw;

    static {
        j6 = new abcd.xH();
    }

    private yH(abcd.gE r4) {
        this.DW = ((abcd.jE) r4.j6(abcd.jE.j6)).j6();
        this.FH = r4.j6("core", "fsyncobjectfiles", false);
        this.Hw = r4.j6("core", "fsyncreffiles", false);
    }

    yH(abcd.gE r1, abcd.yH r2) {
        this(r1);
    }

    boolean DW() {
        return this.FH;
    }

    boolean FH() {
        return this.Hw;
    }

    int j6() {
        return this.DW;
    }
}
