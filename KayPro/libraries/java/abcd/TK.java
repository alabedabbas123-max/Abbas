package abcd;

public final class TK extends java.io.OutputStream {
    public static final abcd.TK j6 = null;

    static {
        j6 = new abcd.TK();
    }

    private TK() {
    }

    @Override
    public void write(int r2) {
        throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().writingNotPermitted);
    }
}
