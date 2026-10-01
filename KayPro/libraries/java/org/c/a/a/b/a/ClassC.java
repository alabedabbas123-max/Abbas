package org.c.a.a.b.a;

import java.util.Map;
import org.c.a.a.b.a.a.Interfacec;

public class ClassC {

    protected int f5561a;

    protected String f5562b;

    protected String f5563c;

    protected Map f5564d;

    public ClassC(int i, String str, String str2, Map map) {
        this.f5561a = i;
        this.f5562b = str;
        this.f5563c = str2;
        this.f5564d = map;
    }

    public int m7679a() {
        return this.f5561a;
    }

    public Interfacec m7680a(String str) {
        if (this.f5564d == null) {
            return null;
        }
        return (Interfacec) this.f5564d.get(str);
    }

    public String m7681b() {
        return this.f5562b;
    }

    public String m7682c() {
        return this.f5563c;
    }

    public String toString() {
        return "Field{" + this.f5562b + " " + this.f5563c + "}";
    }
}
