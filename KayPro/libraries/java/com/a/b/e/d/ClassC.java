package com.a.b.e.d;

import com.a.b.g.ClassK;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class ClassC implements Interfaced, Comparable {

    private final String f3276O;

    private final int f3277P;

    private final int f3278Q;

    private String f3279R;

    private ClassC f3280S;

    private ClassC f3281T;

    private ClassC f3282U;

    private static final ConcurrentMap f3249N = new ConcurrentHashMap(10000, 0.75f);

    public static final ClassC f3250a = new ClassC("Z", 1);

    public static final ClassC f3251b = new ClassC("B", 2);

    public static final ClassC f3252c = new ClassC("C", 3);

    public static final ClassC f3253d = new ClassC("D", 4);

    public static final ClassC f3254e = new ClassC("F", 5);

    public static final ClassC f3255f = new ClassC("I", 6);

    public static final ClassC f3256g = new ClassC("J", 7);

    public static final ClassC f3257h = new ClassC("S", 8);

    public static final ClassC f3258i = new ClassC("V", 0);

    public static final ClassC f3259j = new ClassC("<null>", 9);

    public static final ClassC f3260k = new ClassC("<addr>", 10);

    public static final ClassC f3261l = new ClassC("Ljava/lang/annotation/Annotation;", 9);

    public static final ClassC f3262m = new ClassC("Ljava/lang/Class;", 9);

    public static final ClassC f3263n = new ClassC("Ljava/lang/Cloneable;", 9);

    public static final ClassC f3264o = new ClassC("Ljava/lang/invoke/MethodHandle;", 9);

    public static final ClassC f3265p = new ClassC("Ljava/lang/invoke/MethodType;", 9);

    public static final ClassC f3266q = new ClassC("Ljava/lang/invoke/VarHandle;", 9);

    public static final ClassC f3267r = new ClassC("Ljava/lang/Object;", 9);

    public static final ClassC f3268s = new ClassC("Ljava/io/Serializable;", 9);

    public static final ClassC f3269t = new ClassC("Ljava/lang/String;", 9);

    public static final ClassC f3270u = new ClassC("Ljava/lang/Throwable;", 9);

    public static final ClassC f3271v = new ClassC("Ljava/lang/Boolean;", 9);

    public static final ClassC f3272w = new ClassC("Ljava/lang/Byte;", 9);

    public static final ClassC f3273x = new ClassC("Ljava/lang/Character;", 9);

    public static final ClassC f3274y = new ClassC("Ljava/lang/Double;", 9);

    public static final ClassC f3275z = new ClassC("Ljava/lang/Float;", 9);

    public static final ClassC f3236A = new ClassC("Ljava/lang/Integer;", 9);

    public static final ClassC f3237B = new ClassC("Ljava/lang/Long;", 9);

    public static final ClassC f3238C = new ClassC("Ljava/lang/Short;", 9);

    public static final ClassC f3239D = new ClassC("Ljava/lang/Void;", 9);

    public static final ClassC f3240E = new ClassC("[" + f3250a.f3276O, 9);

    public static final ClassC f3241F = new ClassC("[" + f3251b.f3276O, 9);

    public static final ClassC f3242G = new ClassC("[" + f3252c.f3276O, 9);

    public static final ClassC f3243H = new ClassC("[" + f3253d.f3276O, 9);

    public static final ClassC f3244I = new ClassC("[" + f3254e.f3276O, 9);

    public static final ClassC f3245J = new ClassC("[" + f3255f.f3276O, 9);

    public static final ClassC f3246K = new ClassC("[" + f3256g.f3276O, 9);

    public static final ClassC f3247L = new ClassC("[" + f3267r.f3276O, 9);

    public static final ClassC f3248M = new ClassC("[" + f3257h.f3276O, 9);

    static {
        m5060v();
    }

    private ClassC(String str, int i) {
        this(str, i, -1);
    }

    private ClassC(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (i < 0 || i >= 11) {
            throw new IllegalArgumentException("bad basicType");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("newAt < -1");
        }
        this.f3276O = str;
        this.f3277P = i;
        this.f3278Q = i2;
        this.f3280S = null;
        this.f3281T = null;
        this.f3282U = null;
    }

    public static ClassC m5056a(String str) {
        ClassC c1236c = (ClassC) f3249N.get(str);
        if (c1236c != null) {
            return c1236c;
        }
        try {
            char cCharAt = str.charAt(0);
            if (cCharAt == '[') {
                return m5056a(str.substring(1)).m5076t();
            }
            int length = str.length();
            if (cCharAt != 'L' || str.charAt(length - 1) != ';') {
                throw new IllegalArgumentException("bad descriptor: " + str);
            }
            int i = length - 1;
            for (int i2 = 1; i2 < i; i2++) {
                switch (str.charAt(i2)) {
                    case '(':
                    case ')':
                    case '.':
                    case ';':
                    case '[':
                        throw new IllegalArgumentException("bad descriptor: " + str);
                    case '/':
                        if (i2 == 1 || i2 == length - 1 || str.charAt(i2 - 1) == '/') {
                            throw new IllegalArgumentException("bad descriptor: " + str);
                        }
                        break;
                }
            }
            return m5057b(new ClassC(str, 9));
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("descriptor is empty");
        } catch (NullPointerException e2) {
            throw new NullPointerException("descriptor == null");
        }
    }

    private static ClassC m5057b(ClassC c1236c) {
        ClassC c1236c2 = (ClassC) f3249N.putIfAbsent(c1236c.m5064h(), c1236c);
        return c1236c2 != null ? c1236c2 : c1236c;
    }

    public static ClassC m5058b(String str) {
        try {
            return str.equals("V") ? f3258i : m5056a(str);
        } catch (NullPointerException e) {
            throw new NullPointerException("descriptor == null");
        }
    }

    public static ClassC m5059c(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        return str.startsWith("[") ? m5056a(str) : m5056a(String.valueOf('L') + str + ';');
    }

    private static void m5060v() {
        m5057b(f3250a);
        m5057b(f3251b);
        m5057b(f3252c);
        m5057b(f3253d);
        m5057b(f3254e);
        m5057b(f3255f);
        m5057b(f3256g);
        m5057b(f3257h);
        m5057b(f3261l);
        m5057b(f3262m);
        m5057b(f3263n);
        m5057b(f3264o);
        m5057b(f3266q);
        m5057b(f3267r);
        m5057b(f3268s);
        m5057b(f3269t);
        m5057b(f3270u);
        m5057b(f3271v);
        m5057b(f3272w);
        m5057b(f3273x);
        m5057b(f3274y);
        m5057b(f3275z);
        m5057b(f3236A);
        m5057b(f3237B);
        m5057b(f3238C);
        m5057b(f3239D);
        m5057b(f3240E);
        m5057b(f3241F);
        m5057b(f3242G);
        m5057b(f3243H);
        m5057b(f3244I);
        m5057b(f3245J);
        m5057b(f3246K);
        m5057b(f3247L);
        m5057b(f3248M);
    }

    @Override
    public int compareTo(ClassC c1236c) {
        return this.f3276O.compareTo(c1236c.f3276O);
    }

    @Override
    public ClassC mo3825a() {
        return this;
    }

    public ClassC m5062a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newAt < 0");
        }
        if (!m5071o()) {
            throw new IllegalArgumentException("not a reference type: " + this.f3276O);
        }
        if (m5074r()) {
            throw new IllegalArgumentException("already uninitialized: " + this.f3276O);
        }
        ClassC c1236c = new ClassC(String.valueOf('N') + ClassK.m5485c(i) + this.f3276O, 9, i);
        c1236c.f3282U = this;
        return m5057b(c1236c);
    }

    @Override
    public int mo3827c() {
        return this.f3277P;
    }

    @Override
    public String mo3828d() {
        switch (this.f3277P) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "byte";
            case 3:
                return "char";
            case 4:
                return "double";
            case 5:
                return "float";
            case 6:
                return "int";
            case 7:
                return "long";
            case 8:
                return "short";
            case 9:
                return m5072p() ? String.valueOf(m5077u().mo3828d()) + "[]" : m5065i().replace("/", ".");
            default:
                return this.f3276O;
        }
    }

    @Override
    public int mo3829e() {
        switch (this.f3277P) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 8:
                return 6;
            case 4:
            case 5:
            case 7:
            default:
                return this.f3277P;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClassC) {
            return this.f3276O.equals(((ClassC) obj).f3276O);
        }
        return false;
    }

    @Override
    public boolean mo3830f() {
        return false;
    }

    @Override
    public ClassC mo3826b() {
        switch (this.f3277P) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 8:
                return f3255f;
            case 4:
            case 5:
            case 7:
            default:
                return this;
        }
    }

    public String m5064h() {
        return this.f3276O;
    }

    public int hashCode() {
        return this.f3276O.hashCode();
    }

    public String m5065i() {
        if (this.f3279R == null) {
            if (!m5071o()) {
                throw new IllegalArgumentException("not an object type: " + this.f3276O);
            }
            if (this.f3276O.charAt(0) == '[') {
                this.f3279R = this.f3276O;
            } else {
                this.f3279R = this.f3276O.substring(1, this.f3276O.length() - 1);
            }
        }
        return this.f3279R;
    }

    public int m5066j() {
        switch (this.f3277P) {
            case 4:
            case 7:
                return 2;
            case 5:
            case 6:
            default:
                return 1;
        }
    }

    public boolean m5067k() {
        switch (this.f3277P) {
            case 4:
            case 7:
                return false;
            case 5:
            case 6:
            default:
                return true;
        }
    }

    public boolean m5068l() {
        switch (this.f3277P) {
            case 4:
            case 7:
                return true;
            case 5:
            case 6:
            default:
                return false;
        }
    }

    public boolean m5069m() {
        switch (this.f3277P) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 8:
                return true;
            case 4:
            case 5:
            case 7:
            default:
                return false;
        }
    }

    public boolean m5070n() {
        switch (this.f3277P) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public boolean m5071o() {
        return this.f3277P == 9;
    }

    public boolean m5072p() {
        return this.f3276O.charAt(0) == '[';
    }

    public boolean m5073q() {
        return m5072p() || equals(f3259j);
    }

    public boolean m5074r() {
        return this.f3278Q >= 0;
    }

    public ClassC m5075s() {
        if (this.f3282U == null) {
            throw new IllegalArgumentException("initialized type: " + this.f3276O);
        }
        return this.f3282U;
    }

    public ClassC m5076t() {
        if (this.f3280S == null) {
            this.f3280S = m5057b(new ClassC(String.valueOf('[') + this.f3276O, 9));
        }
        return this.f3280S;
    }

    public String toString() {
        return this.f3276O;
    }

    public ClassC m5077u() {
        if (this.f3281T == null) {
            if (this.f3276O.charAt(0) != '[') {
                throw new IllegalArgumentException("not an array type: " + this.f3276O);
            }
            this.f3281T = m5056a(this.f3276O.substring(1));
        }
        return this.f3281T;
    }
}
