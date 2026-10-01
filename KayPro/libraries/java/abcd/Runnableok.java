package abcd;

@abcd.Interfacexu
class Runnableok implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.Set FH;
    final abcd.yk.a Hw;

    @abcd.Interfacevu
    final abcd.yk v5;

    static {
        abcd.wu.j6(abcd.Runnableok.class, -7932626172141952505L, 403830119156661292L);
    }

    Runnableok(abcd.yk r1, java.util.Set r2, abcd.yk.a r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -805343711958410448L)
    public void run() {
    L21:
        th = move-exception;
        if (DW == false) goto L25;
        abcd.wu.j6(th, 2354084318773793760L, this);
    L25:
        throw th;
    L4:
        if (j6 == false) goto L27;
        abcd.wu.j6(2354084318773793760L, this);     // Catch: java.lang.Throwable -> L21
    L27:
        abcd.yk.Hw(this.v5);     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L10 abcd.yk.c -> L12 abcd.yk.b -> L14 java.lang.InterruptedException -> L16 android.os.RemoteException -> L18
        java.util.Map<java.lang.String, abcd.yk.g> r2 = abcd.yk.j6(this.v5, this.FH);     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L10 abcd.yk.c -> L12 abcd.yk.b -> L14 java.lang.InterruptedException -> L16 android.os.RemoteException -> L18
        this.Hw.j6(r2);     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L10 abcd.yk.c -> L12 abcd.yk.b -> L14 java.lang.InterruptedException -> L16 android.os.RemoteException -> L18
    L34:
        return;
    L12:
        e = move-exception;
        this.v5.j6(e);     // Catch: java.lang.Throwable -> L21
        this.Hw.j6("Internal error in in-app billing (cancelled).");     // Catch: java.lang.Throwable -> L21
        return;
    L14:
        e = move-exception;
        this.v5.j6(e);     // Catch: java.lang.Throwable -> L21
        this.Hw.j6(e.getMessage());     // Catch: java.lang.Throwable -> L21
        return;
    L18:
        e = move-exception;
        this.v5.j6(e);     // Catch: java.lang.Throwable -> L21
        this.Hw.j6("Error communicating with Play Store service.");     // Catch: java.lang.Throwable -> L21
        return;
    L16:
        e = move-exception;
        this.v5.j6(e);     // Catch: java.lang.Throwable -> L21
        this.Hw.j6("Internal error in in-app billing (interrupted).");     // Catch: java.lang.Throwable -> L21
        return;
    L10:
        e = move-exception;
        this.v5.j6(e);     // Catch: java.lang.Throwable -> L21
        this.Hw.j6("Internal error in in-app billing (JSON parse).");     // Catch: java.lang.Throwable -> L21
        return;
    L8:
        th = move-exception;
        this.v5.j6(th);     // Catch: java.lang.Throwable -> L21
    }
}
