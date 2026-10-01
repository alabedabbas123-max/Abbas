package com.sun.tools.javac.code;

import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Filter;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import java.util.Collections;
import javax.lang.model.element.Element;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.NullType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.TypeVisitor;
import javax.lang.model.type.UnionType;

public class Type implements PrimitiveType {

    public int f344tag;
    public Symbol.TypeSymbol tsym;
    public static final JCNoType noType = new JCNoType(18);
    public static boolean moreInfo = false;

    public interface Visitor<R, S> {
        R visitArrayType(ArrayType arrayType, S s);

        R visitCapturedType(CapturedType capturedType, S s);

        R visitClassType(ClassType classType, S s);

        R visitErrorType(ErrorType errorType, S s);

        R visitForAll(ForAll forAll, S s);

        R visitMethodType(MethodType methodType, S s);

        R visitPackageType(PackageType packageType, S s);

        R visitType(Type type, S s);

        R visitTypeVar(TypeVar typeVar, S s);

        R visitUndetVar(UndetVar undetVar, S s);

        R visitWildcardType(WildcardType wildcardType, S s);
    }

    public Object constValue() {
        return null;
    }

    public Type getModelType() {
        return this;
    }

    public static List<Type> getModelTypes(List<Type> ts) {
        ListBuffer<Type> lb = new ListBuffer<>();
        for (Type t : ts) {
            lb.append(t.getModelType());
        }
        return lb.toList();
    }

    public <R, S> R accept(Visitor<R, S> v, S s) {
        return v.visitType(this, s);
    }

    public Type(int tag, Symbol.TypeSymbol tsym) {
        this.f344tag = tag;
        this.tsym = tsym;
    }

    public static abstract class Mapping {
        private String name;

        public abstract Type apply(Type type);

        public Mapping(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }
    }

    public Type mo453map(Mapping f) {
        return this;
    }

    public static List<Type> m452map(List<Type> ts, Mapping f) {
        if (ts.nonEmpty()) {
            List<Type> tail1 = m452map(ts.tail, f);
            Type t = f.apply(ts.head);
            if (tail1 != ts.tail || t != ts.head) {
                return tail1.prepend(t);
            }
        }
        return ts;
    }

    public Type constType(final Object constValue) {
        Assert.check(this.f344tag <= 8);
        return new Type(this.f344tag, this.tsym) {
            @Override
            public Object constValue() {
                return constValue;
            }

            @Override
            public Type baseType() {
                return this.tsym.type;
            }
        };
    }

    public Type baseType() {
        return this;
    }

    public static List<Type> baseTypes(List<Type> ts) {
        if (ts.nonEmpty()) {
            Type t = ts.head.baseType();
            List<Type> baseTypes = baseTypes(ts.tail);
            if (t != ts.head || baseTypes != ts.tail) {
                return baseTypes.prepend(t);
            }
        }
        return ts;
    }

    @Override
    public String toString() {
        String s;
        Symbol.TypeSymbol typeSymbol = this.tsym;
        if (typeSymbol == null || typeSymbol.name == null) {
            s = "<none>";
        } else {
            s = this.tsym.name.toString();
        }
        if (!moreInfo || this.f344tag != 14) {
            return s;
        }
        return s + hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String toString(List<Type> ts) {
        if (ts.isEmpty()) {
            return "";
        }
        StringBuilder buf = new StringBuilder();
        buf.append(ts.head.toString());
        for (List list = ts.tail; list.nonEmpty(); list = list.tail) {
            buf.append(",");
            buf.append(((Type) list.head).toString());
        }
        return buf.toString();
    }

    public String stringValue() {
        Object cv = Assert.checkNonNull(constValue());
        int i = this.f344tag;
        if (i == 8) {
            return ((Integer) cv).intValue() == 0 ? "false" : "true";
        }
        if (i == 2) {
            return String.valueOf((char) ((Integer) cv).intValue());
        }
        return cv.toString();
    }

    @Override
    public boolean equals(Object t) {
        return super.equals(t);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public boolean isFalse() {
        return this.f344tag == 8 && constValue() != null && ((Integer) constValue()).intValue() == 0;
    }

    public boolean isTrue() {
        return (this.f344tag != 8 || constValue() == null || ((Integer) constValue()).intValue() == 0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String argtypes(boolean varargs) {
        List listMo573getParameterTypes = mo573getParameterTypes();
        if (!varargs) {
            return listMo573getParameterTypes.toString();
        }
        StringBuilder buf = new StringBuilder();
        while (listMo573getParameterTypes.tail.nonEmpty()) {
            buf.append(listMo573getParameterTypes.head);
            listMo573getParameterTypes = listMo573getParameterTypes.tail;
            buf.append(',');
        }
        if (((Type) listMo573getParameterTypes.head).f344tag == 11) {
            buf.append(((ArrayType) listMo573getParameterTypes.head).elemtype);
            buf.append("...");
        } else {
            buf.append(listMo573getParameterTypes.head);
        }
        return buf.toString();
    }

    public List<Type> getTypeArguments() {
        return List.m507nil();
    }

    public Type getEnclosingType() {
        return null;
    }

    public List<Type> mo573getParameterTypes() {
        return List.m507nil();
    }

    public Type mo574getReturnType() {
        return null;
    }

    public List<Type> mo575getThrownTypes() {
        return List.m507nil();
    }

    public Type mo576getUpperBound() {
        return null;
    }

    public Type getLowerBound() {
        return null;
    }

    public List<Type> allparams() {
        return List.m507nil();
    }

    public boolean isErroneous() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isErroneous(List<Type> ts) {
        for (List list = ts; list.nonEmpty(); list = list.tail) {
            if (((Type) list.head).isErroneous()) {
                return true;
            }
        }
        return false;
    }

    public boolean isParameterized() {
        return false;
    }

    public boolean isRaw() {
        return false;
    }

    public boolean isCompound() {
        return this.tsym.completer == null && (this.tsym.flags() & 16777216) != 0;
    }

    public boolean isInterface() {
        return (this.tsym.flags() & 512) != 0;
    }

    public boolean isFinal() {
        return (this.tsym.flags() & 16) != 0;
    }

    public boolean isPrimitive() {
        return this.f344tag < 9;
    }

    public boolean contains(Type t) {
        return t == this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean contains(List<Type> ts, Type t) {
        for (List list = ts; list.tail != null; list = list.tail) {
            if (((Type) list.head).contains(t)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAny(List<Type> ts) {
        for (Type t : ts) {
            if (contains(t)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsAny(List<Type> ts1, List<Type> ts2) {
        for (Type t : ts1) {
            if (t.containsAny(ts2)) {
                return true;
            }
        }
        return false;
    }

    public static List<Type> filter(List<Type> ts, Filter<Type> tf) {
        ListBuffer<Type> buf = ListBuffer.m512lb();
        for (Type t : ts) {
            if (tf.accepts(t)) {
                buf.append(t);
            }
        }
        return buf.toList();
    }

    public boolean isSuperBound() {
        return false;
    }

    public boolean isExtendsBound() {
        return false;
    }

    public boolean isUnbound() {
        return false;
    }

    public Type withTypeVar(Type t) {
        return this;
    }

    public MethodType asMethodType() {
        throw new AssertionError();
    }

    public void complete() {
    }

    public Symbol.TypeSymbol asElement() {
        return this.tsym;
    }

    @Override
    public TypeKind getKind() {
        int i = this.f344tag;
        if (i == 17) {
            return TypeKind.NULL;
        }
        if (i != 18) {
            switch (i) {
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
                    return TypeKind.OTHER;
            }
        }
        return TypeKind.NONE;
    }

    @Override
    public <R, P> R accept(TypeVisitor<R, P> v, P p) {
        if (isPrimitive()) {
            return v.visitPrimitive(this, p);
        }
        throw new AssertionError();
    }

    public static class WildcardType extends Type implements javax.lang.model.type.WildcardType {
        public TypeVar bound;
        boolean isPrintingBound;
        public BoundKind kind;
        public Type type;

        @Override
        public <R, S> R accept(Visitor<R, S> v, S s) {
            return v.visitWildcardType(this, s);
        }

        public WildcardType(Type type, BoundKind kind, Symbol.TypeSymbol tsym) {
            super(15, tsym);
            this.isPrintingBound = false;
            this.type = (Type) Assert.checkNonNull(type);
            this.kind = kind;
        }

        public WildcardType(WildcardType t, TypeVar bound) {
            this(t.type, t.kind, t.tsym, bound);
        }

        public WildcardType(Type type, BoundKind kind, Symbol.TypeSymbol tsym, TypeVar bound) {
            this(type, kind, tsym);
            this.bound = bound;
        }

        @Override
        public boolean contains(Type t) {
            return this.kind != BoundKind.UNBOUND && this.type.contains(t);
        }

        @Override
        public boolean isSuperBound() {
            return this.kind == BoundKind.SUPER || this.kind == BoundKind.UNBOUND;
        }

        @Override
        public boolean isExtendsBound() {
            return this.kind == BoundKind.EXTENDS || this.kind == BoundKind.UNBOUND;
        }

        @Override
        public boolean isUnbound() {
            return this.kind == BoundKind.UNBOUND;
        }

        @Override
        public Type withTypeVar(Type t) {
            if (this.bound == t) {
                return this;
            }
            this.bound = (TypeVar) t;
            return this;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append(this.kind.toString());
            if (this.kind != BoundKind.UNBOUND) {
                s.append(this.type);
            }
            if (moreInfo && this.bound != null && !this.isPrintingBound) {
                try {
                    this.isPrintingBound = true;
                    s.append("{:");
                    s.append(this.bound.bound);
                    s.append(":}");
                } finally {
                    this.isPrintingBound = false;
                }
            }
            return s.toString();
        }

        @Override
        public Type mo453map(Mapping f) {
            Type t = this.type;
            if (t != null) {
                t = f.apply(t);
            }
            if (t == this.type) {
                return this;
            }
            return new WildcardType(t, this.kind, this.tsym, this.bound);
        }

        @Override
        public Type getExtendsBound() {
            if (this.kind == BoundKind.EXTENDS) {
                return this.type;
            }
            return null;
        }

        @Override
        public Type getSuperBound() {
            if (this.kind == BoundKind.SUPER) {
                return this.type;
            }
            return null;
        }

        @Override
        public TypeKind getKind() {
            return TypeKind.WILDCARD;
        }

        @Override
        public <R, P> R accept(TypeVisitor<R, P> v, P p) {
            return v.visitWildcard(this, p);
        }
    }

    public static class ClassType extends Type implements DeclaredType {
        public List<Type> all_interfaces_field;
        public List<Type> allparams_field;
        public List<Type> interfaces_field;
        private Type outer_field;
        int rank_field;
        public Type supertype_field;
        public List<Type> typarams_field;

        @Override
        public Element asElement() {
            return super.asElement();
        }

        public ClassType(Type outer, List<Type> typarams, Symbol.TypeSymbol tsym) {
            super(10, tsym);
            this.rank_field = -1;
            this.outer_field = outer;
            this.typarams_field = typarams;
            this.allparams_field = null;
            this.supertype_field = null;
            this.interfaces_field = null;
        }

        @Override
        public <R, S> R accept(Visitor<R, S> v, S s) {
            return v.visitClassType(this, s);
        }

        @Override
        public Type constType(final Object constValue) {
            return new ClassType(getEnclosingType(), this.typarams_field, this.tsym) {
                @Override
                public Element asElement() {
                    return super.asElement();
                }

                @Override
                public TypeMirror getEnclosingType() {
                    return super.getEnclosingType();
                }

                @Override
                public java.util.List getTypeArguments() {
                    return super.getTypeArguments();
                }

                @Override
                public Object constValue() {
                    return constValue;
                }

                @Override
                public Type baseType() {
                    return this.tsym.type;
                }
            };
        }

        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder();
            if (getEnclosingType().f344tag == 10 && this.tsym.owner.kind == 2) {
                buf.append(getEnclosingType().toString());
                buf.append(".");
                buf.append(className(this.tsym, false));
            } else {
                buf.append(className(this.tsym, true));
            }
            if (getTypeArguments().nonEmpty()) {
                buf.append('<');
                buf.append(getTypeArguments().toString());
                buf.append(">");
            }
            return buf.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private String className(Symbol sym, boolean longform) {
            String s;
            if (sym.name.isEmpty() && (sym.flags() & 16777216) != 0) {
                StringBuilder s2 = new StringBuilder(this.supertype_field.toString());
                for (List list = this.interfaces_field; list.nonEmpty(); list = list.tail) {
                    s2.append("&");
                    s2.append(((Type) list.head).toString());
                }
                return s2.toString();
            }
            if (sym.name.isEmpty()) {
                ClassType norm = (ClassType) this.tsym.type;
                if (norm == null) {
                    s = Log.getLocalizedString("anonymous.class", null);
                } else {
                    List<Type> list2 = norm.interfaces_field;
                    if (list2 != null && list2.nonEmpty()) {
                        s = Log.getLocalizedString("anonymous.class", norm.interfaces_field.head);
                    } else {
                        s = Log.getLocalizedString("anonymous.class", norm.supertype_field);
                    }
                }
                if (moreInfo) {
                    return s + String.valueOf(sym.hashCode());
                }
                return s;
            }
            if (longform) {
                return sym.getQualifiedName().toString();
            }
            return sym.name.toString();
        }

        @Override
        public List<Type> getTypeArguments() {
            if (this.typarams_field == null) {
                complete();
                if (this.typarams_field == null) {
                    this.typarams_field = List.m507nil();
                }
            }
            return this.typarams_field;
        }

        public boolean hasErasedSupertypes() {
            return isRaw();
        }

        @Override
        public Type getEnclosingType() {
            return this.outer_field;
        }

        public void setEnclosingType(Type outer) {
            this.outer_field = outer;
        }

        @Override
        public List<Type> allparams() {
            if (this.allparams_field == null) {
                this.allparams_field = getTypeArguments().prependList(getEnclosingType().allparams());
            }
            return this.allparams_field;
        }

        @Override
        public boolean isErroneous() {
            return getEnclosingType().isErroneous() || isErroneous(getTypeArguments()) || (this != this.tsym.type && this.tsym.type.isErroneous());
        }

        @Override
        public boolean isParameterized() {
            return allparams().tail != null;
        }

        @Override
        public boolean isRaw() {
            return this != this.tsym.type && this.tsym.type.allparams().nonEmpty() && allparams().isEmpty();
        }

        @Override
        public Type mo453map(Mapping f) {
            Type outer = getEnclosingType();
            Type outer1 = f.apply(outer);
            List<Type> typarams = getTypeArguments();
            List<Type> typarams1 = m452map(typarams, f);
            return (outer1 == outer && typarams1 == typarams) ? this : new ClassType(outer1, typarams1, this.tsym);
        }

        @Override
        public boolean contains(Type elem) {
            return elem == this || (isParameterized() && (getEnclosingType().contains(elem) || contains(getTypeArguments(), elem))) || (isCompound() && (this.supertype_field.contains(elem) || contains(this.interfaces_field, elem)));
        }

        @Override
        public void complete() {
            if (this.tsym.completer != null) {
                this.tsym.complete();
            }
        }

        @Override
        public TypeKind getKind() {
            return TypeKind.DECLARED;
        }

        @Override
        public <R, P> R accept(TypeVisitor<R, P> v, P p) {
            return v.visitDeclared(this, p);
        }
    }

    public static class ErasedClassType extends ClassType {
        public ErasedClassType(Type outer, Symbol.TypeSymbol tsym) {
            super(outer, List.m507nil(), tsym);
        }

        @Override
        public boolean hasErasedSupertypes() {
            return true;
        }
    }

    public static class UnionClassType extends ClassType implements UnionType {
        final List<? extends Type> alternatives_field;

        public UnionClassType(ClassType ct, List<? extends Type> alternatives) {
            super(ct.outer_field, ct.typarams_field, ct.tsym);
            this.allparams_field = ct.allparams_field;
            this.supertype_field = ct.supertype_field;
            this.interfaces_field = ct.interfaces_field;
            this.all_interfaces_field = ct.interfaces_field;
            this.alternatives_field = alternatives;
        }

        public Type getLub() {
            return this.tsym.type;
        }

        @Override
        public java.util.List<? extends TypeMirror> getAlternatives() {
            return Collections.unmodifiableList(this.alternatives_field);
        }

        @Override
        public TypeKind getKind() {
            return TypeKind.UNION;
        }

        @Override
        public <R, P> R accept(TypeVisitor<R, P> v, P p) {
            return v.visitUnion(this, p);
        }
    }

    public static class ArrayType extends Type implements javax.lang.model.type.ArrayType {
        public Type elemtype;

        public ArrayType(Type elemtype, Symbol.TypeSymbol arrayClass) {
            super(11, arrayClass);
            this.elemtype = elemtype;
        }

        @Override
        public <R, S> R accept(Visitor<R, S> v, S s) {
            return v.visitArrayType(this, s);
        }

        @Override
        public String toString() {
            return this.elemtype + "[]";
        }

        @Override
        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ArrayType) && this.elemtype.equals(((ArrayType) obj).elemtype));
        }

        @Override
        public int hashCode() {
            return this.elemtype.hashCode() + 352;
        }

        public boolean isVarargs() {
            return false;
        }

        @Override
        public List<Type> allparams() {
            return this.elemtype.allparams();
        }

        @Override
        public boolean isErroneous() {
            return this.elemtype.isErroneous();
        }

        @Override
        public boolean isParameterized() {
            return this.elemtype.isParameterized();
        }

        @Override
        public boolean isRaw() {
            return this.elemtype.isRaw();
        }

        public ArrayType makeVarargs() {
            return new ArrayType(this.elemtype, this.tsym) {
                @Override
                public TypeMirror getComponentType() {
                    return super.getComponentType();
                }

                @Override
                public boolean isVarargs() {
                    return true;
                }
            };
        }

        @Override
        public Type mo453map(Mapping f) {
            Type elemtype1 = f.apply(this.elemtype);
            return elemtype1 == this.elemtype ? this : new ArrayType(elemtype1, this.tsym);
        }

        @Override
        public boolean contains(Type elem) {
            return elem == this || this.elemtype.contains(elem);
        }

        @Override
        public void complete() {
            this.elemtype.complete();
        }

        @Override
        public Type getComponentType() {
            return this.elemtype;
        }

        @Override
        public TypeKind getKind() {
            return TypeKind.ARRAY;
        }

        @Override
        public <R, P> R accept(TypeVisitor<R, P> v, P p) {
            return v.visitArray(this, p);
        }
    }

    public static class MethodType extends Type implements ExecutableType {
        public List<Type> argtypes;
        public Type restype;
        public List<Type> thrown;

        public MethodType(List<Type> argtypes, Type restype, List<Type> thrown, Symbol.TypeSymbol methodClass) {
            super(12, methodClass);
            this.argtypes = argtypes;
            this.restype = restype;
            this.thrown = thrown;
        }

        @Override
        public <R, S> R accept(Visitor<R, S> v, S s) {
            return v.visitMethodType(this, s);
        }

        @Override
        public String toString() {
            return "(" + this.argtypes + ")" + this.restype;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodType)) {
                return false;
            }
            MethodType m = (MethodType) obj;
            List list = this.argtypes;
            List list2 = m.argtypes;
            while (!list.isEmpty() && !list2.isEmpty()) {
                if (!((Type) list.head).equals(list2.head)) {
                    return false;
                }
                list = list.tail;
                list2 = list2.tail;
            }
            if (list.isEmpty() && list2.isEmpty()) {
                return this.restype.equals(m.restype);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public int hashCode() {
            int h = 12;
            for (List list = this.argtypes; list.tail != null; list = list.tail) {
                h = (h << 5) + ((Type) list.head).hashCode();
            }
            return (h << 5) + this.restype.hashCode();
        }

        @Override
        public List<Type> mo573getParameterTypes() {
            return this.argtypes;
        }

        @Override
        public Type mo574getReturnType() {
            return this.restype;
        }

        @Override
        public List<Type> mo575getThrownTypes() {
            return this.thrown;
        }

        @Override
        public boolean isErroneous() {
            Type type;
            return isErroneous(this.argtypes) || ((type = this.restype) != null && type.isErroneous());
        }

        @Override
        public Type mo453map(Mapping f) {
            List<Type> argtypes1 = m452map(this.argtypes, f);
            Type restype1 = f.apply(this.restype);
            List<Type> thrown1 = m452map(this.thrown, f);
            if (argtypes1 == this.argtypes && restype1 == this.restype && thrown1 == this.thrown) {
                return this;
            }
            return new MethodType(argtypes1, restype1, thrown1, this.tsym);
        }

        @Override
        public boolean contains(Type elem) {
            return elem == this || contains(this.argtypes, elem) || this.restype.contains(elem);
        }

        @Override
        public MethodType asMethodType() {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public void complete() {
            for (List list = this.argtypes; list.nonEmpty(); list = list.tail) {
                ((Type) list.head).complete();
            }
            this.restype.complete();
            for (List list2 = this.thrown; list2.nonEmpty(); list2 = list2.tail) {
                ((Type) list2.head).complete();
            }
        }

        @Override
        public List<TypeVar> getTypeVariables() {
            return List.m507nil();
        }

        @Override
        public Symbol.TypeSymbol asElement() {
            return null;
        }

        @Override
        public TypeKind getKind() {
            return TypeKind.EXECUTABLE;
        }

        @Override
        public <R, P> R accept(TypeVisitor<R, P> v, P p) {
            return v.visitExecutable(this, p);
        }
    }

    public static class PackageType extends Type implements NoType {
        PackageType(Symbol.TypeSymbol tsym) {
            super(13, tsym);
        }

        @Override
        public <R, S> R accept(Visitor<R, S> v, S s) {
            return v.visitPackageType(this, s);
        }

        @Override
        public String toString() {
            return this.tsym.getQualifiedName().toString();
        }

        @Override
        public TypeKind getKind() {
            return TypeKind.PACKAGE;
        }

        @Override
        public <R, P> R accept(TypeVisitor<R, P> v, P p) {
            return v.visitNoType(this, p);
        }
    }

    public static class TypeVar extends Type implements TypeVariable {
        public Type bound;
        public Type lower;
        int rank_field;

        @Override
        public Element asElement() {
            return super.asElement();
        }

        public TypeVar(Name name, Symbol owner, Type lower) {
            super(14, null);
            this.bound = null;
            this.rank_field = -1;
            this.tsym = new Symbol.TypeSymbol(0L, name, this, owner);
            this.lower = lower;
        }

        public TypeVar(Symbol.TypeSymbol tsym, Type bound, Type lower) {
            super(14, tsym);
            this.bound = null;
            this.rank_field = -1;
            this.bound = bound;
            this.lower = lower;
        }

        @Override
        public <R, S> R accept(Visitor<R, S> v, S s) {
            return v.visitTypeVar(this, s);
        }

        @Override
        public Type mo576getUpperBound() {
            return this.bound;
        }

        @Override
        public Type getLowerBound() {
            return this.lower;
        }

        @Override
        public TypeKind getKind() {
            return TypeKind.TYPEVAR;
        }

        public boolean isCaptured() {
            return false;
        }

        @Override
        public <R, P> R accept(TypeVisitor<R, P> v, P p) {
            return v.visitTypeVariable(this, p);
        }
    }

    public static class CapturedType extends TypeVar {
        public WildcardType wildcard;

        public CapturedType(Name name, Symbol owner, Type upper, Type lower, WildcardType wildcard) {
            super(name, owner, lower);
            this.lower = (Type) Assert.checkNonNull(lower);
            this.bound = upper;
            this.wildcard = wildcard;
        }

        @Override
        public <R, S> R accept(Visitor<R, S> v, S s) {
            return v.visitCapturedType(this, s);
        }

        @Override
        public boolean isCaptured() {
            return true;
        }

        @Override
        public String toString() {
            return "capture#" + ((((long) hashCode()) & 4294967295L) % 997) + " of " + this.wildcard;
        }
    }

    public static abstract class DelegatedType extends Type {
        public Type qtype;

        public DelegatedType(int tag, Type qtype) {
            super(tag, qtype.tsym);
            this.qtype = qtype;
        }

        @Override
        public String toString() {
            return this.qtype.toString();
        }

        @Override
        public List<Type> getTypeArguments() {
            return this.qtype.getTypeArguments();
        }

        @Override
        public Type getEnclosingType() {
            return this.qtype.getEnclosingType();
        }

        @Override
        public List<Type> mo573getParameterTypes() {
            return this.qtype.mo573getParameterTypes();
        }

        @Override
        public Type mo574getReturnType() {
            return this.qtype.mo574getReturnType();
        }

        @Override
        public List<Type> mo575getThrownTypes() {
            return this.qtype.mo575getThrownTypes();
        }

        @Override
        public List<Type> allparams() {
            return this.qtype.allparams();
        }

        @Override
        public Type mo576getUpperBound() {
            return this.qtype.mo576getUpperBound();
        }

        @Override
        public boolean isErroneous() {
            return this.qtype.isErroneous();
        }
    }

    public static class ForAll extends DelegatedType implements ExecutableType {
        public List<Type> tvars;

        public enum ConstraintKind {
            EXTENDS,
            SUPER,
            EQUAL
        }

        @Override
        public java.util.List mo573getParameterTypes() {
            return super.mo573getParameterTypes();
        }

        @Override
        public TypeMirror mo574getReturnType() {
            return super.mo574getReturnType();
        }

        @Override
        public java.util.List mo575getThrownTypes() {
            return super.mo575getThrownTypes();
        }

        public ForAll(List<Type> tvars, Type qtype) {
            super(16, qtype);
            this.tvars = tvars;
        }

        @Override
        public <R, S> R accept(Visitor<R, S> v, S s) {
            return v.visitForAll(this, s);
        }

        @Override
        public String toString() {
            return "<" + this.tvars + ">" + this.qtype;
        }

        @Override
        public List<Type> getTypeArguments() {
            return this.tvars;
        }

        @Override
        public boolean isErroneous() {
            return this.qtype.isErroneous();
        }

        public Type inst(List<Type> actuals, Types types) {
            return types.subst(this.qtype, this.tvars, actuals);
        }

        public List<Type> getConstraints(TypeVar tv, ConstraintKind ck) {
            return List.m507nil();
        }

        @Override
        public Type mo453map(Mapping f) {
            return f.apply(this.qtype);
        }

        @Override
        public boolean contains(Type elem) {
            return this.qtype.contains(elem);
        }

        @Override
        public MethodType asMethodType() {
            return this.qtype.asMethodType();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public void complete() {
            for (List list = this.tvars; list.nonEmpty(); list = list.tail) {
                ((TypeVar) list.head).bound.complete();
            }
            this.qtype.complete();
        }

        @Override
        public List<TypeVar> getTypeVariables() {
            return List.convert(TypeVar.class, getTypeArguments());
        }

        @Override
        public TypeKind getKind() {
            return TypeKind.EXECUTABLE;
        }

        @Override
        public <R, P> R accept(TypeVisitor<R, P> v, P p) {
            return v.visitExecutable(this, p);
        }
    }

    public static class UndetVar extends DelegatedType {
        public List<Type> hibounds;
        public Type inst;
        public List<Type> lobounds;

        @Override
        public <R, S> R accept(Visitor<R, S> v, S s) {
            return v.visitUndetVar(this, s);
        }

        public UndetVar(Type origin) {
            super(21, origin);
            this.lobounds = List.m507nil();
            this.hibounds = List.m507nil();
            this.inst = null;
        }

        @Override
        public String toString() {
            Type type = this.inst;
            if (type != null) {
                return type.toString();
            }
            return this.qtype + "?";
        }

        @Override
        public Type baseType() {
            Type type = this.inst;
            return type != null ? type.baseType() : this;
        }
    }

    public static class JCNoType extends Type implements NoType {
        public JCNoType(int tag) {
            super(tag, null);
        }

        @Override
        public TypeKind getKind() {
            int i = this.f344tag;
            if (i == 9) {
                return TypeKind.VOID;
            }
            if (i == 18) {
                return TypeKind.NONE;
            }
            throw new AssertionError("Unexpected tag: " + this.f344tag);
        }

        @Override
        public <R, P> R accept(TypeVisitor<R, P> v, P p) {
            return v.visitNoType(this, p);
        }
    }

    static class BottomType extends Type implements NullType {
        public BottomType() {
            super(17, null);
        }

        @Override
        public TypeKind getKind() {
            return TypeKind.NULL;
        }

        @Override
        public <R, P> R accept(TypeVisitor<R, P> v, P p) {
            return v.visitNull(this, p);
        }

        @Override
        public Type constType(Object value) {
            return this;
        }

        @Override
        public String stringValue() {
            return "null";
        }
    }

    public static class ErrorType extends ClassType implements javax.lang.model.type.ErrorType {
        private Type originalType;

        public ErrorType(Type originalType, Symbol.TypeSymbol tsym) {
            super(noType, List.m507nil(), null);
            this.originalType = null;
            this.f344tag = 19;
            this.tsym = tsym;
            this.originalType = originalType == null ? noType : originalType;
        }

        public ErrorType(Symbol.ClassSymbol c, Type originalType) {
            this(originalType, c);
            c.type = this;
            c.kind = 31;
            c.members_field = new Scope.ErrorScope(c);
        }

        public ErrorType(Name name, Symbol.TypeSymbol container, Type originalType) {
            this(new Symbol.ClassSymbol(1073741833L, name, null, container), originalType);
        }

        @Override
        public <R, S> R accept(Visitor<R, S> v, S s) {
            return v.visitErrorType(this, s);
        }

        @Override
        public Type constType(Object constValue) {
            return this;
        }

        @Override
        public Type getEnclosingType() {
            return this;
        }

        @Override
        public Type mo574getReturnType() {
            return this;
        }

        public Type asSub(Symbol sym) {
            return this;
        }

        @Override
        public Type mo453map(Mapping f) {
            return this;
        }

        public boolean isGenType(Type t) {
            return true;
        }

        @Override
        public boolean isErroneous() {
            return true;
        }

        @Override
        public boolean isCompound() {
            return false;
        }

        @Override
        public boolean isInterface() {
            return false;
        }

        @Override
        public List<Type> allparams() {
            return List.m507nil();
        }

        @Override
        public List<Type> getTypeArguments() {
            return List.m507nil();
        }

        @Override
        public TypeKind getKind() {
            return TypeKind.ERROR;
        }

        public Type getOriginalType() {
            return this.originalType;
        }

        @Override
        public <R, P> R accept(TypeVisitor<R, P> v, P p) {
            return v.visitError(this, p);
        }
    }
}
