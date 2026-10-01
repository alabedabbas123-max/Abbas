package org.c.a.a.b.a;

import java.util.List;
import java.util.Map;
import org.c.a.a.b.a.a.Interfacec;

public class ClassA {

    protected int f5462a;

    protected int f5463b;

    protected int f5464c;

    protected String f5465d;

    protected String f5466e;

    protected String[] f5467f;

    protected ClassC[] f5468g;

    protected ClassD[] f5469h;

    protected Map f5470i;

    protected ClassA f5471j;

    protected List f5472k;

    public ClassA(int i, int i2, int i3, String str, String str2, String[] strArr, ClassC[] c1876cArr, ClassD[] c1877dArr, Map map) {
        this.f5462a = i;
        this.f5463b = i2;
        this.f5464c = i3;
        this.f5465d = str;
        this.f5466e = str2;
        this.f5467f = strArr;
        this.f5468g = c1876cArr;
        this.f5469h = c1877dArr;
        this.f5470i = map;
    }

    public int m7579a() {
        return this.f5463b;
    }

    public Interfacec m7580a(String str) {
        if (this.f5470i == null) {
            return null;
        }
        return (Interfacec) this.f5470i.get(str);
    }

    public void m7581a(int i) {
        this.f5464c = i;
    }

    public void m7582a(List list) {
        this.f5472k = list;
    }

    public void m7583a(ClassA c1821a) {
        this.f5471j = c1821a;
    }

    public int m7584b() {
        return this.f5462a;
    }

    public int m7585c() {
        return this.f5464c;
    }

    public String m7586d() {
        return this.f5465d;
    }

    public String m7587e() {
        return this.f5466e;
    }

    public String[] m7588f() {
        return this.f5467f;
    }

    public ClassC[] m7589g() {
        return this.f5468g;
    }

    public ClassD[] m7590h() {
        return this.f5469h;
    }

    public ClassA m7591i() {
        return this.f5471j;
    }

    public List m7592j() {
        return this.f5472k;
    }

    public String toString() {
        return "ClassFile{" + this.f5465d + "}";
    }
}
