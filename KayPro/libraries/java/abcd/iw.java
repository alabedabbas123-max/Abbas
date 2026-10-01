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
            if ((this.j6.get() / 1000) <= r5) goto L5;
            return true;
        L5:
            return false;
        }

        public long j6(long r10) {
        L2:
            long r0 = this.j6.get();
            long r4 = r0 / 1000;
            if (r4 != r10) goto L10;
            if ((r0 % 1000) >= 999) goto L7;
            long r2 = 1 + r0;
        L13:
            if (this.j6.compareAndSet(r0, r2) == false) goto L2;
            return r2;
        L7:
            java.lang.Long.signum(r10);
            return (r10 * 1000) + 999;
        L10:
            if (r10 <= r4) goto L15;
            r2 = 1000 * r10;
            goto L13
        L15:
            long r11 = r10 * 1000;
            this.j6.set(r11);
            return r11;
        }
    }

    static {
        j6 = new abcd.iw.a(null);
        DW = new abcd.iw.a(null);
    }

    private static long DW(long r1) {
        if (j6.DW(r1) == true) goto L7;
        return j6.j6(r1);
    L7:
        return DW.j6(r1);
    }

    private static java.lang.String j6() {
        java.lang.String r0 = com.appfour.backbone.api.Api.getProcessName().toString();
        if ("".equals(r0) == false) goto L6;
        return null;
    L6:
        return r0;
    }

    public static void j6(abcd.lw r18, long r19, long r21) {
        abcd.yw.j6("Output", "(" + r21 + ") Event recording start: " + r18.DW());
        abcd.Yv.j6(new abcd._v(abcd.Aw.j6(java.util.UUID.randomUUID()), r18.DW(), new abcd.Xv(), 1000 * r19, com.appfour.backbone.api.Api.getBuildVariantName(), com.appfour.backbone.api.Api.getAppVersionCode(), com.appfour.backbone.api.Api.getAppId(), abcd.qw.j6(), abcd.Aw.j6(java.util.UUID.randomUUID()), j6(), null, -1, r21));
    }

    public static void j6(abcd.lw r31, long r32, com.appfour.backbone.api.objects.EventData r34) {
        abcd.yw.j6("Output", "(" + r32 + ") Event: " + r31.DW() + " " + r34.toString());
        abcd.Xv r5 = (abcd.Xv) r34;
        abcd.qw.a r12 = abcd.qw.j6(r32, r5.FH);
        if (r12.DW == false) goto L12;
        java.util.Iterator<abcd.Wv.a> r2 = abcd.Wv.j6().iterator();
    L6:
        if (r2.hasNext() == false) goto L12;
        abcd.Wv.a r3 = r2.next();
        if (abcd.ow.j6(r3.DW) == false) goto L6;
        if (r3.Hw >= r32) goto L6;
        abcd.Yv.j6(new abcd._v(abcd.Aw.j6(java.util.UUID.randomUUID()), r3.DW, r3.FH, DW(r32), com.appfour.backbone.api.Api.getBuildVariantName(), com.appfour.backbone.api.Api.getAppVersionCode(), com.appfour.backbone.api.Api.getAppId(), abcd.qw.j6(), r12.j6, j6(), r3.j6, r3.Hw, -1));
    L12:
        java.lang.String r15 = abcd.Aw.j6(java.util.UUID.randomUUID());
        abcd.Yv.j6(new abcd._v(r15, r31.DW(), r5, DW(r32), com.appfour.backbone.api.Api.getBuildVariantName(), com.appfour.backbone.api.Api.getAppVersionCode(), com.appfour.backbone.api.Api.getAppId(), abcd.qw.j6(), r12.j6, j6(), null, -1, -1));
        abcd.Wv.j6(r15, r31.DW(), r5, r32);
    }

    public static void j6(abcd.lw r2, long r3, java.lang.Throwable r5) {
        abcd.yw.j6("Output", "(" + r3 + ") Event error: " + r2.DW(), r5);
    }

    public static boolean j6(long r0) {
        return abcd.Yv.j6(r0);
    }
}
