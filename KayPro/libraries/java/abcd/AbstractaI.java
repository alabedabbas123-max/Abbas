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
        if (this.FH != null) goto L6;
        j6(new java.io.StringWriter());
    L6:
        return this.FH;
    }

    @Override
    public final abcd.ME getRef(java.lang.String r2) {
        return this.j6.get(r2);
    }

    protected void gn() {
        if (this.DW == true) goto L7;
        this.DW = true;
        return;
    L7:
        throw new abcd.yD(org.eclipse.jgit.JGitText.j6().onlyOneOperationCallPerConnectionIsSupported);
    }

    @Override
    public java.lang.String j6() {
        java.io.Writer r0 = this.FH;
        if (r0 != null) goto L7;
        return "";
    L7:
        return r0.toString();
    }

    protected void j6(java.io.Writer r2) {
        if (this.FH != null) goto L7;
        this.FH = r2;
        return;
    L7:
        throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().writerAlreadyInitialized);
    }

    protected void j6(java.util.Map<java.lang.String, abcd.ME> r1) {
        this.j6 = java.util.Collections.unmodifiableMap(r1);
    }
}
