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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r2 & 1) != 0) { $pc0 = 6; continue $sw0; }
                    r1.takeKeyEvents(true);
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if ((r2 & 2) != 0) { $pc0 = 9; continue $sw0; }
                    j6(r1);
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(boolean r8) {
        long r0 = 0L;
        long r2 = 0L;
        android.content.Intent r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = java.lang.System.nanoTime() / 1000000;
                    if (r8 == false) { $pc1 = 5; continue $sw1; }
                    r2 = this.DW;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if ((r0 - r2) >= 30000) { $pc1 = 9; continue $sw1; }
                    return;
                }
                case 9: {
                    if (r8 == false) { $pc1 = 11; continue $sw1; }
                    this.DW = r0;
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    r1 = new android.content.Intent("tv.ouya.metrics.action.USER_INPUT");
                    r1.putExtra("analog", r8);
                    sendBroadcast(r1);
                    return;
                }
                case 11: {
                    this.FH = r0;
                    { $pc1 = 12; continue $sw1; }
                }
                case 5: {
                    r2 = this.FH;
                    { $pc1 = 7; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((this.j6 & 8) != 0) { $pc2 = 9; continue $sw2; }
                    if (tv.ouya.console.api.j.j6(r2) == false) { $pc2 = 9; continue $sw2; }
                    j6(true);
                    return tv.ouya.console.api.j.j6(this, r2);
                }
                case 9: {
                    return super.dispatchGenericMotionEvent(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((this.j6 & 8) != 0) { $pc3 = 9; continue $sw3; }
                    if (tv.ouya.console.api.j.j6(r2) == false) { $pc3 = 9; continue $sw3; }
                    j6(false);
                    return tv.ouya.console.api.j.j6(this, r2);
                }
                case 9: {
                    return super.dispatchKeyEvent(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void onCreate(android.os.Bundle r2) {
        boolean r0 = false;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    tv.ouya.console.api.j.j6(this);
                    if ((this.j6 & 4) != 0) { $pc4 = 5; continue $sw4; }
                    r0 = true;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    tv.ouya.console.api.j.j6(r0);
                    super.onCreate(r2);
                    return;
                }
                case 5: {
                    r0 = false;
                    { $pc4 = 6; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
