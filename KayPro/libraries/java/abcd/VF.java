package abcd;

final class VF extends abcd.XF {
    private final abcd.XF j6;

    VF(abcd.XF r1) {
        this.j6 = r1;
    }

    @Override
    int DW() {
        return this.j6.DW();
    }

    @Override
    abcd.dG j6() {
    L2:
        abcd.dG r0 = this.j6.j6();
        if (r0 == null) goto L4;
        if ((r0.EQ & 4) != 0) goto L2;
        return r0;
    L4:
        return null;
    }
}
