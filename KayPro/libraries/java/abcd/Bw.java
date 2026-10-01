package abcd;

public class Bw extends io.fabric.sdk.android.Kit<java.lang.Boolean> implements io.fabric.sdk.android.services.common.n {
    public Bw() {
    }

    @Override
    public java.util.Map<io.fabric.sdk.android.services.common.v.a, java.lang.String> Hw() {
        return java.util.Collections.emptyMap();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    protected java.lang.Boolean doInBackground() {
        io.fabric.sdk.android.Fabric.getLogger().Hw("Beta", "Beta kit initializing...");
        return true;
    }

    @Override
    protected java.lang.Boolean doInBackground() {
        return doInBackground();
    }

    @Override
    public java.lang.String getIdentifier() {
        return "com.crashlytics.sdk.android:beta";
    }

    @Override
    public java.lang.String getVersion() {
        return "1.2.10.27";
    }
}
