package abcd;

public class ClassO {
    public static void j6(java.lang.Object r2, java.lang.StringBuilder r3) {
        if (r2 != null) goto L4;
        r3.append("null");
        return;
    L4:
        java.lang.String r0 = r2.getClass().getSimpleName();
        if (r0 != null) goto L7;
    L8:
        r0 = r2.getClass().getName();
        int r1 = r0.lastIndexOf(46);
        if (r1 <= 0) goto L11;
        r0 = r0.substring(r1 + 1);
    L11:
        r3.append(r0);
        r3.append('{');
        r3.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(r2)));
        return;
    L7:
        if (r0.length() > 0) goto L11;
        goto L8
    }
}
