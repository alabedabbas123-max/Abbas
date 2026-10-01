package abcd;

abstract class MD implements abcd.QD {
    private final boolean DW;
    private java.util.List<abcd.QD> j6;

    MD(boolean r2) {
        this.j6 = null;
        this.DW = r2;
    }

    protected abstract boolean DW(char r1);

    @Override
    public java.util.List<abcd.QD> j6(char r1) {
        if (DW(r1) == false) goto L7;
        return this.j6;
    L7:
        return abcd.OD.j6;
    }

    public final void j6(java.util.List<abcd.QD> r2) {
        if (this.j6 != null) goto L7;
        this.j6 = r2;
        return;
    L7:
        throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().propertyIsAlreadyNonNull);
    }

    boolean j6() {
        return this.DW;
    }
}
