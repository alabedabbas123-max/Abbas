package com.sun.tools.javac.parser;

import com.sun.tools.javac.code.BoundKind;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.jvm.ByteCodes;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Convert;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import java.util.HashMap;
import java.util.Map;

public class JavacParser implements Parser {
    static final int DIAMOND = 16;
    static final int EXPR = 1;
    static final int NOPARAMS = 4;
    static final int TYPE = 2;
    static final int TYPEARG = 8;
    private static final int infixPrecedenceLevels = 10;

    protected TreeMaker f478F;

    protected Lexer f479S;
    boolean allowAnnotations;
    boolean allowAsserts;
    boolean allowDiamond;
    boolean allowEnums;
    boolean allowForeach;
    boolean allowGenerics;
    boolean allowMulticatch;
    boolean allowStaticImport;
    boolean allowStringFolding;
    boolean allowTWR;
    boolean allowVarargs;
    private final Map<JCTree, String> docComments;
    private JCTree.JCErroneous errorTree;
    boolean keepDocComments;
    boolean keepLineMap;
    private Keywords keywords;

    private Log f480log;
    private Names names;
    private Source source;
    private int mode = 0;
    private int lastmode = 0;
    private int errorPos = -1;
    private int errorEndPos = -1;
    ListBuffer<JCTree.JCExpression[]> odStackSupply = new ListBuffer<>();
    ListBuffer<Token[]> opStackSupply = new ListBuffer<>();
    ListBuffer<int[]> posStackSupply = new ListBuffer<>();

    protected JavacParser(ParserFactory fac, Lexer S, boolean keepDocComments, boolean keepLineMap) {
        this.f479S = S;
        S.nextToken();
        this.f478F = fac.f482F;
        this.f480log = fac.f483log;
        this.names = fac.names;
        this.keywords = fac.keywords;
        Source source = fac.source;
        this.source = source;
        this.allowGenerics = source.allowGenerics();
        this.allowVarargs = this.source.allowVarargs();
        this.allowAsserts = this.source.allowAsserts();
        this.allowEnums = this.source.allowEnums();
        this.allowForeach = this.source.allowForeach();
        this.allowStaticImport = this.source.allowStaticImport();
        this.allowAnnotations = this.source.allowAnnotations();
        this.allowTWR = this.source.allowTryWithResources();
        this.allowDiamond = this.source.allowDiamond();
        this.allowMulticatch = this.source.allowMulticatch();
        this.allowStringFolding = fac.options.getBoolean("allowStringFolding", true);
        this.keepDocComments = keepDocComments;
        this.docComments = keepDocComments ? new HashMap() : null;
        this.keepLineMap = keepLineMap;
        this.errorTree = this.f478F.Erroneous();
    }

    private void skip(boolean stopAtImport, boolean stopAtMemberDecl, boolean stopAtIdentifier, boolean stopAtStatement) {
        while (true) {
            switch (C07091.$SwitchMap$com$sun$tools$javac$parser$Token[this.f479S.token().ordinal()]) {
                case 1:
                    this.f479S.nextToken();
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return;
                case 10:
                    if (stopAtImport) {
                        return;
                    }
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                    if (stopAtMemberDecl) {
                        return;
                    }
                    break;
                case 31:
                    if (stopAtIdentifier) {
                        return;
                    }
                    break;
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                    if (stopAtStatement) {
                        return;
                    }
                    break;
            }
            this.f479S.nextToken();
        }
    }

    private JCTree.JCErroneous syntaxError(int pos, String key, Token... args) {
        return syntaxError(pos, List.m507nil(), key, args);
    }

    private JCTree.JCErroneous syntaxError(int pos, List<JCTree> errs, String key, Token... args) {
        JCTree last;
        setErrorEndPos(pos);
        JCTree.JCErroneous err = this.f478F.m495at(pos).Erroneous(errs);
        reportSyntaxError(err, key, args);
        if (errs != null && (last = errs.last()) != null) {
            storeEnd(last, pos);
        }
        return (JCTree.JCErroneous) mo485toP(err);
    }

    private void reportSyntaxError(int pos, String key, Object... args) {
        JCDiagnostic.DiagnosticPosition diag = new JCDiagnostic.SimpleDiagnosticPosition(pos);
        reportSyntaxError(diag, key, args);
    }

    private void reportSyntaxError(JCDiagnostic.DiagnosticPosition diagPos, String key, Object... args) {
        int pos = diagPos.getPreferredPosition();
        if (pos > this.f479S.errPos() || pos == -1) {
            if (this.f479S.token() == Token.EOF) {
                error(diagPos, "premature.eof", new Object[0]);
            } else {
                error(diagPos, key, args);
            }
        }
        this.f479S.errPos(pos);
        if (this.f479S.mo487pos() == this.errorPos) {
            this.f479S.nextToken();
        }
        this.errorPos = this.f479S.mo487pos();
    }

    private JCTree.JCErroneous syntaxError(String key) {
        return syntaxError(this.f479S.mo487pos(), key, new Token[0]);
    }

    private JCTree.JCErroneous syntaxError(String key, Token arg) {
        return syntaxError(this.f479S.mo487pos(), key, arg);
    }

    public void accept(Token token) {
        if (this.f479S.token() == token) {
            this.f479S.nextToken();
        } else {
            setErrorEndPos(this.f479S.mo487pos());
            reportSyntaxError(this.f479S.prevEndPos(), "expected", token);
        }
    }

    JCTree.JCExpression illegal(int pos) {
        setErrorEndPos(pos);
        if ((this.mode & 1) != 0) {
            return syntaxError(pos, "illegal.start.of.expr", new Token[0]);
        }
        return syntaxError(pos, "illegal.start.of.type", new Token[0]);
    }

    JCTree.JCExpression illegal() {
        return illegal(this.f479S.mo487pos());
    }

    void checkNoMods(long mods) {
        if (mods != 0) {
            long lowestMod = (-mods) & mods;
            error(this.f479S.mo487pos(), "mod.not.allowed.here", Flags.asFlagSet(lowestMod));
        }
    }

    void attach(JCTree tree, String dc) {
        if (this.keepDocComments && dc != null) {
            this.docComments.put(tree, dc);
        }
    }

    private void setErrorEndPos(int errPos) {
        if (errPos > this.errorEndPos) {
            this.errorEndPos = errPos;
        }
    }

    protected int getErrorEndPos() {
        return this.errorEndPos;
    }

    protected void storeEnd(JCTree tree, int endpos) {
    }

    protected <T extends JCTree> T mo484to(T t) {
        return t;
    }

    protected <T extends JCTree> T mo485toP(T t) {
        return t;
    }

    public int getStartPos(JCTree tree) {
        return TreeInfo.getStartPos(tree);
    }

    public int getEndPos(JCTree tree) {
        return -1;
    }

    Name ident() {
        if (this.f479S.token() == Token.IDENTIFIER) {
            Name name = this.f479S.name();
            this.f479S.nextToken();
            return name;
        }
        if (this.f479S.token() == Token.ASSERT) {
            if (this.allowAsserts) {
                error(this.f479S.mo487pos(), "assert.as.identifier", new Object[0]);
                this.f479S.nextToken();
                return this.names.error;
            }
            warning(this.f479S.mo487pos(), "assert.as.identifier", new Object[0]);
            Name name2 = this.f479S.name();
            this.f479S.nextToken();
            return name2;
        }
        if (this.f479S.token() == Token.ENUM) {
            if (this.allowEnums) {
                error(this.f479S.mo487pos(), "enum.as.identifier", new Object[0]);
                this.f479S.nextToken();
                return this.names.error;
            }
            warning(this.f479S.mo487pos(), "enum.as.identifier", new Object[0]);
            Name name3 = this.f479S.name();
            this.f479S.nextToken();
            return name3;
        }
        accept(Token.IDENTIFIER);
        return this.names.error;
    }

    public JCTree.JCExpression qualident() {
        JCTree jCTreeMo485toP = mo485toP(this.f478F.m495at(this.f479S.mo487pos()).Ident(ident()));
        while (true) {
            JCTree.JCExpression t = (JCTree.JCExpression) jCTreeMo485toP;
            if (this.f479S.token() == Token.DOT) {
                int pos = this.f479S.mo487pos();
                this.f479S.nextToken();
                jCTreeMo485toP = mo485toP(this.f478F.m495at(pos).Select(t, ident()));
            } else {
                return t;
            }
        }
    }

    JCTree.JCExpression literal(Name prefix) {
        return literal(prefix, this.f479S.mo487pos());
    }

    JCTree.JCExpression literal(Name prefix, int pos) {
        Float n;
        Double n2;
        JCTree.JCExpression t = this.errorTree;
        switch (this.f479S.token()) {
            case INTLITERAL:
                try {
                    t = this.f478F.m495at(pos).Literal(4, Integer.valueOf(Convert.string2int(strval(prefix), this.f479S.radix())));
                } catch (NumberFormatException e) {
                    error(this.f479S.mo487pos(), "int.number.too.large", strval(prefix));
                }
                break;
            case LONGLITERAL:
                try {
                    t = this.f478F.m495at(pos).Literal(5, new Long(Convert.string2long(strval(prefix), this.f479S.radix())));
                } catch (NumberFormatException e2) {
                    error(this.f479S.mo487pos(), "int.number.too.large", strval(prefix));
                }
                break;
            case FLOATLITERAL:
                String proper = this.f479S.radix() == 16 ? "0x" + this.f479S.stringVal() : this.f479S.stringVal();
                try {
                    n = Float.valueOf(proper);
                } catch (NumberFormatException e3) {
                    n = Float.valueOf(Float.NaN);
                }
                if (n.floatValue() == 0.0f && !isZero(proper)) {
                    error(this.f479S.mo487pos(), "fp.number.too.small", new Object[0]);
                } else if (n.floatValue() == Float.POSITIVE_INFINITY) {
                    error(this.f479S.mo487pos(), "fp.number.too.large", new Object[0]);
                } else {
                    t = this.f478F.m495at(pos).Literal(6, n);
                }
                break;
            case DOUBLELITERAL:
                String proper2 = this.f479S.radix() == 16 ? "0x" + this.f479S.stringVal() : this.f479S.stringVal();
                try {
                    n2 = Double.valueOf(proper2);
                } catch (NumberFormatException e4) {
                    n2 = Double.valueOf(Double.NaN);
                }
                if (n2.doubleValue() == 0.0d && !isZero(proper2)) {
                    error(this.f479S.mo487pos(), "fp.number.too.small", new Object[0]);
                } else if (n2.doubleValue() == Double.POSITIVE_INFINITY) {
                    error(this.f479S.mo487pos(), "fp.number.too.large", new Object[0]);
                } else {
                    t = this.f478F.m495at(pos).Literal(7, n2);
                }
                break;
            case CHARLITERAL:
                t = this.f478F.m495at(pos).Literal(2, Integer.valueOf(this.f479S.stringVal().charAt(0) + 0));
                break;
            case STRINGLITERAL:
                t = this.f478F.m495at(pos).Literal(10, this.f479S.stringVal());
                break;
            case TRUE:
            case FALSE:
                t = this.f478F.m495at(pos).Literal(8, Integer.valueOf(this.f479S.token() != Token.TRUE ? 0 : 1));
                break;
            case NULL:
                t = this.f478F.m495at(pos).Literal(17, null);
                break;
            default:
                Assert.error();
                break;
        }
        if (t == this.errorTree) {
            t = this.f478F.m495at(pos).Erroneous();
        }
        storeEnd(t, this.f479S.endPos());
        this.f479S.nextToken();
        return t;
    }

    boolean isZero(String s) {
        char[] cs = s.toCharArray();
        int base = (cs.length <= 1 || Character.toLowerCase(cs[1]) != 'x') ? 10 : 16;
        int i = base == 16 ? 2 : 0;
        while (i < cs.length && (cs[i] == '0' || cs[i] == '.')) {
            i++;
        }
        return i >= cs.length || Character.digit(cs[i], base) <= 0;
    }

    String strval(Name prefix) {
        String s = this.f479S.stringVal();
        if (prefix.isEmpty()) {
            return s;
        }
        return ((Object) prefix) + s;
    }

    @Override
    public JCTree.JCExpression parseExpression() {
        return term(1);
    }

    @Override
    public JCTree.JCExpression parseType() {
        return term(2);
    }

    JCTree.JCExpression term(int newmode) {
        int prevmode = this.mode;
        this.mode = newmode;
        JCTree.JCExpression t = term();
        this.lastmode = this.mode;
        this.mode = prevmode;
        return t;
    }

    JCTree.JCExpression term() {
        JCTree.JCExpression t = term1();
        if (((this.mode & 1) != 0 && this.f479S.token() == Token.EQ) || (Token.PLUSEQ.compareTo(this.f479S.token()) <= 0 && this.f479S.token().compareTo(Token.GTGTGTEQ) <= 0)) {
            return termRest(t);
        }
        return t;
    }

    JCTree.JCExpression termRest(JCTree.JCExpression t) {
        switch (this.f479S.token()) {
            case EQ:
                int pos = this.f479S.mo487pos();
                this.f479S.nextToken();
                this.mode = 1;
                JCTree.JCExpression t1 = term();
                return (JCTree.JCExpression) mo485toP(this.f478F.m495at(pos).Assign(t, t1));
            case PLUSEQ:
            case SUBEQ:
            case STAREQ:
            case SLASHEQ:
            case PERCENTEQ:
            case AMPEQ:
            case BAREQ:
            case CARETEQ:
            case LTLTEQ:
            case GTGTEQ:
            case GTGTGTEQ:
                int pos2 = this.f479S.mo487pos();
                Token token = this.f479S.token();
                this.f479S.nextToken();
                this.mode = 1;
                JCTree.JCExpression t2 = term();
                return this.f478F.m495at(pos2).Assignop(optag(token), t, t2);
            default:
                return t;
        }
    }

    JCTree.JCExpression term1() {
        JCTree.JCExpression t = term2();
        if ((this.mode & 1) != 0 && this.f479S.token() == Token.QUES) {
            this.mode = 1;
            return term1Rest(t);
        }
        return t;
    }

    JCTree.JCExpression term1Rest(JCTree.JCExpression t) {
        if (this.f479S.token() == Token.QUES) {
            int pos = this.f479S.mo487pos();
            this.f479S.nextToken();
            JCTree.JCExpression t1 = term();
            accept(Token.COLON);
            JCTree.JCExpression t2 = term1();
            return this.f478F.m495at(pos).Conditional(t, t1, t2);
        }
        return t;
    }

    JCTree.JCExpression term2() {
        JCTree.JCExpression t = term3();
        if ((this.mode & 1) != 0 && prec(this.f479S.token()) >= 4) {
            this.mode = 1;
            return term2Rest(t, 4);
        }
        return t;
    }

    JCTree.JCExpression term2Rest(JCTree.JCExpression t, int minprec) {
        StringBuffer buf;
        List list = this.odStackSupply.elems;
        JCTree.JCExpression[] odStack = newOdStack();
        List list2 = this.opStackSupply.elems;
        Token[] opStack = newOpStack();
        List list3 = this.posStackSupply.elems;
        int[] posStack = newPosStack();
        int top = 0;
        odStack[0] = t;
        int startPos = this.f479S.mo487pos();
        Token topOp = Token.ERROR;
        int topOpPos = -1;
        while (prec(this.f479S.token()) >= minprec) {
            posStack[top] = topOpPos;
            opStack[top] = topOp;
            top++;
            topOp = this.f479S.token();
            topOpPos = this.f479S.mo487pos();
            this.f479S.nextToken();
            odStack[top] = topOp == Token.INSTANCEOF ? parseType() : term3();
            while (top > 0 && prec(topOp) >= prec(this.f479S.token())) {
                odStack[top - 1] = makeOp(topOpPos, topOp, odStack[top - 1], odStack[top]);
                top--;
                topOp = opStack[top];
                topOpPos = posStack[top];
            }
        }
        Assert.check(top == 0);
        JCTree.JCExpression t2 = odStack[0];
        if (t2.getTag() == 71 && (buf = foldStrings(t2)) != null) {
            t2 = (JCTree.JCExpression) mo485toP(this.f478F.m495at(startPos).Literal(10, buf.toString()));
        }
        this.odStackSupply.elems = list;
        this.opStackSupply.elems = list2;
        this.posStackSupply.elems = list3;
        return t2;
    }

    private JCTree.JCExpression makeOp(int pos, Token topOp, JCTree.JCExpression od1, JCTree.JCExpression od2) {
        if (topOp == Token.INSTANCEOF) {
            return this.f478F.m495at(pos).TypeTest(od1, od2);
        }
        return this.f478F.m495at(pos).Binary(optag(topOp), od1, od2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected StringBuffer foldStrings(JCTree tree) {
        if (!this.allowStringFolding) {
            return null;
        }
        List listM507nil = List.m507nil();
        while (tree.getTag() != 36) {
            if (tree.getTag() == 71) {
                JCTree.JCBinary op = (JCTree.JCBinary) tree;
                if (op.f537rhs.getTag() == 36) {
                    JCTree.JCLiteral lit = (JCTree.JCLiteral) op.f537rhs;
                    if (lit.typetag == 10) {
                        listM507nil = listM507nil.prepend((String) lit.value);
                        tree = op.f536lhs;
                    }
                }
            }
            return null;
        }
        JCTree.JCLiteral lit2 = (JCTree.JCLiteral) tree;
        if (lit2.typetag == 10) {
            StringBuffer sbuf = new StringBuffer((String) lit2.value);
            while (listM507nil.nonEmpty()) {
                sbuf.append((String) listM507nil.head);
                listM507nil = listM507nil.tail;
            }
            return sbuf;
        }
        return null;
    }

    private JCTree.JCExpression[] newOdStack() {
        if (this.odStackSupply.elems == this.odStackSupply.last) {
            this.odStackSupply.append(new JCTree.JCExpression[11]);
        }
        JCTree.JCExpression[] odStack = this.odStackSupply.elems.head;
        ListBuffer<JCTree.JCExpression[]> listBuffer = this.odStackSupply;
        listBuffer.elems = listBuffer.elems.tail;
        return odStack;
    }

    private Token[] newOpStack() {
        if (this.opStackSupply.elems == this.opStackSupply.last) {
            this.opStackSupply.append(new Token[11]);
        }
        Token[] opStack = this.opStackSupply.elems.head;
        ListBuffer<Token[]> listBuffer = this.opStackSupply;
        listBuffer.elems = listBuffer.elems.tail;
        return opStack;
    }

    private int[] newPosStack() {
        if (this.posStackSupply.elems == this.posStackSupply.last) {
            this.posStackSupply.append(new int[11]);
        }
        int[] posStack = this.posStackSupply.elems.head;
        ListBuffer<int[]> listBuffer = this.posStackSupply;
        listBuffer.elems = listBuffer.elems.tail;
        return posStack;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:126:0x0308 A[DONT_INVERT, FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:127:0x030a  */
    /* JADX WARN: Code duplicated, block: B:129:0x030f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0341  */
    /* JADX WARN: Code duplicated, block: B:134:0x0345  */
    /* JADX WARN: Code duplicated, block: B:137:0x034b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0362  */
    /* JADX WARN: Code duplicated, block: B:141:0x0372  */
    /* JADX WARN: Code duplicated, block: B:144:0x0379  */
    /* JADX WARN: Code duplicated, block: B:146:0x037e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0395  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:154:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:162:0x042d  */
    /* JADX WARN: Code duplicated, block: B:163:0x044c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0451  */
    /* JADX WARN: Code duplicated, block: B:169:0x0473  */
    /* JADX WARN: Code duplicated, block: B:171:0x047c  */
    /* JADX WARN: Code duplicated, block: B:250:0x046e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x041e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x047a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x03e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0377 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x03be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0211 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:89:0x0238  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.util.Collections$UnmodifiableCollection.add(Collections.java:1138)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    protected com.sun.tools.javac.tree.JCTree.JCExpression term3() {
        /*
            Method dump skipped, instruction units count: 1654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.tools.javac.parser.JavacParser.term3():com.sun.tools.javac.tree.JCTree$JCExpression");
    }

    JCTree.JCExpression superSuffix(List<JCTree.JCExpression> typeArgs, JCTree.JCExpression t) {
        this.f479S.nextToken();
        if (this.f479S.token() == Token.LPAREN || typeArgs != null) {
            return arguments(typeArgs, t);
        }
        int pos = this.f479S.mo487pos();
        accept(Token.DOT);
        return argumentsOpt(this.f479S.token() == Token.LT ? typeArguments(false) : null, (JCTree.JCExpression) mo485toP(this.f478F.m495at(pos).Select(t, ident())));
    }

    JCTree.JCPrimitiveTypeTree basicType() {
        JCTree.JCPrimitiveTypeTree t = (JCTree.JCPrimitiveTypeTree) mo484to(this.f478F.m495at(this.f479S.mo487pos()).TypeIdent(typetag(this.f479S.token())));
        this.f479S.nextToken();
        return t;
    }

    JCTree.JCExpression argumentsOpt(List<JCTree.JCExpression> typeArgs, JCTree.JCExpression t) {
        if (((this.mode & 1) != 0 && this.f479S.token() == Token.LPAREN) || typeArgs != null) {
            this.mode = 1;
            return arguments(typeArgs, t);
        }
        return t;
    }

    List<JCTree.JCExpression> arguments() {
        ListBuffer<JCTree.JCExpression> args = ListBuffer.m512lb();
        if (this.f479S.token() == Token.LPAREN) {
            this.f479S.nextToken();
            if (this.f479S.token() != Token.RPAREN) {
                args.append(parseExpression());
                while (this.f479S.token() == Token.COMMA) {
                    this.f479S.nextToken();
                    args.append(parseExpression());
                }
            }
            accept(Token.RPAREN);
        } else {
            syntaxError(this.f479S.mo487pos(), "expected", Token.LPAREN);
        }
        return args.toList();
    }

    JCTree.JCMethodInvocation arguments(List<JCTree.JCExpression> typeArgs, JCTree.JCExpression t) {
        int pos = this.f479S.mo487pos();
        List<JCTree.JCExpression> args = arguments();
        return (JCTree.JCMethodInvocation) mo485toP(this.f478F.m495at(pos).Apply(typeArgs, t, args));
    }

    JCTree.JCExpression typeArgumentsOpt(JCTree.JCExpression t) {
        if (this.f479S.token() == Token.LT) {
            int i = this.mode;
            if ((i & 2) != 0 && (i & 4) == 0) {
                this.mode = 2;
                checkGenerics();
                return typeArguments(t, false);
            }
        }
        return t;
    }

    List<JCTree.JCExpression> typeArgumentsOpt() {
        return typeArgumentsOpt(2);
    }

    List<JCTree.JCExpression> typeArgumentsOpt(int useMode) {
        if (this.f479S.token() == Token.LT) {
            checkGenerics();
            int i = this.mode;
            if ((i & useMode) == 0 || (i & 4) != 0) {
                illegal();
            }
            this.mode = useMode;
            return typeArguments(false);
        }
        return null;
    }

    List<JCTree.JCExpression> typeArguments(boolean diamondAllowed) {
        if (this.f479S.token() != Token.LT) {
            return List.m508of(syntaxError(this.f479S.mo487pos(), "expected", Token.LT));
        }
        this.f479S.nextToken();
        if (this.f479S.token() == Token.GT && diamondAllowed) {
            checkDiamond();
            this.mode |= 16;
            this.f479S.nextToken();
            return List.m507nil();
        }
        ListBuffer<JCTree.JCExpression> args = ListBuffer.m512lb();
        args.append((this.mode & 1) == 0 ? typeArgument() : parseType());
        while (this.f479S.token() == Token.COMMA) {
            this.f479S.nextToken();
            args.append((this.mode & 1) == 0 ? typeArgument() : parseType());
        }
        int i = C07091.$SwitchMap$com$sun$tools$javac$parser$Token[this.f479S.token().ordinal()];
        if (i == 66) {
            this.f479S.token(Token.GTEQ);
        } else if (i == 67) {
            this.f479S.token(Token.GTGTEQ);
        } else {
            switch (i) {
                case ByteCodes.dastore:
                    this.f479S.token(Token.EQ);
                    break;
                case ByteCodes.aastore:
                    this.f479S.token(Token.GTGT);
                    break;
                case ByteCodes.bastore:
                    this.f479S.token(Token.GT);
                    break;
                case 85:
                    this.f479S.nextToken();
                    break;
                default:
                    args.append(syntaxError(this.f479S.mo487pos(), "expected", Token.GT));
                    break;
            }
        }
        return args.toList();
    }

    JCTree.JCExpression typeArgument() {
        if (this.f479S.token() != Token.QUES) {
            return parseType();
        }
        int pos = this.f479S.mo487pos();
        this.f479S.nextToken();
        if (this.f479S.token() == Token.EXTENDS) {
            JCTree.TypeBoundKind t = (JCTree.TypeBoundKind) mo484to(this.f478F.m495at(pos).TypeBoundKind(BoundKind.EXTENDS));
            this.f479S.nextToken();
            JCTree.JCExpression bound = parseType();
            return this.f478F.m495at(pos).Wildcard(t, bound);
        }
        if (this.f479S.token() == Token.SUPER) {
            JCTree.TypeBoundKind t2 = (JCTree.TypeBoundKind) mo484to(this.f478F.m495at(pos).TypeBoundKind(BoundKind.SUPER));
            this.f479S.nextToken();
            JCTree.JCExpression bound2 = parseType();
            return this.f478F.m495at(pos).Wildcard(t2, bound2);
        }
        if (this.f479S.token() == Token.IDENTIFIER) {
            JCTree.TypeBoundKind t3 = this.f478F.m495at(-1).TypeBoundKind(BoundKind.UNBOUND);
            JCTree.JCExpression wc = (JCTree.JCExpression) mo485toP(this.f478F.m495at(pos).Wildcard(t3, null));
            JCTree.JCIdent id = (JCTree.JCIdent) mo485toP(this.f478F.m495at(this.f479S.mo487pos()).Ident(ident()));
            JCTree.JCErroneous err = this.f478F.m495at(pos).Erroneous(List.m509of((JCTree.JCIdent) wc, id));
            reportSyntaxError(err, "expected3", Token.GT, Token.EXTENDS, Token.SUPER);
            return err;
        }
        JCTree.TypeBoundKind t4 = (JCTree.TypeBoundKind) mo485toP(this.f478F.m495at(pos).TypeBoundKind(BoundKind.UNBOUND));
        return (JCTree.JCExpression) mo485toP(this.f478F.m495at(pos).Wildcard(t4, null));
    }

    JCTree.JCTypeApply typeArguments(JCTree.JCExpression t, boolean diamondAllowed) {
        int pos = this.f479S.mo487pos();
        List<JCTree.JCExpression> args = typeArguments(diamondAllowed);
        return (JCTree.JCTypeApply) mo485toP(this.f478F.m495at(pos).TypeApply(t, args));
    }

    private JCTree.JCExpression bracketsOpt(JCTree.JCExpression t) {
        if (this.f479S.token() == Token.LBRACKET) {
            int pos = this.f479S.mo487pos();
            this.f479S.nextToken();
            JCTree.JCExpression t2 = bracketsOptCont(t, pos);
            this.f478F.m495at(pos);
            return t2;
        }
        return t;
    }

    private JCTree.JCArrayTypeTree bracketsOptCont(JCTree.JCExpression t, int pos) {
        accept(Token.RBRACKET);
        return (JCTree.JCArrayTypeTree) mo485toP(this.f478F.m495at(pos).TypeArray(bracketsOpt(t)));
    }

    JCTree.JCExpression bracketsSuffix(JCTree.JCExpression t) {
        Name name;
        if ((this.mode & 1) == 0 || this.f479S.token() != Token.DOT) {
            if ((this.mode & 2) != 0) {
                this.mode = 2;
                return t;
            }
            syntaxError(this.f479S.mo487pos(), "dot.class.expected", new Token[0]);
            return t;
        }
        this.mode = 1;
        int pos = this.f479S.mo487pos();
        this.f479S.nextToken();
        accept(Token.CLASS);
        if (this.f479S.mo487pos() == this.errorEndPos) {
            if (this.f479S.token() == Token.IDENTIFIER) {
                name = this.f479S.name();
                this.f479S.nextToken();
            } else {
                name = this.names.error;
            }
            return this.f478F.m495at(pos).Erroneous(List.m508of(mo485toP(this.f478F.m495at(pos).Select(t, name))));
        }
        return (JCTree.JCExpression) mo485toP(this.f478F.m495at(pos).Select(t, this.names._class));
    }

    JCTree.JCExpression creator(int newpos, List<JCTree.JCExpression> typeArgs) {
        JCTree.JCExpression t;
        boolean diamondFound;
        int lastTypeargsPos;
        switch (this.f479S.token()) {
            case BYTE:
            case SHORT:
            case CHAR:
            case INT:
            case LONG:
            case FLOAT:
            case DOUBLE:
            case BOOLEAN:
                if (typeArgs == null) {
                    return arrayCreatorRest(newpos, basicType());
                }
                break;
        }
        JCTree.JCExpression t2 = qualident();
        int oldmode = this.mode;
        this.mode = 2;
        if (this.f479S.token() != Token.LT) {
            t = t2;
            diamondFound = false;
            lastTypeargsPos = -1;
        } else {
            checkGenerics();
            int lastTypeargsPos2 = this.f479S.mo487pos();
            JCTree.JCExpression t3 = typeArguments(t2, true);
            boolean diamondFound2 = (this.mode & 16) != 0;
            t = t3;
            diamondFound = diamondFound2;
            lastTypeargsPos = lastTypeargsPos2;
        }
        while (this.f479S.token() == Token.DOT) {
            if (diamondFound) {
                illegal();
            }
            int pos = this.f479S.mo487pos();
            this.f479S.nextToken();
            JCTree.JCExpression t4 = (JCTree.JCExpression) mo485toP(this.f478F.m495at(pos).Select(t, ident()));
            if (this.f479S.token() != Token.LT) {
                t = t4;
            } else {
                int lastTypeargsPos3 = this.f479S.mo487pos();
                checkGenerics();
                t = typeArguments(t4, true);
                lastTypeargsPos = lastTypeargsPos3;
                diamondFound = (this.mode & 16) != 0;
            }
        }
        this.mode = oldmode;
        if (this.f479S.token() == Token.LBRACKET) {
            JCTree.JCExpression e = arrayCreatorRest(newpos, t);
            if (diamondFound) {
                reportSyntaxError(lastTypeargsPos, "cannot.create.array.with.diamond", new Object[0]);
                return (JCTree.JCExpression) mo485toP(this.f478F.m495at(newpos).Erroneous(List.m508of(e)));
            }
            if (typeArgs != null) {
                int pos2 = newpos;
                if (!typeArgs.isEmpty() && typeArgs.head.f531pos != -1) {
                    pos2 = typeArgs.head.f531pos;
                }
                setErrorEndPos(this.f479S.prevEndPos());
                JCTree.JCErroneous err = this.f478F.m495at(pos2).Erroneous(typeArgs.prepend(e));
                reportSyntaxError(err, "cannot.create.array.with.type.arguments", new Object[0]);
                return (JCTree.JCExpression) mo485toP(err);
            }
            return e;
        }
        if (this.f479S.token() == Token.LPAREN) {
            return classCreatorRest(newpos, null, typeArgs, t);
        }
        setErrorEndPos(this.f479S.mo487pos());
        reportSyntaxError(this.f479S.mo487pos(), "expected2", Token.LPAREN, Token.LBRACKET);
        return (JCTree.JCExpression) mo485toP(this.f478F.m495at(newpos).Erroneous(List.m508of((JCTree.JCExpression) mo485toP(this.f478F.m495at(newpos).NewClass(null, typeArgs, t, List.m507nil(), null)))));
    }

    JCTree.JCExpression innerCreator(int newpos, List<JCTree.JCExpression> typeArgs, JCTree.JCExpression encl) {
        JCTree.JCExpression t = (JCTree.JCExpression) mo485toP(this.f478F.m495at(this.f479S.mo487pos()).Ident(ident()));
        if (this.f479S.token() == Token.LT) {
            int oldmode = this.mode;
            checkGenerics();
            t = typeArguments(t, true);
            this.mode = oldmode;
        }
        return classCreatorRest(newpos, encl, typeArgs, t);
    }

    JCTree.JCExpression arrayCreatorRest(int newpos, JCTree.JCExpression elemtype) {
        accept(Token.LBRACKET);
        if (this.f479S.token() == Token.RBRACKET) {
            accept(Token.RBRACKET);
            JCTree.JCExpression elemtype2 = bracketsOpt(elemtype);
            if (this.f479S.token() == Token.LBRACE) {
                return arrayInitializer(newpos, elemtype2);
            }
            JCTree.JCExpression t = (JCTree.JCExpression) mo485toP(this.f478F.m495at(newpos).NewArray(elemtype2, List.m507nil(), null));
            return syntaxError(this.f479S.mo487pos(), List.m508of(t), "array.dimension.missing", new Token[0]);
        }
        ListBuffer<JCTree.JCExpression> dims = new ListBuffer<>();
        dims.append(parseExpression());
        accept(Token.RBRACKET);
        while (this.f479S.token() == Token.LBRACKET) {
            int pos = this.f479S.mo487pos();
            this.f479S.nextToken();
            if (this.f479S.token() == Token.RBRACKET) {
                elemtype = bracketsOptCont(elemtype, pos);
            } else {
                dims.append(parseExpression());
                accept(Token.RBRACKET);
            }
        }
        return (JCTree.JCExpression) mo485toP(this.f478F.m495at(newpos).NewArray(elemtype, dims.toList(), null));
    }

    JCTree.JCNewClass classCreatorRest(int newpos, JCTree.JCExpression encl, List<JCTree.JCExpression> typeArgs, JCTree.JCExpression t) {
        JCTree.JCClassDecl body;
        List<JCTree.JCExpression> args = arguments();
        if (this.f479S.token() != Token.LBRACE) {
            body = null;
        } else {
            int pos = this.f479S.mo487pos();
            List<JCTree> defs = classOrInterfaceBody(this.names.empty, false);
            JCTree.JCModifiers mods = this.f478F.m495at(-1).Modifiers(0L);
            JCTree.JCClassDecl body2 = (JCTree.JCClassDecl) mo485toP(this.f478F.m495at(pos).AnonymousClassDef(mods, defs));
            body = body2;
        }
        return (JCTree.JCNewClass) mo485toP(this.f478F.m495at(newpos).NewClass(encl, typeArgs, t, args, body));
    }

    JCTree.JCExpression arrayInitializer(int newpos, JCTree.JCExpression t) {
        accept(Token.LBRACE);
        ListBuffer<JCTree.JCExpression> elems = new ListBuffer<>();
        if (this.f479S.token() == Token.COMMA) {
            this.f479S.nextToken();
        } else if (this.f479S.token() != Token.RBRACE) {
            elems.append(variableInitializer());
            while (this.f479S.token() == Token.COMMA) {
                this.f479S.nextToken();
                if (this.f479S.token() == Token.RBRACE) {
                    break;
                }
                elems.append(variableInitializer());
            }
        }
        accept(Token.RBRACE);
        return (JCTree.JCExpression) mo485toP(this.f478F.m495at(newpos).NewArray(t, List.m507nil(), elems.toList()));
    }

    public JCTree.JCExpression variableInitializer() {
        return this.f479S.token() == Token.LBRACE ? arrayInitializer(this.f479S.mo487pos(), null) : parseExpression();
    }

    JCTree.JCExpression parExpression() {
        accept(Token.LPAREN);
        JCTree.JCExpression t = parseExpression();
        accept(Token.RPAREN);
        return t;
    }

    JCTree.JCBlock block(int pos, long flags) {
        accept(Token.LBRACE);
        List<JCTree.JCStatement> stats = blockStatements();
        JCTree.JCBlock t = this.f478F.m495at(pos).Block(flags, stats);
        while (true) {
            if (this.f479S.token() == Token.CASE || this.f479S.token() == Token.DEFAULT) {
                syntaxError("orphaned", this.f479S.token());
                switchBlockStatementGroups();
            } else {
                t.endpos = this.f479S.mo487pos();
                accept(Token.RBRACE);
                return (JCTree.JCBlock) mo485toP(t);
            }
        }
    }

    public JCTree.JCBlock block() {
        return block(this.f479S.mo487pos(), 0L);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Code duplicated, block: B:57:0x019d  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b8  */
    List<JCTree.JCStatement> blockStatements() {
        JCTree.JCExpression t;
        int lastErrPos = -1;
        ListBuffer listBuffer = new ListBuffer();
        while (true) {
            int pos = this.f479S.mo487pos();
            int i = C07091.$SwitchMap$com$sun$tools$javac$parser$Token[this.f479S.token().ordinal()];
            if (i == 1) {
                listBuffer.append(parseStatement());
            } else if (i == 74) {
                if (!this.allowEnums && this.f479S.token() == Token.ENUM) {
                    error(this.f479S.mo487pos(), "local.enum", new Object[0]);
                    listBuffer.append(classOrInterfaceOrEnumDeclaration(modifiersOpt(), this.f479S.docComment()));
                } else if (!this.allowAsserts && this.f479S.token() == Token.ASSERT) {
                    listBuffer.append(parseStatement());
                } else {
                    Name name = this.f479S.name();
                    t = term(3);
                    if (this.f479S.token() == Token.COLON && t.getTag() == 35) {
                        this.f479S.nextToken();
                        JCTree.JCStatement stat = parseStatement();
                        listBuffer.append(this.f478F.m495at(pos).Labelled(name, stat));
                    } else if ((this.lastmode & 2) == 0 && (this.f479S.token() == Token.IDENTIFIER || this.f479S.token() == Token.ASSERT || this.f479S.token() == Token.ENUM)) {
                        int pos2 = this.f479S.mo487pos();
                        JCTree.JCModifiers mods = this.f478F.m495at(-1).Modifiers(0L);
                        this.f478F.m495at(pos2);
                        listBuffer.appendList(variableDeclarators(mods, t, new ListBuffer()));
                        storeEnd((JCTree) listBuffer.elems.last(), this.f479S.endPos());
                        accept(Token.SEMI);
                    } else {
                        listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                        accept(Token.SEMI);
                    }
                }
            } else if (i == 11) {
                listBuffer.append(parseStatement());
            } else if (i != 12) {
                if (i == 19) {
                    listBuffer.append(parseStatement());
                } else {
                    if (i != 20) {
                        switch (i) {
                            case 3:
                            case 5:
                                String dc = this.f479S.docComment();
                                JCTree.JCModifiers mods2 = modifiersOpt();
                                if (this.f479S.token() == Token.INTERFACE || this.f479S.token() == Token.CLASS || (this.allowEnums && this.f479S.token() == Token.ENUM)) {
                                    listBuffer.append(classOrInterfaceOrEnumDeclaration(mods2, dc));
                                } else {
                                    listBuffer.appendList(variableDeclarators(mods2, parseType(), new ListBuffer()));
                                    storeEnd((JCTree) listBuffer.elems.last(), this.f479S.endPos());
                                    accept(Token.SEMI);
                                }
                                break;
                            case 4:
                                String dc2 = this.f479S.docComment();
                                JCTree.JCModifiers mods3 = modifiersOpt();
                                listBuffer.append(classOrInterfaceOrEnumDeclaration(mods3, dc2));
                                break;
                            case 6:
                                break;
                            case 7:
                            case 8:
                                listBuffer.append(classOrInterfaceOrEnumDeclaration(modifiersOpt(), this.f479S.docComment()));
                                break;
                            case 9:
                                if (!this.allowEnums) {
                                    if (!this.allowAsserts) {
                                        Name name2 = this.f479S.name();
                                        t = term(3);
                                        if (this.f479S.token() == Token.COLON) {
                                            if ((this.lastmode & 2) == 0) {
                                                listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                                accept(Token.SEMI);
                                            } else {
                                                listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                                accept(Token.SEMI);
                                            }
                                        } else if ((this.lastmode & 2) == 0) {
                                            listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                            accept(Token.SEMI);
                                        } else {
                                            listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                            accept(Token.SEMI);
                                        }
                                    } else {
                                        Name name3 = this.f479S.name();
                                        t = term(3);
                                        if (this.f479S.token() == Token.COLON) {
                                            if ((this.lastmode & 2) == 0) {
                                                listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                                accept(Token.SEMI);
                                            } else {
                                                listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                                accept(Token.SEMI);
                                            }
                                        } else if ((this.lastmode & 2) == 0) {
                                            listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                            accept(Token.SEMI);
                                        } else {
                                            listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                            accept(Token.SEMI);
                                        }
                                    }
                                } else if (!this.allowAsserts) {
                                    Name name4 = this.f479S.name();
                                    t = term(3);
                                    if (this.f479S.token() == Token.COLON) {
                                        if ((this.lastmode & 2) == 0) {
                                            listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                            accept(Token.SEMI);
                                        } else {
                                            listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                            accept(Token.SEMI);
                                        }
                                    } else if ((this.lastmode & 2) == 0) {
                                        listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                        accept(Token.SEMI);
                                    } else {
                                        listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                        accept(Token.SEMI);
                                    }
                                } else {
                                    Name name5 = this.f479S.name();
                                    t = term(3);
                                    if (this.f479S.token() == Token.COLON) {
                                        if ((this.lastmode & 2) == 0) {
                                            listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                            accept(Token.SEMI);
                                        } else {
                                            listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                            accept(Token.SEMI);
                                        }
                                    } else if ((this.lastmode & 2) == 0) {
                                        listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                        accept(Token.SEMI);
                                    } else {
                                        listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                        accept(Token.SEMI);
                                    }
                                }
                                break;
                            default:
                                switch (i) {
                                    case 32:
                                    case 33:
                                        break;
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                        listBuffer.append(parseStatement());
                                        break;
                                    default:
                                        Name name6 = this.f479S.name();
                                        t = term(3);
                                        if (this.f479S.token() == Token.COLON) {
                                            if ((this.lastmode & 2) == 0) {
                                                listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                                accept(Token.SEMI);
                                            } else {
                                                listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                                accept(Token.SEMI);
                                            }
                                        } else if ((this.lastmode & 2) == 0) {
                                            listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                            accept(Token.SEMI);
                                        } else {
                                            listBuffer.append(mo484to(this.f478F.m495at(pos).Exec(checkExprStat(t))));
                                            accept(Token.SEMI);
                                        }
                                        break;
                                }
                                break;
                        }
                        return listBuffer.toList();
                    }
                    String dc3 = this.f479S.docComment();
                    JCTree.JCModifiers mods4 = modifiersOpt();
                    listBuffer.append(classOrInterfaceOrEnumDeclaration(mods4, dc3));
                }
            }
            if (this.f479S.mo487pos() == lastErrPos) {
                return listBuffer.toList();
            }
            if (this.f479S.mo487pos() <= this.errorEndPos) {
                skip(false, true, true, true);
                lastErrPos = this.f479S.mo487pos();
            }
            this.f479S.resetDeprecatedFlag();
        }
        return listBuffer.toList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40, types: [com.sun.tools.javac.tree.JCTree$JCExpression] */
    /* JADX WARN: Type inference failed for: r1v46, types: [com.sun.tools.javac.util.Name] */
    /* JADX WARN: Type inference failed for: r1v54, types: [com.sun.tools.javac.util.Name] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.sun.tools.javac.tree.JCTree$JCExpression] */
    /* JADX WARN: Type inference failed for: r2v37, types: [com.sun.tools.javac.tree.TreeMaker] */
    /* JADX WARN: Type inference failed for: r2v48, types: [com.sun.tools.javac.tree.TreeMaker] */
    /* JADX WARN: Type inference failed for: r2v56, types: [com.sun.tools.javac.tree.TreeMaker] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.sun.tools.javac.tree.TreeMaker] */
    @Override
    public JCTree.JCStatement parseStatement() {
        int pos = this.f479S.mo487pos();
        int i = C07091.$SwitchMap$com$sun$tools$javac$parser$Token[this.f479S.token().ordinal()];
        if (i == 1) {
            this.f479S.nextToken();
            return (JCTree.JCStatement) mo485toP(this.f478F.m495at(pos).Skip());
        }
        if (i == 11) {
            return block();
        }
        if (i == 19) {
            this.f479S.nextToken();
            JCTree.JCExpression lock = parExpression();
            JCTree.JCBlock body = block();
            return this.f478F.m495at(pos).Synchronized(lock, body);
        }
        if (i != 74) {
            switch (i) {
                case 34:
                    this.f479S.nextToken();
                    JCTree.JCExpression cond = parExpression();
                    JCTree.JCStatement thenpart = parseStatement();
                    JCTree.JCStatement elsepart = null;
                    if (this.f479S.token() == Token.ELSE) {
                        this.f479S.nextToken();
                        elsepart = parseStatement();
                    }
                    return this.f478F.m495at(pos).mo490If(cond, thenpart, elsepart);
                case 35:
                    this.f479S.nextToken();
                    accept(Token.LPAREN);
                    List<JCTree.JCStatement> inits = this.f479S.token() == Token.SEMI ? List.m507nil() : forInit();
                    if (inits.length() == 1 && inits.head.getTag() == 5 && ((JCTree.JCVariableDecl) inits.head).init == null && this.f479S.token() == Token.COLON) {
                        checkForeach();
                        JCTree.JCVariableDecl var = (JCTree.JCVariableDecl) inits.head;
                        accept(Token.COLON);
                        JCTree.JCExpression expr = parseExpression();
                        accept(Token.RPAREN);
                        JCTree.JCStatement body2 = parseStatement();
                        return this.f478F.m495at(pos).ForeachLoop(var, expr, body2);
                    }
                    accept(Token.SEMI);
                    java.lang.Object expression = this.f479S.token() != Token.SEMI ? parseExpression() : null;
                    accept(Token.SEMI);
                    List<JCTree.JCExpressionStatement> steps = this.f479S.token() == Token.RPAREN ? List.m507nil() : forUpdate();
                    accept(Token.RPAREN);
                    JCTree.JCStatement body3 = parseStatement();
                    return this.f478F.m495at(pos).ForLoop(inits, expression, steps, body3);
                case 36:
                    this.f479S.nextToken();
                    JCTree.JCExpression cond2 = parExpression();
                    JCTree.JCStatement body4 = parseStatement();
                    return this.f478F.m495at(pos).WhileLoop(cond2, body4);
                case 37:
                    this.f479S.nextToken();
                    JCTree.JCStatement body5 = parseStatement();
                    accept(Token.WHILE);
                    JCTree.JCExpression cond3 = parExpression();
                    JCTree.JCDoWhileLoop t = (JCTree.JCDoWhileLoop) mo484to(this.f478F.m495at(pos).DoLoop(body5, cond3));
                    accept(Token.SEMI);
                    return t;
                case 38:
                    this.f479S.nextToken();
                    List<JCTree> resources = List.m507nil();
                    if (this.f479S.token() == Token.LPAREN) {
                        checkTryWithResources();
                        this.f479S.nextToken();
                        resources = resources();
                        accept(Token.RPAREN);
                    }
                    JCTree.JCBlock body6 = block();
                    ListBuffer<JCTree.JCCatch> catchers = new ListBuffer<>();
                    JCTree.JCBlock finalizer = null;
                    if (this.f479S.token() == Token.CATCH || this.f479S.token() == Token.FINALLY) {
                        while (this.f479S.token() == Token.CATCH) {
                            catchers.append(catchClause());
                        }
                        if (this.f479S.token() == Token.FINALLY) {
                            this.f479S.nextToken();
                            finalizer = block();
                        }
                    } else if (this.allowTWR) {
                        if (resources.isEmpty()) {
                            error(pos, "try.without.catch.finally.or.resource.decls", new Object[0]);
                        }
                    } else {
                        error(pos, "try.without.catch.or.finally", new Object[0]);
                    }
                    return this.f478F.m495at(pos).mo492Try(resources, body6, catchers.toList(), finalizer);
                case 39:
                    this.f479S.nextToken();
                    JCTree.JCExpression selector = parExpression();
                    accept(Token.LBRACE);
                    List<JCTree.JCCase> cases = switchBlockStatementGroups();
                    JCTree.JCSwitch t2 = (JCTree.JCSwitch) mo484to(this.f478F.m495at(pos).Switch(selector, cases));
                    accept(Token.RBRACE);
                    return t2;
                case 40:
                    this.f479S.nextToken();
                    JCTree.JCReturn t3 = (JCTree.JCReturn) mo484to(this.f478F.m495at(pos).Return(this.f479S.token() != Token.SEMI ? parseExpression() : null));
                    accept(Token.SEMI);
                    return t3;
                case 41:
                    this.f479S.nextToken();
                    JCTree.JCExpression exc = parseExpression();
                    JCTree.JCThrow t4 = (JCTree.JCThrow) mo484to(this.f478F.m495at(pos).Throw(exc));
                    accept(Token.SEMI);
                    return t4;
                case 42:
                    this.f479S.nextToken();
                    JCTree.JCBreak t5 = (JCTree.JCBreak) mo484to(this.f478F.m495at(pos).Break((this.f479S.token() == Token.IDENTIFIER || this.f479S.token() == Token.ASSERT || this.f479S.token() == Token.ENUM) ? ident() : null));
                    accept(Token.SEMI);
                    return t5;
                case 43:
                    this.f479S.nextToken();
                    JCTree.JCContinue t6 = (JCTree.JCContinue) mo484to(this.f478F.m495at(pos).Continue((this.f479S.token() == Token.IDENTIFIER || this.f479S.token() == Token.ASSERT || this.f479S.token() == Token.ENUM) ? ident() : null));
                    accept(Token.SEMI);
                    return t6;
                case 44:
                    return (JCTree.JCStatement) mo485toP(this.f478F.Exec(syntaxError("else.without.if")));
                case 45:
                    return (JCTree.JCStatement) mo485toP(this.f478F.Exec(syntaxError("finally.without.try")));
                case 46:
                    return (JCTree.JCStatement) mo485toP(this.f478F.Exec(syntaxError("catch.without.try")));
            }
        }
        if (this.allowAsserts && this.f479S.token() == Token.ASSERT) {
            this.f479S.nextToken();
            JCTree.JCExpression assertion = parseExpression();
            JCTree.JCExpression message = null;
            if (this.f479S.token() == Token.COLON) {
                this.f479S.nextToken();
                message = parseExpression();
            }
            JCTree.JCAssert t7 = (JCTree.JCAssert) mo484to(this.f478F.m495at(pos).Assert(assertion, message));
            accept(Token.SEMI);
            return t7;
        }
        Name name = this.f479S.name();
        JCTree.JCExpression expr2 = parseExpression();
        if (this.f479S.token() == Token.COLON && expr2.getTag() == 35) {
            this.f479S.nextToken();
            JCTree.JCStatement stat = parseStatement();
            return this.f478F.m495at(pos).Labelled(name, stat);
        }
        JCTree.JCExpressionStatement stat2 = (JCTree.JCExpressionStatement) mo484to(this.f478F.m495at(pos).Exec(checkExprStat(expr2)));
        accept(Token.SEMI);
        return stat2;
    }

    protected JCTree.JCCatch catchClause() {
        JCTree.JCExpression paramType;
        int pos = this.f479S.mo487pos();
        accept(Token.CATCH);
        accept(Token.LPAREN);
        JCTree.JCModifiers mods = optFinal(Flags.PARAMETER);
        List<JCTree.JCExpression> catchTypes = catchTypes();
        if (catchTypes.size() > 1) {
            paramType = (JCTree.JCExpression) mo485toP(this.f478F.m495at(catchTypes.head.getStartPosition()).TypeUnion(catchTypes));
        } else {
            paramType = catchTypes.head;
        }
        JCTree.JCVariableDecl formal = variableDeclaratorId(mods, paramType);
        accept(Token.RPAREN);
        JCTree.JCBlock body = block();
        return this.f478F.m495at(pos).Catch(formal, body);
    }

    List<JCTree.JCExpression> catchTypes() {
        ListBuffer<JCTree.JCExpression> catchTypes = ListBuffer.m512lb();
        catchTypes.add(parseType());
        while (this.f479S.token() == Token.BAR) {
            checkMulticatch();
            this.f479S.nextToken();
            catchTypes.add(qualident());
        }
        return catchTypes.toList();
    }

    List<JCTree.JCCase> switchBlockStatementGroups() {
        ListBuffer<JCTree.JCCase> cases = new ListBuffer<>();
        while (true) {
            int pos = this.f479S.mo487pos();
            int i = C07091.$SwitchMap$com$sun$tools$javac$parser$Token[this.f479S.token().ordinal()];
            if (i == 6 || i == 12) {
                break;
            }
            if (i == 32) {
                this.f479S.nextToken();
                JCTree.JCExpression pat = parseExpression();
                accept(Token.COLON);
                List<JCTree.JCStatement> stats = blockStatements();
                JCTree.JCCase c = this.f478F.m495at(pos).Case(pat, stats);
                if (stats.isEmpty()) {
                    storeEnd(c, this.f479S.prevEndPos());
                }
                cases.append(c);
            } else if (i == 33) {
                this.f479S.nextToken();
                accept(Token.COLON);
                List<JCTree.JCStatement> stats2 = blockStatements();
                JCTree.JCCase c2 = this.f478F.m495at(pos).Case(null, stats2);
                if (stats2.isEmpty()) {
                    storeEnd(c2, this.f479S.prevEndPos());
                }
                cases.append(c2);
            } else {
                this.f479S.nextToken();
                syntaxError(pos, "expected3", Token.CASE, Token.DEFAULT, Token.RBRACE);
            }
        }
        return cases.toList();
    }

    <T extends ListBuffer<? super JCTree.JCExpressionStatement>> T moreStatementExpressions(int pos, JCTree.JCExpression first, T stats) {
        stats.append(mo485toP(this.f478F.m495at(pos).Exec(checkExprStat(first))));
        while (this.f479S.token() == Token.COMMA) {
            this.f479S.nextToken();
            int pos2 = this.f479S.mo487pos();
            JCTree.JCExpression t = parseExpression();
            stats.append(mo485toP(this.f478F.m495at(pos2).Exec(checkExprStat(t))));
        }
        return stats;
    }

    List<JCTree.JCStatement> forInit() {
        ListBuffer<JCTree.JCStatement> stats = ListBuffer.m512lb();
        int pos = this.f479S.mo487pos();
        if (this.f479S.token() == Token.FINAL || this.f479S.token() == Token.MONKEYS_AT) {
            return variableDeclarators(optFinal(0L), parseType(), stats).toList();
        }
        JCTree.JCExpression t = term(3);
        if ((this.lastmode & 2) != 0 && (this.f479S.token() == Token.IDENTIFIER || this.f479S.token() == Token.ASSERT || this.f479S.token() == Token.ENUM)) {
            return variableDeclarators(modifiersOpt(), t, stats).toList();
        }
        return moreStatementExpressions(pos, t, stats).toList();
    }

    List<JCTree.JCExpressionStatement> forUpdate() {
        return moreStatementExpressions(this.f479S.mo487pos(), parseExpression(), new ListBuffer()).toList();
    }

    List<JCTree.JCAnnotation> annotationsOpt() {
        if (this.f479S.token() != Token.MONKEYS_AT) {
            return List.m507nil();
        }
        ListBuffer<JCTree.JCAnnotation> buf = new ListBuffer<>();
        while (this.f479S.token() == Token.MONKEYS_AT) {
            int pos = this.f479S.mo487pos();
            this.f479S.nextToken();
            buf.append(annotation(pos));
        }
        return buf.toList();
    }

    JCTree.JCModifiers modifiersOpt() {
        return modifiersOpt(null);
    }

    protected JCTree.JCModifiers modifiersOpt(JCTree.JCModifiers partial) {
        long flags;
        int pos;
        long flag;
        ListBuffer<JCTree.JCAnnotation> annotations = new ListBuffer<>();
        if (partial == null) {
            flags = 0;
            pos = this.f479S.mo487pos();
        } else {
            flags = partial.flags;
            annotations.appendList(partial.annotations);
            pos = partial.f531pos;
        }
        if (this.f479S.deprecatedFlag()) {
            flags |= 131072;
            this.f479S.resetDeprecatedFlag();
        }
        while (true) {
            int i = C07091.$SwitchMap$com$sun$tools$javac$parser$Token[this.f479S.token().ordinal()];
            if (i == 2) {
                flag = 1;
            } else if (i == 3) {
                flag = 16;
            } else if (i == 4) {
                flag = 1024;
            } else if (i == 5) {
                flag = 8192;
            } else if (i != 86) {
                switch (i) {
                    case 13:
                        flag = 2;
                        break;
                    case 14:
                        flag = 4;
                        break;
                    case 15:
                        flag = 8;
                        break;
                    case 16:
                        flag = 128;
                        break;
                    case 17:
                        flag = 256;
                        break;
                    case 18:
                        flag = 64;
                        break;
                    case 19:
                        flag = 32;
                        break;
                    case 20:
                        flag = 2048;
                        break;
                    default:
                        int i2 = C07091.$SwitchMap$com$sun$tools$javac$parser$Token[this.f479S.token().ordinal()];
                        if (i2 == 8) {
                            flags |= 512;
                        } else if (i2 == 9) {
                            flags |= 16384;
                        }
                        if ((11775 & flags) == 0 && annotations.isEmpty()) {
                            pos = -1;
                        }
                        JCTree.JCModifiers mods = this.f478F.m495at(pos).Modifiers(flags, annotations.toList());
                        if (pos != -1) {
                            storeEnd(mods, this.f479S.prevEndPos());
                        }
                        return mods;
                }
            } else {
                flag = 0;
                this.f479S.nextToken();
            }
            if ((flags & flag) != 0) {
                error(this.f479S.mo487pos(), "repeated.modifier", new Object[0]);
            }
            int lastPos = this.f479S.mo487pos();
            this.f479S.nextToken();
            if (flag == 8192) {
                checkAnnotations();
                if (this.f479S.token() != Token.INTERFACE) {
                    JCTree.JCAnnotation ann = annotation(lastPos);
                    if (flags == 0 && annotations.isEmpty()) {
                        pos = ann.f531pos;
                    }
                    annotations.append(ann);
                    int lastPos2 = ann.f531pos;
                    flag = 0;
                }
            }
            flags |= flag;
        }
    }

    JCTree.JCAnnotation annotation(int pos) {
        checkAnnotations();
        JCTree.JCExpression ident = qualident();
        List<JCTree.JCExpression> fieldValues = annotationFieldValuesOpt();
        JCTree.JCAnnotation ann = this.f478F.m495at(pos).Annotation(ident, fieldValues);
        storeEnd(ann, this.f479S.prevEndPos());
        return ann;
    }

    List<JCTree.JCExpression> annotationFieldValuesOpt() {
        return this.f479S.token() == Token.LPAREN ? annotationFieldValues() : List.m507nil();
    }

    List<JCTree.JCExpression> annotationFieldValues() {
        accept(Token.LPAREN);
        ListBuffer<JCTree.JCExpression> buf = new ListBuffer<>();
        if (this.f479S.token() != Token.RPAREN) {
            buf.append(annotationFieldValue());
            while (this.f479S.token() == Token.COMMA) {
                this.f479S.nextToken();
                buf.append(annotationFieldValue());
            }
        }
        accept(Token.RPAREN);
        return buf.toList();
    }

    JCTree.JCExpression annotationFieldValue() {
        if (this.f479S.token() == Token.IDENTIFIER) {
            this.mode = 1;
            JCTree.JCExpression t1 = term1();
            if (t1.getTag() == 35 && this.f479S.token() == Token.EQ) {
                int pos = this.f479S.mo487pos();
                accept(Token.EQ);
                JCTree.JCExpression v = annotationValue();
                return (JCTree.JCExpression) mo485toP(this.f478F.m495at(pos).Assign(t1, v));
            }
            return t1;
        }
        return annotationValue();
    }

    JCTree.JCExpression annotationValue() {
        int i = C07091.$SwitchMap$com$sun$tools$javac$parser$Token[this.f479S.token().ordinal()];
        if (i == 5) {
            int pos = this.f479S.mo487pos();
            this.f479S.nextToken();
            return annotation(pos);
        }
        if (i == 11) {
            int pos2 = this.f479S.mo487pos();
            accept(Token.LBRACE);
            ListBuffer<JCTree.JCExpression> buf = new ListBuffer<>();
            if (this.f479S.token() != Token.RBRACE) {
                buf.append(annotationValue());
                while (this.f479S.token() == Token.COMMA) {
                    this.f479S.nextToken();
                    if (this.f479S.token() == Token.RBRACE) {
                        break;
                    }
                    buf.append(annotationValue());
                }
            }
            accept(Token.RBRACE);
            return (JCTree.JCExpression) mo485toP(this.f478F.m495at(pos2).NewArray(null, List.m507nil(), buf.toList()));
        }
        this.mode = 1;
        return term1();
    }

    public <T extends ListBuffer<? super JCTree.JCVariableDecl>> T variableDeclarators(JCTree.JCModifiers jCModifiers, JCTree.JCExpression jCExpression, T t) {
        return (T) variableDeclaratorsRest(this.f479S.mo487pos(), jCModifiers, jCExpression, ident(), false, null, t);
    }

    <T extends ListBuffer<? super JCTree.JCVariableDecl>> T variableDeclaratorsRest(int pos, JCTree.JCModifiers mods, JCTree.JCExpression type, Name name, boolean reqInit, String dc, T vdefs) {
        vdefs.append(variableDeclaratorRest(pos, mods, type, name, reqInit, dc));
        while (this.f479S.token() == Token.COMMA) {
            storeEnd((JCTree) vdefs.elems.last(), this.f479S.endPos());
            this.f479S.nextToken();
            vdefs.append(variableDeclarator(mods, type, reqInit, dc));
        }
        return vdefs;
    }

    JCTree.JCVariableDecl variableDeclarator(JCTree.JCModifiers mods, JCTree.JCExpression type, boolean reqInit, String dc) {
        return variableDeclaratorRest(this.f479S.mo487pos(), mods, type, ident(), reqInit, dc);
    }

    JCTree.JCVariableDecl variableDeclaratorRest(int pos, JCTree.JCModifiers mods, JCTree.JCExpression type, Name name, boolean reqInit, String dc) {
        JCTree.JCExpression type2 = bracketsOpt(type);
        JCTree.JCExpression init = null;
        if (this.f479S.token() == Token.EQ) {
            this.f479S.nextToken();
            init = variableInitializer();
        } else if (reqInit) {
            syntaxError(this.f479S.mo487pos(), "expected", Token.EQ);
        }
        JCTree.JCVariableDecl result = (JCTree.JCVariableDecl) mo485toP(this.f478F.m495at(pos).VarDef(mods, name, type2, init));
        attach(result, dc);
        return result;
    }

    JCTree.JCVariableDecl variableDeclaratorId(JCTree.JCModifiers mods, JCTree.JCExpression type) {
        int pos = this.f479S.mo487pos();
        Name name = ident();
        if ((mods.flags & Flags.VARARGS) != 0 && this.f479S.token() == Token.LBRACKET) {
            this.f480log.error(this.f479S.mo487pos(), "varargs.and.old.array.syntax", new Object[0]);
        }
        return (JCTree.JCVariableDecl) mo485toP(this.f478F.m495at(pos).VarDef(mods, name, bracketsOpt(type), null));
    }

    List<JCTree> resources() {
        ListBuffer<JCTree> defs = new ListBuffer<>();
        defs.append(resource());
        while (this.f479S.token() == Token.SEMI) {
            storeEnd(defs.elems.last(), this.f479S.endPos());
            this.f479S.mo487pos();
            this.f479S.nextToken();
            if (this.f479S.token() == Token.RPAREN) {
                break;
            }
            defs.append(resource());
        }
        return defs.toList();
    }

    protected JCTree resource() {
        JCTree.JCModifiers optFinal = optFinal(16L);
        JCTree.JCExpression type = parseType();
        int pos = this.f479S.mo487pos();
        Name ident = ident();
        return variableDeclaratorRest(pos, optFinal, type, ident, true, null);
    }

    @Override
    public JCTree.JCCompilationUnit parseCompilationUnit() {
        int pos = this.f479S.mo487pos();
        JCTree.JCExpression pid = null;
        String dc = this.f479S.docComment();
        JCTree.JCModifiers mods = null;
        List<JCTree.JCAnnotation> packageAnnotations = List.m507nil();
        if (this.f479S.token() == Token.MONKEYS_AT) {
            mods = modifiersOpt();
        }
        if (this.f479S.token() == Token.PACKAGE) {
            if (mods != null) {
                checkNoMods(mods.flags);
                packageAnnotations = mods.annotations;
                mods = null;
            }
            this.f479S.nextToken();
            pid = qualident();
            accept(Token.SEMI);
        }
        ListBuffer<JCTree> defs = new ListBuffer<>();
        boolean checkForImports = true;
        while (this.f479S.token() != Token.EOF) {
            if (this.f479S.mo487pos() <= this.errorEndPos) {
                skip(checkForImports, false, false, false);
                if (this.f479S.token() == Token.EOF) {
                    break;
                }
            }
            if (checkForImports && mods == null && this.f479S.token() == Token.IMPORT) {
                defs.append(importDeclaration());
            } else {
                JCTree def = typeDeclaration(mods);
                if (this.keepDocComments && dc != null && this.docComments.get(def) == dc) {
                    dc = null;
                }
                if (def instanceof JCTree.JCExpressionStatement) {
                    def = ((JCTree.JCExpressionStatement) def).expr;
                }
                defs.append(def);
                if (def instanceof JCTree.JCClassDecl) {
                    checkForImports = false;
                }
                mods = null;
            }
        }
        JCTree.JCCompilationUnit toplevel = this.f478F.m495at(pos).TopLevel(packageAnnotations, pid, defs.toList());
        attach(toplevel, dc);
        if (defs.elems.isEmpty()) {
            storeEnd(toplevel, this.f479S.prevEndPos());
        }
        if (this.keepDocComments) {
            toplevel.docComments = this.docComments;
        }
        if (this.keepLineMap) {
            toplevel.lineMap = this.f479S.getLineMap();
        }
        return toplevel;
    }

    JCTree importDeclaration() {
        int pos = this.f479S.mo487pos();
        this.f479S.nextToken();
        boolean importStatic = false;
        if (this.f479S.token() == Token.STATIC) {
            checkStaticImports();
            importStatic = true;
            this.f479S.nextToken();
        }
        JCTree.JCExpression pid = (JCTree.JCExpression) mo485toP(this.f478F.m495at(this.f479S.mo487pos()).Ident(ident()));
        do {
            int pos1 = this.f479S.mo487pos();
            accept(Token.DOT);
            if (this.f479S.token() == Token.STAR) {
                pid = (JCTree.JCExpression) mo484to(this.f478F.m495at(pos1).Select(pid, this.names.asterisk));
                this.f479S.nextToken();
                break;
            }
            pid = (JCTree.JCExpression) mo485toP(this.f478F.m495at(pos1).Select(pid, ident()));
        } while (this.f479S.token() == Token.DOT);
        accept(Token.SEMI);
        return mo485toP(this.f478F.m495at(pos).Import(pid, importStatic));
    }

    JCTree typeDeclaration(JCTree.JCModifiers mods) {
        int pos = this.f479S.mo487pos();
        if (mods == null && this.f479S.token() == Token.SEMI) {
            this.f479S.nextToken();
            return mo485toP(this.f478F.m495at(pos).Skip());
        }
        String dc = this.f479S.docComment();
        return classOrInterfaceOrEnumDeclaration(modifiersOpt(mods), dc);
    }

    JCTree.JCStatement classOrInterfaceOrEnumDeclaration(JCTree.JCModifiers mods, String dc) {
        List<JCTree> errs;
        List<JCTree> errs2;
        if (this.f479S.token() == Token.CLASS) {
            return classDeclaration(mods, dc);
        }
        if (this.f479S.token() == Token.INTERFACE) {
            return interfaceDeclaration(mods, dc);
        }
        if (this.allowEnums) {
            if (this.f479S.token() == Token.ENUM) {
                return enumDeclaration(mods, dc);
            }
            int pos = this.f479S.mo487pos();
            if (this.f479S.token() == Token.IDENTIFIER) {
                errs2 = List.m509of((JCTree) mods, mo485toP(this.f478F.m495at(pos).Ident(ident())));
                setErrorEndPos(this.f479S.mo487pos());
            } else {
                errs2 = List.m508of(mods);
            }
            return (JCTree.JCStatement) mo485toP(this.f478F.Exec(syntaxError(pos, errs2, "expected3", Token.CLASS, Token.INTERFACE, Token.ENUM)));
        }
        if (this.f479S.token() == Token.ENUM) {
            error(this.f479S.mo487pos(), "enums.not.supported.in.source", this.source.name);
            this.allowEnums = true;
            return enumDeclaration(mods, dc);
        }
        int pos2 = this.f479S.mo487pos();
        if (this.f479S.token() == Token.IDENTIFIER) {
            errs = List.m509of((JCTree) mods, mo485toP(this.f478F.m495at(pos2).Ident(ident())));
            setErrorEndPos(this.f479S.mo487pos());
        } else {
            errs = List.m508of(mods);
        }
        return (JCTree.JCStatement) mo485toP(this.f478F.Exec(syntaxError(pos2, errs, "expected2", Token.CLASS, Token.INTERFACE)));
    }

    JCTree.JCClassDecl classDeclaration(JCTree.JCModifiers mods, String dc) {
        JCTree.JCExpression extending;
        List<JCTree.JCExpression> implementing;
        int pos = this.f479S.mo487pos();
        accept(Token.CLASS);
        Name name = ident();
        List<JCTree.JCTypeParameter> typarams = typeParametersOpt();
        if (this.f479S.token() != Token.EXTENDS) {
            extending = null;
        } else {
            this.f479S.nextToken();
            JCTree.JCExpression extending2 = parseType();
            extending = extending2;
        }
        List<JCTree.JCExpression> implementing2 = List.m507nil();
        if (this.f479S.token() != Token.IMPLEMENTS) {
            implementing = implementing2;
        } else {
            this.f479S.nextToken();
            List<JCTree.JCExpression> implementing3 = typeList();
            implementing = implementing3;
        }
        List<JCTree> defs = classOrInterfaceBody(name, false);
        JCTree.JCClassDecl result = (JCTree.JCClassDecl) mo485toP(this.f478F.m495at(pos).ClassDef(mods, name, typarams, extending, implementing, defs));
        attach(result, dc);
        return result;
    }

    JCTree.JCClassDecl interfaceDeclaration(JCTree.JCModifiers mods, String dc) {
        List<JCTree.JCExpression> extending;
        int pos = this.f479S.mo487pos();
        accept(Token.INTERFACE);
        Name name = ident();
        List<JCTree.JCTypeParameter> typarams = typeParametersOpt();
        List<JCTree.JCExpression> extending2 = List.m507nil();
        if (this.f479S.token() != Token.EXTENDS) {
            extending = extending2;
        } else {
            this.f479S.nextToken();
            List<JCTree.JCExpression> extending3 = typeList();
            extending = extending3;
        }
        List<JCTree> defs = classOrInterfaceBody(name, true);
        JCTree.JCClassDecl result = (JCTree.JCClassDecl) mo485toP(this.f478F.m495at(pos).ClassDef(mods, name, typarams, null, extending, defs));
        attach(result, dc);
        return result;
    }

    JCTree.JCClassDecl enumDeclaration(JCTree.JCModifiers mods, String dc) {
        List<JCTree.JCExpression> implementing;
        int pos = this.f479S.mo487pos();
        accept(Token.ENUM);
        Name name = ident();
        List<JCTree.JCExpression> implementing2 = List.m507nil();
        if (this.f479S.token() != Token.IMPLEMENTS) {
            implementing = implementing2;
        } else {
            this.f479S.nextToken();
            List<JCTree.JCExpression> implementing3 = typeList();
            implementing = implementing3;
        }
        List<JCTree> defs = enumBody(name);
        mods.flags |= 16384;
        JCTree.JCClassDecl result = (JCTree.JCClassDecl) mo485toP(this.f478F.m495at(pos).ClassDef(mods, name, List.m507nil(), null, implementing, defs));
        attach(result, dc);
        return result;
    }

    List<JCTree> enumBody(Name enumName) {
        accept(Token.LBRACE);
        ListBuffer<JCTree> defs = new ListBuffer<>();
        if (this.f479S.token() == Token.COMMA) {
            this.f479S.nextToken();
        } else if (this.f479S.token() != Token.RBRACE && this.f479S.token() != Token.SEMI) {
            defs.append(enumeratorDeclaration(enumName));
            while (this.f479S.token() == Token.COMMA) {
                this.f479S.nextToken();
                if (this.f479S.token() == Token.RBRACE || this.f479S.token() == Token.SEMI) {
                    break;
                }
                defs.append(enumeratorDeclaration(enumName));
            }
            if (this.f479S.token() != Token.SEMI && this.f479S.token() != Token.RBRACE) {
                defs.append(syntaxError(this.f479S.mo487pos(), "expected3", Token.COMMA, Token.RBRACE, Token.SEMI));
                this.f479S.nextToken();
            }
        }
        if (this.f479S.token() == Token.SEMI) {
            this.f479S.nextToken();
            while (this.f479S.token() != Token.RBRACE && this.f479S.token() != Token.EOF) {
                defs.appendList(classOrInterfaceBodyDeclaration(enumName, false));
                if (this.f479S.mo487pos() <= this.errorEndPos) {
                    skip(false, true, true, false);
                }
            }
        }
        accept(Token.RBRACE);
        return defs.toList();
    }

    JCTree enumeratorDeclaration(Name enumName) {
        JCTree.JCClassDecl body;
        int createPos;
        String dc = this.f479S.docComment();
        int flags = 16409;
        if (this.f479S.deprecatedFlag()) {
            flags = 16409 | Flags.DEPRECATED;
            this.f479S.resetDeprecatedFlag();
        }
        int pos = this.f479S.mo487pos();
        List<JCTree.JCAnnotation> annotations = annotationsOpt();
        JCTree.JCModifiers mods = this.f478F.m495at(annotations.isEmpty() ? -1 : pos).Modifiers(flags, annotations);
        List<JCTree.JCExpression> typeArgs = typeArgumentsOpt();
        int identPos = this.f479S.mo487pos();
        Name name = ident();
        int createPos2 = this.f479S.mo487pos();
        List<JCTree.JCExpression> args = this.f479S.token() == Token.LPAREN ? arguments() : List.m507nil();
        if (this.f479S.token() != Token.LBRACE) {
            body = null;
        } else {
            JCTree.JCModifiers mods1 = this.f478F.m495at(-1).Modifiers(16392L);
            List<JCTree> defs = classOrInterfaceBody(this.names.empty, false);
            JCTree.JCClassDecl body2 = (JCTree.JCClassDecl) mo485toP(this.f478F.m495at(identPos).AnonymousClassDef(mods1, defs));
            body = body2;
        }
        if (args.isEmpty() && body == null) {
            createPos = identPos;
        } else {
            createPos = createPos2;
        }
        JCTree.JCIdent ident = this.f478F.m495at(identPos).Ident(enumName);
        int createPos3 = createPos;
        JCTree.JCNewClass create = this.f478F.m495at(createPos).NewClass(null, typeArgs, ident, args, body);
        if (createPos3 != identPos) {
            storeEnd(create, this.f479S.prevEndPos());
        }
        JCTree.JCIdent ident2 = this.f478F.m495at(identPos).Ident(enumName);
        JCTree result = mo485toP(this.f478F.m495at(pos).VarDef(mods, name, ident2, create));
        attach(result, dc);
        return result;
    }

    List<JCTree.JCExpression> typeList() {
        ListBuffer<JCTree.JCExpression> ts = new ListBuffer<>();
        ts.append(parseType());
        while (this.f479S.token() == Token.COMMA) {
            this.f479S.nextToken();
            ts.append(parseType());
        }
        return ts.toList();
    }

    List<JCTree> classOrInterfaceBody(Name className, boolean isInterface) {
        accept(Token.LBRACE);
        if (this.f479S.mo487pos() <= this.errorEndPos) {
            skip(false, true, false, false);
            if (this.f479S.token() == Token.LBRACE) {
                this.f479S.nextToken();
            }
        }
        ListBuffer<JCTree> defs = new ListBuffer<>();
        while (this.f479S.token() != Token.RBRACE && this.f479S.token() != Token.EOF) {
            defs.appendList(classOrInterfaceBodyDeclaration(className, isInterface));
            if (this.f479S.mo487pos() <= this.errorEndPos) {
                skip(false, true, true, false);
            }
        }
        accept(Token.RBRACE);
        return defs.toList();
    }

    protected List<JCTree> classOrInterfaceBodyDeclaration(Name className, boolean isInterface) {
        JCTree.JCExpression type;
        if (this.f479S.token() == Token.SEMI) {
            this.f479S.nextToken();
            return List.m507nil();
        }
        String dc = this.f479S.docComment();
        int pos = this.f479S.mo487pos();
        JCTree.JCModifiers mods = modifiersOpt();
        if (this.f479S.token() == Token.CLASS || this.f479S.token() == Token.INTERFACE || (this.allowEnums && this.f479S.token() == Token.ENUM)) {
            return List.m508of(classOrInterfaceOrEnumDeclaration(mods, dc));
        }
        if (this.f479S.token() == Token.LBRACE && !isInterface && (mods.flags & 4095 & (-9)) == 0 && mods.annotations.isEmpty()) {
            return List.m508of(block(pos, mods.flags));
        }
        int pos2 = this.f479S.mo487pos();
        List<JCTree.JCTypeParameter> typarams = typeParametersOpt();
        if (typarams.nonEmpty() && mods.f531pos == -1) {
            mods.f531pos = pos2;
            storeEnd(mods, pos2);
        }
        Name name = this.f479S.name();
        int pos3 = this.f479S.mo487pos();
        boolean isVoid = this.f479S.token() == Token.VOID;
        if (isVoid) {
            JCTree.JCExpression type2 = (JCTree.JCExpression) mo484to(this.f478F.m495at(pos3).TypeIdent(9));
            this.f479S.nextToken();
            type = type2;
        } else {
            JCTree.JCExpression type3 = parseType();
            type = type3;
        }
        if (this.f479S.token() == Token.LPAREN && !isInterface && type.getTag() == 35) {
            if (isInterface || name != className) {
                error(pos3, "invalid.meth.decl.ret.type.req", new Object[0]);
            }
            return List.m508of(methodDeclaratorRest(pos3, mods, null, this.names.init, typarams, isInterface, true, dc));
        }
        int pos4 = this.f479S.mo487pos();
        Name name2 = ident();
        if (this.f479S.token() == Token.LPAREN) {
            return List.m508of(methodDeclaratorRest(pos4, mods, type, name2, typarams, isInterface, isVoid, dc));
        }
        if (!isVoid && typarams.isEmpty()) {
            List<JCTree> defs = variableDeclaratorsRest(pos4, mods, type, name2, isInterface, dc, new ListBuffer()).toList();
            storeEnd(defs.last(), this.f479S.endPos());
            accept(Token.SEMI);
            return defs;
        }
        int pos5 = this.f479S.mo487pos();
        List<JCTree> err = isVoid ? List.m508of(mo485toP(this.f478F.m495at(pos5).MethodDef(mods, name2, type, typarams, List.m507nil(), List.m507nil(), null, null))) : null;
        return List.m508of(syntaxError(this.f479S.mo487pos(), err, "expected", Token.LPAREN));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    JCTree methodDeclaratorRest(int pos, JCTree.JCModifiers mods, JCTree.JCExpression type, Name name, List<JCTree.JCTypeParameter> typarams, boolean isInterface, boolean isVoid, String dc) {
        List<JCTree.JCExpression> thrown;
        JCTree.JCExpression defaultValue;
        JCTree.JCBlock body;
        JCTree.JCExpression defaultValue2;
        List<JCTree.JCVariableDecl> params = formalParameters();
        JCTree.JCExpression type2 = !isVoid ? bracketsOpt(type) : type;
        List<JCTree.JCExpression> thrown2 = List.m507nil();
        if (this.f479S.token() != Token.THROWS) {
            thrown = thrown2;
        } else {
            this.f479S.nextToken();
            List<JCTree.JCExpression> thrown3 = qualidentList();
            thrown = thrown3;
        }
        if (this.f479S.token() == Token.LBRACE) {
            JCTree.JCBlock body2 = block();
            body = body2;
            defaultValue2 = null;
        } else {
            if (this.f479S.token() == Token.DEFAULT) {
                accept(Token.DEFAULT);
                defaultValue = annotationValue();
            } else {
                defaultValue = null;
            }
            accept(Token.SEMI);
            if (this.f479S.mo487pos() <= this.errorEndPos) {
                skip(false, true, false, false);
                if (this.f479S.token() == Token.LBRACE) {
                    JCTree.JCBlock body3 = block();
                    body = body3;
                    defaultValue2 = defaultValue;
                } else {
                    body = null;
                    defaultValue2 = defaultValue;
                }
            } else {
                body = null;
                defaultValue2 = defaultValue;
            }
        }
        JCTree.JCMethodDecl result = (JCTree.JCMethodDecl) mo485toP(this.f478F.m495at(pos).MethodDef(mods, name, type2, typarams, params, thrown, body, defaultValue2));
        attach(result, dc);
        return result;
    }

    List<JCTree.JCExpression> qualidentList() {
        ListBuffer<JCTree.JCExpression> ts = new ListBuffer<>();
        ts.append(qualident());
        while (this.f479S.token() == Token.COMMA) {
            this.f479S.nextToken();
            ts.append(qualident());
        }
        return ts.toList();
    }

    List<JCTree.JCTypeParameter> typeParametersOpt() {
        if (this.f479S.token() == Token.LT) {
            checkGenerics();
            ListBuffer<JCTree.JCTypeParameter> typarams = new ListBuffer<>();
            this.f479S.nextToken();
            typarams.append(typeParameter());
            while (this.f479S.token() == Token.COMMA) {
                this.f479S.nextToken();
                typarams.append(typeParameter());
            }
            accept(Token.GT);
            return typarams.toList();
        }
        return List.m507nil();
    }

    JCTree.JCTypeParameter typeParameter() {
        int pos = this.f479S.mo487pos();
        Name name = ident();
        ListBuffer<JCTree.JCExpression> bounds = new ListBuffer<>();
        if (this.f479S.token() == Token.EXTENDS) {
            this.f479S.nextToken();
            bounds.append(parseType());
            while (this.f479S.token() == Token.AMP) {
                this.f479S.nextToken();
                bounds.append(parseType());
            }
        }
        return (JCTree.JCTypeParameter) mo485toP(this.f478F.m495at(pos).TypeParameter(name, bounds.toList()));
    }

    List<JCTree.JCVariableDecl> formalParameters() {
        ListBuffer<JCTree.JCVariableDecl> params = new ListBuffer<>();
        accept(Token.LPAREN);
        if (this.f479S.token() != Token.RPAREN) {
            JCTree.JCVariableDecl jCVariableDeclFormalParameter = formalParameter();
            JCTree.JCVariableDecl lastParam = jCVariableDeclFormalParameter;
            params.append(jCVariableDeclFormalParameter);
            while ((lastParam.mods.flags & Flags.VARARGS) == 0 && this.f479S.token() == Token.COMMA) {
                this.f479S.nextToken();
                JCTree.JCVariableDecl jCVariableDeclFormalParameter2 = formalParameter();
                lastParam = jCVariableDeclFormalParameter2;
                params.append(jCVariableDeclFormalParameter2);
            }
        }
        accept(Token.RPAREN);
        return params.toList();
    }

    JCTree.JCModifiers optFinal(long flags) {
        JCTree.JCModifiers mods = modifiersOpt();
        checkNoMods(mods.flags & (-131089));
        mods.flags |= flags;
        return mods;
    }

    protected JCTree.JCVariableDecl formalParameter() {
        JCTree.JCModifiers mods = optFinal(Flags.PARAMETER);
        JCTree.JCExpression type = parseType();
        if (this.f479S.token() == Token.ELLIPSIS) {
            checkVarargs();
            mods.flags |= Flags.VARARGS;
            type = (JCTree.JCExpression) mo484to(this.f478F.m495at(this.f479S.mo487pos()).TypeArray(type));
            this.f479S.nextToken();
        }
        return variableDeclaratorId(mods, type);
    }

    void error(int pos, String key, Object... args) {
        this.f480log.error(JCDiagnostic.DiagnosticFlag.SYNTAX, pos, key, args);
    }

    void error(JCDiagnostic.DiagnosticPosition pos, String key, Object... args) {
        this.f480log.error(JCDiagnostic.DiagnosticFlag.SYNTAX, pos, key, args);
    }

    void warning(int pos, String key, Object... args) {
        this.f480log.warning(pos, key, args);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036 A[FALL_THROUGH, RETURN] */
    protected JCTree.JCExpression checkExprStat(JCTree.JCExpression t) {
        int tag = t.getTag();
        if (tag != 26 && tag != 27 && tag != 30 && tag != 47) {
            switch (tag) {
                default:
                    switch (tag) {
                        default:
                            switch (tag) {
                                case 85:
                                case 86:
                                case 87:
                                case 88:
                                case 89:
                                case 90:
                                case 91:
                                case 92:
                                    break;
                                default:
                                    JCTree.JCExpression ret = this.f478F.m495at(t.f531pos).Erroneous(List.m508of(t));
                                    error(ret, "not.stmt", new Object[0]);
                                    return ret;
                            }
                        case 76:
                        case 77:
                        case 78:
                            return t;
                    }
                case 52:
                case 53:
                case 54:
                case 55:
                    return t;
            }
        }
        return t;
    }

    static int prec(Token token) {
        int oc = optag(token);
        if (oc >= 0) {
            return TreeInfo.opPrec(oc);
        }
        return -1;
    }

    static int earlier(int pos1, int pos2) {
        if (pos1 == -1) {
            return pos2;
        }
        if (pos2 == -1) {
            return pos1;
        }
        return pos1 < pos2 ? pos1 : pos2;
    }

    static int optag(Token token) {
        int i = C07091.$SwitchMap$com$sun$tools$javac$parser$Token[token.ordinal()];
        if (i == 21) {
            return 64;
        }
        switch (i) {
            case 57:
                return 88;
            case 58:
                return 89;
            case 59:
                return 90;
            case 60:
                return 91;
            case 61:
                return 92;
            case 62:
                return 78;
            case 63:
                return 76;
            case 64:
                return 77;
            case 65:
                return 85;
            case 66:
                return 86;
            case 67:
                return 87;
            default:
                switch (i) {
                    case ByteCodes.lastore:
                        return 71;
                    case ByteCodes.fastore:
                        return 72;
                    case ByteCodes.dastore:
                        return 67;
                    case ByteCodes.aastore:
                        return 70;
                    case ByteCodes.bastore:
                        return 69;
                    case 85:
                        return 65;
                    default:
                        switch (i) {
                            case 87:
                                return 57;
                            case 88:
                                return 58;
                            case 89:
                                return 59;
                            case 90:
                                return 60;
                            case 91:
                                return 61;
                            case 92:
                                return 62;
                            case 93:
                                return 63;
                            case ByteCodes.dup2_x2:
                                return 66;
                            case ByteCodes.swap:
                                return 68;
                            case ByteCodes.iadd:
                                return 73;
                            case ByteCodes.ladd:
                                return 74;
                            case ByteCodes.fadd:
                                return 75;
                            case ByteCodes.dadd:
                                return 32;
                            default:
                                return -1;
                        }
                }
        }
    }

    static int unoptag(Token token) {
        int i = C07091.$SwitchMap$com$sun$tools$javac$parser$Token[token.ordinal()];
        if (i == 68) {
            return 50;
        }
        if (i == 69) {
            return 51;
        }
        switch (i) {
            case 78:
                return 52;
            case ByteCodes.iastore:
                return 53;
            case ByteCodes.lastore:
                return 48;
            case ByteCodes.fastore:
                return 49;
            default:
                return -1;
        }
    }

    static int typetag(Token token) {
        switch (token) {
            case BYTE:
                return 1;
            case SHORT:
                return 3;
            case CHAR:
                return 2;
            case INT:
                return 4;
            case LONG:
                return 5;
            case FLOAT:
                return 6;
            case DOUBLE:
                return 7;
            case BOOLEAN:
                return 8;
            default:
                return -1;
        }
    }

    void checkGenerics() {
        if (!this.allowGenerics) {
            error(this.f479S.mo487pos(), "generics.not.supported.in.source", this.source.name);
            this.allowGenerics = true;
        }
    }

    void checkVarargs() {
        if (!this.allowVarargs) {
            error(this.f479S.mo487pos(), "varargs.not.supported.in.source", this.source.name);
            this.allowVarargs = true;
        }
    }

    void checkForeach() {
        if (!this.allowForeach) {
            error(this.f479S.mo487pos(), "foreach.not.supported.in.source", this.source.name);
            this.allowForeach = true;
        }
    }

    void checkStaticImports() {
        if (!this.allowStaticImport) {
            error(this.f479S.mo487pos(), "static.import.not.supported.in.source", this.source.name);
            this.allowStaticImport = true;
        }
    }

    void checkAnnotations() {
        if (!this.allowAnnotations) {
            error(this.f479S.mo487pos(), "annotations.not.supported.in.source", this.source.name);
            this.allowAnnotations = true;
        }
    }

    void checkDiamond() {
        if (!this.allowDiamond) {
            error(this.f479S.mo487pos(), "diamond.not.supported.in.source", this.source.name);
            this.allowDiamond = true;
        }
    }

    void checkMulticatch() {
        if (!this.allowMulticatch) {
            error(this.f479S.mo487pos(), "multicatch.not.supported.in.source", this.source.name);
            this.allowMulticatch = true;
        }
    }

    void checkTryWithResources() {
        if (!this.allowTWR) {
            error(this.f479S.mo487pos(), "try.with.resources.not.supported.in.source", this.source.name);
            this.allowTWR = true;
        }
    }
}
