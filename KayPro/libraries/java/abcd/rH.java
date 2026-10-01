package abcd;

class rH extends java.util.zip.InflaterInputStream {
    private final abcd.yE DW;
    private long j6;

    rH(java.io.InputStream r1, java.util.zip.Inflater r2, long r3, abcd.yE r5) {
        this.DW = r5;
        super(r1, r2);
        this.j6 = r3;
    }

    @Override
    public void close() {
    L7:
        th = move-exception;
        abcd.tE.j6(((java.util.zip.InflaterInputStream) this).inf);
        super.close();
        throw th;
    L3:
        if (this.j6 > 0) goto L5;
        abcd.sH.j6(((java.util.zip.InflaterInputStream) this).in, ((java.util.zip.InflaterInputStream) this).inf, this.DW, new byte[64]);     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.tE.j6(((java.util.zip.InflaterInputStream) this).inf);
        super.close();
    }

    @Override
    public int read(byte[] r3, int r4, int r5) {
        int r6 = super.read(r3, r4, r5);     // Catch: java.util.zip.ZipException -> L6
        if (r6 <= 0) goto L5;
        this.j6 -= (long) r6;     // Catch: java.util.zip.ZipException -> L6
    L5:
        return r6;
    L7:
        throw new abcd.YC(this.DW, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
    }
}
