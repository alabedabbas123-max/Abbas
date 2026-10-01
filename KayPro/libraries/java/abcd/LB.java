package abcd;

public class LB extends abcd.NB {
    private abcd.ME DW;
    private abcd.RE.a j6;

    public LB(java.lang.String r4, abcd.ME r5, abcd.RE.a r6) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r6 == null) { $pc0 = 5; continue $sw0; }
                    r4 = java.lang.String.valueOf(r4) + ". " + java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().refUpdateReturnCodeWas, new java.lang.Object[]{r6});
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    super(r4);
                    this.j6 = r6;
                    this.DW = r5;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
