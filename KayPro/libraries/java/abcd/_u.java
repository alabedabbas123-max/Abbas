package abcd;

class _u implements abcd.Abstractlv.a {
    final java.lang.Object[] DW;
    final abcd.av FH;
    final java.lang.Object j6;

    _u(abcd.av r1, java.lang.Object r2, java.lang.Object[] r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData getValue() {
        com.appfour.backbone.api.closures.OnExceptionClosure2 r0 = this.FH.DW;
        java.lang.Object r1 = this.j6;
        java.lang.Object[] r2 = this.DW;
        return r0.getValue(r1, r2[2], r2[3], (java.lang.Throwable) r2[1]);
    }
}
