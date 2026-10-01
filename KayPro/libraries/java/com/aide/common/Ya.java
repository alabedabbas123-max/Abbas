package com.aide.common;

@abcd.Interfacexu
class Ya implements android.speech.tts.TextToSpeech.OnInitListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.common.TextToSpeechHelper FH;
    final com.aide.common.TextToSpeechHelper.a Hw;

    static {
        abcd.wu.j6(com.aide.common.Ya.class, -2944515807282030800L, -1266471092915690825L);
    }

    Ya(com.aide.common.TextToSpeechHelper.a r1, com.aide.common.TextToSpeechHelper r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3267065918542404L)
    public void onInit(int r7) {
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 2033938504490093536L, this, new java.lang.Integer(r7));
    L23:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2033938504490093536L, this, r7);     // Catch: java.lang.Throwable -> L19
    L6:
        com.aide.common.TextToSpeechHelper.a.j6(this.Hw, true);     // Catch: java.lang.Throwable -> L19
        if (com.aide.common.TextToSpeechHelper.a.j6(this.Hw) != null) goto L9;
        return;
    L9:
        int r2 = com.aide.common.TextToSpeechHelper.a.j6(this.Hw).isLanguageAvailable(com.aide.common.TextToSpeechHelper.a.DW(this.Hw));     // Catch: java.lang.Throwable -> L19
        com.aide.common.ClassH.j6(com.aide.common.TextToSpeechHelper.a.DW(this.Hw) + " TTS available: " + r2);     // Catch: java.lang.Throwable -> L19
        if (r2 != (-1)) goto L13;
        com.aide.common.TextToSpeechHelper.a.j6(this.Hw).shutdown();     // Catch: java.lang.Throwable -> L19
        com.aide.common.TextToSpeechHelper.a.j6(this.Hw, null);     // Catch: java.lang.Throwable -> L19
        return;
    L13:
        if (r2 != (-2)) goto L15;
        com.aide.common.TextToSpeechHelper.a.j6(this.Hw).shutdown();     // Catch: java.lang.Throwable -> L19
        com.aide.common.TextToSpeechHelper.a.j6(this.Hw, null);     // Catch: java.lang.Throwable -> L19
        return;
    L15:
        com.aide.common.TextToSpeechHelper.a.j6(this.Hw).getDefaultEngine();     // Catch: java.lang.Throwable -> L19
        com.aide.common.TextToSpeechHelper.a.j6(this.Hw).setLanguage(com.aide.common.TextToSpeechHelper.a.DW(this.Hw));     // Catch: java.lang.Throwable -> L19
        if (com.aide.common.TextToSpeechHelper.a.FH(this.Hw) == null) goto L27;
        com.aide.common.TextToSpeechHelper.a.j6(this.Hw).speak(com.aide.common.TextToSpeechHelper.a.FH(this.Hw), 0, null);     // Catch: java.lang.Throwable -> L19
        com.aide.common.TextToSpeechHelper.a.j6(this.Hw, null);     // Catch: java.lang.Throwable -> L19
        return;
    }
}
