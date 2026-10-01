package abcd;

class Eu implements abcd.Interfacejv {
    final abcd.Iu DW;
    final com.appfour.backbone.api.closures.OnMarketClosure j6;

    Eu(abcd.Iu r1, com.appfour.backbone.api.closures.OnMarketClosure r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData j6(java.lang.Object[] r3) {
        return this.j6.getValue((com.appfour.backbone.api.objects.Market) r3[0]);
    }
}
