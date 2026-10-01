package abcd;

class yv implements abcd.Interfacejv {
    final abcd.Bv DW;
    final com.appfour.backbone.api.closures.OnItemClickClosure j6;

    yv(abcd.Bv r1, com.appfour.backbone.api.closures.OnItemClickClosure r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData j6(java.lang.Object[] r7) {
        return this.j6.getValue((android.app.Activity) r7[0], (android.view.View) r7[1], r7[2], ((java.lang.Integer) r7[3]).intValue(), (android.view.View) r7[4]);
    }
}
