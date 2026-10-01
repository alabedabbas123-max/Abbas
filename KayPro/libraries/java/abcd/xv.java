package abcd;

class xv implements abcd.Interfacejv {
    final abcd.Bv DW;
    final com.appfour.backbone.api.closures.OnMenuItemSelectedClosure j6;

    xv(abcd.Bv r1, com.appfour.backbone.api.closures.OnMenuItemSelectedClosure r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData j6(java.lang.Object[] r4) {
        return this.j6.getValue((android.app.Activity) r4[0], (android.view.MenuItem) r4[1]);
    }
}
