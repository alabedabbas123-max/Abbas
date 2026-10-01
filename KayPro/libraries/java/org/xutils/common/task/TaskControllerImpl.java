package org.xutils.common.task;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import org.xutils.x;
import org.xutils.common.Callback;
import org.xutils.common.TaskController;
import org.xutils.common.util.LogUtil;

public final class TaskControllerImpl implements TaskController {
    private static volatile TaskController instance;

    private TaskControllerImpl() {
    }

    public static void registerInstance() {
        if (instance == null) {
            synchronized (TaskController.class) {
                if (instance == null) {
                    instance = new TaskControllerImpl();
                }
            }
        }
        ClassX.Ext.setTaskController(instance);
    }

    @Override
    public <T> AbsTask<T> start(AbsTask<T> absTask) {
        TaskProxy taskProxy;
        if (absTask instanceof TaskProxy) {
            taskProxy = (TaskProxy) absTask;
        } else {
            taskProxy = new TaskProxy(absTask);
        }
        try {
            taskProxy.doBackground();
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
        }
        return taskProxy;
    }

    @Override
    public <T> T startSync(AbsTask<T> absTask) throws Throwable {
        T tDoBackground = null;
        try {
            try {
                try {
                    absTask.onWaiting();
                    absTask.onStarted();
                    tDoBackground = absTask.doBackground();
                    absTask.onSuccess(tDoBackground);
                    absTask.onFinished();
                } catch (Throwable th) {
                    absTask.onError(th, false);
                    throw th;
                }
            } catch (Callback.CancelledException e) {
                absTask.onCancelled(e);
                absTask.onFinished();
            }
            return tDoBackground;
        } catch (Throwable th2) {
            absTask.onFinished();
            throw th2;
        }
    }

    @Override
    public <T extends AbsTask<?>> Callback.Cancelable startTasks(final Callback.GroupCallback<T> groupCallback, final T... tArr) {
        if (tArr == null) {
            throw new IllegalArgumentException("task must not be null");
        }
        final Runnable runnable = new Runnable() {
            private final AtomicInteger count = new AtomicInteger(0);
            private final int total;

            {
                this.total = tArr.length;
            }

            @Override
            public void run() {
                if (this.count.incrementAndGet() == this.total && groupCallback != null) {
                    try {
                        groupCallback.onAllFinished();
                    } catch (Throwable th) {
                        try {
                            groupCallback.onError(null, th, true);
                        } catch (Throwable th2) {
                            LogUtil.m9046e(th2.getMessage(), th2);
                        }
                    }
                }
            }
        };
        for (final T t : tArr) {
            start(new TaskProxy(t) {
                @Override
                protected void onSuccess(Object obj) {
                    super.onSuccess(obj);
                    TaskControllerImpl.this.post(new Runnable() {
                        @Override
                        public void run() {
                            if (groupCallback != null) {
                                try {
                                    groupCallback.onSuccess(t);
                                } catch (Throwable th) {
                                    try {
                                        groupCallback.onError(t, th, true);
                                    } catch (Throwable th2) {
                                        LogUtil.m9046e(th2.getMessage(), th2);
                                    }
                                }
                            }
                        }
                    });
                }

                @Override
                protected void onCancelled(final Callback.CancelledException cancelledException) {
                    super.onCancelled(cancelledException);
                    TaskControllerImpl.this.post(new Runnable() {
                        @Override
                        public void run() {
                            if (groupCallback != null) {
                                try {
                                    groupCallback.onCancelled(t, cancelledException);
                                } catch (Throwable th) {
                                    try {
                                        groupCallback.onError(t, th, true);
                                    } catch (Throwable th2) {
                                        LogUtil.m9046e(th2.getMessage(), th2);
                                    }
                                }
                            }
                        }
                    });
                }

                @Override
                protected void onError(final Throwable th, final boolean z) {
                    super.onError(th, z);
                    TaskControllerImpl.this.post(new Runnable() {
                        @Override
                        public void run() {
                            if (groupCallback != null) {
                                try {
                                    groupCallback.onError(t, th, z);
                                } catch (Throwable th2) {
                                    LogUtil.m9046e(th2.getMessage(), th2);
                                }
                            }
                        }
                    });
                }

                @Override
                protected void onFinished() {
                    super.onFinished();
                    TaskControllerImpl.this.post(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                if (groupCallback != null) {
                                    groupCallback.onFinished(t);
                                }
                            } catch (Throwable th) {
                                groupCallback.onError(t, th, true);
                            } finally {
                                runnable.run();
                            }
                        }
                    });
                }
            });
        }
        return new Callback.Cancelable() {
            @Override
            public void cancel() {
                for (AbsTask absTask : tArr) {
                    absTask.cancel();
                }
            }

            @Override
            public boolean isCancelled() {
                boolean z = true;
                for (AbsTask absTask : tArr) {
                    if (!absTask.isCancelled()) {
                        z = false;
                    }
                }
                return z;
            }
        };
    }

    @Override
    public void autoPost(Runnable runnable) {
        if (runnable != null) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                TaskProxy.sHandler.post(runnable);
            }
        }
    }

    @Override
    public void post(Runnable runnable) {
        if (runnable != null) {
            TaskProxy.sHandler.post(runnable);
        }
    }

    @Override
    public void postDelayed(Runnable runnable, long j) {
        if (runnable != null) {
            TaskProxy.sHandler.postDelayed(runnable, j);
        }
    }

    @Override
    public void mo9039run(Runnable runnable) {
        if (!TaskProxy.sDefaultExecutor.isBusy()) {
            TaskProxy.sDefaultExecutor.execute(runnable);
        } else {
            new Thread(runnable).start();
        }
    }

    @Override
    public void removeCallbacks(Runnable runnable) {
        TaskProxy.sHandler.removeCallbacks(runnable);
    }
}
