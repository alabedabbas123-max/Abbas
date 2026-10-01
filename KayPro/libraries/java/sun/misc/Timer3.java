package sun.misc;

class Timer3 extends Thread {
    static final int MAX_POOL_SIZE = 3;
    static int curPoolSize = 0;
    static Timer3 pool = null;
    long lastSleepUntil;
    Timer3 next = null;
    Timer timer;

    Timer3() {
    }

    protected static synchronized Timer3 call(Timer timer, long sleepUntil) {
        Timer3 thread;
        thread = pool;
        if (thread == null) {
            thread = new Timer3();
            thread.timer = timer;
            thread.lastSleepUntil = sleepUntil;
            thread.start();
        } else {
            pool = pool.next;
            thread.timer = timer;
            thread.lastSleepUntil = sleepUntil;
            synchronized (thread) {
                thread.notify();
            }
        }
        return thread;
    }

    private boolean returnToPool() {
        synchronized (getClass()) {
            if (curPoolSize >= 3) {
                return false;
            }
            this.next = pool;
            pool = this;
            curPoolSize++;
            this.timer = null;
            while (this.timer == null) {
                synchronized (this) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
            synchronized (getClass()) {
                curPoolSize--;
            }
            return true;
        }
    }

    @Override
    public void run() {
        do {
            this.timer.owner.tick(this.timer);
            synchronized (Timer2.timerThread) {
                synchronized (this.timer) {
                    if (this.lastSleepUntil == this.timer.sleepUntil) {
                        Timer2.requeue(this.timer);
                    }
                }
            }
        } while (returnToPool());
    }
}
