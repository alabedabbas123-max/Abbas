package abcd;

public class WG {
    static final java.io.FilenameFilter j6 = null;
    private final java.io.File DW;
    private final java.io.File FH;
    private boolean Hw;
    private boolean VH;
    private boolean Zo;
    private abcd.LG gn;
    private final abcd.AbstractpK u7;
    private java.io.FileOutputStream v5;

    static {
        j6 = new abcd.UG();
    }

    public WG(java.io.File r1, abcd.AbstractpK r2) {
        this.DW = r1;
        this.FH = j6(this.DW);
        this.u7 = r2;
    }

    static java.io.FileOutputStream DW(abcd.WG r0) {
        return r0.v5;
    }

    private boolean VH() {
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.u7.Hw() == false) { $pc0 = 5; continue $sw0; }
                    r1 = 0;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r1 >= 10) { $pc0 = 9; continue $sw0; }
                    if (this.DW.delete() == true) { $pc0 = 12; continue $sw0; }
                    try {
                        java.lang.Thread.sleep(100);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r1 = r1 + 1;
                    $pc0 = 12; continue $sw0;
                }
                case 17: {
                    return false;
                }
                case 12: {
                    return true;
                }
                case 9: {
                    return false;
                }
                case 5: {
                    return this.DW.delete();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean gn() {
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.u7.Hw() == false) { $pc1 = 5; continue $sw1; }
                    r1 = 0;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r1 >= 10) { $pc1 = 9; continue $sw1; }
                    if (this.FH.renameTo(this.DW) == true) { $pc1 = 12; continue $sw1; }
                    try {
                        java.lang.Thread.sleep(100);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc1 = 17; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r1 = r1 + 1;
                    $pc1 = 12; continue $sw1;
                }
                case 17: {
                    return false;
                }
                case 12: {
                    return true;
                }
                case 9: {
                    return false;
                }
                case 5: {
                    return this.FH.renameTo(this.DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.io.File j6(java.io.File r3) {
        return new java.io.File(r3.getParentFile(), java.lang.String.valueOf(r3.getName()) + ".lock");
    }

    static void j6(abcd.WG r0, java.io.FileOutputStream r1) {
        r0.v5 = r1;
    }

    static boolean j6(abcd.WG r0) {
        return r0.VH;
    }

    private void tp() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.Zo == false) { $pc2 = 6; continue $sw2; }
                    this.gn = abcd.LG.DW(this.FH);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void u7() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.v5 == null) { $pc3 = 5; continue $sw3; }
                    return;
                }
                case 5: {
                    v5();
                    throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().lockOnNotHeld, new java.lang.Object[]{this.DW}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.LG DW() {
        return this.gn;
    }

    public void DW(boolean r1) {
        this.Zo = r1;
    }

    public java.io.OutputStream FH() {
        java.io.OutputStream r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    u7();
                    if (this.VH == false) { $pc4 = 5; continue $sw4; }
                    r0 = java.nio.channels.Channels.newOutputStream(this.v5.getChannel());
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    return new abcd.VG(this, r0);
                }
                case 5: {
                    r0 = this.v5;
                    { $pc4 = 7; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(boolean r1) {
        DW(r1);
    }

    public boolean Hw() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    abcd.zK.DW(this.FH.getParentFile(), true);
                    if (this.FH.createNewFile() == false) { $pc5 = 11; continue $sw5; }
                    this.Hw = true;
                    try {
                        this.v5 = new java.io.FileOutputStream(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 7; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 11; continue $sw5;
                }
                case 7: {
                    e = $ex5;
                    v5();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 11: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Zo() {
        abcd.LG r0 = null;
        abcd.LG r1 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = abcd.LG.DW(this.DW);
                    r1 = abcd.LG.DW(this.FH);
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r0.j6(r1) == false) { $pc6 = 5; continue $sw6; }
                    java.lang.Thread.sleep(25);
                    this.FH.setLastModified(java.lang.System.currentTimeMillis());
                    r1 = abcd.LG.DW(this.FH);
                    { $pc6 = 4; continue $sw6; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.yE r3) {
        byte[] r0 = new byte[41];
        r3.FH(r0, 0);
        r0[40] = 10;
        j6(r0);
    }

    public void j6(boolean r1) {
        this.VH = r1;
    }

    public void j6(byte[] r3) {
        java.nio.channels.FileChannel r0 = null;
        java.nio.ByteBuffer r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    u7();
                    $pc7 = 4; continue $sw7;
                }
                case 19: {
                    e = $ex7;
                    v5();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 13: {
                    e = $ex7;
                    v5();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 16: {
                    e = $ex7;
                    v5();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 4: {
                    if (this.VH == false) { $pc7 = 10; continue $sw7; }
                    try {
                        r0 = this.v5.getChannel();
                        r4 = java.nio.ByteBuffer.wrap(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Error) { $pc7 = 13; continue $sw7; }
                        if ($t instanceof java.lang.RuntimeException) { $pc7 = 16; continue $sw7; }
                        if ($t instanceof java.io.IOException) { $pc7 = 19; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (r4.remaining() <= 0) { $pc7 = 8; continue $sw7; }
                    try {
                        r0.write(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Error) { $pc7 = 13; continue $sw7; }
                        if ($t instanceof java.lang.RuntimeException) { $pc7 = 16; continue $sw7; }
                        if ($t instanceof java.io.IOException) { $pc7 = 19; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc7 = 7; continue $sw7; }
                }
                case 8: {
                    try {
                        r0.force(true);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Error) { $pc7 = 13; continue $sw7; }
                        if ($t instanceof java.lang.RuntimeException) { $pc7 = 16; continue $sw7; }
                        if ($t instanceof java.io.IOException) { $pc7 = 19; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc7 = 11; continue $sw7;
                }
                case 11: {
                    try {
                        this.v5.close();
                        this.v5 = null;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Error) { $pc7 = 13; continue $sw7; }
                        if ($t instanceof java.lang.RuntimeException) { $pc7 = 16; continue $sw7; }
                        if ($t instanceof java.io.IOException) { $pc7 = 19; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 10: {
                    try {
                        this.v5.write(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Error) { $pc7 = 13; continue $sw7; }
                        if ($t instanceof java.lang.RuntimeException) { $pc7 = 16; continue $sw7; }
                        if ($t instanceof java.io.IOException) { $pc7 = 19; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc7 = 11; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6() {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (this.v5 != null) { $pc8 = 16; continue $sw8; }
                    tp();
                    if (this.FH.renameTo(this.DW) == false) { $pc8 = 8; continue $sw8; }
                    return true;
                }
                case 8: {
                    if (this.DW.exists() == false) { $pc8 = 12; continue $sw8; }
                    if (VH() == true) { $pc8 = 12; continue $sw8; }
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    v5();
                    return false;
                }
                case 12: {
                    if (gn() == false) { $pc8 = 14; continue $sw8; }
                    return true;
                }
                case 16: {
                    v5();
                    throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().lockOnNotClosed, new java.lang.Object[]{this.DW}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return "LockFile[" + this.FH + ", haveLck=" + this.Hw + "]";
    }

    public void v5() {
        java.io.FileOutputStream r0 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = this.v5;
                    if (r0 == null) { $pc9 = 7; continue $sw9; }
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.io.IOException) { $pc9 = 12; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    this.v5 = null;
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (this.Hw == false) { $pc9 = 17; continue $sw9; }
                    this.Hw = false;
                    try {
                        abcd.zK.j6(this.FH, 2);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.io.IOException) { $pc9 = 11; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 18: {
                    return;
                }
                case 11: {
                    $pc9 = 17; continue $sw9;
                }
                case 12: {
                    $pc9 = 17; continue $sw9;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
