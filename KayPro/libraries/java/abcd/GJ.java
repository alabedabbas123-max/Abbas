package abcd;

public class GJ extends abcd.AbstractC0642dJ implements abcd.SJ {
    static final abcd.DJ a8 = null;

    class a extends abcd.RJ {
        private com.jcraft.jsch.ChannelSftp DW;
        final abcd.GJ FH;
        private final java.lang.String j6;

        a(abcd.GJ r4, abcd.GJ.a r5, java.lang.String r6) {
            java.lang.Throwable e = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        this.FH = r4;
                        try {
                            this.DW = r4.j3();
                            this.DW.DW(r5.j6);
                            this.DW.DW(r6);
                            this.j6 = this.DW.j3();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc0 = 5; continue $sw0; }
                            if ($t instanceof abcd.yD) { $pc0 = 8; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return;
                    }
                    case 8: {
                        e = $ex0;
                        j6();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    }
                    case 5: {
                        e = $ex0;
                        throw new abcd.yD("Can't enter " + r6 + " from " + r5.j6 + ": " + e.getMessage(), e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        a(abcd.GJ r4, java.lang.String r5) {
            java.lang.Throwable e = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        this.FH = r4;
                        if (r5.startsWith("/~") == false) { $pc1 = 6; continue $sw1; }
                        r5 = r5.substring(1);
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        if (r5.startsWith("~/") == false) { $pc1 = 16; continue $sw1; }
                        r5 = r5.substring(2);
                        $pc1 = 16; continue $sw1;
                    }
                    case 16: {
                        try {
                            this.DW = r4.j3();
                            this.DW.DW(r5);
                            this.DW.DW("objects");
                            this.j6 = this.DW.j3();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc1 = 10; continue $sw1; }
                            if ($t instanceof abcd.yD) { $pc1 = 13; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return;
                    }
                    case 13: {
                        e = $ex1;
                        j6();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    }
                    case 10: {
                        e = $ex1;
                        throw new abcd.yD("Can't enter " + r5 + "/objects: " + e.getMessage(), e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private abcd.ME DW(java.util.TreeMap<java.lang.String, abcd.ME> r5, java.lang.String r6, java.lang.String r7) {
            java.io.BufferedReader r2 = null;
            java.lang.String r3 = null;
            java.lang.String r8 = null;
            abcd.ME r0 = null;
            abcd.kF r9 = null;
            abcd.BE.c r10 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        try {
                            r2 = Zo(r6);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            if ($t instanceof java.io.IOException) { $pc2 = 27; continue $sw2; }
                            if ($t instanceof java.io.FileNotFoundException) { $pc2 = 30; continue $sw2; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        try {
                            r3 = r2.readLine();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 24; continue $sw2;
                        }
                        try {
                            r2.close();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            if ($t instanceof java.io.IOException) { $pc2 = 27; continue $sw2; }
                            if ($t instanceof java.io.FileNotFoundException) { $pc2 = 30; continue $sw2; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        if (r3 == null) { $pc2 = 23; continue $sw2; }
                        if (r3.startsWith("ref: ") == false) { $pc2 = 17; continue $sw2; }
                        r8 = r3.substring(5);
                        r0 = r5.get(r8);
                        if (r0 != null) { $pc2 = 12; continue $sw2; }
                        r0 = DW(r5, "../" + r8, r8);
                        $pc2 = 12; continue $sw2;
                    }
                    case 12: {
                        if (r0 != null) { $pc2 = 14; continue $sw2; }
                        r0 = new abcd.BE.c(abcd.ME.a.j6, r8, null);
                        $pc2 = 14; continue $sw2;
                    }
                    case 14: {
                        r9 = new abcd.kF(r7, r0);
                        r5.put(r9.getName(), r9);
                        return r9;
                    }
                    case 17: {
                        if (abcd.yE.DW(r3) == false) { $pc2 = 21; continue $sw2; }
                        r10 = new abcd.BE.c(j6(r5.get(r7)), r7, abcd.yE.j6(r3));
                        r5.put(r10.getName(), r10);
                        return r10;
                    }
                    case 21: {
                        throw new abcd.yD("Bad ref: " + r7 + ": " + r3);
                    }
                    case 23: {
                        throw new abcd.yD("Empty ref: " + r7);
                    }
                    case 24: {
                        th = $ex2;
                        try {
                            r2.close();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            if ($t instanceof java.io.IOException) { $pc2 = 27; continue $sw2; }
                            if ($t instanceof java.io.FileNotFoundException) { $pc2 = 30; continue $sw2; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                    }
                    case 30: {
                        return null;
                    }
                    case 27: {
                        e = $ex2;
                        throw new abcd.yD("Cannot read " + this.j6 + "/" + r6 + ": " + e.getMessage(), e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private void gn(java.lang.String r5) {
            int r0 = 0;
            java.lang.String r6 = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = r5.lastIndexOf(47);
                        if (r0 > 0) { $pc3 = 5; continue $sw3; }
                        return;
                    }
                    case 5: {
                        r6 = r5.substring(0, r0);
                        try {
                            this.DW.Zo(r6);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc3 = 8; continue $sw3; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return;
                    }
                    case 8: {
                        e = e;
                        if (e.j6 != 2) { $pc3 = 16; continue $sw3; }
                        gn(r6);
                        try {
                            this.DW.Zo(r6);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc3 = 14; continue $sw3; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return;
                    }
                    case 14: {
                        e = e;
                        $pc3 = 16; continue $sw3;
                    }
                    case 16: {
                        throw new abcd.yD("Can't mkdir " + this.j6 + "/" + r6 + ": " + e.getMessage(), e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private abcd.ME.a j6(abcd.ME r2) {
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        if (r2 == null) { $pc4 = 8; continue $sw4; }
                        if (r2.j6() != abcd.ME.a.FH) { $pc4 = 8; continue $sw4; }
                        return abcd.ME.a.Hw;
                    }
                    case 8: {
                        return abcd.ME.a.DW;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private void j6(java.util.TreeMap<java.lang.String, abcd.ME> r7, java.lang.String r8, java.lang.String r9) {
            java.util.Iterator r1 = null;
            com.jcraft.jsch.ChannelSftp.LsEntry r2 = null;
            java.lang.String r3 = null;
            java.lang.String r4 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        r1 = this.DW.Hw(r8).iterator();
                        $pc5 = 6; continue $sw5;
                    }
                    case 6: {
                        if (r1.hasNext() == false) { $pc5 = 7; continue $sw5; }
                        r2 = (com.jcraft.jsch.ChannelSftp.LsEntry) r1.next();
                        r3 = r2.Zo();
                        if (".".equals(r3) == true) { $pc5 = 6; continue $sw5; }
                        if ("..".equals(r3) == true) { $pc5 = 6; continue $sw5; }
                        r4 = java.lang.String.valueOf(r8) + "/" + r3;
                        if (r2.Hw().gn() == true) { $pc5 = 15; continue $sw5; }
                        DW(r7, r4, java.lang.String.valueOf(r9) + r3);
                        { $pc5 = 6; continue $sw5; }
                    }
                    case 15: {
                        j6(r7, r4, java.lang.String.valueOf(r9) + r3 + "/");
                        { $pc5 = 6; continue $sw5; }
                    }
                    case 7: {
                        return;
                    }
                    case 17: {
                        e = $ex5;
                        throw new abcd.yD("Can't ls " + this.j6 + "/" + r8 + ": " + e.getMessage(), e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        java.util.Collection<abcd.RJ> DW() {
            java.lang.Throwable $ex6 = null;
            int $pc6 = -1;
            $sw6: while (true) {
                switch ($pc6) {
                    case -1: {
                        return VH("info/alternates");
                    }
                    case 4: {
                        return null;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        java.util.Collection<java.lang.String> FH() {
            java.util.ArrayList r0 = null;
            java.util.Vector r1 = null;
            java.util.HashMap r2 = null;
            java.util.HashMap r3 = null;
            java.util.Iterator r4 = null;
            com.jcraft.jsch.ChannelSftp.LsEntry r5 = null;
            java.util.Iterator r6 = null;
            com.jcraft.jsch.ChannelSftp.LsEntry r7 = null;
            java.lang.String r8 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = -1;
            $sw7: while (true) {
                switch ($pc7) {
                    case -1: {
                        r0 = new java.util.ArrayList();
                        try {
                            r1 = this.DW.Hw("pack");
                            r2 = new java.util.HashMap();
                            r3 = new java.util.HashMap();
                            r4 = r1.iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc7 = 22; continue $sw7; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc7 = 5; continue $sw7;
                    }
                    case 5: {
                        if (r4.hasNext() == false) { $pc7 = 6; continue $sw7; }
                        try {
                            r5 = (com.jcraft.jsch.ChannelSftp.LsEntry) r4.next();
                            r2.put(r5.Zo(), r5);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc7 = 22; continue $sw7; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        { $pc7 = 5; continue $sw7; }
                    }
                    case 6: {
                        try {
                            r6 = r1.iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc7 = 22; continue $sw7; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc7 = 8; continue $sw7;
                    }
                    case 8: {
                        if (r6.hasNext() == false) { $pc7 = 9; continue $sw7; }
                        try {
                            r7 = (com.jcraft.jsch.ChannelSftp.LsEntry) r6.next();
                            r8 = r7.Zo();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc7 = 22; continue $sw7; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        if (r8.startsWith("pack-") == false) { $pc7 = 8; continue $sw7; }
                        if (r8.endsWith(".pack") == false) { $pc7 = 8; continue $sw7; }
                        if (r2.containsKey(java.lang.String.valueOf(r8.substring(0, r8.length() - 5)) + ".idx") == false) { $pc7 = 8; continue $sw7; }
                        try {
                            r3.put(r8, java.lang.Integer.valueOf(r7.Hw().FH()));
                            r0.add(r8);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc7 = 22; continue $sw7; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        { $pc7 = 8; continue $sw7; }
                    }
                    case 9: {
                        try {
                            java.util.Collections.sort(r0, new abcd.FJ(this, r3));
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc7 = 22; continue $sw7; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return r0;
                    }
                    case 22: {
                        e = $ex7;
                        throw new abcd.yD("Can't ls " + this.j6 + "/pack: " + e.getMessage(), e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        abcd.HJ Hw() {
            return this.FH.Zo.FH(this.j6);
        }

        @Override
        abcd.RJ.a Hw(java.lang.String r6) {
            java.lang.Throwable e = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = -1;
            $sw8: while (true) {
                switch ($pc8) {
                    case -1: {
                        return new abcd.RJ.a(this.DW.FH(r6), this.DW.v5(r6).Zo());
                    }
                    case 4: {
                        e = $ex8;
                        if (e.j6 != 2) { $pc8 = 10; continue $sw8; }
                        throw new java.io.FileNotFoundException(r6);
                    }
                    case 10: {
                        throw new abcd.yD("Can't get " + this.j6 + "/" + r6 + ": " + e.getMessage(), e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        java.io.OutputStream j6(java.lang.String r3, abcd.LE r4, java.lang.String r5) {
            java.lang.Throwable $ex9 = null;
            int $pc9 = -1;
            $sw9: while (true) {
                switch ($pc9) {
                    case -1: {
                        return this.DW.VH(r3);
                    }
                    case 4: {
                        e = e;
                        if (e.j6 != 2) { $pc9 = 12; continue $sw9; }
                        gn(r3);
                        return this.DW.VH(r3);
                    }
                    case 10: {
                        e = e;
                        $pc9 = 12; continue $sw9;
                    }
                    case 12: {
                        throw new abcd.yD("Can't write " + this.j6 + "/" + r3 + ": " + e.getMessage(), e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        void j6() {
            com.jcraft.jsch.ChannelSftp r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex10 = null;
            int $pc10 = -1;
            $sw10: while (true) {
                switch ($pc10) {
                    case -1: {
                        r0 = this.DW;
                        if (r0 != null) { $pc10 = 13; continue $sw10; }
                        return;
                    }
                    case 13: {
                        $pc10 = 6; continue $sw10;
                    }
                    case 9: {
                        th = $ex10;
                        this.DW = null;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 6: {
                        if (r0.J0() == false) { $pc10 = 8; continue $sw10; }
                        try {
                            this.DW.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 9; continue $sw10;
                        }
                        $pc10 = 8; continue $sw10;
                    }
                    case 8: {
                        this.DW = null;
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        void j6(java.lang.String r5) {
            int r1 = 0;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex11 = null;
            int $pc11 = -1;
            $sw11: while (true) {
                switch ($pc11) {
                    case -1: {
                        try {
                            this.DW.gn(r5);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc11 = 10; continue $sw11; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        r1 = r5.lastIndexOf(47);
                        $pc11 = 4; continue $sw11;
                    }
                    case 4: {
                        if (r1 <= 0) { $pc11 = 24; continue $sw11; }
                        try {
                            r5 = r5.substring(0, r1);
                            this.DW.u7(r5);
                            r1 = r5.lastIndexOf(47);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc11 = 17; continue $sw11; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc11 = 9; continue $sw11;
                    }
                    case 9: {
                        return;
                    }
                    case 24: {
                        return;
                    }
                    case 10: {
                        e = $ex11;
                        if (e.j6 != 2) { $pc11 = 15; continue $sw11; }
                        return;
                    }
                    case 15: {
                        throw new abcd.yD("Can't delete " + this.j6 + "/" + r5 + ": " + e.getMessage(), e);
                    }
                    case 17: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        void j6(java.lang.String r5, byte[] r6) {
            java.lang.String r0 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex12 = null;
            int $pc12 = -1;
            $sw12: while (true) {
                switch ($pc12) {
                    case -1: {
                        r0 = java.lang.String.valueOf(r5) + ".lock";
                        try {
                            super.j6(r0, r6);
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            if ($t instanceof java.io.IOException) { $pc12 = 9; continue $sw12; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        try {
                            this.DW.j6(r0, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc12 = 6; continue $sw12; }
                            if ($t instanceof java.io.IOException) { $pc12 = 9; continue $sw12; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return;
                    }
                    case 6: {
                        e = $ex12;
                        try {
                            throw new abcd.yD("Can't write " + this.j6 + "/" + r5 + ": " + e.getMessage(), e);
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            if ($t instanceof java.io.IOException) { $pc12 = 9; continue $sw12; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                    }
                    case 9: {
                        e = $ex12;
                        try {
                            this.DW.gn(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            if ($t instanceof com.jcraft.jsch.SftpException) { $pc12 = 12; continue $sw12; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc12 = 11; continue $sw12;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    }
                    case 12: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        abcd.RJ v5(java.lang.String r3) {
            return new abcd.GJ.a(this.FH, this, r3);
        }

        java.util.Map<java.lang.String, abcd.ME> v5() {
            java.util.TreeMap<java.lang.String, abcd.ME> r0 = new java.util.TreeMap();
            j6(r0);
            DW(r0, "../HEAD", "HEAD");
            j6(r0, "../refs", "refs/");
            return r0;
        }
    }

    static {
        a8 = new abcd.EJ();
    }

    GJ(abcd.UE r1, abcd.HJ r2) {
        super(r1, r2);
    }

    @Override
    public abcd.InterfacenI QX() {
        abcd.GJ.a r0 = new abcd.GJ.a(this, this.Zo.Hw());
        abcd.OJ r1 = new abcd.OJ(this, r0);
        r1.j6(r0.v5());
        return r1;
    }

    @Override
    public abcd.LI XL() {
        abcd.GJ.a r0 = new abcd.GJ.a(this, this.Zo.Hw());
        abcd.QJ r1 = new abcd.QJ(this, r0);
        r1.j6(r0.v5());
        return r1;
    }

    com.jcraft.jsch.ChannelSftp j3() {
        int r0 = 0;
        com.jcraft.jsch.Channel r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (gn() <= 0) { $pc13 = 5; continue $sw13; }
                    r0 = gn() * 1000;
                    $pc13 = 11; continue $sw13;
                }
                case 11: {
                    try {
                        r1 = ((abcd.vI) aM()).j6();
                        r1.j6(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof com.jcraft.jsch.JSchException) { $pc13 = 8; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return (com.jcraft.jsch.ChannelSftp) r1;
                }
                case 8: {
                    e = $ex13;
                    throw new abcd.yD(this.Zo, e.getMessage(), e);
                }
                case 5: {
                    r0 = 0;
                    { $pc13 = 11; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
