package org.c.a.a.b.a;

import java.util.Map;
import org.c.a.a.b.a.a.Interfacec;

public class ClassD {

    protected int f5565a;

    protected String f5566b;

    protected String f5567c;

    protected Map f5568d;

    protected ClassB f5569e;

    public ClassD(int i, String str, String str2, Map map, ClassB c1862b) {
        this.f5565a = i;
        this.f5566b = str;
        this.f5567c = str2;
        this.f5568d = map;
        this.f5569e = c1862b;
    }

    public int m7683a() {
        return this.f5565a;
    }

    public Interfacec m7684a(String str) {
        if (this.f5568d == null) {
            return null;
        }
        return (Interfacec) this.f5568d.get(str);
    }

    public String m7685b() {
        return this.f5566b;
    }

    public String m7686c() {
        return this.f5567c;
    }

    public ClassB m7687d() {
        return this.f5569e;
    }

    public String toString() {
        return "Method{" + this.f5566b + " " + this.f5567c + "}";
    }
}
