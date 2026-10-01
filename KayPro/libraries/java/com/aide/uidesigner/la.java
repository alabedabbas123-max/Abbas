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
        if (j6 == false) goto L5;
        abcd.wu.j6(4773085457347827576L, null, r8, r9);     // Catch: java.lang.Throwable -> L11
    L5:
        this.Hw = r8;     // Catch: java.lang.Throwable -> L11
        if (r9 == null) goto L9;
        r1 = new java.io.File(r9);     // Catch: java.lang.Throwable -> L11
    L9:
        this.FH = r1;     // Catch: java.lang.Throwable -> L11
        return;
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 4773085457347827576L, null, r8, r9);
    L15:
        throw th;
    }

    @abcd.Interfacesu(method = 4886328763528574124L)
    private android.graphics.drawable.Drawable DW(java.io.File r5) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 2147445038147466575L, this, r5);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2147445038147466575L, this, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (r5 != null) goto L20;
    L13:
        return null;
    L20:
        if (r5.isFile() == false) goto L13;
        return android.graphics.drawable.NinePatchDrawable.createFromStream(new java.io.FileInputStream(r5), null);
        goto L13
    }

    @abcd.Interfacesu(method = -1231753995400535600L)
    private java.lang.String Hw(java.lang.String r8) {
    L27:
        th = move-exception;
        if (DW == false) goto L32;
        abcd.wu.j6(th, -980958430477487L, this, r8);
    L32:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-980958430477487L, this, r8);     // Catch: java.lang.Throwable -> L27
    L6:
        java.lang.String r2 = null;
        if (r8 != null) goto L9;
    L11:
        if (r8 != null) goto L13;
    L15:
        if (r2 == null) goto L26;
        int r3 = android.os.Build.VERSION.SDK_INT;     // Catch: java.lang.Throwable -> L27
    L17:
        if (r3 < 0) goto L26;
        java.util.Iterator<java.util.Map<java.lang.String, java.lang.String>> r4 = this.v5.get(java.lang.Integer.valueOf(r3)).values().iterator();     // Catch: java.lang.Throwable -> L27
    L20:
        if (r4.hasNext() == false) goto L25;
        java.util.Map<java.lang.String, java.lang.String> r5 = r4.next();     // Catch: java.lang.Throwable -> L27
        if (r5.containsKey(r2) == false) goto L20;
        return r5.get(r2);
    L25:
        r3 = r3 - 1;
    L26:
        return r8;
    L13:
        if (r8.startsWith("?") == false) goto L15;
        r2 = r8.substring(1);     // Catch: java.lang.Throwable -> L27
        goto L15
    L9:
        if (r8.startsWith("?attr/") == false) goto L11;
        r2 = r8.substring(6);     // Catch: java.lang.Throwable -> L27
        goto L15
    }

    @abcd.Interfacesu(method = -1502715607947303653L)
    private android.graphics.drawable.Drawable j6(java.io.File r10) {
    L26:
        th = move-exception;
        if (DW == false) goto L31;
        abcd.wu.j6(th, 2415039162400772100L, this, r10);
    L31:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2415039162400772100L, this, r10);     // Catch: java.lang.Throwable -> L26
    L7:
        if (r10 != null) goto L36;
    L25:
        return null;
    L36:
        if (r10.isFile() == false) goto L25;
        android.graphics.BitmapFactory.Options r3 = new android.graphics.BitmapFactory.Options();     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        int r4 = 1;
        r3.inJustDecodeBounds = true;     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        java.io.FileInputStream r5 = new java.io.FileInputStream(r10);     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        android.graphics.BitmapFactory.decodeStream(r5, null, r3);     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        r5.close();     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        int r6 = r3.outWidth;     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        int r7 = r3.outHeight;     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        float r8 = r6 / r7;     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
    L13:
        if ((r6 / 2) < 500) goto L15;
    L23:
        r6 = r6 / 2;     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        r7 = r7 / 2;     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        r4 = r4 * 2;
        goto L13
    L15:
        if ((r7 / 2) >= 500) goto L23;
        if (r7 <= 500) goto L18;
        int r9 = (int) (500 * r8);     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
    L18:
        android.graphics.BitmapFactory.Options r11 = new android.graphics.BitmapFactory.Options();     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        r11.inSampleSize = r4;     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        java.io.FileInputStream r12 = new java.io.FileInputStream(r10);     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeStream(r12, null, r11);     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        r12.close();     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L26
        if (r13 != null) goto L21;
        return null;
    L21:
        return new android.graphics.drawable.BitmapDrawable(this.Hw.getResources(), r13);
        goto L25
    }

    @abcd.Interfacesu(method = 2940030531097341120L)
    private java.lang.String j6(java.lang.String r9, com.aide.uidesigner.N.a r10, java.util.Set<java.lang.String> r11) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, 288562152658887735L, this, r9, r10, r11);
    L24:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(288562152658887735L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L19
    L6:
        if (r11.contains(r9) == false) goto L8;
        return null;
    L8:
        r11.add(r9);     // Catch: java.lang.Throwable -> L19
        int r0 = android.os.Build.VERSION.SDK_INT;     // Catch: java.lang.Throwable -> L19
    L9:
        if (r0 < 0) goto L18;
        java.util.Map<java.lang.String, java.lang.String> r2 = this.v5.get(java.lang.Integer.valueOf(r0)).get(r9);     // Catch: java.lang.Throwable -> L19
        if (r2 != null) goto L12;
        r0 = r0 - 1;
        goto L9
    L12:
        java.lang.String r1 = r2.get(r10.Zo);     // Catch: java.lang.Throwable -> L19
        if (r1 == null) goto L15;
        return r1;
    L15:
        return j6(this.Zo.get(java.lang.Integer.valueOf(r0)).get(r9), r10, r11);
    L18:
        return null;
    }

    @abcd.Interfacesu(method = -3417635586407792211L)
    private java.lang.String j6(java.lang.String r8, java.util.Set<java.lang.String> r9) {
    L24:
        th = move-exception;
        if (DW == false) goto L29;
        abcd.wu.j6(th, 3377306536535367352L, this, r8, r9);
    L29:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(3377306536535367352L, this, r8, r9);     // Catch: java.lang.Throwable -> L24
    L6:
        if (r9.contains(r8) == false) goto L9;
        return null;
    L9:
        r9.add(r8);     // Catch: java.lang.Throwable -> L24
        int r0 = android.os.Build.VERSION.SDK_INT;     // Catch: java.lang.Throwable -> L24
    L10:
        if (r0 < 0) goto L19;
        java.lang.String r1 = this.Zo.get(java.lang.Integer.valueOf(r0)).get(r8);     // Catch: java.lang.Throwable -> L24
        if (r1 == null) goto L17;
        if (r1.length() <= 0) goto L17;
        return j6(r1, r9);
    L17:
        r0 = r0 - 1;     // Catch: java.lang.Throwable -> L24
        goto L10
    L19:
        if (r8.startsWith("android:") == false) goto L23;
        return "@android:style/" + r8.substring(8);
    L23:
        return "@style/" + r8;
    }

    @abcd.Interfacesu(method = 1798642545906150400L)
    private void j6(int r8, java.io.File r9) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -5079277408722106139L, this, new java.lang.Integer(r8), r9);
    L17:
        throw th;
    L3:
        if (j6 == false) goto L22;
        abcd.wu.j6(-5079277408722106139L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L12
    L22:
        java.io.File[] r10 = r9.listFiles();     // Catch: java.lang.Throwable -> L19
        int r0 = r10.length;     // Catch: java.lang.Throwable -> L19
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L27;
        java.io.File r2 = r10[r1];     // Catch: java.lang.Throwable -> L19
        if (r2.getName().toLowerCase().endsWith(".xml") == false) goto L10;
        java.io.FileInputStream r3 = new java.io.FileInputStream(r2);     // Catch: java.lang.Throwable -> L19
        org.w3c.dom.Document r4 = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(r3);     // Catch: java.lang.Throwable -> L19
        r3.close();     // Catch: java.lang.Throwable -> L19
        j6(r4, r8);     // Catch: java.lang.Throwable -> L19
        j6(r4, r8, "string");     // Catch: java.lang.Throwable -> L19
        j6(r4, r8, "color");     // Catch: java.lang.Throwable -> L19
        j6(r4, r8, "dimen");     // Catch: java.lang.Throwable -> L19
        j6(r4, r8, "bool");     // Catch: java.lang.Throwable -> L19
        j6(r4, r8, "integer");     // Catch: java.lang.Throwable -> L19
    L10:
        r1 = r1 + 1;
        goto L6
    L27:
        return;
    }

    @abcd.Interfacesu(method = -1950695247865460151L)
    private void j6(org.w3c.dom.Document r11, int r12) {
    L28:
        th = move-exception;
        if (DW == false) goto L33;
        abcd.wu.j6(th, -2103476170765493804L, this, r11, new java.lang.Integer(r12));
    L33:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2103476170765493804L, this, r11, new java.lang.Integer(r12));     // Catch: java.lang.Throwable -> L28
    L6:
        org.w3c.dom.NodeList r1 = r11.getElementsByTagName("style");     // Catch: java.lang.Throwable -> L28
        int r3 = 0;
    L7:
        if (r3 >= r1.getLength()) goto L27;
        org.w3c.dom.Node r4 = r1.item(r3);     // Catch: java.lang.Throwable -> L28
        org.w3c.dom.Node r5 = r4.getAttributes().getNamedItem("name");     // Catch: java.lang.Throwable -> L28
        if ((r5 instanceof org.w3c.dom.Attr) == false) goto L26;
        java.lang.String r6 = ((org.w3c.dom.Attr) r5).getValue();     // Catch: java.lang.Throwable -> L28
        java.lang.String r7 = "";
        if (r6.contains(".") == false) goto L14;
        r7 = r6.substring(0, r6.lastIndexOf(46));     // Catch: java.lang.Throwable -> L28
    L17:
        this.Zo.get(java.lang.Integer.valueOf(r12)).put(r6, r7);     // Catch: java.lang.Throwable -> L28
        java.util.HashMap r8 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L28
        this.v5.get(java.lang.Integer.valueOf(r12)).put(r6, r8);     // Catch: java.lang.Throwable -> L28
        org.w3c.dom.NodeList r9 = r4.getChildNodes();     // Catch: java.lang.Throwable -> L28
        int r10 = 0;
    L19:
        if (r10 >= r9.getLength()) goto L26;
        org.w3c.dom.Node r13 = r9.item(r10);     // Catch: java.lang.Throwable -> L28
        if (r13.getNodeName().equals("item") == false) goto L25;
        org.w3c.dom.Node r14 = r13.getAttributes().getNamedItem("name");     // Catch: java.lang.Throwable -> L28
        if ((r14 instanceof org.w3c.dom.Attr) == false) goto L25;
        r8.put(((org.w3c.dom.Attr) r14).getValue(), r13.getTextContent());     // Catch: java.lang.Throwable -> L28
    L25:
        r10 = r10 + 1;
        goto L19
    L14:
        org.w3c.dom.Node r15 = r4.getAttributes().getNamedItem("parent");     // Catch: java.lang.Throwable -> L28
        if ((r15 instanceof org.w3c.dom.Attr) == false) goto L17;
        r7 = ((org.w3c.dom.Attr) r15).getValue();     // Catch: java.lang.Throwable -> L28
    L26:
        r3 = r3 + 1;
        goto L7
    }

    @abcd.Interfacesu(method = -1331072957459363333L)
    private void j6(org.w3c.dom.Document r9, int r10, java.lang.String r11) {
    L13:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -2627607510775105464L, this, r9, new java.lang.Integer(r10), r11);
    L18:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2627607510775105464L, this, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L13
    L5:
        org.w3c.dom.NodeList r0 = r9.getElementsByTagName(r11);     // Catch: java.lang.Throwable -> L13
        int r1 = 0;
    L6:
        if (r1 >= r0.getLength()) goto L12;
        org.w3c.dom.Node r2 = r0.item(r1);     // Catch: java.lang.Throwable -> L13
        org.w3c.dom.Node r3 = r2.getAttributes().getNamedItem("name");     // Catch: java.lang.Throwable -> L13
        if ((r3 instanceof org.w3c.dom.Attr) == false) goto L11;
        java.lang.String r4 = ((org.w3c.dom.Attr) r3).getValue();     // Catch: java.lang.Throwable -> L13
        java.lang.String r5 = r2.getTextContent();     // Catch: java.lang.Throwable -> L13
        this.VH.get(java.lang.Integer.valueOf(r10)).put("@" + r11 + "/" + r4, r5);     // Catch: java.lang.Throwable -> L13
    L11:
        r1 = r1 + 1;
        goto L6
    }

    @abcd.Interfacesu(method = -1346814380227330365L)
    private java.lang.String v5() {
    L24:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, 3531206633130907192L, this);
    L28:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3531206633130907192L, this);     // Catch: java.lang.Throwable -> L24
    L6:
        int r2 = this.Hw.getResources().getDisplayMetrics().densityDpi;     // Catch: java.lang.Throwable -> L24
        if (r2 != 120) goto L9;
        return "ldpi";
    L9:
        if (r2 != 160) goto L11;
        return "mdpi";
    L11:
        if (r2 != 240) goto L13;
        return "hdpi";
    L13:
        if (r2 == 320) goto L16;
        return "";
    L16:
        return "xhdpi";
    }

    @abcd.Interfacesu(method = 538982813216511408L)
    private java.lang.String v5(java.lang.String r6) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -331129711600998867L, this, r6);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-331129711600998867L, this, r6);     // Catch: java.lang.Throwable -> L16
    L6:
        if (r6 != null) goto L8;
    L15:
        return r6;
    L8:
        if (r6.startsWith("@") == false) goto L15;
        int r2 = android.os.Build.VERSION.SDK_INT;     // Catch: java.lang.Throwable -> L16
    L10:
        if (r2 < 0) goto L15;
        java.lang.String r3 = this.VH.get(java.lang.Integer.valueOf(r2)).get(r6);     // Catch: java.lang.Throwable -> L16
        if (r3 != null) goto L13;
        r2 = r2 - 1;
        goto L10
    L13:
        return r3;
    }

    public android.graphics.drawable.Drawable DW(java.lang.String r21) {
        java.lang.String r2 = r21;
    L49:
        th = move-exception;
        if (DW == false) goto L54;
        abcd.wu.j6(th, 2580745687899587392L, this, r2);
    L54:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2580745687899587392L, this, r2);     // Catch: java.lang.Throwable -> L49
    L7:
        if (this.FH == null) goto L47;
        if (r2 != null) goto L10;
        return null;
    L10:
        if (r2.startsWith("@drawable/") == false) goto L65;
        r2 = r2.substring(10);     // Catch: java.lang.Throwable -> L49
        android.graphics.drawable.Drawable r11 = j6(new java.io.File(new java.io.File(this.FH, "drawable-" + v5()), r2 + ".png"));     // Catch: java.lang.Throwable -> L49
        if (r11 == null) goto L14;
        return r11;
    L14:
        android.graphics.drawable.Drawable r12 = j6(new java.io.File(new java.io.File(this.FH, "drawable-" + v5()), r2 + ".jpg"));     // Catch: java.lang.Throwable -> L49
        if (r12 == null) goto L17;
        return r12;
    L17:
        android.graphics.drawable.Drawable r13 = DW(new java.io.File(new java.io.File(this.FH, "drawable-" + v5()), r2 + ".9.png"));     // Catch: java.lang.Throwable -> L49
        if (r13 == null) goto L20;
        return r13;
    L20:
        android.graphics.drawable.Drawable r14 = j6(new java.io.File(new java.io.File(this.FH, "drawable"), r2 + ".png"));     // Catch: java.lang.Throwable -> L49
        if (r14 == null) goto L23;
        return r14;
    L23:
        android.graphics.drawable.Drawable r15 = j6(new java.io.File(new java.io.File(this.FH, "drawable"), r2 + ".jpg"));     // Catch: java.lang.Throwable -> L49
        if (r15 == null) goto L26;
        return r15;
    L26:
        android.graphics.drawable.Drawable r6 = DW(new java.io.File(new java.io.File(this.FH, "drawable"), r2 + ".9.png"));     // Catch: java.lang.Throwable -> L49
        if (r6 == null) goto L29;
        return r6;
    L29:
        int r7 = 5;
        java.lang.String[] r16 = {"xxhpdi", "xhdpi", "hdpi", "mdpi", "ldpi"};     // Catch: java.lang.Throwable -> L49
        int r17 = r16.length;     // Catch: java.lang.Throwable -> L49
        int r18 = 0;
    L30:
        if (r18 >= r17) goto L35;
        java.lang.String r19 = r16[r18];     // Catch: java.lang.Throwable -> L49
        java.lang.String[] r110 = r16;
        int r111 = r17;
        android.graphics.drawable.Drawable r8 = j6(new java.io.File(new java.io.File(this.FH, "drawable-" + r19), r2 + ".png"));     // Catch: java.lang.Throwable -> L49
        if (r8 != null) goto L33;
        r18 = r18 + 1;     // Catch: java.lang.Throwable -> L49
        r16 = r110;
        r17 = r111;
        r7 = 5;
        goto L30
    L33:
        return r8;
    L35:
        java.lang.String[] r9 = new java.lang.String[r7];     // Catch: java.lang.Throwable -> L49
        r9[0] = "xxhpdi";     // Catch: java.lang.Throwable -> L49
        r9[1] = "xhdpi";     // Catch: java.lang.Throwable -> L49
        r9[2] = "hdpi";     // Catch: java.lang.Throwable -> L49
        r9[3] = "mdpi";     // Catch: java.lang.Throwable -> L49
        r9[4] = "ldpi";     // Catch: java.lang.Throwable -> L49
        int r10 = r9.length;     // Catch: java.lang.Throwable -> L49
        int r112 = 0;
    L36:
        if (r112 >= r10) goto L41;
        java.lang.String r113 = r9[r112];     // Catch: java.lang.Throwable -> L49
        int r114 = r10;
        android.graphics.drawable.Drawable r20 = j6(new java.io.File(new java.io.File(this.FH, "drawable-" + r113), r2 + ".jpg"));     // Catch: java.lang.Throwable -> L49
        if (r20 != null) goto L39;
        r112 = r112 + 1;     // Catch: java.lang.Throwable -> L49
        r10 = r114;
        goto L36
    L39:
        return r20;
    L41:
        int r22 = 0;
        java.lang.String[] r23 = {"xxhpdi", "xhdpi", "hdpi", "mdpi", "ldpi"};     // Catch: java.lang.Throwable -> L49
        int r0 = r23.length;     // Catch: java.lang.Throwable -> L49
    L42:
        if (r22 >= r0) goto L66;
        java.lang.String r3 = r23[r22];     // Catch: java.lang.Throwable -> L49
        android.graphics.drawable.Drawable r4 = DW(new java.io.File(new java.io.File(this.FH, "drawable-" + r3), r2 + ".9.png"));     // Catch: java.lang.Throwable -> L49
        if (r4 != null) goto L45;
        r22 = r22 + 1;
        goto L42
    L45:
        return r4;
    L66:
        return null;
    L65:
        return null;
    L47:
        return null;
    }

    public java.util.List<java.lang.String> DW() {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -226113434057994372L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-226113434057994372L, this);     // Catch: java.lang.Throwable -> L15
    L6:
        java.util.HashSet r2 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L15
        java.util.Iterator<java.util.SortedMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> r3 = this.v5.values().iterator();     // Catch: java.lang.Throwable -> L15
    L8:
        if (r3.hasNext() == false) goto L13;
        java.util.Iterator<java.lang.String> r4 = r3.next().keySet().iterator();     // Catch: java.lang.Throwable -> L15
    L11:
        if (r4.hasNext() == false) goto L8;
        r2.add("@style/" + r4.next());     // Catch: java.lang.Throwable -> L15
        goto L11
    L13:
        return new java.util.ArrayList(r2);
    }

    public java.lang.String FH(java.lang.String r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -3321948413568660276L, this, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3321948413568660276L, this, r5);     // Catch: java.lang.Throwable -> L13
    L6:
        if (r5 != null) goto L10;
        return null;
    L10:
        if (r5.startsWith("@style/") == false) goto L20;
        return j6(r5.substring(7), new java.util.HashSet());
    L20:
        return r5;
    }

    public void FH() {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -1974903361536095415L, this);
    L22:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1974903361536095415L, this);     // Catch: java.lang.Throwable -> L17
    L6:
        this.VH = new java.util.HashMap();     // Catch: java.lang.Throwable -> L17
        this.v5 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L17
        this.Zo = new java.util.HashMap();     // Catch: java.lang.Throwable -> L17
        int r3 = 0;
    L8:
        if (r3 >= 30) goto L11;
        this.v5.put(java.lang.Integer.valueOf(r3), new java.util.TreeMap());     // Catch: java.lang.Throwable -> L17
        this.Zo.put(java.lang.Integer.valueOf(r3), new java.util.HashMap());     // Catch: java.lang.Throwable -> L17
        this.VH.put(java.lang.Integer.valueOf(r3), new java.util.HashMap());     // Catch: java.lang.Throwable -> L17
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L17
        goto L8
    L11:
        if (this.FH == null) goto L16;
        j6(0, new java.io.File(this.FH, "values"));     // Catch: java.lang.Throwable -> L17
        int r2 = 1;
    L13:
        if (r2 >= 30) goto L28;
        j6(r2, new java.io.File(this.FH, "values-v" + r2));     // Catch: java.lang.Throwable -> L17
        r2 = r2 + 1;
        goto L13
    L28:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    public java.lang.String Hw() {
        long r0 = -109065846718888472(0xfe7c8530b53185e8, double:-1.9099824734936231E301);
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, r0, this);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-109065846718888472L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        int r2 = 1;
    L8:
        if (r2 >= 1000) goto L14;
        if (DW("@drawable/image_" + r2) == null) goto L11;
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L16
        goto L8
    L11:
        r0 = "image_" + r2;     // Catch: java.lang.Throwable -> L16
        return r0;
    L14:
        return "image";
    }

    public java.lang.String j6(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -53679099470038239L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-53679099470038239L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return v5(Hw(r5));
    }

    public java.lang.String j6(java.lang.String r8, com.aide.uidesigner.N.a r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 2339235564565318731L, this, r8, r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(2339235564565318731L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r8.startsWith("@style/") == false) goto L9;
        return j6(r8.substring(7), r9, new java.util.HashSet());
    L9:
        return null;
    }

    public java.util.List<java.lang.String> j6() {
    L27:
        th = move-exception;
        if (DW == false) goto L32;
        abcd.wu.j6(th, -5717161722900690025L, this);
    L32:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5717161722900690025L, this);     // Catch: java.lang.Throwable -> L27
    L6:
        java.util.HashSet r2 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L27
        if (this.FH == null) goto L25;
        java.io.File[] r3 = this.FH.listFiles();     // Catch: java.lang.Throwable -> L27
        int r4 = r3.length;     // Catch: java.lang.Throwable -> L27
        int r6 = 0;
    L9:
        if (r6 >= r4) goto L25;
        java.io.File r7 = r3[r6];     // Catch: java.lang.Throwable -> L27
        if (r7.isDirectory() == false) goto L24;
        if (r7.getName().startsWith("drawable") == false) goto L24;
        java.io.File[] r8 = r7.listFiles();     // Catch: java.lang.Throwable -> L27
        int r9 = r8.length;     // Catch: java.lang.Throwable -> L27
        int r10 = 0;
    L15:
        if (r10 >= r9) goto L24;
        java.lang.String r11 = r8[r10].getName();     // Catch: java.lang.Throwable -> L27
        if (r11.toLowerCase().endsWith(".png") == false) goto L19;
    L22:
        r2.add("@drawable/" + r11.substring(0, r11.length() - 4));     // Catch: java.lang.Throwable -> L27
    L23:
        r10 = r10 + 1;     // Catch: java.lang.Throwable -> L27
        goto L15
    L19:
        if (r11.toLowerCase().endsWith(".jpg") == true) goto L22;
        if (r11.toLowerCase().endsWith(".xml") == false) goto L23;
    L24:
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L27
    L25:
        return new java.util.ArrayList(r2);
    }

    public void j6(java.lang.String r8, android.content.Intent r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 844861961774078976L, this, r8, r9);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L17;
        abcd.wu.j6(844861961774078976L, this, r8, r9);     // Catch: java.lang.Throwable -> L10
    L17:
        java.io.File r0 = new java.io.File(this.FH, "drawable");     // Catch: java.io.IOException -> L7 java.lang.Throwable -> L10
        r0.mkdirs();     // Catch: java.io.IOException -> L7 java.lang.Throwable -> L10
        com.aide.common.Xa.j6(this.Hw.getContentResolver().openInputStream(r9.getData()), new java.io.FileOutputStream(new java.io.File(r0, r8 + ".png")));     // Catch: java.io.IOException -> L7 java.lang.Throwable -> L10
    L19:
        return;
    L7:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Throwable -> L10
    }
}
