package abcd;

public class fA {
    public final int DW;
    public final int FH;
    public final int Hw;
    public final java.lang.String j6;

    public fA(java.lang.String r1, int r2, int r3, int r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    public static abcd.fA j6(android.content.Context r5, java.lang.String r6) {
        int r1 = 0;
        android.graphics.BitmapFactory.Options r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r6 != null) { $pc0 = 10; continue $sw0; }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    return null;
                }
                case 10: {
                    try {
                        r1 = io.fabric.sdk.android.services.common.i.Hw(r5);
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "App icon resource ID is " + r1);
                        r2 = new android.graphics.BitmapFactory.Options();
                        r2.inJustDecodeBounds = true;
                        android.graphics.BitmapFactory.decodeResource(r5.getResources(), r1, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 6; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return new abcd.fA(r6, r1, r2.outWidth, r2.outHeight);
                }
                case 6: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to load icon", e);
                    { $pc0 = 8; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
