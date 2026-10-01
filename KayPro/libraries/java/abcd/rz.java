package abcd;

public class rz {
    private final abcd.Interfacenz DW;
    private final abcd.Interfaceqz FH;
    private final int j6;

    public rz(int r1, abcd.Interfacenz r2, abcd.Interfaceqz r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    public rz(abcd.Interfacenz r2, abcd.Interfaceqz r3) {
        this(0, r2, r3);
    }

    public abcd.rz DW() {
        return new abcd.rz(this.DW, this.FH);
    }

    public abcd.rz FH() {
        return new abcd.rz(this.j6 + 1, this.DW, this.FH);
    }

    public long j6() {
        return this.DW.j6(this.j6);
    }
}
