package com.baidu.mobstat;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ScrollView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public class as {

    private static final as f4154u = new as();

    private Context f4156a;

    private WeakReference<Activity> f4157b;

    private Handler f4158c;

    private long f4162g;

    private long f4163h;

    private long f4164i;

    private String f4165j;

    private String f4166k;

    private String f4167l;

    private String f4168m;

    private boolean f4169n;

    private String f4170o;

    private boolean f4171p;

    private boolean f4172q;

    private a f4176v;

    private ViewTreeObserver.OnScrollChangedListener f4177w;

    private boolean f4159d = true;

    private List<WeakReference<View>> f4160e = Collections.synchronizedList(new ArrayList());

    private volatile MtjConfig.FeedTrackStrategy f4161f = MtjConfig.FeedTrackStrategy.TRACK_ALL;

    private List<WeakReference<View>> f4173r = new ArrayList();

    private HashMap<WeakReference<View>, ArrayList<ao>> f4174s = new HashMap<>();

    private HashMap<WeakReference<View>, HashMap<String, ArrayList<ap>>> f4175t = new HashMap<>();

    private Runnable f4178x = null;

    private float f4179y = 0.0f;

    private float f4180z = 0.0f;

    private Object f4155A = new Object();

    public interface a {
        void m6200a(an c1423an);

        void m6201a(ArrayList<ao> arrayList);

        void m6202b(ArrayList<ap> arrayList);
    }

    public static as m6121a() {
        return f4154u;
    }

    private as() {
        HandlerThread handlerThread = new HandlerThread("feedViewCrawlerThread");
        handlerThread.start();
        this.f4158c = new Handler(handlerThread.getLooper());
    }

    public void m6190a(MtjConfig.FeedTrackStrategy feedTrackStrategy) {
        this.f4161f = feedTrackStrategy;
    }

    public boolean m6194b() {
        if (this.f4161f != MtjConfig.FeedTrackStrategy.TRACK_NONE) {
            return false;
        }
        return true;
    }

    private boolean m6150a(View view) {
        if (this.f4161f == MtjConfig.FeedTrackStrategy.TRACK_ALL) {
            return false;
        }
        return (this.f4161f == MtjConfig.FeedTrackStrategy.TRACK_SINGLE && bi.m6415t(view)) ? false : true;
    }

    public void m6187a(Activity activity) {
        if (activity != null) {
            final WeakReference weakReference = new WeakReference(activity);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f4158c.post(new Runnable() {
                @Override
                public void run() {
                    as.this.f4159d = true;
                    Activity activity2 = (Activity) weakReference.get();
                    if (activity2 != null) {
                        as.this.m6126a(activity2, jCurrentTimeMillis);
                    }
                }
            });
        }
    }

    public void m6126a(Activity activity, long j) {
        this.f4156a = activity.getApplicationContext();
        this.f4157b = new WeakReference<>(activity);
        this.f4162g = j;
        String strM6396e = bi.m6396e(activity);
        if (bi.m6371a(strM6396e, this.f4165j)) {
            this.f4171p = false;
            if (m6154a(strM6396e, this.f4166k, this.f4165j, this.f4164i, this.f4162g, activity)) {
                this.f4171p = true;
            }
        }
    }

    public void m6193b(Activity activity) {
        if (activity != null) {
            final WeakReference weakReference = new WeakReference(activity);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f4158c.post(new Runnable() {
                @Override
                public void run() {
                    as.this.f4159d = false;
                    Activity activity2 = (Activity) weakReference.get();
                    if (activity2 != null) {
                        as.this.m6160b(activity2, jCurrentTimeMillis);
                    }
                }
            });
        }
    }

    public void m6160b(Activity activity, long j) {
        this.f4163h = j;
        String strM6396e = bi.m6396e(activity);
        this.f4165j = strM6396e;
        if (!TextUtils.isEmpty(this.f4166k) && !this.f4166k.equals(strM6396e)) {
            this.f4164i = 0L;
        }
        if (this.f4171p) {
            m6127a(activity, this.f4162g, j, this.f4173r);
            this.f4173r.clear();
            this.f4172q = false;
        }
        m6146a(this.f4174s, this.f4175t, j);
        m6164b(this.f4174s);
        m6170c(this.f4174s);
        m6177e(this.f4175t);
        m6178f(this.f4175t);
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    as.this.m6148a((List<WeakReference<View>>) as.this.f4160e, as.this.m6171d());
                }
            });
        }
    }

    public void m6195c(Activity activity) {
        if (activity != null) {
            final WeakReference weakReference = new WeakReference(activity);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f4158c.post(new Runnable() {
                @Override
                public void run() {
                    Activity activity2 = (Activity) weakReference.get();
                    if (activity2 != null) {
                        as.this.m6168c(activity2, jCurrentTimeMillis);
                    }
                }
            });
        }
    }

    public void m6189a(final View view, Activity activity) {
        if (view != null && activity != null) {
            final WeakReference weakReference = new WeakReference(activity);
            final WeakReference weakReference2 = new WeakReference(view);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f4158c.post(new Runnable() {
                @Override
                public void run() {
                    Activity activity2 = (Activity) weakReference.get();
                    if (activity2 != null && ((View) weakReference2.get()) != null) {
                        as.this.m6131a(view, activity2, jCurrentTimeMillis);
                    }
                }
            });
        }
    }

    public void m6188a(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.f4158c.post(new Runnable() {
                @Override
                public void run() {
                    Activity activity;
                    if (as.this.f4157b != null && (activity = (Activity) as.this.f4157b.get()) != null) {
                        String strM6396e = bi.m6396e(activity);
                        if (!TextUtils.isEmpty(as.this.f4166k) && as.this.f4166k.equals(strM6396e)) {
                            as.this.m6167c();
                        }
                    }
                }
            });
        }
    }

    public void m6131a(View view, Activity activity, long j) {
        View viewM6355a = bi.m6355a(view, activity);
        View viewM6408m = bi.m6408m(viewM6355a);
        if (viewM6408m == null) {
            if (!this.f4171p) {
                m6167c();
                return;
            }
            return;
        }
        if (m6150a(viewM6408m)) {
            if (!this.f4171p) {
                m6167c();
                return;
            }
            return;
        }
        this.f4164i = j;
        this.f4166k = bi.m6396e(activity);
        this.f4167l = "";
        Map<String, String> mapM6413r = bi.m6413r(viewM6355a);
        if (mapM6413r != null && mapM6413r.size() > 0 && !TextUtils.isEmpty(mapM6413r.get(Config.FEED_LIST_ITEM_TITLE))) {
            this.f4167l = mapM6413r.get(Config.FEED_LIST_ITEM_TITLE);
        }
        this.f4168m = bi.m6385c(viewM6408m, this.f4166k);
        this.f4169n = bi.m6412q(viewM6408m);
        this.f4170o = m6185a(activity, viewM6355a, viewM6408m);
    }

    public String m6185a(Activity activity, View view, View view2) {
        String str = "";
        Map<String, String> mapM6413r = bi.m6413r(view);
        if (mapM6413r != null && mapM6413r.size() > 0 && !TextUtils.isEmpty(mapM6413r.get(Config.FEED_LIST_ITEM_TITLE))) {
            str = mapM6413r.get(Config.FEED_LIST_ITEM_TITLE);
        }
        String strM6414s = bi.m6414s(view);
        String strM6396e = bi.m6396e(activity);
        boolean zM6412q = bi.m6412q(view2);
        return ap.m6088a(strM6414s, strM6396e, bi.m6366a(activity, view), str, bi.m6360a(view, bi.m6376b(view2)), bi.m6385c(view2, bi.m6396e(activity)), zM6412q);
    }

    public void m6167c() {
        this.f4164i = 0L;
        this.f4166k = "";
        this.f4167l = "";
        this.f4168m = "";
        this.f4169n = false;
        this.f4170o = "";
    }

    public void m6191a(final String str) {
        this.f4158c.post(new Runnable() {
            @Override
            public void run() {
                ar.m6114a().m6115a(str);
            }
        });
    }

    public ViewTreeObserver.OnScrollChangedListener m6171d() {
        if (this.f4177w == null) {
            this.f4177w = new ViewTreeObserver.OnScrollChangedListener() {
                @Override
                public void onScrollChanged() {
                    as.this.m6192a(as.this.f4157b);
                }
            };
        }
        return this.f4177w;
    }

    public void m6192a(final WeakReference<Activity> weakReference) {
        if (weakReference != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    Activity activity = (Activity) weakReference.get();
                    if (activity != null) {
                        as.this.m6173d(activity, jCurrentTimeMillis);
                    }
                }
            };
            if (this.f4178x != null) {
                this.f4158c.removeCallbacks(this.f4178x);
            }
            this.f4178x = runnable;
            this.f4158c.postDelayed(runnable, 350L);
        }
    }

    public void m6148a(List<WeakReference<View>> list, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        WeakReference<View> weakReference;
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    weakReference = list.get(i);
                } catch (Exception e) {
                    weakReference = null;
                }
                if (weakReference != null) {
                    m6133a(weakReference.get(), onScrollChangedListener);
                }
            }
            list.clear();
        }
    }

    private void m6133a(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        ViewTreeObserver viewTreeObserver;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive() && onScrollChangedListener != null) {
            viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public void m6147a(List<WeakReference<View>> list) {
        if (list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < list.size()) {
                    WeakReference<View> weakReference = null;
                    try {
                        weakReference = list.get(i2);
                    } catch (Exception e) {
                    }
                    if (weakReference == null) {
                        arrayList.add(weakReference);
                    } else {
                        View view = weakReference.get();
                        if (view == null) {
                            arrayList.add(weakReference);
                        } else {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                                arrayList.add(weakReference);
                            }
                        }
                    }
                    i = i2 + 1;
                } else {
                    list.removeAll(arrayList);
                    return;
                }
            }
        }
    }

    public void m6134a(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, List<WeakReference<View>> list) {
        ViewTreeObserver viewTreeObserver;
        if (view != null && !m6155a(list, view) && !m6150a(view) && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive() && onScrollChangedListener != null && list != null) {
            try {
                viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
                list.add(new WeakReference<>(view));
            } catch (Exception e) {
            }
        }
    }

    private boolean m6155a(List<WeakReference<View>> list, View view) {
        WeakReference<View> weakReference;
        if (list == null || list.size() <= 0) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                weakReference = list.get(i);
            } catch (Exception e) {
                weakReference = null;
            }
            if (weakReference != null && view == weakReference.get()) {
                return true;
            }
        }
        return false;
    }

    private boolean m6154a(String str, String str2, String str3, long j, long j2, Activity activity) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || str.equals(str2) || !str2.equals(str3) || (activity instanceof IIgnoreAutoTrace)) {
            return false;
        }
        long j3 = j2 - j;
        if (j3 <= 0 || j3 >= Config.BPLUS_DELAY_TIME) {
            return false;
        }
        return true;
    }

    private boolean m6149a(long j, long j2) {
        long j3 = j2 - j;
        if (j3 <= 0 || j3 <= 50) {
            return false;
        }
        return true;
    }

    public void m6168c(final Activity activity, final long j) {
        HashMap<View, Integer> map = new HashMap<>();
        final ArrayList<View> arrayList = new ArrayList<>();
        final ArrayList<View> arrayList2 = new ArrayList<>();
        View viewM6354a = bi.m6354a(activity);
        m6128a(activity, viewM6354a, map, arrayList, arrayList2);
        if (this.f4171p && !this.f4172q && m6149a(this.f4162g, j)) {
            ArrayList<WeakReference<View>> arrayListM6123a = m6123a(map);
            arrayListM6123a.add(new WeakReference<>(viewM6354a));
            this.f4173r = arrayListM6123a;
            this.f4172q = true;
        }
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        as.this.m6134a((View) it.next(), as.this.m6171d(), (List<WeakReference<View>>) as.this.f4160e);
                    }
                    as.this.f4158c.post(new Runnable() {
                        @Override
                        public void run() {
                            as.this.m6147a((List<WeakReference<View>>) as.this.f4160e);
                            if (as.this.f4159d) {
                                as.this.m6142a((WeakReference<Activity>) as.this.f4157b, j);
                                as.this.f4159d = false;
                            }
                            as.this.m6143a((HashMap<WeakReference<View>, ArrayList<ao>>) as.this.f4174s, j);
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                as.this.m6161b((View) it2.next(), activity, j);
                            }
                        }
                    });
                }
            });
        }
    }

    private void m6128a(Activity activity, View view, HashMap<View, Integer> map, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int width;
        if (view != null && !bi.m6389c(activity, view)) {
            boolean zM6407l = bi.m6407l(view);
            if (zM6407l && !m6150a(view) && bi.m6394d(view)) {
                arrayList.add(view);
            }
            if (zM6407l) {
                arrayList2.add(view);
            }
            if ((zM6407l || (view instanceof WebView) || (view instanceof ScrollView)) && (width = view.getWidth() * view.getHeight()) != 0) {
                map.put(view, Integer.valueOf(width));
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < viewGroup.getChildCount()) {
                        m6128a(activity, viewGroup.getChildAt(i2), map, arrayList, arrayList2);
                        i = i2 + 1;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private ArrayList<WeakReference<View>> m6123a(HashMap<View, Integer> map) {
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<View, Integer>>() {
            @Override
            public int compare(Map.Entry<View, Integer> entry, Map.Entry<View, Integer> entry2) {
                return entry2.getValue().compareTo(entry.getValue());
            }
        });
        ArrayList<WeakReference<View>> arrayList2 = new ArrayList<>(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new WeakReference<>(((Map.Entry) it.next()).getKey()));
        }
        return arrayList2;
    }

    private void m6127a(Activity activity, long j, long j2, List<WeakReference<View>> list) {
        View view;
        View view2;
        if (list != null) {
            if (list.size() == 0) {
                list.add(new WeakReference<>(bi.m6354a(activity)));
            }
            Iterator<WeakReference<View>> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    view = null;
                    break;
                }
                WeakReference<View> next = it.next();
                if (next != null && (view2 = next.get()) != null) {
                    view = view2;
                    break;
                }
            }
            if (!TextUtils.isEmpty(this.f4167l)) {
                String str = this.f4168m;
                if (!TextUtils.isEmpty(str)) {
                    String strM6396e = bi.m6396e(activity);
                    String strM6397f = bi.m6397f(activity);
                    ArrayList<Integer> arrayListM6186a = m6186a(activity, view);
                    int iM5969a = ag.m5969a(this.f4156a, arrayListM6186a.get(0).intValue());
                    int iM5969a2 = ag.m5969a(this.f4156a, arrayListM6186a.get(1).intValue());
                    ArrayList<Integer> arrayListM6380b = bi.m6380b(activity, view);
                    int iM5969a3 = ag.m5969a(this.f4156a, arrayListM6380b.get(0).intValue());
                    int iM5969a4 = ag.m5969a(this.f4156a, arrayListM6380b.get(1).intValue());
                    int i = iM5969a3 > iM5969a ? iM5969a3 : iM5969a;
                    int i2 = iM5969a4 > iM5969a2 ? iM5969a4 : iM5969a2;
                    if (i != 0 && i2 != 0) {
                        m6130a(this.f4156a, new an(strM6396e, strM6397f, this.f4167l, j2 - j, j, iM5969a3, iM5969a4, i, i2, str, this.f4169n, this.f4170o));
                    }
                }
            }
        }
    }

    private void m6130a(Context context, an c1423an) {
        if (c1423an != null) {
            if (this.f4176v != null) {
                this.f4176v.m6200a(c1423an);
            }
            av.m6217a().m6249a(context, c1423an);
        }
    }

    public void m6161b(View view, Activity activity, long j) {
        if (view != null && bi.m6394d(view)) {
            m6144a(this.f4174s, view, new ao(bi.m6385c(view, bi.m6396e(activity)), j, j, j, bi.m6412q(view)));
        }
    }

    public void m6143a(HashMap<WeakReference<View>, ArrayList<ao>> map, long j) {
        if (map != null && map.size() != 0) {
            Iterator<Map.Entry<WeakReference<View>, ArrayList<ao>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                ArrayList<ao> value = it.next().getValue();
                if (value != null && value.size() != 0) {
                    for (ao c1424ao : value) {
                        if (c1424ao.m6087e() == c1424ao.m6085c()) {
                            c1424ao.m6082a(j);
                        }
                    }
                }
            }
        }
    }

    private LinkedHashMap<WeakReference<View>, ArrayList<ao>> m6124a(HashMap<WeakReference<View>, ArrayList<ao>> map, View view) {
        View view2;
        for (Map.Entry<WeakReference<View>, ArrayList<ao>> entry : map.entrySet()) {
            WeakReference<View> key = entry.getKey();
            if (key != null && (view2 = key.get()) != null && view2 == view) {
                ArrayList<ao> value = entry.getValue();
                LinkedHashMap<WeakReference<View>, ArrayList<ao>> linkedHashMap = new LinkedHashMap<>(1);
                linkedHashMap.put(key, value);
                return linkedHashMap;
            }
        }
        return null;
    }

    private void m6144a(HashMap<WeakReference<View>, ArrayList<ao>> map, View view, ao c1424ao) {
        ao next;
        String strM6080a = c1424ao.m6080a();
        long jM6085c = c1424ao.m6085c();
        long jM6087e = c1424ao.m6087e();
        boolean zM6086d = c1424ao.m6086d();
        if (!TextUtils.isEmpty(strM6080a)) {
            WeakReference<View> weakReference = null;
            ArrayList<ao> value = null;
            LinkedHashMap<WeakReference<View>, ArrayList<ao>> linkedHashMapM6124a = m6124a(map, view);
            if (linkedHashMapM6124a != null && linkedHashMapM6124a.size() > 0) {
                Iterator<Map.Entry<WeakReference<View>, ArrayList<ao>>> it = linkedHashMapM6124a.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry<WeakReference<View>, ArrayList<ao>> next2 = it.next();
                    weakReference = next2.getKey();
                    value = next2.getValue();
                }
            }
            if (value == null) {
                next = null;
                break;
            }
            Iterator<ao> it2 = value.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                String strM6080a2 = next.m6080a();
                long jM6085c2 = next.m6085c();
                long jM6087e2 = next.m6087e();
                boolean zM6086d2 = next.m6086d();
                if (strM6080a.equals(strM6080a2) && zM6086d == zM6086d2 && (jM6087e2 >= jM6085c2 || jM6085c2 == jM6085c)) {
                    break;
                }
            }
            if (next == null) {
                ArrayList<ao> arrayList = value == null ? new ArrayList<>() : value;
                arrayList.add(c1424ao);
                if (weakReference == null) {
                    weakReference = new WeakReference<>(view);
                }
                map.put(weakReference, arrayList);
                return;
            }
            next.m6082a(jM6085c);
            next.m6084b(jM6087e);
        }
    }

    private void m6164b(HashMap<WeakReference<View>, ArrayList<ao>> map) {
        m6175d(map);
    }

    private void m6170c(HashMap<WeakReference<View>, ArrayList<ao>> map) {
        Iterator<Map.Entry<WeakReference<View>, ArrayList<ao>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<ao> value = it.next().getValue();
            if (value != null) {
                value.clear();
            }
        }
        map.clear();
    }

    private void m6175d(HashMap<WeakReference<View>, ArrayList<ao>> map) {
        ArrayList<ao> arrayList = new ArrayList<>();
        Iterator<Map.Entry<WeakReference<View>, ArrayList<ao>>> it = this.f4174s.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<ao> value = it.next().getValue();
            if (value != null && value.size() != 0) {
                arrayList.addAll(value);
            }
        }
        Collections.sort(arrayList, new Comparator<ao>() {
            @Override
            public int compare(ao c1424ao, ao c1424ao2) {
                long jM6083b = c1424ao.m6083b() - c1424ao2.m6083b();
                if (jM6083b > 0) {
                    return 1;
                }
                if (jM6083b < 0) {
                    return -1;
                }
                return 0;
            }
        });
        if (this.f4176v != null) {
            this.f4176v.m6201a(arrayList);
        }
        av.m6217a().m6253a(this.f4156a, arrayList);
    }

    public void m6173d(Activity activity, long j) {
        WeakReference<View> weakReference;
        View view;
        m6165b(this.f4175t, j);
        if (this.f4160e != null && this.f4160e.size() > 0) {
            for (int i = 0; i < this.f4160e.size(); i++) {
                try {
                    weakReference = this.f4160e.get(i);
                } catch (Exception e) {
                    weakReference = null;
                }
                if (weakReference != null && (view = weakReference.get()) != null && bi.m6394d(view) && !m6150a(view) && (view instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt != null && bi.m6394d(childAt)) {
                            m6132a(view, childAt, activity, j);
                        }
                    }
                }
            }
        }
    }

    private void m6165b(HashMap<WeakReference<View>, HashMap<String, ArrayList<ap>>> map, long j) {
        if (map != null && map.size() != 0) {
            Iterator<Map.Entry<WeakReference<View>, HashMap<String, ArrayList<ap>>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                HashMap<String, ArrayList<ap>> value = it.next().getValue();
                if (value != null) {
                    Iterator<Map.Entry<String, ArrayList<ap>>> it2 = value.entrySet().iterator();
                    while (it2.hasNext()) {
                        ArrayList<ap> value2 = it2.next().getValue();
                        if (value2 != null && value2.size() != 0) {
                            for (ap c1425ap : value2) {
                                if (c1425ap.m6105k() == c1425ap.m6104j()) {
                                    c1425ap.m6092a(j);
                                    c1425ap.m6093a(String.valueOf(c1425ap.m6104j() - c1425ap.m6103i()));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a9 A[PHI: r3
      0x00a9: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x001d, B:10:0x0023, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    private void m6132a(View view, View view2, Activity activity, long j) {
        String str;
        if (view != null && view2 != null && bi.m6369a(view2, ar.m6114a().m6117c())) {
            String str2 = "";
            String str3 = "";
            Map<String, String> mapM6413r = bi.m6413r(view2);
            if (mapM6413r == null || mapM6413r.size() <= 0) {
                str = str2;
            } else {
                if (!TextUtils.isEmpty(mapM6413r.get(Config.FEED_LIST_ITEM_TITLE))) {
                    str2 = mapM6413r.get(Config.FEED_LIST_ITEM_TITLE);
                }
                if (TextUtils.isEmpty(mapM6413r.get("content"))) {
                    str = str2;
                } else {
                    str3 = mapM6413r.get("content");
                    str = str2;
                }
            }
            String strM6414s = bi.m6414s(view2);
            String strM6396e = bi.m6396e(activity);
            boolean zM6412q = bi.m6412q(view);
            ap c1425ap = new ap(strM6414s, strM6396e, bi.m6366a(activity, view2), str, str3, bi.m6360a(view2, bi.m6376b(view)), bi.m6385c(view, bi.m6396e(activity)), zM6412q, 1, j, j, j, String.valueOf(j - j), "", new JSONArray());
            av.m6217a().m6255a(str3);
            m6145a(this.f4175t, view, c1425ap);
        }
    }

    private LinkedHashMap<WeakReference<View>, HashMap<String, ArrayList<ap>>> m6159b(HashMap<WeakReference<View>, HashMap<String, ArrayList<ap>>> map, View view) {
        View view2;
        for (Map.Entry<WeakReference<View>, HashMap<String, ArrayList<ap>>> entry : map.entrySet()) {
            WeakReference<View> key = entry.getKey();
            if (key != null && (view2 = key.get()) != null && view2 == view) {
                LinkedHashMap<WeakReference<View>, HashMap<String, ArrayList<ap>>> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put(key, entry.getValue());
                return linkedHashMap;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
    private void m6145a(HashMap<WeakReference<View>, HashMap<String, ArrayList<ap>>> map, View view, ap c1425ap) {
        HashMap<String, ArrayList<ap>> value;
        ap c1425ap2;
        ap next;
        if (view != null) {
            long jM6105k = c1425ap.m6105k();
            long jM6104j = c1425ap.m6104j();
            String strM6098d = c1425ap.m6098d();
            String strM6100f = c1425ap.m6100f();
            if (!TextUtils.isEmpty(strM6098d) && !TextUtils.isEmpty(strM6100f)) {
                WeakReference<View> weakReference = null;
                LinkedHashMap<WeakReference<View>, HashMap<String, ArrayList<ap>>> linkedHashMapM6159b = m6159b(map, view);
                if (linkedHashMapM6159b == null || linkedHashMapM6159b.size() <= 0) {
                    value = null;
                } else {
                    Iterator<Map.Entry<WeakReference<View>, HashMap<String, ArrayList<ap>>>> it = linkedHashMapM6159b.entrySet().iterator();
                    if (!it.hasNext()) {
                        value = null;
                    } else {
                        Map.Entry<WeakReference<View>, HashMap<String, ArrayList<ap>>> next2 = it.next();
                        WeakReference<View> key = next2.getKey();
                        value = next2.getValue();
                        weakReference = key;
                    }
                }
                if (value == null) {
                    c1425ap2 = null;
                } else {
                    Iterator<Map.Entry<String, ArrayList<ap>>> it2 = value.entrySet().iterator();
                    c1425ap2 = null;
                    while (it2.hasNext()) {
                        ArrayList<ap> value2 = it2.next().getValue();
                        if (value2 != null && value2.size() != 0) {
                            Iterator<ap> it3 = value2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next = c1425ap2;
                                    break;
                                }
                                next = it3.next();
                                long jM6105k2 = next.m6105k();
                                long jM6104j2 = next.m6104j();
                                if (m6151a(next, c1425ap) && (jM6105k2 >= jM6104j2 || jM6104j2 == c1425ap.m6104j())) {
                                    break;
                                }
                            }
                            c1425ap2 = next;
                        }
                    }
                }
                if (c1425ap2 == null) {
                    String strM6122a = m6122a(c1425ap);
                    if (!TextUtils.isEmpty(strM6122a)) {
                        if (value == null) {
                            HashMap<String, ArrayList<ap>> map2 = new HashMap<>();
                            ArrayList<ap> arrayList = new ArrayList<>();
                            arrayList.add(c1425ap);
                            map2.put(strM6122a, arrayList);
                            map.put(weakReference == null ? new WeakReference<>(view) : weakReference, map2);
                            return;
                        }
                        ArrayList<ap> arrayList2 = value.get(strM6122a);
                        if (arrayList2 == null) {
                            ArrayList<ap> arrayList3 = new ArrayList<>();
                            arrayList3.add(c1425ap);
                            value.put(strM6122a, arrayList3);
                            return;
                        }
                        arrayList2.add(c1425ap);
                        return;
                    }
                    return;
                }
                c1425ap2.m6092a(jM6104j);
                c1425ap2.m6095b(jM6105k);
                c1425ap2.m6093a(String.valueOf(c1425ap2.m6104j() - c1425ap2.m6103i()));
            }
        }
    }

    private boolean m6151a(ap c1425ap, ap c1425ap2) {
        String strM6089a = c1425ap2.m6089a();
        String strM6094b = c1425ap2.m6094b();
        JSONArray jSONArrayM6097c = c1425ap2.m6097c();
        String strM6098d = c1425ap2.m6098d();
        String strM6099e = c1425ap2.m6099e();
        String strM6100f = c1425ap2.m6100f();
        boolean zM6101g = c1425ap2.m6101g();
        String strM6089a2 = c1425ap.m6089a();
        String strM6094b2 = c1425ap.m6094b();
        JSONArray jSONArrayM6097c2 = c1425ap.m6097c();
        String strM6098d2 = c1425ap.m6098d();
        String strM6099e2 = c1425ap.m6099e();
        String strM6100f2 = c1425ap.m6100f();
        boolean zM6101g2 = c1425ap.m6101g();
        if (!m6153a(strM6089a2, strM6089a) || !m6153a(strM6094b2, strM6094b) || !m6156a(jSONArrayM6097c2, jSONArrayM6097c) || !m6153a(strM6098d2, strM6098d) || !m6153a(strM6099e2, strM6099e) || !m6153a(strM6100f2, strM6100f) || zM6101g2 != zM6101g) {
            return false;
        }
        return true;
    }

    private boolean m6153a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) ? false : true;
    }

    private boolean m6156a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return m6153a(jSONArray.toString(), jSONArray2.toString());
    }

    private void m6177e(HashMap<WeakReference<View>, HashMap<String, ArrayList<ap>>> map) {
        m6181g(map);
    }

    private void m6178f(HashMap<WeakReference<View>, HashMap<String, ArrayList<ap>>> map) {
        Iterator<Map.Entry<WeakReference<View>, HashMap<String, ArrayList<ap>>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            HashMap<String, ArrayList<ap>> value = it.next().getValue();
            if (value != null) {
                Iterator<Map.Entry<String, ArrayList<ap>>> it2 = value.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().clear();
                }
                value.clear();
            }
        }
        map.clear();
    }

    private String m6122a(ap c1425ap) {
        return ap.m6088a(c1425ap.m6089a(), c1425ap.m6094b(), c1425ap.m6097c(), c1425ap.m6098d(), c1425ap.m6099e(), c1425ap.m6100f(), c1425ap.m6101g());
    }

    private void m6181g(HashMap<WeakReference<View>, HashMap<String, ArrayList<ap>>> map) {
        ArrayList<ap> arrayList = new ArrayList<>();
        Iterator<Map.Entry<WeakReference<View>, HashMap<String, ArrayList<ap>>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(m6183h(it.next().getValue()));
        }
        Collections.sort(arrayList, new Comparator<ap>() {
            @Override
            public int compare(ap c1425ap, ap c1425ap2) {
                long jM6103i = c1425ap.m6103i() - c1425ap2.m6103i();
                if (jM6103i > 0) {
                    return 1;
                }
                if (jM6103i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        if (this.f4176v != null) {
            this.f4176v.m6202b(arrayList);
        }
        av.m6217a().m6259b(this.f4156a, arrayList);
    }

    private ArrayList<ap> m6183h(HashMap<String, ArrayList<ap>> map) {
        ArrayList<ap> arrayList = new ArrayList<>();
        Iterator<Map.Entry<String, ArrayList<ap>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            ap c1425apM6120a = m6120a(it.next().getValue());
            if (c1425apM6120a != null) {
                arrayList.add(c1425apM6120a);
            }
        }
        return arrayList;
    }

    private ap m6120a(ArrayList<ap> arrayList) {
        long j;
        ap c1425ap;
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        Collections.sort(arrayList, new Comparator<ap>() {
            @Override
            public int compare(ap c1425ap2, ap c1425ap3) {
                long jM6103i = c1425ap2.m6103i() - c1425ap3.m6103i();
                if (jM6103i > 0) {
                    return 1;
                }
                if (jM6103i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        long j2 = 0;
        ap c1425ap2 = null;
        int iM6102h = 0;
        for (ap c1425ap3 : arrayList) {
            long jM6103i = c1425ap3.m6103i();
            String strM6106l = c1425ap3.m6106l();
            try {
                if (Long.valueOf(strM6106l).longValue() >= ar.m6114a().m6118d()) {
                    if (j2 == 0) {
                        j = jM6103i;
                        c1425ap = c1425ap3;
                    } else {
                        j = j2;
                        c1425ap = c1425ap2;
                    }
                    long j3 = jM6103i - j;
                    if (j3 < 0) {
                        j3 = 0;
                    }
                    if (TextUtils.isEmpty(sb2.toString())) {
                        sb2.append(strM6106l);
                    } else {
                        sb2.append("|" + strM6106l);
                    }
                    if (TextUtils.isEmpty(sb.toString())) {
                        sb.append("" + j3);
                    } else {
                        sb.append("|" + j3);
                    }
                    j2 = j;
                    c1425ap2 = c1425ap;
                    iM6102h = c1425ap3.m6102h() + iM6102h;
                }
            } catch (Exception e) {
            }
        }
        if (c1425ap2 != null) {
            c1425ap2.m6093a(sb2.toString());
            c1425ap2.m6096b(sb.toString());
            c1425ap2.m6091a(iM6102h);
            return c1425ap2;
        }
        return c1425ap2;
    }

    public void m6142a(WeakReference<Activity> weakReference, long j) {
        Activity activity;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            m6173d(activity, j);
        }
    }

    private void m6146a(HashMap<WeakReference<View>, ArrayList<ao>> map, HashMap<WeakReference<View>, HashMap<String, ArrayList<ap>>> map2, long j) {
        Iterator<Map.Entry<WeakReference<View>, ArrayList<ao>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<ao> value = it.next().getValue();
            if (value != null && value.size() != 0) {
                for (ao c1424ao : value) {
                    if (c1424ao.m6087e() == c1424ao.m6085c()) {
                        c1424ao.m6082a(j);
                    }
                }
            }
        }
        Iterator<Map.Entry<WeakReference<View>, HashMap<String, ArrayList<ap>>>> it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            HashMap<String, ArrayList<ap>> value2 = it2.next().getValue();
            if (value2 != null && value2.size() != 0) {
                Iterator<Map.Entry<String, ArrayList<ap>>> it3 = value2.entrySet().iterator();
                while (it3.hasNext()) {
                    ArrayList<ap> value3 = it3.next().getValue();
                    if (value3 != null && value3.size() != 0) {
                        for (ap c1425ap : value3) {
                            if (c1425ap.m6105k() == c1425ap.m6104j()) {
                                c1425ap.m6092a(j);
                                c1425ap.m6093a(String.valueOf(c1425ap.m6104j() - c1425ap.m6103i()));
                            }
                        }
                    }
                }
            }
        }
    }

    private void m6129a(Activity activity, final WebView webView) {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                synchronized (as.this.f4155A) {
                    as.this.f4179y = webView.getContentHeight();
                    as.this.f4180z = webView.getScale();
                    as.this.f4155A.notifyAll();
                }
            }
        });
    }

    public ArrayList<Integer> m6186a(Activity activity, View view) {
        int iComputeHorizontalScrollRange;
        int iComputeVerticalScrollRange;
        int width;
        int height;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (view == null || activity == null) {
            arrayList.add(0);
            arrayList.add(0);
            return arrayList;
        }
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        if (view instanceof WebView) {
            synchronized (this.f4155A) {
                m6129a(activity, (WebView) view);
                try {
                    this.f4155A.wait(Config.BPLUS_DELAY_TIME);
                } catch (Exception e) {
                }
                iComputeVerticalScrollRange = (int) (this.f4179y * this.f4180z);
            }
            width = 0;
        } else if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            if (scrollView.getChildCount() > 0) {
                width = scrollView.getChildAt(0).getWidth();
                height = scrollView.getChildAt(0).getHeight();
            } else {
                height = 0;
                width = 0;
            }
            iComputeVerticalScrollRange = height;
        } else if (view instanceof ListView) {
            iComputeVerticalScrollRange = bi.m6353a((ListView) view);
            width = 0;
        } else if (view instanceof GridView) {
            iComputeVerticalScrollRange = bi.m6352a((GridView) view);
            width = 0;
        } else if (bi.m6411p(view)) {
            try {
                RecyclerView recyclerView = (RecyclerView) view;
                iComputeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
                try {
                    iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
                    width = iComputeHorizontalScrollRange;
                } catch (Exception e2) {
                    iComputeVerticalScrollRange = 0;
                    width = iComputeHorizontalScrollRange;
                }
            } catch (Exception e3) {
                iComputeHorizontalScrollRange = 0;
            }
        } else {
            iComputeVerticalScrollRange = 0;
            width = 0;
        }
        if (width == 0) {
            width = width2;
        }
        int i = iComputeVerticalScrollRange == 0 ? height2 : iComputeVerticalScrollRange;
        if (width <= 0) {
            width = 0;
        }
        int i2 = i > 0 ? i : 0;
        arrayList.add(Integer.valueOf(width));
        arrayList.add(Integer.valueOf(i2));
        return arrayList;
    }
}
