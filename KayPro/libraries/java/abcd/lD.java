package abcd;

public class lD extends java.io.IOException {
    public lD(java.io.File r1) {
        this(r1.getAbsolutePath());
    }

    public lD(java.lang.String r4) {
        super(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().packFileInvalid, new java.lang.Object[]{r4}));
    }
}
