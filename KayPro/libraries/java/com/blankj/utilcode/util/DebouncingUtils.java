package com.blankj.utilcode.util;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DebouncingUtils {
    private static final int CACHE_SIZE = 64;
    private static final long DEBOUNCING_DEFAULT_VALUE = 1000;
    private static final Map<String, Long> KEY_MILLIS_MAP = new ConcurrentHashMap(64);

    private DebouncingUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static void clearIfNecessary(long j) {
        if (KEY_MILLIS_MAP.size() < 64) {
            return;
        }
        Iterator<Map.Entry<String, Long>> it = KEY_MILLIS_MAP.entrySet().iterator();
        while (it.hasNext()) {
            if (j >= it.next().getValue().longValue()) {
                it.remove();
            }
        }
    }

    public static boolean isValid(View view) {
        return isValid(view, DEBOUNCING_DEFAULT_VALUE);
    }

    public static boolean isValid(View view, long j) {
        return isValid(String.valueOf(view.hashCode()), j);
    }

    public static boolean isValid(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The key is null.");
        }
        if (j < 0) {
            throw new IllegalArgumentException("The duration is less than 0.");
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        clearIfNecessary(jElapsedRealtime);
        Long l = KEY_MILLIS_MAP.get(str);
        if (l != null && jElapsedRealtime < l.longValue()) {
            return false;
        }
        KEY_MILLIS_MAP.put(str, Long.valueOf(jElapsedRealtime + j));
        return true;
    }
}
