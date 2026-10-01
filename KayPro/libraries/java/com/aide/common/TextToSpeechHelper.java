package com.aide.common;

@abcd.Interfacexu
public class TextToSpeechHelper {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 3445112590347992115L)
    private android.content.Context FH;

    @abcd.Interfaceru(field = 1701760478262126189L)
    private java.util.Map<java.lang.String, com.aide.common.TextToSpeechHelper.a> Hw;

    @abcd.Interfaceru(field = -3905745841509773325L)
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> v5;

    @abcd.Interfacexu
    private class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -2177816589074634764L)
        private android.speech.tts.TextToSpeech FH;

        @abcd.Interfaceru(field = -2189389757736719797L)
        private java.lang.String Hw;

        @abcd.Interfaceru(field = -2483961860133187028L)
        private java.lang.String VH;

        @abcd.Interfaceru(field = 1292464115215474256L)
        private java.util.Locale Zo;

        @abcd.Interfacevu
        final com.aide.common.TextToSpeechHelper gn;

        @abcd.Interfaceru(field = 1294674476018111349L)
        private boolean v5;

        static {
            abcd.wu.j6(com.aide.common.TextToSpeechHelper.a.class, -2944515807282030800L, -2944515807282030800L);
        }

        @abcd.Interfacesu(method = -585832545934634169L)
        public a(com.aide.common.TextToSpeechHelper r8, java.lang.String r9) {
        L15:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -2833393010366731913L, null, r8, r9);
        L20:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-2833393010366731913L, null, r8, r9);     // Catch: java.lang.Throwable -> L15
        L5:
            this.gn = r8;     // Catch: java.lang.Throwable -> L15
            this.VH = r9;     // Catch: java.lang.Throwable -> L15
            java.util.Locale[] r0 = java.util.Locale.getAvailableLocales();     // Catch: java.lang.Throwable -> L15
            int r1 = r0.length;     // Catch: java.lang.Throwable -> L15
            int r2 = 0;
        L6:
            if (r2 >= r1) goto L12;
            java.util.Locale r3 = r0[r2];     // Catch: java.lang.Throwable -> L15
            if (this.VH.equals(r3.getLanguage()) == true) goto L9;
            r2 = r2 + 1;     // Catch: java.lang.Throwable -> L15
            goto L6
        L9:
            this.Zo = r3;     // Catch: java.lang.Throwable -> L15
        L12:
            if (this.Zo == null) goto L26;
            this.FH = new android.speech.tts.TextToSpeech(com.aide.common.TextToSpeechHelper.j6(r8), new com.aide.common.Ya(this, r8));     // Catch: java.lang.Throwable -> L15
            return;
        }

        @abcd.Interfacesu(method = -48786818803620856L)
        private java.lang.String DW(java.lang.String r12) {
        L15:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, 1006593349999101991L, this, r12);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1006593349999101991L, this, r12);     // Catch: java.lang.Throwable -> L15
        L6:
            java.lang.String r4 = r12.replace("&lt;", "<").replace("&gt;", ">").replace("&quot;", "");     // Catch: java.lang.Throwable -> L15
            java.util.Map r5 = (java.util.Map) com.aide.common.TextToSpeechHelper.DW(this.gn).get(this.VH);     // Catch: java.lang.Throwable -> L15
            if (r5 == null) goto L13;
            java.util.Iterator r6 = r5.entrySet().iterator();     // Catch: java.lang.Throwable -> L15
        L11:
            if (r6.hasNext() == false) goto L13;
            java.util.Map.Entry r8 = (java.util.Map.Entry) r6.next();     // Catch: java.lang.Throwable -> L15
            r4 = r4.replace("<b>" + ((java.lang.String) r8.getKey()) + "</b>", (java.lang.CharSequence) r8.getValue()).replace(" " + ((java.lang.String) r8.getKey()) + " ", (java.lang.CharSequence) r8.getValue());     // Catch: java.lang.Throwable -> L15
        L13:
            return FH(r4.replace("<b>a</b>", "A").replace("<b>b</b>", "B").replace("<b>c</b>", "C").replace("<b>i</b>", "I").replace("<b>j</b>", "J").replace("<b>k</b>", "K").replace("<b>android:", "<b>").replace("<i>", "").replace("</i>", "").replace("</b>", "").replace("<b>", ""));
        }

        static java.util.Locale DW(com.aide.common.TextToSpeechHelper.a r0) {
            return r0.Zo;
        }

        static java.lang.String FH(com.aide.common.TextToSpeechHelper.a r0) {
            return r0.Hw;
        }

        @abcd.Interfacesu(method = 6076223198010291095L)
        private java.lang.String FH(java.lang.String r8) {
        L19:
            th = move-exception;
            if (DW == false) goto L24;
            abcd.wu.j6(th, -477199594274528384L, this, r8);
        L24:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-477199594274528384L, this, r8);     // Catch: java.lang.Throwable -> L19
        L6:
            char[] r2 = r8.toCharArray();     // Catch: java.lang.Throwable -> L19
            int r4 = 1;
        L8:
            if (r4 >= (r2.length - 1)) goto L17;
            if (r2[r4] != '_') goto L16;
            if (java.lang.Character.isLetterOrDigit(r2[r4 - 1]) == false) goto L16;
            if (java.lang.Character.isLetterOrDigit(r2[r4 + 1]) == false) goto L16;
            r2[r4] = ' ';     // Catch: java.lang.Throwable -> L19
        L16:
            r4 = r4 + 1;     // Catch: java.lang.Throwable -> L19
            goto L8
        L17:
            return new java.lang.String(r2);
        }

        static android.speech.tts.TextToSpeech j6(com.aide.common.TextToSpeechHelper.a r0) {
            return r0.FH;
        }

        static android.speech.tts.TextToSpeech j6(com.aide.common.TextToSpeechHelper.a r0, android.speech.tts.TextToSpeech r1) {
            r0.FH = r1;
            return r1;
        }

        static java.lang.String j6(com.aide.common.TextToSpeechHelper.a r0, java.lang.String r1) {
            r0.Hw = r1;
            return r1;
        }

        static boolean j6(com.aide.common.TextToSpeechHelper.a r0, boolean r1) {
            r0.v5 = r1;
            return r1;
        }

        @abcd.Interfacesu(method = -1686615909586863748L)
        public void j6() {
        L10:
            th = move-exception;
            if (DW == false) goto L14;
            abcd.wu.j6(th, 84919936272638315L, this);
        L14:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(84919936272638315L, this);     // Catch: java.lang.Throwable -> L10
        L7:
            if (this.FH == null) goto L17;
            this.FH.shutdown();     // Catch: java.lang.Throwable -> L10
            return;
        }

        @abcd.Interfacesu(method = -62816912234531620L)
        public void j6(java.lang.String r7) {
        L13:
            th = move-exception;
            if (DW == false) goto L17;
            abcd.wu.j6(th, 831014455215831705L, this, r7);
        L17:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(831014455215831705L, this, r7);     // Catch: java.lang.Throwable -> L13
        L6:
            java.lang.String r2 = DW(r7);     // Catch: java.lang.Throwable -> L13
            if (this.v5 == true) goto L9;
        L11:
            this.Hw = r2;     // Catch: java.lang.Throwable -> L13
            return;
        L9:
            if (this.FH == null) goto L11;
            this.FH.speak(r2, 0, null);     // Catch: java.lang.Throwable -> L13
        }
    }

    static {
        abcd.wu.j6(com.aide.common.TextToSpeechHelper.class, -6458429244909686733L, -6458429244909686733L);
    }

    public TextToSpeechHelper(android.content.Context r20) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4211526794694350677L, null, r20);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4211526794694350677L, null, r20);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r20;     // Catch: java.lang.Throwable -> L8
        this.Hw = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        this.v5 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        this.v5.put("en", new java.util.HashMap());     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put("println", "printline");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put(";", "semicolon");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put("<", "less than");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put(">", "greater than");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put("< =", "less than or equal");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put("> =", "greater than or equal");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put("==", "equal equal");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put("!=", "not equal");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put("--", "minus minus");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put("++", "plus plus");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put("+", "plus");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put("-", "minus");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put("*", "star");     // Catch: java.lang.Throwable -> L8
        this.v5.get("en").put("/", "slash");     // Catch: java.lang.Throwable -> L8
        this.v5.put("de", new java.util.HashMap());     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put("println", "printlein");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put(";", "Strichpunkt");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put("<", "kleiner als");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put(">", "grösser als");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put("< =", "kleiner gleich");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put("> =", "grösser gleich");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put("==", "gleich gleich");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put("!=", "ungleich");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put("--", "minus minus");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put("++", "plus plus");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put("+", "plus");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put("-", "minus");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put("*", "Stern");     // Catch: java.lang.Throwable -> L8
        this.v5.get("de").put("/", "Strich");     // Catch: java.lang.Throwable -> L8
    }

    static java.util.Map DW(com.aide.common.TextToSpeechHelper r0) {
        return r0.v5;
    }

    static android.content.Context j6(com.aide.common.TextToSpeechHelper r0) {
        return r0.FH;
    }

    public void j6() {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1831168755087699348L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1831168755087699348L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.Iterator<com.aide.common.TextToSpeechHelper.a> r2 = this.Hw.values().iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r2.hasNext() == false) goto L11;
        r2.next().j6();     // Catch: java.lang.Throwable -> L12
        goto L7
    }

    public void j6(java.lang.String r8, java.lang.String r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -1401559566384212928L, this, r8, r9);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1401559566384212928L, this, r8, r9);     // Catch: java.lang.Throwable -> L10
    L6:
        if (this.Hw.containsKey(r8) == true) goto L8;
        this.Hw.put(r8, new com.aide.common.TextToSpeechHelper.a(this, r8));     // Catch: java.lang.Throwable -> L10
    L8:
        this.Hw.get(r8).j6(r9);     // Catch: java.lang.Throwable -> L10
    }
}
