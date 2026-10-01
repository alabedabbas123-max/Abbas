package abcd;

public class XM extends abcd.AbstractyL implements abcd.InterfacepL {
    private abcd.InterfaceqL j6;

    public XM(abcd.AL r3) {
        this.j6 = new abcd.yM(false, 0, r3);
    }

    public XM(abcd.EL r1) {
        this.j6 = r1;
    }

    public XM(abcd.VM r1) {
        this.j6 = r1;
    }

    public static abcd.XM j6(java.lang.Object r3) {
        if (r3 == null) goto L21;
        if ((r3 instanceof abcd.XM) == true) goto L21;
        if ((r3 instanceof abcd.VM) == false) goto L11;
        return new abcd.XM((abcd.VM) r3);
    L11:
        if ((r3 instanceof abcd.AL) == false) goto L15;
        return new abcd.XM((abcd.AL) r3);
    L15:
        if ((r3 instanceof abcd.EL) == false) goto L19;
        return new abcd.XM((abcd.EL) r3);
    L19:
        throw new java.lang.IllegalArgumentException("Illegal object in SignerIdentifier: " + r3.getClass().getName());
    L21:
        return (abcd.XM) r3;
    }

    @Override
    public abcd.EL DW() {
        return this.j6.DW();
    }

    public boolean v5() {
        return this.j6 instanceof abcd.LL;
    }
}
