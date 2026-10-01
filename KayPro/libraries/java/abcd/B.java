package abcd;

public class B {
    private static final abcd.B.a j6 = null;
    private final java.lang.Object DW;

    interface a {
    }

    private static class b extends abcd.B.d {
        b() {
        }
    }

    private static class c extends abcd.B.d {
        c() {
        }
    }

    static class d implements abcd.B.a {
        d() {
        }
    }

    static {
        int r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < 19) goto L6;
        j6 = new abcd.B.c();
        return;
    L6:
        if (r0 < 16) goto L8;
        j6 = new abcd.B.b();
        return;
    L8:
        j6 = new abcd.B.d();
    }

    public B(java.lang.Object r1) {
        this.DW = r1;
    }

    public java.lang.Object j6() {
        return this.DW;
    }
}
