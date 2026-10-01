package abcd;

public class lw implements com.appfour.backbone.api.define.DefineOccurrences {
    private java.util.List<abcd.lw.a> DW;
    private boolean FH;
    private boolean Hw;
    private boolean VH;
    private boolean Zo;
    private boolean gn;
    private java.lang.String j6;
    private boolean v5;

    public class a extends abcd.Abstractiv implements com.appfour.backbone.api.define.DefineHook {
        final abcd.lw ro;

        public a(abcd.lw r1) {
            this.ro = r1;
        }

        @Override
        protected abcd.lw.a j6() {
            return abcd.lw.j6(this.ro);
        }

        @Override
        protected com.appfour.backbone.api.define.DefineHook j6() {
            return j6();
        }

        @Override
        protected void j6(long r2, com.appfour.backbone.api.objects.EventData r4) {
            abcd.lw.j6(this.ro, r2, r4);
        }

        @Override
        protected void j6(long r2, java.lang.Throwable r4) {
            abcd.ow.j6(this.ro, r2, r4);
        }
    }

    public lw(java.lang.String r2) {
        this.DW = new java.util.ArrayList();
        this.j6 = r2;
    }

    private abcd.lw.a Hw() {
        abcd.lw.a r0 = new abcd.lw.a(this);
        this.DW.add(r0);
        return r0;
    }

    private int j6(boolean r2) {
        if (this.FH == false) goto L7;
        return abcd.pw.j6;
    L7:
        if (this.Hw == false) goto L11;
        return abcd.pw.j6(this, r2);
    L11:
        if (this.v5 == false) goto L15;
        return abcd.pw.DW(this, r2);
    L15:
        if (this.Zo == false) goto L19;
        return abcd.pw.FH(this, r2);
    L19:
        if (this.VH == false) goto L23;
        return abcd.pw.v5(this, r2);
    L23:
        if (this.gn == false) goto L27;
        return abcd.pw.Hw(this, r2);
    L27:
        return abcd.pw.j6;
    }

    static abcd.lw.a j6(abcd.lw r0) {
        return r0.Hw();
    }

    private void j6(long r3, com.appfour.backbone.api.objects.EventData r5) {
        if (this.FH == false) goto L7;
        abcd.iw.j6(this, r3, r5);
        return;
    L7:
        if (j6(true) == abcd.pw.DW) goto L10;
        abcd.iw.j6(this, r3, r5);
        abcd.kv.DW(j6());
        return;
    }

    static void j6(abcd.lw r0, long r1, com.appfour.backbone.api.objects.EventData r3) {
        r0.j6(r1, r3);
    }

    public java.lang.String DW() {
        return this.j6;
    }

    public boolean FH() {
        if (j6(false) != abcd.pw.j6) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook asEachOccurrenceOf() {
        this.FH = true;
        return Hw();
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook asFirstOccurrenceOf() {
        this.Hw = true;
        return Hw();
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook asFirstOccurrencePerAppVersionOf() {
        this.v5 = true;
        return Hw();
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook asFirstOccurrencePerDayOf() {
        this.Zo = true;
        return Hw();
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook asFirstOccurrencePerMonthOf() {
        this.gn = true;
        return Hw();
    }

    @Override
    public com.appfour.backbone.api.define.DefineHook asFirstOccurrencePerWeekOf() {
        this.VH = true;
        return Hw();
    }

    public java.util.List<abcd.lw.a> j6() {
        return this.DW;
    }
}
