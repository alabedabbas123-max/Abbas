package abcd;

class kt implements abcd.Abstractvt.a {
    final java.util.HashSet DW;
    final abcd.lt FH;
    final abcd.bs[] j6;

    kt(abcd.lt r1, abcd.bs[] r2, java.util.HashSet r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public void DW(abcd.mt r6) {
        if (r6.v5().Hw() == 3) goto L5;
        return;
    L5:
        int r0 = abcd.lt.j6(this.FH, r6);
        abcd.bs[] r1 = this.j6;
        if (r1[r0] != null) goto L8;
        r1[r0] = r6.u7();
        return;
    L8:
        abcd.bs r2 = r1[r0];
        abcd.bs r3 = r6.u7();
        abcd.Vr r4 = r2.Zo();
        abcd.Vr r5 = r3.Zo();
        if (r4 != null) goto L11;
        r4 = r5;
    L15:
        abcd.lt.j6(this.FH).FH(r2.we()).j6(r4);
        abcd.jt r7 = new abcd.jt(this, r3, r2);
        java.util.List<abcd.Abstractvt> r8 = abcd.lt.j6(this.FH).Hw(r3.we());
        int r9 = r8.size() - 1;
    L16:
        if (r9 < 0) goto L18;
        r8.get(r9).DW(r7);
        r9 = r9 - 1;
        goto L16
    L18:
        this.DW.add(r6);
        return;
    L11:
        if (r5 == null) goto L15;
        if (r4.equals(r5) == true) goto L15;
    }

    @Override
    public void j6(abcd.mt r1) {
    }

    @Override
    public void j6(abcd.ot r1) {
    }
}
