package com.sun.tools.javac.tree;

import com.sun.source.tree.AnnotationTree;
import com.sun.source.tree.ArrayAccessTree;
import com.sun.source.tree.ArrayTypeTree;
import com.sun.source.tree.AssertTree;
import com.sun.source.tree.AssignmentTree;
import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.BlockTree;
import com.sun.source.tree.BreakTree;
import com.sun.source.tree.CaseTree;
import com.sun.source.tree.CatchTree;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.CompoundAssignmentTree;
import com.sun.source.tree.ConditionalExpressionTree;
import com.sun.source.tree.ContinueTree;
import com.sun.source.tree.DoWhileLoopTree;
import com.sun.source.tree.EmptyStatementTree;
import com.sun.source.tree.EnhancedForLoopTree;
import com.sun.source.tree.ErroneousTree;
import com.sun.source.tree.ExpressionStatementTree;
import com.sun.source.tree.ForLoopTree;
import com.sun.source.tree.IdentifierTree;
import com.sun.source.tree.IfTree;
import com.sun.source.tree.ImportTree;
import com.sun.source.tree.InstanceOfTree;
import com.sun.source.tree.LabeledStatementTree;
import com.sun.source.tree.LiteralTree;
import com.sun.source.tree.MemberSelectTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.ModifiersTree;
import com.sun.source.tree.NewArrayTree;
import com.sun.source.tree.NewClassTree;
import com.sun.source.tree.ParameterizedTypeTree;
import com.sun.source.tree.ParenthesizedTree;
import com.sun.source.tree.PrimitiveTypeTree;
import com.sun.source.tree.ReturnTree;
import com.sun.source.tree.SwitchTree;
import com.sun.source.tree.SynchronizedTree;
import com.sun.source.tree.ThrowTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;
import com.sun.source.tree.TryTree;
import com.sun.source.tree.TypeCastTree;
import com.sun.source.tree.TypeParameterTree;
import com.sun.source.tree.UnaryTree;
import com.sun.source.tree.UnionTypeTree;
import com.sun.source.tree.VariableTree;
import com.sun.source.tree.WhileLoopTree;
import com.sun.source.tree.WildcardTree;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;

public class TreeCopier<P> implements TreeVisitor<JCTree, P> {

    private TreeMaker f549M;

    public TreeCopier(TreeMaker M) {
        this.f549M = M;
    }

    public <T extends JCTree> T copy(T t) {
        return (T) copy(t, (Object) null);
    }

    public <T extends JCTree> T copy(T tree, P p) {
        if (tree == null) {
            return null;
        }
        return (T) tree.accept(this, p);
    }

    public <T extends JCTree> List<T> copy(List<T> trees) {
        return copy(trees, (Object) null);
    }

    public <T extends JCTree> List<T> copy(List<T> trees, P p) {
        if (trees == null) {
            return null;
        }
        ListBuffer listBuffer = new ListBuffer();
        for (T tree : trees) {
            listBuffer.append(copy(tree, p));
        }
        return listBuffer.toList();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitAnnotation(AnnotationTree node, P p) {
        JCTree.JCAnnotation t = (JCTree.JCAnnotation) node;
        JCTree annotationType = copy(t.annotationType, p);
        return this.f549M.m495at(t.f531pos).Annotation(annotationType, copy(t.args, p));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitAssert(AssertTree node, P p) {
        JCTree.JCAssert t = (JCTree.JCAssert) node;
        JCTree.JCExpression cond = (JCTree.JCExpression) copy(t.cond, p);
        JCTree.JCExpression detail = (JCTree.JCExpression) copy(t.detail, p);
        return this.f549M.m495at(t.f531pos).Assert(cond, detail);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitAssignment(AssignmentTree node, P p) {
        JCTree.JCAssign t = (JCTree.JCAssign) node;
        JCTree.JCExpression lhs = (JCTree.JCExpression) copy(t.f532lhs, p);
        JCTree.JCExpression rhs = (JCTree.JCExpression) copy(t.f533rhs, p);
        return this.f549M.m495at(t.f531pos).Assign(lhs, rhs);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitCompoundAssignment(CompoundAssignmentTree node, P p) {
        JCTree.JCAssignOp t = (JCTree.JCAssignOp) node;
        JCTree lhs = copy(t.f534lhs, p);
        JCTree rhs = copy(t.f535rhs, p);
        return this.f549M.m495at(t.f531pos).Assignop(t.getTag(), lhs, rhs);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitBinary(BinaryTree node, P p) {
        JCTree.JCBinary t = (JCTree.JCBinary) node;
        JCTree.JCExpression lhs = (JCTree.JCExpression) copy(t.f536lhs, p);
        JCTree.JCExpression rhs = (JCTree.JCExpression) copy(t.f537rhs, p);
        return this.f549M.m495at(t.f531pos).Binary(t.getTag(), lhs, rhs);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitBlock(BlockTree node, P p) {
        JCTree.JCBlock t = (JCTree.JCBlock) node;
        return this.f549M.m495at(t.f531pos).Block(t.flags, copy(t.stats, p));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitBreak(BreakTree node, P p) {
        JCTree.JCBreak t = (JCTree.JCBreak) node;
        return this.f549M.m495at(t.f531pos).Break(t.label);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitCase(CaseTree node, P p) {
        JCTree.JCCase t = (JCTree.JCCase) node;
        JCTree.JCExpression pat = (JCTree.JCExpression) copy(t.f538pat, p);
        return this.f549M.m495at(t.f531pos).Case(pat, copy(t.stats, p));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitCatch(CatchTree node, P p) {
        JCTree.JCCatch t = (JCTree.JCCatch) node;
        JCTree.JCVariableDecl param = (JCTree.JCVariableDecl) copy(t.param, p);
        JCTree.JCBlock body = (JCTree.JCBlock) copy(t.body, p);
        return this.f549M.m495at(t.f531pos).Catch(param, body);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitClass(ClassTree node, P p) {
        JCTree.JCClassDecl t = (JCTree.JCClassDecl) node;
        JCTree.JCModifiers mods = (JCTree.JCModifiers) copy(t.mods, p);
        List<T> listCopy = copy(t.typarams, p);
        JCTree.JCExpression extending = (JCTree.JCExpression) copy(t.extending, p);
        List<T> listCopy2 = copy(t.implementing, p);
        List<JCTree> defs = copy(t.defs, p);
        return this.f549M.m495at(t.f531pos).ClassDef(mods, t.name, listCopy, extending, listCopy2, defs);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitConditionalExpression(ConditionalExpressionTree node, P p) {
        JCTree.JCConditional t = (JCTree.JCConditional) node;
        JCTree.JCExpression cond = (JCTree.JCExpression) copy(t.cond, p);
        JCTree.JCExpression truepart = (JCTree.JCExpression) copy(t.truepart, p);
        JCTree.JCExpression falsepart = (JCTree.JCExpression) copy(t.falsepart, p);
        return this.f549M.m495at(t.f531pos).Conditional(cond, truepart, falsepart);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitContinue(ContinueTree node, P p) {
        JCTree.JCContinue t = (JCTree.JCContinue) node;
        return this.f549M.m495at(t.f531pos).Continue(t.label);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitDoWhileLoop(DoWhileLoopTree node, P p) {
        JCTree.JCDoWhileLoop t = (JCTree.JCDoWhileLoop) node;
        JCTree.JCStatement body = (JCTree.JCStatement) copy(t.body, p);
        JCTree.JCExpression cond = (JCTree.JCExpression) copy(t.cond, p);
        return this.f549M.m495at(t.f531pos).DoLoop(body, cond);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitErroneous(ErroneousTree node, P p) {
        JCTree.JCErroneous t = (JCTree.JCErroneous) node;
        return this.f549M.m495at(t.f531pos).Erroneous(copy(t.errs, p));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitExpressionStatement(ExpressionStatementTree node, P p) {
        JCTree.JCExpressionStatement t = (JCTree.JCExpressionStatement) node;
        JCTree.JCExpression expr = (JCTree.JCExpression) copy(t.expr, p);
        return this.f549M.m495at(t.f531pos).Exec(expr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitEnhancedForLoop(EnhancedForLoopTree node, P p) {
        JCTree.JCEnhancedForLoop t = (JCTree.JCEnhancedForLoop) node;
        JCTree.JCVariableDecl var = (JCTree.JCVariableDecl) copy(t.f541var, p);
        JCTree.JCExpression expr = (JCTree.JCExpression) copy(t.expr, p);
        JCTree.JCStatement body = (JCTree.JCStatement) copy(t.body, p);
        return this.f549M.m495at(t.f531pos).ForeachLoop(var, expr, body);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitForLoop(ForLoopTree node, P p) {
        JCTree.JCForLoop t = (JCTree.JCForLoop) node;
        List<T> listCopy = copy(t.init, p);
        JCTree.JCExpression cond = (JCTree.JCExpression) copy(t.cond, p);
        List<T> listCopy2 = copy(t.step, p);
        JCTree.JCStatement body = (JCTree.JCStatement) copy(t.body, p);
        return this.f549M.m495at(t.f531pos).ForLoop(listCopy, cond, listCopy2, body);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitIdentifier(IdentifierTree node, P p) {
        JCTree.JCIdent t = (JCTree.JCIdent) node;
        return this.f549M.m495at(t.f531pos).Ident(t.name);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitIf(IfTree node, P p) {
        JCTree.JCIf t = (JCTree.JCIf) node;
        JCTree.JCExpression cond = (JCTree.JCExpression) copy(t.cond, p);
        JCTree.JCStatement thenpart = (JCTree.JCStatement) copy(t.thenpart, p);
        JCTree.JCStatement elsepart = (JCTree.JCStatement) copy(t.elsepart, p);
        return this.f549M.m495at(t.f531pos).mo490If(cond, thenpart, elsepart);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitImport(ImportTree node, P p) {
        JCTree.JCImport t = (JCTree.JCImport) node;
        JCTree qualid = copy(t.qualid, p);
        return this.f549M.m495at(t.f531pos).Import(qualid, t.staticImport);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitArrayAccess(ArrayAccessTree node, P p) {
        JCTree.JCArrayAccess t = (JCTree.JCArrayAccess) node;
        JCTree.JCExpression indexed = (JCTree.JCExpression) copy(t.indexed, p);
        JCTree.JCExpression index = (JCTree.JCExpression) copy(t.index, p);
        return this.f549M.m495at(t.f531pos).Indexed(indexed, index);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitLabeledStatement(LabeledStatementTree node, P p) {
        JCTree.JCLabeledStatement t = (JCTree.JCLabeledStatement) node;
        return this.f549M.m495at(t.f531pos).Labelled(t.label, t.body);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitLiteral(LiteralTree node, P p) {
        JCTree.JCLiteral t = (JCTree.JCLiteral) node;
        return this.f549M.m495at(t.f531pos).Literal(t.typetag, t.value);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitMethod(MethodTree node, P p) {
        JCTree.JCMethodDecl t = (JCTree.JCMethodDecl) node;
        JCTree.JCModifiers mods = (JCTree.JCModifiers) copy(t.mods, p);
        JCTree.JCExpression restype = (JCTree.JCExpression) copy(t.restype, p);
        List<T> listCopy = copy(t.typarams, p);
        List<T> listCopy2 = copy(t.params, p);
        List<T> listCopy3 = copy(t.thrown, p);
        JCTree.JCBlock body = (JCTree.JCBlock) copy(t.body, p);
        JCTree.JCExpression defaultValue = (JCTree.JCExpression) copy(t.defaultValue, p);
        return this.f549M.m495at(t.f531pos).MethodDef(mods, t.name, restype, listCopy, listCopy2, listCopy3, body, defaultValue);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitMethodInvocation(MethodInvocationTree node, P p) {
        JCTree.JCMethodInvocation t = (JCTree.JCMethodInvocation) node;
        List<T> listCopy = copy(t.typeargs, p);
        JCTree.JCExpression meth = (JCTree.JCExpression) copy(t.meth, p);
        return this.f549M.m495at(t.f531pos).Apply(listCopy, meth, copy(t.args, p));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitModifiers(ModifiersTree node, P p) {
        JCTree.JCModifiers t = (JCTree.JCModifiers) node;
        return this.f549M.m495at(t.f531pos).Modifiers(t.flags, copy(t.annotations, p));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitNewArray(NewArrayTree node, P p) {
        JCTree.JCNewArray t = (JCTree.JCNewArray) node;
        JCTree.JCExpression elemtype = (JCTree.JCExpression) copy(t.elemtype, p);
        return this.f549M.m495at(t.f531pos).NewArray(elemtype, copy(t.dims, p), copy(t.elems, p));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitNewClass(NewClassTree node, P p) {
        JCTree.JCNewClass t = (JCTree.JCNewClass) node;
        JCTree.JCExpression encl = (JCTree.JCExpression) copy(t.encl, p);
        List<T> listCopy = copy(t.typeargs, p);
        JCTree.JCExpression clazz = (JCTree.JCExpression) copy(t.clazz, p);
        List<T> listCopy2 = copy(t.args, p);
        JCTree.JCClassDecl def = (JCTree.JCClassDecl) copy(t.f545def, p);
        return this.f549M.m495at(t.f531pos).NewClass(encl, listCopy, clazz, listCopy2, def);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitParenthesized(ParenthesizedTree node, P p) {
        JCTree.JCParens t = (JCTree.JCParens) node;
        JCTree.JCExpression expr = (JCTree.JCExpression) copy(t.expr, p);
        return this.f549M.m495at(t.f531pos).Parens(expr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitReturn(ReturnTree node, P p) {
        JCTree.JCReturn t = (JCTree.JCReturn) node;
        JCTree.JCExpression expr = (JCTree.JCExpression) copy(t.expr, p);
        return this.f549M.m495at(t.f531pos).Return(expr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitMemberSelect(MemberSelectTree node, P p) {
        JCTree.JCFieldAccess t = (JCTree.JCFieldAccess) node;
        JCTree.JCExpression selected = (JCTree.JCExpression) copy(t.selected, p);
        return this.f549M.m495at(t.f531pos).Select(selected, t.name);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitEmptyStatement(EmptyStatementTree node, P p) {
        JCTree.JCSkip t = (JCTree.JCSkip) node;
        return this.f549M.m495at(t.f531pos).Skip();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitSwitch(SwitchTree node, P p) {
        JCTree.JCSwitch t = (JCTree.JCSwitch) node;
        JCTree.JCExpression selector = (JCTree.JCExpression) copy(t.selector, p);
        return this.f549M.m495at(t.f531pos).Switch(selector, copy(t.cases, p));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitSynchronized(SynchronizedTree node, P p) {
        JCTree.JCSynchronized t = (JCTree.JCSynchronized) node;
        JCTree.JCExpression lock = (JCTree.JCExpression) copy(t.lock, p);
        JCTree.JCBlock body = (JCTree.JCBlock) copy(t.body, p);
        return this.f549M.m495at(t.f531pos).Synchronized(lock, body);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitThrow(ThrowTree node, P p) {
        JCTree.JCThrow t = (JCTree.JCThrow) node;
        JCTree expr = copy(t.expr, p);
        return this.f549M.m495at(t.f531pos).Throw(expr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitCompilationUnit(CompilationUnitTree node, P p) {
        JCTree.JCCompilationUnit t = (JCTree.JCCompilationUnit) node;
        List<T> listCopy = copy(t.packageAnnotations, p);
        JCTree.JCExpression pid = (JCTree.JCExpression) copy(t.f540pid, p);
        List<JCTree> defs = copy(t.defs, p);
        return this.f549M.m495at(t.f531pos).TopLevel(listCopy, pid, defs);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitTry(TryTree node, P p) {
        JCTree.JCTry t = (JCTree.JCTry) node;
        List<JCTree> resources = copy(t.resources, p);
        JCTree.JCBlock body = (JCTree.JCBlock) copy(t.body, p);
        List<T> listCopy = copy(t.catchers, p);
        JCTree.JCBlock finalizer = (JCTree.JCBlock) copy(t.finalizer, p);
        return this.f549M.m495at(t.f531pos).mo492Try(resources, body, listCopy, finalizer);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitParameterizedType(ParameterizedTypeTree node, P p) {
        JCTree.JCTypeApply t = (JCTree.JCTypeApply) node;
        JCTree.JCExpression clazz = (JCTree.JCExpression) copy(t.clazz, p);
        return this.f549M.m495at(t.f531pos).TypeApply(clazz, copy(t.arguments, p));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitUnionType(UnionTypeTree node, P p) {
        JCTree.JCTypeUnion t = (JCTree.JCTypeUnion) node;
        return this.f549M.m495at(t.f531pos).TypeUnion(copy(t.alternatives, p));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitArrayType(ArrayTypeTree node, P p) {
        JCTree.JCArrayTypeTree t = (JCTree.JCArrayTypeTree) node;
        JCTree.JCExpression elemtype = (JCTree.JCExpression) copy(t.elemtype, p);
        return this.f549M.m495at(t.f531pos).TypeArray(elemtype);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitTypeCast(TypeCastTree node, P p) {
        JCTree.JCTypeCast t = (JCTree.JCTypeCast) node;
        JCTree clazz = copy(t.clazz, p);
        JCTree.JCExpression expr = (JCTree.JCExpression) copy(t.expr, p);
        return this.f549M.m495at(t.f531pos).TypeCast(clazz, expr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitPrimitiveType(PrimitiveTypeTree node, P p) {
        JCTree.JCPrimitiveTypeTree t = (JCTree.JCPrimitiveTypeTree) node;
        return this.f549M.m495at(t.f531pos).TypeIdent(t.typetag);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitTypeParameter(TypeParameterTree node, P p) {
        JCTree.JCTypeParameter t = (JCTree.JCTypeParameter) node;
        return this.f549M.m495at(t.f531pos).TypeParameter(t.name, copy(t.bounds, p));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitInstanceOf(InstanceOfTree node, P p) {
        JCTree.JCInstanceOf t = (JCTree.JCInstanceOf) node;
        JCTree.JCExpression expr = (JCTree.JCExpression) copy(t.expr, p);
        JCTree clazz = copy(t.clazz, p);
        return this.f549M.m495at(t.f531pos).TypeTest(expr, clazz);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitUnary(UnaryTree node, P p) {
        JCTree.JCUnary t = (JCTree.JCUnary) node;
        JCTree.JCExpression arg = (JCTree.JCExpression) copy(t.f546arg, p);
        return this.f549M.m495at(t.f531pos).Unary(t.getTag(), arg);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitVariable(VariableTree node, P p) {
        JCTree.JCVariableDecl t = (JCTree.JCVariableDecl) node;
        JCTree.JCModifiers mods = (JCTree.JCModifiers) copy(t.mods, p);
        JCTree.JCExpression vartype = (JCTree.JCExpression) copy(t.vartype, p);
        JCTree.JCExpression init = (JCTree.JCExpression) copy(t.init, p);
        return this.f549M.m495at(t.f531pos).VarDef(mods, t.name, vartype, init);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitWhileLoop(WhileLoopTree node, P p) {
        JCTree.JCWhileLoop t = (JCTree.JCWhileLoop) node;
        JCTree.JCStatement body = (JCTree.JCStatement) copy(t.body, p);
        JCTree.JCExpression cond = (JCTree.JCExpression) copy(t.cond, p);
        return this.f549M.m495at(t.f531pos).WhileLoop(cond, body);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public JCTree visitWildcard(WildcardTree node, P p) {
        JCTree.JCWildcard t = (JCTree.JCWildcard) node;
        JCTree.TypeBoundKind kind = this.f549M.m495at(t.kind.f531pos).TypeBoundKind(t.kind.kind);
        JCTree inner = copy(t.inner, p);
        return this.f549M.m495at(t.f531pos).Wildcard(kind, inner);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public JCTree visitOther(Tree node, P p) {
        JCTree tree = (JCTree) node;
        if (tree.getTag() == 93) {
            JCTree.LetExpr t = (JCTree.LetExpr) node;
            List<T> listCopy = copy(t.defs, p);
            JCTree expr = copy(t.expr, p);
            return this.f549M.m495at(t.f531pos).LetExpr((List<JCTree.JCVariableDecl>) listCopy, expr);
        }
        throw new AssertionError("unknown tree tag: " + tree.getTag());
    }
}
