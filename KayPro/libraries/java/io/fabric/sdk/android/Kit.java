package io.fabric.sdk.android;

public abstract class Kit<Result> implements java.lang.Comparable<io.fabric.sdk.android.Kit> {
    android.content.Context context;
    final abcd.Interfacebz dependsOnAnnotation;
    io.fabric.sdk.android.Fabric fabric;
    io.fabric.sdk.android.services.common.v idManager;
    io.fabric.sdk.android.h<Result> initializationCallback;
    io.fabric.sdk.android.j<Result> initializationTask;

    public Kit() {
        this.initializationTask = new io.fabric.sdk.android.j(this);
        this.dependsOnAnnotation = (abcd.Interfacebz) getClass().getAnnotation(abcd.Interfacebz.class);
    }

    public int compareTo2(io.fabric.sdk.android.Kit r4) {
        if (containsAnnotatedDependency(r4) == false) goto L6;
        return 1;
    L6:
        if (r4.containsAnnotatedDependency(this) == false) goto L9;
        return -1;
    L9:
        if (hasAnnotatedDependency() == false) goto L14;
        if (r4.hasAnnotatedDependency() == true) goto L14;
        return 1;
    L14:
        if (hasAnnotatedDependency() == false) goto L16;
        return 0;
    L16:
        if (r4.hasAnnotatedDependency() == false) goto L20;
        return -1;
    L20:
        return 0;
    }

    @Override
    public int compareTo(io.fabric.sdk.android.Kit r1) {
        return compareTo2(r1);
    }

    boolean containsAnnotatedDependency(io.fabric.sdk.android.Kit r7) {
        if (hasAnnotatedDependency() == false) goto L11;
        java.lang.Class<?>[] r0 = this.dependsOnAnnotation.value();
        int r2 = r0.length;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L11;
        if (r0[r3].isAssignableFrom(r7.getClass()) == true) goto L8;
        r3 = r3 + 1;
        goto L5
    L8:
        return true;
    L11:
        return false;
    }

    protected abstract Result doInBackground();

    public android.content.Context getContext() {
        return this.context;
    }

    protected java.util.Collection<abcd.Interfacelz> getDependencies() {
        return this.initializationTask.FH();
    }

    public io.fabric.sdk.android.Fabric getFabric() {
        return this.fabric;
    }

    protected io.fabric.sdk.android.services.common.v getIdManager() {
        return this.idManager;
    }

    public abstract java.lang.String getIdentifier();

    public java.lang.String getPath() {
        return ".Fabric" + java.io.File.separator + getIdentifier();
    }

    public abstract java.lang.String getVersion();

    boolean hasAnnotatedDependency() {
        if (this.dependsOnAnnotation == null) goto L5;
        return true;
    L5:
        return false;
    }

    final void initialize() {
        this.initializationTask.j6(this.fabric.getExecutorService(), new java.lang.Void[]{null});
    }

    void injectParameters(android.content.Context r3, io.fabric.sdk.android.Fabric r4, io.fabric.sdk.android.h<Result> r5, io.fabric.sdk.android.services.common.v r6) {
        this.fabric = r4;
        this.context = new io.fabric.sdk.android.e(r3, getIdentifier(), getPath());
        this.initializationCallback = r5;
        this.idManager = r6;
    }

    protected void onCancelled(Result r1) {
    }

    protected void onPostExecute(Result r1) {
    }

    protected boolean onPreExecute() {
        return true;
    }
}
