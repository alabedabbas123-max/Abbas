package abcd;

class JC implements java.util.Comparator<abcd.QC> {
    JC() {
    }

    @Override
    public int compare(abcd.QC r1, abcd.QC r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.QC r2, abcd.QC r3) {
        int r0 = abcd.KC.j6(r2, r3);
        if (r0 == 0) goto L6;
        return r0;
    L6:
        return r2.VH() - r3.VH();
    }
}
