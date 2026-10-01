package org.c.a.a.c.a.a.a.c;

import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.c.a.a.c.aa;

public class ClassK extends Abstracta {

    static final boolean f6071l;

    protected int f6072k;

    static {
        f6071l = !ClassK.class.desiredAssertionStatus();
    }

    public ClassK(int i, int i2, String str, String str2) {
        super(i, i2, str2, 0);
        if (!f6071l && str.charAt(0) == '[') {
            throw new AssertionError();
        }
        this.f6072k = aa.m8405a(str).m8157g();
    }

    public ClassK(int i, int i2, ClassK c2051k) {
        super(i, i2, 0);
        if (!f6071l && c2051k.mo8145d() != 0) {
            throw new AssertionError();
        }
        this.f6072k = c2051k.m8157g();
    }

    public ClassK(int i, int i2, ClassK c2051k, String str) {
        super(i, i2, str, 0);
        if (!f6071l && c2051k.mo8145d() != 0) {
            throw new AssertionError();
        }
        this.f6072k = c2051k.m8157g();
    }

    public ClassK(int i, int i2, ClassK c2125k) {
        super(i, i2, 0);
        if (!f6071l && c2125k.m8338h() != 0) {
            throw new AssertionError();
        }
        int i3 = c2125k.f6072k;
        if ((i3 & 64) != 0) {
            this.f6072k = i3;
            return;
        }
        if ((i3 & 32) != 0) {
            this.f6072k = i3 | 64;
            return;
        }
        if ((i3 & 2) != 0) {
            this.f6072k = i3 | 64 | 32;
        } else if ((i3 & 16) != 0) {
            this.f6072k = i3 | 64 | 32;
        } else {
            this.f6072k = i3;
        }
    }

    public void m8382a(ClassK c2051k) {
        if (!f6071l && c2051k.mo8145d() != 0) {
            throw new AssertionError();
        }
        this.f6072k = c2051k.m8157g();
    }

    @Override
    public void mo8368a(Interfacei interfaceC2123i) {
        interfaceC2123i.mo8380a(this);
    }

    @Override
    public boolean mo8325a(Interfacel interfaceC2052l) {
        return interfaceC2052l.mo8145d() == 0 && interfaceC2052l.mo8160m_() && (this.f6072k & ((ClassK) interfaceC2052l).m8159j()) != 0;
    }

    @Override
    public void mo8328b(Interfacel interfaceC2052l) {
        this.f6072k = ((ClassK) interfaceC2052l).m8159j() & this.f6072k;
        if (f6071l) {
            return;
        }
        if (interfaceC2052l.mo8145d() != 0 || this.f6072k == 0) {
            throw new AssertionError();
        }
    }

    @Override
    public boolean mo8329b(Abstracta abstractC2115a) {
        if (abstractC2115a.m8338h() != 0 || abstractC2115a.getClass() != ClassK.class) {
            return false;
        }
        if (this.f6047h == 0) {
            return (this.f6072k & ((ClassK) abstractC2115a).f6072k) != 0;
        }
        return this.f6072k == ((ClassK) abstractC2115a).f6072k;
    }

    @Override
    public void mo8330c(Interfacel interfaceC2052l) {
        this.f6072k = ((ClassK) interfaceC2052l).m8158i() & this.f6072k;
        if (f6071l) {
            return;
        }
        if (interfaceC2052l.mo8145d() != 0 || this.f6072k == 0) {
            throw new AssertionError("rightReduce : incompatible types");
        }
    }

    @Override
    public void mo8331c(Abstracta abstractC2115a) {
        if (!f6071l && abstractC2115a.m8338h() != 0) {
            throw new AssertionError();
        }
        int i = ((ClassK) abstractC2115a).f6072k;
        int i2 = (i & 16) != 0 ? 112 : 0;
        if ((i & 2) != 0) {
            i2 |= 66;
        }
        if ((i & 32) != 0) {
            i2 |= 96;
        }
        if ((i & 64) != 0) {
            i2 |= 64;
        }
        if ((this.f6072k & i2) != 0) {
            this.f6072k = i2 & this.f6072k;
        }
    }

    @Override
    public void mo8334d(Abstracta abstractC2115a) {
        if (!f6071l && abstractC2115a.m8338h() != 0) {
            throw new AssertionError();
        }
        int i = ((ClassK) abstractC2115a).f6072k;
        int i2 = (i & 64) != 0 ? 64 : 0;
        if ((i & 32) != 0) {
            i2 |= 48;
        }
        if ((i & 2) != 0) {
            i2 |= 2;
        }
        if ((i & 16) != 0) {
            i2 |= 16;
        }
        if ((this.f6072k & i2) != 0) {
            this.f6072k = i2 & this.f6072k;
        }
    }

    @Override
    public Interfacel mo8370k() {
        return aa.m8404a(this.f6072k, this.f6047h);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrimitiveLocalVariable{");
        if ((this.f6072k & 1) != 0) {
            sb.append("boolean ");
        }
        if ((this.f6072k & 2) != 0) {
            sb.append("char ");
        }
        if ((this.f6072k & 4) != 0) {
            sb.append("float ");
        }
        if ((this.f6072k & 8) != 0) {
            sb.append("double ");
        }
        if ((this.f6072k & 16) != 0) {
            sb.append("byte ");
        }
        if ((this.f6072k & 32) != 0) {
            sb.append("short ");
        }
        if ((this.f6072k & 64) != 0) {
            sb.append("int ");
        }
        if ((this.f6072k & 128) != 0) {
            sb.append("long ");
        }
        if ((this.f6072k & 256) != 0) {
            sb.append("void ");
        }
        sb.append(this.f6046g).append(", index=").append(this.f6043d);
        if (this.f6041b != null) {
            sb.append(", next=").append(this.f6041b);
        }
        return sb.append("}").toString();
    }
}
