package com.crashlytics.android.core;

class Ca implements com.crashlytics.android.core.Ka {
    private final java.io.File j6;

    public Ca(java.io.File r1) {
        this.j6 = r1;
    }

    @Override
    public java.lang.String DW() {
        return this.j6.getName();
    }

    @Override
    public java.io.File FH() {
        return null;
    }

    @Override
    public java.io.File[] Hw() {
        return this.j6.listFiles();
    }

    @Override
    public java.lang.String getFileName() {
        return null;
    }

    @Override
    public com.crashlytics.android.core.Ka.a getType() {
        return com.crashlytics.android.core.Ka.a.DW;
    }

    @Override
    public java.util.Map<java.lang.String, java.lang.String> j6() {
        return null;
    }

    @Override
    public void remove() {
        java.io.File[] r0 = Hw();
        int r1 = r0.length;
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L6;
        java.io.File r4 = r0[r2];
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Removing native report file at " + r4.getPath());
        r4.delete();
        r2 = r2 + 1;
        goto L4
    L6:
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Removing native report directory at " + this.j6);
        this.j6.delete();
    }
}
