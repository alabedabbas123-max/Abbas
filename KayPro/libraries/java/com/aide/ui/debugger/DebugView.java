package com.aide.ui.debugger;

@abcd.Interfacexu
public class DebugView extends android.widget.LinearLayout {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -64744109641752525L)
    private com.aide.ui.debugger.DebugView.b FH;

    @abcd.Interfaceru(field = -141039651228240960L)
    private java.lang.String Hw;

    @abcd.Interfacexu
    private static class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 4068614801744414784L)
        public com.aide.ui.debugger.Debugger.c FH;

        @abcd.Interfaceru(field = -4057768937929765185L)
        public com.aide.ui.debugger.Debugger.a Hw;

        @abcd.Interfaceru(field = 2247460861468773237L)
        public java.lang.String Zo;

        @abcd.Interfaceru(field = 3074579612396885585L)
        public com.aide.ui.debugger.Debugger.b v5;

        static {
            abcd.wu.j6(com.aide.ui.debugger.DebugView.a.class, 3506681731253427192L, 3506681731253427192L);
        }

        @abcd.Interfacesu(method = -140349732819721425L)
        public a(com.aide.ui.debugger.Debugger.a r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1237896186387844608L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1237896186387844608L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.Hw = r6;     // Catch: java.lang.Throwable -> L8
        }

        @abcd.Interfacesu(method = -566664510410023437L)
        public a(com.aide.ui.debugger.Debugger.b r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 788640106707373120L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(788640106707373120L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.v5 = r6;     // Catch: java.lang.Throwable -> L8
        }

        @abcd.Interfacesu(method = -8146590630258916L)
        public a(com.aide.ui.debugger.Debugger.c r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -3484393909475688715L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-3484393909475688715L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH = r6;     // Catch: java.lang.Throwable -> L8
        }

        @abcd.Interfacesu(method = 342695703487469319L)
        public a(java.lang.String r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -3460996985385896896L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-3460996985385896896L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.Zo = r6;     // Catch: java.lang.Throwable -> L8
        }
    }

    @abcd.Interfacexu
    private class b extends com.aide.common.Abstractx<com.aide.ui.debugger.DebugView.a> {

        @abcd.Interfacetu
        private static boolean Hw;

        @abcd.Interfaceuu
        private static boolean v5;

        @abcd.Interfacevu
        final com.aide.ui.debugger.DebugView Zo;

        static {
            abcd.wu.j6(com.aide.ui.debugger.DebugView.b.class, 702258453584613601L, 702258453584613601L);
        }

        @abcd.Interfacesu(method = 257970821288412981L)
        private b(com.aide.ui.debugger.DebugView r6) {
        L8:
            th = move-exception;
            if (v5 == false) goto L12;
            abcd.wu.j6(th, 1589054138625028192L, null, r6);
        L12:
            throw th;
        L4:
            if (Hw == false) goto L6;
            abcd.wu.j6(1589054138625028192L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.Zo = r6;     // Catch: java.lang.Throwable -> L8
        }

        b(com.aide.ui.debugger.DebugView r8, com.aide.ui.debugger.b r9) {
        L7:
            th = move-exception;
            if (v5 == false) goto L11;
            abcd.wu.j6(th, 957809086877593955L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (Hw == false) goto L5;
            abcd.wu.j6(957809086877593955L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = 1838905534557894393L)
        public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        L39:
            th = move-exception;
            if (v5 == false) goto L43;
            abcd.wu.j6(th, 426704612673496020L, this, new java.lang.Integer(r12), r13, r14);
        L43:
            throw th;
        L3:
            if (Hw == false) goto L6;
            abcd.wu.j6(426704612673496020L, this, new java.lang.Integer(r12), r13, r14);     // Catch: java.lang.Throwable -> L39
        L6:
            if (r13 != null) goto L8;
            android.view.View r1 = android.view.LayoutInflater.from(this.Zo.getContext()).inflate(com.almlkaide.kaypro.R.layout.debugger_view_entry, r14, false);     // Catch: java.lang.Throwable -> L39
        L9:
            com.aide.ui.debugger.DebugView.a r2 = j6(r12);     // Catch: java.lang.Throwable -> L39
            android.widget.TextView r3 = (android.widget.TextView) r1.findViewById(com.almlkaide.kaypro.R.id.debuggerEntryName);     // Catch: java.lang.Throwable -> L39
            android.widget.ImageView r4 = (android.widget.ImageView) r1.findViewById(com.almlkaide.kaypro.R.id.debuggerEntryImage);     // Catch: java.lang.Throwable -> L39
            if (r2.FH == null) goto L27;
            java.lang.String r0 = r2.FH.FH;     // Catch: java.lang.Throwable -> L39
            if (r2.FH.Hw.length() <= 0) goto L15;
            java.lang.String r5 = r0 + " = " + r2.FH.Hw;     // Catch: java.lang.Throwable -> L39
        L16:
            r3.setText(r5.replace(" ", " "), android.widget.TextView.BufferType.SPANNABLE);     // Catch: java.lang.Throwable -> L39
            com.aide.ui.debugger.DebugView.j6(r3, r0.length(), r5.length(), this.Zo.getResources().getColor(com.almlkaide.kaypro.R.color.browser_label_gray));     // Catch: java.lang.Throwable -> L39
            if (r2.FH.FH() == false) goto L20;
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.box_red);     // Catch: java.lang.Throwable -> L39
        L38:
            return r1;
        L20:
            if (r2.FH.Hw() == false) goto L23;
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.objects);     // Catch: java.lang.Throwable -> L39
            goto L38
        L23:
            if (r2.FH.DW() == false) goto L25;
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.box_light_blue);     // Catch: java.lang.Throwable -> L39
            goto L38
        L25:
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.box_blue);     // Catch: java.lang.Throwable -> L39
            goto L38
        L15:
            r5 = r0;
            goto L16
        L27:
            if (r2.v5 == null) goto L33;
            java.lang.String r6 = r2.v5.Hw;     // Catch: java.lang.Throwable -> L39
            r3.setText(r6.replace(" ", " "), android.widget.TextView.BufferType.SPANNABLE);     // Catch: java.lang.Throwable -> L39
            com.aide.ui.debugger.DebugView.j6(r3, r6.indexOf(41) + 1, r6.length(), this.Zo.getResources().getColor(com.almlkaide.kaypro.R.color.browser_label_gray));     // Catch: java.lang.Throwable -> L39
            if (r2.v5.j6() == false) goto L31;
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.box_pink);     // Catch: java.lang.Throwable -> L39
            goto L38
        L31:
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.box_light_pink);     // Catch: java.lang.Throwable -> L39
            goto L38
        L33:
            if (r2.Hw == null) goto L36;
            java.lang.String r7 = r2.Hw.Hw;     // Catch: java.lang.Throwable -> L39
            java.lang.String r8 = r7 + ":" + r2.Hw.v5;     // Catch: java.lang.Throwable -> L39
            r3.setText(r8.replace(" ", " "), android.widget.TextView.BufferType.SPANNABLE);     // Catch: java.lang.Throwable -> L39
            com.aide.ui.debugger.DebugView.j6(r3, r7.length(), r8.length(), this.Zo.getResources().getColor(com.almlkaide.kaypro.R.color.browser_label_gray));     // Catch: java.lang.Throwable -> L39
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.debugger_breakpoint);     // Catch: java.lang.Throwable -> L39
            goto L38
        L36:
            if (r2.Zo == null) goto L38;
            r3.setText(r2.Zo, android.widget.TextView.BufferType.SPANNABLE);     // Catch: java.lang.Throwable -> L39
            com.aide.ui.debugger.DebugView.j6(r3, 0, r2.Zo.length(), this.Zo.getResources().getColor(com.almlkaide.kaypro.R.color.browser_label_gray));     // Catch: java.lang.Throwable -> L39
            r4.setImageResource(com.almlkaide.kaypro.R.drawable.debugger_breakpoint);     // Catch: java.lang.Throwable -> L39
            goto L38
        L8:
            r1 = r13;
            goto L9
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.debugger.DebugView.class, 3296790518352727939L, 3296790518352727939L);
    }

    public DebugView(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 861001627604447400L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(861001627604447400L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
        DW();     // Catch: java.lang.Throwable -> L8
    }

    public DebugView(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -994117764957992505L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-994117764957992505L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        DW();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -654981918627632307L)
    private void DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 199359236841693583L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(199359236841693583L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.LayoutInflater r2 = android.view.LayoutInflater.from(getContext());     // Catch: java.lang.Throwable -> L8
        android.view.View r3 = r2.inflate(com.almlkaide.kaypro.R.layout.debugger_view, null);     // Catch: java.lang.Throwable -> L8
        removeAllViews();     // Catch: java.lang.Throwable -> L8
        addView(r3);     // Catch: java.lang.Throwable -> L8
        android.widget.ListView r4 = getListView();     // Catch: java.lang.Throwable -> L8
        r4.addHeaderView(r2.inflate(com.almlkaide.kaypro.R.layout.browser_header, null), null, false);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.debugger.DebugView.b r5 = new com.aide.ui.debugger.DebugView.b(this, null);     // Catch: java.lang.Throwable -> L8
        this.FH = r5;     // Catch: java.lang.Throwable -> L8
        r4.setAdapter(r5);     // Catch: java.lang.Throwable -> L8
        r4.setOnItemClickListener(new com.aide.ui.debugger.b(this, r4));     // Catch: java.lang.Throwable -> L8
        r4.setOnItemLongClickListener(new com.aide.ui.debugger.c(this));     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 4850519686816106065L)
    private static void DW(android.widget.TextView r9, int r10, int r11, int r12) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -3827237572043472389L, null, r9, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3827237572043472389L, null, r9, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12));     // Catch: java.lang.Throwable -> L7
    L5:
        ((android.text.Spannable) r9.getText()).setSpan(new android.text.style.ForegroundColorSpan(r12), r10, r11, 33);     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 2601223615736281100L)
    private android.widget.ListView getListView() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4366441087694949144L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4366441087694949144L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.ListView) findViewById(com.almlkaide.kaypro.R.id.debuggerEntryList);
    }

    static void j6(android.widget.TextView r0, int r1, int r2, int r3) {
        DW(r0, r1, r2, r3);
    }

    public void j6() {
    L61:
        th = move-exception;
        if (DW == false) goto L66;
        abcd.wu.j6(th, -2267992997611496199L, this);
    L66:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2267992997611496199L, this);     // Catch: java.lang.Throwable -> L61
    L6:
        android.widget.ListView r2 = getListView();     // Catch: java.lang.Throwable -> L61
        android.widget.TextView r3 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.browserHeaderLabel);     // Catch: java.lang.Throwable -> L61
        android.widget.ImageView r4 = (android.widget.ImageView) r2.findViewById(com.almlkaide.kaypro.R.id.browserHeaderIcon);     // Catch: java.lang.Throwable -> L61
        android.widget.ImageView r5 = (android.widget.ImageView) r2.findViewById(com.almlkaide.kaypro.R.id.browserHeaderMenuButton);     // Catch: java.lang.Throwable -> L61
        if (com.aide.ui.U.gn().J0() == false) goto L17;
        if (com.aide.ui.U.gn().u7() != null) goto L11;
        r4.setImageResource(com.almlkaide.kaypro.R.drawable.debugger_suspended);     // Catch: java.lang.Throwable -> L61
        java.lang.String r6 = "at " + abcd.Vl.tp(com.aide.ui.U.gn().Hw());     // Catch: java.lang.Throwable -> L61
        java.lang.String r7 = r6 + ":" + com.aide.ui.U.gn().Zo();     // Catch: java.lang.Throwable -> L61
        r3.setText(r7, android.widget.TextView.BufferType.SPANNABLE);     // Catch: java.lang.Throwable -> L61
        DW(r3, r6.length(), r7.length(), getResources().getColor(com.almlkaide.kaypro.R.color.browser_label_gray));     // Catch: java.lang.Throwable -> L61
        r5.setVisibility(8);     // Catch: java.lang.Throwable -> L61
    L23:
        java.util.ArrayList r8 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L61
        if (com.aide.ui.U.gn().J0() == true) goto L26;
    L31:
        java.util.List<com.aide.ui.debugger.Debugger.b> r9 = com.aide.ui.U.gn().gn();     // Catch: java.lang.Throwable -> L61
        if (r9.size() <= 0) goto L34;
        r8.add(new com.aide.ui.debugger.DebugView.a(r9.get(0)));     // Catch: java.lang.Throwable -> L61
    L34:
        java.util.Iterator<com.aide.ui.debugger.Debugger.c> r10 = com.aide.ui.U.gn().VH().iterator();     // Catch: java.lang.Throwable -> L61
    L36:
        if (r10.hasNext() == false) goto L38;
        r8.add(new com.aide.ui.debugger.DebugView.a(r10.next()));     // Catch: java.lang.Throwable -> L61
        goto L36
    L38:
        int r11 = 1;
    L40:
        if (r11 >= r9.size()) goto L42;
        r8.add(new com.aide.ui.debugger.DebugView.a(r9.get(r11)));     // Catch: java.lang.Throwable -> L61
        r11 = r11 + 1;     // Catch: java.lang.Throwable -> L61
        goto L40
    L42:
        java.util.Iterator<com.aide.ui.debugger.Debugger.a> r12 = com.aide.ui.U.gn().DW().iterator();     // Catch: java.lang.Throwable -> L61
    L44:
        if (r12.hasNext() == false) goto L47;
        r8.add(new com.aide.ui.debugger.DebugView.a(r12.next()));     // Catch: java.lang.Throwable -> L61
        goto L44
    L47:
        if (r8.size() == 0) goto L49;
    L51:
        this.FH.j6(r8);     // Catch: java.lang.Throwable -> L61
        if (this.Hw == null) goto L56;
        if (this.Hw.equals(com.aide.ui.U.gn().u7()) == true) goto L56;
    L59:
        this.Hw = com.aide.ui.U.gn().u7();     // Catch: java.lang.Throwable -> L61
        r2.setSelection(0);     // Catch: java.lang.Throwable -> L61
        return;
    L56:
        if (this.Hw == null) goto L58;
        return;
    L58:
        if (com.aide.ui.U.gn().u7() != null) goto L59;
        return;
    L49:
        if (com.aide.ui.U.gn().tp() == true) goto L51;
        r8.add(new com.aide.ui.debugger.DebugView.a(getContext().getResources().getString(com.almlkaide.kaypro.R.string.view_debugger_breakpoints_text)));     // Catch: java.lang.Throwable -> L61
        goto L51
    L26:
        if (com.aide.ui.U.gn().u7() == null) goto L31;
        java.util.Iterator<com.aide.ui.debugger.Debugger.c> r13 = com.aide.ui.U.gn().FH().iterator();     // Catch: java.lang.Throwable -> L61
    L29:
        if (r13.hasNext() == false) goto L51;
        r8.add(new com.aide.ui.debugger.DebugView.a(r13.next()));     // Catch: java.lang.Throwable -> L61
        goto L29
    L11:
        if (com.aide.ui.U.gn().u7().endsWith("()") == false) goto L13;
        r4.setImageResource(com.almlkaide.kaypro.R.drawable.box_red);     // Catch: java.lang.Throwable -> L61
    L14:
        r3.setText(com.aide.ui.U.gn().u7());     // Catch: java.lang.Throwable -> L61
        r5.setVisibility(8);     // Catch: java.lang.Throwable -> L61
        goto L23
    L13:
        r4.setImageResource(com.almlkaide.kaypro.R.drawable.box_blue);     // Catch: java.lang.Throwable -> L61
        goto L14
    L17:
        if (com.aide.ui.U.gn().tp() == false) goto L20;
        r4.setImageResource(com.almlkaide.kaypro.R.drawable.debugger_run);     // Catch: java.lang.Throwable -> L61
        r3.setText(com.almlkaide.kaypro.R.string.view_debugger_running);     // Catch: java.lang.Throwable -> L61
        r5.setVisibility(8);     // Catch: java.lang.Throwable -> L61
        goto L23
    L20:
        if (com.aide.ui.U.gn().we() == false) goto L22;
        r4.setImageResource(com.almlkaide.kaypro.R.drawable.debugger_stopped);     // Catch: java.lang.Throwable -> L61
        r3.setText(com.almlkaide.kaypro.R.string.view_debugger_stopped);     // Catch: java.lang.Throwable -> L61
        r5.setVisibility(8);     // Catch: java.lang.Throwable -> L61
        goto L23
    L22:
        r4.setImageResource(com.almlkaide.kaypro.R.drawable.debugger_stopped);     // Catch: java.lang.Throwable -> L61
        r3.setText(com.almlkaide.kaypro.R.string.view_debugger_not_running);     // Catch: java.lang.Throwable -> L61
        r5.setVisibility(8);     // Catch: java.lang.Throwable -> L61
        goto L23
    }
}
