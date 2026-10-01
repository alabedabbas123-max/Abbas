package abcd;

public class aD extends java.lang.IllegalArgumentException {
    public aD(byte[] r3, int r4, int r5) {
        super(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidId, new java.lang.Object[]{j6(r3, r4, r5)}));
    }

    private static java.lang.String j6(byte[] r4, int r5, int r6) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return ": " + new java.lang.String(r4, r5, r6, "US-ASCII");
                }
                case 5: {
                    return "";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
