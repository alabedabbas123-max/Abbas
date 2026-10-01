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
import com.sun.source.tree.ExpressionTree;
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
import com.sun.source.tree.StatementTree;
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
import com.sun.tools.javac.code.BoundKind;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Position;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;
import java.util.Set;
import javax.lang.model.element.Modifier;
import javax.lang.model.type.TypeKind;
import javax.tools.JavaFileObject;

public abstract class JCTree implements Tree, Cloneable, JCDiagnostic.DiagnosticPosition {

    public static final int f512AND = 58;
    public static final int ANNOTATED_TYPE = 46;
    public static final int ANNOTATION = 44;
    public static final int APPLY = 26;
    public static final int ASGOffset = 17;
    public static final int ASSERT = 25;
    public static final int ASSIGN = 30;
    public static final int BITAND = 61;
    public static final int BITAND_ASG = 78;
    public static final int BITOR = 59;
    public static final int BITOR_ASG = 76;
    public static final int BITXOR = 60;
    public static final int BITXOR_ASG = 77;
    public static final int BLOCK = 7;
    public static final int BREAK = 21;
    public static final int CASE = 14;
    public static final int CATCH = 17;
    public static final int CLASSDEF = 3;
    public static final int COMPL = 51;
    public static final int CONDEXPR = 18;
    public static final int CONTINUE = 22;

    public static final int f513DIV = 74;
    public static final int DIV_ASG = 91;
    public static final int DOLOOP = 8;

    public static final int f514EQ = 62;
    public static final int ERRONEOUS = 47;
    public static final int EXEC = 20;
    public static final int FOREACHLOOP = 11;
    public static final int FORLOOP = 10;

    public static final int f515GE = 67;

    public static final int f516GT = 65;
    public static final int IDENT = 35;

    public static final int f517IF = 19;
    public static final int IMPORT = 2;
    public static final int INDEXED = 33;
    public static final int LABELLED = 12;

    public static final int f518LE = 66;
    public static final int LETEXPR = 93;
    public static final int LITERAL = 36;

    public static final int f519LT = 64;
    public static final int METHODDEF = 4;
    public static final int MINUS = 72;
    public static final int MINUS_ASG = 89;

    public static final int f520MOD = 75;
    public static final int MODIFIERS = 45;
    public static final int MOD_ASG = 92;

    public static final int f521MUL = 73;
    public static final int MUL_ASG = 90;

    public static final int f522NE = 63;

    public static final int f523NEG = 49;
    public static final int NEWARRAY = 28;
    public static final int NEWCLASS = 27;

    public static final int f524NOT = 50;
    public static final int NULLCHK = 56;

    public static final int f525OR = 57;
    public static final int PARENS = 29;
    public static final int PLUS = 71;
    public static final int PLUS_ASG = 88;

    public static final int f526POS = 48;
    public static final int POSTDEC = 55;
    public static final int POSTINC = 54;
    public static final int PREDEC = 53;
    public static final int PREINC = 52;
    public static final int RETURN = 23;
    public static final int SELECT = 34;
    public static final int SKIP = 6;

    public static final int f527SL = 68;
    public static final int SL_ASG = 85;

    public static final int f528SR = 69;
    public static final int SR_ASG = 86;
    public static final int SWITCH = 13;
    public static final int SYNCHRONIZED = 15;
    public static final int THROW = 24;
    public static final int TOPLEVEL = 1;

    public static final int f529TRY = 16;
    public static final int TYPEAPPLY = 39;
    public static final int TYPEARRAY = 38;
    public static final int TYPEBOUNDKIND = 43;
    public static final int TYPECAST = 31;
    public static final int TYPEIDENT = 37;
    public static final int TYPEPARAMETER = 41;
    public static final int TYPETEST = 32;
    public static final int TYPEUNION = 40;

    public static final int f530USR = 70;
    public static final int USR_ASG = 87;
    public static final int VARDEF = 5;
    public static final int WHILELOOP = 9;
    public static final int WILDCARD = 42;

    public int f531pos;
    public Type type;

    public interface Factory {
        JCAnnotation Annotation(JCTree jCTree, List<JCExpression> list);

        JCMethodInvocation Apply(List<JCExpression> list, JCExpression jCExpression, List<JCExpression> list2);

        JCAssert Assert(JCExpression jCExpression, JCExpression jCExpression2);

        JCAssign Assign(JCExpression jCExpression, JCExpression jCExpression2);

        JCAssignOp Assignop(int i, JCTree jCTree, JCTree jCTree2);

        JCBinary Binary(int i, JCExpression jCExpression, JCExpression jCExpression2);

        JCBlock Block(long j, List<JCStatement> list);

        JCBreak Break(Name name);

        JCCase Case(JCExpression jCExpression, List<JCStatement> list);

        JCCatch Catch(JCVariableDecl jCVariableDecl, JCBlock jCBlock);

        JCClassDecl ClassDef(JCModifiers jCModifiers, Name name, List<JCTypeParameter> list, JCExpression jCExpression, List<JCExpression> list2, List<JCTree> list3);

        JCConditional Conditional(JCExpression jCExpression, JCExpression jCExpression2, JCExpression jCExpression3);

        JCContinue Continue(Name name);

        JCDoWhileLoop DoLoop(JCStatement jCStatement, JCExpression jCExpression);

        JCErroneous Erroneous(List<? extends JCTree> list);

        JCExpressionStatement Exec(JCExpression jCExpression);

        JCForLoop ForLoop(List<JCStatement> list, JCExpression jCExpression, List<JCExpressionStatement> list2, JCStatement jCStatement);

        JCEnhancedForLoop ForeachLoop(JCVariableDecl jCVariableDecl, JCExpression jCExpression, JCStatement jCStatement);

        JCIdent Ident(Name name);

        JCIf mo490If(JCExpression jCExpression, JCStatement jCStatement, JCStatement jCStatement2);

        JCImport Import(JCTree jCTree, boolean z);

        JCArrayAccess Indexed(JCExpression jCExpression, JCExpression jCExpression2);

        JCLabeledStatement Labelled(Name name, JCStatement jCStatement);

        LetExpr LetExpr(List<JCVariableDecl> list, JCTree jCTree);

        JCLiteral Literal(int i, Object obj);

        JCMethodDecl MethodDef(JCModifiers jCModifiers, Name name, JCExpression jCExpression, List<JCTypeParameter> list, List<JCVariableDecl> list2, List<JCExpression> list3, JCBlock jCBlock, JCExpression jCExpression2);

        JCModifiers Modifiers(long j, List<JCAnnotation> list);

        JCNewArray NewArray(JCExpression jCExpression, List<JCExpression> list, List<JCExpression> list2);

        JCNewClass NewClass(JCExpression jCExpression, List<JCExpression> list, JCExpression jCExpression2, List<JCExpression> list2, JCClassDecl jCClassDecl);

        JCParens Parens(JCExpression jCExpression);

        JCReturn Return(JCExpression jCExpression);

        JCFieldAccess Select(JCExpression jCExpression, Name name);

        JCSkip Skip();

        JCSwitch Switch(JCExpression jCExpression, List<JCCase> list);

        JCSynchronized Synchronized(JCExpression jCExpression, JCBlock jCBlock);

        JCThrow Throw(JCTree jCTree);

        JCCompilationUnit TopLevel(List<JCAnnotation> list, JCExpression jCExpression, List<JCTree> list2);

        JCTry mo491Try(JCBlock jCBlock, List<JCCatch> list, JCBlock jCBlock2);

        JCTry mo492Try(List<JCTree> list, JCBlock jCBlock, List<JCCatch> list2, JCBlock jCBlock2);

        JCTypeApply TypeApply(JCExpression jCExpression, List<JCExpression> list);

        JCArrayTypeTree TypeArray(JCExpression jCExpression);

        TypeBoundKind TypeBoundKind(BoundKind boundKind);

        JCTypeCast TypeCast(JCTree jCTree, JCExpression jCExpression);

        JCPrimitiveTypeTree TypeIdent(int i);

        JCTypeParameter TypeParameter(Name name, List<JCExpression> list);

        JCInstanceOf TypeTest(JCExpression jCExpression, JCTree jCTree);

        JCUnary Unary(int i, JCExpression jCExpression);

        JCVariableDecl VarDef(JCModifiers jCModifiers, Name name, JCExpression jCExpression, JCExpression jCExpression2);

        JCWhileLoop WhileLoop(JCExpression jCExpression, JCStatement jCStatement);

        JCWildcard Wildcard(TypeBoundKind typeBoundKind, JCTree jCTree);
    }

    @Override
    public abstract <R, D> R accept(TreeVisitor<R, D> treeVisitor, D d);

    public abstract void accept(Visitor visitor);

    public abstract int getTag();

    public String toString() {
        StringWriter s = new StringWriter();
        try {
            new Pretty(s, false).printExpr(this);
            return s.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public JCTree setPos(int pos) {
        this.f531pos = pos;
        return this;
    }

    public JCTree setType(Type type) {
        this.type = type;
        return this;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public JCDiagnostic.DiagnosticPosition m489pos() {
        return this;
    }

    @Override
    public JCTree getTree() {
        return this;
    }

    @Override
    public int getStartPosition() {
        return TreeInfo.getStartPos(this);
    }

    @Override
    public int getPreferredPosition() {
        return this.f531pos;
    }

    @Override
    public int getEndPosition(Map<JCTree, Integer> endPosTable) {
        return TreeInfo.getEndPos(this, endPosTable);
    }

    public static class JCCompilationUnit extends JCTree implements CompilationUnitTree {
        public List<JCTree> defs;
        public long flags;
        public Scope.ImportScope namedImportScope;
        public List<JCAnnotation> packageAnnotations;
        public Symbol.PackageSymbol packge;

        public JCExpression f540pid;
        public JavaFileObject sourcefile;
        public Scope.StarImportScope starImportScope;
        public Position.LineMap lineMap = null;
        public Map<JCTree, String> docComments = null;
        public Map<JCTree, Integer> endPositions = null;

        protected JCCompilationUnit(List<JCAnnotation> packageAnnotations, JCExpression pid, List<JCTree> defs, JavaFileObject sourcefile, Symbol.PackageSymbol packge, Scope.ImportScope namedImportScope, Scope.StarImportScope starImportScope) {
            this.packageAnnotations = packageAnnotations;
            this.f540pid = pid;
            this.defs = defs;
            this.sourcefile = sourcefile;
            this.packge = packge;
            this.namedImportScope = namedImportScope;
            this.starImportScope = starImportScope;
        }

        @Override
        public void accept(Visitor v) {
            v.visitTopLevel(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.COMPILATION_UNIT;
        }

        @Override
        public List<JCAnnotation> getPackageAnnotations() {
            return this.packageAnnotations;
        }

        @Override
        public List<JCImport> getImports() {
            ListBuffer<JCImport> imports = new ListBuffer<>();
            for (JCTree tree : this.defs) {
                int tag = tree.getTag();
                if (tag == 2) {
                    imports.append((JCImport) tree);
                } else if (tag != 6) {
                    break;
                }
            }
            return imports.toList();
        }

        @Override
        public JCExpression getPackageName() {
            return this.f540pid;
        }

        @Override
        public JavaFileObject getSourceFile() {
            return this.sourcefile;
        }

        @Override
        public Position.LineMap getLineMap() {
            return this.lineMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public List<JCTree> getTypeDecls() {
            List list = this.defs;
            while (!list.isEmpty() && ((JCTree) list.head).getTag() == 2) {
                list = list.tail;
            }
            return list;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitCompilationUnit(this, d);
        }

        @Override
        public int getTag() {
            return 1;
        }
    }

    public static class JCImport extends JCTree implements ImportTree {
        public JCTree qualid;
        public boolean staticImport;

        protected JCImport(JCTree qualid, boolean importStatic) {
            this.qualid = qualid;
            this.staticImport = importStatic;
        }

        @Override
        public void accept(Visitor v) {
            v.visitImport(this);
        }

        @Override
        public boolean isStatic() {
            return this.staticImport;
        }

        @Override
        public JCTree getQualifiedIdentifier() {
            return this.qualid;
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.IMPORT;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitImport(this, d);
        }

        @Override
        public int getTag() {
            return 2;
        }
    }

    public static abstract class JCStatement extends JCTree implements StatementTree {
        @Override
        public JCStatement setType(Type type) {
            super.setType(type);
            return this;
        }

        @Override
        public JCStatement setPos(int pos) {
            super.setPos(pos);
            return this;
        }
    }

    public static abstract class JCExpression extends JCTree implements ExpressionTree {
        @Override
        public JCExpression setType(Type type) {
            super.setType(type);
            return this;
        }

        @Override
        public JCExpression setPos(int pos) {
            super.setPos(pos);
            return this;
        }
    }

    public static class JCClassDecl extends JCStatement implements ClassTree {
        public List<JCTree> defs;
        public JCExpression extending;
        public List<JCExpression> implementing;
        public JCModifiers mods;
        public Name name;

        public Symbol.ClassSymbol f539sym;
        public List<JCTypeParameter> typarams;

        protected JCClassDecl(JCModifiers mods, Name name, List<JCTypeParameter> typarams, JCExpression extending, List<JCExpression> implementing, List<JCTree> defs, Symbol.ClassSymbol sym) {
            this.mods = mods;
            this.name = name;
            this.typarams = typarams;
            this.extending = extending;
            this.implementing = implementing;
            this.defs = defs;
            this.f539sym = sym;
        }

        @Override
        public void accept(Visitor v) {
            v.visitClassDef(this);
        }

        @Override
        public Tree.Kind getKind() {
            if ((this.mods.flags & 8192) != 0) {
                return Tree.Kind.ANNOTATION_TYPE;
            }
            if ((this.mods.flags & 512) != 0) {
                return Tree.Kind.INTERFACE;
            }
            if ((this.mods.flags & 16384) != 0) {
                return Tree.Kind.ENUM;
            }
            return Tree.Kind.CLASS;
        }

        @Override
        public JCModifiers getModifiers() {
            return this.mods;
        }

        @Override
        public Name getSimpleName() {
            return this.name;
        }

        @Override
        public List<JCTypeParameter> getTypeParameters() {
            return this.typarams;
        }

        @Override
        public JCTree getExtendsClause() {
            return this.extending;
        }

        @Override
        public List<JCExpression> getImplementsClause() {
            return this.implementing;
        }

        @Override
        public List<JCTree> getMembers() {
            return this.defs;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitClass(this, d);
        }

        @Override
        public int getTag() {
            return 3;
        }
    }

    public static class JCMethodDecl extends JCTree implements MethodTree {
        public JCBlock body;
        public JCExpression defaultValue;
        public JCModifiers mods;
        public Name name;
        public List<JCVariableDecl> params;
        public JCExpression restype;

        public Symbol.MethodSymbol f544sym;
        public List<JCExpression> thrown;
        public List<JCTypeParameter> typarams;

        protected JCMethodDecl(JCModifiers mods, Name name, JCExpression restype, List<JCTypeParameter> typarams, List<JCVariableDecl> params, List<JCExpression> thrown, JCBlock body, JCExpression defaultValue, Symbol.MethodSymbol sym) {
            this.mods = mods;
            this.name = name;
            this.restype = restype;
            this.typarams = typarams;
            this.params = params;
            this.thrown = thrown;
            this.body = body;
            this.defaultValue = defaultValue;
            this.f544sym = sym;
        }

        @Override
        public void accept(Visitor v) {
            v.visitMethodDef(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.METHOD;
        }

        @Override
        public JCModifiers getModifiers() {
            return this.mods;
        }

        @Override
        public Name getName() {
            return this.name;
        }

        @Override
        public JCTree getReturnType() {
            return this.restype;
        }

        @Override
        public List<JCTypeParameter> getTypeParameters() {
            return this.typarams;
        }

        @Override
        public List<JCVariableDecl> getParameters() {
            return this.params;
        }

        @Override
        public List<JCExpression> getThrows() {
            return this.thrown;
        }

        @Override
        public JCBlock getBody() {
            return this.body;
        }

        @Override
        public JCTree getDefaultValue() {
            return this.defaultValue;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitMethod(this, d);
        }

        @Override
        public int getTag() {
            return 4;
        }
    }

    public static class JCVariableDecl extends JCStatement implements VariableTree {
        public JCExpression init;
        public JCModifiers mods;
        public Name name;

        public Symbol.VarSymbol f547sym;
        public JCExpression vartype;

        protected JCVariableDecl(JCModifiers mods, Name name, JCExpression vartype, JCExpression init, Symbol.VarSymbol sym) {
            this.mods = mods;
            this.name = name;
            this.vartype = vartype;
            this.init = init;
            this.f547sym = sym;
        }

        @Override
        public void accept(Visitor v) {
            v.visitVarDef(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.VARIABLE;
        }

        @Override
        public JCModifiers getModifiers() {
            return this.mods;
        }

        @Override
        public Name getName() {
            return this.name;
        }

        @Override
        public JCTree getType() {
            return this.vartype;
        }

        @Override
        public JCExpression getInitializer() {
            return this.init;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitVariable(this, d);
        }

        @Override
        public int getTag() {
            return 5;
        }
    }

    public static class JCSkip extends JCStatement implements EmptyStatementTree {
        protected JCSkip() {
        }

        @Override
        public void accept(Visitor v) {
            v.visitSkip(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.EMPTY_STATEMENT;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitEmptyStatement(this, d);
        }

        @Override
        public int getTag() {
            return 6;
        }
    }

    public static class JCBlock extends JCStatement implements BlockTree {
        public int endpos = -1;
        public long flags;
        public List<JCStatement> stats;

        protected JCBlock(long flags, List<JCStatement> stats) {
            this.stats = stats;
            this.flags = flags;
        }

        @Override
        public void accept(Visitor v) {
            v.visitBlock(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.BLOCK;
        }

        @Override
        public List<JCStatement> getStatements() {
            return this.stats;
        }

        @Override
        public boolean isStatic() {
            return (this.flags & 8) != 0;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitBlock(this, d);
        }

        @Override
        public int getTag() {
            return 7;
        }
    }

    public static class JCDoWhileLoop extends JCStatement implements DoWhileLoopTree {
        public JCStatement body;
        public JCExpression cond;

        protected JCDoWhileLoop(JCStatement body, JCExpression cond) {
            this.body = body;
            this.cond = cond;
        }

        @Override
        public void accept(Visitor v) {
            v.visitDoLoop(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.DO_WHILE_LOOP;
        }

        @Override
        public JCExpression getCondition() {
            return this.cond;
        }

        @Override
        public JCStatement getStatement() {
            return this.body;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitDoWhileLoop(this, d);
        }

        @Override
        public int getTag() {
            return 8;
        }
    }

    public static class JCWhileLoop extends JCStatement implements WhileLoopTree {
        public JCStatement body;
        public JCExpression cond;

        protected JCWhileLoop(JCExpression cond, JCStatement body) {
            this.cond = cond;
            this.body = body;
        }

        @Override
        public void accept(Visitor v) {
            v.visitWhileLoop(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.WHILE_LOOP;
        }

        @Override
        public JCExpression getCondition() {
            return this.cond;
        }

        @Override
        public JCStatement getStatement() {
            return this.body;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitWhileLoop(this, d);
        }

        @Override
        public int getTag() {
            return 9;
        }
    }

    public static class JCForLoop extends JCStatement implements ForLoopTree {
        public JCStatement body;
        public JCExpression cond;
        public List<JCStatement> init;
        public List<JCExpressionStatement> step;

        protected JCForLoop(List<JCStatement> init, JCExpression cond, List<JCExpressionStatement> update, JCStatement body) {
            this.init = init;
            this.cond = cond;
            this.step = update;
            this.body = body;
        }

        @Override
        public void accept(Visitor v) {
            v.visitForLoop(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.FOR_LOOP;
        }

        @Override
        public JCExpression getCondition() {
            return this.cond;
        }

        @Override
        public JCStatement getStatement() {
            return this.body;
        }

        @Override
        public List<JCStatement> getInitializer() {
            return this.init;
        }

        @Override
        public List<JCExpressionStatement> getUpdate() {
            return this.step;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitForLoop(this, d);
        }

        @Override
        public int getTag() {
            return 10;
        }
    }

    public static class JCEnhancedForLoop extends JCStatement implements EnhancedForLoopTree {
        public JCStatement body;
        public JCExpression expr;

        public JCVariableDecl f541var;

        protected JCEnhancedForLoop(JCVariableDecl var, JCExpression expr, JCStatement body) {
            this.f541var = var;
            this.expr = expr;
            this.body = body;
        }

        @Override
        public void accept(Visitor v) {
            v.visitForeachLoop(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.ENHANCED_FOR_LOOP;
        }

        @Override
        public JCVariableDecl getVariable() {
            return this.f541var;
        }

        @Override
        public JCExpression getExpression() {
            return this.expr;
        }

        @Override
        public JCStatement getStatement() {
            return this.body;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitEnhancedForLoop(this, d);
        }

        @Override
        public int getTag() {
            return 11;
        }
    }

    public static class JCLabeledStatement extends JCStatement implements LabeledStatementTree {
        public JCStatement body;
        public Name label;

        protected JCLabeledStatement(Name label, JCStatement body) {
            this.label = label;
            this.body = body;
        }

        @Override
        public void accept(Visitor v) {
            v.visitLabelled(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.LABELED_STATEMENT;
        }

        @Override
        public Name getLabel() {
            return this.label;
        }

        @Override
        public JCStatement getStatement() {
            return this.body;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitLabeledStatement(this, d);
        }

        @Override
        public int getTag() {
            return 12;
        }
    }

    public static class JCSwitch extends JCStatement implements SwitchTree {
        public List<JCCase> cases;
        public JCExpression selector;

        protected JCSwitch(JCExpression selector, List<JCCase> cases) {
            this.selector = selector;
            this.cases = cases;
        }

        @Override
        public void accept(Visitor v) {
            v.visitSwitch(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.SWITCH;
        }

        @Override
        public JCExpression getExpression() {
            return this.selector;
        }

        @Override
        public List<JCCase> getCases() {
            return this.cases;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitSwitch(this, d);
        }

        @Override
        public int getTag() {
            return 13;
        }
    }

    public static class JCCase extends JCStatement implements CaseTree {

        public JCExpression f538pat;
        public List<JCStatement> stats;

        protected JCCase(JCExpression pat, List<JCStatement> stats) {
            this.f538pat = pat;
            this.stats = stats;
        }

        @Override
        public void accept(Visitor v) {
            v.visitCase(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.CASE;
        }

        @Override
        public JCExpression getExpression() {
            return this.f538pat;
        }

        @Override
        public List<JCStatement> getStatements() {
            return this.stats;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitCase(this, d);
        }

        @Override
        public int getTag() {
            return 14;
        }
    }

    public static class JCSynchronized extends JCStatement implements SynchronizedTree {
        public JCBlock body;
        public JCExpression lock;

        protected JCSynchronized(JCExpression lock, JCBlock body) {
            this.lock = lock;
            this.body = body;
        }

        @Override
        public void accept(Visitor v) {
            v.visitSynchronized(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.SYNCHRONIZED;
        }

        @Override
        public JCExpression getExpression() {
            return this.lock;
        }

        @Override
        public JCBlock getBlock() {
            return this.body;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitSynchronized(this, d);
        }

        @Override
        public int getTag() {
            return 15;
        }
    }

    public static class JCTry extends JCStatement implements TryTree {
        public JCBlock body;
        public List<JCCatch> catchers;
        public JCBlock finalizer;
        public List<JCTree> resources;

        protected JCTry(List<JCTree> resources, JCBlock body, List<JCCatch> catchers, JCBlock finalizer) {
            this.body = body;
            this.catchers = catchers;
            this.finalizer = finalizer;
            this.resources = resources;
        }

        @Override
        public void accept(Visitor v) {
            v.visitTry(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.TRY;
        }

        @Override
        public JCBlock getBlock() {
            return this.body;
        }

        @Override
        public List<JCCatch> getCatches() {
            return this.catchers;
        }

        @Override
        public JCBlock getFinallyBlock() {
            return this.finalizer;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitTry(this, d);
        }

        @Override
        public List<? extends JCTree> getResources() {
            return this.resources;
        }

        @Override
        public int getTag() {
            return 16;
        }
    }

    public static class JCCatch extends JCTree implements CatchTree {
        public JCBlock body;
        public JCVariableDecl param;

        protected JCCatch(JCVariableDecl param, JCBlock body) {
            this.param = param;
            this.body = body;
        }

        @Override
        public void accept(Visitor v) {
            v.visitCatch(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.CATCH;
        }

        @Override
        public JCVariableDecl getParameter() {
            return this.param;
        }

        @Override
        public JCBlock getBlock() {
            return this.body;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitCatch(this, d);
        }

        @Override
        public int getTag() {
            return 17;
        }
    }

    public static class JCConditional extends JCExpression implements ConditionalExpressionTree {
        public JCExpression cond;
        public JCExpression falsepart;
        public JCExpression truepart;

        protected JCConditional(JCExpression cond, JCExpression truepart, JCExpression falsepart) {
            this.cond = cond;
            this.truepart = truepart;
            this.falsepart = falsepart;
        }

        @Override
        public void accept(Visitor v) {
            v.visitConditional(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.CONDITIONAL_EXPRESSION;
        }

        @Override
        public JCExpression getCondition() {
            return this.cond;
        }

        @Override
        public JCExpression getTrueExpression() {
            return this.truepart;
        }

        @Override
        public JCExpression getFalseExpression() {
            return this.falsepart;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitConditionalExpression(this, d);
        }

        @Override
        public int getTag() {
            return 18;
        }
    }

    public static class JCIf extends JCStatement implements IfTree {
        public JCExpression cond;
        public JCStatement elsepart;
        public JCStatement thenpart;

        protected JCIf(JCExpression cond, JCStatement thenpart, JCStatement elsepart) {
            this.cond = cond;
            this.thenpart = thenpart;
            this.elsepart = elsepart;
        }

        @Override
        public void accept(Visitor v) {
            v.visitIf(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.IF;
        }

        @Override
        public JCExpression getCondition() {
            return this.cond;
        }

        @Override
        public JCStatement getThenStatement() {
            return this.thenpart;
        }

        @Override
        public JCStatement getElseStatement() {
            return this.elsepart;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitIf(this, d);
        }

        @Override
        public int getTag() {
            return 19;
        }
    }

    public static class JCExpressionStatement extends JCStatement implements ExpressionStatementTree {
        public JCExpression expr;

        protected JCExpressionStatement(JCExpression expr) {
            this.expr = expr;
        }

        @Override
        public void accept(Visitor v) {
            v.visitExec(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.EXPRESSION_STATEMENT;
        }

        @Override
        public JCExpression getExpression() {
            return this.expr;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitExpressionStatement(this, d);
        }

        @Override
        public int getTag() {
            return 20;
        }
    }

    public static class JCBreak extends JCStatement implements BreakTree {
        public Name label;
        public JCTree target;

        protected JCBreak(Name label, JCTree target) {
            this.label = label;
            this.target = target;
        }

        @Override
        public void accept(Visitor v) {
            v.visitBreak(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.BREAK;
        }

        @Override
        public Name getLabel() {
            return this.label;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitBreak(this, d);
        }

        @Override
        public int getTag() {
            return 21;
        }
    }

    public static class JCContinue extends JCStatement implements ContinueTree {
        public Name label;
        public JCTree target;

        protected JCContinue(Name label, JCTree target) {
            this.label = label;
            this.target = target;
        }

        @Override
        public void accept(Visitor v) {
            v.visitContinue(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.CONTINUE;
        }

        @Override
        public Name getLabel() {
            return this.label;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitContinue(this, d);
        }

        @Override
        public int getTag() {
            return 22;
        }
    }

    public static class JCReturn extends JCStatement implements ReturnTree {
        public JCExpression expr;

        protected JCReturn(JCExpression expr) {
            this.expr = expr;
        }

        @Override
        public void accept(Visitor v) {
            v.visitReturn(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.RETURN;
        }

        @Override
        public JCExpression getExpression() {
            return this.expr;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitReturn(this, d);
        }

        @Override
        public int getTag() {
            return 23;
        }
    }

    public static class JCThrow extends JCStatement implements ThrowTree {
        public JCExpression expr;

        protected JCThrow(JCTree expr) {
            this.expr = (JCExpression) expr;
        }

        @Override
        public void accept(Visitor v) {
            v.visitThrow(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.THROW;
        }

        @Override
        public JCExpression getExpression() {
            return this.expr;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitThrow(this, d);
        }

        @Override
        public int getTag() {
            return 24;
        }
    }

    public static class JCAssert extends JCStatement implements AssertTree {
        public JCExpression cond;
        public JCExpression detail;

        protected JCAssert(JCExpression cond, JCExpression detail) {
            this.cond = cond;
            this.detail = detail;
        }

        @Override
        public void accept(Visitor v) {
            v.visitAssert(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.ASSERT;
        }

        @Override
        public JCExpression getCondition() {
            return this.cond;
        }

        @Override
        public JCExpression getDetail() {
            return this.detail;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitAssert(this, d);
        }

        @Override
        public int getTag() {
            return 25;
        }
    }

    public static class JCMethodInvocation extends JCExpression implements MethodInvocationTree {
        public List<JCExpression> args;
        public JCExpression meth;
        public List<JCExpression> typeargs;
        public Type varargsElement;

        protected JCMethodInvocation(List<JCExpression> typeargs, JCExpression meth, List<JCExpression> args) {
            this.typeargs = typeargs == null ? List.m507nil() : typeargs;
            this.meth = meth;
            this.args = args;
        }

        @Override
        public void accept(Visitor v) {
            v.visitApply(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.METHOD_INVOCATION;
        }

        @Override
        public List<JCExpression> getTypeArguments() {
            return this.typeargs;
        }

        @Override
        public JCExpression getMethodSelect() {
            return this.meth;
        }

        @Override
        public List<JCExpression> getArguments() {
            return this.args;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitMethodInvocation(this, d);
        }

        @Override
        public JCMethodInvocation setType(Type type) {
            super.setType(type);
            return this;
        }

        @Override
        public int getTag() {
            return 26;
        }
    }

    public static class JCNewClass extends JCExpression implements NewClassTree {
        public List<JCExpression> args;
        public JCExpression clazz;
        public Symbol constructor;
        public Type constructorType;

        public JCClassDecl f545def;
        public JCExpression encl;
        public List<JCExpression> typeargs;
        public Type varargsElement;

        protected JCNewClass(JCExpression encl, List<JCExpression> typeargs, JCExpression clazz, List<JCExpression> args, JCClassDecl def) {
            this.encl = encl;
            this.typeargs = typeargs == null ? List.m507nil() : typeargs;
            this.clazz = clazz;
            this.args = args;
            this.f545def = def;
        }

        @Override
        public void accept(Visitor v) {
            v.visitNewClass(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.NEW_CLASS;
        }

        @Override
        public JCExpression getEnclosingExpression() {
            return this.encl;
        }

        @Override
        public List<JCExpression> getTypeArguments() {
            return this.typeargs;
        }

        @Override
        public JCExpression getIdentifier() {
            return this.clazz;
        }

        @Override
        public List<JCExpression> getArguments() {
            return this.args;
        }

        @Override
        public JCClassDecl getClassBody() {
            return this.f545def;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitNewClass(this, d);
        }

        @Override
        public int getTag() {
            return 27;
        }
    }

    public static class JCNewArray extends JCExpression implements NewArrayTree {
        public List<JCExpression> dims;
        public List<JCExpression> elems;
        public JCExpression elemtype;

        protected JCNewArray(JCExpression elemtype, List<JCExpression> dims, List<JCExpression> elems) {
            this.elemtype = elemtype;
            this.dims = dims;
            this.elems = elems;
        }

        @Override
        public void accept(Visitor v) {
            v.visitNewArray(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.NEW_ARRAY;
        }

        @Override
        public JCExpression getType() {
            return this.elemtype;
        }

        @Override
        public List<JCExpression> getDimensions() {
            return this.dims;
        }

        @Override
        public List<JCExpression> getInitializers() {
            return this.elems;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitNewArray(this, d);
        }

        @Override
        public int getTag() {
            return 28;
        }
    }

    public static class JCParens extends JCExpression implements ParenthesizedTree {
        public JCExpression expr;

        protected JCParens(JCExpression expr) {
            this.expr = expr;
        }

        @Override
        public void accept(Visitor v) {
            v.visitParens(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.PARENTHESIZED;
        }

        @Override
        public JCExpression getExpression() {
            return this.expr;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitParenthesized(this, d);
        }

        @Override
        public int getTag() {
            return 29;
        }
    }

    public static class JCAssign extends JCExpression implements AssignmentTree {

        public JCExpression f532lhs;

        public JCExpression f533rhs;

        protected JCAssign(JCExpression lhs, JCExpression rhs) {
            this.f532lhs = lhs;
            this.f533rhs = rhs;
        }

        @Override
        public void accept(Visitor v) {
            v.visitAssign(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.ASSIGNMENT;
        }

        @Override
        public JCExpression getVariable() {
            return this.f532lhs;
        }

        @Override
        public JCExpression getExpression() {
            return this.f533rhs;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitAssignment(this, d);
        }

        @Override
        public int getTag() {
            return 30;
        }
    }

    public static class JCAssignOp extends JCExpression implements CompoundAssignmentTree {

        public JCExpression f534lhs;
        private int opcode;
        public Symbol operator;

        public JCExpression f535rhs;

        protected JCAssignOp(int opcode, JCTree lhs, JCTree rhs, Symbol operator) {
            this.opcode = opcode;
            this.f534lhs = (JCExpression) lhs;
            this.f535rhs = (JCExpression) rhs;
            this.operator = operator;
        }

        @Override
        public void accept(Visitor v) {
            v.visitAssignop(this);
        }

        @Override
        public Tree.Kind getKind() {
            return TreeInfo.tagToKind(getTag());
        }

        @Override
        public JCExpression getVariable() {
            return this.f534lhs;
        }

        @Override
        public JCExpression getExpression() {
            return this.f535rhs;
        }

        public Symbol getOperator() {
            return this.operator;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitCompoundAssignment(this, d);
        }

        @Override
        public int getTag() {
            return this.opcode;
        }
    }

    public static class JCUnary extends JCExpression implements UnaryTree {

        public JCExpression f546arg;
        private int opcode;
        public Symbol operator;

        protected JCUnary(int opcode, JCExpression arg) {
            this.opcode = opcode;
            this.f546arg = arg;
        }

        @Override
        public void accept(Visitor v) {
            v.visitUnary(this);
        }

        @Override
        public Tree.Kind getKind() {
            return TreeInfo.tagToKind(getTag());
        }

        @Override
        public JCExpression getExpression() {
            return this.f546arg;
        }

        public Symbol getOperator() {
            return this.operator;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitUnary(this, d);
        }

        @Override
        public int getTag() {
            return this.opcode;
        }

        public void setTag(int tag) {
            this.opcode = tag;
        }
    }

    public static class JCBinary extends JCExpression implements BinaryTree {

        public JCExpression f536lhs;
        private int opcode;
        public Symbol operator;

        public JCExpression f537rhs;

        protected JCBinary(int opcode, JCExpression lhs, JCExpression rhs, Symbol operator) {
            this.opcode = opcode;
            this.f536lhs = lhs;
            this.f537rhs = rhs;
            this.operator = operator;
        }

        @Override
        public void accept(Visitor v) {
            v.visitBinary(this);
        }

        @Override
        public Tree.Kind getKind() {
            return TreeInfo.tagToKind(getTag());
        }

        @Override
        public JCExpression getLeftOperand() {
            return this.f536lhs;
        }

        @Override
        public JCExpression getRightOperand() {
            return this.f537rhs;
        }

        public Symbol getOperator() {
            return this.operator;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitBinary(this, d);
        }

        @Override
        public int getTag() {
            return this.opcode;
        }
    }

    public static class JCTypeCast extends JCExpression implements TypeCastTree {
        public JCTree clazz;
        public JCExpression expr;

        protected JCTypeCast(JCTree clazz, JCExpression expr) {
            this.clazz = clazz;
            this.expr = expr;
        }

        @Override
        public void accept(Visitor v) {
            v.visitTypeCast(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.TYPE_CAST;
        }

        @Override
        public JCTree getType() {
            return this.clazz;
        }

        @Override
        public JCExpression getExpression() {
            return this.expr;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitTypeCast(this, d);
        }

        @Override
        public int getTag() {
            return 31;
        }
    }

    public static class JCInstanceOf extends JCExpression implements InstanceOfTree {
        public JCTree clazz;
        public JCExpression expr;

        protected JCInstanceOf(JCExpression expr, JCTree clazz) {
            this.expr = expr;
            this.clazz = clazz;
        }

        @Override
        public void accept(Visitor v) {
            v.visitTypeTest(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.INSTANCE_OF;
        }

        @Override
        public JCTree getType() {
            return this.clazz;
        }

        @Override
        public JCExpression getExpression() {
            return this.expr;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitInstanceOf(this, d);
        }

        @Override
        public int getTag() {
            return 32;
        }
    }

    public static class JCArrayAccess extends JCExpression implements ArrayAccessTree {
        public JCExpression index;
        public JCExpression indexed;

        protected JCArrayAccess(JCExpression indexed, JCExpression index) {
            this.indexed = indexed;
            this.index = index;
        }

        @Override
        public void accept(Visitor v) {
            v.visitIndexed(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.ARRAY_ACCESS;
        }

        @Override
        public JCExpression getExpression() {
            return this.indexed;
        }

        @Override
        public JCExpression getIndex() {
            return this.index;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitArrayAccess(this, d);
        }

        @Override
        public int getTag() {
            return 33;
        }
    }

    public static class JCFieldAccess extends JCExpression implements MemberSelectTree {
        public Name name;
        public JCExpression selected;

        public Symbol f542sym;

        protected JCFieldAccess(JCExpression selected, Name name, Symbol sym) {
            this.selected = selected;
            this.name = name;
            this.f542sym = sym;
        }

        @Override
        public void accept(Visitor v) {
            v.visitSelect(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.MEMBER_SELECT;
        }

        @Override
        public JCExpression getExpression() {
            return this.selected;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitMemberSelect(this, d);
        }

        @Override
        public Name getIdentifier() {
            return this.name;
        }

        @Override
        public int getTag() {
            return 34;
        }
    }

    public static class JCIdent extends JCExpression implements IdentifierTree {
        public Name name;

        public Symbol f543sym;

        protected JCIdent(Name name, Symbol sym) {
            this.name = name;
            this.f543sym = sym;
        }

        @Override
        public void accept(Visitor v) {
            v.visitIdent(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.IDENTIFIER;
        }

        @Override
        public Name getName() {
            return this.name;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitIdentifier(this, d);
        }

        @Override
        public int getTag() {
            return 35;
        }
    }

    public static class JCLiteral extends JCExpression implements LiteralTree {
        public int typetag;
        public Object value;

        protected JCLiteral(int typetag, Object value) {
            this.typetag = typetag;
            this.value = value;
        }

        @Override
        public void accept(Visitor v) {
            v.visitLiteral(this);
        }

        @Override
        public Tree.Kind getKind() {
            int i = this.typetag;
            if (i == 2) {
                return Tree.Kind.CHAR_LITERAL;
            }
            if (i == 10) {
                return Tree.Kind.STRING_LITERAL;
            }
            if (i != 17) {
                switch (i) {
                    case 4:
                        return Tree.Kind.INT_LITERAL;
                    case 5:
                        return Tree.Kind.LONG_LITERAL;
                    case 6:
                        return Tree.Kind.FLOAT_LITERAL;
                    case 7:
                        return Tree.Kind.DOUBLE_LITERAL;
                    case 8:
                        return Tree.Kind.BOOLEAN_LITERAL;
                    default:
                        throw new AssertionError("unknown literal kind " + this);
                }
            }
            return Tree.Kind.NULL_LITERAL;
        }

        @Override
        public Object getValue() {
            int i = this.typetag;
            if (i != 2) {
                if (i == 8) {
                    int bi = ((Integer) this.value).intValue();
                    return Boolean.valueOf(bi != 0);
                }
                return this.value;
            }
            int ci = ((Integer) this.value).intValue();
            char c = (char) ci;
            if (c != ci) {
                throw new AssertionError("bad value for char literal");
            }
            return Character.valueOf(c);
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitLiteral(this, d);
        }

        @Override
        public JCLiteral setType(Type type) {
            super.setType(type);
            return this;
        }

        @Override
        public int getTag() {
            return 36;
        }
    }

    public static class JCPrimitiveTypeTree extends JCExpression implements PrimitiveTypeTree {
        public int typetag;

        protected JCPrimitiveTypeTree(int typetag) {
            this.typetag = typetag;
        }

        @Override
        public void accept(Visitor v) {
            v.visitTypeIdent(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.PRIMITIVE_TYPE;
        }

        @Override
        public TypeKind getPrimitiveTypeKind() {
            switch (this.typetag) {
                case 1:
                    return TypeKind.BYTE;
                case 2:
                    return TypeKind.CHAR;
                case 3:
                    return TypeKind.SHORT;
                case 4:
                    return TypeKind.INT;
                case 5:
                    return TypeKind.LONG;
                case 6:
                    return TypeKind.FLOAT;
                case 7:
                    return TypeKind.DOUBLE;
                case 8:
                    return TypeKind.BOOLEAN;
                case 9:
                    return TypeKind.VOID;
                default:
                    throw new AssertionError("unknown primitive type " + this);
            }
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitPrimitiveType(this, d);
        }

        @Override
        public int getTag() {
            return 37;
        }
    }

    public static class JCArrayTypeTree extends JCExpression implements ArrayTypeTree {
        public JCExpression elemtype;

        protected JCArrayTypeTree(JCExpression elemtype) {
            this.elemtype = elemtype;
        }

        @Override
        public void accept(Visitor v) {
            v.visitTypeArray(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.ARRAY_TYPE;
        }

        @Override
        public JCTree getType() {
            return this.elemtype;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitArrayType(this, d);
        }

        @Override
        public int getTag() {
            return 38;
        }
    }

    public static class JCTypeApply extends JCExpression implements ParameterizedTypeTree {
        public List<JCExpression> arguments;
        public JCExpression clazz;

        protected JCTypeApply(JCExpression clazz, List<JCExpression> arguments) {
            this.clazz = clazz;
            this.arguments = arguments;
        }

        @Override
        public void accept(Visitor v) {
            v.visitTypeApply(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.PARAMETERIZED_TYPE;
        }

        @Override
        public JCTree getType() {
            return this.clazz;
        }

        @Override
        public List<JCExpression> getTypeArguments() {
            return this.arguments;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitParameterizedType(this, d);
        }

        @Override
        public int getTag() {
            return 39;
        }
    }

    public static class JCTypeUnion extends JCExpression implements UnionTypeTree {
        public List<JCExpression> alternatives;

        protected JCTypeUnion(List<JCExpression> components) {
            this.alternatives = components;
        }

        @Override
        public void accept(Visitor v) {
            v.visitTypeUnion(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.UNION_TYPE;
        }

        @Override
        public List<JCExpression> getTypeAlternatives() {
            return this.alternatives;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitUnionType(this, d);
        }

        @Override
        public int getTag() {
            return 40;
        }
    }

    public static class JCTypeParameter extends JCTree implements TypeParameterTree {
        public List<JCExpression> bounds;
        public Name name;

        protected JCTypeParameter(Name name, List<JCExpression> bounds) {
            this.name = name;
            this.bounds = bounds;
        }

        @Override
        public void accept(Visitor v) {
            v.visitTypeParameter(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.TYPE_PARAMETER;
        }

        @Override
        public Name getName() {
            return this.name;
        }

        @Override
        public List<JCExpression> getBounds() {
            return this.bounds;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitTypeParameter(this, d);
        }

        @Override
        public int getTag() {
            return 41;
        }
    }

    public static class JCWildcard extends JCExpression implements WildcardTree {
        public JCTree inner;
        public TypeBoundKind kind;

        protected JCWildcard(TypeBoundKind kind, JCTree inner) {
            kind.getClass();
            this.kind = kind;
            this.inner = inner;
        }

        @Override
        public void accept(Visitor v) {
            v.visitWildcard(this);
        }

        @Override
        public Tree.Kind getKind() {
            int i = C07171.$SwitchMap$com$sun$tools$javac$code$BoundKind[this.kind.kind.ordinal()];
            if (i == 1) {
                return Tree.Kind.UNBOUNDED_WILDCARD;
            }
            if (i == 2) {
                return Tree.Kind.EXTENDS_WILDCARD;
            }
            if (i == 3) {
                return Tree.Kind.SUPER_WILDCARD;
            }
            throw new AssertionError("Unknown wildcard bound " + this.kind);
        }

        @Override
        public JCTree getBound() {
            return this.inner;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitWildcard(this, d);
        }

        @Override
        public int getTag() {
            return 42;
        }
    }

    static class C07171 {
        static final int[] $SwitchMap$com$sun$tools$javac$code$BoundKind;

        static {
            int[] iArr = new int[BoundKind.values().length];
            $SwitchMap$com$sun$tools$javac$code$BoundKind = iArr;
            try {
                iArr[BoundKind.UNBOUND.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$BoundKind[BoundKind.EXTENDS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$BoundKind[BoundKind.SUPER.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public static class TypeBoundKind extends JCTree {
        public BoundKind kind;

        protected TypeBoundKind(BoundKind kind) {
            this.kind = kind;
        }

        @Override
        public void accept(Visitor v) {
            v.visitTypeBoundKind(this);
        }

        @Override
        public Tree.Kind getKind() {
            throw new AssertionError("TypeBoundKind is not part of a public API");
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            throw new AssertionError("TypeBoundKind is not part of a public API");
        }

        @Override
        public int getTag() {
            return 43;
        }
    }

    public static class JCAnnotation extends JCExpression implements AnnotationTree {
        public JCTree annotationType;
        public List<JCExpression> args;

        protected JCAnnotation(JCTree annotationType, List<JCExpression> args) {
            this.annotationType = annotationType;
            this.args = args;
        }

        @Override
        public void accept(Visitor v) {
            v.visitAnnotation(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.ANNOTATION;
        }

        @Override
        public JCTree getAnnotationType() {
            return this.annotationType;
        }

        @Override
        public List<JCExpression> getArguments() {
            return this.args;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitAnnotation(this, d);
        }

        @Override
        public int getTag() {
            return 44;
        }
    }

    public static class JCModifiers extends JCTree implements ModifiersTree {
        public List<JCAnnotation> annotations;
        public long flags;

        protected JCModifiers(long flags, List<JCAnnotation> annotations) {
            this.flags = flags;
            this.annotations = annotations;
        }

        @Override
        public void accept(Visitor v) {
            v.visitModifiers(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.MODIFIERS;
        }

        @Override
        public Set<Modifier> getFlags() {
            return Flags.asModifierSet(this.flags);
        }

        @Override
        public List<JCAnnotation> getAnnotations() {
            return this.annotations;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitModifiers(this, d);
        }

        @Override
        public int getTag() {
            return 45;
        }
    }

    public static class JCErroneous extends JCExpression implements ErroneousTree {
        public List<? extends JCTree> errs;

        protected JCErroneous(List<? extends JCTree> errs) {
            this.errs = errs;
        }

        @Override
        public void accept(Visitor v) {
            v.visitErroneous(this);
        }

        @Override
        public Tree.Kind getKind() {
            return Tree.Kind.ERRONEOUS;
        }

        @Override
        public List<? extends JCTree> getErrorTrees() {
            return this.errs;
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            return v.visitErroneous(this, d);
        }

        @Override
        public int getTag() {
            return 47;
        }
    }

    public static class LetExpr extends JCExpression {
        public List<JCVariableDecl> defs;
        public JCTree expr;

        protected LetExpr(List<JCVariableDecl> defs, JCTree expr) {
            this.defs = defs;
            this.expr = expr;
        }

        @Override
        public void accept(Visitor v) {
            v.visitLetExpr(this);
        }

        @Override
        public Tree.Kind getKind() {
            throw new AssertionError("LetExpr is not part of a public API");
        }

        @Override
        public <R, D> R accept(TreeVisitor<R, D> v, D d) {
            throw new AssertionError("LetExpr is not part of a public API");
        }

        @Override
        public int getTag() {
            return 93;
        }
    }

    public static abstract class Visitor {
        public void visitTopLevel(JCCompilationUnit that) {
            visitTree(that);
        }

        public void visitImport(JCImport that) {
            visitTree(that);
        }

        public void visitClassDef(JCClassDecl that) {
            visitTree(that);
        }

        public void visitMethodDef(JCMethodDecl that) {
            visitTree(that);
        }

        public void visitVarDef(JCVariableDecl that) {
            visitTree(that);
        }

        public void visitSkip(JCSkip that) {
            visitTree(that);
        }

        public void visitBlock(JCBlock that) {
            visitTree(that);
        }

        public void visitDoLoop(JCDoWhileLoop that) {
            visitTree(that);
        }

        public void visitWhileLoop(JCWhileLoop that) {
            visitTree(that);
        }

        public void visitForLoop(JCForLoop that) {
            visitTree(that);
        }

        public void visitForeachLoop(JCEnhancedForLoop that) {
            visitTree(that);
        }

        public void visitLabelled(JCLabeledStatement that) {
            visitTree(that);
        }

        public void visitSwitch(JCSwitch that) {
            visitTree(that);
        }

        public void visitCase(JCCase that) {
            visitTree(that);
        }

        public void visitSynchronized(JCSynchronized that) {
            visitTree(that);
        }

        public void visitTry(JCTry that) {
            visitTree(that);
        }

        public void visitCatch(JCCatch that) {
            visitTree(that);
        }

        public void visitConditional(JCConditional that) {
            visitTree(that);
        }

        public void visitIf(JCIf that) {
            visitTree(that);
        }

        public void visitExec(JCExpressionStatement that) {
            visitTree(that);
        }

        public void visitBreak(JCBreak that) {
            visitTree(that);
        }

        public void visitContinue(JCContinue that) {
            visitTree(that);
        }

        public void visitReturn(JCReturn that) {
            visitTree(that);
        }

        public void visitThrow(JCThrow that) {
            visitTree(that);
        }

        public void visitAssert(JCAssert that) {
            visitTree(that);
        }

        public void visitApply(JCMethodInvocation that) {
            visitTree(that);
        }

        public void visitNewClass(JCNewClass that) {
            visitTree(that);
        }

        public void visitNewArray(JCNewArray that) {
            visitTree(that);
        }

        public void visitParens(JCParens that) {
            visitTree(that);
        }

        public void visitAssign(JCAssign that) {
            visitTree(that);
        }

        public void visitAssignop(JCAssignOp that) {
            visitTree(that);
        }

        public void visitUnary(JCUnary that) {
            visitTree(that);
        }

        public void visitBinary(JCBinary that) {
            visitTree(that);
        }

        public void visitTypeCast(JCTypeCast that) {
            visitTree(that);
        }

        public void visitTypeTest(JCInstanceOf that) {
            visitTree(that);
        }

        public void visitIndexed(JCArrayAccess that) {
            visitTree(that);
        }

        public void visitSelect(JCFieldAccess that) {
            visitTree(that);
        }

        public void visitIdent(JCIdent that) {
            visitTree(that);
        }

        public void visitLiteral(JCLiteral that) {
            visitTree(that);
        }

        public void visitTypeIdent(JCPrimitiveTypeTree that) {
            visitTree(that);
        }

        public void visitTypeArray(JCArrayTypeTree that) {
            visitTree(that);
        }

        public void visitTypeApply(JCTypeApply that) {
            visitTree(that);
        }

        public void visitTypeUnion(JCTypeUnion that) {
            visitTree(that);
        }

        public void visitTypeParameter(JCTypeParameter that) {
            visitTree(that);
        }

        public void visitWildcard(JCWildcard that) {
            visitTree(that);
        }

        public void visitTypeBoundKind(TypeBoundKind that) {
            visitTree(that);
        }

        public void visitAnnotation(JCAnnotation that) {
            visitTree(that);
        }

        public void visitModifiers(JCModifiers that) {
            visitTree(that);
        }

        public void visitErroneous(JCErroneous that) {
            visitTree(that);
        }

        public void visitLetExpr(LetExpr that) {
            visitTree(that);
        }

        public void visitTree(JCTree that) {
            Assert.error();
        }
    }
}
