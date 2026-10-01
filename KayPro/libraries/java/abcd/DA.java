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
        int r0 = 0;
        java.util.Iterator<abcd.EA> r1 = null;
        abcd.EA r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.DW++;
                    r0 = (this.DW * 100) / this.j6;
                    r1 = this.Hw.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    r2 = r1.next();
                    this.FH.j6(r6);
                    this.FH.j6(r0);
                    this.FH.DW(r5);
                    r2.j6(this.FH);
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
