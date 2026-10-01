package a;

public class a extends a.an {

    private final java.lang.String[] f0a;
    private int b;

    public a(java.lang.String[] r2, java.io.File r3) {
        super(r3);
        this.b = 0;
        this.f0a = r2;
    }

    @Override
    protected java.lang.String a() {
        if (this.b >= this.f0a.length) goto L6;
        java.lang.String[] r0 = this.f0a;
        int r1 = this.b;
        this.b = r1 + 1;
        return r0[r1];
    L6:
        return null;
    }

    @Override
    protected java.lang.String b() {
        return "argument number " + this.b;
    }
}
