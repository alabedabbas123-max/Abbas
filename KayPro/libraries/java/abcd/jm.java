package abcd;

public final class jm extends abcd.AbstractAm {
    private final int DW;
    private final int FH;
    private final abcd.Lm Hw;
    private final abcd.Interfacepn Zo;
    private final abcd.Jm v5;

    public jm(int r2, int r3, abcd.Lm r4, abcd.Jm r5, abcd.Interfacepn r6) {
        super("Code");
        if (r2 < 0) goto L25;
        if (r3 < 0) goto L23;
        if (r4 == null) goto L21;
        if (r5.Zo() == true) goto L17;
        if (r6.Zo() == true) goto L13;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        this.Zo = r6;
        return;
    L13:
        throw new abcd.iu("attributes.isMutable()");     // Catch: java.lang.NullPointerException -> L14
    L15:
        throw new java.lang.NullPointerException("attributes == null");
    L17:
        throw new abcd.iu("catches.isMutable()");     // Catch: java.lang.NullPointerException -> L18
    L19:
        throw new java.lang.NullPointerException("catches == null");
    L21:
        throw new java.lang.NullPointerException("code == null");
    L23:
        throw new java.lang.IllegalArgumentException("maxLocals < 0");
    L25:
        throw new java.lang.IllegalArgumentException("maxStack < 0");
    }

    public abcd.Jm DW() {
        return this.v5;
    }

    public abcd.Lm FH() {
        return this.Hw;
    }

    @Override
    public int Hw() {
        return ((this.Hw.j6() + 10) + this.v5.Hw()) + this.Zo.Hw();
    }

    public int Zo() {
        return this.DW;
    }

    public abcd.Interfacepn j6() {
        return this.Zo;
    }

    public int v5() {
        return this.FH;
    }
}
