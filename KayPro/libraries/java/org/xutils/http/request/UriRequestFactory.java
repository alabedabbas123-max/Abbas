package org.xutils.http.request;

import android.text.TextUtils;
import com.baidu.mobstat.Config;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.app.RequestTracker;

public final class UriRequestFactory {
    private static final HashMap<String, Class<? extends UriRequest>> SCHEME_CLS_MAP = new HashMap<>();
    private static Class<? extends RequestTracker> defaultTrackerCls;

    private UriRequestFactory() {
    }

    public static UriRequest getUriRequest(RequestParams requestParams, Type type) throws Throwable {
        String strSubstring = null;
        String uri = requestParams.getUri();
        int iIndexOf = uri.indexOf(Config.TRACE_TODAY_VISIT_SPLIT);
        if (uri.startsWith("/")) {
            strSubstring = "file";
        } else if (iIndexOf > 0) {
            strSubstring = uri.substring(0, iIndexOf);
        }
        if (!TextUtils.isEmpty(strSubstring)) {
            String lowerCase = strSubstring.toLowerCase();
            Class<? extends UriRequest> cls = SCHEME_CLS_MAP.get(lowerCase);
            if (cls != null) {
                return cls.getConstructor(RequestParams.class, Type.class).newInstance(requestParams, type);
            }
            if (lowerCase.startsWith("http")) {
                return new HttpRequest(requestParams, type);
            }
            if (lowerCase.equals("assets")) {
                return new AssetsRequest(requestParams, type);
            }
            if (lowerCase.equals("file")) {
                return new LocalFileRequest(requestParams, type);
            }
            if (lowerCase.equals("res")) {
                return new ResRequest(requestParams, type);
            }
            throw new IllegalArgumentException("The url not be support: " + uri);
        }
        throw new IllegalArgumentException("The url not be support: " + uri);
    }

    public static void registerDefaultTrackerClass(Class<? extends RequestTracker> cls) {
        defaultTrackerCls = cls;
    }

    public static RequestTracker getDefaultTracker() {
        try {
            if (defaultTrackerCls == null) {
                return null;
            }
            return defaultTrackerCls.newInstance();
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
            return null;
        }
    }

    public static void registerRequestClass(String str, Class<? extends UriRequest> cls) {
        SCHEME_CLS_MAP.put(str, cls);
    }
}
