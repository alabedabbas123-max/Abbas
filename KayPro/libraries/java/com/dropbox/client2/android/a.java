package com.dropbox.client2.android;

public class a extends abcd.Ww {
    public a(abcd.Yw r1, abcd.Zw.a r2) {
        super(r1, r2);
    }

    public a(abcd.Yw r1, abcd.Zw.a r2, abcd.Xw r3) {
        super(r1, r2, r3);
    }

    public java.lang.String EQ() {
        android.content.Intent r0 = com.dropbox.client2.android.AuthActivity.Hw;
        if (r0 == null) goto L28;
        java.lang.String r1 = r0.getStringExtra("ACCESS_TOKEN");
        if (r1 == null) goto L26;
        if (r1.length() == 0) goto L26;
        java.lang.String r2 = r0.getStringExtra("ACCESS_SECRET");
        if (r2 == null) goto L24;
        if (r2.length() == 0) goto L24;
        java.lang.String r3 = r0.getStringExtra("UID");
        if (r3 == null) goto L22;
        if (r3.length() == 0) goto L22;
        if (r1.equals("oauth2:") == false) goto L19;
        j6(r2);
    L20:
        return r3;
    L19:
        j6(new abcd.Xw(r1, r2));
    L22:
        throw new java.lang.IllegalArgumentException("Invalid result intent passed in. Missing uid.");
    L24:
        throw new java.lang.IllegalArgumentException("Invalid result intent passed in. Missing access secret.");
    L26:
        throw new java.lang.IllegalArgumentException("Invalid result intent passed in. Missing access token.");
    L28:
        throw new java.lang.IllegalStateException();
    }

    public void j6(android.content.Context r4) {
        abcd.Yw r0 = gn();
        if (com.dropbox.client2.android.AuthActivity.j6(r4, r0.j6, true) == true) goto L5;
        return;
    L5:
        com.dropbox.client2.android.AuthActivity.j6(r0.j6, r0.DW);
        android.content.Intent r1 = new android.content.Intent(r4, com.dropbox.client2.android.AuthActivity.class);
        if ((r4 instanceof android.app.Activity) == true) goto L8;
        r1.addFlags(268435456);
    L8:
        r4.startActivity(r1);
    }

    public boolean tp() {
        android.content.Intent r0 = com.dropbox.client2.android.AuthActivity.Hw;
        if (r0 != null) goto L5;
        return false;
    L5:
        java.lang.String r2 = r0.getStringExtra("ACCESS_TOKEN");
        java.lang.String r3 = r0.getStringExtra("ACCESS_SECRET");
        java.lang.String r1 = r0.getStringExtra("UID");
        if (r2 != null) goto L8;
    L17:
        return false;
    L8:
        if (r2.equals("") == true) goto L17;
        if (r3 == null) goto L17;
        if (r3.equals("") == true) goto L17;
        if (r1 == null) goto L17;
        if (r1.equals("") == true) goto L17;
        return true;
    }

    @Override
    public void u7() {
        super.u7();
        com.dropbox.client2.android.AuthActivity.Hw = null;
    }
}
