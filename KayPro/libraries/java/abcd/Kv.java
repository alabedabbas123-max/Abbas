package abcd;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appfour.backbone.api.Api;
import com.appfour.backbone.api.objects.Market;
import com.appfour.backbone.api.objects.MarketReferrer;

/** Google Play Install Referrer callback backed by the official library. */
class Kv implements InstallReferrerStateListener {
    private final InstallReferrerClient client;

    Kv(InstallReferrerClient client) {
        this.client = client;
    }

    @Override
    public void onInstallReferrerServiceDisconnected() {
        // A later app start can establish a fresh connection.
    }

    @Override
    public void onInstallReferrerSetupFinished(int responseCode) {
        if (responseCode == InstallReferrerClient.InstallReferrerResponse.FEATURE_NOT_SUPPORTED) {
            rw.Zo();
            return;
        }
        if (responseCode != InstallReferrerClient.InstallReferrerResponse.OK) {
            return;
        }

        try {
            ReferrerDetails details = client.getInstallReferrer();
            String referrer = details.getInstallReferrer();
            long installBegin = details.getInstallBeginTimestampSeconds() * 1000L;
            long clickTime = details.getReferrerClickTimestampSeconds() * 1000L;
            long installTime = Api.getInstallTime();

            boolean validClick = clickTime != 0L && clickTime < installTime;
            boolean validInstall = installBegin != 0L && installBegin < installTime;

            if (!validClick && !validInstall) {
                installBegin = installTime - 2L;
                clickTime = installTime - 1L;
            } else if (validClick && !validInstall) {
                installBegin = clickTime - 1L;
            } else if (!validClick) {
                clickTime = installBegin + 1L;
            } else if (clickTime <= installBegin) {
                clickTime = installBegin + 1L;
            }

            rw.Zo();
            wu.j6(new MarketReferrer(new Market("com.android.vending"), referrer), installBegin, clickTime);
            client.endConnection();
        } catch (Throwable error) {
            yw.j6("Runtime Error", error);
        }
    }
}
