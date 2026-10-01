package abcd;

public class hL {
    public static java.lang.Object DW(java.lang.String r1) {
        return j6(new java.io.StringReader(r1));
    }

    public static java.lang.Object j6(java.io.Reader r1) {
        return new abcd.jL().j6(r1);
    L4:
        return null;
    }

    public static java.lang.String j6(java.lang.Object r3) {
        if (r3 != null) goto L6;
        return "null";
    L6:
        if ((r3 instanceof java.lang.String) == false) goto L10;
        java.lang.StringBuffer r0 = new java.lang.StringBuffer();
        r0.append("\"");
        r0.append(j6((java.lang.String) r3));
        r0.append("\"");
        return r0.toString();
    L10:
        if ((r3 instanceof java.lang.Double) == false) goto L20;
        java.lang.Double r1 = (java.lang.Double) r3;
        if (r1.isInfinite() == false) goto L14;
    L18:
        return "null";
    L14:
        if (r1.isNaN() == true) goto L18;
        return r3.toString();
    L20:
        if ((r3 instanceof java.lang.Float) == false) goto L30;
        java.lang.Float r2 = (java.lang.Float) r3;
        if (r2.isInfinite() == false) goto L24;
    L28:
        return "null";
    L24:
        if (r2.isNaN() == true) goto L28;
        return r3.toString();
    L30:
        if ((r3 instanceof java.lang.Number) == false) goto L34;
        return r3.toString();
    L34:
        if ((r3 instanceof java.lang.Boolean) == false) goto L38;
        return r3.toString();
    L38:
        if ((r3 instanceof abcd.InterfaceeL) == false) goto L42;
        return ((abcd.InterfaceeL) r3).j6();
    L42:
        if ((r3 instanceof java.util.Map) == false) goto L46;
        return abcd.fL.j6((java.util.Map) r3);
    L46:
        if ((r3 instanceof java.util.List) == false) goto L50;
        return abcd.dL.j6((java.util.List) r3);
    L50:
        return r3.toString();
    }

    public static java.lang.String j6(java.lang.String r1) {
        if (r1 != null) goto L5;
        return null;
    L5:
        java.lang.StringBuffer r0 = new java.lang.StringBuffer();
        j6(r1, r0);
        return r0.toString();
    }

    static void j6(java.lang.String r5, java.lang.StringBuffer r6) {
        int r1 = 0;
    L4:
        if (r1 >= r5.length()) goto L43;
        char r2 = r5.charAt(r1);
        if (r2 != '\f') goto L8;
        java.lang.String r3 = "\\f";
    L36:
        r6.append(r3);
    L42:
        r1 = r1 + 1;
        goto L4
    L8:
        if (r2 != '\r') goto L10;
        r3 = "\\r";
        goto L36
    L10:
        if (r2 != '\"') goto L12;
        r3 = "\\\"";
        goto L36
    L12:
        if (r2 != '/') goto L14;
        r3 = "\\/";
        goto L36
    L14:
        if (r2 == '\\') goto L37;
        switch(r2) {
            case 8: goto L35;
            case 9: goto L34;
            case 10: goto L33;
            default: goto L16;
        };
    L16:
        if (r2 < 0) goto L20;
        if (r2 > 31) goto L20;
    L27:
        java.lang.String r4 = java.lang.Integer.toHexString(r2);
        r6.append("\\u");
        int r7 = 0;
    L29:
        if (r7 >= (4 - r4.length())) goto L31;
        r6.append('0');
        r7 = r7 + 1;
        goto L29
    L31:
        r3 = r4.toUpperCase();
    L20:
        if (r2 < 127) goto L24;
        if (r2 <= 159) goto L27;
    L24:
        if (r2 >= 8192) goto L26;
    L32:
        r6.append(r2);
        goto L42
    L26:
        if (r2 > 8447) goto L32;
    L33:
        r3 = "\\n";
        goto L36
    L34:
        r3 = "\\t";
        goto L36
    L35:
        r3 = "\\b";
        goto L36
    L37:
        r3 = "\\\\";
        goto L36
    }
}
