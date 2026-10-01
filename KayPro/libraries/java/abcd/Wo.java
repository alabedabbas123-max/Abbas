package abcd;

public final class Wo extends abcd.AbstractGp {
    private final abcd.C0418Vo[] Zo;
    private final abcd.Jr v5;

    public Wo(abcd.Jr r5) {
        java.util.Iterator<abcd.Hr> r6 = null;
        int r0 = 0;
        abcd.Hr r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(4, j6(r5));
                    this.v5 = r5;
                    this.Zo = new abcd.C0418Vo[r5.size()];
                    r6 = r5.lg().iterator();
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r6.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    r1 = r6.next();
                    this.Zo[r0] = new abcd.C0418Vo(r1);
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(abcd.Jr r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return (r1.size() * 4) + 4;
                }
                case 6: {
                    throw new java.lang.NullPointerException("list == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected int DW(abcd.AbstractGp r2) {
        return this.v5.DW(((abcd.Wo) r2).v5);
    }

    @Override
    protected void DW(abcd.AbstractKp r1, int r2) {
        abcd.C0418Vo.j6(this.Zo);
    }

    @Override
    protected void DW(abcd.jp r7, abcd.Lt r8) {
        boolean r9 = false;
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r9 = r8.Hw();
                    r0 = this.Zo.length;
                    r2 = 0;
                    if (r9 == false) { $pc2 = 5; continue $sw2; }
                    r8.j6(0, Ws() + " annotation set");
                    r8.j6(4, "  size: " + abcd.Yt.gn(r0));
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r8.writeInt(r0);
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r2 >= r0) { $pc2 = 11; continue $sw2; }
                    r3 = this.Zo[r2].we();
                    if (r9 == false) { $pc2 = 10; continue $sw2; }
                    r8.j6(4, "  entries[" + java.lang.Integer.toHexString(r2) + "]: " + abcd.Yt.gn(r3));
                    this.Zo[r2].j6(r8, "    ");
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    r8.writeInt(r3);
                    r2 = r2 + 1;
                    { $pc2 = 6; continue $sw2; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.EQ;
    }

    @Override
    public java.lang.String aM() {
        return this.v5.toString();
    }

    public int hashCode() {
        return this.v5.hashCode();
    }

    @Override
    public void j6(abcd.jp r5) {
        abcd.Fp r6 = null;
        int r0 = 0;
        int r1 = 0;
        abcd.C0418Vo[] r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r6 = r5.j6();
                    r0 = this.Zo.length;
                    r1 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r1 >= r0) { $pc3 = 5; continue $sw3; }
                    r2 = this.Zo;
                    r2[r1] = (abcd.C0418Vo) r6.DW(r2[r1]);
                    r1 = r1 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
