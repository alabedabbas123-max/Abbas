package sun.misc;

class Timer2 extends Thread {
    public static boolean debug = false;
    static boolean notified = false;
    static Timer timerQueue = null;
    static Timer2 timerThread;

    protected Timer2() {
        super("TimerThread");
        timerThread = this;
        start();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007e */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void run() {
        while (true) {
            if (timerQueue == null) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            } else {
                notified = false;
                long delay = timerQueue.sleepUntil - System.currentTimeMillis();
                if (delay > 0) {
                    try {
                        wait(delay);
                    } catch (InterruptedException e2) {
                    }
                }
                if (!notified) {
                    Timer timer = timerQueue;
                    timerQueue = timerQueue.next;
                    Timer3 thr = Timer3.call(timer, timer.sleepUntil);
                    if (debug) {
                        long delta = System.currentTimeMillis() - timer.sleepUntil;
                        System.out.println("tick(" + thr.getName() + "," + timer.interval + "," + delta + ")");
                        if (delta > 250) {
                            System.out.println("*** BIG DELAY ***");
                        }
                    }
                }
            }
        }
    }

    protected static void enqueue(Timer timer) {
        Timer prev;
        Timer cur = timerQueue;
        if (cur == null || timer.sleepUntil <= cur.sleepUntil) {
            timer.next = timerQueue;
            timerQueue = timer;
            notified = true;
            timerThread.notify();
        } else {
            do {
                prev = cur;
                cur = cur.next;
                if (cur == null) {
                    break;
                }
            } while (timer.sleepUntil > cur.sleepUntil);
            timer.next = cur;
            prev.next = timer;
        }
        if (debug) {
            long now = System.currentTimeMillis();
            System.out.print(Thread.currentThread().getName() + ": enqueue " + timer.interval + ": ");
            for (Timer cur2 = timerQueue; cur2 != null; cur2 = cur2.next) {
                long delta = cur2.sleepUntil - now;
                System.out.print(cur2.interval + "(" + delta + ") ");
            }
            System.out.println();
        }
    }

    protected static boolean dequeue(Timer timer) {
        Timer prev = null;
        Timer cur = timerQueue;
        while (cur != null && cur != timer) {
            prev = cur;
            cur = cur.next;
        }
        if (cur == null) {
            if (debug) {
                System.out.println(Thread.currentThread().getName() + ": dequeue " + timer.interval + ": no-op");
                return false;
            }
            return false;
        }
        if (prev == null) {
            timerQueue = timer.next;
            notified = true;
            timerThread.notify();
        } else {
            prev.next = timer.next;
        }
        timer.next = null;
        if (debug) {
            long now = System.currentTimeMillis();
            System.out.print(Thread.currentThread().getName() + ": dequeue " + timer.interval + ": ");
            for (Timer cur2 = timerQueue; cur2 != null; cur2 = cur2.next) {
                long delta = cur2.sleepUntil - now;
                System.out.print(cur2.interval + "(" + delta + ") ");
            }
            System.out.println();
        }
        return true;
    }

    protected static void requeue(Timer timer) {
        if (!timer.stopped) {
            long now = System.currentTimeMillis();
            if (timer.regular) {
                timer.sleepUntil += timer.interval;
            } else {
                timer.sleepUntil = timer.interval + now;
            }
            enqueue(timer);
            return;
        }
        if (debug) {
            System.out.println(Thread.currentThread().getName() + ": requeue " + timer.interval + ": no-op");
        }
    }
}
