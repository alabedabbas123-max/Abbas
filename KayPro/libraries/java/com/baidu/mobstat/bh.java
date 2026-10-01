package com.baidu.mobstat;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class bh {

    private boolean f4332a;

    private List<b> f4333b = new ArrayList();

    private String f4334c;

    private Abstractbj f4335d;

    private boolean f4336e;

    public interface a {
        void mo6347a(View view, boolean z);
    }

    public bh(Activity activity, Abstractbj abstractC1446bj, boolean z) {
        this.f4334c = activity.getClass().getName();
        this.f4335d = abstractC1446bj;
        this.f4336e = z;
    }

    public void m6346a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f4332a = ((JSONObject) jSONObject.get("meta")).getInt("matchAll") != 0;
            } catch (Exception e) {
            }
            if (!this.f4332a) {
                try {
                    JSONArray jSONArray = (JSONArray) jSONObject.get("data");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                        String strOptString = jSONObject2.optString("page");
                        String strOptString2 = jSONObject2.optString("layout");
                        int iOptInt = jSONObject2.optInt("contentAsLabel");
                        boolean z = jSONObject2.optInt("ignoreCellIndex") != 0;
                        if (this.f4334c.equals(strOptString)) {
                            this.f4333b.add(new b(strOptString, strOptString2, z, iOptInt));
                        }
                    }
                } catch (Exception e2) {
                }
            }
        }
    }

    public void m6345a(Activity activity) {
        if (this.f4336e || this.f4332a || (this.f4333b != null && this.f4333b.size() != 0)) {
            View viewM6354a = bi.m6354a(activity);
            m6343a(activity, viewM6354a, null, viewM6354a);
        }
    }

    private void m6343a(Activity activity, View view, c cVar, View view2) {
        if (view != null && !ah.m5978a(view) && !bi.m6389c(activity, view)) {
            c cVar2 = new c(view, cVar, view2);
            if (cVar != null) {
                boolean zM6382b = this.f4332a ? bi.m6382b(view, cVar2.m6351c()) : m6344a(this.f4333b, cVar2.m6348a(), cVar2.m6350b());
                if (zM6382b || this.f4336e) {
                    if (bc.m6315c().mo6306b() && zM6382b) {
                        bc.m6315c().m6300a("accumulate view:" + view.getClass().getName() + "; content:" + bi.m6402h(view));
                    }
                    if (bg.m6342c().mo6306b()) {
                        bg.m6342c().m6300a("accumulate view:" + view.getClass().getName() + "; content:" + bi.m6402h(view));
                    }
                    this.f4335d.mo6347a(view, zM6382b);
                }
            }
            if (!(view instanceof WebView) && (view instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m6343a(activity, viewGroup.getChildAt(i), cVar2, view2);
                }
            }
        }
    }

    private boolean m6344a(List<b> list, String str, String str2) {
        for (b bVar : list) {
            String str3 = bVar.f4339c ? str2 : str;
            if (!TextUtils.isEmpty(str3) && str3.equals(bVar.f4338b)) {
                return true;
            }
        }
        return false;
    }

    public class b {

        public String f4337a;

        public String f4338b;

        public boolean f4339c;

        public int f4340d;

        public b(String str, String str2, boolean z, int i) {
            this.f4337a = str;
            this.f4338b = str2;
            this.f4339c = z;
            this.f4340d = i;
        }
    }

    static class c {

        public String f4342a;

        public String f4343b;

        public String f4344c;

        public c f4345d;

        public c(View view, c cVar, View view2) {
            this.f4345d = cVar;
            this.f4342a = bi.m6406k(view);
            this.f4343b = bi.m6376b(view);
            String strM6384c = bi.m6384c(view);
            if (TextUtils.isEmpty(strM6384c)) {
                strM6384c = bi.m6360a(view, m6351c());
                if (TextUtils.isEmpty(strM6384c)) {
                    strM6384c = bi.m6359a(view, view2);
                }
            }
            this.f4344c = strM6384c;
        }

        public String m6348a() {
            StringBuilder sb = new StringBuilder();
            while (this != null) {
                sb.insert(0, this.m6349a(false));
                this = this.f4345d;
            }
            return sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0039  */
        public String m6350b() {
            boolean z;
            StringBuilder sb = new StringBuilder();
            boolean z2 = false;
            while (this != null) {
                if (z2) {
                    z = false;
                } else {
                    String strM6351c = this.m6351c();
                    if ("ListView".equals(strM6351c) || "RecyclerView".equals(strM6351c) || "GridView".equals(strM6351c)) {
                        z = true;
                        z2 = true;
                    } else {
                        z = false;
                    }
                }
                sb.insert(0, this.m6349a(z));
                this = this.f4345d;
            }
            return sb.toString();
        }

        public String m6349a(boolean z) {
            StringBuilder sb = new StringBuilder();
            sb.append("/");
            sb.append(this.f4342a);
            if (!z) {
                sb.append("[");
                sb.append(this.f4344c);
                sb.append("]");
            }
            return sb.toString();
        }

        public String m6351c() {
            return this.f4345d == null ? "" : this.f4345d.f4343b;
        }
    }
}
