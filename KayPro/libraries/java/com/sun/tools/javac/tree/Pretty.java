package com.sun.tools.javac.tree;

import com.sun.tools.javac.code.BoundKind;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.util.Convert;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

public class Pretty extends JCTree.Visitor {
    Name enclClassName;

    Writer f548out;
    int prec;
    private final boolean sourceOutput;
    public int width = 4;
    int lmargin = 0;
    Map<JCTree, String> docComments = null;
    String lineSep = System.getProperty("line.separator");

    public Pretty(Writer out, boolean sourceOutput) {
        this.f548out = out;
        this.sourceOutput = sourceOutput;
    }

    void align() throws IOException {
        for (int i = 0; i < this.lmargin; i++) {
            this.f548out.write(" ");
        }
    }

    void indent() {
        this.lmargin += this.width;
    }

    void undent() {
        this.lmargin -= this.width;
    }

    void open(int contextPrec, int ownPrec) throws IOException {
        if (ownPrec < contextPrec) {
            this.f548out.write("(");
        }
    }

    void close(int contextPrec, int ownPrec) throws IOException {
        if (ownPrec < contextPrec) {
            this.f548out.write(")");
        }
    }

    public void print(Object s) throws IOException {
        this.f548out.write(Convert.escapeUnicode(s.toString()));
    }

    public void println() throws IOException {
        this.f548out.write(this.lineSep);
    }

    private static class UncheckedIOException extends Error {
        static final long serialVersionUID = -4032692679158424751L;

        UncheckedIOException(IOException e) {
            super(e.getMessage(), e);
        }
    }

    public void printExpr(JCTree tree, int prec) throws IOException {
        int prevPrec = this.prec;
        try {
            try {
                this.prec = prec;
                if (tree == null) {
                    print("/*missing*/");
                } else {
                    tree.accept(this);
                }
                this.prec = prevPrec;
            } catch (UncheckedIOException ex) {
                IOException e = new IOException(ex.getMessage());
                e.initCause(ex);
                throw e;
            }
        } catch (Throwable th) {
            this.prec = prevPrec;
            throw th;
        }
    }

    public void printExpr(JCTree tree) throws IOException {
        printExpr(tree, 0);
    }

    public void printStat(JCTree tree) throws IOException {
        printExpr(tree, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends JCTree> void printExprs(List<T> trees, String sep) throws IOException {
        if (trees.nonEmpty()) {
            printExpr(trees.head);
            for (List list = trees.tail; list.nonEmpty(); list = list.tail) {
                print(sep);
                printExpr((JCTree) list.head);
            }
        }
    }

    public <T extends JCTree> void printExprs(List<T> trees) throws IOException {
        printExprs(trees, ", ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void printStats(List<? extends JCTree> trees) throws IOException {
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            align();
            printStat((JCTree) list.head);
            println();
        }
    }

    public void printFlags(long flags) throws IOException {
        if ((4096 & flags) != 0) {
            print("/*synthetic*/ ");
        }
        print(TreeInfo.flagNames(flags));
        if ((4095 & flags) != 0) {
            print(" ");
        }
        if ((8192 & flags) != 0) {
            print("@");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void printAnnotations(List<JCTree.JCAnnotation> trees) throws IOException {
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            printStat((JCTree) list.head);
            println();
            align();
        }
    }

    public void printDocComment(JCTree tree) throws IOException {
        String dc;
        Map<JCTree, String> map = this.docComments;
        if (map != null && (dc = map.get(tree)) != null) {
            print("/**");
            println();
            int pos = 0;
            int endpos = lineEndPos(dc, 0);
            while (pos < dc.length()) {
                align();
                print(" *");
                if (pos < dc.length() && dc.charAt(pos) > ' ') {
                    print(" ");
                }
                print(dc.substring(pos, endpos));
                println();
                pos = endpos + 1;
                endpos = lineEndPos(dc, pos);
            }
            align();
            print(" */");
            println();
            align();
        }
    }

    static int lineEndPos(String s, int start) {
        int pos = s.indexOf(10, start);
        return pos < 0 ? s.length() : pos;
    }

    public void printTypeParameters(List<JCTree.JCTypeParameter> trees) throws IOException {
        if (trees.nonEmpty()) {
            print("<");
            printExprs(trees);
            print(">");
        }
    }

    public void printBlock(List<? extends JCTree> stats) throws IOException {
        print("{");
        println();
        indent();
        printStats(stats);
        undent();
        align();
        print("}");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void printEnumBody(List<JCTree> stats) throws IOException {
        print("{");
        println();
        indent();
        boolean first = true;
        for (List list = stats; list.nonEmpty(); list = list.tail) {
            if (isEnumerator((JCTree) list.head)) {
                if (!first) {
                    print(",");
                    println();
                }
                align();
                printStat((JCTree) list.head);
                first = false;
            }
        }
        print(";");
        println();
        for (List list2 = stats; list2.nonEmpty(); list2 = list2.tail) {
            if (!isEnumerator((JCTree) list2.head)) {
                align();
                printStat((JCTree) list2.head);
                println();
            }
        }
        undent();
        align();
        print("}");
    }

    boolean isEnumerator(JCTree t) {
        return t.getTag() == 5 && (((JCTree.JCVariableDecl) t).mods.flags & 16384) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void printUnit(JCTree.JCCompilationUnit tree, JCTree.JCClassDecl cdef) throws IOException {
        this.docComments = tree.docComments;
        printDocComment(tree);
        if (tree.f540pid != null) {
            print("package ");
            printExpr(tree.f540pid);
            print(";");
            println();
        }
        boolean firstImport = true;
        for (List list = tree.defs; list.nonEmpty() && (cdef == null || ((JCTree) list.head).getTag() == 2); list = list.tail) {
            if (((JCTree) list.head).getTag() == 2) {
                JCTree.JCImport imp = (JCTree.JCImport) list.head;
                Name name = TreeInfo.name(imp.qualid);
                if (name == name.table.names.asterisk || cdef == null || isUsed(TreeInfo.symbol(imp.qualid), cdef)) {
                    if (firstImport) {
                        firstImport = false;
                        println();
                    }
                    printStat(imp);
                }
            } else {
                printStat((JCTree) list.head);
            }
        }
        if (cdef != null) {
            printStat(cdef);
            println();
        }
    }

    class C1UsedVisitor extends TreeScanner {
        boolean result = false;
        final Symbol val$t;

        C1UsedVisitor(Symbol symbol) {
            this.val$t = symbol;
        }

        @Override
        public void scan(JCTree tree) {
            if (tree == null || this.result) {
                return;
            }
            tree.accept(this);
        }

        @Override
        public void visitIdent(JCTree.JCIdent tree) {
            if (tree.f543sym == this.val$t) {
                this.result = true;
            }
        }
    }

    boolean isUsed(Symbol t, JCTree cdef) {
        C1UsedVisitor v = new C1UsedVisitor(t);
        v.scan(cdef);
        return v.result;
    }

    @Override
    public void visitTopLevel(JCTree.JCCompilationUnit tree) {
        try {
            printUnit(tree, null);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitImport(JCTree.JCImport tree) {
        try {
            print("import ");
            if (tree.staticImport) {
                print("static ");
            }
            printExpr(tree.qualid);
            print(";");
            println();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitClassDef(JCTree.JCClassDecl tree) {
        try {
            println();
            align();
            printDocComment(tree);
            printAnnotations(tree.mods.annotations);
            printFlags(tree.mods.flags & (-513));
            Name enclClassNamePrev = this.enclClassName;
            this.enclClassName = tree.name;
            if ((tree.mods.flags & 512) != 0) {
                print("interface " + ((Object) tree.name));
                printTypeParameters(tree.typarams);
                if (tree.implementing.nonEmpty()) {
                    print(" extends ");
                    printExprs(tree.implementing);
                }
            } else {
                if ((tree.mods.flags & 16384) != 0) {
                    print("enum " + ((Object) tree.name));
                } else {
                    print("class " + ((Object) tree.name));
                }
                printTypeParameters(tree.typarams);
                if (tree.extending != null) {
                    print(" extends ");
                    printExpr(tree.extending);
                }
                if (tree.implementing.nonEmpty()) {
                    print(" implements ");
                    printExprs(tree.implementing);
                }
            }
            print(" ");
            if ((tree.mods.flags & 16384) != 0) {
                printEnumBody(tree.defs);
            } else {
                printBlock(tree.defs);
            }
            this.enclClassName = enclClassNamePrev;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitMethodDef(JCTree.JCMethodDecl tree) {
        try {
            if (tree.name == tree.name.table.names.init && this.enclClassName == null && this.sourceOutput) {
                return;
            }
            println();
            align();
            printDocComment(tree);
            printExpr(tree.mods);
            printTypeParameters(tree.typarams);
            if (tree.name == tree.name.table.names.init) {
                print(this.enclClassName != null ? this.enclClassName : tree.name);
            } else {
                printExpr(tree.restype);
                print(" " + ((Object) tree.name));
            }
            print("(");
            printExprs(tree.params);
            print(")");
            if (tree.thrown.nonEmpty()) {
                print(" throws ");
                printExprs(tree.thrown);
            }
            if (tree.defaultValue != null) {
                print(" default ");
                printExpr(tree.defaultValue);
            }
            if (tree.body != null) {
                print(" ");
                printStat(tree.body);
            } else {
                print(";");
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitVarDef(JCTree.JCVariableDecl tree) {
        try {
            if (this.docComments != null && this.docComments.get(tree) != null) {
                println();
                align();
            }
            printDocComment(tree);
            if ((tree.mods.flags & 16384) != 0) {
                print("/*public static final*/ ");
                print(tree.name);
                if (tree.init != null) {
                    if (this.sourceOutput && tree.init.getTag() == 27) {
                        print(" /*enum*/ ");
                        JCTree.JCNewClass init = (JCTree.JCNewClass) tree.init;
                        if (init.args != null && init.args.nonEmpty()) {
                            print("(");
                            print(init.args);
                            print(")");
                        }
                        if (init.f545def != null && init.f545def.defs != null) {
                            print(" ");
                            printBlock(init.f545def.defs);
                            return;
                        }
                        return;
                    }
                    print(" /* = ");
                    printExpr(tree.init);
                    print(" */");
                    return;
                }
                return;
            }
            printExpr(tree.mods);
            if ((tree.mods.flags & Flags.VARARGS) != 0) {
                printExpr(((JCTree.JCArrayTypeTree) tree.vartype).elemtype);
                print("... " + ((Object) tree.name));
            } else {
                printExpr(tree.vartype);
                print(" " + ((Object) tree.name));
            }
            if (tree.init != null) {
                print(" = ");
                printExpr(tree.init);
            }
            if (this.prec == -1) {
                print(";");
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitSkip(JCTree.JCSkip tree) {
        try {
            print(";");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitBlock(JCTree.JCBlock tree) {
        try {
            printFlags(tree.flags);
            printBlock(tree.stats);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitDoLoop(JCTree.JCDoWhileLoop tree) {
        try {
            print("do ");
            printStat(tree.body);
            align();
            print(" while ");
            if (tree.cond.getTag() == 29) {
                printExpr(tree.cond);
            } else {
                print("(");
                printExpr(tree.cond);
                print(")");
            }
            print(";");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitWhileLoop(JCTree.JCWhileLoop tree) {
        try {
            print("while ");
            if (tree.cond.getTag() == 29) {
                printExpr(tree.cond);
            } else {
                print("(");
                printExpr(tree.cond);
                print(")");
            }
            print(" ");
            printStat(tree.body);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitForLoop(JCTree.JCForLoop tree) {
        try {
            print("for (");
            if (tree.init.nonEmpty()) {
                if (tree.init.head.getTag() == 5) {
                    printExpr(tree.init.head);
                    for (List list = tree.init.tail; list.nonEmpty(); list = list.tail) {
                        JCTree.JCVariableDecl vdef = (JCTree.JCVariableDecl) list.head;
                        print(", " + ((Object) vdef.name) + " = ");
                        printExpr(vdef.init);
                    }
                } else {
                    printExprs(tree.init);
                }
            }
            print("; ");
            if (tree.cond != null) {
                printExpr(tree.cond);
            }
            print("; ");
            printExprs(tree.step);
            print(") ");
            printStat(tree.body);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitForeachLoop(JCTree.JCEnhancedForLoop tree) {
        try {
            print("for (");
            printExpr(tree.f541var);
            print(" : ");
            printExpr(tree.expr);
            print(") ");
            printStat(tree.body);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitLabelled(JCTree.JCLabeledStatement tree) {
        try {
            print(((Object) tree.label) + ": ");
            printStat(tree.body);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitSwitch(JCTree.JCSwitch tree) {
        try {
            print("switch ");
            if (tree.selector.getTag() == 29) {
                printExpr(tree.selector);
            } else {
                print("(");
                printExpr(tree.selector);
                print(")");
            }
            print(" {");
            println();
            printStats(tree.cases);
            align();
            print("}");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitCase(JCTree.JCCase tree) {
        try {
            if (tree.f538pat == null) {
                print("default");
            } else {
                print("case ");
                printExpr(tree.f538pat);
            }
            print(": ");
            println();
            indent();
            printStats(tree.stats);
            undent();
            align();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitSynchronized(JCTree.JCSynchronized tree) {
        try {
            print("synchronized ");
            if (tree.lock.getTag() == 29) {
                printExpr(tree.lock);
            } else {
                print("(");
                printExpr(tree.lock);
                print(")");
            }
            print(" ");
            printStat(tree.body);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitTry(JCTree.JCTry tree) {
        try {
            print("try ");
            if (tree.resources.nonEmpty()) {
                print("(");
                boolean first = true;
                for (JCTree var : tree.resources) {
                    if (!first) {
                        println();
                        indent();
                    }
                    printStat(var);
                    first = false;
                }
                print(") ");
            }
            printStat(tree.body);
            for (List list = tree.catchers; list.nonEmpty(); list = list.tail) {
                printStat((JCTree) list.head);
            }
            if (tree.finalizer != null) {
                print(" finally ");
                printStat(tree.finalizer);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitCatch(JCTree.JCCatch tree) {
        try {
            print(" catch (");
            printExpr(tree.param);
            print(") ");
            printStat(tree.body);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitConditional(JCTree.JCConditional tree) {
        try {
            open(this.prec, 3);
            printExpr(tree.cond, 3);
            print(" ? ");
            printExpr(tree.truepart, 3);
            print(" : ");
            printExpr(tree.falsepart, 3);
            close(this.prec, 3);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitIf(JCTree.JCIf tree) {
        try {
            print("if ");
            if (tree.cond.getTag() == 29) {
                printExpr(tree.cond);
            } else {
                print("(");
                printExpr(tree.cond);
                print(")");
            }
            print(" ");
            printStat(tree.thenpart);
            if (tree.elsepart != null) {
                print(" else ");
                printStat(tree.elsepart);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitExec(JCTree.JCExpressionStatement tree) {
        try {
            printExpr(tree.expr);
            if (this.prec == -1) {
                print(";");
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitBreak(JCTree.JCBreak tree) {
        try {
            print("break");
            if (tree.label != null) {
                print(" " + ((Object) tree.label));
            }
            print(";");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitContinue(JCTree.JCContinue tree) {
        try {
            print("continue");
            if (tree.label != null) {
                print(" " + ((Object) tree.label));
            }
            print(";");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitReturn(JCTree.JCReturn tree) {
        try {
            print("return");
            if (tree.expr != null) {
                print(" ");
                printExpr(tree.expr);
            }
            print(";");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitThrow(JCTree.JCThrow tree) {
        try {
            print("throw ");
            printExpr(tree.expr);
            print(";");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitAssert(JCTree.JCAssert tree) {
        try {
            print("assert ");
            printExpr(tree.cond);
            if (tree.detail != null) {
                print(" : ");
                printExpr(tree.detail);
            }
            print(";");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitApply(JCTree.JCMethodInvocation tree) {
        try {
            if (!tree.typeargs.isEmpty()) {
                if (tree.meth.getTag() == 34) {
                    JCTree.JCFieldAccess left = (JCTree.JCFieldAccess) tree.meth;
                    printExpr(left.selected);
                    print(".<");
                    printExprs(tree.typeargs);
                    print(">" + ((Object) left.name));
                } else {
                    print("<");
                    printExprs(tree.typeargs);
                    print(">");
                    printExpr(tree.meth);
                }
            } else {
                printExpr(tree.meth);
            }
            print("(");
            printExprs(tree.args);
            print(")");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitNewClass(JCTree.JCNewClass tree) {
        Name name;
        try {
            if (tree.encl != null) {
                printExpr(tree.encl);
                print(".");
            }
            print("new ");
            if (!tree.typeargs.isEmpty()) {
                print("<");
                printExprs(tree.typeargs);
                print(">");
            }
            printExpr(tree.clazz);
            print("(");
            printExprs(tree.args);
            print(")");
            if (tree.f545def != null) {
                Name enclClassNamePrev = this.enclClassName;
                if (tree.f545def.name != null) {
                    name = tree.f545def.name;
                } else {
                    name = (tree.type == null || tree.type.tsym.name == tree.type.tsym.name.table.names.empty) ? null : tree.type.tsym.name;
                }
                this.enclClassName = name;
                if ((tree.f545def.mods.flags & 16384) != 0) {
                    print("/*enum*/");
                }
                printBlock(tree.f545def.defs);
                this.enclClassName = enclClassNamePrev;
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitNewArray(JCTree.JCNewArray tree) {
        try {
            if (tree.elemtype != null) {
                print("new ");
                JCTree elem = tree.elemtype;
                if (elem.getTag() == 38) {
                    printBaseElementType((JCTree.JCArrayTypeTree) elem);
                } else {
                    printExpr(elem);
                }
                for (List list = tree.dims; list.nonEmpty(); list = list.tail) {
                    print("[");
                    printExpr((JCTree) list.head);
                    print("]");
                }
                if (elem instanceof JCTree.JCArrayTypeTree) {
                    printBrackets((JCTree.JCArrayTypeTree) elem);
                }
            }
            if (tree.elems != null) {
                if (tree.elemtype != null) {
                    print("[]");
                }
                print("{");
                printExprs(tree.elems);
                print("}");
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitParens(JCTree.JCParens tree) {
        try {
            print("(");
            printExpr(tree.expr);
            print(")");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitAssign(JCTree.JCAssign tree) {
        try {
            open(this.prec, 1);
            printExpr(tree.f532lhs, 2);
            print(" = ");
            printExpr(tree.f533rhs, 1);
            close(this.prec, 1);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String operatorName(int tag) {
        switch (tag) {
            case 48:
                return "+";
            case 49:
                return "-";
            case 50:
                return "!";
            case 51:
                return "~";
            case 52:
                return "++";
            case 53:
                return "--";
            case 54:
                return "++";
            case 55:
                return "--";
            case 56:
                return "<*nullchk*>";
            case 57:
                return "||";
            case 58:
                return "&&";
            case 59:
                return "|";
            case 60:
                return "^";
            case 61:
                return "&";
            case 62:
                return "==";
            case 63:
                return "!=";
            case 64:
                return "<";
            case 65:
                return ">";
            case 66:
                return "<=";
            case 67:
                return ">=";
            case 68:
                return "<<";
            case 69:
                return ">>";
            case 70:
                return ">>>";
            case 71:
                return "+";
            case 72:
                return "-";
            case 73:
                return "*";
            case 74:
                return "/";
            case 75:
                return "%";
            default:
                throw new Error();
        }
    }

    @Override
    public void visitAssignop(JCTree.JCAssignOp tree) {
        try {
            open(this.prec, 2);
            printExpr(tree.f534lhs, 3);
            print(" " + operatorName(tree.getTag() - 17) + "= ");
            printExpr(tree.f535rhs, 2);
            close(this.prec, 2);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitUnary(JCTree.JCUnary tree) {
        try {
            int ownprec = TreeInfo.opPrec(tree.getTag());
            String opname = operatorName(tree.getTag());
            open(this.prec, ownprec);
            if (tree.getTag() <= 53) {
                print(opname);
                printExpr(tree.f546arg, ownprec);
            } else {
                printExpr(tree.f546arg, ownprec);
                print(opname);
            }
            close(this.prec, ownprec);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitBinary(JCTree.JCBinary tree) {
        try {
            int ownprec = TreeInfo.opPrec(tree.getTag());
            String opname = operatorName(tree.getTag());
            open(this.prec, ownprec);
            printExpr(tree.f536lhs, ownprec);
            print(" " + opname + " ");
            printExpr(tree.f537rhs, ownprec + 1);
            close(this.prec, ownprec);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitTypeCast(JCTree.JCTypeCast tree) {
        try {
            open(this.prec, 14);
            print("(");
            printExpr(tree.clazz);
            print(")");
            printExpr(tree.expr, 14);
            close(this.prec, 14);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitTypeTest(JCTree.JCInstanceOf tree) {
        try {
            open(this.prec, 10);
            printExpr(tree.expr, 10);
            print(" instanceof ");
            printExpr(tree.clazz, 11);
            close(this.prec, 10);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitIndexed(JCTree.JCArrayAccess tree) {
        try {
            printExpr(tree.indexed, 15);
            print("[");
            printExpr(tree.index);
            print("]");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitSelect(JCTree.JCFieldAccess tree) {
        try {
            printExpr(tree.selected, 15);
            print("." + ((Object) tree.name));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitIdent(JCTree.JCIdent tree) {
        try {
            print(tree.name);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitLiteral(JCTree.JCLiteral tree) {
        try {
            int i = tree.typetag;
            if (i == 2) {
                print("'" + Convert.quote(String.valueOf((char) ((Number) tree.value).intValue())) + "'");
                return;
            }
            if (i != 17) {
                switch (i) {
                    case 4:
                        print(tree.value.toString());
                        return;
                    case 5:
                        print(tree.value + "L");
                        return;
                    case 6:
                        print(tree.value + "F");
                        return;
                    case 7:
                        print(tree.value.toString());
                        return;
                    case 8:
                        print(((Number) tree.value).intValue() == 1 ? "true" : "false");
                        return;
                    default:
                        print("\"" + Convert.quote(tree.value.toString()) + "\"");
                        return;
                }
            }
            print("null");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitTypeIdent(JCTree.JCPrimitiveTypeTree tree) {
        try {
            switch (tree.typetag) {
                case 1:
                    print("byte");
                    return;
                case 2:
                    print("char");
                    return;
                case 3:
                    print("short");
                    return;
                case 4:
                    print("int");
                    return;
                case 5:
                    print("long");
                    return;
                case 6:
                    print("float");
                    return;
                case 7:
                    print("double");
                    return;
                case 8:
                    print("boolean");
                    return;
                case 9:
                    print("void");
                    return;
                default:
                    print("error");
                    return;
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitTypeArray(JCTree.JCArrayTypeTree tree) {
        try {
            printBaseElementType(tree);
            printBrackets(tree);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private void printBaseElementType(JCTree tree) throws IOException {
        printExpr(TreeInfo.innermostType(tree));
    }

    private void printBrackets(JCTree.JCArrayTypeTree tree) throws IOException {
        while (true) {
            JCTree elem = tree.elemtype;
            print("[]");
            if (elem.getTag() == 38) {
                tree = (JCTree.JCArrayTypeTree) elem;
            } else {
                return;
            }
        }
    }

    @Override
    public void visitTypeApply(JCTree.JCTypeApply tree) {
        try {
            printExpr(tree.clazz);
            print("<");
            printExprs(tree.arguments);
            print(">");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitTypeUnion(JCTree.JCTypeUnion tree) {
        try {
            printExprs(tree.alternatives, " | ");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitTypeParameter(JCTree.JCTypeParameter tree) {
        try {
            print(tree.name);
            if (tree.bounds.nonEmpty()) {
                print(" extends ");
                printExprs(tree.bounds, " & ");
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitWildcard(JCTree.JCWildcard tree) {
        try {
            print(tree.kind);
            if (tree.kind.kind != BoundKind.UNBOUND) {
                printExpr(tree.inner);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitTypeBoundKind(JCTree.TypeBoundKind tree) {
        try {
            print(String.valueOf(tree.kind));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitErroneous(JCTree.JCErroneous tree) {
        try {
            print("(ERROR)");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitLetExpr(JCTree.LetExpr tree) {
        try {
            print("(let " + tree.defs + " in " + tree.expr + ")");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitModifiers(JCTree.JCModifiers mods) {
        try {
            printAnnotations(mods.annotations);
            printFlags(mods.flags);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitAnnotation(JCTree.JCAnnotation tree) {
        try {
            print("@");
            printExpr(tree.annotationType);
            print("(");
            printExprs(tree.args);
            print(")");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void visitTree(JCTree tree) {
        try {
            print("(UNKNOWN: " + tree + ")");
            println();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
