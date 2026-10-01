package abcd;

public class zG extends abcd.AbstractyG {
    private int Zo;
    private final int v5;

    private zG(int r1) {
        this.v5 = r1;
    }

    public static abcd.AbstractyG j6(int r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 < 0) { $pc0 = 6; continue $sw0; }
                    return new abcd.zG(r1);
                }
                case 6: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().skipMustBeNonNegative);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.AbstractyG clone() {
        return new abcd.zG(this.v5);
    }

    @Override
    public boolean j6(abcd.qG r2, abcd.dG r3) {
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r4 = this.v5;
                    r5 = this.Zo;
                    this.Zo = r5 + 1;
                    if (r4 <= r5) { $pc1 = 6; continue $sw1; }
                    return false;
                }
                case 6: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
