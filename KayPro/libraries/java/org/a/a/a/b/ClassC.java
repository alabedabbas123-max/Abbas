package org.a.a.a.b;

import com.baidu.mobstat.Config;
import java.util.Arrays;
import org.a.a.a.Interfacead;

public class ClassC {

    private final ClassA f5252a;

    private final Interfacead f5253b;

    public ClassC(ClassA c1758a, Interfacead interfaceC1754ad) {
        this.f5252a = c1758a;
        this.f5253b = interfaceC1754ad;
    }

    protected String m7365a(int i) {
        return this.f5253b.mo7360c(i - 1);
    }

    protected String m7366a(ClassD c1761d) {
        String str = String.valueOf(c1761d.f5257d ? Config.TRACE_TODAY_VISIT_SPLIT : "") + "s" + c1761d.f5254a + (c1761d.f5260g ? "^" : "");
        if (c1761d.f5257d) {
            return c1761d.f5261h != null ? String.valueOf(str) + "=>" + Arrays.toString(c1761d.f5261h) : String.valueOf(str) + "=>" + c1761d.f5258e;
        }
        return str;
    }

    public String toString() {
        if (this.f5252a.f5247b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (ClassD c1761d : this.f5252a.m7363a()) {
            int length = c1761d.f5256c != null ? c1761d.f5256c.length : 0;
            for (int i = 0; i < length; i++) {
                ClassD c1761d2 = c1761d.f5256c[i];
                if (c1761d2 != null && c1761d2.f5254a != Integer.MAX_VALUE) {
                    sb.append(m7366a(c1761d));
                    sb.append("-").append(m7365a(i)).append("->").append(m7366a(c1761d2)).append('\n');
                }
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            return null;
        }
        return string;
    }
}
