package abcd;

class Ku implements abcd.Interfacejv {
    final com.appfour.backbone.api.closures.OnEnterClosure0 DW;
    final abcd.Vu FH;
    final long j6;

    Ku(abcd.Vu r1, long r2, com.appfour.backbone.api.closures.OnEnterClosure0 r4) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r4;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData j6(java.lang.Object[] r3) {
        java.lang.Object r4 = abcd.Ev.j6(r3[0], this.j6);
        return abcd.Mv.XL().j6(r4, new abcd.Ju(this, r4));
    }
}
