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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.DW == false) { $pc0 = 6; continue $sw0; }
                    return;
                }
                case 6: {
                    throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().commandWasCalledInTheWrongState, new java.lang.Object[]{getClass().getName()}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6(boolean r1) {
        this.DW = r1;
    }
}
