package abcd;

public final class Yo {
    private static final abcd.Ks DW = null;
    private static final abcd.Ks FH = null;
    private static final abcd.Ks Hw = null;
    private static final abcd.Ks VH = null;
    private static final abcd.Ks Zo = null;
    private static final abcd.Js gn = null;
    private static final abcd.Ks j6 = null;
    private static final abcd.Js tp = null;
    private static final abcd.Js u7 = null;
    private static final abcd.Ks v5 = null;

    static {
        j6 = abcd.Ks.DW(abcd.Qs.j6("Ldalvik/annotation/AnnotationDefault;"));
        DW = abcd.Ks.DW(abcd.Qs.j6("Ldalvik/annotation/EnclosingClass;"));
        FH = abcd.Ks.DW(abcd.Qs.j6("Ldalvik/annotation/EnclosingMethod;"));
        Hw = abcd.Ks.DW(abcd.Qs.j6("Ldalvik/annotation/InnerClass;"));
        v5 = abcd.Ks.DW(abcd.Qs.j6("Ldalvik/annotation/MemberClasses;"));
        Zo = abcd.Ks.DW(abcd.Qs.j6("Ldalvik/annotation/Signature;"));
        VH = abcd.Ks.DW(abcd.Qs.j6("Ldalvik/annotation/Throws;"));
        gn = new abcd.Js("accessFlags");
        u7 = new abcd.Js("name");
        tp = new abcd.Js("value");
    }

    public static abcd.Hr DW(abcd.Ss r3) {
        abcd.ps r4 = FH(r3);
        abcd.Hr r0 = new abcd.Hr(VH, abcd.Ir.FH);
        r0.DW(new abcd.Lr(tp, r4));
        r0.we();
        return r0;
    }

    private static abcd.ps FH(abcd.Ss r4) {
        int r0 = r4.size();
        abcd.ps.a r1 = new abcd.ps.a(r0);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1.j6(r2, abcd.Ks.DW(r4.getType(r2)));
        r2 = r2 + 1;
        goto L3
    L5:
        r1.we();
        return new abcd.ps(r1);
    }

    public static abcd.Hr j6(abcd.Gs r3) {
        abcd.Hr r0 = new abcd.Hr(FH, abcd.Ir.FH);
        r0.DW(new abcd.Lr(tp, r3));
        r0.we();
        return r0;
    }

    public static abcd.Hr j6(abcd.Hr r4) {
        abcd.Hr r0 = new abcd.Hr(j6, abcd.Ir.FH);
        r0.DW(new abcd.Lr(tp, new abcd.os(r4)));
        r0.we();
        return r0;
    }

    public static abcd.Hr j6(abcd.Js r8) {
        abcd.Hr r0 = new abcd.Hr(Zo, abcd.Ir.FH);
        java.lang.String r9 = r8.we();
        int r1 = r9.length();
        java.util.ArrayList r2 = new java.util.ArrayList(20);
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L20;
        int r6 = r4 + 1;
        if (r9.charAt(r4) != 'L') goto L14;
    L6:
        if (r6 >= r1) goto L19;
        char r5 = r9.charAt(r6);
        if (r5 == ';') goto L9;
        if (r5 == '<') goto L19;
        r6 = r6 + 1;
        goto L6
    L9:
        r6 = r6 + 1;
    L19:
        r2.add(r9.substring(r4, r6));
        r4 = r6;
    L14:
        if (r6 >= r1) goto L19;
        if (r9.charAt(r6) == 'L') goto L19;
        r6 = r6 + 1;
        goto L14
    L20:
        int r10 = r2.size();
        abcd.ps.a r7 = new abcd.ps.a(r10);
    L21:
        if (r3 >= r10) goto L23;
        r7.j6(r3, new abcd.Js((java.lang.String) r2.get(r3)));
        r3 = r3 + 1;
        goto L21
    L23:
        r7.we();
        r0.DW(new abcd.Lr(tp, new abcd.ps(r7)));
        r0.we();
        return r0;
    }

    public static abcd.Hr j6(abcd.Js r3, int r4) {
        abcd.Hr r0 = new abcd.Hr(Hw, abcd.Ir.FH);
        abcd.Abstractms r5 = r3;
        if (r3 != null) goto L6;
        r5 = abcd.As.j6;
    L6:
        r0.DW(new abcd.Lr(u7, r5));
        r0.DW(new abcd.Lr(gn, abcd.ys.j6(r4)));
        r0.we();
        return r0;
    }

    public static abcd.Hr j6(abcd.Ks r3) {
        abcd.Hr r0 = new abcd.Hr(DW, abcd.Ir.FH);
        r0.DW(new abcd.Lr(tp, r3));
        r0.we();
        return r0;
    }

    public static abcd.Hr j6(abcd.Ss r3) {
        abcd.ps r4 = FH(r3);
        abcd.Hr r0 = new abcd.Hr(v5, abcd.Ir.FH);
        r0.DW(new abcd.Lr(tp, r4));
        r0.we();
        return r0;
    }
}
