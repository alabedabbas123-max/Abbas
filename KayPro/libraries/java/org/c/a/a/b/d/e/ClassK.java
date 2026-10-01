package org.c.a.a.b.d.e;

public class ClassK extends Abstractm {

    public static final ClassK f5851a;

    public static final ClassK f5852b;

    public static final ClassK f5853c;

    public static final ClassK f5854d;

    public static final ClassK f5855e;

    public static final ClassK f5856f;

    public static final ClassK f5857g;

    public static final ClassK f5858h;

    public static final ClassK f5859i;

    public static final ClassK f5860j;

    public static final ClassK f5861k;

    public static final ClassK f5862l;

    public static final ClassK f5863m;

    public static final ClassK f5864n;

    public static final ClassK f5865o;

    public static final ClassK f5866p;

    public static final ClassK f5867q;

    static final boolean f5868x;

    protected String f5869r;

    protected int f5870s;

    protected int f5871t;

    protected int f5872u;

    protected int f5873v;

    protected String f5874w;

    static {
        f5868x = !ClassK.class.desiredAssertionStatus();
        f5851a = new ClassK("boolean", 1, 1, 1);
        f5852b = new ClassK("byte", 16, 16, 112);
        f5853c = new ClassK("char", 2, 2, 66);
        f5854d = new ClassK("double", 8, 8, 8);
        f5855e = new ClassK("float", 4, 4, 4);
        f5856f = new ClassK("int", 64, 114, 64);
        f5857g = new ClassK("long", 128, 128, 128);
        f5858h = new ClassK("short", 32, 48, 96);
        f5859i = new ClassK("void", 256, 256, 256);
        f5860j = new ClassK("maybe_char", 66, 66, 66);
        f5861k = new ClassK("maybe_short", 98, 98, 98);
        f5862l = new ClassK("maybe_byte", 114, 114, 114);
        f5863m = new ClassK("maybe_boolean", 115, 115, 115);
        f5864n = new ClassK("maybe_negative_byte", 112, 112, 112);
        f5865o = new ClassK("maybe_negative_short", 96, 96, 96);
        f5866p = new ClassK("maybe_int", 64, 64, 64);
        f5867q = new ClassK("maybe_negative_boolean", 113, 113, 113);
    }

    protected ClassK(String str, int i, int i2, int i3) {
        this(str, i, i2, i3, 0);
    }

    protected ClassK(String str, int i, int i2, int i3, int i4) {
        this.f5869r = str;
        this.f5870s = i4;
        this.f5871t = i;
        this.f5872u = i2;
        this.f5873v = i3;
        StringBuilder sb = new StringBuilder();
        switch (i4) {
            case 0:
                break;
            case 1:
                sb.append('[');
                break;
            case 2:
                sb.append("[[");
                break;
            default:
                for (int i5 = 0; i5 < i4; i5++) {
                    sb.append('[');
                }
                break;
        }
        if ((i & 8) != 0) {
            sb.append('D');
        } else if ((i & 4) != 0) {
            sb.append('F');
        } else if ((i & 128) != 0) {
            sb.append('J');
        } else if ((i & 1) != 0) {
            sb.append('Z');
        } else if ((i & 16) != 0) {
            sb.append('B');
        } else if ((i & 2) != 0) {
            sb.append('C');
        } else if ((i & 32) != 0) {
            sb.append('S');
        } else {
            sb.append('I');
        }
        this.f5874w = sb.toString();
    }

    protected ClassK(ClassK c2051k, int i) {
        this(c2051k.f5869r, c2051k.f5871t, c2051k.f5872u, c2051k.f5873v, i);
    }

    @Override
    public void mo8142a(Interfaceu interfaceC2061u) {
        interfaceC2061u.mo8132a(this);
    }

    public String m8155b() {
        return this.f5869r;
    }

    @Override
    public ClassK mo8143a(int i) {
        if (f5868x || i >= 0) {
            return this.f5870s == i ? this : new ClassK(this, i);
        }
        throw new AssertionError();
    }

    @Override
    public int mo8145d() {
        return this.f5870s;
    }

    @Override
    public String mo8146e() {
        return this.f5874w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassK c2051k = (ClassK) obj;
        return this.f5870s == c2051k.f5870s && this.f5871t == c2051k.f5871t;
    }

    public int m8157g() {
        return this.f5871t;
    }

    public int hashCode() {
        return (this.f5870s * 31) + this.f5871t;
    }

    public int m8158i() {
        return this.f5872u;
    }

    public int m8159j() {
        return this.f5873v;
    }

    @Override
    public boolean mo8160m_() {
        return true;
    }

    public String toString() {
        return this.f5870s == 0 ? "PrimitiveType{primitive=" + this.f5869r + "}" : "PrimitiveType{primitive=" + this.f5869r + ", dimension=" + this.f5870s + "}";
    }
}
