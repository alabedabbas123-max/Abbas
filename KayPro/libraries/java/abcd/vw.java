package abcd;

public class vw {

    private static class a extends android.content.BroadcastReceiver {
        private abcd.vw.b j6;

        public a(abcd.vw.b r1) {
            this.j6 = r1;
        }

        @Override
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
            android.net.NetworkInfo r3 = null;
            boolean r4 = false;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r3 = ((android.net.ConnectivityManager) r1.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (r3 != null) { $pc0 = 5; continue $sw0; }
                        $pc0 = 7; continue $sw0;
                    }
                    case 7: {
                        r4 = false;
                        $pc0 = 8; continue $sw0;
                    }
                    case 8: {
                        this.j6.j6(r4);
                        return;
                    }
                    case 5: {
                        if (r3.isConnected() == false) { $pc0 = 7; continue $sw0; }
                        r4 = true;
                        { $pc0 = 8; continue $sw0; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public interface b {
        void j6(boolean r1);
    }

    public static boolean DW() {
        android.net.ConnectivityManager r0 = null;
        android.net.NetworkInfo r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (j6() == false) { $pc1 = 14; continue $sw1; }
                    r0 = (android.net.ConnectivityManager) abcd.wu.j6().getSystemService("connectivity");
                    if (r0 != null) { $pc1 = 7; continue $sw1; }
                    return true;
                }
                case 7: {
                    r1 = r0.getActiveNetworkInfo();
                    if (r1 != null) { $pc1 = 10; continue $sw1; }
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    return false;
                }
                case 10: {
                    if (r1.isConnected() == false) { $pc1 = 12; continue $sw1; }
                    return true;
                }
                case 14: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(android.content.Context r2, java.lang.String r3) {
        return r2.checkPermission(r3, android.os.Process.myPid(), android.os.Process.myUid());
    }

    public static void j6(abcd.vw.b r3) {
        android.content.IntentFilter r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (j6() == false) { $pc2 = 6; continue $sw2; }
                    r0 = new android.content.IntentFilter();
                    r0.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    abcd.wu.j6().registerReceiver(new abcd.vw.a(r3), r0);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (j6(abcd.wu.j6(), "android.permission.ACCESS_NETWORK_STATE") != 0) { $pc3 = 5; continue $sw3; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
