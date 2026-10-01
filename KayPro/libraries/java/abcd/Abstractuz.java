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
        java.util.Iterator<abcd.Interfacewz> r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.VH.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc0 = 10; continue $sw0; }
                    try {
                        r0.next().j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 8; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 8: {
                    e = $ex0;
                    io.fabric.sdk.android.services.common.i.j6(this.j6, "One of the roll over listeners threw an exception", e);
                    { $pc0 = 4; continue $sw0; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r5) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.Hw.j6(r5, v5()) == true) { $pc1 = 6; continue $sw1; }
                    io.fabric.sdk.android.services.common.i.j6(this.j6, 4, "Fabric", java.lang.String.format(java.util.Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new java.lang.Object[]{java.lang.Integer.valueOf(this.Hw.j6()), java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(v5())}));
                    VH();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        java.util.List<java.io.File> r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.util.TreeSet r3 = null;
        java.util.Iterator<java.io.File> r4 = null;
        java.io.File r5 = null;
        java.util.ArrayList r6 = null;
        java.util.Iterator r7 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.Hw.DW();
                    r1 = Zo();
                    if (r0.size() > r1) { $pc2 = 5; continue $sw2; }
                    return;
                }
                case 5: {
                    r2 = r0.size() - r1;
                    io.fabric.sdk.android.services.common.i.FH(this.j6, java.lang.String.format(java.util.Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new java.lang.Object[]{java.lang.Integer.valueOf(r0.size()), java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(r2)}));
                    r3 = new java.util.TreeSet(new abcd.tz(this));
                    r4 = r0.iterator();
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r4.hasNext() == false) { $pc2 = 9; continue $sw2; }
                    r5 = r4.next();
                    r3.add(new abcd.Abstractuz.a(r5, j6(r5.getName())));
                    { $pc2 = 7; continue $sw2; }
                }
                case 9: {
                    r6 = new java.util.ArrayList();
                    r7 = r3.iterator();
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    if (r7.hasNext() == false) { $pc2 = 14; continue $sw2; }
                    r6.add(((abcd.Abstractuz.a) r7.next()).j6);
                    if (r6.size() != r2) { $pc2 = 11; continue $sw2; }
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    this.Hw.j6(r6);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract java.lang.String FH();

    public java.util.List<java.io.File> Hw() {
        return this.Hw.j6(1);
    }

    public boolean VH() {
        boolean r1 = false;
        java.lang.String r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r1 = true;
                    if (this.Hw.FH() == true) { $pc3 = 5; continue $sw3; }
                    r0 = FH();
                    this.Hw.j6(r0);
                    io.fabric.sdk.android.services.common.i.j6(this.j6, 4, "Fabric", java.lang.String.format(java.util.Locale.US, "generated new file %s", new java.lang.Object[]{r0}));
                    this.Zo = this.FH.j6();
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    DW(r0);
                    return r1;
                }
                case 5: {
                    r0 = null;
                    r1 = false;
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected int Zo() {
        return this.v5;
    }

    public long j6(java.lang.String r5) {
        java.lang.String[] r6 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r6 = r5.split("_");
                    if (r6.length == 3) { $pc4 = 9; continue $sw4; }
                    return 0;
                }
                case 9: {
                    return java.lang.Long.valueOf(r6[2]).longValue();
                }
                case 8: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        abcd.Interfacevz r0 = this.Hw;
        r0.j6(r0.DW());
        this.Hw.Hw();
    }

    public void j6(abcd.Interfacewz r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r2 == null) { $pc5 = 5; continue $sw5; }
                    this.VH.add(r2);
                    return;
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
