package abcd;

public class fD extends java.io.IOException {
    private final abcd.yE j6;

    public fD(abcd.WD r4, int r5) {
        super(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().missingObject, new java.lang.Object[]{abcd.hE.DW(r5), r4.Hw()}));
        this.j6 = null;
    }

    public fD(abcd.yE r1, int r2) {
        this(r1, abcd.hE.DW(r2));
    }

    public fD(abcd.yE r4, java.lang.String r5) {
        super(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().missingObject, new java.lang.Object[]{r5, r4.we()}));
        this.j6 = r4.Hw();
    }

    public abcd.yE j6() {
        return this.j6;
    }
}
