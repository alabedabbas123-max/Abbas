package a.b.a;

public class y extends a.b.a.a {
    public final int c;
    public byte[] d;

    public y(int r2, int r3) {
        this(r2, r3, null);
    }

    public y(int r1, int r2, byte[] r3) {
        super(r1);
        this.c = r2;
        this.d = r3;
    }

    @Override
    public void a(a.b.c r1, a.b.a.d.i r2) {
        r2.a(r1, this);
    }

    @Override
    public void a(a.b.c r1, a.b.d r2, a.b.a.d.i r3) {
        r3.a(r1, this);
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d.i r3) {
        r3.a(r1, this);
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d r3, a.b.a.d.i r4) {
        r4.a(r1, this);
    }
}
