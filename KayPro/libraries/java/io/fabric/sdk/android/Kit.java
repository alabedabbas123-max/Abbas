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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (containsAnnotatedDependency(r4) == false) { $pc0 = 6; continue $sw0; }
                    return 1;
                }
                case 6: {
                    if (r4.containsAnnotatedDependency(this) == false) { $pc0 = 9; continue $sw0; }
                    return -1;
                }
                case 9: {
                    if (hasAnnotatedDependency() == false) { $pc0 = 14; continue $sw0; }
                    if (r4.hasAnnotatedDependency() == true) { $pc0 = 14; continue $sw0; }
                    return 1;
                }
                case 14: {
                    if (hasAnnotatedDependency() == false) { $pc0 = 16; continue $sw0; }
                    return 0;
                }
                case 16: {
                    if (r4.hasAnnotatedDependency() == false) { $pc0 = 20; continue $sw0; }
                    return -1;
                }
                case 20: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int compareTo(io.fabric.sdk.android.Kit r1) {
        return compareTo2(r1);
    }

    boolean containsAnnotatedDependency(io.fabric.sdk.android.Kit r7) {
        java.lang.Class<?>[] r0 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (hasAnnotatedDependency() == false) { $pc1 = 11; continue $sw1; }
                    r0 = this.dependsOnAnnotation.value();
                    r2 = r0.length;
                    r3 = 0;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    if (r3 >= r2) { $pc1 = 11; continue $sw1; }
                    if (r0[r3].isAssignableFrom(r7.getClass()) == true) { $pc1 = 8; continue $sw1; }
                    r3 = r3 + 1;
                    { $pc1 = 5; continue $sw1; }
                }
                case 8: {
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.dependsOnAnnotation == null) { $pc2 = 5; continue $sw2; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
