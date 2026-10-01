package abcd;

@abcd.Interfacexu
public final enum Enumid extends java.lang.Enum<abcd.Enumid> implements abcd.Interfaceha {
    public static final abcd.Enumid BT = null;
    public static final abcd.Enumid DW = null;
    public static final abcd.Enumid EQ = null;
    public static final abcd.Enumid FH = null;
    public static final abcd.Enumid Hw = null;
    public static final abcd.Enumid J0 = null;
    public static final abcd.Enumid J8 = null;

    @abcd.Interfacetu
    private static boolean KD;
    public static final abcd.Enumid Mr = null;
    public static final abcd.Enumid P8 = null;
    public static final abcd.Enumid QX = null;
    private static final abcd.Enumid[] SI = null;
    public static final abcd.Enumid U2 = null;
    public static final abcd.Enumid VH = null;
    public static final abcd.Enumid Ws = null;
    public static final abcd.Enumid XL = null;
    public static final abcd.Enumid Zo = null;
    public static final abcd.Enumid a8 = null;
    public static final abcd.Enumid aM = null;
    public static final abcd.Enumid ei = null;
    public static final abcd.Enumid er = null;
    public static final abcd.Enumid gW = null;
    public static final abcd.Enumid gn = null;
    public static final abcd.Enumid j3 = null;
    public static final abcd.Enumid j6 = null;
    public static final abcd.Enumid lg = null;
    public static final abcd.Enumid nw = null;
    public static final abcd.Enumid rN = null;

    @abcd.Interfaceuu
    private static boolean ro;
    public static final abcd.Enumid tp = null;
    public static final abcd.Enumid u7 = null;
    public static final abcd.Enumid v5 = null;
    public static final abcd.Enumid vy = null;
    public static final abcd.Enumid we = null;
    public static final abcd.Enumid yS = null;

    @abcd.Interfaceru(field = 2510266931594833500L)
    private final java.lang.String cb;

    @abcd.Interfaceru(field = 3166734490585680477L)
    private final java.lang.String cn;

    @abcd.Interfaceru(field = 2510358480665559783L)
    private final java.lang.String dx;

    @abcd.Interfaceru(field = -1406229274031606336L)
    private final java.lang.String sh;

    static {
        abcd.wu.j6(abcd.Enumid.class, 1094776438864368000L, 1094776438864368000L);     // Catch: java.lang.Throwable -> L8
        if (KD == false) goto L6;
        abcd.wu.j6(540383953189207412L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new abcd.Enumid("BLOCK_INDENT", 0, "Java indentation options", "Indent block contents", "public void f()\n{\n    int i;\n}", "public void f()\n{\nint i;\n}");     // Catch: java.lang.Throwable -> L8
        DW = new abcd.Enumid("ARRAY_INDENT", 1, "Java indentation options", "Indent array initializer", "int[] arr = new int[]\n{\n    1\n};", "int[] arr = new int[]\n{\n1\n};");     // Catch: java.lang.Throwable -> L8
        FH = new abcd.Enumid("BRACE_INDENT", 2, "Java indentation options", "Indent open and close brace", "public void f()\n    {\n        int i;\n    }", "public void f()\n{\n    int i;\n}");     // Catch: java.lang.Throwable -> L8
        Hw = new abcd.Enumid("CASE_INDENT", 3, "Java indentation options", "Indent case contents", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\n    case 10:\n    return 5;\n}");     // Catch: java.lang.Throwable -> L8
        v5 = new abcd.Enumid("CASELABEL_INDENT", 4, "Java indentation options", "Indent case labels", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\ncase 10:\n    return 5;\n}");     // Catch: java.lang.Throwable -> L8
        Zo = new abcd.Enumid("LABELLEFT_INDENT", 5, "Java indentation options", "Indent goto labels in leftmost column", "    goto L;\nL:\n    return;", "    goto L;\n    L:\n    return;");     // Catch: java.lang.Throwable -> L8
        VH = new abcd.Enumid("NEXTLINE_INDENT", 6, "Java indentation options", "Indent lines in multi line statements", "int i = 10 +\n    20;", "int i = 10 +\n20;");     // Catch: java.lang.Throwable -> L8
        gn = new abcd.Enumid("ARGUMENT_INDENT", 7, "Java indentation options", "Align arguments", "System.out.println(\"\",\n                  20);", "System.out.println(\"\",\n    20);");     // Catch: java.lang.Throwable -> L8
        u7 = new abcd.Enumid("PARAMETER_INDENT", 8, "Java indentation options", "Align parameters", "void foo(int i,\n         int j)\n{\n}", "void foo(int i,\n    int j)\n{\n}");     // Catch: java.lang.Throwable -> L8
        tp = new abcd.Enumid("ADJUST_NEWLINES", 9, "Java new line options", "Adjust lines on autoformat", "", "");     // Catch: java.lang.Throwable -> L8
        EQ = new abcd.Enumid("TYPE_NEWLINE", 10, "Java new line options", "Place open brace on new line for types", "public class C\n{\n    //...\n}", "public class C {\n    //...\n}");     // Catch: java.lang.Throwable -> L8
        we = new abcd.Enumid("METHOD_NEWLINE", 11, "Java new line options", "Place open brace on new line for methods", "public void f()\n{\n    //...\n}", "public void f() {\n    //...\n}");     // Catch: java.lang.Throwable -> L8
        J0 = new abcd.Enumid("BLOCK_NEWLINE", 12, "Java new line options", "Place open brace on new line for control blocks", "public void f()\n{\n    if (a < b)\n    {\n    }\n}", "public void f()\n{\n    if (a < b) {\n    }\n}");     // Catch: java.lang.Throwable -> L8
        J8 = new abcd.Enumid("ELSE_NEWLINE", 13, "Java new line options", "Place \"else\" on new line", "if (i == 10) {\n    return 10;\n}\nelse {\n    return 0;\n}", "if (i == 10) {\n    return 10;\n} else {\n    return 0;\n}");     // Catch: java.lang.Throwable -> L8
        Ws = new abcd.Enumid("CATCH_NEWLINE", 14, "Java new line options", "Place \"catch\" on new line", "try {\n}\ncatch {\n}", "try {\n} catch {\n}");     // Catch: java.lang.Throwable -> L8
        QX = new abcd.Enumid("FINALLY_NEWLINE", 15, "Java new line options", "Place \"finally\" on new line", "try {\n}\nfinally {\n}", "try {\n} finally {\n}");     // Catch: java.lang.Throwable -> L8
        XL = new abcd.Enumid("STATEMENT_WRAP", 16, "Java wrapping options", "Place statement in a new line if it doesn't fit", "int i;\ni = 10;", "int i; i = 10;");     // Catch: java.lang.Throwable -> L8
        aM = new abcd.Enumid("ADJUST_SPACES", 17, "Java spacing options", "Adjust spaces on autoformat", "", "");     // Catch: java.lang.Throwable -> L8
        j3 = new abcd.Enumid("BRACE_SPACE", 18, "Java spacing options", "Insert space before open brace", "public class C {\n    //...\n}", "public class C{\n    //...\n}");     // Catch: java.lang.Throwable -> L8
        Mr = new abcd.Enumid("METHODNAME_SPACE", 19, "Java spacing options", "Insert space before parameters", "public void f ()\n{\n}", "public void f()\n{\n}");     // Catch: java.lang.Throwable -> L8
        U2 = new abcd.Enumid("PARAMETER_SPACE", 20, "Java spacing options", "Insert space within parameter parentheses", "public void f( int i )\n{\n}", "public void f(int i)\n{\n}");     // Catch: java.lang.Throwable -> L8
        a8 = new abcd.Enumid("PARAMETERCOMMA_SPACE", 21, "Java spacing options", "Insert space after each parameter", "public void f(int i, int j)\n{\n}", "public void f(int i,int j)\n{\n}");     // Catch: java.lang.Throwable -> L8
        lg = new abcd.Enumid("KEYWORD_SPACE", 22, "Java spacing options", "Insert space after keywords", "if (a == b) return 0;", "if(a == b) return 0;");     // Catch: java.lang.Throwable -> L8
        rN = new abcd.Enumid("CONDITION_SPACE", 23, "Java spacing options", "Insert space within statement parentheses", "if ( a == b ) return 0;", "if (a == b) return 0;");     // Catch: java.lang.Throwable -> L8
        er = new abcd.Enumid("PAREN_SPACE", 24, "Java spacing options", "Insert space within parentheses", "int i = ( 10 + 20 ) * 5;", "int i = (10 + 20) * 5;");     // Catch: java.lang.Throwable -> L8
        yS = new abcd.Enumid("METHODCALL_SPACE", 25, "Java spacing options", "Insert space before arguments", "System.out.println (10);", "System.out.println(10);");     // Catch: java.lang.Throwable -> L8
        gW = new abcd.Enumid("ARGUMENT_SPACE", 26, "Java spacing options", "Insert space within argument parentheses", "System.out.println( 10 );", "System.out.println(10);");     // Catch: java.lang.Throwable -> L8
        BT = new abcd.Enumid("ARGUMENTCOMMA_SPACE", 27, "Java spacing options", "Insert space after each argument", "System.out.println(\"\", 20);", "System.out.println(\"\",20);");     // Catch: java.lang.Throwable -> L8
        vy = new abcd.Enumid("ARRAYMETHODCALL_SPACE", 28, "Java spacing options", "Insert space before array brackets", "int i = ai [10];", "int i = ai[10];");     // Catch: java.lang.Throwable -> L8
        P8 = new abcd.Enumid("ARRAYARGUMENT_SPACE", 29, "Java spacing options", "Insert space within array brackets", "int i = ai[ 10 ];", "int i = ai[10];");     // Catch: java.lang.Throwable -> L8
        ei = new abcd.Enumid("BINARYOPERATOR_SPACE", 30, "Java spacing options", "Insert space around binary operator ", "int i;\ni = 10 + 20;", "int i;\ni = 10+20;");     // Catch: java.lang.Throwable -> L8
        nw = new abcd.Enumid("ASSIGNMENTOPERATOR_SPACE", 31, "Java spacing options", "Insert space around assignment operator ", "int i;\ni = 10;", "int i;\ni=10;");     // Catch: java.lang.Throwable -> L8
        SI = new abcd.Enumid[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7, tp, EQ, we, J0, J8, Ws, QX, XL, aM, j3, Mr, U2, a8, lg, rN, er, yS, gW, BT, vy, P8, ei, nw};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (ro == false) goto L12;
        abcd.wu.j6(th, 540383953189207412L, null);
    L12:
        throw th;
    }

    @abcd.Interfacesu(method = 578015623927348331L)
    private Enumid(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        if (KD == false) goto L5;
        abcd.wu.j6(-952426344348692451L, null, new java.lang.Object[]{r7, new java.lang.Integer(r8), r9, r10, r11, r12});
    L5:
        super(r7, r8);
        this.cn = r9;
        this.sh = r10;
        this.cb = r11;
        this.dx = r12;
    }

    public static java.util.Set<abcd.Enumid> Hw() {
    L8:
        th = move-exception;
        if (ro == false) goto L12;
        abcd.wu.j6(th, -2382857888498655073L, null);
    L12:
        throw th;
    L4:
        if (KD == false) goto L6;
        abcd.wu.j6(-2382857888498655073L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.HashSet r3 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L8
        r3.add(tp);     // Catch: java.lang.Throwable -> L8
        r3.add(aM);     // Catch: java.lang.Throwable -> L8
        r3.add(EQ);     // Catch: java.lang.Throwable -> L8
        r3.add(we);     // Catch: java.lang.Throwable -> L8
        r3.add(J0);     // Catch: java.lang.Throwable -> L8
        r3.add(J8);     // Catch: java.lang.Throwable -> L8
        r3.add(Ws);     // Catch: java.lang.Throwable -> L8
        r3.add(QX);     // Catch: java.lang.Throwable -> L8
        r3.add(XL);     // Catch: java.lang.Throwable -> L8
        r3.add(a8);     // Catch: java.lang.Throwable -> L8
        r3.add(lg);     // Catch: java.lang.Throwable -> L8
        r3.add(j3);     // Catch: java.lang.Throwable -> L8
        r3.add(BT);     // Catch: java.lang.Throwable -> L8
        r3.add(ei);     // Catch: java.lang.Throwable -> L8
        r3.add(nw);     // Catch: java.lang.Throwable -> L8
        r3.add(j6);     // Catch: java.lang.Throwable -> L8
        r3.add(DW);     // Catch: java.lang.Throwable -> L8
        r3.add(Hw);     // Catch: java.lang.Throwable -> L8
        r3.add(v5);     // Catch: java.lang.Throwable -> L8
        r3.add(gn);     // Catch: java.lang.Throwable -> L8
        r3.add(u7);     // Catch: java.lang.Throwable -> L8
        r3.add(VH);     // Catch: java.lang.Throwable -> L8
        return r3;
    }

    public static abcd.Enumid valueOf(java.lang.String r5) {
    L8:
        th = move-exception;
        if (ro == false) goto L12;
        abcd.wu.j6(th, 607260265734887704L, null, r5);
    L12:
        throw th;
    L4:
        if (KD == false) goto L6;
        abcd.wu.j6(607260265734887704L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (abcd.Enumid) java.lang.Enum.valueOf(abcd.Enumid.class, r5);
    }

    public static abcd.Enumid[] values() {
    L8:
        th = move-exception;
        if (ro == false) goto L12;
        abcd.wu.j6(th, -1218289662645334608L, null);
    L12:
        throw th;
    L4:
        if (KD == false) goto L6;
        abcd.wu.j6(-1218289662645334608L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return (abcd.Enumid[]) SI.clone();
    }

    public java.lang.String VH() {
    L8:
        th = move-exception;
        if (ro == false) goto L12;
        abcd.wu.j6(th, -1631640819500988725L, this);
    L12:
        throw th;
    L4:
        if (KD == false) goto L6;
        abcd.wu.j6(-1631640819500988725L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return "java_" + name();
    }

    public java.lang.String Zo() {
    L8:
        th = move-exception;
        if (ro == false) goto L12;
        abcd.wu.j6(th, -2151561888893471040L, this);
    L12:
        throw th;
    L4:
        if (KD == false) goto L6;
        abcd.wu.j6(-2151561888893471040L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.cn;
    }

    @Override
    public java.lang.String getName() {
    L8:
        th = move-exception;
        if (ro == false) goto L12;
        abcd.wu.j6(th, 2838098658412436101L, this);
    L12:
        throw th;
    L4:
        if (KD == false) goto L6;
        abcd.wu.j6(2838098658412436101L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.sh;
    }

    public java.lang.String j6(boolean r5) {
    L11:
        th = move-exception;
        if (ro == false) goto L15;
        abcd.wu.j6(th, -475037024865059425L, this, new java.lang.Boolean(r5));
    L15:
        throw th;
    L4:
        if (KD == false) goto L6;
        abcd.wu.j6(-475037024865059425L, this, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r5 == false) goto L10;
        return this.cb;
    L10:
        return this.dx;
    }
}
