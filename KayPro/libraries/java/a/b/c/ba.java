package a.b.c;

public class ba extends a.b.f.w implements a.b.a.d.i {
    public ba() {
    }

    @Override
    public void a(a.b.c r1, a.b.a.a r2) {
    }

    @Override
    public void a(a.b.c r9, a.b.j r10, a.b.a.d r11, a.b.a.n r12) {
        int r0 = 0;
        a.b.a.m[] r3 = r12.d;
        int r4 = r12.c;
        int r2 = 0;
    L3:
        if (r2 >= r4) goto L15;
        a.b.a.m r5 = r3[r2];
        int r1 = r5.b;
        int r6 = r5.c;
        if (r1 >= r11.e) goto L14;
        if (r2 != (r4 - 1)) goto L9;
    L10:
        if (r2 != 0) goto L12;
    L13:
        r3[r0] = r5;
        r0 = r0 + 1;
        goto L14
    L12:
        if (r6 == r3[r2 - 1].c) goto L14;
    L9:
        if (r1 < r3[r2 + 1].b) goto L10;
    L14:
        r2 = r2 + 1;
        goto L3
    L15:
        java.util.Arrays.fill(r3, r0, r12.c, null);
        r12.c = r0;
    }
}
