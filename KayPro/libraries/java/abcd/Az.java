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
        java.io.FileInputStream r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r2 = null;
                    try {
                        r3 = new java.io.FileInputStream(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    try {
                        r2 = j6(r6);
                        io.fabric.sdk.android.services.common.i.j6(r3, r2, new byte[1024]);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r3, "Failed to close file input stream");
                    io.fabric.sdk.android.services.common.i.j6(r2, "Failed to close output stream");
                    r5.delete();
                    return;
                }
                case 7: {
                    th = th;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    io.fabric.sdk.android.services.common.i.j6(r3, "Failed to close file input stream");
                    io.fabric.sdk.android.services.common.i.j6(r2, "Failed to close output stream");
                    r5.delete();
                    throw th;
                }
                case 9: {
                    th = th;
                    r3 = null;
                    { $pc0 = 11; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void v5() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.Zo = new java.io.File(this.DW, this.FH);
                    if (this.Zo.exists() == true) { $pc1 = 6; continue $sw1; }
                    this.Zo.mkdirs();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        this.v5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 5; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    this.Hw.delete();
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.util.ArrayList r0 = null;
        java.io.File[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.util.ArrayList();
                    r1 = this.Zo.listFiles();
                    r2 = r1.length;
                    r3 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r3 >= r2) { $pc3 = 8; continue $sw3; }
                    r0.add(r1[r3]);
                    if (r0.size() >= r6) { $pc3 = 8; continue $sw3; }
                    r3 = r3 + 1;
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(java.lang.String r4) {
        this.v5.close();
        j6(this.Hw, new java.io.File(this.Zo, r4));
        this.v5 = new io.fabric.sdk.android.services.common.z(this.Hw);
    }

    @Override
    public void j6(java.util.List<java.io.File> r6) {
        java.util.Iterator<java.io.File> r7 = null;
        java.io.File r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r7 = r6.iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r7.hasNext() == false) { $pc4 = 6; continue $sw4; }
                    r0 = r7.next();
                    io.fabric.sdk.android.services.common.i.FH(this.j6, java.lang.String.format("deleting sent analytics file %s", new java.lang.Object[]{r0.getName()}));
                    r0.delete();
                    { $pc4 = 4; continue $sw4; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
