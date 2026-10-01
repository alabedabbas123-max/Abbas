package com.dropbox.client2.android;

public class AuthActivity extends android.app.Activity {
    private static com.dropbox.client2.android.AuthActivity.a DW = null;
    private static final java.lang.Object FH = null;
    public static android.content.Intent Hw = null;
    private static java.lang.String VH = null;
    private static java.lang.String Zo = null;
    private static java.lang.String gn = null;
    private static final java.lang.String j6 = "com.dropbox.client2.android.AuthActivity";
    private static final java.lang.String[] u7 = null;
    private static java.lang.String v5;
    private java.lang.String EQ;
    private java.lang.String J0;
    private java.lang.String J8;
    private java.lang.String tp;
    private java.lang.String we;

    public interface a {
        java.security.SecureRandom j6();
    }

    static {
        DW = new com.dropbox.client2.android.b();
        FH = new java.lang.Object();
        Hw = null;
        VH = "www.dropbox.com";
        u7 = new java.lang.String[]{"308202223082018b02044bd207bd300d06092a864886f70d01010405003058310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f3110300e060355040a130744726f70626f783112301006035504031309546f6d204d65796572301e170d3130303432333230343930315a170d3430303431353230343930315a3058310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f3110300e060355040a130744726f70626f783112301006035504031309546f6d204d6579657230819f300d06092a864886f70d010101050003818d0030818902818100ac1595d0ab278a9577f0ca5a14144f96eccde75f5616f36172c562fab0e98c48ad7d64f1091c6cc11ce084a4313d522f899378d312e112a748827545146a779defa7c31d8c00c2ed73135802f6952f59798579859e0214d4e9c0554b53b26032a4d2dfc2f62540d776df2ea70e2a6152945fb53fef5bac5344251595b729d4810203010001300d06092a864886f70d01010405000381810055c425d94d036153203dc0bbeb3516f94563b102fff39c3d4ed91278db24fc4424a244c2e59f03bbfea59404512b8bf74662f2a32e37eafa2ac904c31f99cfc21c9ff375c977c432d3b6ec22776f28767d0f292144884538c3d5669b568e4254e4ed75d9054f75229ac9d4ccd0b7c3c74a34f07b7657083b2aa76225c0c56ffc", "308201e53082014ea00302010202044e17e115300d06092a864886f70d01010505003037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f6964204465627567301e170d3131303730393035303331375a170d3431303730313035303331375a3037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f696420446562756730819f300d06092a864886f70d010101050003818d003081890281810096759fe5abea6a0757039b92adc68d672efa84732c3f959408e12efa264545c61f23141026a6d01eceeeaa13ec7087087e5894a3363da8bf5c69ed93657a6890738a80998e4ca22dc94848f30e2d0e1890000ae2cddf543b20c0c3828deca6c7944b5ecd21a9d18c988b2b3e54517dafbc34b48e801bb1321e0fa49e4d575d7f0203010001300d06092a864886f70d0101050500038181002b6d4b65bcfa6ec7bac97ae6d878064d47b3f9f8da654995b8ef4c385bc4fbfbb7a987f60783ef0348760c0708acd4b7e63f0235c35a4fbcd5ec41b3b4cb295feaa7d5c27fa562a02562b7e1f4776b85147be3e295714986c4a9a07183f48ea09ae4d3ea31b88d0016c65b93526b9c45f2967c3d28dee1aff5a5b29b9c2c8639"};
    }

    public AuthActivity() {
        this.J8 = null;
    }

    private java.lang.String DW() {
        if (this.EQ != null) goto L12;
        return "";
    L12:
        java.security.MessageDigest r0 = java.security.MessageDigest.getInstance("SHA-1");     // Catch: java.security.NoSuchAlgorithmException -> L9
        r0.update(this.EQ.getBytes(), 0, this.EQ.length());
        return java.lang.String.format("%1$040X", new java.lang.Object[]{new java.math.BigInteger(1, r0.digest())}).substring(32);
    L9:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    }

    private boolean DW(android.content.Intent r11) {
        android.content.pm.PackageManager r0 = getPackageManager();
        java.util.List<android.content.pm.ResolveInfo> r2 = r0.queryIntentActivities(r11, 0);
        if (r2 != null) goto L5;
    L20:
        return false;
    L5:
        if (1 != r2.size()) goto L20;
        android.content.pm.ResolveInfo r12 = r0.resolveActivity(r11, 0);
        if (r12 != null) goto L22;
        return false;
    L22:
        android.content.pm.Signature[] r13 = r0.getPackageInfo(r12.activityInfo.packageName, 64).signatures;
        int r1 = r13.length;
        int r3 = 0;
    L12:
        if (r3 >= r1) goto L20;
        android.content.pm.Signature r4 = r13[r3];
        java.lang.String[] r5 = u7;
        int r6 = r5.length;
        int r7 = 0;
    L14:
        if (r7 >= r6) goto L19;
        if (r5[r7].equals(r4.toCharsString()) == true) goto L17;
        r7 = r7 + 1;
        goto L14
    L17:
        return true;
    L19:
        r3 = r3 + 1;
        goto L12
    }

    private static java.security.SecureRandom FH() {
        com.dropbox.client2.android.AuthActivity.a r0 = Hw();
        if (r0 == null) goto L7;
        return r0.j6();
    L7:
        return new java.security.SecureRandom();
    }

    private static com.dropbox.client2.android.AuthActivity.a Hw() {
        java.lang.Object r0 = FH;
        monitor-enter(r0);
        com.dropbox.client2.android.AuthActivity.a r1 = DW;     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    private java.lang.String j6() {
        byte[] r1 = new byte[16];
        FH().nextBytes(r1);
        java.lang.StringBuilder r2 = new java.lang.StringBuilder();
        if (this.EQ != null) goto L5;
        r2.append("oauth2:");
    L5:
        int r4 = 0;
    L6:
        if (r4 >= 16) goto L9;
        r2.append(java.lang.String.format("%02x", new java.lang.Object[]{java.lang.Integer.valueOf(r1[r4] & 255)}));
        r4 = r4 + 1;
        goto L6
    L9:
        return r2.toString();
    }

    private void j6(android.content.Intent r1) {
        Hw = r1;
        this.J8 = null;
        finish();
    }

    private void j6(java.lang.String r5) {
        java.util.Locale r0 = java.util.Locale.getDefault();
        startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(abcd.Gw.j6(this.we, 1, "/connect", new java.lang.String[]{"locale", r0.getLanguage() + "_" + r0.getCountry(), "k", this.tp, "s", DW(), "api", this.J0, "state", r5}))));
    }

    static void j6(java.lang.String r1, java.lang.String r2) {
        j6(r1, r2, null, null);
    }

    static void j6(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
        v5 = r0;
        Zo = r1;
        if (r2 != null) goto L6;
        r2 = "www.dropbox.com";
    L6:
        VH = r2;
        gn = r3;
    }

    public static boolean j6(android.content.Context r4, java.lang.String r5, boolean r6) {
        android.content.Intent r0 = new android.content.Intent("android.intent.action.VIEW");
        java.lang.String r7 = "db-" + r5;
        r0.setData(android.net.Uri.parse(r7 + "://1/connect"));
        java.util.List<android.content.pm.ResolveInfo> r1 = r4.getPackageManager().queryIntentActivities(r0, 0);
        if (r1 == null) goto L22;
        if (r1.size() == 0) goto L22;
        if (r1.size() <= 1) goto L12;
        if (r6 == false) goto L10;
        android.app.AlertDialog.Builder r8 = new android.app.AlertDialog.Builder(r4);
        r8.setTitle("Security alert");
        r8.setMessage("Another app on your phone may be trying to pose as the app you are currently using. The malicious app can't access your account, but linking to Dropbox has been disabled as a precaution. Please contact support@dropbox.com.");
        r8.setPositiveButton("OK", new com.dropbox.client2.android.c());
        r8.show();
    L11:
        return false;
    L10:
        android.util.Log.w(j6, "There are multiple apps registered for the AuthActivity URI scheme (" + r7 + ").  Another app may be trying to  impersonate this app, so authentication will be disabled.");
        goto L11
    L12:
        android.content.pm.ResolveInfo r9 = r1.get(0);
        if (r9 == null) goto L20;
        if (r9.activityInfo == null) goto L20;
        if (r4.getPackageName().equals(r9.activityInfo.packageName) == false) goto L20;
        return true;
    L20:
        throw new java.lang.IllegalStateException("There must be a " + com.dropbox.client2.android.AuthActivity.class.getName() + " within your app's package registered for your URI scheme (" + r7 + "). However, it appears that an activity in a different package is registered for that scheme instead. If you have multiple apps that all want to use the same accesstoken pair, designate one of them to do authentication and have the other apps launch it and then retrieve the token pair from it.");
    L22:
        throw new java.lang.IllegalStateException("URI scheme in your app's manifest is not set up correctly. You should have a " + com.dropbox.client2.android.AuthActivity.class.getName() + " with the scheme: " + r7);
    }

    @Override
    protected void onCreate(android.os.Bundle r3) {
        if (r3 != null) goto L5;
        Hw = null;
        this.J8 = null;
        this.tp = v5;
        this.EQ = Zo;
        this.we = VH;
        this.J0 = gn;
    L6:
        j6(null, null);
        setTheme(16973840);
        super.onCreate(r3);
        return;
    L5:
        this.J8 = r3.getString("SIS_KEY_AUTH_STATE_NONCE");
        goto L6
    }

    @Override
    protected void onNewIntent(android.content.Intent r10) {
        abcd.wu.j6(this, r10);
        android.content.Intent r1 = null;
        if (this.J8 != null) goto L7;
        j6(null);
        return;
    L7:
        if (r10.hasExtra("ACCESS_TOKEN") == false) goto L9;
        java.lang.String r2 = r10.getStringExtra("ACCESS_TOKEN");
        java.lang.String r5 = r10.getStringExtra("ACCESS_SECRET");
        java.lang.String r6 = r10.getStringExtra("UID");
        java.lang.String r11 = r10.getStringExtra("AUTH_STATE");
    L24:
        if (r2 != null) goto L26;
    L41:
        j6(r1);
        return;
    L26:
        if (r2.equals("") == true) goto L41;
        if (r5 != null) goto L29;
    L30:
        if (r6 == null) goto L41;
        if (r6.equals("") == true) goto L41;
        if (r11 == null) goto L41;
        if (r11.equals("") == true) goto L41;
        if (this.J8.equals(r11) == true) goto L40;
        j6(null);
        return;
    L40:
        r1 = new android.content.Intent();
        r1.putExtra("ACCESS_TOKEN", r2);
        r1.putExtra("ACCESS_SECRET", r5);
        r1.putExtra("UID", r6);
        goto L41
    L29:
        if (r5.equals("") == true) goto L41;
    L9:
        android.net.Uri r12 = r10.getData();
        if (r12 != null) goto L12;
    L23:
        r11 = null;
        r2 = null;
        r5 = null;
        r6 = null;
        goto L24
    L12:
        if ("/connect".equals(r12.getPath()) == false) goto L23;
        r2 = r12.getQueryParameter("oauth_token");     // Catch: java.lang.UnsupportedOperationException -> L20
        r5 = r12.getQueryParameter("oauth_token_secret");     // Catch: java.lang.UnsupportedOperationException -> L19
        r6 = r12.getQueryParameter("uid");     // Catch: java.lang.UnsupportedOperationException -> L18
        r11 = r12.getQueryParameter("state");     // Catch: java.lang.UnsupportedOperationException -> L43
    L22:
        r11 = null;
    L18:
        r6 = null;
    L19:
        r5 = null;
    L21:
        r6 = r5;
    L20:
        r2 = null;
        r5 = null;
        goto L21
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (isFinishing() == false) goto L6;
        return;
    L6:
        if (this.J8 == null) goto L8;
    L16:
        j6(null);
        return;
    L8:
        if (this.tp == null) goto L16;
        Hw = null;
        java.lang.String r0 = j6();
        android.content.Intent r1 = new android.content.Intent();
        r1.setPackage("com.dropbox.android");
        r1.setAction("com.dropbox.android.AUTHENTICATE_V2");
        r1.putExtra("CONSUMER_KEY", this.tp);
        r1.putExtra("CONSUMER_SIG", DW());
        r1.putExtra("CALLING_PACKAGE", getPackageName());
        r1.putExtra("CALLING_CLASS", com.dropbox.client2.android.AuthActivity.class.getName());
        r1.putExtra("AUTH_STATE", r0);
        if (DW(r1) == false) goto L13;
        startActivity(r1);
    L14:
        this.J8 = r0;
        return;
    L13:
        j6(r0);
        goto L14
    }

    @Override
    protected void onSaveInstanceState(android.os.Bundle r3) {
        super.onSaveInstanceState(r3);
        r3.putString("SIS_KEY_AUTH_STATE_NONCE", this.J8);
    }
}
