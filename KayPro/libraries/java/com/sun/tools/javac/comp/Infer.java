package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.BoundKind;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Filter;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Warner;
import java.util.Iterator;

public class Infer {
    private final NoInstanceException ambiguousNoInstanceException;

    Check f374chk;
    JCDiagnostic.Factory diags;
    private final InvalidInstanceException invalidInstanceException;

    Resolve f375rs;
    Symtab syms;
    Types types;
    private final NoInstanceException unambiguousNoInstanceException;
    protected static final Context.C0723Key<Infer> inferKey = new Context.C0723Key<>();
    public static final Type anyPoly = new Type(18, null);
    Type.Mapping fromTypeVarFun = new Type.Mapping("fromTypeVarFun") {
        @Override
        public Type apply(Type t) {
            return t.f344tag == 14 ? new Type.UndetVar(t) : t.mo453map(this);
        }
    };
    Type.Mapping getInstFun = new Type.Mapping("getInstFun") {
        @Override
        public Type apply(Type t) {
            int i = t.f344tag;
            if (i == 20) {
                throw Infer.this.ambiguousNoInstanceException.setMessage("undetermined.type");
            }
            if (i == 21) {
                Type.UndetVar that = (Type.UndetVar) t;
                if (that.inst == null) {
                    throw Infer.this.ambiguousNoInstanceException.setMessage("type.variable.has.undetermined.type", that.qtype);
                }
                if (isConstraintCyclic(that)) {
                    return that.qtype;
                }
                return apply(that.inst);
            }
            return t.mo453map(this);
        }

        private boolean isConstraintCyclic(Type.UndetVar uv) {
            Types.UnaryVisitor<Boolean> constraintScanner = new Types.UnaryVisitor<Boolean>() {
                List<Type> seen = List.m507nil();

                Boolean visit(List<Type> ts) {
                    for (Type t : ts) {
                        if (visit(t).booleanValue()) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override
                public Boolean visitType(Type t, Void ignored) {
                    return false;
                }

                @Override
                public Boolean visitClassType(Type.ClassType t, Void ignored) {
                    if (t.isCompound()) {
                        return Boolean.valueOf(visit(Infer.this.types.supertype(t)).booleanValue() || visit(Infer.this.types.interfaces(t)).booleanValue());
                    }
                    return visit(t.getTypeArguments());
                }

                @Override
                public Boolean visitWildcardType(Type.WildcardType t, Void ignored) {
                    return visit(t.type);
                }

                @Override
                public Boolean visitUndetVar(Type.UndetVar t, Void ignored) {
                    if (this.seen.contains(t)) {
                        return true;
                    }
                    this.seen = this.seen.prepend(t);
                    return visit(t.inst);
                }
            };
            return constraintScanner.visit(uv).booleanValue();
        }
    };
    private Filter<Type> errorFilter = new Filter<Type>() {
        @Override
        public boolean accepts(Type t) {
            return !t.isErroneous();
        }
    };
    private final Filter<Type> botFilter = new Filter<Type>() {
        @Override
        public boolean accepts(Type t) {
            return t.f344tag != 17;
        }
    };
    Type.Mapping implicitArgType = new Type.Mapping("implicitArgType") {
        @Override
        public Type apply(Type t) {
            Type t2 = Infer.this.types.erasure(t);
            if (t2.f344tag == 17) {
                Type t3 = Infer.this.types.boxedClass(Infer.this.syms.voidType).type;
                return t3;
            }
            return t2;
        }
    };

    public static Infer instance(Context context) {
        Infer instance = (Infer) context.m501get(inferKey);
        if (instance == null) {
            return new Infer(context);
        }
        return instance;
    }

    protected Infer(Context context) {
        context.m504put(inferKey, this);
        this.syms = Symtab.instance(context);
        this.types = Types.instance(context);
        this.f375rs = Resolve.instance(context);
        this.f374chk = Check.instance(context);
        this.diags = JCDiagnostic.Factory.instance(context);
        this.ambiguousNoInstanceException = new NoInstanceException(true, this.diags);
        this.unambiguousNoInstanceException = new NoInstanceException(false, this.diags);
        this.invalidInstanceException = new InvalidInstanceException(this.diags);
    }

    public static class InferenceException extends Resolve.InapplicableMethodException {
        private static final long serialVersionUID = 0;

        InferenceException(JCDiagnostic.Factory diags) {
            super(diags);
        }
    }

    public static class NoInstanceException extends InferenceException {
        private static final long serialVersionUID = 1;
        boolean isAmbiguous;

        NoInstanceException(boolean isAmbiguous, JCDiagnostic.Factory diags) {
            super(diags);
            this.isAmbiguous = isAmbiguous;
        }
    }

    public static class InvalidInstanceException extends InferenceException {
        private static final long serialVersionUID = 2;

        InvalidInstanceException(JCDiagnostic.Factory diags) {
            super(diags);
        }
    }

    void maximizeInst(Type.UndetVar that, Warner warn) throws NoInstanceException {
        List<Type> hibounds = Type.filter(that.hibounds, this.errorFilter);
        if (that.inst == null) {
            if (hibounds.isEmpty()) {
                that.inst = this.syms.objectType;
            } else if (hibounds.tail.isEmpty()) {
                that.inst = hibounds.head;
            } else {
                that.inst = this.types.m455glb(hibounds);
            }
        }
        if (that.inst == null || that.inst.isErroneous()) {
            throw this.ambiguousNoInstanceException.setMessage("no.unique.maximal.instance.exists", that.qtype, hibounds);
        }
    }

    private boolean isSubClass(Type t, List<Type> ts) {
        Type t2 = t.baseType();
        if (t2.f344tag == 14) {
            List<Type> bounds = this.types.getBounds((Type.TypeVar) t2);
            for (Type s : ts) {
                if (!this.types.isSameType(t2, s.baseType())) {
                    for (Type bound : bounds) {
                        if (!isSubClass(bound, List.m508of(s.baseType()))) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        Iterator<Type> it = ts.iterator();
        while (it.hasNext()) {
            if (!t2.tsym.isSubClass(it.next().baseType().tsym, this.types)) {
                return false;
            }
        }
        return true;
    }

    void minimizeInst(Type.UndetVar that, Warner warn) throws NoInstanceException {
        Type hb;
        List<Type> lobounds = Type.filter(that.lobounds, this.errorFilter);
        if (that.inst == null) {
            if (lobounds.isEmpty()) {
                that.inst = this.syms.botType;
            } else if (lobounds.tail.isEmpty()) {
                that.inst = lobounds.head.isPrimitive() ? this.syms.errType : lobounds.head;
            } else {
                that.inst = this.types.m457lub(lobounds);
            }
            if (that.inst == null || that.inst.f344tag == 19) {
                throw this.ambiguousNoInstanceException.setMessage("no.unique.minimal.instance.exists", that.qtype, lobounds);
            }
            List<Type> hibounds = Type.filter(that.hibounds, this.errorFilter);
            if (hibounds.isEmpty()) {
                hb = this.syms.objectType;
            } else if (hibounds.tail.isEmpty()) {
                Type hb2 = hibounds.head;
                hb = hb2;
            } else {
                hb = this.types.m455glb(hibounds);
            }
            if (hb == null || hb.isErroneous()) {
                throw this.ambiguousNoInstanceException.setMessage("incompatible.upper.bounds", that.qtype, hibounds);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Type instantiateExpr(Type.ForAll that, Type to, Warner warn) throws InferenceException {
        List<Type> undetvars = Type.m452map(that.tvars, this.fromTypeVarFun);
        for (List list = undetvars; list.nonEmpty(); list = list.tail) {
            Type.UndetVar uv = (Type.UndetVar) list.head;
            Type.TypeVar tv = (Type.TypeVar) uv.qtype;
            ListBuffer<Type> hibounds = new ListBuffer<>();
            for (Type t : that.getConstraints(tv, Type.ForAll.ConstraintKind.EXTENDS)) {
                hibounds.append(this.types.subst(t, that.tvars, undetvars));
            }
            List<Type> inst = that.getConstraints(tv, Type.ForAll.ConstraintKind.EQUAL);
            if (inst.nonEmpty() && inst.head.f344tag != 17) {
                uv.inst = inst.head;
            }
            uv.hibounds = hibounds.toList();
        }
        Type qtype1 = this.types.subst(that.qtype, that.tvars, undetvars);
        if (!this.types.isSubtype(qtype1, qtype1.f344tag == 21 ? this.types.boxedTypeOrType(to) : to)) {
            throw this.unambiguousNoInstanceException.setMessage("infer.no.conforming.instance.exists", that.tvars, that.qtype, to);
        }
        for (List list2 = undetvars; list2.nonEmpty(); list2 = list2.tail) {
            maximizeInst((Type.UndetVar) list2.head, warn);
        }
        List<Type> targs = Type.m452map(undetvars, this.getInstFun);
        if (Type.containsAny(targs, that.tvars)) {
            targs = this.types.subst(targs, that.tvars, instantiateAsUninferredVars(undetvars, that.tvars));
        }
        return this.f374chk.checkType(warn.m520pos(), that.inst(targs, this.types), to);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<Type> instantiateAsUninferredVars(List<Type> undetvars, List<Type> tvars) {
        Assert.check(undetvars.length() == tvars.length());
        ListBuffer<Type> new_targs = ListBuffer.m512lb();
        for (Type t : undetvars) {
            Type.UndetVar uv = (Type.UndetVar) t;
            Type newArg = new Type.CapturedType(t.tsym.name, t.tsym, uv.inst, this.syms.botType, null);
            new_targs = new_targs.append(newArg);
        }
        List list = tvars;
        Iterator<Type> it = new_targs.toList().iterator();
        while (it.hasNext()) {
            Type.CapturedType ct = (Type.CapturedType) it.next();
            ct.bound = this.types.subst(ct.bound, tvars, new_targs.toList());
            Type.WildcardType wt = new Type.WildcardType(this.syms.objectType, BoundKind.UNBOUND, this.syms.boundClass);
            wt.bound = (Type.TypeVar) list.head;
            ct.wildcard = wt;
            list = list.tail;
        }
        return new_targs.toList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Type instantiateMethod(final Env<AttrContext> env, final List<Type> tvars, Type.MethodType mt, final Symbol msym, List<Type> argtypes, final boolean allowBoxing, final boolean useVarargs, final Warner warn) throws InferenceException {
        boolean works;
        List<Type> undetvars = Type.m452map(tvars, this.fromTypeVarFun);
        List<Type> formals = mt.argtypes;
        final List<Type> capturedArgs = this.types.capture(argtypes);
        List list = capturedArgs;
        List list2 = argtypes;
        Type varargsFormal = useVarargs ? formals.last() : null;
        if (varargsFormal == null && list.size() != formals.size()) {
            throw this.unambiguousNoInstanceException.setMessage("infer.arg.length.mismatch");
        }
        List list3 = formals;
        while (list.nonEmpty() && list3.head != varargsFormal) {
            Type formal = (Type) list3.head;
            Type actual = ((Type) list.head).baseType();
            Type actualNoCapture = ((Type) list2.head).baseType();
            if (actual.f344tag == 16) {
                actual = instantiateArg((Type.ForAll) actual, formal, tvars, warn);
            }
            Type undetFormal = this.types.subst(formal, tvars, undetvars);
            if (allowBoxing) {
                works = this.types.isConvertible(actual, undetFormal, warn);
            } else {
                works = this.types.isSubtypeUnchecked(actual, undetFormal, warn);
            }
            if (!works) {
                throw this.unambiguousNoInstanceException.setMessage("infer.no.conforming.assignment.exists", tvars, actualNoCapture, formal);
            }
            list3 = list3.tail;
            list = list.tail;
            list2 = list2.tail;
        }
        List list4 = list;
        if (list3.head != varargsFormal) {
            throw this.unambiguousNoInstanceException.setMessage("infer.arg.length.mismatch");
        }
        if (useVarargs) {
            Type elemType = this.types.elemtype(varargsFormal);
            Type elemUndet = this.types.subst(elemType, tvars, undetvars);
            List list5 = list2;
            List list6 = list4;
            while (list6.nonEmpty()) {
                Type actual2 = ((Type) list6.head).baseType();
                Type actualNoCapture2 = ((Type) list5.head).baseType();
                if (actual2.f344tag == 16) {
                    actual2 = instantiateArg((Type.ForAll) actual2, elemType, tvars, warn);
                }
                boolean works2 = this.types.isConvertible(actual2, elemUndet, warn);
                if (!works2) {
                    throw this.unambiguousNoInstanceException.setMessage("infer.no.conforming.assignment.exists", tvars, actualNoCapture2, elemType);
                }
                list6 = list6.tail;
                list5 = list5.tail;
            }
        }
        for (Type t : undetvars) {
            minimizeInst((Type.UndetVar) t, warn);
        }
        ListBuffer<Type> restvars = new ListBuffer<>();
        final ListBuffer<Type> restundet = new ListBuffer<>();
        ListBuffer<Type> insttypes = new ListBuffer<>();
        ListBuffer<Type> undettypes = new ListBuffer<>();
        for (Type t2 : undetvars) {
            Type.UndetVar uv = (Type.UndetVar) t2;
            if (uv.inst.f344tag == 17) {
                restvars.append(uv.qtype);
                restundet.append(uv);
                insttypes.append(uv.qtype);
                undettypes.append(uv);
                uv.inst = null;
            } else {
                insttypes.append(uv.inst);
                undettypes.append(uv.inst);
            }
        }
        checkWithinBounds(tvars, undettypes.toList(), warn);
        Type.MethodType mt2 = (Type.MethodType) this.types.subst(mt, tvars, insttypes.toList());
        if (!restvars.isEmpty()) {
            final List<Type> inferredTypes = insttypes.toList();
            return new UninferredMethodType(mt2, restvars.toList()) {
                @Override
                List<Type> getConstraints(Type.TypeVar tv, Type.ForAll.ConstraintKind ck) {
                    for (Type t3 : restundet.toList()) {
                        Type.UndetVar uv2 = (Type.UndetVar) t3;
                        if (uv2.qtype == tv) {
                            int i = C06287.f376x8d3ec7e3[ck.ordinal()];
                            if (i == 1) {
                                return Type.filter(uv2.hibounds, Infer.this.botFilter).appendList(Infer.this.types.subst(Infer.this.types.getBounds(tv), tvars, inferredTypes));
                            }
                            if (i == 2) {
                                return uv2.lobounds;
                            }
                            if (i == 3) {
                                return uv2.inst != null ? List.m508of(uv2.inst) : List.m507nil();
                            }
                        }
                    }
                    return List.m507nil();
                }

                @Override
                void check(List<Type> inferred, Types types) throws NoInstanceException {
                    Infer.this.checkArgumentsAcceptable(env, capturedArgs, mo573getParameterTypes(), allowBoxing, useVarargs, warn);
                    Infer.this.checkWithinBounds(tvars, types.subst(inferredTypes, this.tvars, inferred), warn);
                    if (useVarargs) {
                        Infer.this.f374chk.checkVararg(env.tree.m489pos(), mo573getParameterTypes(), msym);
                    }
                }
            };
        }
        checkArgumentsAcceptable(env, capturedArgs, mt2.mo573getParameterTypes(), allowBoxing, useVarargs, warn);
        return mt2;
    }

    static class C06287 {

        static final int[] f376x8d3ec7e3;

        static {
            int[] iArr = new int[Type.ForAll.ConstraintKind.values().length];
            f376x8d3ec7e3 = iArr;
            try {
                iArr[Type.ForAll.ConstraintKind.EXTENDS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f376x8d3ec7e3[Type.ForAll.ConstraintKind.SUPER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f376x8d3ec7e3[Type.ForAll.ConstraintKind.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    static abstract class UninferredMethodType extends Type.DelegatedType {
        final List<Type> tvars;

        abstract void check(List<Type> list, Types types) throws NoInstanceException;

        abstract List<Type> getConstraints(Type.TypeVar typeVar, Type.ForAll.ConstraintKind constraintKind);

        public UninferredMethodType(Type.MethodType mtype, List<Type> tvars) {
            super(12, new Type.MethodType(mtype.argtypes, null, mtype.thrown, mtype.tsym));
            this.tvars = tvars;
            asMethodType().restype = new UninferredReturnType(tvars, mtype.restype);
        }

        @Override
        public Type.MethodType asMethodType() {
            return this.qtype.asMethodType();
        }

        @Override
        public Type mo453map(Type.Mapping f) {
            return this.qtype.mo453map(f);
        }

        void instantiateReturnType(Type restype, List<Type> inferred, Types types) throws NoInstanceException {
            this.qtype = new Type.MethodType(types.subst(mo573getParameterTypes(), this.tvars, inferred), restype, types.subst(mo575getThrownTypes(), this.tvars, inferred), this.qtype.tsym);
            check(inferred, types);
        }

        class UninferredReturnType extends Type.ForAll {
            public UninferredReturnType(List<Type> tvars, Type restype) {
                super(tvars, restype);
            }

            @Override
            public Type inst(List<Type> actuals, Types types) {
                Type newRestype = super.inst(actuals, types);
                UninferredMethodType.this.instantiateReturnType(newRestype, actuals, types);
                return newRestype;
            }

            @Override
            public List<Type> getConstraints(Type.TypeVar tv, Type.ForAll.ConstraintKind ck) {
                return UninferredMethodType.this.getConstraints(tv, ck);
            }
        }
    }

    public void checkArgumentsAcceptable(Env<AttrContext> env, List<Type> actuals, List<Type> formals, boolean allowBoxing, boolean useVarargs, Warner warn) {
        try {
            this.f375rs.checkRawArgumentsAcceptable(env, actuals, formals, allowBoxing, useVarargs, warn);
        } catch (Resolve.InapplicableMethodException ex) {
            throw this.invalidInstanceException.setMessage(ex.getDiagnostic());
        }
    }

    private Type instantiateArg(Type.ForAll that, Type to, List<Type> tvars, Warner warn) throws InferenceException {
        try {
            return instantiateExpr(that, to, warn);
        } catch (NoInstanceException e) {
            Type to1 = to;
            for (List list = tvars; list.nonEmpty(); list = list.tail) {
                to1 = this.types.subst(to1, List.m508of((Object) list.head), List.m508of(this.syms.unknownType));
            }
            return instantiateExpr(that, to1, warn);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void checkWithinBounds(List<Type> tvars, List<Type> arguments, Warner warn) throws InvalidInstanceException {
        List list = tvars;
        List list2 = arguments;
        while (list.nonEmpty()) {
            if (!(list2.head instanceof Type.UndetVar) && !tvars.head.mo576getUpperBound().isErroneous()) {
                Types types = this.types;
                List<Type> bounds = types.subst(types.getBounds((Type.TypeVar) list.head), tvars, arguments);
                if (!this.types.isSubtypeUnchecked((Type) list2.head, bounds, warn)) {
                    throw this.invalidInstanceException.setMessage("inferred.do.not.conform.to.bounds", list2.head, bounds);
                }
            }
            list = list.tail;
            list2 = list2.tail;
        }
    }

    Type instantiatePolymorphicSignatureInstance(Env<AttrContext> env, Type site, Name name, Symbol.MethodSymbol spMethod, List<Type> argtypes) {
        Type restype;
        Type restype2;
        List<Type> exType;
        Type restype3;
        int tag = env.next.tree.getTag();
        if (tag == 20) {
            JCTree.JCExpressionStatement execTree = (JCTree.JCExpressionStatement) env.next.tree;
            if (TreeInfo.skipParens(execTree.expr) == env.tree) {
                restype = this.syms.voidType;
            } else {
                restype = this.syms.objectType;
            }
            restype2 = restype;
        } else if (tag == 31) {
            JCTree.JCTypeCast castTree = (JCTree.JCTypeCast) env.next.tree;
            if (TreeInfo.skipParens(castTree.expr) == env.tree) {
                restype3 = castTree.clazz.type;
            } else {
                restype3 = this.syms.objectType;
            }
            restype2 = restype3;
        } else {
            restype2 = this.syms.objectType;
        }
        List<Type> paramtypes = Type.m452map(argtypes, this.implicitArgType);
        if (spMethod != null) {
            exType = spMethod.getThrownTypes();
        } else {
            exType = List.m508of(this.syms.throwableType);
        }
        Type.MethodType mtype = new Type.MethodType(paramtypes, restype2, exType, this.syms.methodClass);
        return mtype;
    }
}
