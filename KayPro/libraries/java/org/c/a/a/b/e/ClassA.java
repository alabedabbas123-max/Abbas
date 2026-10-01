package org.c.a.a.b.e;

import java.util.HashMap;

public class ClassA {

    protected HashMap f5881a = new HashMap();

    protected Object f5882b;

    public Object m8167a() {
        return this.f5882b;
    }

    public Object m8168a(String str) {
        return this.f5881a.get(str);
    }

    public Object m8169a(String str, Object obj) {
        Object obj2 = this.f5881a.get(str);
        return obj2 == null ? obj : obj2;
    }

    public void m8170a(Object obj) {
        this.f5882b = obj;
    }

    public void m8171b(String str, Object obj) {
        this.f5881a.put(str, obj);
    }
}
