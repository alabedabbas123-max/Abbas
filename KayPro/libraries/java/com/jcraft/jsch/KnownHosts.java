package com.jcraft.jsch;

public class KnownHosts implements com.jcraft.jsch.HostKeyRepository {
    private static final byte[] DW = null;
    private static final byte[] j6 = null;
    private com.jcraft.jsch.JSch FH;
    private java.lang.String Hw;
    private com.jcraft.jsch.MAC Zo;
    private java.util.Vector v5;

    class HashedHostKey extends com.jcraft.jsch.HostKey {
        final com.jcraft.jsch.KnownHosts EQ;
        private boolean gn;
        byte[] tp;
        byte[] u7;

        HashedHostKey(com.jcraft.jsch.KnownHosts r8, java.lang.String r9, int r10, byte[] r11) {
            this(r8, "", r9, r10, r11, null);
        }

        HashedHostKey(com.jcraft.jsch.KnownHosts r7, java.lang.String r8, java.lang.String r9, int r10, byte[] r11, java.lang.String r12) {
            java.lang.String r13 = null;
            java.lang.String r14 = null;
            java.lang.String r15 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        this.EQ = r7;
                        super(r8, r9, r10, r11, r12);
                        this.gn = false;
                        this.u7 = null;
                        this.tp = null;
                        if (this.Hw.startsWith("|1|") == true) { $pc0 = 5; continue $sw0; }
                        return;
                    }
                    case 5: {
                        if (this.Hw.substring(3).indexOf("|") <= 0) { $pc0 = 15; continue $sw0; }
                        r13 = this.Hw.substring(3);
                        r14 = r13.substring(0, r13.indexOf("|"));
                        r15 = r13.substring(r13.indexOf("|") + 1);
                        this.u7 = com.jcraft.jsch.Util.DW(com.jcraft.jsch.Util.FH(r14), 0, r14.length());
                        this.tp = com.jcraft.jsch.Util.DW(com.jcraft.jsch.Util.FH(r15), 0, r15.length());
                        if (this.u7.length == 20) { $pc0 = 9; continue $sw0; }
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        this.u7 = null;
                        this.tp = null;
                        return;
                    }
                    case 9: {
                        if (this.tp.length != 20) { $pc0 = 12; continue $sw0; }
                        this.gn = true;
                        return;
                    }
                    case 15: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        HashedHostKey(com.jcraft.jsch.KnownHosts r2, java.lang.String r3, byte[] r4) {
            this(r2, r3, 0, r4);
        }

        boolean VH() {
            return this.gn;
        }

        void Zo() {
            com.jcraft.jsch.MAC r0 = null;
            com.jcraft.jsch.Random r1 = null;
            byte[] r2 = null;
            java.lang.StringBuilder r3 = null;
            byte[] r4 = null;
            byte[] r5 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.gn == false) { $pc1 = 5; continue $sw1; }
                        return;
                    }
                    case 5: {
                        r0 = com.jcraft.jsch.KnownHosts.j6(this.EQ);
                        if (this.u7 != null) { $pc1 = 27; continue $sw1; }
                        r1 = com.jcraft.jsch.Session.j6;
                        monitor-enter(r1);
                        try {
                            this.u7 = new byte[r0.j6()];
                            r1.j6(this.u7, 0, this.u7.length);
                            monitor-exit(r1);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 12; continue $sw1;
                        }
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 27: {
                        try {
                            monitor-enter(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Exception) { $pc1 = 24; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        try {
                            r0.j6(this.u7);
                            r2 = com.jcraft.jsch.Util.FH(this.Hw);
                            r0.update(r2, 0, r2.length);
                            this.tp = new byte[r0.j6()];
                            r0.j6(this.tp, 0);
                            monitor-exit(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 19; continue $sw1;
                        }
                        $pc1 = 19; continue $sw1;
                    }
                    case 19: {
                        th = $ex1;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Exception) { $pc1 = 24; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                    }
                    case 22: {
                        r3 = new java.lang.StringBuilder("|1|");
                        r4 = this.u7;
                        r3.append(com.jcraft.jsch.Util.j6(com.jcraft.jsch.Util.FH(r4, 0, r4.length)));
                        r3.append("|");
                        r5 = this.tp;
                        r3.append(com.jcraft.jsch.Util.j6(com.jcraft.jsch.Util.FH(r5, 0, r5.length)));
                        this.Hw = r3.toString();
                        this.gn = true;
                        $pc1 = 24; continue $sw1;
                    }
                    case 24: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        boolean j6(java.lang.String r4) {
            com.jcraft.jsch.MAC r0 = null;
            byte[] r5 = null;
            byte[] r6 = null;
            boolean r7 = false;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (this.gn == false) { $pc2 = 5; continue $sw2; }
                        r0 = com.jcraft.jsch.KnownHosts.j6(this.EQ);
                        try {
                            monitor-enter(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            if ($t instanceof java.lang.Exception) { $pc2 = 14; continue $sw2; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        try {
                            r0.j6(this.u7);
                            r5 = com.jcraft.jsch.Util.FH(r4);
                            r0.update(r5, 0, r5.length);
                            r6 = new byte[r0.j6()];
                            r0.j6(r6, 0);
                            r7 = com.jcraft.jsch.Util.j6(this.tp, r6);
                            monitor-exit(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 11; continue $sw2;
                        }
                        return r7;
                    }
                    case 11: {
                        th = $ex2;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            if ($t instanceof java.lang.Exception) { $pc2 = 14; continue $sw2; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                    }
                    case 14: {
                        e = $ex2;
                        java.lang.System.out.println(e);
                        return false;
                    }
                    case 5: {
                        return super.j6(r4);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        j6 = new byte[]{32};
        DW = com.jcraft.jsch.Util.FH("\n");
    }

    KnownHosts(com.jcraft.jsch.JSch r2) {
        this.FH = null;
        this.Hw = null;
        this.v5 = null;
        this.Zo = null;
        this.FH = r2;
        this.v5 = new java.util.Vector();
    }

    private java.lang.String DW(java.lang.String r7, java.lang.String r8) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        int r4 = 0;
        int r9 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r8.length();
                    r1 = r7.length();
                    r3 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r3 >= r1) { $pc3 = 8; continue $sw3; }
                    r4 = r7.indexOf(44, r3);
                    if (r4 == (-1)) { $pc3 = 8; continue $sw3; }
                    if (r8.equals(r7.substring(r3, r4)) == true) { $pc3 = 20; continue $sw3; }
                    r3 = r4 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 20: {
                    return java.lang.String.valueOf(r7.substring(0, r3)) + r7.substring(r4 + 1);
                }
                case 8: {
                    if (r7.endsWith(r8) == true) { $pc3 = 10; continue $sw3; }
                    return r7;
                }
                case 10: {
                    if ((r1 - r3) != r0) { $pc3 = 25; continue $sw3; }
                    if (r0 != r1) { $pc3 = 13; continue $sw3; }
                    r9 = 0;
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    return r7.substring(0, r9);
                }
                case 13: {
                    r9 = (r1 - r0) - 1;
                    { $pc3 = 15; continue $sw3; }
                }
                case 25: {
                    return r7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private synchronized com.jcraft.jsch.MAC FH() {
        com.jcraft.jsch.MAC r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    monitor-enter(this);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    th = $ex4;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (this.Zo == null) { $pc4 = 17; continue $sw4; }
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    try {
                        r0 = this.Zo;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    monitor-exit(this);
                    return r0;
                }
                case 17: {
                    try {
                        this.Zo = (com.jcraft.jsch.MAC) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("hmac-sha1")).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.Exception) { $pc4 = 7; continue $sw4; }
                        $pc4 = 12; continue $sw4;
                    }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    e = $ex4;
                    try {
                        java.lang.System.err.println("hmacsha1: " + e);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    { $pc4 = 9; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(java.lang.String r4) {
        com.jcraft.jsch.HostKey r0 = new com.jcraft.jsch.HostKey(r4, 3, null);
        this.v5.addElement(r0);
    }

    private int j6(byte[] r4) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r4[8] != 100) { $pc5 = 7; continue $sw5; }
                    return 1;
                }
                case 7: {
                    if (r4[8] != 114) { $pc5 = 10; continue $sw5; }
                    return 2;
                }
                case 10: {
                    return 3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.jcraft.jsch.MAC j6(com.jcraft.jsch.KnownHosts r0) {
        return r0.FH();
    }

    com.jcraft.jsch.HostKey DW(java.lang.String r2, byte[] r3) {
        com.jcraft.jsch.KnownHosts.HashedHostKey r0 = new com.jcraft.jsch.KnownHosts.HashedHostKey(this, r2, r3);
        r0.Zo();
        return r0;
    }

    protected void DW() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 == null) { $pc6 = 6; continue $sw6; }
                    DW(r0);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected synchronized void DW(java.lang.String r2) {
        java.io.FileOutputStream r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    monitor-enter(this);
                    if (r2 != null) { $pc7 = 12; continue $sw7; }
                    monitor-exit(this);
                    return;
                }
                case 12: {
                    try {
                        r0 = new java.io.FileOutputStream(com.jcraft.jsch.Util.j6(r2));
                        j6(r0);
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 9; continue $sw7;
                    }
                    monitor-exit(this);
                    return;
                }
                case 9: {
                    th = $ex7;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int j6(java.lang.String r9, byte[] r10) {
        int r1 = 0;
        java.util.Vector r2 = null;
        int r4 = 0;
        int r5 = 0;
        com.jcraft.jsch.HostKey r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r9 != null) { $pc8 = 5; continue $sw8; }
                    return 1;
                }
                case 5: {
                    r1 = j6(r10);
                    r2 = this.v5;
                    monitor-enter(r2);
                    r4 = 0;
                    r5 = 1;
                    $pc8 = 34; continue $sw8;
                }
                case 34: {
                    $pc8 = 29; continue $sw8;
                }
                case 29: {
                    th = $ex8;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 9: {
                    if (r4 >= this.v5.size()) { $pc8 = 10; continue $sw8; }
                    try {
                        r6 = (com.jcraft.jsch.HostKey) this.v5.elementAt(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 29; continue $sw8;
                    }
                    if (r6.j6(r9) == false) { $pc8 = 28; continue $sw8; }
                    if (r6.v5 != r1) { $pc8 = 28; continue $sw8; }
                    if (com.jcraft.jsch.Util.j6(r6.Zo, r10) == true) { $pc8 = 25; continue $sw8; }
                    r5 = 2;
                    { $pc8 = 28; continue $sw8; }
                }
                case 25: {
                    try {
                        monitor-exit(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 29; continue $sw8;
                    }
                    return 0;
                }
                case 28: {
                    try {
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 29; continue $sw8;
                    }
                    { $pc8 = 34; continue $sw8; }
                }
                case 10: {
                    try {
                        monitor-exit(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 29; continue $sw8;
                    }
                    if (r5 == 1) { $pc8 = 13; continue $sw8; }
                    $pc8 = 18; continue $sw8;
                }
                case 18: {
                    return r5;
                }
                case 13: {
                    if (r9.startsWith("[") == false) { $pc8 = 18; continue $sw8; }
                    if (r9.indexOf("]:") <= 1) { $pc8 = 18; continue $sw8; }
                    return j6(r9.substring(1, r9.indexOf("]:")), r10);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String j6() {
        return this.Hw;
    }

    @Override
    public void j6(com.jcraft.jsch.HostKey r7, com.jcraft.jsch.UserInfo r8) {
        int r0 = 0;
        java.lang.String r1 = null;
        byte[] r2 = null;
        java.util.Vector r3 = null;
        boolean r4 = false;
        int r5 = 0;
        com.jcraft.jsch.HostKey r6 = null;
        int r9 = 0;
        java.lang.String r10 = null;
        java.io.File r11 = null;
        boolean r12 = false;
        java.io.File r13 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = r7.v5;
                    r1 = r7.DW();
                    r2 = r7.Zo;
                    r3 = this.v5;
                    monitor-enter(r3);
                    r4 = false;
                    r5 = 0;
                    $pc9 = 45; continue $sw9;
                }
                case 45: {
                    $pc9 = 38; continue $sw9;
                }
                case 38: {
                    th = $ex9;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 6: {
                    if (r5 >= this.v5.size()) { $pc9 = 7; continue $sw9; }
                    try {
                        r6 = (com.jcraft.jsch.HostKey) this.v5.elementAt(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 38; continue $sw9;
                    }
                    if (r6.j6(r1) == false) { $pc9 = 37; continue $sw9; }
                    try {
                        r9 = r6.v5;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 38; continue $sw9;
                    }
                    $pc9 = 37; continue $sw9;
                }
                case 37: {
                    try {
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 38; continue $sw9;
                    }
                    { $pc9 = 45; continue $sw9; }
                }
                case 7: {
                    try {
                        monitor-exit(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 38; continue $sw9;
                    }
                    this.v5.addElement(r7);
                    r10 = j6();
                    if (r10 == null) { $pc9 = 50; continue $sw9; }
                    r11 = new java.io.File(com.jcraft.jsch.Util.j6(r10));
                    if (r11.exists() == true) { $pc9 = 27; continue $sw9; }
                    if (r8 == null) { $pc9 = 28; continue $sw9; }
                    r12 = r8.Hw(java.lang.String.valueOf(r10) + " does not exist.\nAre you sure you want to create it?");
                    r13 = r11.getParentFile();
                    if (r12 == false) { $pc9 = 24; continue $sw9; }
                    if (r13 == null) { $pc9 = 24; continue $sw9; }
                    if (r13.exists() == true) { $pc9 = 24; continue $sw9; }
                    r12 = r8.Hw("The parent directory " + r13 + " does not exist.\nAre you sure you want to create it?");
                    if (r12 == false) { $pc9 = 24; continue $sw9; }
                    if (r13.mkdirs() == true) { $pc9 = 23; continue $sw9; }
                    r8.DW(r13 + " has not been created.");
                    r12 = false;
                    { $pc9 = 24; continue $sw9; }
                }
                case 23: {
                    r8.DW(r13 + " has been succesfully created.\nPlease check its access permission.");
                    $pc9 = 24; continue $sw9;
                }
                case 24: {
                    if (r13 == null) { $pc9 = 28; continue $sw9; }
                    r4 = r12;
                    $pc9 = 28; continue $sw9;
                }
                case 28: {
                    if (r4 == false) { $pc9 = 51; continue $sw9; }
                    try {
                        DW(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.Exception) { $pc9 = 31; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 31: {
                    e = $ex9;
                    java.lang.System.err.println("sync known_hosts: " + e);
                    return;
                }
                case 51: {
                    return;
                }
                case 27: {
                    r4 = true;
                    { $pc9 = 28; continue $sw9; }
                }
                case 50: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(java.io.InputStream r18) {
        java.lang.StringBuffer r0 = null;
        byte[] r1 = null;
        byte[] r9 = null;
        int r2 = 0;
        int r3 = 0;
        int r5 = 0;
        int r4 = 0;
        byte[] r6 = null;
        int r7 = 0;
        byte r12 = 0;
        int r13 = 0;
        byte r8 = 0;
        java.lang.String r14 = null;
        byte r15 = 0;
        java.lang.String r16 = null;
        int r17 = 0;
        byte r10 = 0;
        java.lang.String r19 = null;
        byte r110 = 0;
        int r111 = 0;
        byte r11 = 0;
        byte r20 = 0;
        int r21 = 0;
        byte r22 = 0;
        java.lang.String r23 = null;
        byte r24 = 0;
        int r25 = 0;
        byte r112 = 0;
        java.lang.String r26 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    this.v5.removeAllElements();
                    r0 = new java.lang.StringBuffer();
                    try {
                        r1 = new byte[1024];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 4; continue $sw10;
                }
                case 4: {
                    r9 = r1;
                    r2 = 0;
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    try {
                        r3 = r18.read();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    r5 = -1;
                    if (r3 == (-1)) { $pc10 = 8; continue $sw10; }
                    if (r3 == 13) { $pc10 = 5; continue $sw10; }
                    if (r3 == 10) { $pc10 = 22; continue $sw10; }
                    if (r9.length <= r2) { $pc10 = 21; continue $sw10; }
                    $pc10 = 147; continue $sw10;
                }
                case 147: {
                    try {
                        r4 = r2 + 1;
                        r9[r2] = (byte) r3;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    r2 = r4;
                    { $pc10 = 5; continue $sw10; }
                }
                case 21: {
                    if (r2 > 10240) { $pc10 = 22; continue $sw10; }
                    try {
                        r6 = new byte[r9.length * 2];
                        java.lang.System.arraycopy(r9, 0, r6, 0, r9.length);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    r9 = r6;
                    $pc10 = 22; continue $sw10;
                }
                case 22: {
                    r7 = 0;
                    $pc10 = 24; continue $sw10;
                }
                case 24: {
                    if (r7 >= r2) { $pc10 = 33; continue $sw10; }
                    try {
                        r12 = r9[r7];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r12 == 32) { $pc10 = 145; continue $sw10; }
                    if (r12 == 9) { $pc10 = 145; continue $sw10; }
                    if (r12 != 35) { $pc10 = 33; continue $sw10; }
                    try {
                        FH(com.jcraft.jsch.Util.j6(r9, 0, r2));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 144; continue $sw10;
                }
                case 144: {
                    r1 = r9;
                    $pc10 = 145; continue $sw10;
                }
                case 145: {
                    try {
                        r7 = r7 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 33; continue $sw10;
                }
                case 33: {
                    if (r7 < r2) { $pc10 = 35; continue $sw10; }
                    try {
                        FH(com.jcraft.jsch.Util.j6(r9, 0, r2));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    { $pc10 = 144; continue $sw10; }
                }
                case 35: {
                    try {
                        r0.setLength(0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 36; continue $sw10;
                }
                case 36: {
                    if (r7 >= r2) { $pc10 = 44; continue $sw10; }
                    try {
                        r13 = r7 + 1;
                        r8 = r9[r7];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r8 == 32) { $pc10 = 43; continue $sw10; }
                    if (r8 == 9) { $pc10 = 43; continue $sw10; }
                    try {
                        r0.append((char) r8);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    r7 = r13;
                    $pc10 = 43; continue $sw10;
                }
                case 43: {
                    r7 = r13;
                    $pc10 = 44; continue $sw10;
                }
                case 44: {
                    try {
                        r14 = r0.toString();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r7 < r2) { $pc10 = 47; continue $sw10; }
                    $pc10 = 143; continue $sw10;
                }
                case 143: {
                    try {
                        FH(com.jcraft.jsch.Util.j6(r9, 0, r2));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    { $pc10 = 144; continue $sw10; }
                }
                case 47: {
                    if (r14.length() == 0) { $pc10 = 143; continue $sw10; }
                    $pc10 = 49; continue $sw10;
                }
                case 49: {
                    if (r7 >= r2) { $pc10 = 55; continue $sw10; }
                    try {
                        r15 = r9[r7];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r15 == 32) { $pc10 = 142; continue $sw10; }
                    if (r15 != 9) { $pc10 = 55; continue $sw10; }
                    $pc10 = 142; continue $sw10;
                }
                case 142: {
                    try {
                        r7 = r7 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 55; continue $sw10;
                }
                case 55: {
                    r16 = "";
                    if (r14.charAt(0) != '@') { $pc10 = 80; continue $sw10; }
                    try {
                        r0.setLength(0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 58; continue $sw10;
                }
                case 58: {
                    if (r7 >= r2) { $pc10 = 66; continue $sw10; }
                    try {
                        r17 = r7 + 1;
                        r10 = r9[r7];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r10 == 32) { $pc10 = 65; continue $sw10; }
                    if (r10 == 9) { $pc10 = 65; continue $sw10; }
                    try {
                        r0.append((char) r10);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    r7 = r17;
                    $pc10 = 65; continue $sw10;
                }
                case 65: {
                    r7 = r17;
                    $pc10 = 66; continue $sw10;
                }
                case 66: {
                    try {
                        r19 = r0.toString();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r7 < r2) { $pc10 = 69; continue $sw10; }
                    $pc10 = 79; continue $sw10;
                }
                case 79: {
                    try {
                        FH(com.jcraft.jsch.Util.j6(r9, 0, r2));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    { $pc10 = 144; continue $sw10; }
                }
                case 69: {
                    if (r19.length() == 0) { $pc10 = 79; continue $sw10; }
                    $pc10 = 71; continue $sw10;
                }
                case 71: {
                    if (r7 >= r2) { $pc10 = 77; continue $sw10; }
                    try {
                        r110 = r9[r7];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r110 == 32) { $pc10 = 78; continue $sw10; }
                    if (r110 != 9) { $pc10 = 77; continue $sw10; }
                    $pc10 = 78; continue $sw10;
                }
                case 78: {
                    try {
                        r7 = r7 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 77; continue $sw10;
                }
                case 77: {
                    r16 = r14;
                    r14 = r19;
                    $pc10 = 80; continue $sw10;
                }
                case 80: {
                    try {
                        r0.setLength(0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 81; continue $sw10;
                }
                case 81: {
                    if (r7 >= r2) { $pc10 = 82; continue $sw10; }
                    try {
                        r111 = r7 + 1;
                        r11 = r9[r7];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r11 == 32) { $pc10 = 89; continue $sw10; }
                    if (r11 == 9) { $pc10 = 89; continue $sw10; }
                    try {
                        r0.append((char) r11);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    r7 = r111;
                    $pc10 = 89; continue $sw10;
                }
                case 89: {
                    if (r0.toString().equals("ssh-dss") == false) { $pc10 = 92; continue $sw10; }
                    r5 = 1;
                    $pc10 = 95; continue $sw10;
                }
                case 95: {
                    if (r111 < r2) { $pc10 = 97; continue $sw10; }
                    try {
                        FH(com.jcraft.jsch.Util.j6(r9, 0, r2));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 97; continue $sw10;
                }
                case 97: {
                    if (r111 >= r2) { $pc10 = 103; continue $sw10; }
                    try {
                        r20 = r9[r111];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r20 == 32) { $pc10 = 141; continue $sw10; }
                    if (r20 != 9) { $pc10 = 103; continue $sw10; }
                    $pc10 = 141; continue $sw10;
                }
                case 141: {
                    try {
                        r111 = r111 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 103; continue $sw10;
                }
                case 103: {
                    try {
                        r0.setLength(0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 104; continue $sw10;
                }
                case 104: {
                    if (r111 >= r2) { $pc10 = 117; continue $sw10; }
                    try {
                        r21 = r111 + 1;
                        r22 = r9[r111];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r22 == 13) { $pc10 = 115; continue $sw10; }
                    if (r22 == 10) { $pc10 = 116; continue $sw10; }
                    if (r22 == 32) { $pc10 = 116; continue $sw10; }
                    if (r22 == 9) { $pc10 = 116; continue $sw10; }
                    try {
                        r0.append((char) r22);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 116; continue $sw10;
                }
                case 116: {
                    r111 = r21;
                    $pc10 = 115; continue $sw10;
                }
                case 115: {
                    r111 = r21;
                    $pc10 = 117; continue $sw10;
                }
                case 117: {
                    try {
                        r23 = r0.toString();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r23.length() != 0) { $pc10 = 120; continue $sw10; }
                    try {
                        FH(com.jcraft.jsch.Util.j6(r9, 0, r2));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 120; continue $sw10;
                }
                case 120: {
                    if (r111 >= r2) { $pc10 = 127; continue $sw10; }
                    try {
                        r24 = r9[r111];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r24 == 32) { $pc10 = 140; continue $sw10; }
                    if (r24 != 9) { $pc10 = 127; continue $sw10; }
                    $pc10 = 140; continue $sw10;
                }
                case 140: {
                    try {
                        r111 = r111 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 127; continue $sw10;
                }
                case 127: {
                    if (r111 >= r2) { $pc10 = 138; continue $sw10; }
                    try {
                        r0.setLength(0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 129; continue $sw10;
                }
                case 129: {
                    if (r111 >= r2) { $pc10 = 135; continue $sw10; }
                    try {
                        r25 = r111 + 1;
                        r112 = r9[r111];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    if (r112 == 13) { $pc10 = 137; continue $sw10; }
                    if (r112 == 10) { $pc10 = 135; continue $sw10; }
                    try {
                        r0.append((char) r112);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 137; continue $sw10;
                }
                case 137: {
                    r111 = r25;
                    $pc10 = 135; continue $sw10;
                }
                case 135: {
                    try {
                        r26 = r0.toString();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    $pc10 = 139; continue $sw10;
                }
                case 139: {
                    try {
                        this.v5.addElement(new com.jcraft.jsch.KnownHosts.HashedHostKey(this, r16, r14, r5, com.jcraft.jsch.Util.DW(com.jcraft.jsch.Util.FH(r23), 0, r23.length()), r26));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 151; continue $sw10; }
                        $pc10 = 149; continue $sw10;
                    }
                    { $pc10 = 144; continue $sw10; }
                }
                case 138: {
                    r26 = null;
                    { $pc10 = 139; continue $sw10; }
                }
                case 92: {
                    if (r0.toString().equals("ssh-rsa") == false) { $pc10 = 94; continue $sw10; }
                    r5 = 2;
                    { $pc10 = 95; continue $sw10; }
                }
                case 94: {
                    r111 = r2;
                    { $pc10 = 95; continue $sw10; }
                }
                case 82: {
                    r111 = r7;
                    { $pc10 = 89; continue $sw10; }
                }
                case 8: {
                    if (r2 != 0) { $pc10 = 22; continue $sw10; }
                    try {
                        r18.close();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.io.IOException) { $pc10 = 11; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 11: {
                    e = $ex10;
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                case 151: {
                    e = $ex10;
                    if ((e instanceof com.jcraft.jsch.JSchException) == true) { $pc10 = 157; continue $sw10; }
                    try {
                        throw new com.jcraft.jsch.JSchException(e.toString(), e);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 149; continue $sw10;
                    }
                }
                case 157: {
                    try {
                        throw ((com.jcraft.jsch.JSchException) e);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 149; continue $sw10;
                    }
                }
                case 149: {
                    th = $ex10;
                    try {
                        r18.close();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.io.IOException) { $pc10 = 160; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 160: {
                    e = $ex10;
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(java.io.OutputStream r9) {
        java.util.Vector r0 = null;
        int r1 = 0;
        com.jcraft.jsch.HostKey r2 = null;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        java.lang.String r5 = null;
        java.lang.String r6 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    try {
                        r0 = this.v5;
                        monitor-enter(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 23; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r1 = 0;
                    $pc11 = 27; continue $sw11;
                }
                case 27: {
                    $pc11 = 20; continue $sw11;
                }
                case 20: {
                    th = $ex11;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 23; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 6: {
                    if (r1 >= this.v5.size()) { $pc11 = 7; continue $sw11; }
                    try {
                        r2 = (com.jcraft.jsch.HostKey) this.v5.elementAt(r1);
                        r3 = r2.Hw();
                        r4 = r2.DW();
                        r5 = r2.v5();
                        r6 = r2.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 20; continue $sw11;
                    }
                    if (r5.equals("UNKNOWN") == false) { $pc11 = 13; continue $sw11; }
                    try {
                        r9.write(com.jcraft.jsch.Util.FH(r4));
                        r9.write(DW);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 20; continue $sw11;
                    }
                    $pc11 = 19; continue $sw11;
                }
                case 19: {
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 20; continue $sw11;
                    }
                    { $pc11 = 27; continue $sw11; }
                }
                case 13: {
                    if (r3.length() == 0) { $pc11 = 15; continue $sw11; }
                    try {
                        r9.write(com.jcraft.jsch.Util.FH(r3));
                        r9.write(j6);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 20; continue $sw11;
                    }
                    $pc11 = 15; continue $sw11;
                }
                case 15: {
                    try {
                        r9.write(com.jcraft.jsch.Util.FH(r4));
                        r9.write(j6);
                        r9.write(com.jcraft.jsch.Util.FH(r5));
                        r9.write(j6);
                        r9.write(com.jcraft.jsch.Util.FH(r2.FH()));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 20; continue $sw11;
                    }
                    if (r6 == null) { $pc11 = 18; continue $sw11; }
                    try {
                        r9.write(j6);
                        r9.write(com.jcraft.jsch.Util.FH(r6));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 20; continue $sw11;
                    }
                    $pc11 = 18; continue $sw11;
                }
                case 18: {
                    try {
                        r9.write(DW);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 20; continue $sw11;
                    }
                    { $pc11 = 19; continue $sw11; }
                }
                case 7: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 20; continue $sw11;
                    }
                    $pc11 = 32; continue $sw11;
                }
                case 32: {
                    return;
                }
                case 23: {
                    e = $ex11;
                    java.lang.System.err.println(e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(java.lang.String r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    try {
                        this.Hw = r3;
                        j6(new java.io.FileInputStream(com.jcraft.jsch.Util.j6(r3)));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.io.FileNotFoundException) { $pc12 = 4; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    e = $ex12;
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(java.lang.String r6, java.lang.String r7, byte[] r8) {
        java.util.Vector r0 = null;
        int r1 = 0;
        boolean r2 = false;
        com.jcraft.jsch.HostKey r3 = null;
        java.lang.String r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = this.v5;
                    monitor-enter(r0);
                    r1 = 0;
                    r2 = false;
                    $pc13 = 38; continue $sw13;
                }
                case 38: {
                    $pc13 = 32; continue $sw13;
                }
                case 32: {
                    th = $ex13;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 6: {
                    if (r1 >= this.v5.size()) { $pc13 = 7; continue $sw13; }
                    try {
                        r3 = (com.jcraft.jsch.HostKey) this.v5.elementAt(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 32; continue $sw13;
                    }
                    if (r6 != null) { $pc13 = 14; continue $sw13; }
                    $pc13 = 21; continue $sw13;
                }
                case 21: {
                    try {
                        r4 = r3.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 32; continue $sw13;
                    }
                    if (r4.equals(r6) == false) { $pc13 = 24; continue $sw13; }
                    $pc13 = 29; continue $sw13;
                }
                case 29: {
                    try {
                        this.v5.removeElement(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 32; continue $sw13;
                    }
                    $pc13 = 30; continue $sw13;
                }
                case 30: {
                    r2 = true;
                    $pc13 = 31; continue $sw13;
                }
                case 31: {
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 32; continue $sw13;
                    }
                    { $pc13 = 38; continue $sw13; }
                }
                case 24: {
                    if ((r3 instanceof com.jcraft.jsch.KnownHosts.HashedHostKey) == true) { $pc13 = 26; continue $sw13; }
                    $pc13 = 28; continue $sw13;
                }
                case 28: {
                    try {
                        r3.Hw = DW(r4, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 32; continue $sw13;
                    }
                    { $pc13 = 30; continue $sw13; }
                }
                case 26: {
                    if (((com.jcraft.jsch.KnownHosts.HashedHostKey) r3).VH() == false) { $pc13 = 28; continue $sw13; }
                    $pc13 = 14; continue $sw13;
                }
                case 14: {
                    if (r3.j6(r6) == false) { $pc13 = 31; continue $sw13; }
                    if (r7 == null) { $pc13 = 21; continue $sw13; }
                    if (r3.v5().equals(r7) == false) { $pc13 = 31; continue $sw13; }
                    if (r8 == null) { $pc13 = 21; continue $sw13; }
                    if (com.jcraft.jsch.Util.j6(r8, r3.Zo) == false) { $pc13 = 31; continue $sw13; }
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 32; continue $sw13;
                    }
                    if (r2 == false) { $pc13 = 47; continue $sw13; }
                    try {
                        DW();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.lang.Exception) { $pc13 = 37; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 48: {
                    return;
                }
                case 37: {
                    $pc13 = 47; continue $sw13;
                }
                case 47: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.jcraft.jsch.HostKey[] j6(java.lang.String r8, java.lang.String r9) {
        java.util.Vector r0 = null;
        java.util.ArrayList r1 = null;
        int r3 = 0;
        com.jcraft.jsch.HostKey r4 = null;
        com.jcraft.jsch.HostKey[] r5 = null;
        int r6 = 0;
        com.jcraft.jsch.HostKey[] r10 = null;
        com.jcraft.jsch.HostKey[] r11 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = this.v5;
                    monitor-enter(r0);
                    try {
                        r1 = new java.util.ArrayList();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 33; continue $sw14;
                    }
                    r3 = 0;
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    if (r3 >= this.v5.size()) { $pc14 = 7; continue $sw14; }
                    try {
                        r4 = (com.jcraft.jsch.HostKey) this.v5.elementAt(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 33; continue $sw14;
                    }
                    if (r4.v5 == 3) { $pc14 = 32; continue $sw14; }
                    if (r8 != null) { $pc14 = 27; continue $sw14; }
                    $pc14 = 31; continue $sw14;
                }
                case 31: {
                    try {
                        r1.add(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 33; continue $sw14;
                    }
                    { $pc14 = 32; continue $sw14; }
                }
                case 27: {
                    if (r4.j6(r8) == false) { $pc14 = 32; continue $sw14; }
                    if (r9 == null) { $pc14 = 31; continue $sw14; }
                    if (r4.v5().equals(r9) == true) { $pc14 = 31; continue $sw14; }
                    $pc14 = 32; continue $sw14;
                }
                case 32: {
                    try {
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 33; continue $sw14;
                    }
                    { $pc14 = 6; continue $sw14; }
                }
                case 7: {
                    try {
                        r5 = new com.jcraft.jsch.HostKey[r1.size()];
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 33; continue $sw14;
                    }
                    r6 = 0;
                    $pc14 = 9; continue $sw14;
                }
                case 9: {
                    if (r6 >= r1.size()) { $pc14 = 10; continue $sw14; }
                    try {
                        r5[r6] = (com.jcraft.jsch.HostKey) r1.get(r6);
                        r6 = r6 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 33; continue $sw14;
                    }
                    { $pc14 = 9; continue $sw14; }
                }
                case 10: {
                    if (r8 != null) { $pc14 = 12; continue $sw14; }
                    $pc14 = 18; continue $sw14;
                }
                case 18: {
                    r10 = r5;
                    $pc14 = 19; continue $sw14;
                }
                case 19: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 33; continue $sw14;
                    }
                    return r10;
                }
                case 12: {
                    if (r8.startsWith("[") == false) { $pc14 = 18; continue $sw14; }
                    if (r8.indexOf("]:") <= 1) { $pc14 = 18; continue $sw14; }
                    try {
                        r11 = j6(r8.substring(1, r8.indexOf("]:")), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 33; continue $sw14;
                    }
                    if (r11.length <= 0) { $pc14 = 18; continue $sw14; }
                    try {
                        r10 = new com.jcraft.jsch.HostKey[r5.length + r11.length];
                        java.lang.System.arraycopy(r5, 0, r10, 0, r5.length);
                        java.lang.System.arraycopy(r11, 0, r10, r5.length, r11.length);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 33; continue $sw14;
                    }
                    $pc14 = 33; continue $sw14;
                }
                case 33: {
                    th = $ex14;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
