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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.f20a > this.b) { $pc0 = 5; continue $sw0; }
                    return;
                }
                case 5: {
                    throw new java.lang.IllegalStateException("The output is outdated");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(long r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.f20a >= r4) { $pc1 = 6; continue $sw1; }
                    this.f20a = r4;
                    a();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(long r2, boolean r4) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r4 == false) { $pc2 = 5; continue $sw2; }
                    b(r2);
                    return;
                }
                case 5: {
                    a(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(java.io.File r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r2 == null) { $pc3 = 5; continue $sw3; }
                    a(r2, false);
                    return;
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(java.io.File r5, boolean r6) {
        java.io.File[] r1 = null;
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r5.isDirectory() == false) { $pc4 = 12; continue $sw4; }
                    r1 = r5.listFiles();
                    if (r1.length != 0) { $pc4 = 8; continue $sw4; }
                    if (r6 == false) { $pc4 = 8; continue $sw4; }
                    b(Long.MIN_VALUE);
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    r0 = 0;
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    if (r0 >= r1.length) { $pc4 = 15; continue $sw4; }
                    a(r1[r0], r6);
                    r0 = r0 + 1;
                    { $pc4 = 10; continue $sw4; }
                }
                case 15: {
                    return;
                }
                case 12: {
                    a(r5.lastModified(), r6);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void a(java.net.URL r3) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r3 != null) { $pc5 = 4; continue $sw5; }
                    return;
                }
                case 4: {
                    if (r3.getProtocol().equals("file") == false) { $pc5 = 12; continue $sw5; }
                    try {
                        a(new java.io.File(r3.toURI()), false);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.net.URISyntaxException) { $pc5 = 7; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 13: {
                    return;
                }
                case 7: {
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void b(long r4) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.b <= r4) { $pc6 = 6; continue $sw6; }
                    this.b = r4;
                    a();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void b(java.io.File r2) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r2 != null) { $pc7 = 4; continue $sw7; }
                    return;
                }
                case 4: {
                    if (r2.getName().length() <= 0) { $pc7 = 8; continue $sw7; }
                    a(r2, true);
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
