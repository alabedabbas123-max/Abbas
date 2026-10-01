package com.aide.common;

@abcd.Interfacexu
public class Ha {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common.Ha.class, 2278315543554812120L, 2278315543554812120L);
    }

    public Ha() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -1657984845315659039L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1657984845315659039L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(android.content.Context r7, java.lang.String r8) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 3888963232645036665L, null, r7, r8);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(3888963232645036665L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent("android.intent.action.VIEW");
                        r0.setData(android.net.Uri.parse("https://groups.google.com/group/" + r8));
                        r0.setFlags(1074266112);
                        j6(r7, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 11: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 15; continue $sw2; }
                    abcd.wu.j6(th, -4609465207998660384L, null, r8, r9, r10);
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-4609465207998660384L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        abcd.F.j6("Shared via facebook");
                        r0 = new android.content.Intent("android.intent.action.SEND");
                        r0.setType("text/plain");
                        r0.putExtra("android.intent.extra.SUBJECT", r9);
                        r0.putExtra("android.intent.extra.TEXT", r10);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    if (j6(r8, "com.facebook.katana", r0) == true) { $pc2 = 8; continue $sw2; }
                    try {
                        r0 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.facebook.com/sharer/sharer.php?u=" + r10));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    try {
                        j6(r8, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    return;
                }
                case 8: {
                    try {
                        ((android.text.ClipboardManager) r8.getSystemService("clipboard")).setText(r9);
                        new android.os.Handler().postDelayed(new com.aide.common.Ga(r8, r9), 1000);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    { $pc2 = 9; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void FH(android.content.Context r7, java.lang.String r8) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 7: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 11; continue $sw3; }
                    abcd.wu.j6(th, 294122341125300493L, null, r7, r8);
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(294122341125300493L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 7; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent("android.intent.action.VIEW");
                        r0.setData(android.net.Uri.parse("https://plus.google.com/communities/" + r8));
                        r0.setFlags(1074266112);
                        j6(r7, "com.google.android.apps.plus", r0);
                        j6(r7, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 7; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void FH(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 10: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 14; continue $sw4; }
                    abcd.wu.j6(th, -2462733058118031657L, null, r8, r9, r10);
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(-2462733058118031657L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 10; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    try {
                        abcd.F.j6("Shared via gplus");
                        r0 = new android.content.Intent("android.intent.action.SEND");
                        r0.setType("text/plain");
                        r0.putExtra("android.intent.extra.TEXT", r9 + "\n\n" + r10);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 10; continue $sw4;
                    }
                    if (j6(r8, "com.google.android.apps.plus", r0) == true) { $pc4 = 8; continue $sw4; }
                    try {
                        r0 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://plus.google.com/share?url=" + r10 + "&text=" + r9));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 10; continue $sw4;
                    }
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    try {
                        j6(r8, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 10; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void Hw(android.content.Context r7, java.lang.String r8) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 7: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 11; continue $sw5; }
                    abcd.wu.j6(th, 783492425720636463L, null, r7, r8);
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(783492425720636463L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 7; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent("android.intent.action.VIEW");
                        r0.setData(android.net.Uri.parse("https://plus.google.com/" + r8 + "/posts"));
                        r0.setFlags(1074266112);
                        j6(r7, "com.google.android.apps.plus", r0);
                        j6(r7, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 7; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void Hw(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 7: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 11; continue $sw6; }
                    abcd.wu.j6(th, -4181107681177613451L, null, r8, r9, r10);
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc6 = 5; continue $sw6; }
                    try {
                        abcd.wu.j6(-4181107681177613451L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 7; continue $sw6;
                    }
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    try {
                        abcd.F.j6("Shared via twitter");
                        r0 = new android.content.Intent("android.intent.action.VIEW");
                        r0.setData(android.net.Uri.parse("http://www.twitter.com/intent/tweet?url=" + r10 + "&text=" + r9));
                        j6(r8, "com.twitter.android", r0);
                        j6(r8, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 7; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -4689788718082417315L)
    private static void j6(android.content.Context r7, android.content.Intent r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 7: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 11; continue $sw7; }
                    abcd.wu.j6(th, -4100065459496554356L, null, r7, r8);
                    $pc7 = 11; continue $sw7;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 15; continue $sw7; }
                    try {
                        abcd.wu.j6(-4100065459496554356L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 7; continue $sw7;
                    }
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    try {
                        r7.startActivity(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 12; continue $sw7;
                    }
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r7, java.lang.String r8) {
        android.content.Intent r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 11: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 15; continue $sw8; }
                    abcd.wu.j6(th, -5737581203096132064L, null, r7, r8);
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-5737581203096132064L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 11; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        r1 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("fb://profile/" + r8));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 11; continue $sw8;
                    }
                    if (j6(r7, "com.facebook.katana", r1) == true) { $pc8 = 9; continue $sw8; }
                    try {
                        r1 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.facebook.com/" + r8));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 11; continue $sw8;
                    }
                    $pc8 = 9; continue $sw8;
                }
                case 9: {
                    try {
                        r1.setFlags(1074266112);
                        j6(r7, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 11; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 7: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 11; continue $sw9; }
                    abcd.wu.j6(th, -8197465575402489600L, null, r8, r9, r10);
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc9 = 5; continue $sw9; }
                    try {
                        abcd.wu.j6(-8197465575402489600L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 7; continue $sw9;
                    }
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent("android.intent.action.VIEW");
                        r0.setData(android.net.Uri.parse(abcd.F.j6(r9, r9, r10)));
                        r0.setFlags(1074266112);
                        j6(r8, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 7; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 7: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 11; continue $sw10; }
                    abcd.wu.j6(th, 1248134482885076335L, null, r9, r10, r11, r12);
                    $pc10 = 11; continue $sw10;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc10 = 5; continue $sw10; }
                    try {
                        abcd.wu.j6(1248134482885076335L, null, r9, r10, r11, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 7; continue $sw10;
                    }
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent("android.intent.action.SEND");
                        r0.setType("message/rfc822");
                        r0.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{r10});
                        r0.putExtra("android.intent.extra.SUBJECT", "AIDE Feedback");
                        r0.putExtra("android.intent.extra.TEXT", r12);
                        j6(r9, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 7; continue $sw10;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1100004955179470971L)
    private static boolean j6(android.content.Context r8, java.lang.String r9, android.content.Intent r10) {
        java.util.List<android.content.pm.ResolveInfo> r11 = null;
        java.util.Iterator<android.content.pm.ResolveInfo> r12 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 18: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 23; continue $sw11; }
                    abcd.wu.j6(th, 1665769314048397688L, null, r8, r9, r10);
                    $pc11 = 23; continue $sw11;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc11 = 28; continue $sw11; }
                    try {
                        abcd.wu.j6(1665769314048397688L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 18; continue $sw11;
                    }
                    $pc11 = 28; continue $sw11;
                }
                case 28: {
                    try {
                        r11 = r8.getPackageManager().queryIntentActivities(r10, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 25; continue $sw11;
                    }
                    if (r11 == null) { $pc11 = 17; continue $sw11; }
                    if (r11.size() <= 1) { $pc11 = 17; continue $sw11; }
                    try {
                        r12 = r11.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 25; continue $sw11;
                    }
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    if (r12.hasNext() == false) { $pc11 = 17; continue $sw11; }
                    if (r9.equals(r12.next().activityInfo.applicationInfo.packageName) == false) { $pc11 = 12; continue $sw11; }
                    try {
                        r10.setPackage(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 25; continue $sw11;
                    }
                    return true;
                }
                case 17: {
                    return false;
                }
                case 25: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void v5(android.content.Context r7, java.lang.String r8) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 3;
        $sw12: while (true) {
            switch ($pc12) {
                case 7: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 11; continue $sw12; }
                    abcd.wu.j6(th, -631223495692537329L, null, r7, r8);
                    $pc12 = 11; continue $sw12;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc12 = 5; continue $sw12; }
                    try {
                        abcd.wu.j6(-631223495692537329L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 7; continue $sw12;
                    }
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent("android.intent.action.VIEW");
                        r0.setData(android.net.Uri.parse("https://twitter.com/#!/" + r8));
                        r0.setFlags(1074266112);
                        j6(r7, "com.twitter.android", r0);
                        j6(r7, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 7; continue $sw12;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
