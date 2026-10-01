package abcd;

import android.app.Application;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appfour.backbone.api.Api;

/** Starts the official Google Play Install Referrer client. */
public class Lv {
    public static void j6() {
        if (!Api.isMainProcess()) {
            return;
        }
        if (rw.Hw()) {
            return;
        }

        try {
            Application application = wu.j6();
            String installer = application.getPackageManager()
                    .getInstallerPackageName(application.getPackageName());
            if (!"com.android.vending".equals(installer)) {
                rw.Zo();
                return;
            }

            InstallReferrerClient client = InstallReferrerClient.newBuilder(application).build();
            client.startConnection(new Kv(client));
        } catch (NoClassDefFoundError error) {
            yw.j6("PlayInstallReferrer", "Class not found", error);
        } catch (Throwable error) {
            yw.j6("Runtime Error", error);
        }
    }
}
