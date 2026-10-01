package io.fabric.sdk.android.services.common;

public class SafeToast extends android.widget.Toast {
    public SafeToast(android.content.Context r1) {
        super(r1);
    }

    static void j6(io.fabric.sdk.android.services.common.SafeToast r0) {
        super.show();
    }

    @Override
    public void show() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) goto L5;
        super.show();
        return;
    L5:
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new io.fabric.sdk.android.services.common.B(this));
    }
}
