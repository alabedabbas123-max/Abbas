package abcd;

public class Pz implements abcd.Oz {
    private final java.lang.String DW;
    private final java.lang.String FH;
    private final android.content.Context j6;

    public Pz(io.fabric.sdk.android.Kit r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2.getContext() == null) { $pc0 = 7; continue $sw0; }
                    this.j6 = r2.getContext();
                    this.DW = r2.getPath();
                    this.FH = "Android/" + this.j6.getPackageName();
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.io.File j6() {
        return j6(this.j6.getFilesDir());
    }

    java.io.File j6(java.io.File r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 != null) { $pc1 = 5; continue $sw1; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Null File");
                    return null;
                }
                case 5: {
                    if (r3.exists() == false) { $pc1 = 7; continue $sw1; }
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    return r3;
                }
                case 7: {
                    if (r3.mkdirs() == true) { $pc1 = 10; continue $sw1; }
                    io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Couldn't create file");
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
