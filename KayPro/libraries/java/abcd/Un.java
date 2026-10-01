package abcd;

public final class Un {
    private abcd.ho DW;
    private abcd.InterfacePn FH;
    private abcd.Rn Hw;
    private abcd.Wn VH;
    private abcd.co Zo;
    private final int j6;
    private abcd.io v5;

    public interface a {
        int j6(abcd.Abstractms r1);
    }

    public Un(int r1, abcd.ho r2, abcd.InterfacePn r3) {
        if (r2 == null) goto L10;
        if (r3 == null) goto L8;
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = null;
        this.v5 = null;
        this.Zo = null;
        this.VH = null;
        return;
    L8:
        throw new java.lang.NullPointerException("unprocessedCatches == null");
    L10:
        throw new java.lang.NullPointerException("unprocessedInsns == null");
    }

    private void tp() {
        if (this.VH == null) goto L5;
        return;
    L5:
        this.VH = this.DW.j6();
        this.v5 = abcd.io.j6(this.VH, this.j6);
        this.Zo = abcd.co.j6(this.VH);
        this.Hw = this.FH.build();
        this.DW = null;
        this.FH = null;
    }

    public abcd.Rn DW() {
        tp();
        return this.Hw;
    }

    public java.util.HashSet<abcd.Abstractms> FH() {
        return this.DW.DW();
    }

    public abcd.Wn Hw() {
        tp();
        return this.VH;
    }

    public boolean VH() {
        return this.FH.DW();
    }

    public abcd.io Zo() {
        tp();
        return this.v5;
    }

    public boolean gn() {
        return this.DW.FH();
    }

    public java.util.HashSet<abcd.Qs> j6() {
        return this.FH.j6();
    }

    public void j6(abcd.Un.a r2) {
        this.DW.j6(r2);
    }

    public boolean u7() {
        if (this.j6 != 1) goto L5;
    L7:
        return false;
    L5:
        if (this.DW.Hw() == false) goto L7;
        return true;
    }

    public abcd.co v5() {
        tp();
        return this.Zo;
    }
}
