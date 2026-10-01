package abcd;

class PK extends abcd.QK {
    private volatile java.lang.String FH;

    PK() {
    }

    @Override
    public abcd.FG DW(abcd.gE r5, abcd.AbstractpK r6) {
        return new abcd.FG(r5, new java.io.File(r6.Zo(), ".gitconfig"), r6);
    }

    @Override
    public java.lang.String DW() {
        if (this.FH != null) goto L15;
        this.FH = java.net.InetAddress.getLocalHost().getCanonicalHostName();     // Catch: java.net.UnknownHostException -> L6
    L8:
        if (abcd.QK.DW == true) goto L15;
        if (this.FH != null) goto L15;
        throw new java.lang.AssertionError();
    L6:
        this.FH = "localhost";
    L15:
        return this.FH;
    }

    @Override
    public java.lang.String DW(java.lang.String r1) {
        return java.lang.System.getenv(r1);
    }

    @Override
    public int j6(long r2) {
        return Hw().getOffset(r2) / 60000;
    }

    @Override
    public long j6() {
        return java.lang.System.currentTimeMillis();
    }

    @Override
    public abcd.FG j6(abcd.gE r3, abcd.AbstractpK r4) {
        java.io.File r0 = r4.FH();
        if (r0 != null) goto L7;
        return new abcd.OK(this, null, r4);
    L7:
        return new abcd.FG(r3, r4.j6(r4.j6(r0, "etc"), "gitconfig"), r4);
    }

    @Override
    public java.lang.String j6(java.lang.String r1) {
        return java.lang.System.getProperty(r1);
    }
}
