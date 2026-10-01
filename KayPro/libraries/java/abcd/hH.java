package abcd;

class hH extends abcd.AbstractgH {
    hH(java.io.OutputStream r1) {
        super(r1);
    }

    static boolean j6(abcd.CI r5) {
        if ((r5.getOffset() >>> 1) >= 2147483647L) goto L5;
        return true;
    L5:
        return false;
    }

    @Override
    protected void FH() {
        DW();
        java.util.Iterator<? extends abcd.CI> r0 = this.Hw.iterator();
    L4:
        if (r0.hasNext() == false) goto L5;
        abcd.CI r1 = r0.next();
        if (j6(r1) == false) goto L11;
        abcd.FK.DW(this.FH, 0, (int) r1.getOffset());
        r1.DW(this.FH, 4);
        this.DW.write(this.FH);
        goto L4
    L11:
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packTooLargeForIndexVersion1);
    L5:
        j6();
    }
}
