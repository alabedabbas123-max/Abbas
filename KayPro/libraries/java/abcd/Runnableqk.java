package abcd;

@abcd.Interfacexu
class Runnableqk implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.Map FH;
    final android.app.PendingIntent Hw;
    final abcd.Runnablerk v5;

    static {
        abcd.wu.j6(abcd.Runnableqk.class, -7932626172141952505L, -1181053003575811185L);
    }

    Runnableqk(abcd.Runnablerk r1, java.util.Map r2, android.app.PendingIntent r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -566482280180389300L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5989138330781357897L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5989138330781357897L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.yk.j6(this.v5.v5).putAll(this.FH);     // Catch: java.lang.Throwable -> L8
        abcd.yk.j6(this.v5.v5, this.Hw);     // Catch: java.lang.Throwable -> L8
    }
}
