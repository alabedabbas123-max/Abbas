package com.baidu.mobstat;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.github.megatronking.svg.generator.vector.model.VectorConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONObject;

public class am {

    private static volatile String f4102c;

    private static volatile int f4103d = 0;

    private final Handler f4105b = new Handler(Looper.getMainLooper());

    private final b f4104a = new b();

    public static void m6064a() {
        f4103d = 0;
    }

    public static void m6066b() {
        f4102c = "";
    }

    public JSONObject m6068a(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            if (!aj.m5998a()) {
                return null;
            }
            int i = f4103d + 1;
            f4103d = i;
            if (i >= 3) {
                aj.m5997a(false);
            }
            Bitmap bitmapM6069b = m6069b(activity);
            if (bitmapM6069b == null) {
                return null;
            }
            JSONArray jSONArrayM6067c = m6067c(activity);
            String strM6519a = bs.a.m6519a(jSONArrayM6067c.toString().getBytes());
            if (f4102c != null && f4102c.equals(strM6519a)) {
                return null;
            }
            f4102c = strM6519a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("screenshot", bi.m6357a(bitmapM6069b));
                jSONObject.put("hash", bi.m6375b(bitmapM6069b));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(Config.DEVICE_WIDTH, bitmapM6069b.getWidth());
                jSONObject2.put("h", bitmapM6069b.getHeight());
                jSONObject.put("screen", jSONObject2);
                jSONObject.put("page", activity.getClass().getName());
                jSONObject.put("objects", jSONArrayM6067c);
                return jSONObject;
            } catch (Throwable th) {
                return jSONObject;
            }
        } catch (Throwable th2) {
            return null;
        }
    }

    private JSONArray m6067c(Activity activity) throws Exception {
        JSONArray jSONArray = new JSONArray();
        View viewM6354a = bi.m6354a(activity);
        m6065a(activity, viewM6354a, jSONArray, "", viewM6354a);
        return jSONArray;
    }

    private void m6065a(Activity activity, View view, JSONArray jSONArray, String str, View view2) throws Exception {
        Rect rectM6395e;
        Object jSONArray2;
        int i = 0;
        if (view != null && (rectM6395e = bi.m6395e(view)) != null && !ah.m5978a(view)) {
            String strM6406k = bi.m6406k(view);
            if (!TextUtils.isEmpty(strM6406k) && !bi.m6389c(activity, view)) {
                String strM6384c = bi.m6384c(view);
                if (TextUtils.isEmpty(strM6384c)) {
                    strM6384c = bi.m6360a(view, str);
                    if (TextUtils.isEmpty(strM6384c)) {
                        strM6384c = bi.m6359a(view, view2);
                    }
                }
                if (!TextUtils.isEmpty(strM6384c)) {
                    long jLongValue = -1;
                    try {
                        jLongValue = Long.valueOf(strM6384c).longValue();
                    } catch (Exception e) {
                    }
                    if (jLongValue >= 0) {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray3 = new JSONArray();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("p", strM6406k);
                        jSONObject2.put("i", strM6384c);
                        String strM6376b = bi.m6376b(view);
                        jSONObject2.put("t", strM6376b);
                        jSONArray3.put(jSONObject2);
                        jSONObject.put(Config.FEED_LIST_ITEM_PATH, jSONArray3);
                        jSONObject.put("type", strM6376b);
                        jSONObject.put("value", bi.m6358a(view));
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("x", ag.m5969a(activity, rectM6395e.left));
                        jSONObject3.put("y", ag.m5969a(activity, rectM6395e.top));
                        jSONObject3.put(Config.DEVICE_WIDTH, ag.m5969a(activity, rectM6395e.width()));
                        jSONObject3.put("h", ag.m5969a(activity, rectM6395e.height()));
                        jSONObject.put("frame", jSONObject3);
                        jSONObject.put(VectorConstants.ATTR_ALPHA, bi.m6403i(view));
                        jSONObject.put("page", activity.getClass().getName());
                        jSONObject.put("z", bi.m6405j(view));
                        if (view instanceof WebView) {
                            String str2 = "";
                            String strM6429a = bk.m6429a(activity, (WebView) view, rectM6395e);
                            if (TextUtils.isEmpty(strM6429a)) {
                                jSONArray2 = null;
                            } else {
                                JSONObject jSONObject4 = new JSONObject(strM6429a);
                                String strOptString = jSONObject4.optString("url");
                                jSONArray2 = jSONObject4.optJSONArray("objects");
                                str2 = strOptString;
                            }
                            if (jSONArray2 == null) {
                                jSONArray2 = new JSONArray();
                            }
                            jSONObject.put("child", jSONArray2);
                            if (TextUtils.isEmpty(str2)) {
                                jSONObject.put("url", "/");
                            } else {
                                jSONObject.put("url", str2);
                            }
                        }
                        jSONObject.put("edit", bi.m6382b(view, str) ? 1 : 0);
                        jSONArray.put(jSONObject);
                        if (!(view instanceof WebView)) {
                            if (view instanceof ViewGroup) {
                                ViewGroup viewGroup = (ViewGroup) view;
                                JSONArray jSONArray4 = new JSONArray();
                                jSONObject.put("child", jSONArray4);
                                while (true) {
                                    int i2 = i;
                                    if (i2 < viewGroup.getChildCount()) {
                                        m6065a(activity, viewGroup.getChildAt(i2), jSONArray4, strM6376b, view2);
                                        i = i2 + 1;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                jSONObject.put("child", new JSONArray());
                            }
                        }
                    }
                }
            }
        }
    }

    public Bitmap m6069b(Activity activity) {
        List list;
        this.f4104a.m6076a(activity);
        FutureTask futureTask = new FutureTask(this.f4104a);
        this.f4105b.post(futureTask);
        List listEmptyList = Collections.emptyList();
        if (futureTask != null) {
            try {
                list = (List) futureTask.get(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                bb.m6313c().m6304b("autotrace: Screenshot interrupted, no screenshot will be sent.", e);
            } catch (TimeoutException e2) {
                bb.m6313c().m6308c("autotrace: Screenshot took more than 2 second to be scheduled and executed. No screenshot will be sent.", e2);
            } catch (Exception e3) {
                bb.m6313c().m6310d("autotrace: Exception thrown during screenshot attempt", e3);
            }
        } else {
            list = listEmptyList;
        }
        listEmptyList = list;
        if (listEmptyList.size() == 0) {
            return null;
        }
        return ((c) listEmptyList.get(0)).f4115c.f4106a;
    }

    static class b implements Callable<List<c>> {

        private Activity f4108a;

        private final int f4112e = 160;

        private final DisplayMetrics f4110c = new DisplayMetrics();

        private final List<c> f4109b = new ArrayList();

        private final a f4111d = new a();

        public void m6076a(Activity activity) {
            this.f4108a = activity;
        }

        @Override
        public List<c> call() throws Exception {
            this.f4109b.clear();
            HashSet<Activity> hashSet = new HashSet(1);
            hashSet.add(this.f4108a);
            for (Activity activity : hashSet) {
                String canonicalName = activity.getClass().getCanonicalName();
                View viewM6374b = bi.m6374b(activity);
                activity.getWindowManager().getDefaultDisplay().getMetrics(this.f4110c);
                this.f4109b.add(new c(canonicalName, viewM6374b));
            }
            int size = this.f4109b.size();
            for (int i = 0; i < size; i++) {
                c cVar = this.f4109b.get(i);
                m6073b();
                m6072a(cVar);
                m6074c();
            }
            return this.f4109b;
        }

        private void m6073b() {
            ah.m5975a(this.f4108a, false);
        }

        private void m6074c() {
            ah.m5975a(this.f4108a, true);
        }

        private void m6072a(c cVar) {
            Bitmap drawingCache;
            Bitmap bitmap;
            View view = cVar.f4114b;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("createSnapshot", Bitmap.Config.class, Integer.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                drawingCache = (Bitmap) declaredMethod.invoke(view, Bitmap.Config.RGB_565, -1, false);
            } catch (ClassCastException e) {
                bb.m6313c().m6310d("autotrace: createSnapshot didn't return a bitmap", e);
                drawingCache = null;
            } catch (IllegalAccessException e2) {
                bb.m6313c().m6310d("autotrace: Can't access createSnapshot, using drawCache", e2);
                drawingCache = null;
            } catch (IllegalArgumentException e3) {
                bb.m6313c().m6304b("autotrace: Can't call createSnapshot with arguments", e3);
                drawingCache = null;
            } catch (NoSuchMethodException e4) {
                bb.m6313c().m6301a("autotrace: Can't call createSnapshot, will use drawCache", e4);
                drawingCache = null;
            } catch (InvocationTargetException e5) {
                bb.m6313c().m6310d("autotrace: Exception when calling createSnapshot", e5);
                drawingCache = null;
            } catch (Exception e6) {
                bb.m6313c().m6310d(" autotrace:createSnapshot encounter exception", e6);
                drawingCache = null;
            }
            Boolean boolValueOf = null;
            if (drawingCache == null) {
                try {
                    boolValueOf = Boolean.valueOf(view.isDrawingCacheEnabled());
                    view.setDrawingCacheEnabled(true);
                    view.buildDrawingCache(true);
                    drawingCache = view.getDrawingCache();
                } catch (Exception e7) {
                    bb.m6313c().m6301a("autotrace: Can't take a bitmap snapshot of view " + view + ", skipping for now.", e7);
                    bitmap = drawingCache;
                }
            }
            bitmap = drawingCache;
            float f = 1.0f;
            if (bitmap != null) {
                int density = bitmap.getDensity();
                f = density != 0 ? 160.0f / density : 1.0f;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int width2 = (int) (((double) (bitmap.getWidth() * f)) + 0.5d);
                int height2 = (int) (((double) (bitmap.getHeight() * f)) + 0.5d);
                if (width > 0 && height > 0 && width2 > 0 && height2 > 0) {
                    this.f4111d.m6071a(width2, height2, 160, bitmap);
                }
            }
            if (boolValueOf != null && !boolValueOf.booleanValue()) {
                view.setDrawingCacheEnabled(false);
            }
            cVar.f4116d = f;
            cVar.f4115c = this.f4111d;
        }
    }

    static class a {

        private final Paint f4107b = new Paint(2);

        private Bitmap f4106a = null;

        /* JADX WARN: Code duplicated, block: B:15:0x002a A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000d, B:13:0x0026, B:15:0x002a, B:9:0x0015, B:10:0x001d, B:12:0x0021, B:20:0x003c), top: B:27:0x0001, inners: #0 }] */
        public synchronized void m6071a(int i, int i2, int i3, Bitmap bitmap) {
            if (this.f4106a == null || this.f4106a.getWidth() != i || this.f4106a.getHeight() != i2) {
                try {
                    this.f4106a = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                } catch (OutOfMemoryError e) {
                    this.f4106a = null;
                }
                if (this.f4106a != null) {
                    this.f4106a.setDensity(i3);
                }
                if (this.f4106a != null) {
                    new Canvas(this.f4106a).drawBitmap(bitmap, 0.0f, 0.0f, this.f4107b);
                }
            } else if (this.f4106a != null) {
                new Canvas(this.f4106a).drawBitmap(bitmap, 0.0f, 0.0f, this.f4107b);
            }
            throw th;
        }
    }

    static class c {

        public final String f4113a;

        public final View f4114b;

        public a f4115c = null;

        public float f4116d = 1.0f;

        public c(String str, View view) {
            this.f4113a = str;
            this.f4114b = view;
        }
    }
}
