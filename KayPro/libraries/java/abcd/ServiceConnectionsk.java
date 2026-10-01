package abcd;

@abcd.Interfacexu
class ServiceConnectionsk implements android.content.ServiceConnection {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.yk FH;

    static {
        abcd.wu.j6(abcd.ServiceConnectionsk.class, -7932626172141952505L, 404002176226591423L);
    }

    ServiceConnectionsk(abcd.yk r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 380206884670360605L)
    public void onServiceConnected(android.content.ComponentName r8, android.os.IBinder r9) {
        synchronized (abcd.yk.Zo(this.FH)) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 14: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 18; continue $sw0; }
                        abcd.wu.j6(th, 26237578953835304L, this, r8, r9);
                        $pc0 = 18; continue $sw0;
                    }
                    case 18: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc0 = 5; continue $sw0; }
                        try {
                            abcd.wu.j6(26237578953835304L, this, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 14; continue $sw0;
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        try {
                            this.FH.VH("service connected.");
                            r0 = abcd.yk.Zo(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 14; continue $sw0;
                        }
                        try {
                            abcd.yk.j6(this.FH, abcd.Interfacequ.a.j6(r9));
                            abcd.yk.DW(this.FH, true);
                            abcd.yk.Zo(this.FH).notifyAll();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 11; continue $sw0;
                        }
                        try {
                            this.FH.j6();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 14; continue $sw0;
                        }
                        return;
                    }
                    case 11: {
                        th = $ex0;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 14; continue $sw0;
                        }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    @Override
    @abcd.Interfacesu(method = -20389536286894953L)
    public void onServiceDisconnected(android.content.ComponentName r7) {
        synchronized (abcd.yk.Zo(this.FH)) {
            java.lang.Object r2 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 4;
            $sw1: while (true) {
                switch ($pc1) {
                    case 14: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 18; continue $sw1; }
                        abcd.wu.j6(th, 63626672643443136L, this, r7);
                        $pc1 = 18; continue $sw1;
                    }
                    case 18: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc1 = 6; continue $sw1; }
                        try {
                            abcd.wu.j6(63626672643443136L, this, r7);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 14; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        try {
                            this.FH.VH("service disconnected.");
                            abcd.yk.j6(this.FH, false);
                            r2 = abcd.yk.Zo(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 14; continue $sw1;
                        }
                        try {
                            abcd.yk.j6(this.FH, null);
                            abcd.yk.DW(this.FH, false);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 11; continue $sw1;
                        }
                        return;
                    }
                    case 11: {
                        th = $ex1;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 14; continue $sw1;
                        }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
