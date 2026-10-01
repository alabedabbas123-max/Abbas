package abcd;

public class IO extends abcd.AbstractyO {
    public IO() {
    }

    @Override
    public int DW() {
        return 48;
    }

    @Override
    public int j6(byte[] r4, int r5) {
        FH();
        abcd.ZO.j6(this.Zo, r4, r5);
        abcd.ZO.j6(this.VH, r4, r5 + 8);
        abcd.ZO.j6(this.gn, r4, r5 + 16);
        abcd.ZO.j6(this.u7, r4, r5 + 24);
        abcd.ZO.j6(this.tp, r4, r5 + 32);
        abcd.ZO.j6(this.EQ, r4, r5 + 40);
        reset();
        return 48;
    }

    @Override
    public java.lang.String j6() {
        return "SHA-384";
    }

    @Override
    public void reset() {
        super.reset();
        this.Zo = -3766243637369397544L;
        this.VH = 7105036623409894663L;
        this.gn = -7973340178411365097L;
        this.u7 = 1526699215303891257L;
        this.tp = 7436329637833083697L;
        this.EQ = -8163818279084223215L;
        this.we = -2662702644619276377L;
        this.J0 = 5167115440072839076L;
    }
}
