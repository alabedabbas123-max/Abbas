package abcd;

class SH implements java.lang.Runnable {
    private final abcd.HH DW;
    private final java.util.List FH;
    final abcd.TH j6;

    SH(abcd.TH r1, abcd.HH r2, java.util.List r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    @Override
    public void run() {
        this.DW.call();     // Catch: java.lang.Throwable -> L4
        return;
    L4:
        th = move-exception;
        this.FH.add(th);
    }
}
