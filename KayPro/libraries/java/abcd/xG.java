package abcd;

public class xG extends abcd.AbstractyG {
    private int Zo;
    private int v5;

    private xG(int r2) {
        this.Zo = 0;
        this.v5 = r2;
    }

    public static abcd.AbstractyG j6(int r1) {
        if (r1 < 0) goto L6;
        return new abcd.xG(r1);
    L6:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().maxCountMustBeNonNegative);
    }

    @Override
    public abcd.AbstractyG clone() {
        return new abcd.xG(this.v5);
    }

    @Override
    public boolean j6(abcd.qG r2, abcd.dG r3) {
        this.Zo++;
        if (this.Zo > this.v5) goto L6;
        return true;
    L6:
        throw abcd.sD.j6;
    }
}
