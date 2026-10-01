package abcd;

public final class Tp<T extends abcd.AbstractGp> extends abcd.AbstractGp {
    private final java.util.List<T> Zo;
    private final abcd.Enumwp v5;

    public Tp(abcd.Enumwp r3, java.util.List<T> r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(j6(r4), DW(r4));
                    if (r3 == null) { $pc0 = 7; continue $sw0; }
                    this.Zo = r4;
                    this.v5 = r3;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("itemType == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int DW(java.util.List<? extends abcd.AbstractGp> r2) {
        abcd.AbstractGp r0 = r2.get(0);
        return (r2.size() * r0.VH()) + j6(r2);
    }

    private int Mr() {
        return J8();
    }

    private static int j6(java.util.List<? extends abcd.AbstractGp> r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return java.lang.Math.max(4, r2.get(0).J8());
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("items.size() == 0");
                }
                case 6: {
                    throw new java.lang.NullPointerException("items == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void DW(abcd.AbstractKp r8, int r9) {
        int r10 = 0;
        java.util.Iterator<T> r0 = null;
        int r1 = 0;
        boolean r2 = false;
        int r3 = 0;
        int r11 = 0;
        T r4 = null;
        int r5 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r10 = r9 + Mr();
                    r0 = this.Zo.iterator();
                    r1 = -1;
                    r2 = true;
                    r3 = r10;
                    r11 = -1;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc2 = 16; continue $sw2; }
                    r4 = r0.next();
                    r5 = r4.VH();
                    if (r2 == false) { $pc2 = 8; continue $sw2; }
                    r11 = r4.J8();
                    r1 = r5;
                    r2 = false;
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    r3 = r4.j6(r8, r3) + r5;
                    { $pc2 = 4; continue $sw2; }
                }
                case 8: {
                    if (r5 != r1) { $pc2 = 15; continue $sw2; }
                    if (r4.J8() == r11) { $pc2 = 11; continue $sw2; }
                    throw new java.lang.UnsupportedOperationException("item alignment mismatch");
                }
                case 15: {
                    throw new java.lang.UnsupportedOperationException("item size mismatch");
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void DW(abcd.jp r5, abcd.Lt r6) {
        int r0 = 0;
        java.lang.StringBuilder r2 = null;
        java.util.Iterator<T> r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.Zo.size();
                    if (r6.Hw() == false) { $pc3 = 5; continue $sw3; }
                    r6.j6(0, Ws() + " " + Zo());
                    r2 = new java.lang.StringBuilder();
                    r2.append("  size: ");
                    r2.append(abcd.Yt.gn(r0));
                    r6.j6(4, r2.toString());
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r6.writeInt(r0);
                    r1 = this.Zo.iterator();
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r1.hasNext() == false) { $pc3 = 9; continue $sw3; }
                    r1.next().j6(r5, r6);
                    { $pc3 = 7; continue $sw3; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Enumwp Hw() {
        return this.v5;
    }

    @Override
    public final java.lang.String aM() {
        java.lang.StringBuffer r0 = null;
        java.util.Iterator<T> r1 = null;
        boolean r2 = false;
        T r3 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.lang.StringBuffer(100);
                    r0.append("{");
                    r1 = this.Zo.iterator();
                    r2 = true;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc4 = 10; continue $sw4; }
                    r3 = r1.next();
                    if (r2 == false) { $pc4 = 8; continue $sw4; }
                    r2 = false;
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    r0.append(r3.aM());
                    { $pc4 = 4; continue $sw4; }
                }
                case 8: {
                    r0.append(", ");
                    { $pc4 = 9; continue $sw4; }
                }
                case 10: {
                    r0.append("}");
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final java.util.List<T> j3() {
        return this.Zo;
    }

    @Override
    public void j6(abcd.jp r3) {
        java.util.Iterator<T> r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.Zo.iterator();
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc5 = 6; continue $sw5; }
                    r0.next().j6(r3);
                    { $pc5 = 4; continue $sw5; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append(abcd.Tp.class.getName());
        r0.append(this.Zo);
        return r0.toString();
    }
}
