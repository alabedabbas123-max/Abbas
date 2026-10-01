package abcd;

public class lO {
    private boolean DW;
    private abcd.WN FH;
    private abcd.WN Hw;
    private abcd.AP j6;
    private abcd._N v5;

    public lO(abcd.AP r2) {
        this(r2, new abcd.hO());
    }

    public lO(abcd.AP r1, abcd._N r2) {
        this.j6 = r1;
        this.v5 = r2;
    }

    private abcd.kO j6(abcd.InterfacevP r9, abcd.XM r10) {
        if (this.DW == false) goto L7;
        return new abcd.kO(r10, r9, this.j6, this.v5, true);
    L7:
        if (this.FH != null) goto L14;
        if (this.Hw != null) goto L14;
        return new abcd.kO(r10, r9, this.j6, this.v5);
    L14:
        if (this.FH != null) goto L17;
        this.FH = new abcd.iO();
    L17:
        return new abcd.kO(r10, r9, this.j6, this.v5, this.FH, this.Hw);
    }

    public abcd.lO DW(abcd.WN r1) {
        this.Hw = r1;
        return this;
    }

    public abcd.kO j6(abcd.InterfacevP r4, abcd.SN r5) {
        abcd.kO r6 = j6(r4, new abcd.XM(new abcd.VM(r5.j6())));
        r6.j6(r5);
        return r6;
    }

    public abcd.kO j6(abcd.InterfacevP r3, byte[] r4) {
        return j6(r3, new abcd.XM(new abcd.pM(r4)));
    }

    public abcd.lO j6(abcd.WN r1) {
        this.FH = r1;
        return this;
    }

    public abcd.lO j6(boolean r1) {
        this.DW = r1;
        return this;
    }
}
