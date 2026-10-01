package abcd;

public class bK {
    public static final gE.b<abcd.bK> j6 = null;
    private final boolean DW;
    private final abcd.jE.a FH;

    static {
        j6 = new abcd.aK();
    }

    private bK(abcd.gE r5) {
        this.DW = r5.j6("core", "filemode", true);
        this.FH = (abcd.jE.a) r5.j6("core", null, "autocrlf", abcd.jE.a.j6);
    }

    bK(abcd.gE r1, abcd.bK r2) {
        this(r1);
    }

    public boolean DW() {
        return this.DW;
    }

    public abcd.jE.a j6() {
        return this.FH;
    }
}
