package com.baidu.mobstat;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Map;
import org.apache.commons.io.FilenameUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class bd implements Abstractbj.b {
    @Override
    public void mo6318a(View view, boolean z, Activity activity) {
        if (activity != null && view != null) {
            aq.m6109a(view, activity);
            if (bc.m6315c().mo6306b() && z) {
                bc.m6315c().m6300a("OnEvent view:" + view.getClass().getName() + "; content:" + bi.m6402h(view) + "; activity:" + activity.getClass().getName());
            }
            if (bg.m6342c().mo6306b()) {
                bg.m6342c().m6300a("OnEvent view:" + view.getClass().getName() + "; content:" + bi.m6402h(view) + "; activity:" + activity.getClass().getName());
            }
            JSONArray jSONArrayM6366a = bi.m6366a(activity, view);
            String strM6398f = bi.m6398f(view);
            Map<String, String> mapM6400g = bi.m6400g(view);
            String strM6358a = bi.m6358a(view);
            Context applicationContext = activity.getApplicationContext();
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONArray jSONArray = new JSONArray();
            String name = activity.getClass().getName();
            if (z) {
                BDStatCore.instance().onEvent(applicationContext, "", strM6358a, 1, jCurrentTimeMillis, jSONArrayM6366a, jSONArray, name, "", strM6398f, mapM6400g);
            }
            JSONObject jSONObjectM6317a = m6317a(activity, view, ay.m6276a().m6294b());
            String strM6316a = m6316a(activity, view);
            String strM6361a = bi.m6361a(view, true);
            JSONArray jSONArray2 = new JSONArray();
            Map<String, String> mapM6381b = bi.m6381b(bi.m6355a(view, activity), false);
            String str = "";
            if (!TextUtils.isEmpty(strM6316a) && mapM6381b != null && mapM6381b.size() > 0) {
                str = !TextUtils.isEmpty(mapM6381b.get("content")) ? mapM6381b.get("content") : "";
            }
            av.m6217a().m6251a(applicationContext, "", strM6361a, str, 1, jCurrentTimeMillis, name, jSONArrayM6366a, "", jSONArray, strM6398f, mapM6400g, jSONObjectM6317a, strM6316a, jSONArray2);
        }
    }

    private JSONObject m6317a(Activity activity, View view, PointF pointF) {
        if (pointF == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float f = pointF.x - iArr[0];
        float f2 = pointF.y - iArr[1];
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float fM5970b = ag.m5970b(activity, f);
        float fM5970b2 = ag.m5970b(activity, f2);
        float fM5969a = ag.m5969a(activity, bi.m6409n(view));
        float fM5969a2 = ag.m5969a(activity, bi.m6410o(view));
        if (fM5969a == 0.0f || fM5969a2 == 0.0f) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            jSONObject.put("x", decimalFormat.format(fM5970b));
            jSONObject.put("y", decimalFormat.format(fM5970b2));
            jSONObject.put(Config.EVENT_HEAT_XP, decimalFormat.format((fM5970b * 100.0f) / fM5969a));
            jSONObject.put(Config.EVENT_HEAT_YP, decimalFormat.format((fM5970b2 * 100.0f) / fM5969a2));
            return jSONObject;
        } catch (Exception e) {
            return jSONObject;
        }
    }

    private String m6316a(Activity activity, View view) {
        View viewM6355a;
        View viewM6408m;
        if (activity == null || view == null || (viewM6408m = bi.m6408m((viewM6355a = bi.m6355a(view, activity)))) == null) {
            return "";
        }
        String strM6185a = as.m6121a().m6185a(activity, viewM6355a, viewM6408m);
        if (TextUtils.isEmpty(strM6185a)) {
            strM6185a = "";
        }
        return strM6185a;
    }
}
