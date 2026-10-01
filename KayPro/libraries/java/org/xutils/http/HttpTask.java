package org.xutils.http;

import android.text.TextUtils;
import com.almlkaide.kaypro.android.dx.io.Opcodes;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.xutils.x;
import org.xutils.common.Callback;
import org.xutils.common.task.AbsTask;
import org.xutils.common.task.Priority;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.common.util.ParameterizedTypeUtil;
import org.xutils.http.app.HttpRetryHandler;
import org.xutils.http.app.RedirectHandler;
import org.xutils.http.app.RequestInterceptListener;
import org.xutils.http.app.RequestTracker;
import org.xutils.http.request.UriRequest;
import org.xutils.http.request.UriRequestFactory;
import org.xutils.ex.HttpException;
import org.xutils.ex.HttpRedirectException;

public class HttpTask<ResultType> extends AbsTask<ResultType> implements ProgressHandler {
    static final boolean $assertionsDisabled;
    private static final PriorityExecutor CACHE_EXECUTOR;
    private static final HashMap<String, WeakReference<HttpTask<?>>> DOWNLOAD_TASK;
    private static final int FLAG_CACHE = 2;
    private static final int FLAG_PROGRESS = 3;
    private static final int FLAG_REQUEST_CREATED = 1;
    private static final PriorityExecutor HTTP_EXECUTOR;
    private static final AtomicInteger sCurrFileLoadCount;
    private Callback.CacheCallback<ResultType> cacheCallback;
    private final Object cacheLock;
    private final Callback.CommonCallback<ResultType> callback;
    private final Executor executor;
    private volatile boolean hasException;
    private long lastUpdateTime;
    private Type loadType;
    private long loadingUpdateMaxTimeSpan;
    private RequestParams params;
    private Callback.PrepareCallback prepareCallback;
    private Callback.ProgressCallback progressCallback;
    private Object rawResult;
    private UriRequest request;
    private RequestInterceptListener requestInterceptListener;
    private RequestTracker tracker;
    private volatile Boolean trustCache;

    static {
        $assertionsDisabled = !HttpTask.class.desiredAssertionStatus();
        sCurrFileLoadCount = new AtomicInteger(0);
        DOWNLOAD_TASK = new HashMap<>(1);
        HTTP_EXECUTOR = new PriorityExecutor(5, true);
        CACHE_EXECUTOR = new PriorityExecutor(5, true);
    }

    public HttpTask(RequestParams requestParams, Callback.Cancelable cancelable, Callback.CommonCallback<ResultType> commonCallback) {
        RequestTracker defaultTracker;
        super(cancelable);
        this.hasException = false;
        this.rawResult = null;
        this.trustCache = null;
        this.cacheLock = new Object();
        this.loadingUpdateMaxTimeSpan = 300L;
        if (!$assertionsDisabled && requestParams == null) {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && commonCallback == null) {
            throw new AssertionError();
        }
        this.params = requestParams;
        this.callback = commonCallback;
        if (commonCallback instanceof Callback.CacheCallback) {
            this.cacheCallback = (Callback.CacheCallback) commonCallback;
        }
        if (commonCallback instanceof Callback.PrepareCallback) {
            this.prepareCallback = (Callback.PrepareCallback) commonCallback;
        }
        if (commonCallback instanceof Callback.ProgressCallback) {
            this.progressCallback = (Callback.ProgressCallback) commonCallback;
        }
        if (commonCallback instanceof RequestInterceptListener) {
            this.requestInterceptListener = (RequestInterceptListener) commonCallback;
        }
        RequestTracker requestTracker = requestParams.getRequestTracker();
        if (requestTracker != null) {
            defaultTracker = requestTracker;
        } else if (commonCallback instanceof RequestTracker) {
            defaultTracker = (RequestTracker) commonCallback;
        } else {
            defaultTracker = UriRequestFactory.getDefaultTracker();
        }
        if (defaultTracker != null) {
            this.tracker = new RequestTrackerWrapper(defaultTracker);
        }
        if (requestParams.getExecutor() != null) {
            this.executor = requestParams.getExecutor();
        } else if (this.cacheCallback != null) {
            this.executor = CACHE_EXECUTOR;
        } else {
            this.executor = HTTP_EXECUTOR;
        }
    }

    private void resolveLoadType() {
        Class<?> cls = this.callback.getClass();
        if (this.callback instanceof Callback.TypedCallback) {
            this.loadType = ((Callback.TypedCallback) this.callback).getLoadType();
        } else if (this.callback instanceof Callback.PrepareCallback) {
            this.loadType = ParameterizedTypeUtil.getParameterizedType(cls, Callback.PrepareCallback.class, 0);
        } else {
            this.loadType = ParameterizedTypeUtil.getParameterizedType(cls, Callback.CommonCallback.class, 0);
        }
    }

    public UriRequest createNewRequest() throws Throwable {
        this.params.init();
        UriRequest uriRequest = UriRequestFactory.getUriRequest(this.params, this.loadType);
        uriRequest.setProgressHandler(this);
        this.loadingUpdateMaxTimeSpan = this.params.getLoadingUpdateMaxTimeSpan();
        update(1, uriRequest);
        return uriRequest;
    }

    private void checkDownloadTask() {
        if (File.class == this.loadType) {
            synchronized (DOWNLOAD_TASK) {
                String saveFilePath = this.params.getSaveFilePath();
                if (!TextUtils.isEmpty(saveFilePath)) {
                    WeakReference<HttpTask<?>> weakReference = DOWNLOAD_TASK.get(saveFilePath);
                    if (weakReference != null) {
                        HttpTask<?> httpTask = weakReference.get();
                        if (httpTask != null) {
                            httpTask.cancel();
                            httpTask.closeRequestSync();
                        }
                        DOWNLOAD_TASK.remove(saveFilePath);
                    }
                    DOWNLOAD_TASK.put(saveFilePath, new WeakReference<>(this));
                }
                if (DOWNLOAD_TASK.size() > 10) {
                    Iterator<Map.Entry<String, WeakReference<HttpTask<?>>>> it = DOWNLOAD_TASK.entrySet().iterator();
                    while (it.hasNext()) {
                        WeakReference<HttpTask<?>> value = it.next().getValue();
                        if (value == null || value.get() == null) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    @Override
    protected ResultType doBackground() throws Throwable {
        Object objPrepare;
        if (isCancelled()) {
            throw new Callback.CancelledException("cancelled before request");
        }
        resolveLoadType();
        this.request = createNewRequest();
        checkDownloadTask();
        HttpRetryHandler httpRetryHandler = this.params.getHttpRetryHandler();
        HttpRetryHandler httpRetryHandler2 = httpRetryHandler == null ? new HttpRetryHandler() : httpRetryHandler;
        httpRetryHandler2.setMaxRetryCount(this.params.getMaxRetryCount());
        if (isCancelled()) {
            throw new Callback.CancelledException("cancelled before request");
        }
        if (this.cacheCallback == null || !HttpMethod.permitsCache(this.params.getMethod())) {
            objPrepare = null;
        } else {
            try {
                clearRawResult();
                LogUtil.m9043d("load cache: " + this.request.getRequestUri());
                this.rawResult = this.request.loadResultFromCache();
            } catch (Throwable th) {
                LogUtil.m9052w("load disk cache error", th);
            }
            if (isCancelled()) {
                clearRawResult();
                throw new Callback.CancelledException("cancelled before request");
            }
            if (this.rawResult != null) {
                if (this.prepareCallback != null) {
                    try {
                        try {
                            objPrepare = this.prepareCallback.prepare(this.rawResult);
                            clearRawResult();
                        } catch (Throwable th2) {
                            LogUtil.m9052w("prepare disk cache error", th2);
                            clearRawResult();
                            objPrepare = null;
                        }
                    } catch (Throwable th3) {
                        clearRawResult();
                        throw th3;
                    }
                } else {
                    objPrepare = this.rawResult;
                }
                if (isCancelled()) {
                    throw new Callback.CancelledException("cancelled before request");
                }
                if (objPrepare != null) {
                    update(2, objPrepare);
                    synchronized (this.cacheLock) {
                        while (this.trustCache == null) {
                            try {
                                try {
                                    this.cacheLock.wait();
                                } catch (InterruptedException e) {
                                    throw new Callback.CancelledException("cancelled before request");
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                    if (this.trustCache.booleanValue()) {
                        return null;
                    }
                }
            } else {
                objPrepare = null;
            }
        }
        if (this.trustCache == null) {
            this.trustCache = false;
        }
        if (objPrepare == null) {
            this.request.clearCacheHeader();
        }
        if ((this.callback instanceof Callback.ProxyCacheCallback) && ((Callback.ProxyCacheCallback) this.callback).onlyCache()) {
            return null;
        }
        Throwable th5 = null;
        int i = 0;
        boolean zCanRetry = true;
        Object objPrepare2 = null;
        while (zCanRetry) {
            try {
                try {
                    if (isCancelled()) {
                        throw new Callback.CancelledException("cancelled before request");
                    }
                    this.request.close();
                    try {
                        clearRawResult();
                        LogUtil.m9043d("load: " + this.request.getRequestUri());
                        RequestWorker requestWorker = new RequestWorker();
                        requestWorker.request();
                        if (requestWorker.f6730ex != null) {
                            throw requestWorker.f6730ex;
                        }
                        this.rawResult = requestWorker.result;
                        if (this.prepareCallback != null) {
                            if (isCancelled()) {
                                throw new Callback.CancelledException("cancelled before request");
                            }
                            try {
                                objPrepare2 = this.prepareCallback.prepare(this.rawResult);
                                clearRawResult();
                            } catch (Throwable th6) {
                                clearRawResult();
                                throw th6;
                            }
                        } else {
                            objPrepare2 = this.rawResult;
                        }
                        if (this.cacheCallback != null && HttpMethod.permitsCache(this.params.getMethod())) {
                            try {
                                this.request.save2Cache();
                            } catch (Throwable th7) {
                                LogUtil.m9046e("Error while storing the http cache.", th7);
                            }
                        }
                        if (isCancelled()) {
                            throw new Callback.CancelledException("cancelled after request");
                        }
                        zCanRetry = false;
                    } catch (Throwable th8) {
                        clearRawResult();
                        if (isCancelled()) {
                            throw new Callback.CancelledException("cancelled during request");
                        }
                        throw th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    switch (this.request.getResponseCode()) {
                        case Opcodes.SUB_DOUBLE_2ADDR:
                        case Opcodes.MUL_DOUBLE_2ADDR:
                        case 304:
                            return null;
                        default:
                            if (isCancelled() && !(th instanceof Callback.CancelledException)) {
                                th = new Callback.CancelledException("canceled by user");
                            }
                            i++;
                            zCanRetry = httpRetryHandler2.canRetry(this.request, th, i);
                            th5 = th;
                            break;
                    }
                }
            } catch (HttpRedirectException e2) {
                LogUtil.m9051w("Http Redirect:" + this.params.getUri());
                zCanRetry = true;
            }
        }
        if (th5 == null || objPrepare2 != null || this.trustCache.booleanValue()) {
            return (ResultType) objPrepare2;
        }
        this.hasException = true;
        throw th5;
    }

    @Override
    protected void onUpdate(int i, Object... objArr) {
        switch (i) {
            case 1:
                if (this.tracker != null) {
                    this.tracker.onRequestCreated((UriRequest) objArr[0]);
                    return;
                }
                return;
            case 2:
                synchronized (this.cacheLock) {
                    try {
                        try {
                            Object obj = objArr[0];
                            if (this.tracker != null) {
                                this.tracker.onCache(this.request, obj);
                            }
                            this.trustCache = Boolean.valueOf(this.cacheCallback.onCache((ResultType) obj));
                            this.cacheLock.notifyAll();
                        } catch (Throwable th) {
                            this.trustCache = false;
                            this.callback.onError(th, true);
                            this.cacheLock.notifyAll();
                        }
                    } catch (Throwable th2) {
                        this.cacheLock.notifyAll();
                        throw th2;
                    }
                }
                return;
            case 3:
                if (this.progressCallback != null && objArr.length == 3) {
                    try {
                        this.progressCallback.onLoading(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue(), ((Boolean) objArr[2]).booleanValue());
                        return;
                    } catch (Throwable th3) {
                        this.callback.onError(th3, true);
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override
    protected void onWaiting() {
        if (this.tracker != null) {
            this.tracker.onWaiting(this.params);
        }
        if (this.progressCallback != null) {
            this.progressCallback.onWaiting();
        }
    }

    @Override
    protected void onStarted() {
        if (this.tracker != null) {
            this.tracker.onStart(this.params);
        }
        if (this.progressCallback != null) {
            this.progressCallback.onStarted();
        }
    }

    @Override
    protected void onSuccess(ResultType resulttype) {
        if (!this.hasException) {
            if (this.tracker != null) {
                this.tracker.onSuccess(this.request, resulttype);
            }
            this.callback.onSuccess(resulttype);
        }
    }

    @Override
    protected void onError(Throwable th, boolean z) {
        if (this.tracker != null) {
            this.tracker.onError(this.request, th, z);
        }
        this.callback.onError(th, z);
    }

    @Override
    protected void onCancelled(Callback.CancelledException cancelledException) {
        if (this.tracker != null) {
            this.tracker.onCancelled(this.request);
        }
        this.callback.onCancelled(cancelledException);
    }

    @Override
    protected void onFinished() {
        if (this.tracker != null) {
            this.tracker.onFinished(this.request);
        }
        ClassX.task().mo9039run(new Runnable() {
            @Override
            public void run() {
                HttpTask.this.closeRequestSync();
            }
        });
        this.callback.onFinished();
    }

    private void clearRawResult() {
        if (this.rawResult instanceof Closeable) {
            IOUtil.closeQuietly((Closeable) this.rawResult);
        }
        this.rawResult = null;
    }

    @Override
    protected void cancelWorks() {
        ClassX.task().mo9039run(new Runnable() {
            @Override
            public void run() {
                HttpTask.this.closeRequestSync();
            }
        });
    }

    @Override
    protected boolean isCancelFast() {
        return this.params.isCancelFast();
    }

    public void closeRequestSync() {
        if (File.class == this.loadType) {
            synchronized (sCurrFileLoadCount) {
                sCurrFileLoadCount.notifyAll();
            }
        }
        clearRawResult();
        IOUtil.closeQuietly(this.request);
    }

    @Override
    public Executor getExecutor() {
        return this.executor;
    }

    @Override
    public Priority getPriority() {
        return this.params.getPriority();
    }

    @Override
    public boolean updateProgress(long j, long j2, boolean z) {
        if (isCancelled() || isFinished()) {
            return false;
        }
        if (this.progressCallback != null && this.request != null && j2 > 0) {
            if (j < 0) {
                j = -1;
            } else if (j < j2) {
                j = j2;
            }
            if (z) {
                this.lastUpdateTime = System.currentTimeMillis();
                update(3, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(this.request.isLoading()));
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.lastUpdateTime >= this.loadingUpdateMaxTimeSpan) {
                    this.lastUpdateTime = jCurrentTimeMillis;
                    update(3, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(this.request.isLoading()));
                }
            }
        }
        return (isCancelled() || isFinished()) ? false : true;
    }

    public String toString() {
        return this.params.toString();
    }

    private final class RequestWorker {

        Throwable f6730ex;
        Object result;

        private RequestWorker() {
        }

        public void request() {
            HttpException httpException;
            int code;
            RedirectHandler redirectHandler;
            boolean z = false;
            try {
                try {
                    if (File.class == HttpTask.this.loadType) {
                        synchronized (HttpTask.sCurrFileLoadCount) {
                            while (HttpTask.sCurrFileLoadCount.get() >= 10 && !HttpTask.this.isCancelled()) {
                                try {
                                    HttpTask.sCurrFileLoadCount.wait(10L);
                                } catch (InterruptedException e) {
                                    z = true;
                                }
                            }
                        }
                        HttpTask.sCurrFileLoadCount.incrementAndGet();
                    }
                    if (z || HttpTask.this.isCancelled()) {
                        throw new Callback.CancelledException("cancelled before request" + (z ? "(interrupted)" : ""));
                    }
                    try {
                        HttpTask.this.request.setRequestInterceptListener(HttpTask.this.requestInterceptListener);
                        this.result = HttpTask.this.request.loadResult();
                    } catch (Throwable th) {
                        this.f6730ex = th;
                    }
                    if (this.f6730ex != null) {
                        throw this.f6730ex;
                    }
                    if (File.class == HttpTask.this.loadType) {
                        synchronized (HttpTask.sCurrFileLoadCount) {
                            HttpTask.sCurrFileLoadCount.decrementAndGet();
                            HttpTask.sCurrFileLoadCount.notifyAll();
                        }
                    }
                } catch (Throwable th2) {
                    this.f6730ex = th2;
                    if ((th2 instanceof HttpException) && (((code = (httpException = (HttpException) th2).getCode()) == 301 || code == 302) && (redirectHandler = HttpTask.this.params.getRedirectHandler()) != null)) {
                        try {
                            RequestParams redirectParams = redirectHandler.getRedirectParams(HttpTask.this.request);
                            if (redirectParams != null) {
                                if (redirectParams.getMethod() == null) {
                                    redirectParams.setMethod(HttpTask.this.params.getMethod());
                                }
                                HttpTask.this.params = redirectParams;
                                HttpTask.this.request = HttpTask.this.createNewRequest();
                                this.f6730ex = new HttpRedirectException(code, httpException.getMessage(), httpException.getResult());
                            }
                        } catch (Throwable th3) {
                            this.f6730ex = th2;
                        }
                    }
                    if (File.class == HttpTask.this.loadType) {
                        synchronized (HttpTask.sCurrFileLoadCount) {
                            HttpTask.sCurrFileLoadCount.decrementAndGet();
                            HttpTask.sCurrFileLoadCount.notifyAll();
                        }
                    }
                }
            } catch (Throwable th4) {
                if (File.class == HttpTask.this.loadType) {
                    synchronized (HttpTask.sCurrFileLoadCount) {
                        HttpTask.sCurrFileLoadCount.decrementAndGet();
                        HttpTask.sCurrFileLoadCount.notifyAll();
                    }
                }
                throw th4;
            }
        }
    }
}
