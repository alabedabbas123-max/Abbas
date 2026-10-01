package a;

public class aj {

    private final a.h f18a;

    public aj(a.h r1) {
        this.f18a = r1;
    }

    public void a(a.b.b r4) {
        if (this.f18a.T == null) goto L15;
        java.util.HashSet r0 = null;
    L5:
        r4.a(new a.b.g.r(this.f18a.g, r0));
        if (r0 != null) goto L8;
        return;
    L8:
        if (r0.size() <= 0) goto L26;
        a.j.l.a("Warning: some classes have more recent versions (");
        java.util.Iterator r1 = r0.iterator();
    L11:
        if (r1.hasNext() == false) goto L16;
        a.j.l.a(a.b.f.i.d(((java.lang.Integer) r1.next()).intValue()));
        if (r1.hasNext() == false) goto L11;
        a.j.l.a(",");
        goto L11
    L16:
        a.j.l.a(")");
        a.j.l.a("         than the target version (" + a.b.f.i.d(this.f18a.g) + ").");
        if (this.f18a.U == true) goto L27;
        a.j.l.a("         If you are sure this is not a problem,");
        a.j.l.a("         you could try your luck using the '-ignorewarnings' option.");
        throw new java.io.IOException("Please correct the above warnings first.");
    L27:
        return;
    L26:
        return;
    L15:
        r0 = new java.util.HashSet();
        goto L5
    }
}
