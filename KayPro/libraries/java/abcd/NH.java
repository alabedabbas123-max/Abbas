package abcd;

public class NH {
    private boolean DW;
    private int EQ;
    private boolean FH;
    private boolean Hw;
    private java.util.concurrent.Executor J0;
    private int J8;
    private int VH;
    private int Zo;
    private long gn;
    private int j6;
    private int tp;
    private long u7;
    private boolean v5;
    private int we;

    public NH(abcd.UE r3) {
        this.j6 = -1;
        this.DW = true;
        this.FH = true;
        this.Hw = false;
        this.v5 = true;
        this.Zo = 50;
        this.VH = 10;
        this.u7 = 52428800;
        this.tp = 100;
        this.EQ = 52428800;
        this.J8 = 2;
        j6(r3.Zo());
    }

    public int DW() {
        return this.j6;
    }

    public void DW(int r1) {
        this.j6 = r1;
    }

    public void DW(long r1) {
        this.gn = r1;
    }

    public void DW(boolean r1) {
        this.DW = r1;
    }

    public boolean EQ() {
        return this.Hw;
    }

    public int FH() {
        return this.tp;
    }

    public void FH(int r1) {
        this.tp = r1;
    }

    public void FH(boolean r1) {
        this.FH = r1;
    }

    public long Hw() {
        return this.u7;
    }

    public void Hw(int r2) {
        if (r2 > 2) goto L5;
        j6(false);
        return;
    L5:
        this.VH = r2;
    }

    public boolean J0() {
        return this.DW;
    }

    public boolean J8() {
        return this.FH;
    }

    public java.util.concurrent.Executor VH() {
        return this.J0;
    }

    public void VH(int r1) {
        this.we = r1;
    }

    public int Zo() {
        return this.VH;
    }

    public void Zo(int r1) {
        this.Zo = r1;
    }

    public int gn() {
        return this.J8;
    }

    public int j6() {
        return this.EQ;
    }

    public void j6(int r1) {
        this.EQ = r1;
    }

    public void j6(long r1) {
        this.u7 = r1;
    }

    public void j6(abcd.gE r5) {
        Zo(r5.j6("pack", "depth", u7()));
        Hw(r5.j6("pack", "window", Zo()));
        DW(r5.j6("pack", "windowmemory", v5()));
        j6(r5.j6("pack", "deltacachesize", Hw()));
        FH(r5.j6("pack", "deltacachelimit", FH()));
        DW(r5.j6("pack", "compression", r5.j6("core", "compression", DW())));
        v5(r5.j6("pack", "indexversion", gn()));
        j6(r5.j6("core", "bigfilethreshold", j6()));
        VH(r5.j6("pack", "threads", tp()));
        DW(r5.j6("pack", "reusedeltas", J0()));
        FH(r5.j6("pack", "reuseobjects", J8()));
        j6(r5.j6("pack", "deltacompression", we()));
    }

    public void j6(boolean r1) {
        this.v5 = r1;
    }

    public int tp() {
        return this.we;
    }

    public int u7() {
        return this.Zo;
    }

    public long v5() {
        return this.gn;
    }

    public void v5(int r1) {
        this.J8 = r1;
    }

    public boolean we() {
        return this.v5;
    }
}
