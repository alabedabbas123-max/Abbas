package abcd;

public abstract class AbstractcJ {
    private static abcd.AbstractcJ j6;

    static {
        j6 = new abcd.mI();
    }

    public AbstractcJ() {
    }

    public static abcd.AbstractcJ j6() {
        return j6;
    }

    public static void j6(abcd.AbstractcJ r0) {
        if (r0 == null) goto L4;
        j6 = r0;
        return;
    L4:
        j6 = new abcd.mI();
    }

    public abstract abcd.ZI j6(abcd.HJ r1, abcd.AbstractkI r2, abcd.AbstractpK r3, int r4);

    public void j6(abcd.ZI r1) {
        r1.disconnect();
    }
}
