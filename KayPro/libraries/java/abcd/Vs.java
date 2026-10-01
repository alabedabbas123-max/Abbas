package abcd;

class Vs extends abcd.Abstractqt {
    final abcd.bs DW;
    final abcd.Ws FH;
    final abcd.bs j6;

    Vs(abcd.Ws r1, abcd.bs r2, abcd.bs r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public int j6() {
        return abcd.Ws.j6(this.FH).u7();
    }

    @Override
    public abcd.bs j6(abcd.bs r3) {
        if (r3.we() == this.j6.we()) goto L5;
        return r3;
    L5:
        return this.DW.j6(r3.Zo());
    }
}
