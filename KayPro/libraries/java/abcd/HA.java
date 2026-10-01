package abcd;

public class HA {
    private static abcd.InterfacetA j6;
    public int DW;
    public short FH;
    public short Hw;
    public int VH;
    public short Zo;
    public int gn;
    public java.lang.String u7;
    public short v5;

    public HA() {
        this.DW = 101010256;
        this.FH = 0;
        this.Hw = 0;
    }

    private void DW(abcd.LA r7) {
        boolean r0 = j6().isDebugEnabled();
        this.FH = r7.Hw();
        if (r0 == false) goto L5;
        j6.FH(java.lang.String.format("This disk number: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.FH)}));
    L5:
        this.Hw = r7.Hw();
        if (r0 == false) goto L8;
        j6.FH(java.lang.String.format("Central dir start disk number: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.Hw)}));
    L8:
        this.v5 = r7.Hw();
        if (r0 == false) goto L11;
        j6.FH(java.lang.String.format("Central entries on this disk: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.v5)}));
    L11:
        this.Zo = r7.Hw();
        if (r0 == false) goto L14;
        j6.FH(java.lang.String.format("Total number of central entries: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.Zo)}));
    L14:
        this.VH = r7.FH();
        if (r0 == false) goto L17;
        j6.FH(java.lang.String.format("Central directory size: 0x%08x", new java.lang.Object[]{java.lang.Integer.valueOf(this.VH)}));
    L17:
        this.gn = r7.FH();
        if (r0 == false) goto L20;
        j6.FH(java.lang.String.format("Central directory offset: 0x%08x", new java.lang.Object[]{java.lang.Integer.valueOf(this.gn)}));
    L20:
        this.u7 = r7.DW(r7.Hw());
        if (r0 == false) goto L24;
        j6.FH(".ZIP file comment: " + this.u7);
        return;
    }

    public static abcd.HA j6(abcd.LA r4) {
        if (r4.FH() == 101010256) goto L6;
        r4.j6(r4.DW() - 4);
        return null;
    L6:
        abcd.HA r0 = new abcd.HA();
        r0.DW(r4);
        return r0;
    }

    public static abcd.InterfacetA j6() {
        if (j6 != null) goto L6;
        j6 = abcd.uA.j6(abcd.HA.class.getName());
    L6:
        return j6;
    }

    public void j6(abcd.NA r2) {
        j6().isDebugEnabled();
        r2.j6(this.DW);
        r2.j6(this.FH);
        r2.j6(this.Hw);
        r2.j6(this.v5);
        r2.j6(this.Zo);
        r2.j6(this.VH);
        r2.j6(this.gn);
        r2.j6((short) this.u7.length());
        r2.j6(this.u7);
    }
}
