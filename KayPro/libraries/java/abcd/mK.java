package abcd;

public class mK {
    private static final java.util.regex.Pattern DW = null;
    private static final java.util.regex.Pattern FH = null;
    private static final java.util.regex.Pattern j6 = null;

    static {
        j6 = java.util.regex.Pattern.compile("^(Bug|Issue)[a-zA-Z0-9-]*:.*$");
        DW = java.util.regex.Pattern.compile("(^[a-zA-Z0-9-]+:(?!//).*$)");
        FH = java.util.regex.Pattern.compile("^[ \\[].*$");
    }

    public static abcd.yE j6(abcd.yE r2, abcd.yE r3, abcd.KE r4, abcd.KE r5, java.lang.String r6) {
        java.lang.String r7 = j6(r6);
        if (r7.length() != 0) goto L6;
        return null;
    L6:
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("tree ");
        r0.append(abcd.yE.j6(r2));
        r0.append("\n");
        if (r3 == null) goto L9;
        r0.append("parent ");
        r0.append(abcd.yE.j6(r3));
        r0.append("\n");
    L9:
        r0.append("author ");
        r0.append(r4.Hw());
        r0.append("\n");
        r0.append("committer ");
        r0.append(r5.Hw());
        r0.append("\n\n");
        r0.append(r7);
        return new abcd.EE.a().j6(1, r0.toString().getBytes("UTF-8"));
    }

    static java.lang.String j6(java.lang.String r3) {
        return r3.replaceAll("(?i)(?m)^Signed-off-by:.*$\n?", "").replaceAll("(?m)^#.*$\n?", "").replaceAll("(?m)\n\n\n+", "\\\n").replaceAll("\\n*$", "").replaceAll("(?s)\ndiff --git.*", "").trim();
    }

    public static java.lang.String j6(java.lang.String r1, abcd.yE r2) {
        return j6(r1, r2, false);
    }

    public static java.lang.String j6(java.lang.String r6, abcd.yE r7, boolean r8) {
        if (r6.indexOf("Change-Id:") <= 0) goto L15;
        if (r8 == false) goto L14;
        int r9 = r6.indexOf("Change-Id:") + 10;
    L7:
        if (r6.charAt(r9) != ' ') goto L9;
        r9 = r9 + 1;
        goto L7
    L9:
        if (r6.length() != (r9 + 40)) goto L11;
        java.lang.String r10 = r6.substring(r9);
    L64:
        return r6.replace(r10, "I" + r7.VH());
    L11:
        r10 = r6.substring(r9, r9 + 41);
        goto L64
    L14:
        return r6;
    L15:
        java.lang.String[] r11 = r6.split("\n");
        int r1 = r11.length;
        int r2 = r11.length - 1;
    L16:
        if (r2 <= 1) goto L33;
        if (DW.matcher(r11[r2]).matches() == false) goto L22;
        r1 = r2;
    L31:
        r2 = r2 - 1;
        goto L16
    L22:
        if (r1 == r11.length) goto L27;
        if (r11[r2].length() == 0) goto L33;
    L27:
        if (r1 == r11.length) goto L32;
        if (FH.matcher(r11[r2]).matches() == false) goto L32;
        r1 = r2 + 1;
    L32:
        r1 = r11.length;
    L33:
        int r3 = r1;
        int r4 = r3;
    L35:
        if (r3 >= r11.length) goto L40;
        if (j6.matcher(r11[r3]).matches() == false) goto L40;
        r4 = r3 + 1;
        r3 = r4;
    L40:
        java.lang.StringBuilder r5 = new java.lang.StringBuilder();
        int r12 = 0;
    L41:
        if (r12 >= r4) goto L43;
        r5.append(r11[r12]);
        r5.append("\n");
        r12 = r12 + 1;
        goto L41
    L43:
        if (r4 != r11.length) goto L46;
        if (r4 != r1) goto L46;
        r5.append("\n");
    L46:
        r5.append("Change-Id:");
        r5.append(" I");
        r5.append(abcd.yE.j6(r7));
        r5.append("\n");
    L48:
        if (r12 >= r11.length) goto L50;
        r5.append(r11[r12]);
        r5.append("\n");
        r12 = r12 + 1;
        goto L48
    L50:
        return r5.toString();
    }
}
