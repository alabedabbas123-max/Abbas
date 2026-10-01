package com.crashlytics.android.core;

class Oa implements com.crashlytics.android.core.Ka {
    private final java.io.File[] DW;
    private final java.util.Map<java.lang.String, java.lang.String> FH;
    private final java.io.File j6;

    public Oa(java.io.File r2) {
        this(r2, java.util.Collections.emptyMap());
    }

    public Oa(java.io.File r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        this.j6 = r4;
        this.DW = new java.io.File[]{r4};
        this.FH = new java.util.HashMap(r5);
        if (this.j6.length() != 0) goto L6;
        this.FH.putAll(com.crashlytics.android.core.La.j6);
        return;
    }

    @Override
    public java.lang.String DW() {
        java.lang.String r0 = getFileName();
        return r0.substring(0, r0.lastIndexOf(46));
    }

    @Override
    public java.io.File FH() {
        return this.j6;
    }

    @Override
    public java.io.File[] Hw() {
        return this.DW;
    }

    @Override
    public java.lang.String getFileName() {
        return FH().getName();
    }

    @Override
    public com.crashlytics.android.core.Ka.a getType() {
        return com.crashlytics.android.core.Ka.a.j6;
    }

    @Override
    public java.util.Map<java.lang.String, java.lang.String> j6() {
        return java.util.Collections.unmodifiableMap(this.FH);
    }

    @Override
    public void remove() {
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Removing report at " + this.j6.getPath());
        this.j6.delete();
    }
}
