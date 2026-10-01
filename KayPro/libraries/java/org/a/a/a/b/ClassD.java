package org.a.a.a.b;

import com.baidu.mobstat.Config;
import java.util.Arrays;
import org.a.a.a.a.ae;
import org.a.a.a.a.ClassC;
import org.a.a.a.c.ClassK;

public class ClassD {

    public int f5254a;

    public ClassC f5255b;

    public ClassD[] f5256c;

    public boolean f5257d;

    public int f5258e;

    public ae f5259f;

    public boolean f5260g;

    public ClassE[] f5261h;

    public ClassD() {
        this.f5254a = -1;
        this.f5255b = new ClassC();
        this.f5257d = false;
    }

    public ClassD(ClassC c1727c) {
        this.f5254a = -1;
        this.f5255b = new ClassC();
        this.f5257d = false;
        this.f5255b = c1727c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClassD) {
            return this.f5255b.equals(((ClassD) obj).f5255b);
        }
        return false;
    }

    public int hashCode() {
        return ClassK.m7408b(ClassK.m7406a(ClassK.m7405a(7), this.f5255b.hashCode()), 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5254a).append(Config.TRACE_TODAY_VISIT_SPLIT).append(this.f5255b);
        if (this.f5257d) {
            sb.append("=>");
            if (this.f5261h != null) {
                sb.append(Arrays.toString(this.f5261h));
            } else {
                sb.append(this.f5258e);
            }
        }
        return sb.toString();
    }
}
