package abcd;

public class hG extends java.util.AbstractSet<abcd.fG> {
    private final java.util.List<abcd.fG> DW;
    int j6;

    public hG() {
        this.DW = new java.util.ArrayList();
    }

    @Override
    public boolean add(java.lang.Object r1) {
        return j6((abcd.fG) r1);
    }

    @Override
    public boolean contains(java.lang.Object r3) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r3 instanceof abcd.fG) == false) { $pc0 = 8; continue $sw0; }
                    r0 = this.j6;
                    if ((((abcd.fG) r3).Hw & r0) == 0) { $pc0 = 8; continue $sw0; }
                    return true;
                }
                case 8: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean containsAll(java.util.Collection<?> r2) {
        int r3 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r2 instanceof abcd.hG) == false) { $pc1 = 11; continue $sw1; }
                    r3 = ((abcd.hG) r2).j6;
                    if ((this.j6 & r3) != r3) { $pc1 = 8; continue $sw1; }
                    return true;
                }
                case 8: {
                    return false;
                }
                case 11: {
                    return super.containsAll(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Iterator<abcd.fG> iterator() {
        return new abcd.gG(this, this.DW.iterator());
    }

    public boolean j6(abcd.fG r5) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.j6;
                    r1 = r5.Hw;
                    r3 = 0;
                    if ((r0 & r1) == 0) { $pc2 = 5; continue $sw2; }
                    return false;
                }
                case 5: {
                    this.j6 = r0 | r1;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r3 >= this.DW.size()) { $pc2 = 12; continue $sw2; }
                    if (this.DW.get(r3).Hw >= r5.Hw) { $pc2 = 12; continue $sw2; }
                    r3 = r3 + 1;
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    this.DW.add(r3, r5);
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean remove(java.lang.Object r5) {
        abcd.fG r6 = null;
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r6 = (abcd.fG) r5;
                    r0 = this.j6;
                    r1 = r6.Hw;
                    r3 = 0;
                    if ((r0 & r1) != 0) { $pc3 = 5; continue $sw3; }
                    return false;
                }
                case 5: {
                    this.j6 = r0 & (r1 ^ (-1));
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r3 >= this.DW.size()) { $pc3 = 8; continue $sw3; }
                    if (this.DW.get(r3).Hw != r6.Hw) { $pc3 = 13; continue $sw3; }
                    this.DW.remove(r3);
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    r3 = r3 + 1;
                    { $pc3 = 7; continue $sw3; }
                }
                case 8: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int size() {
        return this.DW.size();
    }
}
