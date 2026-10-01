package abcd;

class vv implements abcd.Interfacejv {
    final abcd.Bv DW;
    final com.appfour.backbone.api.closures.OnWindowClosure j6;

    vv(abcd.Bv r1, com.appfour.backbone.api.closures.OnWindowClosure r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData j6(java.lang.Object[] r3) {
        return this.j6.getValue((com.appfour.backbone.api.objects.UserActionWindow) r3[0]);
    }
}
