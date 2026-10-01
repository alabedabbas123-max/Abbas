package abcd;

class Yy implements java.lang.Runnable {
    final abcd.Xy.c DW;
    final java.lang.Runnable j6;

    Yy(abcd.Xy.c r1, java.lang.Runnable r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public void run() {
        this.j6.run();     // Catch: java.lang.Throwable -> L5
        this.DW.j6();
        return;
    L5:
        th = move-exception;
        this.DW.j6();
        throw th;
    }
}
