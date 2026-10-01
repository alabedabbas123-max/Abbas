package org.xutils.common.task;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Executor;
import org.xutils.x;
import org.xutils.common.Callback;
import org.xutils.common.util.LogUtil;

class TaskProxy<ResultType> extends AbsTask<ResultType> {
    private static final int MSG_WHAT_BASE = 1000000000;
    private static final int MSG_WHAT_ON_CANCEL = 1000000006;
    private static final int MSG_WHAT_ON_ERROR = 1000000004;
    private static final int MSG_WHAT_ON_FINISHED = 1000000007;
    private static final int MSG_WHAT_ON_START = 1000000002;
    private static final int MSG_WHAT_ON_SUCCESS = 1000000003;
    private static final int MSG_WHAT_ON_UPDATE = 1000000005;
    private static final int MSG_WHAT_ON_WAITING = 1000000001;
    private volatile boolean callOnCanceled;
    private volatile boolean callOnFinished;
    private final Executor executor;
    private final Handler handler;
    private final AbsTask<ResultType> task;
    static final InternalHandler sHandler = new InternalHandler();
    static final PriorityExecutor sDefaultExecutor = new PriorityExecutor(true);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaskProxy(AbsTask<ResultType> absTask) {
        super(absTask);
        this.callOnCanceled = false;
        this.callOnFinished = false;
        this.task = absTask;
        this.task.setTaskProxy(this);
        setTaskProxy(null);
        Looper looperCustomLooper = absTask.customLooper();
        if (looperCustomLooper != null) {
            this.handler = new InternalHandler(looperCustomLooper);
        } else {
            this.handler = sHandler;
        }
        Executor executor = absTask.getExecutor();
        this.executor = executor == null ? sDefaultExecutor : executor;
    }

    @Override
    protected final ResultType doBackground() throws Throwable {
        onWaiting();
        this.executor.execute(new PriorityRunnable(this.task.getPriority(), new Runnable() {
            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public void run() {
                try {
                    try {
                        try {
                            if (TaskProxy.this.callOnCanceled || TaskProxy.this.isCancelled()) {
                                throw new Callback.CancelledException("");
                            }
                            TaskProxy.this.onStarted();
                            if (TaskProxy.this.isCancelled()) {
                                throw new Callback.CancelledException("");
                            }
                            TaskProxy.this.task.setResult(TaskProxy.this.task.doBackground());
                            TaskProxy.this.setResult(TaskProxy.this.task.getResult());
                            if (TaskProxy.this.isCancelled()) {
                                throw new Callback.CancelledException("");
                            }
                            TaskProxy.this.onSuccess(TaskProxy.this.task.getResult());
                            TaskProxy.this.onFinished();
                        } catch (Callback.CancelledException e) {
                            TaskProxy.this.onCancelled(e);
                            TaskProxy.this.onFinished();
                        }
                    } catch (Throwable th) {
                        TaskProxy.this.onError(th, false);
                        TaskProxy.this.onFinished();
                    }
                } catch (Throwable th2) {
                    TaskProxy.this.onFinished();
                    throw th2;
                }
            }
        }));
        return null;
    }

    @Override
    protected void onWaiting() {
        setState(AbsTask.State.WAITING);
        this.handler.obtainMessage(MSG_WHAT_ON_WAITING, this).sendToTarget();
    }

    @Override
    protected void onStarted() {
        setState(AbsTask.State.STARTED);
        this.handler.obtainMessage(MSG_WHAT_ON_START, this).sendToTarget();
    }

    @Override
    protected void onSuccess(ResultType resulttype) {
        setState(AbsTask.State.SUCCESS);
        this.handler.obtainMessage(MSG_WHAT_ON_SUCCESS, this).sendToTarget();
    }

    @Override
    protected void onError(Throwable th, boolean z) {
        setState(AbsTask.State.ERROR);
        this.handler.obtainMessage(MSG_WHAT_ON_ERROR, new ArgsObj(this, th)).sendToTarget();
    }

    @Override
    protected void onUpdate(int i, Object... objArr) {
        this.handler.obtainMessage(MSG_WHAT_ON_UPDATE, i, i, new ArgsObj(this, objArr)).sendToTarget();
    }

    @Override
    protected void onCancelled(Callback.CancelledException cancelledException) {
        setState(AbsTask.State.CANCELLED);
        this.handler.obtainMessage(MSG_WHAT_ON_CANCEL, new ArgsObj(this, cancelledException)).sendToTarget();
    }

    @Override
    protected void onFinished() {
        this.handler.obtainMessage(MSG_WHAT_ON_FINISHED, this).sendToTarget();
    }

    @Override
    final void setState(AbsTask.State state) {
        super.setState(state);
        this.task.setState(state);
    }

    @Override
    public final Priority getPriority() {
        return this.task.getPriority();
    }

    @Override
    public final Executor getExecutor() {
        return this.executor;
    }

    private static class ArgsObj {
        final Object[] args;
        final TaskProxy taskProxy;

        public ArgsObj(TaskProxy taskProxy, Object... objArr) {
            this.taskProxy = taskProxy;
            this.args = objArr;
        }
    }

    static final class InternalHandler extends Handler {
        static final boolean $assertionsDisabled;

        static {
            $assertionsDisabled = !TaskProxy.class.desiredAssertionStatus();
        }

        private InternalHandler() {
            super(Looper.getMainLooper());
        }

        private InternalHandler(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            Object[] objArr;
            TaskProxy taskProxy;
            if (message.obj == null) {
                throw new IllegalArgumentException("msg must not be null");
            }
            if (message.obj instanceof TaskProxy) {
                objArr = null;
                taskProxy = (TaskProxy) message.obj;
            } else if (message.obj instanceof ArgsObj) {
                ArgsObj argsObj = (ArgsObj) message.obj;
                TaskProxy taskProxy2 = argsObj.taskProxy;
                objArr = argsObj.args;
                taskProxy = taskProxy2;
            } else {
                objArr = null;
                taskProxy = null;
            }
            if (taskProxy != null) {
                try {
                    switch (message.what) {
                        case TaskProxy.MSG_WHAT_ON_WAITING:
                            taskProxy.task.onWaiting();
                            return;
                        case TaskProxy.MSG_WHAT_ON_START:
                            taskProxy.task.onStarted();
                            return;
                        case TaskProxy.MSG_WHAT_ON_SUCCESS:
                            taskProxy.task.onSuccess(taskProxy.getResult());
                            return;
                        case TaskProxy.MSG_WHAT_ON_ERROR:
                            if (!$assertionsDisabled && objArr == null) {
                                throw new AssertionError();
                            }
                            Throwable th = (Throwable) objArr[0];
                            LogUtil.m9044d(th.getMessage(), th);
                            taskProxy.task.onError(th, false);
                            return;
                        case TaskProxy.MSG_WHAT_ON_UPDATE:
                            taskProxy.task.onUpdate(message.arg1, objArr);
                            return;
                        case TaskProxy.MSG_WHAT_ON_CANCEL:
                            if (!taskProxy.callOnCanceled) {
                                taskProxy.callOnCanceled = true;
                                if (!$assertionsDisabled && objArr == null) {
                                    throw new AssertionError();
                                }
                                taskProxy.task.onCancelled((Callback.CancelledException) objArr[0]);
                                return;
                            }
                            return;
                        case TaskProxy.MSG_WHAT_ON_FINISHED:
                            if (!taskProxy.callOnFinished) {
                                taskProxy.callOnFinished = true;
                                taskProxy.task.onFinished();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } catch (Throwable th2) {
                    taskProxy.setState(AbsTask.State.ERROR);
                    if (message.what != TaskProxy.MSG_WHAT_ON_ERROR) {
                        taskProxy.task.onError(th2, true);
                        return;
                    } else {
                        if (ClassX.isDebug()) {
                            throw new RuntimeException(th2);
                        }
                        return;
                    }
                }
            }
            throw new RuntimeException("msg.obj not instanceof TaskProxy");
        }
    }
}
