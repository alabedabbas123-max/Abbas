package abcd;

public class WC extends java.lang.Exception {
    private final java.util.List<java.lang.Throwable> j6;

    public WC(java.util.Collection<java.lang.Throwable> r2) {
        super(j6(r2));
        this.j6 = java.util.Collections.unmodifiableList(new java.util.ArrayList(r2));
    }

    private static java.lang.String j6(java.util.Collection<java.lang.Throwable> r3) {
        java.lang.StringBuilder r0 = null;
        java.util.Iterator<java.lang.Throwable> r4 = null;
        java.lang.Throwable r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append(org.eclipse.jgit.JGitText.j6().failureDueToOneOfTheFollowing);
                    r4 = r3.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    r1 = r4.next();
                    r0.append("  ");
                    r0.append(r1.getMessage());
                    r0.append("\n");
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
