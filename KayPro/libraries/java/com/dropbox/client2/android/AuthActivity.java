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
        java.security.MessageDigest r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.EQ != null) { $pc0 = 12; continue $sw0; }
                    return "";
                }
                case 12: {
                    try {
                        r0 = java.security.MessageDigest.getInstance("SHA-1");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r0.update(this.EQ.getBytes(), 0, this.EQ.length());
                    return java.lang.String.format("%1$040X", new java.lang.Object[]{new java.math.BigInteger(1, r0.digest())}).substring(32);
                }
                case 9: {
                    e = $ex0;
                    throw new java.lang.RuntimeException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean DW(android.content.Intent r11) {
        android.content.pm.PackageManager r0 = null;
        java.util.List<android.content.pm.ResolveInfo> r2 = null;
        android.content.pm.ResolveInfo r12 = null;
        android.content.pm.Signature[] r13 = null;
        int r1 = 0;
        int r3 = 0;
        android.content.pm.Signature r4 = null;
        java.lang.String[] r5 = null;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = getPackageManager();
                    r2 = r0.queryIntentActivities(r11, 0);
                    if (r2 != null) { $pc1 = 5; continue $sw1; }
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    return false;
                }
                case 5: {
                    if (1 != r2.size()) { $pc1 = 20; continue $sw1; }
                    r12 = r0.resolveActivity(r11, 0);
                    if (r12 != null) { $pc1 = 22; continue $sw1; }
                    return false;
                }
                case 22: {
                    r13 = r0.getPackageInfo(r12.activityInfo.packageName, 64).signatures;
                    r1 = r13.length;
                    r3 = 0;
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    if (r3 >= r1) { $pc1 = 20; continue $sw1; }
                    r4 = r13[r3];
                    r5 = u7;
                    r6 = r5.length;
                    r7 = 0;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    if (r7 >= r6) { $pc1 = 19; continue $sw1; }
                    if (r5[r7].equals(r4.toCharsString()) == true) { $pc1 = 17; continue $sw1; }
                    r7 = r7 + 1;
                    { $pc1 = 14; continue $sw1; }
                }
                case 17: {
                    return true;
                }
                case 19: {
                    r3 = r3 + 1;
                    { $pc1 = 12; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.security.SecureRandom FH() {
        com.dropbox.client2.android.AuthActivity.a r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = Hw();
                    if (r0 == null) { $pc2 = 7; continue $sw2; }
                    return r0.j6();
                }
                case 7: {
                    return new java.security.SecureRandom();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static com.dropbox.client2.android.AuthActivity.a Hw() {
        java.lang.Object r0 = null;
        com.dropbox.client2.android.AuthActivity.a r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = FH;
                    monitor-enter(r0);
                    try {
                        r1 = DW;
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 7; continue $sw3;
                    }
                    return r1;
                }
                case 7: {
                    th = $ex3;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String j6() {
        byte[] r1 = null;
        java.lang.StringBuilder r2 = null;
        int r4 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r1 = new byte[16];
                    FH().nextBytes(r1);
                    r2 = new java.lang.StringBuilder();
                    if (this.EQ != null) { $pc4 = 5; continue $sw4; }
                    r2.append("oauth2:");
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    r4 = 0;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r4 >= 16) { $pc4 = 9; continue $sw4; }
                    r2.append(java.lang.String.format("%02x", new java.lang.Object[]{java.lang.Integer.valueOf(r1[r4] & 255)}));
                    r4 = r4 + 1;
                    { $pc4 = 6; continue $sw4; }
                }
                case 9: {
                    return r2.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    v5 = r0;
                    Zo = r1;
                    if (r2 != null) { $pc5 = 6; continue $sw5; }
                    r2 = "www.dropbox.com";
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    VH = r2;
                    gn = r3;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(android.content.Context r4, java.lang.String r5, boolean r6) {
        android.content.Intent r0 = null;
        java.lang.String r7 = null;
        java.util.List<android.content.pm.ResolveInfo> r1 = null;
        android.app.AlertDialog.Builder r8 = null;
        android.content.pm.ResolveInfo r9 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new android.content.Intent("android.intent.action.VIEW");
                    r7 = "db-" + r5;
                    r0.setData(android.net.Uri.parse(r7 + "://1/connect"));
                    r1 = r4.getPackageManager().queryIntentActivities(r0, 0);
                    if (r1 == null) { $pc6 = 22; continue $sw6; }
                    if (r1.size() == 0) { $pc6 = 22; continue $sw6; }
                    if (r1.size() <= 1) { $pc6 = 12; continue $sw6; }
                    if (r6 == false) { $pc6 = 10; continue $sw6; }
                    r8 = new android.app.AlertDialog.Builder(r4);
                    r8.setTitle("Security alert");
                    r8.setMessage("Another app on your phone may be trying to pose as the app you are currently using. The malicious app can't access your account, but linking to Dropbox has been disabled as a precaution. Please contact support@dropbox.com.");
                    r8.setPositiveButton("OK", new com.dropbox.client2.android.c());
                    r8.show();
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    return false;
                }
                case 10: {
                    android.util.Log.w(j6, "There are multiple apps registered for the AuthActivity URI scheme (" + r7 + ").  Another app may be trying to  impersonate this app, so authentication will be disabled.");
                    { $pc6 = 11; continue $sw6; }
                }
                case 12: {
                    r9 = r1.get(0);
                    if (r9 == null) { $pc6 = 20; continue $sw6; }
                    if (r9.activityInfo == null) { $pc6 = 20; continue $sw6; }
                    if (r4.getPackageName().equals(r9.activityInfo.packageName) == false) { $pc6 = 20; continue $sw6; }
                    return true;
                }
                case 20: {
                    throw new java.lang.IllegalStateException("There must be a " + com.dropbox.client2.android.AuthActivity.class.getName() + " within your app's package registered for your URI scheme (" + r7 + "). However, it appears that an activity in a different package is registered for that scheme instead. If you have multiple apps that all want to use the same accesstoken pair, designate one of them to do authentication and have the other apps launch it and then retrieve the token pair from it.");
                }
                case 22: {
                    throw new java.lang.IllegalStateException("URI scheme in your app's manifest is not set up correctly. You should have a " + com.dropbox.client2.android.AuthActivity.class.getName() + " with the scheme: " + r7);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void onCreate(android.os.Bundle r3) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r3 != null) { $pc7 = 5; continue $sw7; }
                    Hw = null;
                    this.J8 = null;
                    this.tp = v5;
                    this.EQ = Zo;
                    this.we = VH;
                    this.J0 = gn;
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    j6(null, null);
                    setTheme(16973840);
                    super.onCreate(r3);
                    return;
                }
                case 5: {
                    this.J8 = r3.getString("SIS_KEY_AUTH_STATE_NONCE");
                    { $pc7 = 6; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void onNewIntent(android.content.Intent r10) {
        android.content.Intent r1 = null;
        java.lang.String r2 = null;
        java.lang.String r5 = null;
        java.lang.String r6 = null;
        java.lang.String r11 = null;
        android.net.Uri r12 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    abcd.wu.j6(this, r10);
                    r1 = null;
                    if (this.J8 != null) { $pc8 = 7; continue $sw8; }
                    j6(null);
                    return;
                }
                case 7: {
                    if (r10.hasExtra("ACCESS_TOKEN") == false) { $pc8 = 9; continue $sw8; }
                    r2 = r10.getStringExtra("ACCESS_TOKEN");
                    r5 = r10.getStringExtra("ACCESS_SECRET");
                    r6 = r10.getStringExtra("UID");
                    r11 = r10.getStringExtra("AUTH_STATE");
                    $pc8 = 24; continue $sw8;
                }
                case 24: {
                    if (r2 != null) { $pc8 = 26; continue $sw8; }
                    $pc8 = 41; continue $sw8;
                }
                case 41: {
                    j6(r1);
                    return;
                }
                case 26: {
                    if (r2.equals("") == true) { $pc8 = 41; continue $sw8; }
                    if (r5 != null) { $pc8 = 29; continue $sw8; }
                    $pc8 = 30; continue $sw8;
                }
                case 30: {
                    if (r6 == null) { $pc8 = 41; continue $sw8; }
                    if (r6.equals("") == true) { $pc8 = 41; continue $sw8; }
                    if (r11 == null) { $pc8 = 41; continue $sw8; }
                    if (r11.equals("") == true) { $pc8 = 41; continue $sw8; }
                    if (this.J8.equals(r11) == true) { $pc8 = 40; continue $sw8; }
                    j6(null);
                    return;
                }
                case 40: {
                    r1 = new android.content.Intent();
                    r1.putExtra("ACCESS_TOKEN", r2);
                    r1.putExtra("ACCESS_SECRET", r5);
                    r1.putExtra("UID", r6);
                    { $pc8 = 41; continue $sw8; }
                }
                case 29: {
                    if (r5.equals("") == true) { $pc8 = 41; continue $sw8; }
                    $pc8 = 9; continue $sw8;
                }
                case 9: {
                    r12 = r10.getData();
                    if (r12 != null) { $pc8 = 12; continue $sw8; }
                    $pc8 = 23; continue $sw8;
                }
                case 23: {
                    r11 = null;
                    r2 = null;
                    r5 = null;
                    r6 = null;
                    { $pc8 = 24; continue $sw8; }
                }
                case 12: {
                    if ("/connect".equals(r12.getPath()) == false) { $pc8 = 23; continue $sw8; }
                    try {
                        r2 = r12.getQueryParameter("oauth_token");
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.UnsupportedOperationException) { $pc8 = 20; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r5 = r12.getQueryParameter("oauth_token_secret");
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.UnsupportedOperationException) { $pc8 = 19; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r6 = r12.getQueryParameter("uid");
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.UnsupportedOperationException) { $pc8 = 18; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r11 = r12.getQueryParameter("state");
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.UnsupportedOperationException) { $pc8 = 43; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 22; continue $sw8;
                }
                case 22: {
                    r11 = null;
                    $pc8 = 18; continue $sw8;
                }
                case 18: {
                    r6 = null;
                    $pc8 = 19; continue $sw8;
                }
                case 19: {
                    r5 = null;
                    $pc8 = 21; continue $sw8;
                }
                case 21: {
                    r6 = r5;
                    $pc8 = 20; continue $sw8;
                }
                case 20: {
                    r2 = null;
                    r5 = null;
                    { $pc8 = 21; continue $sw8; }
                }
                case 43: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void onResume() {
        java.lang.String r0 = null;
        android.content.Intent r1 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    super.onResume();
                    if (isFinishing() == false) { $pc9 = 6; continue $sw9; }
                    return;
                }
                case 6: {
                    if (this.J8 == null) { $pc9 = 8; continue $sw9; }
                    $pc9 = 16; continue $sw9;
                }
                case 16: {
                    j6(null);
                    return;
                }
                case 8: {
                    if (this.tp == null) { $pc9 = 16; continue $sw9; }
                    Hw = null;
                    r0 = j6();
                    r1 = new android.content.Intent();
                    r1.setPackage("com.dropbox.android");
                    r1.setAction("com.dropbox.android.AUTHENTICATE_V2");
                    r1.putExtra("CONSUMER_KEY", this.tp);
                    r1.putExtra("CONSUMER_SIG", DW());
                    r1.putExtra("CALLING_PACKAGE", getPackageName());
                    r1.putExtra("CALLING_CLASS", com.dropbox.client2.android.AuthActivity.class.getName());
                    r1.putExtra("AUTH_STATE", r0);
                    if (DW(r1) == false) { $pc9 = 13; continue $sw9; }
                    startActivity(r1);
                    $pc9 = 14; continue $sw9;
                }
                case 14: {
                    this.J8 = r0;
                    return;
                }
                case 13: {
                    j6(r0);
                    { $pc9 = 14; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void onSaveInstanceState(android.os.Bundle r3) {
        super.onSaveInstanceState(r3);
        r3.putString("SIS_KEY_AUTH_STATE_NONCE", this.J8);
    }
}
