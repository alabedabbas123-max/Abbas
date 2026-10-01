package abcd;

public class Dv {
    private static final java.lang.Object[] DW = null;
    private static final java.util.Map<java.lang.Character, java.lang.String> j6 = null;
    private java.util.HashMap<java.lang.CharSequence, java.lang.String> FH;
    private java.util.HashMap<java.lang.CharSequence, java.lang.String> Hw;
    private java.lang.Object Zo;
    private java.util.HashMap<java.lang.CharSequence, java.lang.String> v5;

    static {
        int r2 = 0;
        java.lang.Object[] r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    j6 = new java.util.HashMap();
                    r2 = 0;
                    DW = new java.lang.Object[]{'.', "dot", ':', "colon", ';', "semicolon", '/', "slash", '&', "and", '|', "or", '!', "exclamation", '?', "question", '%', "percentage", '+', "plus", '-', "minus", '*', "start"};
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r0 = DW;
                    if (r2 >= r0.length) { $pc0 = 6; continue $sw0; }
                    j6.put((java.lang.Character) r0[r2], (java.lang.String) r0[r2 + 1]);
                    r2 = r2 + 2;
                    { $pc0 = 3; continue $sw0; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public Dv() {
        this.FH = new java.util.HashMap();
        this.Hw = new java.util.HashMap();
        this.Zo = new java.lang.Object();
        new java.lang.Thread(new abcd.Cv(this)).start();
    }

    private java.lang.String DW(java.lang.String r7) {
        java.lang.StringBuffer r0 = null;
        int r1 = 0;
        int r2 = 0;
        char r3 = 0;
        java.lang.String r4 = null;
        java.lang.StringBuffer r5 = null;
        java.lang.String r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.lang.StringBuffer();
                    r1 = 0;
                    r2 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r2 >= r7.length()) { $pc1 = 14; continue $sw1; }
                    r3 = r7.charAt(r2);
                    if (java.lang.Character.isLetterOrDigit(r3) == false) { $pc1 = 9; continue $sw1; }
                    r0.append(java.lang.Character.toLowerCase(r3));
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r2 = r2 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 9: {
                    if (r0.length() <= 0) { $pc1 = 13; continue $sw1; }
                    if (r0.charAt(r0.length() - 1) == ' ') { $pc1 = 13; continue $sw1; }
                    r0.append(' ');
                    { $pc1 = 13; continue $sw1; }
                }
                case 14: {
                    r4 = r0.toString().trim();
                    if (r4.length() > 0) { $pc1 = 17; continue $sw1; }
                    r5 = new java.lang.StringBuffer();
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    if (r1 >= r7.length()) { $pc1 = 26; continue $sw1; }
                    r6 = j6.get(java.lang.Character.valueOf(r7.charAt(r1)));
                    if (r6 == null) { $pc1 = 24; continue $sw1; }
                    r5.append(r6);
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    r1 = r1 + 1;
                    { $pc1 = 20; continue $sw1; }
                }
                case 26: {
                    if (r5.length() > 0) { $pc1 = 28; continue $sw1; }
                    return "chars";
                }
                case 28: {
                    return r5.toString();
                }
                case 17: {
                    return r4.replace(' ', '_');
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void DW(abcd.Dv r0) {
        r0.j6();
    }

    private void DW(android.content.res.Resources r3, int r4, java.util.List<java.lang.String> r5) {
        android.content.res.XmlResourceParser r6 = null;
        int r7 = 0;
        int r8 = 0;
        java.lang.String r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r6 = r3.getLayout(r4);
                    r7 = r6.getEventType();
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r7 == 1) { $pc2 = 17; continue $sw2; }
                    if (r7 != 2) { $pc2 = 16; continue $sw2; }
                    r8 = 0;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (r8 >= r6.getAttributeCount()) { $pc2 = 16; continue $sw2; }
                    if ("text".equals(r6.getAttributeName(r8)) == false) { $pc2 = 15; continue $sw2; }
                    r0 = r6.getAttributeValue(r8);
                    if (r0.startsWith("@") == true) { $pc2 = 15; continue $sw2; }
                    r5.add(r0);
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    r8 = r8 + 1;
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    r7 = r6.next();
                    { $pc2 = 4; continue $sw2; }
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.Object j6(abcd.Dv r0) {
        return r0.Zo;
    }

    private java.lang.String j6(java.lang.String r5) {
        int r0 = 0;
        byte r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r5.hashCode();
                    if (r0 == (-354563693)) { $pc3 = 16; continue $sw3; }
                    if (r0 == 618612823) { $pc3 = 13; continue $sw3; }
                    if (r0 == 1236929197) { $pc3 = 10; continue $sw3; }
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    r1 = -1;
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    if (r1 == 0) { $pc3 = 25; continue $sw3; }
                    if (r1 == 1) { $pc3 = 23; continue $sw3; }
                    if (r1 == 2) { $pc3 = 27; continue $sw3; }
                    return r5;
                }
                case 27: {
                    return "more";
                }
                case 23: {
                    return "more";
                }
                case 25: {
                    return "up";
                }
                case 10: {
                    if (r5.equals("action_bar_up_description") == false) { $pc3 = 18; continue $sw3; }
                    r1 = 0;
                    { $pc3 = 19; continue $sw3; }
                }
                case 13: {
                    if (r5.equals("floating_toolbar_open_overflow_description") == false) { $pc3 = 18; continue $sw3; }
                    r1 = 1;
                    { $pc3 = 19; continue $sw3; }
                }
                case 16: {
                    if (r5.equals("abc_action_menu_overflow_description") == false) { $pc3 = 18; continue $sw3; }
                    r1 = 2;
                    { $pc3 = 19; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void j6() {
        java.util.HashMap<java.lang.CharSequence, java.lang.String> r0 = null;
        java.util.ArrayList r9 = null;
        java.util.ArrayList r10 = null;
        java.util.ArrayList r11 = null;
        java.util.ArrayList r12 = null;
        java.util.ArrayList r13 = null;
        java.util.ArrayList r14 = null;
        android.content.res.Resources r1 = null;
        java.util.Iterator<java.lang.Integer> r2 = null;
        java.lang.Integer r3 = null;
        java.lang.String r4 = null;
        java.lang.String r5 = null;
        java.util.Iterator<java.lang.Integer> r6 = null;
        java.lang.Integer r7 = null;
        java.lang.String r8 = null;
        java.lang.String[] r15 = null;
        int r16 = 0;
        java.lang.String r17 = null;
        java.lang.String r18 = null;
        java.util.Iterator<java.lang.Integer> r19 = null;
        java.lang.Integer r20 = null;
        java.util.ArrayList r21 = null;
        java.util.ArrayList r22 = null;
        java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> r23 = null;
        android.util.Pair<java.lang.String, java.lang.String> r24 = null;
        java.util.Iterator<java.lang.String> r25 = null;
        java.lang.String r26 = null;
        java.util.Iterator<java.lang.Integer> r27 = null;
        java.lang.Integer r28 = null;
        java.util.ArrayList r29 = null;
        java.util.Iterator<java.lang.String> r30 = null;
        java.lang.String r31 = null;
        java.util.Iterator<java.lang.Integer> r32 = null;
        java.lang.Integer r33 = null;
        java.util.ArrayList r34 = null;
        java.util.Iterator<java.lang.String> r35 = null;
        java.lang.String r36 = null;
        java.util.Iterator<java.lang.String> r37 = null;
        java.lang.String r38 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.util.HashMap();
                    r9 = new java.util.ArrayList();
                    r10 = new java.util.ArrayList();
                    r11 = new java.util.ArrayList();
                    r12 = new java.util.ArrayList();
                    r13 = new java.util.ArrayList();
                    r14 = new java.util.ArrayList();
                    j6("res.dat.jet", r10, r11, r14, r12, r13, r9);
                    j6("android.R$string", r10);
                    j6("com.android.internal.R$string", r10);
                    r1 = abcd.wu.j6().getResources();
                    r2 = r10.iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc4 = 12; continue $sw4; }
                    r3 = r2.next();
                    try {
                        r4 = r1.getString(r3.intValue());
                        r5 = j6(r1.getResourceEntryName(r3.intValue()));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 70; continue $sw4;
                    }
                    if (r0.containsKey(r4) == false) { $pc4 = 10; continue $sw4; }
                    if (((java.lang.String) r0.get(r4)).length() <= r5.length()) { $pc4 = 4; continue $sw4; }
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    try {
                        r0.put(r4, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 70; continue $sw4;
                    }
                    { $pc4 = 4; continue $sw4; }
                }
                case 12: {
                    r6 = r11.iterator();
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    if (r6.hasNext() == false) { $pc4 = 25; continue $sw4; }
                    r7 = r6.next();
                    try {
                        r8 = r1.getResourceEntryName(r7.intValue());
                        r15 = r1.getStringArray(r7.intValue());
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 71; continue $sw4;
                    }
                    r16 = 0;
                    $pc4 = 18; continue $sw4;
                }
                case 18: {
                    if (r16 >= r15.length) { $pc4 = 14; continue $sw4; }
                    try {
                        r17 = r15[r16];
                        r18 = r8 + ":" + r16;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 71; continue $sw4;
                    }
                    if (r0.containsKey(r17) == true) { $pc4 = 22; continue $sw4; }
                    $pc4 = 23; continue $sw4;
                }
                case 23: {
                    try {
                        r0.put(r17, r18);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 71; continue $sw4;
                    }
                    $pc4 = 24; continue $sw4;
                }
                case 24: {
                    r16 = r16 + 1;
                    { $pc4 = 18; continue $sw4; }
                }
                case 22: {
                    if (((java.lang.String) r0.get(r17)).length() <= r18.length()) { $pc4 = 24; continue $sw4; }
                    $pc4 = 25; continue $sw4;
                }
                case 25: {
                    r19 = r14.iterator();
                    $pc4 = 27; continue $sw4;
                }
                case 27: {
                    if (r19.hasNext() == false) { $pc4 = 40; continue $sw4; }
                    r20 = r19.next();
                    try {
                        r21 = new java.util.ArrayList();
                        r22 = new java.util.ArrayList();
                        j6(r1, r20.intValue(), r21, r22);
                        r23 = r21.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 72; continue $sw4;
                    }
                    $pc4 = 31; continue $sw4;
                }
                case 31: {
                    if (r23.hasNext() == false) { $pc4 = 33; continue $sw4; }
                    try {
                        r24 = r23.next();
                        r0.put((java.lang.CharSequence) r24.second, r24.first);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 72; continue $sw4;
                    }
                    { $pc4 = 31; continue $sw4; }
                }
                case 33: {
                    try {
                        r25 = r22.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 72; continue $sw4;
                    }
                    $pc4 = 35; continue $sw4;
                }
                case 35: {
                    if (r25.hasNext() == false) { $pc4 = 27; continue $sw4; }
                    try {
                        r26 = r25.next();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 72; continue $sw4;
                    }
                    if (r0.containsKey(r26) == true) { $pc4 = 35; continue $sw4; }
                    try {
                        r0.put(r26, DW(r26));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 72; continue $sw4;
                    }
                    { $pc4 = 35; continue $sw4; }
                }
                case 40: {
                    r27 = r12.iterator();
                    $pc4 = 42; continue $sw4;
                }
                case 42: {
                    if (r27.hasNext() == false) { $pc4 = 51; continue $sw4; }
                    r28 = r27.next();
                    try {
                        r29 = new java.util.ArrayList();
                        j6(r1, r28.intValue(), r29);
                        r30 = r29.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 73; continue $sw4;
                    }
                    $pc4 = 46; continue $sw4;
                }
                case 46: {
                    if (r30.hasNext() == false) { $pc4 = 42; continue $sw4; }
                    try {
                        r31 = r30.next();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 73; continue $sw4;
                    }
                    if (r0.containsKey(r31) == true) { $pc4 = 46; continue $sw4; }
                    try {
                        r0.put(r31, DW(r31));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 73; continue $sw4;
                    }
                    $pc4 = 51; continue $sw4;
                }
                case 51: {
                    r32 = r13.iterator();
                    $pc4 = 53; continue $sw4;
                }
                case 53: {
                    if (r32.hasNext() == false) { $pc4 = 62; continue $sw4; }
                    r33 = r32.next();
                    try {
                        r34 = new java.util.ArrayList();
                        DW(r1, r33.intValue(), r34);
                        r35 = r34.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 74; continue $sw4;
                    }
                    $pc4 = 57; continue $sw4;
                }
                case 57: {
                    if (r35.hasNext() == false) { $pc4 = 53; continue $sw4; }
                    try {
                        r36 = r35.next();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 74; continue $sw4;
                    }
                    if (r0.containsKey(r36) == true) { $pc4 = 57; continue $sw4; }
                    try {
                        r0.put(r36, DW(r36));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 74; continue $sw4;
                    }
                    $pc4 = 62; continue $sw4;
                }
                case 62: {
                    r37 = r9.iterator();
                    $pc4 = 64; continue $sw4;
                }
                case 64: {
                    if (r37.hasNext() == false) { $pc4 = 68; continue $sw4; }
                    r38 = r37.next();
                    if (r0.containsKey(r38) == true) { $pc4 = 64; continue $sw4; }
                    r0.put(r38, DW(r38));
                    { $pc4 = 64; continue $sw4; }
                }
                case 68: {
                    this.FH = r0;
                    this.v5 = new java.util.HashMap();
                    this.v5.putAll(this.FH);
                    this.v5.putAll(this.Hw);
                    $pc4 = 70; continue $sw4;
                }
                case 70: {
                    $pc4 = 71; continue $sw4;
                }
                case 71: {
                    $pc4 = 72; continue $sw4;
                }
                case 72: {
                    $pc4 = 73; continue $sw4;
                }
                case 73: {
                    $pc4 = 74; continue $sw4;
                }
                case 74: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(android.content.res.Resources r3, int r4, java.util.List<java.lang.String> r5) {
        android.content.res.XmlResourceParser r6 = null;
        int r7 = 0;
        int r8 = 0;
        java.lang.String r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r6 = r3.getXml(r4);
                    r7 = r6.getEventType();
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r7 == 1) { $pc5 = 17; continue $sw5; }
                    if (r7 != 2) { $pc5 = 16; continue $sw5; }
                    r8 = 0;
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    if (r8 >= r6.getAttributeCount()) { $pc5 = 16; continue $sw5; }
                    if ("title".equals(r6.getAttributeName(r8)) == false) { $pc5 = 15; continue $sw5; }
                    r0 = r6.getAttributeValue(r8);
                    if (r0.startsWith("@") == true) { $pc5 = 15; continue $sw5; }
                    r5.add(r0);
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    r8 = r8 + 1;
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    r7 = r6.next();
                    { $pc5 = 4; continue $sw5; }
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(android.content.res.Resources r9, int r10, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r11, java.util.List<java.lang.String> r12) {
        android.content.res.XmlResourceParser r13 = null;
        int r0 = 0;
        int r1 = 0;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        java.lang.String r5 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r13 = r9.getXml(r10);
                    r0 = r13.getEventType();
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r0 == 1) { $pc6 = 31; continue $sw6; }
                    if (r0 != 2) { $pc6 = 30; continue $sw6; }
                    r1 = 0;
                    r2 = null;
                    r3 = null;
                    r4 = null;
                    $pc6 = 9; continue $sw6;
                }
                case 9: {
                    if (r1 >= r13.getAttributeCount()) { $pc6 = 22; continue $sw6; }
                    if ("key".equals(r13.getAttributeName(r1)) == false) { $pc6 = 14; continue $sw6; }
                    r3 = r13.getAttributeValue(r1);
                    $pc6 = 21; continue $sw6;
                }
                case 21: {
                    r1 = r1 + 1;
                    { $pc6 = 9; continue $sw6; }
                }
                case 14: {
                    if ("title".equals(r13.getAttributeName(r1)) == false) { $pc6 = 18; continue $sw6; }
                    r4 = r13.getAttributeValue(r1);
                    if (r4.startsWith("@") == true) { $pc6 = 21; continue $sw6; }
                    r12.add(r4);
                    { $pc6 = 21; continue $sw6; }
                }
                case 18: {
                    r5 = r13.getAttributeValue(r1);
                    if (r5.startsWith("@") == true) { $pc6 = 21; continue $sw6; }
                    r12.add(r5);
                    { $pc6 = 21; continue $sw6; }
                }
                case 22: {
                    if (r3 == null) { $pc6 = 30; continue $sw6; }
                    if (r4 == null) { $pc6 = 30; continue $sw6; }
                    if (r4.startsWith("@") == true) { $pc6 = 33; continue $sw6; }
                    r2 = r4;
                    $pc6 = 29; continue $sw6;
                }
                case 29: {
                    r11.add(new android.util.Pair(r3, r2));
                    { $pc6 = 30; continue $sw6; }
                }
                case 33: {
                    try {
                        r2 = r9.getString(java.lang.Integer.parseInt(r4.substring(1)));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 32; continue $sw6;
                    }
                    $pc6 = 30; continue $sw6;
                }
                case 30: {
                    r0 = r13.next();
                    { $pc6 = 4; continue $sw6; }
                }
                case 31: {
                    $pc6 = 32; continue $sw6;
                }
                case 32: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.lang.String r6, java.util.List<java.lang.Integer> r7) {
        java.lang.reflect.Field[] r8 = null;
        int r0 = 0;
        int r1 = 0;
        java.lang.reflect.Field r2 = null;
        java.lang.Integer r3 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    try {
                        r8 = java.lang.Class.forName(r6).getDeclaredFields();
                        r0 = r8.length;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 15; continue $sw7;
                    }
                    r1 = 0;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    if (r1 >= r0) { $pc7 = 24; continue $sw7; }
                    try {
                        r2 = r8[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 15; continue $sw7;
                    }
                    if ((r2.getModifiers() & 8) == 0) { $pc7 = 12; continue $sw7; }
                    if (r2.getType() != java.lang.Integer.TYPE) { $pc7 = 12; continue $sw7; }
                    try {
                        r3 = (java.lang.Integer) r2.get(null);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Exception) { $pc7 = 14; continue $sw7; }
                        $pc7 = 15; continue $sw7;
                    }
                    if (r3 == null) { $pc7 = 12; continue $sw7; }
                    try {
                        r7.add(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Exception) { $pc7 = 14; continue $sw7; }
                        $pc7 = 15; continue $sw7;
                    }
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    r1 = r1 + 1;
                    { $pc7 = 3; continue $sw7; }
                }
                case 24: {
                    return;
                }
                case 14: {
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.lang.String r5, java.util.List<java.lang.Integer> r6, java.util.List<java.lang.Integer> r7, java.util.List<java.lang.Integer> r8, java.util.List<java.lang.Integer> r9, java.util.List<java.lang.Integer> r10, java.util.List<java.lang.String> r11) {
        java.io.DataInputStream r0 = null;
        int r12 = 0;
        int r1 = 0;
        int r2 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    try {
                        r0 = new java.io.DataInputStream(new java.io.BufferedInputStream(abcd.wu.j6().getClassLoader().getResourceAsStream(r5)));
                        r12 = r0.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    r1 = 0;
                    r2 = 0;
                    $pc8 = 3; continue $sw8;
                }
                case 3: {
                    if (r2 >= r12) { $pc8 = 5; continue $sw8; }
                    try {
                        r6.add(java.lang.Integer.valueOf(r0.readInt()));
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    { $pc8 = 3; continue $sw8; }
                }
                case 5: {
                    try {
                        r13 = r0.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    r14 = 0;
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    if (r14 >= r13) { $pc8 = 8; continue $sw8; }
                    try {
                        r7.add(java.lang.Integer.valueOf(r0.readInt()));
                        r14 = r14 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    { $pc8 = 6; continue $sw8; }
                }
                case 8: {
                    try {
                        r15 = r0.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    r16 = 0;
                    $pc8 = 9; continue $sw8;
                }
                case 9: {
                    if (r16 >= r15) { $pc8 = 11; continue $sw8; }
                    try {
                        r8.add(java.lang.Integer.valueOf(r0.readInt()));
                        r16 = r16 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    { $pc8 = 9; continue $sw8; }
                }
                case 11: {
                    try {
                        r17 = r0.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    r18 = 0;
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    if (r18 >= r17) { $pc8 = 14; continue $sw8; }
                    try {
                        r9.add(java.lang.Integer.valueOf(r0.readInt()));
                        r18 = r18 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    { $pc8 = 12; continue $sw8; }
                }
                case 14: {
                    try {
                        r19 = r0.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    r20 = 0;
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    if (r20 >= r19) { $pc8 = 17; continue $sw8; }
                    try {
                        r10.add(java.lang.Integer.valueOf(r0.readInt()));
                        r20 = r20 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    { $pc8 = 15; continue $sw8; }
                }
                case 17: {
                    try {
                        r21 = r0.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    $pc8 = 18; continue $sw8;
                }
                case 18: {
                    if (r1 >= r21) { $pc8 = 20; continue $sw8; }
                    try {
                        r11.add(r0.readUTF());
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    { $pc8 = 18; continue $sw8; }
                }
                case 20: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 22; continue $sw8;
                    }
                    return;
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String j6(java.lang.CharSequence r4) {
        java.util.HashMap<java.lang.CharSequence, java.lang.String> r1 = null;
        java.lang.Object r2 = null;
        java.lang.String r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r4 != null) { $pc9 = 5; continue $sw9; }
                    $pc9 = 23; continue $sw9;
                }
                case 23: {
                    return null;
                }
                case 5: {
                    if (r4.length() == 0) { $pc9 = 23; continue $sw9; }
                    r1 = this.v5;
                    if (r1 != null) { $pc9 = 22; continue $sw9; }
                    abcd.yw.j6("String resources", "getResourceName() before loading Strings");
                    r2 = this.Zo;
                    monitor-enter(r2);
                    $pc9 = 18; continue $sw9;
                }
                case 18: {
                    th = $ex9;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 12: {
                    if (this.v5 != null) { $pc9 = 16; continue $sw9; }
                    try {
                        r5 = this.v5.get(r4);
                        monitor-exit(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 18; continue $sw9;
                    }
                    return r5;
                }
                case 16: {
                    try {
                        monitor-exit(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 18; continue $sw9;
                    }
                    return null;
                }
                case 22: {
                    return r1.get(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.util.List<java.lang.String> r4) {
        java.util.HashMap<java.lang.CharSequence, java.lang.String> r0 = null;
        java.util.Iterator<java.lang.String> r5 = null;
        java.lang.String r1 = null;
        java.lang.Object r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = new java.util.HashMap();
                    r5 = r4.iterator();
                    $pc10 = 4; continue $sw10;
                }
                case 4: {
                    if (r5.hasNext() == false) { $pc10 = 8; continue $sw10; }
                    r1 = r5.next();
                    if (r0.containsKey(r1) == true) { $pc10 = 4; continue $sw10; }
                    r0.put(r1, DW(r1));
                    { $pc10 = 4; continue $sw10; }
                }
                case 8: {
                    this.Hw = r0;
                    r6 = this.Zo;
                    monitor-enter(r6);
                    $pc10 = 15; continue $sw10;
                }
                case 15: {
                    th = $ex10;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 11: {
                    if (this.v5 == null) { $pc10 = 13; continue $sw10; }
                    try {
                        this.v5 = new java.util.HashMap();
                        this.v5.putAll(this.FH);
                        this.v5.putAll(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 15; continue $sw10;
                    }
                    $pc10 = 13; continue $sw10;
                }
                case 13: {
                    try {
                        monitor-exit(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 15; continue $sw10;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
