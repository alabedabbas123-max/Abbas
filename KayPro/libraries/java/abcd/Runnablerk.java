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
    L29:
        th = move-exception;
        if (DW == false) goto L33;
        abcd.wu.j6(th, -5991605754091598208L, this);
    L33:
        throw th;
    L4:
        if (j6 == false) goto L36;
        abcd.wu.j6(-5991605754091598208L, this);     // Catch: java.lang.Throwable -> L29
    L36:
        abcd.yk.Hw(this.v5);     // Catch: java.lang.Throwable -> L18 org.json.JSONException -> L20 abcd.yk.b -> L22 java.lang.InterruptedException -> L24 android.os.RemoteException -> L26 abcd.yk.c -> L34
        java.util.Map r2 = abcd.yk.j6(this.v5, java.util.Collections.singleton(this.FH));     // Catch: java.lang.Throwable -> L18 org.json.JSONException -> L20 abcd.yk.b -> L22 java.lang.InterruptedException -> L24 android.os.RemoteException -> L26 abcd.yk.c -> L34
        abcd.yk.VH(this.v5).set(java.lang.Long.toString(new java.security.SecureRandom().nextLong()));     // Catch: java.lang.Throwable -> L18 org.json.JSONException -> L20 abcd.yk.b -> L22 java.lang.InterruptedException -> L24 android.os.RemoteException -> L26 abcd.yk.c -> L34
        abcd.Interfacequ r4 = abcd.yk.v5(this.v5);     // Catch: java.lang.Throwable -> L18 org.json.JSONException -> L20 abcd.yk.b -> L22 java.lang.InterruptedException -> L24 android.os.RemoteException -> L26 abcd.yk.c -> L34
        java.lang.String r6 = com.aide.ui.U.j6;     // Catch: java.lang.Throwable -> L18 org.json.JSONException -> L20 abcd.yk.b -> L22 java.lang.InterruptedException -> L24 android.os.RemoteException -> L26 abcd.yk.c -> L34
        java.lang.String r7 = this.FH;     // Catch: java.lang.Throwable -> L18 org.json.JSONException -> L20 abcd.yk.b -> L22 java.lang.InterruptedException -> L24 android.os.RemoteException -> L26 abcd.yk.c -> L34
        if (this.Hw == false) goto L9;
        java.lang.String r3 = "subs";
    L10:
        android.os.Bundle r5 = j6(r4, 3, r6, r7, r3, (java.lang.String) abcd.yk.VH(this.v5).get());     // Catch: java.lang.Throwable -> L18 org.json.JSONException -> L20 abcd.yk.b -> L22 java.lang.InterruptedException -> L24 android.os.RemoteException -> L26 abcd.yk.c -> L34
        abcd.yk.f r8 = abcd.yk.f.j6(r5.getInt("RESPONSE_CODE"));     // Catch: java.lang.Throwable -> L18 org.json.JSONException -> L20 abcd.yk.b -> L22 java.lang.InterruptedException -> L24 android.os.RemoteException -> L26 abcd.yk.c -> L34
        this.v5.VH("resp code for intent getting: " + r8);     // Catch: java.lang.Throwable -> L18 org.json.JSONException -> L20 abcd.yk.b -> L22 java.lang.InterruptedException -> L24 android.os.RemoteException -> L26 abcd.yk.c -> L34
        if (r8 != abcd.yk.f.j6) goto L14;
        abcd.yk.DW(this.v5).post(new abcd.Runnableqk(this, r2, (android.app.PendingIntent) r5.getParcelable("BUY_INTENT")));     // Catch: java.lang.Throwable -> L18 org.json.JSONException -> L20 abcd.yk.b -> L22 java.lang.InterruptedException -> L24 android.os.RemoteException -> L26 abcd.yk.c -> L34
        return;
    L14:
        if (r8 != abcd.yk.f.gn) goto L16;
        this.v5.j6();     // Catch: java.lang.Throwable -> L18 org.json.JSONException -> L20 abcd.yk.b -> L22 java.lang.InterruptedException -> L24 android.os.RemoteException -> L26 abcd.yk.c -> L34
        return;
    L16:
        abcd.yk.j6(r8);     // Catch: java.lang.Throwable -> L18 org.json.JSONException -> L20 abcd.yk.b -> L22 java.lang.InterruptedException -> L24 android.os.RemoteException -> L26 abcd.yk.c -> L34
        return;
    L9:
        r3 = "inapp";
    L18:
        th = move-exception;
        this.v5.j6(th);     // Catch: java.lang.Throwable -> L29
        return;
    L26:
        e = move-exception;
        abcd.yk.FH(this.v5);     // Catch: java.lang.Throwable -> L29
        this.v5.j6(e);     // Catch: java.lang.Throwable -> L29
        return;
    L22:
        e = move-exception;
        this.v5.j6(e);     // Catch: java.lang.Throwable -> L29
        abcd.yk.j6(this.v5, e.getMessage());     // Catch: java.lang.Throwable -> L29
        return;
    L24:
        e = move-exception;
        this.v5.j6(e);     // Catch: java.lang.Throwable -> L29
        return;
    L20:
        e = move-exception;
        this.v5.j6(e);     // Catch: java.lang.Throwable -> L29
        return;
    }
}
