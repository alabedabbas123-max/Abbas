package abcd;

class VH extends abcd.CH {
    private final java.util.concurrent.locks.ReentrantLock v5;

    VH(abcd.NH r1) {
        super(r1);
        this.v5 = new java.util.concurrent.locks.ReentrantLock();
    }

    @Override
    abcd.CH.a j6(byte[] r2, int r3, int r4) {
        byte[] r5 = j6(r2, r3);
        this.v5.lock();
        abcd.CH.a r6 = super.j6(r5, r3, r4);     // Catch: java.lang.Throwable -> L6
        this.v5.unlock();
        return r6;
    L6:
        th = move-exception;
        this.v5.unlock();
        throw th;
    }

    @Override
    void j6(int r2) {
        this.v5.lock();
        super.j6(r2);     // Catch: java.lang.Throwable -> L6
        this.v5.unlock();
        return;
    L6:
        th = move-exception;
        this.v5.unlock();
        throw th;
    }

    @Override
    boolean j6(int r2, abcd.MH r3, abcd.MH r4) {
        this.v5.lock();
        boolean r5 = super.j6(r2, r3, r4);     // Catch: java.lang.Throwable -> L6
        this.v5.unlock();
        return r5;
    L6:
        th = move-exception;
        this.v5.unlock();
        throw th;
    }
}
