package abcd;

public final class Qr implements abcd.Interfacels {
    public static final abcd.Qr DW = null;
    public static final abcd.Qr j6 = null;
    private final boolean FH;

    static {
        j6 = new abcd.Qr();
        DW = new abcd.Qr(true);
    }

    private Qr() {
        this.FH = false;
    }

    private Qr(boolean r1) {
        this.FH = r1;
    }

    private int j6(abcd.cs r5) {
        int r0 = r5.size();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r2 = r2 + r5.get(r1).Hw();
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    @Override
    public int j6() {
        return 16;
    }

    @Override
    public boolean j6(abcd.es r4, abcd.bs r5, abcd.bs r6) {
        if (r5.getType() == abcd.Qs.VH) goto L6;
        return false;
    L6:
        if ((r6.J8() instanceof abcd.ys) == false) goto L8;
        abcd.ys r7 = (abcd.ys) r6.J8();
        switch(r4.Hw()) {
            case 14: goto L22;
            case 15: goto L20;
            case 16: goto L22;
            case 17: goto L22;
            case 18: goto L22;
            case 19: goto L16;
            case 20: goto L22;
            case 21: goto L22;
            case 22: goto L22;
            case 23: goto L18;
            case 24: goto L18;
            case 25: goto L18;
            default: goto L16;
        };
    L16:
        return false;
    L18:
        return r7.we();
    L20:
        return abcd.ys.j6(-r7.rN()).VH();
    L22:
        return r7.VH();
    L8:
        if ((r5.J8() instanceof abcd.ys) == true) goto L10;
    L13:
        return false;
    L10:
        if (r4.Hw() != 15) goto L13;
        return ((abcd.ys) r5.J8()).VH();
    }

    @Override
    public boolean j6(abcd.es r2, abcd.cs r3) {
        if (this.FH == false) goto L5;
    L9:
        return false;
    L5:
        if (r2.VH() == false) goto L9;
        if (j6(r3) < 6) goto L9;
        return true;
    }
}
