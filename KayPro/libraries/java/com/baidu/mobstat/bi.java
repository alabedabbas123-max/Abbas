package com.baidu.mobstat;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import com.almlkaide.kaypro.aide.project.jsonbean.Project;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class bi {
    public static View m6354a(Activity activity) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return window.getDecorView();
    }

    public static View m6374b(Activity activity) {
        View viewM6354a = m6354a(activity);
        if (viewM6354a == null) {
            return null;
        }
        return viewM6354a.getRootView();
    }

    public static int m6383c(Activity activity) {
        if (activity == null) {
            return 0;
        }
        WindowManager windowManager = activity.getWindowManager();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int m6391d(Activity activity) {
        if (activity == null) {
            return 0;
        }
        WindowManager windowManager = activity.getWindowManager();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    @SuppressLint({"NewApi"})
    public static String m6358a(View view) {
        String str;
        CharSequence textOff;
        CharSequence text;
        if (view == null) {
            return "";
        }
        if (view instanceof TextView) {
            if ((view instanceof EditText) || (text = ((TextView) view).getText()) == null) {
                str = "";
            } else {
                str = text.toString();
            }
            if (android.os.Build.VERSION.SDK_INT >= 14 && (view instanceof Switch)) {
                Switch r4 = (Switch) view;
                if (r4.isChecked()) {
                    textOff = r4.getTextOn();
                } else {
                    textOff = r4.getTextOff();
                }
                if (textOff != null) {
                    str = textOff.toString();
                }
            }
        } else if (!(view instanceof Spinner)) {
            str = "";
        } else {
            Object selectedItem = ((Spinner) view).getSelectedItem();
            if (selectedItem != null && (selectedItem instanceof String)) {
                str = (String) selectedItem;
            } else {
                return m6358a(((Spinner) view).getSelectedView());
            }
        }
        byte[] bytes = str.getBytes();
        if (bytes.length > 4096) {
            if (android.os.Build.VERSION.SDK_INT >= 9) {
                str = new String(Arrays.copyOf(bytes, 4096));
            } else {
                str = "";
            }
        }
        return str;
    }

    public static String m6376b(View view) {
        String simpleName = "";
        if (view instanceof ListView) {
            simpleName = ListView.class.getSimpleName();
        } else if (view instanceof WebView) {
            simpleName = WebView.class.getSimpleName();
        }
        if (TextUtils.isEmpty(simpleName)) {
            String strM6362a = m6362a(view.getClass());
            if (!"android.widget".equals(strM6362a) && !"android.view".equals(strM6362a)) {
                Class<?> cls = null;
                try {
                    cls = Class.forName("android.support.v7.widget.RecyclerView");
                } catch (Exception e) {
                }
                if (cls != null && cls.isAssignableFrom(view.getClass())) {
                    simpleName = "RecyclerView";
                }
            }
        }
        if (TextUtils.isEmpty(simpleName)) {
            simpleName = m6386c(view.getClass());
        }
        if (TextUtils.isEmpty(simpleName)) {
            return "Object";
        }
        return simpleName;
    }

    private static String m6386c(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        String strM6362a = m6362a(cls);
        if ("android.widget".equals(strM6362a) || "android.view".equals(strM6362a)) {
            return m6392d(cls);
        }
        return m6386c(cls.getSuperclass());
    }

    public static String m6362a(Class<?> cls) {
        String name = "";
        if (cls == null) {
            return "";
        }
        Package r1 = cls.getPackage();
        if (r1 != null) {
            name = r1.getName();
        }
        if (name == null) {
            return "";
        }
        return name;
    }

    public static String m6359a(View view, View view2) {
        int i;
        int i2 = 0;
        if (view == null) {
            return String.valueOf(0);
        }
        if (view == view2) {
            return String.valueOf(0);
        }
        ViewParent parent = view.getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            return String.valueOf(0);
        }
        Class<?> cls = view.getClass();
        if (cls == null) {
            return String.valueOf(0);
        }
        String strM6377b = m6377b(cls);
        if (TextUtils.isEmpty(strM6377b)) {
            return String.valueOf(0);
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int i3 = 0;
        while (true) {
            i = i2;
            if (i3 >= viewGroup.getChildCount()) {
                break;
            }
            View childAt = viewGroup.getChildAt(i3);
            if (childAt != null) {
                if (childAt == view) {
                    break;
                }
                if (childAt.getClass() != null && strM6377b.equals(m6377b(childAt.getClass()))) {
                    i++;
                }
            }
            i2 = i;
            i3++;
        }
        return String.valueOf(i);
    }

    public static String m6360a(View view, String str) {
        RecyclerView parent;
        String strValueOf;
        if (TextUtils.isEmpty(str) || view == null || (parent = view.getParent()) == null || !(parent instanceof View)) {
            return "";
        }
        RecyclerView recyclerView = (View) parent;
        if (ListView.class.getSimpleName().equals(str)) {
            try {
                if (!(recyclerView instanceof ListView) || view.getParent() == null) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(((ListView) recyclerView).getPositionForView(view));
                }
                return strValueOf;
            } catch (Throwable th) {
                return "";
            }
        }
        if (GridView.class.getSimpleName().equals(str)) {
            try {
                if (!(recyclerView instanceof GridView) || view.getParent() == null) {
                    return "";
                }
                return String.valueOf(((GridView) recyclerView).getPositionForView(view));
            } catch (Throwable th2) {
                return "";
            }
        }
        if (!"RecyclerView".equals(str)) {
            return "";
        }
        try {
            return String.valueOf(recyclerView.getChildLayoutPosition(view));
        } catch (Throwable th3) {
            return "";
        }
    }

    public static String m6384c(View view) {
        ViewPager parent;
        String strValueOf;
        if (view == null || (parent = view.getParent()) == null || !(parent instanceof ViewGroup)) {
            return "";
        }
        String strM6362a = m6362a(parent.getClass());
        if ("android.widget".equals(strM6362a) || "android.view".equals(strM6362a)) {
            return "";
        }
        ViewPager viewPager = (ViewGroup) parent;
        Class<?> cls = null;
        try {
            cls = Class.forName("android.support.v4.view.ViewPager");
        } catch (ClassNotFoundException e) {
        }
        if (cls == null || !cls.isAssignableFrom(viewPager.getClass())) {
            return "";
        }
        try {
            ViewPager viewPager2 = viewPager;
            ArrayList arrayList = new ArrayList();
            int childCount = viewPager2.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewPager2.getChildAt(i2);
                arrayList.add(childAt);
                if (m6395e(childAt) != null) {
                    i++;
                }
            }
            if (arrayList.size() >= 2 && i >= 2) {
                try {
                    Collections.sort(arrayList, new Comparator<View>() {
                        @Override
                        public int compare(View view2, View view3) {
                            return view2.getLeft() - view3.getLeft();
                        }
                    });
                } catch (Exception e2) {
                }
                int left = view.getLeft() / Math.abs(((View) arrayList.get(1)).getLeft() - ((View) arrayList.get(0)).getLeft());
                int count = viewPager2.getAdapter().getCount();
                strValueOf = String.valueOf(count != 0 ? left % count : left);
            } else {
                strValueOf = String.valueOf(viewPager2.getCurrentItem());
            }
        } catch (Throwable th) {
            strValueOf = "";
        }
        return strValueOf;
    }

    public static String m6357a(Bitmap bitmap) throws Throwable {
        byte[] bArrM6390c = m6390c(bitmap);
        if (bArrM6390c != null) {
            try {
                return bo.m6465b(bArrM6390c);
            } catch (Exception e) {
            }
        }
        return "";
    }

    public static String m6375b(Bitmap bitmap) throws Throwable {
        byte[] bArrM6390c = m6390c(bitmap);
        return bArrM6390c != null ? bs.a.m6519a(bArrM6390c) : "";
    }

    private static byte[] m6390c(Bitmap bitmap) throws Throwable {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        byte[] byteArray = null;
        if (bitmap != null) {
            try {
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                    byteArray = byteArrayOutputStream2.toByteArray();
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception e2) {
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception e3) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream == null) {
                        throw th;
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (Exception e4) {
                        throw th;
                    }
                }
            } catch (Exception e5) {
                byteArrayOutputStream2 = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        }
        return byteArray;
    }

    public static boolean m6394d(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        return m6370a(view, new Rect());
    }

    public static Rect m6395e(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        Rect rect = new Rect();
        if (!m6370a(view, rect) || rect.right <= rect.left || rect.bottom <= rect.top) {
            return null;
        }
        return rect;
    }

    private static boolean m6370a(View view, Rect rect) {
        if (view == null || rect == null) {
            return false;
        }
        try {
            return view.getGlobalVisibleRect(rect);
        } catch (Exception e) {
            return false;
        }
    }

    public static String m6398f(View view) {
        int iLastIndexOf;
        int length;
        String strSubstring = null;
        try {
            if (view.getId() != 0) {
                strSubstring = view.getResources().getResourceName(view.getId());
            }
        } catch (Exception e) {
        }
        if (!TextUtils.isEmpty(strSubstring) && strSubstring.contains(":id/") && (iLastIndexOf = strSubstring.lastIndexOf(":id/")) != -1 && (length = ":id/".length() + iLastIndexOf) < strSubstring.length()) {
            strSubstring = strSubstring.substring(length);
        }
        if (strSubstring == null) {
            return "";
        }
        return strSubstring;
    }

    public static JSONArray m6366a(Activity activity, View view) {
        View viewM6354a;
        JSONArray jSONArray;
        String strM6376b;
        JSONArray jSONArray2 = new JSONArray();
        if (activity != null && view != null) {
            try {
                viewM6354a = m6354a(activity);
            } catch (Exception e) {
                viewM6354a = null;
            }
            if (viewM6354a != null) {
                while (view != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("p", m6406k(view));
                        String strM6384c = m6384c(view);
                        if (TextUtils.isEmpty(strM6384c)) {
                            Object parent = view.getParent();
                            if (parent == null || !(parent instanceof View)) {
                                strM6376b = "";
                            } else {
                                strM6376b = m6376b((View) parent);
                            }
                            strM6384c = m6360a(view, strM6376b);
                            if (TextUtils.isEmpty(strM6384c)) {
                                strM6384c = m6359a(view, viewM6354a);
                            }
                        }
                        jSONObject.put("i", strM6384c);
                        jSONObject.put("t", m6376b(view));
                        jSONArray2.put(jSONObject);
                        Object parent2 = view.getParent();
                        if (parent2 == null || view == viewM6354a || !(parent2 instanceof View) || m6417v(view) || jSONArray2.length() > 1000) {
                            break;
                        }
                        view = (View) parent2;
                    } catch (Exception e2) {
                        jSONArray = new JSONArray();
                    }
                }
                jSONArray = jSONArray2;
                jSONArray2 = new JSONArray();
                try {
                    for (int length = jSONArray.length() - 1; length >= 0; length--) {
                        jSONArray2.put(jSONArray.get(length));
                    }
                } catch (Exception e3) {
                }
            }
        }
        return jSONArray2;
    }

    public static Map<String, String> m6400g(View view) {
        Map<String, String> map;
        Object tag = view.getTag(-96000);
        if (tag == null || !(tag instanceof Map)) {
            return null;
        }
        try {
            map = (Map) tag;
        } catch (Exception e) {
            map = null;
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        return map;
    }

    public static boolean m6382b(View view, String str) {
        return "ListView".equals(str) || "RecyclerView".equals(str) || "GridView".equals(str) || view.isClickable();
    }

    public static String m6402h(View view) {
        String string = null;
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text != null) {
                string = text.toString();
            }
        } else if (view instanceof ViewGroup) {
            StringBuilder sb = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount && sb.length() < 128; i++) {
                String strM6402h = m6402h(viewGroup.getChildAt(i));
                if (strM6402h != null && strM6402h.length() > 0) {
                    if (z) {
                        sb.append(", ");
                    }
                    sb.append(strM6402h);
                    z = true;
                }
            }
            if (sb.length() > 128) {
                string = sb.substring(0, 128);
            } else if (z) {
                string = sb.toString();
            }
        }
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return string;
    }

    @SuppressLint({"NewApi"})
    public static int m6403i(View view) {
        Drawable background;
        float alpha = view.getAlpha();
        int alpha2 = 0;
        if (android.os.Build.VERSION.SDK_INT >= 14 && (background = view.getBackground()) != null) {
            alpha2 = background.getAlpha();
        }
        return (int) (alpha2 * alpha);
    }

    @SuppressLint({"NewApi"})
    public static float m6405j(View view) {
        if (android.os.Build.VERSION.SDK_INT < 21) {
            return 0.0f;
        }
        return view.getZ();
    }

    public static String m6365a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                sb.append("/" + jSONObject.getString("p") + "[" + jSONObject.getString("i") + "]");
            } catch (Exception e) {
                return "";
            }
        }
        return sb.toString();
    }

    public static String m6379b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                sb.append("/" + jSONObject.getString("p") + "[" + jSONObject.getString("i") + "]");
                String strOptString = jSONObject.optString("d");
                if (!TextUtils.isEmpty(strOptString)) {
                    sb.append("#" + strOptString);
                }
            } catch (Exception e) {
                return "";
            }
        }
        return sb.toString();
    }

    public static String m6387c(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                sb.append("/" + m6378b(jSONObject.getString("p")) + "[" + jSONObject.getString("i") + "]");
            } catch (Exception e) {
                return "";
            }
        }
        return sb.toString();
    }

    public static String m6393d(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                sb.append("/" + m6378b(jSONObject.getString("p")) + "[" + jSONObject.getString("i") + "]");
                String strOptString = jSONObject.optString("d");
                if (!TextUtils.isEmpty(strOptString)) {
                    sb.append("#" + strOptString);
                }
            } catch (Exception e) {
                return "";
            }
        }
        return sb.toString();
    }

    public static String m6361a(View view, boolean z) {
        String string = null;
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text != null) {
                string = text.toString();
            }
        } else if (view instanceof ViewGroup) {
            StringBuilder sb = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            boolean z2 = false;
            for (int i = 0; i < childCount && sb.length() < 128; i++) {
                String strM6361a = m6361a(viewGroup.getChildAt(i), false);
                if (strM6361a != null && strM6361a.length() > 0) {
                    if (z2) {
                        sb.append("| ");
                    }
                    sb.append(strM6361a);
                    z2 = true;
                }
            }
            if (sb.length() > 4096) {
                string = sb.substring(0, 4096);
            } else if (z2) {
                string = sb.toString();
            }
        }
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return string;
    }

    private static String m6378b(String str) {
        String strM6272a = ax.m6268a().m6272a(str);
        if (TextUtils.isEmpty(strM6272a)) {
            strM6272a = at.m6203a().m6205a(str, at.a.f4223a);
        }
        if (strM6272a == null) {
            return "";
        }
        return strM6272a;
    }

    public static String m6364a(String str) {
        String strM6205a = at.m6203a().m6205a(str, at.a.f4224b);
        if (strM6205a == null) {
            return "";
        }
        return strM6205a;
    }

    public static String m6396e(Activity activity) {
        if (activity == null || activity.getClass() == null) {
            return "";
        }
        String name = activity.getClass().getName();
        if (TextUtils.isEmpty(name)) {
            return "";
        }
        return name;
    }

    public static String m6377b(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        String strM6363a = m6363a(cls, false);
        if (!TextUtils.isEmpty(strM6363a) && cls.isAnonymousClass()) {
            strM6363a = strM6363a + "$";
        }
        if (strM6363a == null) {
            return "";
        }
        return strM6363a;
    }

    public static String m6406k(View view) {
        Class<?> cls;
        if (view == null || (cls = view.getClass()) == null) {
            return "";
        }
        String strM6392d = m6392d(cls);
        if (!TextUtils.isEmpty(strM6392d) && cls.isAnonymousClass()) {
            strM6392d = strM6392d + "$";
        }
        if (strM6392d == null) {
            return "";
        }
        return strM6392d;
    }

    private static String m6363a(Class<?> cls, boolean z) {
        if (!cls.isAnonymousClass()) {
            return z ? cls.getSimpleName() : cls.getName();
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            return z ? superclass.getSimpleName() : superclass.getName();
        }
        return "";
    }

    private static String m6392d(Class<?> cls) {
        return m6363a(cls, true);
    }

    public static boolean m6407l(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof ListView) || (view instanceof GridView)) {
            return true;
        }
        String strM6362a = m6362a(view.getClass());
        if (!"android.widget".equals(strM6362a) && !"android.view".equals(strM6362a)) {
            Class<?> cls = null;
            try {
                cls = Class.forName("android.support.v7.widget.RecyclerView");
            } catch (Exception e) {
            }
            if (cls != null && cls.isAssignableFrom(view.getClass())) {
                return true;
            }
        }
        return false;
    }

    public static boolean m6371a(String str, String str2) {
        if (TextUtils.isEmpty(str) || str.equals(str2)) {
            return false;
        }
        return true;
    }

    public static View m6408m(View view) {
        if (view == null) {
            return null;
        }
        Object parent = view.getParent();
        if (!(parent instanceof View)) {
            return null;
        }
        View view2 = (View) parent;
        if (view2 == null || !m6407l(view2)) {
            view2 = null;
        }
        return view2;
    }

    public static View m6355a(View view, Activity activity) {
        View viewM6354a;
        View view2;
        if (view == null || activity == null) {
            return null;
        }
        try {
            viewM6354a = m6354a(activity);
        } catch (Exception e) {
            viewM6354a = null;
        }
        if (viewM6354a == null) {
            return null;
        }
        View view3 = view;
        while (view3 != null && view3 != viewM6354a && view3.getParent() != null && (view3.getParent() instanceof View)) {
            View view4 = (View) view3.getParent();
            if (m6407l(view4)) {
                view2 = view3;
                return view2;
            }
            view3 = view4;
        }
        view2 = null;
        return view2;
    }

    public static String m6397f(Activity activity) {
        CharSequence title;
        String string = "";
        if (activity != null && (title = activity.getTitle()) != null) {
            string = title.toString();
        }
        if (TextUtils.isEmpty(string)) {
            string = "";
        }
        if (string.length() > 256) {
            return string.substring(0, 256);
        }
        return string;
    }

    public static int m6409n(View view) {
        if (view == null) {
            return 0;
        }
        return view.getWidth();
    }

    public static int m6410o(View view) {
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    public static boolean m6411p(View view) {
        if (view == null) {
            return false;
        }
        String strM6362a = m6362a(view.getClass());
        if ("android.widget".equals(strM6362a) || "android.view".equals(strM6362a)) {
            return false;
        }
        Class<?> cls = null;
        try {
            cls = Class.forName("android.support.v7.widget.RecyclerView");
        } catch (Exception e) {
        }
        if (cls == null || !cls.isAssignableFrom(view.getClass())) {
            return false;
        }
        return true;
    }

    public static int m6353a(ListView listView) {
        int height = listView.getHeight();
        if (listView.getChildCount() > 0) {
            int height2 = listView.getChildAt(0).getHeight();
            int count = 1;
            ListAdapter adapter = listView.getAdapter();
            if (adapter != null) {
                count = adapter.getCount();
            }
            int i = count * height2;
            if (i < height) {
                i = height;
            }
            return i;
        }
        return height;
    }

    @TargetApi(11)
    public static int m6352a(GridView gridView) {
        int height = gridView.getHeight();
        if (gridView.getChildCount() > 0) {
            int height2 = gridView.getChildAt(0).getHeight();
            int iCeil = 1;
            if (android.os.Build.VERSION.SDK_INT >= 11) {
                ListAdapter adapter = gridView.getAdapter();
                int numColumns = gridView.getNumColumns();
                if (adapter != null && numColumns != 0) {
                    iCeil = (int) Math.ceil(((double) adapter.getCount()) / ((double) numColumns));
                }
            }
            int i = iCeil * height2;
            if (i < height) {
                i = height;
            }
            return i;
        }
        return height;
    }

    public static ArrayList<Integer> m6380b(Activity activity, View view) {
        int iComputeHorizontalScrollOffset;
        int iComputeVerticalScrollOffset;
        int i;
        int scrollY;
        int scrollX;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (view == null) {
            arrayList.add(0);
            arrayList.add(0);
            return arrayList;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (view instanceof WebView) {
            int scrollX2 = view.getScrollX();
            iComputeVerticalScrollOffset = view.getScrollY();
            i = scrollX2;
        } else if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            if (scrollView.getChildCount() > 0) {
                scrollX = scrollView.getScrollX();
                scrollY = scrollView.getScrollY();
            } else {
                scrollY = 0;
                scrollX = 0;
            }
            iComputeVerticalScrollOffset = scrollY;
            i = scrollX;
        } else if (view instanceof ListView) {
            iComputeVerticalScrollOffset = m6373b((ListView) view);
            i = 0;
        } else if (view instanceof GridView) {
            iComputeVerticalScrollOffset = m6372b((GridView) view);
            i = 0;
        } else if (m6411p(view)) {
            try {
                RecyclerView recyclerView = (RecyclerView) view;
                iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                try {
                    iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    i = iComputeHorizontalScrollOffset;
                } catch (Exception e) {
                    iComputeVerticalScrollOffset = 0;
                    i = iComputeHorizontalScrollOffset;
                }
            } catch (Exception e2) {
                iComputeHorizontalScrollOffset = 0;
            }
        } else {
            iComputeVerticalScrollOffset = 0;
            i = 0;
        }
        int i2 = width + i;
        int i3 = height + iComputeVerticalScrollOffset;
        if (i2 <= 0) {
            i2 = 0;
        }
        int i4 = i3 > 0 ? i3 : 0;
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i4));
        return arrayList;
    }

    public static int m6373b(ListView listView) {
        if (listView == null || listView.getChildCount() <= 0) {
            return 0;
        }
        View childAt = listView.getChildAt(0);
        return (childAt.getHeight() * listView.getFirstVisiblePosition()) + (-childAt.getTop());
    }

    @TargetApi(11)
    public static int m6372b(GridView gridView) {
        int numColumns;
        if (gridView == null || gridView.getChildCount() <= 0) {
            return 0;
        }
        View childAt = gridView.getChildAt(0);
        int firstVisiblePosition = 1;
        if (android.os.Build.VERSION.SDK_INT >= 11 && (numColumns = gridView.getNumColumns()) != 0) {
            firstVisiblePosition = gridView.getFirstVisiblePosition() / numColumns;
        }
        return (firstVisiblePosition * childAt.getHeight()) + (-childAt.getTop());
    }

    public static String m6385c(View view, String str) {
        String str2;
        Object tag;
        if (view == null || (tag = view.getTag(-97001)) == null || !(tag instanceof String)) {
            str2 = "";
        } else {
            str2 = (String) tag;
        }
        return (str == null || !TextUtils.isEmpty(str2)) ? str2 : str;
    }

    public static boolean m6412q(View view) {
        Object tag;
        if (view == null || (tag = view.getTag(-97001)) == null || !(tag instanceof String)) {
            return false;
        }
        return true;
    }

    public static Map<String, String> m6413r(View view) {
        return m6381b(view, true);
    }

    public static Map<String, String> m6381b(View view, boolean z) {
        String str;
        HashMap map = new HashMap();
        if (view == null) {
            return map;
        }
        Object tag = view.getTag(-97003);
        if (tag == null || !(tag instanceof String)) {
            str = "";
        } else {
            str = (String) tag;
        }
        Map<String, String> mapM6388c = m6388c(view, z);
        if (!TextUtils.isEmpty(str)) {
            map.put(Config.FEED_LIST_ITEM_TITLE, str);
        } else {
            map.put(Config.FEED_LIST_ITEM_TITLE, mapM6388c.get(Config.FEED_LIST_ITEM_TITLE));
        }
        map.put("content", mapM6388c.get("content"));
        return map;
    }

    public static String m6414s(View view) {
        String str;
        if (view == null) {
            return "";
        }
        Object tag = view.getTag(-97004);
        if (tag == null || !(tag instanceof String)) {
            str = "";
        } else {
            str = (String) tag;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    public static Map<String, String> m6388c(View view, boolean z) {
        View view2;
        boolean z2;
        HashMap map = new HashMap();
        if (view == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m6367a(view, (LinkedHashMap<View, Integer>) linkedHashMap);
        StringBuilder sb = new StringBuilder();
        if (linkedHashMap.size() == 0) {
            return map;
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(linkedHashMap.entrySet());
        int i = 0;
        boolean z3 = false;
        for (Map.Entry entry : arrayList) {
            int iIntValue = ((Integer) entry.getValue()).intValue();
            if (iIntValue <= i) {
                iIntValue = i;
            }
            View view3 = (View) entry.getKey();
            if (view3 == null || !(view3 instanceof TextView)) {
                z2 = z3;
            } else {
                CharSequence text = ((TextView) view3).getText();
                String string = "";
                if (text != null) {
                    string = text.toString();
                }
                if (TextUtils.isEmpty(string)) {
                    z2 = z3;
                } else {
                    if (!TextUtils.isEmpty(sb.toString())) {
                        sb.append("_");
                    }
                    sb.append(string);
                    if (!z) {
                        z2 = true;
                    } else if (string.contains("广告")) {
                        z2 = true;
                    } else {
                        z2 = z3;
                    }
                }
            }
            i = iIntValue;
            z3 = z2;
        }
        String string2 = sb.toString();
        if (!TextUtils.isEmpty(string2) && z3) {
            if (string2.length() > 256) {
                string2 = string2.substring(0, 256);
            }
            map.put("content", string2);
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : arrayList) {
            if (((Integer) entry2.getValue()).intValue() >= i && (view2 = (View) entry2.getKey()) != null && (view2 instanceof TextView)) {
                CharSequence text2 = ((TextView) view2).getText();
                String string3 = "";
                if (text2 != null) {
                    string3 = text2.toString();
                }
                if (!TextUtils.isEmpty(string3)) {
                    if (!TextUtils.isEmpty(sb2.toString())) {
                        sb2.append("_");
                    }
                    sb2.append(string3);
                }
            }
        }
        String string4 = sb2.toString();
        if (!TextUtils.isEmpty(string4)) {
            if (string4.length() > 256) {
                string4 = string4.substring(0, 256);
            }
            map.put(Config.FEED_LIST_ITEM_TITLE, string4);
        }
        return map;
    }

    private static void m6367a(View view, LinkedHashMap<View, Integer> linkedHashMap) {
        if (view != null) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                if (textView.getVisibility() == 0) {
                    linkedHashMap.put(view, Integer.valueOf((int) (textView.getTextSize() * 10.0f)));
                    return;
                }
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m6367a(viewGroup.getChildAt(i), linkedHashMap);
                }
            }
        }
    }

    private static Rect m6416u(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        Rect rect = new Rect();
        m6370a(view, rect);
        return rect;
    }

    public static boolean m6369a(View view, float f) {
        Rect rectM6416u;
        if (view == null) {
            return false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width * height <= 0 || (rectM6416u = m6416u(view)) == null) {
            return false;
        }
        if (rectM6416u.height() * rectM6416u.width() < width * f * height) {
            return false;
        }
        return true;
    }

    public static boolean m6415t(View view) {
        Object tag;
        if (view == null || (tag = view.getTag(-97002)) == null || !(tag instanceof Boolean)) {
            return false;
        }
        return true;
    }

    private static boolean m6417v(View view) {
        if (view == null || !"com.android.internal.policy".equals(m6362a(view.getClass())) || !"DecorView".equals(m6406k(view))) {
            return false;
        }
        return true;
    }

    public static boolean m6389c(Activity activity, View view) {
        View viewM6354a;
        if (activity == null || view == null || (viewM6354a = m6354a(activity)) == null || !m6417v(view) || viewM6354a == view) {
            return false;
        }
        return true;
    }

    public static String m6356a(Context context) {
        ActivityInfo activityInfo;
        if (context == null) {
            return "";
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        ResolveInfo resolveInfoResolveActivity = null;
        try {
            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        } catch (Exception e) {
        }
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return "";
        }
        String str = activityInfo.packageName;
        if (Project.ANDROID.equals(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return str;
    }

    public static boolean m6368a(Context context, String str) {
        PackageManager packageManager;
        boolean z;
        if (context == null || TextUtils.isEmpty(str) || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        List<ResolveInfo> listQueryIntentActivities = null;
        try {
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        } catch (Exception e) {
        }
        if (listQueryIntentActivities == null) {
            z = false;
        } else {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && str.equals(activityInfo.packageName)) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    public static String m6399g(Activity activity) {
        String host;
        if (activity == null) {
            return "";
        }
        String strM6401h = m6401h(activity);
        if (!TextUtils.isEmpty(strM6401h)) {
            return strM6401h;
        }
        Uri uriM6404i = m6404i(activity);
        if (uriM6404i == null) {
            host = "";
        } else {
            host = uriM6404i.getHost();
            if (TextUtils.isEmpty(host)) {
                host = "";
            }
        }
        return host;
    }

    private static String m6401h(Activity activity) {
        return activity.getCallingPackage();
    }

    @TargetApi(22)
    private static Uri m6404i(Activity activity) {
        Uri uri;
        Intent intent = activity.getIntent();
        if (intent == null) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT < 17 || (uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER")) == null) {
            if (android.os.Build.VERSION.SDK_INT >= 22) {
                String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                if (!TextUtils.isEmpty(stringExtra)) {
                    return Uri.parse(stringExtra);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 22) {
                return activity.getReferrer();
            }
            return null;
        }
        return uri;
    }
}
