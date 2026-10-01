package com.a.b.e.c;

import com.a.b.a.b.ClassC;
import com.a.b.e.d.ClassA;

public final class ClassI extends ClassD {
    private ClassI(ClassE c1212e) {
        super(c1212e);
    }

    public static ClassI m4991a(ClassY c1232y, aa c1201aa, ClassC c0931c) {
        if (c1232y == null) {
            throw new NullPointerException("bootstrapMethodHandle == null");
        }
        if (c1201aa == null) {
            throw new NullPointerException("nat == null");
        }
        ClassE c1212e = new ClassE(c0931c.m5476d_() + 3);
        c1212e.m4980a(0, (Abstracta) c1232y);
        c1212e.m4980a(1, (Abstracta) c1201aa.m4944a());
        c1212e.m4980a(2, (Abstracta) new ab(ClassA.m5036b(c1201aa.m4945b().m4958j())));
        if (c0931c != null) {
            for (int i = 0; i < c0931c.m5476d_(); i++) {
                c1212e.m4980a(i + 3, c0931c.m3954a(i));
            }
        }
        c1212e.mo3944c_();
        return new ClassI(c1212e);
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        return m4977a().compareTo(((ClassI) abstractC1200a).m4977a());
    }

    @Override
    public String mo3828d() {
        return m4977a().m5475b("{", ", ", "}");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ClassI) {
            return m4977a().equals(((ClassI) obj).m4977a());
        }
        return false;
    }

    @Override
    public boolean mo4942g() {
        return false;
    }

    @Override
    public String mo4943h() {
        return "call site";
    }

    @Override
    public int hashCode() {
        return m4977a().hashCode();
    }

    @Override
    public String toString() {
        return m4977a().m5473a("call site{", ", ", "}");
    }
}
