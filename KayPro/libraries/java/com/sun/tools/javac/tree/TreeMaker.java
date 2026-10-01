package com.sun.tools.javac.tree;

import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.BoundKind;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Pair;

public class TreeMaker implements JCTree.Factory {
    protected static final Context.C0723Key<TreeMaker> treeMakerKey = new Context.C0723Key<>();
    AnnotationBuilder annotationBuilder = new AnnotationBuilder();
    Names names;

    public int f550pos;
    Symtab syms;
    public JCTree.JCCompilationUnit toplevel;
    Types types;

    public static TreeMaker instance(Context context) {
        TreeMaker instance = (TreeMaker) context.m501get(treeMakerKey);
        if (instance == null) {
            return new TreeMaker(context);
        }
        return instance;
    }

    protected TreeMaker(Context context) {
        this.f550pos = -1;
        context.m504put(treeMakerKey, this);
        this.f550pos = -1;
        this.toplevel = null;
        this.names = Names.instance(context);
        this.syms = Symtab.instance(context);
        this.types = Types.instance(context);
    }

    TreeMaker(JCTree.JCCompilationUnit toplevel, Names names, Types types, Symtab syms) {
        this.f550pos = -1;
        this.f550pos = 0;
        this.toplevel = toplevel;
        this.names = names;
        this.types = types;
        this.syms = syms;
    }

    public TreeMaker forToplevel(JCTree.JCCompilationUnit toplevel) {
        return new TreeMaker(toplevel, this.names, this.types, this.syms);
    }

    public TreeMaker m495at(int pos) {
        this.f550pos = pos;
        return this;
    }

    public TreeMaker m496at(JCDiagnostic.DiagnosticPosition pos) {
        this.f550pos = pos == null ? -1 : pos.getStartPosition();
        return this;
    }

    @Override
    public JCTree.JCCompilationUnit TopLevel(List<JCTree.JCAnnotation> packageAnnotations, JCTree.JCExpression pid, List<JCTree> defs) {
        Assert.checkNonNull(packageAnnotations);
        for (JCTree node : defs) {
            Assert.check((node instanceof JCTree.JCClassDecl) || (node instanceof JCTree.JCImport) || (node instanceof JCTree.JCSkip) || (node instanceof JCTree.JCErroneous) || ((node instanceof JCTree.JCExpressionStatement) && (((JCTree.JCExpressionStatement) node).expr instanceof JCTree.JCErroneous)), node.getClass().getSimpleName());
        }
        JCTree.JCCompilationUnit tree = new JCTree.JCCompilationUnit(packageAnnotations, pid, defs, null, null, null, null);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCImport Import(JCTree qualid, boolean importStatic) {
        JCTree.JCImport tree = new JCTree.JCImport(qualid, importStatic);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCClassDecl ClassDef(JCTree.JCModifiers mods, Name name, List<JCTree.JCTypeParameter> typarams, JCTree.JCExpression extending, List<JCTree.JCExpression> implementing, List<JCTree> defs) {
        JCTree.JCClassDecl tree = new JCTree.JCClassDecl(mods, name, typarams, extending, implementing, defs, null);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCMethodDecl MethodDef(JCTree.JCModifiers mods, Name name, JCTree.JCExpression restype, List<JCTree.JCTypeParameter> typarams, List<JCTree.JCVariableDecl> params, List<JCTree.JCExpression> thrown, JCTree.JCBlock body, JCTree.JCExpression defaultValue) {
        JCTree.JCMethodDecl tree = new JCTree.JCMethodDecl(mods, name, restype, typarams, params, thrown, body, defaultValue, null);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCVariableDecl VarDef(JCTree.JCModifiers mods, Name name, JCTree.JCExpression vartype, JCTree.JCExpression init) {
        JCTree.JCVariableDecl tree = new JCTree.JCVariableDecl(mods, name, vartype, init, null);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCSkip Skip() {
        JCTree.JCSkip tree = new JCTree.JCSkip();
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCBlock Block(long flags, List<JCTree.JCStatement> stats) {
        JCTree.JCBlock tree = new JCTree.JCBlock(flags, stats);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCDoWhileLoop DoLoop(JCTree.JCStatement body, JCTree.JCExpression cond) {
        JCTree.JCDoWhileLoop tree = new JCTree.JCDoWhileLoop(body, cond);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCWhileLoop WhileLoop(JCTree.JCExpression cond, JCTree.JCStatement body) {
        JCTree.JCWhileLoop tree = new JCTree.JCWhileLoop(cond, body);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCForLoop ForLoop(List<JCTree.JCStatement> init, JCTree.JCExpression cond, List<JCTree.JCExpressionStatement> step, JCTree.JCStatement body) {
        JCTree.JCForLoop tree = new JCTree.JCForLoop(init, cond, step, body);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCEnhancedForLoop ForeachLoop(JCTree.JCVariableDecl var, JCTree.JCExpression expr, JCTree.JCStatement body) {
        JCTree.JCEnhancedForLoop tree = new JCTree.JCEnhancedForLoop(var, expr, body);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCLabeledStatement Labelled(Name label, JCTree.JCStatement body) {
        JCTree.JCLabeledStatement tree = new JCTree.JCLabeledStatement(label, body);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCSwitch Switch(JCTree.JCExpression selector, List<JCTree.JCCase> cases) {
        JCTree.JCSwitch tree = new JCTree.JCSwitch(selector, cases);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCCase Case(JCTree.JCExpression pat, List<JCTree.JCStatement> stats) {
        JCTree.JCCase tree = new JCTree.JCCase(pat, stats);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCSynchronized Synchronized(JCTree.JCExpression lock, JCTree.JCBlock body) {
        JCTree.JCSynchronized tree = new JCTree.JCSynchronized(lock, body);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCTry mo491Try(JCTree.JCBlock body, List<JCTree.JCCatch> catchers, JCTree.JCBlock finalizer) {
        return mo492Try(List.m507nil(), body, catchers, finalizer);
    }

    @Override
    public JCTree.JCTry mo492Try(List<JCTree> resources, JCTree.JCBlock body, List<JCTree.JCCatch> catchers, JCTree.JCBlock finalizer) {
        JCTree.JCTry tree = new JCTree.JCTry(resources, body, catchers, finalizer);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCCatch Catch(JCTree.JCVariableDecl param, JCTree.JCBlock body) {
        JCTree.JCCatch tree = new JCTree.JCCatch(param, body);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCConditional Conditional(JCTree.JCExpression cond, JCTree.JCExpression thenpart, JCTree.JCExpression elsepart) {
        JCTree.JCConditional tree = new JCTree.JCConditional(cond, thenpart, elsepart);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCIf mo490If(JCTree.JCExpression cond, JCTree.JCStatement thenpart, JCTree.JCStatement elsepart) {
        JCTree.JCIf tree = new JCTree.JCIf(cond, thenpart, elsepart);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCExpressionStatement Exec(JCTree.JCExpression expr) {
        JCTree.JCExpressionStatement tree = new JCTree.JCExpressionStatement(expr);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCBreak Break(Name label) {
        JCTree.JCBreak tree = new JCTree.JCBreak(label, null);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCContinue Continue(Name label) {
        JCTree.JCContinue tree = new JCTree.JCContinue(label, null);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCReturn Return(JCTree.JCExpression expr) {
        JCTree.JCReturn tree = new JCTree.JCReturn(expr);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCThrow Throw(JCTree expr) {
        JCTree.JCThrow tree = new JCTree.JCThrow(expr);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCAssert Assert(JCTree.JCExpression cond, JCTree.JCExpression detail) {
        JCTree.JCAssert tree = new JCTree.JCAssert(cond, detail);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCMethodInvocation Apply(List<JCTree.JCExpression> typeargs, JCTree.JCExpression fn, List<JCTree.JCExpression> args) {
        JCTree.JCMethodInvocation tree = new JCTree.JCMethodInvocation(typeargs, fn, args);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCNewClass NewClass(JCTree.JCExpression encl, List<JCTree.JCExpression> typeargs, JCTree.JCExpression clazz, List<JCTree.JCExpression> args, JCTree.JCClassDecl def) {
        JCTree.JCNewClass tree = new JCTree.JCNewClass(encl, typeargs, clazz, args, def);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCNewArray NewArray(JCTree.JCExpression elemtype, List<JCTree.JCExpression> dims, List<JCTree.JCExpression> elems) {
        JCTree.JCNewArray tree = new JCTree.JCNewArray(elemtype, dims, elems);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCParens Parens(JCTree.JCExpression expr) {
        JCTree.JCParens tree = new JCTree.JCParens(expr);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCAssign Assign(JCTree.JCExpression lhs, JCTree.JCExpression rhs) {
        JCTree.JCAssign tree = new JCTree.JCAssign(lhs, rhs);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCAssignOp Assignop(int opcode, JCTree lhs, JCTree rhs) {
        JCTree.JCAssignOp tree = new JCTree.JCAssignOp(opcode, lhs, rhs, null);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCUnary Unary(int opcode, JCTree.JCExpression arg) {
        JCTree.JCUnary tree = new JCTree.JCUnary(opcode, arg);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCBinary Binary(int opcode, JCTree.JCExpression lhs, JCTree.JCExpression rhs) {
        JCTree.JCBinary tree = new JCTree.JCBinary(opcode, lhs, rhs, null);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCTypeCast TypeCast(JCTree clazz, JCTree.JCExpression expr) {
        JCTree.JCTypeCast tree = new JCTree.JCTypeCast(clazz, expr);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCInstanceOf TypeTest(JCTree.JCExpression expr, JCTree clazz) {
        JCTree.JCInstanceOf tree = new JCTree.JCInstanceOf(expr, clazz);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCArrayAccess Indexed(JCTree.JCExpression indexed, JCTree.JCExpression index) {
        JCTree.JCArrayAccess tree = new JCTree.JCArrayAccess(indexed, index);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCFieldAccess Select(JCTree.JCExpression selected, Name selector) {
        JCTree.JCFieldAccess tree = new JCTree.JCFieldAccess(selected, selector, null);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCIdent Ident(Name name) {
        JCTree.JCIdent tree = new JCTree.JCIdent(name, null);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCLiteral Literal(int tag, Object value) {
        JCTree.JCLiteral tree = new JCTree.JCLiteral(tag, value);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCPrimitiveTypeTree TypeIdent(int typetag) {
        JCTree.JCPrimitiveTypeTree tree = new JCTree.JCPrimitiveTypeTree(typetag);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCArrayTypeTree TypeArray(JCTree.JCExpression elemtype) {
        JCTree.JCArrayTypeTree tree = new JCTree.JCArrayTypeTree(elemtype);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCTypeApply TypeApply(JCTree.JCExpression clazz, List<JCTree.JCExpression> arguments) {
        JCTree.JCTypeApply tree = new JCTree.JCTypeApply(clazz, arguments);
        tree.f531pos = this.f550pos;
        return tree;
    }

    public JCTree.JCTypeUnion TypeUnion(List<JCTree.JCExpression> components) {
        JCTree.JCTypeUnion tree = new JCTree.JCTypeUnion(components);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCTypeParameter TypeParameter(Name name, List<JCTree.JCExpression> bounds) {
        JCTree.JCTypeParameter tree = new JCTree.JCTypeParameter(name, bounds);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCWildcard Wildcard(JCTree.TypeBoundKind kind, JCTree type) {
        JCTree.JCWildcard tree = new JCTree.JCWildcard(kind, type);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.TypeBoundKind TypeBoundKind(BoundKind kind) {
        JCTree.TypeBoundKind tree = new JCTree.TypeBoundKind(kind);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCAnnotation Annotation(JCTree annotationType, List<JCTree.JCExpression> args) {
        JCTree.JCAnnotation tree = new JCTree.JCAnnotation(annotationType, args);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.JCModifiers Modifiers(long flags, List<JCTree.JCAnnotation> annotations) {
        JCTree.JCModifiers tree = new JCTree.JCModifiers(flags, annotations);
        boolean noFlags = (11775 & flags) == 0;
        tree.f531pos = (noFlags && annotations.isEmpty()) ? -1 : this.f550pos;
        return tree;
    }

    public JCTree.JCModifiers Modifiers(long flags) {
        return Modifiers(flags, List.m507nil());
    }

    public JCTree.JCErroneous Erroneous() {
        return Erroneous(List.m507nil());
    }

    @Override
    public JCTree.JCErroneous Erroneous(List<? extends JCTree> errs) {
        JCTree.JCErroneous tree = new JCTree.JCErroneous(errs);
        tree.f531pos = this.f550pos;
        return tree;
    }

    @Override
    public JCTree.LetExpr LetExpr(List<JCTree.JCVariableDecl> defs, JCTree expr) {
        JCTree.LetExpr tree = new JCTree.LetExpr(defs, expr);
        tree.f531pos = this.f550pos;
        return tree;
    }

    public JCTree.JCClassDecl AnonymousClassDef(JCTree.JCModifiers mods, List<JCTree> defs) {
        return ClassDef(mods, this.names.empty, List.m507nil(), null, List.m507nil(), defs);
    }

    public JCTree.LetExpr LetExpr(JCTree.JCVariableDecl def, JCTree expr) {
        JCTree.LetExpr tree = new JCTree.LetExpr(List.m508of(def), expr);
        tree.f531pos = this.f550pos;
        return tree;
    }

    public JCTree.JCIdent Ident(Symbol sym) {
        Name nameFlatName;
        if (sym.name != this.names.empty) {
            nameFlatName = sym.name;
        } else {
            nameFlatName = sym.flatName();
        }
        return (JCTree.JCIdent) new JCTree.JCIdent(nameFlatName, sym).setPos(this.f550pos).setType(sym.type);
    }

    public JCTree.JCExpression Select(JCTree.JCExpression base, Symbol sym) {
        return new JCTree.JCFieldAccess(base, sym.name, sym).setPos(this.f550pos).setType(sym.type);
    }

    public JCTree.JCExpression QualIdent(Symbol sym) {
        if (isUnqualifiable(sym)) {
            return Ident(sym);
        }
        return Select(QualIdent(sym.owner), sym);
    }

    public JCTree.JCExpression Ident(JCTree.JCVariableDecl param) {
        return Ident(param.f547sym);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<JCTree.JCExpression> Idents(List<JCTree.JCVariableDecl> params) {
        ListBuffer<JCTree.JCExpression> ids = new ListBuffer<>();
        for (List list = params; list.nonEmpty(); list = list.tail) {
            ids.append(Ident((JCTree.JCVariableDecl) list.head));
        }
        return ids.toList();
    }

    public JCTree.JCExpression This(Type t) {
        return Ident(new Symbol.VarSymbol(16L, this.names._this, t, t.tsym));
    }

    public JCTree.JCExpression ClassLiteral(Symbol.ClassSymbol clazz) {
        return ClassLiteral(clazz.type);
    }

    public JCTree.JCExpression ClassLiteral(Type t) {
        Symbol.VarSymbol lit = new Symbol.VarSymbol(25L, this.names._class, t, t.tsym);
        return Select(Type(t), lit);
    }

    public JCTree.JCIdent Super(Type t, Symbol.TypeSymbol owner) {
        return Ident(new Symbol.VarSymbol(16L, this.names._super, t, owner));
    }

    public JCTree.JCMethodInvocation m494App(JCTree.JCExpression meth, List<JCTree.JCExpression> args) {
        return Apply(null, meth, args).setType(meth.type.mo574getReturnType());
    }

    public JCTree.JCMethodInvocation m493App(JCTree.JCExpression meth) {
        return Apply(null, meth, List.m507nil()).setType(meth.type.mo574getReturnType());
    }

    public JCTree.JCExpression Create(Symbol ctor, List<JCTree.JCExpression> args) {
        Type t = ctor.owner.erasure(this.types);
        JCTree.JCNewClass newclass = NewClass(null, null, Type(t), args, null);
        newclass.constructor = ctor;
        newclass.setType(t);
        return newclass;
    }

    public JCTree.JCExpression Type(Type t) {
        JCTree.JCExpression tp;
        JCTree.JCExpression clazz;
        JCTree.JCExpression tp2;
        if (t == null) {
            return null;
        }
        int i = t.f344tag;
        if (i == 14) {
            tp = Ident(t.tsym);
        } else if (i == 15) {
            Type.WildcardType a = (Type.WildcardType) t;
            JCTree.JCExpression tp3 = Wildcard(TypeBoundKind(a.kind), Type(a.type));
            tp = tp3;
        } else if (i != 19) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    tp = TypeIdent(t.f344tag);
                    break;
                case 10:
                    Type outer = t.getEnclosingType();
                    if (outer.f344tag == 10 && t.tsym.owner.kind == 2) {
                        clazz = Select(Type(outer), t.tsym);
                    } else {
                        clazz = QualIdent(t.tsym);
                    }
                    if (t.getTypeArguments().isEmpty()) {
                        tp2 = clazz;
                    } else {
                        tp2 = TypeApply(clazz, Types(t.getTypeArguments()));
                    }
                    tp = tp2;
                    break;
                case 11:
                    tp = TypeArray(Type(this.types.elemtype(t)));
                    break;
                default:
                    throw new AssertionError("unexpected type: " + t);
            }
        } else {
            tp = TypeIdent(19);
        }
        return tp.setType(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<JCTree.JCExpression> Types(List<Type> ts) {
        ListBuffer<JCTree.JCExpression> lb = new ListBuffer<>();
        for (List list = ts; list.nonEmpty(); list = list.tail) {
            lb.append(Type((Type) list.head));
        }
        return lb.toList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JCTree.JCVariableDecl VarDef(Symbol.VarSymbol varSymbol, JCTree.JCExpression init) {
        return (JCTree.JCVariableDecl) new JCTree.JCVariableDecl(Modifiers(varSymbol.flags(), Annotations(varSymbol.getAnnotationMirrors())), varSymbol.name, Type(varSymbol.type), init, varSymbol).setPos(this.f550pos).setType(varSymbol.type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<JCTree.JCAnnotation> Annotations(List<Attribute.Compound> attributes) {
        if (attributes == null) {
            return List.m507nil();
        }
        ListBuffer<JCTree.JCAnnotation> result = new ListBuffer<>();
        for (List list = attributes; list.nonEmpty(); list = list.tail) {
            Attribute a = (Attribute) list.head;
            result.append(Annotation(a));
        }
        return result.toList();
    }

    public JCTree.JCLiteral Literal(Object obj) {
        if (obj instanceof String) {
            return Literal(10, obj).setType(this.syms.stringType.constType(obj));
        }
        if (obj instanceof Integer) {
            return Literal(4, obj).setType(this.syms.intType.constType(obj));
        }
        if (obj instanceof Long) {
            return Literal(5, obj).setType(this.syms.longType.constType(obj));
        }
        if (obj instanceof Byte) {
            return Literal(1, obj).setType(this.syms.byteType.constType(obj));
        }
        if (obj instanceof Character) {
            return Literal(2, obj).setType(this.syms.charType.constType(Integer.valueOf(((Character) obj).toString().charAt(0))));
        }
        if (obj instanceof Double) {
            return Literal(7, obj).setType(this.syms.doubleType.constType(obj));
        }
        if (obj instanceof Float) {
            return Literal(6, obj).setType(this.syms.floatType.constType(obj));
        }
        if (obj instanceof Short) {
            return Literal(3, obj).setType(this.syms.shortType.constType(obj));
        }
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            return Literal(8, Integer.valueOf(zBooleanValue ? 1 : 0)).setType(this.syms.booleanType.constType(Integer.valueOf(zBooleanValue ? 1 : 0)));
        }
        throw new AssertionError(obj);
    }

    class AnnotationBuilder implements Attribute.Visitor {
        JCTree.JCExpression result = null;

        AnnotationBuilder() {
        }

        @Override
        public void visitConstant(Attribute.Constant v) {
            this.result = TreeMaker.this.Literal(v.value);
        }

        @Override
        public void visitClass(Attribute.Class clazz) {
            this.result = TreeMaker.this.ClassLiteral(clazz.type).setType(TreeMaker.this.syms.classType);
        }

        @Override
        public void visitEnum(Attribute.Enum e) {
            this.result = TreeMaker.this.QualIdent(e.value);
        }

        @Override
        public void visitError(Attribute.Error e) {
            this.result = TreeMaker.this.Erroneous();
        }

        @Override
        public void visitCompound(Attribute.Compound compound) {
            this.result = visitCompoundInternal(compound);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public JCTree.JCAnnotation visitCompoundInternal(Attribute.Compound compound) {
            ListBuffer<JCTree.JCExpression> args = new ListBuffer<>();
            for (List list = compound.values; list.nonEmpty(); list = list.tail) {
                Pair<Symbol.MethodSymbol, Attribute> pair = (Pair) list.head;
                JCTree.JCExpression valueTree = translate(pair.f578snd);
                TreeMaker treeMaker = TreeMaker.this;
                args.append(treeMaker.Assign(treeMaker.Ident(pair.f577fst), valueTree).setType(valueTree.type));
            }
            TreeMaker treeMaker2 = TreeMaker.this;
            return treeMaker2.Annotation(treeMaker2.Type(compound.type), args.toList());
        }

        @Override
        public void visitArray(Attribute.Array array) {
            ListBuffer<JCTree.JCExpression> elems = new ListBuffer<>();
            for (int i = 0; i < array.values.length; i++) {
                elems.append(translate(array.values[i]));
            }
            this.result = TreeMaker.this.NewArray(null, List.m507nil(), elems.toList()).setType(array.type);
        }

        JCTree.JCExpression translate(Attribute a) {
            a.accept(this);
            return this.result;
        }

        JCTree.JCAnnotation translate(Attribute.Compound a) {
            return visitCompoundInternal(a);
        }
    }

    public JCTree.JCAnnotation Annotation(Attribute a) {
        return this.annotationBuilder.translate((Attribute.Compound) a);
    }

    public JCTree.JCMethodDecl MethodDef(Symbol.MethodSymbol m, JCTree.JCBlock body) {
        return MethodDef(m, m.type, body);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JCTree.JCMethodDecl MethodDef(Symbol.MethodSymbol methodSymbol, Type mtype, JCTree.JCBlock body) {
        return (JCTree.JCMethodDecl) new JCTree.JCMethodDecl(Modifiers(methodSymbol.flags(), Annotations(methodSymbol.getAnnotationMirrors())), methodSymbol.name, Type(mtype.mo574getReturnType()), TypeParams(mtype.getTypeArguments()), Params(mtype.mo573getParameterTypes(), methodSymbol), Types(mtype.mo575getThrownTypes()), body, null, methodSymbol).setPos(this.f550pos).setType(mtype);
    }

    public JCTree.JCTypeParameter TypeParam(Name name, Type.TypeVar tvar) {
        return (JCTree.JCTypeParameter) TypeParameter(name, Types(this.types.getBounds(tvar))).setPos(this.f550pos).setType(tvar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<JCTree.JCTypeParameter> TypeParams(List<Type> typarams) {
        ListBuffer<JCTree.JCTypeParameter> tparams = new ListBuffer<>();
        for (List list = typarams; list.nonEmpty(); list = list.tail) {
            tparams.append(TypeParam(((Type) list.head).tsym.name, (Type.TypeVar) list.head));
        }
        return tparams.toList();
    }

    public JCTree.JCVariableDecl Param(Name name, Type argtype, Symbol owner) {
        return VarDef(new Symbol.VarSymbol(0L, name, argtype, owner), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<JCTree.JCVariableDecl> Params(List<Type> argtypes, Symbol owner) {
        ListBuffer<JCTree.JCVariableDecl> params = new ListBuffer<>();
        Symbol.MethodSymbol mth = owner.kind == 16 ? (Symbol.MethodSymbol) owner : null;
        if (mth != null && mth.params != null && argtypes.length() == mth.params.length()) {
            for (Symbol.VarSymbol param : ((Symbol.MethodSymbol) owner).params) {
                params.append(VarDef(param, null));
            }
        } else {
            int i = 0;
            List list = argtypes;
            while (list.nonEmpty()) {
                params.append(Param(paramName(i), (Type) list.head, owner));
                list = list.tail;
                i++;
            }
        }
        return params.toList();
    }

    public JCTree.JCStatement Call(JCTree.JCExpression apply) {
        return apply.type.f344tag == 9 ? Exec(apply) : Return(apply);
    }

    public JCTree.JCStatement Assignment(Symbol v, JCTree.JCExpression rhs) {
        return Exec(Assign(Ident(v), rhs).setType(v.type));
    }

    public JCTree.JCArrayAccess Indexed(Symbol v, JCTree.JCExpression index) {
        JCTree.JCArrayAccess tree = new JCTree.JCArrayAccess(QualIdent(v), index);
        tree.type = ((Type.ArrayType) v.type).elemtype;
        return tree;
    }

    public JCTree.JCTypeCast TypeCast(Type type, JCTree.JCExpression expr) {
        return (JCTree.JCTypeCast) TypeCast(Type(type), expr).setType(type);
    }

    boolean isUnqualifiable(Symbol sym) {
        JCTree.JCCompilationUnit jCCompilationUnit;
        if (sym.name == this.names.empty || sym.owner == null || sym.owner.kind == 16 || sym.owner.kind == 4) {
            return true;
        }
        if (sym.kind == 2 && (jCCompilationUnit = this.toplevel) != null) {
            Scope.Entry e = jCCompilationUnit.namedImportScope.lookup(sym.name);
            if (e.scope != null) {
                return e.f338sym == sym && e.next().scope == null;
            }
            Scope.Entry e2 = this.toplevel.packge.members().lookup(sym.name);
            if (e2.scope != null) {
                return e2.f338sym == sym && e2.next().scope == null;
            }
            Scope.Entry e3 = this.toplevel.starImportScope.lookup(sym.name);
            return e3.scope != null && e3.f338sym == sym && e3.next().scope == null;
        }
        return false;
    }

    public Name paramName(int i) {
        return this.names.fromString("x" + i);
    }

    public Name typaramName(int i) {
        return this.names.fromString("A" + i);
    }
}
