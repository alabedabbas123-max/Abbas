package com.sun.tools.javac.comp;

import com.sun.source.tree.IdentifierTree;
import com.sun.source.tree.MemberSelectTree;
import com.sun.source.tree.TreeVisitor;
import com.sun.source.util.SimpleTreeVisitor;
import com.sun.tools.javac.code.BoundKind;
import com.sun.tools.javac.code.DeferredLintHandler;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Kinds;
import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.jvm.Target;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.tree.TreeScanner;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Options;
import com.sun.tools.javac.util.Pair;
import com.sun.tools.javac.util.Warner;
import com.sun.tools.javac.comp.Resolve.AccessError;
import com.sun.tools.javac.comp.Resolve.StaticError;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import javax.lang.model.element.ElementKind;
import javax.tools.JavaFileObject;

public class Attr extends JCTree.Visitor {
    static final boolean allowDiamondFinder = true;
    protected static final Context.C0723Key<Attr> attrKey = new Context.C0723Key<>();
    boolean allowAnonOuterThis;
    boolean allowBoxing;
    boolean allowCovariantReturns;
    boolean allowEnums;
    boolean allowGenerics;
    boolean allowStringsInSwitch;
    boolean allowVarargs;
    final Annotate annotate;
    final ConstFold cfolder;

    final Check f358chk;
    final DeferredLintHandler deferredLintHandler;
    final JCDiagnostic.Factory diags;
    final Enter enter;

    Env<AttrContext> f359env;
    String errKey;
    boolean findDiamonds;
    final Infer infer;

    final Log f360log;
    final TreeMaker make;
    final MemberEnter memberEnter;
    final Names names;
    int pkind;

    Type f361pt;
    boolean relax;
    Type result;

    final Resolve f362rs;
    String sourceName;
    final Symtab syms;
    final Target target;
    final Types types;
    boolean useBeforeDeclarationWarning;
    private TreeVisitor<Symbol, Env<AttrContext>> identAttributer = new IdentAttributer();
    private JCTree breakTree = null;
    private final Pair<Scope, Scope> erroneousMapping = new Pair<>(null, null);
    Warner noteWarner = new Warner();

    public static Attr instance(Context context) {
        Attr instance = (Attr) context.m501get(attrKey);
        if (instance == null) {
            return new Attr(context);
        }
        return instance;
    }

    protected Attr(Context context) {
        context.m504put(attrKey, this);
        this.names = Names.instance(context);
        this.f360log = Log.instance(context);
        this.syms = Symtab.instance(context);
        this.f362rs = Resolve.instance(context);
        this.f358chk = Check.instance(context);
        this.memberEnter = MemberEnter.instance(context);
        this.make = TreeMaker.instance(context);
        this.enter = Enter.instance(context);
        this.infer = Infer.instance(context);
        this.cfolder = ConstFold.instance(context);
        this.target = Target.instance(context);
        this.types = Types.instance(context);
        this.diags = JCDiagnostic.Factory.instance(context);
        this.annotate = Annotate.instance(context);
        this.deferredLintHandler = DeferredLintHandler.instance(context);
        Options options = Options.instance(context);
        Source source = Source.instance(context);
        this.allowGenerics = source.allowGenerics();
        this.allowVarargs = source.allowVarargs();
        this.allowEnums = source.allowEnums();
        this.allowBoxing = source.allowBoxing();
        this.allowCovariantReturns = source.allowCovariantReturns();
        this.allowAnonOuterThis = source.allowAnonOuterThis();
        this.allowStringsInSwitch = source.allowStringsInSwitch();
        this.sourceName = source.name;
        boolean z = false;
        this.relax = (options.isSet("-retrofit") || options.isSet("-relax")) ? allowDiamondFinder : false;
        if (options.m515get("findDiamond") != null && source.allowDiamond()) {
            z = allowDiamondFinder;
        }
        this.findDiamonds = z;
        this.useBeforeDeclarationWarning = options.isSet("useBeforeDeclarationWarning");
    }

    Type check(JCTree tree, Type owntype, int ownkind, int pkind, Type pt) {
        if (owntype.f344tag != 19 && pt.f344tag != 12 && pt.f344tag != 16) {
            if (((pkind ^ (-1)) & ownkind) == 0) {
                owntype = this.f358chk.checkType(tree.m489pos(), owntype, pt, this.errKey);
            } else {
                this.f360log.error(tree.m489pos(), "unexpected.type", Kinds.kindNames(pkind), Kinds.kindName(ownkind));
                owntype = this.types.createErrorType(owntype);
            }
        }
        tree.type = owntype;
        return owntype;
    }

    boolean isAssignableAsBlankFinal(Symbol.VarSymbol v, Env<AttrContext> env) {
        Symbol owner = env.info.scope.owner;
        if (v.owner != owner) {
            if ((owner.name != this.names.init && owner.kind != 4 && (owner.flags() & 1048576) == 0) || v.owner != owner.owner) {
                return false;
            }
            if (((v.flags() & 8) != 0 ? allowDiamondFinder : false) != Resolve.isStatic(env)) {
                return false;
            }
        }
        return allowDiamondFinder;
    }

    void checkAssignable(JCDiagnostic.DiagnosticPosition pos, Symbol.VarSymbol v, JCTree base, Env<AttrContext> env) {
        if ((v.flags() & 16) == 0 || ((v.flags() & 262144) == 0 && ((base == null || (base.getTag() == 35 && TreeInfo.name(base) == this.names._this)) && isAssignableAsBlankFinal(v, env)))) {
            if ((v.flags() & Flags.EFFECTIVELY_FINAL) != 0) {
                v.flags_field &= -4398046511105L;
            }
        } else if (v.isResourceVariable()) {
            this.f360log.error(pos, "try.resource.may.not.be.assigned", v);
        } else {
            this.f360log.error(pos, "cant.assign.val.to.final.var", v);
        }
    }

    boolean isStaticReference(JCTree tree) {
        if (tree.getTag() == 34) {
            Symbol lsym = TreeInfo.symbol(((JCTree.JCFieldAccess) tree).selected);
            if (lsym == null || lsym.kind != 2) {
                return false;
            }
            return allowDiamondFinder;
        }
        return allowDiamondFinder;
    }

    static boolean isType(Symbol sym) {
        if (sym == null || sym.kind != 2) {
            return false;
        }
        return allowDiamondFinder;
    }

    Symbol thisSym(JCDiagnostic.DiagnosticPosition pos, Env<AttrContext> env) {
        return this.f362rs.resolveSelf(pos, env, env.enclClass.f539sym, this.names._this);
    }

    public Symbol attribIdent(JCTree tree, JCTree.JCCompilationUnit topLevel) {
        Env<AttrContext> localEnv = this.enter.topLevelEnv(topLevel);
        TreeMaker treeMaker = this.make;
        localEnv.enclClass = treeMaker.ClassDef(treeMaker.Modifiers(0L), this.syms.errSymbol.name, null, null, null, null);
        localEnv.enclClass.f539sym = this.syms.errSymbol;
        return (Symbol) tree.accept(this.identAttributer, localEnv);
    }

    private class IdentAttributer extends SimpleTreeVisitor<Symbol, Env<AttrContext>> {
        private IdentAttributer() {
        }

        @Override
        public Symbol visitMemberSelect(MemberSelectTree node, Env<AttrContext> env) {
            Symbol site = visit(node.getExpression(), env);
            if (site.kind == 31) {
                return site;
            }
            Name name = (Name) node.getIdentifier();
            if (site.kind == 1) {
                env.toplevel.packge = (Symbol.PackageSymbol) site;
                return Attr.this.f362rs.findIdentInPackage(env, (Symbol.TypeSymbol) site, name, 3);
            }
            env.enclClass.f539sym = (Symbol.ClassSymbol) site;
            return Attr.this.f362rs.findMemberType(env, site.asType(), name, (Symbol.TypeSymbol) site);
        }

        @Override
        public Symbol visitIdentifier(IdentifierTree node, Env<AttrContext> env) {
            return Attr.this.f362rs.findIdent(env, (Name) node.getName(), 3);
        }
    }

    public Type coerce(Type etype, Type ttype) {
        return this.cfolder.coerce(etype, ttype);
    }

    public Type attribType(JCTree node, Symbol.TypeSymbol sym) {
        Env<AttrContext> env = this.enter.typeEnvs.get(sym);
        Env<AttrContext> localEnv = env.m466dup(node, env.info.m462dup());
        return attribTree(node, localEnv, 2, Type.noType);
    }

    public Env<AttrContext> attribExprToTree(JCTree expr, Env<AttrContext> env, JCTree tree) {
        this.breakTree = tree;
        JavaFileObject prev = this.f360log.useSource(env.toplevel.sourcefile);
        try {
            try {
                attribExpr(expr, env);
                this.breakTree = null;
                this.f360log.useSource(prev);
                return env;
            } catch (BreakAttr b) {
                Env<AttrContext> c0621Env = b.f363env;
                this.breakTree = null;
                this.f360log.useSource(prev);
                return c0621Env;
            } catch (AssertionError ae) {
                if (!(ae.getCause() instanceof BreakAttr)) {
                    throw ae;
                }
                Env<AttrContext> c0621Env2 = ((BreakAttr) ae.getCause()).f363env;
                this.breakTree = null;
                this.f360log.useSource(prev);
                return c0621Env2;
            }
        } catch (Throwable th) {
            this.breakTree = null;
            this.f360log.useSource(prev);
            throw th;
        }
    }

    public Env<AttrContext> attribStatToTree(JCTree stmt, Env<AttrContext> env, JCTree tree) {
        this.breakTree = tree;
        JavaFileObject prev = this.f360log.useSource(env.toplevel.sourcefile);
        try {
            try {
                attribStat(stmt, env);
                this.breakTree = null;
                this.f360log.useSource(prev);
                return env;
            } catch (BreakAttr b) {
                Env<AttrContext> c0621Env = b.f363env;
                this.breakTree = null;
                this.f360log.useSource(prev);
                return c0621Env;
            } catch (AssertionError ae) {
                if (!(ae.getCause() instanceof BreakAttr)) {
                    throw ae;
                }
                Env<AttrContext> c0621Env2 = ((BreakAttr) ae.getCause()).f363env;
                this.breakTree = null;
                this.f360log.useSource(prev);
                return c0621Env2;
            }
        } catch (Throwable th) {
            this.breakTree = null;
            this.f360log.useSource(prev);
            throw th;
        }
    }

    private static class BreakAttr extends RuntimeException {
        static final long serialVersionUID = -6924771130405446405L;

        private Env<AttrContext> f363env;

        private BreakAttr(Env<AttrContext> env) {
            this.f363env = env;
        }
    }

    Type attribTree(JCTree tree, Env<AttrContext> env, int pkind, Type pt) {
        return attribTree(tree, env, pkind, pt, "incompatible.types");
    }

    Type attribTree(JCTree tree, Env<AttrContext> env, int pkind, Type pt, String errKey) {
        Env<AttrContext> prevEnv = this.f359env;
        int prevPkind = this.pkind;
        Type prevPt = this.f361pt;
        String prevErrKey = this.errKey;
        try {
            try {
                this.f359env = env;
                this.pkind = pkind;
                this.f361pt = pt;
                this.errKey = errKey;
                tree.accept(this);
                if (tree == this.breakTree) {
                    throw new BreakAttr(env);
                }
                Type type = this.result;
                this.f359env = prevEnv;
                this.pkind = prevPkind;
                this.f361pt = prevPt;
                this.errKey = prevErrKey;
                return type;
            } catch (Symbol.CompletionFailure ex) {
                tree.type = this.syms.errType;
                Type typeCompletionError = this.f358chk.completionError(tree.m489pos(), ex);
                this.f359env = prevEnv;
                this.pkind = prevPkind;
                this.f361pt = prevPt;
                this.errKey = prevErrKey;
                return typeCompletionError;
            }
        } catch (Throwable th) {
            this.f359env = prevEnv;
            this.pkind = prevPkind;
            this.f361pt = prevPt;
            this.errKey = prevErrKey;
            throw th;
        }
    }

    public Type attribExpr(JCTree tree, Env<AttrContext> env, Type pt) {
        return attribTree(tree, env, 12, pt.f344tag != 19 ? pt : Type.noType);
    }

    public Type attribExpr(JCTree tree, Env<AttrContext> env, Type pt, String key) {
        return attribTree(tree, env, 12, pt.f344tag != 19 ? pt : Type.noType, key);
    }

    Type attribExpr(JCTree tree, Env<AttrContext> env) {
        return attribTree(tree, env, 12, Type.noType);
    }

    Type attribType(JCTree tree, Env<AttrContext> env) {
        Type result = attribType(tree, env, Type.noType);
        return result;
    }

    Type attribType(JCTree tree, Env<AttrContext> env, Type pt) {
        Type result = attribTree(tree, env, 2, pt);
        return result;
    }

    public Type attribStat(JCTree tree, Env<AttrContext> env) {
        return attribTree(tree, env, 0, Type.noType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<Type> attribExprs(List<JCTree.JCExpression> trees, Env<AttrContext> env, Type pt) {
        ListBuffer<Type> ts = new ListBuffer<>();
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            ts.append(attribExpr((JCTree) list.head, env, pt));
        }
        return ts.toList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T extends JCTree> void attribStats(List<T> trees, Env<AttrContext> env) {
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            attribStat((JCTree) list.head, env);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<Type> attribArgs(List<JCTree.JCExpression> trees, Env<AttrContext> env) {
        ListBuffer<Type> argtypes = new ListBuffer<>();
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            argtypes.append(this.f358chk.checkNonVoid(((JCTree.JCExpression) list.head).m489pos(), this.types.upperBound(attribTree((JCTree) list.head, env, 12, Infer.anyPoly))));
        }
        return argtypes.toList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<Type> attribAnyTypes(List<JCTree.JCExpression> trees, Env<AttrContext> env) {
        ListBuffer<Type> argtypes = new ListBuffer<>();
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            argtypes.append(attribType((JCTree) list.head, env));
        }
        return argtypes.toList();
    }

    List<Type> attribTypes(List<JCTree.JCExpression> trees, Env<AttrContext> env) {
        List<Type> types = attribAnyTypes(trees, env);
        return this.f358chk.checkRefTypes(trees, types);
    }

    void attribTypeVariables(List<JCTree.JCTypeParameter> typarams, Env<AttrContext> env) {
        for (JCTree.JCTypeParameter tvar : typarams) {
            Type.TypeVar a = (Type.TypeVar) tvar.type;
            a.tsym.flags_field |= 268435456;
            a.bound = Type.noType;
            if (!tvar.bounds.isEmpty()) {
                List<Type> bounds = List.m508of(attribType(tvar.bounds.head, env));
                for (JCTree.JCExpression bound : tvar.bounds.tail) {
                    bounds = bounds.prepend(attribType(bound, env));
                }
                this.types.setBounds(a, bounds.reverse());
            } else {
                this.types.setBounds(a, List.m508of(this.syms.objectType));
            }
            a.tsym.flags_field &= -268435457;
        }
        for (JCTree.JCTypeParameter tvar2 : typarams) {
            this.f358chk.checkNonCyclic(tvar2.m489pos(), (Type.TypeVar) tvar2.type);
        }
        attribStats(typarams, env);
    }

    void attribBounds(List<JCTree.JCTypeParameter> typarams) {
        for (JCTree.JCTypeParameter typaram : typarams) {
            Type bound = typaram.type.mo576getUpperBound();
            if (bound != null && (bound.tsym instanceof Symbol.ClassSymbol)) {
                Symbol.ClassSymbol c = (Symbol.ClassSymbol) bound.tsym;
                if ((c.flags_field & 16777216) != 0) {
                    Assert.check((c.flags_field & 268435456) != 0 ? allowDiamondFinder : false, c);
                    attribClass(typaram.m489pos(), c);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void attribAnnotationTypes(List<JCTree.JCAnnotation> annotations, Env<AttrContext> env) {
        for (List list = annotations; list.nonEmpty(); list = list.tail) {
            JCTree.JCAnnotation a = (JCTree.JCAnnotation) list.head;
            attribType(a.annotationType, env);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object attribLazyConstantValue(Env<AttrContext> env, JCTree.JCExpression initializer, Type type) {
        Env c0621Env = env;
        while (((AttrContext) c0621Env.info).lint == null) {
            c0621Env = c0621Env.next;
        }
        if (env.info.enclVar.attributes_field == null) {
            env.info.lint = ((AttrContext) c0621Env.info).lint;
        } else {
            env.info.lint = ((AttrContext) c0621Env.info).lint.augment(env.info.enclVar.attributes_field, env.info.enclVar.flags());
        }
        Lint prevLint = this.f358chk.setLint(env.info.lint);
        JavaFileObject prevSource = this.f360log.useSource(env.toplevel.sourcefile);
        try {
            Type itype = attribExpr(initializer, env, type);
            if (itype.constValue() != null) {
                return coerce(itype, type).constValue();
            }
            return null;
        } finally {
            env.info.lint = prevLint;
            this.f360log.useSource(prevSource);
        }
    }

    Type attribBase(JCTree tree, Env<AttrContext> env, boolean classExpected, boolean interfaceExpected, boolean checkExtensible) {
        Type t;
        if (tree.type != null) {
            t = tree.type;
        } else {
            t = attribType(tree, env);
        }
        return checkBase(t, tree, env, classExpected, interfaceExpected, checkExtensible);
    }

    Type checkBase(Type t, JCTree tree, Env<AttrContext> env, boolean classExpected, boolean interfaceExpected, boolean checkExtensible) {
        if (t.isErroneous()) {
            return t;
        }
        if (t.f344tag == 14 && !classExpected && !interfaceExpected) {
            if (t.mo576getUpperBound() == null) {
                this.f360log.error(tree.m489pos(), "illegal.forward.ref", new Object[0]);
                return this.types.createErrorType(t);
            }
        } else {
            t = this.f358chk.checkClassType(tree.m489pos(), t, (this.allowGenerics ^ allowDiamondFinder) | checkExtensible);
        }
        if (interfaceExpected && (t.tsym.flags() & 512) == 0) {
            this.f360log.error(tree.m489pos(), "intf.expected.here", new Object[0]);
            return this.types.createErrorType(t);
        }
        if (checkExtensible && classExpected && (512 & t.tsym.flags()) != 0) {
            this.f360log.error(tree.m489pos(), "no.intf.expected.here", new Object[0]);
            return this.types.createErrorType(t);
        }
        if (checkExtensible && (t.tsym.flags() & 16) != 0) {
            this.f360log.error(tree.m489pos(), "cant.inherit.from.final", t.tsym);
        }
        this.f358chk.checkNonCyclic(tree.m489pos(), t);
        return t;
    }

    @Override
    public void visitClassDef(JCTree.JCClassDecl tree) {
        if ((this.f359env.info.scope.owner.kind & 20) != 0) {
            this.enter.classEnter(tree, this.f359env);
        }
        Symbol.ClassSymbol c = tree.f539sym;
        if (c == null) {
            this.result = null;
            return;
        }
        c.complete();
        if (this.f359env.info.isSelfCall && this.f359env.tree.getTag() == 27 && ((JCTree.JCNewClass) this.f359env.tree).encl == null) {
            c.flags_field |= 4194304;
        }
        attribClass(tree.m489pos(), c);
        Type type = c.type;
        tree.type = type;
        this.result = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitMethodDef(JCTree.JCMethodDecl tree) {
        Symbol.MethodSymbol m = tree.f544sym;
        Lint lint = this.f359env.info.lint.augment(m.attributes_field, m.flags());
        Lint prevLint = this.f358chk.setLint(lint);
        Symbol.MethodSymbol prevMethod = this.f358chk.setMethod(m);
        try {
            this.deferredLintHandler.flush(tree.m489pos());
            this.f358chk.checkDeprecatedAnnotation(tree.m489pos(), m);
            attribBounds(tree.typarams);
            if (m.isStatic()) {
                this.f358chk.checkHideClashes(tree.m489pos(), this.f359env.enclClass.type, m);
            } else {
                this.f358chk.checkOverrideClashes(tree.m489pos(), this.f359env.enclClass.type, m);
            }
            this.f358chk.checkOverride(tree, m);
            Env<AttrContext> localEnv = this.memberEnter.methodEnv(tree, this.f359env);
            localEnv.info.lint = lint;
            for (List list = tree.typarams; list.nonEmpty(); list = list.tail) {
                localEnv.info.scope.enterIfAbsent(((JCTree.JCTypeParameter) list.head).type.tsym);
            }
            Symbol.ClassSymbol owner = this.f359env.enclClass.f539sym;
            if ((owner.flags() & 8192) != 0 && tree.params.nonEmpty()) {
                this.f360log.error(tree.params.head.m489pos(), "intf.annotation.members.cant.have.params", new Object[0]);
            }
            for (List list2 = tree.params; list2.nonEmpty(); list2 = list2.tail) {
                attribStat((JCTree) list2.head, localEnv);
            }
            this.f358chk.checkVarargsMethodDecl(localEnv, tree);
            this.f358chk.validate(tree.typarams, localEnv);
            this.f358chk.validate(tree.restype, localEnv);
            if ((owner.flags() & 8192) != 0) {
                if (tree.thrown.nonEmpty()) {
                    this.f360log.error(tree.thrown.head.m489pos(), "throws.not.allowed.in.intf.annotation", new Object[0]);
                }
                if (tree.typarams.nonEmpty()) {
                    this.f360log.error(tree.typarams.head.m489pos(), "intf.annotation.members.cant.have.type.params", new Object[0]);
                }
                this.f358chk.validateAnnotationType(tree.restype);
                this.f358chk.validateAnnotationMethod(tree.m489pos(), m);
                if (tree.defaultValue != null) {
                    this.f358chk.validateAnnotationTree(tree.defaultValue);
                }
            }
            for (List list3 = tree.thrown; list3.nonEmpty(); list3 = list3.tail) {
                this.f358chk.checkType(((JCTree.JCExpression) list3.head).m489pos(), ((JCTree.JCExpression) list3.head).type, this.syms.throwableType);
            }
            if (tree.body == null) {
                if ((owner.flags() & 512) == 0 && (tree.mods.flags & 1280) == 0 && !this.relax) {
                    this.f360log.error(tree.m489pos(), "missing.meth.body.or.decl.abstract", new Object[0]);
                }
                if (tree.defaultValue != null && (owner.flags() & 8192) == 0) {
                    this.f360log.error(tree.m489pos(), "default.allowed.in.intf.annotation.member", new Object[0]);
                }
            } else if ((owner.flags() & 512) != 0) {
                this.f360log.error(tree.body.m489pos(), "intf.meth.cant.have.body", new Object[0]);
            } else if ((tree.mods.flags & 1024) != 0) {
                this.f360log.error(tree.m489pos(), "abstract.meth.cant.have.body", new Object[0]);
            } else if ((tree.mods.flags & 256) == 0) {
                if (tree.name == this.names.init && owner.type != this.syms.objectType) {
                    JCTree.JCBlock body = tree.body;
                    if (body.stats.isEmpty() || !TreeInfo.isSelfCall(body.stats.head)) {
                        body.stats = body.stats.prepend(this.memberEnter.SuperCall(this.make.m495at(body.f531pos), List.m507nil(), List.m507nil(), false));
                    } else if ((this.f359env.enclClass.f539sym.flags() & 16384) != 0 && (tree.mods.flags & Flags.GENERATEDCONSTR) == 0 && TreeInfo.isSuperCall(body.stats.head)) {
                        this.f360log.error(tree.body.stats.head.m489pos(), "call.to.super.not.allowed.in.enum.ctor", this.f359env.enclClass.f539sym);
                    }
                }
                attribStat(tree.body, localEnv);
            } else {
                this.f360log.error(tree.m489pos(), "native.meth.cant.have.body", new Object[0]);
            }
            localEnv.info.scope.leave();
            Type type = m.type;
            tree.type = type;
            this.result = type;
            this.f358chk.validateAnnotations(tree.mods.annotations, m);
        } finally {
            this.f358chk.setLint(prevLint);
            this.f358chk.setMethod(prevMethod);
        }
    }

    @Override
    public void visitVarDef(JCTree.JCVariableDecl tree) {
        if (this.f359env.info.scope.owner.kind == 16) {
            if (tree.f547sym != null) {
                this.f359env.info.scope.enter(tree.f547sym);
            } else {
                this.memberEnter.memberEnter(tree, this.f359env);
                this.annotate.flush();
            }
            tree.f547sym.flags_field |= Flags.EFFECTIVELY_FINAL;
        }
        Symbol.VarSymbol v = tree.f547sym;
        Lint lint = this.f359env.info.lint.augment(v.attributes_field, v.flags());
        Lint prevLint = this.f358chk.setLint(lint);
        this.f358chk.validate(tree.vartype, this.f359env);
        this.deferredLintHandler.flush(tree.m489pos());
        try {
            this.f358chk.checkDeprecatedAnnotation(tree.m489pos(), v);
            if (tree.init != null) {
                if ((v.flags_field & 16) != 0 && tree.init.getTag() != 27) {
                    v.getConstValue();
                } else {
                    Env<AttrContext> initEnv = this.memberEnter.initEnv(tree, this.f359env);
                    initEnv.info.lint = lint;
                    initEnv.info.enclVar = v;
                    attribExpr(tree.init, initEnv, v.type);
                }
            }
            Type type = v.type;
            tree.type = type;
            this.result = type;
            this.f358chk.validateAnnotations(tree.mods.annotations, v);
        } finally {
            this.f358chk.setLint(prevLint);
        }
    }

    @Override
    public void visitSkip(JCTree.JCSkip tree) {
        this.result = null;
    }

    @Override
    public void visitBlock(JCTree.JCBlock tree) {
        if (this.f359env.info.scope.owner.kind == 2) {
            Env<AttrContext> c0621Env = this.f359env;
            Env<AttrContext> localEnv = c0621Env.m466dup(tree, c0621Env.info.m463dup(this.f359env.info.scope.dupUnshared()));
            localEnv.info.scope.owner = new Symbol.MethodSymbol(1048576 | tree.flags, this.names.empty, null, this.f359env.info.scope.owner);
            if ((tree.flags & 8) != 0) {
                localEnv.info.staticLevel++;
            }
            attribStats(tree.stats, localEnv);
        } else {
            Env<AttrContext> c0621Env2 = this.f359env;
            Env<AttrContext> localEnv2 = c0621Env2.m466dup(tree, c0621Env2.info.m463dup(this.f359env.info.scope.mo450dup()));
            attribStats(tree.stats, localEnv2);
            localEnv2.info.scope.leave();
        }
        this.result = null;
    }

    @Override
    public void visitDoLoop(JCTree.JCDoWhileLoop tree) {
        attribStat(tree.body, this.f359env.m465dup(tree));
        attribExpr(tree.cond, this.f359env, this.syms.booleanType);
        this.result = null;
    }

    @Override
    public void visitWhileLoop(JCTree.JCWhileLoop tree) {
        attribExpr(tree.cond, this.f359env, this.syms.booleanType);
        attribStat(tree.body, this.f359env.m465dup(tree));
        this.result = null;
    }

    @Override
    public void visitForLoop(JCTree.JCForLoop tree) {
        Env<AttrContext> c0621Env = this.f359env;
        Env<AttrContext> loopEnv = c0621Env.m466dup(c0621Env.tree, this.f359env.info.m463dup(this.f359env.info.scope.mo450dup()));
        attribStats(tree.init, loopEnv);
        if (tree.cond != null) {
            attribExpr(tree.cond, loopEnv, this.syms.booleanType);
        }
        loopEnv.tree = tree;
        attribStats(tree.step, loopEnv);
        attribStat(tree.body, loopEnv);
        loopEnv.info.scope.leave();
        this.result = null;
    }

    @Override
    public void visitForeachLoop(JCTree.JCEnhancedForLoop tree) {
        Type typeUpperBound;
        Env<AttrContext> c0621Env = this.f359env;
        Env<AttrContext> loopEnv = c0621Env.m466dup(c0621Env.tree, this.f359env.info.m463dup(this.f359env.info.scope.mo450dup()));
        attribStat(tree.f541var, loopEnv);
        Type exprType = this.types.upperBound(attribExpr(tree.expr, loopEnv));
        this.f358chk.checkNonVoid(tree.m489pos(), exprType);
        Type elemtype = this.types.elemtype(exprType);
        if (elemtype == null) {
            Type base = this.types.asSuper(exprType, this.syms.iterableType.tsym);
            if (base == null) {
                this.f360log.error(tree.expr.m489pos(), "foreach.not.applicable.to.type", exprType, this.diags.fragment("type.req.array.or.iterable", new Object[0]));
                elemtype = this.types.createErrorType(exprType);
            } else {
                List<Type> iterableParams = base.allparams();
                if (iterableParams.isEmpty()) {
                    typeUpperBound = this.syms.objectType;
                } else {
                    typeUpperBound = this.types.upperBound(iterableParams.head);
                }
                elemtype = typeUpperBound;
            }
        }
        this.f358chk.checkType(tree.expr.m489pos(), elemtype, tree.f541var.f547sym.type);
        loopEnv.tree = tree;
        attribStat(tree.body, loopEnv);
        loopEnv.info.scope.leave();
        this.result = null;
    }

    @Override
    public void visitLabelled(JCTree.JCLabeledStatement tree) {
        for (Env c0621Env = this.f359env; c0621Env != null && c0621Env.tree.getTag() != 3; c0621Env = c0621Env.next) {
            if (c0621Env.tree.getTag() == 12 && ((JCTree.JCLabeledStatement) c0621Env.tree).label == tree.label) {
                this.f360log.error(tree.m489pos(), "label.already.in.use", tree.label);
                break;
            }
        }
        attribStat(tree.body, this.f359env.m465dup(tree));
        this.result = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitSwitch(JCTree.JCSwitch tree) {
        Type seltype = attribExpr(tree.selector, this.f359env);
        Env<AttrContext> c0621Env = this.f359env;
        Env<AttrContext> switchEnv = c0621Env.m466dup(tree, c0621Env.info.m463dup(this.f359env.info.scope.mo450dup()));
        int i = 0;
        boolean enumSwitch = (!this.allowEnums || (seltype.tsym.flags() & 16384) == 0) ? false : allowDiamondFinder;
        boolean stringSwitch = false;
        if (this.types.isSameType(seltype, this.syms.stringType)) {
            if (this.allowStringsInSwitch) {
                stringSwitch = allowDiamondFinder;
            } else {
                this.f360log.error(tree.selector.m489pos(), "string.switch.not.supported.in.source", this.sourceName);
            }
        }
        if (!enumSwitch && !stringSwitch) {
            seltype = this.f358chk.checkType(tree.selector.m489pos(), seltype, this.syms.intType);
        }
        Set<Object> labels = new HashSet<>();
        boolean hasDefault = false;
        List list = tree.cases;
        while (list.nonEmpty()) {
            JCTree.JCCase c = (JCTree.JCCase) list.head;
            Env<AttrContext> caseEnv = switchEnv.m466dup(c, this.f359env.info.m463dup(switchEnv.info.scope.mo450dup()));
            if (c.f538pat != null) {
                if (enumSwitch) {
                    Symbol sym = enumConstant(c.f538pat, seltype);
                    if (sym == null) {
                        this.f360log.error(c.f538pat.m489pos(), "enum.label.must.be.unqualified.enum", new Object[i]);
                    } else if (!labels.add(sym)) {
                        this.f360log.error(c.m489pos(), "duplicate.case.label", new Object[0]);
                    }
                } else {
                    Type pattype = attribExpr(c.f538pat, switchEnv, seltype);
                    if (pattype.f344tag != 19) {
                        if (pattype.constValue() == null) {
                            this.f360log.error(c.f538pat.m489pos(), stringSwitch ? "string.const.req" : "const.expr.req", new Object[0]);
                        } else if (labels.contains(pattype.constValue())) {
                            this.f360log.error(c.m489pos(), "duplicate.case.label", new Object[0]);
                        } else {
                            labels.add(pattype.constValue());
                        }
                    }
                }
            } else if (hasDefault) {
                this.f360log.error(c.m489pos(), "duplicate.default.label", new Object[0]);
            } else {
                hasDefault = true;
            }
            attribStats(c.stats, caseEnv);
            caseEnv.info.scope.leave();
            addVars(c.stats, switchEnv.info.scope);
            list = list.tail;
            i = 0;
        }
        switchEnv.info.scope.leave();
        this.result = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void addVars(List<JCTree.JCStatement> list, Scope scope) {
        for (List list2 = list; list2.nonEmpty(); list2 = list2.tail) {
            JCTree jCTree = (JCTree) list2.head;
            if (jCTree.getTag() == 5) {
                scope.enter(((JCTree.JCVariableDecl) jCTree).f547sym);
            }
        }
    }

    private Symbol enumConstant(JCTree tree, Type enumType) {
        if (tree.getTag() != 35) {
            this.f360log.error(tree.m489pos(), "enum.label.must.be.unqualified.enum", new Object[0]);
            return this.syms.errSymbol;
        }
        JCTree.JCIdent ident = (JCTree.JCIdent) tree;
        Name name = ident.name;
        for (Scope.Entry e = enumType.tsym.members().lookup(name); e.scope != null; e = e.next()) {
            if (e.f338sym.kind == 4) {
                Symbol s = e.f338sym;
                ident.f543sym = s;
                ((Symbol.VarSymbol) s).getConstValue();
                ident.type = s.type;
                if ((s.flags_field & 16384) == 0) {
                    return null;
                }
                return s;
            }
        }
        return null;
    }

    @Override
    public void visitSynchronized(JCTree.JCSynchronized tree) {
        this.f358chk.checkRefType(tree.m489pos(), attribExpr(tree.lock, this.f359env));
        attribStat(tree.body, this.f359env);
        this.result = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitTry(JCTree.JCTry tree) {
        Env<AttrContext> tryEnv;
        Env<AttrContext> c0621Env = this.f359env;
        Env<AttrContext> localEnv = c0621Env.m466dup(tree, c0621Env.info.m463dup(this.f359env.info.scope.mo450dup()));
        boolean isTryWithResource = tree.resources.nonEmpty();
        if (isTryWithResource) {
            tryEnv = this.f359env.m466dup(tree, localEnv.info.m463dup(localEnv.info.scope.mo450dup()));
        } else {
            tryEnv = localEnv;
        }
        for (JCTree resource : tree.resources) {
            if (resource.getTag() == 5) {
                attribStat(resource, tryEnv);
                this.f358chk.checkType(resource, resource.type, this.syms.autoCloseableType, "try.not.applicable.to.type");
                checkAutoCloseable(resource.m489pos(), localEnv, resource.type);
                Symbol.VarSymbol var = (Symbol.VarSymbol) TreeInfo.symbolFor(resource);
                var.setData(ElementKind.RESOURCE_VARIABLE);
            } else {
                attribExpr(resource, tryEnv, this.syms.autoCloseableType, "try.not.applicable.to.type");
            }
        }
        attribStat(tree.body, tryEnv);
        if (isTryWithResource) {
            tryEnv.info.scope.leave();
        }
        for (List list = tree.catchers; list.nonEmpty(); list = list.tail) {
            JCTree.JCCatch c = (JCTree.JCCatch) list.head;
            Env<AttrContext> catchEnv = localEnv.m466dup(c, localEnv.info.m463dup(localEnv.info.scope.mo450dup()));
            Type ctype = attribStat(c.param, catchEnv);
            if (TreeInfo.isMultiCatch(c)) {
                c.param.f547sym.flags_field |= 549755813904L;
            }
            if (c.param.f547sym.kind == 4) {
                c.param.f547sym.setData(ElementKind.EXCEPTION_PARAMETER);
            }
            this.f358chk.checkType(c.param.vartype.m489pos(), this.f358chk.checkClassType(c.param.vartype.m489pos(), ctype), this.syms.throwableType);
            attribStat(c.body, catchEnv);
            catchEnv.info.scope.leave();
        }
        if (tree.finalizer != null) {
            attribStat(tree.finalizer, localEnv);
        }
        localEnv.info.scope.leave();
        this.result = null;
    }

    void checkAutoCloseable(JCDiagnostic.DiagnosticPosition pos, Env<AttrContext> env, Type resource) {
        if (!resource.isErroneous() && this.types.asSuper(resource, this.syms.autoCloseableType.tsym) != null) {
            Symbol.TypeSymbol typeSymbol = this.syms.noSymbol;
            boolean prevDeferDiags = this.f360log.deferDiagnostics;
            Queue<JCDiagnostic> prevDeferredDiags = this.f360log.deferredDiagnostics;
            try {
                this.f360log.deferDiagnostics = allowDiamondFinder;
                this.f360log.deferredDiagnostics = ListBuffer.m512lb();
                Symbol close = this.f362rs.resolveQualifiedMethod(pos, env, resource, this.names.close, List.m507nil(), List.m507nil());
                this.f360log.deferDiagnostics = prevDeferDiags;
                this.f360log.deferredDiagnostics = prevDeferredDiags;
                if (close.kind == 16 && close.overrides(this.syms.autoCloseableClose, resource.tsym, this.types, allowDiamondFinder) && this.f358chk.isHandled(this.syms.interruptedExceptionType, this.types.memberType(resource, close).mo575getThrownTypes()) && env.info.lint.isEnabled(Lint.LintCategory.TRY)) {
                    this.f360log.warning(Lint.LintCategory.TRY, pos, "try.resource.throws.interrupted.exc", resource);
                }
            } catch (Throwable th) {
                this.f360log.deferDiagnostics = prevDeferDiags;
                this.f360log.deferredDiagnostics = prevDeferredDiags;
                throw th;
            }
        }
    }

    @Override
    public void visitConditional(JCTree.JCConditional tree) {
        attribExpr(tree.cond, this.f359env, this.syms.booleanType);
        attribExpr(tree.truepart, this.f359env);
        attribExpr(tree.falsepart, this.f359env);
        this.result = check(tree, capture(condType(tree.m489pos(), tree.cond.type, tree.truepart.type, tree.falsepart.type)), 12, this.pkind, this.f361pt);
    }

    private Type condType(JCDiagnostic.DiagnosticPosition pos, Type condtype, Type thentype, Type elsetype) {
        Type ctype = condType1(pos, condtype, thentype, elsetype);
        if (condtype.constValue() == null || thentype.constValue() == null || elsetype.constValue() == null) {
            return ctype;
        }
        return this.cfolder.coerce(condtype.isTrue() ? thentype : elsetype, ctype);
    }

    private Type condType1(JCDiagnostic.DiagnosticPosition pos, Type condtype, Type thentype, Type elsetype) {
        if (this.types.isSameType(thentype, elsetype)) {
            return thentype.baseType();
        }
        Type thenUnboxed = (!this.allowBoxing || thentype.isPrimitive()) ? thentype : this.types.unboxedType(thentype);
        Type elseUnboxed = (!this.allowBoxing || elsetype.isPrimitive()) ? elsetype : this.types.unboxedType(elsetype);
        if (thenUnboxed.isPrimitive() && elseUnboxed.isPrimitive()) {
            if (thenUnboxed.f344tag < 4 && elseUnboxed.f344tag == 4 && this.types.isAssignable(elseUnboxed, thenUnboxed)) {
                return thenUnboxed.baseType();
            }
            if (elseUnboxed.f344tag < 4 && thenUnboxed.f344tag == 4 && this.types.isAssignable(thenUnboxed, elseUnboxed)) {
                return elseUnboxed.baseType();
            }
            for (int i = 1; i < 9; i++) {
                Type candidate = this.syms.typeOfTag[i];
                if (this.types.isSubtype(thenUnboxed, candidate) && this.types.isSubtype(elseUnboxed, candidate)) {
                    return candidate;
                }
            }
        }
        if (this.allowBoxing) {
            if (thentype.isPrimitive()) {
                thentype = this.types.boxedClass(thentype).type;
            }
            if (elsetype.isPrimitive()) {
                elsetype = this.types.boxedClass(elsetype).type;
            }
        }
        if (this.types.isSubtype(thentype, elsetype)) {
            return elsetype.baseType();
        }
        if (this.types.isSubtype(elsetype, thentype)) {
            return thentype.baseType();
        }
        if (!this.allowBoxing || thentype.f344tag == 9 || elsetype.f344tag == 9) {
            this.f360log.error(pos, "neither.conditional.subtype", thentype, elsetype);
            return thentype.baseType();
        }
        return this.types.m456lub(thentype.baseType(), elsetype.baseType());
    }

    @Override
    public void visitIf(JCTree.JCIf tree) {
        attribExpr(tree.cond, this.f359env, this.syms.booleanType);
        attribStat(tree.thenpart, this.f359env);
        if (tree.elsepart != null) {
            attribStat(tree.elsepart, this.f359env);
        }
        this.f358chk.checkEmptyIf(tree);
        this.result = null;
    }

    @Override
    public void visitExec(JCTree.JCExpressionStatement tree) {
        Env<AttrContext> localEnv = this.f359env.m465dup(tree);
        attribExpr(tree.expr, localEnv);
        this.result = null;
    }

    @Override
    public void visitBreak(JCTree.JCBreak tree) {
        tree.target = findJumpTarget(tree.m489pos(), tree.getTag(), tree.label, this.f359env);
        this.result = null;
    }

    @Override
    public void visitContinue(JCTree.JCContinue tree) {
        tree.target = findJumpTarget(tree.m489pos(), tree.getTag(), tree.label, this.f359env);
        this.result = null;
    }

    private JCTree findJumpTarget(JCDiagnostic.DiagnosticPosition pos, int tag, Name label, Env<AttrContext> env) {
        int tag2;
        for (Env c0621Env = env; c0621Env != null && (tag2 = c0621Env.tree.getTag()) != 3 && tag2 != 4; c0621Env = c0621Env.next) {
            switch (tag2) {
                case 8:
                case 9:
                case 10:
                case 11:
                    if (label == null) {
                        return c0621Env.tree;
                    }
                    break;
                    break;
                case 12:
                    JCTree.JCLabeledStatement labelled = (JCTree.JCLabeledStatement) c0621Env.tree;
                    if (label == labelled.label) {
                        if (tag == 22) {
                            if (labelled.body.getTag() != 8 && labelled.body.getTag() != 9 && labelled.body.getTag() != 10 && labelled.body.getTag() != 11) {
                                this.f360log.error(pos, "not.loop.label", label);
                            }
                            return TreeInfo.referencedStatement(labelled);
                        }
                        return labelled;
                    }
                    break;
                    break;
                case 13:
                    if (label == null && tag == 21) {
                        return c0621Env.tree;
                    }
                    break;
            }
        }
        if (label != null) {
            this.f360log.error(pos, "undef.label", label);
            return null;
        }
        if (tag == 22) {
            this.f360log.error(pos, "cont.outside.loop", new Object[0]);
            return null;
        }
        this.f360log.error(pos, "break.outside.switch.loop", new Object[0]);
        return null;
    }

    @Override
    public void visitReturn(JCTree.JCReturn tree) {
        if (this.f359env.enclMethod == null || this.f359env.enclMethod.f544sym.owner != this.f359env.enclClass.f539sym) {
            this.f360log.error(tree.m489pos(), "ret.outside.meth", new Object[0]);
        } else {
            Symbol m = this.f359env.enclMethod.f544sym;
            if (m.type.mo574getReturnType().f344tag == 9) {
                if (tree.expr != null) {
                    this.f360log.error(tree.expr.m489pos(), "cant.ret.val.from.meth.decl.void", new Object[0]);
                }
            } else if (tree.expr == null) {
                this.f360log.error(tree.m489pos(), "missing.ret.val", new Object[0]);
            } else {
                attribExpr(tree.expr, this.f359env, m.type.mo574getReturnType());
            }
        }
        this.result = null;
    }

    @Override
    public void visitThrow(JCTree.JCThrow tree) {
        attribExpr(tree.expr, this.f359env, this.syms.throwableType);
        this.result = null;
    }

    @Override
    public void visitAssert(JCTree.JCAssert tree) {
        attribExpr(tree.cond, this.f359env, this.syms.booleanType);
        if (tree.detail != null) {
            this.f358chk.checkNonVoid(tree.detail.m489pos(), attribExpr(tree.detail, this.f359env));
        }
        this.result = null;
    }

    @Override
    public void visitApply(JCTree.JCMethodInvocation tree) {
        Type restype;
        Type qualifier;
        List<Type> argtypes;
        Env<AttrContext> c0621Env = this.f359env;
        Env<AttrContext> localEnv = c0621Env.m466dup(tree, c0621Env.info.m462dup());
        Name methName = TreeInfo.name(tree.meth);
        boolean isConstructorCall = (methName == this.names._this || methName == this.names._super) ? allowDiamondFinder : false;
        if (isConstructorCall) {
            if (checkFirstConstructorStat(tree, this.f359env)) {
                localEnv.info.isSelfCall = allowDiamondFinder;
                List<Type> argtypes2 = attribArgs(tree.args, localEnv);
                List<Type> typeargtypes = attribTypes(tree.typeargs, localEnv);
                Type site = this.f359env.enclClass.f539sym.type;
                if (methName == this.names._super) {
                    if (site == this.syms.objectType) {
                        this.f360log.error(tree.meth.m489pos(), "no.superclass", site);
                        site = this.types.createErrorType(this.syms.objectType);
                    } else {
                        site = this.types.supertype(site);
                    }
                }
                if (site.f344tag == 10) {
                    Type encl = site.getEnclosingType();
                    while (encl != null && encl.f344tag == 14) {
                        encl = encl.mo576getUpperBound();
                    }
                    if (encl.f344tag == 10) {
                        if (tree.meth.getTag() == 34) {
                            JCTree qualifier2 = ((JCTree.JCFieldAccess) tree.meth).selected;
                            this.f358chk.checkRefType(qualifier2.m489pos(), attribExpr(qualifier2, localEnv, encl));
                        } else if (methName == this.names._super) {
                            this.f362rs.resolveImplicitThis(tree.meth.m489pos(), localEnv, site, allowDiamondFinder);
                        }
                    } else if (tree.meth.getTag() == 34) {
                        this.f360log.error(tree.meth.m489pos(), "illegal.qual.not.icls", site.tsym);
                    }
                    if (site.tsym == this.syms.enumSym && this.allowEnums) {
                        argtypes = argtypes2.prepend(this.syms.intType).prepend(this.syms.stringType);
                    } else {
                        argtypes = argtypes2;
                    }
                    boolean selectSuperPrev = localEnv.info.selectSuper;
                    localEnv.info.selectSuper = allowDiamondFinder;
                    localEnv.info.varArgs = false;
                    Symbol sym = this.f362rs.resolveConstructor(tree.meth.m489pos(), localEnv, site, argtypes, typeargtypes);
                    localEnv.info.selectSuper = selectSuperPrev;
                    TreeInfo.setSymbol(tree.meth, sym);
                    Type mpt = newMethTemplate(argtypes, typeargtypes);
                    checkId(tree.meth, site, sym, localEnv, 16, mpt, tree.varargsElement != null ? allowDiamondFinder : false);
                }
            }
            Type.JCNoType jCNoType = this.syms.voidType;
            tree.type = jCNoType;
            this.result = jCNoType;
        } else {
            List<Type> argtypes3 = attribArgs(tree.args, localEnv);
            List<Type> typeargtypes2 = attribAnyTypes(tree.typeargs, localEnv);
            Type mpt2 = newMethTemplate(argtypes3, typeargtypes2);
            localEnv.info.varArgs = false;
            Type mtype = attribExpr(tree.meth, localEnv, mpt2);
            if (localEnv.info.varArgs) {
                Assert.check((mtype.isErroneous() || tree.varargsElement != null) ? allowDiamondFinder : false);
            }
            Type restype2 = mtype.mo574getReturnType();
            if (restype2.f344tag != 15) {
                if (tree.meth.getTag() == 34 && this.allowCovariantReturns && methName == this.names.clone && this.types.isArray(((JCTree.JCFieldAccess) tree.meth).selected.type)) {
                    restype2 = ((JCTree.JCFieldAccess) tree.meth).selected.type;
                }
                if (this.allowGenerics && methName == this.names.getClass && tree.args.isEmpty()) {
                    if (tree.meth.getTag() == 34) {
                        qualifier = ((JCTree.JCFieldAccess) tree.meth).selected.type;
                    } else {
                        qualifier = this.f359env.enclClass.f539sym.type;
                    }
                    restype = new Type.ClassType(restype2.getEnclosingType(), List.m508of(new Type.WildcardType(this.types.erasure(qualifier), BoundKind.EXTENDS, this.syms.boundClass)), restype2.tsym);
                } else {
                    restype = restype2;
                }
                this.f358chk.checkRefTypes(tree.typeargs, typeargtypes2);
                this.result = check(tree, capture(restype), 12, this.pkind, this.f361pt);
            } else {
                throw new AssertionError(mtype);
            }
        }
        this.f358chk.validate(tree.typeargs, localEnv);
    }

    boolean checkFirstConstructorStat(JCTree.JCMethodInvocation tree, Env<AttrContext> env) {
        JCTree.JCMethodDecl enclMethod = env.enclMethod;
        if (enclMethod != null && enclMethod.name == this.names.init) {
            JCTree.JCBlock body = enclMethod.body;
            if (body.stats.head.getTag() == 20 && ((JCTree.JCExpressionStatement) body.stats.head).expr == tree) {
                return allowDiamondFinder;
            }
        }
        this.f360log.error(tree.m489pos(), "call.must.be.first.stmt.in.ctor", TreeInfo.name(tree.meth));
        return false;
    }

    Type newMethTemplate(List<Type> argtypes, List<Type> typeargtypes) {
        Type.MethodType mt = new Type.MethodType(argtypes, null, null, this.syms.methodClass);
        return typeargtypes == null ? mt : new Type.ForAll(typeargtypes, mt);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0335  */
    /* JADX WARN: Code duplicated, block: B:124:0x033d  */
    /* JADX WARN: Code duplicated, block: B:127:0x034e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0355  */
    /* JADX WARN: Code duplicated, block: B:134:0x0382  */
    /* JADX WARN: Code duplicated, block: B:137:0x038c  */
    /* JADX WARN: Code duplicated, block: B:138:0x038f  */
    /* JADX WARN: Code duplicated, block: B:145:0x03be  */
    /* JADX WARN: Code duplicated, block: B:148:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:149:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:151:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:157:0x0409  */
    @Override
    public void visitNewClass(JCTree.JCNewClass tree) throws Throwable {
        JCTree.JCExpression clazzid1;
        JCTree.JCExpression clazz;
        JCTree.JCExpression clazzid2;
        int i;
        Type owntype;
        JCTree.JCExpression clazzid;
        int i2;
        Type owntype2;
        Queue<JCDiagnostic> prevDeferredDiags;
        boolean prevDeferDiags;
        String key;
        Env<AttrContext> localEnv;
        Type typeCheckMethod;
        List<Type> typeargtypes;
        List<Type> argtypes;
        List<Type> argtypes2;
        boolean useVarargs;
        Symbol sym;
        boolean z;
        Type owntype3 = this.types.createErrorType(tree.type);
        Env<AttrContext> c0621Env = this.f359env;
        Env<AttrContext> localEnv2 = c0621Env.m466dup(tree, c0621Env.info.m462dup());
        JCTree.JCClassDecl cdef = tree.f545def;
        JCTree.JCExpression clazz2 = tree.clazz;
        if (clazz2.getTag() == 39) {
            clazzid1 = ((JCTree.JCTypeApply) clazz2).clazz;
        } else {
            clazzid1 = clazz2;
        }
        JCTree.JCExpression clazzid3 = clazzid1;
        if (tree.encl == null) {
            clazz = clazz2;
            clazzid2 = clazzid1;
        } else {
            Type encltype = this.f358chk.checkRefType(tree.encl.m489pos(), attribExpr(tree.encl, this.f359env));
            JCTree.JCExpression clazzid4 = this.make.m495at(clazz2.f531pos).Select(this.make.Type(encltype), ((JCTree.JCIdent) clazzid3).name);
            if (clazz2.getTag() == 39) {
                clazz = this.make.m495at(tree.f531pos).TypeApply(clazzid4, ((JCTree.JCTypeApply) clazz2).arguments);
                clazzid2 = clazzid4;
            } else {
                clazz = clazzid4;
                clazzid2 = clazzid4;
            }
        }
        Type clazztype = attribType(clazz, this.f359env);
        Pair<Scope, Scope> mapping = getSyntheticScopeMapping(clazztype);
        Type clazztype2 = this.f358chk.checkDiamond(tree, clazztype);
        this.f358chk.validate(clazz, localEnv2);
        if (tree.encl != null) {
            tree.clazz.type = clazztype2;
            TreeInfo.setSymbol(clazzid3, TreeInfo.symbol(clazzid2));
            clazzid3.type = ((JCTree.JCIdent) clazzid3).f543sym.type;
            if (!clazztype2.isErroneous()) {
                if (cdef != null && clazztype2.tsym.isInterface()) {
                    this.f360log.error(tree.encl.m489pos(), "anon.class.impl.intf.no.qual.for.new", new Object[0]);
                } else if (clazztype2.tsym.isStatic()) {
                    this.f360log.error(tree.encl.m489pos(), "qualified.new.of.static.class", clazztype2.tsym);
                }
            }
        } else if (!clazztype2.tsym.isInterface() && clazztype2.getEnclosingType().f344tag == 10) {
            this.f362rs.resolveImplicitThis(tree.m489pos(), this.f359env, clazztype2);
        }
        List<Type> argtypes3 = attribArgs(tree.args, localEnv2);
        List<Type> typeargtypes2 = attribTypes(tree.typeargs, localEnv2);
        if (!TreeInfo.isDiamond(tree) || clazztype2.isErroneous()) {
            i = 1;
            if (tree.f545def != null || clazztype2.isErroneous() || !clazztype2.getTypeArguments().nonEmpty() || !this.findDiamonds) {
                owntype = owntype3;
                clazzid = clazzid3;
                i2 = 10;
            } else {
                boolean prevDeferDiags2 = this.f360log.deferDiagnostics;
                Queue<JCDiagnostic> prevDeferredDiags2 = this.f360log.deferredDiagnostics;
                try {
                    this.f360log.deferDiagnostics = allowDiamondFinder;
                    this.f360log.deferredDiagnostics = ListBuffer.m512lb();
                    owntype = owntype3;
                    prevDeferredDiags = prevDeferredDiags2;
                    clazzid = clazzid3;
                    prevDeferDiags = prevDeferDiags2;
                    try {
                        Type inferred = attribDiamond(localEnv2, tree, clazztype2, mapping, argtypes3, typeargtypes2);
                        this.f360log.deferDiagnostics = prevDeferDiags;
                        this.f360log.deferredDiagnostics = prevDeferredDiags;
                        if (inferred == null || inferred.isErroneous()) {
                            i2 = 10;
                        } else {
                            i2 = 10;
                            if (inferred.f344tag == 10) {
                                if (this.types.isAssignable(inferred, this.f361pt.f344tag == 18 ? clazztype2 : this.f361pt, Warner.noWarnings)) {
                                    if (this.types.isSameType(clazztype2, inferred)) {
                                        key = "diamond.redundant.args";
                                    } else {
                                        key = "diamond.redundant.args.1";
                                    }
                                    this.f360log.warning(tree.clazz.m489pos(), key, clazztype2, inferred);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        this.f360log.deferDiagnostics = prevDeferDiags;
                        this.f360log.deferredDiagnostics = prevDeferredDiags;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    prevDeferredDiags = prevDeferredDiags2;
                    prevDeferDiags = prevDeferDiags2;
                }
            }
            owntype2 = clazztype2;
        } else {
            i = 1;
            Type clazztype3 = attribDiamond(localEnv2, tree, clazztype2, mapping, argtypes3, typeargtypes2);
            clazz.type = clazztype3;
            owntype = owntype3;
            clazzid = clazzid3;
            i2 = 10;
            owntype2 = clazztype3;
        }
        if (owntype2.f344tag == i2) {
            if (this.allowEnums && (owntype2.tsym.flags_field & 16384) != 0 && (this.f359env.tree.getTag() != 5 || (((JCTree.JCVariableDecl) this.f359env.tree).mods.flags & 16384) == 0 || ((JCTree.JCVariableDecl) this.f359env.tree).init != tree)) {
                this.f360log.error(tree.m489pos(), "enum.cant.be.instantiated", new Object[0]);
            }
            if (cdef == null && (owntype2.tsym.flags() & 1536) != 0) {
                Log c0730Log = this.f360log;
                JCDiagnostic.DiagnosticPosition diagnosticPositionPos = tree.m489pos();
                Object[] objArr = new Object[i];
                objArr[0] = owntype2.tsym;
                c0730Log.error(diagnosticPositionPos, "abstract.cant.be.instantiated", objArr);
            } else {
                if (cdef != null && owntype2.tsym.isInterface()) {
                    if (!argtypes3.isEmpty()) {
                        this.f360log.error(tree.args.head.m489pos(), "anon.class.impl.intf.no.args", new Object[0]);
                    }
                    if (!typeargtypes2.isEmpty()) {
                        this.f360log.error(tree.typeargs.head.m489pos(), "anon.class.impl.intf.no.typeargs", new Object[0]);
                    }
                    List<Type> argtypes4 = List.m507nil();
                    typeargtypes = List.m507nil();
                    argtypes = argtypes4;
                } else {
                    Env<AttrContext> rsEnv = localEnv2.m465dup(tree);
                    rsEnv.info.selectSuper = cdef != null ? allowDiamondFinder : false;
                    rsEnv.info.varArgs = false;
                    tree.constructor = this.f362rs.resolveConstructor(tree.m489pos(), rsEnv, owntype2, argtypes3, typeargtypes2);
                    if (tree.constructor.type.isErroneous()) {
                        typeCheckMethod = this.syms.errType;
                    } else {
                        typeCheckMethod = checkMethod(owntype2, tree.constructor, rsEnv, tree.args, argtypes3, typeargtypes2, rsEnv.info.varArgs);
                    }
                    tree.constructorType = typeCheckMethod;
                    if (rsEnv.info.varArgs) {
                        Assert.check((tree.constructorType.isErroneous() || tree.varargsElement != null) ? allowDiamondFinder : false);
                    }
                }
                if (cdef != null) {
                    if (Resolve.isStatic(this.f359env)) {
                        cdef.mods.flags |= 8;
                    }
                    if (owntype2.tsym.isInterface()) {
                        cdef.implementing = List.m508of(clazz);
                    } else {
                        cdef.extending = clazz;
                    }
                    attribStat(cdef, localEnv2);
                    if (tree.encl == null && !owntype2.tsym.isInterface()) {
                        tree.args = tree.args.prepend(makeNullCheck(tree.encl));
                        List<Type> argtypes5 = argtypes.prepend(tree.encl.type);
                        tree.encl = null;
                        argtypes2 = argtypes5;
                    } else {
                        argtypes2 = argtypes;
                    }
                    owntype2 = cdef.f539sym.type;
                    if (tree.varargsElement != null) {
                        useVarargs = allowDiamondFinder;
                    } else {
                        useVarargs = false;
                    }
                    localEnv = localEnv2;
                    sym = this.f362rs.resolveConstructor(tree.m489pos(), localEnv2, owntype2, argtypes2, typeargtypes, allowDiamondFinder, useVarargs);
                    if (sym.kind >= 65 || tree.constructor.type.isErroneous()) {
                        z = allowDiamondFinder;
                    } else {
                        z = false;
                    }
                    Assert.check(z);
                    tree.constructor = sym;
                    if (tree.constructor.kind > 64) {
                        tree.constructorType = this.syms.errType;
                    } else {
                        tree.constructorType = checkMethod(owntype2, tree.constructor, localEnv, tree.args, argtypes2, typeargtypes, useVarargs);
                    }
                } else {
                    localEnv = localEnv2;
                }
                if (tree.constructor != null || tree.constructor.kind != 16) {
                    owntype2 = owntype;
                }
            }
            argtypes = argtypes3;
            typeargtypes = typeargtypes2;
            if (cdef != null) {
                if (Resolve.isStatic(this.f359env)) {
                    cdef.mods.flags |= 8;
                }
                if (owntype2.tsym.isInterface()) {
                    cdef.implementing = List.m508of(clazz);
                } else {
                    cdef.extending = clazz;
                }
                attribStat(cdef, localEnv2);
                if (tree.encl == null) {
                    argtypes2 = argtypes;
                } else {
                    argtypes2 = argtypes;
                }
                owntype2 = cdef.f539sym.type;
                if (tree.varargsElement != null) {
                    useVarargs = allowDiamondFinder;
                } else {
                    useVarargs = false;
                }
                localEnv = localEnv2;
                sym = this.f362rs.resolveConstructor(tree.m489pos(), localEnv2, owntype2, argtypes2, typeargtypes, allowDiamondFinder, useVarargs);
                if (sym.kind >= 65) {
                    z = allowDiamondFinder;
                } else {
                    z = allowDiamondFinder;
                }
                Assert.check(z);
                tree.constructor = sym;
                if (tree.constructor.kind > 64) {
                    tree.constructorType = this.syms.errType;
                } else {
                    tree.constructorType = checkMethod(owntype2, tree.constructor, localEnv, tree.args, argtypes2, typeargtypes, useVarargs);
                }
            } else {
                localEnv = localEnv2;
            }
            if (tree.constructor != null) {
                owntype2 = owntype;
            } else {
                owntype2 = owntype;
            }
        } else {
            localEnv = localEnv2;
            owntype2 = owntype;
        }
        this.result = check(tree, owntype2, 12, this.pkind, this.f361pt);
        this.f358chk.validate(tree.typeargs, localEnv);
    }

    Type attribDiamond(Env<AttrContext> env, JCTree.JCNewClass tree, Type clazztype, Pair<Scope, Scope> mapping, List<Type> argtypes, List<Type> typeargtypes) {
        Type clazztype2;
        if (clazztype.isErroneous() || clazztype.isInterface() || mapping == this.erroneousMapping) {
            return clazztype;
        }
        Env<AttrContext> localEnv = env.m465dup(tree);
        localEnv.info.tvars = clazztype.tsym.type.getTypeArguments();
        ((Symbol.ClassSymbol) clazztype.tsym).members_field = mapping.f578snd;
        try {
            Symbol constructor = this.f362rs.resolveDiamond(tree.m489pos(), localEnv, clazztype, argtypes, typeargtypes);
            ((Symbol.ClassSymbol) clazztype.tsym).members_field = mapping.f577fst;
            if (constructor.kind == 16) {
                Type.ClassType ct = new Type.ClassType(clazztype.getEnclosingType(), clazztype.tsym.type.getTypeArguments(), clazztype.tsym);
                clazztype2 = checkMethod(ct, constructor, localEnv, tree.args, argtypes, typeargtypes, localEnv.info.varArgs).mo574getReturnType();
            } else {
                clazztype2 = this.syms.errType;
            }
            if (clazztype2.f344tag == 16 && !this.f361pt.isErroneous()) {
                try {
                    clazztype2 = this.infer.instantiateExpr((Type.ForAll) clazztype2, this.f361pt.f344tag == 18 ? this.syms.objectType : this.f361pt, Warner.noWarnings);
                } catch (Infer.InferenceException ex) {
                    this.f360log.error(tree.clazz.m489pos(), "cant.apply.diamond.1", this.diags.fragment("diamond", clazztype2.tsym), ex.diagnostic);
                }
            }
            return this.f358chk.checkClassType(tree.clazz.m489pos(), clazztype2, allowDiamondFinder);
        } catch (Throwable th) {
            ((Symbol.ClassSymbol) clazztype.tsym).members_field = mapping.f577fst;
            throw th;
        }
    }

    private Pair<Scope, Scope> getSyntheticScopeMapping(Type ctype) {
        if (ctype.f344tag != 10) {
            return this.erroneousMapping;
        }
        Pair<Scope, Scope> mapping = new Pair<>(ctype.tsym.members(), new Scope(ctype.tsym));
        for (Scope.Entry e = mapping.f577fst.lookup(this.names.init); e.scope != null; e = e.next()) {
            Type synthRestype = new Type.ClassType(ctype.getEnclosingType(), ctype.tsym.type.getTypeArguments(), ctype.tsym);
            Symbol.MethodSymbol synhConstr = new Symbol.MethodSymbol(e.f338sym.flags(), this.names.init, this.types.createMethodTypeWithReturn(e.f338sym.type, synthRestype), e.f338sym.owner);
            mapping.f578snd.enter(synhConstr);
        }
        return mapping;
    }

    public JCTree.JCExpression makeNullCheck(JCTree.JCExpression arg) {
        Name name = TreeInfo.name(arg);
        if (name == this.names._this || name == this.names._super) {
            return arg;
        }
        JCTree.JCUnary tree = this.make.m495at(arg.f531pos).Unary(56, arg);
        tree.operator = this.syms.nullcheck;
        tree.type = arg.type;
        return tree;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitNewArray(JCTree.JCNewArray tree) {
        Type elemtype;
        Type owntype = this.types.createErrorType(tree.type);
        if (tree.elemtype != null) {
            elemtype = attribType(tree.elemtype, this.f359env);
            this.f358chk.validate(tree.elemtype, this.f359env);
            owntype = elemtype;
            for (List list = tree.dims; list.nonEmpty(); list = list.tail) {
                attribExpr((JCTree) list.head, this.f359env, this.syms.intType);
                owntype = new Type.ArrayType(owntype, this.syms.arrayClass);
            }
        } else {
            Type elemtype2 = this.f361pt;
            if (elemtype2.f344tag == 11) {
                elemtype = this.types.elemtype(this.f361pt);
            } else {
                Type elemtype3 = this.f361pt;
                if (elemtype3.f344tag != 19) {
                    this.f360log.error(tree.m489pos(), "illegal.initializer.for.type", this.f361pt);
                }
                elemtype = this.types.createErrorType(this.f361pt);
            }
        }
        if (tree.elems != null) {
            attribExprs(tree.elems, this.f359env, elemtype);
            owntype = new Type.ArrayType(elemtype, this.syms.arrayClass);
        }
        if (!this.types.isReifiable(elemtype)) {
            this.f360log.error(tree.m489pos(), "generic.array.creation", new Object[0]);
        }
        this.result = check(tree, owntype, 12, this.pkind, this.f361pt);
    }

    @Override
    public void visitParens(JCTree.JCParens tree) {
        Type owntype = attribTree(tree.expr, this.f359env, this.pkind, this.f361pt);
        int i = this.pkind;
        this.result = check(tree, owntype, i, i, this.f361pt);
        Symbol sym = TreeInfo.symbol(tree);
        if (sym != null && (sym.kind & 3) != 0) {
            this.f360log.error(tree.m489pos(), "illegal.start.of.type", new Object[0]);
        }
    }

    @Override
    public void visitAssign(JCTree.JCAssign tree) {
        Type owntype = attribTree(tree.f532lhs, this.f359env.m465dup(tree), 4, Type.noType);
        Type capturedType = capture(owntype);
        attribExpr(tree.f533rhs, this.f359env, owntype);
        this.result = check(tree, capturedType, 12, this.pkind, this.f361pt);
    }

    @Override
    public void visitAssignop(JCTree.JCAssignOp tree) {
        Type owntype = attribTree(tree.f534lhs, this.f359env, 4, Type.noType);
        Type operand = attribExpr(tree.f535rhs, this.f359env);
        Symbol operator = this.f362rs.resolveBinaryOperator(tree.m489pos(), tree.getTag() - 17, this.f359env, owntype, operand);
        tree.operator = operator;
        if (operator.kind == 16 && !owntype.isErroneous() && !operand.isErroneous()) {
            this.f358chk.checkOperator(tree.m489pos(), (Symbol.OperatorSymbol) operator, tree.getTag() - 17, owntype, operand);
            this.f358chk.checkDivZero(tree.f535rhs.m489pos(), operator, operand);
            this.f358chk.checkCastable(tree.f535rhs.m489pos(), operator.type.mo574getReturnType(), owntype);
        }
        this.result = check(tree, owntype, 12, this.pkind, this.f361pt);
    }

    @Override
    public void visitUnary(JCTree.JCUnary tree) {
        Type argtype;
        Type typeMo574getReturnType;
        Type ctype;
        if (52 <= tree.getTag() && tree.getTag() <= 55) {
            argtype = attribTree(tree.f546arg, this.f359env, 4, Type.noType);
        } else {
            argtype = this.f358chk.checkNonVoid(tree.f546arg.m489pos(), attribExpr(tree.f546arg, this.f359env));
        }
        Symbol operator = this.f362rs.resolveUnaryOperator(tree.m489pos(), tree.getTag(), this.f359env, argtype);
        tree.operator = operator;
        Type owntype = this.types.createErrorType(tree.type);
        if (operator.kind == 16 && !argtype.isErroneous()) {
            if (52 <= tree.getTag() && tree.getTag() <= 55) {
                typeMo574getReturnType = tree.f546arg.type;
            } else {
                typeMo574getReturnType = operator.type.mo574getReturnType();
            }
            owntype = typeMo574getReturnType;
            int opc = ((Symbol.OperatorSymbol) operator).opcode;
            if (argtype.constValue() != null && (ctype = this.cfolder.fold1(opc, argtype)) != null) {
                owntype = this.cfolder.coerce(ctype, owntype);
                if (tree.f546arg.type.tsym == this.syms.stringType.tsym) {
                    tree.f546arg.type = this.syms.stringType;
                }
            }
        }
        this.result = check(tree, owntype, 12, this.pkind, this.f361pt);
    }

    @Override
    public void visitBinary(JCTree.JCBinary tree) {
        Type owntype;
        Type ctype;
        Type left = this.f358chk.checkNonVoid(tree.f536lhs.m489pos(), attribExpr(tree.f536lhs, this.f359env));
        Type right = this.f358chk.checkNonVoid(tree.f536lhs.m489pos(), attribExpr(tree.f537rhs, this.f359env));
        Symbol operator = this.f362rs.resolveBinaryOperator(tree.m489pos(), tree.getTag(), this.f359env, left, right);
        tree.operator = operator;
        Type owntype2 = this.types.createErrorType(tree.type);
        if (operator.kind == 16 && !left.isErroneous() && !right.isErroneous()) {
            Type owntype3 = operator.type.mo574getReturnType();
            int opc = this.f358chk.checkOperator(tree.f536lhs.m489pos(), (Symbol.OperatorSymbol) operator, tree.getTag(), left, right);
            if (left.constValue() != null && right.constValue() != null && (ctype = this.cfolder.fold2(opc, left, right)) != null) {
                owntype = this.cfolder.coerce(ctype, owntype3);
                if (tree.f536lhs.type.tsym == this.syms.stringType.tsym) {
                    tree.f536lhs.type = this.syms.stringType;
                }
                if (tree.f537rhs.type.tsym == this.syms.stringType.tsym) {
                    tree.f537rhs.type = this.syms.stringType;
                }
            } else {
                owntype = owntype3;
            }
            if ((opc == 165 || opc == 166) && !this.types.isCastable(left, right, new Warner(tree.m489pos()))) {
                this.f360log.error(tree.m489pos(), "incomparable.types", left, right);
            }
            this.f358chk.checkDivZero(tree.f537rhs.m489pos(), operator, right);
            owntype2 = owntype;
        }
        this.result = check(tree, owntype2, 12, this.pkind, this.f361pt);
    }

    @Override
    public void visitTypeCast(JCTree.JCTypeCast tree) {
        Type clazztype = attribType(tree.clazz, this.f359env);
        this.f358chk.validate(tree.clazz, this.f359env, false);
        Env<AttrContext> localEnv = this.f359env.m465dup(tree);
        Type exprtype = attribExpr(tree.expr, localEnv, Infer.anyPoly);
        Type owntype = this.f358chk.checkCastable(tree.expr.m489pos(), exprtype, clazztype);
        if (exprtype.constValue() != null) {
            owntype = this.cfolder.coerce(exprtype, owntype);
        }
        this.result = check(tree, capture(owntype), 12, this.pkind, this.f361pt);
    }

    @Override
    public void visitTypeTest(JCTree.JCInstanceOf tree) {
        Type exprtype = this.f358chk.checkNullOrRefType(tree.expr.m489pos(), attribExpr(tree.expr, this.f359env));
        Type clazztype = this.f358chk.checkReifiableReferenceType(tree.clazz.m489pos(), attribType(tree.clazz, this.f359env));
        this.f358chk.validate(tree.clazz, this.f359env, false);
        this.f358chk.checkCastable(tree.expr.m489pos(), exprtype, clazztype);
        this.result = check(tree, this.syms.booleanType, 12, this.pkind, this.f361pt);
    }

    @Override
    public void visitIndexed(JCTree.JCArrayAccess tree) {
        Type owntype = this.types.createErrorType(tree.type);
        Type atype = attribExpr(tree.indexed, this.f359env);
        attribExpr(tree.index, this.f359env, this.syms.intType);
        if (this.types.isArray(atype)) {
            owntype = this.types.elemtype(atype);
        } else if (atype.f344tag != 19) {
            this.f360log.error(tree.m489pos(), "array.req.but.found", atype);
        }
        if ((this.pkind & 4) == 0) {
            owntype = capture(owntype);
        }
        this.result = check(tree, owntype, 4, this.pkind, this.f361pt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitIdent(JCTree.JCIdent tree) {
        boolean varArgs;
        Symbol sym;
        if (this.f361pt.f344tag == 12 || this.f361pt.f344tag == 16) {
            this.f359env.info.varArgs = false;
            Symbol sym2 = this.f362rs.resolveMethod(tree.m489pos(), this.f359env, tree.name, this.f361pt.mo573getParameterTypes(), this.f361pt.getTypeArguments());
            boolean varArgs2 = this.f359env.info.varArgs;
            varArgs = varArgs2;
            sym = sym2;
        } else if (tree.f543sym == null || tree.f543sym.kind == 4) {
            varArgs = false;
            sym = this.f362rs.resolveIdent(tree.m489pos(), this.f359env, tree.name, this.pkind);
        } else {
            varArgs = false;
            sym = tree.f543sym;
        }
        tree.f543sym = sym;
        Env c0621Env = this.f359env;
        boolean noOuterThisPath = false;
        if (this.f359env.enclClass.f539sym.owner.kind != 1 && (sym.kind & 22) != 0 && sym.owner.kind == 2 && tree.name != this.names._this && tree.name != this.names._super) {
            while (c0621Env.outer != null && !sym.isMemberOf(c0621Env.enclClass.f539sym, this.types)) {
                if ((c0621Env.enclClass.f539sym.flags() & 4194304) != 0) {
                    noOuterThisPath = this.allowAnonOuterThis ^ allowDiamondFinder;
                }
                c0621Env = c0621Env.outer;
            }
        }
        Env c0621Env2 = c0621Env;
        boolean noOuterThisPath2 = noOuterThisPath;
        if (sym.kind == 4) {
            Symbol.VarSymbol v = (Symbol.VarSymbol) sym;
            checkInit(tree, this.f359env, v, false);
            if (v.owner.kind == 16 && v.owner != this.f359env.info.scope.owner && (v.flags_field & 16) == 0) {
                this.f360log.error(tree.m489pos(), "local.var.accessed.from.icls.needs.final", v);
            }
            if (this.pkind == 4) {
                checkAssignable(tree.m489pos(), v, null, this.f359env);
            }
        }
        if ((((AttrContext) c0621Env2.info).isSelfCall || noOuterThisPath2) && (sym.kind & 20) != 0 && sym.owner.kind == 2 && (sym.flags() & 8) == 0) {
            this.f358chk.earlyRefError(tree.m489pos(), sym.kind == 4 ? sym : thisSym(tree.m489pos(), this.f359env));
        }
        Env c0621Env3 = this.f359env;
        if (sym.kind != 31 && sym.kind != 2 && sym.owner != null && sym.owner != c0621Env3.enclClass.f539sym) {
            while (c0621Env3.outer != null && !this.f362rs.isAccessible(this.f359env, c0621Env3.enclClass.f539sym.type, sym)) {
                c0621Env3 = c0621Env3.outer;
            }
        }
        this.result = checkId(tree, c0621Env3.enclClass.f539sym.type, sym, this.f359env, this.pkind, this.f361pt, varArgs);
    }

    @Override
    public void visitSelect(JCTree.JCFieldAccess tree) {
        int skind;
        Type site;
        Type site2;
        Symbol sym;
        Type site3;
        int i;
        Type site1;
        if (tree.name == this.names._this || tree.name == this.names._super || tree.name == this.names._class) {
            skind = 2;
        } else {
            int skind2 = (this.pkind & 1) != 0 ? 0 | 1 : 0;
            if ((this.pkind & 2) != 0) {
                skind2 = skind2 | 2 | 1;
            }
            if ((this.pkind & 28) != 0) {
                skind2 = skind2 | 12 | 2;
            }
            skind = skind2;
        }
        Type site4 = attribTree(tree.selected, this.f359env, skind, Infer.anyPoly);
        if ((this.pkind & 3) == 0) {
            site4 = capture(site4);
        }
        if (skind == 2) {
            Type elt = site4;
            while (elt.f344tag == 11) {
                elt = ((Type.ArrayType) elt).elemtype;
            }
            if (elt.f344tag == 14) {
                this.f360log.error(tree.m489pos(), "type.var.cant.be.deref", new Object[0]);
                this.result = this.types.createErrorType(tree.type);
                return;
            }
        }
        Symbol sitesym = TreeInfo.symbol(tree.selected);
        boolean selectSuperPrev = this.f359env.info.selectSuper;
        this.f359env.info.selectSuper = (sitesym == null || sitesym.name != this.names._super) ? false : allowDiamondFinder;
        if (tree.selected.type.f344tag != 16) {
            site = site4;
        } else {
            Type.ForAll pstype = (Type.ForAll) tree.selected.type;
            this.f359env.info.tvars = pstype.tvars;
            JCTree.JCExpression jCExpression = tree.selected;
            Type site5 = pstype.qtype;
            jCExpression.type = site5;
            site = site5;
        }
        this.f359env.info.varArgs = false;
        Type site6 = site;
        Symbol sym2 = selectSym(tree, sitesym, site, this.f359env, this.f361pt, this.pkind);
        if (sym2.exists() && !isType(sym2) && (this.pkind & 3) != 0) {
            Type site7 = capture(site6);
            site2 = site7;
            sym = selectSym(tree, sitesym, site7, this.f359env, this.f361pt, this.pkind);
        } else {
            site2 = site6;
            sym = sym2;
        }
        boolean varArgs = this.f359env.info.varArgs;
        tree.f542sym = sym;
        if (site2.f344tag == 14 && !isType(sym) && sym.kind != 31) {
            while (site2.f344tag == 14) {
                site2 = site2.mo576getUpperBound();
            }
            site3 = capture(site2);
        } else {
            site3 = site2;
        }
        if (sym.kind == 4) {
            Symbol.VarSymbol v = (Symbol.VarSymbol) sym;
            checkInit(tree, this.f359env, v, allowDiamondFinder);
            if (this.pkind == 4) {
                checkAssignable(tree.m489pos(), v, tree.selected, this.f359env);
            }
        }
        if (sitesym != null && sitesym.kind == 4 && ((Symbol.VarSymbol) sitesym).isResourceVariable() && sym.kind == 16 && sym.name.equals(this.names.close) && sym.overrides(this.syms.autoCloseableClose, sitesym.type.tsym, this.types, allowDiamondFinder) && this.f359env.info.lint.isEnabled(Lint.LintCategory.TRY)) {
            this.f360log.warning(Lint.LintCategory.TRY, tree, "try.explicit.close.call", new Object[0]);
        }
        if (!isType(sym)) {
            i = 4;
        } else if (sitesym == null || (sitesym.kind & 3) == 0) {
            i = 4;
            tree.type = check(tree.selected, this.f361pt, sitesym == null ? 12 : sitesym.kind, 3, this.f361pt);
        } else {
            i = 4;
        }
        if (isType(sitesym)) {
            if (sym.name != this.names._this) {
                if ((sym.flags() & 8) == 0 && sym.name != this.names._super && (sym.kind == i || sym.kind == 16)) {
                    Resolve resolve = this.f362rs;
                    Resolve resolve2 = this.f362rs;
                    Objects.requireNonNull(resolve2);
                    resolve.access(resolve2.new StaticError(sym), tree.m489pos(), site3, sym.name, allowDiamondFinder);
                }
            } else if (this.f359env.info.isSelfCall && site3.tsym == this.f359env.enclClass.f539sym) {
                this.f358chk.earlyRefError(tree.m489pos(), sym);
            }
        } else if (sym.kind != 31 && (sym.flags() & 8) != 0 && sym.name != this.names._class) {
            this.f358chk.warnStatic(tree, "static.not.qualified.by.type", Kinds.kindName(sym.kind), sym.owner);
        }
        if (this.f359env.info.selectSuper && (sym.flags() & 8) == 0) {
            this.f362rs.checkNonAbstract(tree.m489pos(), sym);
            if (site3.isRaw() && (site1 = this.types.asSuper(this.f359env.enclClass.f539sym.type, site3.tsym)) != null) {
                site3 = site1;
            }
        }
        this.f359env.info.selectSuper = selectSuperPrev;
        this.result = checkId(tree, site3, sym, this.f359env, this.pkind, this.f361pt, varArgs);
        this.f359env.info.tvars = List.m507nil();
    }

    private Symbol selectSym(JCTree.JCFieldAccess tree, Type site, Env<AttrContext> env, Type pt, int pkind) {
        return selectSym(tree, site.tsym, site, env, pt, pkind);
    }

    private Symbol selectSym(JCTree.JCFieldAccess tree, Symbol location, Type site, Env<AttrContext> env, Type pt, int pkind) {
        List<Type> typeargs;
        Symbol symbolSelectSym;
        Symbol sym2;
        JCDiagnostic.DiagnosticPosition pos = tree.m489pos();
        Name name = tree.name;
        int i = site.f344tag;
        if (i == 10 || i == 11) {
            if (pt.f344tag == 12 || pt.f344tag == 16) {
                return this.f362rs.resolveQualifiedMethod(pos, env, location, site, name, pt.mo573getParameterTypes(), pt.getTypeArguments());
            }
            if (name == this.names._this || name == this.names._super) {
                return this.f362rs.resolveSelf(pos, env, site.tsym, name);
            }
            if (name == this.names._class) {
                Type t = this.syms.classType;
                if (this.allowGenerics) {
                    typeargs = List.m508of(this.types.erasure(site));
                } else {
                    typeargs = List.m507nil();
                }
                return new Symbol.VarSymbol(25L, this.names._class, new Type.ClassType(t.getEnclosingType(), typeargs, t.tsym), site.tsym);
            }
            Symbol sym = this.f362rs.findIdentInType(env, site, name, pkind);
            if ((pkind & 64) == 0) {
                return this.f362rs.access(sym, pos, location, site, name, allowDiamondFinder);
            }
            return sym;
        }
        if (i != 19) {
            switch (i) {
                case 13:
                    Resolve resolve = this.f362rs;
                    return resolve.access(resolve.findIdentInPackage(env, site.tsym, name, pkind), pos, location, site, name, allowDiamondFinder);
                case 14:
                    if (site.mo576getUpperBound() != null) {
                        symbolSelectSym = selectSym(tree, location, capture(site.mo576getUpperBound()), env, pt, pkind);
                    } else {
                        symbolSelectSym = null;
                    }
                    Symbol sym3 = symbolSelectSym;
                    if (sym3 == null) {
                        this.f360log.error(pos, "type.var.cant.be.deref", new Object[0]);
                        return this.syms.errSymbol;
                    }
                    if ((sym3.flags() & 2) != 0) {
                        Resolve resolve2 = this.f362rs;
                        Objects.requireNonNull(resolve2);
                        sym2 = resolve2.new AccessError(env, site, sym3);
                    } else {
                        sym2 = sym3;
                    }
                    this.f362rs.access(sym2, pos, location, site, name, allowDiamondFinder);
                    return sym3;
                case 15:
                    throw new AssertionError(tree);
                default:
                    if (name == this.names._class) {
                        Type t2 = this.syms.classType;
                        Type arg = this.types.boxedClass(site).type;
                        return new Symbol.VarSymbol(25L, this.names._class, new Type.ClassType(t2.getEnclosingType(), List.m508of(arg), t2.tsym), site.tsym);
                    }
                    this.f360log.error(pos, "cant.deref", site);
                    return this.syms.errSymbol;
            }
        }
        return this.types.createErrorType(name, site.tsym, site).tsym;
    }

    /* JADX WARN: Multi-variable type inference failed */
    Type checkId(JCTree tree, Type site, Symbol sym, Env<AttrContext> env, int pkind, Type pt, boolean useVarargs) {
        Type owntype;
        Type owntype2;
        Type owntype3;
        Type s;
        if (pt.isErroneous()) {
            return this.types.createErrorType(site);
        }
        int i = sym.kind;
        if (i == 1) {
            Type owntype4 = sym.type;
            owntype = owntype4;
        } else if (i == 2) {
            Type owntype5 = sym.type;
            if (owntype5.f344tag != 10) {
                owntype = owntype5;
            } else {
                Type ownOuter = owntype5.getEnclosingType();
                if (owntype5.tsym.type.getTypeArguments().nonEmpty()) {
                    owntype5 = this.types.erasure(owntype5);
                } else if (ownOuter.f344tag == 10 && site != ownOuter) {
                    Type normOuter = site;
                    if (normOuter.f344tag == 10) {
                        normOuter = this.types.asEnclosingSuper(site, ownOuter.tsym);
                    }
                    if (normOuter == null) {
                        normOuter = this.types.erasure(ownOuter);
                    }
                    if (normOuter != ownOuter) {
                        owntype5 = new Type.ClassType(normOuter, List.m507nil(), owntype5.tsym);
                    }
                }
                owntype = owntype5;
            }
        } else if (i == 4) {
            Symbol.VarSymbol v = (Symbol.VarSymbol) sym;
            if (this.allowGenerics && pkind == 4 && v.owner.kind == 2 && (v.flags() & 8) == 0 && ((site.f344tag == 10 || site.f344tag == 14) && (s = this.types.asOuterSuper(site, v.owner)) != null && s.isRaw() && !this.types.isSameType(v.type, v.erasure(this.types)))) {
                this.f358chk.warnUnchecked(tree.m489pos(), "unchecked.assign.to.var", v, s);
            }
            if (sym.owner.kind == 2 && sym.name != this.names._this && sym.name != this.names._super) {
                owntype2 = this.types.memberType(site, sym);
            } else {
                owntype2 = sym.type;
            }
            if (env.info.tvars.nonEmpty()) {
                Type owntype1 = new Type.ForAll(env.info.tvars, owntype2);
                for (List list = env.info.tvars; list.nonEmpty(); list = list.tail) {
                    if (!owntype2.contains((Type) list.head)) {
                        this.f360log.error(tree.m489pos(), "undetermined.type", owntype1);
                        owntype1 = this.types.createErrorType(owntype1);
                    }
                }
                owntype2 = owntype1;
            }
            if (v.getConstValue() != null && isStaticReference(tree)) {
                owntype3 = owntype2.constType(v.getConstValue());
            } else {
                owntype3 = owntype2;
            }
            if (pkind != 12) {
                owntype = owntype3;
            } else {
                owntype = capture(owntype3);
            }
        } else if (i == 16) {
            JCTree.JCMethodInvocation app = (JCTree.JCMethodInvocation) env.tree;
            Type owntype6 = checkMethod(site, sym, env, app.args, pt.mo573getParameterTypes(), pt.getTypeArguments(), env.info.varArgs);
            owntype = owntype6;
        } else {
            if (i != 31) {
                throw new AssertionError("unexpected kind: " + sym.kind + " in tree " + tree);
            }
            Type owntype7 = sym.type;
            owntype = owntype7;
        }
        if (sym.name != this.names.init) {
            this.f358chk.checkDeprecated(tree.m489pos(), env.info.scope.owner, sym);
            this.f358chk.checkSunAPI(tree.m489pos(), sym);
        }
        return check(tree, owntype, sym.kind, pkind, pt);
    }

    private void checkInit(JCTree tree, Env<AttrContext> env, Symbol.VarSymbol v, boolean onlyWarning) {
        if ((env.info.enclVar == v || v.f342pos > tree.f531pos) && v.owner.kind == 2 && canOwnInitializer(env.info.scope.owner) && v.owner == env.info.scope.owner.enclClass()) {
            if (((v.flags() & 8) != 0 ? allowDiamondFinder : false) == Resolve.isStatic(env) && (env.tree.getTag() != 30 || TreeInfo.skipParens(((JCTree.JCAssign) env.tree).f532lhs) != tree)) {
                String suffix = env.info.enclVar == v ? "self.ref" : "forward.ref";
                if (!onlyWarning || isStaticEnumField(v)) {
                    this.f360log.error(tree.m489pos(), "illegal." + suffix, new Object[0]);
                } else if (this.useBeforeDeclarationWarning) {
                    this.f360log.warning(tree.m489pos(), suffix, v);
                }
            }
        }
        v.getConstValue();
        checkEnumInitializer(tree, env, v);
    }

    private void checkEnumInitializer(JCTree tree, Env<AttrContext> env, Symbol.VarSymbol v) {
        Symbol.ClassSymbol enclClass;
        if (!isStaticEnumField(v) || (enclClass = env.info.scope.owner.enclClass()) == null || enclClass.owner == null) {
            return;
        }
        if ((v.owner != enclClass && !this.types.isSubtype(enclClass.type, v.owner.type)) || !Resolve.isInitializer(env)) {
            return;
        }
        this.f360log.error(tree.m489pos(), "illegal.enum.static.ref", new Object[0]);
    }

    private boolean isStaticEnumField(Symbol.VarSymbol v) {
        if (!Flags.isEnum(v.owner) || !Flags.isStatic(v) || Flags.isConstant(v) || v.name == this.names._class) {
            return false;
        }
        return allowDiamondFinder;
    }

    private boolean canOwnInitializer(Symbol sym) {
        if ((sym.kind & 6) != 0 || (sym.kind == 16 && (sym.flags() & 1048576) != 0)) {
            return allowDiamondFinder;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Type checkMethod(Type site, Symbol sym, Env<AttrContext> env, List<JCTree.JCExpression> argtrees, List<Type> argtypes, List<Type> typeargtypes, boolean useVarargs) {
        Type s;
        if (this.allowGenerics && (sym.flags() & 8) == 0 && ((site.f344tag == 10 || site.f344tag == 14) && (s = this.types.asOuterSuper(site, sym.owner)) != null && s.isRaw() && !this.types.isSameTypes(sym.type.mo573getParameterTypes(), sym.erasure(this.types).mo573getParameterTypes()))) {
            this.f358chk.warnUnchecked(env.tree.m489pos(), "unchecked.call.mbr.of.raw.type", sym, s);
        }
        this.noteWarner.clear();
        Type owntype = this.f362rs.instantiate(env, site, sym, argtypes, typeargtypes, allowDiamondFinder, useVarargs, this.noteWarner);
        boolean warned = this.noteWarner.hasNonSilentLint(Lint.LintCategory.UNCHECKED);
        if (owntype == null) {
            if (!this.f361pt.isErroneous()) {
                this.f360log.error(env.tree.m489pos(), "internal.error.cant.instantiate", sym, site, Type.toString(this.f361pt.mo573getParameterTypes()));
            }
            return this.types.createErrorType(site);
        }
        List listMo573getParameterTypes = owntype.mo573getParameterTypes();
        Type last = useVarargs ? (Type) listMo573getParameterTypes.last() : null;
        if (sym.name == this.names.init && sym.owner == this.syms.enumSym) {
            listMo573getParameterTypes = listMo573getParameterTypes.tail.tail;
        }
        List list = argtrees;
        while (listMo573getParameterTypes.head != last) {
            JCTree arg = (JCTree) list.head;
            Warner warn = this.f358chk.convertWarner(arg.m489pos(), arg.type, (Type) listMo573getParameterTypes.head);
            assertConvertible(arg, arg.type, (Type) listMo573getParameterTypes.head, warn);
            warned |= warn.hasNonSilentLint(Lint.LintCategory.UNCHECKED);
            list = list.tail;
            listMo573getParameterTypes = listMo573getParameterTypes.tail;
        }
        if (!useVarargs) {
            if ((sym.flags() & Flags.VARARGS) != 0 && this.allowVarargs) {
                Type varParam = owntype.mo573getParameterTypes().last();
                Type lastArg = argtypes.last();
                Types types = this.types;
                if (types.isSubtypeUnchecked(lastArg, types.elemtype(varParam))) {
                    Types types2 = this.types;
                    if (!types2.isSameType(types2.erasure(varParam), this.types.erasure(lastArg))) {
                        this.f360log.warning(argtrees.last().m489pos(), "inexact.non-varargs.call", this.types.elemtype(varParam), varParam);
                    }
                }
            }
        } else {
            Type varArg = this.types.elemtype(last);
            while (list.tail != null) {
                JCTree arg2 = (JCTree) list.head;
                Warner warn2 = this.f358chk.convertWarner(arg2.m489pos(), arg2.type, varArg);
                assertConvertible(arg2, arg2.type, varArg, warn2);
                warned |= warn2.hasNonSilentLint(Lint.LintCategory.UNCHECKED);
                list = list.tail;
            }
        }
        if (warned && sym.type.f344tag == 16) {
            this.f358chk.warnUnchecked(env.tree.m489pos(), "unchecked.meth.invocation.applied", Kinds.kindName(sym), sym.name, this.f362rs.methodArguments(sym.type.mo573getParameterTypes()), this.f362rs.methodArguments(argtypes), Kinds.kindName(sym.location()), sym.location());
            owntype = new Type.MethodType(owntype.mo573getParameterTypes(), this.types.erasure(owntype.mo574getReturnType()), this.types.erasure(owntype.mo575getThrownTypes()), this.syms.methodClass);
        }
        if (useVarargs) {
            JCTree tree = env.tree;
            Type argtype = owntype.mo573getParameterTypes().last();
            if (owntype.mo574getReturnType().f344tag != 16 || warned) {
                this.f358chk.checkVararg(env.tree.m489pos(), owntype.mo573getParameterTypes(), sym);
            }
            Type elemtype = this.types.elemtype(argtype);
            int tag = tree.getTag();
            if (tag == 26) {
                ((JCTree.JCMethodInvocation) tree).varargsElement = elemtype;
                return owntype;
            }
            if (tag == 27) {
                ((JCTree.JCNewClass) tree).varargsElement = elemtype;
                return owntype;
            }
            throw new AssertionError("" + tree);
        }
        return owntype;
    }

    private void assertConvertible(JCTree tree, Type actual, Type formal, Warner warn) {
        if (!this.types.isConvertible(actual, formal, warn) && formal.isCompound()) {
            Types types = this.types;
            if (types.isSubtype(actual, types.supertype(formal))) {
                Types types2 = this.types;
                if (types2.isSubtypeUnchecked(actual, types2.interfaces(formal), warn)) {
                }
            }
        }
    }

    @Override
    public void visitLiteral(JCTree.JCLiteral tree) {
        this.result = check(tree, litType(tree.typetag).constType(tree.value), 12, this.pkind, this.f361pt);
    }

    Type litType(int tag) {
        return tag == 10 ? this.syms.stringType : this.syms.typeOfTag[tag];
    }

    @Override
    public void visitTypeIdent(JCTree.JCPrimitiveTypeTree tree) {
        this.result = check(tree, this.syms.typeOfTag[tree.typetag], 2, this.pkind, this.f361pt);
    }

    @Override
    public void visitTypeArray(JCTree.JCArrayTypeTree tree) {
        Type etype = attribType(tree.elemtype, this.f359env);
        Type type = new Type.ArrayType(etype, this.syms.arrayClass);
        this.result = check(tree, type, 2, this.pkind, this.f361pt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [A, com.sun.tools.javac.code.Type] */
    @Override
    public void visitTypeApply(JCTree.JCTypeApply tree) {
        Type site;
        Type owntype = this.types.createErrorType(tree.type);
        Type clazztype = this.f358chk.checkClassType(tree.clazz.m489pos(), attribType(tree.clazz, this.f359env));
        List<Type> actuals = attribTypes(tree.arguments, this.f359env);
        if (clazztype.f344tag == 10) {
            List<Type> formals = clazztype.tsym.type.getTypeArguments();
            if (actuals.isEmpty()) {
                actuals = formals;
            }
            if (actuals.length() == formals.length()) {
                List list = actuals;
                List list2 = formals;
                while (list.nonEmpty()) {
                    list.head = ((Type) list.head).withTypeVar((Type) list2.head);
                    list = list.tail;
                    list2 = list2.tail;
                }
                Type clazzOuter = clazztype.getEnclosingType();
                if (clazzOuter.f344tag == 10) {
                    JCTree.JCExpression clazz = TreeInfo.typeIn(tree.clazz);
                    if (clazz.getTag() == 35) {
                        site = this.f359env.enclClass.f539sym.type;
                    } else if (clazz.getTag() == 34) {
                        site = ((JCTree.JCFieldAccess) clazz).selected.type;
                    } else {
                        throw new AssertionError("" + tree);
                    }
                    if (clazzOuter.f344tag == 10 && site != clazzOuter) {
                        if (site.f344tag == 10) {
                            site = this.types.asOuterSuper(site, clazzOuter.tsym);
                        }
                        if (site == null) {
                            site = this.types.erasure(clazzOuter);
                        }
                        clazzOuter = site;
                    }
                }
                owntype = new Type.ClassType(clazzOuter, actuals, clazztype.tsym);
            } else {
                if (formals.length() != 0) {
                    this.f360log.error(tree.m489pos(), "wrong.number.type.args", Integer.toString(formals.length()));
                } else {
                    this.f360log.error(tree.m489pos(), "type.doesnt.take.params", clazztype.tsym);
                }
                owntype = this.types.createErrorType(tree.type);
            }
        }
        this.result = check(tree, owntype, 2, this.pkind, this.f361pt);
    }

    @Override
    public void visitTypeUnion(JCTree.JCTypeUnion tree) {
        ListBuffer<Type> multicatchTypes = ListBuffer.m512lb();
        Iterator<JCTree.JCExpression> it = tree.alternatives.iterator();
        ListBuffer<Type> all_multicatchTypes = null;
        while (it.hasNext()) {
            JCTree.JCExpression typeTree = it.next();
            Type ctype = this.f358chk.checkType(typeTree.m489pos(), this.f358chk.checkClassType(typeTree.m489pos(), attribType(typeTree, this.f359env)), this.syms.throwableType);
            if (!ctype.isErroneous()) {
                if (this.f358chk.intersects(ctype, multicatchTypes.toList())) {
                    for (Type t : multicatchTypes) {
                        boolean sub = this.types.isSubtype(ctype, t);
                        boolean sup = this.types.isSubtype(t, ctype);
                        if (sub || sup) {
                            Type a = sub ? ctype : t;
                            Type b = sub ? t : ctype;
                            this.f360log.error(typeTree.m489pos(), "multicatch.types.must.be.disjoint", a, b);
                        }
                        typeTree = typeTree;
                    }
                }
                multicatchTypes.append(ctype);
                if (all_multicatchTypes != null) {
                    all_multicatchTypes.append(ctype);
                }
            } else {
                if (all_multicatchTypes == null) {
                    all_multicatchTypes = ListBuffer.m512lb();
                    all_multicatchTypes.appendList(multicatchTypes);
                }
                all_multicatchTypes.append(ctype);
            }
        }
        Type t2 = check(tree, this.types.m457lub(multicatchTypes.toList()), 2, this.pkind, this.f361pt);
        if (t2.f344tag == 10) {
            List<Type> alternatives = (all_multicatchTypes == null ? multicatchTypes : all_multicatchTypes).toList();
            t2 = new Type.UnionClassType((Type.ClassType) t2, alternatives);
        }
        this.result = t2;
        tree.type = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitTypeParameter(JCTree.JCTypeParameter tree) {
        JCTree.JCExpression extending;
        List<JCTree.JCExpression> implementing;
        Type.TypeVar a = (Type.TypeVar) tree.type;
        Set<Type> boundSet = new HashSet<>();
        if (a.bound.isErroneous()) {
            return;
        }
        List bounds = this.types.getBounds(a);
        if (tree.bounds.nonEmpty()) {
            Type b = checkBase((Type) bounds.head, tree.bounds.head, this.f359env, false, false, false);
            boundSet.add(this.types.erasure(b));
            if (b.isErroneous()) {
                a.bound = b;
            } else if (b.f344tag == 14) {
                if (tree.bounds.tail.nonEmpty()) {
                    this.f360log.error(tree.bounds.tail.head.m489pos(), "type.var.may.not.be.followed.by.other.bounds", new Object[0]);
                    tree.bounds = List.m508of(tree.bounds.head);
                    a.bound = (Type) bounds.head;
                }
            } else {
                for (JCTree.JCExpression bound : tree.bounds.tail) {
                    bounds = bounds.tail;
                    Type i = checkBase((Type) bounds.head, bound, this.f359env, false, allowDiamondFinder, false);
                    if (i.isErroneous()) {
                        a.bound = i;
                    } else if (i.f344tag == 10) {
                        this.f358chk.checkNotRepeated(bound.m489pos(), this.types.erasure(i), boundSet);
                    }
                }
            }
        }
        List<Type> bs = this.types.getBounds(a);
        if (bs.length() > 1) {
            if ((bs.head.tsym.flags() & 512) == 0) {
                extending = tree.bounds.head;
                implementing = tree.bounds.tail;
            } else {
                extending = null;
                implementing = tree.bounds;
            }
            JCTree.JCClassDecl cd = this.make.m495at(tree.f531pos).ClassDef(this.make.Modifiers(1025L), tree.name, List.m507nil(), extending, implementing, List.m507nil());
            Symbol.ClassSymbol c = (Symbol.ClassSymbol) a.mo576getUpperBound().tsym;
            Assert.check((c.flags() & 16777216) != 0 ? allowDiamondFinder : false);
            cd.f539sym = c;
            c.sourcefile = this.f359env.toplevel.sourcefile;
            c.flags_field |= 268435456;
            Env<AttrContext> cenv = this.enter.classEnv(cd, this.f359env);
            this.enter.typeEnvs.put(c, cenv);
        }
    }

    @Override
    public void visitWildcard(JCTree.JCWildcard tree) {
        Type type;
        if (tree.kind.kind == BoundKind.UNBOUND) {
            type = this.syms.objectType;
        } else {
            type = attribType(tree.inner, this.f359env);
        }
        this.result = check(tree, new Type.WildcardType(this.f358chk.checkRefType(tree.m489pos(), type), tree.kind.kind, this.syms.boundClass), 2, this.pkind, this.f361pt);
    }

    @Override
    public void visitAnnotation(JCTree.JCAnnotation tree) {
        this.f360log.error(tree.m489pos(), "annotation.not.valid.for.type", this.f361pt);
        Type type = this.syms.errType;
        tree.type = type;
        this.result = type;
    }

    @Override
    public void visitErroneous(JCTree.JCErroneous tree) {
        if (tree.errs != null) {
            for (JCTree err : tree.errs) {
                attribTree(err, this.f359env, 31, this.f361pt);
            }
        }
        Type type = this.syms.errType;
        tree.type = type;
        this.result = type;
    }

    @Override
    public void visitTree(JCTree tree) {
        throw new AssertionError();
    }

    public void attrib(Env<AttrContext> env) {
        if (env.tree.getTag() == 1) {
            attribTopLevel(env);
        } else {
            attribClass(env.tree.m489pos(), env.enclClass.f539sym);
        }
    }

    public void attribTopLevel(Env<AttrContext> env) {
        JCTree.JCCompilationUnit toplevel = env.toplevel;
        try {
            this.annotate.flush();
            this.f358chk.validateAnnotations(toplevel.packageAnnotations, toplevel.packge);
        } catch (Symbol.CompletionFailure ex) {
            this.f358chk.completionError(toplevel.m489pos(), ex);
        }
    }

    public void attribClass(JCDiagnostic.DiagnosticPosition pos, Symbol.ClassSymbol c) {
        try {
            this.annotate.flush();
            attribClass(c);
        } catch (Symbol.CompletionFailure ex) {
            this.f358chk.completionError(pos, ex);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void attribClass(Symbol.ClassSymbol c) throws Symbol.CompletionFailure {
        if (c.type.f344tag == 19) {
            return;
        }
        this.f358chk.checkNonCyclic((JCDiagnostic.DiagnosticPosition) null, c.type);
        Type st = this.types.supertype(c.type);
        if ((c.flags_field & 16777216) == 0) {
            if (st.f344tag == 10) {
                attribClass((Symbol.ClassSymbol) st.tsym);
            }
            if (c.owner.kind == 2 && c.owner.type.f344tag == 10) {
                attribClass((Symbol.ClassSymbol) c.owner);
            }
        }
        if ((c.flags_field & 268435456) != 0) {
            c.flags_field &= -268435457;
            Env<AttrContext> env = this.enter.typeEnvs.get(c);
            Env c0621Env = env;
            while (((AttrContext) c0621Env.info).lint == null) {
                c0621Env = c0621Env.next;
            }
            env.info.lint = ((AttrContext) c0621Env.info).lint.augment(c.attributes_field, c.flags());
            Lint prevLint = this.f358chk.setLint(env.info.lint);
            JavaFileObject prev = this.f360log.useSource(c.sourcefile);
            try {
                if (st.tsym == this.syms.enumSym && (c.flags_field & 16793600) == 0) {
                    this.f360log.error(env.tree.m489pos(), "enum.no.subclassing", new Object[0]);
                }
                if (st.tsym != null && (st.tsym.flags_field & 16384) != 0 && (c.flags_field & 16793600) == 0 && !this.target.compilerBootstrap(c)) {
                    this.f360log.error(env.tree.m489pos(), "enum.types.not.extensible", new Object[0]);
                }
                attribClassBody(env, c);
                this.f358chk.checkDeprecatedAnnotation(env.tree.m489pos(), c);
            } finally {
                this.f360log.useSource(prev);
                this.f358chk.setLint(prevLint);
            }
        }
    }

    @Override
    public void visitImport(JCTree.JCImport tree) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void attribClassBody(Env<AttrContext> env, Symbol.ClassSymbol c) {
        JCTree.JCClassDecl tree = (JCTree.JCClassDecl) env.tree;
        Assert.check(c == tree.f539sym ? allowDiamondFinder : false);
        this.f358chk.validateAnnotations(tree.mods.annotations, c);
        attribBounds(tree.typarams);
        if (!c.isAnonymous()) {
            this.f358chk.validate(tree.typarams, env);
            this.f358chk.validate(tree.extending, env);
            this.f358chk.validate(tree.implementing, env);
        }
        if ((c.flags() & 1536) == 0 && !this.relax) {
            this.f358chk.checkAllDefined(tree.m489pos(), c);
        }
        if ((c.flags() & 8192) != 0) {
            if (tree.implementing.nonEmpty()) {
                this.f360log.error(tree.implementing.head.m489pos(), "cant.extend.intf.annotation", new Object[0]);
            }
            if (tree.typarams.nonEmpty()) {
                this.f360log.error(tree.typarams.head.m489pos(), "intf.annotation.cant.have.type.params", new Object[0]);
            }
        } else {
            this.f358chk.checkCompatibleSupertypes(tree.m489pos(), c.type);
        }
        this.f358chk.checkClassBounds(tree.m489pos(), c.type);
        tree.type = c.type;
        for (List list = tree.typarams; list.nonEmpty(); list = list.tail) {
            Assert.checkNonNull(env.info.scope.lookup(((JCTree.JCTypeParameter) list.head).name).scope);
        }
        if (!c.type.allparams().isEmpty() && this.types.isSubtype(c.type, this.syms.throwableType)) {
            this.f360log.error(tree.extending.m489pos(), "generic.throwable", new Object[0]);
        }
        this.f358chk.checkImplementations(tree);
        checkAutoCloseable(tree.m489pos(), env, c.type);
        for (List list2 = tree.defs; list2.nonEmpty(); list2 = list2.tail) {
            attribStat((JCTree) list2.head, env);
            if (c.owner.kind != 1 && (((c.flags() & 8) == 0 || c.name == this.names.empty) && (TreeInfo.flags((JCTree) list2.head) & 520) != 0)) {
                Symbol sym = ((JCTree) list2.head).getTag() == 5 ? ((JCTree.JCVariableDecl) list2.head).f547sym : null;
                if (sym == null || sym.kind != 4 || ((Symbol.VarSymbol) sym).getConstValue() == null) {
                    this.f360log.error(((JCTree) list2.head).m489pos(), "icls.cant.have.static.decl", c);
                }
            }
        }
        this.f358chk.checkCyclicConstructors(tree);
        this.f358chk.checkNonCyclicElements(tree);
        if (env.info.lint.isEnabled(Lint.LintCategory.SERIAL) && isSerializable(c) && (c.flags() & 16384) == 0 && (c.flags() & 1024) == 0) {
            checkSerialVersionUID(tree, c);
        }
    }

    private boolean isSerializable(Symbol.ClassSymbol c) {
        try {
            this.syms.serializableType.complete();
            return this.types.isSubtype(c.type, this.syms.serializableType);
        } catch (Symbol.CompletionFailure e) {
            return false;
        }
    }

    private void checkSerialVersionUID(JCTree.JCClassDecl tree, Symbol.ClassSymbol c) {
        Scope.Entry e = c.members().lookup(this.names.serialVersionUID);
        while (e.scope != null && e.f338sym.kind != 4) {
            e = e.next();
        }
        if (e.scope == null) {
            this.f360log.warning(Lint.LintCategory.SERIAL, tree.m489pos(), "missing.SVUID", c);
            return;
        }
        Symbol.VarSymbol svuid = (Symbol.VarSymbol) e.f338sym;
        if ((svuid.flags() & 24) != 24) {
            this.f360log.warning(Lint.LintCategory.SERIAL, TreeInfo.diagnosticPositionFor(svuid, tree), "improper.SVUID", c);
        } else if (svuid.type.f344tag != 5) {
            this.f360log.warning(Lint.LintCategory.SERIAL, TreeInfo.diagnosticPositionFor(svuid, tree), "long.SVUID", c);
        } else if (svuid.getConstValue() == null) {
            this.f360log.warning(Lint.LintCategory.SERIAL, TreeInfo.diagnosticPositionFor(svuid, tree), "constant.SVUID", c);
        }
    }

    private Type capture(Type type) {
        return this.types.capture(type);
    }

    public void postAttr(Env<AttrContext> env) {
        new PostAttrAnalyzer().scan(env.tree);
    }

    class PostAttrAnalyzer extends TreeScanner {
        PostAttrAnalyzer() {
        }

        private void initTypeIfNeeded(JCTree that) {
            if (that.type == null) {
                that.type = Attr.this.syms.unknownType;
            }
        }

        @Override
        public void scan(JCTree tree) {
            if (tree == null) {
                return;
            }
            if (tree instanceof JCTree.JCExpression) {
                initTypeIfNeeded(tree);
            }
            super.scan(tree);
        }

        @Override
        public void visitIdent(JCTree.JCIdent that) {
            if (that.f543sym == null) {
                that.f543sym = Attr.this.syms.unknownSymbol;
            }
        }

        @Override
        public void visitSelect(JCTree.JCFieldAccess that) {
            if (that.f542sym == null) {
                that.f542sym = Attr.this.syms.unknownSymbol;
            }
            super.visitSelect(that);
        }

        @Override
        public void visitClassDef(JCTree.JCClassDecl that) {
            initTypeIfNeeded(that);
            if (that.f539sym == null) {
                that.f539sym = new Symbol.ClassSymbol(0L, that.name, that.type, Attr.this.syms.noSymbol);
            }
            super.visitClassDef(that);
        }

        @Override
        public void visitMethodDef(JCTree.JCMethodDecl that) {
            initTypeIfNeeded(that);
            if (that.f544sym == null) {
                that.f544sym = new Symbol.MethodSymbol(0L, that.name, that.type, Attr.this.syms.noSymbol);
            }
            super.visitMethodDef(that);
        }

        @Override
        public void visitVarDef(JCTree.JCVariableDecl that) {
            initTypeIfNeeded(that);
            if (that.f547sym == null) {
                that.f547sym = new Symbol.VarSymbol(0L, that.name, that.type, Attr.this.syms.noSymbol);
                that.f547sym.f341adr = 0;
            }
            super.visitVarDef(that);
        }

        @Override
        public void visitNewClass(JCTree.JCNewClass that) {
            if (that.constructor == null) {
                that.constructor = new Symbol.MethodSymbol(0L, Attr.this.names.init, Attr.this.syms.unknownType, Attr.this.syms.noSymbol);
            }
            if (that.constructorType == null) {
                that.constructorType = Attr.this.syms.unknownType;
            }
            super.visitNewClass(that);
        }

        @Override
        public void visitAssignop(JCTree.JCAssignOp that) {
            if (that.operator == null) {
                that.operator = new Symbol.OperatorSymbol(Attr.this.names.empty, Attr.this.syms.unknownType, -1, Attr.this.syms.noSymbol);
            }
            super.visitAssignop(that);
        }

        @Override
        public void visitBinary(JCTree.JCBinary that) {
            if (that.operator == null) {
                that.operator = new Symbol.OperatorSymbol(Attr.this.names.empty, Attr.this.syms.unknownType, -1, Attr.this.syms.noSymbol);
            }
            super.visitBinary(that);
        }

        @Override
        public void visitUnary(JCTree.JCUnary that) {
            if (that.operator == null) {
                that.operator = new Symbol.OperatorSymbol(Attr.this.names.empty, Attr.this.syms.unknownType, -1, Attr.this.syms.noSymbol);
            }
            super.visitUnary(that);
        }
    }
}
