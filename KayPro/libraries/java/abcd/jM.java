package abcd;

public class jM extends abcd.EL {
    private byte[] j6;

    public jM(java.lang.String r4) {
        this.j6 = abcd.TP.j6(r4);
        u7();     // Catch: java.text.ParseException -> L5
        return;
    L5:
        e = move-exception;
        throw new java.lang.IllegalArgumentException("invalid date string: " + e.getMessage());
    }

    jM(byte[] r1) {
        this.j6 = r1;
    }

    private java.lang.String EQ() {
        java.util.TimeZone r0 = java.util.TimeZone.getDefault();
        int r1 = r0.getRawOffset();
        if (r1 >= 0) goto L5;
        r1 = -r1;
        java.lang.String r3 = "-";
    L6:
        int r4 = r1 / 3600000;
        int r2 = (r1 - (((r4 * 60) * 60) * 1000)) / 60000;
        if (r0.useDaylightTime() == false) goto L17;
        if (r0.inDaylightTime(u7()) == false) goto L17;
        if (r3.equals("+") == false) goto L14;
        int r5 = 1;
    L15:
        r4 = r4 + r5;
        goto L17
    L14:
        r5 = -1;
    L17:
        return "GMT" + r3 + j6(r4) + ":" + j6(r2);
    L5:
        r3 = "+";
        goto L6
    }

    private java.lang.String j6(int r3) {
        if (r3 >= 10) goto L7;
        return "0" + r3;
    L7:
        return java.lang.Integer.toString(r3);
    }

    private boolean we() {
        int r1 = 0;
    L3:
        byte[] r2 = this.j6;
        if (r1 == r2.length) goto L5;
        if (r2[r1] != 46) goto L12;
        if (r1 != 14) goto L12;
        return true;
    L12:
        r1 = r1 + 1;
        goto L3
    L5:
        return false;
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public int hashCode() {
        return abcd.OP.DW(this.j6);
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(24, this.j6);
    }

    @Override
    boolean j6(abcd.EL r2) {
        if ((r2 instanceof abcd.jM) == true) goto L7;
        return false;
    L7:
        return abcd.OP.j6(this.j6, ((abcd.jM) r2).j6);
    }

    public java.lang.String tp() {
        java.lang.String r0 = abcd.TP.DW(this.j6);
        if (r0.charAt(r0.length() - 1) == 'Z') goto L5;
        int r1 = r0.length() - 5;
        char r3 = r0.charAt(r1);
        if (r3 != '-') goto L9;
    L19:
        java.lang.StringBuilder r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0.substring(0, r1)));
        r4.append("GMT");
        int r2 = r1 + 3;
        r4.append(r0.substring(r1, r2));
        r4.append(":");
        r4.append(r0.substring(r2));
        return r4.toString();
    L9:
        if (r3 == '+') goto L19;
        int r5 = r0.length() - 3;
        char r6 = r0.charAt(r5);
        if (r6 == '-') goto L18;
        if (r6 == '+') goto L18;
        return java.lang.String.valueOf(r0) + EQ();
    L18:
        return java.lang.String.valueOf(r0.substring(0, r5)) + "GMT" + r0.substring(r5) + ":00";
    L5:
        return java.lang.String.valueOf(r0.substring(0, r0.length() - 1)) + "GMT+00:00";
    }

    public java.util.Date u7() {
        java.lang.String r0 = abcd.TP.DW(this.j6);
        if (r0.endsWith("Z") == false) goto L10;
        if (we() == false) goto L7;
        java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'");
    L8:
        r2.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
    L25:
        if (we() == false) goto L45;
        java.lang.String r4 = r0.substring(14);
        int r6 = 1;
    L28:
        if (r6 >= r4.length()) goto L36;
        char r7 = r4.charAt(r6);
        if ('0' > r7) goto L36;
        if (r7 > '9') goto L36;
        r6 = r6 + 1;
    L36:
        int r8 = r6 - 1;
        if (r8 <= 3) goto L39;
        r0 = java.lang.String.valueOf(r0.substring(0, 14)) + (java.lang.String.valueOf(r4.substring(0, 4)) + r4.substring(r6));
        goto L45
    L39:
        if (r8 != 1) goto L42;
        r0 = java.lang.String.valueOf(r0.substring(0, 14)) + (java.lang.String.valueOf(r4.substring(0, r6)) + "00" + r4.substring(r6));
        goto L45
    L42:
        if (r8 != 2) goto L45;
        r0 = java.lang.String.valueOf(r0.substring(0, 14)) + (java.lang.String.valueOf(r4.substring(0, r6)) + "0" + r4.substring(r6));
    L45:
        return r2.parse(r0);
    L7:
        r2 = new java.text.SimpleDateFormat("yyyyMMddHHmmss'Z'");
        goto L8
    L10:
        if (r0.indexOf(45) <= 0) goto L12;
    L19:
        r0 = tp();
        if (we() == false) goto L22;
        r2 = new java.text.SimpleDateFormat("yyyyMMddHHmmss.SSSz");
    L23:
        r2.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
        goto L25
    L22:
        r2 = new java.text.SimpleDateFormat("yyyyMMddHHmmssz");
        goto L23
    L12:
        if (r0.indexOf(43) > 0) goto L19;
        if (we() == false) goto L17;
        java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat("yyyyMMddHHmmss.SSS");
    L18:
        r2 = r1;
        r2.setTimeZone(new java.util.SimpleTimeZone(0, java.util.TimeZone.getDefault().getID()));
        goto L25
    L17:
        r1 = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
        goto L18
    }

    @Override
    int v5() {
        int r0 = this.j6.length;
        return (abcd.OM.j6(r0) + 1) + r0;
    }
}
