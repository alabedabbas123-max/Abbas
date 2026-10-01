package abcd;

public class fK extends abcd.AbstractjK {
    final java.lang.String FH;
    final byte[] Hw;

    private fK(java.lang.String r1) {
        this.FH = r1;
        this.Hw = abcd.hE.j6(this.FH);
    }

    public static abcd.fK j6(java.lang.String r2) {
    L3:
        if (r2.endsWith("/") == false) goto L5;
        r2 = r2.substring(0, r2.length() - 1);
        goto L3
    L5:
        if (r2.length() == 0) goto L9;
        return new abcd.fK(r2);
    L9:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().emptyPathNotPermitted);
    }

    public java.lang.String DW() {
        return this.FH;
    }

    public boolean DW(abcd.YJ r2) {
        if (this.Hw.length != r2.FH()) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    public abcd.fK clone() {
        return this;
    }

    @Override
    public abcd.AbstractjK clone() {
        clone();
        return this;
    }

    @Override
    public boolean j6() {
        byte[] r0 = this.Hw;
        int r1 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L4;
        if (r0[r3] == 47) goto L7;
        r3 = r3 + 1;
        goto L3
    L7:
        return true;
    L4:
        return false;
    }

    @Override
    public boolean j6(abcd.YJ r3) {
        byte[] r0 = this.Hw;
        if (r3.j6(r0, r0.length) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    public java.lang.String toString() {
        return "PATH(\"" + this.FH + "\")";
    }
}
