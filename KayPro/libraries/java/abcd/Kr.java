package abcd;

public final class Kr extends abcd.Xt {
    public static final abcd.Kr FH = null;

    static {
        FH = new abcd.Kr(0);
    }

    public Kr(int r1) {
        super(r1);
    }

    public static abcd.Kr j6(abcd.Kr r5, abcd.Kr r6) {
        int r0 = r5.size();
        if (r0 != r6.size()) goto L10;
        abcd.Kr r1 = new abcd.Kr(r0);
        int r2 = 0;
    L5:
        if (r2 >= r0) goto L7;
        r1.j6(r2, abcd.Jr.j6(r5.get(r2), r6.get(r2)));
        r2 = r2 + 1;
        goto L5
    L7:
        r1.we();
        return r1;
    L10:
        throw new java.lang.IllegalArgumentException("list1.size() != list2.size()");
    }

    public abcd.Jr get(int r1) {
        return (abcd.Jr) DW(r1);
    }

    public void j6(int r1, abcd.Jr r2) {
        r2.Ws();
        j6(r1, r2);
    }
}
