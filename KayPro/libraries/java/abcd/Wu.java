package abcd;

class Wu implements abcd.Abstractlv.a {
    final java.lang.Object[] DW;
    final abcd.Xu FH;
    final java.lang.Object j6;

    Wu(abcd.Xu r1, java.lang.Object r2, java.lang.Object[] r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData getValue() {
        return this.FH.DW.getValue(this.j6, (java.lang.Throwable) this.DW[1]);
    }
}
