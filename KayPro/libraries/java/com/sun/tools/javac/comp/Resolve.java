package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Kinds;
import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.api.Formattable;
import com.sun.tools.javac.jvm.ClassReader;
import com.sun.tools.javac.jvm.Target;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.DiagnosticSource;
import com.sun.tools.javac.util.FatalError;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Options;
import com.sun.tools.javac.util.Warner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.lang.model.element.ElementVisitor;

public class Resolve {
    protected static final Context.C0723Key<Resolve> resolveKey = new Context.C0723Key<>();
    public final boolean allowMethodHandles;
    public final boolean boxingEnabled;

    Check f386chk;
    private final boolean debugResolve;
    JCDiagnostic.Factory diags;
    private final InapplicableMethodException inapplicableMethodException;
    Infer infer;

    Log f387log;
    final SymbolNotFoundError methodNotFound;
    Names names;
    Scope polymorphicSignatureScope;
    ClassReader reader;
    Symtab syms;
    TreeInfo treeinfo;
    final SymbolNotFoundError typeNotFound;
    Types types;
    final SymbolNotFoundError varNotFound;
    public final boolean varargsEnabled;
    final InapplicableSymbolError wrongMethod;
    final InapplicableSymbolsError wrongMethods;
    Warner noteWarner = new Warner();
    private final Formattable.LocalizedString noArgs = new Formattable.LocalizedString("compiler.misc.no.args");
    private Map<MethodResolutionPhase, Symbol> methodResolutionCache = new HashMap(MethodResolutionPhase.values().length);
    final List<MethodResolutionPhase> methodResolutionSteps = List.m510of(MethodResolutionPhase.BASIC, MethodResolutionPhase.BOX, MethodResolutionPhase.VARARITY);
    private MethodResolutionPhase currentStep = null;

    public static Resolve instance(Context context) {
        Resolve instance = (Resolve) context.m501get(resolveKey);
        if (instance == null) {
            return new Resolve(context);
        }
        return instance;
    }

    protected Resolve(Context context) {
        context.m504put(resolveKey, this);
        this.syms = Symtab.instance(context);
        this.varNotFound = new SymbolNotFoundError(68);
        this.wrongMethod = new InapplicableSymbolError(this.syms.errSymbol);
        this.wrongMethods = new InapplicableSymbolsError(this.syms.errSymbol);
        this.methodNotFound = new SymbolNotFoundError(71);
        this.typeNotFound = new SymbolNotFoundError(72);
        this.names = Names.instance(context);
        this.f387log = Log.instance(context);
        this.f386chk = Check.instance(context);
        this.infer = Infer.instance(context);
        this.reader = ClassReader.instance(context);
        this.treeinfo = TreeInfo.instance(context);
        this.types = Types.instance(context);
        this.diags = JCDiagnostic.Factory.instance(context);
        Source source = Source.instance(context);
        this.boxingEnabled = source.allowBoxing();
        this.varargsEnabled = source.allowVarargs();
        Options options = Options.instance(context);
        this.debugResolve = options.isSet("debugresolve");
        Target target = Target.instance(context);
        this.allowMethodHandles = target.hasMethodHandles();
        this.polymorphicSignatureScope = new Scope(this.syms.noSymbol);
        this.inapplicableMethodException = new InapplicableMethodException(this.diags);
    }

    static boolean isStatic(Env<AttrContext> env) {
        return env.info.staticLevel > env.outer.info.staticLevel;
    }

    static boolean isInitializer(Env<AttrContext> env) {
        Symbol owner = env.info.scope.owner;
        return owner.isConstructor() || (owner.owner.kind == 2 && ((owner.kind == 4 || (owner.kind == 16 && (owner.flags() & 1048576) != 0)) && (owner.flags() & 8) == 0));
    }

    public boolean isAccessible(Env<AttrContext> env, Symbol.TypeSymbol c) {
        return isAccessible(env, c, false);
    }

    public boolean isAccessible(Env<AttrContext> env, Symbol.TypeSymbol c, boolean checkInner) {
        boolean isAccessible;
        short sFlags = (short) (c.flags() & 7);
        if (sFlags == 0) {
            isAccessible = env.toplevel.packge == c.owner || env.toplevel.packge == c.packge() || !(env.enclMethod == null || (env.enclMethod.mods.flags & 536870912) == 0);
        } else if (sFlags == 2) {
            isAccessible = env.enclClass.f539sym.outermostClass() == c.owner.outermostClass();
        } else if (sFlags != 4) {
            isAccessible = true;
        } else {
            isAccessible = env.toplevel.packge == c.owner || env.toplevel.packge == c.packge() || isInnerSubClass(env.enclClass.f539sym, c.owner);
        }
        if (!checkInner || c.type.getEnclosingType() == Type.noType) {
            return isAccessible;
        }
        return isAccessible && isAccessible(env, c.type.getEnclosingType(), checkInner);
    }

    private boolean isInnerSubClass(Symbol.ClassSymbol c, Symbol base) {
        while (c != null && !c.isSubClass(base, this.types)) {
            c = c.owner.enclClass();
        }
        return c != null;
    }

    boolean isAccessible(Env<AttrContext> env, Type t) {
        return isAccessible(env, t, false);
    }

    boolean isAccessible(Env<AttrContext> env, Type t, boolean checkInner) {
        if (t.f344tag == 11) {
            return isAccessible(env, this.types.elemtype(t));
        }
        return isAccessible(env, t.tsym, checkInner);
    }

    public boolean isAccessible(Env<AttrContext> env, Type site, Symbol sym) {
        return isAccessible(env, site, sym, false);
    }

    public boolean isAccessible(Env<AttrContext> env, Type site, Symbol sym, boolean checkInner) {
        if (sym.name == this.names.init && sym.owner != site.tsym) {
            return false;
        }
        short sFlags = (short) (sym.flags() & 7);
        if (sFlags == 0) {
            return (env.toplevel.packge == sym.owner.owner || env.toplevel.packge == sym.packge()) && isAccessible(env, site, checkInner) && sym.isInheritedIn(site.tsym, this.types) && notOverriddenIn(site, sym);
        }
        if (sFlags == 2) {
            return (env.enclClass.f539sym == sym.owner || env.enclClass.f539sym.outermostClass() == sym.owner.outermostClass()) && sym.isInheritedIn(site.tsym, this.types);
        }
        if (sFlags != 4) {
            return isAccessible(env, site, checkInner) && notOverriddenIn(site, sym);
        }
        return (env.toplevel.packge == sym.owner.owner || env.toplevel.packge == sym.packge() || isProtectedAccessible(sym, env.enclClass.f539sym, site) || (env.info.selectSuper && (sym.flags() & 8) == 0 && sym.kind != 2)) && isAccessible(env, site, checkInner) && notOverriddenIn(site, sym);
    }

    private boolean notOverriddenIn(Type site, Symbol sym) {
        Symbol s2;
        if (sym.kind != 16 || sym.isConstructor() || sym.isStatic() || (s2 = ((Symbol.MethodSymbol) sym).implementation(site.tsym, this.types, true)) == null || s2 == sym || sym.owner == s2.owner || s2.isPolymorphicSignatureGeneric()) {
            return true;
        }
        Types types = this.types;
        return !types.isSubSignature(types.memberType(site, s2), this.types.memberType(site, sym));
    }

    private boolean isProtectedAccessible(Symbol sym, Symbol.ClassSymbol c, Type site) {
        while (c != null && (!c.isSubClass(sym.owner, this.types) || (c.flags() & 512) != 0 || ((sym.flags() & 8) == 0 && sym.kind != 2 && !site.tsym.isSubClass(c, this.types)))) {
            c = c.owner.enclClass();
        }
        return c != null;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0148  */
    /* JADX WARN: Code duplicated, block: B:67:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0152  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Code duplicated, block: B:71:0x0185  */
    /* JADX WARN: Code duplicated, block: B:76:0x014b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    Type rawInstantiate(Env<AttrContext> env, Type site, Symbol m, List<Type> argtypes, List<Type> typeargtypes, boolean allowBoxing, boolean useVarargs, Warner warn) throws Infer.InferenceException {
        boolean z;
        Type mt;
        List<Type> tvars;
        List list;
        boolean instNeeded;
        boolean polymorphicSignature = m.isPolymorphicSignatureGeneric() && this.allowMethodHandles;
        if (useVarargs && (m.flags() & Flags.VARARGS) == 0) {
            throw this.inapplicableMethodException.setMessage();
        }
        Type mt2 = this.types.memberType(site, m);
        List<Type> tvars2 = null;
        if (env.info.tvars != null) {
            tvars2 = this.types.newInstances(env.info.tvars);
            mt2 = this.types.subst(mt2, env.info.tvars, tvars2);
        }
        List<Type> typeargtypes2 = typeargtypes == null ? List.m507nil() : typeargtypes;
        if (mt2.f344tag == 16 || !typeargtypes2.nonEmpty()) {
            if (mt2.f344tag == 16 && typeargtypes2.nonEmpty()) {
                Type.ForAll pmt = (Type.ForAll) mt2;
                if (typeargtypes2.length() != pmt.tvars.length()) {
                    throw this.inapplicableMethodException.setMessage("arg.length.mismatch");
                }
                List list2 = pmt.tvars;
                for (List list3 = typeargtypes2; list2.nonEmpty() && list3.nonEmpty(); list3 = list3.tail) {
                    Types types = this.types;
                    for (List listSubst = types.subst(types.getBounds((Type.TypeVar) list2.head), pmt.tvars, typeargtypes2); listSubst.nonEmpty(); listSubst = listSubst.tail) {
                        if (!this.types.isSubtypeUnchecked((Type) list3.head, (Type) listSubst.head, warn)) {
                            throw this.inapplicableMethodException.setMessage("explicit.param.do.not.conform.to.bounds", list3.head, listSubst);
                        }
                    }
                    list2 = list2.tail;
                }
                z = true;
                mt = this.types.subst(pmt.qtype, pmt.tvars, typeargtypes2);
                tvars = tvars2;
            } else {
                z = true;
                if (mt2.f344tag == 16) {
                    Type.ForAll pmt2 = (Type.ForAll) mt2;
                    List<Type> tvars1 = this.types.newInstances(pmt2.tvars);
                    List<Type> tvars3 = tvars2.appendList(tvars1);
                    mt = this.types.subst(pmt2.qtype, pmt2.tvars, tvars1);
                    tvars = tvars3;
                }
            }
            if (tvars.tail == null && !polymorphicSignature) {
                z = false;
            }
            boolean instNeeded2 = z;
            instNeeded = instNeeded2;
            for (list = argtypes; list.tail != null && !instNeeded; list = list.tail) {
                if (((Type) list.head).f344tag == 16) {
                    instNeeded = true;
                }
            }
            if (instNeeded) {
                if (polymorphicSignature) {
                    return this.infer.instantiatePolymorphicSignatureInstance(env, site, m.name, (Symbol.MethodSymbol) m, argtypes);
                }
                return this.infer.instantiateMethod(env, tvars, (Type.MethodType) mt, m, argtypes, allowBoxing, useVarargs, warn);
            }
            checkRawArgumentsAcceptable(env, argtypes, mt.mo573getParameterTypes(), allowBoxing, useVarargs, warn);
            return mt;
        }
        z = true;
        mt = mt2;
        tvars = tvars2;
        if (tvars.tail == null) {
            z = false;
        }
        boolean instNeeded3 = z;
        instNeeded = instNeeded3;
        while (list.tail != null) {
            if (((Type) list.head).f344tag == 16) {
                instNeeded = true;
            }
        }
        if (instNeeded) {
            if (polymorphicSignature) {
                return this.infer.instantiatePolymorphicSignatureInstance(env, site, m.name, (Symbol.MethodSymbol) m, argtypes);
            }
            return this.infer.instantiateMethod(env, tvars, (Type.MethodType) mt, m, argtypes, allowBoxing, useVarargs, warn);
        }
        checkRawArgumentsAcceptable(env, argtypes, mt.mo573getParameterTypes(), allowBoxing, useVarargs, warn);
        return mt;
    }

    Type instantiate(Env<AttrContext> env, Type site, Symbol m, List<Type> argtypes, List<Type> typeargtypes, boolean allowBoxing, boolean useVarargs, Warner warn) {
        try {
            return rawInstantiate(env, site, m, argtypes, typeargtypes, allowBoxing, useVarargs, warn);
        } catch (InapplicableMethodException e) {
            return null;
        }
    }

    boolean argumentsAcceptable(Env<AttrContext> env, List<Type> argtypes, List<Type> formals, boolean allowBoxing, boolean useVarargs, Warner warn) {
        try {
            checkRawArgumentsAcceptable(env, argtypes, formals, allowBoxing, useVarargs, warn);
            return true;
        } catch (InapplicableMethodException e) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.sun.tools.javac.util.List, com.sun.tools.javac.util.List<com.sun.tools.javac.code.Type>] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.sun.tools.javac.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.sun.tools.javac.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.sun.tools.javac.util.List<A>] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.sun.tools.javac.util.List, com.sun.tools.javac.util.List<com.sun.tools.javac.code.Type>] */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.sun.tools.javac.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.sun.tools.javac.util.List<A>] */
    void checkRawArgumentsAcceptable(Env<AttrContext> c0621Env, List<Type> list, List<Type> list2, boolean z, boolean z2, Warner warner) {
        boolean zIsSubtypeUnchecked;
        Type type = z2 ? (Type) list2.last() : null;
        if (type == null && list.size() != list2.size()) {
            throw this.inapplicableMethodException.setMessage("arg.length.mismatch");
        }
        while (list.nonEmpty() && list2.head != type) {
            if (z) {
                zIsSubtypeUnchecked = this.types.isConvertible((Type) list.head, (Type) list2.head, warner);
            } else {
                zIsSubtypeUnchecked = this.types.isSubtypeUnchecked((Type) list.head, (Type) list2.head, warner);
            }
            if (!zIsSubtypeUnchecked) {
                throw this.inapplicableMethodException.setMessage("no.conforming.assignment.exists", list.head, list2.head);
            }
            list = list.tail;
            list2 = list2.tail;
        }
        if (list2.head != type) {
            throw this.inapplicableMethodException.setMessage("arg.length.mismatch");
        }
        if (z2) {
            Type typeElemtype = this.types.elemtype(type);
            for (?? r10 = list; r10.nonEmpty(); r10 = r10.tail) {
                if (!this.types.isConvertible((Type) r10.head, typeElemtype, warner)) {
                    throw this.inapplicableMethodException.setMessage("varargs.argument.mismatch", r10.head, typeElemtype);
                }
            }
            if (!isAccessible(c0621Env, typeElemtype)) {
                Symbol.ClassSymbol classSymbol = c0621Env.enclClass.f539sym;
                throw this.inapplicableMethodException.setMessage("inaccessible.varargs.type", typeElemtype, Kinds.kindName(classSymbol), classSymbol);
            }
        }
    }

    public static class InapplicableMethodException extends RuntimeException {
        private static final long serialVersionUID = 0;
        JCDiagnostic diagnostic = null;
        JCDiagnostic.Factory diags;

        InapplicableMethodException(JCDiagnostic.Factory diags) {
            this.diags = diags;
        }

        InapplicableMethodException setMessage() {
            this.diagnostic = null;
            return this;
        }

        InapplicableMethodException setMessage(String key) {
            this.diagnostic = key != null ? this.diags.fragment(key, new Object[0]) : null;
            return this;
        }

        InapplicableMethodException setMessage(String key, Object... args) {
            this.diagnostic = key != null ? this.diags.fragment(key, args) : null;
            return this;
        }

        InapplicableMethodException setMessage(JCDiagnostic diag) {
            this.diagnostic = diag;
            return this;
        }

        public JCDiagnostic getDiagnostic() {
            return this.diagnostic;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    Symbol findField(Env<AttrContext> env, Type site, Name name, Symbol.TypeSymbol c) {
        while (c.type.f344tag == 14) {
            c = c.type.mo576getUpperBound().tsym;
        }
        Symbol bestSoFar = this.varNotFound;
        for (Scope.Entry e = c.members().lookup(name); e.scope != null; e = e.next()) {
            if (e.f338sym.kind == 4 && (e.f338sym.flags_field & 4096) == 0) {
                return isAccessible(env, site, e.f338sym) ? e.f338sym : new AccessError(env, site, e.f338sym);
            }
        }
        Type st = this.types.supertype(c.type);
        if (st != null && (st.f344tag == 10 || st.f344tag == 14)) {
            Symbol sym = findField(env, site, name, st.tsym);
            if (sym.kind < bestSoFar.kind) {
                bestSoFar = sym;
            }
        }
        for (List listInterfaces = this.types.interfaces(c.type); bestSoFar.kind != 65 && listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
            Symbol sym2 = findField(env, site, name, ((Type) listInterfaces.head).tsym);
            if (bestSoFar.kind < 65 && sym2.kind < 65 && sym2.owner != bestSoFar.owner) {
                bestSoFar = new AmbiguityError(bestSoFar, sym2);
            } else if (sym2.kind < bestSoFar.kind) {
                bestSoFar = sym2;
            }
        }
        return bestSoFar;
    }

    public Symbol.VarSymbol resolveInternalField(JCDiagnostic.DiagnosticPosition pos, Env<AttrContext> env, Type site, Name name) {
        Symbol sym = findField(env, site, name, site.tsym);
        if (sym.kind == 4) {
            return (Symbol.VarSymbol) sym;
        }
        throw new FatalError(this.diags.fragment("fatal.err.cant.locate.field", name));
    }

    /* JADX WARN: Multi-variable type inference failed */
    Symbol findVar(Env<AttrContext> env, Name name) {
        Symbol sym;
        Symbol bestSoFar = this.varNotFound;
        boolean staticOnly = false;
        for (Env c0621Env = env; c0621Env.outer != null; c0621Env = c0621Env.outer) {
            if (isStatic(c0621Env)) {
                staticOnly = true;
            }
            Scope.Entry e = ((AttrContext) c0621Env.info).scope.lookup(name);
            while (e.scope != null && (e.f338sym.kind != 4 || (e.f338sym.flags_field & 4096) != 0)) {
                e = e.next();
            }
            if (e.scope != null) {
                sym = e.f338sym;
            } else {
                sym = findField(c0621Env, c0621Env.enclClass.f539sym.type, name, c0621Env.enclClass.f539sym);
            }
            if (sym.exists()) {
                if (staticOnly && sym.kind == 4 && sym.owner.kind == 2 && (8 & sym.flags()) == 0) {
                    return new StaticError(sym);
                }
                return sym;
            }
            if (sym.kind < bestSoFar.kind) {
                bestSoFar = sym;
            }
            if ((8 & c0621Env.enclClass.f539sym.flags()) != 0) {
                staticOnly = true;
            }
        }
        Symbol sym2 = findField(env, this.syms.predefClass.type, name, this.syms.predefClass);
        if (sym2.exists()) {
            return sym2;
        }
        if (bestSoFar.exists()) {
            return bestSoFar;
        }
        for (Scope.Entry e2 = env.toplevel.namedImportScope.lookup(name); e2.scope != null; e2 = e2.next()) {
            Symbol sym3 = e2.f338sym;
            Type origin = e2.getOrigin().owner.type;
            if (sym3.kind == 4) {
                if (e2.f338sym.owner.type != origin) {
                    sym3 = sym3.clone(e2.getOrigin().owner);
                }
                return isAccessible(env, origin, sym3) ? sym3 : new AccessError(env, origin, sym3);
            }
        }
        Symbol origin2 = null;
        for (Scope.Entry e3 = env.toplevel.starImportScope.lookup(name); e3.scope != null; e3 = e3.next()) {
            Symbol sym4 = e3.f338sym;
            if (sym4.kind == 4) {
                if (bestSoFar.kind < 65 && sym4.owner != bestSoFar.owner) {
                    return new AmbiguityError(bestSoFar, sym4);
                }
                if (bestSoFar.kind >= 4) {
                    origin2 = e3.getOrigin().owner;
                    bestSoFar = isAccessible(env, origin2.type, sym4) ? sym4 : new AccessError(env, origin2.type, sym4);
                }
            }
        }
        if (bestSoFar.kind == 4 && bestSoFar.owner.type != origin2.type) {
            return bestSoFar.clone(origin2);
        }
        return bestSoFar;
    }

    Symbol selectBest(Env<AttrContext> env, Type site, List<Type> argtypes, List<Type> typeargtypes, Symbol sym, Symbol bestSoFar, boolean allowBoxing, boolean useVarargs, boolean operator) {
        if (sym.kind == 31 || !sym.isInheritedIn(site.tsym, this.types)) {
            return bestSoFar;
        }
        Assert.check(sym.kind < 65);
        try {
            rawInstantiate(env, site, sym, argtypes, typeargtypes, allowBoxing, useVarargs, Warner.noWarnings);
            if (!isAccessible(env, site, sym)) {
                if (bestSoFar.kind == 71) {
                    return new AccessError(env, site, sym);
                }
                return bestSoFar;
            }
            if (bestSoFar.kind > 65) {
                return sym;
            }
            return mostSpecific(sym, bestSoFar, env, site, allowBoxing && operator, useVarargs);
        } catch (InapplicableMethodException ex) {
            switch (bestSoFar.kind) {
                case 69:
                    break;
                case 70:
                    if (operator) {
                        return bestSoFar;
                    }
                    this.wrongMethods.addCandidate(this.currentStep, this.wrongMethod.f391sym, this.wrongMethod.explanation);
                    break;
                case 71:
                    return this.wrongMethod.setWrongSym(sym, ex.getDiagnostic());
                default:
                    return bestSoFar;
            }
            return this.wrongMethods.addCandidate(this.currentStep, sym, ex.getDiagnostic());
        }
    }

    Symbol mostSpecific(Symbol m1, Symbol m2, Env<AttrContext> env, final Type site, boolean allowBoxing, boolean useVarargs) {
        int i = m2.kind;
        if (i != 16) {
            if (i == 65) {
                AmbiguityError e = (AmbiguityError) m2;
                Symbol err1 = mostSpecific(m1, e.f391sym, env, site, allowBoxing, useVarargs);
                Symbol err2 = mostSpecific(m1, e.sym2, env, site, allowBoxing, useVarargs);
                if (err1 == err2) {
                    return err1;
                }
                if (err1 == e.f391sym && err2 == e.sym2) {
                    return m2;
                }
                if ((err1 instanceof AmbiguityError) && (err2 instanceof AmbiguityError) && ((AmbiguityError) err1).f391sym == ((AmbiguityError) err2).f391sym) {
                    return ambiguityError(m1, m2);
                }
                return ambiguityError(err1, err2);
            }
            throw new AssertionError();
        }
        if (m1 == m2) {
            return m1;
        }
        boolean m1SignatureMoreSpecific = signatureMoreSpecific(env, site, m1, m2, allowBoxing, useVarargs);
        boolean m2SignatureMoreSpecific = signatureMoreSpecific(env, site, m2, m1, allowBoxing, useVarargs);
        if (m1SignatureMoreSpecific && m2SignatureMoreSpecific) {
            Type mt1 = this.types.memberType(site, m1);
            Type mt2 = this.types.memberType(site, m2);
            if (!this.types.overrideEquivalent(mt1, mt2)) {
                return ambiguityError(m1, m2);
            }
            if ((m1.flags() & Flags.BRIDGE) != (m2.flags() & Flags.BRIDGE)) {
                return (m1.flags() & Flags.BRIDGE) != 0 ? m2 : m1;
            }
            Symbol.TypeSymbol m1Owner = (Symbol.TypeSymbol) m1.owner;
            Symbol.TypeSymbol m2Owner = (Symbol.TypeSymbol) m2.owner;
            if (this.types.asSuper(m1Owner.type, m2Owner) != null && (((m1.owner.flags_field & 512) == 0 || (m2.owner.flags_field & 512) != 0) && m1.overrides(m2, m1Owner, this.types, false))) {
                return m1;
            }
            if (this.types.asSuper(m2Owner.type, m1Owner) != null && (((m2.owner.flags_field & 512) == 0 || (512 & m1.owner.flags_field) != 0) && m2.overrides(m1, m2Owner, this.types, false))) {
                return m2;
            }
            boolean m1Abstract = (m1.flags() & 1024) != 0;
            boolean m2Abstract = (m2.flags() & 1024) != 0;
            if (m1Abstract && !m2Abstract) {
                return m2;
            }
            if (m2Abstract && !m1Abstract) {
                return m1;
            }
            if (!m1Abstract && !m2Abstract) {
                return ambiguityError(m1, m2);
            }
            Types types = this.types;
            if (!types.isSameTypes(m1.erasure(types).mo573getParameterTypes(), m2.erasure(this.types).mo573getParameterTypes())) {
                return ambiguityError(m1, m2);
            }
            Type mst = mostSpecificReturnType(mt1, mt2);
            if (mst == null) {
                return ambiguityError(m1, m2);
            }
            Symbol mostSpecific = mst == mt1 ? m1 : m2;
            List<Type> allThrown = this.f386chk.intersect(mt1.mo575getThrownTypes(), mt2.mo575getThrownTypes());
            Type newSig = this.types.createMethodTypeWithThrown(mostSpecific.type, allThrown);
            Symbol.MethodSymbol result = new Symbol.MethodSymbol(mostSpecific.flags(), mostSpecific.name, newSig, mostSpecific.owner) {
                @Override
                public Symbol.MethodSymbol implementation(Symbol.TypeSymbol origin, Types types2, boolean checkResult) {
                    if (origin == site.tsym) {
                        return this;
                    }
                    return super.implementation(origin, types2, checkResult);
                }
            };
            return result;
        }
        if (m1SignatureMoreSpecific) {
            return m1;
        }
        return m2SignatureMoreSpecific ? m2 : ambiguityError(m1, m2);
    }

    private boolean signatureMoreSpecific(Env<AttrContext> env, Type site, Symbol m1, Symbol m2, boolean allowBoxing, boolean useVarargs) {
        this.noteWarner.clear();
        Type mtype1 = this.types.memberType(site, adjustVarargs(m1, m2, useVarargs));
        Type mtype2 = instantiate(env, site, adjustVarargs(m2, m1, useVarargs), this.types.lowerBoundArgtypes(mtype1), null, allowBoxing, false, this.noteWarner);
        return (mtype2 == null || this.noteWarner.hasLint(Lint.LintCategory.UNCHECKED)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Symbol adjustVarargs(Symbol to, Symbol from, boolean useVarargs) {
        List list;
        List listMo573getParameterTypes = from.type.mo573getParameterTypes();
        List listMo573getParameterTypes2 = to.type.mo573getParameterTypes();
        if (!useVarargs || (from.flags() & Flags.VARARGS) == 0 || (to.flags() & Flags.VARARGS) == 0) {
            return to;
        }
        Type varargsTypeFrom = (Type) listMo573getParameterTypes.last();
        Type varargsTypeTo = (Type) listMo573getParameterTypes2.last();
        ListBuffer<Type> args = ListBuffer.m512lb();
        if (listMo573getParameterTypes2.length() < listMo573getParameterTypes.length()) {
            while (listMo573getParameterTypes.head != varargsTypeFrom) {
                args.append(listMo573getParameterTypes2.head == varargsTypeTo ? this.types.elemtype(varargsTypeTo) : (Type) listMo573getParameterTypes2.head);
                listMo573getParameterTypes = listMo573getParameterTypes.tail;
                if (listMo573getParameterTypes2.head == varargsTypeTo) {
                    list = listMo573getParameterTypes2;
                } else {
                    list = listMo573getParameterTypes2.tail;
                }
                listMo573getParameterTypes2 = list;
            }
        } else {
            args.appendList(listMo573getParameterTypes2.reverse().tail.reverse());
        }
        args.append(this.types.elemtype(varargsTypeTo));
        Type mtype = this.types.createMethodTypeWithParameters(to.type, args.toList());
        return new Symbol.MethodSymbol((-17179869185L) & to.flags_field, to.name, mtype, to.owner);
    }

    Type mostSpecificReturnType(Type mt1, Type mt2) {
        Type rt1 = mt1.mo574getReturnType();
        Type rt2 = mt2.mo574getReturnType();
        if (mt1.f344tag == 16 && mt2.f344tag == 16) {
            rt1 = this.types.subst(rt1, mt1.getTypeArguments(), mt2.getTypeArguments());
        }
        if (this.types.isSubtype(rt1, rt2)) {
            return mt1;
        }
        if (this.types.isSubtype(rt2, rt1)) {
            return mt2;
        }
        if (this.types.returnTypeSubstitutable(mt1, mt2)) {
            return mt1;
        }
        if (this.types.returnTypeSubstitutable(mt2, mt1)) {
            return mt2;
        }
        return null;
    }

    Symbol ambiguityError(Symbol m1, Symbol m2) {
        if (((m1.flags() | m2.flags()) & Flags.CLASH) != 0) {
            return (m1.flags() & Flags.CLASH) == 0 ? m1 : m2;
        }
        return new AmbiguityError(m1, m2);
    }

    Symbol findMethod(Env<AttrContext> env, Type site, Name name, List<Type> argtypes, List<Type> typeargtypes, boolean allowBoxing, boolean useVarargs, boolean operator) {
        Symbol bestSoFar = this.methodNotFound;
        return findMethod(env, site, name, argtypes, typeargtypes, site.tsym.type, true, bestSoFar, allowBoxing, useVarargs, operator, new HashSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Symbol findMethod(Env<AttrContext> env, Type site, Name name, List<Type> argtypes, List<Type> typeargtypes, Type intype, boolean abstractok, Symbol bestSoFar, boolean allowBoxing, boolean useVarargs, boolean operator, Set<Symbol.TypeSymbol> seen) {
        boolean abstractok2;
        Type ct;
        Symbol concrete;
        Symbol bestSoFar2 = bestSoFar;
        Type ct2 = intype;
        boolean abstractok3 = abstractok;
        while (true) {
            if (ct2.f344tag == 10 || ct2.f344tag == 14) {
                Type ct3 = ct2;
                while (ct3.f344tag == 14) {
                    ct3 = ct3.mo576getUpperBound();
                }
                Symbol.ClassSymbol c = (Symbol.ClassSymbol) ct3.tsym;
                if (!seen.add(c)) {
                    return bestSoFar2;
                }
                if ((c.flags() & 17920) != 0) {
                    abstractok2 = abstractok3;
                } else {
                    abstractok2 = false;
                }
                Symbol bestSoFar3 = bestSoFar2;
                for (Scope.Entry e = c.members().lookup(name); e.scope != null; e = e.next()) {
                    if (e.f338sym.kind == 16 && (e.f338sym.flags_field & 4096) == 0) {
                        bestSoFar3 = selectBest(env, site, argtypes, typeargtypes, e.f338sym, bestSoFar3, allowBoxing, useVarargs, operator);
                    }
                }
                if (name == this.names.init) {
                    return bestSoFar3;
                }
                if (abstractok2) {
                    Symbol concrete2 = this.methodNotFound;
                    if ((bestSoFar3.flags() & 1024) != 0) {
                        concrete = concrete2;
                    } else {
                        Symbol concrete3 = bestSoFar3;
                        concrete = concrete3;
                    }
                    List listInterfaces = this.types.interfaces(c.type);
                    Symbol bestSoFar4 = bestSoFar3;
                    while (listInterfaces.nonEmpty()) {
                        bestSoFar4 = findMethod(env, site, name, argtypes, typeargtypes, (Type) listInterfaces.head, abstractok2, bestSoFar4, allowBoxing, useVarargs, operator, seen);
                        listInterfaces = listInterfaces.tail;
                        concrete = concrete;
                        ct3 = ct3;
                        c = c;
                    }
                    ct = ct3;
                    Symbol concrete4 = concrete;
                    if (concrete4 == bestSoFar4 || concrete4.kind >= 31 || bestSoFar4.kind >= 31 || !this.types.isSubSignature(concrete4.type, bestSoFar4.type)) {
                        bestSoFar2 = bestSoFar4;
                    } else {
                        bestSoFar2 = concrete4;
                    }
                } else {
                    ct = ct3;
                    bestSoFar2 = bestSoFar3;
                }
                ct2 = this.types.supertype(ct);
                abstractok3 = abstractok2;
            } else {
                return bestSoFar2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    Symbol findFun(Env<AttrContext> env, Name name, List<Type> argtypes, List<Type> typeargtypes, boolean allowBoxing, boolean useVarargs) {
        Symbol sym;
        Symbol sym2;
        Symbol bestSoFar = this.methodNotFound;
        Symbol bestSoFar2 = bestSoFar;
        boolean staticOnly = false;
        for (Env c0621Env = env; c0621Env.outer != null; c0621Env = c0621Env.outer) {
            if (isStatic(c0621Env)) {
                staticOnly = true;
            }
            Symbol sym3 = findMethod(c0621Env, c0621Env.enclClass.f539sym.type, name, argtypes, typeargtypes, allowBoxing, useVarargs, false);
            if (sym3.exists()) {
                if (staticOnly && sym3.kind == 16 && sym3.owner.kind == 2 && (8 & sym3.flags()) == 0) {
                    return new StaticError(sym3);
                }
                return sym3;
            }
            if (sym3.kind < bestSoFar2.kind) {
                bestSoFar2 = sym3;
            }
            if ((8 & c0621Env.enclClass.f539sym.flags()) != 0) {
                staticOnly = true;
            }
        }
        Symbol sym4 = findMethod(env, this.syms.predefClass.type, name, argtypes, typeargtypes, allowBoxing, useVarargs, false);
        if (sym4.exists()) {
            return sym4;
        }
        Symbol bestSoFar3 = bestSoFar2;
        for (Scope.Entry e = env.toplevel.namedImportScope.lookup(name); e.scope != null; e = e.next()) {
            Symbol sym5 = e.f338sym;
            Type origin = e.getOrigin().owner.type;
            if (sym5.kind == 16) {
                if (e.f338sym.owner.type != origin) {
                    sym5 = sym5.clone(e.getOrigin().owner);
                }
                if (!isAccessible(env, origin, sym5)) {
                    sym2 = new AccessError(env, origin, sym5);
                } else {
                    sym2 = sym5;
                }
                bestSoFar3 = selectBest(env, origin, argtypes, typeargtypes, sym2, bestSoFar3, allowBoxing, useVarargs, false);
            }
        }
        if (bestSoFar3.exists()) {
            return bestSoFar3;
        }
        for (Scope.Entry e2 = env.toplevel.starImportScope.lookup(name); e2.scope != null; e2 = e2.next()) {
            Symbol sym6 = e2.f338sym;
            Type origin2 = e2.getOrigin().owner.type;
            if (sym6.kind == 16) {
                if (e2.f338sym.owner.type != origin2) {
                    sym6 = sym6.clone(e2.getOrigin().owner);
                }
                if (!isAccessible(env, origin2, sym6)) {
                    sym = new AccessError(env, origin2, sym6);
                } else {
                    sym = sym6;
                }
                bestSoFar3 = selectBest(env, origin2, argtypes, typeargtypes, sym, bestSoFar3, allowBoxing, useVarargs, false);
            }
        }
        return bestSoFar3;
    }

    Symbol loadClass(Env<AttrContext> env, Name name) {
        try {
            Symbol.ClassSymbol c = this.reader.loadClass(name);
            return isAccessible(env, c) ? c : new AccessError(this, c);
        } catch (ClassReader.BadClassFile err) {
            throw err;
        } catch (Symbol.CompletionFailure e) {
            return this.typeNotFound;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    Symbol findMemberType(Env<AttrContext> env, Type site, Name name, Symbol.TypeSymbol c) {
        Symbol bestSoFar = this.typeNotFound;
        for (Scope.Entry e = c.members().lookup(name); e.scope != null; e = e.next()) {
            if (e.f338sym.kind == 2) {
                if (isAccessible(env, site, e.f338sym)) {
                    return e.f338sym;
                }
                return new AccessError(env, site, e.f338sym);
            }
        }
        Type st = this.types.supertype(c.type);
        if (st != null && st.f344tag == 10) {
            Symbol sym = findMemberType(env, site, name, st.tsym);
            if (sym.kind < bestSoFar.kind) {
                bestSoFar = sym;
            }
        }
        for (List listInterfaces = this.types.interfaces(c.type); bestSoFar.kind != 65 && listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
            Symbol sym2 = findMemberType(env, site, name, ((Type) listInterfaces.head).tsym);
            if (bestSoFar.kind < 65 && sym2.kind < 65 && sym2.owner != bestSoFar.owner) {
                bestSoFar = new AmbiguityError(bestSoFar, sym2);
            } else if (sym2.kind < bestSoFar.kind) {
                bestSoFar = sym2;
            }
        }
        return bestSoFar;
    }

    Symbol findGlobalType(Env<AttrContext> env, Scope scope, Name name) {
        Symbol bestSoFar = this.typeNotFound;
        for (Scope.Entry e = scope.lookup(name); e.scope != null; e = e.next()) {
            Symbol sym = loadClass(env, e.f338sym.flatName());
            if (bestSoFar.kind == 2 && sym.kind == 2 && bestSoFar != sym) {
                return new AmbiguityError(bestSoFar, sym);
            }
            if (sym.kind < bestSoFar.kind) {
                bestSoFar = sym;
            }
        }
        return bestSoFar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    Symbol findType(Env<AttrContext> env, Name name) {
        Symbol bestSoFar = this.typeNotFound;
        boolean staticOnly = false;
        for (Env c0621Env = env; c0621Env.outer != null; c0621Env = c0621Env.outer) {
            if (isStatic(c0621Env)) {
                staticOnly = true;
            }
            for (Scope.Entry e = ((AttrContext) c0621Env.info).scope.lookup(name); e.scope != null; e = e.next()) {
                if (e.f338sym.kind == 2) {
                    if (staticOnly && e.f338sym.type.f344tag == 14 && e.f338sym.owner.kind == 2) {
                        return new StaticError(e.f338sym);
                    }
                    return e.f338sym;
                }
            }
            Symbol sym = findMemberType(c0621Env, c0621Env.enclClass.f539sym.type, name, c0621Env.enclClass.f539sym);
            if (staticOnly && sym.kind == 2 && sym.type.f344tag == 10 && sym.type.getEnclosingType().f344tag == 10 && c0621Env.enclClass.f539sym.type.isParameterized() && sym.type.getEnclosingType().isParameterized()) {
                return new StaticError(sym);
            }
            if (sym.exists()) {
                return sym;
            }
            if (sym.kind < bestSoFar.kind) {
                bestSoFar = sym;
            }
            JCTree.JCClassDecl encl = c0621Env.baseClause ? (JCTree.JCClassDecl) c0621Env.tree : c0621Env.enclClass;
            if ((encl.f539sym.flags() & 8) != 0) {
                staticOnly = true;
            }
        }
        if (env.tree.getTag() != 2) {
            Symbol sym2 = findGlobalType(env, env.toplevel.namedImportScope, name);
            if (sym2.exists()) {
                return sym2;
            }
            if (sym2.kind < bestSoFar.kind) {
                bestSoFar = sym2;
            }
            Symbol sym3 = findGlobalType(env, env.toplevel.packge.members(), name);
            if (sym3.exists()) {
                return sym3;
            }
            if (sym3.kind < bestSoFar.kind) {
                bestSoFar = sym3;
            }
            Symbol sym4 = findGlobalType(env, env.toplevel.starImportScope, name);
            return (!sym4.exists() && sym4.kind >= bestSoFar.kind) ? bestSoFar : sym4;
        }
        return bestSoFar;
    }

    Symbol findIdent(Env<AttrContext> env, Name name, int kind) {
        Symbol bestSoFar = this.typeNotFound;
        if ((kind & 4) != 0) {
            Symbol sym = findVar(env, name);
            if (sym.exists()) {
                return sym;
            }
            if (sym.kind < bestSoFar.kind) {
                bestSoFar = sym;
            }
        }
        if ((kind & 2) != 0) {
            Symbol sym2 = findType(env, name);
            if (sym2.exists()) {
                return sym2;
            }
            if (sym2.kind < bestSoFar.kind) {
                bestSoFar = sym2;
            }
        }
        return (kind & 1) != 0 ? this.reader.enterPackage(name) : bestSoFar;
    }

    Symbol findIdentInPackage(Env<AttrContext> env, Symbol.TypeSymbol pck, Name name, int kind) {
        Name fullname = Symbol.TypeSymbol.formFullName(name, pck);
        Symbol bestSoFar = this.typeNotFound;
        Symbol.PackageSymbol pack = null;
        if ((kind & 1) != 0) {
            pack = this.reader.enterPackage(fullname);
            if (pack.exists()) {
                return pack;
            }
        }
        if ((kind & 2) != 0) {
            Symbol sym = loadClass(env, fullname);
            if (sym.exists()) {
                if (name == sym.name) {
                    return sym;
                }
            } else if (sym.kind < bestSoFar.kind) {
                bestSoFar = sym;
            }
        }
        return pack != null ? pack : bestSoFar;
    }

    Symbol findIdentInType(Env<AttrContext> env, Type site, Name name, int kind) {
        Symbol bestSoFar = this.typeNotFound;
        if ((kind & 4) != 0) {
            Symbol sym = findField(env, site, name, site.tsym);
            if (sym.exists()) {
                return sym;
            }
            if (sym.kind < bestSoFar.kind) {
                bestSoFar = sym;
            }
        }
        if ((kind & 2) != 0) {
            Symbol sym2 = findMemberType(env, site, name, site.tsym);
            return (!sym2.exists() && sym2.kind >= bestSoFar.kind) ? bestSoFar : sym2;
        }
        return bestSoFar;
    }

    Symbol access(Symbol sym, JCDiagnostic.DiagnosticPosition pos, Symbol location, Type site, Name name, boolean qualified, List<Type> argtypes, List<Type> typeargtypes) {
        if (sym.kind < 65) {
            return sym;
        }
        ResolveError errSym = (ResolveError) sym;
        if (!site.isErroneous() && !Type.isErroneous(argtypes) && (typeargtypes == null || !Type.isErroneous(typeargtypes))) {
            logResolveError(errSym, pos, location, site, name, argtypes, typeargtypes);
        }
        return errSym.access(name, qualified ? site.tsym : this.syms.noSymbol);
    }

    Symbol access(Symbol sym, JCDiagnostic.DiagnosticPosition pos, Type site, Name name, boolean qualified, List<Type> argtypes, List<Type> typeargtypes) {
        return access(sym, pos, site.tsym, site, name, qualified, argtypes, typeargtypes);
    }

    Symbol access(Symbol sym, JCDiagnostic.DiagnosticPosition pos, Symbol location, Type site, Name name, boolean qualified) {
        if (sym.kind < 65) {
            return sym;
        }
        return access(sym, pos, location, site, name, qualified, List.m507nil(), null);
    }

    Symbol access(Symbol sym, JCDiagnostic.DiagnosticPosition pos, Type site, Name name, boolean qualified) {
        return access(sym, pos, site.tsym, site, name, qualified);
    }

    void checkNonAbstract(JCDiagnostic.DiagnosticPosition pos, Symbol sym) {
        if ((sym.flags() & 1024) != 0) {
            this.f387log.error(pos, "abstract.cant.be.accessed.directly", Kinds.kindName(sym), sym, sym.location());
        }
    }

    public void printscopes(Scope s) {
        while (s != null) {
            if (s.owner != null) {
                System.err.print(s.owner + ": ");
            }
            for (Scope.Entry e = s.elems; e != null; e = e.sibling) {
                if ((e.f338sym.flags() & 1024) != 0) {
                    System.err.print("abstract ");
                }
                System.err.print(e.f338sym + " ");
            }
            System.err.println();
            s = s.next;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void printscopes(Env<AttrContext> c0621Env) {
        for (Env c0621Env2 = c0621Env; c0621Env2.outer != null; c0621Env2 = c0621Env2.outer) {
            System.err.println("------------------------------");
            printscopes(((AttrContext) c0621Env2.info).scope);
        }
    }

    public void printscopes(Type t) {
        while (t.f344tag == 10) {
            printscopes(t.tsym.members());
            t = this.types.supertype(t);
        }
    }

    Symbol resolveIdent(JCDiagnostic.DiagnosticPosition pos, Env<AttrContext> env, Name name, int kind) {
        return access(findIdent(env, name, kind), pos, env.enclClass.f539sym.type, name, false);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    Symbol resolveMethod(JCDiagnostic.DiagnosticPosition diagnosticPosition, Env<AttrContext> c0621Env, Name name, List<Type> list, List<Type> list2) {
        Symbol symbolStartResolution = startResolution();
        for (List list3 = this.methodResolutionSteps; list3.nonEmpty() && ((MethodResolutionPhase) list3.head).isApplicable(this.boxingEnabled, this.varargsEnabled) && symbolStartResolution.kind >= 64; list3 = list3.tail) {
            this.currentStep = (MethodResolutionPhase) list3.head;
            boolean z = ((MethodResolutionPhase) list3.head).isBoxingRequired;
            AttrContext attrContext = c0621Env.info;
            boolean z2 = ((MethodResolutionPhase) list3.head).isVarargsRequired;
            attrContext.varArgs = z2;
            symbolStartResolution = findFun(c0621Env, name, list, list2, z, z2);
            this.methodResolutionCache.put((MethodResolutionPhase) list3.head, symbolStartResolution);
        }
        if (symbolStartResolution.kind >= 65) {
            MethodResolutionPhase methodResolutionPhaseFirstErroneousResolutionPhase = firstErroneousResolutionPhase();
            Symbol symbolAccess = access(this.methodResolutionCache.get(methodResolutionPhaseFirstErroneousResolutionPhase), diagnosticPosition, c0621Env.enclClass.f539sym.type, name, false, list, list2);
            c0621Env.info.varArgs = methodResolutionPhaseFirstErroneousResolutionPhase.isVarargsRequired;
            return symbolAccess;
        }
        return symbolStartResolution;
    }

    private Symbol startResolution() {
        this.wrongMethod.clear();
        this.wrongMethods.clear();
        return this.methodNotFound;
    }

    Symbol resolveQualifiedMethod(JCDiagnostic.DiagnosticPosition pos, Env<AttrContext> env, Type site, Name name, List<Type> argtypes, List<Type> typeargtypes) {
        return resolveQualifiedMethod(pos, env, site.tsym, site, name, argtypes, typeargtypes);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    Symbol resolveQualifiedMethod(JCDiagnostic.DiagnosticPosition diagnosticPosition, Env<AttrContext> c0621Env, Symbol symbol, Type type, Name name, List<Type> list, List<Type> list2) {
        Symbol symbolStartResolution = startResolution();
        for (List list3 = this.methodResolutionSteps; list3.nonEmpty() && ((MethodResolutionPhase) list3.head).isApplicable(this.boxingEnabled, this.varargsEnabled) && symbolStartResolution.kind >= 64; list3 = list3.tail) {
            this.currentStep = (MethodResolutionPhase) list3.head;
            boolean zIsBoxingRequired = ((MethodResolutionPhase) list3.head).isBoxingRequired();
            AttrContext attrContext = c0621Env.info;
            boolean zIsVarargsRequired = ((MethodResolutionPhase) list3.head).isVarargsRequired();
            attrContext.varArgs = zIsVarargsRequired;
            symbolStartResolution = findMethod(c0621Env, type, name, list, list2, zIsBoxingRequired, zIsVarargsRequired, false);
            this.methodResolutionCache.put((MethodResolutionPhase) list3.head, symbolStartResolution);
        }
        if (symbolStartResolution.kind < 65) {
            if (this.allowMethodHandles && symbolStartResolution.isPolymorphicSignatureGeneric()) {
                c0621Env.info.varArgs = false;
                return findPolymorphicSignatureInstance(c0621Env, type, name, (Symbol.MethodSymbol) symbolStartResolution, list);
            }
            return symbolStartResolution;
        }
        if (type.tsym.isPolymorphicSignatureGeneric()) {
            c0621Env.info.varArgs = false;
            return findPolymorphicSignatureInstance(c0621Env, type, name, null, list);
        }
        MethodResolutionPhase methodResolutionPhaseFirstErroneousResolutionPhase = firstErroneousResolutionPhase();
        Symbol symbolAccess = access(this.methodResolutionCache.get(methodResolutionPhaseFirstErroneousResolutionPhase), diagnosticPosition, symbol, type, name, true, list, list2);
        c0621Env.info.varArgs = methodResolutionPhaseFirstErroneousResolutionPhase.isVarargsRequired;
        return symbolAccess;
    }

    Symbol findPolymorphicSignatureInstance(Env<AttrContext> env, Type site, Name name, Symbol.MethodSymbol spMethod, List<Type> argtypes) {
        long jFlags;
        Type mtype = this.infer.instantiatePolymorphicSignatureInstance(env, site, name, spMethod, argtypes);
        if (spMethod != null) {
            jFlags = spMethod.flags() & 7;
        } else {
            jFlags = 9;
        }
        long flags = jFlags | 1236950582272L;
        Symbol m = null;
        for (Scope.Entry e = this.polymorphicSignatureScope.lookup(name); e.scope != null; e = e.next()) {
            Symbol sym = e.f338sym;
            if (this.types.isSameType(mtype, sym.type) && (sym.flags() & 8) == (8 & flags) && this.types.isSameType(sym.owner.type, site)) {
                m = sym;
                break;
            }
        }
        if (m == null) {
            Symbol m2 = new Symbol.MethodSymbol(flags, name, mtype, site.tsym);
            this.polymorphicSignatureScope.enter(m2);
            return m2;
        }
        return m;
    }

    public Symbol.MethodSymbol resolveInternalMethod(JCDiagnostic.DiagnosticPosition pos, Env<AttrContext> env, Type site, Name name, List<Type> argtypes, List<Type> typeargtypes) {
        Symbol sym = resolveQualifiedMethod(pos, env, site.tsym, site, name, argtypes, typeargtypes);
        if (sym.kind == 16) {
            return (Symbol.MethodSymbol) sym;
        }
        throw new FatalError(this.diags.fragment("fatal.err.cant.locate.meth", name));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    Symbol resolveConstructor(JCDiagnostic.DiagnosticPosition diagnosticPosition, Env<AttrContext> c0621Env, Type type, List<Type> list, List<Type> list2) {
        Symbol symbolStartResolution = startResolution();
        for (List list3 = this.methodResolutionSteps; list3.nonEmpty() && ((MethodResolutionPhase) list3.head).isApplicable(this.boxingEnabled, this.varargsEnabled) && symbolStartResolution.kind >= 64; list3 = list3.tail) {
            this.currentStep = (MethodResolutionPhase) list3.head;
            boolean zIsBoxingRequired = ((MethodResolutionPhase) list3.head).isBoxingRequired();
            AttrContext attrContext = c0621Env.info;
            boolean zIsVarargsRequired = ((MethodResolutionPhase) list3.head).isVarargsRequired();
            attrContext.varArgs = zIsVarargsRequired;
            symbolStartResolution = resolveConstructor(diagnosticPosition, c0621Env, type, list, list2, zIsBoxingRequired, zIsVarargsRequired);
            this.methodResolutionCache.put((MethodResolutionPhase) list3.head, symbolStartResolution);
        }
        if (symbolStartResolution.kind >= 65) {
            MethodResolutionPhase methodResolutionPhaseFirstErroneousResolutionPhase = firstErroneousResolutionPhase();
            Symbol symbolAccess = access(this.methodResolutionCache.get(methodResolutionPhaseFirstErroneousResolutionPhase), diagnosticPosition, type, this.names.init, true, list, list2);
            c0621Env.info.varArgs = methodResolutionPhaseFirstErroneousResolutionPhase.isVarargsRequired();
            return symbolAccess;
        }
        return symbolStartResolution;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    Symbol resolveDiamond(JCDiagnostic.DiagnosticPosition diagnosticPosition, Env<AttrContext> c0621Env, Type type, List<Type> list, List<Type> list2) {
        JCDiagnostic jCDiagnostic;
        Symbol symbolStartResolution = startResolution();
        for (List list3 = this.methodResolutionSteps; list3.nonEmpty() && ((MethodResolutionPhase) list3.head).isApplicable(this.boxingEnabled, this.varargsEnabled) && symbolStartResolution.kind >= 64; list3 = list3.tail) {
            this.currentStep = (MethodResolutionPhase) list3.head;
            boolean zIsBoxingRequired = ((MethodResolutionPhase) list3.head).isBoxingRequired();
            AttrContext attrContext = c0621Env.info;
            boolean zIsVarargsRequired = ((MethodResolutionPhase) list3.head).isVarargsRequired();
            attrContext.varArgs = zIsVarargsRequired;
            symbolStartResolution = resolveConstructor(diagnosticPosition, c0621Env, type, list, list2, zIsBoxingRequired, zIsVarargsRequired);
            this.methodResolutionCache.put((MethodResolutionPhase) list3.head, symbolStartResolution);
        }
        if (symbolStartResolution.kind >= 65) {
            int i = 70;
            if (symbolStartResolution.kind == 70) {
                jCDiagnostic = ((InapplicableSymbolError) symbolStartResolution).explanation;
            } else {
                jCDiagnostic = null;
            }
            final JCDiagnostic jCDiagnostic2 = jCDiagnostic;
            ResolveError resolveError = new ResolveError(i, "diamond error") {
                @Override
                JCDiagnostic getDiagnostic(JCDiagnostic.DiagnosticType dkind, JCDiagnostic.DiagnosticPosition pos, Symbol location, Type site, Name name, List<Type> argtypes, List<Type> typeargtypes) {
                    String key;
                    if (jCDiagnostic2 == null) {
                        key = "cant.apply.diamond";
                    } else {
                        key = "cant.apply.diamond.1";
                    }
                    return Resolve.this.diags.create(dkind, Resolve.this.f387log.currentSource(), pos, key, Resolve.this.diags.fragment("diamond", site.tsym), jCDiagnostic2);
                }
            };
            MethodResolutionPhase methodResolutionPhaseFirstErroneousResolutionPhase = firstErroneousResolutionPhase();
            Symbol symbolAccess = access(resolveError, diagnosticPosition, type, this.names.init, true, list, list2);
            c0621Env.info.varArgs = methodResolutionPhaseFirstErroneousResolutionPhase.isVarargsRequired();
            return symbolAccess;
        }
        return symbolStartResolution;
    }

    Symbol resolveConstructor(JCDiagnostic.DiagnosticPosition pos, Env<AttrContext> env, Type site, List<Type> argtypes, List<Type> typeargtypes, boolean allowBoxing, boolean useVarargs) {
        Symbol sym = findMethod(env, site, this.names.init, argtypes, typeargtypes, allowBoxing, useVarargs, false);
        this.f386chk.checkDeprecated(pos, env.info.scope.owner, sym);
        return sym;
    }

    public Symbol.MethodSymbol resolveInternalConstructor(JCDiagnostic.DiagnosticPosition pos, Env<AttrContext> env, Type site, List<Type> argtypes, List<Type> typeargtypes) {
        Symbol sym = resolveConstructor(pos, env, site, argtypes, typeargtypes);
        if (sym.kind == 16) {
            return (Symbol.MethodSymbol) sym;
        }
        throw new FatalError(this.diags.fragment("fatal.err.cant.locate.ctor", site));
    }

    Symbol resolveOperator(JCDiagnostic.DiagnosticPosition pos, int optag, Env<AttrContext> env, List<Type> argtypes) {
        startResolution();
        Name name = this.treeinfo.operatorName(optag);
        Symbol sym = findMethod(env, this.syms.predefClass.type, name, argtypes, null, false, false, true);
        if (this.boxingEnabled && sym.kind >= 69) {
            sym = findMethod(env, this.syms.predefClass.type, name, argtypes, null, true, false, true);
        }
        return access(sym, pos, env.enclClass.f539sym.type, name, false, argtypes, null);
    }

    Symbol resolveUnaryOperator(JCDiagnostic.DiagnosticPosition pos, int optag, Env<AttrContext> env, Type arg) {
        return resolveOperator(pos, optag, env, List.m508of(arg));
    }

    Symbol resolveBinaryOperator(JCDiagnostic.DiagnosticPosition pos, int optag, Env<AttrContext> env, Type left, Type right) {
        return resolveOperator(pos, optag, env, List.m509of(left, right));
    }

    /* JADX WARN: Multi-variable type inference failed */
    Symbol resolveSelf(JCDiagnostic.DiagnosticPosition pos, Env<AttrContext> env, Symbol.TypeSymbol c, Name name) {
        Symbol sym;
        boolean staticOnly = false;
        for (Env c0621Env = env; c0621Env.outer != null; c0621Env = c0621Env.outer) {
            if (isStatic(c0621Env)) {
                staticOnly = true;
            }
            if (c0621Env.enclClass.f539sym == c && (sym = ((AttrContext) c0621Env.info).scope.lookup(name).f338sym) != null) {
                if (staticOnly) {
                    sym = new StaticError(sym);
                }
                return access(sym, pos, env.enclClass.f539sym.type, name, true);
            }
            if ((c0621Env.enclClass.f539sym.flags() & 8) != 0) {
                staticOnly = true;
            }
        }
        this.f387log.error(pos, "not.encl.class", c);
        return this.syms.errSymbol;
    }

    /* JADX WARN: Multi-variable type inference failed */
    Symbol resolveSelfContaining(JCDiagnostic.DiagnosticPosition pos, Env<AttrContext> env, Symbol member, boolean isSuperCall) {
        Symbol sym;
        Name name = this.names._this;
        Env<AttrContext> env1 = isSuperCall ? env.outer : env;
        boolean staticOnly = false;
        if (env1 != null) {
            for (Env c0621Env = env1; c0621Env != null && c0621Env.outer != null; c0621Env = c0621Env.outer) {
                if (isStatic(c0621Env)) {
                    staticOnly = true;
                }
                boolean staticOnly2 = staticOnly;
                if (c0621Env.enclClass.f539sym.isSubClass(member.owner, this.types) && (sym = ((AttrContext) c0621Env.info).scope.lookup(name).f338sym) != null) {
                    if (staticOnly2) {
                        sym = new StaticError(sym);
                    }
                    return access(sym, pos, env.enclClass.f539sym.type, name, true);
                }
                if ((c0621Env.enclClass.f539sym.flags() & 8) == 0) {
                    staticOnly = staticOnly2;
                } else {
                    staticOnly = true;
                }
            }
        }
        this.f387log.error(pos, "encl.class.required", member);
        return this.syms.errSymbol;
    }

    Type resolveImplicitThis(JCDiagnostic.DiagnosticPosition pos, Env<AttrContext> env, Type t) {
        return resolveImplicitThis(pos, env, t, false);
    }

    Type resolveImplicitThis(JCDiagnostic.DiagnosticPosition pos, Env<AttrContext> env, Type t, boolean isSuperCall) {
        Symbol symbolResolveSelfContaining;
        if ((t.tsym.owner.kind & 20) != 0) {
            symbolResolveSelfContaining = resolveSelf(pos, env, t.getEnclosingType().tsym, this.names._this);
        } else {
            symbolResolveSelfContaining = resolveSelfContaining(pos, env, t.tsym, isSuperCall);
        }
        Type thisType = symbolResolveSelfContaining.type;
        if (env.info.isSelfCall && thisType.tsym == env.enclClass.f539sym) {
            this.f387log.error(pos, "cant.ref.before.ctor.called", "this");
        }
        return thisType;
    }

    public void logAccessErrorInternal(Env<AttrContext> env, JCTree tree, Type type) {
        AccessError error = new AccessError(env, env.enclClass.type, type.tsym);
        logResolveError(error, tree.m489pos(), env.enclClass.f539sym, env.enclClass.type, null, null, null);
    }

    private void logResolveError(ResolveError error, JCDiagnostic.DiagnosticPosition pos, Symbol location, Type site, Name name, List<Type> argtypes, List<Type> typeargtypes) {
        JCDiagnostic d = error.getDiagnostic(JCDiagnostic.DiagnosticType.ERROR, pos, location, site, name, argtypes, typeargtypes);
        if (d != null) {
            d.setFlag(JCDiagnostic.DiagnosticFlag.RESOLVE_ERROR);
            this.f387log.report(d);
        }
    }

    public Object methodArguments(List<Type> argtypes) {
        return argtypes.isEmpty() ? this.noArgs : argtypes;
    }

    private abstract class ResolveError extends Symbol {
        final String debugName;

        abstract JCDiagnostic getDiagnostic(JCDiagnostic.DiagnosticType diagnosticType, JCDiagnostic.DiagnosticPosition diagnosticPosition, Symbol symbol, Type type, Name name, List<Type> list, List<Type> list2);

        ResolveError(int kind, String debugName) {
            super(kind, 0L, null, null, null);
            this.debugName = debugName;
        }

        @Override
        public <R, P> R accept(ElementVisitor<R, P> v, P p) {
            throw new AssertionError();
        }

        @Override
        public String toString() {
            return this.debugName;
        }

        @Override
        public boolean exists() {
            return false;
        }

        protected Symbol access(Name name, Symbol.TypeSymbol location) {
            return Resolve.this.types.createErrorType(name, location, Resolve.this.syms.errSymbol.type).tsym;
        }

        boolean isOperator(Name name) {
            int i = 0;
            while (i < name.getByteLength() && "+-~!*/%&|^<>=".indexOf(name.getByteAt(i)) >= 0) {
                i++;
            }
            return i > 0 && i == name.getByteLength();
        }
    }

    abstract class InvalidSymbolError extends ResolveError {

        Symbol f391sym;

        InvalidSymbolError(int kind, Symbol sym, String debugName) {
            super(kind, debugName);
            this.f391sym = sym;
        }

        @Override
        public boolean exists() {
            return true;
        }

        @Override
        public String toString() {
            return super.toString() + " wrongSym=" + this.f391sym;
        }

        @Override
        public Symbol access(Name name, Symbol.TypeSymbol location) {
            if (this.f391sym.kind >= 65) {
                return ((ResolveError) this.f391sym).access(name, location);
            }
            if ((this.f391sym.kind & 64) == 0 && (this.f391sym.kind & 2) != 0) {
                return Resolve.this.types.createErrorType(name, location, this.f391sym.type).tsym;
            }
            return this.f391sym;
        }
    }

    class SymbolNotFoundError extends ResolveError {
        SymbolNotFoundError(int kind) {
            super(kind, "symbol not found error");
        }

        @Override
        JCDiagnostic getDiagnostic(JCDiagnostic.DiagnosticType dkind, JCDiagnostic.DiagnosticPosition pos, Symbol location, Type site, Name name, List<Type> argtypes, List<Type> typeargtypes) {
            Symbol location2;
            String key;
            List<Type> argtypes2 = argtypes == null ? List.m507nil() : argtypes;
            List<Type> typeargtypes2 = typeargtypes == null ? List.m507nil() : typeargtypes;
            if (name == Resolve.this.names.error) {
                return null;
            }
            if (isOperator(name)) {
                boolean isUnaryOp = argtypes2.size() == 1;
                if (argtypes2.size() == 1) {
                    key = "operator.cant.be.applied";
                } else {
                    key = "operator.cant.be.applied.1";
                }
                Type first = argtypes2.head;
                Type second = isUnaryOp ? null : argtypes2.tail.head;
                return Resolve.this.diags.create(dkind, Resolve.this.f387log.currentSource(), pos, key, name, first, second);
            }
            boolean hasLocation = false;
            if (location != null) {
                location2 = location;
            } else {
                location2 = site.tsym;
            }
            if (!location2.name.isEmpty()) {
                if (location2.kind == 1 && !site.tsym.exists()) {
                    return Resolve.this.diags.create(dkind, Resolve.this.f387log.currentSource(), pos, "doesnt.exist", location2);
                }
                hasLocation = (location2.name.equals(Resolve.this.names._this) || location2.name.equals(Resolve.this.names._super)) ? false : true;
            }
            boolean isConstructor = this.kind == 71 && name == Resolve.this.names.table.names.init;
            Kinds.KindName kindname = isConstructor ? Kinds.KindName.CONSTRUCTOR : Kinds.absentKind(this.kind);
            Name idname = isConstructor ? site.tsym.name : name;
            String errKey = getErrorKey(kindname, typeargtypes2.nonEmpty(), hasLocation);
            return hasLocation ? Resolve.this.diags.create(dkind, Resolve.this.f387log.currentSource(), pos, errKey, kindname, idname, typeargtypes2, argtypes2, getLocationDiag(location2, site)) : Resolve.this.diags.create(dkind, Resolve.this.f387log.currentSource(), pos, errKey, kindname, idname, typeargtypes2, argtypes2);
        }

        private String getErrorKey(Kinds.KindName kindname, boolean hasTypeArgs, boolean hasLocation) {
            String suffix = hasLocation ? ".location" : "";
            int i = C06473.f388x693658b4[kindname.ordinal()];
            if (i == 1 || i == 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(suffix + ".args");
                sb.append(hasTypeArgs ? ".params" : "");
                suffix = sb.toString();
            }
            return "cant.resolve" + suffix;
        }

        private JCDiagnostic getLocationDiag(Symbol location, Type site) {
            if (location.kind == 4) {
                return Resolve.this.diags.fragment("location.1", Kinds.kindName(location), location, location.type);
            }
            return Resolve.this.diags.fragment("location", Kinds.typeKindName(site), site, null);
        }
    }

    static class C06473 {

        static final int[] f388x693658b4;

        static {
            int[] iArr = new int[Kinds.KindName.values().length];
            f388x693658b4 = iArr;
            try {
                iArr[Kinds.KindName.METHOD.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f388x693658b4[Kinds.KindName.CONSTRUCTOR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    class InapplicableSymbolError extends InvalidSymbolError {
        JCDiagnostic explanation;

        InapplicableSymbolError(Symbol sym) {
            super(70, sym, "inapplicable symbol error");
        }

        InapplicableSymbolError setWrongSym(Symbol sym, JCDiagnostic explanation) {
            this.f391sym = sym;
            if (this.f391sym == sym && explanation != null) {
                this.explanation = explanation;
            }
            return this;
        }

        InapplicableSymbolError setWrongSym(Symbol sym) {
            this.f391sym = sym;
            return this;
        }

        @Override
        public String toString() {
            return super.toString() + " explanation=" + this.explanation;
        }

        @Override
        JCDiagnostic getDiagnostic(JCDiagnostic.DiagnosticType dkind, JCDiagnostic.DiagnosticPosition pos, Symbol location, Type site, Name name, List<Type> argtypes, List<Type> typeargtypes) {
            String key;
            if (name == Resolve.this.names.error) {
                return null;
            }
            if (!isOperator(name)) {
                Symbol ws = this.f391sym.asMemberOf(site, Resolve.this.types);
                JCDiagnostic.Factory factory = Resolve.this.diags;
                DiagnosticSource diagnosticSourceCurrentSource = Resolve.this.f387log.currentSource();
                StringBuilder sb = new StringBuilder();
                sb.append("cant.apply.symbol");
                sb.append(this.explanation != null ? ".1" : "");
                String string = sb.toString();
                Object[] objArr = new Object[7];
                objArr[0] = Kinds.kindName(ws);
                objArr[1] = ws.name == Resolve.this.names.init ? ws.owner.name : ws.name;
                objArr[2] = Resolve.this.methodArguments(ws.type.mo573getParameterTypes());
                objArr[3] = Resolve.this.methodArguments(argtypes);
                objArr[4] = Kinds.kindName(ws.owner);
                objArr[5] = ws.owner.type;
                objArr[6] = this.explanation;
                return factory.create(dkind, diagnosticSourceCurrentSource, pos, string, objArr);
            }
            boolean isUnaryOp = argtypes.size() == 1;
            if (argtypes.size() == 1) {
                key = "operator.cant.be.applied";
            } else {
                key = "operator.cant.be.applied.1";
            }
            Type first = argtypes.head;
            Type second = isUnaryOp ? null : argtypes.tail.head;
            return Resolve.this.diags.create(dkind, Resolve.this.f387log.currentSource(), pos, key, name, first, second);
        }

        void clear() {
            this.explanation = null;
        }

        @Override
        public Symbol access(Name name, Symbol.TypeSymbol location) {
            return Resolve.this.types.createErrorType(name, location, Resolve.this.syms.errSymbol.type).tsym;
        }
    }

    class InapplicableSymbolsError extends ResolveError {
        private List<Candidate> candidates;

        InapplicableSymbolsError(Symbol sym) {
            super(69, "inapplicable symbols");
            this.candidates = List.m507nil();
        }

        @Override
        JCDiagnostic getDiagnostic(JCDiagnostic.DiagnosticType dkind, JCDiagnostic.DiagnosticPosition pos, Symbol location, Type site, Name name, List<Type> argtypes, List<Type> typeargtypes) {
            if (!this.candidates.nonEmpty()) {
                return Resolve.this.new SymbolNotFoundError(71).getDiagnostic(dkind, pos, location, site, name, argtypes, typeargtypes);
            }
            JCDiagnostic.Factory factory = Resolve.this.diags;
            DiagnosticSource diagnosticSourceCurrentSource = Resolve.this.f387log.currentSource();
            Object[] objArr = new Object[3];
            objArr[0] = name == Resolve.this.names.init ? Kinds.KindName.CONSTRUCTOR : Kinds.absentKind(this.kind);
            objArr[1] = getName();
            objArr[2] = argtypes;
            JCDiagnostic err = factory.create(dkind, diagnosticSourceCurrentSource, pos, "cant.apply.symbols", objArr);
            return new JCDiagnostic.MultilineDiagnostic(err, candidateDetails(site));
        }

        List<JCDiagnostic> candidateDetails(Type site) {
            List<JCDiagnostic> details = List.m507nil();
            for (Candidate c : this.candidates) {
                details = details.prepend(c.getDiagnostic(site));
            }
            return details.reverse();
        }

        Symbol addCandidate(MethodResolutionPhase currentStep, Symbol sym, JCDiagnostic details) {
            Candidate c = new Candidate(currentStep, sym, details);
            if (c.isValid() && !this.candidates.contains(c)) {
                this.candidates = this.candidates.append(c);
            }
            return this;
        }

        void clear() {
            this.candidates = List.m507nil();
        }

        private Name getName() {
            Symbol sym = this.candidates.head.f390sym;
            if (sym.name == Resolve.this.names.init) {
                return sym.owner.name;
            }
            return sym.name;
        }

        private class Candidate {
            final JCDiagnostic details;
            final MethodResolutionPhase step;

            final Symbol f390sym;

            private Candidate(MethodResolutionPhase step, Symbol sym, JCDiagnostic details) {
                this.step = step;
                this.f390sym = sym;
                this.details = details;
            }

            JCDiagnostic getDiagnostic(Type site) {
                return Resolve.this.diags.fragment("inapplicable.method", Kinds.kindName(this.f390sym), this.f390sym.location(site, Resolve.this.types), this.f390sym.asMemberOf(site, Resolve.this.types), this.details);
            }

            public boolean equals(Object o) {
                if (o instanceof Candidate) {
                    Symbol s1 = this.f390sym;
                    Symbol s2 = ((Candidate) o).f390sym;
                    if (s1 == s2 || (!s1.overrides(s2, s1.owner.type.tsym, Resolve.this.types, false) && !s2.overrides(s1, s2.owner.type.tsym, Resolve.this.types, false))) {
                        if ((s1.isConstructor() || s2.isConstructor()) && s1.owner != s2.owner) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            }

            boolean isValid() {
                if ((this.f390sym.flags() & Flags.VARARGS) == 0 || this.step != MethodResolutionPhase.VARARITY) {
                    if ((this.f390sym.flags() & Flags.VARARGS) == 0) {
                        if (this.step == (Resolve.this.boxingEnabled ? MethodResolutionPhase.BOX : MethodResolutionPhase.BASIC)) {
                        }
                    }
                    return false;
                }
                return true;
            }
        }
    }

    class AccessError extends InvalidSymbolError {

        private Env<AttrContext> f389env;
        private Type site;

        AccessError(Resolve this$0, Symbol sym) {
            this(null, null, sym);
        }

        AccessError(Env<AttrContext> env, Type site, Symbol sym) {
            super(66, sym, "access error");
            this.f389env = env;
            this.site = site;
            if (Resolve.this.debugResolve) {
                Resolve.this.f387log.error("proc.messager", sym + " @ " + site + " is inaccessible.");
            }
        }

        @Override
        public boolean exists() {
            return false;
        }

        @Override
        JCDiagnostic getDiagnostic(JCDiagnostic.DiagnosticType dkind, JCDiagnostic.DiagnosticPosition pos, Symbol location, Type site, Name name, List<Type> argtypes, List<Type> typeargtypes) {
            Env<AttrContext> c0621Env;
            Type type;
            if (this.f391sym.owner.type.f344tag != 19) {
                if (this.f391sym.name == Resolve.this.names.init && this.f391sym.owner != site.tsym) {
                    return Resolve.this.new SymbolNotFoundError(71).getDiagnostic(dkind, pos, location, site, name, argtypes, typeargtypes);
                }
                if ((this.f391sym.flags() & 1) != 0 || ((c0621Env = this.f389env) != null && (type = this.site) != null && !Resolve.this.isAccessible(c0621Env, type))) {
                    return Resolve.this.diags.create(dkind, Resolve.this.f387log.currentSource(), pos, "not.def.access.class.intf.cant.access", this.f391sym, this.f391sym.location());
                }
                if ((this.f391sym.flags() & 6) != 0) {
                    return Resolve.this.diags.create(dkind, Resolve.this.f387log.currentSource(), pos, "report.access", this.f391sym, Flags.asFlagSet(this.f391sym.flags() & 6), this.f391sym.location());
                }
                return Resolve.this.diags.create(dkind, Resolve.this.f387log.currentSource(), pos, "not.def.public.cant.access", this.f391sym, this.f391sym.location());
            }
            return null;
        }
    }

    class StaticError extends InvalidSymbolError {
        StaticError(Symbol sym) {
            super(67, sym, "static error");
        }

        @Override
        JCDiagnostic getDiagnostic(JCDiagnostic.DiagnosticType dkind, JCDiagnostic.DiagnosticPosition pos, Symbol location, Type site, Name name, List<Type> argtypes, List<Type> typeargtypes) {
            Symbol errSym;
            if (this.f391sym.kind == 2 && this.f391sym.type.f344tag == 10) {
                errSym = Resolve.this.types.erasure(this.f391sym.type).tsym;
            } else {
                errSym = this.f391sym;
            }
            return Resolve.this.diags.create(dkind, Resolve.this.f387log.currentSource(), pos, "non-static.cant.be.ref", Kinds.kindName(this.f391sym), errSym);
        }
    }

    class AmbiguityError extends InvalidSymbolError {
        Symbol sym2;

        AmbiguityError(Symbol sym1, Symbol sym2) {
            super(65, sym1, "ambiguity error");
            this.sym2 = sym2;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.$r8$lambda$3Jn-YhBaujEHu2U7RtYHYfrstds(FixTypesVisitor.java:0)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor$$ExternalSyntheticLambda8.apply(D8$$SyntheticClass:0)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override
        JCDiagnostic getDiagnostic(JCDiagnostic.DiagnosticType dkind, JCDiagnostic.DiagnosticPosition pos, Symbol location, Type site, Name name, List<Type> argtypes, List<Type> typeargtypes) {
            AmbiguityError pair = this;
            while (true) {
                if (pair.f391sym.kind == 65) {
                    pair = (AmbiguityError) pair.f391sym;
                } else {
                    if (pair.sym2.kind != 65) {
                        break;
                    }
                    pair = (AmbiguityError) pair.sym2;
                }
            }
            Name sname = pair.f391sym.name;
            if (sname == Resolve.this.names.init) {
                sname = pair.f391sym.owner.name;
            }
            JCDiagnostic.Factory factory = Resolve.this.diags;
            DiagnosticSource diagnosticSourceCurrentSource = Resolve.this.f387log.currentSource();
            Symbol symbol = pair.sym2;
            return factory.create(dkind, diagnosticSourceCurrentSource, pos, "ref.ambiguous", sname, Kinds.kindName(pair.f391sym), pair.f391sym, pair.f391sym.location(site, Resolve.this.types), Kinds.kindName(pair.sym2), symbol, symbol.location(site, Resolve.this.types));
        }
    }

    enum MethodResolutionPhase {
        BASIC(false, false),
        BOX(true, false),
        VARARITY(true, true);

        boolean isBoxingRequired;
        boolean isVarargsRequired;

        MethodResolutionPhase(boolean isBoxingRequired, boolean isVarargsRequired) {
            this.isBoxingRequired = isBoxingRequired;
            this.isVarargsRequired = isVarargsRequired;
        }

        public boolean isBoxingRequired() {
            return this.isBoxingRequired;
        }

        public boolean isVarargsRequired() {
            return this.isVarargsRequired;
        }

        public boolean isApplicable(boolean boxingEnabled, boolean varargsEnabled) {
            return (varargsEnabled || !this.isVarargsRequired) && (boxingEnabled || !this.isBoxingRequired);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MethodResolutionPhase firstErroneousResolutionPhase() {
        MethodResolutionPhase bestSoFar = MethodResolutionPhase.BASIC;
        Symbol sym = this.methodNotFound;
        for (List list = this.methodResolutionSteps; list.nonEmpty() && ((MethodResolutionPhase) list.head).isApplicable(this.boxingEnabled, this.varargsEnabled) && sym.kind >= 69; list = list.tail) {
            Symbol sym2 = this.methodResolutionCache.get(list.head);
            sym = sym2;
            bestSoFar = (MethodResolutionPhase) list.head;
        }
        return bestSoFar;
    }
}
