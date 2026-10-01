package abcd;

public final class aq {
    private final int DW;
    private final int FH;
    private final int Hw;
    private final int VH;
    private final int Zo;
    private final int gn;
    private final abcd.iq j6;
    private final int tp;
    private final int u7;
    private final int v5;

    public aq(abcd.iq r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        this.Zo = r6;
        this.VH = r7;
        this.gn = r8;
        this.u7 = r9;
        this.tp = r10;
    }

    public int DW() {
        return this.gn;
    }

    public int FH() {
        return this.u7;
    }

    public int Hw() {
        return this.Zo;
    }

    public int VH() {
        return this.tp;
    }

    public int Zo() {
        return this.VH;
    }

    public int gn() {
        return this.v5;
    }

    public int j6() {
        return this.Hw;
    }

    public void j6(abcd.hr.a r2) {
        r2.VH();
        r2.writeInt(u7());
        r2.writeInt(j6());
        r2.writeInt(gn());
        r2.writeInt(Hw());
        r2.writeInt(Zo());
        r2.writeInt(DW());
        r2.writeInt(FH());
        r2.writeInt(VH());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 == null) { $pc0 = 5; continue $sw0; }
                    r0 = new java.lang.StringBuilder();
                    r0.append(this.j6.Hw().get(this.FH));
                    if (this.v5 == (-1)) { $pc0 = 10; continue $sw0; }
                    r0.append(" extends ");
                    r0.append(this.j6.Hw().get(this.v5));
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    return r0.toString();
                }
                case 5: {
                    return this.FH + " " + this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int u7() {
        return this.FH;
    }

    public int v5() {
        return this.DW;
    }
}
