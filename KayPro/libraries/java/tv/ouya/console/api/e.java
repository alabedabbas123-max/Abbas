package tv.ouya.console.api;

class e extends android.content.BroadcastReceiver {
    e() {
    }

    @Override
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        if (r6.getAction().equals("tv.ouya.controller.added") == false) goto L14;
        int r7 = r6.getIntExtra("DEVICE_ID", -1);
        int r8 = r6.getIntExtra("PLAYER_NUM", -1);
        if (r8 < 0) goto L12;
        if (r8 < 4) goto L9;
        return;
    L9:
        if (tv.ouya.console.api.f.Zo[r8] == null) goto L11;
        android.util.Log.e("OuyaController", "Controller already exists for player " + r8 + "(new device id " + r7 + ", prev device id " + tv.ouya.console.api.f.Zo[r8].DW() + ")");
    L11:
        tv.ouya.console.api.f.Zo[r8] = new tv.ouya.console.api.f(r7);
        return;
    L12:
        return;
    L14:
        if (r6.getAction().equals("tv.ouya.controller.removed") == false) goto L29;
        int r9 = r6.getIntExtra("DEVICE_ID", -1);
        int r10 = 0;
    L16:
        if (r10 >= 4) goto L31;
        tv.ouya.console.api.f r1 = tv.ouya.console.api.f.Zo[r10];
        if (r1 == null) goto L22;
        if (r1.DW() != r9) goto L22;
        tv.ouya.console.api.f.Zo[r10] = null;
        return;
    L22:
        r10 = r10 + 1;
        goto L16
    L31:
        return;
    }
}
