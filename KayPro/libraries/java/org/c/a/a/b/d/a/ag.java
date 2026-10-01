package org.c.a.a.b.d.a;

import java.util.List;

public class ag {

    protected String f5635a;

    protected List f5636b;

    public ag(String str, List list) {
        this.f5635a = str;
        this.f5636b = list;
    }

    public String m7889a() {
        return this.f5635a;
    }

    public List m7890b() {
        return this.f5636b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceInfo{interfaceTypeName=").append(this.f5635a);
        if (this.f5636b != null) {
            sb.append(", implementationTypeNames=").append(this.f5636b);
        }
        return sb.append("}").toString();
    }
}
