package tv.ouya.console.api;

public class OuyaActivity extends android.app.Activity {
    private long DW;
    private long FH;
    private int j6;

    public OuyaActivity() {
        this.j6 = 0;
    }

    public static void j6(android.app.Activity r1) {
        r1.getWindow().getDecorView().setSystemUiVisibility(6);
    }

    public static void j6(android.app.Activity r1, int r2) {
        if ((r2 & 1) != 0) goto L6;
        r1.takeKeyEvents(true);
    L6:
        if ((r2 & 2) != 0) goto L9;
        j6(r1);
        return;
    }

    private void j6(boolean r8) {
        long r0 = java.lang.System.nanoTime() / 1000000;
        if (r8 == false) goto L5;
        long r2 = this.DW;
    L7:
        if ((r0 - r2) >= 30000) goto L9;
        return;
    L9:
        if (r8 == false) goto L11;
        this.DW = r0;
    L12:
        android.content.Intent r1 = new android.content.Intent("tv.ouya.metrics.action.USER_INPUT");
        r1.putExtra("analog", r8);
        sendBroadcast(r1);
        return;
    L11:
        this.FH = r0;
        goto L12
    L5:
        r2 = this.FH;
        goto L7
    }

    @Override
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
        if ((this.j6 & 8) != 0) goto L9;
        if (tv.ouya.console.api.j.j6(r2) == false) goto L9;
        j6(true);
        return tv.ouya.console.api.j.j6(this, r2);
    L9:
        return super.dispatchGenericMotionEvent(r2);
    }

    @Override
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
        if ((this.j6 & 8) != 0) goto L9;
        if (tv.ouya.console.api.j.j6(r2) == false) goto L9;
        j6(false);
        return tv.ouya.console.api.j.j6(this, r2);
    L9:
        return super.dispatchKeyEvent(r2);
    }

    @Override
    protected void onCreate(android.os.Bundle r2) {
        tv.ouya.console.api.j.j6(this);
        if ((this.j6 & 4) != 0) goto L5;
        boolean r0 = true;
    L6:
        tv.ouya.console.api.j.j6(r0);
        super.onCreate(r2);
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tv.ouya.console.api.j.DW(this);
    }

    @Override
    public void setContentView(int r1) {
        super.setContentView(r1);
        j6(this, this.j6);
    }

    @Override
    public void setContentView(android.view.View r1) {
        super.setContentView(r1);
        j6(this, this.j6);
    }

    @Override
    public void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
        super.setContentView(r1, r2);
        j6(this, this.j6);
    }
}
