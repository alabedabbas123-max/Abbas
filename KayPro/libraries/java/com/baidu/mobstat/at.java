package com.baidu.mobstat;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class at {

    private static final at f4215a = new at();

    private HashMap<String, String> f4216b = new HashMap<>();

    private HashMap<Character, Integer> f4217c = new HashMap<>();

    private HashMap<String, String> f4218d = new HashMap<>();

    private HashMap<Character, Integer> f4219e = new HashMap<>();

    private HashMap<String, String> f4220f = new HashMap<>();

    private HashMap<Character, Integer> f4221g = new HashMap<>();

    public static class a {

        public static int f4223a = 0;

        public static int f4224b = 1;

        public static int f4225c = 2;
    }

    public static at m6203a() {
        return f4215a;
    }

    public String m6205a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i == a.f4223a) {
            String str2 = this.f4216b.get(str);
            if (TextUtils.isEmpty(str2)) {
                m6204a(str, this.f4217c, this.f4216b);
                return this.f4216b.get(str);
            }
            return str2;
        }
        if (i == a.f4225c) {
            String str3 = this.f4220f.get(str);
            if (TextUtils.isEmpty(str3)) {
                m6204a(str, this.f4221g, this.f4220f);
                return this.f4220f.get(str);
            }
            return str3;
        }
        String str4 = this.f4218d.get(str);
        if (TextUtils.isEmpty(str4)) {
            m6204a(str, this.f4219e, this.f4218d);
            return this.f4218d.get(str);
        }
        return str4;
    }

    private void m6204a(String str, HashMap<Character, Integer> map, HashMap<String, String> map2) {
        char lowerCase = Character.toLowerCase(str.charAt(0));
        Integer num = map.get(Character.valueOf(lowerCase));
        int iIntValue = num != null ? num.intValue() + 1 : 0;
        String str2 = Character.toString(lowerCase) + iIntValue;
        map.put(Character.valueOf(lowerCase), Integer.valueOf(iIntValue));
        map2.put(str, str2);
    }

    public JSONObject m6206a(int i) {
        HashMap<String, String> map;
        if (i == a.f4223a) {
            map = this.f4216b;
        } else if (i == a.f4225c) {
            map = this.f4220f;
        } else {
            map = this.f4218d;
        }
        JSONObject jSONObject = new JSONObject();
        if (map == null) {
            return jSONObject;
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        try {
            Collections.sort(arrayList, new Comparator<Map.Entry<String, String>>() {
                @Override
                public int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
                    return entry.getValue().compareTo(entry2.getValue());
                }
            });
        } catch (Exception e) {
        }
        for (Map.Entry entry : arrayList) {
            try {
                jSONObject.put((String) entry.getValue(), (String) entry.getKey());
            } catch (Exception e2) {
            }
        }
        return jSONObject;
    }

    public void m6208b(int i) {
        if (i == a.f4223a) {
            this.f4217c.clear();
            this.f4216b.clear();
        } else if (i == a.f4225c) {
            this.f4221g.clear();
            this.f4220f.clear();
        } else {
            this.f4219e.clear();
            this.f4218d.clear();
        }
    }

    public void m6207b() {
        m6208b(a.f4223a);
        m6208b(a.f4225c);
        m6208b(a.f4224b);
    }
}
