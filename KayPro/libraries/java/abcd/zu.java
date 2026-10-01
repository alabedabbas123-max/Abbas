package abcd;

class zu implements abcd.Interfacejv {
    final abcd.Iu DW;
    final com.appfour.backbone.api.closures.OnMarketImpressionClosure j6;

    zu(abcd.Iu r1, com.appfour.backbone.api.closures.OnMarketImpressionClosure r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData j6(java.lang.Object[] r3) {
        return this.j6.apply((com.appfour.backbone.api.objects.MarketReferrer) r3[0]);
    }
}
