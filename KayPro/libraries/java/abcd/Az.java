package abcd;

public class Az implements abcd.Interfacevz {
    private final java.io.File DW;
    private final java.lang.String FH;
    private final java.io.File Hw;
    private java.io.File Zo;
    private final android.content.Context j6;
    private io.fabric.sdk.android.services.common.z v5;

    public Az(android.content.Context r1, java.io.File r2, java.lang.String r3, java.lang.String r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r4;
        this.Hw = new java.io.File(this.DW, r3);
        this.v5 = new io.fabric.sdk.android.services.common.z(this.Hw);
        v5();
    }

    private void j6(java.io.File r5, java.io.File r6) {
        java.io.OutputStream r2 = null;
        java.io.FileInputStream r3 = new java.io.FileInputStream(r5);     // Catch: java.lang.Throwable -> L9
        r2 = j6(r6);     // Catch: java.lang.Throwable -> L7
        io.fabric.sdk.android.services.common.i.j6(r3, r2, new byte[1024]);     // Catch: java.lang.Throwable -> L7
        io.fabric.sdk.android.services.common.i.j6(r3, "Failed to close file input stream");
        io.fabric.sdk.android.services.common.i.j6(r2, "Failed to close output stream");
        r5.delete();
        return;
    L7:
        th = th;
    L11:
        io.fabric.sdk.android.services.common.i.j6(r3, "Failed to close file input stream");
        io.fabric.sdk.android.services.common.i.j6(r2, "Failed to close output stream");
        r5.delete();
        throw th;
    L9:
        th = th;
        r3 = null;
        goto L11
    }

    private void v5() {
        this.Zo = new java.io.File(this.DW, this.FH);
        if (this.Zo.exists() == true) goto L6;
        this.Zo.mkdirs();
        return;
    }

    @Override
    public java.util.List<java.io.File> DW() {
        return java.util.Arrays.asList(this.Zo.listFiles());
    }

    @Override
    public boolean FH() {
        return this.v5.DW();
    }

    @Override
    public void Hw() {
        this.v5.close();     // Catch: java.io.IOException -> L5
    L3:
        this.Hw.delete();
    }

    @Override
    public int j6() {
        return this.v5.Hw();
    }

    public java.io.OutputStream j6(java.io.File r1) {
        throw null;
    }

    @Override
    public java.util.List<java.io.File> j6(int r6) {
        java.util.ArrayList r0 = new java.util.ArrayList();
        java.io.File[] r1 = this.Zo.listFiles();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L8;
        r0.add(r1[r3]);
        if (r0.size() >= r6) goto L8;
        r3 = r3 + 1;
    L8:
        return r0;
    }

    @Override
    public void j6(java.lang.String r4) {
        this.v5.close();
        j6(this.Hw, new java.io.File(this.Zo, r4));
        this.v5 = new io.fabric.sdk.android.services.common.z(this.Hw);
    }

    @Override
    public void j6(java.util.List<java.io.File> r6) {
        java.util.Iterator<java.io.File> r7 = r6.iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        java.io.File r0 = r7.next();
        io.fabric.sdk.android.services.common.i.FH(this.j6, java.lang.String.format("deleting sent analytics file %s", new java.lang.Object[]{r0.getName()}));
        r0.delete();
        goto L4
    }

    @Override
    public void j6(byte[] r2) {
        this.v5.j6(r2);
    }

    @Override
    public boolean j6(int r2, int r3) {
        return this.v5.j6(r2, r3);
    }
}
