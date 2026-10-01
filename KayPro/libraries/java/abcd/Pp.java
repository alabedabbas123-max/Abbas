package abcd;

public final class Pp extends abcd.Abstracttp {
    public Pp(abcd.Ks r1) {
        super(r1);
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.FH;
    }

    @Override
    public int VH() {
        return 4;
    }

    @Override
    public void j6(abcd.jp r2) {
        r2.J8().DW(aM().we());
    }

    @Override
    public void j6(abcd.jp r5, abcd.Lt r6) {
        abcd.Js r0 = aM().we();
        int r7 = r5.J8().j6(r0);
        if (r6.Hw() == false) goto L5;
        r6.j6(0, Ws() + ' ' + r0.aM());
        java.lang.StringBuilder r1 = new java.lang.StringBuilder();
        r1.append("  descriptor_idx: ");
        r1.append(abcd.Yt.gn(r7));
        r6.j6(4, r1.toString());
    L5:
        r6.writeInt(r7);
    }
}
