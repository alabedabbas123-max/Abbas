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
        int r0 = 0;
        abcd.ps.a r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r4.size();
                    r1 = new abcd.ps.a(r0);
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r0) { $pc0 = 5; continue $sw0; }
                    r1.j6(r2, abcd.Ks.DW(r4.getType(r2)));
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    r1.we();
                    return new abcd.ps(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        abcd.Hr r0 = null;
        java.lang.String r9 = null;
        int r1 = 0;
        java.util.ArrayList r2 = null;
        int r3 = 0;
        int r4 = 0;
        int r6 = 0;
        char r5 = 0;
        int r10 = 0;
        abcd.ps.a r7 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new abcd.Hr(Zo, abcd.Ir.FH);
                    r9 = r8.we();
                    r1 = r9.length();
                    r2 = new java.util.ArrayList(20);
                    r3 = 0;
                    r4 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r4 >= r1) { $pc1 = 20; continue $sw1; }
                    r6 = r4 + 1;
                    if (r9.charAt(r4) != 'L') { $pc1 = 14; continue $sw1; }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r6 >= r1) { $pc1 = 19; continue $sw1; }
                    r5 = r9.charAt(r6);
                    if (r5 == ';') { $pc1 = 9; continue $sw1; }
                    if (r5 == '<') { $pc1 = 19; continue $sw1; }
                    r6 = r6 + 1;
                    { $pc1 = 6; continue $sw1; }
                }
                case 9: {
                    r6 = r6 + 1;
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    r2.add(r9.substring(r4, r6));
                    r4 = r6;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    if (r6 >= r1) { $pc1 = 19; continue $sw1; }
                    if (r9.charAt(r6) == 'L') { $pc1 = 19; continue $sw1; }
                    r6 = r6 + 1;
                    { $pc1 = 14; continue $sw1; }
                }
                case 20: {
                    r10 = r2.size();
                    r7 = new abcd.ps.a(r10);
                    $pc1 = 21; continue $sw1;
                }
                case 21: {
                    if (r3 >= r10) { $pc1 = 23; continue $sw1; }
                    r7.j6(r3, new abcd.Js((java.lang.String) r2.get(r3)));
                    r3 = r3 + 1;
                    { $pc1 = 21; continue $sw1; }
                }
                case 23: {
                    r7.we();
                    r0.DW(new abcd.Lr(tp, new abcd.ps(r7)));
                    r0.we();
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Hr j6(abcd.Js r3, int r4) {
        abcd.Hr r0 = null;
        abcd.Abstractms r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new abcd.Hr(Hw, abcd.Ir.FH);
                    r5 = r3;
                    if (r3 != null) { $pc2 = 6; continue $sw2; }
                    r5 = abcd.As.j6;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r0.DW(new abcd.Lr(u7, r5));
                    r0.DW(new abcd.Lr(gn, abcd.ys.j6(r4)));
                    r0.we();
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
