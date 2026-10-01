package abcd;

public class uE extends abcd.YD {
    public uE() {
    }

    private void Zo(byte[] r3, int r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        this.FH = abcd.IK.gn(r3, r4);
                        this.Hw = abcd.IK.gn(r3, r4 + 8);
                        this.v5 = abcd.IK.gn(r3, r4 + 16);
                        this.Zo = abcd.IK.gn(r3, r4 + 24);
                        this.VH = abcd.IK.gn(r3, r4 + 32);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc0 = 4; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    throw new abcd.aD(r3, r4, 40);
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw(byte[] r2, int r3) {
        this.FH = abcd.FK.j6(r2, r3);
        this.Hw = abcd.FK.j6(r2, r3 + 4);
        this.v5 = abcd.FK.j6(r2, r3 + 8);
        this.Zo = abcd.FK.j6(r2, r3 + 12);
        this.VH = abcd.FK.j6(r2, r3 + 16);
    }

    @Override
    public abcd.yE J8() {
        return new abcd.yE(this);
    }

    public void Ws() {
        this.FH = 0;
        this.Hw = 0;
        this.v5 = 0;
        this.Zo = 0;
        this.VH = 0;
    }

    public void j6(java.lang.String r5) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r5.length() != 40) { $pc1 = 7; continue $sw1; }
                    Zo(abcd.hE.DW(r5), 0);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidId, new java.lang.Object[]{r5}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5(byte[] r1, int r2) {
        Zo(r1, r2);
    }
}
