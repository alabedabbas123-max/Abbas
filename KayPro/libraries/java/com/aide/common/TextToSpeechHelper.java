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
            java.util.Locale[] r0 = null;
            int r1 = 0;
            int r2 = 0;
            java.util.Locale r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 15: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 20; continue $sw0; }
                        abcd.wu.j6(th, -2833393010366731913L, null, r8, r9);
                        $pc0 = 20; continue $sw0;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc0 = 5; continue $sw0; }
                        try {
                            abcd.wu.j6(-2833393010366731913L, null, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 15; continue $sw0;
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        try {
                            this.gn = r8;
                            this.VH = r9;
                            r0 = java.util.Locale.getAvailableLocales();
                            r1 = r0.length;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 15; continue $sw0;
                        }
                        r2 = 0;
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        if (r2 >= r1) { $pc0 = 12; continue $sw0; }
                        try {
                            r3 = r0[r2];
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 15; continue $sw0;
                        }
                        if (this.VH.equals(r3.getLanguage()) == true) { $pc0 = 9; continue $sw0; }
                        try {
                            r2 = r2 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 15; continue $sw0;
                        }
                        { $pc0 = 6; continue $sw0; }
                    }
                    case 9: {
                        try {
                            this.Zo = r3;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 15; continue $sw0;
                        }
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        if (this.Zo == null) { $pc0 = 26; continue $sw0; }
                        try {
                            this.FH = new android.speech.tts.TextToSpeech(com.aide.common.TextToSpeechHelper.j6(r8), new com.aide.common.Ya(this, r8));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 15; continue $sw0;
                        }
                        return;
                    }
                    case 26: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -48786818803620856L)
        private java.lang.String DW(java.lang.String r12) {
            java.lang.String r4 = null;
            java.util.Map r5 = null;
            java.util.Iterator r6 = null;
            java.util.Map.Entry r8 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 4;
            $sw1: while (true) {
                switch ($pc1) {
                    case 15: {
                        th = $ex1;
                        if (DW == false) { $pc1 = 20; continue $sw1; }
                        abcd.wu.j6(th, 1006593349999101991L, this, r12);
                        $pc1 = 20; continue $sw1;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc1 = 6; continue $sw1; }
                        try {
                            abcd.wu.j6(1006593349999101991L, this, r12);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 15; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        try {
                            r4 = r12.replace("&lt;", "<").replace("&gt;", ">").replace("&quot;", "");
                            r5 = (java.util.Map) com.aide.common.TextToSpeechHelper.DW(this.gn).get(this.VH);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 15; continue $sw1;
                        }
                        if (r5 == null) { $pc1 = 13; continue $sw1; }
                        try {
                            r6 = r5.entrySet().iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 15; continue $sw1;
                        }
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        if (r6.hasNext() == false) { $pc1 = 13; continue $sw1; }
                        try {
                            r8 = (java.util.Map.Entry) r6.next();
                            r4 = r4.replace("<b>" + ((java.lang.String) r8.getKey()) + "</b>", (java.lang.CharSequence) r8.getValue()).replace(" " + ((java.lang.String) r8.getKey()) + " ", (java.lang.CharSequence) r8.getValue());
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 15; continue $sw1;
                        }
                        $pc1 = 13; continue $sw1;
                    }
                    case 13: {
                        return FH(r4.replace("<b>a</b>", "A").replace("<b>b</b>", "B").replace("<b>c</b>", "C").replace("<b>i</b>", "I").replace("<b>j</b>", "J").replace("<b>k</b>", "K").replace("<b>android:", "<b>").replace("<i>", "").replace("</i>", "").replace("</b>", "").replace("<b>", ""));
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static java.util.Locale DW(com.aide.common.TextToSpeechHelper.a r0) {
            return r0.Zo;
        }

        static java.lang.String FH(com.aide.common.TextToSpeechHelper.a r0) {
            return r0.Hw;
        }

        @abcd.Interfacesu(method = 6076223198010291095L)
        private java.lang.String FH(java.lang.String r8) {
            char[] r2 = null;
            int r4 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 4;
            $sw2: while (true) {
                switch ($pc2) {
                    case 19: {
                        th = $ex2;
                        if (DW == false) { $pc2 = 24; continue $sw2; }
                        abcd.wu.j6(th, -477199594274528384L, this, r8);
                        $pc2 = 24; continue $sw2;
                    }
                    case 24: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc2 = 6; continue $sw2; }
                        try {
                            abcd.wu.j6(-477199594274528384L, this, r8);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 19; continue $sw2;
                        }
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        try {
                            r2 = r8.toCharArray();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 19; continue $sw2;
                        }
                        r4 = 1;
                        $pc2 = 8; continue $sw2;
                    }
                    case 8: {
                        if (r4 >= (r2.length - 1)) { $pc2 = 17; continue $sw2; }
                        if (r2[r4] != '_') { $pc2 = 16; continue $sw2; }
                        if (java.lang.Character.isLetterOrDigit(r2[r4 - 1]) == false) { $pc2 = 16; continue $sw2; }
                        if (java.lang.Character.isLetterOrDigit(r2[r4 + 1]) == false) { $pc2 = 16; continue $sw2; }
                        try {
                            r2[r4] = ' ';
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 19; continue $sw2;
                        }
                        $pc2 = 16; continue $sw2;
                    }
                    case 16: {
                        try {
                            r4 = r4 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 19; continue $sw2;
                        }
                        { $pc2 = 8; continue $sw2; }
                    }
                    case 17: {
                        return new java.lang.String(r2);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 4;
            $sw3: while (true) {
                switch ($pc3) {
                    case 10: {
                        th = $ex3;
                        if (DW == false) { $pc3 = 14; continue $sw3; }
                        abcd.wu.j6(th, 84919936272638315L, this);
                        $pc3 = 14; continue $sw3;
                    }
                    case 14: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc3 = 7; continue $sw3; }
                        try {
                            abcd.wu.j6(84919936272638315L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 10; continue $sw3;
                        }
                        $pc3 = 7; continue $sw3;
                    }
                    case 7: {
                        if (this.FH == null) { $pc3 = 17; continue $sw3; }
                        try {
                            this.FH.shutdown();
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 10; continue $sw3;
                        }
                        return;
                    }
                    case 17: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -62816912234531620L)
        public void j6(java.lang.String r7) {
            java.lang.String r2 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 4;
            $sw4: while (true) {
                switch ($pc4) {
                    case 13: {
                        th = $ex4;
                        if (DW == false) { $pc4 = 17; continue $sw4; }
                        abcd.wu.j6(th, 831014455215831705L, this, r7);
                        $pc4 = 17; continue $sw4;
                    }
                    case 17: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc4 = 6; continue $sw4; }
                        try {
                            abcd.wu.j6(831014455215831705L, this, r7);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 13; continue $sw4;
                        }
                        $pc4 = 6; continue $sw4;
                    }
                    case 6: {
                        try {
                            r2 = DW(r7);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 13; continue $sw4;
                        }
                        if (this.v5 == true) { $pc4 = 9; continue $sw4; }
                        $pc4 = 11; continue $sw4;
                    }
                    case 11: {
                        try {
                            this.Hw = r2;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 13; continue $sw4;
                        }
                        return;
                    }
                    case 9: {
                        if (this.FH == null) { $pc4 = 11; continue $sw4; }
                        try {
                            this.FH.speak(r2, 0, null);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 13; continue $sw4;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        abcd.wu.j6(com.aide.common.TextToSpeechHelper.class, -6458429244909686733L, -6458429244909686733L);
    }

    public TextToSpeechHelper(android.content.Context r20) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -4211526794694350677L, null, r20);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-4211526794694350677L, null, r20);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        this.FH = r20;
                        this.Hw = new java.util.HashMap();
                        this.v5 = new java.util.HashMap();
                        this.v5.put("en", new java.util.HashMap());
                        this.v5.get("en").put("println", "printline");
                        this.v5.get("en").put(";", "semicolon");
                        this.v5.get("en").put("<", "less than");
                        this.v5.get("en").put(">", "greater than");
                        this.v5.get("en").put("< =", "less than or equal");
                        this.v5.get("en").put("> =", "greater than or equal");
                        this.v5.get("en").put("==", "equal equal");
                        this.v5.get("en").put("!=", "not equal");
                        this.v5.get("en").put("--", "minus minus");
                        this.v5.get("en").put("++", "plus plus");
                        this.v5.get("en").put("+", "plus");
                        this.v5.get("en").put("-", "minus");
                        this.v5.get("en").put("*", "star");
                        this.v5.get("en").put("/", "slash");
                        this.v5.put("de", new java.util.HashMap());
                        this.v5.get("de").put("println", "printlein");
                        this.v5.get("de").put(";", "Strichpunkt");
                        this.v5.get("de").put("<", "kleiner als");
                        this.v5.get("de").put(">", "grösser als");
                        this.v5.get("de").put("< =", "kleiner gleich");
                        this.v5.get("de").put("> =", "grösser gleich");
                        this.v5.get("de").put("==", "gleich gleich");
                        this.v5.get("de").put("!=", "ungleich");
                        this.v5.get("de").put("--", "minus minus");
                        this.v5.get("de").put("++", "plus plus");
                        this.v5.get("de").put("+", "plus");
                        this.v5.get("de").put("-", "minus");
                        this.v5.get("de").put("*", "Stern");
                        this.v5.get("de").put("/", "Strich");
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.util.Map DW(com.aide.common.TextToSpeechHelper r0) {
        return r0.v5;
    }

    static android.content.Context j6(com.aide.common.TextToSpeechHelper r0) {
        return r0.FH;
    }

    public void j6() {
        java.util.Iterator<com.aide.common.TextToSpeechHelper.a> r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 12: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 17; continue $sw6; }
                    abcd.wu.j6(th, -1831168755087699348L, this);
                    $pc6 = 17; continue $sw6;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-1831168755087699348L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 12; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        r2 = this.Hw.values().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 12; continue $sw6;
                    }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc6 = 11; continue $sw6; }
                    try {
                        r2.next().j6();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 12; continue $sw6;
                    }
                    { $pc6 = 7; continue $sw6; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r8, java.lang.String r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 10: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 14; continue $sw7; }
                    abcd.wu.j6(th, -1401559566384212928L, this, r8, r9);
                    $pc7 = 14; continue $sw7;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-1401559566384212928L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (this.Hw.containsKey(r8) == true) { $pc7 = 8; continue $sw7; }
                    try {
                        this.Hw.put(r8, new com.aide.common.TextToSpeechHelper.a(this, r8));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    try {
                        this.Hw.get(r8).j6(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
