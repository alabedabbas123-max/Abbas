package abcd;

public class cL extends java.io.InputStream {
    private static final java.io.InputStream j6 = null;
    private final java.util.LinkedList<java.io.InputStream> DW;

    static {
        j6 = new abcd.bL();
    }

    public cL(java.io.InputStream... r4) {
        this.DW = new java.util.LinkedList();
        int r0 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L4;
        j6(r4[r1]);
        r1 = r1 + 1;
        goto L3
    }

    private void DW() {
        if (this.DW.isEmpty() == true) goto L6;
        this.DW.removeFirst().close();
        return;
    }

    private java.io.InputStream j6() {
        if (this.DW.isEmpty() == false) goto L6;
        return j6;
    L6:
        return this.DW.getFirst();
    }

    @Override
    public int available() {
        return j6().available();
    }

    @Override
    public void close() {
        java.util.Iterator<java.io.InputStream> r0 = this.DW.iterator();
        java.io.IOException e = null;
    L4:
        if (r0.hasNext() == false) goto L5;
        r0.next().close();     // Catch: java.io.IOException -> L10
    L11:
        r0.remove();
    L10:
        e = e;
        goto L11
    L5:
        if (e != null) goto L7;
        return;
    L7:
        throw e;
    }

    public void j6(java.io.InputStream r2) {
        this.DW.add(r2);
    }

    @Override
    public int read() {
    L2:
        java.io.InputStream r0 = j6();
        int r1 = r0.read();
        if (r1 >= 0) goto L4;
        if (r0 == j6) goto L7;
        DW();
        goto L2
    L7:
        return -1;
    L4:
        return r1;
    }

    @Override
    public int read(byte[] r4, int r5, int r6) {
        int r0 = 0;
    L3:
        if (r6 <= 0) goto L16;
        java.io.InputStream r1 = j6();
        int r2 = r1.read(r4, r5, r6);
        if (r2 > 0) goto L7;
        if (r1 == j6) goto L10;
        DW();
        if (r0 <= 0) goto L3;
    L10:
        if (r0 > 0) goto L25;
        return -1;
    L25:
        return r0;
    L7:
        r0 = r0 + r2;
        r5 = r5 + r2;
        r6 = r6 - r2;
    L16:
        return r0;
    }

    @Override
    public long skip(long r9) {
        long r2 = 0;
    L4:
        if (0 >= r9) goto L16;
        java.io.InputStream r4 = j6();
        long r5 = r4.skip(r9);
        if (0 < r5) goto L8;
        if (r4 == j6) goto L11;
        if (r4.read() < 0) goto L14;
        r2 = r2 + 1;
        r9 = r9 - 1;
        goto L4
    L14:
        DW();
        if (0 >= r2) goto L4;
    L11:
        return r2;
    L8:
        r2 = r2 + r5;
        r9 = r9 - r5;
    L16:
        return r2;
    }
}
