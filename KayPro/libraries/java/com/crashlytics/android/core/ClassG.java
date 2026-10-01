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
        monitor-enter(this);
    L21:
        th = move-exception;
        throw th;
    L4:
        if (this.v5 == false) goto L8;
        monitor-exit(this);
        return;
    L8:
        this.v5 = true;     // Catch: java.lang.Throwable -> L21
        super.flush();     // Catch: java.lang.Throwable -> L21
        super.close();     // Catch: java.lang.Throwable -> L21
        java.io.File r0 = new java.io.File(this.DW + ".cls");     // Catch: java.lang.Throwable -> L21
        if (this.FH.renameTo(r0) == false) goto L13;
        this.FH = null;     // Catch: java.lang.Throwable -> L21
        this.Hw = r0;     // Catch: java.lang.Throwable -> L21
        monitor-exit(this);
        return;
    L13:
        java.lang.String r1 = "";
        if (r0.exists() == false) goto L16;
        r1 = " (target already exists)";
    L20:
        throw new java.io.IOException("Could not rename temp file: " + this.FH + " -> " + r0 + r1);     // Catch: java.lang.Throwable -> L21
    L16:
        if (this.FH.exists() == true) goto L20;
        r1 = " (source does not exist)";
        goto L20
    }

    public void j6() {
        if (this.v5 == false) goto L5;
        return;
    L5:
        this.v5 = true;
        super.flush();
        super.close();
    }
}
