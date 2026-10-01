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
        java.util.zip.Inflater r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.DW;
                    if (r0 != null) { $pc0 = 5; continue $sw0; }
                    this.DW = abcd.tE.j6();
                    return;
                }
                case 5: {
                    r0.reset();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public long DW(abcd.YD r6, int r7) {
        long r0 = 0L;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.v5.j6(this, r6);
                    if (r0 < 0) { $pc1 = 5; continue $sw1; }
                    return r0;
                }
                case 5: {
                    if (r7 != (-1)) { $pc1 = 9; continue $sw1; }
                    throw new abcd.fD(r6.Hw(), "unknown");
                }
                case 9: {
                    throw new abcd.fD(r6.Hw(), r7);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.FH = null;
                    this.Hw = null;
                    try {
                        abcd.tE.j6(this.DW);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 6; continue $sw2;
                    }
                    this.DW = null;
                    return;
                }
                case 6: {
                    th = $ex2;
                    this.DW = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.FE Hw(abcd.YD r3, int r4) {
        abcd.FE r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.v5.Hw(this, r3);
                    if (r0 != null) { $pc3 = 9; continue $sw3; }
                    if (r4 != (-1)) { $pc3 = 8; continue $sw3; }
                    throw new abcd.fD(r3.Hw(), "unknown");
                }
                case 8: {
                    throw new abcd.fD(r3.Hw(), r4);
                }
                case 9: {
                    if (r4 != (-1)) { $pc3 = 11; continue $sw3; }
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    return r0;
                }
                case 11: {
                    if (r0.FH() == r4) { $pc3 = 15; continue $sw3; }
                    throw new abcd.ZC(r3.Hw(), r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.util.zip.Inflater VH() {
        gn();
        return this.DW;
    }

    int Zo() {
        return abcd.uH.j6();
    }

    int j6(abcd.aH r4, long r5, byte[] r7, int r8) {
        long r6 = 0L;
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    gn();
                    j6(r4, r5);
                    r6 = r5 + ((long) this.FH.j6(r5, this.DW));
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    r0 = this.DW.inflate(r7, r8, r7.length - r8);
                    if (r0 == 0) { $pc4 = 6; continue $sw4; }
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    r8 = r8 + r0;
                    if (r8 < r7.length) { $pc4 = 3; continue $sw4; }
                    return r8;
                }
                case 6: {
                    if (this.DW.needsInput() == false) { $pc4 = 9; continue $sw4; }
                    j6(r4, r6);
                    r6 = r6 + ((long) this.FH.j6(r6, this.DW));
                    { $pc4 = 13; continue $sw4; }
                }
                case 9: {
                    if (this.DW.finished() == false) { $pc4 = 12; continue $sw4; }
                    return r8;
                }
                case 12: {
                    throw new java.util.zip.DataFormatException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6(abcd.aH r15, long r16, byte[] r18, int r19, int r20) {
        long r2 = 0L;
        long r11 = 0L;
        int r13 = 0;
        int r10 = 0;
        int r4 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r2 = r15.gn;
                    r11 = r16;
                    r13 = r19;
                    r10 = r20;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r10 <= 0) { $pc5 = 9; continue $sw5; }
                    if (r11 >= r2) { $pc5 = 9; continue $sw5; }
                    j6(r15, r11);
                    r4 = this.FH.j6(r11, r18, r13, r10);
                    r11 = r11 + ((long) r4);
                    r13 = r13 + r4;
                    r10 = r10 - r4;
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    return r20 - r10;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.AG j6(abcd.aH r4, long r5, long r7) {
        abcd.CG r0 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    j6(r4, r5);
                    r0 = this.FH;
                    if ((r0 instanceof abcd.AG) == true) { $pc6 = 5; continue $sw6; }
                    return null;
                }
                case 5: {
                    if (r0.j6(r4, r5 + (r7 - 1)) == true) { $pc6 = 7; continue $sw6; }
                    return null;
                }
                case 7: {
                    return (abcd.AG) this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.util.HashSet r0 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r3.DW() == true) { $pc7 = 5; continue $sw7; }
                    r0 = new java.util.HashSet(4);
                    this.v5.j6(r0, r3);
                    return r0;
                }
                case 5: {
                    return java.util.Collections.singleton(r3.v5());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.util.Iterator<abcd.MH> r4 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r4 = r3.iterator();
                    $pc8 = 4; continue $sw8;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc8 = 5; continue $sw8; }
                    r2.j6(r4.next());
                    { $pc8 = 4; continue $sw8; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.TH r3, abcd.LE r4, java.lang.Iterable<abcd.MH> r5) {
        java.util.Iterator<abcd.MH> r6 = null;
        abcd.MH r0 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r6 = r5.iterator();
                    $pc9 = 4; continue $sw9;
                }
                case 4: {
                    if (r6.hasNext() == false) { $pc9 = 5; continue $sw9; }
                    r0 = r6.next();
                    this.v5.j6(r3, r0, this);
                    r4.update(1);
                    { $pc9 = 4; continue $sw9; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.aH r2, long r3) {
        abcd.CG r0 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = this.FH;
                    if (r0 != null) { $pc10 = 5; continue $sw10; }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    this.FH = null;
                    this.FH = abcd.uH.j6(r2, r3);
                    return;
                }
                case 5: {
                    if (r0.j6(r2, r3) == false) { $pc10 = 6; continue $sw10; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.aH r17, long r18, boolean r20, abcd.OH r21) {
        long r2 = 0L;
        java.security.MessageDigest r5 = null;
        byte[] r6 = null;
        long r14 = 0L;
        long r12 = 0L;
        abcd.CG r7 = null;
        int r11 = 0;
        long r3 = 0L;
        byte[] r4 = null;
        byte[] r8 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r2 = 0;
                    if (r20 == false) { $pc11 = 9; continue $sw11; }
                    r5 = abcd.hE.j6();
                    r6 = r21.FH();
                    j6(r17, 0);
                    if (this.FH.j6(0, r6, 0, 12) != 12) { $pc11 = 7; continue $sw11; }
                    r5.update(r6, 0, 12);
                    $pc11 = 10; continue $sw11;
                }
                case 10: {
                    r14 = 12;
                    r12 = r18 - 32;
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    if (r2 >= r12) { $pc11 = 13; continue $sw11; }
                    j6(r17, r14);
                    r7 = this.FH;
                    r11 = (int) java.lang.Math.min(r7.j6() - ((int) (r14 - r7.DW)), r12);
                    this.FH.j6(r21, r14, r11, r5);
                    r3 = r11;
                    r14 = r14 + r3;
                    r12 = r12 - r3;
                    r2 = 0;
                    { $pc11 = 12; continue $sw11; }
                }
                case 13: {
                    if (r5 == null) { $pc11 = 23; continue $sw11; }
                    r4 = new byte[20];
                    r8 = r5.digest();
                    j6(r17, r14);
                    if (this.FH.j6(r14, r4, 0, 20) == 20) { $pc11 = 17; continue $sw11; }
                    r17.gn();
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packfileIsTruncated);
                }
                case 17: {
                    if (java.util.Arrays.equals(r8, r4) == true) { $pc11 = 26; continue $sw11; }
                    r17.gn();
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().packfileCorruptionDetected, new java.lang.Object[]{r17.v5().getPath()}));
                }
                case 26: {
                    return;
                }
                case 23: {
                    return;
                }
                case 7: {
                    r17.gn();
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packfileIsTruncated);
                }
                case 9: {
                    r5 = null;
                    { $pc11 = 10; continue $sw11; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.EG v5() {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (this.Hw != null) { $pc12 = 6; continue $sw12; }
                    this.Hw = new abcd.EG();
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
