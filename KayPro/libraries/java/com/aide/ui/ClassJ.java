package com.aide.ui;

@abcd.Interfacexu
public class ClassJ {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -5652961553150573432L)
    private boolean EQ;

    @abcd.Interfaceru(field = -2832650542100607144L)
    private com.aide.ui.AIDEEditor FH;

    @abcd.Interfaceru(field = 2693471842515329200L)
    private int Hw;

    @abcd.Interfaceru(field = -4781042169339541911L)
    private java.lang.String VH;

    @abcd.Interfaceru(field = -3574846839822133504L)
    private java.util.List<com.aide.engine.SourceEntity> Zo;

    @abcd.Interfaceru(field = -540488394973828531L)
    private boolean gn;

    @abcd.Interfaceru(field = -3314233803626850409L)
    private boolean tp;

    @abcd.Interfaceru(field = 2420112092779655064L)
    private boolean u7;

    @abcd.Interfaceru(field = 78590353586071168L)
    private int v5;

    @abcd.Interfacexu
    private class a extends android.widget.ArrayAdapter<com.aide.engine.SourceEntity> {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacevu
        final com.aide.ui.ClassJ FH;

        static {
            abcd.wu.j6(com.aide.ui.ClassJ.a.class, -1568526089479113304L, -1568526089479113304L);
        }

        @abcd.Interfacesu(method = 33955199291344128L)
        public a(com.aide.ui.ClassJ r9, android.content.Context r10, java.util.List<com.aide.engine.SourceEntity> r11) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -2063073478941615120L, null, r9, r10, r11);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-2063073478941615120L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        L5:
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
            super(r10, com.almlkaide.kaypro.R.layout.completion_list_entry, r11);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 4322290645157112875L)
        private void j6(android.widget.TextView r9, int r10, int r11) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -714438875286499328L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-714438875286499328L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
        L5:
            ((android.text.Spannable) r9.getText()).setSpan(new android.text.style.StyleSpan(1), r10, r11, 33);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 2903740456553979296L)
        private void j6(android.widget.TextView r10, int r11, int r12, int r13) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -3005756478013671907L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-3005756478013671907L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L7
        L5:
            ((android.text.Spannable) r10.getText()).setSpan(new android.text.style.ForegroundColorSpan(r13), r11, r12, 33);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
            if (r12 != null) goto L5;
            r12 = android.view.LayoutInflater.from(getContext()).inflate(com.almlkaide.kaypro.R.layout.completion_list_entry, r13, false);
        L5:
            com.aide.engine.SourceEntity r0 = (com.aide.engine.SourceEntity) getItem(r11);
            if (r0 != null) goto L9;
            ((android.widget.TextView) r12.findViewById(com.almlkaide.kaypro.R.id.completionEntryName)).setText("No matches");
            ((android.widget.ImageView) r12.findViewById(com.almlkaide.kaypro.R.id.completionEntryImage)).setImageResource(com.almlkaide.kaypro.R.drawable.browser_empty);
            r12.findViewById(com.almlkaide.kaypro.R.id.completionHelpButton).setVisibility(8);
        L8:
            return r12;
        L9:
            android.widget.TextView r1 = (android.widget.TextView) r12.findViewById(com.almlkaide.kaypro.R.id.completionEntryName);
            java.lang.CharSequence r2 = r0.we();
            int r3 = com.aide.ui.ClassH.j6[r0.EQ().ordinal()];
            if (r3 == 1) goto L13;
            if (r3 == 2) goto L13;
            if (r3 == 3) goto L13;
            if (r3 == 4) goto L29;
            if (r3 == 5) goto L27;
            r1.setText(r2);
        L16:
            android.widget.ImageView r4 = (android.widget.ImageView) r12.findViewById(com.almlkaide.kaypro.R.id.completionEntryImage);
            int r5 = com.aide.ui.ClassH.j6[r0.EQ().ordinal()];
            if (r5 == 1) goto L46;
            if (r5 == 2) goto L42;
            if (r5 != 3) goto L32;
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.box_blue);
        L21:
            r12.findViewById(com.almlkaide.kaypro.R.id.completionHelpButton).setVisibility(8);
            com.almlkaide.kaypro.aide.completion.CompletionAdapter.setView(this, r11, r12);
            goto L8
        L32:
            if (r5 == 4) goto L38;
            if (r5 == 6) goto L36;
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.browser_empty);
            goto L21
        L36:
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.pakage);
            goto L21
        L38:
            if (r0.XL() == false) goto L40;
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.objects_light);
            goto L21
        L40:
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.objects);
            goto L21
        L42:
            if (r0.XL() == false) goto L44;
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.box_light_blue);
            goto L21
        L44:
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.box_blue);
            goto L21
        L46:
            if (r0.XL() == false) goto L48;
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.box_light_red);
            goto L21
        L48:
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.box_red);
            goto L21
        L27:
            r1.setText(r2, android.widget.TextView.BufferType.SPANNABLE);
            j6(r1, 0, r2.length());
            goto L16
        L29:
            if (r0.j3() == false) goto L31;
            java.lang.String r6 = r2 + " - " + r0.Zo();
            r1.setText(r6, android.widget.TextView.BufferType.SPANNABLE);
            j6(r1, r2.length(), r6.length(), com.aide.ui.ClassJ.DW(this.FH).getResources().getColor(com.almlkaide.kaypro.R.color.browser_label_gray));
            goto L16
        L31:
            r1.setText(r2);
        L13:
            java.lang.String r7 = r0.J8();
            if (r7 == null) goto L22;
            java.lang.String r8 = r2 + r7;
            r1.setText(r8, android.widget.TextView.BufferType.SPANNABLE);
            j6(r1, r2.length(), r8.length(), com.aide.ui.ClassJ.DW(this.FH).getResources().getColor(com.almlkaide.kaypro.R.color.browser_label_gray));
            goto L16
        L22:
            r1.setText(r2);
            goto L16
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.ClassJ.class, 1778539205842150985L, 1778539205842150985L);
    }

    public ClassJ(com.aide.ui.AIDEEditor r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 7737924592516885760L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(7737924592516885760L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6;     // Catch: java.lang.Throwable -> L8
    }

    static com.aide.ui.AIDEEditor DW(com.aide.ui.ClassJ r0) {
        return r0.FH;
    }

    @abcd.Interfacesu(method = -3428009043176178720L)
    private java.util.List<com.aide.engine.SourceEntity> DW(java.util.List<com.aide.engine.SourceEntity> r8, java.lang.String r9) {
    L18:
        th = move-exception;
        java.lang.String r6 = r9;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -1353444063432894261L, this, r8, r6);
    L23:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1353444063432894261L, this, r8, r9);     // Catch: java.lang.Throwable -> L18
    L5:
        r9 = r9.toLowerCase();     // Catch: java.lang.Throwable -> L18
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L18
        java.util.Iterator<com.aide.engine.SourceEntity> r1 = r8.iterator();     // Catch: java.lang.Throwable -> L18
    L7:
        if (r1.hasNext() == false) goto L34;
        com.aide.engine.SourceEntity r2 = r1.next();     // Catch: java.lang.Throwable -> L18
        if (r2.we().toLowerCase().startsWith(r9) == false) goto L7;
        if (r2.aM() == true) goto L16;
        if (r2.j3() == true) goto L16;
        r0.add(r2);     // Catch: java.lang.Throwable -> L18
    L16:
        return new java.util.ArrayList();
    L34:
        return r0;
    }

    @abcd.Interfacesu(method = -1002478545253268460L)
    private void DW(boolean r7) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -1591481583156129719L, this, new java.lang.Boolean(r7));
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1591481583156129719L, this, r7);     // Catch: java.lang.Throwable -> L11
    L6:
        this.EQ = r7;     // Catch: java.lang.Throwable -> L11
        if (r7 == true) goto L9;
        com.aide.ui.U.lg().cb();     // Catch: java.lang.Throwable -> L11
    L9:
        we();     // Catch: java.lang.Throwable -> L11
        com.aide.ui.U.EQ().Hw(com.aide.ui.U.er().DW(), this.FH.getSelectionStartLine(), this.FH.getSelectionStartColumn());     // Catch: java.lang.Throwable -> L11
    }

    @abcd.Interfacesu(method = -1509278956635820656L)
    private boolean DW(char r5) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 63472143629197945L, this, new java.lang.Character(r5));
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(63472143629197945L, this, new java.lang.Character(r5));     // Catch: java.lang.Throwable -> L9
    L6:
        return !java.lang.Character.isJavaIdentifierPart(r5);
    }

    @abcd.Interfacesu(method = -2971266454539116081L)
    private int EQ() {
    L13:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 1373390264276291216L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1373390264276291216L, this);     // Catch: java.lang.Throwable -> L13
    L6:
        int r2 = this.v5;     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.FH.j6(this.Hw) < r2) goto L12;
        if (FH(this.FH.DW(this.Hw, r2)) == false) goto L12;
        r2 = r2 + 1;
    L12:
        return r2;
    }

    static int FH(com.aide.ui.ClassJ r0) {
        return r0.Hw;
    }

    @abcd.Interfacesu(method = -2413042739635111263L)
    private boolean FH(char r5) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 574497322721289668L, this, new java.lang.Character(r5));
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(574497322721289668L, this, new java.lang.Character(r5));     // Catch: java.lang.Throwable -> L14
    L6:
        if (java.lang.Character.isJavaIdentifierPart(r5) == false) goto L9;
    L12:
        return true;
    L9:
        if (r5 == '-') goto L12;
        return false;
    }

    static int Hw(com.aide.ui.ClassJ r0) {
        return r0.v5;
    }

    @abcd.Interfacesu(method = 4118886767565355753L)
    private void J0() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 4300892421111798980L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4300892421111798980L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.lang.String r2 = tp();     // Catch: java.lang.Throwable -> L12
        if (r2.equals(this.VH) == true) goto L19;
        com.aide.ui.views.CompletionListView r3 = j6(com.aide.ui.U.lg().U2());     // Catch: java.lang.Throwable -> L12
        j6(r3, r2);     // Catch: java.lang.Throwable -> L12
        if (r3.isFocusable() == false) goto L20;
        r3.requestFocus();     // Catch: java.lang.Throwable -> L12
        return;
    L20:
        return;
    }

    @abcd.Interfacesu(method = 1454320492785125847L)
    private boolean gn() {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 1964828127829413456L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1964828127829413456L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        int r2 = this.FH.getSelectionStartLine();     // Catch: java.lang.Throwable -> L16
        int r3 = this.FH.getSelectionStartColumn();     // Catch: java.lang.Throwable -> L16
        if (r3 != 1) goto L9;
        return false;
    L9:
        char r4 = this.FH.DW(r2, r3 - 1);     // Catch: java.lang.Throwable -> L16
        if (java.lang.Character.isJavaIdentifierPart(r4) == false) goto L13;
        return true;
    L13:
        if (r4 != '.') goto L15;
        return true;
    L15:
        return false;
    }

    @abcd.Interfacesu(method = 863861010935409564L)
    private com.aide.ui.views.CompletionListView j6(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 441579163270966813L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(441579163270966813L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (com.aide.ui.views.CompletionListView) r5.findViewById(com.almlkaide.kaypro.R.id.completionList);
    }

    @abcd.Interfacesu(method = 69925958253750724L)
    private java.lang.String j6(java.util.List<com.aide.engine.SourceEntity> r8, java.lang.String r9) {
    L23:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, -3743865833961913855L, this, r8, r9);
    L28:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3743865833961913855L, this, r8, r9);     // Catch: java.lang.Throwable -> L23
    L5:
        java.util.List<com.aide.engine.SourceEntity> r0 = DW(r8, r9);     // Catch: java.lang.Throwable -> L23
        java.lang.String r2 = "";
        if (r0.size() != 0) goto L10;
        return "";
    L10:
        if (r0.size() == 1) goto L12;
    L13:
        java.lang.String r1 = r0.get(0).Hw();     // Catch: java.lang.Throwable -> L23
        if (r1.length() <= r2.length()) goto L15;
        java.lang.String r3 = r2 + r1.charAt(r2.length());     // Catch: java.lang.Throwable -> L23
        java.util.Iterator<com.aide.engine.SourceEntity> r4 = r0.iterator();     // Catch: java.lang.Throwable -> L23
    L18:
        if (r4.hasNext() == false) goto L22;
        if (r4.next().Hw().startsWith(r3) == true) goto L18;
        return r2;
    L22:
        r2 = r3;
        goto L13
    L15:
        return r2;
    L12:
        return r0.get(0).Hw();
    }

    @abcd.Interfacesu(method = 911401024282837151L)
    private void j6(int r9, int r10, java.util.List<com.aide.engine.SourceEntity> r11) {
    L24:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, -1897839110393905520L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);
    L28:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1897839110393905520L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L24
    L6:
        if (Hw() == true) goto L8;
    L12:
        this.Hw = r9;     // Catch: java.lang.Throwable -> L24
        this.v5 = r10;     // Catch: java.lang.Throwable -> L24
        this.Zo = r11;     // Catch: java.lang.Throwable -> L24
        if (r9 == this.FH.getSelectionStartLine()) goto L15;
        return;
    L15:
        if (EQ() >= this.FH.getSelectionStartColumn()) goto L17;
        return;
    L17:
        if (r10 <= this.FH.getSelectionStartColumn()) goto L19;
        return;
    L19:
        if (this.EQ == false) goto L21;
    L22:
        j6(r11, this.EQ);     // Catch: java.lang.Throwable -> L24
        return;
    L21:
        if (u7() == false) goto L22;
        return;
    L8:
        if (this.Hw != r9) goto L12;
        if (this.v5 != r10) goto L12;
    }

    static void j6(com.aide.ui.ClassJ r0, int r1, int r2, java.util.List r3) {
        r0.j6(r1, r2, r3);
    }

    static void j6(com.aide.ui.ClassJ r0, java.lang.String r1) {
        r0.j6(r1);
    }

    @abcd.Interfacesu(method = 3747974994862056025L)
    private void j6(java.lang.String r12) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -4451080642503857496L, this, r12);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4451080642503857496L, this, r12);     // Catch: java.lang.Throwable -> L11
    L6:
        int r2 = r12.indexOf(124);     // Catch: java.lang.Throwable -> L11
        java.lang.String r13 = r12.replace("|", "");     // Catch: java.lang.Throwable -> L11
        this.FH.getKeyStrokeDetector().DW();     // Catch: java.lang.Throwable -> L11
        this.FH.j6(this.Hw, this.v5, this.Hw, EQ(), r13);     // Catch: java.lang.Throwable -> L11
        if (r2 <= 0) goto L9;
        int r3 = this.v5 + r2;     // Catch: java.lang.Throwable -> L11
        this.FH.j6(this.Hw, r3, this.Hw, r3);     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        this.FH.rN();     // Catch: java.lang.Throwable -> L11
    }

    @abcd.Interfacesu(method = 811612807211040375L)
    private void j6(java.util.List<com.aide.engine.SourceEntity> r10, boolean r11) {
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 1002154485141773872L, this, r10, new java.lang.Boolean(r11));
    L23:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1002154485141773872L, this, r10, new java.lang.Boolean(r11));     // Catch: java.lang.Throwable -> L19
    L5:
        com.aide.common.ClassH.j6("openPopup");     // Catch: java.lang.Throwable -> L19
        j6();     // Catch: java.lang.Throwable -> L19
        android.view.View r0 = android.view.LayoutInflater.from(this.FH.getContext()).inflate(com.almlkaide.kaypro.R.layout.completion_list, null);     // Catch: java.lang.Throwable -> L19
        com.aide.ui.views.CompletionListView r1 = j6(r0);     // Catch: java.lang.Throwable -> L19
        boolean r2 = j6(r1, tp());     // Catch: java.lang.Throwable -> L19
        if (r11 == false) goto L9;
        if (r2 == false) goto L9;
        return;
    L9:
        this.FH.getKeyStrokeDetector().DW();     // Catch: java.lang.Throwable -> L19
        r1.setKeyStrokeDetector(this.FH.getKeyStrokeDetector());     // Catch: java.lang.Throwable -> L19
        r1.setKeyStrokeHandler(this.FH.getKeyStrokeHandler());     // Catch: java.lang.Throwable -> L19
        r1.setOnKeyEventListener(new com.aide.ui.C1783e(this));     // Catch: java.lang.Throwable -> L19
        r1.setOnItemClickListener(new com.aide.ui.C1785f(this, r1));     // Catch: java.lang.Throwable -> L19
        r1.setOnItemLongClickListener(new com.aide.ui.ClassG(this, r1));     // Catch: java.lang.Throwable -> L19
        float r3 = this.FH.getContext().getResources().getDisplayMetrics().density;     // Catch: java.lang.Throwable -> L19
        android.graphics.Rect r4 = new android.graphics.Rect();     // Catch: java.lang.Throwable -> L19
        com.aide.common.ClassG.j6(this.FH.getContext(), r4);     // Catch: java.lang.Throwable -> L19
        int r5 = r4.right - r4.left;     // Catch: java.lang.Throwable -> L19
        int r6 = r4.bottom - r4.top;     // Catch: java.lang.Throwable -> L19
        int r7 = (int) java.lang.Math.min(java.lang.Math.max(500.0f * r3, r5 / 2), r5);     // Catch: java.lang.Throwable -> L19
        int r8 = (int) java.lang.Math.max(java.lang.Math.min(java.lang.Math.min(350.0f * r3, r6 / 2), r6 - (250.0f * r3)), r3 * 90.0f);     // Catch: java.lang.Throwable -> L19
        this.FH.j6(this.Hw, r8);     // Catch: java.lang.Throwable -> L19
        android.graphics.Rect r9 = this.FH.DW(this.Hw, this.v5, this.v5);     // Catch: java.lang.Throwable -> L19
        int r12 = r9.left;     // Catch: java.lang.Throwable -> L19
        int r13 = r9.bottom;     // Catch: java.lang.Throwable -> L19
        if ((r12 + r7) <= r4.right) goto L12;
        r12 = r4.right - r7;     // Catch: java.lang.Throwable -> L19
    L12:
        com.aide.ui.U.lg().j6(r0, new android.graphics.Rect(r12, r13, r7 + r12, r8 + r13));     // Catch: java.lang.Throwable -> L19
        if (this.FH.isInTouchMode() == false) goto L15;
    L17:
        r1.setFocusable(false);     // Catch: java.lang.Throwable -> L19
        return;
    L15:
        if (this.FH.gW() == true) goto L17;
        r1.requestFocus();     // Catch: java.lang.Throwable -> L19
    }

    @abcd.Interfacesu(method = -432374264741458647L)
    private boolean j6(char r7) {
    L36:
        th = move-exception;
        if (DW == false) goto L40;
        abcd.wu.j6(th, 4097289550606552L, this, new java.lang.Character(r7));
    L40:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(4097289550606552L, this, new java.lang.Character(r7));     // Catch: java.lang.Throwable -> L36
    L7:
        if (r7 != '<') goto L20;
        if (this.gn == false) goto L20;
        if (this.FH.getFilePath().toLowerCase().endsWith(".xml") == false) goto L13;
        return true;
    L13:
        if (this.FH.getFilePath().toLowerCase().endsWith(".html") == false) goto L15;
        return true;
    L15:
        if (this.FH.getFilePath().toLowerCase().endsWith(".htm") == true) goto L44;
        return false;
    L44:
        return true;
    L20:
        if (r7 != '-') goto L26;
        if (this.gn == false) goto L26;
        return this.FH.getFilePath().toLowerCase().endsWith(".css");
    L26:
        if (java.lang.Character.isJavaIdentifierStart(r7) == false) goto L30;
        if (this.gn == false) goto L30;
        return true;
    L30:
        if (r7 == '.') goto L32;
    L34:
        return false;
    L32:
        if (this.u7 == false) goto L34;
        return true;
    }

    @abcd.Interfacesu(method = -1508809856848994400L)
    private boolean j6(android.widget.ListView r8, java.lang.String r9) {
    L22:
        th = move-exception;
        if (DW == false) goto L27;
        abcd.wu.j6(th, 873159587748519123L, this, r8, r9);
    L27:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(873159587748519123L, this, r8, r9);     // Catch: java.lang.Throwable -> L22
    L5:
        this.VH = r9;     // Catch: java.lang.Throwable -> L22
        boolean r0 = false;
        java.lang.String r1 = r9.toLowerCase();     // Catch: java.lang.Throwable -> L22
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L22
        java.util.Iterator<com.aide.engine.SourceEntity> r3 = this.Zo.iterator();     // Catch: java.lang.Throwable -> L22
    L7:
        if (r3.hasNext() == false) goto L12;
        com.aide.engine.SourceEntity r4 = r3.next();     // Catch: java.lang.Throwable -> L22
        if (r4.we().toLowerCase().startsWith(r1) == false) goto L7;
        r2.add(r4);     // Catch: java.lang.Throwable -> L22
        goto L7
    L12:
        if (r2.size() != 0) goto L15;
        r0 = true;
        r2.add(null);     // Catch: java.lang.Throwable -> L22
    L15:
        if ((r8.getAdapter() instanceof com.aide.ui.ClassJ.a) == false) goto L20;
        com.aide.ui.ClassJ.a r5 = (com.aide.ui.ClassJ.a) r8.getAdapter();     // Catch: java.lang.Throwable -> L22
        r5.clear();     // Catch: java.lang.Throwable -> L22
        java.util.Iterator r6 = r2.iterator();     // Catch: java.lang.Throwable -> L22
    L18:
        if (r6.hasNext() == false) goto L21;
        r5.add((com.aide.engine.SourceEntity) r6.next());     // Catch: java.lang.Throwable -> L22
    L21:
        return r0;
    L20:
        r8.setAdapter(new com.aide.ui.ClassJ.a(this, this.FH.getContext(), r2));     // Catch: java.lang.Throwable -> L22
        goto L21
    }

    static boolean j6(com.aide.ui.ClassJ r0) {
        return r0.tp;
    }

    @abcd.Interfacesu(method = -643254966247657896L)
    private java.lang.String tp() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1364246645131059725L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1364246645131059725L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.j6(this.Hw, this.v5, EQ());
    }

    @abcd.Interfacesu(method = -1979988357863976776L)
    private boolean u7() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1025140882620136669L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1025140882620136669L, this);     // Catch: java.lang.Throwable -> L13
    L6:
        java.lang.String r2 = tp();     // Catch: java.lang.Throwable -> L13
        java.lang.String r3 = j6(this.Zo, r2);     // Catch: java.lang.Throwable -> L13
        if (r3.length() <= r2.length()) goto L11;
        j6(r3);     // Catch: java.lang.Throwable -> L13
        return true;
    L11:
        return false;
    }

    static int v5(com.aide.ui.ClassJ r0) {
        return r0.EQ();
    }

    @abcd.Interfacesu(method = 610487569617464139L)
    private void we() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6599028762746136180L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6599028762746136180L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.U.EQ().j6(new com.aide.ui.Binderd(this));     // Catch: java.lang.Throwable -> L8
    }

    public void DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -434871643898493165L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-434871643898493165L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.gn = com.aide.ui.aa.DW();     // Catch: java.lang.Throwable -> L8
        this.u7 = com.aide.ui.aa.j6();     // Catch: java.lang.Throwable -> L8
        this.tp = com.aide.ui.aa.FH();     // Catch: java.lang.Throwable -> L8
    }

    public boolean FH() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 38571571086806127L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(38571571086806127L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (com.aide.ui.U.lg().U2() == null) goto L11;
        if (j6(com.aide.ui.U.lg().U2()).hasFocus() == false) goto L11;
        return true;
    L11:
        return false;
    }

    public boolean Hw() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -1917561698186754595L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1917561698186754595L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (com.aide.ui.U.lg().U2() == null) goto L9;
        return true;
    L9:
        return false;
    }

    public void VH() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 1602086211576855413L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1602086211576855413L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (gn() == true) goto L9;
        this.FH.EQ();     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        Zo();     // Catch: java.lang.Throwable -> L11
    }

    public void Zo() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -792051887111398564L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-792051887111398564L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (Hw() == false) goto L9;
        u7();     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        DW(false);     // Catch: java.lang.Throwable -> L11
    }

    public void j6() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 1935236164486675773L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1935236164486675773L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (Hw() == false) goto L17;
        com.aide.ui.U.lg().FH();     // Catch: java.lang.Throwable -> L10
        this.FH.gn();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void j6(char r9, int r10, int r11) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -600591672365931615L, this, new java.lang.Character(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
    L17:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-600591672365931615L, this, new java.lang.Character(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L13
    L6:
        if (Hw() == false) goto L8;
        return;
    L8:
        if (j6(r9) == true) goto L10;
        return;
    L10:
        if (DW(this.FH.DW(r10, r11)) == false) goto L22;
        DW(true);     // Catch: java.lang.Throwable -> L13
        return;
    }

    public void j6(int r8, int r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 1428979700147795695L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(1428979700147795695L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L17
    L6:
        if (Hw() == false) goto L15;
        int r0 = EQ();     // Catch: java.lang.Throwable -> L17
        if (r8 == this.Hw) goto L10;
    L14:
        this.Zo = null;     // Catch: java.lang.Throwable -> L17
        j6();     // Catch: java.lang.Throwable -> L17
        return;
    L10:
        if (r9 < this.v5) goto L14;
        if (r9 > r0) goto L14;
        J0();     // Catch: java.lang.Throwable -> L17
        return;
    L15:
        this.Zo = null;     // Catch: java.lang.Throwable -> L17
    }

    public void j6(boolean r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 5836979571130542055L, this, new java.lang.Boolean(r5));
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5836979571130542055L, this, r5);     // Catch: java.lang.Throwable -> L13
    L6:
        if (r5 == false) goto L8;
        return;
    L8:
        if (Hw() == true) goto L10;
        return;
    L10:
        if (this.FH.isInTouchMode() == true) goto L22;
        com.aide.ui.views.CompletionListView r2 = j6(com.aide.ui.U.lg().U2());     // Catch: java.lang.Throwable -> L13
        r2.setFocusable(true);     // Catch: java.lang.Throwable -> L13
        r2.requestFocus();     // Catch: java.lang.Throwable -> L13
        return;
    }

    public void v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2766854075364593196L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2766854075364593196L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Zo = null;     // Catch: java.lang.Throwable -> L8
    }
}
