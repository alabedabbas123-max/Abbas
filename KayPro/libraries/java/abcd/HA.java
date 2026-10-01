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
        boolean r0 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = j6().isDebugEnabled();
                    this.FH = r7.Hw();
                    if (r0 == false) { $pc0 = 5; continue $sw0; }
                    j6.FH(java.lang.String.format("This disk number: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.FH)}));
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.Hw = r7.Hw();
                    if (r0 == false) { $pc0 = 8; continue $sw0; }
                    j6.FH(java.lang.String.format("Central dir start disk number: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.Hw)}));
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    this.v5 = r7.Hw();
                    if (r0 == false) { $pc0 = 11; continue $sw0; }
                    j6.FH(java.lang.String.format("Central entries on this disk: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.v5)}));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    this.Zo = r7.Hw();
                    if (r0 == false) { $pc0 = 14; continue $sw0; }
                    j6.FH(java.lang.String.format("Total number of central entries: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.Zo)}));
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    this.VH = r7.FH();
                    if (r0 == false) { $pc0 = 17; continue $sw0; }
                    j6.FH(java.lang.String.format("Central directory size: 0x%08x", new java.lang.Object[]{java.lang.Integer.valueOf(this.VH)}));
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    this.gn = r7.FH();
                    if (r0 == false) { $pc0 = 20; continue $sw0; }
                    j6.FH(java.lang.String.format("Central directory offset: 0x%08x", new java.lang.Object[]{java.lang.Integer.valueOf(this.gn)}));
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    this.u7 = r7.DW(r7.Hw());
                    if (r0 == false) { $pc0 = 24; continue $sw0; }
                    j6.FH(".ZIP file comment: " + this.u7);
                    return;
                }
                case 24: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.HA j6(abcd.LA r4) {
        abcd.HA r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r4.FH() == 101010256) { $pc1 = 6; continue $sw1; }
                    r4.j6(r4.DW() - 4);
                    return null;
                }
                case 6: {
                    r0 = new abcd.HA();
                    r0.DW(r4);
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.InterfacetA j6() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (j6 != null) { $pc2 = 6; continue $sw2; }
                    j6 = abcd.uA.j6(abcd.HA.class.getName());
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
