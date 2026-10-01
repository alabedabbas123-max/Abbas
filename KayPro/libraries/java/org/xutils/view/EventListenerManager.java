package org.xutils.view;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.xutils.common.util.DoubleKeyValueMap;
import org.xutils.common.util.LogUtil;
import org.xutils.view.annotation.Event;

final class EventListenerManager {
    private static final HashSet<String> AVOID_QUICK_EVENT_SET = new HashSet<>(2);
    private static final long QUICK_EVENT_TIME_SPAN = 300;
    private static final DoubleKeyValueMap<ViewInfo, Class<?>, Object> listenerCache;

    static {
        AVOID_QUICK_EVENT_SET.add("onClick");
        AVOID_QUICK_EVENT_SET.add("onItemClick");
        listenerCache = new DoubleKeyValueMap<>();
    }

    private EventListenerManager() {
    }

    public static void addEventMethod(ViewFinder viewFinder, ViewInfo viewInfo, Event event, Object obj, Method method) {
        Object objNewProxyInstance;
        boolean z = false;
        try {
            View viewFindViewByInfo = viewFinder.findViewByInfo(viewInfo);
            if (viewFindViewByInfo != null) {
                Class<?> clsType = event.type();
                String str = event.setter();
                String str2 = TextUtils.isEmpty(str) ? "set" + clsType.getSimpleName() : str;
                String strMethod = event.method();
                Object objM9040get = listenerCache.m9040get(viewInfo, clsType);
                if (objM9040get != null) {
                    DynamicHandler dynamicHandler = (DynamicHandler) Proxy.getInvocationHandler(objM9040get);
                    boolean zEquals = obj.equals(dynamicHandler.getHandler());
                    if (zEquals) {
                        dynamicHandler.addMethod(strMethod, method);
                    }
                    z = zEquals;
                }
                if (z) {
                    objNewProxyInstance = objM9040get;
                } else {
                    DynamicHandler dynamicHandler2 = new DynamicHandler(obj);
                    dynamicHandler2.addMethod(strMethod, method);
                    objNewProxyInstance = Proxy.newProxyInstance(clsType.getClassLoader(), new Class[]{clsType}, dynamicHandler2);
                    listenerCache.m9042put(viewInfo, clsType, objNewProxyInstance);
                }
                viewFindViewByInfo.getClass().getMethod(str2, clsType).invoke(viewFindViewByInfo, objNewProxyInstance);
            }
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
        }
    }

    public static class DynamicHandler implements InvocationHandler {
        private static long lastClickTime = 0;
        private WeakReference<Object> handlerRef;
        private final HashMap<String, Method> methodMap = new HashMap<>(1);

        public DynamicHandler(Object obj) {
            this.handlerRef = new WeakReference<>(obj);
        }

        public void addMethod(String str, Method method) {
            this.methodMap.put(str, method);
        }

        public Object getHandler() {
            return this.handlerRef.get();
        }

        @Override
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2 = this.handlerRef.get();
            if (obj2 != null) {
                String name = method.getName();
                if ("toString".equals(name)) {
                    return DynamicHandler.class.getSimpleName();
                }
                Method value = this.methodMap.get(name);
                if (value == null && this.methodMap.size() == 1) {
                    Iterator<Map.Entry<String, Method>> it = this.methodMap.entrySet().iterator();
                    if (it.hasNext()) {
                        Map.Entry<String, Method> next = it.next();
                        if (TextUtils.isEmpty(next.getKey())) {
                            value = next.getValue();
                        }
                    }
                }
                if (value != null) {
                    if (EventListenerManager.AVOID_QUICK_EVENT_SET.contains(name)) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - lastClickTime;
                        if (jCurrentTimeMillis > 0 && jCurrentTimeMillis < EventListenerManager.QUICK_EVENT_TIME_SPAN) {
                            LogUtil.m9043d("onClick cancelled: " + jCurrentTimeMillis);
                            return null;
                        }
                        lastClickTime = System.currentTimeMillis();
                    }
                    try {
                        return value.invoke(obj2, objArr);
                    } catch (Throwable th) {
                        throw new RuntimeException("invoke method error:" + obj2.getClass().getName() + "#" + value.getName(), th);
                    }
                }
                LogUtil.m9051w("method not impl: " + name + "(" + obj2.getClass().getSimpleName() + ")");
            }
            return null;
        }
    }
}
