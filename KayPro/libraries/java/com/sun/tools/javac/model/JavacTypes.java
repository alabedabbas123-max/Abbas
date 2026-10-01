package com.sun.tools.javac.model;

import com.sun.tools.javac.code.BoundKind;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.ListBuffer;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.NullType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.ReferenceType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.Types;

public class JavacTypes implements Types {
    private static final Set<TypeKind> EXEC_OR_PKG = EnumSet.of(TypeKind.EXECUTABLE, TypeKind.PACKAGE);
    private Symtab syms;
    private com.sun.tools.javac.code.Types types;

    public static JavacTypes instance(Context context) {
        JavacTypes instance = (JavacTypes) context.m502get(JavacTypes.class);
        if (instance == null) {
            return new JavacTypes(context);
        }
        return instance;
    }

    protected JavacTypes(Context context) {
        setContext(context);
    }

    public void setContext(Context context) {
        context.m506put((Class<JavacTypes>) JavacTypes.class, this);
        this.syms = Symtab.instance(context);
        this.types = com.sun.tools.javac.code.Types.instance(context);
    }

    @Override
    public Element asElement(TypeMirror t) {
        int i = C07081.$SwitchMap$javax$lang$model$type$TypeKind[t.getKind().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            Type type = (Type) cast(Type.class, t);
            return type.asElement();
        }
        return null;
    }

    @Override
    public boolean isSameType(TypeMirror t1, TypeMirror t2) {
        return this.types.isSameType((Type) t1, (Type) t2);
    }

    @Override
    public boolean isSubtype(TypeMirror t1, TypeMirror t2) {
        validateTypeNotIn(t1, EXEC_OR_PKG);
        validateTypeNotIn(t2, EXEC_OR_PKG);
        return this.types.isSubtype((Type) t1, (Type) t2);
    }

    @Override
    public boolean isAssignable(TypeMirror t1, TypeMirror t2) {
        validateTypeNotIn(t1, EXEC_OR_PKG);
        validateTypeNotIn(t2, EXEC_OR_PKG);
        return this.types.isAssignable((Type) t1, (Type) t2);
    }

    @Override
    public boolean contains(TypeMirror t1, TypeMirror t2) {
        validateTypeNotIn(t1, EXEC_OR_PKG);
        validateTypeNotIn(t2, EXEC_OR_PKG);
        return this.types.containsType((Type) t1, (Type) t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public boolean isSubsignature(ExecutableType executableType, ExecutableType executableType2) {
        return this.types.isSubSignature((Type) executableType, (Type) executableType2);
    }

    @Override
    public List<Type> directSupertypes(TypeMirror t) {
        validateTypeNotIn(t, EXEC_OR_PKG);
        Type type = (Type) t;
        Type sup = this.types.supertype(type);
        if (sup == Type.noType || sup == type || sup == null) {
            return this.types.interfaces(type);
        }
        return this.types.interfaces(type).prepend(sup);
    }

    @Override
    public TypeMirror erasure(TypeMirror t) {
        if (t.getKind() == TypeKind.PACKAGE) {
            throw new IllegalArgumentException(t.toString());
        }
        return this.types.erasure((Type) t);
    }

    @Override
    public TypeElement boxedClass(PrimitiveType p) {
        return this.types.boxedClass((Type) p);
    }

    @Override
    public PrimitiveType unboxedType(TypeMirror t) {
        if (t.getKind() != TypeKind.DECLARED) {
            throw new IllegalArgumentException(t.toString());
        }
        Type unboxed = this.types.unboxedType((Type) t);
        if (!unboxed.isPrimitive()) {
            throw new IllegalArgumentException(t.toString());
        }
        return unboxed;
    }

    @Override
    public TypeMirror capture(TypeMirror t) {
        validateTypeNotIn(t, EXEC_OR_PKG);
        return this.types.capture((Type) t);
    }

    @Override
    public PrimitiveType getPrimitiveType(TypeKind kind) {
        switch (kind) {
            case BOOLEAN:
                return this.syms.booleanType;
            case BYTE:
                return this.syms.byteType;
            case SHORT:
                return this.syms.shortType;
            case INT:
                return this.syms.intType;
            case LONG:
                return this.syms.longType;
            case CHAR:
                return this.syms.charType;
            case FLOAT:
                return this.syms.floatType;
            case DOUBLE:
                return this.syms.doubleType;
            default:
                throw new IllegalArgumentException("Not a primitive type: " + kind);
        }
    }

    @Override
    public NullType getNullType() {
        return (NullType) this.syms.botType;
    }

    @Override
    public NoType getNoType(TypeKind kind) {
        int i = C07081.$SwitchMap$javax$lang$model$type$TypeKind[kind.ordinal()];
        if (i == 12) {
            return this.syms.voidType;
        }
        if (i == 13) {
            return Type.noType;
        }
        throw new IllegalArgumentException(kind.toString());
    }

    @Override
    public ArrayType getArrayType(TypeMirror componentType) {
        switch (componentType.getKind()) {
            case VOID:
            case EXECUTABLE:
            case WILDCARD:
            case PACKAGE:
                throw new IllegalArgumentException(componentType.toString());
            case NONE:
            default:
                return new Type.ArrayType((Type) componentType, this.syms.arrayClass);
        }
    }

    @Override
    public WildcardType getWildcardType(TypeMirror extendsBound, TypeMirror superBound) {
        BoundKind bkind;
        Type bound;
        if (extendsBound == null && superBound == null) {
            bkind = BoundKind.UNBOUND;
            bound = this.syms.objectType;
        } else if (superBound == null) {
            bkind = BoundKind.EXTENDS;
            bound = (Type) extendsBound;
        } else if (extendsBound == null) {
            bkind = BoundKind.SUPER;
            bound = (Type) superBound;
        } else {
            throw new IllegalArgumentException("Extends and super bounds cannot both be provided");
        }
        int i = C07081.$SwitchMap$javax$lang$model$type$TypeKind[bound.getKind().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 17) {
            return new Type.WildcardType(bound, bkind, this.syms.boundClass);
        }
        throw new IllegalArgumentException(bound.toString());
    }

    @Override
    public DeclaredType getDeclaredType(TypeElement typeElem, TypeMirror... typeArgs) {
        Symbol.ClassSymbol sym = (Symbol.ClassSymbol) typeElem;
        if (typeArgs.length == 0) {
            return (DeclaredType) sym.erasure(this.types);
        }
        if (sym.type.getEnclosingType().isParameterized()) {
            throw new IllegalArgumentException(sym.toString());
        }
        return getDeclaredType0(sym.type.getEnclosingType(), sym, typeArgs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public DeclaredType getDeclaredType(DeclaredType declaredType, TypeElement typeElem, TypeMirror... typeArgs) {
        if (declaredType == 0) {
            return getDeclaredType(typeElem, typeArgs);
        }
        Symbol.ClassSymbol sym = (Symbol.ClassSymbol) typeElem;
        Type outer = (Type) declaredType;
        if (outer.tsym != sym.owner.enclClass()) {
            throw new IllegalArgumentException(declaredType.toString());
        }
        if (!outer.isParameterized()) {
            return getDeclaredType(typeElem, typeArgs);
        }
        return getDeclaredType0(outer, sym, typeArgs);
    }

    private DeclaredType getDeclaredType0(Type outer, Symbol.ClassSymbol sym, TypeMirror... typeArgs) {
        if (typeArgs.length != sym.type.getTypeArguments().length()) {
            throw new IllegalArgumentException("Incorrect number of type arguments");
        }
        ListBuffer<Type> targs = new ListBuffer<>();
        for (TypeMirror t : typeArgs) {
            if (!(t instanceof ReferenceType) && !(t instanceof WildcardType)) {
                throw new IllegalArgumentException(t.toString());
            }
            targs.append((Type) t);
        }
        return new Type.ClassType(outer, targs.toList(), sym);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public TypeMirror asMemberOf(DeclaredType declaredType, Element element) {
        Type site = (Type) declaredType;
        Symbol sym = (Symbol) element;
        if (this.types.asSuper(site, sym.getEnclosingElement()) == null) {
            throw new IllegalArgumentException(sym + "@" + site);
        }
        return this.types.memberType(site, sym);
    }

    private void validateTypeNotIn(TypeMirror t, Set<TypeKind> invalidKinds) {
        if (invalidKinds.contains(t.getKind())) {
            throw new IllegalArgumentException(t.toString());
        }
    }

    private static <T> T cast(Class<T> clazz, Object o) {
        if (!clazz.isInstance(o)) {
            throw new IllegalArgumentException(o.toString());
        }
        return clazz.cast(o);
    }
}
