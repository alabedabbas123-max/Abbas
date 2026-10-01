package abcd;

public class Rz implements abcd.Qz {
    private final java.lang.String DW;
    private final android.content.Context FH;
    private final android.content.SharedPreferences j6;

    public Rz(android.content.Context r2, java.lang.String r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.FH = r2;
                    this.DW = r3;
                    this.j6 = this.FH.getSharedPreferences(this.DW, 0);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (android.os.Build.VERSION.SDK_INT < 9) { $pc1 = 7; continue $sw1; }
                    r3.apply();
                    return true;
                }
                case 7: {
                    return r3.commit();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
