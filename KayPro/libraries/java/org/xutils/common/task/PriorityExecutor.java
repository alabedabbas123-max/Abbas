package org.xutils.common.task;

import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class PriorityExecutor implements Executor {
    private static final int CORE_POOL_SIZE = 5;
    private static final int KEEP_ALIVE = 1;
    private static final int MAXIMUM_POOL_SIZE = 256;
    private final ThreadPoolExecutor mThreadPoolExecutor;
    private static final AtomicLong SEQ_SEED = new AtomicLong(0);
    private static final ThreadFactory sThreadFactory = new ThreadFactory() {
        private final AtomicInteger mCount = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "xTID#" + this.mCount.getAndIncrement());
        }
    };
    private static final Comparator<Runnable> FIFO_CMP = new Comparator<Runnable>() {
        @Override
        public int compare(Runnable runnable, Runnable runnable2) {
            if (!(runnable instanceof PriorityRunnable) || !(runnable2 instanceof PriorityRunnable)) {
                return 0;
            }
            PriorityRunnable priorityRunnable = (PriorityRunnable) runnable;
            PriorityRunnable priorityRunnable2 = (PriorityRunnable) runnable2;
            int iOrdinal = priorityRunnable.priority.ordinal() - priorityRunnable2.priority.ordinal();
            return iOrdinal == 0 ? (int) (priorityRunnable.f6723SEQ - priorityRunnable2.f6723SEQ) : iOrdinal;
        }
    };
    private static final Comparator<Runnable> FILO_CMP = new Comparator<Runnable>() {
        @Override
        public int compare(Runnable runnable, Runnable runnable2) {
            if (!(runnable instanceof PriorityRunnable) || !(runnable2 instanceof PriorityRunnable)) {
                return 0;
            }
            PriorityRunnable priorityRunnable = (PriorityRunnable) runnable;
            PriorityRunnable priorityRunnable2 = (PriorityRunnable) runnable2;
            int iOrdinal = priorityRunnable.priority.ordinal() - priorityRunnable2.priority.ordinal();
            return iOrdinal == 0 ? (int) (priorityRunnable2.f6723SEQ - priorityRunnable.f6723SEQ) : iOrdinal;
        }
    };

    public PriorityExecutor(boolean z) {
        this(5, z);
    }

    public PriorityExecutor(int i, boolean z) {
        this.mThreadPoolExecutor = new ThreadPoolExecutor(i, 256, 1L, TimeUnit.SECONDS, new PriorityBlockingQueue(256, z ? FIFO_CMP : FILO_CMP), sThreadFactory);
    }

    public int getPoolSize() {
        return this.mThreadPoolExecutor.getCorePoolSize();
    }

    public void setPoolSize(int i) {
        if (i > 0) {
            this.mThreadPoolExecutor.setCorePoolSize(i);
        }
    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return this.mThreadPoolExecutor;
    }

    public boolean isBusy() {
        return this.mThreadPoolExecutor.getActiveCount() >= this.mThreadPoolExecutor.getCorePoolSize();
    }

    @Override
    public void execute(Runnable runnable) {
        if (runnable instanceof PriorityRunnable) {
            ((PriorityRunnable) runnable).f6723SEQ = SEQ_SEED.getAndIncrement();
        }
        this.mThreadPoolExecutor.execute(runnable);
    }
}
