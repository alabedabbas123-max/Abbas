package abcd;

public final class xp extends abcd.AbstractGp {
    private final abcd.Abstractvp VH;
    private final abcd.AbstractKp Zo;
    private final abcd.Abstractvp gn;
    private final int u7;
    private final abcd.Enumwp v5;

    private xp(abcd.AbstractKp r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(4, 12);
                    if (r3 == null) { $pc0 = 7; continue $sw0; }
                    this.v5 = abcd.Enumwp.gn;
                    this.Zo = r3;
                    this.VH = null;
                    this.gn = null;
                    this.u7 = 1;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("section == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private xp(abcd.Enumwp r3, abcd.AbstractKp r4, abcd.Abstractvp r5, abcd.Abstractvp r6, int r7) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    super(4, 12);
                    if (r3 == null) { $pc1 = 19; continue $sw1; }
                    if (r4 == null) { $pc1 = 17; continue $sw1; }
                    if (r5 == null) { $pc1 = 15; continue $sw1; }
                    if (r6 == null) { $pc1 = 13; continue $sw1; }
                    if (r7 <= 0) { $pc1 = 11; continue $sw1; }
                    this.v5 = r3;
                    this.Zo = r4;
                    this.VH = r5;
                    this.gn = r6;
                    this.u7 = r7;
                    return;
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("itemCount <= 0");
                }
                case 13: {
                    throw new java.lang.NullPointerException("lastItem == null");
                }
                case 15: {
                    throw new java.lang.NullPointerException("firstItem == null");
                }
                case 17: {
                    throw new java.lang.NullPointerException("section == null");
                }
                case 19: {
                    throw new java.lang.NullPointerException("type == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(abcd.AbstractKp[] r16, abcd.Fp r17) {
        java.util.ArrayList r2 = null;
        int r3 = 0;
        int r5 = 0;
        abcd.AbstractKp r12 = null;
        java.util.Iterator<? extends abcd.Abstractvp> r13 = null;
        abcd.Enumwp r7 = null;
        abcd.Abstractvp r9 = null;
        abcd.Abstractvp r10 = null;
        int r11 = 0;
        abcd.Abstractvp r14 = null;
        abcd.Enumwp r15 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r16 == null) { $pc2 = 27; continue $sw2; }
                    if (r17.Hw().size() != 0) { $pc2 = 25; continue $sw2; }
                    r2 = new java.util.ArrayList(50);
                    r3 = r16.length;
                    r5 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r5 >= r3) { $pc2 = 22; continue $sw2; }
                    r12 = r16[r5];
                    r13 = r12.Hw().iterator();
                    r7 = null;
                    r9 = null;
                    r10 = null;
                    r11 = 0;
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    if (r13.hasNext() == false) { $pc2 = 17; continue $sw2; }
                    r14 = r13.next();
                    r15 = r14.Hw();
                    if (r15 == r7) { $pc2 = 16; continue $sw2; }
                    if (r11 == 0) { $pc2 = 15; continue $sw2; }
                    r2.add(new abcd.xp(r7, r12, r9, r10, r11));
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    r9 = r14;
                    r7 = r15;
                    r11 = 0;
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    r11 = r11 + 1;
                    r10 = r14;
                    { $pc2 = 10; continue $sw2; }
                }
                case 17: {
                    if (r11 == 0) { $pc2 = 19; continue $sw2; }
                    r2.add(new abcd.xp(r7, r12, r9, r10, r11));
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    r5 = r5 + 1;
                    { $pc2 = 7; continue $sw2; }
                }
                case 19: {
                    if (r12 != r17) { $pc2 = 21; continue $sw2; }
                    r2.add(new abcd.xp(r17));
                    { $pc2 = 21; continue $sw2; }
                }
                case 22: {
                    r17.j6(new abcd.Tp(abcd.Enumwp.gn, r2));
                    return;
                }
                case 25: {
                    throw new java.lang.IllegalArgumentException("mapSection.items().size() != 0");
                }
                case 27: {
                    throw new java.lang.NullPointerException("sections == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void DW(abcd.jp r6, abcd.Lt r7) {
        int r8 = 0;
        abcd.Abstractvp r0 = null;
        int r1 = 0;
        java.lang.StringBuilder r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r8 = this.v5.Hw();
                    r0 = this.VH;
                    if (r0 != null) { $pc3 = 5; continue $sw3; }
                    r1 = this.Zo.FH();
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r7.Hw() == false) { $pc3 = 9; continue $sw3; }
                    r7.j6(0, Ws() + ' ' + this.v5.Zo() + " map");
                    r7.j6(2, "  type:   " + abcd.Yt.v5(r8) + " // " + this.v5.toString());
                    r7.j6(2, "  unused: 0");
                    r2 = new java.lang.StringBuilder();
                    r2.append("  size:   ");
                    r2.append(abcd.Yt.gn(this.u7));
                    r7.j6(4, r2.toString());
                    r7.j6(4, "  offset: " + abcd.Yt.gn(r1));
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    r7.writeShort(r8);
                    r7.writeShort(0);
                    r7.writeInt(this.u7);
                    r7.writeInt(r1);
                    return;
                }
                case 5: {
                    r1 = this.Zo.j6(r0);
                    { $pc3 = 7; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.j3;
    }

    @Override
    public final java.lang.String aM() {
        return toString();
    }

    @Override
    public void j6(abcd.jp r1) {
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append(abcd.xp.class.getName());
        r0.append('{');
        r0.append(this.Zo.toString());
        r0.append(' ');
        r0.append(this.v5.aM());
        r0.append('}');
        return r0.toString();
    }
}
