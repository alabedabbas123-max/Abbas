package org.c.a.a.b.a.a;

public class am {

    protected String f5506a;

    protected String[] f5507b;

    public am(String str, String[] strArr) {
        this.f5506a = str;
        this.f5507b = strArr;
    }

    public String m7629a() {
        return this.f5506a;
    }

    public String[] m7630b() {
        return this.f5507b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceInfo{interfaceTypeName=").append(this.f5506a);
        if (this.f5507b != null) {
            sb.append(", implementationTypeNames=").append(this.f5507b);
        }
        return sb.append("}").toString();
    }
}
