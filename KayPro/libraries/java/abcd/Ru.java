package abcd;

class Ru implements abcd.Abstractlv.a {
    final java.lang.Object[] DW;
    final abcd.Su FH;
    final java.lang.Object j6;

    Ru(abcd.Su r1, java.lang.Object r2, java.lang.Object[] r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData getValue() {
        com.appfour.backbone.api.closures.OnEnterClosure4 r1 = this.FH.DW;
        java.lang.Object r2 = this.j6;
        java.lang.Object[] r0 = this.DW;
        return r1.getValue(r2, r0[1], r0[2], r0[3], r0[4]);
    }
}
