package abcd;

public class zM extends abcd.EL {
    private byte[] j6;

    public zM(java.lang.String r4) {
        this.j6 = abcd.TP.j6(r4);
        EQ();     // Catch: java.text.ParseException -> L5
        return;
    L5:
        e = move-exception;
        throw new java.lang.IllegalArgumentException("invalid date string: " + e.getMessage());
    }

    zM(byte[] r1) {
        this.j6 = r1;
    }

    public java.util.Date EQ() {
        return new java.text.SimpleDateFormat("yyMMddHHmmssz").parse(we());
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
    void j6(abcd.CL r4) {
        r4.j6(23);
        int r0 = this.j6.length;
        r4.DW(r0);
        int r1 = 0;
    L3:
        if (r1 == r0) goto L4;
        r4.j6(this.j6[r1]);
        r1 = r1 + 1;
        goto L3
    }

    @Override
    boolean j6(abcd.EL r2) {
        if ((r2 instanceof abcd.zM) == true) goto L7;
        return false;
    L7:
        return abcd.OP.j6(this.j6, ((abcd.zM) r2).j6);
    }

    public java.lang.String toString() {
        return abcd.TP.DW(this.j6);
    }

    public java.lang.String tp() {
        java.lang.String r0 = we();
        if (r0.charAt(0) >= '5') goto L7;
        return "20" + r0;
    L7:
        return "19" + r0;
    }

    public java.util.Date u7() {
        java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat("yyyyMMddHHmmssz");
        r0.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
        return r0.parse(tp());
    }

    @Override
    int v5() {
        int r0 = this.j6.length;
        return (abcd.OM.j6(r0) + 1) + r0;
    }

    public java.lang.String we() {
        java.lang.String r0 = abcd.TP.DW(this.j6);
        if (r0.indexOf(45) < 0) goto L5;
    L12:
        int r1 = r0.indexOf(45);
        if (r1 >= 0) goto L16;
        r1 = r0.indexOf(43);
    L16:
        if (r1 != (r0.length() - 3)) goto L19;
        r0 = java.lang.String.valueOf(r0) + "00";
    L19:
        if (r1 != 10) goto L23;
        return java.lang.String.valueOf(r0.substring(0, 10)) + "00GMT" + r0.substring(10, 13) + ":" + r0.substring(13, 15);
    L23:
        return java.lang.String.valueOf(r0.substring(0, 12)) + "GMT" + r0.substring(12, 15) + ":" + r0.substring(15, 17);
    L5:
        if (r0.indexOf(43) >= 0) goto L12;
        if (r0.length() != 11) goto L11;
        return java.lang.String.valueOf(r0.substring(0, 10)) + "00GMT+00:00";
    L11:
        return java.lang.String.valueOf(r0.substring(0, 12)) + "GMT+00:00";
    }
}
