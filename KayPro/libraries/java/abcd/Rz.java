package abcd;

public class Rz implements abcd.Qz {
    private final java.lang.String DW;
    private final android.content.Context FH;
    private final android.content.SharedPreferences j6;

    public Rz(android.content.Context r2, java.lang.String r3) {
        if (r2 == null) goto L7;
        this.FH = r2;
        this.DW = r3;
        this.j6 = this.FH.getSharedPreferences(this.DW, 0);
        return;
    L7:
        throw new java.lang.IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @java.lang.Deprecated
    public Rz(io.fabric.sdk.android.Kit r2) {
        this(r2.getContext(), r2.getClass().getName());
    }

    @Override
    public android.content.SharedPreferences.Editor edit() {
        return this.j6.edit();
    }

    @Override
    public android.content.SharedPreferences get() {
        return this.j6;
    }

    @Override
    @android.annotation.TargetApi(9)
    public boolean j6(android.content.SharedPreferences.Editor r3) {
        if (android.os.Build.VERSION.SDK_INT < 9) goto L7;
        r3.apply();
        return true;
    L7:
        return r3.commit();
    }
}
