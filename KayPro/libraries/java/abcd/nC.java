package abcd;

public class nC<S extends abcd.CC> {
    private final S DW;
    private final S FH;
    private lC<S> Hw;
    private final DC<? super S> j6;
    private lC<S> v5;

    public nC(DC<? super S> r1, S r2, S r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    private lC<S> j6(S r5) {
        int r0 = r5.j6();
        int[] r1 = new int[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1[r2] = this.j6.j6(r5, r2);
        r2 = r2 + 1;
        goto L3
    L5:
        return new abcd.lC(r5, r1);
    }

    public lC<S> DW() {
        if (this.v5 != null) goto L6;
        this.v5 = j6(this.FH);
    L6:
        return this.v5;
    }

    public mC<S> FH() {
        return new abcd.mC(this.j6);
    }

    public lC<S> j6() {
        if (this.Hw != null) goto L6;
        this.Hw = j6(this.DW);
    L6:
        return this.Hw;
    }
}
