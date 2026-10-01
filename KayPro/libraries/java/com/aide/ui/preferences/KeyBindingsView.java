package com.aide.ui.preferences;

@abcd.Interfacexu
public class KeyBindingsView extends android.widget.LinearLayout {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacexu
    private class a extends android.widget.ArrayAdapter<com.aide.ui.preferences.KeyBindingsView.b> {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacevu
        final com.aide.ui.preferences.KeyBindingsView FH;

        static {
            abcd.wu.j6(com.aide.ui.preferences.KeyBindingsView.a.class, -85110081915062152L, -85110081915062152L);
        }

        @abcd.Interfacesu(method = 716251069793079569L)
        public a(com.aide.ui.preferences.KeyBindingsView r9, android.content.Context r10, java.util.List<com.aide.ui.preferences.KeyBindingsView.b> r11) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1989058754971014735L, null, r9, r10, r11);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-1989058754971014735L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        L5:
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
            super(r10, com.almlkaide.kaypro.R.layout.keybindings_entry, r11);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = -1307176661615581488L)
        public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        L10:
            th = move-exception;
            if (DW == false) goto L14;
            abcd.wu.j6(th, 367260434547404480L, this, new java.lang.Integer(r9), r10, r11);
        L14:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(367260434547404480L, this, new java.lang.Integer(r9), r10, r11);     // Catch: java.lang.Throwable -> L10
        L5:
            if (r10 != null) goto L7;
            android.view.View r0 = android.view.LayoutInflater.from(getContext()).inflate(com.almlkaide.kaypro.R.layout.keybindings_entry, r11, false);     // Catch: java.lang.Throwable -> L10
        L8:
            com.aide.ui.preferences.KeyBindingsView.b r1 = getItem(r9);     // Catch: java.lang.Throwable -> L10
            ((android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.keybindingsEntryName)).setText(r1.v5);     // Catch: java.lang.Throwable -> L10
            ((android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.keybindingsEntryBinding)).setText(r1.Zo + " ");     // Catch: java.lang.Throwable -> L10
            return r0;
        L7:
            r0 = r10;
            goto L8
        }
    }

    @abcd.Interfacexu
    private class b {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -3293307229160954349L)
        public abcd.InterfaceWl FH;

        @abcd.Interfaceru(field = 715707312962544375L)
        public java.util.List<com.aide.common.ClassU> Hw;

        @abcd.Interfacevu
        final com.aide.ui.preferences.KeyBindingsView VH;

        @abcd.Interfaceru(field = -3026987576695201860L)
        public java.lang.String Zo;

        @abcd.Interfaceru(field = 2187688768040593059L)
        public java.lang.String v5;

        static {
            abcd.wu.j6(com.aide.ui.preferences.KeyBindingsView.b.class, 3651883812178991155L, 3651883812178991155L);
        }

        @abcd.Interfacesu(method = 7814178764726125920L)
        public b(com.aide.ui.preferences.KeyBindingsView r8, abcd.InterfaceWl r9) {
        L14:
            th = move-exception;
            if (DW == false) goto L19;
            abcd.wu.j6(th, 522210046249967881L, null, r8, r9);
        L19:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(522210046249967881L, null, r8, r9);     // Catch: java.lang.Throwable -> L14
        L5:
            this.VH = r8;     // Catch: java.lang.Throwable -> L14
            this.FH = r9;     // Catch: java.lang.Throwable -> L14
            this.v5 = r9.getName();     // Catch: java.lang.Throwable -> L14
            this.Hw = com.aide.ui.U.j3().j6(r9);     // Catch: java.lang.Throwable -> L14
            this.Zo = "";     // Catch: java.lang.Throwable -> L14
            java.util.Iterator<com.aide.common.ClassU> r0 = this.Hw.iterator();     // Catch: java.lang.Throwable -> L14
        L6:
            if (r0.hasNext() == false) goto L13;
            com.aide.common.ClassU r1 = r0.next();     // Catch: java.lang.Throwable -> L14
            if (this.Zo.length() <= 0) goto L11;
            this.Zo += "\n";     // Catch: java.lang.Throwable -> L14
        L11:
            this.Zo += r1.toString();     // Catch: java.lang.Throwable -> L14
            goto L6
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.preferences.KeyBindingsView.class, 1069513486002832672L, 1069513486002832672L);
    }

    public KeyBindingsView(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2537849455460240208L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2537849455460240208L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
        DW();     // Catch: java.lang.Throwable -> L8
    }

    public KeyBindingsView(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 6161331857279505075L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6161331857279505075L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        DW();     // Catch: java.lang.Throwable -> L7
    }

    public KeyBindingsView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -991751434785633280L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-991751434785633280L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        DW();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 1963084175977521464L)
    private void DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 873595125408844565L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(873595125408844565L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.View r2 = android.view.LayoutInflater.from(getContext()).inflate(com.almlkaide.kaypro.R.layout.keybindings, null);     // Catch: java.lang.Throwable -> L8
        removeAllViews();     // Catch: java.lang.Throwable -> L8
        addView(r2);     // Catch: java.lang.Throwable -> L8
        j6();     // Catch: java.lang.Throwable -> L8
    }

    public void j6() {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 310341009200785584L, this);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(310341009200785584L, this);     // Catch: java.lang.Throwable -> L18
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L18
        java.util.Iterator<abcd.InterfaceIl> r3 = com.aide.ui.V.DW().iterator();     // Catch: java.lang.Throwable -> L18
    L8:
        if (r3.hasNext() == false) goto L12;
        abcd.InterfaceIl r4 = r3.next();     // Catch: java.lang.Throwable -> L18
        if ((r4 instanceof abcd.InterfaceWl) == false) goto L8;
        r2.add(new com.aide.ui.preferences.KeyBindingsView.b(this, (abcd.InterfaceWl) r4));     // Catch: java.lang.Throwable -> L18
        goto L8
    L12:
        java.util.Iterator<abcd.InterfaceWl> r5 = com.aide.ui.U.lg().J8().getBasicEditorCommands().iterator();     // Catch: java.lang.Throwable -> L18
    L14:
        if (r5.hasNext() == false) goto L16;
        r2.add(new com.aide.ui.preferences.KeyBindingsView.b(this, r5.next()));     // Catch: java.lang.Throwable -> L18
        goto L14
    L16:
        java.util.Collections.sort(r2, new com.aide.ui.preferences.h(this));     // Catch: java.lang.Throwable -> L18
        android.widget.ListView r6 = (android.widget.ListView) findViewById(com.almlkaide.kaypro.R.id.keybindingsList);     // Catch: java.lang.Throwable -> L18
        r6.setAdapter(new com.aide.ui.preferences.KeyBindingsView.a(this, getContext(), r2));     // Catch: java.lang.Throwable -> L18
        r6.setOnItemClickListener(new com.aide.ui.preferences.j(this, r6));     // Catch: java.lang.Throwable -> L18
    }
}
