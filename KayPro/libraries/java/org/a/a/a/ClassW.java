package org.a.a.a;

import java.util.List;

public class ClassW {

    public static final ClassR f5364a = new ClassR();

    public ClassW f5365b;

    public int f5366c = -1;

    public String m7479a(List list, ClassW c1797w) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (this != null && this != c1797w) {
            if (list != null) {
                int iM7481b = this.m7481b();
                sb.append((iM7481b < 0 || iM7481b >= list.size()) ? Integer.toString(iM7481b) : (String) list.get(iM7481b));
            } else if (!this.m7480a()) {
                sb.append(this.f5366c);
            }
            if (this.f5365b != null && (list != null || !this.f5365b.m7480a())) {
                sb.append(" ");
            }
            this = this.f5365b;
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean m7480a() {
        return this.f5366c == -1;
    }

    public int m7481b() {
        return -1;
    }

    public String toString() {
        return m7479a(null, null);
    }
}
