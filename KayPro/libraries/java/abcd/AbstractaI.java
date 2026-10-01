package abcd;

public abstract class AbstractaI implements abcd.InterfaceiI {
    private boolean DW;
    private java.io.Writer FH;
    private java.util.Map<java.lang.String, abcd.ME> j6;

    public AbstractaI() {
        this.j6 = java.util.Collections.emptyMap();
    }

    @Override
    public final java.util.Collection<abcd.ME> DW() {
        return this.j6.values();
    }

    @Override
    public java.util.Map<java.lang.String, abcd.ME> FH() {
        return this.j6;
    }

    protected java.io.Writer VH() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.FH != null) { $pc0 = 6; continue $sw0; }
                    j6(new java.io.StringWriter());
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final abcd.ME getRef(java.lang.String r2) {
        return this.j6.get(r2);
    }

    protected void gn() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.DW == true) { $pc1 = 7; continue $sw1; }
                    this.DW = true;
                    return;
                }
                case 7: {
                    throw new abcd.yD(org.eclipse.jgit.JGitText.j6().onlyOneOperationCallPerConnectionIsSupported);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String j6() {
        java.io.Writer r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.FH;
                    if (r0 != null) { $pc2 = 7; continue $sw2; }
                    return "";
                }
                case 7: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6(java.io.Writer r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.FH != null) { $pc3 = 7; continue $sw3; }
                    this.FH = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().writerAlreadyInitialized);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6(java.util.Map<java.lang.String, abcd.ME> r1) {
        this.j6 = java.util.Collections.unmodifiableMap(r1);
    }
}
