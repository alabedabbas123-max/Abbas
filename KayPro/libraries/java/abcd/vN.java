package abcd;

public class vN {
    public static java.lang.String DW(java.lang.String r5) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer();
        if (r5.length() == 0) goto L14;
        char r1 = r5.charAt(0);
        r0.append(r1);
        int r2 = 1;
    L6:
        if (r2 >= r5.length()) goto L14;
        char r3 = r5.charAt(r2);
        if (r1 != ' ') goto L11;
        if (r3 != ' ') goto L11;
    L12:
        r2 = r2 + 1;
        r1 = r3;
    L11:
        r0.append(r3);
    L14:
        return r0.toString();
    }

    private static abcd.EL FH(java.lang.String r3) {
        return abcd.EL.j6(abcd.VP.j6(r3.substring(1)));
    L5:
        e = move-exception;
        throw new java.lang.IllegalStateException("unknown encoding in name: " + e);
    }

    public static java.lang.String j6(abcd.InterfaceqL r8) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer();
        int r4 = 0;
        if ((r8 instanceof abcd.KL) == true) goto L5;
    L44:
        r0.append("#" + j6(abcd.VP.j6(r8.DW().j6("DER"))));     // Catch: java.io.IOException -> L41
    L13:
        int r9 = r0.length();
        if (r0.length() < 2) goto L20;
        if (r0.charAt(0) != '\\') goto L20;
        if (r0.charAt(1) != '#') goto L20;
        r4 = 2;
    L20:
        if (r4 == r9) goto L22;
        if (r0.charAt(r4) != ',') goto L26;
    L39:
        r0.insert(r4, "\\");
        r4 = r4 + 1;
        r9 = r9 + 1;
    L40:
        r4 = r4 + 1;
        goto L20
    L26:
        if (r0.charAt(r4) == '\"') goto L39;
        if (r0.charAt(r4) == '\\') goto L39;
        if (r0.charAt(r4) == '+') goto L39;
        if (r0.charAt(r4) == '=') goto L39;
        if (r0.charAt(r4) == '<') goto L39;
        if (r0.charAt(r4) == '>') goto L39;
        if (r0.charAt(r4) != ';') goto L40;
    L22:
        return r0.toString();
    L42:
        throw new java.lang.IllegalArgumentException("Other value has no encoded form");
    L5:
        if ((r8 instanceof abcd.BM) == true) goto L44;
        java.lang.String r10 = ((abcd.KL) r8).getString();
        if (r10.length() > 0) goto L9;
    L11:
        r0.append(r10);
        goto L13
    L9:
        if (r10.charAt(0) != '#') goto L11;
        r0.append("\\" + r10);
        goto L13
    }

    public static java.lang.String j6(java.lang.String r2) {
        java.lang.String r3 = abcd.TP.DW(r2.trim());
        if (r3.length() <= 0) goto L10;
        if (r3.charAt(0) != '#') goto L10;
        java.lang.Object r0 = FH(r3);
        if ((r0 instanceof abcd.KL) == false) goto L10;
        r3 = abcd.TP.DW(((abcd.KL) r0).getString().trim());
    L10:
        return DW(r3);
    }

    private static java.lang.String j6(byte[] r3) {
        char[] r0 = new char[r3.length];
        int r1 = 0;
    L4:
        if (r1 == r0.length) goto L6;
        r0[r1] = (char) (r3[r1] & 255);
        r1 = r1 + 1;
        goto L4
    L6:
        return new java.lang.String(r0);
    }

    public static void j6(java.lang.StringBuffer r1, abcd.qN r2, java.util.Hashtable r3) {
        java.lang.String r4 = (java.lang.String) r3.get(r2.v5());
        if (r4 == null) goto L5;
        r1.append(r4);
    L6:
        r1.append('=');
        r1.append(j6(r2.Zo()));
        return;
    L5:
        r1.append(r2.v5().tp());
        goto L6
    }
}
