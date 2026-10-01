package abcd;

@abcd.Interfacexu
public final class EnumMd extends com.almlkaide.kaypro.internal.EnumBase implements abcd.Interfaceha {
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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(abcd.EnumMd.class, 5387811553541438620L, 5387811553541438620L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (nw == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-115988211802466091L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = new abcd.EnumMd("BLOCK_INDENT", 0, "JavaScript indentation options", "Indent block contents", "{\n    foo();\n}", "{\nfoo();\n}");
                        DW = new abcd.EnumMd("ARRAY_INDENT", 1, "JavaScript indentation options", "Indent array/object initializer", "[\n    1\n];", "[\n1\n];");
                        FH = new abcd.EnumMd("BRACE_INDENT", 2, "JavaScript indentation options", "Indent open and close brace", "    {\n        foo();\n    }", "{\n    foo();\n}");
                        Hw = new abcd.EnumMd("CASE_INDENT", 3, "JavaScript indentation options", "Indent case contents", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\n    case 10:\n    return 5;\n}");
                        v5 = new abcd.EnumMd("CASELABEL_INDENT", 4, "JavaScript indentation options", "Indent case labels", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\ncase 10:\n    return 5;\n}");
                        Zo = new abcd.EnumMd("LABELLEFT_INDENT", 5, "JavaScript indentation options", "Indent goto labels in leftmost column", "    goto L;\nL:\n    return;", "    goto L;\n    L:\n    return;");
                        VH = new abcd.EnumMd("NEXTLINE_INDENT", 6, "JavaScript indentation options", "Indent lines in multi line statements", "i = 10 +\n    20;", "i = 10 +\n20;");
                        gn = new abcd.EnumMd("ARGUMENT_INDENT", 7, "JavaScript indentation options", "Align arguments", "println(\"\",\n                  20);", "println(\"\",\n    20);");
                        u7 = new abcd.EnumMd("PARAMETER_INDENT", 8, "JavaScript indentation options", "Align parameters", "foo(i,\n         j)\n{\n}", "foo(i,\n    j)\n{\n}");
                        tp = new abcd.EnumMd("ADJUST_NEWLINES", 9, "JavaScript new line options", "Adjust lines on autoformat", "", "");
                        EQ = new abcd.EnumMd("BLOCK_NEWLINE", 10, "JavaScript new line options", "Place open brace on new line for control blocks", "{\n    if (a < b)\n    {\n    }\n}", "{\n    if (a < b) {\n    }\n}");
                        we = new abcd.EnumMd("FUNCTION_NEWLINE", 11, "JavaScript new line options", "Place open brace on new line for functions", "function()\n{\n}", "function() {\n}");
                        J0 = new abcd.EnumMd("ELSE_NEWLINE", 12, "JavaScript new line options", "Place \"else\" on new line", "if (i == 10) {\n    return 10;\n}\nelse {\n    return 0;\n}", "if (i == 10) {\n    return 10;\n} else {\n    return 0;\n}");
                        J8 = new abcd.EnumMd("CATCH_NEWLINE", 13, "JavaScript new line options", "Place \"catch\" on new line", "try {\n}\ncatch {\n}", "try {\n} catch {\n}");
                        Ws = new abcd.EnumMd("FINALLY_NEWLINE", 14, "JavaScript new line options", "Place \"finally\" on new line", "try {\n}\nfinally {\n}", "try {\n} finally {\n}");
                        QX = new abcd.EnumMd("STATEMENT_WRAP", 15, "JavaScript wrapping options", "Place statement in a new line if it doesn't fit", "var i = 0;\ni = 10;", "var i = 0; i = 10;");
                        XL = new abcd.EnumMd("ADJUST_SPACES", 16, "JavaScript spacing options", "Adjust spaces on autoformat", "", "");
                        aM = new abcd.EnumMd("BRACE_SPACE", 17, "JavaScript spacing options", "Insert space before open brace", "if (true) {\n    //...\n}", "if (true){\n    //...\n}");
                        j3 = new abcd.EnumMd("PARAMETER_SPACE", 18, "JavaScript spacing options", "Insert space within parameter parentheses", "function f( i )\n{\n}", "function f(i)\n{\n}");
                        Mr = new abcd.EnumMd("PARAMETERCOMMA_SPACE", 19, "JavaScript spacing options", "Insert space after each parameter", "function f(i, j)\n{\n}", "function f(i,j)\n{\n}");
                        U2 = new abcd.EnumMd("KEYWORD_SPACE", 20, "JavaScript spacing options", "Insert space after keywords", "if (a == b) return 0;", "if(a == b) return 0;");
                        a8 = new abcd.EnumMd("CONDITION_SPACE", 21, "JavaScript spacing options", "Insert space within statement parentheses", "if ( a == b ) return 0;", "if (a == b) return 0;");
                        lg = new abcd.EnumMd("PAREN_SPACE", 22, "JavaScript spacing options", "Insert space within parentheses", "i = ( 10 + 20 ) * 5;", "i = (10 + 20) * 5;");
                        rN = new abcd.EnumMd("METHODCALL_SPACE", 23, "JavaScript spacing options", "Insert space before arguments", "println (10);", "println(10);");
                        er = new abcd.EnumMd("ARGUMENT_SPACE", 24, "JavaScript spacing options", "Insert space within argument parentheses", "println( 10 );", "println(10);");
                        yS = new abcd.EnumMd("ARGUMENTCOMMA_SPACE", 25, "JavaScript spacing options", "Insert space after each argument", "println(\"\", 20);", "println(\"\",20);");
                        gW = new abcd.EnumMd("ARRAYMETHODCALL_SPACE", 26, "JavaScript spacing options", "Insert space before array brackets", "i = ai [10];", "i = ai[10];");
                        BT = new abcd.EnumMd("ARRAYARGUMENT_SPACE", 27, "JavaScript spacing options", "Insert space within array brackets", "i = ai[ 10 ];", "i = ai[10];");
                        vy = new abcd.EnumMd("BINARYOPERATOR_SPACE", 28, "JavaScript spacing options", "Insert space around binary operator ", "i = 10 + 20;", "i = 10+20;");
                        P8 = new abcd.EnumMd("ASSIGNMENTOPERATOR_SPACE", 29, "JavaScript spacing options", "Insert space around assignment operator ", "i = 10;", "i=10;");
                        ei = new abcd.EnumMd[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7, tp, EQ, we, J0, J8, Ws, QX, XL, aM, j3, Mr, U2, a8, lg, rN, er, yS, gW, BT, vy, P8};
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (SI == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -115988211802466091L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -28780557566718705L)
    private EnumMd(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (nw == false) { $pc1 = 5; continue $sw1; }
                    abcd.wu.j6(-1284683549143172405L, null, new java.lang.Object[]{r7, new java.lang.Integer(r8), r9, r10, r11, r12});
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    super(r7, r8);
                    this.KD = r9;
                    this.ro = r10;
                    this.cn = r11;
                    this.sh = r12;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.util.Set<abcd.EnumMd> Hw() {
        java.util.HashSet r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (SI == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 3933016721272153044L, null);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (nw == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(3933016721272153044L, null);
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
                        r3.add(XL);
                        r3.add(EQ);
                        r3.add(J0);
                        r3.add(J8);
                        r3.add(Ws);
                        r3.add(QX);
                        r3.add(Mr);
                        r3.add(U2);
                        r3.add(aM);
                        r3.add(yS);
                        r3.add(vy);
                        r3.add(P8);
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

    public static abcd.EnumMd valueOf(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (SI == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 50328437752500677L, null, r5);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (nw == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(50328437752500677L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return (abcd.EnumMd) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.EnumMd.values(), r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.EnumMd[] values() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (SI == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 2737654238555108955L, null);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (nw == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(2737654238555108955L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return (abcd.EnumMd[]) ei.clone();
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
                    if (SI == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, 2296097802242336160L, this);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (nw == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(2296097802242336160L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return "js_" + name();
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
                    if (SI == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 3038399496167307399L, this);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (nw == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(3038399496167307399L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return this.KD;
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
                    if (SI == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 540114126689509680L, this);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (nw == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(540114126689509680L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    return this.ro;
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
                    if (SI == false) { $pc8 = 15; continue $sw8; }
                    abcd.wu.j6(th, 678787431545390580L, this, new java.lang.Boolean(r5));
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (nw == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(678787431545390580L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 11; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    if (r5 == false) { $pc8 = 10; continue $sw8; }
                    return this.cn;
                }
                case 10: {
                    return this.sh;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
