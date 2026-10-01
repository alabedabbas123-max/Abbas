package abcd;

public final class zo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.zo();
    }

    private zo() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r3) {
        abcd.cs r4 = r3.gn();
        java.util.BitSet r0 = new java.util.BitSet(1);
        r0.set(0, abcd.Abstractao.Hw(r4.get(0).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r7) {
        abcd.cs r0 = null;
        abcd.Abstractms r8 = null;
        abcd.Ds r9 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r7.gn();
                    if ((r7 instanceof abcd.Tn) == true) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    if (r0.size() == 1) { $pc0 = 7; continue $sw0; }
                    return false;
                }
                case 7: {
                    if (abcd.Abstractao.Hw(r0.get(0).we()) == false) { $pc0 = 26; continue $sw0; }
                    r8 = ((abcd.Tn) r7).we();
                    if ((r8 instanceof abcd.Ds) == true) { $pc0 = 12; continue $sw0; }
                    return false;
                }
                case 12: {
                    r9 = (abcd.Ds) r8;
                    if (r0.get(0).Hw() != 1) { $pc0 = 19; continue $sw0; }
                    if ((r9.Ws() & 65535) != 0) { $pc0 = 22; continue $sw0; }
                    return true;
                }
                case 22: {
                    return false;
                }
                case 19: {
                    if ((r9.lg() & 281474976710655L) != 0) { $pc0 = 25; continue $sw0; }
                    return true;
                }
                case 25: {
                    return false;
                }
                case 26: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        return r4.gn().get(0).lg() + ", " + abcd.Abstractao.j6((abcd.Ds) ((abcd.Tn) r4).we());
    }

    @Override
    public int j6() {
        return 2;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r2, boolean r3) {
        abcd.cs r4 = null;
        abcd.Ds r5 = null;
        int r6 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r4 = r2.gn();
                    r5 = (abcd.Ds) ((abcd.Tn) r2).we();
                    if (r4.get(0).Hw() != 1) { $pc1 = 5; continue $sw1; }
                    r6 = 32;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return abcd.Abstractao.j6(r5, r6);
                }
                case 5: {
                    r6 = 64;
                    { $pc1 = 7; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Lt r6, abcd.AbstractVn r7) {
        abcd.cs r0 = null;
        abcd.Ds r1 = null;
        int r2 = 0;
        short r8 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r7.gn();
                    r1 = (abcd.Ds) ((abcd.Tn) r7).we();
                    if (r0.get(0).Hw() != 1) { $pc2 = 5; continue $sw2; }
                    r2 = r1.Ws() >>> 16;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r8 = abcd.Abstractao.j6(r7, r0.get(0).we());
                    abcd.Abstractao.j6(r6, r8, (short) r2);
                    return;
                }
                case 5: {
                    r2 = (int) (r1.lg() >>> 48);
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
