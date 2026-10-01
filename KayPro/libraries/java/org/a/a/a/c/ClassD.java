package org.a.a.a.c;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClassD {

    Map f5275a;

    public Object m7375a(Object obj, Object obj2) {
        Map map = (Map) this.f5275a.get(obj);
        if (map == null) {
            return null;
        }
        return map.get(obj2);
    }

    public Object m7376a(Object obj, Object obj2, Object obj3) {
        Map map;
        Object obj4;
        Map map2 = (Map) this.f5275a.get(obj);
        if (map2 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f5275a.put(obj, linkedHashMap);
            map = linkedHashMap;
            obj4 = null;
        } else {
            map = map2;
            obj4 = map2.get(obj2);
        }
        map.put(obj2, obj3);
        return obj4;
    }
}
