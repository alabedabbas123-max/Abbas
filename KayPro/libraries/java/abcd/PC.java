package abcd;

public class PC extends abcd.IC {
    private static final java.util.Comparator<abcd.PC.b> Hw = null;
    private final java.util.List<abcd.PC.b> v5;

    public static final class a extends abcd.PC.b {
        public a(java.lang.String r1) {
            super(r1);
        }

        @Override
        public void j6(abcd.QC r2) {
            throw new java.lang.UnsupportedOperationException(org.eclipse.jgit.JGitText.j6().noApplyInDelete);
        }
    }

    public static abstract class b {
        final byte[] j6;

        public b(java.lang.String r1) {
            this.j6 = abcd.hE.j6(r1);
        }

        public abstract void j6(abcd.QC r1);
    }

    static {
        Hw = new abcd.OC();
    }

    protected PC(abcd.KC r1, int r2) {
        super(r1, r2);
        this.v5 = new java.util.ArrayList();
    }

    private void v5() {
        int r0 = 0;
        java.util.Iterator<abcd.PC.b> r1 = null;
        int r3 = 0;
        abcd.PC.b r4 = null;
        abcd.KC r5 = null;
        byte[] r6 = null;
        int r7 = 0;
        boolean r8 = false;
        int r9 = 0;
        abcd.QC r10 = null;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    java.util.Collections.sort(this.v5, Hw);
                    r0 = this.j6.v5();
                    r1 = this.v5.iterator();
                    r3 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc0 = 5; continue $sw0; }
                    r4 = r1.next();
                    r5 = this.j6;
                    r6 = r4.j6;
                    r7 = r5.j6(r6, r6.length);
                    if (r7 >= 0) { $pc0 = 12; continue $sw0; }
                    r8 = true;
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    if (r7 >= 0) { $pc0 = 15; continue $sw0; }
                    r7 = -(r7 + 1);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    r9 = java.lang.Math.min(r7, r0) - r3;
                    if (r9 <= 0) { $pc0 = 18; continue $sw0; }
                    j6(r3, r9);
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    if (r8 == false) { $pc0 = 20; continue $sw0; }
                    r3 = r7;
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    if ((r4 instanceof abcd.PC.a) == true) { $pc0 = 4; continue $sw0; }
                    if (r8 == false) { $pc0 = 30; continue $sw0; }
                    r10 = new abcd.QC(r4.j6);
                    r4.j6(r10);
                    if (r10.Zo() == 0) { $pc0 = 29; continue $sw0; }
                    $pc0 = 31; continue $sw0;
                }
                case 31: {
                    j6(r10);
                    { $pc0 = 4; continue $sw0; }
                }
                case 29: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().fileModeNotSetForPath, new java.lang.Object[]{r10.v5()}));
                }
                case 30: {
                    r10 = this.j6.j6(r7);
                    r4.j6(r10);
                    { $pc0 = 31; continue $sw0; }
                }
                case 20: {
                    r3 = this.j6.DW(r7);
                    { $pc0 = 22; continue $sw0; }
                }
                case 12: {
                    r8 = false;
                    { $pc0 = 13; continue $sw0; }
                }
                case 5: {
                    r2 = r0 - r3;
                    if (r2 <= 0) { $pc0 = 38; continue $sw0; }
                    j6(r3, r2);
                    return;
                }
                case 38: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void DW() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.v5.isEmpty() == true) { $pc1 = 6; continue $sw1; }
                    v5();
                    Hw();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.PC.b r2) {
        this.v5.add(r2);
    }

    @Override
    public boolean j6() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.v5.isEmpty() == false) { $pc2 = 7; continue $sw2; }
                    this.j6.tp();
                    return true;
                }
                case 7: {
                    return super.j6();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
