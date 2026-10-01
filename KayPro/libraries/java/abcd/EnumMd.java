package abcd;

@abcd.Interfacexu
public final enum EnumMd extends java.lang.Enum<abcd.EnumMd> implements abcd.Interfaceha {
    public static final abcd.EnumMd BT = null;
    public static final abcd.EnumMd DW = null;
    public static final abcd.EnumMd EQ = null;
    public static final abcd.EnumMd FH = null;
    public static final abcd.EnumMd Hw = null;
    public static final abcd.EnumMd J0 = null;
    public static final abcd.EnumMd J8 = null;
    public static final abcd.EnumMd Mr = null;
    public static final abcd.EnumMd P8 = null;
    public static final abcd.EnumMd QX = null;

    @abcd.Interfaceuu
    private static boolean SI;
    public static final abcd.EnumMd U2 = null;
    public static final abcd.EnumMd VH = null;
    public static final abcd.EnumMd Ws = null;
    public static final abcd.EnumMd XL = null;
    public static final abcd.EnumMd Zo = null;
    public static final abcd.EnumMd a8 = null;
    public static final abcd.EnumMd aM = null;
    private static final abcd.EnumMd[] ei = null;
    public static final abcd.EnumMd er = null;
    public static final abcd.EnumMd gW = null;
    public static final abcd.EnumMd gn = null;
    public static final abcd.EnumMd j3 = null;
    public static final abcd.EnumMd j6 = null;
    public static final abcd.EnumMd lg = null;

    @abcd.Interfacetu
    private static boolean nw;
    public static final abcd.EnumMd rN = null;
    public static final abcd.EnumMd tp = null;
    public static final abcd.EnumMd u7 = null;
    public static final abcd.EnumMd v5 = null;
    public static final abcd.EnumMd vy = null;
    public static final abcd.EnumMd we = null;
    public static final abcd.EnumMd yS = null;

    @abcd.Interfaceru(field = 3566469282052884865L)
    private final java.lang.String KD;

    @abcd.Interfaceru(field = -2857780174885238668L)
    private final java.lang.String cn;

    @abcd.Interfaceru(field = -434101750134906240L)
    private final java.lang.String ro;

    @abcd.Interfaceru(field = -2857896594869363701L)
    private final java.lang.String sh;

    static {
        abcd.wu.j6(abcd.EnumMd.class, 5387811553541438620L, 5387811553541438620L);     // Catch: java.lang.Throwable -> L8
        if (nw == false) goto L6;
        abcd.wu.j6(-115988211802466091L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new abcd.EnumMd("BLOCK_INDENT", 0, "JavaScript indentation options", "Indent block contents", "{\n    foo();\n}", "{\nfoo();\n}");     // Catch: java.lang.Throwable -> L8
        DW = new abcd.EnumMd("ARRAY_INDENT", 1, "JavaScript indentation options", "Indent array/object initializer", "[\n    1\n];", "[\n1\n];");     // Catch: java.lang.Throwable -> L8
        FH = new abcd.EnumMd("BRACE_INDENT", 2, "JavaScript indentation options", "Indent open and close brace", "    {\n        foo();\n    }", "{\n    foo();\n}");     // Catch: java.lang.Throwable -> L8
        Hw = new abcd.EnumMd("CASE_INDENT", 3, "JavaScript indentation options", "Indent case contents", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\n    case 10:\n    return 5;\n}");     // Catch: java.lang.Throwable -> L8
        v5 = new abcd.EnumMd("CASELABEL_INDENT", 4, "JavaScript indentation options", "Indent case labels", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\ncase 10:\n    return 5;\n}");     // Catch: java.lang.Throwable -> L8
        Zo = new abcd.EnumMd("LABELLEFT_INDENT", 5, "JavaScript indentation options", "Indent goto labels in leftmost column", "    goto L;\nL:\n    return;", "    goto L;\n    L:\n    return;");     // Catch: java.lang.Throwable -> L8
        VH = new abcd.EnumMd("NEXTLINE_INDENT", 6, "JavaScript indentation options", "Indent lines in multi line statements", "i = 10 +\n    20;", "i = 10 +\n20;");     // Catch: java.lang.Throwable -> L8
        gn = new abcd.EnumMd("ARGUMENT_INDENT", 7, "JavaScript indentation options", "Align arguments", "println(\"\",\n                  20);", "println(\"\",\n    20);");     // Catch: java.lang.Throwable -> L8
        u7 = new abcd.EnumMd("PARAMETER_INDENT", 8, "JavaScript indentation options", "Align parameters", "foo(i,\n         j)\n{\n}", "foo(i,\n    j)\n{\n}");     // Catch: java.lang.Throwable -> L8
        tp = new abcd.EnumMd("ADJUST_NEWLINES", 9, "JavaScript new line options", "Adjust lines on autoformat", "", "");     // Catch: java.lang.Throwable -> L8
        EQ = new abcd.EnumMd("BLOCK_NEWLINE", 10, "JavaScript new line options", "Place open brace on new line for control blocks", "{\n    if (a < b)\n    {\n    }\n}", "{\n    if (a < b) {\n    }\n}");     // Catch: java.lang.Throwable -> L8
        we = new abcd.EnumMd("FUNCTION_NEWLINE", 11, "JavaScript new line options", "Place open brace on new line for functions", "function()\n{\n}", "function() {\n}");     // Catch: java.lang.Throwable -> L8
        J0 = new abcd.EnumMd("ELSE_NEWLINE", 12, "JavaScript new line options", "Place \"else\" on new line", "if (i == 10) {\n    return 10;\n}\nelse {\n    return 0;\n}", "if (i == 10) {\n    return 10;\n} else {\n    return 0;\n}");     // Catch: java.lang.Throwable -> L8
        J8 = new abcd.EnumMd("CATCH_NEWLINE", 13, "JavaScript new line options", "Place \"catch\" on new line", "try {\n}\ncatch {\n}", "try {\n} catch {\n}");     // Catch: java.lang.Throwable -> L8
        Ws = new abcd.EnumMd("FINALLY_NEWLINE", 14, "JavaScript new line options", "Place \"finally\" on new line", "try {\n}\nfinally {\n}", "try {\n} finally {\n}");     // Catch: java.lang.Throwable -> L8
        QX = new abcd.EnumMd("STATEMENT_WRAP", 15, "JavaScript wrapping options", "Place statement in a new line if it doesn't fit", "var i = 0;\ni = 10;", "var i = 0; i = 10;");     // Catch: java.lang.Throwable -> L8
        XL = new abcd.EnumMd("ADJUST_SPACES", 16, "JavaScript spacing options", "Adjust spaces on autoformat", "", "");     // Catch: java.lang.Throwable -> L8
        aM = new abcd.EnumMd("BRACE_SPACE", 17, "JavaScript spacing options", "Insert space before open brace", "if (true) {\n    //...\n}", "if (true){\n    //...\n}");     // Catch: java.lang.Throwable -> L8
        j3 = new abcd.EnumMd("PARAMETER_SPACE", 18, "JavaScript spacing options", "Insert space within parameter parentheses", "function f( i )\n{\n}", "function f(i)\n{\n}");     // Catch: java.lang.Throwable -> L8
        Mr = new abcd.EnumMd("PARAMETERCOMMA_SPACE", 19, "JavaScript spacing options", "Insert space after each parameter", "function f(i, j)\n{\n}", "function f(i,j)\n{\n}");     // Catch: java.lang.Throwable -> L8
        U2 = new abcd.EnumMd("KEYWORD_SPACE", 20, "JavaScript spacing options", "Insert space after keywords", "if (a == b) return 0;", "if(a == b) return 0;");     // Catch: java.lang.Throwable -> L8
        a8 = new abcd.EnumMd("CONDITION_SPACE", 21, "JavaScript spacing options", "Insert space within statement parentheses", "if ( a == b ) return 0;", "if (a == b) return 0;");     // Catch: java.lang.Throwable -> L8
        lg = new abcd.EnumMd("PAREN_SPACE", 22, "JavaScript spacing options", "Insert space within parentheses", "i = ( 10 + 20 ) * 5;", "i = (10 + 20) * 5;");     // Catch: java.lang.Throwable -> L8
        rN = new abcd.EnumMd("METHODCALL_SPACE", 23, "JavaScript spacing options", "Insert space before arguments", "println (10);", "println(10);");     // Catch: java.lang.Throwable -> L8
        er = new abcd.EnumMd("ARGUMENT_SPACE", 24, "JavaScript spacing options", "Insert space within argument parentheses", "println( 10 );", "println(10);");     // Catch: java.lang.Throwable -> L8
        yS = new abcd.EnumMd("ARGUMENTCOMMA_SPACE", 25, "JavaScript spacing options", "Insert space after each argument", "println(\"\", 20);", "println(\"\",20);");     // Catch: java.lang.Throwable -> L8
        gW = new abcd.EnumMd("ARRAYMETHODCALL_SPACE", 26, "JavaScript spacing options", "Insert space before array brackets", "i = ai [10];", "i = ai[10];");     // Catch: java.lang.Throwable -> L8
        BT = new abcd.EnumMd("ARRAYARGUMENT_SPACE", 27, "JavaScript spacing options", "Insert space within array brackets", "i = ai[ 10 ];", "i = ai[10];");     // Catch: java.lang.Throwable -> L8
        vy = new abcd.EnumMd("BINARYOPERATOR_SPACE", 28, "JavaScript spacing options", "Insert space around binary operator ", "i = 10 + 20;", "i = 10+20;");     // Catch: java.lang.Throwable -> L8
        P8 = new abcd.EnumMd("ASSIGNMENTOPERATOR_SPACE", 29, "JavaScript spacing options", "Insert space around assignment operator ", "i = 10;", "i=10;");     // Catch: java.lang.Throwable -> L8
        ei = new abcd.EnumMd[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7, tp, EQ, we, J0, J8, Ws, QX, XL, aM, j3, Mr, U2, a8, lg, rN, er, yS, gW, BT, vy, P8};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (SI == false) goto L12;
        abcd.wu.j6(th, -115988211802466091L, null);
    L12:
        throw th;
    }

    @abcd.Interfacesu(method = -28780557566718705L)
    private EnumMd(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        if (nw == false) goto L5;
        abcd.wu.j6(-1284683549143172405L, null, new java.lang.Object[]{r7, new java.lang.Integer(r8), r9, r10, r11, r12});
    L5:
        super(r7, r8);
        this.KD = r9;
        this.ro = r10;
        this.cn = r11;
        this.sh = r12;
    }

    public static java.util.Set<abcd.EnumMd> Hw() {
    L8:
        th = move-exception;
        if (SI == false) goto L12;
        abcd.wu.j6(th, 3933016721272153044L, null);
    L12:
        throw th;
    L4:
        if (nw == false) goto L6;
        abcd.wu.j6(3933016721272153044L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.HashSet r3 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L8
        r3.add(tp);     // Catch: java.lang.Throwable -> L8
        r3.add(XL);     // Catch: java.lang.Throwable -> L8
        r3.add(EQ);     // Catch: java.lang.Throwable -> L8
        r3.add(J0);     // Catch: java.lang.Throwable -> L8
        r3.add(J8);     // Catch: java.lang.Throwable -> L8
        r3.add(Ws);     // Catch: java.lang.Throwable -> L8
        r3.add(QX);     // Catch: java.lang.Throwable -> L8
        r3.add(Mr);     // Catch: java.lang.Throwable -> L8
        r3.add(U2);     // Catch: java.lang.Throwable -> L8
        r3.add(aM);     // Catch: java.lang.Throwable -> L8
        r3.add(yS);     // Catch: java.lang.Throwable -> L8
        r3.add(vy);     // Catch: java.lang.Throwable -> L8
        r3.add(P8);     // Catch: java.lang.Throwable -> L8
        r3.add(j6);     // Catch: java.lang.Throwable -> L8
        r3.add(DW);     // Catch: java.lang.Throwable -> L8
        r3.add(Hw);     // Catch: java.lang.Throwable -> L8
        r3.add(v5);     // Catch: java.lang.Throwable -> L8
        r3.add(gn);     // Catch: java.lang.Throwable -> L8
        r3.add(u7);     // Catch: java.lang.Throwable -> L8
        r3.add(VH);     // Catch: java.lang.Throwable -> L8
        return r3;
    }

    public static abcd.EnumMd valueOf(java.lang.String r5) {
    L8:
        th = move-exception;
        if (SI == false) goto L12;
        abcd.wu.j6(th, 50328437752500677L, null, r5);
    L12:
        throw th;
    L4:
        if (nw == false) goto L6;
        abcd.wu.j6(50328437752500677L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (abcd.EnumMd) java.lang.Enum.valueOf(abcd.EnumMd.class, r5);
    }

    public static abcd.EnumMd[] values() {
    L8:
        th = move-exception;
        if (SI == false) goto L12;
        abcd.wu.j6(th, 2737654238555108955L, null);
    L12:
        throw th;
    L4:
        if (nw == false) goto L6;
        abcd.wu.j6(2737654238555108955L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return (abcd.EnumMd[]) ei.clone();
    }

    public java.lang.String VH() {
    L8:
        th = move-exception;
        if (SI == false) goto L12;
        abcd.wu.j6(th, 2296097802242336160L, this);
    L12:
        throw th;
    L4:
        if (nw == false) goto L6;
        abcd.wu.j6(2296097802242336160L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return "js_" + name();
    }

    public java.lang.String Zo() {
    L8:
        th = move-exception;
        if (SI == false) goto L12;
        abcd.wu.j6(th, 3038399496167307399L, this);
    L12:
        throw th;
    L4:
        if (nw == false) goto L6;
        abcd.wu.j6(3038399496167307399L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.KD;
    }

    @Override
    public java.lang.String getName() {
    L8:
        th = move-exception;
        if (SI == false) goto L12;
        abcd.wu.j6(th, 540114126689509680L, this);
    L12:
        throw th;
    L4:
        if (nw == false) goto L6;
        abcd.wu.j6(540114126689509680L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.ro;
    }

    public java.lang.String j6(boolean r5) {
    L11:
        th = move-exception;
        if (SI == false) goto L15;
        abcd.wu.j6(th, 678787431545390580L, this, new java.lang.Boolean(r5));
    L15:
        throw th;
    L4:
        if (nw == false) goto L6;
        abcd.wu.j6(678787431545390580L, this, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r5 == false) goto L10;
        return this.cn;
    L10:
        return this.sh;
    }
}
