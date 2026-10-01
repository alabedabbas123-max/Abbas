package abcd;

public class Dv {
    private static final java.lang.Object[] DW = null;
    private static final java.util.Map<java.lang.Character, java.lang.String> j6 = null;
    private java.util.HashMap<java.lang.CharSequence, java.lang.String> FH;
    private java.util.HashMap<java.lang.CharSequence, java.lang.String> Hw;
    private java.lang.Object Zo;
    private java.util.HashMap<java.lang.CharSequence, java.lang.String> v5;

    static {
        j6 = new java.util.HashMap();
        int r2 = 0;
        DW = new java.lang.Object[]{'.', "dot", ':', "colon", ';', "semicolon", '/', "slash", '&', "and", '|', "or", '!', "exclamation", '?', "question", '%', "percentage", '+', "plus", '-', "minus", '*', "start"};
    L3:
        java.lang.Object[] r0 = DW;
        if (r2 >= r0.length) goto L6;
        j6.put((java.lang.Character) r0[r2], (java.lang.String) r0[r2 + 1]);
        r2 = r2 + 2;
        goto L3
    }

    public Dv() {
        this.FH = new java.util.HashMap();
        this.Hw = new java.util.HashMap();
        this.Zo = new java.lang.Object();
        new java.lang.Thread(new abcd.Cv(this)).start();
    }

    private java.lang.String DW(java.lang.String r7) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer();
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= r7.length()) goto L14;
        char r3 = r7.charAt(r2);
        if (java.lang.Character.isLetterOrDigit(r3) == false) goto L9;
        r0.append(java.lang.Character.toLowerCase(r3));
    L13:
        r2 = r2 + 1;
        goto L4
    L9:
        if (r0.length() <= 0) goto L13;
        if (r0.charAt(r0.length() - 1) == ' ') goto L13;
        r0.append(' ');
        goto L13
    L14:
        java.lang.String r4 = r0.toString().trim();
        if (r4.length() > 0) goto L17;
        java.lang.StringBuffer r5 = new java.lang.StringBuffer();
    L20:
        if (r1 >= r7.length()) goto L26;
        java.lang.String r6 = j6.get(java.lang.Character.valueOf(r7.charAt(r1)));
        if (r6 == null) goto L24;
        r5.append(r6);
    L24:
        r1 = r1 + 1;
        goto L20
    L26:
        if (r5.length() > 0) goto L28;
        return "chars";
    L28:
        return r5.toString();
    L17:
        return r4.replace(' ', '_');
    }

    static void DW(abcd.Dv r0) {
        r0.j6();
    }

    private void DW(android.content.res.Resources r3, int r4, java.util.List<java.lang.String> r5) {
        android.content.res.XmlResourceParser r6 = r3.getLayout(r4);
        int r7 = r6.getEventType();
    L4:
        if (r7 == 1) goto L17;
        if (r7 != 2) goto L16;
        int r8 = 0;
    L9:
        if (r8 >= r6.getAttributeCount()) goto L16;
        if ("text".equals(r6.getAttributeName(r8)) == false) goto L15;
        java.lang.String r0 = r6.getAttributeValue(r8);
        if (r0.startsWith("@") == true) goto L15;
        r5.add(r0);
    L15:
        r8 = r8 + 1;
    L16:
        r7 = r6.next();
        goto L4
    }

    static java.lang.Object j6(abcd.Dv r0) {
        return r0.Zo;
    }

    private java.lang.String j6(java.lang.String r5) {
        int r0 = r5.hashCode();
        if (r0 == (-354563693)) goto L16;
        if (r0 == 618612823) goto L13;
        if (r0 == 1236929197) goto L10;
    L18:
        byte r1 = -1;
    L19:
        if (r1 == 0) goto L25;
        if (r1 == 1) goto L23;
        if (r1 == 2) goto L27;
        return r5;
    L27:
        return "more";
    L23:
        return "more";
    L25:
        return "up";
    L10:
        if (r5.equals("action_bar_up_description") == false) goto L18;
        r1 = 0;
        goto L19
    L13:
        if (r5.equals("floating_toolbar_open_overflow_description") == false) goto L18;
        r1 = 1;
        goto L19
    L16:
        if (r5.equals("abc_action_menu_overflow_description") == false) goto L18;
        r1 = 2;
        goto L19
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void j6() {
        java.util.HashMap<java.lang.CharSequence, java.lang.String> r0 = new java.util.HashMap();
        java.util.ArrayList r9 = new java.util.ArrayList();
        java.util.ArrayList r10 = new java.util.ArrayList();
        java.util.ArrayList r11 = new java.util.ArrayList();
        java.util.ArrayList r12 = new java.util.ArrayList();
        java.util.ArrayList r13 = new java.util.ArrayList();
        java.util.ArrayList r14 = new java.util.ArrayList();
        j6("res.dat.jet", r10, r11, r14, r12, r13, r9);
        j6("android.R$string", r10);
        j6("com.android.internal.R$string", r10);
        android.content.res.Resources r1 = abcd.wu.j6().getResources();
        java.util.Iterator<java.lang.Integer> r2 = r10.iterator();
    L4:
        if (r2.hasNext() == false) goto L12;
        java.lang.Integer r3 = r2.next();
        java.lang.String r4 = r1.getString(r3.intValue());     // Catch: java.lang.Throwable -> L70
        java.lang.String r5 = j6(r1.getResourceEntryName(r3.intValue()));     // Catch: java.lang.Throwable -> L70
        if (r0.containsKey(r4) == false) goto L10;
        if (((java.lang.String) r0.get(r4)).length() <= r5.length()) goto L4;
    L10:
        r0.put(r4, r5);     // Catch: java.lang.Throwable -> L70
        goto L4
    L12:
        java.util.Iterator<java.lang.Integer> r6 = r11.iterator();
    L14:
        if (r6.hasNext() == false) goto L25;
        java.lang.Integer r7 = r6.next();
        java.lang.String r8 = r1.getResourceEntryName(r7.intValue());     // Catch: java.lang.Throwable -> L71
        java.lang.String[] r15 = r1.getStringArray(r7.intValue());     // Catch: java.lang.Throwable -> L71
        int r16 = 0;
    L18:
        if (r16 >= r15.length) goto L14;
        java.lang.String r17 = r15[r16];     // Catch: java.lang.Throwable -> L71
        java.lang.String r18 = r8 + ":" + r16;     // Catch: java.lang.Throwable -> L71
        if (r0.containsKey(r17) == true) goto L22;
    L23:
        r0.put(r17, r18);     // Catch: java.lang.Throwable -> L71
    L24:
        r16 = r16 + 1;
        goto L18
    L22:
        if (((java.lang.String) r0.get(r17)).length() <= r18.length()) goto L24;
    L25:
        java.util.Iterator<java.lang.Integer> r19 = r14.iterator();
    L27:
        if (r19.hasNext() == false) goto L40;
        java.lang.Integer r20 = r19.next();
        java.util.ArrayList r21 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L72
        java.util.ArrayList r22 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L72
        j6(r1, r20.intValue(), r21, r22);     // Catch: java.lang.Throwable -> L72
        java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> r23 = r21.iterator();     // Catch: java.lang.Throwable -> L72
    L31:
        if (r23.hasNext() == false) goto L33;
        android.util.Pair<java.lang.String, java.lang.String> r24 = r23.next();     // Catch: java.lang.Throwable -> L72
        r0.put((java.lang.CharSequence) r24.second, r24.first);     // Catch: java.lang.Throwable -> L72
        goto L31
    L33:
        java.util.Iterator<java.lang.String> r25 = r22.iterator();     // Catch: java.lang.Throwable -> L72
    L35:
        if (r25.hasNext() == false) goto L27;
        java.lang.String r26 = r25.next();     // Catch: java.lang.Throwable -> L72
        if (r0.containsKey(r26) == true) goto L35;
        r0.put(r26, DW(r26));     // Catch: java.lang.Throwable -> L72
        goto L35
    L40:
        java.util.Iterator<java.lang.Integer> r27 = r12.iterator();
    L42:
        if (r27.hasNext() == false) goto L51;
        java.lang.Integer r28 = r27.next();
        java.util.ArrayList r29 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L73
        j6(r1, r28.intValue(), r29);     // Catch: java.lang.Throwable -> L73
        java.util.Iterator<java.lang.String> r30 = r29.iterator();     // Catch: java.lang.Throwable -> L73
    L46:
        if (r30.hasNext() == false) goto L42;
        java.lang.String r31 = r30.next();     // Catch: java.lang.Throwable -> L73
        if (r0.containsKey(r31) == true) goto L46;
        r0.put(r31, DW(r31));     // Catch: java.lang.Throwable -> L73
    L51:
        java.util.Iterator<java.lang.Integer> r32 = r13.iterator();
    L53:
        if (r32.hasNext() == false) goto L62;
        java.lang.Integer r33 = r32.next();
        java.util.ArrayList r34 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L74
        DW(r1, r33.intValue(), r34);     // Catch: java.lang.Throwable -> L74
        java.util.Iterator<java.lang.String> r35 = r34.iterator();     // Catch: java.lang.Throwable -> L74
    L57:
        if (r35.hasNext() == false) goto L53;
        java.lang.String r36 = r35.next();     // Catch: java.lang.Throwable -> L74
        if (r0.containsKey(r36) == true) goto L57;
        r0.put(r36, DW(r36));     // Catch: java.lang.Throwable -> L74
    L62:
        java.util.Iterator<java.lang.String> r37 = r9.iterator();
    L64:
        if (r37.hasNext() == false) goto L68;
        java.lang.String r38 = r37.next();
        if (r0.containsKey(r38) == true) goto L64;
        r0.put(r38, DW(r38));
        goto L64
    L68:
        this.FH = r0;
        this.v5 = new java.util.HashMap();
        this.v5.putAll(this.FH);
        this.v5.putAll(this.Hw);
    }

    private void j6(android.content.res.Resources r3, int r4, java.util.List<java.lang.String> r5) {
        android.content.res.XmlResourceParser r6 = r3.getXml(r4);
        int r7 = r6.getEventType();
    L4:
        if (r7 == 1) goto L17;
        if (r7 != 2) goto L16;
        int r8 = 0;
    L9:
        if (r8 >= r6.getAttributeCount()) goto L16;
        if ("title".equals(r6.getAttributeName(r8)) == false) goto L15;
        java.lang.String r0 = r6.getAttributeValue(r8);
        if (r0.startsWith("@") == true) goto L15;
        r5.add(r0);
    L15:
        r8 = r8 + 1;
    L16:
        r7 = r6.next();
        goto L4
    }

    private void j6(android.content.res.Resources r9, int r10, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r11, java.util.List<java.lang.String> r12) {
        android.content.res.XmlResourceParser r13 = r9.getXml(r10);
        int r0 = r13.getEventType();
    L4:
        if (r0 == 1) goto L31;
        if (r0 != 2) goto L30;
        int r1 = 0;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
    L9:
        if (r1 >= r13.getAttributeCount()) goto L22;
        if ("key".equals(r13.getAttributeName(r1)) == false) goto L14;
        r3 = r13.getAttributeValue(r1);
    L21:
        r1 = r1 + 1;
        goto L9
    L14:
        if ("title".equals(r13.getAttributeName(r1)) == false) goto L18;
        r4 = r13.getAttributeValue(r1);
        if (r4.startsWith("@") == true) goto L21;
        r12.add(r4);
        goto L21
    L18:
        java.lang.String r5 = r13.getAttributeValue(r1);
        if (r5.startsWith("@") == true) goto L21;
        r12.add(r5);
        goto L21
    L22:
        if (r3 == null) goto L30;
        if (r4 == null) goto L30;
        if (r4.startsWith("@") == true) goto L33;
        r2 = r4;
    L29:
        r11.add(new android.util.Pair(r3, r2));
        goto L30
    L33:
        r2 = r9.getString(java.lang.Integer.parseInt(r4.substring(1)));     // Catch: java.lang.Throwable -> L32
    L30:
        r0 = r13.next();
        goto L4
    }

    private void j6(java.lang.String r6, java.util.List<java.lang.Integer> r7) {
        java.lang.reflect.Field[] r8 = java.lang.Class.forName(r6).getDeclaredFields();     // Catch: java.lang.Throwable -> L15
        int r0 = r8.length;     // Catch: java.lang.Throwable -> L15
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L24;
        java.lang.reflect.Field r2 = r8[r1];     // Catch: java.lang.Throwable -> L15
        if ((r2.getModifiers() & 8) == 0) goto L12;
        if (r2.getType() != java.lang.Integer.TYPE) goto L12;
        java.lang.Integer r3 = (java.lang.Integer) r2.get(null);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L15
        if (r3 == null) goto L12;
        r7.add(r3);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L15
    L12:
        r1 = r1 + 1;
        goto L3
    L24:
        return;
    }

    private void j6(java.lang.String r5, java.util.List<java.lang.Integer> r6, java.util.List<java.lang.Integer> r7, java.util.List<java.lang.Integer> r8, java.util.List<java.lang.Integer> r9, java.util.List<java.lang.Integer> r10, java.util.List<java.lang.String> r11) {
        java.io.DataInputStream r0 = new java.io.DataInputStream(new java.io.BufferedInputStream(abcd.wu.j6().getClassLoader().getResourceAsStream(r5)));     // Catch: java.lang.Throwable -> L22
        int r12 = r0.readInt();     // Catch: java.lang.Throwable -> L22
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r12) goto L5;
        r6.add(java.lang.Integer.valueOf(r0.readInt()));     // Catch: java.lang.Throwable -> L22
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L22
        goto L3
    L5:
        int r13 = r0.readInt();     // Catch: java.lang.Throwable -> L22
        int r14 = 0;
    L6:
        if (r14 >= r13) goto L8;
        r7.add(java.lang.Integer.valueOf(r0.readInt()));     // Catch: java.lang.Throwable -> L22
        r14 = r14 + 1;     // Catch: java.lang.Throwable -> L22
        goto L6
    L8:
        int r15 = r0.readInt();     // Catch: java.lang.Throwable -> L22
        int r16 = 0;
    L9:
        if (r16 >= r15) goto L11;
        r8.add(java.lang.Integer.valueOf(r0.readInt()));     // Catch: java.lang.Throwable -> L22
        r16 = r16 + 1;     // Catch: java.lang.Throwable -> L22
        goto L9
    L11:
        int r17 = r0.readInt();     // Catch: java.lang.Throwable -> L22
        int r18 = 0;
    L12:
        if (r18 >= r17) goto L14;
        r9.add(java.lang.Integer.valueOf(r0.readInt()));     // Catch: java.lang.Throwable -> L22
        r18 = r18 + 1;     // Catch: java.lang.Throwable -> L22
        goto L12
    L14:
        int r19 = r0.readInt();     // Catch: java.lang.Throwable -> L22
        int r20 = 0;
    L15:
        if (r20 >= r19) goto L17;
        r10.add(java.lang.Integer.valueOf(r0.readInt()));     // Catch: java.lang.Throwable -> L22
        r20 = r20 + 1;     // Catch: java.lang.Throwable -> L22
        goto L15
    L17:
        int r21 = r0.readInt();     // Catch: java.lang.Throwable -> L22
    L18:
        if (r1 >= r21) goto L20;
        r11.add(r0.readUTF());     // Catch: java.lang.Throwable -> L22
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L22
        goto L18
    L20:
        r0.close();     // Catch: java.lang.Throwable -> L22
        return;
    }

    public java.lang.String j6(java.lang.CharSequence r4) {
        if (r4 != null) goto L5;
    L23:
        return null;
    L5:
        if (r4.length() == 0) goto L23;
        java.util.HashMap<java.lang.CharSequence, java.lang.String> r1 = this.v5;
        if (r1 != null) goto L22;
        abcd.yw.j6("String resources", "getResourceName() before loading Strings");
        java.lang.Object r2 = this.Zo;
        monitor-enter(r2);
    L18:
        th = move-exception;
        throw th;
    L12:
        if (this.v5 != null) goto L16;
        java.lang.String r5 = this.v5.get(r4);     // Catch: java.lang.Throwable -> L18
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L18
        return r5;
    L16:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L18
        return null;
    L22:
        return r1.get(r4);
    }

    public void j6(java.util.List<java.lang.String> r4) {
        java.util.HashMap<java.lang.CharSequence, java.lang.String> r0 = new java.util.HashMap();
        java.util.Iterator<java.lang.String> r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L8;
        java.lang.String r1 = r5.next();
        if (r0.containsKey(r1) == true) goto L4;
        r0.put(r1, DW(r1));
        goto L4
    L8:
        this.Hw = r0;
        java.lang.Object r6 = this.Zo;
        monitor-enter(r6);
    L15:
        th = move-exception;
        throw th;
    L11:
        if (this.v5 == null) goto L13;
        this.v5 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L15
        this.v5.putAll(this.FH);     // Catch: java.lang.Throwable -> L15
        this.v5.putAll(this.Hw);     // Catch: java.lang.Throwable -> L15
    L13:
        monitor-exit(r6);     // Catch: java.lang.Throwable -> L15
    }
}
