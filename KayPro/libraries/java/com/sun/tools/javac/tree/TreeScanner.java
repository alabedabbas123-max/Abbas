package com.sun.tools.javac.tree;

import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.List;

public class TreeScanner extends JCTree.Visitor {
    public void scan(JCTree tree) {
        if (tree != null) {
            tree.accept(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void scan(List<? extends JCTree> trees) {
        if (trees != null) {
            for (List list = trees; list.nonEmpty(); list = list.tail) {
                scan((JCTree) list.head);
            }
        }
    }

    @Override
    public void visitTopLevel(JCTree.JCCompilationUnit tree) {
        scan(tree.packageAnnotations);
        scan(tree.f540pid);
        scan(tree.defs);
    }

    @Override
    public void visitImport(JCTree.JCImport tree) {
        scan(tree.qualid);
    }

    @Override
    public void visitClassDef(JCTree.JCClassDecl tree) {
        scan(tree.mods);
        scan(tree.typarams);
        scan(tree.extending);
        scan(tree.implementing);
        scan(tree.defs);
    }

    @Override
    public void visitMethodDef(JCTree.JCMethodDecl tree) {
        scan(tree.mods);
        scan(tree.restype);
        scan(tree.typarams);
        scan(tree.params);
        scan(tree.thrown);
        scan(tree.defaultValue);
        scan(tree.body);
    }

    @Override
    public void visitVarDef(JCTree.JCVariableDecl tree) {
        scan(tree.mods);
        scan(tree.vartype);
        scan(tree.init);
    }

    @Override
    public void visitSkip(JCTree.JCSkip tree) {
    }

    @Override
    public void visitBlock(JCTree.JCBlock tree) {
        scan(tree.stats);
    }

    @Override
    public void visitDoLoop(JCTree.JCDoWhileLoop tree) {
        scan(tree.body);
        scan(tree.cond);
    }

    @Override
    public void visitWhileLoop(JCTree.JCWhileLoop tree) {
        scan(tree.cond);
        scan(tree.body);
    }

    @Override
    public void visitForLoop(JCTree.JCForLoop tree) {
        scan(tree.init);
        scan(tree.cond);
        scan(tree.step);
        scan(tree.body);
    }

    @Override
    public void visitForeachLoop(JCTree.JCEnhancedForLoop tree) {
        scan(tree.f541var);
        scan(tree.expr);
        scan(tree.body);
    }

    @Override
    public void visitLabelled(JCTree.JCLabeledStatement tree) {
        scan(tree.body);
    }

    @Override
    public void visitSwitch(JCTree.JCSwitch tree) {
        scan(tree.selector);
        scan(tree.cases);
    }

    @Override
    public void visitCase(JCTree.JCCase tree) {
        scan(tree.f538pat);
        scan(tree.stats);
    }

    @Override
    public void visitSynchronized(JCTree.JCSynchronized tree) {
        scan(tree.lock);
        scan(tree.body);
    }

    @Override
    public void visitTry(JCTree.JCTry tree) {
        scan(tree.resources);
        scan(tree.body);
        scan(tree.catchers);
        scan(tree.finalizer);
    }

    @Override
    public void visitCatch(JCTree.JCCatch tree) {
        scan(tree.param);
        scan(tree.body);
    }

    @Override
    public void visitConditional(JCTree.JCConditional tree) {
        scan(tree.cond);
        scan(tree.truepart);
        scan(tree.falsepart);
    }

    @Override
    public void visitIf(JCTree.JCIf tree) {
        scan(tree.cond);
        scan(tree.thenpart);
        scan(tree.elsepart);
    }

    @Override
    public void visitExec(JCTree.JCExpressionStatement tree) {
        scan(tree.expr);
    }

    @Override
    public void visitBreak(JCTree.JCBreak tree) {
    }

    @Override
    public void visitContinue(JCTree.JCContinue tree) {
    }

    @Override
    public void visitReturn(JCTree.JCReturn tree) {
        scan(tree.expr);
    }

    @Override
    public void visitThrow(JCTree.JCThrow tree) {
        scan(tree.expr);
    }

    @Override
    public void visitAssert(JCTree.JCAssert tree) {
        scan(tree.cond);
        scan(tree.detail);
    }

    @Override
    public void visitApply(JCTree.JCMethodInvocation tree) {
        scan(tree.typeargs);
        scan(tree.meth);
        scan(tree.args);
    }

    @Override
    public void visitNewClass(JCTree.JCNewClass tree) {
        scan(tree.encl);
        scan(tree.clazz);
        scan(tree.typeargs);
        scan(tree.args);
        scan(tree.f545def);
    }

    @Override
    public void visitNewArray(JCTree.JCNewArray tree) {
        scan(tree.elemtype);
        scan(tree.dims);
        scan(tree.elems);
    }

    @Override
    public void visitParens(JCTree.JCParens tree) {
        scan(tree.expr);
    }

    @Override
    public void visitAssign(JCTree.JCAssign tree) {
        scan(tree.f532lhs);
        scan(tree.f533rhs);
    }

    @Override
    public void visitAssignop(JCTree.JCAssignOp tree) {
        scan(tree.f534lhs);
        scan(tree.f535rhs);
    }

    @Override
    public void visitUnary(JCTree.JCUnary tree) {
        scan(tree.f546arg);
    }

    @Override
    public void visitBinary(JCTree.JCBinary tree) {
        scan(tree.f536lhs);
        scan(tree.f537rhs);
    }

    @Override
    public void visitTypeCast(JCTree.JCTypeCast tree) {
        scan(tree.clazz);
        scan(tree.expr);
    }

    @Override
    public void visitTypeTest(JCTree.JCInstanceOf tree) {
        scan(tree.expr);
        scan(tree.clazz);
    }

    @Override
    public void visitIndexed(JCTree.JCArrayAccess tree) {
        scan(tree.indexed);
        scan(tree.index);
    }

    @Override
    public void visitSelect(JCTree.JCFieldAccess tree) {
        scan(tree.selected);
    }

    @Override
    public void visitIdent(JCTree.JCIdent tree) {
    }

    @Override
    public void visitLiteral(JCTree.JCLiteral tree) {
    }

    @Override
    public void visitTypeIdent(JCTree.JCPrimitiveTypeTree tree) {
    }

    @Override
    public void visitTypeArray(JCTree.JCArrayTypeTree tree) {
        scan(tree.elemtype);
    }

    @Override
    public void visitTypeApply(JCTree.JCTypeApply tree) {
        scan(tree.clazz);
        scan(tree.arguments);
    }

    @Override
    public void visitTypeUnion(JCTree.JCTypeUnion tree) {
        scan(tree.alternatives);
    }

    @Override
    public void visitTypeParameter(JCTree.JCTypeParameter tree) {
        scan(tree.bounds);
    }

    @Override
    public void visitWildcard(JCTree.JCWildcard tree) {
        scan(tree.kind);
        if (tree.inner != null) {
            scan(tree.inner);
        }
    }

    @Override
    public void visitTypeBoundKind(JCTree.TypeBoundKind that) {
    }

    @Override
    public void visitModifiers(JCTree.JCModifiers tree) {
        scan(tree.annotations);
    }

    @Override
    public void visitAnnotation(JCTree.JCAnnotation tree) {
        scan(tree.annotationType);
        scan(tree.args);
    }

    @Override
    public void visitErroneous(JCTree.JCErroneous tree) {
    }

    @Override
    public void visitLetExpr(JCTree.LetExpr tree) {
        scan(tree.defs);
        scan(tree.expr);
    }

    @Override
    public void visitTree(JCTree tree) {
        Assert.error();
    }
}
