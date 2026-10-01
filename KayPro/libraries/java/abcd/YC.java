package abcd;

public class YC extends java.io.IOException {
    public YC(abcd.YD r1, java.lang.String r2) {
        this(r1.J8(), r2);
    }

    public YC(abcd.yE r4, java.lang.String r5) {
        super(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().objectIsCorrupt, new java.lang.Object[]{r4.we(), r5}));
    }

    public YC(java.lang.String r1) {
        super(r1);
    }
}
