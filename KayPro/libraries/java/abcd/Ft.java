package abcd;

public class Ft {
    private final java.util.ArrayList<abcd.Interfacebu> j6;

    public Ft(int r4) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = new java.util.ArrayList(r4);
                    r0 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 >= r4) { $pc0 = 5; continue $sw0; }
                    this.j6.add(abcd.st.DW(r4));
                    r0 = r0 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r4) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6.size();
                    this.j6.ensureCapacity(r4);
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r0 >= r4) { $pc1 = 5; continue $sw1; }
                    this.j6.add(abcd.st.DW(r4));
                    r0 = r0 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r2, int r3) {
        j6(java.lang.Math.max(r2, r3) + 1);
        this.j6.get(r2).add(r3);
        this.j6.get(r3).add(r2);
    }

    public void j6(int r2, abcd.Interfacebu r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 >= this.j6.size()) { $pc2 = 6; continue $sw2; }
                    r3.j6(this.j6.get(r2));
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
