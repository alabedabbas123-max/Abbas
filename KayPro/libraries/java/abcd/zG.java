package abcd;

public class zG extends abcd.AbstractyG {
    private int Zo;
    private final int v5;

    private zG(int r1) {
        this.v5 = r1;
    }

    public static abcd.AbstractyG j6(int r1) {
        if (r1 < 0) goto L6;
        return new abcd.zG(r1);
    L6:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().skipMustBeNonNegative);
    }

    @Override
    public abcd.AbstractyG clone() {
        return new abcd.zG(this.v5);
    }

    @Override
    public boolean j6(abcd.qG r2, abcd.dG r3) {
        int r4 = this.v5;
        int r5 = this.Zo;
        this.Zo = r5 + 1;
        if (r4 <= r5) goto L6;
        return false;
    L6:
        return true;
    }
}
