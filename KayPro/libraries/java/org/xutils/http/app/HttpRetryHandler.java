package org.xutils.http.app;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.HashSet;
import org.json.JSONException;
import org.xutils.common.Callback;
import org.xutils.common.util.LogUtil;
import org.xutils.http.HttpMethod;
import org.xutils.http.request.UriRequest;
import org.xutils.ex.HttpException;

public class HttpRetryHandler {
    protected static HashSet<Class<?>> blackList = new HashSet<>();
    protected int maxRetryCount = 2;

    static {
        blackList.add(HttpException.class);
        blackList.add(Callback.CancelledException.class);
        blackList.add(MalformedURLException.class);
        blackList.add(URISyntaxException.class);
        blackList.add(NoRouteToHostException.class);
        blackList.add(PortUnreachableException.class);
        blackList.add(ProtocolException.class);
        blackList.add(NullPointerException.class);
        blackList.add(FileNotFoundException.class);
        blackList.add(JSONException.class);
        blackList.add(UnknownHostException.class);
        blackList.add(IllegalArgumentException.class);
    }

    public void setMaxRetryCount(int i) {
        this.maxRetryCount = i;
    }

    public boolean canRetry(UriRequest uriRequest, Throwable th, int i) {
        LogUtil.m9052w(th.getMessage(), th);
        if (i > this.maxRetryCount) {
            LogUtil.m9051w(uriRequest.toString());
            LogUtil.m9051w("The Max Retry times has been reached!");
            return false;
        }
        if (!HttpMethod.permitsRetry(uriRequest.getParams().getMethod())) {
            LogUtil.m9051w(uriRequest.toString());
            LogUtil.m9051w("The Request Method can not be retried.");
            return false;
        }
        if (blackList.contains(th.getClass())) {
            LogUtil.m9051w(uriRequest.toString());
            LogUtil.m9051w("The Exception can not be retried.");
            return false;
        }
        return true;
    }
}
