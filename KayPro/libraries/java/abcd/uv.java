package abcd;

class uv implements abcd.Interfacejv {
    final abcd.Bv DW;
    final com.appfour.backbone.api.closures.OnActivityClosure j6;

    uv(abcd.Bv r1, com.appfour.backbone.api.closures.OnActivityClosure r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData j6(java.lang.Object[] r3) {
        return this.j6.getValue((android.app.Activity) r3[0]);
    }
}
