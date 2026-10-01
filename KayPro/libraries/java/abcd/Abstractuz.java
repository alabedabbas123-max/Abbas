package abcd;

public abstract class Abstractuz<T> {
    protected final sz<T> DW;
    protected final io.fabric.sdk.android.services.common.k FH;
    protected final abcd.Interfacevz Hw;
    protected final java.util.List<abcd.Interfacewz> VH;
    protected volatile long Zo;
    protected final android.content.Context j6;
    private final int v5;

    static class a {
        final long DW;
        final java.io.File j6;

        public a(java.io.File r1, long r2) {
            this.j6 = r1;
            this.DW = r2;
        }
    }

    public Abstractuz(android.content.Context r2, sz<T> r3, io.fabric.sdk.android.services.common.k r4, abcd.Interfacevz r5, int r6) {
        this.VH = new java.util.concurrent.CopyOnWriteArrayList();
        this.j6 = r2.getApplicationContext();
        this.DW = r3;
        this.Hw = r5;
        this.FH = r4;
        this.Zo = this.FH.j6();
        this.v5 = r6;
    }

    private void DW(java.lang.String r5) {
        java.util.Iterator<abcd.Interfacewz> r0 = this.VH.iterator();
    L4:
        if (r0.hasNext() == false) goto L10;
        r0.next().j6(r5);     // Catch: java.lang.Exception -> L8
    L8:
        e = move-exception;
        io.fabric.sdk.android.services.common.i.j6(this.j6, "One of the roll over listeners threw an exception", e);
        goto L4
    }

    private void j6(int r5) {
        if (this.Hw.j6(r5, v5()) == true) goto L6;
        io.fabric.sdk.android.services.common.i.j6(this.j6, 4, "Fabric", java.lang.String.format(java.util.Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new java.lang.Object[]{java.lang.Integer.valueOf(this.Hw.j6()), java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(v5())}));
        VH();
        return;
    }

    public void DW() {
        java.util.List<java.io.File> r0 = this.Hw.DW();
        int r1 = Zo();
        if (r0.size() > r1) goto L5;
        return;
    L5:
        int r2 = r0.size() - r1;
        io.fabric.sdk.android.services.common.i.FH(this.j6, java.lang.String.format(java.util.Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new java.lang.Object[]{java.lang.Integer.valueOf(r0.size()), java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(r2)}));
        java.util.TreeSet r3 = new java.util.TreeSet(new abcd.tz(this));
        java.util.Iterator<java.io.File> r4 = r0.iterator();
    L7:
        if (r4.hasNext() == false) goto L9;
        java.io.File r5 = r4.next();
        r3.add(new abcd.Abstractuz.a(r5, j6(r5.getName())));
        goto L7
    L9:
        java.util.ArrayList r6 = new java.util.ArrayList();
        java.util.Iterator r7 = r3.iterator();
    L11:
        if (r7.hasNext() == false) goto L14;
        r6.add(((abcd.Abstractuz.a) r7.next()).j6);
        if (r6.size() != r2) goto L11;
    L14:
        this.Hw.j6(r6);
    }

    protected abstract java.lang.String FH();

    public java.util.List<java.io.File> Hw() {
        return this.Hw.j6(1);
    }

    public boolean VH() {
        boolean r1 = true;
        if (this.Hw.FH() == true) goto L5;
        java.lang.String r0 = FH();
        this.Hw.j6(r0);
        io.fabric.sdk.android.services.common.i.j6(this.j6, 4, "Fabric", java.lang.String.format(java.util.Locale.US, "generated new file %s", new java.lang.Object[]{r0}));
        this.Zo = this.FH.j6();
    L6:
        DW(r0);
        return r1;
    L5:
        r0 = null;
        r1 = false;
        goto L6
    }

    protected int Zo() {
        return this.v5;
    }

    public long j6(java.lang.String r5) {
        java.lang.String[] r6 = r5.split("_");
        if (r6.length == 3) goto L9;
        return 0;
    L9:
        return java.lang.Long.valueOf(r6[2]).longValue();
    L8:
        return 0;
    }

    public void j6() {
        abcd.Interfacevz r0 = this.Hw;
        r0.j6(r0.DW());
        this.Hw.Hw();
    }

    public void j6(abcd.Interfacewz r2) {
        if (r2 == null) goto L5;
        this.VH.add(r2);
        return;
    }

    public void j6(T r2) {
        byte[] r3 = this.DW.j6(r2);
        j6(r3.length);
        this.Hw.j6(r3);
    }

    public void j6(java.util.List<java.io.File> r2) {
        this.Hw.j6(r2);
    }

    protected int v5() {
        return 8000;
    }
}
