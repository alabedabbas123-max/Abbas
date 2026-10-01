package com.a.b.e.b;

import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassK;

public final class aa {

    private final int f2831a;

    private final ClassC f2832b;

    private final Interfacee f2833c;

    private final Interfacee f2834d;

    private final int f2835e;

    private final boolean f2836f;

    private final String f2837g;

    public aa(int i, ClassC c1236c, Interfacee interfaceC1238e, int i2, String str) {
        this(i, c1236c, interfaceC1238e, ClassB.f3210a, i2, false, str);
    }

    public aa(int i, ClassC c1236c, Interfacee interfaceC1238e, Interfacee interfaceC1238e2, int i2, boolean z, String str) {
        if (c1236c == null) {
            throw new NullPointerException("result == null");
        }
        if (interfaceC1238e == null) {
            throw new NullPointerException("sources == null");
        }
        if (interfaceC1238e2 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i2 < 1 || i2 > 6) {
            throw new IllegalArgumentException("invalid branchingness: " + i2);
        }
        if (interfaceC1238e2.mo4148d_() != 0 && i2 != 6) {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
        this.f2831a = i;
        this.f2832b = c1236c;
        this.f2833c = interfaceC1238e;
        this.f2834d = interfaceC1238e2;
        this.f2835e = i2;
        this.f2836f = z;
        this.f2837g = str;
    }

    public aa(int i, ClassC c1236c, Interfacee interfaceC1238e, Interfacee interfaceC1238e2, String str) {
        this(i, c1236c, interfaceC1238e, interfaceC1238e2, 6, false, str);
    }

    public aa(int i, ClassC c1236c, Interfacee interfaceC1238e, String str) {
        this(i, c1236c, interfaceC1238e, ClassB.f3210a, 1, false, str);
    }

    public aa(int i, Interfacee interfaceC1238e, Interfacee interfaceC1238e2) {
        this(i, ClassC.f3258i, interfaceC1238e, interfaceC1238e2, 6, true, null);
    }

    public int m4737a() {
        return this.f2831a;
    }

    public ClassC m4738b() {
        return this.f2832b;
    }

    public Interfacee m4739c() {
        return this.f2833c;
    }

    public int m4740d() {
        return this.f2835e;
    }

    public boolean m4741e() {
        return this.f2836f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa c1167aa = (aa) obj;
        return this.f2831a == c1167aa.f2831a && this.f2835e == c1167aa.f2835e && this.f2832b == c1167aa.f2832b && this.f2833c.equals(c1167aa.f2833c) && this.f2834d.equals(c1167aa.f2834d);
    }

    public boolean m4742f() {
        switch (this.f2831a) {
            case 14:
            case 16:
            case 20:
            case 21:
            case 22:
                return true;
            case 15:
            case 17:
            case 18:
            case 19:
            default:
                return false;
        }
    }

    public String m4743g() {
        return this.f2837g != null ? this.f2837g : toString();
    }

    public final boolean m4744h() {
        return this.f2834d.mo4148d_() != 0;
    }

    public int hashCode() {
        return (((((((this.f2831a * 31) + this.f2835e) * 31) + this.f2832b.hashCode()) * 31) + this.f2833c.hashCode()) * 31) + this.f2834d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("Rop{");
        sb.append(ClassT.m4874a(this.f2831a));
        if (this.f2832b != ClassC.f3258i) {
            sb.append(" ");
            sb.append(this.f2832b);
        } else {
            sb.append(" .");
        }
        sb.append(" <-");
        int iMo4148d_ = this.f2833c.mo4148d_();
        if (iMo4148d_ == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < iMo4148d_; i++) {
                sb.append(' ');
                sb.append(this.f2833c.mo4145a(i));
            }
        }
        if (this.f2836f) {
            sb.append(" call");
        }
        int iMo4148d_2 = this.f2834d.mo4148d_();
        if (iMo4148d_2 == 0) {
            switch (this.f2835e) {
                case 1:
                    sb.append(" flows");
                    break;
                case 2:
                    sb.append(" returns");
                    break;
                case 3:
                    sb.append(" gotos");
                    break;
                case 4:
                    sb.append(" ifs");
                    break;
                case 5:
                    sb.append(" switches");
                    break;
                default:
                    sb.append(" " + ClassK.m5487e(this.f2835e));
                    break;
            }
        } else {
            sb.append(" throws");
            for (int i2 = 0; i2 < iMo4148d_2; i2++) {
                sb.append(' ');
                if (this.f2834d.mo4145a(i2) == ClassC.f3270u) {
                    sb.append("<any>");
                } else {
                    sb.append(this.f2834d.mo4145a(i2));
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
