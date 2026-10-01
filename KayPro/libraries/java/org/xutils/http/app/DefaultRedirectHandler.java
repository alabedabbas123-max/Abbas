package org.xutils.http.app;

import android.text.TextUtils;
import android.webkit.URLUtil;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.http.request.HttpRequest;
import org.xutils.http.request.UriRequest;

public class DefaultRedirectHandler implements RedirectHandler {
    @Override
    public RequestParams getRedirectParams(UriRequest uriRequest) throws Throwable {
        String str;
        if (uriRequest instanceof HttpRequest) {
            HttpRequest httpRequest = (HttpRequest) uriRequest;
            RequestParams params = httpRequest.getParams();
            String responseHeader = httpRequest.getResponseHeader("Location");
            if (!TextUtils.isEmpty(responseHeader)) {
                if (URLUtil.isHttpsUrl(responseHeader) || URLUtil.isHttpUrl(responseHeader)) {
                    str = responseHeader;
                } else {
                    String uri = params.getUri();
                    if (responseHeader.startsWith("/")) {
                        int iIndexOf = uri.indexOf("/", 8);
                        if (iIndexOf != -1) {
                            uri = uri.substring(0, iIndexOf);
                        }
                    } else {
                        int iLastIndexOf = uri.lastIndexOf("/");
                        if (iLastIndexOf >= 8) {
                            uri = uri.substring(0, iLastIndexOf + 1);
                        } else {
                            uri = uri + "/";
                        }
                    }
                    str = uri + responseHeader;
                }
                params.setUri(str);
                int responseCode = uriRequest.getResponseCode();
                if (responseCode == 301 || responseCode == 302 || responseCode == 303) {
                    params.clearParams();
                    params.setMethod(HttpMethod.GET);
                }
                return params;
            }
        }
        return null;
    }
}
