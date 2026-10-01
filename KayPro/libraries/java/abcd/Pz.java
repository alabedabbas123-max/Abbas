package abcd;

public class Pz implements abcd.Oz {
    private final java.lang.String DW;
    private final java.lang.String FH;
    private final android.content.Context j6;

    public Pz(io.fabric.sdk.android.Kit r2) {
        if (r2.getContext() == null) goto L7;
        this.j6 = r2.getContext();
        this.DW = r2.getPath();
        this.FH = "Android/" + this.j6.getPackageName();
        return;
    L7:
        throw new java.lang.IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Override
    public java.io.File j6() {
        return j6(this.j6.getFilesDir());
    }

    java.io.File j6(java.io.File r3) {
        if (r3 != null) goto L5;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Null File");
        return null;
    L5:
        if (r3.exists() == false) goto L7;
    L10:
        return r3;
    L7:
        if (r3.mkdirs() == true) goto L10;
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Couldn't create file");
        return null;
    }
}
