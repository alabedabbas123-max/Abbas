package abcd;

public final class rs extends abcd.Bs {
    public static final abcd.rs DW = null;
    public static final abcd.rs FH = null;

    static {
        DW = new abcd.rs(false);
        FH = new abcd.rs(true);
    }

    private rs(boolean r1) {
        super(r1 ? 1 : 0);
    }

    public static abcd.rs j6(int r3) {
        if (r3 != 0) goto L6;
        return DW;
    L6:
        if (r3 != 1) goto L10;
        return FH;
    L10:
        throw new java.lang.IllegalArgumentException("bogus value: " + r3);
    }

    @Override
    public java.lang.String Zo() {
        return "boolean";
    }

    @Override
    public java.lang.String aM() {
        if (rN() == false) goto L5;
        return "true";
    L5:
        return "false";
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.DW;
    }

    public boolean rN() {
        if (Ws() != 0) goto L5;
        return false;
    L5:
        return true;
    }

    public java.lang.String toString() {
        if (rN() == false) goto L5;
        return "boolean{true}";
    L5:
        return "boolean{false}";
    }
}
