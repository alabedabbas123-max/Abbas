package abcd;

abstract class MM extends java.io.InputStream {
    private int DW;
    protected final java.io.InputStream j6;

    MM(java.io.InputStream r1, int r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    int j6() {
        return this.DW;
    }

    protected void j6(boolean r3) {
        java.io.InputStream r0 = this.j6;
        if ((r0 instanceof abcd.JM) == false) goto L6;
        ((abcd.JM) r0).DW(r3);
        return;
    }
}
