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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (DW(r1) == false) { $pc0 = 7; continue $sw0; }
                    return this.j6;
                }
                case 7: {
                    return abcd.OD.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final void j6(java.util.List<abcd.QD> r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.j6 != null) { $pc1 = 7; continue $sw1; }
                    this.j6 = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().propertyIsAlreadyNonNull);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean j6() {
        return this.DW;
    }
}
