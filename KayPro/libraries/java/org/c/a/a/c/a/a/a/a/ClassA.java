package org.c.a.a.c.a.a.a.a;

import java.util.HashSet;
import java.util.Iterator;
import org.c.a.a.d.ClassC;

public class ClassA {

    protected static final String[] f5959a;

    protected static final ClassC f5960b;

    protected static final ClassC f5961c;

    public static final ClassA f5962d;

    public static final ClassA f5963e;

    public static final ClassA f5964f;

    public static final ClassA f5965g;

    public static final ClassA f5966h;

    public static final ClassA f5967i;

    static final boolean f5968x;

    protected ClassF f5969j;

    protected int f5970k;

    protected int f5971l;

    protected int f5972m;

    protected int f5973n;

    protected ClassA f5974o;

    protected ClassA f5975p;

    protected ClassA f5976q;

    protected boolean f5977r;

    protected ClassA f5978s;

    protected ClassA f5979t;

    protected ClassC f5980u;

    protected ClassC f5981v;

    protected HashSet f5982w;

    static {
        f5968x = !ClassA.class.desiredAssertionStatus();
        f5959a = new String[]{"DELETED", "START", "END", "STATEMENTS", "THROW", "RETURN", "RETURN_VALUE", "SWITCH_DECLARATION", "SWITCH", "SWITCH_BREAK", "TRY_DECLARATION", "TRY", "TRY_JSR", "TYPE_TRY_ECLIPSE", "JSR", "RET", "CONDITIONAL_BRANCH", "IF", "IF_ELSE", "CONDITION", "CONDITION_OR", "CONDITION_AND", "CONDITION_TERNARY_OPERATOR", "LOOP", "LOOP_START", "LOOP_CONTINUE", "LOOP_END", "GOTO", "INFINITE_GOTO", "GOTO_IN_TERNARY_OP", "TERNARY_OP", "JUMP"};
        f5960b = ClassC.m8843f();
        f5961c = ClassC.m8843f();
        f5962d = new ClassC(256);
        f5963e = new ClassC(8388608);
        f5964f = new ClassC(16777216);
        f5965g = new ClassC(33554432);
        f5966h = new ClassC(2);
        f5967i = new ClassC(16);
    }

    public ClassA(ClassF c2090f, int i, int i2, int i3, int i4, boolean z) {
        this(c2090f, i, i2, i3, i4, z, new HashSet());
    }

    public ClassA(ClassF c2090f, int i, int i2, int i3, int i4, boolean z, HashSet hashSet) {
        this.f5980u = f5960b;
        this.f5981v = f5961c;
        this.f5969j = c2090f;
        this.f5970k = i;
        this.f5971l = i2;
        this.f5972m = i3;
        this.f5973n = i4;
        ClassA c2085a = f5966h;
        this.f5979t = c2085a;
        this.f5978s = c2085a;
        this.f5976q = c2085a;
        this.f5975p = c2085a;
        this.f5974o = c2085a;
        this.f5982w = hashSet;
        this.f5977r = z;
    }

    public ClassA(ClassF c2090f, int i, ClassA c2085a) {
        this(c2090f, i, c2085a, new HashSet());
    }

    public ClassA(ClassF c2090f, int i, ClassA c2085a, HashSet hashSet) {
        this.f5980u = f5960b;
        this.f5981v = f5961c;
        this.f5969j = c2090f;
        this.f5970k = i;
        this.f5971l = c2085a.f5971l;
        this.f5972m = c2085a.f5972m;
        this.f5973n = c2085a.f5973n;
        this.f5974o = c2085a.f5974o;
        this.f5975p = c2085a.f5975p;
        this.f5976q = c2085a.f5976q;
        this.f5977r = c2085a.f5977r;
        this.f5978s = c2085a.f5978s;
        this.f5979t = c2085a.f5979t;
        this.f5980u = c2085a.f5980u;
        this.f5981v = c2085a.f5981v;
        this.f5982w = hashSet;
    }

    public ClassF m8205a() {
        return this.f5969j;
    }

    public void m8206a(int i) {
        this.f5971l = i;
    }

    public void m8207a(String str, ClassA c2085a) {
        if (this.f5980u == f5960b) {
            this.f5980u = new ClassC();
            this.f5980u.add(new ClassB(str, c2085a));
            return;
        }
        for (ClassB c2086b : this.f5980u) {
            if (c2086b.m8244c() == c2085a) {
                c2086b.m8239a(str);
                return;
            }
        }
        this.f5980u.add(new ClassB(str, c2085a));
    }

    public void m8208a(HashSet hashSet, ClassA c2085a) {
        if (hashSet.contains(this.f5974o)) {
            this.f5974o = c2085a;
        }
        if (hashSet.contains(this.f5975p)) {
            this.f5975p = c2085a;
        }
        Iterator it = this.f5980u.iterator();
        while (it.hasNext()) {
            ((ClassB) it.next()).m8240a(hashSet, c2085a);
        }
        Iterator it2 = this.f5981v.iterator();
        while (it2.hasNext()) {
            ((ClassE) it2.next()).m8247a(hashSet, c2085a);
        }
        if (hashSet.contains(this.f5978s)) {
            this.f5978s = c2085a;
        }
        if (hashSet.contains(this.f5979t)) {
            this.f5979t = c2085a;
        }
        this.f5982w.removeAll(hashSet);
        this.f5982w.add(c2085a);
    }

    public void m8209a(ClassA c2085a) {
        this.f5974o = c2085a;
    }

    public void m8210a(ClassA c2085a, ClassA c2085a2) {
        if (this.f5974o == c2085a) {
            this.f5974o = c2085a2;
        }
        if (this.f5975p == c2085a) {
            this.f5975p = c2085a2;
        }
        Iterator it = this.f5980u.iterator();
        while (it.hasNext()) {
            ((ClassB) it.next()).m8242a(c2085a, c2085a2);
        }
        Iterator it2 = this.f5981v.iterator();
        while (it2.hasNext()) {
            ((ClassE) it2.next()).m8249a(c2085a, c2085a2);
        }
        if (this.f5978s == c2085a) {
            this.f5978s = c2085a2;
        }
        if (this.f5979t == c2085a) {
            this.f5979t = c2085a2;
        }
        if (this.f5982w.contains(c2085a)) {
            this.f5982w.remove(c2085a);
            if (c2085a2 != f5966h) {
                this.f5982w.add(c2085a2);
            }
        }
    }

    public void m8211a(ClassC c2247c) {
        this.f5981v = c2247c;
    }

    public void m8212a(boolean z) {
        this.f5977r = z;
    }

    public int m8213b() {
        return this.f5970k;
    }

    public void m8214b(int i) {
        this.f5972m = i;
    }

    public void m8215b(ClassA c2085a) {
        this.f5975p = c2085a;
    }

    public int m8216c() {
        return this.f5971l;
    }

    public void m8217c(int i) {
        this.f5973n = i;
    }

    public void m8218c(ClassA c2085a) {
        this.f5976q = c2085a;
    }

    public int m8219d() {
        return this.f5972m;
    }

    public void m8220d(ClassA c2085a) {
        this.f5978s = c2085a;
    }

    public boolean m8221d(int i) {
        return (this.f5971l & i) != 0;
    }

    public int m8222e() {
        return this.f5973n;
    }

    public void m8223e(ClassA c2085a) {
        this.f5979t = c2085a;
    }

    public boolean equals(Object obj) {
        return this.f5970k == ((ClassA) obj).f5970k;
    }

    public int mo8224f() {
        return this.f5969j.m8253a(this.f5972m);
    }

    public boolean m8225f(ClassA c2085a) {
        if (this.f5974o != c2085a && this.f5975p != c2085a) {
            Iterator it = this.f5980u.iterator();
            while (it.hasNext()) {
                if (((ClassB) it.next()).m8244c() == c2085a) {
                    return true;
                }
            }
            Iterator it2 = this.f5981v.iterator();
            while (it2.hasNext()) {
                if (((ClassE) it2.next()).m8251c() == c2085a) {
                    return true;
                }
            }
            return this.f5978s == c2085a || this.f5979t == c2085a;
        }
        return true;
    }

    public int mo8226g() {
        return this.f5969j.m8253a(this.f5973n - 1);
    }

    public ClassA m8227h() {
        return this.f5974o;
    }

    public int hashCode() {
        return this.f5970k;
    }

    public ClassA m8228i() {
        return this.f5975p;
    }

    public ClassC m8229j() {
        return this.f5980u;
    }

    public ClassC m8230k() {
        return this.f5981v;
    }

    public ClassA m8231l() {
        return this.f5976q;
    }

    public ClassA m8232m() {
        return this.f5978s;
    }

    public ClassA m8233n() {
        return this.f5979t;
    }

    public HashSet m8234o() {
        return this.f5982w;
    }

    public boolean m8235p() {
        return this.f5977r;
    }

    public void m8236q() {
        switch (this.f5971l) {
            case 262144:
            case 2097152:
            case 268435456:
                this.f5977r = !this.f5977r;
                return;
            case 524288:
                this.f5971l = 1048576;
                this.f5978s.m8236q();
                this.f5979t.m8236q();
                return;
            case 1048576:
                this.f5971l = 524288;
                this.f5978s.m8236q();
                this.f5979t.m8236q();
                return;
            default:
                if (!f5968x) {
                    throw new AssertionError("Invalid condition");
                }
                return;
        }
    }

    public String m8237r() {
        return f5959a[this.f5971l == 0 ? 0 : Integer.numberOfTrailingZeros(this.f5971l) + 1];
    }

    public String toString() {
        String str = "BasicBlock{index=" + this.f5970k + ", from=" + this.f5972m + ", to=" + this.f5973n + ", type=" + m8237r() + ", inverseCondition=" + this.f5977r;
        if (!this.f5982w.isEmpty()) {
            String str2 = String.valueOf(str) + ", predecessors=[";
            Iterator it = this.f5982w.iterator();
            if (it.hasNext()) {
                str2 = String.valueOf(str2) + ((ClassA) it.next()).m8213b();
                while (it.hasNext()) {
                    str2 = String.valueOf(str2) + ", " + ((ClassA) it.next()).m8213b();
                }
            }
            str = String.valueOf(str2) + "]";
        }
        return String.valueOf(str) + "}";
    }
}
