package abcd;

class Lu implements abcd.Abstractlv.a {
    final java.lang.Object[] DW;
    final abcd.Mu FH;
    final java.lang.Object j6;

    Lu(abcd.Mu r1, java.lang.Object r2, java.lang.Object[] r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData getValue() {
        return this.FH.DW.getValue(this.j6, this.DW[1]);
    }
}
