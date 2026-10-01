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
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4277502395895486627L, this, r18);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4277502395895486627L, this, r18);     // Catch: java.lang.Throwable -> L8
    L6:
        return new android.view.KeyEvent(r18.getDownTime(), r18.getEventTime(), r18.getAction(), r18.getKeyCode(), r18.getRepeatCount(), r18.getMetaState(), r18.getDeviceId(), r18.getScanCode(), (r18.getFlags() | 4) | 2);
    }

    @abcd.Interfacesu(method = -3111086357523556079L)
    private void j6(java.lang.CharSequence r9, boolean r10, android.view.View r11) {
    L28:
        th = move-exception;
        if (DW == false) goto L33;
        abcd.wu.j6(th, -4237502881359362963L, this, r9, new java.lang.Boolean(r10), r11);
    L33:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4237502881359362963L, this, r9, new java.lang.Boolean(r10), r11);     // Catch: java.lang.Throwable -> L28
    L6:
        if (com.aide.common.KeyStrokeDetector.v5(this.v5) != null) goto L8;
        com.aide.common.KeyStrokeDetector.j6(this.v5, android.view.KeyCharacterMap.load(0));     // Catch: java.lang.Throwable -> L28
    L8:
        int r0 = 0;
    L9:
        if (r0 >= r9.length()) goto L27;
        char r2 = r9.charAt(r0);     // Catch: java.lang.Throwable -> L28
        if (r10 == false) goto L14;
    L19:
        android.view.KeyEvent[] r3 = com.aide.common.KeyStrokeDetector.v5(this.v5).getEvents(new char[]{r2});     // Catch: java.lang.Throwable -> L28
        if (r3 == null) goto L26;
        int r4 = 0;
    L23:
        if (r4 >= r3.length) goto L26;
        sendKeyEvent(r3[r4]);     // Catch: java.lang.Throwable -> L28
        r4 = r4 + 1;
    L26:
        r0 = r0 + 1;
        goto L9
    L14:
        if (com.aide.common.KeyStrokeDetector.FH(this.v5) == false) goto L16;
    L18:
        r2 = java.lang.Character.toUpperCase(r2);     // Catch: java.lang.Throwable -> L28
        goto L19
    L16:
        if (com.aide.common.KeyStrokeDetector.Hw(this.v5) == true) goto L18;
        r2 = java.lang.Character.toLowerCase(r2);     // Catch: java.lang.Throwable -> L28
        goto L19
    }

    @abcd.Interfacesu(method = 346108518799019928L)
    private void j6(java.lang.CharSequence r9, boolean r10, com.aide.common.KeyStrokeDetector.a r11) {
    L21:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, -6934689697821520352L, this, r9, new java.lang.Boolean(r10), r11);
    L26:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-6934689697821520352L, this, r9, new java.lang.Boolean(r10), r11);     // Catch: java.lang.Throwable -> L21
    L5:
        int r1 = 0;
    L6:
        if (r1 >= r9.length()) goto L20;
        char r2 = r9.charAt(r1);     // Catch: java.lang.Throwable -> L21
        if (r10 == false) goto L11;
    L16:
        new char[1][0] = r2;     // Catch: java.lang.Throwable -> L21
        if (r11 == null) goto L19;
        r11.j6(com.aide.common.KeyStrokeDetector.j6(this.v5, r2));     // Catch: java.lang.Throwable -> L21
    L19:
        r1 = r1 + 1;
        goto L6
    L11:
        if (com.aide.common.KeyStrokeDetector.FH(this.v5) == false) goto L13;
    L15:
        r2 = java.lang.Character.toUpperCase(r2);     // Catch: java.lang.Throwable -> L21
        goto L16
    L13:
        if (com.aide.common.KeyStrokeDetector.Hw(this.v5) == true) goto L15;
        r2 = java.lang.Character.toLowerCase(r2);     // Catch: java.lang.Throwable -> L21
        goto L16
    }

    @Override
    @abcd.Interfacesu(method = -3611404592854838895L)
    public boolean beginBatchEdit() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 7265854198767076129L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(7265854198767076129L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.KeyStrokeDetector.j6(this.v5, "beginBatchEdit");     // Catch: java.lang.Throwable -> L8
        return super.beginBatchEdit();
    }

    @Override
    public boolean clearMetaKeyStates(int r2) {
        com.aide.common.KeyStrokeDetector.cl(this.v5);
        return true;
    }

    @Override
    @abcd.Interfacesu(method = -183686372098584087L)
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1224781825711550013L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1224781825711550013L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.KeyStrokeDetector.j6(this.v5, "commitCompletion");     // Catch: java.lang.Throwable -> L8
        return super.commitCompletion(r5);
    }

    @Override
    @abcd.Interfacesu(method = 5846150293253532864L)
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5189492810442102500L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5189492810442102500L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.KeyStrokeDetector.j6(this.v5, "commitCorrection");     // Catch: java.lang.Throwable -> L8
        return super.commitCorrection(r5);
    }

    @Override
    @abcd.Interfacesu(method = 1340338115677659840L)
    public boolean commitText(java.lang.CharSequence r8, int r9) {
    L24:
        th = move-exception;
        if (DW == false) goto L29;
        abcd.wu.j6(th, -2642974788388129920L, this, r8, new java.lang.Integer(r9));
    L29:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2642974788388129920L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L24
    L5:
        com.aide.common.KeyStrokeDetector.j6(this.v5, "commitText '" + r8 + "'");     // Catch: java.lang.Throwable -> L24
        if (android.os.Build.VERSION.SDK_INT < 17) goto L12;
        int r0 = 0;
    L9:
        if (r0 >= com.aide.common.KeyStrokeDetector.j6(this.v5)) goto L19;
        this.FH.j6(new com.aide.common.ClassU(67, false, false, false));     // Catch: java.lang.Throwable -> L24
        r0 = r0 + 1;     // Catch: java.lang.Throwable -> L24
    L19:
        com.aide.common.KeyStrokeDetector.j6(this.v5, 0);     // Catch: java.lang.Throwable -> L24
        if ("\n".equals(r8.toString()) == false) goto L22;
        j6(r8, com.aide.common.KeyStrokeDetector.DW(this.v5), this.Hw);     // Catch: java.lang.Throwable -> L24
    L23:
        return true;
    L22:
        j6(r8, com.aide.common.KeyStrokeDetector.DW(this.v5), this.FH);     // Catch: java.lang.Throwable -> L24
        goto L23
    L12:
        if (com.aide.common.KeyStrokeDetector.j6(this.v5) <= 0) goto L19;
        if (r8.length() != 1) goto L19;
        if (r8.charAt(0) != ' ') goto L19;
        com.aide.common.KeyStrokeDetector.j6(this.v5, 0);     // Catch: java.lang.Throwable -> L24
        return true;
    }

    @Override
    @abcd.Interfacesu(method = -3253686564672011016L)
    public boolean deleteSurroundingText(int r8, int r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 965797526991327320L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(965797526991327320L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L10
    L5:
        com.aide.common.KeyStrokeDetector.j6(this.v5, "deleteSurroundingText " + r8 + " " + r9);     // Catch: java.lang.Throwable -> L10
        com.aide.common.KeyStrokeDetector.j6(this.v5, 0);     // Catch: java.lang.Throwable -> L10
        int r0 = 0;
    L6:
        if (r0 >= r8) goto L8;
        this.FH.j6(new com.aide.common.ClassU(67, false, false, false));     // Catch: java.lang.Throwable -> L10
        r0 = r0 + 1;     // Catch: java.lang.Throwable -> L10
        goto L6
    L8:
        return super.deleteSurroundingText(r8, r9);
    }

    @Override
    @abcd.Interfacesu(method = 1156390581903602577L)
    public boolean endBatchEdit() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6643356991668340141L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6643356991668340141L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.KeyStrokeDetector.j6(this.v5, "endBatchEdit");     // Catch: java.lang.Throwable -> L8
        return super.endBatchEdit();
    }

    @Override
    @abcd.Interfacesu(method = 513413195849519305L)
    public boolean finishComposingText() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3270805347746250765L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3270805347746250765L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.KeyStrokeDetector.j6(this.v5, "finishComposingText");     // Catch: java.lang.Throwable -> L8
        return super.finishComposingText();
    }

    @Override
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest r3, int r4) {
        android.view.inputmethod.ExtractedText r0 = new android.view.inputmethod.ExtractedText();
        r0.selectionStart = 1;
        r0.text = "Test";
        r0.startOffset = 0;
        if (((com.aide.ui.views.editor.OEditor) this.Hw).J2() == false) goto L7;
        int r1 = 2;
    L5:
        r0.flags = r1;
        r0.selectionEnd = r1;
        return r0;
    L7:
        r1 = 1;
        goto L5
    }

    @Override
    @abcd.Interfacesu(method = 2036361913300655008L)
    public java.lang.CharSequence getTextBeforeCursor(int r8, int r9) {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -312802086866956096L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L19:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-312802086866956096L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L14
    L6:
        if (com.aide.common.ClassG.J8(com.aide.common.KeyStrokeDetector.Zo(this.v5)) == true) goto L8;
        int r10 = java.lang.Math.min(r8, 1024);     // Catch: java.lang.Throwable -> L14
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(r10);     // Catch: java.lang.Throwable -> L14
        int r1 = 0;
    L10:
        if (r1 >= r10) goto L13;
        r0.append(' ');     // Catch: java.lang.Throwable -> L14
        r1 = r1 + 1;
        goto L10
    L13:
        return r0;
    L8:
        return super.getTextBeforeCursor(r8, r9);
    }

    @Override
    public boolean performContextMenuAction(int r7) {
        switch(r7) {
            case 16908319: goto L6;
            case 16908320: goto L11;
            case 16908321: goto L10;
            case 16908322: goto L5;
            default: goto L3;
        };
    L3:
        return true;
    L5:
        ((com.aide.ui.views.editor.OEditor) this.Hw).yS();
        return true;
    L6:
        com.aide.ui.MainActivity r0 = com.aide.ui.U.lg();
        if (r0 == null) goto L16;
        r0.cb();
        abcd.Tl r5 = r0.J8().getCurrentFileSpan();
        com.aide.ui.U.EQ().FH(r5.FH, r5.Hw, r5.v5, r5.Zo, r5.VH);
        return true;
    L16:
        return true;
    L10:
        com.aide.ui.views.editor.OEditor r1 = (com.aide.ui.views.editor.OEditor) this.Hw;
        r1.j3();
        r1.setSelectionVisibility(false);
        return true;
    L11:
        ((com.aide.ui.views.editor.OEditor) this.Hw).Mr();
        return true;
    }

    @Override
    @abcd.Interfacesu(method = -7502005945741205925L)
    public boolean performEditorAction(int r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 139026198659773467L, this, new java.lang.Integer(r6));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(139026198659773467L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.KeyStrokeDetector.j6(this.v5, "performEditorAction" + r6);     // Catch: java.lang.Throwable -> L8
        return super.performEditorAction(r6);
    }

    @Override
    @abcd.Interfacesu(method = -2782371035571558284L)
    public boolean sendKeyEvent(android.view.KeyEvent r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 908713890790193040L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(908713890790193040L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.KeyStrokeDetector.j6(this.v5, "sendKeyEvent " + r6.getKeyCode());     // Catch: java.lang.Throwable -> L8
        com.aide.common.KeyStrokeDetector.j6(this.v5, 0);     // Catch: java.lang.Throwable -> L8
        return super.sendKeyEvent(j6(r6));
    }

    @Override
    @abcd.Interfacesu(method = -233507436939216056L)
    public boolean setComposingText(java.lang.CharSequence r8, int r9) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 6849258625036790620L, this, r8, new java.lang.Integer(r9));
    L17:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6849258625036790620L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L12
    L5:
        com.aide.common.KeyStrokeDetector.j6(this.v5, "setComposingText '" + r8 + "'");     // Catch: java.lang.Throwable -> L12
        int r1 = 0;
    L7:
        if (r1 >= com.aide.common.KeyStrokeDetector.j6(this.v5)) goto L9;
        this.FH.j6(new com.aide.common.ClassU(67, false, false, false));     // Catch: java.lang.Throwable -> L12
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L12
        goto L7
    L9:
        com.aide.common.KeyStrokeDetector.j6(this.v5, r8.length());     // Catch: java.lang.Throwable -> L12
        j6(r8, com.aide.common.KeyStrokeDetector.DW(this.v5), this.FH);     // Catch: java.lang.Throwable -> L12
        return true;
    }
}
