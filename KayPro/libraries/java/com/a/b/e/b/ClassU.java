package com.a.b.e.b;

import com.baidu.mobstat.Config;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ad;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfaced;
import com.a.b.g.Interfacew;
import java.util.concurrent.ConcurrentHashMap;

public final class ClassU implements Interfaced, Interfacew, Comparable {

    private static final ConcurrentHashMap f3105a = new ConcurrentHashMap(10000, 0.75f);

    private static final ThreadLocal f3106b = new ClassV();

    private final int f3107c;

    private final Interfaced f3108d;

    private final ClassO f3109e;

    private ClassU(int i, Interfaced interfaceC1237d, ClassO c1188o) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (interfaceC1237d == null) {
            throw new NullPointerException("type == null");
        }
        this.f3107c = i;
        this.f3108d = interfaceC1237d;
        this.f3109e = c1188o;
    }

    ClassU(int i, Interfaced interfaceC1237d, ClassO c1188o, ClassU c1194u) {
        this(i, interfaceC1237d, c1188o);
    }

    public static ClassU m4876a(int i, Interfaced interfaceC1237d) {
        return m4883d(i, interfaceC1237d, null);
    }

    public static ClassU m4877a(int i, Interfaced interfaceC1237d, ClassO c1188o) {
        if (c1188o == null) {
            throw new NullPointerException("local  == null");
        }
        return m4883d(i, interfaceC1237d, c1188o);
    }

    public static String m4878a(int i) {
        return "v" + i;
    }

    private String m4879a(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(m4900m());
        sb.append(Config.TRACE_TODAY_VISIT_SPLIT);
        if (this.f3109e != null) {
            sb.append(this.f3109e.toString());
        }
        ClassC c1236cMo3825a = this.f3108d.mo3825a();
        sb.append(c1236cMo3825a);
        if (c1236cMo3825a != this.f3108d) {
            sb.append("=");
            if (z && (this.f3108d instanceof ad)) {
                sb.append(((ad) this.f3108d).m4957i());
            } else if (z && (this.f3108d instanceof Abstracta)) {
                sb.append(this.f3108d.mo3828d());
            } else {
                sb.append(this.f3108d);
            }
        }
        return sb.toString();
    }

    public static ClassU m4881b(int i, Interfaced interfaceC1237d, ClassO c1188o) {
        return m4883d(i, interfaceC1237d, c1188o);
    }

    private static ClassU m4883d(int i, Interfaced interfaceC1237d, ClassO c1188o) {
        ClassW c1196w = (ClassW) f3106b.get();
        c1196w.m4908a(i, interfaceC1237d, c1188o);
        ClassU c1194uM4907a = (ClassU) f3105a.get(c1196w);
        if (c1194uM4907a == null) {
            c1194uM4907a = c1196w.m4907a();
            ClassU c1194u = (ClassU) f3105a.putIfAbsent(c1194uM4907a, c1194uM4907a);
            if (c1194u != null) {
                return c1194u;
            }
        }
        return c1194uM4907a;
    }

    public boolean m4884e(int i, Interfaced interfaceC1237d, ClassO c1188o) {
        return this.f3107c == i && this.f3108d.equals(interfaceC1237d) && (this.f3109e == c1188o || (this.f3109e != null && this.f3109e.equals(c1188o)));
    }

    public static int m4885f(int i, Interfaced interfaceC1237d, ClassO c1188o) {
        return ((((c1188o != null ? c1188o.hashCode() : 0) * 31) + interfaceC1237d.hashCode()) * 31) + i;
    }

    public ClassU m4886a(ClassO c1188o) {
        if (this.f3109e != c1188o) {
            return (this.f3109e == null || !this.f3109e.equals(c1188o)) ? m4881b(this.f3107c, this.f3108d, c1188o) : this;
        }
        return this;
    }

    public ClassU m4887a(ClassU c1194u, boolean z) {
        ClassC c1236cMo3825a;
        if (this == c1194u) {
            return this;
        }
        if (c1194u == null || this.f3107c != c1194u.m4894g()) {
            return null;
        }
        ClassO c1188o = (this.f3109e == null || !this.f3109e.equals(c1194u.m4896i())) ? null : this.f3109e;
        boolean z2 = c1188o == this.f3109e;
        if ((z && !z2) || (c1236cMo3825a = mo3825a()) != c1194u.mo3825a()) {
            return null;
        }
        Interfaced interfaceC1237d = this.f3108d.equals(c1194u.m4895h()) ? this.f3108d : c1236cMo3825a;
        if (interfaceC1237d == this.f3108d && z2) {
            return this;
        }
        return c1188o == null ? m4876a(this.f3107c, interfaceC1237d) : m4877a(this.f3107c, interfaceC1237d, c1188o);
    }

    public ClassU m4888a(Interfaced interfaceC1237d) {
        return m4881b(this.f3107c, interfaceC1237d, this.f3109e);
    }

    @Override
    public ClassC mo3825a() {
        return this.f3108d.mo3825a();
    }

    public boolean m4889a(ClassU c1194u) {
        return m4891b(c1194u) && this.f3107c == c1194u.f3107c;
    }

    public ClassU m4890b(int i) {
        return this.f3107c == i ? this : m4881b(i, this.f3108d, this.f3109e);
    }

    @Override
    public Interfaced mo3826b() {
        return this.f3108d.mo3826b();
    }

    public boolean m4891b(ClassU c1194u) {
        if (c1194u != null && this.f3108d.mo3825a().equals(c1194u.f3108d.mo3825a())) {
            return this.f3109e == c1194u.f3109e || (this.f3109e != null && this.f3109e.equals(c1194u.f3109e));
        }
        return false;
    }

    @Override
    public final int mo3827c() {
        return this.f3108d.mo3827c();
    }

    @Override
    public int compareTo(ClassU c1194u) {
        if (this.f3107c < c1194u.f3107c) {
            return -1;
        }
        if (this.f3107c > c1194u.f3107c) {
            return 1;
        }
        if (this == c1194u) {
            return 0;
        }
        int iCompareTo = this.f3108d.mo3825a().compareTo(c1194u.f3108d.mo3825a());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (this.f3109e == null) {
            return c1194u.f3109e != null ? -1 : 0;
        }
        if (c1194u.f3109e == null) {
            return 1;
        }
        return this.f3109e.compareTo(c1194u.f3109e);
    }

    public ClassU m4893c(int i) {
        return i == 0 ? this : m4890b(this.f3107c + i);
    }

    @Override
    public String mo3828d() {
        return m4879a(true);
    }

    @Override
    public final int mo3829e() {
        return this.f3108d.mo3829e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClassU) {
            ClassU c1194u = (ClassU) obj;
            return m4884e(c1194u.f3107c, c1194u.f3108d, c1194u.f3109e);
        }
        if (!(obj instanceof ClassW)) {
            return false;
        }
        ClassW c1196w = (ClassW) obj;
        return m4884e(c1196w.f3110a, c1196w.f3111b, c1196w.f3112c);
    }

    @Override
    public final boolean mo3830f() {
        return false;
    }

    public int m4894g() {
        return this.f3107c;
    }

    public Interfaced m4895h() {
        return this.f3108d;
    }

    public int hashCode() {
        return m4885f(this.f3107c, this.f3108d, this.f3109e);
    }

    public ClassO m4896i() {
        return this.f3109e;
    }

    public int m4897j() {
        return this.f3107c + m4898k();
    }

    public int m4898k() {
        return this.f3108d.mo3825a().m5066j();
    }

    public boolean m4899l() {
        return this.f3108d.mo3825a().m5068l();
    }

    public String m4900m() {
        return m4878a(this.f3107c);
    }

    public ClassU m4901n() {
        Interfaced interfaceC1237d = this.f3108d;
        ClassC c1236cMo3825a = interfaceC1237d instanceof ClassC ? (ClassC) interfaceC1237d : interfaceC1237d.mo3825a();
        if (c1236cMo3825a.m5074r()) {
            c1236cMo3825a = c1236cMo3825a.m5075s();
        }
        return c1236cMo3825a == interfaceC1237d ? this : m4881b(this.f3107c, c1236cMo3825a, this.f3109e);
    }

    public boolean m4902o() {
        return (m4894g() & 1) == 0;
    }

    public String toString() {
        return m4879a(false);
    }
}
