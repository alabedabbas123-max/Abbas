package com.a.b.e.c;

import com.a.b.e.d.ClassC;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.io.FilenameUtils;

public final class ae extends Abstractag {

    private final ClassC f3151v;

    private ad f3152w;

    private static final ConcurrentMap f3150u = new ConcurrentHashMap(1000, 0.75f);

    public static final ae f3130a = new ae(ClassC.f3267r);

    public static final ae f3131b = new ae(ClassC.f3271v);

    public static final ae f3132c = new ae(ClassC.f3272w);

    public static final ae f3133d = new ae(ClassC.f3273x);

    public static final ae f3134e = new ae(ClassC.f3274y);

    public static final ae f3135f = new ae(ClassC.f3275z);

    public static final ae f3136g = new ae(ClassC.f3237B);

    public static final ae f3137h = new ae(ClassC.f3236A);

    public static final ae f3138i = new ae(ClassC.f3238C);

    public static final ae f3139j = new ae(ClassC.f3239D);

    public static final ae f3140k = new ae(ClassC.f3240E);

    public static final ae f3141l = new ae(ClassC.f3241F);

    public static final ae f3142m = new ae(ClassC.f3242G);

    public static final ae f3143n = new ae(ClassC.f3243H);

    public static final ae f3144o = new ae(ClassC.f3244I);

    public static final ae f3145p = new ae(ClassC.f3246K);

    public static final ae f3146q = new ae(ClassC.f3245J);

    public static final ae f3147r = new ae(ClassC.f3248M);

    public static final ae f3148s = new ae(ClassC.f3264o);

    public static final ae f3149t = new ae(ClassC.f3266q);

    static {
        m4965l();
    }

    public ae(ClassC c1236c) {
        if (c1236c == null) {
            throw new NullPointerException("type == null");
        }
        if (c1236c == ClassC.f3259j) {
            throw new UnsupportedOperationException("KNOWN_NULL is not representable");
        }
        this.f3151v = c1236c;
        this.f3152w = null;
    }

    public static ae m4962a(ClassC c1236c) {
        switch (c1236c.mo3827c()) {
            case 0:
                return f3139j;
            case 1:
                return f3131b;
            case 2:
                return f3132c;
            case 3:
                return f3133d;
            case 4:
                return f3134e;
            case 5:
                return f3135f;
            case 6:
                return f3137h;
            case 7:
                return f3136g;
            case 8:
                return f3138i;
            default:
                throw new IllegalArgumentException("not primitive: " + c1236c);
        }
    }

    private static void m4963a(ae c1205ae) {
        if (f3150u.putIfAbsent(c1205ae.m4966i(), c1205ae) != null) {
            throw new IllegalStateException("Attempted re-init of " + c1205ae);
        }
    }

    public static ae m4964b(ClassC c1236c) {
        ae c1205ae = new ae(c1236c);
        ae c1205ae2 = (ae) f3150u.putIfAbsent(c1236c, c1205ae);
        return c1205ae2 != null ? c1205ae2 : c1205ae;
    }

    private static void m4965l() {
        m4963a(f3130a);
        m4963a(f3131b);
        m4963a(f3132c);
        m4963a(f3133d);
        m4963a(f3134e);
        m4963a(f3135f);
        m4963a(f3136g);
        m4963a(f3137h);
        m4963a(f3138i);
        m4963a(f3139j);
        m4963a(f3140k);
        m4963a(f3141l);
        m4963a(f3142m);
        m4963a(f3143n);
        m4963a(f3144o);
        m4963a(f3145p);
        m4963a(f3146q);
        m4963a(f3147r);
        m4963a(f3148s);
    }

    @Override
    public ClassC mo3825a() {
        return ClassC.f3262m;
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        return this.f3151v.m5064h().compareTo(((ae) abstractC1200a).f3151v.m5064h());
    }

    @Override
    public String mo3828d() {
        return this.f3151v.mo3828d();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ae) && this.f3151v == ((ae) obj).f3151v;
    }

    @Override
    public boolean mo4942g() {
        return false;
    }

    @Override
    public String mo4943h() {
        return "type";
    }

    public int hashCode() {
        return this.f3151v.hashCode();
    }

    public ClassC m4966i() {
        return this.f3151v;
    }

    public ad m4967j() {
        if (this.f3152w == null) {
            this.f3152w = new ad(this.f3151v.m5064h());
        }
        return this.f3152w;
    }

    public String m4968k() {
        String strM4958j = m4967j().m4958j();
        int iLastIndexOf = strM4958j.lastIndexOf(47);
        return iLastIndexOf == -1 ? "default" : strM4958j.substring(strM4958j.lastIndexOf(91) + 2, iLastIndexOf).replace('/', FilenameUtils.EXTENSION_SEPARATOR);
    }

    public String toString() {
        return "type{" + mo3828d() + '}';
    }
}
