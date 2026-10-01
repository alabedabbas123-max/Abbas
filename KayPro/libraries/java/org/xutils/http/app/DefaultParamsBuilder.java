package org.xutils.http.app;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.xutils.common.util.KeyValue;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

public class DefaultParamsBuilder implements ParamsBuilder {
    private static SSLSocketFactory trustAllSSlSocketFactory;

    @Override
    public String buildUri(RequestParams requestParams, HttpRequest httpRequest) throws Throwable {
        return httpRequest.host() + "/" + httpRequest.path();
    }

    @Override
    public String buildCacheKey(RequestParams requestParams, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        if (strArr != null && strArr.length > 0) {
            sb.append(requestParams.getUri()).append("?");
            for (String str : strArr) {
                List<KeyValue> params = requestParams.getParams(str);
                if (params != null && !params.isEmpty()) {
                    Iterator<KeyValue> it = params.iterator();
                    while (it.hasNext()) {
                        String valueStrOrNull = it.next().getValueStrOrNull();
                        if (valueStrOrNull != null) {
                            sb.append(str).append("=").append(valueStrOrNull).append("&");
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    @Override
    public SSLSocketFactory getSSLSocketFactory() throws Throwable {
        return getTrustAllSSLSocketFactory();
    }

    @Override
    public void buildParams(RequestParams requestParams) throws Throwable {
    }

    @Override
    public void buildSign(RequestParams requestParams, String[] strArr) throws Throwable {
    }

    public static SSLSocketFactory getTrustAllSSLSocketFactory() {
        if (trustAllSSlSocketFactory == null) {
            synchronized (DefaultParamsBuilder.class) {
                if (trustAllSSlSocketFactory == null) {
                    TrustManager[] trustManagerArr = {new X509TrustManager() {
                        @Override
                        public X509Certificate[] getAcceptedIssuers() {
                            return new X509Certificate[0];
                        }

                        @Override
                        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                            LogUtil.m9043d("checkClientTrusted:" + str);
                        }

                        @Override
                        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                            LogUtil.m9043d("checkServerTrusted:" + str);
                        }
                    }};
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, trustManagerArr, null);
                        trustAllSSlSocketFactory = sSLContext.getSocketFactory();
                    } catch (Throwable th) {
                        LogUtil.m9046e(th.getMessage(), th);
                    }
                }
            }
        }
        return trustAllSSlSocketFactory;
    }
}
