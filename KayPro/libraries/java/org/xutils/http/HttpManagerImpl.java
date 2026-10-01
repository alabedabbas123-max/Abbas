package org.xutils.http;

import java.lang.reflect.Type;
import org.xutils.x;
import org.xutils.HttpManager;
import org.xutils.common.Callback;

public final class HttpManagerImpl implements HttpManager {
    private static volatile HttpManagerImpl instance;
    private static final Object lock = new Object();

    private HttpManagerImpl() {
    }

    public static void registerInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new HttpManagerImpl();
                }
            }
        }
        ClassX.Ext.setHttpManager(instance);
    }

    @Override
    public <T> Callback.Cancelable mo9034get(RequestParams requestParams, Callback.CommonCallback<T> commonCallback) {
        return request(HttpMethod.GET, requestParams, commonCallback);
    }

    @Override
    public <T> Callback.Cancelable post(RequestParams requestParams, Callback.CommonCallback<T> commonCallback) {
        return request(HttpMethod.POST, requestParams, commonCallback);
    }

    @Override
    public <T> Callback.Cancelable request(HttpMethod httpMethod, RequestParams requestParams, Callback.CommonCallback<T> commonCallback) {
        requestParams.setMethod(httpMethod);
        Callback.Cancelable cancelable = null;
        if (commonCallback instanceof Callback.Cancelable) {
            cancelable = (Callback.Cancelable) commonCallback;
        }
        return ClassX.task().start(new HttpTask(requestParams, cancelable, commonCallback));
    }

    @Override
    public <T> T getSync(RequestParams requestParams, Class<T> cls) throws Throwable {
        return (T) requestSync(HttpMethod.GET, requestParams, cls);
    }

    @Override
    public <T> T postSync(RequestParams requestParams, Class<T> cls) throws Throwable {
        return (T) requestSync(HttpMethod.POST, requestParams, cls);
    }

    @Override
    public <T> T requestSync(HttpMethod httpMethod, RequestParams requestParams, Class<T> cls) throws Throwable {
        return (T) requestSync(httpMethod, requestParams, new DefaultSyncCallback(cls));
    }

    @Override
    public <T> T requestSync(HttpMethod httpMethod, RequestParams requestParams, Callback.TypedCallback<T> typedCallback) throws Throwable {
        requestParams.setMethod(httpMethod);
        return (T) ClassX.task().startSync(new HttpTask(requestParams, null, typedCallback));
    }

    private class DefaultSyncCallback<T> implements Callback.TypedCallback<T> {
        private final Class<T> resultType;

        public DefaultSyncCallback(Class<T> cls) {
            this.resultType = cls;
        }

        @Override
        public Type getLoadType() {
            return this.resultType;
        }

        @Override
        public void onSuccess(T t) {
        }

        @Override
        public void onError(Throwable th, boolean z) {
        }

        @Override
        public void onCancelled(Callback.CancelledException cancelledException) {
        }

        @Override
        public void onFinished() {
        }
    }
}
