package org.a.a.a.a;

import com.baidu.mobstat.Config;

public final class aw extends Abstractp {

    public final int f5154a;

    public final int f5155b;

    public final boolean f5156c;

    public aw(Abstractn abstractC1738n, int i, int i2, boolean z) {
        super(abstractC1738n);
        this.f5154a = i;
        this.f5155b = i2;
        this.f5156c = z;
    }

    @Override
    public int mo7286a() {
        return 4;
    }

    @Override
    public boolean mo7287a(int i, int i2, int i3) {
        return false;
    }

    @Override
    public boolean mo7288b() {
        return true;
    }

    public String toString() {
        return "pred_" + this.f5154a + Config.TRACE_TODAY_VISIT_SPLIT + this.f5155b;
    }
}
