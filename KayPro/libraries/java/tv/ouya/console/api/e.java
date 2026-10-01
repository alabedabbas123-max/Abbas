package tv.ouya.console.api;

class e extends android.content.BroadcastReceiver {
    e() {
    }

    @Override
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        tv.ouya.console.api.f r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r6.getAction().equals("tv.ouya.controller.added") == false) { $pc0 = 14; continue $sw0; }
                    r7 = r6.getIntExtra("DEVICE_ID", -1);
                    r8 = r6.getIntExtra("PLAYER_NUM", -1);
                    if (r8 < 0) { $pc0 = 12; continue $sw0; }
                    if (r8 < 4) { $pc0 = 9; continue $sw0; }
                    return;
                }
                case 9: {
                    if (tv.ouya.console.api.f.Zo[r8] == null) { $pc0 = 11; continue $sw0; }
                    android.util.Log.e("OuyaController", "Controller already exists for player " + r8 + "(new device id " + r7 + ", prev device id " + tv.ouya.console.api.f.Zo[r8].DW() + ")");
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    tv.ouya.console.api.f.Zo[r8] = new tv.ouya.console.api.f(r7);
                    return;
                }
                case 12: {
                    return;
                }
                case 14: {
                    if (r6.getAction().equals("tv.ouya.controller.removed") == false) { $pc0 = 29; continue $sw0; }
                    r9 = r6.getIntExtra("DEVICE_ID", -1);
                    r10 = 0;
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    if (r10 >= 4) { $pc0 = 31; continue $sw0; }
                    r1 = tv.ouya.console.api.f.Zo[r10];
                    if (r1 == null) { $pc0 = 22; continue $sw0; }
                    if (r1.DW() != r9) { $pc0 = 22; continue $sw0; }
                    tv.ouya.console.api.f.Zo[r10] = null;
                    return;
                }
                case 22: {
                    r10 = r10 + 1;
                    { $pc0 = 16; continue $sw0; }
                }
                case 31: {
                    return;
                }
                case 29: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
