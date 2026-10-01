package abcd;

public abstract class AbstractCallabledB<T> implements java.util.concurrent.Callable<T> {
    private boolean DW;
    protected final abcd.UE j6;

    protected AbstractCallabledB(abcd.UE r2) {
        this.DW = true;
        this.j6 = r2;
    }

    public abcd.UE DW() {
        return this.j6;
    }

    protected void j6() {
        if (this.DW == false) goto L6;
        return;
    L6:
        throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().commandWasCalledInTheWrongState, new java.lang.Object[]{getClass().getName()}));
    }

    protected void j6(boolean r1) {
        this.DW = r1;
    }
}
