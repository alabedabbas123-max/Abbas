package abcd;

public class VC extends java.io.IOException {
    public VC(java.lang.String r4) {
        super(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().checkoutConflictWithFile, new java.lang.Object[]{r4}));
    }

    public VC(java.lang.String[] r4) {
        super(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().checkoutConflictWithFiles, new java.lang.Object[]{j6(r4)}));
    }

    private static java.lang.String j6(java.lang.String[] r5) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        int r1 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        java.lang.String r3 = r5[r2];
        r0.append("\n");
        r0.append(r3);
        r2 = r2 + 1;
        goto L3
    L5:
        return r0.toString();
    }
}
