package com.dropbox.client2.android;

public class a extends abcd.Ww {
    public a(abcd.Yw r1, abcd.Zw.a r2) {
        super(r1, r2);
    }

    public a(abcd.Yw r1, abcd.Zw.a r2, abcd.Xw r3) {
        super(r1, r2, r3);
    }

    public java.lang.String EQ() {
        android.content.Intent r0 = null;
        java.lang.String r1 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = com.dropbox.client2.android.AuthActivity.Hw;
                    if (r0 == null) { $pc0 = 28; continue $sw0; }
                    r1 = r0.getStringExtra("ACCESS_TOKEN");
                    if (r1 == null) { $pc0 = 26; continue $sw0; }
                    if (r1.length() == 0) { $pc0 = 26; continue $sw0; }
                    r2 = r0.getStringExtra("ACCESS_SECRET");
                    if (r2 == null) { $pc0 = 24; continue $sw0; }
                    if (r2.length() == 0) { $pc0 = 24; continue $sw0; }
                    r3 = r0.getStringExtra("UID");
                    if (r3 == null) { $pc0 = 22; continue $sw0; }
                    if (r3.length() == 0) { $pc0 = 22; continue $sw0; }
                    if (r1.equals("oauth2:") == false) { $pc0 = 19; continue $sw0; }
                    j6(r2);
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    return r3;
                }
                case 19: {
                    j6(new abcd.Xw(r1, r2));
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    throw new java.lang.IllegalArgumentException("Invalid result intent passed in. Missing uid.");
                }
                case 24: {
                    throw new java.lang.IllegalArgumentException("Invalid result intent passed in. Missing access secret.");
                }
                case 26: {
                    throw new java.lang.IllegalArgumentException("Invalid result intent passed in. Missing access token.");
                }
                case 28: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(android.content.Context r4) {
        abcd.Yw r0 = null;
        android.content.Intent r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = gn();
                    if (com.dropbox.client2.android.AuthActivity.j6(r4, r0.j6, true) == true) { $pc1 = 5; continue $sw1; }
                    return;
                }
                case 5: {
                    com.dropbox.client2.android.AuthActivity.j6(r0.j6, r0.DW);
                    r1 = new android.content.Intent(r4, com.dropbox.client2.android.AuthActivity.class);
                    if ((r4 instanceof android.app.Activity) == true) { $pc1 = 8; continue $sw1; }
                    r1.addFlags(268435456);
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r4.startActivity(r1);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean tp() {
        android.content.Intent r0 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = com.dropbox.client2.android.AuthActivity.Hw;
                    if (r0 != null) { $pc2 = 5; continue $sw2; }
                    return false;
                }
                case 5: {
                    r2 = r0.getStringExtra("ACCESS_TOKEN");
                    r3 = r0.getStringExtra("ACCESS_SECRET");
                    r1 = r0.getStringExtra("UID");
                    if (r2 != null) { $pc2 = 8; continue $sw2; }
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    return false;
                }
                case 8: {
                    if (r2.equals("") == true) { $pc2 = 17; continue $sw2; }
                    if (r3 == null) { $pc2 = 17; continue $sw2; }
                    if (r3.equals("") == true) { $pc2 = 17; continue $sw2; }
                    if (r1 == null) { $pc2 = 17; continue $sw2; }
                    if (r1.equals("") == true) { $pc2 = 17; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void u7() {
        super.u7();
        com.dropbox.client2.android.AuthActivity.Hw = null;
    }
}
