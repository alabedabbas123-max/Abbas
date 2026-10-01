package org.a.a.a.a;

import com.baidu.mobstat.Config;

public final class ClassQ extends Abstractbl {

    public final int f5228a;

    public final int f5229b;

    public final boolean f5230c;

    public ClassQ(Abstractn abstractC1738n, int i, int i2, boolean z) {
        super(abstractC1738n);
        this.f5228a = i;
        this.f5229b = i2;
        this.f5230c = z;
    }

    @Override
    public int mo7286a() {
        return 6;
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
        return "action_" + this.f5228a + Config.TRACE_TODAY_VISIT_SPLIT + this.f5229b;
    }
}
