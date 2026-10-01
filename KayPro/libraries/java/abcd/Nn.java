package abcd;

public final class Nn extends abcd.Abstractqo {
    private final abcd.Abstractms VH;
    private final java.util.ArrayList<abcd.Abstractms> Zo;
    private final int gn;
    private final int u7;
    private final abcd.Sn v5;

    public Nn(abcd.hs r2, abcd.Sn r3, java.util.ArrayList<abcd.Abstractms> r4, abcd.Abstractms r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r2, abcd.cs.FH);
                    if (r3 == null) { $pc0 = 40; continue $sw0; }
                    if (r4 == null) { $pc0 = 38; continue $sw0; }
                    if (r4.size() <= 0) { $pc0 = 36; continue $sw0; }
                    this.VH = r5;
                    if (r5 != abcd.Ks.J0) { $pc0 = 10; continue $sw0; }
                    $pc0 = 32; continue $sw0;
                }
                case 32: {
                    this.gn = 1;
                    $pc0 = 33; continue $sw0;
                }
                case 33: {
                    this.v5 = r3;
                    this.Zo = r4;
                    this.u7 = r4.size();
                    return;
                }
                case 10: {
                    if (r5 == abcd.Ks.we) { $pc0 = 32; continue $sw0; }
                    if (r5 != abcd.Ks.j3) { $pc0 = 15; continue $sw0; }
                    $pc0 = 31; continue $sw0;
                }
                case 31: {
                    this.gn = 2;
                    { $pc0 = 33; continue $sw0; }
                }
                case 15: {
                    if (r5 == abcd.Ks.J8) { $pc0 = 31; continue $sw0; }
                    if (r5 != abcd.Ks.aM) { $pc0 = 20; continue $sw0; }
                    $pc0 = 30; continue $sw0;
                }
                case 30: {
                    this.gn = 4;
                    { $pc0 = 33; continue $sw0; }
                }
                case 20: {
                    if (r5 == abcd.Ks.QX) { $pc0 = 30; continue $sw0; }
                    if (r5 != abcd.Ks.XL) { $pc0 = 25; continue $sw0; }
                    $pc0 = 29; continue $sw0;
                }
                case 29: {
                    this.gn = 8;
                    { $pc0 = 33; continue $sw0; }
                }
                case 25: {
                    if (r5 == abcd.Ks.Ws) { $pc0 = 29; continue $sw0; }
                    throw new java.lang.IllegalArgumentException("Unexpected constant type");
                }
                case 36: {
                    throw new java.lang.IllegalArgumentException("Illegal number of init values");
                }
                case 38: {
                    throw new java.lang.NullPointerException("values == null");
                }
                case 40: {
                    throw new java.lang.NullPointerException("user == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int DW() {
        return (((this.u7 * this.gn) + 1) / 2) + 4;
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r5) {
        return new abcd.Nn(VH(), this.v5, this.Zo, this.VH);
    }

    @Override
    protected java.lang.String j6() {
        java.lang.StringBuffer r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.lang.StringBuffer(100);
                    r1 = this.Zo.size();
                    r2 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r2 >= r1) { $pc1 = 6; continue $sw1; }
                    r0.append("\n    ");
                    r0.append(r2);
                    r0.append(": ");
                    r0.append(this.Zo.get(r2).aM());
                    r2 = r2 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 6: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected java.lang.String j6(boolean r4) {
        int r5 = 0;
        java.lang.StringBuffer r0 = null;
        int r1 = 0;
        int r6 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r5 = this.v5.FH();
                    r0 = new java.lang.StringBuffer(100);
                    r1 = this.Zo.size();
                    r0.append("fill-array-data-payload // for fill-array-data @ ");
                    r0.append(abcd.Yt.v5(r5));
                    r6 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r6 >= r1) { $pc2 = 6; continue $sw2; }
                    r0.append("\n  ");
                    r0.append(r6);
                    r0.append(": ");
                    r0.append(this.Zo.get(r6).aM());
                    r6 = r6 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 6: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Lt r8) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.Zo.size();
                    r8.writeShort(768);
                    r8.writeShort(this.gn);
                    r8.writeInt(this.u7);
                    r1 = this.gn;
                    if (r1 == 1) { $pc3 = 19; continue $sw3; }
                    if (r1 != 2) { $pc3 = 6; continue $sw3; }
                    r2 = 0;
                    $pc3 = 17; continue $sw3;
                }
                case 17: {
                    if (r2 >= r0) { $pc3 = 23; continue $sw3; }
                    r8.writeShort((short) ((abcd.Bs) this.Zo.get(r2)).Ws());
                    r2 = r2 + 1;
                    $pc3 = 23; continue $sw3;
                }
                case 23: {
                    if (this.gn == 1) { $pc3 = 25; continue $sw3; }
                    return;
                }
                case 25: {
                    if ((r0 % 2) == 0) { $pc3 = 33; continue $sw3; }
                    r8.writeByte(0);
                    return;
                }
                case 33: {
                    return;
                }
                case 6: {
                    if (r1 != 4) { $pc3 = 8; continue $sw3; }
                    r3 = 0;
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    if (r3 >= r0) { $pc3 = 23; continue $sw3; }
                    r8.writeInt(((abcd.Bs) this.Zo.get(r3)).Ws());
                    r3 = r3 + 1;
                    { $pc3 = 14; continue $sw3; }
                }
                case 8: {
                    if (r1 != 8) { $pc3 = 23; continue $sw3; }
                    r4 = 0;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    if (r4 >= r0) { $pc3 = 23; continue $sw3; }
                    r8.writeLong(((abcd.Cs) this.Zo.get(r4)).lg());
                    r4 = r4 + 1;
                    { $pc3 = 11; continue $sw3; }
                }
                case 19: {
                    r5 = 0;
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    if (r5 >= r0) { $pc3 = 23; continue $sw3; }
                    r8.writeByte((byte) ((abcd.Bs) this.Zo.get(r5)).Ws());
                    r5 = r5 + 1;
                    { $pc3 = 20; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
