package com.a.b.g;

public class ClassT {

    private boolean f3505a;

    public ClassT() {
        this.f3505a = true;
    }

    public ClassT(boolean z) {
        this.f3505a = z;
    }

    public final boolean m5516b_() {
        return this.f3505a;
    }

    public void mo3944c_() {
        this.f3505a = false;
    }

    public final boolean m5517k() {
        return !this.f3505a;
    }

    public final void m5518l() {
        if (!this.f3505a) {
            throw new ClassU("immutable instance");
        }
    }

    public final void m5519m() {
        if (this.f3505a) {
            throw new ClassU("mutable instance");
        }
    }
}
