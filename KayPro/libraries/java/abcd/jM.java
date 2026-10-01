package abcd;

public class jM extends abcd.EL {
    private byte[] j6;

    public jM(java.lang.String r4) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = abcd.TP.j6(r4);
                    try {
                        u7();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.text.ParseException) { $pc0 = 5; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    e = $ex0;
                    throw new java.lang.IllegalArgumentException("invalid date string: " + e.getMessage());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    jM(byte[] r1) {
        this.j6 = r1;
    }

    private java.lang.String EQ() {
        java.util.TimeZone r0 = null;
        int r1 = 0;
        java.lang.String r3 = null;
        int r4 = 0;
        int r2 = 0;
        int r5 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = java.util.TimeZone.getDefault();
                    r1 = r0.getRawOffset();
                    if (r1 >= 0) { $pc1 = 5; continue $sw1; }
                    r1 = -r1;
                    r3 = "-";
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r4 = r1 / 3600000;
                    r2 = (r1 - (((r4 * 60) * 60) * 1000)) / 60000;
                    if (r0.useDaylightTime() == false) { $pc1 = 17; continue $sw1; }
                    if (r0.inDaylightTime(u7()) == false) { $pc1 = 17; continue $sw1; }
                    if (r3.equals("+") == false) { $pc1 = 14; continue $sw1; }
                    r5 = 1;
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    r4 = r4 + r5;
                    { $pc1 = 17; continue $sw1; }
                }
                case 14: {
                    r5 = -1;
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    return "GMT" + r3 + j6(r4) + ":" + j6(r2);
                }
                case 5: {
                    r3 = "+";
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String j6(int r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 >= 10) { $pc2 = 7; continue $sw2; }
                    return "0" + r3;
                }
                case 7: {
                    return java.lang.Integer.toString(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean we() {
        int r1 = 0;
        byte[] r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r1 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    r2 = this.j6;
                    if (r1 == r2.length) { $pc3 = 5; continue $sw3; }
                    if (r2[r1] != 46) { $pc3 = 12; continue $sw3; }
                    if (r1 != 14) { $pc3 = 12; continue $sw3; }
                    return true;
                }
                case 12: {
                    r1 = r1 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if ((r2 instanceof abcd.jM) == true) { $pc4 = 7; continue $sw4; }
                    return false;
                }
                case 7: {
                    return abcd.OP.j6(this.j6, ((abcd.jM) r2).j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String tp() {
        java.lang.String r0 = null;
        int r1 = 0;
        char r3 = 0;
        java.lang.StringBuilder r4 = null;
        int r2 = 0;
        int r5 = 0;
        char r6 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = abcd.TP.DW(this.j6);
                    if (r0.charAt(r0.length() - 1) == 'Z') { $pc5 = 5; continue $sw5; }
                    r1 = r0.length() - 5;
                    r3 = r0.charAt(r1);
                    if (r3 != '-') { $pc5 = 9; continue $sw5; }
                    $pc5 = 19; continue $sw5;
                }
                case 19: {
                    r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0.substring(0, r1)));
                    r4.append("GMT");
                    r2 = r1 + 3;
                    r4.append(r0.substring(r1, r2));
                    r4.append(":");
                    r4.append(r0.substring(r2));
                    return r4.toString();
                }
                case 9: {
                    if (r3 == '+') { $pc5 = 19; continue $sw5; }
                    r5 = r0.length() - 3;
                    r6 = r0.charAt(r5);
                    if (r6 == '-') { $pc5 = 18; continue $sw5; }
                    if (r6 == '+') { $pc5 = 18; continue $sw5; }
                    return java.lang.String.valueOf(r0) + EQ();
                }
                case 18: {
                    return java.lang.String.valueOf(r0.substring(0, r5)) + "GMT" + r0.substring(r5) + ":00";
                }
                case 5: {
                    return java.lang.String.valueOf(r0.substring(0, r0.length() - 1)) + "GMT+00:00";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Date u7() {
        java.lang.String r0 = null;
        java.text.SimpleDateFormat r2 = null;
        java.lang.String r4 = null;
        int r6 = 0;
        char r7 = 0;
        int r8 = 0;
        java.text.SimpleDateFormat r1 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = abcd.TP.DW(this.j6);
                    if (r0.endsWith("Z") == false) { $pc6 = 10; continue $sw6; }
                    if (we() == false) { $pc6 = 7; continue $sw6; }
                    r2 = new java.text.SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'");
                    $pc6 = 8; continue $sw6;
                }
                case 8: {
                    r2.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
                    $pc6 = 25; continue $sw6;
                }
                case 25: {
                    if (we() == false) { $pc6 = 45; continue $sw6; }
                    r4 = r0.substring(14);
                    r6 = 1;
                    $pc6 = 28; continue $sw6;
                }
                case 28: {
                    if (r6 >= r4.length()) { $pc6 = 36; continue $sw6; }
                    r7 = r4.charAt(r6);
                    if ('0' > r7) { $pc6 = 36; continue $sw6; }
                    if (r7 > '9') { $pc6 = 36; continue $sw6; }
                    r6 = r6 + 1;
                    $pc6 = 36; continue $sw6;
                }
                case 36: {
                    r8 = r6 - 1;
                    if (r8 <= 3) { $pc6 = 39; continue $sw6; }
                    r0 = java.lang.String.valueOf(r0.substring(0, 14)) + (java.lang.String.valueOf(r4.substring(0, 4)) + r4.substring(r6));
                    { $pc6 = 45; continue $sw6; }
                }
                case 39: {
                    if (r8 != 1) { $pc6 = 42; continue $sw6; }
                    r0 = java.lang.String.valueOf(r0.substring(0, 14)) + (java.lang.String.valueOf(r4.substring(0, r6)) + "00" + r4.substring(r6));
                    { $pc6 = 45; continue $sw6; }
                }
                case 42: {
                    if (r8 != 2) { $pc6 = 45; continue $sw6; }
                    r0 = java.lang.String.valueOf(r0.substring(0, 14)) + (java.lang.String.valueOf(r4.substring(0, r6)) + "0" + r4.substring(r6));
                    $pc6 = 45; continue $sw6;
                }
                case 45: {
                    return r2.parse(r0);
                }
                case 7: {
                    r2 = new java.text.SimpleDateFormat("yyyyMMddHHmmss'Z'");
                    { $pc6 = 8; continue $sw6; }
                }
                case 10: {
                    if (r0.indexOf(45) <= 0) { $pc6 = 12; continue $sw6; }
                    $pc6 = 19; continue $sw6;
                }
                case 19: {
                    r0 = tp();
                    if (we() == false) { $pc6 = 22; continue $sw6; }
                    r2 = new java.text.SimpleDateFormat("yyyyMMddHHmmss.SSSz");
                    $pc6 = 23; continue $sw6;
                }
                case 23: {
                    r2.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
                    { $pc6 = 25; continue $sw6; }
                }
                case 22: {
                    r2 = new java.text.SimpleDateFormat("yyyyMMddHHmmssz");
                    { $pc6 = 23; continue $sw6; }
                }
                case 12: {
                    if (r0.indexOf(43) > 0) { $pc6 = 19; continue $sw6; }
                    if (we() == false) { $pc6 = 17; continue $sw6; }
                    r1 = new java.text.SimpleDateFormat("yyyyMMddHHmmss.SSS");
                    $pc6 = 18; continue $sw6;
                }
                case 18: {
                    r2 = r1;
                    r2.setTimeZone(new java.util.SimpleTimeZone(0, java.util.TimeZone.getDefault().getID()));
                    { $pc6 = 25; continue $sw6; }
                }
                case 17: {
                    r1 = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
                    { $pc6 = 18; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    int v5() {
        int r0 = this.j6.length;
        return (abcd.OM.j6(r0) + 1) + r0;
    }
}
