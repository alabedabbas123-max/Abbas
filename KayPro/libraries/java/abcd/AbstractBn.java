package abcd;

public abstract class AbstractBn implements abcd.Interfacetn {
    private final int DW;
    private final abcd.Hs FH;
    private final abcd.Interfacepn Hw;
    private final abcd.Ks j6;

    public AbstractBn(abcd.Ks r1, int r2, abcd.Hs r3, abcd.Interfacepn r4) {
        if (r1 == null) goto L13;
        if (r3 == null) goto L11;
        if (r4 == null) goto L9;
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        return;
    L9:
        throw new java.lang.NullPointerException("attributes == null");
    L11:
        throw new java.lang.NullPointerException("nat == null");
    L13:
        throw new java.lang.NullPointerException("definingClass == null");
    }

    @Override
    public final abcd.Ks DW() {
        return this.j6;
    }

    @Override
    public final abcd.Hs FH() {
        return this.FH;
    }

    @Override
    public final abcd.Js Hw() {
        return this.FH.VH();
    }

    @Override
    public final abcd.Interfacepn getAttributes() {
        return this.Hw;
    }

    @Override
    public final abcd.Js getName() {
        return this.FH.J8();
    }

    @Override
    public final int j6() {
        return this.DW;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append(getClass().getName());
        r0.append('{');
        r0.append(this.FH.aM());
        r0.append('}');
        return r0.toString();
    }
}
