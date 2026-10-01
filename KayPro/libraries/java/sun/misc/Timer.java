package sun.misc;

public class Timer {
    static Timer2 timerThread = null;
    long interval;
    Timer next;
    public Timeable owner;
    long remainingTime;
    boolean regular = true;
    long sleepUntil = System.currentTimeMillis();
    boolean stopped = true;

    public Timer(Timeable owner, long interval) {
        this.owner = owner;
        this.interval = interval;
        this.remainingTime = interval;
        synchronized (getClass()) {
            if (timerThread == null) {
                timerThread = new Timer2();
            }
        }
    }

    public synchronized boolean isStopped() {
        return this.stopped;
    }

    public void stop() {
        long now = System.currentTimeMillis();
        synchronized (timerThread) {
            synchronized (this) {
                if (!this.stopped) {
                    Timer2.dequeue(this);
                    this.remainingTime = Math.max(0L, this.sleepUntil - now);
                    this.sleepUntil = now;
                    this.stopped = true;
                }
            }
        }
    }

    public void cont() {
        synchronized (timerThread) {
            synchronized (this) {
                if (this.stopped) {
                    this.sleepUntil = Math.max(this.sleepUntil + 1, System.currentTimeMillis() + this.remainingTime);
                    Timer2.enqueue(this);
                    this.stopped = false;
                }
            }
        }
    }

    public void reset() {
        synchronized (timerThread) {
            synchronized (this) {
                setRemainingTime(this.interval);
            }
        }
    }

    public synchronized long getStopTime() {
        return this.sleepUntil;
    }

    public synchronized long getInterval() {
        return this.interval;
    }

    public synchronized void setInterval(long interval) {
        this.interval = interval;
    }

    public synchronized long getRemainingTime() {
        return this.remainingTime;
    }

    public void setRemainingTime(long time) {
        synchronized (timerThread) {
            synchronized (this) {
                if (this.stopped) {
                    this.remainingTime = time;
                } else {
                    stop();
                    this.remainingTime = time;
                    cont();
                }
            }
        }
    }

    public synchronized void setRegular(boolean regular) {
        this.regular = regular;
    }

    protected Thread getTimerThread() {
        return Timer2.timerThread;
    }
}
