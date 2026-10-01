package a;

public class ai {

    private final java.io.PrintWriter f17a;

    public ai(java.io.PrintWriter r1) {
        this.f17a = r1;
    }

    public void a(a.h r9, a.b.b r10, a.b.b r11) {
        if (r9.i == null) goto L5;
        r10.a(new a.b.g.g());
        r11.a(new a.b.g.g());
        a.g.f r2 = new a.g.f();
        a.b.g.n r0 = new a.ab(true, true, true).a(r9.i, r2, r2, r2, null);
        r10.a(r0);
        r11.a(r0);
        a.b.g.bl r1 = new a.b.g.bl(false, this.f17a);
        r10.b(new a.b.g.at(new a.b.g.s[]{new a.g.g(r1), new a.b.g.c(new a.g.h(r1))}));
        return;
    L5:
        throw new java.io.IOException("You have to specify '-keep' options for the shrinking step.");
    }
}
