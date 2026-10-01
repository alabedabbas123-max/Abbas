package org.xutils.common.task;

import android.os.Looper;
import java.util.concurrent.Executor;
import org.xutils.common.Callback;

public abstract class AbsTask<ResultType> implements Callback.Cancelable {
    private final Callback.Cancelable cancelHandler;
    private volatile boolean isCancelled;
    private ResultType result;
    private volatile State state;
    private TaskProxy taskProxy;

    protected abstract ResultType doBackground() throws Throwable;

    protected abstract void onError(Throwable th, boolean z);

    protected abstract void onSuccess(ResultType resulttype);

    public AbsTask() {
        this(null);
    }

    public AbsTask(Callback.Cancelable cancelable) {
        this.taskProxy = null;
        this.isCancelled = false;
        this.state = State.IDLE;
        this.cancelHandler = cancelable;
    }

    protected void onWaiting() {
    }

    protected void onStarted() {
    }

    protected void onUpdate(int i, Object... objArr) {
    }

    protected void onCancelled(Callback.CancelledException cancelledException) {
    }

    protected void onFinished() {
    }

    public Priority getPriority() {
        return null;
    }

    public Executor getExecutor() {
        return null;
    }

    public Looper customLooper() {
        return null;
    }

    protected final void update(int i, Object... objArr) {
        if (this.taskProxy != null) {
            this.taskProxy.onUpdate(i, objArr);
        }
    }

    protected void cancelWorks() {
    }

    protected boolean isCancelFast() {
        return false;
    }

    @Override
    public final void cancel() {
        if (!this.isCancelled) {
            synchronized (this) {
                if (!this.isCancelled) {
                    this.isCancelled = true;
                    cancelWorks();
                    if (this.cancelHandler != null && !this.cancelHandler.isCancelled()) {
                        this.cancelHandler.cancel();
                    }
                    if (this.state == State.WAITING || (this.state == State.STARTED && isCancelFast())) {
                        if (this.taskProxy != null) {
                            this.taskProxy.onCancelled(new Callback.CancelledException("cancelled by user"));
                            this.taskProxy.onFinished();
                        } else if (this instanceof TaskProxy) {
                            onCancelled(new Callback.CancelledException("cancelled by user"));
                            onFinished();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.isCancelled || this.state == State.CANCELLED || (this.cancelHandler != null && this.cancelHandler.isCancelled());
    }

    public final boolean isFinished() {
        return this.state.value() > State.STARTED.value();
    }

    public final State getState() {
        return this.state;
    }

    public final ResultType getResult() {
        return this.result;
    }

    void setState(State state) {
        this.state = state;
    }

    final void setTaskProxy(TaskProxy taskProxy) {
        this.taskProxy = taskProxy;
    }

    final void setResult(ResultType resulttype) {
        this.result = resulttype;
    }

    public enum State {
        IDLE(0),
        WAITING(1),
        STARTED(2),
        SUCCESS(3),
        CANCELLED(4),
        ERROR(5);

        private final int value;

        State(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }
}
