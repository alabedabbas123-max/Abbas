package abcd;

public class eD extends abcd.yD {
    public eD(abcd.HJ r1, java.util.Map<abcd.yE, java.lang.String> r2) {
        super(r1, j6(r2));
    }

    private static java.lang.String j6(java.util.Map<abcd.yE, java.lang.String> r3) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append(org.eclipse.jgit.JGitText.j6().missingPrerequisiteCommits);
        java.util.Iterator<java.util.Map.Entry<abcd.yE, java.lang.String>> r4 = r3.entrySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        java.util.Map.Entry<abcd.yE, java.lang.String> r1 = r4.next();
        r0.append("\n  ");
        r0.append(r1.getKey().we());
        if (r1.getValue() == null) goto L4;
        r0.append(" ");
        r0.append(r1.getValue());
        goto L4
    L6:
        return r0.toString();
    }
}
