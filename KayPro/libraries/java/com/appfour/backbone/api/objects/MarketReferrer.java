package com.appfour.backbone.api.objects;

@android.support.annotation.Keep
public class MarketReferrer {
    private final com.appfour.backbone.api.objects.Market market;
    private final java.lang.String url;

    public MarketReferrer(com.appfour.backbone.api.objects.Market r1, java.lang.String r2) {
        this.market = r1;
        this.url = r2;
    }

    private android.net.Uri getUri() {
        return android.net.Uri.parse("http://link?" + this.url);
    }

    public java.lang.String getCampaign() {
        java.lang.String r1 = getUri().getQueryParameter("utm_campaign");     // Catch: java.lang.Throwable -> L7
        if ("(not set)".equals(r1) == true) goto L6;
        return r1;
    L6:
        return null;
    }

    public com.appfour.backbone.api.objects.Market getMarket() {
        return this.market;
    }

    public java.lang.String getMedium() {
        java.lang.String r1 = getUri().getQueryParameter("utm_medium");     // Catch: java.lang.Throwable -> L7
        if ("(not set)".equals(r1) == true) goto L6;
        return r1;
    L6:
        return null;
    }

    public java.lang.String getSource() {
        java.lang.String r1 = getUri().getQueryParameter("utm_source");     // Catch: java.lang.Throwable -> L7
        if ("(not set)".equals(r1) == true) goto L6;
        return r1;
    L6:
        return null;
    }

    public java.lang.String getTerm() {
        return getUri().getQueryParameter("utm_term");
    L4:
        return null;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public boolean isPcampaignid() {
        if (getUri().getQueryParameter("pcampaignid") == null) goto L10;
        return true;
    L10:
        return false;
    L11:
        return false;
    }

    public java.lang.String toString() {
        return com.appfour.backbone.api.runtime.b.j6().DW(this);
    }
}
