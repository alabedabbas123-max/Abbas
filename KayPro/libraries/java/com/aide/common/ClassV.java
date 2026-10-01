package com.aide.common;

@abcd.Interfacexu
class ClassV extends android.view.inputmethod.BaseInputConnection {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.common.KeyStrokeDetector.a FH;
    final android.view.View Hw;

    @abcd.Interfacevu
    final com.aide.common.KeyStrokeDetector v5;

    static {
        abcd.wu.j6(com.aide.common.ClassV.class, -2626290547296404472L, -2013099164830855395L);
    }

    ClassV(com.aide.common.KeyStrokeDetector r1, android.view.View r2, boolean r3, com.aide.common.KeyStrokeDetector.a r4, android.view.View r5) {
        this.v5 = r1;
        this.FH = r4;
        this.Hw = r5;
        super(r2, r3);
    }

    @abcd.Interfacesu(method = 4585709381860276733L)
    private android.view.KeyEvent j6(android.view.KeyEvent r18) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 4277502395895486627L, this, r18);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(4277502395895486627L, this, r18);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return new android.view.KeyEvent(r18.getDownTime(), r18.getEventTime(), r18.getAction(), r18.getKeyCode(), r18.getRepeatCount(), r18.getMetaState(), r18.getDeviceId(), r18.getScanCode(), (r18.getFlags() | 4) | 2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -3111086357523556079L)
    private void j6(java.lang.CharSequence r9, boolean r10, android.view.View r11) {
        int r0 = 0;
        char r2 = 0;
        android.view.KeyEvent[] r3 = null;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 28: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 33; continue $sw1; }
                    abcd.wu.j6(th, -4237502881359362963L, this, r9, new java.lang.Boolean(r10), r11);
                    $pc1 = 33; continue $sw1;
                }
                case 33: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-4237502881359362963L, this, r9, new java.lang.Boolean(r10), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (com.aide.common.KeyStrokeDetector.v5(this.v5) != null) { $pc1 = 8; continue $sw1; }
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, android.view.KeyCharacterMap.load(0));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r0 = 0;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (r0 >= r9.length()) { $pc1 = 27; continue $sw1; }
                    try {
                        r2 = r9.charAt(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    if (r10 == false) { $pc1 = 14; continue $sw1; }
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    try {
                        r3 = com.aide.common.KeyStrokeDetector.v5(this.v5).getEvents(new char[]{r2});
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    if (r3 == null) { $pc1 = 26; continue $sw1; }
                    r4 = 0;
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    if (r4 >= r3.length) { $pc1 = 26; continue $sw1; }
                    try {
                        sendKeyEvent(r3[r4]);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    r4 = r4 + 1;
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    r0 = r0 + 1;
                    { $pc1 = 9; continue $sw1; }
                }
                case 14: {
                    if (com.aide.common.KeyStrokeDetector.FH(this.v5) == false) { $pc1 = 16; continue $sw1; }
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    try {
                        r2 = java.lang.Character.toUpperCase(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    { $pc1 = 19; continue $sw1; }
                }
                case 16: {
                    if (com.aide.common.KeyStrokeDetector.Hw(this.v5) == true) { $pc1 = 18; continue $sw1; }
                    try {
                        r2 = java.lang.Character.toLowerCase(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    { $pc1 = 19; continue $sw1; }
                }
                case 27: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 346108518799019928L)
    private void j6(java.lang.CharSequence r9, boolean r10, com.aide.common.KeyStrokeDetector.a r11) {
        int r1 = 0;
        char r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 21: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 26; continue $sw2; }
                    abcd.wu.j6(th, -6934689697821520352L, this, r9, new java.lang.Boolean(r10), r11);
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-6934689697821520352L, this, r9, new java.lang.Boolean(r10), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 21; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r1 = 0;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r1 >= r9.length()) { $pc2 = 20; continue $sw2; }
                    try {
                        r2 = r9.charAt(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 21; continue $sw2;
                    }
                    if (r10 == false) { $pc2 = 11; continue $sw2; }
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    try {
                        new char[1][0] = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 21; continue $sw2;
                    }
                    if (r11 == null) { $pc2 = 19; continue $sw2; }
                    try {
                        r11.j6(com.aide.common.KeyStrokeDetector.j6(this.v5, r2));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 21; continue $sw2;
                    }
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    r1 = r1 + 1;
                    { $pc2 = 6; continue $sw2; }
                }
                case 11: {
                    if (com.aide.common.KeyStrokeDetector.FH(this.v5) == false) { $pc2 = 13; continue $sw2; }
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    try {
                        r2 = java.lang.Character.toUpperCase(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 21; continue $sw2;
                    }
                    { $pc2 = 16; continue $sw2; }
                }
                case 13: {
                    if (com.aide.common.KeyStrokeDetector.Hw(this.v5) == true) { $pc2 = 15; continue $sw2; }
                    try {
                        r2 = java.lang.Character.toLowerCase(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 21; continue $sw2;
                    }
                    { $pc2 = 16; continue $sw2; }
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -3611404592854838895L)
    public boolean beginBatchEdit() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 7265854198767076129L, this);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(7265854198767076129L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, "beginBatchEdit");
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return super.beginBatchEdit();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean clearMetaKeyStates(int r2) {
        com.aide.common.KeyStrokeDetector.cl(this.v5);
        return true;
    }

    @Override
    @abcd.Interfacesu(method = -183686372098584087L)
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 1224781825711550013L, this, r5);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(1224781825711550013L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, "commitCompletion");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    return super.commitCompletion(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 5846150293253532864L)
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, 5189492810442102500L, this, r5);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(5189492810442102500L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, "commitCorrection");
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return super.commitCorrection(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 1340338115677659840L)
    public boolean commitText(java.lang.CharSequence r8, int r9) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 24: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 29; continue $sw6; }
                    abcd.wu.j6(th, -2642974788388129920L, this, r8, new java.lang.Integer(r9));
                    $pc6 = 29; continue $sw6;
                }
                case 29: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc6 = 5; continue $sw6; }
                    try {
                        abcd.wu.j6(-2642974788388129920L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, "commitText '" + r8 + "'");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    if (android.os.Build.VERSION.SDK_INT < 17) { $pc6 = 12; continue $sw6; }
                    r0 = 0;
                    $pc6 = 9; continue $sw6;
                }
                case 9: {
                    if (r0 >= com.aide.common.KeyStrokeDetector.j6(this.v5)) { $pc6 = 19; continue $sw6; }
                    try {
                        this.FH.j6(new com.aide.common.ClassU(67, false, false, false));
                        r0 = r0 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    $pc6 = 19; continue $sw6;
                }
                case 19: {
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    if ("\n".equals(r8.toString()) == false) { $pc6 = 22; continue $sw6; }
                    try {
                        j6(r8, com.aide.common.KeyStrokeDetector.DW(this.v5), this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    $pc6 = 23; continue $sw6;
                }
                case 23: {
                    return true;
                }
                case 22: {
                    try {
                        j6(r8, com.aide.common.KeyStrokeDetector.DW(this.v5), this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    { $pc6 = 23; continue $sw6; }
                }
                case 12: {
                    if (com.aide.common.KeyStrokeDetector.j6(this.v5) <= 0) { $pc6 = 19; continue $sw6; }
                    if (r8.length() != 1) { $pc6 = 19; continue $sw6; }
                    if (r8.charAt(0) != ' ') { $pc6 = 19; continue $sw6; }
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 24; continue $sw6;
                    }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -3253686564672011016L)
    public boolean deleteSurroundingText(int r8, int r9) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 10: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 15; continue $sw7; }
                    abcd.wu.j6(th, 965797526991327320L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 5; continue $sw7; }
                    try {
                        abcd.wu.j6(965797526991327320L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, "deleteSurroundingText " + r8 + " " + r9);
                        com.aide.common.KeyStrokeDetector.j6(this.v5, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    r0 = 0;
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (r0 >= r8) { $pc7 = 8; continue $sw7; }
                    try {
                        this.FH.j6(new com.aide.common.ClassU(67, false, false, false));
                        r0 = r0 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    { $pc7 = 6; continue $sw7; }
                }
                case 8: {
                    return super.deleteSurroundingText(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 1156390581903602577L)
    public boolean endBatchEdit() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, 6643356991668340141L, this);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(6643356991668340141L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, "endBatchEdit");
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    return super.endBatchEdit();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 513413195849519305L)
    public boolean finishComposingText() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, -3270805347746250765L, this);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(-3270805347746250765L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, "finishComposingText");
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    return super.finishComposingText();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest r3, int r4) {
        android.view.inputmethod.ExtractedText r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = new android.view.inputmethod.ExtractedText();
                    r0.selectionStart = 1;
                    r0.text = "Test";
                    r0.startOffset = 0;
                    if (((com.aide.ui.views.editor.OEditor) this.Hw).J2() == false) { $pc10 = 7; continue $sw10; }
                    r1 = 2;
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    r0.flags = r1;
                    r0.selectionEnd = r1;
                    return r0;
                }
                case 7: {
                    r1 = 1;
                    { $pc10 = 5; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 2036361913300655008L)
    public java.lang.CharSequence getTextBeforeCursor(int r8, int r9) {
        int r10 = 0;
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 14: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 19; continue $sw11; }
                    abcd.wu.j6(th, -312802086866956096L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc11 = 19; continue $sw11;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(-312802086866956096L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 14; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    if (com.aide.common.ClassG.J8(com.aide.common.KeyStrokeDetector.Zo(this.v5)) == true) { $pc11 = 8; continue $sw11; }
                    try {
                        r10 = java.lang.Math.min(r8, 1024);
                        r0 = new java.lang.StringBuilder(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 14; continue $sw11;
                    }
                    r1 = 0;
                    $pc11 = 10; continue $sw11;
                }
                case 10: {
                    if (r1 >= r10) { $pc11 = 13; continue $sw11; }
                    try {
                        r0.append(' ');
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 14; continue $sw11;
                    }
                    r1 = r1 + 1;
                    { $pc11 = 10; continue $sw11; }
                }
                case 13: {
                    return r0;
                }
                case 8: {
                    return super.getTextBeforeCursor(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean performContextMenuAction(int r7) {
        com.aide.ui.MainActivity r0 = null;
        abcd.Tl r5 = null;
        com.aide.ui.views.editor.OEditor r1 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    switch(r7) {
                        case 16908319: { $pc12 = 6; continue $sw12; }
                        case 16908320: { $pc12 = 11; continue $sw12; }
                        case 16908321: { $pc12 = 10; continue $sw12; }
                        case 16908322: { $pc12 = 5; continue $sw12; }
                        default: { $pc12 = 3; continue $sw12; }
                    };
                }
                case 3: {
                    return true;
                }
                case 5: {
                    ((com.aide.ui.views.editor.OEditor) this.Hw).yS();
                    return true;
                }
                case 6: {
                    r0 = com.aide.ui.U.lg();
                    if (r0 == null) { $pc12 = 16; continue $sw12; }
                    r0.cb();
                    r5 = r0.J8().getCurrentFileSpan();
                    com.aide.ui.U.EQ().FH(r5.FH, r5.Hw, r5.v5, r5.Zo, r5.VH);
                    return true;
                }
                case 16: {
                    return true;
                }
                case 10: {
                    r1 = (com.aide.ui.views.editor.OEditor) this.Hw;
                    r1.j3();
                    r1.setSelectionVisibility(false);
                    return true;
                }
                case 11: {
                    ((com.aide.ui.views.editor.OEditor) this.Hw).Mr();
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -7502005945741205925L)
    public boolean performEditorAction(int r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, 139026198659773467L, this, new java.lang.Integer(r6));
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(139026198659773467L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, "performEditorAction" + r6);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    return super.performEditorAction(r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -2782371035571558284L)
    public boolean sendKeyEvent(android.view.KeyEvent r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 8: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 12; continue $sw14; }
                    abcd.wu.j6(th, 908713890790193040L, this, r6);
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(908713890790193040L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, "sendKeyEvent " + r6.getKeyCode());
                        com.aide.common.KeyStrokeDetector.j6(this.v5, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    return super.sendKeyEvent(j6(r6));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -233507436939216056L)
    public boolean setComposingText(java.lang.CharSequence r8, int r9) {
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 3;
        $sw15: while (true) {
            switch ($pc15) {
                case 12: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 17; continue $sw15; }
                    abcd.wu.j6(th, 6849258625036790620L, this, r8, new java.lang.Integer(r9));
                    $pc15 = 17; continue $sw15;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc15 = 5; continue $sw15; }
                    try {
                        abcd.wu.j6(6849258625036790620L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 12; continue $sw15;
                    }
                    $pc15 = 5; continue $sw15;
                }
                case 5: {
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, "setComposingText '" + r8 + "'");
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 12; continue $sw15;
                    }
                    r1 = 0;
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (r1 >= com.aide.common.KeyStrokeDetector.j6(this.v5)) { $pc15 = 9; continue $sw15; }
                    try {
                        this.FH.j6(new com.aide.common.ClassU(67, false, false, false));
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 12; continue $sw15;
                    }
                    { $pc15 = 7; continue $sw15; }
                }
                case 9: {
                    try {
                        com.aide.common.KeyStrokeDetector.j6(this.v5, r8.length());
                        j6(r8, com.aide.common.KeyStrokeDetector.DW(this.v5), this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 12; continue $sw15;
                    }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
