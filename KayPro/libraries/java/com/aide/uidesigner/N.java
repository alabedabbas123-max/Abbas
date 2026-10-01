package com.aide.uidesigner;

@abcd.Interfacexu
public class N {
    public static com.aide.uidesigner.N.a DW;

    @abcd.Interfaceuu
    private static boolean EQ;
    public static com.aide.uidesigner.N.a FH;
    public static com.aide.uidesigner.N.a Hw;
    public static com.aide.uidesigner.N.a[] VH;
    public static com.aide.uidesigner.N.a Zo;
    public static com.aide.uidesigner.N.a[] gn;
    public static com.aide.uidesigner.N.a j6;

    @abcd.Interfacetu
    private static boolean tp;
    public static com.aide.uidesigner.N.a[] u7;
    public static com.aide.uidesigner.N.a v5;

    @abcd.Interfacexu
    public static class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;
        public boolean EQ;
        public java.lang.Class<?> FH;
        public java.lang.String Hw;
        public com.aide.uidesigner.N.b VH;
        public java.lang.String Zo;
        public java.lang.Class<?> gn;
        public java.lang.String tp;
        public java.lang.String u7;
        public java.lang.Class<?> v5;

        @abcd.Interfaceru(field = -2867925902000428347L)
        private java.lang.String we;

        static {
            abcd.wu.j6(com.aide.uidesigner.N.a.class, -1144527078399727815L, -1144527078399727815L);
        }

        public a(java.lang.String r10, java.lang.String r11, java.lang.String r12, com.aide.uidesigner.N.b r13) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -4981379621115338299L, null, r10, r11, r12, r13);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-4981379621115338299L, null, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        L5:
            java.lang.Class<?> r0 = j6(r10);     // Catch: java.lang.Throwable -> L7
            this.gn = r0;     // Catch: java.lang.Throwable -> L7
            this.FH = r0;     // Catch: java.lang.Throwable -> L7
            this.Hw = r12;     // Catch: java.lang.Throwable -> L7
            this.Zo = "android:" + r11;     // Catch: java.lang.Throwable -> L7
            this.VH = r13;     // Catch: java.lang.Throwable -> L7
            this.EQ = r11.startsWith("layout_");     // Catch: java.lang.Throwable -> L7
            DW();     // Catch: java.lang.Throwable -> L7
        }

        public a(java.lang.String r6, java.lang.String r7, java.lang.String r8, com.aide.uidesigner.N.b r9, java.lang.String r10, java.lang.String r11) {
            if (j6 == false) goto L5;
            abcd.wu.j6(-307260594629702727L, null, new java.lang.Object[]{r6, r7, r8, r9, r10, r11});
        L5:
            this(r6, r7, r8, r9);
            this.gn = j6(r10);
            this.u7 = r10;
            this.tp = r11;
        }

        public a(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.aide.uidesigner.N.b r15) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 698126465889819115L, null, r11, r12, r13, r14, r15);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(698126465889819115L, null, r11, r12, r13, r14, r15);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r11, r12, r14, r15);     // Catch: java.lang.Throwable -> L7
            this.v5 = j6(r13);     // Catch: java.lang.Throwable -> L7
        }

        public a(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.aide.uidesigner.N.b r12, java.lang.String r13, java.lang.String r14) {
            if (j6 == false) goto L5;
            abcd.wu.j6(-2529837223521910305L, null, new java.lang.Object[]{r8, r9, r10, r11, r12, r13, r14});
        L5:
            this(r8, r9, r11, r12, r13, r14);
            this.v5 = j6(r10);
        }

        @abcd.Interfacesu(method = 4783239396436624704L)
        private void DW() {
        L23:
            th = move-exception;
            if (DW == false) goto L28;
            abcd.wu.j6(th, 1908403564037859264L, this);
        L28:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1908403564037859264L, this);     // Catch: java.lang.Throwable -> L23
        L6:
            java.lang.String r2 = this.Zo.substring(8);     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuffer r3 = new java.lang.StringBuffer();     // Catch: java.lang.Throwable -> L23
            r3.append(java.lang.Character.toUpperCase(r2.charAt(0)));     // Catch: java.lang.Throwable -> L23
            int r6 = 1;
            boolean r7 = false;
        L8:
            if (r6 >= r2.length()) goto L21;
            char r8 = r2.charAt(r6);     // Catch: java.lang.Throwable -> L23
            if (r7 == false) goto L14;
            r3.append(java.lang.Character.toUpperCase(r8));     // Catch: java.lang.Throwable -> L23
            r7 = false;
        L20:
            r6 = r6 + 1;     // Catch: java.lang.Throwable -> L23
            goto L8
        L14:
            if (r8 != '_') goto L17;
            r3.append(" ");     // Catch: java.lang.Throwable -> L23
            r7 = true;
            goto L20
        L17:
            if (java.lang.Character.isUpperCase(r8) == false) goto L19;
            r3.append(" ");     // Catch: java.lang.Throwable -> L23
        L19:
            r3.append(r8);     // Catch: java.lang.Throwable -> L23
            goto L20
        L21:
            this.we = r3.toString();     // Catch: java.lang.Throwable -> L23
        }

        @abcd.Interfacesu(method = 1321373350340167575L)
        private java.lang.Class<?> j6(java.lang.String r6) {
        L14:
            th = move-exception;
            if (DW == false) goto L18;
            abcd.wu.j6(th, 2807441923577577895L, this, r6);
        L18:
            throw th;
        L4:
            if (j6 == false) goto L20;
            abcd.wu.j6(2807441923577577895L, this, r6);     // Catch: java.lang.Throwable -> L14
        L20:
        L12:
            return null;
        L7:
            if (r6.contains(".") == true) goto L11;
            return java.lang.Class.forName(com.aide.uidesigner.N.class.getPackage().getName() + "." + r6);
        L11:
            return java.lang.Class.forName(r6);
        }

        public java.lang.String j6() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -251962909469139960L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-251962909469139960L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.we;
        }
    }

    @abcd.Interfacexu
    public static final enum b extends java.lang.Enum<com.aide.uidesigner.N.b> {
        public static final com.aide.uidesigner.N.b DW = null;
        public static final com.aide.uidesigner.N.b EQ = null;
        public static final com.aide.uidesigner.N.b FH = null;
        public static final com.aide.uidesigner.N.b Hw = null;
        public static final com.aide.uidesigner.N.b J0 = null;
        public static final com.aide.uidesigner.N.b J8 = null;
        public static final com.aide.uidesigner.N.b QX = null;
        public static final com.aide.uidesigner.N.b VH = null;
        public static final com.aide.uidesigner.N.b Ws = null;
        private static final com.aide.uidesigner.N.b[] XL = null;
        public static final com.aide.uidesigner.N.b Zo = null;

        @abcd.Interfacetu
        private static boolean aM;
        public static final com.aide.uidesigner.N.b gn = null;

        @abcd.Interfaceuu
        private static boolean j3;
        public static final com.aide.uidesigner.N.b j6 = null;
        public static final com.aide.uidesigner.N.b tp = null;
        public static final com.aide.uidesigner.N.b u7 = null;
        public static final com.aide.uidesigner.N.b v5 = null;
        public static final com.aide.uidesigner.N.b we = null;
        public java.lang.Class<?> Mr;

        static {
            abcd.wu.j6(com.aide.uidesigner.N.b.class, -1149471427977011408L, -1149471427977011408L);     // Catch: java.lang.Throwable -> L8
            if (aM == false) goto L6;
            abcd.wu.j6(80118439023638048L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            j6 = new com.aide.uidesigner.N.b("IntConstant", 0, java.lang.Integer.TYPE);     // Catch: java.lang.Throwable -> L8
            DW = new com.aide.uidesigner.N.b("EnumConstant", 1, java.lang.Enum.class);     // Catch: java.lang.Throwable -> L8
            FH = new com.aide.uidesigner.N.b("LayoutSize", 2, java.lang.Integer.TYPE);     // Catch: java.lang.Throwable -> L8
            Hw = new com.aide.uidesigner.N.b("Size", 3, java.lang.Integer.TYPE);     // Catch: java.lang.Throwable -> L8
            v5 = new com.aide.uidesigner.N.b("FloatSize", 4, java.lang.Float.TYPE);     // Catch: java.lang.Throwable -> L8
            Zo = new com.aide.uidesigner.N.b("TextSize", 5, java.lang.Float.TYPE);     // Catch: java.lang.Throwable -> L8
            VH = new com.aide.uidesigner.N.b("Text", 6, java.lang.CharSequence.class);     // Catch: java.lang.Throwable -> L8
            gn = new com.aide.uidesigner.N.b("Float", 7, java.lang.Float.TYPE);     // Catch: java.lang.Throwable -> L8
            u7 = new com.aide.uidesigner.N.b("Int", 8, java.lang.Integer.TYPE);     // Catch: java.lang.Throwable -> L8
            tp = new com.aide.uidesigner.N.b("Bool", 9, java.lang.Boolean.TYPE);     // Catch: java.lang.Throwable -> L8
            EQ = new com.aide.uidesigner.N.b("ID", 10, java.lang.Integer.TYPE);     // Catch: java.lang.Throwable -> L8
            we = new com.aide.uidesigner.N.b("Color", 11, java.lang.Integer.TYPE);     // Catch: java.lang.Throwable -> L8
            J0 = new com.aide.uidesigner.N.b("Drawable", 12, android.graphics.drawable.Drawable.class);     // Catch: java.lang.Throwable -> L8
            J8 = new com.aide.uidesigner.N.b("DrawableResource", 13, android.graphics.drawable.Drawable.class);     // Catch: java.lang.Throwable -> L8
            Ws = new com.aide.uidesigner.N.b("TextAppearance", 14, java.lang.String.class);     // Catch: java.lang.Throwable -> L8
            QX = new com.aide.uidesigner.N.b("Event", 15, java.lang.CharSequence.class);     // Catch: java.lang.Throwable -> L8
            XL = new com.aide.uidesigner.N.b[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7, tp, EQ, we, J0, J8, Ws, QX};     // Catch: java.lang.Throwable -> L8
            return;
        L8:
            th = move-exception;
            if (j3 == false) goto L12;
            abcd.wu.j6(th, 80118439023638048L, null);
        L12:
            throw th;
        }

        @abcd.Interfacesu(method = -1160534526134951237L)
        private b(java.lang.String r9, int r10, java.lang.Class r11) {
        L7:
            th = move-exception;
            if (j3 == false) goto L11;
            abcd.wu.j6(th, -561141030887734896L, null, r9, new java.lang.Integer(r10), r11);
        L11:
            throw th;
        L3:
            if (aM == false) goto L5;
            abcd.wu.j6(-561141030887734896L, null, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L7
        L5:
            super(r9, r10);     // Catch: java.lang.Throwable -> L7
            this.Mr = r11;     // Catch: java.lang.Throwable -> L7
        }

        public static com.aide.uidesigner.N.b valueOf(java.lang.String r5) {
        L8:
            th = move-exception;
            if (j3 == false) goto L12;
            abcd.wu.j6(th, 325563542140011648L, null, r5);
        L12:
            throw th;
        L4:
            if (aM == false) goto L6;
            abcd.wu.j6(325563542140011648L, null, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return (com.aide.uidesigner.N.b) java.lang.Enum.valueOf(com.aide.uidesigner.N.b.class, r5);
        }

        public static com.aide.uidesigner.N.b[] values() {
        L8:
            th = move-exception;
            if (j3 == false) goto L12;
            abcd.wu.j6(th, -1334633246407245488L, null);
        L12:
            throw th;
        L4:
            if (aM == false) goto L6;
            abcd.wu.j6(-1334633246407245488L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            return (com.aide.uidesigner.N.b[]) XL.clone();
        }
    }

    static {
        abcd.wu.j6(com.aide.uidesigner.N.class, -175704537702267603L, -175704537702267603L);     // Catch: java.lang.Throwable -> L8
        if (tp == false) goto L6;
        abcd.wu.j6(-3156958742737719715L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_toRightOf", "ProxyRelativeLayoutParams", "setRightOf()", com.aide.uidesigner.N.b.EQ);     // Catch: java.lang.Throwable -> L8
        DW = new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_toLeftOf", "ProxyRelativeLayoutParams", "setLeftOf()", com.aide.uidesigner.N.b.EQ);     // Catch: java.lang.Throwable -> L8
        FH = new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_below", "ProxyRelativeLayoutParams", "setBelow()", com.aide.uidesigner.N.b.EQ);     // Catch: java.lang.Throwable -> L8
        Hw = new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_above", "ProxyRelativeLayoutParams", "setAbove()", com.aide.uidesigner.N.b.EQ);     // Catch: java.lang.Throwable -> L8
        v5 = new com.aide.uidesigner.N.a("android.view.ViewGroup$LayoutParams", "layout_width", "width", com.aide.uidesigner.N.b.FH);     // Catch: java.lang.Throwable -> L8
        Zo = new com.aide.uidesigner.N.a("android.view.ViewGroup$LayoutParams", "layout_height", "height", com.aide.uidesigner.N.b.FH);     // Catch: java.lang.Throwable -> L8
        VH = new com.aide.uidesigner.N.a[]{v5, Zo, new com.aide.uidesigner.N.a("android.view.ViewGroup$MarginLayoutParams", "layout_margin", "ProxyMarginLayoutParams", "setMargin()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.ViewGroup$MarginLayoutParams", "layout_marginLeft", "leftMargin", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.ViewGroup$MarginLayoutParams", "layout_marginRight", "rightMargin", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.ViewGroup$MarginLayoutParams", "layout_marginTop", "topMargin", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.ViewGroup$MarginLayoutParams", "layout_marginBottom", "bottomMargin", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.ViewGroup$MarginLayoutParams", "layout_marginStart", "setMarginStart()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.ViewGroup$MarginLayoutParams", "layout_marginEnd", "setMarginEnd()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.LinearLayout$LayoutParams", "layout_gravity", "gravity", com.aide.uidesigner.N.b.j6, "android.view.Gravity", null), new com.aide.uidesigner.N.a("android.widget.LinearLayout$LayoutParams", "layout_weight", "weight", com.aide.uidesigner.N.b.gn), FH, Hw, j6, DW, new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_toEndOf", "ProxyRelativeLayoutParams", "setEndOf()", com.aide.uidesigner.N.b.EQ), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_toStartOf", "ProxyRelativeLayoutParams", "setStartOf()", com.aide.uidesigner.N.b.EQ), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignBaseline", "ProxyRelativeLayoutParams", "setAlignBaseline()", com.aide.uidesigner.N.b.EQ), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignBottom", "ProxyRelativeLayoutParams", "setAlignBottom()", com.aide.uidesigner.N.b.EQ), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignTop", "ProxyRelativeLayoutParams", "setAlignTop()", com.aide.uidesigner.N.b.EQ), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignEnd", "ProxyRelativeLayoutParams", "setAlignEnd()", com.aide.uidesigner.N.b.EQ), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignStart", "ProxyRelativeLayoutParams", "setAlignStart()", com.aide.uidesigner.N.b.EQ), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignRight", "ProxyRelativeLayoutParams", "setAlignRight()", com.aide.uidesigner.N.b.EQ), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignLeft", "ProxyRelativeLayoutParams", "setAlignLeft()", com.aide.uidesigner.N.b.EQ), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignParentBottom", "ProxyRelativeLayoutParams", "setAlignParentBottom()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignParentEnd", "ProxyRelativeLayoutParams", "setAlignParentEnd()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignParentLeft", "ProxyRelativeLayoutParams", "setAlignParentLeft()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignParentRight", "ProxyRelativeLayoutParams", "setAlignParentRight()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignParentStart", "ProxyRelativeLayoutParams", "setAlignParentStart()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_alignParentTop", "ProxyRelativeLayoutParams", "setAlignParentTop()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_centerHorizontal", "ProxyRelativeLayoutParams", "setCenterHorizontal()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_centerVertical", "ProxyRelativeLayoutParams", "setCenterVertical()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.RelativeLayout$LayoutParams", "layout_centerInParent", "ProxyRelativeLayoutParams", "setCenterInParent()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.GridLayout$LayoutParams", "layout_gravity", "ProxyGridLayoutParams", "setGravity()", com.aide.uidesigner.N.b.j6, "android.view.Gravity", null), new com.aide.uidesigner.N.a("android.widget.GridLayout$LayoutParams", "layout_column", "ProxyGridLayoutParams", "setColumn()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.GridLayout$LayoutParams", "layout_columnSpan", "ProxyGridLayoutParams", "setColumnSpan()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.GridLayout$LayoutParams", "layout_row", "ProxyGridLayoutParams", "setRow()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.GridLayout$LayoutParams", "layout_rowSpan", "ProxyGridLayoutParams", "setRowSpan()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.FrameLayout$LayoutParams", "layout_gravity", "gravity", com.aide.uidesigner.N.b.j6, "android.view.Gravity", null), new com.aide.uidesigner.N.a("android.widget.TableRow$LayoutParams", "layout_span", "span", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.TableRow$LayoutParams", "layout_column", "column", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.AbsoluteLayout$LayoutParams", "layout_x", "x", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.AbsoluteLayout$LayoutParams", "layout_y", "y", com.aide.uidesigner.N.b.Hw)};     // Catch: java.lang.Throwable -> L8
        gn = new com.aide.uidesigner.N.a[]{new com.aide.uidesigner.N.a("android.view.View", "padding", "ProxyViewPaddings", "setPadding()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.View", "paddingLeft", "ProxyViewPaddings", "setPaddingLeft()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.View", "paddingRight", "ProxyViewPaddings", "setPaddingRight()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.View", "paddingTop", "ProxyViewPaddings", "setPaddingTop()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.View", "paddingBottom", "ProxyViewPaddings", "setPaddingBottom()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.View", "paddingStart", "ProxyViewPaddings", "setPaddingStart()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.View", "paddingEnd", "ProxyViewPaddings", "setPaddingEnd()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.View", "alpha", "setAlpha()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.view.View", "scaleX", "setScaleX()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.view.View", "scaleY", "setScaleY()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.view.View", "translationX", "setTranslationX()", com.aide.uidesigner.N.b.v5), new com.aide.uidesigner.N.a("android.view.View", "translationY", "setTranslationY()", com.aide.uidesigner.N.b.v5), new com.aide.uidesigner.N.a("android.view.View", "translationZ", "setTranslationZ()", com.aide.uidesigner.N.b.v5), new com.aide.uidesigner.N.a("android.view.View", "rotation", "setRotation()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.view.View", "rotationX", "setRotationX()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.view.View", "rotationY", "setRotationY()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.view.View", "elevation", "setElevation()", com.aide.uidesigner.N.b.v5), new com.aide.uidesigner.N.a("android.view.View", "minHeight", "setMinimumHeight()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.View", "minWidth", "setMinimumWidth()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.view.View", "textAlignment", "setTextAlignment()", com.aide.uidesigner.N.b.j6, "android.view.View", "TEXT_ALIGNMENT"), new com.aide.uidesigner.N.a("android.view.View", "visibility", "setVisibility()", com.aide.uidesigner.N.b.j6), new com.aide.uidesigner.N.a("android.view.View", "background", "setBackgroundDrawable()", com.aide.uidesigner.N.b.J0), new com.aide.uidesigner.N.a("android.view.View", "onClick", "", com.aide.uidesigner.N.b.QX), new com.aide.uidesigner.N.a("android.view.ViewGroup", "clipChildren", "setClipChildren()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.view.ViewGroup", "clipToPadding", "setClipToPadding()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.LinearLayout", "orientation", "setOrientation()", com.aide.uidesigner.N.b.j6), new com.aide.uidesigner.N.a("android.widget.LinearLayout", "gravity", "setGravity()", com.aide.uidesigner.N.b.j6, "android.view.Gravity", null), new com.aide.uidesigner.N.a("android.widget.LinearLayout", "baselineAligned", "setBaselineAligned()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.LinearLayout", "baselineAlignedChildIndex", "setBaselineAlignedChildIndex()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.LinearLayout", "measureWithLargestChild", "setMeasureWithLargestChildEnabled()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.LinearLayout", "weightSum", "setWeightSum()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.widget.RelativeLayout", "gravity", "setGravity()", com.aide.uidesigner.N.b.j6, "android.view.Gravity", null), new com.aide.uidesigner.N.a("android.widget.RelativeLayout", "ignoreGravity", "setIgnoreGravity()", com.aide.uidesigner.N.b.EQ), new com.aide.uidesigner.N.a("android.widget.FrameLayout", "foregroundGravity", "setForegroundGravity()", com.aide.uidesigner.N.b.j6, "android.view.Gravity", null), new com.aide.uidesigner.N.a("android.widget.FrameLayout", "measureAllChildren", "setMeasureAllChildren()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.GridLayout", "columnCount", "setColumnCount()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.GridLayout", "rowCount", "setRowCount()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.GridLayout", "orientation", "setOrientation()", com.aide.uidesigner.N.b.j6), new com.aide.uidesigner.N.a("android.widget.GridLayout", "columnOrderPreserved", "setColumnOrderPreserved()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.GridLayout", "rowOrderPreserved", "setRowOrderPreserved()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.GridLayout", "useDefaultMargins", "setUseDefaultMargins()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.GridLayout", "alignmentMode", "setAlignmentMode()", com.aide.uidesigner.N.b.j6, "android.widget.GridLayout", "ALIGN"), new com.aide.uidesigner.N.a("android.widget.TextView", "textAppearance", "ProxyTextView", "setTextAppearance()", com.aide.uidesigner.N.b.Ws), new com.aide.uidesigner.N.a("android.widget.TextView", "text", "setText()", com.aide.uidesigner.N.b.VH), new com.aide.uidesigner.N.a("android.widget.TextView", "hint", "setHint()", com.aide.uidesigner.N.b.VH), new com.aide.uidesigner.N.a("android.widget.TextView", "height", "setHeight()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.TextView", "width", "setWidth()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.TextView", "maxHeight", "setMaxHeight()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.TextView", "maxWidth", "setMaxWidth()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.TextView", "ems", "setEms()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.TextView", "minEms", "setMinEms()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.TextView", "maxEms", "setMaxEms()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.TextView", "gravity", "setGravity()", com.aide.uidesigner.N.b.j6, "android.view.Gravity", null), new com.aide.uidesigner.N.a("android.widget.TextView", "textScaleX", "setTextScaleX()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.widget.TextView", "textScaleY", "setTextScaleY()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.widget.TextView", "textIsSelectable", "setTextIsSelectable()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.TextView", "singleLine", "setSingleLine()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.TextView", "lines", "setLines()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.TextView", "minLines", "setMinLines()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.TextView", "maxLines", "setMaxLines()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.TextView", "textColor", "setTextColor()", com.aide.uidesigner.N.b.we), new com.aide.uidesigner.N.a("android.widget.TextView", "textColorHighlight", "setHighlightColor()", com.aide.uidesigner.N.b.we), new com.aide.uidesigner.N.a("android.widget.TextView", "textColorHint", "setHintTextColor()", com.aide.uidesigner.N.b.we), new com.aide.uidesigner.N.a("android.widget.TextView", "textColorLink", "setLinkTextColor()", com.aide.uidesigner.N.b.we), new com.aide.uidesigner.N.a("android.widget.TextView", "ellipsize", "setEllipsize()", com.aide.uidesigner.N.b.DW, "android.text.TextUtils$TruncateAt", null), new com.aide.uidesigner.N.a("android.widget.TextView", "textStyle", "ProxyTextView", "setTextStyle()", com.aide.uidesigner.N.b.j6, "ProxyTextView", "TEXTSTYLE"), new com.aide.uidesigner.N.a("android.widget.TextView", "typeface", "ProxyTextView", "setTypeface()", com.aide.uidesigner.N.b.j6, "ProxyTextView", "TYPEFACE"), new com.aide.uidesigner.N.a("android.widget.TextView", "inputType", "ProxyTextView", "setInputType()", com.aide.uidesigner.N.b.j6, "ProxyTextView", "INPUTTYPE"), new com.aide.uidesigner.N.a("android.widget.TextView", "textSize", "setTextSize()", com.aide.uidesigner.N.b.Zo), new com.aide.uidesigner.N.a("android.widget.TextView", "shadowColor", "ProxyTextView", "setShadowColor()", com.aide.uidesigner.N.b.we), new com.aide.uidesigner.N.a("android.widget.TextView", "shadowDx", "ProxyTextView", "setShadowDx()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.widget.TextView", "shadowDy", "ProxyTextView", "setShadowDy()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.widget.TextView", "shadowRadius", "ProxyTextView", "setShadowRadius()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.widget.ScrollView", "fillViewport", "setFillViewport()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.ImageView", "src", "setImageDrawable()", com.aide.uidesigner.N.b.J8), new com.aide.uidesigner.N.a("android.widget.ImageView", "scaleType", "setScaleType()", com.aide.uidesigner.N.b.DW, "android.widget.ImageView$ScaleType", null), new com.aide.uidesigner.N.a("android.widget.ImageView", "adjustViewBounds", "setAdjustViewBounds()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.ImageView", "baseLine", "setBaseLine()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.ImageView", "baselineAlignBottom", "setBaselineAlignBottom()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.ImageView", "cropToPadding", "setCropToPadding()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.ImageView", "maxHeight", "setMaxHeight()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.ImageView", "maxWidth", "setMaxWidth()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.ProgressBar", "indeterminate", "setIndeterminate()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.ProgressBar", "indeterminateOnly", "setIndeterminate()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.ProgressBar", "indeterminateDrawable", "setIndeterminateDrawable()", com.aide.uidesigner.N.b.J8), new com.aide.uidesigner.N.a("android.widget.ProgressBar", "progressDrawable", "setProgressDrawable()", com.aide.uidesigner.N.b.J8), new com.aide.uidesigner.N.a("android.widget.Switch", "switchMinWidth", "setSwitchMinWidth()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.Switch", "switchPadding", "setSwitchPadding()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.Switch", "textOff", "setTextOff()", com.aide.uidesigner.N.b.VH), new com.aide.uidesigner.N.a("android.widget.Switch", "textOn", "setTextOn()", com.aide.uidesigner.N.b.VH), new com.aide.uidesigner.N.a("android.widget.Switch", "thumbTextPadding", "setThumbTextPadding()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.Switch", "thumb", "setThumbDrawable()", com.aide.uidesigner.N.b.J0), new com.aide.uidesigner.N.a("android.widget.Switch", "track", "setTrackDrawable()", com.aide.uidesigner.N.b.J0), new com.aide.uidesigner.N.a("android.widget.ToggleButton", "textOff", "setTextOff()", com.aide.uidesigner.N.b.VH), new com.aide.uidesigner.N.a("android.widget.ToggleButton", "textOn", "setTextOn()", com.aide.uidesigner.N.b.VH), new com.aide.uidesigner.N.a("android.widget.Spinner", "gravity", "setGravity()", com.aide.uidesigner.N.b.j6, "android.view.Gravity", null), new com.aide.uidesigner.N.a("android.widget.Spinner", "dropDownWidth", "setDropDownWidth()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.Spinner", "dropDownHorizontalOffset", "setDropDownHorizontalOffset()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.Spinner", "prompt", "setPrompt()", com.aide.uidesigner.N.b.VH), new com.aide.uidesigner.N.a("android.widget.Spinner", "dropDownVerticalOffset", "setDropDownVerticalOffset()", com.aide.uidesigner.N.b.Hw), new com.aide.uidesigner.N.a("android.widget.Spinner", "popupBackground", "setPopupBackgroundDrawable()", com.aide.uidesigner.N.b.J0), new com.aide.uidesigner.N.a("android.widget.RatingBar", "numStars", "setNumStars()", com.aide.uidesigner.N.b.u7), new com.aide.uidesigner.N.a("android.widget.RatingBar", "rating", "setRating()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.widget.RatingBar", "stepSize", "setStepSize()", com.aide.uidesigner.N.b.gn), new com.aide.uidesigner.N.a("android.widget.RatingBar", "isIndicator", "setIsIndicator()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.DatePicker", "calendarViewShown", "setCalendarViewShown()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.DatePicker", "spinnersShown", "setSpinnersShown()", com.aide.uidesigner.N.b.tp), new com.aide.uidesigner.N.a("android.widget.ListView", "divider", "setDivider()", com.aide.uidesigner.N.b.J0), new com.aide.uidesigner.N.a("android.widget.ListView", "dividerHeight", "setDividerHeight()", com.aide.uidesigner.N.b.Hw)};     // Catch: java.lang.Throwable -> L8
        u7 = new com.aide.uidesigner.N.a[VH.length + gn.length];     // Catch: java.lang.Throwable -> L8
        java.lang.System.arraycopy(VH, 0, u7, 0, VH.length);     // Catch: java.lang.Throwable -> L8
        java.lang.System.arraycopy(gn, 0, u7, VH.length, gn.length);     // Catch: java.lang.Throwable -> L8
        java.util.Arrays.sort(u7, new com.aide.uidesigner.M());     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (EQ == false) goto L15;
        abcd.wu.j6(th, -3156958742737719715L, null);
        throw th;
    L15:
        throw th;
    }

    public N() {
    L8:
        th = move-exception;
        if (EQ == false) goto L12;
        abcd.wu.j6(th, 1488646255117602785L, null);
    L12:
        throw th;
    L4:
        if (tp == false) goto L6;
        abcd.wu.j6(1488646255117602785L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }
}
