package abcd;

public class VC extends java.io.IOException {
    public VC(java.lang.String r4) {
        super(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().checkoutConflictWithFile, new java.lang.Object[]{r4}));
    }

    public VC(java.lang.String[] r4) {
        super(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().checkoutConflictWithFiles, new java.lang.Object[]{j6(r4)}));
    }

    private static java.lang.String j6(java.lang.String[] r5) {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.String r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r1 = r5.length;
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r1) { $pc0 = 5; continue $sw0; }
                    r3 = r5[r2];
                    r0.append("\n");
                    r0.append(r3);
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
