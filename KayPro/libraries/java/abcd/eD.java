package abcd;

public class eD extends abcd.yD {
    public eD(abcd.HJ r1, java.util.Map<abcd.yE, java.lang.String> r2) {
        super(r1, j6(r2));
    }

    private static java.lang.String j6(java.util.Map<abcd.yE, java.lang.String> r3) {
        java.lang.StringBuilder r0 = null;
        java.util.Iterator<java.util.Map.Entry<abcd.yE, java.lang.String>> r4 = null;
        java.util.Map.Entry<abcd.yE, java.lang.String> r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append(org.eclipse.jgit.JGitText.j6().missingPrerequisiteCommits);
                    r4 = r3.entrySet().iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    r1 = r4.next();
                    r0.append("\n  ");
                    r0.append(r1.getKey().we());
                    if (r1.getValue() == null) { $pc0 = 4; continue $sw0; }
                    r0.append(" ");
                    r0.append(r1.getValue());
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
