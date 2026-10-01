package org.c.a.a.b.d.e;

import com.almlkaide.kaypro.android.dex.DexFormat;

public class ClassI extends Abstractm {

    public static final ClassI f5830c;

    public static final ClassI f5831d;

    public static final ClassI f5832e;

    public static final ClassI f5833f;

    public static final ClassI f5834g;

    public static final ClassI f5835h;

    public static final ClassI f5836i;

    public static final ClassI f5837j;

    public static final ClassI f5838k;

    public static final ClassI f5839l;

    public static final ClassI f5840m;

    public static final ClassI f5841n;

    public static final ClassI f5842o;

    public static final ClassI f5843p;

    static final boolean f5844w;

    protected String f5845q;

    protected String f5846r;

    protected String f5847s;

    protected Interfacee f5848t;

    protected int f5849u;

    protected String f5850v;

    static {
        f5844w = !ClassI.class.desiredAssertionStatus();
        f5830c = new ClassI("java/lang/Boolean", "java.lang.Boolean", "Boolean");
        f5831d = new ClassI("java/lang/Byte", "java.lang.Byte", "Byte");
        f5832e = new ClassI("java/lang/Character", "java.lang.Character", "Character");
        f5833f = new ClassI("java/lang/Class", "java.lang.Class", "Class");
        f5834g = new ClassI("java/lang/Double", "java.lang.Double", "Double");
        f5835h = new ClassI("java/lang/Float", "java.lang.Float", "Float");
        f5836i = new ClassI("java/lang/Integer", "java.lang.Integer", "Integer");
        f5837j = new ClassI("java/lang/Long", "java.lang.Long", "Long");
        f5838k = new ClassI("java/lang/Math", "java.lang.Math", "Math");
        f5839l = new ClassI("java/lang/Object", "java.lang.Object", "Object");
        f5840m = new ClassI("java/lang/Short", "java.lang.Short", "Short");
        f5841n = new ClassI("java/lang/String", "java.lang.String", "String");
        f5842o = new ClassI("java/lang/Throwable", "java.lang.Throwable", "Throwable");
        f5843p = new ClassJ("java/lang/Object", "java.lang.Object", "Object");
    }

    public ClassI(String str, String str2, String str3) {
        this(str, str2, str3, null, 0);
    }

    public ClassI(String str, String str2, String str3, int i) {
        this(str, str2, str3, null, i);
    }

    public ClassI(String str, String str2, String str3, Interfacee interfaceC2045e) {
        this(str, str2, str3, interfaceC2045e, 0);
    }

    public ClassI(String str, String str2, String str3, Interfacee interfaceC2045e, int i) {
        this.f5845q = str;
        this.f5846r = str2;
        this.f5847s = str3;
        this.f5848t = interfaceC2045e;
        this.f5849u = i;
        if (!f5844w && (str == null || str.endsWith(";"))) {
            throw new AssertionError();
        }
        switch (i) {
            case 0:
                this.f5850v = "L" + str + ';';
                return;
            case 1:
                this.f5850v = "[L" + str + ';';
                return;
            case 2:
                this.f5850v = "[[L" + str + ';';
                return;
            default:
                this.f5850v = String.valueOf(new String(new char[i]).replaceAll(DexFormat.MAGIC_SUFFIX, "[")) + 'L' + str + ';';
                return;
        }
    }

    public ClassI mo8148a(Interfacee interfaceC2045e) {
        return new ClassI(this.f5845q, this.f5846r, this.f5847s, interfaceC2045e, this.f5849u);
    }

    @Override
    public Interfacel mo8143a(int i) {
        if (f5844w || i >= 0) {
            return this.f5849u == i ? this : new ClassI(this.f5845q, this.f5846r, this.f5847s, this.f5848t, i);
        }
        throw new AssertionError();
    }

    @Override
    public void mo8142a(Interfaceu interfaceC2061u) {
        interfaceC2061u.mo8131a(this);
    }

    @Override
    public int mo8145d() {
        return this.f5849u;
    }

    @Override
    public String mo8146e() {
        return this.f5850v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassI c2049i = (ClassI) obj;
        return this.f5849u == c2049i.f5849u && this.f5845q.equals(c2049i.f5845q);
    }

    public String m8150g() {
        return this.f5845q;
    }

    public int hashCode() {
        return (this.f5845q.hashCode() * 31) + this.f5849u;
    }

    public String m8151i() {
        return this.f5846r;
    }

    public String m8152j() {
        return this.f5847s;
    }

    public Interfacee m8153k() {
        return this.f5848t;
    }

    @Override
    public boolean mo8154l() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ObjectType{");
        sb.append(this.f5845q);
        if (this.f5848t != null) {
            sb.append('<').append(this.f5848t).append('>');
        }
        if (this.f5849u > 0) {
            sb.append(", dimension=").append(this.f5849u);
        }
        return sb.append('}').toString();
    }
}
