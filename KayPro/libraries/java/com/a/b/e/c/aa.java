package com.a.b.e.c;

import com.a.b.e.d.ClassC;

public final class aa extends Abstracta {

    public static final aa f3122a = new aa(new ad("TYPE"), new ad("Ljava/lang/Class;"));

    private final ad f3123b;

    private final ad f3124c;

    public aa(ad c1204ad, ad c1204ad2) {
        if (c1204ad == null) {
            throw new NullPointerException("name == null");
        }
        if (c1204ad2 == null) {
            throw new NullPointerException("descriptor == null");
        }
        this.f3123b = c1204ad;
        this.f3124c = c1204ad2;
    }

    public ad m4944a() {
        return this.f3123b;
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        aa c1201aa = (aa) abstractC1200a;
        int iA = this.f3123b.compareTo(c1201aa.f3123b);
        return iA != 0 ? iA : this.f3124c.compareTo(c1201aa.f3124c);
    }

    public ad m4945b() {
        return this.f3124c;
    }

    public ClassC m4946c() {
        return ClassC.m5056a(this.f3124c.m4958j());
    }

    @Override
    public String mo3828d() {
        return String.valueOf(this.f3123b.mo3828d()) + ':' + this.f3124c.mo3828d();
    }

    public final boolean m4947e() {
        return this.f3123b.m4958j().equals("<init>");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aa)) {
            return false;
        }
        aa c1201aa = (aa) obj;
        return this.f3123b.equals(c1201aa.f3123b) && this.f3124c.equals(c1201aa.f3124c);
    }

    public final boolean m4948f() {
        return this.f3123b.m4958j().equals("<clinit>");
    }

    @Override
    public boolean mo4942g() {
        return false;
    }

    @Override
    public String mo4943h() {
        return "nat";
    }

    public int hashCode() {
        return (this.f3123b.hashCode() * 31) ^ this.f3124c.hashCode();
    }

    public String toString() {
        return "nat{" + mo3828d() + '}';
    }
}
