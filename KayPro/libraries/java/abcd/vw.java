package abcd;

public class vw {

    private static class a extends android.content.BroadcastReceiver {
        private abcd.vw.b j6;

        public a(abcd.vw.b r1) {
            this.j6 = r1;
        }

        @Override
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
            android.net.NetworkInfo r3 = ((android.net.ConnectivityManager) r1.getSystemService("connectivity")).getActiveNetworkInfo();
            if (r3 != null) goto L5;
        L7:
            boolean r4 = false;
        L8:
            this.j6.j6(r4);
            return;
        L5:
            if (r3.isConnected() == false) goto L7;
            r4 = true;
            goto L8
        }
    }

    public interface b {
        void j6(boolean r1);
    }

    public static boolean DW() {
        if (j6() == false) goto L14;
        android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) abcd.wu.j6().getSystemService("connectivity");
        if (r0 != null) goto L7;
        return true;
    L7:
        android.net.NetworkInfo r1 = r0.getActiveNetworkInfo();
        if (r1 != null) goto L10;
    L12:
        return false;
    L10:
        if (r1.isConnected() == false) goto L12;
        return true;
    L14:
        return true;
    }

    private static int j6(android.content.Context r2, java.lang.String r3) {
        return r2.checkPermission(r3, android.os.Process.myPid(), android.os.Process.myUid());
    }

    public static void j6(abcd.vw.b r3) {
        if (j6() == false) goto L6;
        android.content.IntentFilter r0 = new android.content.IntentFilter();
        r0.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        abcd.wu.j6().registerReceiver(new abcd.vw.a(r3), r0);
        return;
    }

    public static boolean j6() {
        if (j6(abcd.wu.j6(), "android.permission.ACCESS_NETWORK_STATE") != 0) goto L5;
        return true;
    L5:
        return false;
    }
}
