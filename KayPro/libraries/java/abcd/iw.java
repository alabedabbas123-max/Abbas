package abcd;

public class iw {
    private static abcd.iw.a DW;
    private static abcd.iw.a j6;

    private static class a {
        private java.util.concurrent.atomic.AtomicLong j6;

        private a() {
            this.j6 = new java.util.concurrent.atomic.AtomicLong(0);
        }

        a(abcd.hw r1) {
            this();
        }

        public boolean DW(long r5) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if ((this.j6.get() / 1000) <= r5) { $pc0 = 5; continue $sw0; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public long j6(long r10) {
            long r0 = 0L;
            long r4 = 0L;
            long r2 = 0L;
            long r11 = 0L;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 2;
            $sw1: while (true) {
                switch ($pc1) {
                    case 2: {
                        r0 = this.j6.get();
                        r4 = r0 / 1000;
                        if (r4 != r10) { $pc1 = 10; continue $sw1; }
                        if ((r0 % 1000) >= 999) { $pc1 = 7; continue $sw1; }
                        r2 = 1 + r0;
                        $pc1 = 13; continue $sw1;
                    }
                    case 13: {
                        if (this.j6.compareAndSet(r0, r2) == false) { $pc1 = 2; continue $sw1; }
                        return r2;
                    }
                    case 7: {
                        java.lang.Long.signum(r10);
                        return (r10 * 1000) + 999;
                    }
                    case 10: {
                        if (r10 <= r4) { $pc1 = 15; continue $sw1; }
                        r2 = 1000 * r10;
                        { $pc1 = 13; continue $sw1; }
                    }
                    case 15: {
                        r11 = r10 * 1000;
                        this.j6.set(r11);
                        return r11;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        j6 = new abcd.iw.a(null);
        DW = new abcd.iw.a(null);
    }

    private static long DW(long r1) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (j6.DW(r1) == true) { $pc2 = 7; continue $sw2; }
                    return j6.j6(r1);
                }
                case 7: {
                    return DW.j6(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = com.appfour.backbone.api.Api.getProcessName().toString();
                    if ("".equals(r0) == false) { $pc3 = 6; continue $sw3; }
                    return null;
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(abcd.lw r18, long r19, long r21) {
        abcd.yw.j6("Output", "(" + r21 + ") Event recording start: " + r18.DW());
        abcd.Yv.j6(new abcd._v(abcd.Aw.j6(java.util.UUID.randomUUID()), r18.DW(), new abcd.Xv(), 1000 * r19, com.appfour.backbone.api.Api.getBuildVariantName(), com.appfour.backbone.api.Api.getAppVersionCode(), com.appfour.backbone.api.Api.getAppId(), abcd.qw.j6(), abcd.Aw.j6(java.util.UUID.randomUUID()), j6(), null, -1, r21));
    }

    public static void j6(abcd.lw r31, long r32, com.appfour.backbone.api.objects.EventData r34) {
        abcd.Xv r5 = null;
        abcd.qw.a r12 = null;
        java.util.Iterator<abcd.Wv.a> r2 = null;
        abcd.Wv.a r3 = null;
        java.lang.String r15 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    abcd.yw.j6("Output", "(" + r32 + ") Event: " + r31.DW() + " " + r34.toString());
                    r5 = (abcd.Xv) r34;
                    r12 = abcd.qw.j6(r32, r5.FH);
                    if (r12.DW == false) { $pc4 = 12; continue $sw4; }
                    r2 = abcd.Wv.j6().iterator();
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r2.hasNext() == false) { $pc4 = 12; continue $sw4; }
                    r3 = r2.next();
                    if (abcd.ow.j6(r3.DW) == false) { $pc4 = 6; continue $sw4; }
                    if (r3.Hw >= r32) { $pc4 = 6; continue $sw4; }
                    abcd.Yv.j6(new abcd._v(abcd.Aw.j6(java.util.UUID.randomUUID()), r3.DW, r3.FH, DW(r32), com.appfour.backbone.api.Api.getBuildVariantName(), com.appfour.backbone.api.Api.getAppVersionCode(), com.appfour.backbone.api.Api.getAppId(), abcd.qw.j6(), r12.j6, j6(), r3.j6, r3.Hw, -1));
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    r15 = abcd.Aw.j6(java.util.UUID.randomUUID());
                    abcd.Yv.j6(new abcd._v(r15, r31.DW(), r5, DW(r32), com.appfour.backbone.api.Api.getBuildVariantName(), com.appfour.backbone.api.Api.getAppVersionCode(), com.appfour.backbone.api.Api.getAppId(), abcd.qw.j6(), r12.j6, j6(), null, -1, -1));
                    abcd.Wv.j6(r15, r31.DW(), r5, r32);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(abcd.lw r2, long r3, java.lang.Throwable r5) {
        abcd.yw.j6("Output", "(" + r3 + ") Event error: " + r2.DW(), r5);
    }

    public static boolean j6(long r0) {
        return abcd.Yv.j6(r0);
    }
}
