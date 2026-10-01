package com.aide.uidesigner;

@abcd.Interfacexu
public class la {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 71648584948631592L)
    private java.io.File FH;

    @abcd.Interfaceru(field = -2313419217899783721L)
    private android.content.Context Hw;

    @abcd.Interfaceru(field = -1662954438517709584L)
    private java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.lang.String>> VH;

    @abcd.Interfaceru(field = -3889294460707513160L)
    private java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.lang.String>> Zo;

    @abcd.Interfaceru(field = 272427746456845840L)
    private java.util.Map<java.lang.Integer, java.util.SortedMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.la.class, -2341159662179110476L, -2341159662179110476L);
    }

    public la(android.content.Context r8, java.lang.String r9) {
        java.io.File r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = null;
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(4773085457347827576L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.Hw = r8;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    if (r9 == null) { $pc0 = 9; continue $sw0; }
                    try {
                        r1 = new java.io.File(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    try {
                        this.FH = r1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    return;
                }
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, 4773085457347827576L, null, r8, r9);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4886328763528574124L)
    private android.graphics.drawable.Drawable DW(java.io.File r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 14: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 18; continue $sw1; }
                    abcd.wu.j6(th, 2147445038147466575L, this, r5);
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(2147445038147466575L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 14; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r5 != null) { $pc1 = 20; continue $sw1; }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    return null;
                }
                case 20: {
                    if (r5.isFile() == false) { $pc1 = 13; continue $sw1; }
                    return android.graphics.drawable.NinePatchDrawable.createFromStream(new java.io.FileInputStream(r5), null);
                    { $pc1 = 13; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1231753995400535600L)
    private java.lang.String Hw(java.lang.String r8) {
        java.lang.String r2 = null;
        int r3 = 0;
        java.util.Iterator<java.util.Map<java.lang.String, java.lang.String>> r4 = null;
        java.util.Map<java.lang.String, java.lang.String> r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 27: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 32; continue $sw2; }
                    abcd.wu.j6(th, -980958430477487L, this, r8);
                    $pc2 = 32; continue $sw2;
                }
                case 32: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-980958430477487L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r2 = null;
                    if (r8 != null) { $pc2 = 9; continue $sw2; }
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    if (r8 != null) { $pc2 = 13; continue $sw2; }
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    if (r2 == null) { $pc2 = 26; continue $sw2; }
                    try {
                        r3 = android.os.Build.VERSION.SDK_INT;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    if (r3 < 0) { $pc2 = 26; continue $sw2; }
                    try {
                        r4 = this.v5.get(java.lang.Integer.valueOf(r3)).values().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    if (r4.hasNext() == false) { $pc2 = 25; continue $sw2; }
                    try {
                        r5 = r4.next();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    if (r5.containsKey(r2) == false) { $pc2 = 20; continue $sw2; }
                    return r5.get(r2);
                }
                case 25: {
                    r3 = r3 - 1;
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    return r8;
                }
                case 13: {
                    if (r8.startsWith("?") == false) { $pc2 = 15; continue $sw2; }
                    try {
                        r2 = r8.substring(1);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    { $pc2 = 15; continue $sw2; }
                }
                case 9: {
                    if (r8.startsWith("?attr/") == false) { $pc2 = 11; continue $sw2; }
                    try {
                        r2 = r8.substring(6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    { $pc2 = 15; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1502715607947303653L)
    private android.graphics.drawable.Drawable j6(java.io.File r10) {
        android.graphics.BitmapFactory.Options r3 = null;
        int r4 = 0;
        java.io.FileInputStream r5 = null;
        int r6 = 0;
        int r7 = 0;
        float r8 = 0.0f;
        int r9 = 0;
        android.graphics.BitmapFactory.Options r11 = null;
        java.io.FileInputStream r12 = null;
        android.graphics.Bitmap r13 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 26: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 31; continue $sw3; }
                    abcd.wu.j6(th, 2415039162400772100L, this, r10);
                    $pc3 = 31; continue $sw3;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 7; continue $sw3; }
                    try {
                        abcd.wu.j6(2415039162400772100L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 26; continue $sw3;
                    }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r10 != null) { $pc3 = 36; continue $sw3; }
                    $pc3 = 25; continue $sw3;
                }
                case 25: {
                    return null;
                }
                case 36: {
                    if (r10.isFile() == false) { $pc3 = 25; continue $sw3; }
                    try {
                        r3 = new android.graphics.BitmapFactory.Options();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 33; continue $sw3; }
                        $pc3 = 26; continue $sw3;
                    }
                    r4 = 1;
                    try {
                        r3.inJustDecodeBounds = true;
                        r5 = new java.io.FileInputStream(r10);
                        android.graphics.BitmapFactory.decodeStream(r5, null, r3);
                        r5.close();
                        r6 = r3.outWidth;
                        r7 = r3.outHeight;
                        r8 = r6 / r7;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 33; continue $sw3; }
                        $pc3 = 26; continue $sw3;
                    }
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    if ((r6 / 2) < 500) { $pc3 = 15; continue $sw3; }
                    $pc3 = 23; continue $sw3;
                }
                case 23: {
                    try {
                        r6 = r6 / 2;
                        r7 = r7 / 2;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 33; continue $sw3; }
                        $pc3 = 26; continue $sw3;
                    }
                    r4 = r4 * 2;
                    { $pc3 = 13; continue $sw3; }
                }
                case 15: {
                    if ((r7 / 2) >= 500) { $pc3 = 23; continue $sw3; }
                    if (r7 <= 500) { $pc3 = 18; continue $sw3; }
                    try {
                        r9 = (int) (500 * r8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 33; continue $sw3; }
                        $pc3 = 26; continue $sw3;
                    }
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    try {
                        r11 = new android.graphics.BitmapFactory.Options();
                        r11.inSampleSize = r4;
                        r12 = new java.io.FileInputStream(r10);
                        r13 = android.graphics.BitmapFactory.decodeStream(r12, null, r11);
                        r12.close();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 33; continue $sw3; }
                        $pc3 = 26; continue $sw3;
                    }
                    if (r13 != null) { $pc3 = 21; continue $sw3; }
                    return null;
                }
                case 21: {
                    return new android.graphics.drawable.BitmapDrawable(this.Hw.getResources(), r13);
                    { $pc3 = 25; continue $sw3; }
                }
                case 33: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2940030531097341120L)
    private java.lang.String j6(java.lang.String r9, com.aide.uidesigner.N.a r10, java.util.Set<java.lang.String> r11) {
        int r0 = 0;
        java.util.Map<java.lang.String, java.lang.String> r2 = null;
        java.lang.String r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 19: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 24; continue $sw4; }
                    abcd.wu.j6(th, 288562152658887735L, this, r9, r10, r11);
                    $pc4 = 24; continue $sw4;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(288562152658887735L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 19; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r11.contains(r9) == false) { $pc4 = 8; continue $sw4; }
                    return null;
                }
                case 8: {
                    try {
                        r11.add(r9);
                        r0 = android.os.Build.VERSION.SDK_INT;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 19; continue $sw4;
                    }
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    if (r0 < 0) { $pc4 = 18; continue $sw4; }
                    try {
                        r2 = this.v5.get(java.lang.Integer.valueOf(r0)).get(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 19; continue $sw4;
                    }
                    if (r2 != null) { $pc4 = 12; continue $sw4; }
                    r0 = r0 - 1;
                    { $pc4 = 9; continue $sw4; }
                }
                case 12: {
                    try {
                        r1 = r2.get(r10.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 19; continue $sw4;
                    }
                    if (r1 == null) { $pc4 = 15; continue $sw4; }
                    return r1;
                }
                case 15: {
                    return j6(this.Zo.get(java.lang.Integer.valueOf(r0)).get(r9), r10, r11);
                }
                case 18: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -3417635586407792211L)
    private java.lang.String j6(java.lang.String r8, java.util.Set<java.lang.String> r9) {
        int r0 = 0;
        java.lang.String r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 24: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 29; continue $sw5; }
                    abcd.wu.j6(th, 3377306536535367352L, this, r8, r9);
                    $pc5 = 29; continue $sw5;
                }
                case 29: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(3377306536535367352L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 24; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    if (r9.contains(r8) == false) { $pc5 = 9; continue $sw5; }
                    return null;
                }
                case 9: {
                    try {
                        r9.add(r8);
                        r0 = android.os.Build.VERSION.SDK_INT;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 24; continue $sw5;
                    }
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    if (r0 < 0) { $pc5 = 19; continue $sw5; }
                    try {
                        r1 = this.Zo.get(java.lang.Integer.valueOf(r0)).get(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 24; continue $sw5;
                    }
                    if (r1 == null) { $pc5 = 17; continue $sw5; }
                    if (r1.length() <= 0) { $pc5 = 17; continue $sw5; }
                    return j6(r1, r9);
                }
                case 17: {
                    try {
                        r0 = r0 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 24; continue $sw5;
                    }
                    { $pc5 = 10; continue $sw5; }
                }
                case 19: {
                    if (r8.startsWith("android:") == false) { $pc5 = 23; continue $sw5; }
                    return "@android:style/" + r8.substring(8);
                }
                case 23: {
                    return "@style/" + r8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1798642545906150400L)
    private void j6(int r8, java.io.File r9) {
        java.io.File[] r10 = null;
        int r0 = 0;
        int r1 = 0;
        java.io.File r2 = null;
        java.io.FileInputStream r3 = null;
        org.w3c.dom.Document r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 12: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 17; continue $sw6; }
                    abcd.wu.j6(th, -5079277408722106139L, this, new java.lang.Integer(r8), r9);
                    $pc6 = 17; continue $sw6;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc6 = 22; continue $sw6; }
                    try {
                        abcd.wu.j6(-5079277408722106139L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 12; continue $sw6;
                    }
                    $pc6 = 22; continue $sw6;
                }
                case 22: {
                    try {
                        r10 = r9.listFiles();
                        r0 = r10.length;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 19; continue $sw6;
                    }
                    r1 = 0;
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (r1 >= r0) { $pc6 = 27; continue $sw6; }
                    try {
                        r2 = r10[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 19; continue $sw6;
                    }
                    if (r2.getName().toLowerCase().endsWith(".xml") == false) { $pc6 = 10; continue $sw6; }
                    try {
                        r3 = new java.io.FileInputStream(r2);
                        r4 = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(r3);
                        r3.close();
                        j6(r4, r8);
                        j6(r4, r8, "string");
                        j6(r4, r8, "color");
                        j6(r4, r8, "dimen");
                        j6(r4, r8, "bool");
                        j6(r4, r8, "integer");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 19; continue $sw6;
                    }
                    $pc6 = 10; continue $sw6;
                }
                case 10: {
                    r1 = r1 + 1;
                    { $pc6 = 6; continue $sw6; }
                }
                case 27: {
                    return;
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1950695247865460151L)
    private void j6(org.w3c.dom.Document r11, int r12) {
        org.w3c.dom.NodeList r1 = null;
        int r3 = 0;
        org.w3c.dom.Node r4 = null;
        org.w3c.dom.Node r5 = null;
        java.lang.String r6 = null;
        java.lang.String r7 = null;
        java.util.HashMap r8 = null;
        org.w3c.dom.NodeList r9 = null;
        int r10 = 0;
        org.w3c.dom.Node r13 = null;
        org.w3c.dom.Node r14 = null;
        org.w3c.dom.Node r15 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 28: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 33; continue $sw7; }
                    abcd.wu.j6(th, -2103476170765493804L, this, r11, new java.lang.Integer(r12));
                    $pc7 = 33; continue $sw7;
                }
                case 33: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-2103476170765493804L, this, r11, new java.lang.Integer(r12));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 28; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        r1 = r11.getElementsByTagName("style");
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 28; continue $sw7;
                    }
                    r3 = 0;
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (r3 >= r1.getLength()) { $pc7 = 27; continue $sw7; }
                    try {
                        r4 = r1.item(r3);
                        r5 = r4.getAttributes().getNamedItem("name");
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 28; continue $sw7;
                    }
                    if ((r5 instanceof org.w3c.dom.Attr) == false) { $pc7 = 26; continue $sw7; }
                    try {
                        r6 = ((org.w3c.dom.Attr) r5).getValue();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 28; continue $sw7;
                    }
                    r7 = "";
                    if (r6.contains(".") == false) { $pc7 = 14; continue $sw7; }
                    try {
                        r7 = r6.substring(0, r6.lastIndexOf(46));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 28; continue $sw7;
                    }
                    $pc7 = 17; continue $sw7;
                }
                case 17: {
                    try {
                        this.Zo.get(java.lang.Integer.valueOf(r12)).put(r6, r7);
                        r8 = new java.util.HashMap();
                        this.v5.get(java.lang.Integer.valueOf(r12)).put(r6, r8);
                        r9 = r4.getChildNodes();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 28; continue $sw7;
                    }
                    r10 = 0;
                    $pc7 = 19; continue $sw7;
                }
                case 19: {
                    if (r10 >= r9.getLength()) { $pc7 = 26; continue $sw7; }
                    try {
                        r13 = r9.item(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 28; continue $sw7;
                    }
                    if (r13.getNodeName().equals("item") == false) { $pc7 = 25; continue $sw7; }
                    try {
                        r14 = r13.getAttributes().getNamedItem("name");
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 28; continue $sw7;
                    }
                    if ((r14 instanceof org.w3c.dom.Attr) == false) { $pc7 = 25; continue $sw7; }
                    try {
                        r8.put(((org.w3c.dom.Attr) r14).getValue(), r13.getTextContent());
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 28; continue $sw7;
                    }
                    $pc7 = 25; continue $sw7;
                }
                case 25: {
                    r10 = r10 + 1;
                    { $pc7 = 19; continue $sw7; }
                }
                case 14: {
                    try {
                        r15 = r4.getAttributes().getNamedItem("parent");
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 28; continue $sw7;
                    }
                    if ((r15 instanceof org.w3c.dom.Attr) == false) { $pc7 = 17; continue $sw7; }
                    try {
                        r7 = ((org.w3c.dom.Attr) r15).getValue();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 28; continue $sw7;
                    }
                    $pc7 = 26; continue $sw7;
                }
                case 26: {
                    r3 = r3 + 1;
                    { $pc7 = 7; continue $sw7; }
                }
                case 27: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1331072957459363333L)
    private void j6(org.w3c.dom.Document r9, int r10, java.lang.String r11) {
        org.w3c.dom.NodeList r0 = null;
        int r1 = 0;
        org.w3c.dom.Node r2 = null;
        org.w3c.dom.Node r3 = null;
        java.lang.String r4 = null;
        java.lang.String r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 13: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 18; continue $sw8; }
                    abcd.wu.j6(th, -2627607510775105464L, this, r9, new java.lang.Integer(r10), r11);
                    $pc8 = 18; continue $sw8;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(-2627607510775105464L, this, r9, new java.lang.Integer(r10), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 13; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    try {
                        r0 = r9.getElementsByTagName(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 13; continue $sw8;
                    }
                    r1 = 0;
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    if (r1 >= r0.getLength()) { $pc8 = 12; continue $sw8; }
                    try {
                        r2 = r0.item(r1);
                        r3 = r2.getAttributes().getNamedItem("name");
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 13; continue $sw8;
                    }
                    if ((r3 instanceof org.w3c.dom.Attr) == false) { $pc8 = 11; continue $sw8; }
                    try {
                        r4 = ((org.w3c.dom.Attr) r3).getValue();
                        r5 = r2.getTextContent();
                        this.VH.get(java.lang.Integer.valueOf(r10)).put("@" + r11 + "/" + r4, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 13; continue $sw8;
                    }
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    r1 = r1 + 1;
                    { $pc8 = 6; continue $sw8; }
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1346814380227330365L)
    private java.lang.String v5() {
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 24: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 28; continue $sw9; }
                    abcd.wu.j6(th, 3531206633130907192L, this);
                    $pc9 = 28; continue $sw9;
                }
                case 28: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(3531206633130907192L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 24; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        r2 = this.Hw.getResources().getDisplayMetrics().densityDpi;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 24; continue $sw9;
                    }
                    if (r2 != 120) { $pc9 = 9; continue $sw9; }
                    return "ldpi";
                }
                case 9: {
                    if (r2 != 160) { $pc9 = 11; continue $sw9; }
                    return "mdpi";
                }
                case 11: {
                    if (r2 != 240) { $pc9 = 13; continue $sw9; }
                    return "hdpi";
                }
                case 13: {
                    if (r2 == 320) { $pc9 = 16; continue $sw9; }
                    return "";
                }
                case 16: {
                    return "xhdpi";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 538982813216511408L)
    private java.lang.String v5(java.lang.String r6) {
        int r2 = 0;
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 16: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 21; continue $sw10; }
                    abcd.wu.j6(th, -331129711600998867L, this, r6);
                    $pc10 = 21; continue $sw10;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-331129711600998867L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 16; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    if (r6 != null) { $pc10 = 8; continue $sw10; }
                    $pc10 = 15; continue $sw10;
                }
                case 15: {
                    return r6;
                }
                case 8: {
                    if (r6.startsWith("@") == false) { $pc10 = 15; continue $sw10; }
                    try {
                        r2 = android.os.Build.VERSION.SDK_INT;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 16; continue $sw10;
                    }
                    $pc10 = 10; continue $sw10;
                }
                case 10: {
                    if (r2 < 0) { $pc10 = 15; continue $sw10; }
                    try {
                        r3 = this.VH.get(java.lang.Integer.valueOf(r2)).get(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 16; continue $sw10;
                    }
                    if (r3 != null) { $pc10 = 13; continue $sw10; }
                    r2 = r2 - 1;
                    { $pc10 = 10; continue $sw10; }
                }
                case 13: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public android.graphics.drawable.Drawable DW(java.lang.String r21) {
        java.lang.String r2 = null;
        android.graphics.drawable.Drawable r11 = null;
        android.graphics.drawable.Drawable r12 = null;
        android.graphics.drawable.Drawable r13 = null;
        android.graphics.drawable.Drawable r14 = null;
        android.graphics.drawable.Drawable r15 = null;
        android.graphics.drawable.Drawable r6 = null;
        int r7 = 0;
        java.lang.String[] r16 = null;
        int r17 = 0;
        int r18 = 0;
        java.lang.String r19 = null;
        java.lang.String[] r110 = null;
        int r111 = 0;
        android.graphics.drawable.Drawable r8 = null;
        java.lang.String[] r9 = null;
        int r10 = 0;
        int r112 = 0;
        java.lang.String r113 = null;
        int r114 = 0;
        android.graphics.drawable.Drawable r20 = null;
        int r22 = 0;
        java.lang.String[] r23 = null;
        int r0 = 0;
        java.lang.String r3 = null;
        android.graphics.drawable.Drawable r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r2 = r21;
                    $pc11 = 54; continue $sw11;
                }
                case 49: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 54; continue $sw11; }
                    abcd.wu.j6(th, 2580745687899587392L, this, r2);
                    $pc11 = 54; continue $sw11;
                }
                case 54: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc11 = 7; continue $sw11; }
                    try {
                        abcd.wu.j6(2580745687899587392L, this, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    $pc11 = 7; continue $sw11;
                }
                case 7: {
                    if (this.FH == null) { $pc11 = 47; continue $sw11; }
                    if (r2 != null) { $pc11 = 10; continue $sw11; }
                    return null;
                }
                case 10: {
                    if (r2.startsWith("@drawable/") == false) { $pc11 = 65; continue $sw11; }
                    try {
                        r2 = r2.substring(10);
                        r11 = j6(new java.io.File(new java.io.File(this.FH, "drawable-" + v5()), r2 + ".png"));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    if (r11 == null) { $pc11 = 14; continue $sw11; }
                    return r11;
                }
                case 14: {
                    try {
                        r12 = j6(new java.io.File(new java.io.File(this.FH, "drawable-" + v5()), r2 + ".jpg"));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    if (r12 == null) { $pc11 = 17; continue $sw11; }
                    return r12;
                }
                case 17: {
                    try {
                        r13 = DW(new java.io.File(new java.io.File(this.FH, "drawable-" + v5()), r2 + ".9.png"));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    if (r13 == null) { $pc11 = 20; continue $sw11; }
                    return r13;
                }
                case 20: {
                    try {
                        r14 = j6(new java.io.File(new java.io.File(this.FH, "drawable"), r2 + ".png"));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    if (r14 == null) { $pc11 = 23; continue $sw11; }
                    return r14;
                }
                case 23: {
                    try {
                        r15 = j6(new java.io.File(new java.io.File(this.FH, "drawable"), r2 + ".jpg"));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    if (r15 == null) { $pc11 = 26; continue $sw11; }
                    return r15;
                }
                case 26: {
                    try {
                        r6 = DW(new java.io.File(new java.io.File(this.FH, "drawable"), r2 + ".9.png"));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    if (r6 == null) { $pc11 = 29; continue $sw11; }
                    return r6;
                }
                case 29: {
                    r7 = 5;
                    try {
                        r16 = new java.lang.String[]{"xxhpdi", "xhdpi", "hdpi", "mdpi", "ldpi"};
                        r17 = r16.length;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    r18 = 0;
                    $pc11 = 30; continue $sw11;
                }
                case 30: {
                    if (r18 >= r17) { $pc11 = 35; continue $sw11; }
                    try {
                        r19 = r16[r18];
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    r110 = r16;
                    r111 = r17;
                    try {
                        r8 = j6(new java.io.File(new java.io.File(this.FH, "drawable-" + r19), r2 + ".png"));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    if (r8 != null) { $pc11 = 33; continue $sw11; }
                    try {
                        r18 = r18 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    r16 = r110;
                    r17 = r111;
                    r7 = 5;
                    { $pc11 = 30; continue $sw11; }
                }
                case 33: {
                    return r8;
                }
                case 35: {
                    try {
                        r9 = new java.lang.String[r7];
                        r9[0] = "xxhpdi";
                        r9[1] = "xhdpi";
                        r9[2] = "hdpi";
                        r9[3] = "mdpi";
                        r9[4] = "ldpi";
                        r10 = r9.length;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    r112 = 0;
                    $pc11 = 36; continue $sw11;
                }
                case 36: {
                    if (r112 >= r10) { $pc11 = 41; continue $sw11; }
                    try {
                        r113 = r9[r112];
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    r114 = r10;
                    try {
                        r20 = j6(new java.io.File(new java.io.File(this.FH, "drawable-" + r113), r2 + ".jpg"));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    if (r20 != null) { $pc11 = 39; continue $sw11; }
                    try {
                        r112 = r112 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    r10 = r114;
                    { $pc11 = 36; continue $sw11; }
                }
                case 39: {
                    return r20;
                }
                case 41: {
                    r22 = 0;
                    try {
                        r23 = new java.lang.String[]{"xxhpdi", "xhdpi", "hdpi", "mdpi", "ldpi"};
                        r0 = r23.length;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    $pc11 = 42; continue $sw11;
                }
                case 42: {
                    if (r22 >= r0) { $pc11 = 66; continue $sw11; }
                    try {
                        r3 = r23[r22];
                        r4 = DW(new java.io.File(new java.io.File(this.FH, "drawable-" + r3), r2 + ".9.png"));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 49; continue $sw11;
                    }
                    if (r4 != null) { $pc11 = 45; continue $sw11; }
                    r22 = r22 + 1;
                    { $pc11 = 42; continue $sw11; }
                }
                case 45: {
                    return r4;
                }
                case 66: {
                    return null;
                }
                case 65: {
                    return null;
                }
                case 47: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<java.lang.String> DW() {
        java.util.HashSet r2 = null;
        java.util.Iterator<java.lang.String> r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 15: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 20; continue $sw12; }
                    abcd.wu.j6(th, -226113434057994372L, this);
                    $pc12 = 20; continue $sw12;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(-226113434057994372L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    try {
                        r2 = new java.util.HashSet();
                        java.util.Iterator<java.util.SortedMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> r3 = this.v5.values().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    $pc12 = 8; continue $sw12;
                }
                case 8: {
                    if (r3.hasNext() == false) { $pc12 = 13; continue $sw12; }
                    try {
                        r4 = r3.next().keySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    $pc12 = 11; continue $sw12;
                }
                case 11: {
                    if (r4.hasNext() == false) { $pc12 = 8; continue $sw12; }
                    try {
                        r2.add("@style/" + r4.next());
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    { $pc12 = 11; continue $sw12; }
                }
                case 13: {
                    return new java.util.ArrayList(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String FH(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 13: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 17; continue $sw13; }
                    abcd.wu.j6(th, -3321948413568660276L, this, r5);
                    $pc13 = 17; continue $sw13;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(-3321948413568660276L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 13; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    if (r5 != null) { $pc13 = 10; continue $sw13; }
                    return null;
                }
                case 10: {
                    if (r5.startsWith("@style/") == false) { $pc13 = 20; continue $sw13; }
                    return j6(r5.substring(7), new java.util.HashSet());
                }
                case 20: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH() {
        int r3 = 0;
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 17: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 22; continue $sw14; }
                    abcd.wu.j6(th, -1974903361536095415L, this);
                    $pc14 = 22; continue $sw14;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(-1974903361536095415L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 17; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    try {
                        this.VH = new java.util.HashMap();
                        this.v5 = new java.util.HashMap();
                        this.Zo = new java.util.HashMap();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 17; continue $sw14;
                    }
                    r3 = 0;
                    $pc14 = 8; continue $sw14;
                }
                case 8: {
                    if (r3 >= 30) { $pc14 = 11; continue $sw14; }
                    try {
                        this.v5.put(java.lang.Integer.valueOf(r3), new java.util.TreeMap());
                        this.Zo.put(java.lang.Integer.valueOf(r3), new java.util.HashMap());
                        this.VH.put(java.lang.Integer.valueOf(r3), new java.util.HashMap());
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 17; continue $sw14;
                    }
                    { $pc14 = 8; continue $sw14; }
                }
                case 11: {
                    if (this.FH == null) { $pc14 = 16; continue $sw14; }
                    try {
                        j6(0, new java.io.File(this.FH, "values"));
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 17; continue $sw14;
                    }
                    r2 = 1;
                    $pc14 = 13; continue $sw14;
                }
                case 13: {
                    if (r2 >= 30) { $pc14 = 28; continue $sw14; }
                    try {
                        j6(r2, new java.io.File(this.FH, "values-v" + r2));
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 17; continue $sw14;
                    }
                    r2 = r2 + 1;
                    { $pc14 = 13; continue $sw14; }
                }
                case 28: {
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    public java.lang.String Hw() {
        long r0 = 0L;
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = -109065846718888472L;
                    $pc15 = 21; continue $sw15;
                }
                case 16: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 21; continue $sw15; }
                    abcd.wu.j6(th, r0, this);
                    $pc15 = 21; continue $sw15;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc15 = 6; continue $sw15; }
                    try {
                        abcd.wu.j6(-109065846718888472L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 16; continue $sw15;
                    }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    r2 = 1;
                    $pc15 = 8; continue $sw15;
                }
                case 8: {
                    if (r2 >= 1000) { $pc15 = 14; continue $sw15; }
                    if (DW("@drawable/image_" + r2) == null) { $pc15 = 11; continue $sw15; }
                    try {
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 16; continue $sw15;
                    }
                    { $pc15 = 8; continue $sw15; }
                }
                case 11: {
                    try {
                        r0 = "image_" + r2;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 16; continue $sw15;
                    }
                    return r0;
                }
                case 14: {
                    return "image";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String j6(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 8: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 12; continue $sw16; }
                    abcd.wu.j6(th, -53679099470038239L, this, r5);
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(-53679099470038239L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    return v5(Hw(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String j6(java.lang.String r8, com.aide.uidesigner.N.a r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 3;
        $sw17: while (true) {
            switch ($pc17) {
                case 11: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 15; continue $sw17; }
                    abcd.wu.j6(th, 2339235564565318731L, this, r8, r9);
                    $pc17 = 15; continue $sw17;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(2339235564565318731L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 11; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    if (r8.startsWith("@style/") == false) { $pc17 = 9; continue $sw17; }
                    return j6(r8.substring(7), r9, new java.util.HashSet());
                }
                case 9: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<java.lang.String> j6() {
        java.util.HashSet r2 = null;
        java.io.File[] r3 = null;
        int r4 = 0;
        int r6 = 0;
        java.io.File r7 = null;
        java.io.File[] r8 = null;
        int r9 = 0;
        int r10 = 0;
        java.lang.String r11 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 27: {
                    th = $ex18;
                    if (DW == false) { $pc18 = 32; continue $sw18; }
                    abcd.wu.j6(th, -5717161722900690025L, this);
                    $pc18 = 32; continue $sw18;
                }
                case 32: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc18 = 6; continue $sw18; }
                    try {
                        abcd.wu.j6(-5717161722900690025L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 27; continue $sw18;
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    try {
                        r2 = new java.util.HashSet();
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 27; continue $sw18;
                    }
                    if (this.FH == null) { $pc18 = 25; continue $sw18; }
                    try {
                        r3 = this.FH.listFiles();
                        r4 = r3.length;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 27; continue $sw18;
                    }
                    r6 = 0;
                    $pc18 = 9; continue $sw18;
                }
                case 9: {
                    if (r6 >= r4) { $pc18 = 25; continue $sw18; }
                    try {
                        r7 = r3[r6];
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 27; continue $sw18;
                    }
                    if (r7.isDirectory() == false) { $pc18 = 24; continue $sw18; }
                    if (r7.getName().startsWith("drawable") == false) { $pc18 = 24; continue $sw18; }
                    try {
                        r8 = r7.listFiles();
                        r9 = r8.length;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 27; continue $sw18;
                    }
                    r10 = 0;
                    $pc18 = 15; continue $sw18;
                }
                case 15: {
                    if (r10 >= r9) { $pc18 = 24; continue $sw18; }
                    try {
                        r11 = r8[r10].getName();
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 27; continue $sw18;
                    }
                    if (r11.toLowerCase().endsWith(".png") == false) { $pc18 = 19; continue $sw18; }
                    $pc18 = 22; continue $sw18;
                }
                case 22: {
                    try {
                        r2.add("@drawable/" + r11.substring(0, r11.length() - 4));
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 27; continue $sw18;
                    }
                    $pc18 = 23; continue $sw18;
                }
                case 23: {
                    try {
                        r10 = r10 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 27; continue $sw18;
                    }
                    { $pc18 = 15; continue $sw18; }
                }
                case 19: {
                    if (r11.toLowerCase().endsWith(".jpg") == true) { $pc18 = 22; continue $sw18; }
                    if (r11.toLowerCase().endsWith(".xml") == false) { $pc18 = 23; continue $sw18; }
                    $pc18 = 24; continue $sw18;
                }
                case 24: {
                    try {
                        r6 = r6 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 27; continue $sw18;
                    }
                    $pc18 = 25; continue $sw18;
                }
                case 25: {
                    return new java.util.ArrayList(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r8, android.content.Intent r9) {
        java.io.File r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 3;
        $sw19: while (true) {
            switch ($pc19) {
                case 10: {
                    th = $ex19;
                    if (DW == false) { $pc19 = 14; continue $sw19; }
                    abcd.wu.j6(th, 844861961774078976L, this, r8, r9);
                    $pc19 = 14; continue $sw19;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc19 = 17; continue $sw19; }
                    try {
                        abcd.wu.j6(844861961774078976L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 10; continue $sw19;
                    }
                    $pc19 = 17; continue $sw19;
                }
                case 17: {
                    try {
                        r0 = new java.io.File(this.FH, "drawable");
                        r0.mkdirs();
                        com.aide.common.Xa.j6(this.Hw.getContentResolver().openInputStream(r9.getData()), new java.io.FileOutputStream(new java.io.File(r0, r8 + ".png")));
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.io.IOException) { $pc19 = 7; continue $sw19; }
                        $pc19 = 10; continue $sw19;
                    }
                    $pc19 = 19; continue $sw19;
                }
                case 19: {
                    return;
                }
                case 7: {
                    e = $ex19;
                    try {
                        e.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 10; continue $sw19;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
