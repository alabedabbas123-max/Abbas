package abcd;

public class JO extends abcd.AbstractyO {
    public JO() {
    }

    @Override
    public int DW() {
        return 64;
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
        abcd.ZO.j6(this.we, r4, r5 + 48);
        abcd.ZO.j6(this.J0, r4, r5 + 56);
        reset();
        return 64;
    }

    @Override
    public java.lang.String j6() {
        return "SHA-512";
    }

    @Override
    public void reset() {
        super.reset();
        this.Zo = 7640891576956012808L;
        this.VH = -4942790177534073029L;
        this.gn = 4354685564936845355L;
        this.u7 = -6534734903238641935L;
        this.tp = 5840696475078001361L;
        this.EQ = -7276294671716946913L;
        this.we = 2270897969802886507L;
        this.J0 = 6620516959819538809L;
    }
}
