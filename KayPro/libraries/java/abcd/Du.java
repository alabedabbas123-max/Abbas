package abcd;

class Du implements abcd.Interfacejv {
    final abcd.Iu DW;
    final com.appfour.backbone.api.closures.OnInAppProductClosure j6;

    Du(abcd.Iu r1, com.appfour.backbone.api.closures.OnInAppProductClosure r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData j6(java.lang.Object[] r4) {
        return this.j6.getValue((android.app.Activity) r4[0], (com.appfour.backbone.api.objects.InAppProduct) r4[1]);
    }
}
