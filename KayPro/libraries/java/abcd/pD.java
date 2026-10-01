package abcd;

public class pD extends abcd.yD {
    public pD(java.io.File r1) {
        this(r1.getPath());
    }

    public pD(java.lang.String r1) {
        super(j6(r1));
    }

    private static java.lang.String j6(java.lang.String r3) {
        return java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().repositoryNotFound, new java.lang.Object[]{r3});
    }
}
