package io.fabric.sdk.android;

public class b implements io.fabric.sdk.android.m {
    private int j6;

    public b() {
        this.j6 = 4;
    }

    public b(int r1) {
        this.j6 = r1;
    }

    @Override
    public void DW(java.lang.String r2, java.lang.String r3) {
        FH(r2, r3, null);
    }

    @Override
    public void DW(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6(r2, 5) == false) { $pc0 = 6; continue $sw0; }
                    android.util.Log.w(r2, r3, r4);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void FH(java.lang.String r2, java.lang.String r3) {
        v5(r2, r3, null);
    }

    @Override
    public void FH(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (j6(r2, 6) == false) { $pc1 = 6; continue $sw1; }
                    android.util.Log.e(r2, r3, r4);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void Hw(java.lang.String r2, java.lang.String r3) {
        j6(r2, r3, null);
    }

    public void Hw(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (j6(r2, 4) == false) { $pc2 = 6; continue $sw2; }
                    android.util.Log.i(r2, r3, r4);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(int r2, java.lang.String r3, java.lang.String r4) {
        j6(r2, r3, r4, false);
    }

    @Override
    public void j6(int r1, java.lang.String r2, java.lang.String r3, boolean r4) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r4 == false) { $pc3 = 4; continue $sw3; }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    android.util.Log.println(r1, r2, r3);
                    return;
                }
                case 4: {
                    if (j6(r2, r1) == true) { $pc3 = 5; continue $sw3; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(java.lang.String r2, java.lang.String r3) {
        DW(r2, r3, null);
    }

    @Override
    public void j6(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (j6(r2, 3) == false) { $pc4 = 6; continue $sw4; }
                    android.util.Log.d(r2, r3, r4);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6(java.lang.String r2, int r3) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.j6 > r3) { $pc5 = 5; continue $sw5; }
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    return true;
                }
                case 5: {
                    if (android.util.Log.isLoggable(r2, r3) == true) { $pc5 = 8; continue $sw5; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void v5(java.lang.String r2, java.lang.String r3) {
        Hw(r2, r3, null);
    }

    public void v5(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (j6(r2, 2) == false) { $pc6 = 6; continue $sw6; }
                    android.util.Log.v(r2, r3, r4);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
