package com.crashlytics.android.core;

class ClassG extends java.io.FileOutputStream {
    public static final java.io.FilenameFilter j6 = null;
    private final java.lang.String DW;
    private java.io.File FH;
    private java.io.File Hw;
    private boolean v5;

    static {
        j6 = new com.crashlytics.android.core.ClassF();
    }

    public ClassG(java.io.File r4, java.lang.String r5) {
        super(new java.io.File(r4, r5 + ".cls_temp"));
        this.v5 = false;
        this.DW = r4 + java.io.File.separator + r5;
        java.lang.StringBuilder r6 = new java.lang.StringBuilder();
        r6.append(this.DW);
        r6.append(".cls_temp");
        this.FH = new java.io.File(r6.toString());
    }

    @Override
    public synchronized void close() {
        java.io.File r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    monitor-enter(this);
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (this.v5 == false) { $pc0 = 8; continue $sw0; }
                    monitor-exit(this);
                    return;
                }
                case 8: {
                    try {
                        this.v5 = true;
                        super.flush();
                        super.close();
                        r0 = new java.io.File(this.DW + ".cls");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    if (this.FH.renameTo(r0) == false) { $pc0 = 13; continue $sw0; }
                    try {
                        this.FH = null;
                        this.Hw = r0;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    monitor-exit(this);
                    return;
                }
                case 13: {
                    r1 = "";
                    if (r0.exists() == false) { $pc0 = 16; continue $sw0; }
                    r1 = " (target already exists)";
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    try {
                        throw new java.io.IOException("Could not rename temp file: " + this.FH + " -> " + r0 + r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                }
                case 16: {
                    if (this.FH.exists() == true) { $pc0 = 20; continue $sw0; }
                    r1 = " (source does not exist)";
                    { $pc0 = 20; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.v5 == false) { $pc1 = 5; continue $sw1; }
                    return;
                }
                case 5: {
                    this.v5 = true;
                    super.flush();
                    super.close();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
