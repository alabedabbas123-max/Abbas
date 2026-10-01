package abcd;

class Pv implements java.lang.Runnable {
    final abcd.Qv.a DW;
    final com.appfour.backbone.api.objects.UserActionWindow j6;

    Pv(abcd.Qv.a r1, com.appfour.backbone.api.objects.UserActionWindow r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public void run() {
        if (abcd.Qv.a.j6(this.DW) == false) goto L9;
        abcd.Qv.a.j6(this.DW, false);
        if (abcd.Qv.a.j6(this.j6.getWindowView()) == false) goto L7;
        abcd.Qv.e.DW(this.j6, abcd.Qv.a.DW(this.DW), abcd.Qv.a.FH(this.DW));
        return;
    L7:
        abcd.Qv.e.j6(this.j6, abcd.Qv.a.DW(this.DW), abcd.Qv.a.FH(this.DW));
        return;
    }
}
