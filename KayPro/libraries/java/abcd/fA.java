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
        if (r6 != null) goto L10;
    L8:
        return null;
    L10:
        int r1 = io.fabric.sdk.android.services.common.i.Hw(r5);     // Catch: java.lang.Exception -> L6
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "App icon resource ID is " + r1);     // Catch: java.lang.Exception -> L6
        android.graphics.BitmapFactory.Options r2 = new android.graphics.BitmapFactory.Options();     // Catch: java.lang.Exception -> L6
        r2.inJustDecodeBounds = true;     // Catch: java.lang.Exception -> L6
        android.graphics.BitmapFactory.decodeResource(r5.getResources(), r1, r2);     // Catch: java.lang.Exception -> L6
        return new abcd.fA(r6, r1, r2.outWidth, r2.outHeight);
    L6:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to load icon", e);
        goto L8
    }
}
