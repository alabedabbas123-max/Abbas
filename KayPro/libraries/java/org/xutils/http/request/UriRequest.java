package org.xutils.http.request;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.xutils.x;
import org.xutils.common.util.LogUtil;
import org.xutils.http.ProgressHandler;
import org.xutils.http.RequestParams;
import org.xutils.http.loader.Loader;
import org.xutils.http.loader.LoaderFactory;
import org.xutils.http.app.RequestInterceptListener;
import org.xutils.http.app.ResponseParser;

public abstract class UriRequest implements Closeable {
    protected final Loader<?> loader;
    protected final RequestParams params;
    protected final String queryUrl;
    protected ProgressHandler progressHandler = null;
    protected ResponseParser responseParser = null;
    protected RequestInterceptListener requestInterceptListener = null;

    public abstract void clearCacheHeader();

    @Override
    public abstract void close() throws IOException;

    public abstract String getCacheKey();

    public abstract long getContentLength();

    public abstract String getETag();

    public abstract long getExpiration();

    public abstract long getHeaderFieldDate(String str, long j);

    public abstract InputStream getInputStream() throws IOException;

    public abstract long getLastModified();

    public abstract int getResponseCode() throws IOException;

    public abstract String getResponseHeader(String str);

    public abstract Map<String, List<String>> getResponseHeaders();

    public abstract String getResponseMessage() throws IOException;

    public abstract boolean isLoading();

    public abstract Object loadResultFromCache() throws Throwable;

    public abstract void sendRequest() throws Throwable;

    public UriRequest(RequestParams requestParams, Type type) throws Throwable {
        this.params = requestParams;
        this.queryUrl = buildQueryUrl(requestParams);
        this.loader = LoaderFactory.getLoader(type);
        this.loader.setParams(requestParams);
    }

    protected String buildQueryUrl(RequestParams requestParams) throws IOException {
        return requestParams.getUri();
    }

    public void setProgressHandler(ProgressHandler progressHandler) {
        this.progressHandler = progressHandler;
        this.loader.setProgressHandler(progressHandler);
    }

    public void setResponseParser(ResponseParser responseParser) {
        this.responseParser = responseParser;
    }

    public void setRequestInterceptListener(RequestInterceptListener requestInterceptListener) {
        this.requestInterceptListener = requestInterceptListener;
    }

    public RequestParams getParams() {
        return this.params;
    }

    public String getRequestUri() {
        return this.queryUrl;
    }

    public Object loadResult() throws Throwable {
        return this.loader.load(this);
    }

    public void save2Cache() {
        ClassX.task().mo9039run(new Runnable() {
            @Override
            public void run() {
                try {
                    UriRequest.this.loader.save2Cache(UriRequest.this);
                } catch (Throwable th) {
                    LogUtil.m9046e(th.getMessage(), th);
                }
            }
        });
    }

    public String toString() {
        return getRequestUri();
    }
}
