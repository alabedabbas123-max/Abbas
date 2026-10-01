package abcd;

public class WC extends java.lang.Exception {
    private final java.util.List<java.lang.Throwable> j6;

    public WC(java.util.Collection<java.lang.Throwable> r2) {
        super(j6(r2));
        this.j6 = java.util.Collections.unmodifiableList(new java.util.ArrayList(r2));
    }

    private static java.lang.String j6(java.util.Collection<java.lang.Throwable> r3) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append(org.eclipse.jgit.JGitText.j6().failureDueToOneOfTheFollowing);
        java.util.Iterator<java.lang.Throwable> r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        java.lang.Throwable r1 = r4.next();
        r0.append("  ");
        r0.append(r1.getMessage());
        r0.append("\n");
        goto L4
    L6:
        return r0.toString();
    }
}
