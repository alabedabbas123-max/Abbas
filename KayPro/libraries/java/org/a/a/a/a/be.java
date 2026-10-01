package org.a.a.a.a;

import com.baidu.mobstat.Config;
import org.a.a.a.c.ClassK;

public class be extends Abstractbd {

    public final int f5176b = -1;

    public final int f5177c = -1;

    public final boolean f5178d = false;

    protected be() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof be)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        be c1717be = (be) obj;
        return this.f5176b == c1717be.f5176b && this.f5177c == c1717be.f5177c && this.f5178d == c1717be.f5178d;
    }

    public int hashCode() {
        return ClassK.m7408b(ClassK.m7406a(ClassK.m7406a(ClassK.m7406a(ClassK.m7404a(), this.f5176b), this.f5177c), this.f5178d ? 1 : 0), 3);
    }

    public String toString() {
        return "{" + this.f5176b + Config.TRACE_TODAY_VISIT_SPLIT + this.f5177c + "}?";
    }
}
