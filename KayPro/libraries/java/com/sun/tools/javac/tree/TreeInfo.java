package com.sun.tools.javac.tree;

import com.sun.source.tree.Tree;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.comp.AttrContext;
import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import java.util.Map;

public class TreeInfo {
    public static final int addPrec = 12;
    public static final int andPrec = 5;
    public static final int assignPrec = 1;
    public static final int assignopPrec = 2;
    public static final int bitandPrec = 8;
    public static final int bitorPrec = 6;
    public static final int bitxorPrec = 7;
    public static final int condPrec = 3;
    public static final int eqPrec = 9;
    public static final int mulPrec = 13;
    public static final int noPrec = 0;
    public static final int notExpression = -1;
    public static final int orPrec = 4;
    public static final int ordPrec = 10;
    public static final int postfixPrec = 15;
    public static final int precCount = 16;
    public static final int prefixPrec = 14;
    public static final int shiftPrec = 11;
    protected static final Context.C0723Key<TreeInfo> treeInfoKey = new Context.C0723Key<>();
    private Name[] opname = new Name[28];

    public static TreeInfo instance(Context context) {
        TreeInfo instance = (TreeInfo) context.m501get(treeInfoKey);
        if (instance == null) {
            return new TreeInfo(context);
        }
        return instance;
    }

    private TreeInfo(Context context) {
        context.m504put(treeInfoKey, this);
        Names names = Names.instance(context);
        this.opname[0] = names.fromString("+");
        this.opname[1] = names.hyphen;
        this.opname[2] = names.fromString("!");
        this.opname[3] = names.fromString("~");
        this.opname[4] = names.fromString("++");
        this.opname[5] = names.fromString("--");
        this.opname[6] = names.fromString("++");
        this.opname[7] = names.fromString("--");
        this.opname[8] = names.fromString("<*nullchk*>");
        this.opname[9] = names.fromString("||");
        this.opname[10] = names.fromString("&&");
        this.opname[14] = names.fromString("==");
        this.opname[15] = names.fromString("!=");
        this.opname[16] = names.fromString("<");
        this.opname[17] = names.fromString(">");
        this.opname[18] = names.fromString("<=");
        this.opname[19] = names.fromString(">=");
        this.opname[11] = names.fromString("|");
        this.opname[12] = names.fromString("^");
        this.opname[13] = names.fromString("&");
        this.opname[20] = names.fromString("<<");
        this.opname[21] = names.fromString(">>");
        this.opname[22] = names.fromString(">>>");
        this.opname[23] = names.fromString("+");
        this.opname[24] = names.hyphen;
        this.opname[25] = names.asterisk;
        this.opname[26] = names.slash;
        this.opname[27] = names.fromString("%");
    }

    public Name operatorName(int tag) {
        return this.opname[tag - 48];
    }

    public static boolean isConstructor(JCTree tree) {
        if (tree.getTag() != 4) {
            return false;
        }
        Name name = ((JCTree.JCMethodDecl) tree).name;
        return name == name.table.names.init;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasConstructors(List<JCTree> trees) {
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            if (isConstructor((JCTree) list.head)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMultiCatch(JCTree.JCCatch catchClause) {
        return catchClause.param.vartype.getTag() == 40;
    }

    public static boolean isSyntheticInit(JCTree stat) {
        Name selected;
        if (stat.getTag() == 20) {
            JCTree.JCExpressionStatement exec = (JCTree.JCExpressionStatement) stat;
            if (exec.expr.getTag() == 30) {
                JCTree.JCAssign assign = (JCTree.JCAssign) exec.expr;
                if (assign.f532lhs.getTag() == 34) {
                    JCTree.JCFieldAccess select = (JCTree.JCFieldAccess) assign.f532lhs;
                    if (select.f542sym != null && (select.f542sym.flags() & 4096) != 0 && (selected = name(select.selected)) != null && selected == selected.table.names._this) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static Name calledMethodName(JCTree tree) {
        if (tree.getTag() == 20) {
            JCTree.JCExpressionStatement exec = (JCTree.JCExpressionStatement) tree;
            if (exec.expr.getTag() == 26) {
                Name mname = name(((JCTree.JCMethodInvocation) exec.expr).meth);
                return mname;
            }
            return null;
        }
        return null;
    }

    public static boolean isSelfCall(JCTree tree) {
        Name name = calledMethodName(tree);
        if (name == null) {
            return false;
        }
        Names names = name.table.names;
        return name == names._this || name == names._super;
    }

    public static boolean isSuperCall(JCTree tree) {
        Name name = calledMethodName(tree);
        if (name == null) {
            return false;
        }
        Names names = name.table.names;
        return name == names._super;
    }

    public static boolean isInitialConstructor(JCTree tree) {
        JCTree.JCMethodInvocation app = firstConstructorCall(tree);
        if (app == null) {
            return false;
        }
        Name meth = name(app.meth);
        return meth == null || meth != meth.table.names._this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JCTree.JCMethodInvocation firstConstructorCall(JCTree tree) {
        if (tree.getTag() != 4) {
            return null;
        }
        JCTree.JCMethodDecl md = (JCTree.JCMethodDecl) tree;
        Names names = md.name.table.names;
        if (md.name != names.init || md.body == null) {
            return null;
        }
        List list = md.body.stats;
        while (list.nonEmpty() && isSyntheticInit((JCTree) list.head)) {
            list = list.tail;
        }
        if (list.isEmpty() || ((JCTree.JCStatement) list.head).getTag() != 20) {
            return null;
        }
        JCTree.JCExpressionStatement exec = (JCTree.JCExpressionStatement) list.head;
        if (exec.expr.getTag() != 26) {
            return null;
        }
        return (JCTree.JCMethodInvocation) exec.expr;
    }

    public static boolean isDiamond(JCTree tree) {
        int tag = tree.getTag();
        if (tag == 27) {
            return isDiamond(((JCTree.JCNewClass) tree).clazz);
        }
        if (tag == 39) {
            return ((JCTree.JCTypeApply) tree).getTypeArguments().isEmpty();
        }
        return false;
    }

    public static boolean isNull(JCTree tree) {
        if (tree.getTag() != 36) {
            return false;
        }
        JCTree.JCLiteral lit = (JCTree.JCLiteral) tree;
        return lit.typetag == 17;
    }

    public static int firstStatPos(JCTree tree) {
        if (tree.getTag() == 7 && ((JCTree.JCBlock) tree).stats.nonEmpty()) {
            return ((JCTree.JCBlock) tree).stats.head.f531pos;
        }
        return tree.f531pos;
    }

    public static int endPos(JCTree tree) {
        JCTree.JCBlock jCBlock;
        if (tree.getTag() == 7 && ((JCTree.JCBlock) tree).endpos != -1) {
            return ((JCTree.JCBlock) tree).endpos;
        }
        if (tree.getTag() == 15) {
            return endPos(((JCTree.JCSynchronized) tree).body);
        }
        if (tree.getTag() == 16) {
            JCTree.JCTry t = (JCTree.JCTry) tree;
            if (t.finalizer != null) {
                jCBlock = t.finalizer;
            } else {
                jCBlock = t.catchers.last().body;
            }
            return endPos(jCBlock);
        }
        return tree.f531pos;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static int getStartPos(com.sun.tools.javac.tree.JCTree r3) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.tools.javac.tree.TreeInfo.getStartPos(com.sun.tools.javac.tree.JCTree):int");
    }

    public static int getEndPos(JCTree tree, Map<JCTree, Integer> endPositions) {
        if (tree == null) {
            return -1;
        }
        if (endPositions == null) {
            return endPos(tree);
        }
        Integer mapPos = endPositions.get(tree);
        if (mapPos != null) {
            return mapPos.intValue();
        }
        int tag = tree.getTag();
        if (tag == 1) {
            return getEndPos(((JCTree.JCCompilationUnit) tree).defs.last(), endPositions);
        }
        if (tag == 42) {
            return getEndPos(((JCTree.JCWildcard) tree).inner, endPositions);
        }
        if (tag == 45) {
            return getEndPos(((JCTree.JCModifiers) tree).annotations.last(), endPositions);
        }
        if (tag == 31) {
            return getEndPos(((JCTree.JCTypeCast) tree).expr, endPositions);
        }
        if (tag == 32) {
            return getEndPos(((JCTree.JCInstanceOf) tree).clazz, endPositions);
        }
        switch (tag) {
            case 9:
                return getEndPos(((JCTree.JCWhileLoop) tree).body, endPositions);
            case 10:
                return getEndPos(((JCTree.JCForLoop) tree).body, endPositions);
            case 11:
                return getEndPos(((JCTree.JCEnhancedForLoop) tree).body, endPositions);
            case 12:
                return getEndPos(((JCTree.JCLabeledStatement) tree).body, endPositions);
            default:
                switch (tag) {
                    case 14:
                        return getEndPos(((JCTree.JCCase) tree).stats.last(), endPositions);
                    case 15:
                        return getEndPos(((JCTree.JCSynchronized) tree).body, endPositions);
                    case 16:
                        JCTree.JCTry node = (JCTree.JCTry) tree;
                        if (node.finalizer != null) {
                            return getEndPos(node.finalizer, endPositions);
                        }
                        if (!node.catchers.isEmpty()) {
                            return getEndPos(node.catchers.last(), endPositions);
                        }
                        return getEndPos(node.body, endPositions);
                    case 17:
                        return getEndPos(((JCTree.JCCatch) tree).body, endPositions);
                    case 18:
                        return getEndPos(((JCTree.JCConditional) tree).falsepart, endPositions);
                    case 19:
                        JCTree.JCIf node2 = (JCTree.JCIf) tree;
                        if (node2.elsepart == null) {
                            return getEndPos(node2.thenpart, endPositions);
                        }
                        return getEndPos(node2.elsepart, endPositions);
                    default:
                        switch (tag) {
                            case 47:
                                JCTree.JCErroneous node3 = (JCTree.JCErroneous) tree;
                                if (node3.errs != null && node3.errs.nonEmpty()) {
                                    return getEndPos(node3.errs.last(), endPositions);
                                }
                                return -1;
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                                return getEndPos(((JCTree.JCUnary) tree).f546arg, endPositions);
                            default:
                                switch (tag) {
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                        return getEndPos(((JCTree.JCBinary) tree).f537rhs, endPositions);
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
                                                return -1;
                                        }
                                    case 76:
                                    case 77:
                                    case 78:
                                        return getEndPos(((JCTree.JCAssignOp) tree).f535rhs, endPositions);
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public static JCDiagnostic.DiagnosticPosition diagEndPos(final JCTree tree) {
        final int endPos = endPos(tree);
        return new JCDiagnostic.DiagnosticPosition() {
            @Override
            public JCTree getTree() {
                return tree;
            }

            @Override
            public int getStartPosition() {
                return TreeInfo.getStartPos(tree);
            }

            @Override
            public int getPreferredPosition() {
                return endPos;
            }

            @Override
            public int getEndPosition(Map<JCTree, Integer> endPosTable) {
                return TreeInfo.getEndPos(tree, endPosTable);
            }
        };
    }

    public static int finalizerPos(JCTree tree) {
        if (tree.getTag() == 16) {
            JCTree.JCTry t = (JCTree.JCTry) tree;
            Assert.checkNonNull(t.finalizer);
            return firstStatPos(t.finalizer);
        }
        if (tree.getTag() == 15) {
            return endPos(((JCTree.JCSynchronized) tree).body);
        }
        throw new AssertionError();
    }

    public static int positionFor(Symbol sym, JCTree tree) {
        JCTree decl = declarationFor(sym, tree);
        return (decl != null ? decl : tree).f531pos;
    }

    public static JCDiagnostic.DiagnosticPosition diagnosticPositionFor(Symbol sym, JCTree tree) {
        JCTree decl = declarationFor(sym, tree);
        return (decl != null ? decl : tree).m489pos();
    }

    class C1DeclScanner extends TreeScanner {
        JCTree result = null;
        final Symbol val$sym;

        C1DeclScanner(Symbol symbol) {
            this.val$sym = symbol;
        }

        @Override
        public void scan(JCTree tree) {
            if (tree != null && this.result == null) {
                tree.accept(this);
            }
        }

        @Override
        public void visitTopLevel(JCTree.JCCompilationUnit that) {
            if (that.packge != this.val$sym) {
                super.visitTopLevel(that);
            } else {
                this.result = that;
            }
        }

        @Override
        public void visitClassDef(JCTree.JCClassDecl that) {
            if (that.f539sym != this.val$sym) {
                super.visitClassDef(that);
            } else {
                this.result = that;
            }
        }

        @Override
        public void visitMethodDef(JCTree.JCMethodDecl that) {
            if (that.f544sym != this.val$sym) {
                super.visitMethodDef(that);
            } else {
                this.result = that;
            }
        }

        @Override
        public void visitVarDef(JCTree.JCVariableDecl that) {
            if (that.f547sym != this.val$sym) {
                super.visitVarDef(that);
            } else {
                this.result = that;
            }
        }

        @Override
        public void visitTypeParameter(JCTree.JCTypeParameter that) {
            if (that.type == null || that.type.tsym != this.val$sym) {
                super.visitTypeParameter(that);
            } else {
                this.result = that;
            }
        }
    }

    public static JCTree declarationFor(Symbol sym, JCTree tree) {
        C1DeclScanner s = new C1DeclScanner(sym);
        tree.accept(s);
        return s.result;
    }

    public static Env<AttrContext> scopeFor(JCTree node, JCTree.JCCompilationUnit unit) {
        return scopeFor(pathFor(node, unit));
    }

    public static Env<AttrContext> scopeFor(List<JCTree> path) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    class C1Result extends Error {
        static final long serialVersionUID = -5942088234594905625L;
        List<JCTree> path;

        C1Result(List<JCTree> path) {
            this.path = path;
        }
    }

    public static List<JCTree> pathFor(final JCTree node, JCTree.JCCompilationUnit unit) {
        try {
            new TreeScanner() {
                List<JCTree> path = List.m507nil();

                @Override
                public void scan(JCTree tree) {
                    if (tree != null) {
                        this.path = this.path.prepend(tree);
                        if (tree == node) {
                            throw new C1Result(this.path);
                        }
                        super.scan(tree);
                        this.path = this.path.tail;
                    }
                }
            }.scan(unit);
            return List.m507nil();
        } catch (C1Result result) {
            return result.path;
        }
    }

    public static JCTree referencedStatement(JCTree.JCLabeledStatement tree) {
        JCTree t = tree;
        do {
            t = ((JCTree.JCLabeledStatement) t).body;
        } while (t.getTag() == 12);
        switch (t.getTag()) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                return t;
            case 12:
            default:
                return tree;
        }
    }

    public static JCTree.JCExpression skipParens(JCTree.JCExpression tree) {
        while (tree.getTag() == 29) {
            tree = ((JCTree.JCParens) tree).expr;
        }
        return tree;
    }

    public static JCTree skipParens(JCTree tree) {
        if (tree.getTag() == 29) {
            return skipParens((JCTree.JCExpression) tree);
        }
        return tree;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<Type> types(List<? extends JCTree> trees) {
        ListBuffer<Type> ts = new ListBuffer<>();
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            ts.append(((JCTree) list.head).type);
        }
        return ts.toList();
    }

    public static Name name(JCTree tree) {
        int tag = tree.getTag();
        if (tag == 34) {
            return ((JCTree.JCFieldAccess) tree).name;
        }
        if (tag == 35) {
            return ((JCTree.JCIdent) tree).name;
        }
        if (tag == 39) {
            return name(((JCTree.JCTypeApply) tree).clazz);
        }
        return null;
    }

    public static Name fullName(JCTree tree) {
        JCTree tree2 = skipParens(tree);
        int tag = tree2.getTag();
        if (tag != 34) {
            if (tag != 35) {
                return null;
            }
            return ((JCTree.JCIdent) tree2).name;
        }
        Name sname = fullName(((JCTree.JCFieldAccess) tree2).selected);
        if (sname == null) {
            return null;
        }
        return sname.append('.', name(tree2));
    }

    public static Symbol symbolFor(JCTree node) {
        JCTree node2 = skipParens(node);
        int tag = node2.getTag();
        if (tag == 3) {
            return ((JCTree.JCClassDecl) node2).f539sym;
        }
        if (tag == 4) {
            return ((JCTree.JCMethodDecl) node2).f544sym;
        }
        if (tag == 5) {
            return ((JCTree.JCVariableDecl) node2).f547sym;
        }
        return null;
    }

    public static boolean isDeclaration(JCTree node) {
        int tag = skipParens(node).getTag();
        if (tag == 3 || tag == 4 || tag == 5) {
            return true;
        }
        return false;
    }

    public static Symbol symbol(JCTree tree) {
        JCTree tree2 = skipParens(tree);
        int tag = tree2.getTag();
        if (tag == 34) {
            return ((JCTree.JCFieldAccess) tree2).f542sym;
        }
        if (tag == 35) {
            return ((JCTree.JCIdent) tree2).f543sym;
        }
        if (tag == 39) {
            return symbol(((JCTree.JCTypeApply) tree2).clazz);
        }
        return null;
    }

    public static boolean nonstaticSelect(JCTree tree) {
        JCTree tree2 = skipParens(tree);
        if (tree2.getTag() != 34) {
            return false;
        }
        JCTree.JCFieldAccess s = (JCTree.JCFieldAccess) tree2;
        Symbol e = symbol(s.selected);
        return e == null || !(e.kind == 1 || e.kind == 2);
    }

    public static void setSymbol(JCTree tree, Symbol sym) {
        JCTree tree2 = skipParens(tree);
        int tag = tree2.getTag();
        if (tag == 34) {
            ((JCTree.JCFieldAccess) tree2).f542sym = sym;
        } else if (tag == 35) {
            ((JCTree.JCIdent) tree2).f543sym = sym;
        }
    }

    public static long flags(JCTree tree) {
        int tag = tree.getTag();
        if (tag == 3) {
            return ((JCTree.JCClassDecl) tree).mods.flags;
        }
        if (tag == 4) {
            return ((JCTree.JCMethodDecl) tree).mods.flags;
        }
        if (tag == 5) {
            return ((JCTree.JCVariableDecl) tree).mods.flags;
        }
        if (tag == 7) {
            return ((JCTree.JCBlock) tree).flags;
        }
        return 0L;
    }

    public static long firstFlag(long flags) {
        int flag = 1;
        while ((flag & Flags.StandardFlags) != 0 && (((long) flag) & flags) == 0) {
            flag <<= 1;
        }
        return flag;
    }

    public static String flagNames(long flags) {
        return Flags.toString(4095 & flags).trim();
    }

    public static int opPrec(int op) {
        if (op == 30) {
            return 1;
        }
        if (op == 32) {
            return 10;
        }
        switch (op) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                return 14;
            case 54:
            case 55:
            case 56:
                return 15;
            case 57:
                return 4;
            case 58:
                return 5;
            case 59:
                return 6;
            case 60:
                return 7;
            case 61:
                return 8;
            case 62:
            case 63:
                return 9;
            case 64:
            case 65:
            case 66:
            case 67:
                return 10;
            case 68:
            case 69:
            case 70:
                return 11;
            case 71:
            case 72:
                return 12;
            case 73:
            case 74:
            case 75:
                return 13;
            case 76:
            case 77:
            case 78:
                return 2;
            default:
                switch (op) {
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                        return 2;
                    default:
                        throw new AssertionError();
                }
        }
    }

    static Tree.Kind tagToKind(int tag) {
        switch (tag) {
            case 48:
                return Tree.Kind.UNARY_PLUS;
            case 49:
                return Tree.Kind.UNARY_MINUS;
            case 50:
                return Tree.Kind.LOGICAL_COMPLEMENT;
            case 51:
                return Tree.Kind.BITWISE_COMPLEMENT;
            case 52:
                return Tree.Kind.PREFIX_INCREMENT;
            case 53:
                return Tree.Kind.PREFIX_DECREMENT;
            case 54:
                return Tree.Kind.POSTFIX_INCREMENT;
            case 55:
                return Tree.Kind.POSTFIX_DECREMENT;
            case 56:
                return Tree.Kind.OTHER;
            case 57:
                return Tree.Kind.CONDITIONAL_OR;
            case 58:
                return Tree.Kind.CONDITIONAL_AND;
            case 59:
                return Tree.Kind.OR;
            case 60:
                return Tree.Kind.XOR;
            case 61:
                return Tree.Kind.AND;
            case 62:
                return Tree.Kind.EQUAL_TO;
            case 63:
                return Tree.Kind.NOT_EQUAL_TO;
            case 64:
                return Tree.Kind.LESS_THAN;
            case 65:
                return Tree.Kind.GREATER_THAN;
            case 66:
                return Tree.Kind.LESS_THAN_EQUAL;
            case 67:
                return Tree.Kind.GREATER_THAN_EQUAL;
            case 68:
                return Tree.Kind.LEFT_SHIFT;
            case 69:
                return Tree.Kind.RIGHT_SHIFT;
            case 70:
                return Tree.Kind.UNSIGNED_RIGHT_SHIFT;
            case 71:
                return Tree.Kind.PLUS;
            case 72:
                return Tree.Kind.MINUS;
            case 73:
                return Tree.Kind.MULTIPLY;
            case 74:
                return Tree.Kind.DIVIDE;
            case 75:
                return Tree.Kind.REMAINDER;
            case 76:
                return Tree.Kind.OR_ASSIGNMENT;
            case 77:
                return Tree.Kind.XOR_ASSIGNMENT;
            case 78:
                return Tree.Kind.AND_ASSIGNMENT;
            default:
                switch (tag) {
                    case 85:
                        return Tree.Kind.LEFT_SHIFT_ASSIGNMENT;
                    case 86:
                        return Tree.Kind.RIGHT_SHIFT_ASSIGNMENT;
                    case 87:
                        return Tree.Kind.UNSIGNED_RIGHT_SHIFT_ASSIGNMENT;
                    case 88:
                        return Tree.Kind.PLUS_ASSIGNMENT;
                    case 89:
                        return Tree.Kind.MINUS_ASSIGNMENT;
                    case 90:
                        return Tree.Kind.MULTIPLY_ASSIGNMENT;
                    case 91:
                        return Tree.Kind.DIVIDE_ASSIGNMENT;
                    case 92:
                        return Tree.Kind.REMAINDER_ASSIGNMENT;
                    default:
                        return null;
                }
        }
    }

    public static JCTree.JCExpression typeIn(JCTree.JCExpression tree) {
        switch (tree.getTag()) {
            case 34:
            case 35:
            case 37:
            case 38:
            case 39:
            case 41:
            case 42:
                return tree;
            case 36:
            case 40:
            default:
                throw new AssertionError("Unexpected type tree: " + tree);
        }
    }

    public static JCTree innermostType(JCTree type) {
        int tag = type.getTag();
        if (tag == 38) {
            return innermostType(((JCTree.JCArrayTypeTree) type).elemtype);
        }
        if (tag == 42) {
            return innermostType(((JCTree.JCWildcard) type).inner);
        }
        return type;
    }
}
