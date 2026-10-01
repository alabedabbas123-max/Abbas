package abcd;

class Ty implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.atomic.AtomicInteger j6;

    Ty() {
        this.j6 = new java.util.concurrent.atomic.AtomicInteger(1);
    }

    @Override
    public java.lang.Thread newThread(java.lang.Runnable r4) {
        return new java.lang.Thread(r4, "AsyncTask #" + this.j6.getAndIncrement());
    }
}
