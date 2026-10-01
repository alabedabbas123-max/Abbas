package abcd;

@abcd.Interfacexu
class Runnablerk implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;
    final boolean Hw;

    @abcd.Interfacevu
    final abcd.yk v5;

    static {
        abcd.wu.j6(abcd.Runnablerk.class, -7932626172141952505L, 403944823865884752L);
    }

    Runnablerk(abcd.yk r1, java.lang.String r2, boolean r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    private static android.os.Bundle j6(abcd.Interfacequ r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        android.os.Bundle r7 = r8.j6(r9, r10, r11, r12, r13);
        abcd.wu.j6(r7, r8, r9, r10, r11, r12, r13);
        return r7;
    }

    @Override
    @abcd.Interfacesu(method = -340244735510001735L)
    public void run() {
        java.util.Map r2 = null;
        abcd.Interfacequ r4 = null;
        java.lang.String r6 = null;
        java.lang.String r7 = null;
        java.lang.String r3 = null;
        android.os.Bundle r5 = null;
        abcd.yk.f r8 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 29: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 33; continue $sw0; }
                    abcd.wu.j6(th, -5991605754091598208L, this);
                    $pc0 = 33; continue $sw0;
                }
                case 33: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 36; continue $sw0; }
                    try {
                        abcd.wu.j6(-5991605754091598208L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    $pc0 = 36; continue $sw0;
                }
                case 36: {
                    try {
                        abcd.yk.Hw(this.v5);
                        r2 = abcd.yk.j6(this.v5, java.util.Collections.singleton(this.FH));
                        abcd.yk.VH(this.v5).set(java.lang.Long.toString(new java.security.SecureRandom().nextLong()));
                        r4 = abcd.yk.v5(this.v5);
                        r6 = com.aide.ui.U.j6;
                        r7 = this.FH;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof org.json.JSONException) { $pc0 = 20; continue $sw0; }
                        if ($t instanceof abcd.yk.b) { $pc0 = 22; continue $sw0; }
                        if ($t instanceof java.lang.InterruptedException) { $pc0 = 24; continue $sw0; }
                        if ($t instanceof android.os.RemoteException) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof abcd.yk.c) { $pc0 = 34; continue $sw0; }
                        $pc0 = 18; continue $sw0;
                    }
                    if (this.Hw == false) { $pc0 = 9; continue $sw0; }
                    r3 = "subs";
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    try {
                        r5 = j6(r4, 3, r6, r7, r3, (java.lang.String) abcd.yk.VH(this.v5).get());
                        r8 = abcd.yk.f.j6(r5.getInt("RESPONSE_CODE"));
                        this.v5.VH("resp code for intent getting: " + r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof org.json.JSONException) { $pc0 = 20; continue $sw0; }
                        if ($t instanceof abcd.yk.b) { $pc0 = 22; continue $sw0; }
                        if ($t instanceof java.lang.InterruptedException) { $pc0 = 24; continue $sw0; }
                        if ($t instanceof android.os.RemoteException) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof abcd.yk.c) { $pc0 = 34; continue $sw0; }
                        $pc0 = 18; continue $sw0;
                    }
                    if (r8 != abcd.yk.f.j6) { $pc0 = 14; continue $sw0; }
                    try {
                        abcd.yk.DW(this.v5).post(new abcd.Runnableqk(this, r2, (android.app.PendingIntent) r5.getParcelable("BUY_INTENT")));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof org.json.JSONException) { $pc0 = 20; continue $sw0; }
                        if ($t instanceof abcd.yk.b) { $pc0 = 22; continue $sw0; }
                        if ($t instanceof java.lang.InterruptedException) { $pc0 = 24; continue $sw0; }
                        if ($t instanceof android.os.RemoteException) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof abcd.yk.c) { $pc0 = 34; continue $sw0; }
                        $pc0 = 18; continue $sw0;
                    }
                    return;
                }
                case 14: {
                    if (r8 != abcd.yk.f.gn) { $pc0 = 16; continue $sw0; }
                    try {
                        this.v5.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof org.json.JSONException) { $pc0 = 20; continue $sw0; }
                        if ($t instanceof abcd.yk.b) { $pc0 = 22; continue $sw0; }
                        if ($t instanceof java.lang.InterruptedException) { $pc0 = 24; continue $sw0; }
                        if ($t instanceof android.os.RemoteException) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof abcd.yk.c) { $pc0 = 34; continue $sw0; }
                        $pc0 = 18; continue $sw0;
                    }
                    return;
                }
                case 16: {
                    try {
                        abcd.yk.j6(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof org.json.JSONException) { $pc0 = 20; continue $sw0; }
                        if ($t instanceof abcd.yk.b) { $pc0 = 22; continue $sw0; }
                        if ($t instanceof java.lang.InterruptedException) { $pc0 = 24; continue $sw0; }
                        if ($t instanceof android.os.RemoteException) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof abcd.yk.c) { $pc0 = 34; continue $sw0; }
                        $pc0 = 18; continue $sw0;
                    }
                    return;
                }
                case 9: {
                    r3 = "inapp";
                    return;
                }
                case 18: {
                    th = $ex0;
                    try {
                        this.v5.j6(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    return;
                }
                case 26: {
                    e = $ex0;
                    try {
                        abcd.yk.FH(this.v5);
                        this.v5.j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    return;
                }
                case 22: {
                    e = $ex0;
                    try {
                        this.v5.j6(e);
                        abcd.yk.j6(this.v5, e.getMessage());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    return;
                }
                case 24: {
                    e = $ex0;
                    try {
                        this.v5.j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    return;
                }
                case 20: {
                    e = $ex0;
                    try {
                        this.v5.j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    return;
                }
                case 34: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
