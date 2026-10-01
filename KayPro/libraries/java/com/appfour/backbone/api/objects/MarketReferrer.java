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
        java.lang.String r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r1 = getUri().getQueryParameter("utm_campaign");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    if ("(not set)".equals(r1) == true) { $pc0 = 6; continue $sw0; }
                    return r1;
                }
                case 6: {
                    return null;
                }
                case 7: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public com.appfour.backbone.api.objects.Market getMarket() {
        return this.market;
    }

    public java.lang.String getMedium() {
        java.lang.String r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        r1 = getUri().getQueryParameter("utm_medium");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    if ("(not set)".equals(r1) == true) { $pc1 = 6; continue $sw1; }
                    return r1;
                }
                case 6: {
                    return null;
                }
                case 7: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String getSource() {
        java.lang.String r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        r1 = getUri().getQueryParameter("utm_source");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    if ("(not set)".equals(r1) == true) { $pc2 = 6; continue $sw2; }
                    return r1;
                }
                case 6: {
                    return null;
                }
                case 7: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String getTerm() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    return getUri().getQueryParameter("utm_term");
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public boolean isPcampaignid() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (getUri().getQueryParameter("pcampaignid") == null) { $pc4 = 10; continue $sw4; }
                    return true;
                }
                case 10: {
                    return false;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return com.appfour.backbone.api.runtime.b.j6().DW(this);
    }
}
