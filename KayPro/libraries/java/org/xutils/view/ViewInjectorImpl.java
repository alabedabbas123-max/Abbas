package org.xutils.view;

import android.app.Activity;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import org.xutils.x;
import org.xutils.ViewInjector;
import org.xutils.common.util.LogUtil;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

public final class ViewInjectorImpl implements ViewInjector {
    private static final HashSet<Class<?>> IGNORED = new HashSet<>();
    private static volatile ViewInjectorImpl instance;
    private static final Object lock;

    static {
        IGNORED.add(Object.class);
        IGNORED.add(Activity.class);
        IGNORED.add(Fragment.class);
        try {
            IGNORED.add(Class.forName("android.support.v4.app.Fragment"));
            IGNORED.add(Class.forName("android.support.v4.app.FragmentActivity"));
        } catch (Throwable th) {
        }
        lock = new Object();
    }

    private ViewInjectorImpl() {
    }

    public static void registerInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new ViewInjectorImpl();
                }
            }
        }
        ClassX.Ext.setViewInjector(instance);
    }

    @Override
    public void inject(View view) {
        injectObject(view, view.getClass(), new ViewFinder(view));
    }

    @Override
    public void inject(Activity activity) {
        int iValue;
        Class<?> cls = activity.getClass();
        try {
            ContentView contentViewFindContentView = findContentView(cls);
            if (contentViewFindContentView != null && (iValue = contentViewFindContentView.value()) > 0) {
                activity.setContentView(iValue);
            }
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
        }
        injectObject(activity, cls, new ViewFinder(activity));
    }

    @Override
    public void inject(Object obj, View view) {
        injectObject(obj, obj.getClass(), new ViewFinder(view));
    }

    @Override
    public View inject(Object obj, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iValue;
        View viewInflate = null;
        Class<?> cls = obj.getClass();
        try {
            ContentView contentViewFindContentView = findContentView(cls);
            if (contentViewFindContentView != null && (iValue = contentViewFindContentView.value()) > 0) {
                viewInflate = layoutInflater.inflate(iValue, viewGroup, false);
            }
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
        }
        injectObject(obj, cls, new ViewFinder(viewInflate));
        return viewInflate;
    }

    private static ContentView findContentView(Class<?> cls) {
        if (cls == null || IGNORED.contains(cls) || cls.getName().startsWith("androidx.")) {
            return null;
        }
        ContentView contentView = (ContentView) cls.getAnnotation(ContentView.class);
        if (contentView == null) {
            return findContentView(cls.getSuperclass());
        }
        return contentView;
    }

    private static void injectObject(Object obj, Class<?> cls, ViewFinder viewFinder) {
        Event event;
        ViewInject viewInject;
        if (cls != null && !IGNORED.contains(cls) && !cls.getName().startsWith("androidx.")) {
            injectObject(obj, cls.getSuperclass(), viewFinder);
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isFinal(field.getModifiers()) && !type.isPrimitive() && !type.isArray() && (viewInject = (ViewInject) field.getAnnotation(ViewInject.class)) != null) {
                        try {
                            View viewFindViewById = viewFinder.findViewById(viewInject.value(), viewInject.parentId());
                            if (viewFindViewById != null) {
                                field.setAccessible(true);
                                field.set(obj, viewFindViewById);
                            } else {
                                throw new RuntimeException("Invalid @ViewInject for " + cls.getSimpleName() + "." + field.getName());
                            }
                        } catch (Throwable th) {
                            LogUtil.m9046e(th.getMessage(), th);
                        }
                    }
                }
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            if (declaredMethods != null && declaredMethods.length > 0) {
                for (Method method : declaredMethods) {
                    if (!Modifier.isStatic(method.getModifiers()) && Modifier.isPrivate(method.getModifiers()) && (event = (Event) method.getAnnotation(Event.class)) != null) {
                        try {
                            int[] iArrValue = event.value();
                            int[] iArrParentId = event.parentId();
                            int length = iArrParentId == null ? 0 : iArrParentId.length;
                            int i = 0;
                            while (i < iArrValue.length) {
                                int i2 = iArrValue[i];
                                if (i2 > 0) {
                                    ViewInfo viewInfo = new ViewInfo();
                                    viewInfo.value = i2;
                                    viewInfo.parentId = length > i ? iArrParentId[i] : 0;
                                    method.setAccessible(true);
                                    EventListenerManager.addEventMethod(viewFinder, viewInfo, event, obj, method);
                                }
                                i++;
                            }
                        } catch (Throwable th2) {
                            LogUtil.m9046e(th2.getMessage(), th2);
                        }
                    }
                }
            }
        }
    }
}
