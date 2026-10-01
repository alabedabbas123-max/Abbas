package abcd;

class KM implements java.util.Enumeration {
    private java.lang.Object DW;
    private abcd.C1419vL j6;

    public KM(byte[] r3) {
        this.j6 = new abcd.C1419vL(r3, true);
        this.DW = j6();
    }

    private java.lang.Object j6() {
        return this.j6.Hw();
    L4:
        e = move-exception;
        throw new abcd.DL("malformed DER construction: " + e, e);
    }

    @Override
    public boolean hasMoreElements() {
        if (this.DW == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    public java.lang.Object nextElement() {
        java.lang.Object r0 = this.DW;
        this.DW = j6();
        return r0;
    }
}
