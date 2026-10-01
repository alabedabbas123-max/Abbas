package abcd;

public class DA {
    private int DW;
    private abcd.CA FH;
    private java.util.ArrayList<abcd.EA> Hw;
    private int j6;

    public DA() {
        this.j6 = 0;
        this.DW = 0;
        this.FH = new abcd.CA();
        this.Hw = new java.util.ArrayList();
    }

    public void DW(int r1) {
        this.j6 = r1;
    }

    public void j6() {
        this.j6 = 10000;
        this.DW = 0;
    }

    public void j6(int r1) {
        this.DW = r1;
    }

    public void j6(int r5, java.lang.String r6) {
        this.DW++;
        int r0 = (this.DW * 100) / this.j6;
        java.util.Iterator<abcd.EA> r1 = this.Hw.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        abcd.EA r2 = r1.next();
        this.FH.j6(r6);
        this.FH.j6(r0);
        this.FH.DW(r5);
        r2.j6(this.FH);
        goto L4
    }
}
