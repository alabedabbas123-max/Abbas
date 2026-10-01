package abcd;

final class wH extends abcd.IE implements abcd.LH {
    private java.util.zip.Inflater DW;
    private abcd.CG FH;
    private abcd.EG Hw;
    final byte[] j6;
    final abcd.GG v5;

    wH(abcd.GG r2) {
        this.j6 = new byte[20];
        this.v5 = r2;
    }

    private void gn() {
        java.util.zip.Inflater r0 = this.DW;
        if (r0 != null) goto L5;
        this.DW = abcd.tE.j6();
        return;
    L5:
        r0.reset();
    }

    @Override
    public long DW(abcd.YD r6, int r7) {
        long r0 = this.v5.j6(this, r6);
        if (r0 < 0) goto L5;
        return r0;
    L5:
        if (r7 != (-1)) goto L9;
        throw new abcd.fD(r6.Hw(), "unknown");
    L9:
        throw new abcd.fD(r6.Hw(), r7);
    }

    @Override
    public abcd.IE DW() {
        return new abcd.wH(this.v5);
    }

    @Override
    public boolean DW(abcd.YD r2) {
        return this.v5.j6(r2);
    }

    @Override
    public void FH() {
        this.FH = null;
        this.Hw = null;
        abcd.tE.j6(this.DW);     // Catch: java.lang.Throwable -> L6
        this.DW = null;
        return;
    L6:
        th = move-exception;
        this.DW = null;
        throw th;
    }

    @Override
    public abcd.FE Hw(abcd.YD r3, int r4) {
        abcd.FE r0 = this.v5.Hw(this, r3);
        if (r0 != null) goto L9;
        if (r4 != (-1)) goto L8;
        throw new abcd.fD(r3.Hw(), "unknown");
    L8:
        throw new abcd.fD(r3.Hw(), r4);
    L9:
        if (r4 != (-1)) goto L11;
    L15:
        return r0;
    L11:
        if (r0.FH() == r4) goto L15;
        throw new abcd.ZC(r3.Hw(), r4);
    }

    java.util.zip.Inflater VH() {
        gn();
        return this.DW;
    }

    int Zo() {
        return abcd.uH.j6();
    }

    int j6(abcd.aH r4, long r5, byte[] r7, int r8) {
        gn();
        j6(r4, r5);
        long r6 = r5 + ((long) this.FH.j6(r5, this.DW));
    L3:
        int r0 = this.DW.inflate(r7, r8, r7.length - r8);
        if (r0 == 0) goto L6;
    L13:
        r8 = r8 + r0;
        if (r8 < r7.length) goto L3;
        return r8;
    L6:
        if (this.DW.needsInput() == false) goto L9;
        j6(r4, r6);
        r6 = r6 + ((long) this.FH.j6(r6, this.DW));
        goto L13
    L9:
        if (this.DW.finished() == false) goto L12;
        return r8;
    L12:
        throw new java.util.zip.DataFormatException();
    }

    int j6(abcd.aH r15, long r16, byte[] r18, int r19, int r20) {
        long r2 = r15.gn;
        long r11 = r16;
        int r13 = r19;
        int r10 = r20;
    L3:
        if (r10 <= 0) goto L9;
        if (r11 >= r2) goto L9;
        j6(r15, r11);
        int r4 = this.FH.j6(r11, r18, r13, r10);
        r11 = r11 + ((long) r4);
        r13 = r13 + r4;
        r10 = r10 - r4;
    L9:
        return r20 - r10;
    }

    abcd.AG j6(abcd.aH r4, long r5, long r7) {
        j6(r4, r5);
        abcd.CG r0 = this.FH;
        if ((r0 instanceof abcd.AG) == true) goto L5;
        return null;
    L5:
        if (r0.j6(r4, r5 + (r7 - 1)) == true) goto L7;
        return null;
    L7:
        return (abcd.AG) this.FH;
    }

    @Override
    public abcd.MH j6(abcd.AbstractiG r1) {
        return j6(r1);
    }

    @Override
    public abcd.TG j6(abcd.AbstractiG r2) {
        return new abcd.TG(r2);
    }

    @Override
    public java.util.Collection<abcd.BH> j6() {
        return this.v5.Zo();
    }

    @Override
    public java.util.Collection<abcd.yE> j6(abcd.WD r3) {
        if (r3.DW() == true) goto L5;
        java.util.HashSet r0 = new java.util.HashSet(4);
        this.v5.j6(r0, r3);
        return r0;
    L5:
        return java.util.Collections.singleton(r3.v5());
    }

    @Override
    public void j6(abcd.OH r1, abcd.BH r2, boolean r3) {
        ((abcd.QG) r2).j6(r1, r3, this);
    }

    @Override
    public void j6(abcd.OH r2, abcd.MH r3, boolean r4) {
        abcd.TG r5 = (abcd.TG) r3;
        r5.XL.j6(r2, r5, r4, this);
    }

    @Override
    public void j6(abcd.OH r2, java.util.List<abcd.MH> r3) {
        java.util.Iterator<abcd.MH> r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L5;
        r2.j6(r4.next());
        goto L4
    }

    @Override
    public void j6(abcd.TH r3, abcd.LE r4, java.lang.Iterable<abcd.MH> r5) {
        java.util.Iterator<abcd.MH> r6 = r5.iterator();
    L4:
        if (r6.hasNext() == false) goto L5;
        abcd.MH r0 = r6.next();
        this.v5.j6(r3, r0, this);
        r4.update(1);
        goto L4
    }

    void j6(abcd.aH r2, long r3) {
        abcd.CG r0 = this.FH;
        if (r0 != null) goto L5;
    L6:
        this.FH = null;
        this.FH = abcd.uH.j6(r2, r3);
        return;
    L5:
        if (r0.j6(r2, r3) == false) goto L6;
    }

    void j6(abcd.aH r17, long r18, boolean r20, abcd.OH r21) {
        long r2 = 0;
        if (r20 == false) goto L9;
        java.security.MessageDigest r5 = abcd.hE.j6();
        byte[] r6 = r21.FH();
        j6(r17, 0);
        if (this.FH.j6(0, r6, 0, 12) != 12) goto L7;
        r5.update(r6, 0, 12);
    L10:
        long r14 = 12;
        long r12 = r18 - 32;
    L12:
        if (r2 >= r12) goto L13;
        j6(r17, r14);
        abcd.CG r7 = this.FH;
        int r11 = (int) java.lang.Math.min(r7.j6() - ((int) (r14 - r7.DW)), r12);
        this.FH.j6(r21, r14, r11, r5);
        long r3 = r11;
        r14 = r14 + r3;
        r12 = r12 - r3;
        r2 = 0;
        goto L12
    L13:
        if (r5 == null) goto L23;
        byte[] r4 = new byte[20];
        byte[] r8 = r5.digest();
        j6(r17, r14);
        if (this.FH.j6(r14, r4, 0, 20) == 20) goto L17;
        r17.gn();
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packfileIsTruncated);
    L17:
        if (java.util.Arrays.equals(r8, r4) == true) goto L26;
        r17.gn();
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().packfileCorruptionDetected, new java.lang.Object[]{r17.v5().getPath()}));
    L26:
        return;
    L23:
        return;
    L7:
        r17.gn();
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packfileIsTruncated);
    L9:
        r5 = null;
        goto L10
    }

    abcd.EG v5() {
        if (this.Hw != null) goto L6;
        this.Hw = new abcd.EG();
    L6:
        return this.Hw;
    }
}
