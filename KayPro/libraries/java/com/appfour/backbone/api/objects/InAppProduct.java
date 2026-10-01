package com.appfour.backbone.api.objects;

@android.support.annotation.Keep
public class InAppProduct {
    private final java.lang.String currencyCode;
    private final boolean isSubscription;
    private final com.appfour.backbone.api.objects.Market market;
    private final long priceInMicros;
    private final java.lang.String productId;

    public InAppProduct(com.appfour.backbone.api.objects.Market r3, java.lang.String r4) {
        this.productId = r4;
        this.priceInMicros = 0;
        this.currencyCode = null;
        this.market = r3;
        this.isSubscription = false;
    }

    public InAppProduct(com.appfour.backbone.api.objects.Market r1, java.lang.String r2, boolean r3, long r4, java.lang.String r6) {
        this.productId = r2;
        this.priceInMicros = r4;
        this.currencyCode = r6;
        this.market = r1;
        this.isSubscription = r3;
    }

    public java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public com.appfour.backbone.api.objects.Market getMarket() {
        return this.market;
    }

    public long getPriceInMicros() {
        return this.priceInMicros;
    }

    public java.lang.String getProductId() {
        return this.productId;
    }

    public boolean isSubscription() {
        return this.isSubscription;
    }

    public java.lang.String toString() {
        return com.appfour.backbone.api.runtime.b.j6().DW(this);
    }
}
