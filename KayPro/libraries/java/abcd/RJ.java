package abcd;

abstract class RJ {

    static final class a {
        final long DW;
        final java.io.InputStream j6;

        a(java.io.InputStream r1, long r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        byte[] j6() {
            byte[] r0 = null;
            java.io.ByteArrayOutputStream r1 = null;
            byte[] r2 = null;
            int r3 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 13: {
                        th = $ex0;
                        this.j6.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (this.DW < 0) { $pc0 = 7; continue $sw0; }
                        try {
                            r0 = new byte[(int) this.DW];
                            abcd.BK.j6(this.j6, r0, 0, r0.length);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 13; continue $sw0;
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        this.j6.close();
                        return r0;
                    }
                    case 7: {
                        try {
                            r1 = new java.io.ByteArrayOutputStream();
                            r2 = new byte[2048];
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 13; continue $sw0;
                        }
                        $pc0 = 8; continue $sw0;
                    }
                    case 8: {
                        try {
                            r3 = this.j6.read(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 13; continue $sw0;
                        }
                        if (r3 < 0) { $pc0 = 10; continue $sw0; }
                        try {
                            r1.write(r2, 0, r3);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 13; continue $sw0;
                        }
                        { $pc0 = 8; continue $sw0; }
                    }
                    case 10: {
                        try {
                            r0 = r1.toByteArray();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 13; continue $sw0;
                        }
                        { $pc0 = 5; continue $sw0; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    RJ() {
    }

    private void j6(java.util.Map<java.lang.String, abcd.ME> r8, java.io.BufferedReader r9) {
        abcd.ME r1 = null;
        boolean r2 = false;
        java.lang.String r3 = null;
        int r4 = 0;
        abcd.yE r5 = null;
        java.lang.String r6 = null;
        abcd.ME r7 = null;
        abcd.BE.b r10 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = null;
                    r2 = false;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r3 = r9.readLine();
                    if (r3 == null) { $pc1 = 5; continue $sw1; }
                    if (r3.charAt(0) == '#') { $pc1 = 9; continue $sw1; }
                    if (r3.charAt(0) == '^') { $pc1 = 13; continue $sw1; }
                    r4 = r3.indexOf(32);
                    if (r4 < 0) { $pc1 = 25; continue $sw1; }
                    r5 = abcd.yE.j6(r3.substring(0, r4));
                    r6 = r3.substring(r4 + 1);
                    if (r2 == false) { $pc1 = 22; continue $sw1; }
                    r7 = new abcd.BE.a(abcd.ME.a.FH, r6, r5);
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    r1 = r7;
                    r8.put(r1.getName(), r1);
                    { $pc1 = 3; continue $sw1; }
                }
                case 22: {
                    r7 = new abcd.BE.c(abcd.ME.a.FH, r6, r5);
                    { $pc1 = 23; continue $sw1; }
                }
                case 25: {
                    throw new abcd.yD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unrecognizedRef, new java.lang.Object[]{r3}));
                }
                case 13: {
                    if (r1 == null) { $pc1 = 16; continue $sw1; }
                    r10 = new abcd.BE.b(abcd.ME.a.FH, r1.getName(), r1.DW(), abcd.yE.j6(r3.substring(1)));
                    r8.put(r10.getName(), r10);
                    r1 = r10;
                    { $pc1 = 3; continue $sw1; }
                }
                case 16: {
                    throw new abcd.yD(org.eclipse.jgit.JGitText.j6().peeledLineBeforeRef);
                }
                case 9: {
                    if (r3.startsWith("# pack-refs with:") == false) { $pc1 = 3; continue $sw1; }
                    r2 = r3.substring(17).contains(" peeled");
                    { $pc1 = 3; continue $sw1; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abstract java.util.Collection<abcd.RJ> DW();

    void DW(java.lang.String r3) {
        j6("../" + r3);
    }

    abstract java.util.Collection<java.lang.String> FH();

    void FH(java.lang.String r3) {
        j6("../logs/" + r3);
    }

    abstract abcd.HJ Hw();

    abstract abcd.RJ.a Hw(java.lang.String r1);

    java.util.Collection<abcd.RJ> VH(java.lang.String r5) {
        java.io.BufferedReader r6 = null;
        java.util.ArrayList r1 = null;
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r6 = Zo(r5);
                    try {
                        r1 = new java.util.ArrayList();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    try {
                        r2 = r6.readLine();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    if (r2 == null) { $pc2 = 6; continue $sw2; }
                    if (r2.endsWith("/") == true) { $pc2 = 11; continue $sw2; }
                    try {
                        r2 = java.lang.String.valueOf(r2) + "/";
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    try {
                        r1.add(v5(r2));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    { $pc2 = 4; continue $sw2; }
                }
                case 6: {
                    r6.close();
                    return r1;
                }
                case 13: {
                    th = $ex2;
                    r6.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.io.BufferedReader Zo(java.lang.String r4) {
        return new java.io.BufferedReader(new java.io.InputStreamReader(Hw(r4).j6, abcd.hE.Zo));
    }

    java.io.OutputStream j6(java.lang.String r3, abcd.LE r4, java.lang.String r5) {
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().writingNotSupported, new java.lang.Object[]{r3}));
    }

    abstract void j6();

    void j6(java.lang.String r5) {
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().deletingNotSupported, new java.lang.Object[]{r5}));
    }

    void j6(java.lang.String r3, abcd.yE r4) {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream(41);
        r4.DW(r0);
        r0.write(10);
        j6("../" + r3, r0.toByteArray());
    }

    void j6(java.lang.String r2, byte[] r3) {
        java.io.OutputStream r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r4 = j6(r2, null, null);
                    try {
                        r4.write(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 6; continue $sw3;
                    }
                    r4.close();
                    return;
                }
                case 6: {
                    th = $ex3;
                    r4.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(java.util.Collection<java.lang.String> r4) {
        java.lang.StringBuilder r0 = null;
        java.util.Iterator<java.lang.String> r5 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r5 = r4.iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r5.hasNext() == false) { $pc4 = 5; continue $sw4; }
                    r1 = r5.next();
                    r0.append("P ");
                    r0.append(r1);
                    r0.append('\n');
                    { $pc4 = 4; continue $sw4; }
                }
                case 5: {
                    j6("info/packs", abcd.hE.DW(r0.toString()));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6(java.util.Map<java.lang.String, abcd.ME> r4) {
        java.io.BufferedReader r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    try {
                        r0 = Zo("../packed-refs");
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 8; continue $sw5; }
                        if ($t instanceof java.io.FileNotFoundException) { $pc5 = 12; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        j6(r4, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 5; continue $sw5;
                    }
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 8; continue $sw5; }
                        if ($t instanceof java.io.FileNotFoundException) { $pc5 = 12; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    th = $ex5;
                    try {
                        r0.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 8; continue $sw5; }
                        if ($t instanceof java.io.FileNotFoundException) { $pc5 = 12; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 8: {
                    e = $ex5;
                    throw new abcd.yD(Hw(), org.eclipse.jgit.JGitText.j6().errorInPackedRefs, e);
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abstract abcd.RJ v5(java.lang.String r1);
}
