package abcd;

@abcd.Interfacexu
public final class Enumid extends com.almlkaide.kaypro.internal.EnumBase implements abcd.Interfaceha {
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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(abcd.Enumid.class, 1094776438864368000L, 1094776438864368000L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (KD == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(540383953189207412L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = new abcd.Enumid("BLOCK_INDENT", 0, "Java indentation options", "Indent block contents", "public void f()\n{\n    int i;\n}", "public void f()\n{\nint i;\n}");
                        DW = new abcd.Enumid("ARRAY_INDENT", 1, "Java indentation options", "Indent array initializer", "int[] arr = new int[]\n{\n    1\n};", "int[] arr = new int[]\n{\n1\n};");
                        FH = new abcd.Enumid("BRACE_INDENT", 2, "Java indentation options", "Indent open and close brace", "public void f()\n    {\n        int i;\n    }", "public void f()\n{\n    int i;\n}");
                        Hw = new abcd.Enumid("CASE_INDENT", 3, "Java indentation options", "Indent case contents", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\n    case 10:\n    return 5;\n}");
                        v5 = new abcd.Enumid("CASELABEL_INDENT", 4, "Java indentation options", "Indent case labels", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\ncase 10:\n    return 5;\n}");
                        Zo = new abcd.Enumid("LABELLEFT_INDENT", 5, "Java indentation options", "Indent goto labels in leftmost column", "    goto L;\nL:\n    return;", "    goto L;\n    L:\n    return;");
                        VH = new abcd.Enumid("NEXTLINE_INDENT", 6, "Java indentation options", "Indent lines in multi line statements", "int i = 10 +\n    20;", "int i = 10 +\n20;");
                        gn = new abcd.Enumid("ARGUMENT_INDENT", 7, "Java indentation options", "Align arguments", "System.out.println(\"\",\n                  20);", "System.out.println(\"\",\n    20);");
                        u7 = new abcd.Enumid("PARAMETER_INDENT", 8, "Java indentation options", "Align parameters", "void foo(int i,\n         int j)\n{\n}", "void foo(int i,\n    int j)\n{\n}");
                        tp = new abcd.Enumid("ADJUST_NEWLINES", 9, "Java new line options", "Adjust lines on autoformat", "", "");
                        EQ = new abcd.Enumid("TYPE_NEWLINE", 10, "Java new line options", "Place open brace on new line for types", "public class C\n{\n    //...\n}", "public class C {\n    //...\n}");
                        we = new abcd.Enumid("METHOD_NEWLINE", 11, "Java new line options", "Place open brace on new line for methods", "public void f()\n{\n    //...\n}", "public void f() {\n    //...\n}");
                        J0 = new abcd.Enumid("BLOCK_NEWLINE", 12, "Java new line options", "Place open brace on new line for control blocks", "public void f()\n{\n    if (a < b)\n    {\n    }\n}", "public void f()\n{\n    if (a < b) {\n    }\n}");
                        J8 = new abcd.Enumid("ELSE_NEWLINE", 13, "Java new line options", "Place \"else\" on new line", "if (i == 10) {\n    return 10;\n}\nelse {\n    return 0;\n}", "if (i == 10) {\n    return 10;\n} else {\n    return 0;\n}");
                        Ws = new abcd.Enumid("CATCH_NEWLINE", 14, "Java new line options", "Place \"catch\" on new line", "try {\n}\ncatch {\n}", "try {\n} catch {\n}");
                        QX = new abcd.Enumid("FINALLY_NEWLINE", 15, "Java new line options", "Place \"finally\" on new line", "try {\n}\nfinally {\n}", "try {\n} finally {\n}");
                        XL = new abcd.Enumid("STATEMENT_WRAP", 16, "Java wrapping options", "Place statement in a new line if it doesn't fit", "int i;\ni = 10;", "int i; i = 10;");
                        aM = new abcd.Enumid("ADJUST_SPACES", 17, "Java spacing options", "Adjust spaces on autoformat", "", "");
                        j3 = new abcd.Enumid("BRACE_SPACE", 18, "Java spacing options", "Insert space before open brace", "public class C {\n    //...\n}", "public class C{\n    //...\n}");
                        Mr = new abcd.Enumid("METHODNAME_SPACE", 19, "Java spacing options", "Insert space before parameters", "public void f ()\n{\n}", "public void f()\n{\n}");
                        U2 = new abcd.Enumid("PARAMETER_SPACE", 20, "Java spacing options", "Insert space within parameter parentheses", "public void f( int i )\n{\n}", "public void f(int i)\n{\n}");
                        a8 = new abcd.Enumid("PARAMETERCOMMA_SPACE", 21, "Java spacing options", "Insert space after each parameter", "public void f(int i, int j)\n{\n}", "public void f(int i,int j)\n{\n}");
                        lg = new abcd.Enumid("KEYWORD_SPACE", 22, "Java spacing options", "Insert space after keywords", "if (a == b) return 0;", "if(a == b) return 0;");
                        rN = new abcd.Enumid("CONDITION_SPACE", 23, "Java spacing options", "Insert space within statement parentheses", "if ( a == b ) return 0;", "if (a == b) return 0;");
                        er = new abcd.Enumid("PAREN_SPACE", 24, "Java spacing options", "Insert space within parentheses", "int i = ( 10 + 20 ) * 5;", "int i = (10 + 20) * 5;");
                        yS = new abcd.Enumid("METHODCALL_SPACE", 25, "Java spacing options", "Insert space before arguments", "System.out.println (10);", "System.out.println(10);");
                        gW = new abcd.Enumid("ARGUMENT_SPACE", 26, "Java spacing options", "Insert space within argument parentheses", "System.out.println( 10 );", "System.out.println(10);");
                        BT = new abcd.Enumid("ARGUMENTCOMMA_SPACE", 27, "Java spacing options", "Insert space after each argument", "System.out.println(\"\", 20);", "System.out.println(\"\",20);");
                        vy = new abcd.Enumid("ARRAYMETHODCALL_SPACE", 28, "Java spacing options", "Insert space before array brackets", "int i = ai [10];", "int i = ai[10];");
                        P8 = new abcd.Enumid("ARRAYARGUMENT_SPACE", 29, "Java spacing options", "Insert space within array brackets", "int i = ai[ 10 ];", "int i = ai[10];");
                        ei = new abcd.Enumid("BINARYOPERATOR_SPACE", 30, "Java spacing options", "Insert space around binary operator ", "int i;\ni = 10 + 20;", "int i;\ni = 10+20;");
                        nw = new abcd.Enumid("ASSIGNMENTOPERATOR_SPACE", 31, "Java spacing options", "Insert space around assignment operator ", "int i;\ni = 10;", "int i;\ni=10;");
                        SI = new abcd.Enumid[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7, tp, EQ, we, J0, J8, Ws, QX, XL, aM, j3, Mr, U2, a8, lg, rN, er, yS, gW, BT, vy, P8, ei, nw};
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (ro == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 540383953189207412L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 578015623927348331L)
    private Enumid(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (KD == false) { $pc1 = 5; continue $sw1; }
                    abcd.wu.j6(-952426344348692451L, null, new java.lang.Object[]{r7, new java.lang.Integer(r8), r9, r10, r11, r12});
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    super(r7, r8);
                    this.cn = r9;
                    this.sh = r10;
                    this.cb = r11;
                    this.dx = r12;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.util.Set<abcd.Enumid> Hw() {
        java.util.HashSet r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (ro == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -2382857888498655073L, null);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (KD == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-2382857888498655073L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r3 = new java.util.HashSet();
                        r3.add(tp);
                        r3.add(aM);
                        r3.add(EQ);
                        r3.add(we);
                        r3.add(J0);
                        r3.add(J8);
                        r3.add(Ws);
                        r3.add(QX);
                        r3.add(XL);
                        r3.add(a8);
                        r3.add(lg);
                        r3.add(j3);
                        r3.add(BT);
                        r3.add(ei);
                        r3.add(nw);
                        r3.add(j6);
                        r3.add(DW);
                        r3.add(Hw);
                        r3.add(v5);
                        r3.add(gn);
                        r3.add(u7);
                        r3.add(VH);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Enumid valueOf(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (ro == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 607260265734887704L, null, r5);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (KD == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(607260265734887704L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return (abcd.Enumid) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Enumid.values(), r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Enumid[] values() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (ro == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -1218289662645334608L, null);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (KD == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-1218289662645334608L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return (abcd.Enumid[]) SI.clone();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String VH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (ro == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -1631640819500988725L, this);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (KD == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-1631640819500988725L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return "java_" + name();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String Zo() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (ro == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, -2151561888893471040L, this);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (KD == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-2151561888893471040L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return this.cn;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String getName() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (ro == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 2838098658412436101L, this);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (KD == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(2838098658412436101L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    return this.sh;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String j6(boolean r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 11: {
                    th = $ex8;
                    if (ro == false) { $pc8 = 15; continue $sw8; }
                    abcd.wu.j6(th, -475037024865059425L, this, new java.lang.Boolean(r5));
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (KD == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-475037024865059425L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 11; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    if (r5 == false) { $pc8 = 10; continue $sw8; }
                    return this.cb;
                }
                case 10: {
                    return this.dx;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
