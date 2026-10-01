package abcd;

public class xG extends abcd.AbstractyG {
    private int Zo;
    private int v5;

    private xG(int r2) {
        this.Zo = 0;
        this.v5 = r2;
    }

    public static abcd.AbstractyG j6(int r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 < 0) { $pc0 = 6; continue $sw0; }
                    return new abcd.xG(r1);
                }
                case 6: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().maxCountMustBeNonNegative);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.AbstractyG clone() {
        return new abcd.xG(this.v5);
    }

    @Override
    public boolean j6(abcd.qG r2, abcd.dG r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.Zo++;
                    if (this.Zo > this.v5) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    throw abcd.sD.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
