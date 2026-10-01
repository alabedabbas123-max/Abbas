package abcd;

public final class NK {
    private static final char[] j6 = null;

    static {
        j6 = new char[91];
        char r0 = 0;
    L3:
        char[] r1 = j6;
        if (r0 >= r1.length) goto L5;
        r1[r0] = r0;
        r0 = (char) (r0 + 1);
        goto L3
    L5:
        char r2 = 'A';
    L7:
        if (r2 > 'Z') goto L8;
        j6[r2] = (char) ((r2 - 'A') + 97);
        r2 = (char) (r2 + 1);
        goto L7
    }

    public static boolean DW(java.lang.String r4) {
        if (r4 == null) goto L10;
        java.lang.Boolean r0 = FH(r4);
        if (r0 == null) goto L8;
        return r0.booleanValue();
    L8:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().notABoolean, new java.lang.Object[]{r4}));
    L10:
        throw new java.lang.NullPointerException(org.eclipse.jgit.JGitText.j6().expectedBooleanStringValue);
    }

    public static java.lang.Boolean FH(java.lang.String r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        if (j6("yes", r2) == true) goto L27;
        if (j6("true", r2) == true) goto L27;
        if (j6("1", r2) == true) goto L27;
        if (j6("on", r2) == true) goto L27;
        if (j6("no", r2) == true) goto L25;
        if (j6("false", r2) == true) goto L25;
        if (j6("0", r2) == true) goto L25;
        if (j6("off", r2) == true) goto L25;
        return null;
    L25:
        return java.lang.Boolean.FALSE;
    L27:
        return java.lang.Boolean.TRUE;
    }

    public static java.lang.String Hw(java.lang.String r3) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(r3.length());
        int r1 = 0;
    L4:
        if (r1 >= r3.length()) goto L6;
        r0.append(j6(r3.charAt(r1)));
        r1 = r1 + 1;
        goto L4
    L6:
        return r0.toString();
    }

    public static char j6(char r1) {
        if (r1 <= 'Z') goto L5;
        return r1;
    L5:
        return j6[r1];
    }

    public static java.lang.String j6(java.util.Collection<java.lang.String> r0, java.lang.String r1) {
        return j6(r0, r1, r1);
    }

    public static java.lang.String j6(java.util.Collection<java.lang.String> r4, java.lang.String r5, java.lang.String r6) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        int r1 = r4.size() - 1;
        java.util.Iterator<java.lang.String> r7 = r4.iterator();
        int r2 = 0;
    L4:
        if (r7.hasNext() == false) goto L6;
        r0.append(r7.next());
        if (r2 != (r1 - 1)) goto L10;
        r0.append(r6);
    L12:
        r2 = r2 + 1;
        goto L4
    L10:
        if (r2 == r1) goto L12;
        r0.append(r5);
        goto L12
    L6:
        return r0.toString();
    }

    public static boolean j6(java.lang.String r0) {
        if (r0 != null) goto L4;
        return true;
    L4:
        if (r0.length() == 0) goto L9;
        return false;
    L9:
        return true;
    }

    public static boolean j6(java.lang.String r5, java.lang.String r6) {
        if (r5 != r6) goto L6;
        return true;
    L6:
        if (r5.length() == r6.length()) goto L8;
        return false;
    L8:
        int r1 = 0;
    L10:
        if (r1 >= r5.length()) goto L11;
        if (j6(r5.charAt(r1)) != j6(r6.charAt(r1))) goto L14;
        r1 = r1 + 1;
        goto L10
    L14:
        return false;
    L11:
        return true;
    }
}
