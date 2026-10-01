package sun.misc;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.SortedSet;
import java.util.TreeSet;

public class GC {
    private static final long NO_TARGET = Long.MAX_VALUE;
    private static long latencyTarget = NO_TARGET;
    private static Thread daemon = null;
    private static Object lock = new LatencyLock();

    public static native long maxObjectInspectionAge();

    private GC() {
    }

    private static class LatencyLock {
        private LatencyLock() {
        }
    }

    private static class Daemon extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (GC.lock) {
                    long l = GC.latencyTarget;
                    if (l == GC.NO_TARGET) {
                        Thread unused = GC.daemon = null;
                        return;
                    }
                    long d = GC.maxObjectInspectionAge();
                    if (d >= l) {
                        System.gc();
                        d = 0;
                    }
                    try {
                        GC.lock.wait(l - d);
                    } catch (InterruptedException e) {
                    }
                    throw th;
                }
            }
        }

        private Daemon(ThreadGroup tg) {
            super(tg, "GC Daemon");
        }

        public static void create() {
            PrivilegedAction pa = new PrivilegedAction() {
                @Override
                public Object run() {
                    ThreadGroup tg = Thread.currentThread().getThreadGroup();
                    ThreadGroup tgn = tg;
                    while (tgn != null) {
                        tg = tgn;
                        tgn = tg.getParent();
                    }
                    Daemon d = new Daemon(tg);
                    d.setDaemon(true);
                    d.setPriority(2);
                    d.start();
                    Thread unused = GC.daemon = d;
                    return null;
                }
            };
            AccessController.doPrivileged(pa);
        }
    }

    public static void setLatencyTarget(long ms) {
        latencyTarget = ms;
        if (daemon == null) {
            Daemon.create();
        } else {
            lock.notify();
        }
    }

    public static class LatencyRequest implements Comparable {
        private static long counter = 0;
        private static SortedSet requests = null;

        private long f593id;
        private long latency;

        private static void adjustLatencyIfNeeded() {
            SortedSet sortedSet = requests;
            if (sortedSet == null || sortedSet.isEmpty()) {
                if (GC.latencyTarget != GC.NO_TARGET) {
                    GC.setLatencyTarget(GC.NO_TARGET);
                }
            } else {
                LatencyRequest r = (LatencyRequest) requests.first();
                if (r.latency != GC.latencyTarget) {
                    GC.setLatencyTarget(r.latency);
                }
            }
        }

        private LatencyRequest(long ms) {
            if (ms <= 0) {
                throw new IllegalArgumentException("Non-positive latency: " + ms);
            }
            this.latency = ms;
            synchronized (GC.lock) {
                long j = counter + 1;
                counter = j;
                this.f593id = j;
                if (requests == null) {
                    requests = new TreeSet();
                }
                requests.add(this);
                adjustLatencyIfNeeded();
            }
        }

        public void cancel() {
            synchronized (GC.lock) {
                if (this.latency == GC.NO_TARGET) {
                    throw new IllegalStateException("Request already cancelled");
                }
                if (!requests.remove(this)) {
                    throw new InternalError("Latency request " + this + " not found");
                }
                if (requests.isEmpty()) {
                    requests = null;
                }
                this.latency = GC.NO_TARGET;
                adjustLatencyIfNeeded();
            }
        }

        @Override
        public int compareTo(Object o) {
            LatencyRequest r = (LatencyRequest) o;
            long d = this.latency - r.latency;
            if (d == 0) {
                d = this.f593id - r.f593id;
            }
            if (d < 0) {
                return -1;
            }
            return d > 0 ? 1 : 0;
        }

        public String toString() {
            return LatencyRequest.class.getName() + "[" + this.latency + "," + this.f593id + "]";
        }
    }

    public static LatencyRequest requestLatency(long latency) {
        return new LatencyRequest(latency);
    }

    public static long currentLatencyTarget() {
        long t = latencyTarget;
        if (t == NO_TARGET) {
            return 0L;
        }
        return t;
    }
}
