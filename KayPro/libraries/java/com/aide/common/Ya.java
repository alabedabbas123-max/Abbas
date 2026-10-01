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
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 19: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 23; continue $sw0; }
                    abcd.wu.j6(th, 2033938504490093536L, this, new java.lang.Integer(r7));
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2033938504490093536L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.common.TextToSpeechHelper.a.j6(this.Hw, true);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    if (com.aide.common.TextToSpeechHelper.a.j6(this.Hw) != null) { $pc0 = 9; continue $sw0; }
                    return;
                }
                case 9: {
                    try {
                        r2 = com.aide.common.TextToSpeechHelper.a.j6(this.Hw).isLanguageAvailable(com.aide.common.TextToSpeechHelper.a.DW(this.Hw));
                        com.aide.common.ClassH.j6(com.aide.common.TextToSpeechHelper.a.DW(this.Hw) + " TTS available: " + r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    if (r2 != (-1)) { $pc0 = 13; continue $sw0; }
                    try {
                        com.aide.common.TextToSpeechHelper.a.j6(this.Hw).shutdown();
                        com.aide.common.TextToSpeechHelper.a.j6(this.Hw, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    return;
                }
                case 13: {
                    if (r2 != (-2)) { $pc0 = 15; continue $sw0; }
                    try {
                        com.aide.common.TextToSpeechHelper.a.j6(this.Hw).shutdown();
                        com.aide.common.TextToSpeechHelper.a.j6(this.Hw, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    return;
                }
                case 15: {
                    try {
                        com.aide.common.TextToSpeechHelper.a.j6(this.Hw).getDefaultEngine();
                        com.aide.common.TextToSpeechHelper.a.j6(this.Hw).setLanguage(com.aide.common.TextToSpeechHelper.a.DW(this.Hw));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    if (com.aide.common.TextToSpeechHelper.a.FH(this.Hw) == null) { $pc0 = 27; continue $sw0; }
                    try {
                        com.aide.common.TextToSpeechHelper.a.j6(this.Hw).speak(com.aide.common.TextToSpeechHelper.a.FH(this.Hw), 0, null);
                        com.aide.common.TextToSpeechHelper.a.j6(this.Hw, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    return;
                }
                case 27: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
