package io.fabric.sdk.android.services.common;

public abstract class g implements java.lang.Runnable {
    public g() {
    }

    protected abstract void j6();

    @Override
    public final void run() {
        android.os.Process.setThreadPriority(10);
        j6();
    }
}
