package com.sun.tools.javac.code;

import com.sun.tools.javac.comp.Check;
import com.sun.tools.javac.jvm.ClassReader;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Filter;
import com.sun.tools.javac.util.JavacMessages;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Warner;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class Types {
    final boolean allowBoxing;
    final boolean allowCovariantReturns;
    final boolean allowObjectToPrimitiveCast;
    final Name capturedName;

    final Check f348chk;
    final JavacMessages messages;
    final Names names;
    final ClassReader reader;
    final Symtab syms;
    protected static final Context.C0723Key<Types> typesKey = new Context.C0723Key<>();
    private static Type.Mapping newInstanceFun = new Type.Mapping("newInstanceFun") {
        @Override
        public Type apply(Type t) {
            return new Type.TypeVar(t.tsym, t.mo576getUpperBound(), t.getLowerBound());
        }
    };
    private static final UnaryVisitor<Integer> hashCode = new UnaryVisitor<Integer>() {
        @Override
        public Integer visitType(Type t, Void ignored) {
            return Integer.valueOf(t.f344tag);
        }

        @Override
        public Integer visitClassType(Type.ClassType t, Void ignored) {
            int result = visit(t.getEnclosingType()).intValue();
            int result2 = (result * 127) + t.tsym.flatName().hashCode();
            for (Type s : t.getTypeArguments()) {
                result2 = (result2 * 127) + visit(s).intValue();
            }
            return Integer.valueOf(result2);
        }

        @Override
        public Integer visitWildcardType(Type.WildcardType t, Void ignored) {
            int result = t.kind.hashCode();
            if (t.type != null) {
                result = (result * 127) + visit(t.type).intValue();
            }
            return Integer.valueOf(result);
        }

        @Override
        public Integer visitArrayType(Type.ArrayType t, Void ignored) {
            return Integer.valueOf(visit(t.elemtype).intValue() + 12);
        }

        @Override
        public Integer visitTypeVar(Type.TypeVar t, Void ignored) {
            return Integer.valueOf(System.identityHashCode(t.tsym));
        }

        @Override
        public Integer visitUndetVar(Type.UndetVar t, Void ignored) {
            return Integer.valueOf(System.identityHashCode(t));
        }

        @Override
        public Integer visitErrorType(Type.ErrorType t, Void ignored) {
            return 0;
        }
    };
    List<Warner> warnStack = List.m507nil();
    private final MapVisitor<Void> upperBound = new MapVisitor<Void>() {
        @Override
        public Type visitWildcardType(Type.WildcardType t, Void ignored) {
            if (t.isSuperBound()) {
                return t.bound == null ? Types.this.syms.objectType : t.bound.bound;
            }
            return visit(t.type);
        }

        @Override
        public Type visitCapturedType(Type.CapturedType t, Void ignored) {
            return visit(t.bound);
        }
    };
    private final MapVisitor<Void> lowerBound = new MapVisitor<Void>() {
        @Override
        public Type visitWildcardType(Type.WildcardType t, Void ignored) {
            return t.isExtendsBound() ? Types.this.syms.botType : visit(t.type);
        }

        @Override
        public Type visitCapturedType(Type.CapturedType t, Void ignored) {
            return visit(t.getLowerBound());
        }
    };
    private final UnaryVisitor<Boolean> isUnbounded = new UnaryVisitor<Boolean>() {
        @Override
        public Boolean visitType(Type t, Void ignored) {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public Boolean visitClassType(Type.ClassType t, Void ignored) {
            List listAllparams = t.tsym.type.allparams();
            List listAllparams2 = t.allparams();
            while (listAllparams.nonEmpty()) {
                Type.WildcardType unb = new Type.WildcardType(Types.this.syms.objectType, BoundKind.UNBOUND, Types.this.syms.boundClass, (Type.TypeVar) listAllparams.head);
                if (!Types.this.containsType((Type) listAllparams2.head, unb)) {
                    return false;
                }
                listAllparams = listAllparams.tail;
                listAllparams2 = listAllparams2.tail;
            }
            return true;
        }
    };
    private final SimpleVisitor<Type, Symbol> asSub = new SimpleVisitor<Type, Symbol>() {
        @Override
        public Type visitType(Type t, Symbol sym) {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public Type visitClassType(Type.ClassType t, Symbol sym) {
            if (t.tsym == sym) {
                return t;
            }
            Type base = Types.this.asSuper(sym.type, t.tsym);
            if (base == null) {
                return null;
            }
            ListBuffer<Type> from = new ListBuffer<>();
            ListBuffer<Type> to = new ListBuffer<>();
            try {
                Types.this.adapt(base, t, from, to);
                Type res = Types.this.subst(sym.type, from.toList(), to.toList());
                if (!Types.this.isSubtype(res, t)) {
                    return null;
                }
                ListBuffer listBuffer = new ListBuffer();
                for (List listAllparams = sym.type.allparams(); listAllparams.nonEmpty(); listAllparams = listAllparams.tail) {
                    if (res.contains((Type) listAllparams.head) && !t.contains((Type) listAllparams.head)) {
                        listBuffer.append(listAllparams.head);
                    }
                }
                if (listBuffer.nonEmpty()) {
                    if (t.isRaw()) {
                        return Types.this.erasure(res);
                    }
                    List<Type> opens = listBuffer.toList();
                    ListBuffer<Type> qs = new ListBuffer<>();
                    for (List list = opens; list.nonEmpty(); list = list.tail) {
                        qs.append(new Type.WildcardType(Types.this.syms.objectType, BoundKind.UNBOUND, Types.this.syms.boundClass, (Type.TypeVar) list.head));
                    }
                    return Types.this.subst(res, opens, qs.toList());
                }
                return res;
            } catch (AdaptFailure e) {
                return null;
            }
        }

        @Override
        public Type visitErrorType(Type.ErrorType t, Symbol sym) {
            return t;
        }
    };
    private TypeRelation isSubtype = new TypeRelation() {
        private Set<TypePair> cache = new HashSet();

        @Override
        public Boolean visitType(Type t, Type s) {
            int i = t.f344tag;
            if (i == 14) {
                return Boolean.valueOf(Types.this.isSubtypeNoCapture(t.mo576getUpperBound(), s));
            }
            boolean z = false;
            if (i != 15) {
                if (i == 17) {
                    return Boolean.valueOf(s.f344tag == 17 || s.f344tag == 10 || s.f344tag == 11 || s.f344tag == 14);
                }
                if (i != 18) {
                    switch (i) {
                        case 1:
                        case 2:
                            if (t.f344tag == s.f344tag || (t.f344tag + 2 <= s.f344tag && s.f344tag <= 7)) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            if (t.f344tag <= s.f344tag && s.f344tag <= 7) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        case 8:
                        case 9:
                            return Boolean.valueOf(t.f344tag == s.f344tag);
                        default:
                            throw new AssertionError("isSubtype " + t.f344tag);
                    }
                }
            }
            return false;
        }

        private boolean containsTypeRecursive(Type t, Type s) {
            TypePair pair = Types.this.new TypePair(t, s);
            if (this.cache.add(pair)) {
                try {
                    return Types.this.containsType(t.getTypeArguments(), s.getTypeArguments());
                } finally {
                    this.cache.remove(pair);
                }
            }
            return Types.this.containsType(t.getTypeArguments(), rewriteSupers(s).getTypeArguments());
        }

        private Type rewriteSupers(Type t) {
            if (!t.isParameterized()) {
                return t;
            }
            ListBuffer<Type> from = ListBuffer.m512lb();
            ListBuffer<Type> to = ListBuffer.m512lb();
            Types.this.adaptSelf(t, from, to);
            if (from.isEmpty()) {
                return t;
            }
            ListBuffer<Type> rewrite = ListBuffer.m512lb();
            boolean changed = false;
            for (Type orig : to.toList()) {
                Type s = rewriteSupers(orig);
                if (s.isSuperBound() && !s.isExtendsBound()) {
                    s = new Type.WildcardType(Types.this.syms.objectType, BoundKind.UNBOUND, Types.this.syms.boundClass);
                    changed = true;
                } else if (s != orig) {
                    s = new Type.WildcardType(Types.this.upperBound(s), BoundKind.EXTENDS, Types.this.syms.boundClass);
                    changed = true;
                }
                rewrite.append(s);
            }
            if (changed) {
                return Types.this.subst(t.tsym.type, from.toList(), rewrite.toList());
            }
            return t;
        }

        @Override
        public Boolean visitClassType(Type.ClassType t, Type s) {
            Type sup = Types.this.asSuper(t, s.tsym);
            return Boolean.valueOf(sup != null && sup.tsym == s.tsym && (!s.isParameterized() || containsTypeRecursive(s, sup)) && Types.this.isSubtypeNoCapture(sup.getEnclosingType(), s.getEnclosingType()));
        }

        @Override
        public Boolean visitArrayType(Type.ArrayType t, Type s) {
            if (s.f344tag == 11) {
                if (t.elemtype.f344tag <= 8) {
                    return Boolean.valueOf(Types.this.isSameType(t.elemtype, Types.this.elemtype(s)));
                }
                return Boolean.valueOf(Types.this.isSubtypeNoCapture(t.elemtype, Types.this.elemtype(s)));
            }
            if (s.f344tag == 10) {
                Name sname = s.tsym.getQualifiedName();
                return Boolean.valueOf(sname == Types.this.names.java_lang_Object || sname == Types.this.names.java_lang_Cloneable || sname == Types.this.names.java_io_Serializable);
            }
            return false;
        }

        @Override
        public Boolean visitUndetVar(Type.UndetVar t, Type s) {
            if (t == s || t.qtype == s || s.f344tag == 19 || s.f344tag == 20) {
                return true;
            }
            if (t.inst != null) {
                return Boolean.valueOf(Types.this.isSubtypeNoCapture(t.inst, s));
            }
            t.hibounds = t.hibounds.prepend(s);
            return true;
        }

        @Override
        public Boolean visitErrorType(Type.ErrorType t, Type s) {
            return true;
        }
    };
    private TypeRelation isSameType = new TypeRelation() {
        @Override
        public Boolean visitType(Type t, Type s) {
            if (t == s) {
                return true;
            }
            if (s.f344tag >= 19) {
                return visit(s, t);
            }
            int i = t.f344tag;
            if (i == 14) {
                if (s.f344tag == 14) {
                    return Boolean.valueOf(t.tsym == s.tsym && visit(t.mo576getUpperBound(), s.mo576getUpperBound()).booleanValue());
                }
                return Boolean.valueOf(s.isSuperBound() && !s.isExtendsBound() && visit(t, Types.this.upperBound(s)).booleanValue());
            }
            if (i != 17 && i != 18) {
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
                        break;
                    default:
                        throw new AssertionError("isSameType " + t.f344tag);
                }
            }
            return Boolean.valueOf(t.f344tag == s.f344tag);
        }

        @Override
        public Boolean visitWildcardType(Type.WildcardType t, Type s) {
            if (s.f344tag >= 19) {
                return visit(s, t);
            }
            return false;
        }

        @Override
        public Boolean visitClassType(Type.ClassType t, Type s) {
            if (t == s) {
                return true;
            }
            if (s.f344tag >= 19) {
                return visit(s, t);
            }
            if (s.isSuperBound() && !s.isExtendsBound()) {
                return Boolean.valueOf(visit(t, Types.this.upperBound(s)).booleanValue() && visit(t, Types.this.lowerBound(s)).booleanValue());
            }
            if (t.isCompound() && s.isCompound()) {
                if (!visit(Types.this.supertype(t), Types.this.supertype(s)).booleanValue()) {
                    return false;
                }
                HashSet<SingletonType> set = new HashSet<>();
                for (Type x : Types.this.interfaces(t)) {
                    set.add(Types.this.new SingletonType(x));
                }
                for (Type x2 : Types.this.interfaces(s)) {
                    if (!set.remove(Types.this.new SingletonType(x2))) {
                        return false;
                    }
                }
                return Boolean.valueOf(set.isEmpty());
            }
            return Boolean.valueOf(t.tsym == s.tsym && visit(t.getEnclosingType(), s.getEnclosingType()).booleanValue() && Types.this.containsTypeEquivalent(t.getTypeArguments(), s.getTypeArguments()));
        }

        @Override
        public Boolean visitArrayType(Type.ArrayType t, Type s) {
            if (t == s) {
                return true;
            }
            if (s.f344tag >= 19) {
                return visit(s, t);
            }
            return Boolean.valueOf(s.f344tag == 11 && Types.this.containsTypeEquivalent(t.elemtype, Types.this.elemtype(s)));
        }

        @Override
        public Boolean visitMethodType(Type.MethodType t, Type s) {
            return Boolean.valueOf(Types.this.hasSameArgs(t, s) && visit(t.mo574getReturnType(), s.mo574getReturnType()).booleanValue());
        }

        @Override
        public Boolean visitPackageType(Type.PackageType t, Type s) {
            return Boolean.valueOf(t == s);
        }

        @Override
        public Boolean visitForAll(Type.ForAll t, Type s) {
            boolean z = false;
            if (s.f344tag != 16) {
                return false;
            }
            Type.ForAll forAll = (Type.ForAll) s;
            if (Types.this.hasSameBounds(t, forAll) && visit(t.qtype, Types.this.subst(forAll.qtype, forAll.tvars, t.tvars)).booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public Boolean visitUndetVar(Type.UndetVar t, Type s) {
            if (s.f344tag == 15) {
                return false;
            }
            if (t == s || t.qtype == s || s.f344tag == 19 || s.f344tag == 20) {
                return true;
            }
            if (t.inst != null) {
                return visit(t.inst, s);
            }
            t.inst = Types.this.fromUnknownFun.apply(s);
            for (List list = t.lobounds; list.nonEmpty(); list = list.tail) {
                if (!Types.this.isSubtype((Type) list.head, t.inst)) {
                    return false;
                }
            }
            for (List list2 = t.hibounds; list2.nonEmpty(); list2 = list2.tail) {
                if (!Types.this.isSubtype(t.inst, (Type) list2.head)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public Boolean visitErrorType(Type.ErrorType t, Type s) {
            return true;
        }
    };
    public Type.Mapping fromUnknownFun = new Type.Mapping("fromUnknownFun") {
        @Override
        public Type apply(Type t) {
            return t.f344tag == 20 ? new Type.UndetVar(t) : t.mo453map(this);
        }
    };
    private TypeRelation containsType = new TypeRelation() {
        private Type m459U(Type t) {
            while (t.f344tag == 15) {
                Type.WildcardType w = (Type.WildcardType) t;
                if (w.isSuperBound()) {
                    return w.bound == null ? Types.this.syms.objectType : w.bound.bound;
                }
                t = w.type;
            }
            return t;
        }

        private Type m458L(Type t) {
            while (t.f344tag == 15) {
                Type.WildcardType w = (Type.WildcardType) t;
                if (w.isExtendsBound()) {
                    return Types.this.syms.botType;
                }
                t = w.type;
            }
            return t;
        }

        @Override
        public Boolean visitType(Type t, Type s) {
            if (s.f344tag >= 19) {
                return Boolean.valueOf(Types.this.containedBy(s, t));
            }
            return Boolean.valueOf(Types.this.isSameType(t, s));
        }

        @Override
        public Boolean visitWildcardType(Type.WildcardType t, Type s) {
            boolean z;
            if (s.f344tag >= 19) {
                return Boolean.valueOf(Types.this.containedBy(s, t));
            }
            if (Types.this.isSameWildcard(t, s) || Types.this.isCaptureOf(s, t)) {
                z = true;
            } else {
                if (t.isExtendsBound() || Types.this.isSubtypeNoCapture(m458L(t), Types.this.lowerBound(s))) {
                    if (!t.isSuperBound()) {
                        Types types = Types.this;
                        if (types.isSubtypeNoCapture(types.upperBound(s), m459U(t))) {
                        }
                    }
                    z = true;
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override
        public Boolean visitUndetVar(Type.UndetVar t, Type s) {
            if (s.f344tag != 15) {
                return Boolean.valueOf(Types.this.isSameType(t, s));
            }
            return false;
        }

        @Override
        public Boolean visitErrorType(Type.ErrorType t, Type s) {
            return true;
        }
    };
    private TypeRelation isCastable = new TypeRelation() {
        @Override
        public Boolean visitType(Type t, Type s) {
            if (s.f344tag == 19) {
                return true;
            }
            int i = t.f344tag;
            if (i != 17) {
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return Boolean.valueOf(s.f344tag <= 7);
                    case 8:
                        return Boolean.valueOf(s.f344tag == 8);
                    case 9:
                        return false;
                    default:
                        throw new AssertionError();
                }
            }
            return Boolean.valueOf(Types.this.isSubtype(t, s));
        }

        @Override
        public Boolean visitWildcardType(Type.WildcardType t, Type s) {
            Types types = Types.this;
            return Boolean.valueOf(types.isCastable(types.upperBound(t), s, Types.this.warnStack.head));
        }

        /* JADX WARN: Type inference failed for: r6v7, types: [A, com.sun.tools.javac.util.Warner] */
        @Override
        public Boolean visitClassType(Type.ClassType t, Type s) {
            boolean zSideCastFinal;
            boolean zSideCastFinal2;
            if (s.f344tag == 19 || s.f344tag == 17) {
                return true;
            }
            if (s.f344tag == 14) {
                if (Types.this.isCastable(t, s.mo576getUpperBound(), Warner.noWarnings)) {
                    Types.this.warnStack.head.warn(Lint.LintCategory.UNCHECKED);
                    return true;
                }
                return false;
            }
            if (t.isCompound()) {
                Warner oldWarner = Types.this.warnStack.head;
                Types.this.warnStack.head = Warner.noWarnings;
                if (!visit(Types.this.supertype(t), s).booleanValue()) {
                    return false;
                }
                for (Type intf : Types.this.interfaces(t)) {
                    if (!visit(intf, s).booleanValue()) {
                        return false;
                    }
                }
                if (Types.this.warnStack.head.hasLint(Lint.LintCategory.UNCHECKED)) {
                    oldWarner.warn(Lint.LintCategory.UNCHECKED);
                }
                return true;
            }
            if (s.isCompound()) {
                return visitClassType((Type.ClassType) s, (Type) t);
            }
            if (s.f344tag == 10 || s.f344tag == 11) {
                Types types = Types.this;
                boolean upcast = types.isSubtype(types.erasure(t), Types.this.erasure(s));
                if (!upcast) {
                    Types types2 = Types.this;
                    if (!types2.isSubtype(types2.erasure(s), Types.this.erasure(t))) {
                        if (s.f344tag == 10) {
                            if ((s.tsym.flags() & 512) != 0) {
                                if ((t.tsym.flags() & 16) == 0) {
                                    Types types3 = Types.this;
                                    zSideCastFinal2 = types3.sideCast(t, s, types3.warnStack.head);
                                } else {
                                    Types types4 = Types.this;
                                    zSideCastFinal2 = types4.sideCastFinal(t, s, types4.warnStack.head);
                                }
                                return Boolean.valueOf(zSideCastFinal2);
                            }
                            if ((t.tsym.flags() & 512) != 0) {
                                if ((s.tsym.flags() & 16) == 0) {
                                    Types types5 = Types.this;
                                    zSideCastFinal = types5.sideCast(t, s, types5.warnStack.head);
                                } else {
                                    Types types6 = Types.this;
                                    zSideCastFinal = types6.sideCastFinal(t, s, types6.warnStack.head);
                                }
                                return Boolean.valueOf(zSideCastFinal);
                            }
                            return false;
                        }
                    }
                }
                if (!upcast && s.f344tag == 11) {
                    if (!Types.this.isReifiable(s)) {
                        Types.this.warnStack.head.warn(Lint.LintCategory.UNCHECKED);
                    }
                    return true;
                }
                if (s.isRaw()) {
                    return true;
                }
                if (t.isRaw()) {
                    if (!Types.this.isUnbounded(s)) {
                        Types.this.warnStack.head.warn(Lint.LintCategory.UNCHECKED);
                    }
                    return true;
                }
                Type a = upcast ? t : s;
                Type b = upcast ? s : t;
                Type aHigh = Types.this.rewriteQuantifiers(a, true, false);
                Type aLow = Types.this.rewriteQuantifiers(a, false, false);
                Type bHigh = Types.this.rewriteQuantifiers(b, true, false);
                Type bLow = Types.this.rewriteQuantifiers(b, false, false);
                Type lowSub = Types.this.asSub(bLow, aLow.tsym);
                Type highSub = lowSub == null ? null : Types.this.asSub(bHigh, aHigh.tsym);
                if (highSub == null) {
                    aHigh = Types.this.rewriteQuantifiers(a, true, true);
                    aLow = Types.this.rewriteQuantifiers(a, false, true);
                    Type bHigh2 = Types.this.rewriteQuantifiers(b, true, true);
                    Type bLow2 = Types.this.rewriteQuantifiers(b, false, true);
                    lowSub = Types.this.asSub(bLow2, aLow.tsym);
                    highSub = lowSub == null ? null : Types.this.asSub(bHigh2, aHigh.tsym);
                }
                if (highSub != null) {
                    if (a.tsym != highSub.tsym || a.tsym != lowSub.tsym) {
                        Assert.error(a.tsym + " != " + highSub.tsym + " != " + lowSub.tsym);
                    }
                    if (!Types.this.disjointTypes(aHigh.allparams(), highSub.allparams()) && !Types.this.disjointTypes(aHigh.allparams(), lowSub.allparams()) && !Types.this.disjointTypes(aLow.allparams(), highSub.allparams()) && !Types.this.disjointTypes(aLow.allparams(), lowSub.allparams())) {
                        Types types7 = Types.this;
                        if (!upcast ? types7.giveWarning(b, a) : types7.giveWarning(a, b)) {
                            Types.this.warnStack.head.warn(Lint.LintCategory.UNCHECKED);
                        }
                        return true;
                    }
                }
                if (Types.this.isReifiable(s)) {
                    return Boolean.valueOf(Types.this.isSubtypeUnchecked(a, b));
                }
                Types types8 = Types.this;
                return Boolean.valueOf(types8.isSubtypeUnchecked(a, b, types8.warnStack.head));
            }
            return false;
        }

        @Override
        public Boolean visitArrayType(Type.ArrayType t, Type s) {
            int i = s.f344tag;
            if (i == 10) {
                return Boolean.valueOf(Types.this.isSubtype(t, s));
            }
            if (i == 11) {
                if (Types.this.elemtype(t).f344tag <= 8 || Types.this.elemtype(s).f344tag <= 8) {
                    return Boolean.valueOf(Types.this.elemtype(t).f344tag == Types.this.elemtype(s).f344tag);
                }
                return visit(Types.this.elemtype(t), Types.this.elemtype(s));
            }
            if (i != 14) {
                if (i == 17 || i == 19) {
                    return true;
                }
                return false;
            }
            if (Types.this.isCastable(s, t, Warner.noWarnings)) {
                Types.this.warnStack.head.warn(Lint.LintCategory.UNCHECKED);
                return true;
            }
            return false;
        }

        @Override
        public Boolean visitTypeVar(Type.TypeVar t, Type s) {
            int i = s.f344tag;
            if (i != 14) {
                if (i == 17 || i == 19) {
                    return true;
                }
                return Boolean.valueOf(Types.this.isCastable(t.bound, s, Types.this.warnStack.head));
            }
            if (Types.this.isSubtype(t, s)) {
                return true;
            }
            if (Types.this.isCastable(t.bound, s, Warner.noWarnings)) {
                Types.this.warnStack.head.warn(Lint.LintCategory.UNCHECKED);
                return true;
            }
            return false;
        }

        @Override
        public Boolean visitErrorType(Type.ErrorType t, Type s) {
            return true;
        }
    };
    private TypeRelation disjointType = new TypeRelation() {
        private Set<TypePair> cache = new HashSet();

        @Override
        public Boolean visitType(Type t, Type s) {
            if (s.f344tag == 15) {
                return visit(s, t);
            }
            return Boolean.valueOf(notSoftSubtypeRecursive(t, s) || notSoftSubtypeRecursive(s, t));
        }

        private boolean isCastableRecursive(Type t, Type s) {
            TypePair pair = Types.this.new TypePair(t, s);
            if (this.cache.add(pair)) {
                try {
                    return Types.this.isCastable(t, s);
                } finally {
                    this.cache.remove(pair);
                }
            }
            return true;
        }

        private boolean notSoftSubtypeRecursive(Type t, Type s) {
            TypePair pair = Types.this.new TypePair(t, s);
            if (this.cache.add(pair)) {
                try {
                    return Types.this.notSoftSubtype(t, s);
                } finally {
                    this.cache.remove(pair);
                }
            }
            return false;
        }

        @Override
        public Boolean visitWildcardType(Type.WildcardType t, Type s) {
            if (t.isUnbound()) {
                return false;
            }
            if (s.f344tag != 15) {
                if (t.isExtendsBound()) {
                    return Boolean.valueOf(notSoftSubtypeRecursive(s, t.type));
                }
                return Boolean.valueOf(notSoftSubtypeRecursive(t.type, s));
            }
            if (s.isUnbound()) {
                return false;
            }
            if (t.isExtendsBound()) {
                if (s.isExtendsBound()) {
                    return Boolean.valueOf(!isCastableRecursive(t.type, Types.this.upperBound(s)));
                }
                if (s.isSuperBound()) {
                    return Boolean.valueOf(notSoftSubtypeRecursive(Types.this.lowerBound(s), t.type));
                }
            } else if (t.isSuperBound() && s.isExtendsBound()) {
                return Boolean.valueOf(notSoftSubtypeRecursive(t.type, Types.this.upperBound(s)));
            }
            return false;
        }
    };
    private final Type.Mapping lowerBoundMapping = new Type.Mapping("lowerBound") {
        @Override
        public Type apply(Type t) {
            return Types.this.lowerBound(t);
        }
    };
    private UnaryVisitor<Boolean> isReifiable = new UnaryVisitor<Boolean>() {
        @Override
        public Boolean visitType(Type t, Void ignored) {
            return true;
        }

        @Override
        public Boolean visitClassType(Type.ClassType t, Void ignored) {
            if (t.isCompound()) {
                return false;
            }
            if (!t.isParameterized()) {
                return true;
            }
            for (Type param : t.allparams()) {
                if (!param.isUnbound()) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public Boolean visitArrayType(Type.ArrayType t, Void ignored) {
            return visit(t.elemtype);
        }

        @Override
        public Boolean visitTypeVar(Type.TypeVar t, Void ignored) {
            return false;
        }
    };
    private Type.Mapping elemTypeFun = new Type.Mapping("elemTypeFun") {
        @Override
        public Type apply(Type t) {
            return Types.this.elemtype(t);
        }
    };
    private SimpleVisitor<Type, Symbol> asSuper = new SimpleVisitor<Type, Symbol>() {
        @Override
        public Type visitType(Type t, Symbol sym) {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public Type visitClassType(Type.ClassType t, Symbol sym) {
            Type x;
            if (t.tsym == sym) {
                return t;
            }
            Type st = Types.this.supertype(t);
            if ((st.f344tag == 10 || st.f344tag == 14 || st.f344tag == 19) && (x = Types.this.asSuper(st, sym)) != null) {
                return x;
            }
            if ((sym.flags() & 512) != 0) {
                for (List listInterfaces = Types.this.interfaces(t); listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
                    Type x2 = Types.this.asSuper((Type) listInterfaces.head, sym);
                    if (x2 != null) {
                        return x2;
                    }
                }
                return null;
            }
            return null;
        }

        @Override
        public Type visitArrayType(Type.ArrayType t, Symbol sym) {
            if (Types.this.isSubtype(t, sym.type)) {
                return sym.type;
            }
            return null;
        }

        @Override
        public Type visitTypeVar(Type.TypeVar t, Symbol sym) {
            if (t.tsym == sym) {
                return t;
            }
            return Types.this.asSuper(t.bound, sym);
        }

        @Override
        public Type visitErrorType(Type.ErrorType t, Symbol sym) {
            return t;
        }
    };
    private SimpleVisitor<Type, Symbol> memberType = new SimpleVisitor<Type, Symbol>() {
        @Override
        public Type visitType(Type t, Symbol sym) {
            return sym.type;
        }

        @Override
        public Type visitWildcardType(Type.WildcardType t, Symbol sym) {
            Types types = Types.this;
            return types.memberType(types.upperBound(t), sym);
        }

        @Override
        public Type visitClassType(Type.ClassType t, Symbol sym) {
            Symbol owner = sym.owner;
            long flags = sym.flags();
            if ((8 & flags) == 0 && owner.type.isParameterized()) {
                Type base = Types.this.asOuterSuper(t, owner);
                Type base2 = t.isCompound() ? Types.this.capture(base) : base;
                if (base2 != null) {
                    List<Type> ownerParams = owner.type.allparams();
                    List<Type> baseParams = base2.allparams();
                    if (ownerParams.nonEmpty()) {
                        if (baseParams.isEmpty()) {
                            return Types.this.erasure(sym.type);
                        }
                        return Types.this.subst(sym.type, ownerParams, baseParams);
                    }
                }
            }
            return sym.type;
        }

        @Override
        public Type visitTypeVar(Type.TypeVar t, Symbol sym) {
            return Types.this.memberType(t.bound, sym);
        }

        @Override
        public Type visitErrorType(Type.ErrorType t, Symbol sym) {
            return t;
        }
    };
    private SimpleVisitor<Type, Boolean> erasure = new SimpleVisitor<Type, Boolean>() {
        @Override
        public Type visitType(Type t, Boolean recurse) {
            if (t.f344tag <= 8) {
                return t;
            }
            return t.mo453map(recurse.booleanValue() ? Types.this.erasureRecFun : Types.this.erasureFun);
        }

        @Override
        public Type visitWildcardType(Type.WildcardType t, Boolean recurse) {
            Types types = Types.this;
            return types.erasure(types.upperBound(t), recurse.booleanValue());
        }

        @Override
        public Type visitClassType(Type.ClassType t, Boolean recurse) {
            Type erased = t.tsym.erasure(Types.this);
            if (recurse.booleanValue()) {
                return new Type.ErasedClassType(erased.getEnclosingType(), erased.tsym);
            }
            return erased;
        }

        @Override
        public Type visitTypeVar(Type.TypeVar t, Boolean recurse) {
            return Types.this.erasure(t.bound, recurse.booleanValue());
        }

        @Override
        public Type visitErrorType(Type.ErrorType t, Boolean recurse) {
            return t;
        }
    };
    private Type.Mapping erasureFun = new Type.Mapping("erasure") {
        @Override
        public Type apply(Type t) {
            return Types.this.erasure(t);
        }
    };
    private Type.Mapping erasureRecFun = new Type.Mapping("erasureRecursive") {
        @Override
        public Type apply(Type t) {
            return Types.this.erasureRecursive(t);
        }
    };
    private UnaryVisitor<Type> supertype = new UnaryVisitor<Type>() {
        @Override
        public Type visitType(Type t, Void ignored) {
            return null;
        }

        @Override
        public Type visitClassType(Type.ClassType t, Void ignored) {
            if (t.supertype_field == null) {
                Type supertype = ((Symbol.ClassSymbol) t.tsym).getSuperclass();
                if (t.isInterface()) {
                    supertype = ((Type.ClassType) t.tsym.type).supertype_field;
                }
                if (t.supertype_field == null) {
                    List<Type> actuals = Types.this.classBound(t).allparams();
                    List<Type> formals = t.tsym.type.allparams();
                    if (t.hasErasedSupertypes()) {
                        t.supertype_field = Types.this.erasureRecursive(supertype);
                    } else if (formals.nonEmpty()) {
                        t.supertype_field = Types.this.subst(supertype, formals, actuals);
                    } else {
                        t.supertype_field = supertype;
                    }
                }
            }
            Type supertype2 = t.supertype_field;
            return supertype2;
        }

        @Override
        public Type visitTypeVar(Type.TypeVar t, Void ignored) {
            if (t.bound.f344tag == 14 || (!t.bound.isCompound() && !t.bound.isInterface())) {
                return t.bound;
            }
            return Types.this.supertype(t.bound);
        }

        @Override
        public Type visitArrayType(Type.ArrayType t, Void ignored) {
            if (t.elemtype.isPrimitive() || Types.this.isSameType(t.elemtype, Types.this.syms.objectType)) {
                return Types.this.arraySuperType();
            }
            return new Type.ArrayType(Types.this.supertype(t.elemtype), t.tsym);
        }

        @Override
        public Type visitErrorType(Type.ErrorType t, Void ignored) {
            return t;
        }
    };
    private UnaryVisitor<List<Type>> interfaces = new UnaryVisitor<List<Type>>() {
        @Override
        public List<Type> visitType(Type t, Void ignored) {
            return List.m507nil();
        }

        @Override
        public List<Type> visitClassType(Type.ClassType t, Void ignored) {
            if (t.interfaces_field == null) {
                List<Type> interfaces = ((Symbol.ClassSymbol) t.tsym).getInterfaces();
                if (t.interfaces_field == null) {
                    Assert.check(t != t.tsym.type, t);
                    List<Type> actuals = t.allparams();
                    List<Type> formals = t.tsym.type.allparams();
                    if (t.hasErasedSupertypes()) {
                        t.interfaces_field = Types.this.erasureRecursive(interfaces);
                    } else if (formals.nonEmpty()) {
                        Types types = Types.this;
                        t.interfaces_field = types.upperBounds(types.subst(interfaces, formals, actuals));
                    } else {
                        t.interfaces_field = interfaces;
                    }
                }
            }
            return t.interfaces_field;
        }

        @Override
        public List<Type> visitTypeVar(Type.TypeVar t, Void ignored) {
            if (t.bound.isCompound()) {
                return Types.this.interfaces(t.bound);
            }
            if (t.bound.isInterface()) {
                return List.m508of(t.bound);
            }
            return List.m507nil();
        }
    };
    Map<Type, Boolean> isDerivedRawCache = new HashMap();
    private UnaryVisitor<Type> classBound = new UnaryVisitor<Type>() {
        @Override
        public Type visitType(Type t, Void ignored) {
            return t;
        }

        @Override
        public Type visitClassType(Type.ClassType t, Void ignored) {
            Type outer1 = Types.this.classBound(t.getEnclosingType());
            if (outer1 != t.getEnclosingType()) {
                return new Type.ClassType(outer1, t.getTypeArguments(), t.tsym);
            }
            return t;
        }

        @Override
        public Type visitTypeVar(Type.TypeVar t, Void ignored) {
            Types types = Types.this;
            return types.classBound(types.supertype(t));
        }

        @Override
        public Type visitErrorType(Type.ErrorType t, Void ignored) {
            return t;
        }
    };
    private ImplementationCache implCache = new ImplementationCache();
    private MembersClosureCache membersCache = new MembersClosureCache();
    TypeRelation hasSameArgs_strict = new HasSameArgs(true);
    TypeRelation hasSameArgs_nonstrict = new HasSameArgs(false);
    private final MapVisitor<List<Type>> methodWithParameters = new MapVisitor<List<Type>>() {
        @Override
        public Type visitType(Type t, List<Type> newParams) {
            throw new IllegalArgumentException("Not a method type: " + t);
        }

        @Override
        public Type visitMethodType(Type.MethodType t, List<Type> newParams) {
            return new Type.MethodType(newParams, t.restype, t.thrown, t.tsym);
        }

        @Override
        public Type visitForAll(Type.ForAll t, List<Type> newParams) {
            return new Type.ForAll(t.tvars, (Type) t.qtype.accept(this, newParams));
        }
    };
    private final MapVisitor<List<Type>> methodWithThrown = new MapVisitor<List<Type>>() {
        @Override
        public Type visitType(Type t, List<Type> newThrown) {
            throw new IllegalArgumentException("Not a method type: " + t);
        }

        @Override
        public Type visitMethodType(Type.MethodType t, List<Type> newThrown) {
            return new Type.MethodType(t.argtypes, t.restype, newThrown, t.tsym);
        }

        @Override
        public Type visitForAll(Type.ForAll t, List<Type> newThrown) {
            return new Type.ForAll(t.tvars, (Type) t.qtype.accept(this, newThrown));
        }
    };
    private final MapVisitor<Type> methodWithReturn = new MapVisitor<Type>() {
        @Override
        public Type visitType(Type t, Type newReturn) {
            throw new IllegalArgumentException("Not a method type: " + t);
        }

        @Override
        public Type visitMethodType(Type.MethodType t, Type newReturn) {
            return new Type.MethodType(t.argtypes, newReturn, t.thrown, t.tsym);
        }

        @Override
        public Type visitForAll(Type.ForAll t, Type newReturn) {
            return new Type.ForAll(t.tvars, (Type) t.qtype.accept(this, newReturn));
        }
    };
    private Map<Type, List<Type>> closureCache = new HashMap();
    Set<TypePair> mergeCache = new HashSet();
    private Type arraySuperType = null;

    public static class AdaptFailure extends RuntimeException {
        static final long serialVersionUID = -7490231548272701566L;
    }

    public static abstract class TypeRelation extends SimpleVisitor<Boolean, Type> {
    }

    public static Types instance(Context context) {
        Types instance = (Types) context.m501get(typesKey);
        if (instance == null) {
            return new Types(context);
        }
        return instance;
    }

    protected Types(Context context) {
        context.m504put(typesKey, this);
        this.syms = Symtab.instance(context);
        this.names = Names.instance(context);
        Source source = Source.instance(context);
        this.allowBoxing = source.allowBoxing();
        this.allowCovariantReturns = source.allowCovariantReturns();
        this.allowObjectToPrimitiveCast = source.allowObjectToPrimitiveCast();
        this.reader = ClassReader.instance(context);
        this.f348chk = Check.instance(context);
        this.capturedName = this.names.fromString("<captured wildcard>");
        this.messages = JavacMessages.instance(context);
    }

    public Type upperBound(Type t) {
        return this.upperBound.visit(t);
    }

    public Type lowerBound(Type t) {
        return this.lowerBound.visit(t);
    }

    public boolean isUnbounded(Type t) {
        return this.isUnbounded.visit(t).booleanValue();
    }

    public Type asSub(Type t, Symbol sym) {
        return this.asSub.visit(t, sym);
    }

    public boolean isConvertible(Type t, Type s, Warner warn) {
        if (t.f344tag == 19) {
            return true;
        }
        boolean tPrimitive = t.isPrimitive();
        boolean sPrimitive = s.isPrimitive();
        if (tPrimitive == sPrimitive) {
            return isSubtypeUnchecked(t, s, warn);
        }
        if (!this.allowBoxing) {
            return false;
        }
        if (tPrimitive) {
            return isSubtype(boxedClass(t).type, s);
        }
        return isSubtype(unboxedType(t), s);
    }

    public boolean isConvertible(Type t, Type s) {
        return isConvertible(t, s, Warner.noWarnings);
    }

    public boolean isSubtypeUnchecked(Type t, Type s) {
        return isSubtypeUnchecked(t, s, Warner.noWarnings);
    }

    public boolean isSubtypeUnchecked(Type t, Type s, Warner warn) {
        boolean result = isSubtypeUncheckedInternal(t, s, warn);
        if (result) {
            checkUnsafeVarargsConversion(t, s, warn);
        }
        return result;
    }

    private boolean isSubtypeUncheckedInternal(Type t, Type s, Warner warn) {
        Type t2;
        if (t.f344tag == 11 && s.f344tag == 11) {
            if (((Type.ArrayType) t).elemtype.f344tag <= 8) {
                return isSameType(elemtype(t), elemtype(s));
            }
            return isSubtypeUnchecked(elemtype(t), elemtype(s), warn);
        }
        if (isSubtype(t, s)) {
            return true;
        }
        if (t.f344tag == 14) {
            return isSubtypeUnchecked(t.mo576getUpperBound(), s, warn);
        }
        if (s.f344tag == 21) {
            Type.UndetVar uv = (Type.UndetVar) s;
            if (uv.inst != null) {
                return isSubtypeUnchecked(t, uv.inst, warn);
            }
            return false;
        }
        if (!s.isRaw() && (t2 = asSuper(t, s.tsym)) != null && t2.isRaw()) {
            if (isReifiable(s)) {
                warn.silentWarn(Lint.LintCategory.UNCHECKED);
            } else {
                warn.warn(Lint.LintCategory.UNCHECKED);
            }
            return true;
        }
        return false;
    }

    private void checkUnsafeVarargsConversion(Type t, Type s, Warner warn) {
        if (t.f344tag != 11 || isReifiable(t)) {
            return;
        }
        Type.ArrayType from = (Type.ArrayType) t;
        boolean shouldWarn = false;
        int i = s.f344tag;
        if (i == 10) {
            shouldWarn = from.isVarargs();
        } else if (i == 11) {
            Type.ArrayType to = (Type.ArrayType) s;
            shouldWarn = (!from.isVarargs() || to.isVarargs() || isReifiable(from)) ? false : true;
        }
        if (shouldWarn) {
            warn.warn(Lint.LintCategory.VARARGS);
        }
    }

    public final boolean isSubtype(Type t, Type s) {
        return isSubtype(t, s, true);
    }

    public final boolean isSubtypeNoCapture(Type t, Type s) {
        return isSubtype(t, s, false);
    }

    public boolean isSubtype(Type t, Type s, boolean capture) {
        if (t == s) {
            return true;
        }
        if (s.f344tag >= 19) {
            return isSuperType(s, t);
        }
        if (s.isCompound()) {
            for (Type s2 : interfaces(s).prepend(supertype(s))) {
                if (!isSubtype(t, s2, capture)) {
                    return false;
                }
            }
            return true;
        }
        Type lower = lowerBound(s);
        if (s != lower) {
            return isSubtype(capture ? capture(t) : t, lower, false);
        }
        return this.isSubtype.visit(capture ? capture(t) : t, s).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isSubtypeUnchecked(Type t, List<Type> ts, Warner warn) {
        for (List list = ts; list.nonEmpty(); list = list.tail) {
            if (!isSubtypeUnchecked(t, (Type) list.head, warn)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isSubtypes(List<Type> list, List<Type> list2) {
        List list3 = list;
        List list4 = list2;
        while (list3.tail != null && list4.tail != null && isSubtype((Type) list3.head, (Type) list4.head)) {
            list3 = list3.tail;
            list4 = list4.tail;
        }
        return list3.tail == null && list4.tail == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isSubtypesUnchecked(List<Type> list, List<Type> list2, Warner warner) {
        List list3 = list;
        List list4 = list2;
        while (list3.tail != null && list4.tail != null && isSubtypeUnchecked((Type) list3.head, (Type) list4.head, warner)) {
            list3 = list3.tail;
            list4 = list4.tail;
        }
        return list3.tail == null && list4.tail == null;
    }

    public boolean isSuperType(Type t, Type s) {
        int i = t.f344tag;
        if (i == 19) {
            return true;
        }
        if (i == 21) {
            Type.UndetVar undet = (Type.UndetVar) t;
            if (t == s || undet.qtype == s || s.f344tag == 19 || s.f344tag == 17) {
                return true;
            }
            if (undet.inst != null) {
                return isSubtype(s, undet.inst);
            }
            undet.lobounds = undet.lobounds.prepend(s);
            return true;
        }
        return isSubtype(s, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isSameTypes(List<Type> list, List<Type> list2) {
        List list3 = list;
        List list4 = list2;
        while (list3.tail != null && list4.tail != null && isSameType((Type) list3.head, (Type) list4.head)) {
            list3 = list3.tail;
            list4 = list4.tail;
        }
        return list3.tail == null && list4.tail == null;
    }

    public boolean isSameType(Type t, Type s) {
        return this.isSameType.visit(t, s).booleanValue();
    }

    public boolean containedBy(Type t, Type s) {
        int i = t.f344tag;
        if (i == 19) {
            return true;
        }
        if (i == 21) {
            if (s.f344tag == 15) {
                Type.UndetVar undetvar = (Type.UndetVar) t;
                Type.WildcardType wt = (Type.WildcardType) s;
                int i2 = C060727.$SwitchMap$com$sun$tools$javac$code$BoundKind[wt.kind.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    Type bound = upperBound(s);
                    for (Type t2 : undetvar.lobounds) {
                        if (!isSubtype(t2, bound)) {
                            return false;
                        }
                    }
                    undetvar.hibounds = undetvar.hibounds.prepend(bound);
                } else if (i2 == 3) {
                    Type bound2 = lowerBound(s);
                    for (Type t3 : undetvar.hibounds) {
                        if (!isSubtype(bound2, t3)) {
                            return false;
                        }
                    }
                    undetvar.lobounds = undetvar.lobounds.prepend(bound2);
                }
                return true;
            }
            return isSameType(t, s);
        }
        return containsType(s, t);
    }

    static class C060727 {
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

    /* JADX WARN: Multi-variable type inference failed */
    boolean containsType(List<Type> list, List<Type> list2) {
        List list3 = list;
        List list4 = list2;
        while (list3.nonEmpty() && list4.nonEmpty() && containsType((Type) list3.head, (Type) list4.head)) {
            list3 = list3.tail;
            list4 = list4.tail;
        }
        return list3.isEmpty() && list4.isEmpty();
    }

    public boolean containsType(Type t, Type s) {
        return this.containsType.visit(t, s).booleanValue();
    }

    public boolean isCaptureOf(Type s, Type.WildcardType t) {
        if (s.f344tag != 14 || !((Type.TypeVar) s).isCaptured()) {
            return false;
        }
        return isSameWildcard(t, ((Type.CapturedType) s).wildcard);
    }

    public boolean isSameWildcard(Type.WildcardType t, Type s) {
        if (s.f344tag != 15) {
            return false;
        }
        Type.WildcardType w = (Type.WildcardType) s;
        return w.kind == t.kind && w.type == t.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsTypeEquivalent(List<Type> list, List<Type> list2) {
        List list3 = list;
        List list4 = list2;
        while (list3.nonEmpty() && list4.nonEmpty() && containsTypeEquivalent((Type) list3.head, (Type) list4.head)) {
            list3 = list3.tail;
            list4 = list4.tail;
        }
        return list3.isEmpty() && list4.isEmpty();
    }

    public boolean isCastable(Type t, Type s) {
        return isCastable(t, s, Warner.noWarnings);
    }

    public boolean isCastable(Type t, Type s, Warner warn) {
        if (t == s) {
            return true;
        }
        if (t.isPrimitive() != s.isPrimitive()) {
            if (this.allowBoxing) {
                if (isConvertible(t, s, warn)) {
                    return true;
                }
                if (this.allowObjectToPrimitiveCast && s.isPrimitive() && isSubtype(boxedClass(s).type, t)) {
                    return true;
                }
            }
            return false;
        }
        if (warn != this.warnStack.head) {
            try {
                this.warnStack = this.warnStack.prepend(warn);
                checkUnsafeVarargsConversion(t, s, warn);
                return this.isCastable.visit(t, s).booleanValue();
            } finally {
                this.warnStack = this.warnStack.tail;
            }
        }
        return this.isCastable.visit(t, s).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean disjointTypes(List<Type> list, List<Type> list2) {
        List list3 = list;
        for (List list4 = list2; list3.tail != null && list4.tail != null; list4 = list4.tail) {
            if (disjointType((Type) list3.head, (Type) list4.head)) {
                return true;
            }
            list3 = list3.tail;
        }
        return false;
    }

    public boolean disjointType(Type t, Type s) {
        return this.disjointType.visit(t, s).booleanValue();
    }

    public List<Type> lowerBoundArgtypes(Type t) {
        return Type.m452map(t.mo573getParameterTypes(), this.lowerBoundMapping);
    }

    public boolean notSoftSubtype(Type t, Type s) {
        if (t == s) {
            return false;
        }
        if (t.f344tag == 14) {
            Type.TypeVar tv = (Type.TypeVar) t;
            return !isCastable(tv.bound, relaxBound(s), Warner.noWarnings);
        }
        if (s.f344tag != 15) {
            s = upperBound(s);
        }
        return !isSubtype(t, relaxBound(s));
    }

    private Type relaxBound(Type t) {
        if (t.f344tag == 14) {
            while (t.f344tag == 14) {
                t = t.mo576getUpperBound();
            }
            return rewriteQuantifiers(t, true, true);
        }
        return t;
    }

    public boolean isReifiable(Type t) {
        return this.isReifiable.visit(t).booleanValue();
    }

    public boolean isArray(Type t) {
        while (t.f344tag == 15) {
            t = upperBound(t);
        }
        return t.f344tag == 11;
    }

    public Type elemtype(Type t) {
        int i = t.f344tag;
        if (i == 11) {
            return ((Type.ArrayType) t).elemtype;
        }
        if (i == 19) {
            return t;
        }
        if (i == 15) {
            return elemtype(upperBound(t));
        }
        if (i == 16) {
            return elemtype(((Type.ForAll) t).qtype);
        }
        return null;
    }

    public Type elemtypeOrType(Type t) {
        Type elemtype = elemtype(t);
        if (elemtype != null) {
            return elemtype;
        }
        return t;
    }

    public int dimensions(Type t) {
        int result = 0;
        while (t.f344tag == 11) {
            result++;
            t = elemtype(t);
        }
        return result;
    }

    public Type asSuper(Type t, Symbol sym) {
        return this.asSuper.visit(t, sym);
    }

    public Type asOuterSuper(Type t, Symbol sym) {
        int i = t.f344tag;
        if (i == 10) {
            do {
                Type s = asSuper(t, sym);
                if (s != null) {
                    return s;
                }
                t = t.getEnclosingType();
            } while (t.f344tag == 10);
            return null;
        }
        if (i == 11) {
            if (isSubtype(t, sym.type)) {
                return sym.type;
            }
            return null;
        }
        if (i == 14) {
            return asSuper(t, sym);
        }
        if (i != 19) {
            return null;
        }
        return t;
    }

    public Type asEnclosingSuper(Type t, Symbol sym) {
        Type type;
        int i = t.f344tag;
        if (i != 10) {
            if (i == 11) {
                if (isSubtype(t, sym.type)) {
                    return sym.type;
                }
                return null;
            }
            if (i == 14) {
                return asSuper(t, sym);
            }
            if (i != 19) {
                return null;
            }
            return t;
        }
        do {
            Type s = asSuper(t, sym);
            if (s != null) {
                return s;
            }
            Type outer = t.getEnclosingType();
            if (outer.f344tag == 10) {
                type = outer;
            } else {
                type = t.tsym.owner.enclClass() != null ? t.tsym.owner.enclClass().type : Type.noType;
            }
            t = type;
        } while (t.f344tag == 10);
        return null;
    }

    public Type memberType(Type t, Symbol sym) {
        if ((sym.flags() & 8) != 0) {
            return sym.type;
        }
        return this.memberType.visit(t, sym);
    }

    public boolean isAssignable(Type t, Type s) {
        return isAssignable(t, s, Warner.noWarnings);
    }

    public boolean isAssignable(Type t, Type s, Warner warn) {
        int i;
        if (t.f344tag == 19) {
            return true;
        }
        if (t.f344tag <= 4 && t.constValue() != null) {
            int value = ((Number) t.constValue()).intValue();
            int i2 = s.f344tag;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return true;
                        }
                        if (i2 == 10 && ((i = unboxedType(s).f344tag) == 1 || i == 2 || i == 3)) {
                            return isAssignable(t, unboxedType(s), warn);
                        }
                    } else if (-32768 <= value && value <= 32767) {
                        return true;
                    }
                } else if (value >= 0 && value <= 65535) {
                    return true;
                }
            } else if (-128 <= value && value <= 127) {
                return true;
            }
        }
        return isConvertible(t, s, warn);
    }

    public Type erasure(Type t) {
        return erasure(t, false);
    }

    public Type erasure(Type t, boolean recurse) {
        if (t.f344tag <= 8) {
            return t;
        }
        return this.erasure.visit(t, Boolean.valueOf(recurse));
    }

    public List<Type> erasure(List<Type> ts) {
        return Type.m452map(ts, this.erasureFun);
    }

    public Type erasureRecursive(Type t) {
        return erasure(t, true);
    }

    public List<Type> erasureRecursive(List<Type> ts) {
        return Type.m452map(ts, this.erasureRecFun);
    }

    public Type makeCompoundType(List<Type> bounds, Type supertype) {
        Name nameFromString;
        if (Type.moreInfo) {
            nameFromString = this.names.fromString(bounds.toString());
        } else {
            nameFromString = this.names.empty;
        }
        Symbol.ClassSymbol bc = new Symbol.ClassSymbol(1090524161L, nameFromString, this.syms.noSymbol);
        if (bounds.head.f344tag == 14) {
            bc.erasure_field = this.syms.objectType;
        } else {
            bc.erasure_field = erasure(bounds.head);
        }
        bc.members_field = new Scope(bc);
        Type.ClassType bt = (Type.ClassType) bc.type;
        bt.allparams_field = List.m507nil();
        if (supertype != null) {
            bt.supertype_field = supertype;
            bt.interfaces_field = bounds;
        } else {
            bt.supertype_field = bounds.head;
            bt.interfaces_field = bounds.tail;
        }
        Assert.check((bt.supertype_field.tsym.completer == null && bt.supertype_field.isInterface()) ? false : true, bt.supertype_field);
        return bt;
    }

    public Type makeCompoundType(List<Type> bounds) {
        Type supertype = (bounds.head.tsym.flags() & 512) != 0 ? supertype(bounds.head) : null;
        return makeCompoundType(bounds, supertype);
    }

    public Type makeCompoundType(Type bound1, Type bound2) {
        return makeCompoundType(List.m509of(bound1, bound2));
    }

    public Type supertype(Type t) {
        return this.supertype.visit(t);
    }

    public List<Type> interfaces(Type t) {
        return this.interfaces.visit(t);
    }

    public boolean isDerivedRaw(Type t) {
        Boolean result = this.isDerivedRawCache.get(t);
        if (result == null) {
            result = Boolean.valueOf(isDerivedRawInternal(t));
            this.isDerivedRawCache.put(t, result);
        }
        return result.booleanValue();
    }

    public boolean isDerivedRawInternal(Type t) {
        if (t.isErroneous()) {
            return false;
        }
        return t.isRaw() || (supertype(t) != null && isDerivedRaw(supertype(t))) || isDerivedRaw(interfaces(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isDerivedRaw(List<Type> ts) {
        List list = ts;
        while (list.nonEmpty() && !isDerivedRaw((Type) list.head)) {
            list = list.tail;
        }
        return list.nonEmpty();
    }

    public void setBounds(Type.TypeVar t, List<Type> bounds, Type supertype) {
        if (bounds.tail.isEmpty()) {
            t.bound = bounds.head;
        } else {
            t.bound = makeCompoundType(bounds, supertype);
        }
        t.rank_field = -1;
    }

    public void setBounds(Type.TypeVar t, List<Type> bounds) {
        Type supertype = (bounds.head.tsym.flags() & 512) != 0 ? this.syms.objectType : null;
        setBounds(t, bounds, supertype);
        t.rank_field = -1;
    }

    public List<Type> getBounds(Type.TypeVar t) {
        if (t.bound.isErroneous() || !t.bound.isCompound()) {
            return List.m508of(t.bound);
        }
        if ((erasure(t).tsym.flags() & 512) == 0) {
            return interfaces(t).prepend(supertype(t));
        }
        return interfaces(t);
    }

    public Type classBound(Type t) {
        return this.classBound.visit(t);
    }

    public boolean isSubSignature(Type t, Type s) {
        return isSubSignature(t, s, true);
    }

    public boolean isSubSignature(Type t, Type s, boolean strict) {
        return hasSameArgs(t, s, strict) || hasSameArgs(t, erasure(s), strict);
    }

    public boolean overrideEquivalent(Type t, Type s) {
        return hasSameArgs(t, s) || hasSameArgs(t, erasure(s)) || hasSameArgs(erasure(t), s);
    }

    class ImplementationCache {
        private WeakHashMap<Symbol.MethodSymbol, SoftReference<Map<Symbol.TypeSymbol, Entry>>> _map = new WeakHashMap<>();

        ImplementationCache() {
        }

        class Entry {
            final Symbol.MethodSymbol cachedImpl;
            final boolean checkResult;
            final Filter<Symbol> implFilter;
            final int prevMark;

            public Entry(Symbol.MethodSymbol cachedImpl, Filter<Symbol> scopeFilter, boolean checkResult, int prevMark) {
                this.cachedImpl = cachedImpl;
                this.implFilter = scopeFilter;
                this.checkResult = checkResult;
                this.prevMark = prevMark;
            }

            boolean matches(Filter<Symbol> scopeFilter, boolean checkResult, int mark) {
                return this.implFilter == scopeFilter && this.checkResult == checkResult && this.prevMark == mark;
            }
        }

        Symbol.MethodSymbol m460get(Symbol.MethodSymbol ms, Symbol.TypeSymbol origin, boolean checkResult, Filter<Symbol> implFilter) {
            Map<Symbol.TypeSymbol, Entry> cache;
            SoftReference<Map<Symbol.TypeSymbol, Entry>> ref_cache = this._map.get(ms);
            Map<Symbol.TypeSymbol, Entry> cache2 = ref_cache != null ? ref_cache.get() : null;
            if (cache2 != null) {
                cache = cache2;
            } else {
                Map<Symbol.TypeSymbol, Entry> cache3 = new HashMap<>();
                this._map.put(ms, new SoftReference<>(cache3));
                cache = cache3;
            }
            Entry e = cache.get(origin);
            Scope.CompoundScope members = Types.this.membersClosure(origin.type, true);
            if (e != null && e.matches(implFilter, checkResult, members.getMark())) {
                return e.cachedImpl;
            }
            Symbol.MethodSymbol impl = implementationInternal(ms, origin, checkResult, implFilter);
            cache.put(origin, new Entry(impl, implFilter, checkResult, members.getMark()));
            return impl;
        }

        private Symbol.MethodSymbol implementationInternal(Symbol.MethodSymbol ms, Symbol.TypeSymbol origin, boolean checkResult, Filter<Symbol> implFilter) {
            Type t = origin.type;
            while (true) {
                if (t.f344tag == 10 || t.f344tag == 14) {
                    while (t.f344tag == 14) {
                        t = t.mo576getUpperBound();
                    }
                    Symbol.TypeSymbol c = t.tsym;
                    Scope.Entry e = c.members().lookup(ms.name, implFilter);
                    while (e.scope != null) {
                        if (e.f338sym == null || !e.f338sym.overrides(ms, origin, Types.this, checkResult)) {
                            e = e.next(implFilter);
                        } else {
                            return (Symbol.MethodSymbol) e.f338sym;
                        }
                    }
                    t = Types.this.supertype(t);
                } else {
                    return null;
                }
            }
        }
    }

    public Symbol.MethodSymbol implementation(Symbol.MethodSymbol ms, Symbol.TypeSymbol origin, boolean checkResult, Filter<Symbol> implFilter) {
        return this.implCache.m460get(ms, origin, checkResult, implFilter);
    }

    class MembersClosureCache extends SimpleVisitor<Scope.CompoundScope, Boolean> {
        private WeakHashMap<Symbol.TypeSymbol, Entry> _map = new WeakHashMap<>();

        MembersClosureCache() {
        }

        class Entry {
            final Scope.CompoundScope compoundScope;
            final boolean skipInterfaces;

            public Entry(boolean skipInterfaces, Scope.CompoundScope compoundScope) {
                this.skipInterfaces = skipInterfaces;
                this.compoundScope = compoundScope;
            }

            boolean matches(boolean skipInterfaces) {
                return this.skipInterfaces == skipInterfaces;
            }
        }

        @Override
        public Scope.CompoundScope visitType(Type t, Boolean skipInterface) {
            return null;
        }

        @Override
        public Scope.CompoundScope visitClassType(Type.ClassType t, Boolean skipInterface) {
            Symbol.ClassSymbol csym = (Symbol.ClassSymbol) t.tsym;
            Entry e = this._map.get(csym);
            if (e == null || !e.matches(skipInterface.booleanValue())) {
                Scope.CompoundScope membersClosure = new Scope.CompoundScope(csym);
                if (!skipInterface.booleanValue()) {
                    for (Type i : Types.this.interfaces(t)) {
                        membersClosure.addSubScope(visit(i, skipInterface));
                    }
                }
                membersClosure.addSubScope(visit(Types.this.supertype(t), skipInterface));
                membersClosure.addSubScope(csym.members());
                e = new Entry(skipInterface.booleanValue(), membersClosure);
                this._map.put(csym, e);
            }
            return e.compoundScope;
        }

        @Override
        public Scope.CompoundScope visitTypeVar(Type.TypeVar t, Boolean skipInterface) {
            return visit(t.mo576getUpperBound(), skipInterface);
        }
    }

    public Scope.CompoundScope membersClosure(Type site, boolean skipInterface) {
        return this.membersCache.visit(site, Boolean.valueOf(skipInterface));
    }

    public boolean hasSameArgs(Type t, Type s) {
        return hasSameArgs(t, s, true);
    }

    public boolean hasSameArgs(Type t, Type s, boolean strict) {
        return hasSameArgs(t, s, strict ? this.hasSameArgs_strict : this.hasSameArgs_nonstrict);
    }

    private boolean hasSameArgs(Type t, Type s, TypeRelation hasSameArgs) {
        return hasSameArgs.visit(t, s).booleanValue();
    }

    private class HasSameArgs extends TypeRelation {
        boolean strict;

        public HasSameArgs(boolean strict) {
            this.strict = strict;
        }

        @Override
        public Boolean visitType(Type t, Type s) {
            throw new AssertionError();
        }

        @Override
        public Boolean visitMethodType(Type.MethodType t, Type s) {
            return Boolean.valueOf(s.f344tag == 12 && Types.this.containsTypeEquivalent(t.argtypes, s.mo573getParameterTypes()));
        }

        @Override
        public Boolean visitForAll(Type.ForAll t, Type s) {
            boolean z = false;
            if (s.f344tag != 16) {
                return Boolean.valueOf(this.strict ? false : visitMethodType(t.asMethodType(), s).booleanValue());
            }
            Type.ForAll forAll = (Type.ForAll) s;
            if (Types.this.hasSameBounds(t, forAll) && visit(t.qtype, Types.this.subst(forAll.qtype, forAll.tvars, t.tvars)).booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        @Override
        public Boolean visitErrorType(Type.ErrorType t, Type s) {
            return false;
        }
    }

    public List<Type> subst(List<Type> ts, List<Type> from, List<Type> to) {
        return new Subst(from, to).subst(ts);
    }

    public Type subst(Type t, List<Type> from, List<Type> to) {
        return new Subst(from, to).subst(t);
    }

    private class Subst extends UnaryVisitor<Type> {
        List<Type> from;

        List<Type> f351to;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [com.sun.tools.javac.util.List, com.sun.tools.javac.util.List<com.sun.tools.javac.code.Type>] */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.sun.tools.javac.util.List, com.sun.tools.javac.util.List<com.sun.tools.javac.code.Type>] */
        /* JADX WARN: Type inference failed for: r4v2, types: [com.sun.tools.javac.util.List<A>] */
        public Subst(List<Type> list, List<Type> list2) {
            int length = list.length();
            int length2 = list2.length();
            List list3 = list;
            while (length > length2) {
                length--;
                list3 = list3.tail;
            }
            while (length < length2) {
                length2--;
                list2 = list2.tail;
            }
            this.from = list3;
            this.f351to = list2;
        }

        Type subst(Type t) {
            if (this.from.tail == null) {
                return t;
            }
            return visit(t);
        }

        List<Type> subst(List<Type> ts) {
            if (this.from.tail != null && ts.nonEmpty() && this.from.nonEmpty()) {
                Type head1 = subst(ts.head);
                List<Type> tail1 = subst(ts.tail);
                if (head1 != ts.head || tail1 != ts.tail) {
                    return tail1.prepend(head1);
                }
            }
            return ts;
        }

        @Override
        public Type visitType(Type t, Void ignored) {
            return t;
        }

        @Override
        public Type visitMethodType(Type.MethodType t, Void ignored) {
            List<Type> argtypes = subst(t.argtypes);
            Type restype = subst(t.restype);
            List<Type> thrown = subst(t.thrown);
            if (argtypes == t.argtypes && restype == t.restype && thrown == t.thrown) {
                return t;
            }
            return new Type.MethodType(argtypes, restype, thrown, t.tsym);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public Type visitTypeVar(Type.TypeVar t, Void ignored) {
            List list = this.from;
            List list2 = this.f351to;
            while (list.nonEmpty()) {
                if (t != list.head) {
                    list = list.tail;
                    list2 = list2.tail;
                } else {
                    return ((Type) list2.head).withTypeVar(t);
                }
            }
            return t;
        }

        @Override
        public Type visitClassType(Type.ClassType t, Void ignored) {
            if (!t.isCompound()) {
                List<Type> typarams = t.getTypeArguments();
                List<Type> typarams1 = subst(typarams);
                Type outer = t.getEnclosingType();
                Type outer1 = subst(outer);
                if (typarams1 == typarams && outer1 == outer) {
                    return t;
                }
                return new Type.ClassType(outer1, typarams1, t.tsym);
            }
            Type st = subst(Types.this.supertype(t));
            Types types = Types.this;
            List<Type> is = types.upperBounds(subst(types.interfaces(t)));
            if (st == Types.this.supertype(t) && is == Types.this.interfaces(t)) {
                return t;
            }
            return Types.this.makeCompoundType(is.prepend(st));
        }

        @Override
        public Type visitWildcardType(Type.WildcardType t, Void ignored) {
            Type bound = t.type;
            if (t.kind != BoundKind.UNBOUND) {
                bound = subst(bound);
            }
            if (bound == t.type) {
                return t;
            }
            if (t.isExtendsBound() && bound.isExtendsBound()) {
                bound = Types.this.upperBound(bound);
            }
            return new Type.WildcardType(bound, t.kind, Types.this.syms.boundClass, t.bound);
        }

        @Override
        public Type visitArrayType(Type.ArrayType t, Void ignored) {
            Type elemtype = subst(t.elemtype);
            if (elemtype == t.elemtype) {
                return t;
            }
            return new Type.ArrayType(Types.this.upperBound(elemtype), t.tsym);
        }

        @Override
        public Type visitForAll(Type.ForAll t, Void ignored) {
            if (Type.containsAny(this.f351to, t.tvars)) {
                List<Type> freevars = Types.this.newInstances(t.tvars);
                t = new Type.ForAll(freevars, Types.this.subst(t.qtype, t.tvars, freevars));
            }
            List<Type> tvars1 = Types.this.substBounds(t.tvars, this.from, this.f351to);
            Type qtype1 = subst(t.qtype);
            if (tvars1 == t.tvars && qtype1 == t.qtype) {
                return t;
            }
            if (tvars1 == t.tvars) {
                return new Type.ForAll(tvars1, qtype1);
            }
            return new Type.ForAll(tvars1, Types.this.subst(qtype1, t.tvars, tvars1));
        }

        @Override
        public Type visitErrorType(Type.ErrorType t, Void ignored) {
            return t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [A, com.sun.tools.javac.code.Type] */
    public List<Type> substBounds(List<Type> tvars, List<Type> from, List<Type> to) {
        if (tvars.isEmpty()) {
            return tvars;
        }
        ListBuffer<Type> newBoundsBuf = ListBuffer.m512lb();
        boolean changed = false;
        for (Type t : tvars) {
            Type.TypeVar tv = (Type.TypeVar) t;
            Type bound = subst(tv.bound, from, to);
            if (bound != tv.bound) {
                changed = true;
            }
            newBoundsBuf.append(bound);
        }
        if (!changed) {
            return tvars;
        }
        ListBuffer<Type> newTvars = ListBuffer.m512lb();
        for (Type t2 : tvars) {
            newTvars.append(new Type.TypeVar(t2.tsym, (Type) null, this.syms.botType));
        }
        List<Type> to2 = newTvars.toList();
        for (List list = newBoundsBuf.toList(); !list.isEmpty(); list = list.tail) {
            list.head = subst((Type) list.head, tvars, to2);
        }
        List list2 = newBoundsBuf.toList();
        for (Type t3 : newTvars.toList()) {
            ((Type.TypeVar) t3).bound = (Type) list2.head;
            list2 = list2.tail;
        }
        return newTvars.toList();
    }

    public Type.TypeVar substBound(Type.TypeVar t, List<Type> from, List<Type> to) {
        Type bound1 = subst(t.bound, from, to);
        if (bound1 == t.bound) {
            return t;
        }
        Type.TypeVar tv = new Type.TypeVar(t.tsym, (Type) null, this.syms.botType);
        tv.bound = subst(bound1, List.m508of(t), List.m508of(tv));
        return tv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean hasSameBounds(Type.ForAll t, Type.ForAll s) {
        List list = t.tvars;
        List list2 = s.tvars;
        while (list.nonEmpty() && list2.nonEmpty() && isSameType(((Type) list.head).mo576getUpperBound(), subst(((Type) list2.head).mo576getUpperBound(), s.tvars, t.tvars))) {
            list = list.tail;
            list2 = list2.tail;
        }
        return list.isEmpty() && list2.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<Type> newInstances(List<Type> tvars) {
        List<Type> tvars1 = Type.m452map(tvars, newInstanceFun);
        for (List list = tvars1; list.nonEmpty(); list = list.tail) {
            Type.TypeVar tv = (Type.TypeVar) list.head;
            tv.bound = subst(tv.bound, tvars, tvars1);
        }
        return tvars1;
    }

    public Type createMethodTypeWithParameters(Type original, List<Type> newParams) {
        return (Type) original.accept(this.methodWithParameters, newParams);
    }

    public Type createMethodTypeWithThrown(Type original, List<Type> newThrown) {
        return (Type) original.accept(this.methodWithThrown, newThrown);
    }

    public Type createMethodTypeWithReturn(Type original, Type newReturn) {
        return (Type) original.accept(this.methodWithReturn, newReturn);
    }

    public Type createErrorType(Type originalType) {
        return new Type.ErrorType(originalType, this.syms.errSymbol);
    }

    public Type createErrorType(Symbol.ClassSymbol c, Type originalType) {
        return new Type.ErrorType(c, originalType);
    }

    public Type createErrorType(Name name, Symbol.TypeSymbol container, Type originalType) {
        return new Type.ErrorType(name, container, originalType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int rank(Type t) {
        int i = t.f344tag;
        if (i == 10) {
            Type.ClassType cls = (Type.ClassType) t;
            if (cls.rank_field < 0) {
                Name fullname = cls.tsym.getQualifiedName();
                if (fullname == this.names.java_lang_Object) {
                    cls.rank_field = 0;
                } else {
                    int r = rank(supertype(cls));
                    for (List listInterfaces = interfaces(cls); listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
                        if (rank((Type) listInterfaces.head) > r) {
                            r = rank((Type) listInterfaces.head);
                        }
                    }
                    cls.rank_field = r + 1;
                }
            }
            return cls.rank_field;
        }
        if (i != 14) {
            if (i == 19) {
                return 0;
            }
            throw new AssertionError();
        }
        Type.TypeVar tvar = (Type.TypeVar) t;
        if (tvar.rank_field < 0) {
            int r2 = rank(supertype(tvar));
            for (List listInterfaces2 = interfaces(tvar); listInterfaces2.nonEmpty(); listInterfaces2 = listInterfaces2.tail) {
                if (rank((Type) listInterfaces2.head) > r2) {
                    r2 = rank((Type) listInterfaces2.head);
                }
            }
            tvar.rank_field = r2 + 1;
        }
        int r3 = tvar.rank_field;
        return r3;
    }

    public String toString(Type t, Locale locale) {
        return Printer.createStandardPrinter(this.messages).visit(t, locale);
    }

    public String toString(Symbol t, Locale locale) {
        return Printer.createStandardPrinter(this.messages).visit(t, locale);
    }

    @Deprecated
    public String toString(Type t) {
        if (t.f344tag == 16) {
            Type.ForAll forAll = (Type.ForAll) t;
            return typaramsString(forAll.tvars) + forAll.qtype;
        }
        return "" + t;
    }

    private String typaramsString(List<Type> tvars) {
        StringBuilder s = new StringBuilder();
        s.append('<');
        boolean first = true;
        for (Type t : tvars) {
            if (!first) {
                s.append(", ");
            }
            first = false;
            appendTyparamString((Type.TypeVar) t, s);
        }
        s.append('>');
        return s.toString();
    }

    private void appendTyparamString(Type.TypeVar t, StringBuilder buf) {
        buf.append(t);
        if (t.bound == null || t.bound.tsym.getQualifiedName() == this.names.java_lang_Object) {
            return;
        }
        buf.append(" extends ");
        Type bound = t.bound;
        if (!bound.isCompound()) {
            buf.append(bound);
            return;
        }
        if ((erasure(t).tsym.flags() & 512) == 0) {
            buf.append(supertype(t));
            for (Type intf : interfaces(t)) {
                buf.append('&');
                buf.append(intf);
            }
            return;
        }
        boolean first = true;
        for (Type intf2 : interfaces(t)) {
            if (!first) {
                buf.append('&');
            }
            first = false;
            buf.append(intf2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<Type> closure(Type t) {
        List<Type> cl = this.closureCache.get(t);
        if (cl == null) {
            Type st = supertype(t);
            if (!t.isCompound()) {
                if (st.f344tag == 10) {
                    cl = insert(closure(st), t);
                } else if (st.f344tag == 14) {
                    cl = closure(st).prepend(t);
                } else {
                    cl = List.m508of(t);
                }
            } else {
                cl = closure(supertype(t));
            }
            for (List listInterfaces = interfaces(t); listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
                cl = union(cl, closure((Type) listInterfaces.head));
            }
            this.closureCache.put(t, cl);
        }
        return cl;
    }

    public List<Type> insert(List<Type> cl, Type t) {
        if (cl.isEmpty() || t.tsym.precedes(cl.head.tsym, this)) {
            return cl.prepend(t);
        }
        if (cl.head.tsym.precedes(t.tsym, this)) {
            return insert(cl.tail, t).prepend(cl.head);
        }
        return cl;
    }

    public List<Type> union(List<Type> cl1, List<Type> cl2) {
        if (cl1.isEmpty()) {
            return cl2;
        }
        if (cl2.isEmpty()) {
            return cl1;
        }
        if (cl1.head.tsym.precedes(cl2.head.tsym, this)) {
            return union(cl1.tail, cl2).prepend(cl1.head);
        }
        if (cl2.head.tsym.precedes(cl1.head.tsym, this)) {
            return union(cl1, cl2.tail).prepend(cl2.head);
        }
        return union(cl1.tail, cl2.tail).prepend(cl1.head);
    }

    public List<Type> intersect(List<Type> cl1, List<Type> cl2) {
        if (cl1 == cl2) {
            return cl1;
        }
        if (cl1.isEmpty() || cl2.isEmpty()) {
            return List.m507nil();
        }
        if (cl1.head.tsym.precedes(cl2.head.tsym, this)) {
            return intersect(cl1.tail, cl2);
        }
        if (cl2.head.tsym.precedes(cl1.head.tsym, this)) {
            return intersect(cl1, cl2.tail);
        }
        if (isSameType(cl1.head, cl2.head)) {
            return intersect(cl1.tail, cl2.tail).prepend(cl1.head);
        }
        if (cl1.head.tsym == cl2.head.tsym && cl1.head.f344tag == 10 && cl2.head.f344tag == 10) {
            if (cl1.head.isParameterized() && cl2.head.isParameterized()) {
                Type merge = merge(cl1.head, cl2.head);
                return intersect(cl1.tail, cl2.tail).prepend(merge);
            }
            Type merge2 = cl1.head;
            if (merge2.isRaw() || cl2.head.isRaw()) {
                return intersect(cl1.tail, cl2.tail).prepend(erasure(cl1.head));
            }
        }
        return intersect(cl1.tail, cl2.tail);
    }

    class TypePair {

        final Type f352t1;

        final Type f353t2;

        TypePair(Type t1, Type t2) {
            this.f352t1 = t1;
            this.f353t2 = t2;
        }

        public int hashCode() {
            return (Types.hashCode(this.f352t1) * 127) + Types.hashCode(this.f353t2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof TypePair)) {
                return false;
            }
            TypePair typePair = (TypePair) obj;
            return Types.this.isSameType(this.f352t1, typePair.f352t1) && Types.this.isSameType(this.f353t2, typePair.f353t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Type merge(Type c1, Type c2) {
        Type m;
        Type.ClassType class1 = (Type.ClassType) c1;
        List typeArguments = class1.getTypeArguments();
        Type.ClassType class2 = (Type.ClassType) c2;
        List typeArguments2 = class2.getTypeArguments();
        ListBuffer listBuffer = new ListBuffer();
        List typeArguments3 = class1.tsym.type.getTypeArguments();
        while (typeArguments.nonEmpty() && typeArguments2.nonEmpty() && typeArguments3.nonEmpty()) {
            if (containsType((Type) typeArguments.head, (Type) typeArguments2.head)) {
                listBuffer.append(typeArguments.head);
            } else if (containsType((Type) typeArguments2.head, (Type) typeArguments.head)) {
                listBuffer.append(typeArguments2.head);
            } else {
                TypePair pair = new TypePair(c1, c2);
                if (this.mergeCache.add(pair)) {
                    m = new Type.WildcardType(m456lub(upperBound((Type) typeArguments.head), upperBound((Type) typeArguments2.head)), BoundKind.EXTENDS, this.syms.boundClass);
                    this.mergeCache.remove(pair);
                } else {
                    m = new Type.WildcardType(this.syms.objectType, BoundKind.UNBOUND, this.syms.boundClass);
                }
                listBuffer.append(m.withTypeVar((Type) typeArguments3.head));
            }
            typeArguments = typeArguments.tail;
            typeArguments2 = typeArguments2.tail;
            typeArguments3 = typeArguments3.tail;
        }
        Assert.check(typeArguments.isEmpty() && typeArguments2.isEmpty() && typeArguments3.isEmpty());
        return new Type.ClassType(class1.getEnclosingType(), listBuffer.toList(), class1.tsym);
    }

    private Type compoundMin(List<Type> cl) {
        if (cl.isEmpty()) {
            return this.syms.objectType;
        }
        List<Type> compound = closureMin(cl);
        if (compound.isEmpty()) {
            return null;
        }
        if (compound.tail.isEmpty()) {
            return compound.head;
        }
        return makeCompoundType(compound);
    }

    private List<Type> closureMin(List<Type> cl) {
        ListBuffer<Type> classes = ListBuffer.m512lb();
        ListBuffer<Type> interfaces = ListBuffer.m512lb();
        while (!cl.isEmpty()) {
            Type current = cl.head;
            if (current.isInterface()) {
                interfaces.append(current);
            } else {
                classes.append(current);
            }
            ListBuffer<Type> candidates = ListBuffer.m512lb();
            for (Type t : cl.tail) {
                if (!isSubtypeNoCapture(current, t)) {
                    candidates.append(t);
                }
            }
            cl = candidates.toList();
        }
        return classes.appendList(interfaces).toList();
    }

    public Type m456lub(Type t1, Type t2) {
        return m457lub(List.m509of(t1, t2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Type m457lub(List<Type> list) {
        List list2;
        int i = 0;
        for (Type typeMo576getUpperBound : list) {
            int i2 = typeMo576getUpperBound.f344tag;
            if (i2 == 10) {
                i |= 2;
            } else if (i2 == 11) {
                i |= 1;
            } else if (i2 == 14) {
                do {
                    typeMo576getUpperBound = typeMo576getUpperBound.mo576getUpperBound();
                } while (typeMo576getUpperBound.f344tag == 14);
                if (typeMo576getUpperBound.f344tag == 11) {
                    i |= 1;
                } else {
                    i |= 2;
                }
            } else if (typeMo576getUpperBound.isPrimitive()) {
                return this.syms.errType;
            }
        }
        if (i == 0) {
            return this.syms.botType;
        }
        if (i == 1) {
            List<Type> listM452map = Type.m452map(list, this.elemTypeFun);
            Iterator<Type> it = listM452map.iterator();
            while (it.hasNext()) {
                if (it.next().isPrimitive()) {
                    Type type = list.head;
                    Iterator<Type> it2 = list.tail.iterator();
                    while (it2.hasNext()) {
                        if (!isSameType(type, it2.next())) {
                            return arraySuperType();
                        }
                    }
                    return type;
                }
            }
            return new Type.ArrayType(m457lub(listM452map), this.syms.arrayClass);
        }
        if (i == 2) {
            while (true) {
                list2 = list;
                if (((Type) list2.head).f344tag == 10 || ((Type) list2.head).f344tag == 14) {
                    break;
                }
                list2 = list2.tail;
            }
            Assert.check(true ^ list2.isEmpty());
            List<Type> listErasedSupertypes = erasedSupertypes((Type) list2.head);
            for (A a : list2.tail) {
                if (a.f344tag == 10 || a.f344tag == 14) {
                    listErasedSupertypes = intersect(listErasedSupertypes, erasedSupertypes(a));
                }
            }
            List<Type> listClosureMin = closureMin(listErasedSupertypes);
            List<Type> listM507nil = List.m507nil();
            for (Type type2 : listClosureMin) {
                List<Type> listM508of = List.m508of(asSuper((Type) list2.head, type2.tsym));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    listM508of = intersect(listM508of, List.m508of(asSuper((Type) it3.next(), type2.tsym)));
                }
                listM507nil = listM507nil.appendList(listM508of);
            }
            return compoundMin(listM507nil);
        }
        list2 = list;
        List<Type> listM508of2 = List.m508of(arraySuperType());
        for (Type type3 : list) {
            if (type3.f344tag != 11) {
                listM508of2 = listM508of2.prepend(type3);
            }
        }
        return m457lub(listM508of2);
    }

    List<Type> erasedSupertypes(Type t) {
        ListBuffer<Type> buf = ListBuffer.m512lb();
        for (Type sup : closure(t)) {
            if (sup.f344tag == 14) {
                buf.append(sup);
            } else {
                buf.append(erasure(sup));
            }
        }
        return buf.toList();
    }

    public Type arraySuperType() {
        if (this.arraySuperType == null) {
            synchronized (this) {
                if (this.arraySuperType == null) {
                    this.arraySuperType = makeCompoundType(List.m509of(this.syms.serializableType, this.syms.cloneableType), this.syms.objectType);
                }
            }
        }
        return this.arraySuperType;
    }

    public Type m455glb(List<Type> ts) {
        Type t1 = ts.head;
        for (Type t2 : ts.tail) {
            if (t1.isErroneous()) {
                return t1;
            }
            t1 = m454glb(t1, t2);
        }
        return t1;
    }

    public Type m454glb(Type t, Type s) {
        if (s == null) {
            return t;
        }
        if (t.isPrimitive() || s.isPrimitive()) {
            return this.syms.errType;
        }
        if (isSubtypeNoCapture(t, s)) {
            return t;
        }
        if (isSubtypeNoCapture(s, t)) {
            return s;
        }
        List<Type> closure = union(closure(t), closure(s));
        List<Type> bounds = closureMin(closure);
        if (bounds.isEmpty()) {
            return this.syms.objectType;
        }
        if (bounds.tail.isEmpty()) {
            return bounds.head;
        }
        int classCount = 0;
        for (Type bound : bounds) {
            if (!bound.isInterface()) {
                classCount++;
            }
        }
        if (classCount > 1) {
            return createErrorType(t);
        }
        return makeCompoundType(bounds);
    }

    public static int hashCode(Type t) {
        return hashCode.visit(t).intValue();
    }

    public boolean resultSubtype(Type t, Type s, Warner warner) {
        List<Type> tvars = t.getTypeArguments();
        List<Type> svars = s.getTypeArguments();
        Type tres = t.mo574getReturnType();
        Type sres = subst(s.mo574getReturnType(), svars, tvars);
        return covariantReturnType(tres, sres, warner);
    }

    public boolean returnTypeSubstitutable(Type r1, Type r2) {
        if (hasSameArgs(r1, r2)) {
            return resultSubtype(r1, r2, Warner.noWarnings);
        }
        return covariantReturnType(r1.mo574getReturnType(), erasure(r2.mo574getReturnType()), Warner.noWarnings);
    }

    public boolean returnTypeSubstitutable(Type r1, Type r2, Type r2res, Warner warner) {
        if (isSameType(r1.mo574getReturnType(), r2res)) {
            return true;
        }
        if (r1.mo574getReturnType().isPrimitive() || r2res.isPrimitive()) {
            return false;
        }
        if (hasSameArgs(r1, r2)) {
            return covariantReturnType(r1.mo574getReturnType(), r2res, warner);
        }
        if (!this.allowCovariantReturns) {
            return false;
        }
        if (isSubtypeUnchecked(r1.mo574getReturnType(), r2res, warner)) {
            return true;
        }
        if (!isSubtype(r1.mo574getReturnType(), erasure(r2res))) {
            return false;
        }
        warner.warn(Lint.LintCategory.UNCHECKED);
        return true;
    }

    public boolean covariantReturnType(Type t, Type s, Warner warner) {
        return isSameType(t, s) || (this.allowCovariantReturns && !t.isPrimitive() && !s.isPrimitive() && isAssignable(t, s, warner));
    }

    public Symbol.ClassSymbol boxedClass(Type t) {
        return this.reader.enterClass(this.syms.boxedName[t.f344tag]);
    }

    public Type boxedTypeOrType(Type t) {
        if (t.isPrimitive()) {
            return boxedClass(t).type;
        }
        return t;
    }

    public Type unboxedType(Type t) {
        if (this.allowBoxing) {
            for (int i = 0; i < this.syms.boxedName.length; i++) {
                Name box = this.syms.boxedName[i];
                if (box != null && asSuper(t, this.reader.enterClass(box)) != null) {
                    return this.syms.typeOfTag[i];
                }
            }
        }
        return Type.noType;
    }

    public List<Type> capture(List<Type> ts) {
        List<Type> buf = List.m507nil();
        for (Type t : ts) {
            buf = buf.prepend(capture(t));
        }
        return buf.reverse();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [A, com.sun.tools.javac.code.Type] */
    public Type capture(Type t) {
        Type capturedEncl;
        if (t.f344tag != 10) {
            return t;
        }
        if (t.getEnclosingType() != Type.noType && (capturedEncl = capture(t.getEnclosingType())) != t.getEnclosingType()) {
            Type type1 = memberType(capturedEncl, t.tsym);
            t = subst(type1, t.tsym.type.getTypeArguments(), t.getTypeArguments());
        }
        Type.ClassType cls = (Type.ClassType) t;
        if (cls.isRaw() || !cls.isParameterized()) {
            return cls;
        }
        Type.ClassType G = (Type.ClassType) cls.asElement().asType();
        List<Type> A = G.getTypeArguments();
        List<Type> T = cls.getTypeArguments();
        List<Type> S = freshTypeVariables(T);
        List list = A;
        List list2 = T;
        List list3 = S;
        boolean captured = false;
        while (!list.isEmpty() && !list2.isEmpty() && !list3.isEmpty()) {
            if (list3.head != list2.head) {
                captured = true;
                Type.WildcardType Ti = (Type.WildcardType) list2.head;
                Type Ui = ((Type) list.head).mo576getUpperBound();
                Type.CapturedType Si = (Type.CapturedType) list3.head;
                if (Ui == null) {
                    Ui = this.syms.objectType;
                }
                int i = C060727.$SwitchMap$com$sun$tools$javac$code$BoundKind[Ti.kind.ordinal()];
                if (i == 1) {
                    Si.bound = subst(Ui, A, S);
                    Si.lower = this.syms.botType;
                } else if (i == 2) {
                    Si.bound = m454glb(Ti.getExtendsBound(), subst(Ui, A, S));
                    Si.lower = this.syms.botType;
                } else if (i == 3) {
                    Si.bound = subst(Ui, A, S);
                    Si.lower = Ti.getSuperBound();
                }
                if (Si.bound == Si.lower) {
                    list3.head = Si.bound;
                }
            }
            list = list.tail;
            list2 = list2.tail;
            list3 = list3.tail;
        }
        if (!list.isEmpty() || !list2.isEmpty() || !list3.isEmpty()) {
            return erasure(t);
        }
        if (captured) {
            return new Type.ClassType(cls.getEnclosingType(), S, cls.tsym);
        }
        return t;
    }

    public List<Type> freshTypeVariables(List<Type> types) {
        ListBuffer<Type> result = ListBuffer.m512lb();
        for (Type t : types) {
            if (t.f344tag == 15) {
                Type bound = ((Type.WildcardType) t).getExtendsBound();
                if (bound == null) {
                    bound = this.syms.objectType;
                }
                result.append(new Type.CapturedType(this.capturedName, this.syms.noSymbol, bound, this.syms.botType, (Type.WildcardType) t));
            } else {
                result.append(t);
            }
        }
        return result.toList();
    }

    public List<Type> upperBounds(List<Type> ss) {
        if (ss.isEmpty()) {
            return ss;
        }
        Type head = upperBound(ss.head);
        List<Type> tail = upperBounds(ss.tail);
        if (head != ss.head || tail != ss.tail) {
            return tail.prepend(head);
        }
        return ss;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean sideCast(Type from, Type to, Warner warn) {
        boolean reverse = false;
        if ((to.tsym.flags() & 512) == 0) {
            Assert.check((from.tsym.flags() & 512) != 0);
            reverse = true;
            to = from;
            from = to;
        }
        List listSuperClosure = superClosure(to, erasure(from));
        boolean giveWarning = listSuperClosure.isEmpty();
        while (listSuperClosure.nonEmpty()) {
            Type t1 = asSuper(from, ((Type) listSuperClosure.head).tsym);
            Type t2 = (Type) listSuperClosure.head;
            if (disjointTypes(t1.getTypeArguments(), t2.getTypeArguments())) {
                return false;
            }
            giveWarning = giveWarning || (!reverse ? !giveWarning(t1, t2) : !giveWarning(t2, t1));
            listSuperClosure = listSuperClosure.tail;
        }
        if (giveWarning) {
            if (!isReifiable(reverse ? from : to)) {
                warn.warn(Lint.LintCategory.UNCHECKED);
            }
        }
        if (!this.allowCovariantReturns) {
            this.f348chk.checkCompatibleAbstracts(warn.m520pos(), from, to);
        }
        return true;
    }

    public boolean sideCastFinal(Type from, Type to, Warner warn) {
        boolean reverse = false;
        if ((to.tsym.flags() & 512) == 0) {
            Assert.check((from.tsym.flags() & 512) != 0);
            reverse = true;
            to = from;
            from = to;
        }
        Assert.check((from.tsym.flags() & 16) != 0);
        Type t1 = asSuper(from, to.tsym);
        if (t1 == null) {
            return false;
        }
        Type t2 = to;
        if (disjointTypes(t1.getTypeArguments(), t2.getTypeArguments())) {
            return false;
        }
        if (!this.allowCovariantReturns) {
            this.f348chk.checkCompatibleAbstracts(warn.m520pos(), from, to);
        }
        if (!isReifiable(to) && (!reverse ? giveWarning(t1, t2) : giveWarning(t2, t1))) {
            warn.warn(Lint.LintCategory.UNCHECKED);
        }
        return true;
    }

    public boolean giveWarning(Type from, Type to) {
        Type subFrom = asSub(from, to.tsym);
        return to.isParameterized() && !isUnbounded(to) && !isSubtype(from, to) && (subFrom == null || !containsType(to.allparams(), subFrom.allparams()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<Type> superClosure(Type t, Type s) {
        List<Type> cl = List.m507nil();
        for (List listInterfaces = interfaces(t); listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
            if (isSubtype(s, erasure((Type) listInterfaces.head))) {
                cl = insert(cl, (Type) listInterfaces.head);
            } else {
                cl = union(cl, superClosure((Type) listInterfaces.head, s));
            }
        }
        return cl;
    }

    public boolean containsTypeEquivalent(Type t, Type s) {
        return isSameType(t, s) || (containsType(t, s) && containsType(s, t));
    }

    public void adapt(Type source, Type target, ListBuffer<Type> from, ListBuffer<Type> to) throws AdaptFailure {
        new Adapter(from, to).adapt(source, target);
    }

    class Adapter extends SimpleVisitor<Void, Type> {
        ListBuffer<Type> from;

        ListBuffer<Type> f349to;
        private Set<TypePair> cache = new HashSet();
        Map<Symbol, Type> mapping = new HashMap();

        Adapter(ListBuffer<Type> from, ListBuffer<Type> to) {
            this.from = from;
            this.f349to = to;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [A, com.sun.tools.javac.code.Type] */
        public void adapt(Type source, Type target) throws AdaptFailure {
            visit(source, target);
            List list = this.from.toList();
            List list2 = this.f349to.toList();
            while (!list.isEmpty()) {
                Type type = this.mapping.get(((Type) list.head).tsym);
                if (list2.head != type) {
                    list2.head = type;
                }
                list = list.tail;
                list2 = list2.tail;
            }
        }

        @Override
        public Void visitClassType(Type.ClassType source, Type target) throws AdaptFailure {
            if (target.f344tag == 10) {
                adaptRecursive(source.allparams(), target.allparams());
                return null;
            }
            return null;
        }

        @Override
        public Void visitArrayType(Type.ArrayType source, Type target) throws AdaptFailure {
            if (target.f344tag == 11) {
                adaptRecursive(Types.this.elemtype(source), Types.this.elemtype(target));
                return null;
            }
            return null;
        }

        @Override
        public Void visitWildcardType(Type.WildcardType source, Type target) throws AdaptFailure {
            if (source.isExtendsBound()) {
                adaptRecursive(Types.this.upperBound(source), Types.this.upperBound(target));
                return null;
            }
            if (source.isSuperBound()) {
                adaptRecursive(Types.this.lowerBound(source), Types.this.lowerBound(target));
                return null;
            }
            return null;
        }

        @Override
        public Void visitTypeVar(Type.TypeVar source, Type target) throws AdaptFailure {
            Type val = this.mapping.get(source.tsym);
            if (val != null) {
                if (val.isSuperBound() && target.isSuperBound()) {
                    Types types = Types.this;
                    val = types.isSubtype(types.lowerBound(val), Types.this.lowerBound(target)) ? target : val;
                } else if (val.isExtendsBound() && target.isExtendsBound()) {
                    Types types2 = Types.this;
                    val = types2.isSubtype(types2.upperBound(val), Types.this.upperBound(target)) ? val : target;
                } else if (!Types.this.isSameType(val, target)) {
                    throw new AdaptFailure();
                }
            } else {
                val = target;
                this.from.append(source);
                this.f349to.append(target);
            }
            this.mapping.put(source.tsym, val);
            return null;
        }

        @Override
        public Void visitType(Type source, Type target) {
            return null;
        }

        private void adaptRecursive(Type source, Type target) {
            TypePair pair = Types.this.new TypePair(source, target);
            if (this.cache.add(pair)) {
                try {
                    visit(source, target);
                } finally {
                    this.cache.remove(pair);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void adaptRecursive(List<Type> list, List<Type> list2) {
            int length = list.length();
            int length2 = list2.length();
            List list3 = list;
            List list4 = list2;
            if (length == length2) {
                while (list3.nonEmpty()) {
                    adaptRecursive((Type) list3.head, (Type) list4.head);
                    list3 = list3.tail;
                    list4 = list4.tail;
                }
            }
        }
    }

    public void adaptSelf(Type t, ListBuffer<Type> from, ListBuffer<Type> to) {
        try {
            adapt(t.tsym.type, t, from, to);
        } catch (AdaptFailure ex) {
            throw new AssertionError(ex);
        }
    }

    public Type rewriteQuantifiers(Type t, boolean high, boolean rewriteTypeVars) {
        return new Rewriter(high, rewriteTypeVars).visit(t);
    }

    class Rewriter extends UnaryVisitor<Type> {
        boolean high;
        boolean rewriteTypeVars;

        Rewriter(boolean high, boolean rewriteTypeVars) {
            this.high = high;
            this.rewriteTypeVars = rewriteTypeVars;
        }

        @Override
        public Type visitClassType(Type.ClassType t, Void s) {
            ListBuffer<Type> rewritten = new ListBuffer<>();
            boolean changed = false;
            for (Type arg : t.allparams()) {
                Type bound = visit(arg);
                if (arg != bound) {
                    changed = true;
                }
                rewritten.append(bound);
            }
            if (changed) {
                return Types.this.subst(t.tsym.type, t.tsym.type.allparams(), rewritten.toList());
            }
            return t;
        }

        @Override
        public Type visitType(Type t, Void s) {
            return this.high ? Types.this.upperBound(t) : Types.this.lowerBound(t);
        }

        @Override
        public Type visitCapturedType(Type.CapturedType t, Void s) {
            Type bound = visitWildcardType(t.wildcard, (Void) null);
            if (bound.contains(t)) {
                return Types.this.erasure(bound);
            }
            return bound;
        }

        @Override
        public Type visitTypeVar(Type.TypeVar t, Void s) {
            Type bound;
            if (this.rewriteTypeVars) {
                if (this.high) {
                    if (t.bound.contains(t)) {
                        bound = Types.this.erasure(t.bound);
                    } else {
                        bound = visit(t.bound);
                    }
                } else {
                    bound = Types.this.syms.botType;
                }
                return rewriteAsWildcardType(bound, t);
            }
            return t;
        }

        @Override
        public Type visitWildcardType(Type.WildcardType t, Void s) {
            Type bound = this.high ? t.getExtendsBound() : t.getSuperBound();
            if (bound == null) {
                bound = this.high ? Types.this.syms.objectType : Types.this.syms.botType;
            }
            return rewriteAsWildcardType(visit(bound), t.bound);
        }

        private Type rewriteAsWildcardType(Type bound, Type.TypeVar formal) {
            return this.high ? Types.this.makeExtendsWildcard(m461B(bound), formal) : Types.this.makeSuperWildcard(m461B(bound), formal);
        }

        Type m461B(Type t) {
            Type superBound;
            while (t.f344tag == 15) {
                Type.WildcardType w = (Type.WildcardType) t;
                if (this.high) {
                    superBound = w.getExtendsBound();
                } else {
                    superBound = w.getSuperBound();
                }
                t = superBound;
                if (t == null) {
                    t = this.high ? Types.this.syms.objectType : Types.this.syms.botType;
                }
            }
            return t;
        }
    }

    public Type.WildcardType makeExtendsWildcard(Type bound, Type.TypeVar formal) {
        if (bound == this.syms.objectType) {
            return new Type.WildcardType(this.syms.objectType, BoundKind.UNBOUND, this.syms.boundClass, formal);
        }
        return new Type.WildcardType(bound, BoundKind.EXTENDS, this.syms.boundClass, formal);
    }

    public Type.WildcardType makeSuperWildcard(Type bound, Type.TypeVar formal) {
        if (bound.f344tag == 17) {
            return new Type.WildcardType(this.syms.objectType, BoundKind.UNBOUND, this.syms.boundClass, formal);
        }
        return new Type.WildcardType(bound, BoundKind.SUPER, this.syms.boundClass, formal);
    }

    class SingletonType {

        final Type f350t;

        SingletonType(Type t) {
            this.f350t = t;
        }

        public int hashCode() {
            return Types.hashCode(this.f350t);
        }

        public boolean equals(Object obj) {
            return (obj instanceof SingletonType) && Types.this.isSameType(this.f350t, ((SingletonType) obj).f350t);
        }

        public String toString() {
            return this.f350t.toString();
        }
    }

    public static abstract class DefaultTypeVisitor<R, S> implements Type.Visitor<R, S> {
        public final R visit(Type type, S s) {
            return (R) type.accept(this, s);
        }

        @Override
        public R visitClassType(Type.ClassType t, S s) {
            return visitType(t, s);
        }

        @Override
        public R visitWildcardType(Type.WildcardType t, S s) {
            return visitType(t, s);
        }

        @Override
        public R visitArrayType(Type.ArrayType t, S s) {
            return visitType(t, s);
        }

        @Override
        public R visitMethodType(Type.MethodType t, S s) {
            return visitType(t, s);
        }

        @Override
        public R visitPackageType(Type.PackageType t, S s) {
            return visitType(t, s);
        }

        @Override
        public R visitTypeVar(Type.TypeVar t, S s) {
            return visitType(t, s);
        }

        @Override
        public R visitCapturedType(Type.CapturedType t, S s) {
            return visitType(t, s);
        }

        @Override
        public R visitForAll(Type.ForAll t, S s) {
            return visitType(t, s);
        }

        @Override
        public R visitUndetVar(Type.UndetVar t, S s) {
            return visitType(t, s);
        }

        @Override
        public R visitErrorType(Type.ErrorType t, S s) {
            return visitType(t, s);
        }
    }

    public static abstract class DefaultSymbolVisitor<R, S> implements Symbol.Visitor<R, S> {
        public final R visit(Symbol symbol, S s) {
            return (R) symbol.accept(this, s);
        }

        @Override
        public R visitClassSymbol(Symbol.ClassSymbol s, S arg) {
            return visitSymbol(s, arg);
        }

        @Override
        public R visitMethodSymbol(Symbol.MethodSymbol s, S arg) {
            return visitSymbol(s, arg);
        }

        @Override
        public R visitOperatorSymbol(Symbol.OperatorSymbol s, S arg) {
            return visitSymbol(s, arg);
        }

        @Override
        public R visitPackageSymbol(Symbol.PackageSymbol s, S arg) {
            return visitSymbol(s, arg);
        }

        @Override
        public R visitTypeSymbol(Symbol.TypeSymbol s, S arg) {
            return visitSymbol(s, arg);
        }

        @Override
        public R visitVarSymbol(Symbol.VarSymbol s, S arg) {
            return visitSymbol(s, arg);
        }
    }

    public static abstract class SimpleVisitor<R, S> extends DefaultTypeVisitor<R, S> {
        @Override
        public R visitCapturedType(Type.CapturedType t, S s) {
            return visitTypeVar(t, s);
        }

        @Override
        public R visitForAll(Type.ForAll t, S s) {
            return visit(t.qtype, s);
        }

        @Override
        public R visitUndetVar(Type.UndetVar t, S s) {
            return visit(t.qtype, s);
        }
    }

    public static abstract class UnaryVisitor<R> extends SimpleVisitor<R, Void> {
        public final R visit(Type type) {
            return (R) type.accept(this, (Object) null);
        }
    }

    public static class MapVisitor<S> extends DefaultTypeVisitor<Type, S> {
        public final Type visit(Type t) {
            return (Type) t.accept(this, (Object) null);
        }

        @Override
        public Type visitType(Type t, S s) {
            return t;
        }
    }

    public RetentionPolicy getRetention(Attribute.Compound a) {
        Attribute value;
        RetentionPolicy vis = RetentionPolicy.CLASS;
        Attribute.Compound c = a.type.tsym.attribute(this.syms.retentionType.tsym);
        if (c != null && (value = c.member(this.names.value)) != null && (value instanceof Attribute.Enum)) {
            Name levelName = ((Attribute.Enum) value).value.name;
            if (levelName == this.names.SOURCE) {
                return RetentionPolicy.SOURCE;
            }
            if (levelName == this.names.CLASS) {
                return RetentionPolicy.CLASS;
            }
            return levelName == this.names.RUNTIME ? RetentionPolicy.RUNTIME : vis;
        }
        return vis;
    }
}
