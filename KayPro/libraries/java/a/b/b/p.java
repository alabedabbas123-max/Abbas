package a.b.b;

public class p extends a.b.b.b {

    public java.lang.Object f98a;

    public p() {
    }

    public p(java.lang.Object r1) {
        this.f98a = r1;
    }

    @Override
    public int a() {
        return 21;
    }

    @Override
    public void a(a.b.c r1, a.b.b.a.f r2) {
        r2.a(r1, this);
    }

    public void a(a.b.c r8, a.b.b.a.i r9) {
        int r1 = 0;
        if ((this.f98a instanceof boolean[]) == false) goto L9;
        boolean[] r0 = (boolean[]) this.f98a;
    L6:
        if (r1 >= r0.length) goto L59;
        r9.a(r8, this, r1, r0[r1]);
        r1 = r1 + 1;
        goto L6
    L59:
        return;
    L9:
        if ((this.f98a instanceof byte[]) == false) goto L15;
        byte[] r2 = (byte[]) this.f98a;
    L12:
        if (r1 >= r2.length) goto L60;
        r9.a(r8, this, r1, r2[r1]);
        r1 = r1 + 1;
        goto L12
    L60:
        return;
    L15:
        if ((this.f98a instanceof char[]) == false) goto L21;
        char[] r3 = (char[]) this.f98a;
    L18:
        if (r1 >= r3.length) goto L61;
        r9.a(r8, this, r1, r3[r1]);
        r1 = r1 + 1;
        goto L18
    L61:
        return;
    L21:
        if ((this.f98a instanceof short[]) == false) goto L27;
        short[] r4 = (short[]) this.f98a;
    L24:
        if (r1 >= r4.length) goto L62;
        r9.a(r8, this, r1, r4[r1]);
        r1 = r1 + 1;
        goto L24
    L62:
        return;
    L27:
        if ((this.f98a instanceof int[]) == false) goto L33;
        int[] r5 = (int[]) this.f98a;
    L30:
        if (r1 >= r5.length) goto L63;
        r9.a(r8, this, r1, r5[r1]);
        r1 = r1 + 1;
        goto L30
    L63:
        return;
    L33:
        if ((this.f98a instanceof float[]) == false) goto L39;
        float[] r6 = (float[]) this.f98a;
    L36:
        if (r1 >= r6.length) goto L64;
        r9.a(r8, this, r1, r6[r1]);
        r1 = r1 + 1;
        goto L36
    L64:
        return;
    L39:
        if ((this.f98a instanceof long[]) == false) goto L45;
        long[] r7 = (long[]) this.f98a;
        int r10 = 0;
    L42:
        if (r10 >= r7.length) goto L65;
        r9.a(r8, this, r10, r7[r10]);
        r10 = r10 + 1;
        goto L42
    L65:
        return;
    L45:
        if ((this.f98a instanceof double[]) == false) goto L50;
        double[] r11 = (double[]) this.f98a;
        int r12 = 0;
    L48:
        if (r12 >= r11.length) goto L66;
        r9.a(r8, this, r12, r11[r12]);
        r12 = r12 + 1;
        goto L48
    L66:
        return;
    }

    public char b() {
        if ((this.f98a instanceof boolean[]) == false) goto L7;
        return 'Z';
    L7:
        if ((this.f98a instanceof byte[]) == false) goto L10;
        return 'B';
    L10:
        if ((this.f98a instanceof char[]) == false) goto L13;
        return 'C';
    L13:
        if ((this.f98a instanceof short[]) == false) goto L16;
        return 'S';
    L16:
        if ((this.f98a instanceof int[]) == false) goto L19;
        return 'I';
    L19:
        if ((this.f98a instanceof float[]) == false) goto L22;
        return 'F';
    L22:
        if ((this.f98a instanceof long[]) == false) goto L25;
        return 'J';
    L25:
        if ((this.f98a instanceof double[]) == false) goto L27;
        return 'D';
    L27:
        return 0;
    }

    public int c() {
        if ((this.f98a instanceof boolean[]) == false) goto L7;
        return ((boolean[]) this.f98a).length;
    L7:
        if ((this.f98a instanceof byte[]) == false) goto L10;
        return ((byte[]) this.f98a).length;
    L10:
        if ((this.f98a instanceof char[]) == false) goto L13;
        return ((char[]) this.f98a).length;
    L13:
        if ((this.f98a instanceof short[]) == false) goto L16;
        return ((short[]) this.f98a).length;
    L16:
        if ((this.f98a instanceof int[]) == false) goto L19;
        return ((int[]) this.f98a).length;
    L19:
        if ((this.f98a instanceof float[]) == false) goto L22;
        return ((float[]) this.f98a).length;
    L22:
        if ((this.f98a instanceof long[]) == false) goto L25;
        return ((long[]) this.f98a).length;
    L25:
        if ((this.f98a instanceof double[]) == true) goto L34;
        return 0;
    L34:
        return ((double[]) this.f98a).length;
    }

    public java.lang.Object d() {
        return this.f98a;
    }
}
