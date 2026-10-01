package com.sun.tools.javac.tree;

import com.sun.tools.javac.util.List;

public class TreeTranslator extends JCTree.Visitor {
    protected JCTree result;

    public <T extends JCTree> T translate(T t) {
        if (t == null) {
            return null;
        }
        t.accept(this);
        T t2 = (T) this.result;
        this.result = null;
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [A, com.sun.tools.javac.tree.JCTree] */
    public <T extends JCTree> List<T> translate(List<T> trees) {
        if (trees == null) {
            return null;
        }
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            list.head = translate((JCTree) list.head);
        }
        return trees;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [A, com.sun.tools.javac.tree.JCTree] */
    public List<JCTree.JCVariableDecl> translateVarDefs(List<JCTree.JCVariableDecl> trees) {
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            list.head = translate((JCTree) list.head);
        }
        return trees;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [A, com.sun.tools.javac.tree.JCTree] */
    public List<JCTree.JCTypeParameter> translateTypeParams(List<JCTree.JCTypeParameter> trees) {
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            list.head = translate((JCTree) list.head);
        }
        return trees;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [A, com.sun.tools.javac.tree.JCTree] */
    public List<JCTree.JCCase> translateCases(List<JCTree.JCCase> trees) {
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            list.head = translate((JCTree) list.head);
        }
        return trees;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [A, com.sun.tools.javac.tree.JCTree] */
    public List<JCTree.JCCatch> translateCatchers(List<JCTree.JCCatch> trees) {
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            list.head = translate((JCTree) list.head);
        }
        return trees;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [A, com.sun.tools.javac.tree.JCTree] */
    public List<JCTree.JCAnnotation> translateAnnotations(List<JCTree.JCAnnotation> trees) {
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            list.head = translate((JCTree) list.head);
        }
        return trees;
    }

    @Override
    public void visitTopLevel(JCTree.JCCompilationUnit tree) {
        tree.f540pid = (JCTree.JCExpression) translate(tree.f540pid);
        tree.defs = translate(tree.defs);
        this.result = tree;
    }

    @Override
    public void visitImport(JCTree.JCImport tree) {
        tree.qualid = translate(tree.qualid);
        this.result = tree;
    }

    @Override
    public void visitClassDef(JCTree.JCClassDecl tree) {
        tree.mods = (JCTree.JCModifiers) translate(tree.mods);
        tree.typarams = translateTypeParams(tree.typarams);
        tree.extending = (JCTree.JCExpression) translate(tree.extending);
        tree.implementing = translate(tree.implementing);
        tree.defs = translate(tree.defs);
        this.result = tree;
    }

    @Override
    public void visitMethodDef(JCTree.JCMethodDecl tree) {
        tree.mods = (JCTree.JCModifiers) translate(tree.mods);
        tree.restype = (JCTree.JCExpression) translate(tree.restype);
        tree.typarams = translateTypeParams(tree.typarams);
        tree.params = translateVarDefs(tree.params);
        tree.thrown = translate(tree.thrown);
        tree.body = (JCTree.JCBlock) translate(tree.body);
        this.result = tree;
    }

    @Override
    public void visitVarDef(JCTree.JCVariableDecl tree) {
        tree.mods = (JCTree.JCModifiers) translate(tree.mods);
        tree.vartype = (JCTree.JCExpression) translate(tree.vartype);
        tree.init = (JCTree.JCExpression) translate(tree.init);
        this.result = tree;
    }

    @Override
    public void visitSkip(JCTree.JCSkip tree) {
        this.result = tree;
    }

    @Override
    public void visitBlock(JCTree.JCBlock tree) {
        tree.stats = translate(tree.stats);
        this.result = tree;
    }

    @Override
    public void visitDoLoop(JCTree.JCDoWhileLoop tree) {
        tree.body = (JCTree.JCStatement) translate(tree.body);
        tree.cond = (JCTree.JCExpression) translate(tree.cond);
        this.result = tree;
    }

    @Override
    public void visitWhileLoop(JCTree.JCWhileLoop tree) {
        tree.cond = (JCTree.JCExpression) translate(tree.cond);
        tree.body = (JCTree.JCStatement) translate(tree.body);
        this.result = tree;
    }

    @Override
    public void visitForLoop(JCTree.JCForLoop tree) {
        tree.init = translate(tree.init);
        tree.cond = (JCTree.JCExpression) translate(tree.cond);
        tree.step = translate(tree.step);
        tree.body = (JCTree.JCStatement) translate(tree.body);
        this.result = tree;
    }

    @Override
    public void visitForeachLoop(JCTree.JCEnhancedForLoop tree) {
        tree.f541var = (JCTree.JCVariableDecl) translate(tree.f541var);
        tree.expr = (JCTree.JCExpression) translate(tree.expr);
        tree.body = (JCTree.JCStatement) translate(tree.body);
        this.result = tree;
    }

    @Override
    public void visitLabelled(JCTree.JCLabeledStatement tree) {
        tree.body = (JCTree.JCStatement) translate(tree.body);
        this.result = tree;
    }

    @Override
    public void visitSwitch(JCTree.JCSwitch tree) {
        tree.selector = (JCTree.JCExpression) translate(tree.selector);
        tree.cases = translateCases(tree.cases);
        this.result = tree;
    }

    @Override
    public void visitCase(JCTree.JCCase tree) {
        tree.f538pat = (JCTree.JCExpression) translate(tree.f538pat);
        tree.stats = translate(tree.stats);
        this.result = tree;
    }

    @Override
    public void visitSynchronized(JCTree.JCSynchronized tree) {
        tree.lock = (JCTree.JCExpression) translate(tree.lock);
        tree.body = (JCTree.JCBlock) translate(tree.body);
        this.result = tree;
    }

    @Override
    public void visitTry(JCTree.JCTry tree) {
        tree.resources = translate(tree.resources);
        tree.body = (JCTree.JCBlock) translate(tree.body);
        tree.catchers = translateCatchers(tree.catchers);
        tree.finalizer = (JCTree.JCBlock) translate(tree.finalizer);
        this.result = tree;
    }

    @Override
    public void visitCatch(JCTree.JCCatch tree) {
        tree.param = (JCTree.JCVariableDecl) translate(tree.param);
        tree.body = (JCTree.JCBlock) translate(tree.body);
        this.result = tree;
    }

    @Override
    public void visitConditional(JCTree.JCConditional tree) {
        tree.cond = (JCTree.JCExpression) translate(tree.cond);
        tree.truepart = (JCTree.JCExpression) translate(tree.truepart);
        tree.falsepart = (JCTree.JCExpression) translate(tree.falsepart);
        this.result = tree;
    }

    @Override
    public void visitIf(JCTree.JCIf tree) {
        tree.cond = (JCTree.JCExpression) translate(tree.cond);
        tree.thenpart = (JCTree.JCStatement) translate(tree.thenpart);
        tree.elsepart = (JCTree.JCStatement) translate(tree.elsepart);
        this.result = tree;
    }

    @Override
    public void visitExec(JCTree.JCExpressionStatement tree) {
        tree.expr = (JCTree.JCExpression) translate(tree.expr);
        this.result = tree;
    }

    @Override
    public void visitBreak(JCTree.JCBreak tree) {
        this.result = tree;
    }

    @Override
    public void visitContinue(JCTree.JCContinue tree) {
        this.result = tree;
    }

    @Override
    public void visitReturn(JCTree.JCReturn tree) {
        tree.expr = (JCTree.JCExpression) translate(tree.expr);
        this.result = tree;
    }

    @Override
    public void visitThrow(JCTree.JCThrow tree) {
        tree.expr = (JCTree.JCExpression) translate(tree.expr);
        this.result = tree;
    }

    @Override
    public void visitAssert(JCTree.JCAssert tree) {
        tree.cond = (JCTree.JCExpression) translate(tree.cond);
        tree.detail = (JCTree.JCExpression) translate(tree.detail);
        this.result = tree;
    }

    @Override
    public void visitApply(JCTree.JCMethodInvocation tree) {
        tree.meth = (JCTree.JCExpression) translate(tree.meth);
        tree.args = translate(tree.args);
        this.result = tree;
    }

    @Override
    public void visitNewClass(JCTree.JCNewClass tree) {
        tree.encl = (JCTree.JCExpression) translate(tree.encl);
        tree.clazz = (JCTree.JCExpression) translate(tree.clazz);
        tree.args = translate(tree.args);
        tree.f545def = (JCTree.JCClassDecl) translate(tree.f545def);
        this.result = tree;
    }

    @Override
    public void visitNewArray(JCTree.JCNewArray tree) {
        tree.elemtype = (JCTree.JCExpression) translate(tree.elemtype);
        tree.dims = translate(tree.dims);
        tree.elems = translate(tree.elems);
        this.result = tree;
    }

    @Override
    public void visitParens(JCTree.JCParens tree) {
        tree.expr = (JCTree.JCExpression) translate(tree.expr);
        this.result = tree;
    }

    @Override
    public void visitAssign(JCTree.JCAssign tree) {
        tree.f532lhs = (JCTree.JCExpression) translate(tree.f532lhs);
        tree.f533rhs = (JCTree.JCExpression) translate(tree.f533rhs);
        this.result = tree;
    }

    @Override
    public void visitAssignop(JCTree.JCAssignOp tree) {
        tree.f534lhs = (JCTree.JCExpression) translate(tree.f534lhs);
        tree.f535rhs = (JCTree.JCExpression) translate(tree.f535rhs);
        this.result = tree;
    }

    @Override
    public void visitUnary(JCTree.JCUnary tree) {
        tree.f546arg = (JCTree.JCExpression) translate(tree.f546arg);
        this.result = tree;
    }

    @Override
    public void visitBinary(JCTree.JCBinary tree) {
        tree.f536lhs = (JCTree.JCExpression) translate(tree.f536lhs);
        tree.f537rhs = (JCTree.JCExpression) translate(tree.f537rhs);
        this.result = tree;
    }

    @Override
    public void visitTypeCast(JCTree.JCTypeCast tree) {
        tree.clazz = translate(tree.clazz);
        tree.expr = (JCTree.JCExpression) translate(tree.expr);
        this.result = tree;
    }

    @Override
    public void visitTypeTest(JCTree.JCInstanceOf tree) {
        tree.expr = (JCTree.JCExpression) translate(tree.expr);
        tree.clazz = translate(tree.clazz);
        this.result = tree;
    }

    @Override
    public void visitIndexed(JCTree.JCArrayAccess tree) {
        tree.indexed = (JCTree.JCExpression) translate(tree.indexed);
        tree.index = (JCTree.JCExpression) translate(tree.index);
        this.result = tree;
    }

    @Override
    public void visitSelect(JCTree.JCFieldAccess tree) {
        tree.selected = (JCTree.JCExpression) translate(tree.selected);
        this.result = tree;
    }

    @Override
    public void visitIdent(JCTree.JCIdent tree) {
        this.result = tree;
    }

    @Override
    public void visitLiteral(JCTree.JCLiteral tree) {
        this.result = tree;
    }

    @Override
    public void visitTypeIdent(JCTree.JCPrimitiveTypeTree tree) {
        this.result = tree;
    }

    @Override
    public void visitTypeArray(JCTree.JCArrayTypeTree tree) {
        tree.elemtype = (JCTree.JCExpression) translate(tree.elemtype);
        this.result = tree;
    }

    @Override
    public void visitTypeApply(JCTree.JCTypeApply tree) {
        tree.clazz = (JCTree.JCExpression) translate(tree.clazz);
        tree.arguments = translate(tree.arguments);
        this.result = tree;
    }

    @Override
    public void visitTypeUnion(JCTree.JCTypeUnion tree) {
        tree.alternatives = translate(tree.alternatives);
        this.result = tree;
    }

    @Override
    public void visitTypeParameter(JCTree.JCTypeParameter tree) {
        tree.bounds = translate(tree.bounds);
        this.result = tree;
    }

    @Override
    public void visitWildcard(JCTree.JCWildcard tree) {
        tree.kind = (JCTree.TypeBoundKind) translate(tree.kind);
        tree.inner = translate(tree.inner);
        this.result = tree;
    }

    @Override
    public void visitTypeBoundKind(JCTree.TypeBoundKind tree) {
        this.result = tree;
    }

    @Override
    public void visitErroneous(JCTree.JCErroneous tree) {
        this.result = tree;
    }

    @Override
    public void visitLetExpr(JCTree.LetExpr tree) {
        tree.defs = translateVarDefs(tree.defs);
        tree.expr = translate(tree.expr);
        this.result = tree;
    }

    @Override
    public void visitModifiers(JCTree.JCModifiers tree) {
        tree.annotations = translateAnnotations(tree.annotations);
        this.result = tree;
    }

    @Override
    public void visitAnnotation(JCTree.JCAnnotation tree) {
        tree.annotationType = translate(tree.annotationType);
        tree.args = translate(tree.args);
        this.result = tree;
    }

    @Override
    public void visitTree(JCTree tree) {
        throw new AssertionError(tree);
    }
}
