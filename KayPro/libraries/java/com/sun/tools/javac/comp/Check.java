package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Attribute;
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
import com.sun.tools.javac.main.OptionName;
import com.sun.tools.javac.jvm.ClassReader;
import com.sun.tools.javac.jvm.Target;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.tree.TreeScanner;
import com.sun.tools.javac.util.Abort;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.DiagnosticSource;
import com.sun.tools.javac.util.Filter;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.MandatoryWarningHandler;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Options;
import com.sun.tools.javac.util.Warner;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Check {
    protected static final Context.C0723Key<Check> checkKey = new Context.C0723Key<>();
    boolean allowAnnotations;
    boolean allowCovariantReturns;
    boolean allowGenerics;
    boolean allowSimplifiedVarargs;
    boolean complexInference;
    private DeferredLintHandler deferredLintHandler;
    private MandatoryWarningHandler deprecationHandler;
    private final JCDiagnostic.Factory diags;
    private boolean enableSunApiLintControl;
    private final Enter enter;
    private final Infer infer;
    private Lint lint;

    private final Log f364log;
    private Symbol.MethodSymbol method;
    private final Names names;
    private final boolean skipAnnotations;
    private MandatoryWarningHandler sunApiHandler;
    private boolean suppressAbortOnBadClassFile;
    private final Symtab syms;
    char syntheticNameChar;
    private final TreeInfo treeinfo;
    private final Types types;
    private MandatoryWarningHandler uncheckedHandler;
    private boolean warnOnSyntheticConflicts;
    public Map<Name, Symbol.ClassSymbol> compiled = new HashMap();
    Types.UnaryVisitor<Boolean> isTypeArgErroneous = new Types.UnaryVisitor<Boolean>() {
        @Override
        public Boolean visitType(Type t, Void s) {
            return Boolean.valueOf(t.isErroneous());
        }

        @Override
        public Boolean visitTypeVar(Type.TypeVar t, Void s) {
            return visit(t.mo576getUpperBound());
        }

        @Override
        public Boolean visitCapturedType(Type.CapturedType t, Void s) {
            return Boolean.valueOf(visit(t.mo576getUpperBound()).booleanValue() || visit(t.getLowerBound()).booleanValue());
        }

        @Override
        public Boolean visitWildcardType(Type.WildcardType t, Void s) {
            return visit(t.type);
        }
    };
    Warner overrideWarner = new Warner();

    public static Check instance(Context context) {
        Check instance = (Check) context.m501get(checkKey);
        if (instance == null) {
            return new Check(context);
        }
        return instance;
    }

    protected Check(Context context) {
        context.m504put(checkKey, this);
        this.names = Names.instance(context);
        this.f364log = Log.instance(context);
        this.syms = Symtab.instance(context);
        this.enter = Enter.instance(context);
        this.infer = Infer.instance(context);
        this.types = Types.instance(context);
        this.diags = JCDiagnostic.Factory.instance(context);
        Options options = Options.instance(context);
        this.lint = Lint.instance(context);
        this.treeinfo = TreeInfo.instance(context);
        Source source = Source.instance(context);
        this.allowGenerics = source.allowGenerics();
        this.allowAnnotations = source.allowAnnotations();
        this.allowCovariantReturns = source.allowCovariantReturns();
        this.allowSimplifiedVarargs = source.allowSimplifiedVarargs();
        this.complexInference = options.isSet(OptionName.COMPLEXINFERENCE);
        this.skipAnnotations = options.isSet("skipAnnotations");
        this.warnOnSyntheticConflicts = options.isSet("warnOnSyntheticConflicts");
        this.suppressAbortOnBadClassFile = options.isSet("suppressAbortOnBadClassFile");
        this.enableSunApiLintControl = options.isSet("enableSunApiLintControl");
        Target target = Target.instance(context);
        this.syntheticNameChar = target.syntheticNameChar();
        boolean verboseDeprecated = this.lint.isEnabled(Lint.LintCategory.DEPRECATION);
        boolean verboseUnchecked = this.lint.isEnabled(Lint.LintCategory.UNCHECKED);
        boolean verboseSunApi = this.lint.isEnabled(Lint.LintCategory.SUNAPI);
        boolean enforceMandatoryWarnings = source.enforceMandatoryWarnings();
        this.deprecationHandler = new MandatoryWarningHandler(this.f364log, verboseDeprecated, enforceMandatoryWarnings, "deprecated", Lint.LintCategory.DEPRECATION);
        this.uncheckedHandler = new MandatoryWarningHandler(this.f364log, verboseUnchecked, enforceMandatoryWarnings, "unchecked", Lint.LintCategory.UNCHECKED);
        this.sunApiHandler = new MandatoryWarningHandler(this.f364log, verboseSunApi, enforceMandatoryWarnings, "sunapi", null);
        this.deferredLintHandler = DeferredLintHandler.immediateHandler;
    }

    Lint setLint(Lint newLint) {
        Lint prev = this.lint;
        this.lint = newLint;
        return prev;
    }

    DeferredLintHandler setDeferredLintHandler(DeferredLintHandler newDeferredLintHandler) {
        DeferredLintHandler prev = this.deferredLintHandler;
        this.deferredLintHandler = newDeferredLintHandler;
        return prev;
    }

    Symbol.MethodSymbol setMethod(Symbol.MethodSymbol newMethod) {
        Symbol.MethodSymbol prev = this.method;
        this.method = newMethod;
        return prev;
    }

    void warnDeprecated(JCDiagnostic.DiagnosticPosition pos, Symbol sym) {
        if (!this.lint.isSuppressed(Lint.LintCategory.DEPRECATION)) {
            this.deprecationHandler.report(pos, "has.been.deprecated", sym, sym.location());
        }
    }

    public void warnUnchecked(JCDiagnostic.DiagnosticPosition pos, String msg, Object... args) {
        if (!this.lint.isSuppressed(Lint.LintCategory.UNCHECKED)) {
            this.uncheckedHandler.report(pos, msg, args);
        }
    }

    void warnUnsafeVararg(JCDiagnostic.DiagnosticPosition pos, String key, Object... args) {
        if (this.lint.isEnabled(Lint.LintCategory.VARARGS) && this.allowSimplifiedVarargs) {
            this.f364log.warning(Lint.LintCategory.VARARGS, pos, key, args);
        }
    }

    public void warnSunApi(JCDiagnostic.DiagnosticPosition pos, String msg, Object... args) {
        if (!this.lint.isSuppressed(Lint.LintCategory.SUNAPI)) {
            this.sunApiHandler.report(pos, msg, args);
        }
    }

    public void warnStatic(JCDiagnostic.DiagnosticPosition pos, String msg, Object... args) {
        if (this.lint.isEnabled(Lint.LintCategory.STATIC)) {
            this.f364log.warning(Lint.LintCategory.STATIC, pos, msg, args);
        }
    }

    public void reportDeferredDiagnostics() {
        this.deprecationHandler.reportDeferredDiagnostic();
        this.uncheckedHandler.reportDeferredDiagnostic();
        this.sunApiHandler.reportDeferredDiagnostic();
    }

    public Type completionError(JCDiagnostic.DiagnosticPosition pos, Symbol.CompletionFailure ex) {
        this.f364log.error(pos, "cant.access", ex.f340sym, ex.getDetailValue());
        if ((ex instanceof ClassReader.BadClassFile) && !this.suppressAbortOnBadClassFile) {
            throw new Abort();
        }
        return this.syms.errType;
    }

    Type typeError(JCDiagnostic.DiagnosticPosition pos, Object problem, Type found, Type req) {
        this.f364log.error(pos, "prob.found.req", problem, found, req);
        return this.types.createErrorType(found);
    }

    Type typeError(JCDiagnostic.DiagnosticPosition pos, String problem, Type found, Type req, Object explanation) {
        this.f364log.error(pos, "prob.found.req.1", problem, found, req, explanation);
        return this.types.createErrorType(found);
    }

    Type typeTagError(JCDiagnostic.DiagnosticPosition pos, Object required, Object found) {
        if ((found instanceof Type) && ((Type) found).f344tag == 9) {
            this.f364log.error(pos, "illegal.start.of.type", new Object[0]);
            return this.syms.errType;
        }
        this.f364log.error(pos, "type.found.req", found, required);
        return this.types.createErrorType(found instanceof Type ? (Type) found : this.syms.errType);
    }

    void earlyRefError(JCDiagnostic.DiagnosticPosition pos, Symbol sym) {
        this.f364log.error(pos, "cant.ref.before.ctor.called", sym);
    }

    void duplicateError(JCDiagnostic.DiagnosticPosition pos, Symbol sym) {
        if (!sym.type.isErroneous()) {
            Symbol location = sym.location();
            if (location.kind == 16 && ((Symbol.MethodSymbol) location).isStaticOrInstanceInit()) {
                this.f364log.error(pos, "already.defined.in.clinit", Kinds.kindName(sym), sym, Kinds.kindName(sym.location()), Kinds.kindName(sym.location().enclClass()), sym.location().enclClass());
            } else {
                this.f364log.error(pos, "already.defined", Kinds.kindName(sym), sym, Kinds.kindName(sym.location()), sym.location());
            }
        }
    }

    void varargsDuplicateError(JCDiagnostic.DiagnosticPosition pos, Symbol sym1, Symbol sym2) {
        if (!sym1.type.isErroneous() && !sym2.type.isErroneous()) {
            this.f364log.error(pos, "array.and.varargs", sym1, sym2, sym2.location());
        }
    }

    void checkTransparentVar(JCDiagnostic.DiagnosticPosition pos, Symbol.VarSymbol v, Scope s) {
        if (s.next != null) {
            for (Scope.Entry e = s.next.lookup(v.name); e.scope != null && e.f338sym.owner == v.owner; e = e.next()) {
                if (e.f338sym.kind == 4 && (e.f338sym.owner.kind & 20) != 0 && v.name != this.names.error) {
                    duplicateError(pos, e.f338sym);
                    return;
                }
            }
        }
    }

    void checkTransparentClass(JCDiagnostic.DiagnosticPosition pos, Symbol.ClassSymbol c, Scope s) {
        if (s.next != null) {
            for (Scope.Entry e = s.next.lookup(c.name); e.scope != null && e.f338sym.owner == c.owner; e = e.next()) {
                if (e.f338sym.kind == 2 && e.f338sym.type.f344tag != 14 && (e.f338sym.owner.kind & 20) != 0 && c.name != this.names.error) {
                    duplicateError(pos, e.f338sym);
                    return;
                }
            }
        }
    }

    boolean checkUniqueClassName(JCDiagnostic.DiagnosticPosition pos, Name name, Scope s) {
        for (Scope.Entry e = s.lookup(name); e.scope == s; e = e.next()) {
            if (e.f338sym.kind == 2 && e.f338sym.name != this.names.error) {
                duplicateError(pos, e.f338sym);
                return false;
            }
        }
        for (Symbol sym = s.owner; sym != null; sym = sym.owner) {
            if (sym.kind == 2 && sym.name == name && sym.name != this.names.error) {
                duplicateError(pos, sym);
                return true;
            }
        }
        return true;
    }

    Name localClassName(Symbol.ClassSymbol c) {
        int i = 1;
        while (true) {
            Name flatname = this.names.fromString("" + ((Object) c.owner.enclClass().flatname) + this.syntheticNameChar + i + ((Object) c.name));
            if (this.compiled.get(flatname) == null) {
                return flatname;
            }
            i++;
        }
    }

    Type checkType(JCDiagnostic.DiagnosticPosition pos, Type found, Type req) {
        return checkType(pos, found, req, "incompatible.types");
    }

    Type checkType(JCDiagnostic.DiagnosticPosition pos, Type found, Type req, String errKey) {
        if (req.f344tag == 19) {
            return req;
        }
        if (found.f344tag == 16) {
            return instantiatePoly(pos, (Type.ForAll) found, req, convertWarner(pos, found, req));
        }
        if (req.f344tag == 18 || this.types.isAssignable(found, req, convertWarner(pos, found, req))) {
            return found;
        }
        if (found.f344tag <= 7 && req.f344tag <= 7) {
            return typeError(pos, this.diags.fragment("possible.loss.of.precision", new Object[0]), found, req);
        }
        if (found.isSuperBound()) {
            this.f364log.error(pos, "assignment.from.super-bound", found);
            return this.types.createErrorType(found);
        }
        if (req.isExtendsBound()) {
            this.f364log.error(pos, "assignment.to.extends-bound", req);
            return this.types.createErrorType(found);
        }
        return typeError(pos, this.diags.fragment(errKey, new Object[0]), found, req);
    }

    Type instantiatePoly(JCDiagnostic.DiagnosticPosition pos, Type.ForAll t, Type pt, Warner warn) throws Infer.NoInstanceException {
        if (pt == Infer.anyPoly && this.complexInference) {
            return t;
        }
        if (pt == Infer.anyPoly || pt.f344tag == 18) {
            Type newpt = t.qtype.f344tag <= 9 ? t.qtype : this.syms.objectType;
            return instantiatePoly(pos, t, newpt, warn);
        }
        if (pt.f344tag == 19) {
            return pt;
        }
        try {
            return this.infer.instantiateExpr(t, pt, warn);
        } catch (Infer.InvalidInstanceException ex) {
            this.f364log.error(pos, "invalid.inferred.types", t.tvars, ex.getDiagnostic());
            return this.types.createErrorType(pt);
        } catch (Infer.NoInstanceException ex2) {
            if (ex2.isAmbiguous) {
                JCDiagnostic d = ex2.getDiagnostic();
                Log c0730Log = this.f364log;
                StringBuilder sb = new StringBuilder();
                sb.append("undetermined.type");
                sb.append(d == null ? "" : ".1");
                c0730Log.error(pos, sb.toString(), t, d);
                return this.types.createErrorType(pt);
            }
            JCDiagnostic d2 = ex2.getDiagnostic();
            JCDiagnostic.Factory factory = this.diags;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("incompatible.types");
            sb2.append(d2 == null ? "" : ".1");
            return typeError(pos, factory.fragment(sb2.toString(), d2), t, pt);
        }
    }

    Type checkCastable(JCDiagnostic.DiagnosticPosition pos, Type found, Type req) {
        if (found.f344tag == 16) {
            instantiatePoly(pos, (Type.ForAll) found, req, castWarner(pos, found, req));
            return req;
        }
        if (this.types.isCastable(found, req, castWarner(pos, found, req))) {
            return req;
        }
        return typeError(pos, this.diags.fragment("inconvertible.types", new Object[0]), found, req);
    }

    boolean isTypeVar(Type t) {
        return t.f344tag == 14 || (t.f344tag == 11 && isTypeVar(this.types.elemtype(t)));
    }

    private boolean checkExtends(Type a, Type bound) {
        if (a.isUnbound()) {
            return true;
        }
        if (a.f344tag != 15) {
            return this.types.isSubtype(this.types.upperBound(a), bound);
        }
        if (a.isExtendsBound()) {
            Types types = this.types;
            return types.isCastable(bound, types.upperBound(a), Warner.noWarnings);
        }
        if (!a.isSuperBound()) {
            return true;
        }
        Types types2 = this.types;
        return !types2.notSoftSubtype(types2.lowerBound(a), bound);
    }

    Type checkNonVoid(JCDiagnostic.DiagnosticPosition pos, Type t) {
        if (t.f344tag == 9) {
            this.f364log.error(pos, "void.not.allowed.here", new Object[0]);
            return this.types.createErrorType(t);
        }
        return t;
    }

    Type checkClassType(JCDiagnostic.DiagnosticPosition pos, Type t) {
        Object objFragment;
        if (t.f344tag != 10 && t.f344tag != 19) {
            JCDiagnostic jCDiagnosticFragment = this.diags.fragment("type.req.class", new Object[0]);
            if (t.f344tag == 14) {
                objFragment = this.diags.fragment("type.parameter", t);
            } else {
                objFragment = t;
            }
            return typeTagError(pos, jCDiagnosticFragment, objFragment);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    Type checkClassType(JCDiagnostic.DiagnosticPosition pos, Type t, boolean noBounds) {
        Type t2 = checkClassType(pos, t);
        if (noBounds && t2.isParameterized()) {
            for (List typeArguments = t2.getTypeArguments(); typeArguments.nonEmpty(); typeArguments = typeArguments.tail) {
                if (((Type) typeArguments.head).f344tag == 15) {
                    return typeTagError(pos, this.diags.fragment("type.req.exact", new Object[0]), typeArguments.head);
                }
            }
        }
        return t2;
    }

    Type checkReifiableReferenceType(JCDiagnostic.DiagnosticPosition pos, Type t) {
        if (t.f344tag != 10 && t.f344tag != 11 && t.f344tag != 19) {
            return typeTagError(pos, this.diags.fragment("type.req.class.array", new Object[0]), t);
        }
        if (!this.types.isReifiable(t)) {
            this.f364log.error(pos, "illegal.generic.type.for.instof", new Object[0]);
            return this.types.createErrorType(t);
        }
        return t;
    }

    Type checkRefType(JCDiagnostic.DiagnosticPosition pos, Type t) {
        int i = t.f344tag;
        if (i == 10 || i == 11 || i == 14 || i == 15 || i == 19) {
            return t;
        }
        return typeTagError(pos, this.diags.fragment("type.req.ref", new Object[0]), t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [A, com.sun.tools.javac.code.Type] */
    List<Type> checkRefTypes(List<JCTree.JCExpression> trees, List<Type> types) {
        List list = trees;
        for (List list2 = types; list2.nonEmpty(); list2 = list2.tail) {
            list2.head = checkRefType(((JCTree.JCExpression) list.head).m489pos(), (Type) list2.head);
            list = list.tail;
        }
        return types;
    }

    Type checkNullOrRefType(JCDiagnostic.DiagnosticPosition pos, Type t) {
        int i = t.f344tag;
        if (i == 10 || i == 11 || i == 14 || i == 15 || i == 17 || i == 19) {
            return t;
        }
        return typeTagError(pos, this.diags.fragment("type.req.ref", new Object[0]), t);
    }

    boolean checkDisjoint(JCDiagnostic.DiagnosticPosition pos, long flags, long set1, long set2) {
        if ((flags & set1) == 0 || (flags & set2) == 0) {
            return true;
        }
        this.f364log.error(pos, "illegal.combination.of.modifiers", Flags.asFlagSet(TreeInfo.firstFlag(flags & set1)), Flags.asFlagSet(TreeInfo.firstFlag(flags & set2)));
        return false;
    }

    Type checkDiamond(JCTree.JCNewClass tree, Type t) {
        if (!TreeInfo.isDiamond(tree) || t.isErroneous()) {
            return checkClassType(tree.clazz.m489pos(), t, true);
        }
        if (tree.f545def != null) {
            this.f364log.error(tree.clazz.m489pos(), "cant.apply.diamond.1", t, this.diags.fragment("diamond.and.anon.class", t));
            return this.types.createErrorType(t);
        }
        if (t.tsym.type.getTypeArguments().isEmpty()) {
            this.f364log.error(tree.clazz.m489pos(), "cant.apply.diamond.1", t, this.diags.fragment("diamond.non.generic", t));
            return this.types.createErrorType(t);
        }
        if (tree.typeargs != null && tree.typeargs.nonEmpty()) {
            this.f364log.error(tree.clazz.m489pos(), "cant.apply.diamond.1", t, this.diags.fragment("diamond.and.explicit.params", t));
            return this.types.createErrorType(t);
        }
        return t;
    }

    void checkVarargsMethodDecl(Env<AttrContext> env, JCTree.JCMethodDecl tree) {
        Symbol.MethodSymbol m = tree.f544sym;
        if (this.allowSimplifiedVarargs) {
            boolean hasTrustMeAnno = m.attribute(this.syms.trustMeType.tsym) != null;
            Type varargElemType = null;
            if (m.isVarArgs()) {
                varargElemType = this.types.elemtype(tree.params.last().type);
            }
            if (hasTrustMeAnno && !isTrustMeAllowedOnMethod(m)) {
                if (varargElemType != null) {
                    this.f364log.error(tree, "varargs.invalid.trustme.anno", this.syms.trustMeType.tsym, this.diags.fragment("varargs.trustme.on.virtual.varargs", m));
                    return;
                } else {
                    this.f364log.error(tree, "varargs.invalid.trustme.anno", this.syms.trustMeType.tsym, this.diags.fragment("varargs.trustme.on.non.varargs.meth", m));
                    return;
                }
            }
            if (hasTrustMeAnno && varargElemType != null && this.types.isReifiable(varargElemType)) {
                warnUnsafeVararg(tree, "varargs.redundant.trustme.anno", this.syms.trustMeType.tsym, this.diags.fragment("varargs.trustme.on.reifiable.varargs", varargElemType));
            } else if (!hasTrustMeAnno && varargElemType != null && !this.types.isReifiable(varargElemType)) {
                warnUnchecked(tree.params.head.m489pos(), "unchecked.varargs.non.reifiable.type", varargElemType);
            }
        }
    }

    public boolean isTrustMeAllowedOnMethod(Symbol s) {
        return (s.flags() & Flags.VARARGS) != 0 && (s.isConstructor() || (s.flags() & 24) != 0);
    }

    void checkVararg(JCDiagnostic.DiagnosticPosition pos, List<Type> argtypes, Symbol msym) {
        Type argtype = argtypes.last();
        if (!this.types.isReifiable(argtype)) {
            if (!this.allowSimplifiedVarargs || msym.attribute(this.syms.trustMeType.tsym) == null || !isTrustMeAllowedOnMethod(msym)) {
                warnUnchecked(pos, "unchecked.generic.array.creation", argtype);
            }
        }
    }

    public boolean checkValidGenericType(Type t) {
        return firstIncompatibleTypeArg(t) == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Type firstIncompatibleTypeArg(Type type) {
        List<Type> formals = type.tsym.type.allparams();
        List<Type> actuals = type.allparams();
        List typeArguments = type.getTypeArguments();
        ListBuffer<Type> bounds_buf = new ListBuffer<>();
        for (List typeArguments2 = type.tsym.type.getTypeArguments(); typeArguments.nonEmpty() && typeArguments2.nonEmpty(); typeArguments2 = typeArguments2.tail) {
            bounds_buf.append(this.types.subst(((Type) typeArguments2.head).mo576getUpperBound(), formals, actuals));
            typeArguments = typeArguments.tail;
        }
        List typeArguments3 = type.getTypeArguments();
        Types types = this.types;
        for (List listSubstBounds = types.substBounds(formals, formals, types.capture(type).allparams()); typeArguments3.nonEmpty() && listSubstBounds.nonEmpty(); listSubstBounds = listSubstBounds.tail) {
            ((Type) typeArguments3.head).withTypeVar((Type.TypeVar) listSubstBounds.head);
            typeArguments3 = typeArguments3.tail;
        }
        List typeArguments4 = type.getTypeArguments();
        for (List list = bounds_buf.toList(); typeArguments4.nonEmpty() && list.nonEmpty(); list = list.tail) {
            Type actual = (Type) typeArguments4.head;
            if (!isTypeArgErroneous(actual) && !((Type) list.head).isErroneous() && !checkExtends(actual, (Type) list.head)) {
                return (Type) typeArguments4.head;
            }
            typeArguments4 = typeArguments4.tail;
        }
        List typeArguments5 = type.getTypeArguments();
        List list2 = bounds_buf.toList();
        for (Type arg : this.types.capture(type).getTypeArguments()) {
            if (arg.f344tag == 14 && arg.mo576getUpperBound().isErroneous() && !((Type) list2.head).isErroneous() && !isTypeArgErroneous((Type) typeArguments5.head)) {
                return (Type) typeArguments5.head;
            }
            list2 = list2.tail;
            typeArguments5 = typeArguments5.tail;
        }
        return null;
    }

    boolean isTypeArgErroneous(Type t) {
        return this.isTypeArgErroneous.visit(t).booleanValue();
    }

    long checkFlags(JCDiagnostic.DiagnosticPosition pos, long flags, Symbol sym, JCTree tree) {
        Check check;
        long mask;
        long implicit;
        long mask2;
        int i;
        long mask3;
        long implicit2 = 0;
        int i2 = sym.kind;
        if (i2 == 2) {
            if (sym.isLocal()) {
                long mask4 = 23568;
                if (sym.name.isEmpty()) {
                    mask4 = 23568 | 8;
                    implicit2 = 0 | 16;
                }
                if ((sym.owner.flags_field & 8) != 0 || (flags & 16384) == 0) {
                    check = this;
                } else {
                    check = this;
                    check.f364log.error(pos, "enums.must.be.static", new Object[0]);
                }
                mask = mask4;
            } else {
                check = this;
                if (sym.owner.kind == 2) {
                    mask = 24087;
                    if (sym.owner.owner.kind == 1 || (sym.owner.flags_field & 8) != 0) {
                        mask = 24087 | 8;
                    } else if ((flags & 16384) != 0) {
                        check.f364log.error(pos, "enums.must.be.static", new Object[0]);
                    }
                    if ((flags & 16896) != 0) {
                        implicit2 = 8;
                    }
                } else {
                    mask = 32273;
                }
            }
            if ((flags & 512) != 0) {
                implicit2 |= 1024;
            }
            if ((flags & 16384) != 0) {
                mask &= -1041;
                implicit2 |= check.implicitEnumFinalFlag(tree);
            }
            implicit = implicit2 | (sym.owner.flags_field & 2048);
            mask2 = mask;
        } else if (i2 != 4) {
            if (i2 == 16) {
                if (sym.name == this.names.init) {
                    if ((sym.owner.flags_field & 16384) != 0) {
                        implicit2 = 2;
                        mask3 = 2;
                    } else {
                        mask3 = 7;
                    }
                } else if ((sym.owner.flags_field & 512) != 0) {
                    mask3 = 1025;
                    implicit2 = 1025;
                } else {
                    mask3 = 3391;
                }
                if ((1024 & (flags | implicit2)) == 0) {
                    implicit = implicit2 | (2048 & sym.owner.flags_field);
                    mask2 = mask3;
                    check = this;
                } else {
                    implicit = implicit2;
                    mask2 = mask3;
                    check = this;
                }
            } else {
                throw new AssertionError();
            }
        } else if (sym.owner.kind != 2) {
            implicit = 0;
            mask2 = 8589934608L;
            check = this;
        } else if ((sym.owner.flags_field & 512) != 0) {
            implicit = 25;
            mask2 = 25;
            check = this;
        } else {
            implicit = 0;
            mask2 = 16607;
            check = this;
        }
        long illegal = flags & 4095 & (mask2 ^ (-1));
        if (illegal == 0) {
            if (sym.kind == 2) {
                i = 2;
            } else {
                i = 2;
                if (checkDisjoint(pos, flags, 1024L, 10L)) {
                }
            }
            if (checkDisjoint(pos, flags, 1536L, 304L) && checkDisjoint(pos, flags, 1L, 6L) && checkDisjoint(pos, flags, 2L, 5L) && checkDisjoint(pos, flags, 16L, 64L) && sym.kind != i) {
                checkDisjoint(pos, flags, 1280L, 2048L);
            }
        } else if ((illegal & 512) != 0) {
            check.f364log.error(pos, "intf.not.allowed.here", new Object[0]);
            mask2 |= 512;
        } else {
            check.f364log.error(pos, "mod.not.allowed.here", Flags.asFlagSet(illegal));
        }
        return (flags & (mask2 | (-4096))) | implicit;
    }

    private long implicitEnumFinalFlag(JCTree tree) {
        if (tree.getTag() != 3) {
            return 0L;
        }
        C1SpecialTreeVisitor sts = new C1SpecialTreeVisitor();
        JCTree.JCClassDecl cdef = (JCTree.JCClassDecl) tree;
        for (JCTree defs : cdef.defs) {
            defs.accept(sts);
            if (sts.specialized) {
                return 0L;
            }
        }
        return 16L;
    }

    class C1SpecialTreeVisitor extends JCTree.Visitor {
        boolean specialized = false;

        C1SpecialTreeVisitor() {
        }

        @Override
        public void visitTree(JCTree tree) {
        }

        @Override
        public void visitVarDef(JCTree.JCVariableDecl tree) {
            if ((tree.mods.flags & 16384) != 0 && (tree.init instanceof JCTree.JCNewClass) && ((JCTree.JCNewClass) tree.init).f545def != null) {
                this.specialized = true;
            }
        }
    }

    void validate(JCTree tree, Env<AttrContext> env) {
        validate(tree, env, true);
    }

    void validate(JCTree tree, Env<AttrContext> env, boolean checkRaw) {
        new Validator(env).validateTree(tree, checkRaw, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void validate(List<? extends JCTree> trees, Env<AttrContext> env) {
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            validate((JCTree) list.head, env);
        }
    }

    class Validator extends JCTree.Visitor {

        Env<AttrContext> f366env;
        boolean isOuter;

        Validator(Env<AttrContext> env) {
            this.f366env = env;
        }

        @Override
        public void visitTypeArray(JCTree.JCArrayTypeTree tree) {
            tree.elemtype.accept(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public void visitTypeApply(JCTree.JCTypeApply tree) {
            if (tree.type.f344tag == 10) {
                List list = tree.arguments;
                List typeArguments = tree.type.tsym.type.getTypeArguments();
                Type incompatibleArg = Check.this.firstIncompatibleTypeArg(tree.type);
                if (incompatibleArg != null) {
                    for (JCTree arg : tree.arguments) {
                        if (arg.type == incompatibleArg) {
                            Check.this.f364log.error(arg, "not.within.bounds", incompatibleArg, typeArguments.head);
                        }
                        typeArguments = typeArguments.tail;
                    }
                }
                boolean is_java_lang_Class = tree.type.tsym.flatName() == Check.this.names.java_lang_Class;
                for (List typeArguments2 = tree.type.tsym.type.getTypeArguments(); list.nonEmpty() && typeArguments2.nonEmpty(); typeArguments2 = typeArguments2.tail) {
                    validateTree((JCTree) list.head, (this.isOuter && is_java_lang_Class) ? false : true, false);
                    list = list.tail;
                }
                if (tree.type.getEnclosingType().isRaw()) {
                    Check.this.f364log.error(tree.m489pos(), "improperly.formed.type.inner.raw.param", new Object[0]);
                }
                if (tree.clazz.getTag() == 34) {
                    visitSelectInternal((JCTree.JCFieldAccess) tree.clazz);
                }
            }
        }

        @Override
        public void visitTypeParameter(JCTree.JCTypeParameter tree) {
            validateTrees(tree.bounds, true, this.isOuter);
            Check.this.checkClassBounds(tree.m489pos(), tree.type);
        }

        @Override
        public void visitWildcard(JCTree.JCWildcard tree) {
            if (tree.inner != null) {
                validateTree(tree.inner, true, this.isOuter);
            }
        }

        @Override
        public void visitSelect(JCTree.JCFieldAccess tree) {
            if (tree.type.f344tag == 10) {
                visitSelectInternal(tree);
                if (tree.selected.type.isParameterized() && tree.type.tsym.type.getTypeArguments().nonEmpty()) {
                    Check.this.f364log.error(tree.m489pos(), "improperly.formed.type.param.missing", new Object[0]);
                }
            }
        }

        public void visitSelectInternal(JCTree.JCFieldAccess tree) {
            if (tree.type.tsym.isStatic() && tree.selected.type.isParameterized()) {
                Check.this.f364log.error(tree.m489pos(), "cant.select.static.class.from.param.type", new Object[0]);
            } else {
                tree.selected.accept(this);
            }
        }

        @Override
        public void visitTree(JCTree tree) {
        }

        public void validateTree(JCTree tree, boolean checkRaw, boolean isOuter) {
            if (tree != null) {
                try {
                    this.isOuter = isOuter;
                    tree.accept(this);
                    if (checkRaw) {
                        checkRaw(tree, this.f366env);
                    }
                } catch (Symbol.CompletionFailure ex) {
                    Check.this.completionError(tree.m489pos(), ex);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void validateTrees(List<? extends JCTree> trees, boolean checkRaw, boolean isOuter) {
            for (List list = trees; list.nonEmpty(); list = list.tail) {
                validateTree((JCTree) list.head, checkRaw, isOuter);
            }
        }

        void checkRaw(JCTree tree, Env<AttrContext> env) {
            if (Check.this.lint.isEnabled(Lint.LintCategory.RAW) && tree.type.f344tag == 10 && !TreeInfo.isDiamond(tree) && !env.enclClass.name.isEmpty() && tree.type.isRaw()) {
                Check.this.f364log.warning(Lint.LintCategory.RAW, tree.m489pos(), "raw.class.use", tree.type, tree.type.tsym.type);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean subset(Type t, List<Type> ts) {
        for (List list = ts; list.nonEmpty(); list = list.tail) {
            if (this.types.isSubtype(t, (Type) list.head)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean intersects(Type t, List<Type> ts) {
        for (List list = ts; list.nonEmpty(); list = list.tail) {
            if (this.types.isSubtype(t, (Type) list.head) || this.types.isSubtype((Type) list.head, t)) {
                return true;
            }
        }
        return false;
    }

    List<Type> incl(Type t, List<Type> ts) {
        return subset(t, ts) ? ts : excl(t, ts).prepend(t);
    }

    List<Type> excl(Type t, List<Type> ts) {
        if (ts.isEmpty()) {
            return ts;
        }
        List<Type> ts1 = excl(t, ts.tail);
        if (this.types.isSubtype(ts.head, t)) {
            return ts1;
        }
        return ts1 == ts.tail ? ts : ts1.prepend(ts.head);
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<Type> union(List<Type> ts1, List<Type> ts2) {
        List<Type> ts = ts1;
        for (List list = ts2; list.nonEmpty(); list = list.tail) {
            ts = incl((Type) list.head, ts);
        }
        return ts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<Type> diff(List<Type> ts1, List<Type> ts2) {
        List<Type> ts = ts1;
        for (List list = ts2; list.nonEmpty(); list = list.tail) {
            ts = excl((Type) list.head, ts);
        }
        return ts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<Type> intersect(List<Type> ts1, List<Type> ts2) {
        List<Type> ts = List.m507nil();
        for (List list = ts1; list.nonEmpty(); list = list.tail) {
            if (subset((Type) list.head, ts2)) {
                ts = incl((Type) list.head, ts);
            }
        }
        for (List list2 = ts2; list2.nonEmpty(); list2 = list2.tail) {
            if (subset((Type) list2.head, ts1)) {
                ts = incl((Type) list2.head, ts);
            }
        }
        return ts;
    }

    boolean isUnchecked(Symbol.ClassSymbol exc) {
        return exc.kind == 31 || exc.isSubClass(this.syms.errorType.tsym, this.types) || exc.isSubClass(this.syms.runtimeExceptionType.tsym, this.types);
    }

    boolean isUnchecked(Type exc) {
        if (exc.f344tag == 14) {
            return isUnchecked(this.types.supertype(exc));
        }
        if (exc.f344tag == 10) {
            return isUnchecked((Symbol.ClassSymbol) exc.tsym);
        }
        return exc.f344tag == 17;
    }

    boolean isUnchecked(JCDiagnostic.DiagnosticPosition pos, Type exc) {
        try {
            return isUnchecked(exc);
        } catch (Symbol.CompletionFailure ex) {
            completionError(pos, ex);
            return true;
        }
    }

    boolean isHandled(Type exc, List<Type> handled) {
        return isUnchecked(exc) || subset(exc, handled);
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<Type> unhandled(List<Type> list, List<Type> list2) {
        List list3 = list;
        List listPrepend = List.m507nil();
        while (list3.nonEmpty()) {
            if (!isHandled((Type) list3.head, list2)) {
                listPrepend = listPrepend.prepend(list3.head);
            }
            list3 = list3.tail;
            listPrepend = listPrepend;
        }
        return listPrepend;
    }

    static int protection(long flags) {
        short s = (short) (7 & flags);
        if (s == 0) {
            return 2;
        }
        if (s == 2) {
            return 3;
        }
        if (s == 4) {
            return 1;
        }
        return 0;
    }

    Object cannotOverride(Symbol.MethodSymbol m, Symbol.MethodSymbol other) {
        String key;
        if ((other.owner.flags() & 512) == 0) {
            key = "cant.override";
        } else if ((m.owner.flags() & 512) == 0) {
            key = "cant.implement";
        } else {
            key = "clashes.with";
        }
        return this.diags.fragment(key, m, m.location(), other, other.location());
    }

    Object uncheckedOverrides(Symbol.MethodSymbol m, Symbol.MethodSymbol other) {
        String key;
        if ((other.owner.flags() & 512) == 0) {
            key = "unchecked.override";
        } else if ((m.owner.flags() & 512) == 0) {
            key = "unchecked.implement";
        } else {
            key = "unchecked.clash.with";
        }
        return this.diags.fragment(key, m, m.location(), other, other.location());
    }

    Object varargsOverrides(Symbol.MethodSymbol m, Symbol.MethodSymbol other) {
        String key;
        if ((other.owner.flags() & 512) == 0) {
            key = "varargs.override";
        } else if ((m.owner.flags() & 512) == 0) {
            key = "varargs.implement";
        } else {
            key = "varargs.clash.with";
        }
        return this.diags.fragment(key, m, m.location(), other, other.location());
    }

    void checkOverride(JCTree tree, Symbol.MethodSymbol m, Symbol.MethodSymbol other, Symbol.ClassSymbol origin) {
        String str;
        Object objAsFlagSet;
        if ((m.flags() & 2147487744L) == 0 && (other.flags() & 4096) == 0) {
            if ((m.flags() & 8) != 0 && (other.flags() & 8) == 0) {
                this.f364log.error(TreeInfo.diagnosticPositionFor(m, tree), "override.static", cannotOverride(m, other));
                return;
            }
            if ((other.flags() & 16) != 0 || ((m.flags() & 8) == 0 && (other.flags() & 8) != 0)) {
                this.f364log.error(TreeInfo.diagnosticPositionFor(m, tree), "override.meth", cannotOverride(m, other), Flags.asFlagSet(other.flags() & 24));
                return;
            }
            if ((m.owner.flags() & 8192) != 0) {
                return;
            }
            if ((origin.flags() & 512) == 0 && protection(m.flags()) > protection(other.flags())) {
                Log c0730Log = this.f364log;
                JCDiagnostic.DiagnosticPosition diagnosticPositionDiagnosticPositionFor = TreeInfo.diagnosticPositionFor(m, tree);
                Object[] objArr = new Object[2];
                objArr[0] = cannotOverride(m, other);
                if (other.flags() == 0) {
                    objAsFlagSet = Flags.Flag.PACKAGE;
                } else {
                    objAsFlagSet = Flags.asFlagSet(other.flags() & 7);
                }
                objArr[1] = objAsFlagSet;
                c0730Log.error(diagnosticPositionDiagnosticPositionFor, "override.weaker.access", objArr);
                return;
            }
            Type mt = this.types.memberType(origin.type, m);
            Type ot = this.types.memberType(origin.type, other);
            List<Type> mtvars = mt.getTypeArguments();
            List<Type> otvars = ot.getTypeArguments();
            Object mtres = mt.mo574getReturnType();
            Type otres = this.types.subst(ot.mo574getReturnType(), otvars, mtvars);
            this.overrideWarner.clear();
            boolean resultTypesOK = this.types.returnTypeSubstitutable(mt, ot, otres, this.overrideWarner);
            if (!resultTypesOK) {
                if (this.allowCovariantReturns || m.owner == origin || !m.owner.isSubClass(other.owner, this.types)) {
                    this.f364log.error(TreeInfo.diagnosticPositionFor(m, tree), "override.incompatible.ret", cannotOverride(m, other), mtres, otres);
                    return;
                }
            } else if (this.overrideWarner.hasNonSilentLint(Lint.LintCategory.UNCHECKED)) {
                warnUnchecked(TreeInfo.diagnosticPositionFor(m, tree), "override.unchecked.ret", uncheckedOverrides(m, other), mtres, otres);
            }
            List<Type> otthrown = this.types.subst(ot.mo575getThrownTypes(), otvars, mtvars);
            List<Type> unhandledErased = unhandled(mt.mo575getThrownTypes(), this.types.erasure(otthrown));
            List<Type> unhandledUnerased = unhandled(mt.mo575getThrownTypes(), otthrown);
            if (unhandledErased.nonEmpty()) {
                this.f364log.error(TreeInfo.diagnosticPositionFor(m, tree), "override.meth.doesnt.throw", cannotOverride(m, other), unhandledUnerased.head);
                return;
            }
            if (unhandledUnerased.nonEmpty()) {
                warnUnchecked(TreeInfo.diagnosticPositionFor(m, tree), "override.unchecked.thrown", cannotOverride(m, other), unhandledUnerased.head);
                return;
            }
            if (((m.flags() ^ other.flags()) & Flags.VARARGS) != 0 && this.lint.isEnabled(Lint.LintCategory.OVERRIDES)) {
                Log c0730Log2 = this.f364log;
                JCDiagnostic.DiagnosticPosition diagnosticPositionDiagnosticPositionFor2 = TreeInfo.diagnosticPositionFor(m, tree);
                if ((m.flags() & Flags.VARARGS) != 0) {
                    str = "override.varargs.missing";
                } else {
                    str = "override.varargs.extra";
                }
                c0730Log2.warning(diagnosticPositionDiagnosticPositionFor2, str, varargsOverrides(m, other));
            }
            if ((other.flags() & Flags.BRIDGE) != 0) {
                this.f364log.warning(TreeInfo.diagnosticPositionFor(m, tree), "override.bridge", uncheckedOverrides(m, other));
            }
            if (!isDeprecatedOverrideIgnorable(other, origin)) {
                checkDeprecated(TreeInfo.diagnosticPositionFor(m, tree), m, other);
            }
        }
    }

    private boolean isDeprecatedOverrideIgnorable(Symbol.MethodSymbol m, Symbol.ClassSymbol origin) {
        Symbol.ClassSymbol mc = m.enclClass();
        Type st = this.types.supertype(origin.type);
        if (st.f344tag != 10) {
            return true;
        }
        Symbol.MethodSymbol stimpl = m.implementation((Symbol.ClassSymbol) st.tsym, this.types, false);
        if (mc == null || (mc.flags() & 512) == 0) {
            return stimpl != m;
        }
        List<Type> intfs = this.types.interfaces(origin.type);
        return (intfs.contains(mc.type) || stimpl == null) ? false : true;
    }

    public void checkCompatibleConcretes(JCDiagnostic.DiagnosticPosition pos, Type site) {
        long j;
        Type sup = this.types.supertype(site);
        int i = 10;
        if (sup.f344tag != 10) {
            return;
        }
        Type t1 = sup;
        while (t1.tsym.type.isParameterized()) {
            Scope.Entry e1 = t1.tsym.members().elems;
            while (e1 != null) {
                Symbol s1 = e1.f338sym;
                int i2 = 16;
                if (s1.kind == 16) {
                    long j2 = 2147487752L;
                    long j3 = 0;
                    if ((s1.flags() & 2147487752L) == 0 && s1.isInheritedIn(site.tsym, this.types) && ((Symbol.MethodSymbol) s1).implementation(site.tsym, this.types, true) == s1) {
                        Type st1 = this.types.memberType(t1, s1);
                        int s1ArgsLength = st1.mo573getParameterTypes().length();
                        if (st1 != s1.type) {
                            Type t2 = sup;
                            while (t2.f344tag == i) {
                                Scope.Entry e2 = t2.tsym.members().lookup(s1.name);
                                while (e2.scope != null) {
                                    Symbol s2 = e2.f338sym;
                                    if (s2 == s1) {
                                        j = j3;
                                    } else if (s2.kind == i2) {
                                        j = 0;
                                        if ((s2.flags() & j2) == 0 && s2.type.mo573getParameterTypes().length() == s1ArgsLength && s2.isInheritedIn(site.tsym, this.types) && ((Symbol.MethodSymbol) s2).implementation(site.tsym, this.types, true) == s2) {
                                            Type st2 = this.types.memberType(t2, s2);
                                            if (this.types.overrideEquivalent(st1, st2)) {
                                                this.f364log.error(pos, "concrete.inheritance.conflict", s1, t1, s2, t2, sup);
                                            }
                                        }
                                    } else {
                                        j = 0;
                                    }
                                    e2 = e2.next();
                                    j3 = j;
                                    i2 = 16;
                                    j2 = 2147487752L;
                                }
                                t2 = this.types.supertype(t2);
                                j3 = j3;
                                i = 10;
                                i2 = 16;
                                j2 = 2147487752L;
                            }
                        }
                    }
                }
                e1 = e1.sibling;
                i = 10;
            }
            t1 = this.types.supertype(t1);
            i = 10;
        }
    }

    public boolean checkCompatibleAbstracts(JCDiagnostic.DiagnosticPosition pos, Type t1, Type t2) {
        return checkCompatibleAbstracts(pos, t1, t2, this.types.makeCompoundType(t1, t2));
    }

    public boolean checkCompatibleAbstracts(JCDiagnostic.DiagnosticPosition pos, Type t1, Type t2, Type site) {
        return firstIncompatibility(pos, t1, t2, site) == null;
    }

    private Symbol firstIncompatibility(JCDiagnostic.DiagnosticPosition pos, Type t1, Type t2, Type site) {
        Map<Symbol.TypeSymbol, Type> interfaces2;
        Map<Symbol.TypeSymbol, Type> interfaces1 = new HashMap<>();
        closure(t1, interfaces1);
        if (t1 == t2) {
            interfaces2 = interfaces1;
        } else {
            interfaces2 = new HashMap<>();
            closure(t2, interfaces1, interfaces2);
        }
        for (Type t3 : interfaces1.values()) {
            for (Type t4 : interfaces2.values()) {
                Symbol s = firstDirectIncompatibility(pos, t3, t4, site);
                if (s != null) {
                    return s;
                }
            }
        }
        return null;
    }

    private void closure(Type t, Map<Symbol.TypeSymbol, Type> typeMap) {
        if (t.f344tag == 10 && typeMap.put(t.tsym, t) == null) {
            closure(this.types.supertype(t), typeMap);
            for (Type i : this.types.interfaces(t)) {
                closure(i, typeMap);
            }
        }
    }

    private void closure(Type t, Map<Symbol.TypeSymbol, Type> typesSkip, Map<Symbol.TypeSymbol, Type> typeMap) {
        if (t.f344tag == 10 && typesSkip.get(t.tsym) == null && typeMap.put(t.tsym, t) == null) {
            closure(this.types.supertype(t), typesSkip, typeMap);
            for (Type i : this.types.interfaces(t)) {
                closure(i, typesSkip, typeMap);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da A[SYNTHETIC] */
    private Symbol firstDirectIncompatibility(JCDiagnostic.DiagnosticPosition pos, Type t1, Type t2, Type site) {
        Symbol impl;
        Symbol impl2;
        Type st1;
        boolean compat;
        Type type = t1;
        Scope.Entry e1 = type.tsym.members().elems;
        while (e1 != null) {
            Symbol s1 = e1.f338sym;
            Type st2 = null;
            int i = 16;
            if (s1.kind == 16 && s1.isInheritedIn(site.tsym, this.types) && ((impl = ((Symbol.MethodSymbol) s1).implementation(site.tsym, this.types, false)) == null || (impl.flags() & 1024) != 0)) {
                Scope.Entry e2 = t2.tsym.members().lookup(s1.name);
                while (e2.scope != null) {
                    Symbol s2 = e2.f338sym;
                    if (s1 == s2) {
                        impl2 = impl;
                    } else if (s2.kind == i) {
                        if (s2.isInheritedIn(site.tsym, this.types)) {
                            if (st2 == null) {
                                st2 = this.types.memberType(type, s1);
                            }
                            Type st3 = this.types.memberType(t2, s2);
                            if (!this.types.overrideEquivalent(st2, st3)) {
                                st1 = st2;
                                impl2 = impl;
                                if (checkNameClash((Symbol.ClassSymbol) site.tsym, s1, s2) && !checkCommonOverriderIn(s1, s2, site)) {
                                    this.f364log.error(pos, "name.clash.same.erasure.no.override", s1, s1.location(), s2, s2.location());
                                    return s2;
                                }
                            } else {
                                List<Type> tvars1 = st2.getTypeArguments();
                                List<Type> tvars2 = st3.getTypeArguments();
                                Type rt1 = st2.mo574getReturnType();
                                Types types = this.types;
                                st1 = st2;
                                Type st4 = st3.mo574getReturnType();
                                Type rt2 = types.subst(st4, tvars2, tvars1);
                                if (this.types.isSameType(rt1, rt2)) {
                                    impl2 = impl;
                                } else {
                                    impl2 = impl;
                                    compat = (rt1.f344tag >= 10 && rt2.f344tag >= 10 && (this.types.covariantReturnType(rt1, rt2, Warner.noWarnings) || this.types.covariantReturnType(rt2, rt1, Warner.noWarnings))) || checkCommonOverriderIn(s1, s2, site);
                                    if (!compat) {
                                        this.f364log.error(pos, "types.incompatible.diff.ret", type, t2, ((Object) s2.name) + "(" + this.types.memberType(t2, s2).mo573getParameterTypes() + ")");
                                        return s2;
                                    }
                                }
                                if (!compat) {
                                    this.f364log.error(pos, "types.incompatible.diff.ret", type, t2, ((Object) s2.name) + "(" + this.types.memberType(t2, s2).mo573getParameterTypes() + ")");
                                    return s2;
                                }
                            }
                            st2 = st1;
                        } else {
                            impl2 = impl;
                        }
                    } else {
                        impl2 = impl;
                    }
                    e2 = e2.next();
                    type = t1;
                    impl = impl2;
                    i = 16;
                }
            }
            e1 = e1.sibling;
            type = t1;
        }
        return null;
    }

    boolean checkCommonOverriderIn(Symbol s1, Symbol s2, Type site) {
        Symbol symbol = s1;
        Symbol symbol2 = s2;
        Type type = site;
        Map<Symbol.TypeSymbol, Type> supertypes = new HashMap<>();
        Type st1 = this.types.memberType(type, symbol);
        Type st2 = this.types.memberType(type, symbol2);
        closure(type, supertypes);
        for (Type t : supertypes.values()) {
            Scope.Entry e = t.tsym.members().lookup(symbol.name);
            while (e.scope != null) {
                Symbol s3 = e.f338sym;
                if (s3 != symbol && s3 != symbol2 && s3.kind == 16) {
                    if ((s3.flags() & 2147487744L) == 0) {
                        Type st3 = this.types.memberType(type, s3);
                        if (this.types.overrideEquivalent(st3, st1) && this.types.overrideEquivalent(st3, st2)) {
                            if (s3.owner == type.tsym) {
                                return true;
                            }
                            List<Type> tvars1 = st1.getTypeArguments();
                            List<Type> tvars2 = st2.getTypeArguments();
                            List<Type> tvars3 = st3.getTypeArguments();
                            Type rt1 = st1.mo574getReturnType();
                            Type rt2 = st2.mo574getReturnType();
                            Type rt13 = this.types.subst(st3.mo574getReturnType(), tvars3, tvars1);
                            Type rt23 = this.types.subst(st3.mo574getReturnType(), tvars3, tvars2);
                            boolean compat = rt13.f344tag >= 10 && rt23.f344tag >= 10 && this.types.covariantReturnType(rt13, rt1, Warner.noWarnings) && this.types.covariantReturnType(rt23, rt2, Warner.noWarnings);
                            if (compat) {
                                return true;
                            }
                        }
                    }
                }
                e = e.next();
                symbol = s1;
                symbol2 = s2;
                type = site;
                supertypes = supertypes;
                st1 = st1;
            }
            symbol = s1;
            symbol2 = s2;
            type = site;
        }
        return false;
    }

    void checkOverride(JCTree tree, Symbol.MethodSymbol m) {
        Symbol.ClassSymbol origin = (Symbol.ClassSymbol) m.owner;
        if ((origin.flags() & 16384) != 0 && this.names.finalize.equals(m.name) && m.overrides(this.syms.enumFinalFinalize, origin, this.types, false)) {
            this.f364log.error(tree.m489pos(), "enum.no.finalize", new Object[0]);
            return;
        }
        Type t = origin.type;
        while (t.f344tag == 10) {
            if (t != origin.type) {
                checkOverride(tree, t, origin, m);
            }
            for (Type t2 : this.types.interfaces(t)) {
                checkOverride(tree, t2, origin, m);
            }
            t = this.types.supertype(t);
        }
    }

    void checkOverride(JCTree tree, Type site, Symbol.ClassSymbol origin, Symbol.MethodSymbol m) {
        Symbol.TypeSymbol c = site.tsym;
        for (Scope.Entry e = c.members().lookup(m.name); e.scope != null; e = e.next()) {
            if (m.overrides(e.f338sym, origin, this.types, false) && (e.f338sym.flags() & 1024) == 0) {
                checkOverride(tree, m, (Symbol.MethodSymbol) e.f338sym, origin);
            }
        }
    }

    private boolean checkNameClash(Symbol.ClassSymbol origin, Symbol s1, Symbol s2) {
        ClashFilter cf = new ClashFilter(origin.type);
        if (cf.accepts(s1) && cf.accepts(s2)) {
            Types types = this.types;
            if (types.hasSameArgs(s1.erasure(types), s2.erasure(this.types))) {
                return true;
            }
        }
        return false;
    }

    void checkAllDefined(JCDiagnostic.DiagnosticPosition pos, Symbol.ClassSymbol c) {
        try {
            Symbol.MethodSymbol undef = firstUndef(c, c);
            if (undef != null) {
                if ((c.flags() & 16384) != 0 && this.types.supertype(c.type).tsym == this.syms.enumSym && (c.flags() & 16) == 0) {
                    c.flags_field |= 1024;
                } else {
                    Symbol.MethodSymbol undef1 = new Symbol.MethodSymbol(undef.flags(), undef.name, this.types.memberType(c.type, undef), undef.owner);
                    this.f364log.error(pos, "does.not.override.abstract", c, undef1, undef1.location());
                }
            }
        } catch (Symbol.CompletionFailure ex) {
            completionError(pos, ex);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Symbol.MethodSymbol firstUndef(Symbol.ClassSymbol impl, Symbol.ClassSymbol c) {
        Symbol.MethodSymbol absmeth;
        Symbol.MethodSymbol implmeth;
        Symbol.MethodSymbol undef = null;
        if (c == impl || (c.flags() & 1536) != 0) {
            Scope s = c.members();
            for (Scope.Entry e = s.elems; undef == null && e != null; e = e.sibling) {
                if (e.f338sym.kind == 16 && (e.f338sym.flags() & 2098176) == 1024 && ((implmeth = (absmeth = (Symbol.MethodSymbol) e.f338sym).implementation(impl, this.types, true)) == null || implmeth == absmeth)) {
                    undef = absmeth;
                }
            }
            if (undef == null) {
                Type st = this.types.supertype(c.type);
                if (st.f344tag == 10) {
                    undef = firstUndef(impl, (Symbol.ClassSymbol) st.tsym);
                }
            }
            for (List listInterfaces = this.types.interfaces(c.type); undef == null && listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
                undef = firstUndef(impl, (Symbol.ClassSymbol) ((Type) listInterfaces.head).tsym);
            }
        }
        return undef;
    }

    void checkNonCyclicDecl(JCTree.JCClassDecl tree) {
        CycleChecker cc = new CycleChecker();
        cc.scan(tree);
        if (!cc.errorFound && !cc.partialCheck) {
            tree.f539sym.flags_field |= 1073741824;
        }
    }

    class CycleChecker extends TreeScanner {
        List<Symbol> seenClasses = List.m507nil();
        boolean errorFound = false;
        boolean partialCheck = false;

        CycleChecker() {
        }

        private void checkSymbol(JCDiagnostic.DiagnosticPosition pos, Symbol sym) {
            if (sym != null && sym.kind == 2) {
                Env<AttrContext> classEnv = Check.this.enter.getEnv((Symbol.TypeSymbol) sym);
                if (classEnv != null) {
                    DiagnosticSource prevSource = Check.this.f364log.currentSource();
                    try {
                        Check.this.f364log.useSource(classEnv.toplevel.sourcefile);
                        scan(classEnv.tree);
                        return;
                    } finally {
                        Check.this.f364log.useSource(prevSource.getFile());
                    }
                }
                if (sym.kind == 2) {
                    checkClass(pos, sym, List.m507nil());
                    return;
                }
                return;
            }
            this.partialCheck = true;
        }

        @Override
        public void visitSelect(JCTree.JCFieldAccess tree) {
            super.visitSelect(tree);
            checkSymbol(tree.m489pos(), tree.f542sym);
        }

        @Override
        public void visitIdent(JCTree.JCIdent tree) {
            checkSymbol(tree.m489pos(), tree.f543sym);
        }

        @Override
        public void visitTypeApply(JCTree.JCTypeApply tree) {
            scan(tree.clazz);
        }

        @Override
        public void visitTypeArray(JCTree.JCArrayTypeTree tree) {
            scan(tree.elemtype);
        }

        @Override
        public void visitClassDef(JCTree.JCClassDecl tree) {
            List<JCTree> supertypes = List.m507nil();
            if (tree.getExtendsClause() != null) {
                supertypes = supertypes.prepend(tree.getExtendsClause());
            }
            if (tree.getImplementsClause() != null) {
                for (JCTree intf : tree.getImplementsClause()) {
                    supertypes = supertypes.prepend(intf);
                }
            }
            checkClass(tree.m489pos(), tree.f539sym, supertypes);
        }

        void checkClass(JCDiagnostic.DiagnosticPosition pos, Symbol c, List<JCTree> supertypes) {
            if ((c.flags_field & 1073741824) != 0) {
                return;
            }
            if (this.seenClasses.contains(c)) {
                this.errorFound = true;
                Check.this.noteCyclic(pos, (Symbol.ClassSymbol) c);
                return;
            }
            if (!c.type.isErroneous()) {
                try {
                    this.seenClasses = this.seenClasses.prepend(c);
                    if (c.type.f344tag == 10) {
                        if (supertypes.nonEmpty()) {
                            scan(supertypes);
                        } else {
                            Type.ClassType ct = (Type.ClassType) c.type;
                            if (ct.supertype_field != null && ct.interfaces_field != null) {
                                checkSymbol(pos, ct.supertype_field.tsym);
                                for (Type intf : ct.interfaces_field) {
                                    checkSymbol(pos, intf.tsym);
                                }
                            }
                            this.partialCheck = true;
                            return;
                        }
                        if (c.owner.kind == 2) {
                            checkSymbol(pos, c.owner);
                        }
                    }
                } finally {
                    this.seenClasses = this.seenClasses.tail;
                }
            }
        }
    }

    void checkNonCyclic(JCDiagnostic.DiagnosticPosition pos, Type t) {
        checkNonCyclicInternal(pos, t);
    }

    void checkNonCyclic(JCDiagnostic.DiagnosticPosition pos, Type.TypeVar t) {
        checkNonCyclic1(pos, t, List.m507nil());
    }

    private void checkNonCyclic1(JCDiagnostic.DiagnosticPosition pos, Type t, List<Type.TypeVar> seen) {
        if (t.f344tag == 14 && (t.tsym.flags() & 268435456) != 0) {
            return;
        }
        if (seen.contains(t)) {
            ((Type.TypeVar) t).bound = this.types.createErrorType(t);
            this.f364log.error(pos, "cyclic.inheritance", t);
        } else if (t.f344tag == 14) {
            Type.TypeVar tv = (Type.TypeVar) t;
            List<Type.TypeVar> seen2 = seen.prepend(tv);
            for (Type b : this.types.getBounds(tv)) {
                checkNonCyclic1(pos, b, seen2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean checkNonCyclicInternal(JCDiagnostic.DiagnosticPosition pos, Type t) {
        Type st;
        boolean complete = true;
        Symbol c = t.tsym;
        if ((c.flags_field & 1073741824) != 0) {
            return true;
        }
        if ((c.flags_field & 134217728) != 0) {
            noteCyclic(pos, (Symbol.ClassSymbol) c);
        } else if (!c.type.isErroneous()) {
            try {
                c.flags_field = 134217728 | c.flags_field;
                if (c.type.f344tag == 10) {
                    Type.ClassType clazz = (Type.ClassType) c.type;
                    if (clazz.interfaces_field != null) {
                        for (List list = clazz.interfaces_field; list.nonEmpty(); list = list.tail) {
                            complete &= checkNonCyclicInternal(pos, (Type) list.head);
                        }
                    }
                    if (clazz.supertype_field != null && (st = clazz.supertype_field) != null && st.f344tag == 10) {
                        complete &= checkNonCyclicInternal(pos, st);
                    }
                    if (c.owner.kind == 2) {
                        complete &= checkNonCyclicInternal(pos, c.owner.type);
                    }
                }
                c.flags_field = (-134217729) & c.flags_field;
            } catch (Throwable th) {
                c.flags_field = (-134217729) & c.flags_field;
                throw th;
            }
        }
        if (complete) {
            complete = (c.flags_field & 268435456) == 0 && c.completer == null;
        }
        if (complete) {
            c.flags_field |= 1073741824;
        }
        return complete;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [A, com.sun.tools.javac.code.Type] */
    public void noteCyclic(JCDiagnostic.DiagnosticPosition pos, Symbol.ClassSymbol c) {
        this.f364log.error(pos, "cyclic.inheritance", c);
        for (List listInterfaces = this.types.interfaces(c.type); listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
            listInterfaces.head = this.types.createErrorType((Symbol.ClassSymbol) ((Type) listInterfaces.head).tsym, Type.noType);
        }
        Type st = this.types.supertype(c.type);
        if (st.f344tag == 10) {
            ((Type.ClassType) c.type).supertype_field = this.types.createErrorType((Symbol.ClassSymbol) st.tsym, Type.noType);
        }
        c.type = this.types.createErrorType(c, c.type);
        c.flags_field |= 1073741824;
    }

    void checkImplementations(JCTree.JCClassDecl tree) {
        checkImplementations(tree, tree.f539sym);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void checkImplementations(JCTree.JCClassDecl tree, Symbol.ClassSymbol ic) {
        Symbol.MethodSymbol absmeth;
        Symbol.MethodSymbol implmeth;
        Symbol.ClassSymbol origin = tree.f539sym;
        for (List listClosure = this.types.closure(ic.type); listClosure.nonEmpty(); listClosure = listClosure.tail) {
            Symbol.ClassSymbol lc = (Symbol.ClassSymbol) ((Type) listClosure.head).tsym;
            if ((this.allowGenerics || origin != lc) && (lc.flags() & 1024) != 0) {
                for (Scope.Entry e = lc.members().elems; e != null; e = e.sibling) {
                    if (e.f338sym.kind == 16 && (e.f338sym.flags() & 1032) == 1024 && (implmeth = (absmeth = (Symbol.MethodSymbol) e.f338sym).implementation(origin, this.types, false)) != null && implmeth != absmeth && (implmeth.owner.flags() & 512) == (512 & origin.flags())) {
                        checkOverride(tree, implmeth, absmeth, origin);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void checkCompatibleSupertypes(JCDiagnostic.DiagnosticPosition pos, Type c) {
        List<Type> supertypes = this.types.interfaces(c);
        Type supertype = this.types.supertype(c);
        if (supertype.f344tag == 10 && (supertype.tsym.flags() & 1024) != 0) {
            supertypes = supertypes.prepend(supertype);
        }
        for (List list = supertypes; list.nonEmpty(); list = list.tail) {
            if (this.allowGenerics && !((Type) list.head).getTypeArguments().isEmpty() && !checkCompatibleAbstracts(pos, (Type) list.head, (Type) list.head, c)) {
                return;
            }
            for (List list2 = supertypes; list2 != list; list2 = list2.tail) {
                if (!checkCompatibleAbstracts(pos, (Type) list.head, (Type) list2.head, c)) {
                    return;
                }
            }
        }
        checkCompatibleConcretes(pos, c);
    }

    void checkConflicts(JCDiagnostic.DiagnosticPosition pos, Symbol sym, Symbol.TypeSymbol c) {
        Type ct = c.type;
        while (ct != Type.noType) {
            for (Scope.Entry e = ct.tsym.members().lookup(sym.name); e.scope == ct.tsym.members(); e = e.next()) {
                if (sym.kind == e.f338sym.kind) {
                    Types types = this.types;
                    if (types.isSameType(types.erasure(sym.type), this.types.erasure(e.f338sym.type)) && sym != e.f338sym && (sym.flags() & 4096) != (e.f338sym.flags() & 4096) && (sym.flags() & 2097152) == 0 && (e.f338sym.flags() & 2097152) == 0 && (sym.flags() & Flags.BRIDGE) == 0 && (e.f338sym.flags() & Flags.BRIDGE) == 0) {
                        syntheticError(pos, (e.f338sym.flags() & 4096) == 0 ? e.f338sym : sym);
                        return;
                    }
                }
            }
            ct = this.types.supertype(ct);
        }
    }

    void checkOverrideClashes(JCDiagnostic.DiagnosticPosition pos, Type site, Symbol.MethodSymbol sym) {
        String key;
        ClashFilter cf = new ClashFilter(site);
        for (Symbol m1 : this.types.membersClosure(site, false).getElementsByName(sym.name, cf)) {
            if (sym.overrides(m1, site.tsym, this.types, false)) {
                for (Symbol m2 : this.types.membersClosure(site, false).getElementsByName(sym.name, cf)) {
                    if (m2 != m1 && !this.types.isSubSignature(sym.type, this.types.memberType(site, m2), false)) {
                        Types types = this.types;
                        if (types.hasSameArgs(m2.erasure(types), m1.erasure(this.types))) {
                            sym.flags_field |= Flags.CLASH;
                            if (m1 == sym) {
                                key = "name.clash.same.erasure.no.override";
                            } else {
                                key = "name.clash.same.erasure.no.override.1";
                            }
                            this.f364log.error(pos, key, sym, sym.location(), m2, m2.location(), m1, m1.location());
                            return;
                        }
                    }
                }
            }
        }
    }

    void checkHideClashes(JCDiagnostic.DiagnosticPosition pos, Type site, Symbol.MethodSymbol sym) {
        ClashFilter cf = new ClashFilter(site);
        for (Symbol s : this.types.membersClosure(site, true).getElementsByName(sym.name, cf)) {
            if (!this.types.isSubSignature(sym.type, this.types.memberType(site, s), false)) {
                Types types = this.types;
                if (types.hasSameArgs(s.erasure(types), sym.erasure(this.types))) {
                    this.f364log.error(pos, "name.clash.same.erasure.no.hide", sym, sym.location(), s, s.location());
                    return;
                }
            }
        }
    }

    private class ClashFilter implements Filter<Symbol> {
        Type site;

        ClashFilter(Type site) {
            this.site = site;
        }

        boolean shouldSkip(Symbol s) {
            return (s.flags() & Flags.CLASH) != 0 && s.owner == this.site.tsym;
        }

        @Override
        public boolean accepts(Symbol s) {
            return s.kind == 16 && (s.flags() & 4096) == 0 && !shouldSkip(s) && s.isInheritedIn(this.site.tsym, Check.this.types) && !s.isConstructor();
        }
    }

    private void syntheticError(JCDiagnostic.DiagnosticPosition pos, Symbol sym) {
        if (!sym.type.isErroneous()) {
            if (this.warnOnSyntheticConflicts) {
                this.f364log.warning(pos, "synthetic.name.conflict", sym, sym.location());
            } else {
                this.f364log.error(pos, "synthetic.name.conflict", sym, sym.location());
            }
        }
    }

    void checkClassBounds(JCDiagnostic.DiagnosticPosition pos, Type type) {
        checkClassBounds(pos, new HashMap(), type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void checkClassBounds(JCDiagnostic.DiagnosticPosition pos, Map<Symbol.TypeSymbol, Type> seensofar, Type type) {
        if (type.isErroneous()) {
            return;
        }
        for (List listInterfaces = this.types.interfaces(type); listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
            Type it = (Type) listInterfaces.head;
            Type oldit = seensofar.put(it.tsym, it);
            if (oldit != null) {
                List<Type> oldparams = oldit.allparams();
                List<Type> newparams = it.allparams();
                if (!this.types.containsTypeEquivalent(oldparams, newparams)) {
                    this.f364log.error(pos, "cant.inherit.diff.arg", it.tsym, Type.toString(oldparams), Type.toString(newparams));
                }
            }
            checkClassBounds(pos, seensofar, it);
        }
        Type st = this.types.supertype(type);
        if (st != null) {
            checkClassBounds(pos, seensofar, st);
        }
    }

    void checkNotRepeated(JCDiagnostic.DiagnosticPosition pos, Type it, Set<Type> its) {
        if (its.contains(it)) {
            this.f364log.error(pos, "repeated.interface", new Object[0]);
        } else {
            its.add(it);
        }
    }

    void validateAnnotationTree(JCTree tree) {
        tree.accept(new TreeScanner() {
            @Override
            public void visitAnnotation(JCTree.JCAnnotation tree2) {
                if (!tree2.type.isErroneous()) {
                    super.visitAnnotation(tree2);
                    Check.this.validateAnnotation(tree2);
                }
            }
        });
    }

    void validateAnnotationType(JCTree restype) {
        if (restype != null) {
            validateAnnotationType(restype.m489pos(), restype.type);
        }
    }

    void validateAnnotationType(JCDiagnostic.DiagnosticPosition pos, Type type) {
        if (type.isPrimitive() || this.types.isSameType(type, this.syms.stringType) || (type.tsym.flags() & 16384) != 0 || (type.tsym.flags() & 8192) != 0 || this.types.lowerBound(type).tsym == this.syms.classType.tsym) {
            return;
        }
        if (this.types.isArray(type)) {
            Types types = this.types;
            if (!types.isArray(types.elemtype(type))) {
                validateAnnotationType(pos, this.types.elemtype(type));
                return;
            }
        }
        this.f364log.error(pos, "invalid.annotation.member.type", new Object[0]);
    }

    void validateAnnotationMethod(JCDiagnostic.DiagnosticPosition pos, Symbol.MethodSymbol m) {
        Type sup = this.syms.annotationType;
        while (sup.f344tag == 10) {
            Scope s = sup.tsym.members();
            for (Scope.Entry e = s.lookup(m.name); e.scope != null; e = e.next()) {
                if (e.f338sym.kind == 16 && (e.f338sym.flags() & 5) != 0 && this.types.overrideEquivalent(m.type, e.f338sym.type)) {
                    this.f364log.error(pos, "intf.annotation.member.clash", e.f338sym, sup);
                }
            }
            sup = this.types.supertype(sup);
        }
    }

    public void validateAnnotations(List<JCTree.JCAnnotation> annotations, Symbol s) {
        if (this.skipAnnotations) {
            return;
        }
        for (JCTree.JCAnnotation a : annotations) {
            validateAnnotation(a, s);
        }
    }

    public void validateAnnotation(JCTree.JCAnnotation a, Symbol s) {
        validateAnnotationTree(a);
        if (!annotationApplicable(a, s)) {
            this.f364log.error(a.m489pos(), "annotation.type.not.applicable", new Object[0]);
        }
        if (a.annotationType.type.tsym == this.syms.overrideType.tsym && !isOverrider(s)) {
            this.f364log.error(a.m489pos(), "method.does.not.override.superclass", new Object[0]);
        }
    }

    boolean isOverrider(Symbol s) {
        if (s.kind != 16 || s.isStatic()) {
            return false;
        }
        Symbol.MethodSymbol m = (Symbol.MethodSymbol) s;
        Symbol.TypeSymbol owner = (Symbol.TypeSymbol) m.owner;
        for (Type sup : this.types.closure(owner.type)) {
            if (sup != owner.type) {
                Scope scope = sup.tsym.members();
                for (Scope.Entry e = scope.lookup(m.name); e.scope != null; e = e.next()) {
                    if (!e.f338sym.isStatic() && m.overrides(e.f338sym, owner, this.types, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean annotationApplicable(JCTree.JCAnnotation a, Symbol s) {
        Attribute.Compound atTarget = a.annotationType.type.tsym.attribute(this.syms.annotationTargetType.tsym);
        if (atTarget == null) {
            return true;
        }
        Attribute atValue = atTarget.member(this.names.value);
        if (!(atValue instanceof Attribute.Array)) {
            return true;
        }
        Attribute.Array arr = (Attribute.Array) atValue;
        for (Attribute app : arr.values) {
            if (!(app instanceof Attribute.Enum)) {
                return true;
            }
            Attribute.Enum e = (Attribute.Enum) app;
            if (e.value.name != this.names.TYPE) {
                if (e.value.name != this.names.FIELD) {
                    if (e.value.name != this.names.METHOD) {
                        if (e.value.name != this.names.PARAMETER) {
                            if (e.value.name != this.names.CONSTRUCTOR) {
                                if (e.value.name != this.names.LOCAL_VARIABLE) {
                                    if (e.value.name != this.names.ANNOTATION_TYPE) {
                                        if (e.value.name != this.names.PACKAGE) {
                                            if (e.value.name != this.names.TYPE_USE || s.kind == 2 || s.kind == 4 || (s.kind == 16 && !s.isConstructor() && s.type.mo574getReturnType().f344tag != 9)) {
                                                return true;
                                            }
                                        } else if (s.kind == 1) {
                                            return true;
                                        }
                                    } else if (s.kind == 2 && (s.flags() & 8192) != 0) {
                                        return true;
                                    }
                                } else if (s.kind == 4 && s.owner.kind == 16 && (s.flags() & Flags.PARAMETER) == 0) {
                                    return true;
                                }
                            } else if (s.kind == 16 && s.isConstructor()) {
                                return true;
                            }
                        } else if (s.kind == 4 && s.owner.kind == 16 && (s.flags() & Flags.PARAMETER) != 0) {
                            return true;
                        }
                    } else if (s.kind == 16 && !s.isConstructor()) {
                        return true;
                    }
                } else if (s.kind == 4 && s.owner.kind != 16) {
                    return true;
                }
            } else if (s.kind == 2) {
                return true;
            }
        }
        return false;
    }

    public void validateAnnotation(JCTree.JCAnnotation a) {
        String key;
        Set<Symbol.MethodSymbol> members = new TreeSet<>(new Comparator<Symbol>() {
            @Override
            public int compare(Symbol t, Symbol t1) {
                return t.name.compareTo(t1.name);
            }
        });
        for (Scope.Entry e = a.annotationType.type.tsym.members().elems; e != null; e = e.sibling) {
            if (e.f338sym.kind == 16) {
                members.add((Symbol.MethodSymbol) e.f338sym);
            }
        }
        for (JCTree arg : a.args) {
            if (arg.getTag() == 30) {
                JCTree.JCAssign assign = (JCTree.JCAssign) arg;
                Symbol m = TreeInfo.symbol(assign.f532lhs);
                if (m != null && !m.type.isErroneous() && !members.remove(m)) {
                    this.f364log.error(assign.f532lhs.m489pos(), "duplicate.annotation.member.value", m.name, a.type);
                }
            }
        }
        ListBuffer<Name> missingDefaults = ListBuffer.m512lb();
        for (Symbol.MethodSymbol m2 : members) {
            if (m2.defaultValue == null && !m2.type.isErroneous()) {
                missingDefaults.append(m2.name);
            }
        }
        if (missingDefaults.nonEmpty()) {
            if (missingDefaults.size() > 1) {
                key = "annotation.missing.default.value.1";
            } else {
                key = "annotation.missing.default.value";
            }
            this.f364log.error(a.m489pos(), key, a.type, missingDefaults);
        }
        if (a.annotationType.type.tsym == this.syms.annotationTargetType.tsym && a.args.tail != null && a.args.head.getTag() == 30) {
            JCTree.JCAssign assign2 = (JCTree.JCAssign) a.args.head;
            if (TreeInfo.symbol(assign2.f532lhs).name != this.names.value) {
                return;
            }
            JCTree rhs = assign2.f533rhs;
            if (rhs.getTag() != 28) {
                return;
            }
            JCTree.JCNewArray na = (JCTree.JCNewArray) rhs;
            Set<Symbol> targets = new HashSet<>();
            for (JCTree elem : na.elems) {
                if (!targets.add(TreeInfo.symbol(elem))) {
                    this.f364log.error(elem.m489pos(), "repeated.annotation.target", new Object[0]);
                }
            }
        }
    }

    void checkDeprecatedAnnotation(JCDiagnostic.DiagnosticPosition pos, Symbol s) {
        if (this.allowAnnotations && this.lint.isEnabled(Lint.LintCategory.DEP_ANN) && (s.flags() & 131072) != 0 && !this.syms.deprecatedType.isErroneous() && s.attribute(this.syms.deprecatedType.tsym) == null) {
            this.f364log.warning(Lint.LintCategory.DEP_ANN, pos, "missing.deprecated.annotation", new Object[0]);
        }
    }

    void checkDeprecated(final JCDiagnostic.DiagnosticPosition pos, Symbol other, final Symbol s) {
        if ((s.flags() & 131072) != 0 && (other.flags() & 131072) == 0 && s.outermostClass() != other.outermostClass()) {
            this.deferredLintHandler.report(new DeferredLintHandler.LintLogger() {
                @Override
                public void report() {
                    Check.this.warnDeprecated(pos, s);
                }
            });
        }
    }

    void checkSunAPI(final JCDiagnostic.DiagnosticPosition pos, final Symbol s) {
        if ((s.flags() & Flags.PROPRIETARY) != 0) {
            this.deferredLintHandler.report(new DeferredLintHandler.LintLogger() {
                @Override
                public void report() {
                    if (!Check.this.enableSunApiLintControl) {
                        Check.this.f364log.strictWarning(pos, "sun.proprietary", s);
                    } else {
                        Check.this.warnSunApi(pos, "sun.proprietary", s);
                    }
                }
            });
        }
    }

    void checkNonCyclicElements(JCTree.JCClassDecl tree) {
        if ((tree.f539sym.flags_field & 8192) == 0) {
            return;
        }
        Assert.check((tree.f539sym.flags_field & 134217728) == 0);
        try {
            Symbol.ClassSymbol classSymbol = tree.f539sym;
            classSymbol.flags_field = 134217728 | classSymbol.flags_field;
            for (JCTree def : tree.defs) {
                if (def.getTag() == 4) {
                    JCTree.JCMethodDecl meth = (JCTree.JCMethodDecl) def;
                    checkAnnotationResType(meth.m489pos(), meth.restype.type);
                }
            }
            Symbol.ClassSymbol classSymbol2 = tree.f539sym;
            classSymbol2.flags_field = (-134217729) & classSymbol2.flags_field;
            Symbol.ClassSymbol classSymbol3 = tree.f539sym;
            classSymbol3.flags_field = Flags.ACYCLIC_ANN | classSymbol3.flags_field;
        } catch (Throwable th) {
            Symbol.ClassSymbol classSymbol4 = tree.f539sym;
            classSymbol4.flags_field = (-134217729) & classSymbol4.flags_field;
            Symbol.ClassSymbol classSymbol5 = tree.f539sym;
            classSymbol5.flags_field = Flags.ACYCLIC_ANN | classSymbol5.flags_field;
            throw th;
        }
    }

    void checkNonCyclicElementsInternal(JCDiagnostic.DiagnosticPosition pos, Symbol.TypeSymbol tsym) {
        if ((tsym.flags_field & Flags.ACYCLIC_ANN) != 0) {
            return;
        }
        if ((tsym.flags_field & 134217728) != 0) {
            this.f364log.error(pos, "cyclic.annotation.element", new Object[0]);
            return;
        }
        try {
            tsym.flags_field |= 134217728;
            for (Scope.Entry e = tsym.members().elems; e != null; e = e.sibling) {
                Symbol s = e.f338sym;
                if (s.kind == 16) {
                    checkAnnotationResType(pos, ((Symbol.MethodSymbol) s).type.mo574getReturnType());
                }
            }
        } finally {
            tsym.flags_field = (-134217729) & tsym.flags_field;
            tsym.flags_field |= Flags.ACYCLIC_ANN;
        }
    }

    void checkAnnotationResType(JCDiagnostic.DiagnosticPosition pos, Type type) {
        int i = type.f344tag;
        if (i != 10) {
            if (i == 11) {
                checkAnnotationResType(pos, this.types.elemtype(type));
            }
        } else if ((type.tsym.flags() & 8192) != 0) {
            checkNonCyclicElementsInternal(pos, type.tsym);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void checkCyclicConstructors(JCTree.JCClassDecl tree) {
        Map<Symbol, Symbol> callMap = new HashMap<>();
        for (List list = tree.defs; list.nonEmpty(); list = list.tail) {
            JCTree.JCMethodInvocation app = TreeInfo.firstConstructorCall((JCTree) list.head);
            if (app != null) {
                JCTree.JCMethodDecl meth = (JCTree.JCMethodDecl) list.head;
                if (TreeInfo.name(app.meth) == this.names._this) {
                    callMap.put(meth.f544sym, TreeInfo.symbol(app.meth));
                } else {
                    meth.f544sym.flags_field |= 1073741824;
                }
            }
        }
        Symbol[] ctors = (Symbol[]) callMap.keySet().toArray(new Symbol[0]);
        for (Symbol caller : ctors) {
            checkCyclicConstructor(tree, caller, callMap);
        }
    }

    private void checkCyclicConstructor(JCTree.JCClassDecl tree, Symbol ctor, Map<Symbol, Symbol> callMap) {
        if (ctor != null && (ctor.flags_field & 1073741824) == 0) {
            if ((ctor.flags_field & 134217728) != 0) {
                this.f364log.error(TreeInfo.diagnosticPositionFor(ctor, tree), "recursive.ctor.invocation", new Object[0]);
            } else {
                ctor.flags_field |= 134217728;
                checkCyclicConstructor(tree, callMap.remove(ctor), callMap);
                ctor.flags_field &= -134217729;
            }
            ctor.flags_field |= 1073741824;
        }
    }

    int checkOperator(JCDiagnostic.DiagnosticPosition pos, Symbol.OperatorSymbol operator, int tag, Type left, Type right) {
        if (operator.opcode == 277) {
            this.f364log.error(pos, "operator.cant.be.applied.1", this.treeinfo.operatorName(tag), left, right);
        }
        return operator.opcode;
    }

    void checkDivZero(JCDiagnostic.DiagnosticPosition pos, Symbol operator, Type operand) {
        if (operand.constValue() != null && this.lint.isEnabled(Lint.LintCategory.DIVZERO) && operand.f344tag <= 5 && ((Number) operand.constValue()).longValue() == 0) {
            int opc = ((Symbol.OperatorSymbol) operator).opcode;
            if (opc == 108 || opc == 112 || opc == 109 || opc == 113) {
                this.f364log.warning(Lint.LintCategory.DIVZERO, pos, "div.zero", new Object[0]);
            }
        }
    }

    void checkEmptyIf(JCTree.JCIf tree) {
        if (tree.thenpart.getTag() == 6 && tree.elsepart == null && this.lint.isEnabled(Lint.LintCategory.EMPTY)) {
            this.f364log.warning(Lint.LintCategory.EMPTY, tree.thenpart.m489pos(), "empty.if", new Object[0]);
        }
    }

    boolean checkUnique(JCDiagnostic.DiagnosticPosition pos, Symbol sym, Scope s) {
        if (sym.type.isErroneous()) {
            return true;
        }
        if (sym.owner.name == this.names.f574any) {
            return false;
        }
        for (Scope.Entry e = s.lookup(sym.name); e.scope == s; e = e.next()) {
            if (sym != e.f338sym && (e.f338sym.flags() & Flags.CLASH) == 0 && sym.kind == e.f338sym.kind && sym.name != this.names.error) {
                if (sym.kind == 16) {
                    Types types = this.types;
                    if (types.hasSameArgs(types.erasure(sym.type), this.types.erasure(e.f338sym.type))) {
                    }
                }
                if ((sym.flags() & Flags.VARARGS) != (e.f338sym.flags() & Flags.VARARGS)) {
                    varargsDuplicateError(pos, sym, e.f338sym);
                    return true;
                }
                if (sym.kind != 16 || this.types.hasSameArgs(sym.type, e.f338sym.type, false)) {
                    duplicateError(pos, e.f338sym);
                    return false;
                }
                duplicateErasureError(pos, sym, e.f338sym);
                sym.flags_field |= Flags.CLASH;
                return true;
            }
        }
        return true;
    }

    void duplicateErasureError(JCDiagnostic.DiagnosticPosition pos, Symbol sym1, Symbol sym2) {
        if (!sym1.type.isErroneous() && !sym2.type.isErroneous()) {
            this.f364log.error(pos, "name.clash.same.erasure", sym1, sym2);
        }
    }

    boolean checkUniqueImport(JCDiagnostic.DiagnosticPosition pos, Symbol sym, Scope s) {
        return checkUniqueImport(pos, sym, s, false);
    }

    boolean checkUniqueStaticImport(JCDiagnostic.DiagnosticPosition pos, Symbol sym, Scope s) {
        return checkUniqueImport(pos, sym, s, true);
    }

    private boolean checkUniqueImport(JCDiagnostic.DiagnosticPosition pos, Symbol sym, Scope s, boolean staticImport) {
        for (Scope.Entry e = s.lookup(sym.name); e.scope != null; e = e.next()) {
            boolean isClassDecl = e.scope == s;
            if ((isClassDecl || sym != e.f338sym) && sym.kind == e.f338sym.kind && sym.name != this.names.error) {
                if (!e.f338sym.type.isErroneous()) {
                    String what = e.f338sym.toString();
                    if (!isClassDecl) {
                        if (staticImport) {
                            this.f364log.error(pos, "already.defined.static.single.import", what);
                        } else {
                            this.f364log.error(pos, "already.defined.single.import", what);
                        }
                    } else if (sym != e.f338sym) {
                        this.f364log.error(pos, "already.defined.this.unit", what);
                    }
                }
                return false;
            }
        }
        return true;
    }

    public void checkCanonical(JCTree tree) {
        if (!isCanonical(tree)) {
            this.f364log.error(tree.m489pos(), "import.requires.canonical", TreeInfo.symbol(tree));
        }
    }

    private boolean isCanonical(JCTree tree) {
        while (tree.getTag() == 34) {
            JCTree.JCFieldAccess s = (JCTree.JCFieldAccess) tree;
            if (s.f542sym.owner != TreeInfo.symbol(s.selected)) {
                return false;
            }
            tree = s.selected;
        }
        return true;
    }

    private class ConversionWarner extends Warner {
        final Type expected;
        final Type found;
        final String uncheckedKey;

        public ConversionWarner(JCDiagnostic.DiagnosticPosition pos, String uncheckedKey, Type found, Type expected) {
            super(pos);
            this.uncheckedKey = uncheckedKey;
            this.found = found;
            this.expected = expected;
        }

        @Override
        public void warn(Lint.LintCategory lint) {
            boolean warned = this.warned;
            super.warn(lint);
            if (warned) {
                return;
            }
            int i = C06205.f365xe1a1692[lint.ordinal()];
            if (i == 1) {
                Check.this.warnUnchecked(m520pos(), "prob.found.req", Check.this.diags.fragment(this.uncheckedKey, new Object[0]), this.found, this.expected);
                return;
            }
            if (i == 2) {
                if (Check.this.method != null && Check.this.method.attribute(Check.this.syms.trustMeType.tsym) != null) {
                    Check check = Check.this;
                    if (check.isTrustMeAllowedOnMethod(check.method) && !Check.this.types.isReifiable(Check.this.method.type.mo573getParameterTypes().last())) {
                        Check.this.warnUnsafeVararg(m520pos(), "varargs.unsafe.use.varargs.param", Check.this.method.params.last());
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError("Unexpected lint: " + lint);
        }
    }

    static class C06205 {

        static final int[] f365xe1a1692;

        static {
            int[] iArr = new int[Lint.LintCategory.values().length];
            f365xe1a1692 = iArr;
            try {
                iArr[Lint.LintCategory.UNCHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f365xe1a1692[Lint.LintCategory.VARARGS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public Warner castWarner(JCDiagnostic.DiagnosticPosition pos, Type found, Type expected) {
        return new ConversionWarner(pos, "unchecked.cast.to.type", found, expected);
    }

    public Warner convertWarner(JCDiagnostic.DiagnosticPosition pos, Type found, Type expected) {
        return new ConversionWarner(pos, "unchecked.assign", found, expected);
    }
}
