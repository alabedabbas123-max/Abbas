package abcd;

class RH implements java.util.Comparator<abcd.MH> {
    final abcd.TH j6;

    RH(abcd.TH r1) {
        this.j6 = r1;
    }

    @Override
    public int compare(abcd.MH r1, abcd.MH r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.MH r3, abcd.MH r4) {
        boolean r0 = r3.vy();
        boolean r1 = r4.vy();
        int r2 = (r0 ? 1 : 0) - (r1 ? 1 : 0);
        if (r2 == 0) goto L5;
        return r2;
    L5:
        int r5 = r3.yS() - r4.yS();
        if (r5 == 0) goto L8;
        return r5;
    L8:
        int r6 = (r3.er() >>> 1) - (r4.er() >>> 1);
        if (r6 == 0) goto L11;
        return r6;
    L11:
        int r7 = (r3.er() & 1) - (r4.er() & 1);
        if (r7 == 0) goto L14;
        return r7;
    L14:
        int r8 = (!r3.P8() ? 1 : 0) - (!r4.P8() ? 1 : 0);
        if (r8 == 0) goto L18;
        return r8;
    L18:
        return r4.gW() - r3.gW();
    }
}
