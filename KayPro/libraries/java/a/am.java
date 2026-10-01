package a;

class am {

    private long f20a;
    private long b;

    private am() {
        this.f20a = Long.MIN_VALUE;
        this.b = Long.MAX_VALUE;
    }

    am(a.al r1) {
        this();
    }

    private void a() {
        if (this.f20a > this.b) goto L5;
        return;
    L5:
        throw new java.lang.IllegalStateException("The output is outdated");
    }

    public void a(long r4) {
        if (this.f20a >= r4) goto L6;
        this.f20a = r4;
        a();
        return;
    }

    public void a(long r2, boolean r4) {
        if (r4 == false) goto L5;
        b(r2);
        return;
    L5:
        a(r2);
    }

    public void a(java.io.File r2) {
        if (r2 == null) goto L5;
        a(r2, false);
        return;
    }

    public void a(java.io.File r5, boolean r6) {
        if (r5.isDirectory() == false) goto L12;
        java.io.File[] r1 = r5.listFiles();
        if (r1.length != 0) goto L8;
        if (r6 == false) goto L8;
        b(Long.MIN_VALUE);
    L8:
        int r0 = 0;
    L10:
        if (r0 >= r1.length) goto L15;
        a(r1[r0], r6);
        r0 = r0 + 1;
        goto L10
    L15:
        return;
    L12:
        a(r5.lastModified(), r6);
    }

    public void a(java.net.URL r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.getProtocol().equals("file") == false) goto L12;
        a(new java.io.File(r3.toURI()), false);     // Catch: java.net.URISyntaxException -> L7
        return;
    L13:
        return;
    }

    public void b(long r4) {
        if (this.b <= r4) goto L6;
        this.b = r4;
        a();
        return;
    }

    public void b(java.io.File r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (r2.getName().length() <= 0) goto L8;
        a(r2, true);
        return;
    }
}
