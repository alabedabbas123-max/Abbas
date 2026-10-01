package com.a.b.a.b;

import com.a.a.a.ClassB;
import com.a.b.e.b.ClassU;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfaced;
import com.a.b.g.ClassK;
import java.util.ArrayList;

public class ClassW extends Abstractv {

    private final ClassZ f1900a;

    private final ArrayList f1901b;

    public ClassW(int i) {
        super(i != 0);
        this.f1900a = new ClassZ(i);
        this.f1901b = new ArrayList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ClassW(ClassW c0951w) {
        super(c0951w.m4076e() > 0);
        this.f1900a = c0951w.f1900a.mo4062a();
        this.f1901b = new ArrayList(c0951w.f1901b.size());
        int size = c0951w.f1901b.size();
        for (int i = 0; i < size; i++) {
            Abstractv abstractC0950v = (Abstractv) c0951w.f1901b.get(i);
            if (abstractC0950v == null) {
                this.f1901b.add(null);
            } else {
                this.f1901b.add(abstractC0950v.mo4062a());
            }
        }
    }

    public ClassW(ClassZ c0954z, ArrayList arrayList) {
        super(c0954z.m4086f() > 0);
        this.f1900a = c0954z;
        this.f1901b = arrayList;
    }

    private ClassW m4071a(ClassW c0951w) {
        Abstractv abstractC0950vMo4063a;
        ClassZ c0954zM4082a = this.f1900a.m4082a(c0951w.mo4070b());
        int size = this.f1901b.size();
        int size2 = c0951w.f1901b.size();
        int iMax = Math.max(size, size2);
        ArrayList arrayList = new ArrayList(iMax);
        int i = 0;
        boolean z = false;
        while (i < iMax) {
            Abstractv abstractC0950v = i < size ? (Abstractv) this.f1901b.get(i) : null;
            Abstractv abstractC0950v2 = i < size2 ? (Abstractv) c0951w.f1901b.get(i) : null;
            if (abstractC0950v == abstractC0950v2) {
                abstractC0950vMo4063a = abstractC0950v;
            } else if (abstractC0950v == null) {
                abstractC0950vMo4063a = abstractC0950v2;
            } else if (abstractC0950v2 == null) {
                abstractC0950vMo4063a = abstractC0950v;
            } else {
                try {
                    abstractC0950vMo4063a = abstractC0950v.mo4063a(abstractC0950v2);
                } catch (al e) {
                    e.m3757a("Merging locals set for caller block " + ClassK.m5485c(i));
                    abstractC0950vMo4063a = null;
                }
            }
            boolean z2 = z || abstractC0950v != abstractC0950vMo4063a;
            arrayList.add(abstractC0950vMo4063a);
            i++;
            z = z2;
        }
        return (this.f1900a != c0954zM4082a || z) ? new ClassW(c0954zM4082a, arrayList) : this;
    }

    private ClassW m4072a(ClassZ c0954z) {
        ClassZ c0954zM4082a = this.f1900a.m4082a(c0954z.mo4070b());
        ArrayList arrayList = new ArrayList(this.f1901b.size());
        int size = this.f1901b.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            Abstractv abstractC0950v = (Abstractv) this.f1901b.get(i);
            Abstractv abstractC0950vMo4063a = null;
            if (abstractC0950v != null) {
                try {
                    abstractC0950vMo4063a = abstractC0950v.mo4063a(c0954z);
                } catch (al e) {
                    e.m3757a("Merging one locals against caller block " + ClassK.m5485c(i));
                }
            }
            boolean z2 = z || abstractC0950v != abstractC0950vMo4063a;
            arrayList.add(abstractC0950vMo4063a);
            i++;
            z = z2;
        }
        return (this.f1900a != c0954zM4082a || z) ? new ClassW(c0954zM4082a, arrayList) : this;
    }

    private Abstractv m4073c(int i) {
        if (i >= this.f1901b.size()) {
            return null;
        }
        return (Abstractv) this.f1901b.get(i);
    }

    @Override
    public Abstractv mo4062a() {
        return new ClassW(this);
    }

    @Override
    public ClassW mo4064a(Abstractv abstractC0950v, int i) {
        Abstractv abstractC0950vMo4063a;
        Abstractv abstractC0950v2;
        ClassZ c0954zMo4070b;
        Abstractv abstractC0950vM4073c = m4073c(i);
        ClassZ c0954zM4082a = this.f1900a.m4082a(abstractC0950v.mo4070b());
        if (abstractC0950vM4073c == abstractC0950v) {
            abstractC0950vMo4063a = abstractC0950vM4073c;
        } else {
            abstractC0950vMo4063a = abstractC0950vM4073c == null ? abstractC0950v : abstractC0950vM4073c.mo4063a(abstractC0950v);
        }
        if (abstractC0950vMo4063a == abstractC0950vM4073c && c0954zM4082a == this.f1900a) {
            return this;
        }
        int size = this.f1901b.size();
        int iMax = Math.max(i + 1, size);
        ArrayList arrayList = new ArrayList(iMax);
        int i2 = 0;
        ClassZ c0954z = null;
        while (i2 < iMax) {
            if (i2 == i) {
                abstractC0950v2 = abstractC0950vMo4063a;
            } else {
                abstractC0950v2 = i2 < size ? (Abstractv) this.f1901b.get(i2) : null;
            }
            if (abstractC0950v2 != null) {
                c0954zMo4070b = c0954z == null ? abstractC0950v2.mo4070b() : c0954z.m4082a(abstractC0950v2.mo4070b());
            } else {
                c0954zMo4070b = c0954z;
            }
            arrayList.add(abstractC0950v2);
            i2++;
            c0954z = c0954zMo4070b;
        }
        ClassW c0951w = new ClassW(c0954z, arrayList);
        c0951w.mo3944c_();
        return c0951w;
    }

    @Override
    public Interfaced mo4065a(int i) {
        return this.f1900a.mo4065a(i);
    }

    @Override
    public void mo4066a(int i, Interfaced interfaceC1237d) {
        m5518l();
        this.f1900a.mo4066a(i, interfaceC1237d);
        for (Abstractv abstractC0950v : this.f1901b) {
            if (abstractC0950v != null) {
                abstractC0950v.mo4066a(i, interfaceC1237d);
            }
        }
    }

    @Override
    public void mo4067a(ClassB c0882b) {
        c0882b.m3757a("(locals array set; primary)");
        this.f1900a.mo4067a(c0882b);
        int size = this.f1901b.size();
        for (int i = 0; i < size; i++) {
            Abstractv abstractC0950v = (Abstractv) this.f1901b.get(i);
            if (abstractC0950v != null) {
                c0882b.m3757a("(locals array set: primary for caller " + ClassK.m5485c(i) + ')');
                abstractC0950v.mo4070b().mo4067a(c0882b);
            }
        }
    }

    @Override
    public void mo4068a(ClassU c1194u) {
        mo4066a(c1194u.m4894g(), c1194u);
    }

    @Override
    public void mo4069a(ClassC c1236c) {
        if (this.f1900a.m4086f() == 0) {
            return;
        }
        m5518l();
        this.f1900a.mo4069a(c1236c);
        for (Abstractv abstractC0950v : this.f1901b) {
            if (abstractC0950v != null) {
                abstractC0950v.mo4069a(c1236c);
            }
        }
    }

    public Abstractv m4074b(int i) {
        return m4073c(i);
    }

    @Override
    public ClassW mo4063a(Abstractv abstractC0950v) {
        try {
            ClassW c0951wM4071a = abstractC0950v instanceof ClassW ? m4071a((ClassW) abstractC0950v) : m4072a((ClassZ) abstractC0950v);
            c0951wM4071a.mo3944c_();
            return c0951wM4071a;
        } catch (al e) {
            e.m3757a("underlay locals:");
            mo4067a(e);
            e.m3757a("overlay locals:");
            abstractC0950v.mo4067a(e);
            throw e;
        }
    }

    @Override
    protected ClassZ mo4070b() {
        return this.f1900a;
    }

    @Override
    public void mo3944c_() {
        this.f1900a.mo3944c_();
        for (Abstractv abstractC0950v : this.f1901b) {
            if (abstractC0950v != null) {
                abstractC0950v.mo3944c_();
            }
        }
        super.mo3944c_();
    }

    @Override
    public String mo3828d() {
        StringBuilder sb = new StringBuilder();
        sb.append("(locals array set; primary)\n");
        sb.append(mo4070b().mo3828d());
        sb.append('\n');
        int size = this.f1901b.size();
        for (int i = 0; i < size; i++) {
            Abstractv abstractC0950v = (Abstractv) this.f1901b.get(i);
            if (abstractC0950v != null) {
                sb.append("(locals array set: primary for caller " + ClassK.m5485c(i) + ")\n");
                sb.append(abstractC0950v.mo4070b().mo3828d());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public int m4076e() {
        return this.f1900a.m4086f();
    }
}
