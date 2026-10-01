package a.b;

public class b {

    private final java.util.Map f79a;

    public b() {
        this.f79a = new java.util.TreeMap();
    }

    public a.b.c a(java.lang.String r2) {
        return (a.b.c) this.f79a.get(r2);
    }

    public void a() {
        this.f79a.clear();
    }

    public void a(a.b.c r3) {
        this.f79a.put(r3.b(), r3);
    }

    public void a(a.b.g.n r1) {
        r1.a(this);
    }

    public void a(a.b.g.s r3) {
        java.util.Iterator r1 = this.f79a.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((a.b.c) r1.next()).a(r3);
        goto L4
    }

    public void a(java.lang.String r2, a.b.g.s r3) {
        a.b.c r0 = a(r2);
        if (r0 == null) goto L6;
        r0.a(r3);
        return;
    }

    public java.util.Iterator b() {
        return this.f79a.keySet().iterator();
    }

    public void b(a.b.g.s r3) {
        java.util.Iterator r1 = this.f79a.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((a.b.c) r1.next()).a(r3);
        goto L4
    }

    public int c() {
        return this.f79a.size();
    }
}
