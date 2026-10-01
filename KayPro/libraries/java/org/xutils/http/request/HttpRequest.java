package org.xutils.http.request;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.cache.LruDiskCache;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.KeyValue;
import org.xutils.common.util.LogUtil;
import org.xutils.http.BaseParams;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.http.body.ProgressBody;
import org.xutils.http.body.RequestBody;
import org.xutils.http.cookie.DbCookieStore;
import org.xutils.ex.HttpException;

public class HttpRequest extends UriRequest {
    private static final CookieManager COOKIE_MANAGER = new CookieManager(DbCookieStore.INSTANCE, CookiePolicy.ACCEPT_ALL);
    private String cacheKey;
    private HttpURLConnection connection;
    private InputStream inputStream;
    private boolean isLoading;
    private int responseCode;

    public HttpRequest(RequestParams requestParams, Type type) throws Throwable {
        super(requestParams, type);
        this.cacheKey = null;
        this.isLoading = false;
        this.inputStream = null;
        this.connection = null;
        this.responseCode = 0;
    }

    @Override
    protected String buildQueryUrl(RequestParams requestParams) throws IOException {
        String uri = requestParams.getUri();
        StringBuilder sb = new StringBuilder(uri);
        if (!uri.contains("?")) {
            sb.append("?");
        } else if (!uri.endsWith("?")) {
            sb.append("&");
        }
        List<KeyValue> queryStringParams = requestParams.getQueryStringParams();
        if (queryStringParams != null) {
            for (KeyValue keyValue : queryStringParams) {
                String str = keyValue.f6724key;
                String valueStrOrNull = keyValue.getValueStrOrNull();
                if (!TextUtils.isEmpty(str) && valueStrOrNull != null) {
                    sb.append(URLEncoder.encode(str, requestParams.getCharset()).replaceAll("\\+", "%20")).append("=").append(URLEncoder.encode(valueStrOrNull, requestParams.getCharset()).replaceAll("\\+", "%20")).append("&");
                }
            }
        }
        if (sb.charAt(sb.length() - 1) == '&') {
            sb.deleteCharAt(sb.length() - 1);
        }
        if (sb.charAt(sb.length() - 1) == '?') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override
    public String getRequestUri() {
        URL url;
        String str = this.queryUrl;
        if (this.connection != null && (url = this.connection.getURL()) != null) {
            return url.toString();
        }
        return str;
    }

    @Override
    @TargetApi(19)
    public void sendRequest() throws Throwable {
        RequestBody requestBody;
        boolean z = false;
        this.isLoading = false;
        this.responseCode = 0;
        URL url = new URL(this.queryUrl);
        Proxy proxy = this.params.getProxy();
        if (proxy != null) {
            this.connection = (HttpURLConnection) url.openConnection(proxy);
        } else {
            this.connection = (HttpURLConnection) url.openConnection();
        }
        if (Build.VERSION.SDK_INT < 19) {
            this.connection.setRequestProperty("Connection", "close");
        }
        this.connection.setReadTimeout(this.params.getReadTimeout());
        this.connection.setConnectTimeout(this.params.getConnectTimeout());
        this.connection.setInstanceFollowRedirects(this.params.getRedirectHandler() == null);
        if (this.connection instanceof HttpsURLConnection) {
            SSLSocketFactory sslSocketFactory = this.params.getSslSocketFactory();
            if (sslSocketFactory != null) {
                ((HttpsURLConnection) this.connection).setSSLSocketFactory(sslSocketFactory);
            }
            HostnameVerifier hostnameVerifier = this.params.getHostnameVerifier();
            if (hostnameVerifier != null) {
                ((HttpsURLConnection) this.connection).setHostnameVerifier(hostnameVerifier);
            }
        }
        if (this.params.isUseCookie()) {
            try {
                List<String> list = COOKIE_MANAGER.get(url.toURI(), new HashMap(0)).get("Cookie");
                if (list != null) {
                    this.connection.setRequestProperty("Cookie", TextUtils.join(";", list));
                }
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
            }
        }
        List<BaseParams.Header> headers = this.params.getHeaders();
        if (headers != null) {
            for (BaseParams.Header header : headers) {
                String str = header.f6724key;
                String valueStrOrNull = header.getValueStrOrNull();
                if (!TextUtils.isEmpty(str)) {
                    if (header.setHeader) {
                        this.connection.setRequestProperty(str, valueStrOrNull);
                    } else {
                        this.connection.addRequestProperty(str, valueStrOrNull);
                    }
                }
            }
        }
        if (this.responseParser != null) {
            this.responseParser.beforeRequest(this);
        }
        if (this.requestInterceptListener != null) {
            this.requestInterceptListener.beforeRequest(this);
        }
        HttpMethod method = this.params.getMethod();
        try {
            this.connection.setRequestMethod(method.toString());
        } catch (ProtocolException e) {
            try {
                Field declaredField = HttpURLConnection.class.getDeclaredField("method");
                declaredField.setAccessible(true);
                declaredField.set(this.connection, method.toString());
            } catch (Throwable th2) {
                throw e;
            }
        }
        if (HttpMethod.permitsRequestBody(method) && (requestBody = this.params.getRequestBody()) != null) {
            if (requestBody instanceof ProgressBody) {
                ((ProgressBody) requestBody).setProgressHandler(this.progressHandler);
            }
            String contentType = requestBody.getContentType();
            if (!TextUtils.isEmpty(contentType)) {
                this.connection.setRequestProperty("Content-Type", contentType);
            }
            long contentLength = requestBody.getContentLength();
            if (contentLength < 0) {
                this.connection.setChunkedStreamingMode(262144);
                z = true;
            } else if (contentLength < 2147483647L) {
                this.connection.setFixedLengthStreamingMode((int) contentLength);
            } else if (Build.VERSION.SDK_INT >= 19) {
                this.connection.setFixedLengthStreamingMode(contentLength);
            } else {
                this.connection.setChunkedStreamingMode(262144);
                z = true;
            }
            if (z) {
                this.connection.setRequestProperty("Transfer-Encoding", "chunked");
            } else {
                this.connection.setRequestProperty("Content-Length", String.valueOf(contentLength));
            }
            this.connection.setDoOutput(true);
            requestBody.writeTo(this.connection.getOutputStream());
        }
        if (this.params.isUseCookie()) {
            try {
                Map<String, List<String>> headerFields = this.connection.getHeaderFields();
                if (headerFields != null) {
                    COOKIE_MANAGER.put(url.toURI(), headerFields);
                }
            } catch (Throwable th3) {
                LogUtil.m9046e(th3.getMessage(), th3);
            }
        }
        this.responseCode = this.connection.getResponseCode();
        if (this.responseParser != null) {
            this.responseParser.afterRequest(this);
        }
        if (this.requestInterceptListener != null) {
            this.requestInterceptListener.afterRequest(this);
        }
        if (this.responseCode == 204 || this.responseCode == 205) {
            throw new HttpException(this.responseCode, getResponseMessage());
        }
        if (this.responseCode >= 300) {
            HttpException httpException = new HttpException(this.responseCode, getResponseMessage());
            try {
                httpException.setResult(IOUtil.readStr(getInputStream(), this.params.getCharset()));
            } catch (Throwable th4) {
                LogUtil.m9052w(th4.getMessage(), th4);
            }
            LogUtil.m9045e(httpException.toString() + ", url: " + this.queryUrl);
            throw httpException;
        }
        this.isLoading = true;
    }

    @Override
    public boolean isLoading() {
        return this.isLoading;
    }

    @Override
    public String getCacheKey() {
        if (this.cacheKey == null) {
            this.cacheKey = this.params.getCacheKey();
            if (TextUtils.isEmpty(this.cacheKey)) {
                this.cacheKey = this.params.toString();
            }
        }
        return this.cacheKey;
    }

    @Override
    public Object loadResult() throws Throwable {
        this.isLoading = true;
        return super.loadResult();
    }

    @Override
    public Object loadResultFromCache() throws Throwable {
        this.isLoading = true;
        DiskCacheEntity diskCacheEntityM9037get = LruDiskCache.getDiskCache(this.params.getCacheDirName()).setMaxSize(this.params.getCacheSize()).m9037get(getCacheKey());
        if (diskCacheEntityM9037get == null) {
            return null;
        }
        if (HttpMethod.permitsCache(this.params.getMethod())) {
            Date lastModify = diskCacheEntityM9037get.getLastModify();
            if (lastModify.getTime() > 0) {
                this.params.setHeader("If-Modified-Since", toGMTString(lastModify));
            }
            String etag = diskCacheEntityM9037get.getEtag();
            if (!TextUtils.isEmpty(etag)) {
                this.params.setHeader("If-None-Match", etag);
            }
        }
        return this.loader.loadFromCache(diskCacheEntityM9037get);
    }

    @Override
    public void clearCacheHeader() {
        this.params.setHeader("If-Modified-Since", null);
        this.params.setHeader("If-None-Match", null);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        if (this.connection != null && this.inputStream == null) {
            this.inputStream = this.connection.getResponseCode() >= 400 ? this.connection.getErrorStream() : this.connection.getInputStream();
        }
        return this.inputStream;
    }

    @Override
    public void close() throws IOException {
        if (this.inputStream != null) {
            IOUtil.closeQuietly(this.inputStream);
            this.inputStream = null;
        }
        if (this.connection != null) {
            this.connection.disconnect();
        }
    }

    @Override
    public long getContentLength() {
        long j = -1;
        if (this.connection != null) {
            try {
                String headerField = this.connection.getHeaderField("content-length");
                if (headerField != null) {
                    j = Long.parseLong(headerField);
                }
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
            }
        }
        if (j < 1) {
            try {
                return getInputStream().available();
            } catch (Throwable th2) {
                return j;
            }
        }
        return j;
    }

    @Override
    public int getResponseCode() throws IOException {
        if (this.connection != null) {
            return this.responseCode;
        }
        if (getInputStream() != null) {
            return 200;
        }
        return 404;
    }

    @Override
    public String getResponseMessage() throws IOException {
        if (this.connection != null) {
            return URLDecoder.decode(this.connection.getResponseMessage(), this.params.getCharset());
        }
        return null;
    }

    @Override
    public long getExpiration() {
        long jCurrentTimeMillis = -1;
        if (this.connection == null) {
            return -1L;
        }
        String headerField = this.connection.getHeaderField("Cache-Control");
        if (!TextUtils.isEmpty(headerField)) {
            StringTokenizer stringTokenizer = new StringTokenizer(headerField, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String lowerCase = stringTokenizer.nextToken().trim().toLowerCase();
                if (lowerCase.startsWith("max-age")) {
                    int iIndexOf = lowerCase.indexOf(61);
                    if (iIndexOf <= 0) {
                        break;
                    }
                    try {
                        long j = Long.parseLong(lowerCase.substring(iIndexOf + 1).trim());
                        if (j <= 0) {
                            break;
                        }
                        jCurrentTimeMillis = System.currentTimeMillis() + (j * 1000);
                        break;
                    } catch (Throwable th) {
                        LogUtil.m9046e(th.getMessage(), th);
                        break;
                    }
                }
            }
        }
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = this.connection.getExpiration();
        }
        if (jCurrentTimeMillis <= 0 && this.params.getCacheMaxAge() > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() + this.params.getCacheMaxAge();
        }
        if (jCurrentTimeMillis <= 0) {
            return Long.MAX_VALUE;
        }
        return jCurrentTimeMillis;
    }

    @Override
    public long getLastModified() {
        return getHeaderFieldDate("Last-Modified", System.currentTimeMillis());
    }

    @Override
    public String getETag() {
        if (this.connection == null) {
            return null;
        }
        return this.connection.getHeaderField("ETag");
    }

    @Override
    public String getResponseHeader(String str) {
        if (this.connection == null) {
            return null;
        }
        return this.connection.getHeaderField(str);
    }

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        if (this.connection == null) {
            return null;
        }
        return this.connection.getHeaderFields();
    }

    @Override
    public long getHeaderFieldDate(String str, long j) {
        return this.connection == null ? j : this.connection.getHeaderFieldDate(str, j);
    }

    private static String toGMTString(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM y HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(date);
    }
}
