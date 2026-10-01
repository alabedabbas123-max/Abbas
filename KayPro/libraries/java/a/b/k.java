package a.b;

public class k implements a.b.c {
    private static final int[] q = null;
    private static final a.b.l[] r = null;
    private static final a.b.n[] s = null;
    private static final a.b.a.a[] t = null;

    public int f132a;
    public int b;
    public a.b.b.b[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int[] h;
    public int i;
    public a.b.l[] j;
    public int k;
    public a.b.n[] l;
    public int m;
    public a.b.a.a[] n;
    public a.b.c[] o;
    public java.lang.Object p;

    static {
        q = new int[0];
        r = new a.b.l[0];
        s = new a.b.n[0];
        t = new a.b.a.a[0];
    }

    public k() {
    }

    public k(int r17, int r18, a.b.b.b[] r19, int r20, int r21, int r22) {
        this(r17, r18, r19, r20, r21, r22, 0, q, 0, r, 0, s, 0, t, null);
    }

    public k(int r1, int r2, a.b.b.b[] r3, int r4, int r5, int r6, int r7, int[] r8, int r9, a.b.l[] r10, int r11, a.b.n[] r12, int r13, a.b.a.a[] r14, a.b.c[] r15) {
        this.f132a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
        this.k = r11;
        this.l = r12;
        this.m = r13;
        this.n = r14;
        this.o = r15;
    }

    @Override
    public int a() {
        return this.d;
    }

    @Override
    public a.b.d a(java.lang.String r4, java.lang.String r5) {
        int r0 = 0;
    L4:
        if (r0 >= this.i) goto L15;
        a.b.d r1 = this.j[r0];
        if (r4 != null) goto L8;
    L9:
        if (r5 == null) goto L13;
        if (r1.b(this).equals(r5) == true) goto L13;
    L14:
        r0 = r0 + 1;
    L13:
        return r1;
    L8:
        if (r1.a(this).equals(r4) == false) goto L14;
    L15:
        return null;
    }

    @Override
    public java.lang.String a(int r2) {
        return e(this.h[r2]);
    }

    @Override
    public void a(int r2, a.b.b.a.f r3) {
        this.c[r2].a(this, r3);
    }

    @Override
    public void a(a.b.a.d.i r3) {
        int r0 = 0;
    L4:
        if (r0 >= this.m) goto L6;
        this.n[r0].a(this, r3);
        r0 = r0 + 1;
        goto L4
    }

    @Override
    public void a(a.b.b.a.f r3) {
        int r0 = 1;
    L4:
        if (r0 >= this.b) goto L9;
        if (this.c[r0] == null) goto L8;
        this.c[r0].a(this, r3);
    L8:
        r0 = r0 + 1;
        goto L4
    }

    @Override
    public void a(a.b.c r5) {
        if (this.o != null) goto L7;
        this.o = new a.b.c[1];
    L5:
        this.o[this.o.length - 1] = r5;
        return;
    L7:
        a.b.c[] r0 = new a.b.c[this.o.length + 1];
        java.lang.System.arraycopy(this.o, 0, r0, 0, this.o.length);
        this.o = r0;
        goto L5
    }

    @Override
    public void a(a.b.g.aq r3) {
        int r0 = 0;
    L4:
        if (r0 >= this.i) goto L6;
        this.j[r0].a(this, r3);
        r0 = r0 + 1;
        goto L4
    }

    @Override
    public void a(a.b.g.s r1) {
        r1.a(this);
    }

    @Override
    public void a(java.lang.Object r1) {
        this.p = r1;
    }

    @Override
    public void a(java.lang.String r2, java.lang.String r3, a.b.g.aq r4) {
        a.b.j r0 = b(r2, r3);
        if (r0 == null) goto L6;
        r0.a(this, r4);
        return;
    }

    @Override
    public void a(boolean r10, boolean r11, boolean r12, boolean r13, a.b.g.s r14) {
        if (r10 == false) goto L5;
        a(r14);
    L5:
        if (r11 == false) goto L9;
        a.b.c r0 = e();
        if (r0 == null) goto L9;
        r0.a(true, true, r12, false, r14);
    L9:
        if (r12 == false) goto L21;
        if (r11 == true) goto L14;
        a.b.c r3 = e();
        if (r3 == null) goto L14;
        r3.a(false, false, true, false, r14);
    L14:
        int r6 = 0;
    L16:
        if (r6 >= this.g) goto L21;
        a.b.c r1 = k(r6);
        if (r1 == null) goto L20;
        r1.a(true, false, true, false, r14);
    L20:
        r6 = r6 + 1;
    L21:
        if (r13 == true) goto L23;
        return;
    L23:
        if (this.o == null) goto L33;
        int r2 = 0;
    L26:
        if (r2 >= this.o.length) goto L34;
        this.o[r2].a(true, false, false, true, r14);
        r2 = r2 + 1;
        goto L26
    L34:
        return;
    }

    public boolean a(a.b.j r3) {
        if ((this.d & 16) != 0) goto L11;
        if (r3 != null) goto L6;
    L9:
        return true;
    L6:
        if ((r3.a() & 26) != 0) goto L11;
        if (r3.a(this).equals("<init>") == false) goto L9;
    L11:
        return false;
    }

    @Override
    public boolean a(java.lang.String r3) {
        if (b().equals(r3) == false) goto L5;
        return true;
    L5:
        a.b.c r1 = e();
        if (r1 != null) goto L8;
    L9:
        return false;
    L8:
        if (r1.a(r3) == false) goto L9;
        return true;
    }

    @Override
    public int b(int r2) {
        return this.c[r2].a();
    }

    @Override
    public a.b.j b(java.lang.String r4, java.lang.String r5) {
        int r0 = 0;
    L4:
        if (r0 >= this.k) goto L15;
        a.b.j r1 = this.l[r0];
        if (r4 != null) goto L8;
    L9:
        if (r5 == null) goto L13;
        if (r1.b(this).equals(r5) == true) goto L13;
    L14:
        r0 = r0 + 1;
    L13:
        return r1;
    L8:
        if (r1.a(this).equals(r4) == false) goto L14;
    L15:
        return null;
    }

    @Override
    public java.lang.String b() {
        return e(this.e);
    }

    @Override
    public void b(a.b.b.a.f r3) {
        if (this.f == 0) goto L6;
        this.c[this.f].a(this, r3);
        return;
    }

    @Override
    public void b(a.b.g.aq r3) {
        int r0 = 0;
    L4:
        if (r0 >= this.k) goto L6;
        this.l[r0].a(this, r3);
        r0 = r0 + 1;
        goto L4
    }

    public void b(a.b.g.s r3) {
        if (this.o == null) goto L8;
        int r0 = 0;
    L6:
        if (r0 >= this.o.length) goto L10;
        this.o[r0].a(r3);
        r0 = r0 + 1;
        goto L6
    L10:
        return;
    }

    public void b(java.lang.String r2, java.lang.String r3, a.b.g.aq r4) {
        a.b.d r0 = a(r2, r3);
        if (r0 == null) goto L6;
        r0.a(this, r4);
        return;
    }

    @Override
    public boolean b(a.b.c r3) {
        if (equals(r3) == false) goto L5;
        return true;
    L5:
        a.b.c r1 = e();
        if (r1 != null) goto L8;
    L9:
        return false;
    L8:
        if (r1.b(r3) == false) goto L9;
        return true;
    }

    @Override
    public java.lang.String c() {
        if (this.f != 0) goto L7;
        return null;
    L7:
        return e(this.f);
    }

    @Override
    public java.lang.String c(int r5) {
        return ((a.b.b.s) this.c[r5]).c();
    L4:
        e = move-exception;
        throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected Utf8Constant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
    }

    @Override
    public void c(a.b.b.a.f r4) {
        int r0 = 0;
    L4:
        if (r0 >= this.g) goto L6;
        this.c[this.h[r0]].a(this, r4);
        r0 = r0 + 1;
        goto L4
    }

    @Override
    public boolean c(a.b.c r5) {
        if (equals(r5) == true) goto L5;
        a.b.c r0 = e();
        if (r0 != null) goto L9;
    L11:
        int r1 = 0;
    L13:
        if (r1 >= this.g) goto L26;
        a.b.c r3 = k(r1);
        if (r3 == null) goto L19;
        if (r3.c(r5) == false) goto L19;
        return true;
    L19:
        r1 = r1 + 1;
        goto L13
    L26:
        return false;
    L9:
        if (r0.c(r5) == false) goto L11;
        return true;
    L5:
        return true;
    }

    @Override
    public int d() {
        return this.g;
    }

    @Override
    public java.lang.String d(int r5) {
        return ((a.b.b.r) this.c[r5]).a(this);
    L4:
        e = move-exception;
        throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected StringConstant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
    }

    public void d(a.b.b.a.f r3) {
        this.c[this.e].a(this, r3);
    }

    @Override
    public a.b.c e() {
        if (this.f != 0) goto L5;
        return null;
    L5:
        return ((a.b.b.a) this.c[this.f]).b;
    }

    @Override
    public java.lang.String e(int r5) {
        return ((a.b.b.a) this.c[r5]).a(this);
    L4:
        e = move-exception;
        throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected ClassConstant at index [" + r5 + "]").initCause(e));
    }

    @Override
    public java.lang.Object f() {
        return this.p;
    }

    @Override
    public java.lang.String f(int r5) {
        return ((a.b.b.n) this.c[r5]).a(this);
    L4:
        e = move-exception;
        throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected NameAndTypeConstant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
    }

    @Override
    public java.lang.String g(int r5) {
        return ((a.b.b.n) this.c[r5]).b(this);
    L4:
        e = move-exception;
        throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected NameAndTypeConstant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
    }

    @Override
    public java.lang.String h(int r5) {
        return ((a.b.b.q) this.c[r5]).a(this);
    L4:
        e = move-exception;
        throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected RefConstant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
    }

    @Override
    public java.lang.String i(int r5) {
        return ((a.b.b.q) this.c[r5]).b(this);
    L4:
        e = move-exception;
        throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected RefConstant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
    }

    @Override
    public java.lang.String j(int r5) {
        return ((a.b.b.q) this.c[r5]).c(this);
    L4:
        e = move-exception;
        throw ((java.lang.IllegalStateException) new java.lang.IllegalStateException("Expected RefConstant at index [" + r5 + "] in class [" + b() + "]").initCause(e));
    }

    @Override
    public a.b.c k(int r3) {
        return ((a.b.b.a) this.c[this.h[r3]]).b;
    }

    public a.b.b.b l(int r2) {
        return this.c[r2];
    }

    public java.lang.String toString() {
        return "ProgramClass(" + b() + ")";
    }
}
