package abcd;

public class gD extends abcd.bD {
    public gD(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        super(j6(r1, r2, r3), r4);
    }

    private static java.lang.String j6(int r3, java.lang.String r4, java.lang.String r5) {
        return java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().noClosingBracket, new java.lang.Object[]{r5, r4, java.lang.Integer.valueOf(r3)});
    }
}
