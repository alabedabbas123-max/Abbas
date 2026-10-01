package abcd;

class PE extends abcd.RE.b {
    final abcd.RE DW;

    PE(abcd.RE r2) {
        this.DW = r2;
        super(r2, null);
    }

    @Override
    abcd.RE.a j6(abcd.RE.a r2) {
        if (r2 != abcd.RE.a.FH) goto L6;
        return r2;
    L6:
        return this.DW.DW(r2);
    }
}
