package a.b.a;

public class h implements a.b.o {

    public int f73a;
    public int b;
    public int c;
    public int d;
    public java.lang.Object e;

    public h() {
    }

    public h(int r1, int r2, int r3, int r4) {
        this.f73a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    @Override
    public void a(java.lang.Object r1) {
        this.e = r1;
    }

    public boolean a(int r2) {
        if (r2 >= this.f73a) goto L5;
    L8:
        return false;
    L5:
        if (r2 >= this.b) goto L8;
        return true;
    }

    public boolean a(int r2, int r3) {
        if (this.f73a < r3) goto L5;
    L8:
        return false;
    L5:
        if (this.b <= r2) goto L8;
        return true;
    }

    @Override
    public java.lang.Object f() {
        return this.e;
    }
}
