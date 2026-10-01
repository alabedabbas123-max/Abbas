package abcd;

public class zM extends abcd.EL {
    private byte[] j6;

    public zM(java.lang.String r4) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = abcd.TP.j6(r4);
                    try {
                        EQ();
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
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r4.j6(23);
                    r0 = this.j6.length;
                    r4.DW(r0);
                    r1 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r1 == r0) { $pc1 = 4; continue $sw1; }
                    r4.j6(this.j6[r1]);
                    r1 = r1 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    boolean j6(abcd.EL r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r2 instanceof abcd.zM) == true) { $pc2 = 7; continue $sw2; }
                    return false;
                }
                case 7: {
                    return abcd.OP.j6(this.j6, ((abcd.zM) r2).j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return abcd.TP.DW(this.j6);
    }

    public java.lang.String tp() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = we();
                    if (r0.charAt(0) >= '5') { $pc3 = 7; continue $sw3; }
                    return "20" + r0;
                }
                case 7: {
                    return "19" + r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.String r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = abcd.TP.DW(this.j6);
                    if (r0.indexOf(45) < 0) { $pc4 = 5; continue $sw4; }
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    r1 = r0.indexOf(45);
                    if (r1 >= 0) { $pc4 = 16; continue $sw4; }
                    r1 = r0.indexOf(43);
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    if (r1 != (r0.length() - 3)) { $pc4 = 19; continue $sw4; }
                    r0 = java.lang.String.valueOf(r0) + "00";
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    if (r1 != 10) { $pc4 = 23; continue $sw4; }
                    return java.lang.String.valueOf(r0.substring(0, 10)) + "00GMT" + r0.substring(10, 13) + ":" + r0.substring(13, 15);
                }
                case 23: {
                    return java.lang.String.valueOf(r0.substring(0, 12)) + "GMT" + r0.substring(12, 15) + ":" + r0.substring(15, 17);
                }
                case 5: {
                    if (r0.indexOf(43) >= 0) { $pc4 = 12; continue $sw4; }
                    if (r0.length() != 11) { $pc4 = 11; continue $sw4; }
                    return java.lang.String.valueOf(r0.substring(0, 10)) + "00GMT+00:00";
                }
                case 11: {
                    return java.lang.String.valueOf(r0.substring(0, 12)) + "GMT+00:00";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
