package a;

public class ad extends a.an {

    private final java.io.LineNumberReader f13a;
    private final java.lang.String b;

    public ad(java.io.LineNumberReader r1, java.lang.String r2, java.io.File r3) {
        super(r3);
        this.f13a = r1;
        this.b = r2;
    }

    @Override
    protected java.lang.String a() {
        return this.f13a.readLine();
    }

    @Override
    protected java.lang.String b() {
        return "line " + this.f13a.getLineNumber() + " of " + this.b;
    }

    @Override
    public void c() {
        super.c();
        if (this.f13a == null) goto L6;
        this.f13a.close();
        return;
    }
}
