package com.sun.tools.javac.code;

import com.sun.tools.javac.comp.Attr;
import com.sun.tools.javac.comp.AttrContext;
import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.model.JavacElements;
import com.sun.tools.javac.jvm.Code;
import com.sun.tools.javac.jvm.Pool;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Constants;
import com.sun.tools.javac.util.Filter;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Warner;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ElementVisitor;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
import javax.tools.JavaFileObject;

public abstract class Symbol implements Element {
    public long flags_field;
    public int kind;
    public Name name;
    public Symbol owner;
    public Type type;
    public Completer completer = null;
    public Type erasure_field = null;
    public List<Attribute.Compound> attributes_field = List.m507nil();

    public interface Completer {
        void complete(Symbol symbol) throws CompletionFailure;
    }

    public interface Visitor<R, P> {
        R visitClassSymbol(ClassSymbol classSymbol, P p);

        R visitMethodSymbol(MethodSymbol methodSymbol, P p);

        R visitOperatorSymbol(OperatorSymbol operatorSymbol, P p);

        R visitPackageSymbol(PackageSymbol packageSymbol, P p);

        R visitSymbol(Symbol symbol, P p);

        R visitTypeSymbol(TypeSymbol typeSymbol, P p);

        R visitVarSymbol(VarSymbol varSymbol, P p);
    }

    public long flags() {
        return this.flags_field;
    }

    @Override
    public List<Attribute.Compound> getAnnotationMirrors() {
        return (List) Assert.checkNonNull(this.attributes_field);
    }

    public Attribute.Compound attribute(Symbol anno) {
        for (Attribute.Compound a : getAnnotationMirrors()) {
            if (a.type.tsym == anno) {
                return a;
            }
        }
        return null;
    }

    public Symbol(int kind, long flags, Name name, Type type, Symbol owner) {
        this.kind = kind;
        this.flags_field = flags;
        this.type = type;
        this.owner = owner;
        this.name = name;
    }

    public Symbol clone(Symbol newOwner) {
        throw new AssertionError();
    }

    public <R, P> R accept(Visitor<R, P> v, P p) {
        return v.visitSymbol(this, p);
    }

    public String toString() {
        return this.name.toString();
    }

    public Symbol location() {
        int i;
        Name name = this.owner.name;
        if (name == null) {
            return null;
        }
        if (name.isEmpty() && (this.owner.flags() & 1048576) == 0 && (i = this.owner.kind) != 1 && i != 2) {
            return null;
        }
        return this.owner;
    }

    public Symbol location(Type site, Types types) {
        Type ownertype;
        Name name = this.owner.name;
        if (name == null || name.isEmpty()) {
            return location();
        }
        return (this.owner.type.f344tag != 10 || (ownertype = types.asOuterSuper(site, this.owner)) == null) ? this.owner : ownertype.tsym;
    }

    public Type erasure(Types types) {
        if (this.erasure_field == null) {
            this.erasure_field = types.erasure(this.type);
        }
        return this.erasure_field;
    }

    public Type externalType(Types types) {
        Type t = erasure(types);
        Name name = this.name;
        if (name == name.table.names.init && this.owner.hasOuterInstance()) {
            Type outerThisType = types.erasure(this.owner.type.getEnclosingType());
            return new Type.MethodType(t.mo573getParameterTypes().prepend(outerThisType), t.mo574getReturnType(), t.mo575getThrownTypes(), t.tsym);
        }
        return t;
    }

    public boolean isStatic() {
        return ((flags() & 8) == 0 && ((this.owner.flags() & 512) == 0 || this.kind == 16)) ? false : true;
    }

    public boolean isInterface() {
        return (flags() & 512) != 0;
    }

    public boolean isPolymorphicSignatureGeneric() {
        return (flags() & 1236950581248L) == Flags.POLYMORPHIC_SIGNATURE;
    }

    public boolean isPolymorphicSignatureInstance() {
        return (flags() & 1236950581248L) == 1236950581248L;
    }

    public boolean isLocal() {
        Symbol symbol = this.owner;
        int i = symbol.kind;
        return (i & 20) != 0 || (i == 2 && symbol.isLocal());
    }

    public boolean isAnonymous() {
        return this.name.isEmpty();
    }

    public boolean isConstructor() {
        Name name = this.name;
        return name == name.table.names.init;
    }

    public Name getQualifiedName() {
        return this.name;
    }

    public Name flatName() {
        return getQualifiedName();
    }

    public Scope members() {
        return null;
    }

    public boolean isInner() {
        return this.type.getEnclosingType().f344tag == 10;
    }

    public boolean hasOuterInstance() {
        return this.type.getEnclosingType().f344tag == 10 && (flags() & 4194816) == 0;
    }

    public ClassSymbol enclClass() {
        Symbol c = this;
        while (c != null && ((c.kind & 2) == 0 || c.type.f344tag != 10)) {
            c = c.owner;
        }
        return (ClassSymbol) c;
    }

    public ClassSymbol outermostClass() {
        Symbol prev = null;
        for (Symbol sym = this; sym.kind != 1; sym = sym.owner) {
            prev = sym;
        }
        return (ClassSymbol) prev;
    }

    public PackageSymbol packge() {
        Symbol sym = this;
        while (sym.kind != 1) {
            sym = sym.owner;
        }
        return (PackageSymbol) sym;
    }

    public boolean isSubClass(Symbol base, Types types) {
        throw new AssertionError("isSubClass " + this);
    }

    public boolean isMemberOf(TypeSymbol clazz, Types types) {
        Symbol symbol = this.owner;
        return symbol == clazz || (clazz.isSubClass(symbol, types) && isInheritedIn(clazz, types) && !hiddenIn((ClassSymbol) clazz, types));
    }

    public boolean isEnclosedBy(ClassSymbol clazz) {
        for (Symbol sym = this; sym.kind != 1; sym = sym.owner) {
            if (sym == clazz) {
                return true;
            }
        }
        return false;
    }

    private boolean hiddenIn(ClassSymbol clazz, Types types) {
        if (this.kind == 16 && (flags() & 8) == 0) {
            return false;
        }
        while (this.owner != clazz) {
            for (Scope.Entry e = clazz.members().lookup(this.name); e.scope != null; e = e.next()) {
                if (e.f338sym == this) {
                    return false;
                }
                int i = e.f338sym.kind;
                int i2 = this.kind;
                if (i == i2) {
                    if (i2 == 16) {
                        if ((e.f338sym.flags() & 8) != 0 && types.isSubSignature(e.f338sym.type, this.type)) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            }
            Type superType = types.supertype(clazz.type);
            if (superType.f344tag != 10) {
                return false;
            }
            clazz = (ClassSymbol) superType.tsym;
        }
        return false;
    }

    public boolean isInheritedIn(Symbol clazz, Types types) {
        int i = (int) (this.flags_field & 7);
        if (i != 0) {
            if (i != 2) {
                return i != 4 || (512 & clazz.flags()) == 0;
            }
            return this.owner == clazz;
        }
        PackageSymbol thisPackage = packge();
        Symbol sup = clazz;
        while (sup != null && sup != this.owner) {
            while (sup.type.f344tag == 14) {
                sup = sup.type.mo576getUpperBound().tsym;
            }
            if (sup.type.isErroneous()) {
                return true;
            }
            if ((sup.flags() & 16777216) == 0 && sup.packge() != thisPackage) {
                return false;
            }
            sup = types.supertype(sup.type).tsym;
        }
        return (512 & clazz.flags()) == 0;
    }

    public Symbol asMemberOf(Type site, Types types) {
        throw new AssertionError();
    }

    public boolean overrides(Symbol _other, TypeSymbol origin, Types types, boolean checkResult) {
        return false;
    }

    public void complete() throws CompletionFailure {
        if (this.completer != null) {
            Completer c = this.completer;
            this.completer = null;
            c.complete(this);
        }
    }

    public boolean exists() {
        return true;
    }

    @Override
    public Type asType() {
        return this.type;
    }

    @Override
    public Symbol getEnclosingElement() {
        return this.owner;
    }

    @Override
    public ElementKind getKind() {
        return ElementKind.OTHER;
    }

    @Override
    public Set<Modifier> getModifiers() {
        return Flags.asModifierSet(flags());
    }

    @Override
    public Name getSimpleName() {
        return this.name;
    }

    @Override
    @Deprecated
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) JavacElements.getAnnotation(this, cls);
    }

    @Override
    public java.util.List<Symbol> getEnclosedElements() {
        return List.m507nil();
    }

    public List<TypeSymbol> getTypeParameters() {
        ListBuffer<TypeSymbol> l = ListBuffer.m512lb();
        for (Type t : this.type.getTypeArguments()) {
            l.append(t.tsym);
        }
        return l.toList();
    }

    public static class DelegatedSymbol extends Symbol {
        protected Symbol other;

        @Override
        public TypeMirror asType() {
            return super.asType();
        }

        @Override
        public java.util.List getAnnotationMirrors() {
            return super.getAnnotationMirrors();
        }

        @Override
        public Element getEnclosingElement() {
            return super.getEnclosingElement();
        }

        @Override
        public javax.lang.model.element.Name getSimpleName() {
            return super.getSimpleName();
        }

        public DelegatedSymbol(Symbol other) {
            super(other.kind, other.flags_field, other.name, other.type, other.owner);
            this.other = other;
        }

        @Override
        public String toString() {
            return this.other.toString();
        }

        @Override
        public Symbol location() {
            return this.other.location();
        }

        @Override
        public Symbol location(Type site, Types types) {
            return this.other.location(site, types);
        }

        @Override
        public Type erasure(Types types) {
            return this.other.erasure(types);
        }

        @Override
        public Type externalType(Types types) {
            return this.other.externalType(types);
        }

        @Override
        public boolean isLocal() {
            return this.other.isLocal();
        }

        @Override
        public boolean isConstructor() {
            return this.other.isConstructor();
        }

        @Override
        public Name getQualifiedName() {
            return this.other.getQualifiedName();
        }

        @Override
        public Name flatName() {
            return this.other.flatName();
        }

        @Override
        public Scope members() {
            return this.other.members();
        }

        @Override
        public boolean isInner() {
            return this.other.isInner();
        }

        @Override
        public boolean hasOuterInstance() {
            return this.other.hasOuterInstance();
        }

        @Override
        public ClassSymbol enclClass() {
            return this.other.enclClass();
        }

        @Override
        public ClassSymbol outermostClass() {
            return this.other.outermostClass();
        }

        @Override
        public PackageSymbol packge() {
            return this.other.packge();
        }

        @Override
        public boolean isSubClass(Symbol base, Types types) {
            return this.other.isSubClass(base, types);
        }

        @Override
        public boolean isMemberOf(TypeSymbol clazz, Types types) {
            return this.other.isMemberOf(clazz, types);
        }

        @Override
        public boolean isEnclosedBy(ClassSymbol clazz) {
            return this.other.isEnclosedBy(clazz);
        }

        @Override
        public boolean isInheritedIn(Symbol clazz, Types types) {
            return this.other.isInheritedIn(clazz, types);
        }

        @Override
        public Symbol asMemberOf(Type site, Types types) {
            return this.other.asMemberOf(site, types);
        }

        @Override
        public void complete() throws CompletionFailure {
            this.other.complete();
        }

        @Override
        public <R, P> R accept(ElementVisitor<R, P> elementVisitor, P p) {
            return (R) this.other.accept(elementVisitor, p);
        }

        @Override
        public <R, P> R accept(Visitor<R, P> v, P p) {
            return v.visitSymbol(this.other, p);
        }
    }

    public static class TypeSymbol extends Symbol implements TypeParameterElement {
        @Override
        public TypeMirror asType() {
            return super.asType();
        }

        @Override
        public java.util.List getAnnotationMirrors() {
            return super.getAnnotationMirrors();
        }

        @Override
        public Element getEnclosingElement() {
            return super.getEnclosingElement();
        }

        @Override
        public javax.lang.model.element.Name getSimpleName() {
            return super.getSimpleName();
        }

        public TypeSymbol(long flags, Name name, Type type, Symbol owner) {
            super(2, flags, name, type, owner);
        }

        public static Name formFullName(Name name, Symbol owner) {
            Name prefix;
            if (owner == null) {
                return name;
            }
            if ((owner.kind != 31 && ((owner.kind & 20) != 0 || (owner.kind == 2 && owner.type.f344tag == 14))) || (prefix = owner.getQualifiedName()) == null || prefix == prefix.table.names.empty) {
                return name;
            }
            return prefix.append('.', name);
        }

        public static Name formFlatName(Name name, Symbol owner) {
            if (owner == null || (owner.kind & 20) != 0 || (owner.kind == 2 && owner.type.f344tag == 14)) {
                return name;
            }
            char sep = owner.kind == 2 ? '$' : '.';
            Name prefix = owner.flatName();
            if (prefix == null || prefix == prefix.table.names.empty) {
                return name;
            }
            return prefix.append(sep, name);
        }

        public final boolean precedes(TypeSymbol that, Types types) {
            if (this == that) {
                return false;
            }
            if (this.type.f344tag == that.type.f344tag) {
                if (this.type.f344tag == 10) {
                    return types.rank(that.type) < types.rank(this.type) || (types.rank(that.type) == types.rank(this.type) && that.getQualifiedName().compareTo(getQualifiedName()) < 0);
                }
                if (this.type.f344tag == 14) {
                    return types.isSubtype(this.type, that.type);
                }
            }
            return this.type.f344tag == 14;
        }

        @Override
        public ElementKind getKind() {
            return ElementKind.TYPE_PARAMETER;
        }

        @Override
        public java.util.List<Symbol> getEnclosedElements() {
            List<Symbol> list = List.m507nil();
            if (this.kind == 2 && this.type.f344tag == 14) {
                return list;
            }
            for (Scope.Entry e = members().elems; e != null; e = e.sibling) {
                if (e.f338sym != null && (e.f338sym.flags() & 4096) == 0 && e.f338sym.owner == this) {
                    list = list.prepend(e.f338sym);
                }
            }
            return list;
        }

        @Override
        public Symbol getGenericElement() {
            return this.owner;
        }

        @Override
        public <R, P> R accept(ElementVisitor<R, P> v, P p) {
            Assert.check(this.type.f344tag == 14);
            return v.visitTypeParameter(this, p);
        }

        @Override
        public <R, P> R accept(Visitor<R, P> v, P p) {
            return v.visitTypeSymbol(this, p);
        }

        @Override
        public List<Type> getBounds() {
            Type.TypeVar t = (Type.TypeVar) this.type;
            Type bound = t.mo576getUpperBound();
            if (!bound.isCompound()) {
                return List.m508of(bound);
            }
            Type.ClassType ct = (Type.ClassType) bound;
            if (!ct.tsym.erasure_field.isInterface()) {
                return ct.interfaces_field.prepend(ct.supertype_field);
            }
            return ct.interfaces_field;
        }
    }

    public static class PackageSymbol extends TypeSymbol implements PackageElement {
        public Name fullname;
        public Scope members_field;
        public ClassSymbol package_info;

        public PackageSymbol(Name name, Type type, Symbol owner) {
            super(0L, name, type, owner);
            this.kind = 1;
            this.members_field = null;
            this.fullname = formFullName(name, owner);
        }

        public PackageSymbol(Name name, Symbol owner) {
            this(name, null, owner);
            this.type = new Type.PackageType(this);
        }

        @Override
        public String toString() {
            return this.fullname.toString();
        }

        @Override
        public Name getQualifiedName() {
            return this.fullname;
        }

        @Override
        public boolean isUnnamed() {
            return this.name.isEmpty() && this.owner != null;
        }

        @Override
        public Scope members() {
            if (this.completer != null) {
                complete();
            }
            return this.members_field;
        }

        @Override
        public long flags() {
            if (this.completer != null) {
                complete();
            }
            return this.flags_field;
        }

        @Override
        public List<Attribute.Compound> getAnnotationMirrors() {
            if (this.completer != null) {
                complete();
            }
            ClassSymbol classSymbol = this.package_info;
            if (classSymbol != null && classSymbol.completer != null) {
                this.package_info.complete();
                if (this.attributes_field.isEmpty()) {
                    this.attributes_field = this.package_info.attributes_field;
                }
            }
            return (List) Assert.checkNonNull(this.attributes_field);
        }

        @Override
        public boolean exists() {
            return (this.flags_field & 8388608) != 0;
        }

        @Override
        public ElementKind getKind() {
            return ElementKind.PACKAGE;
        }

        @Override
        public Symbol getEnclosingElement() {
            return null;
        }

        @Override
        public <R, P> R accept(ElementVisitor<R, P> v, P p) {
            return v.visitPackage(this, p);
        }

        @Override
        public <R, P> R accept(Visitor<R, P> v, P p) {
            return v.visitPackageSymbol(this, p);
        }
    }

    public static class ClassSymbol extends TypeSymbol implements TypeElement {
        public JavaFileObject classfile;
        public Name flatname;
        public Name fullname;
        public Scope members_field;
        public Pool pool;
        public JavaFileObject sourcefile;
        public List<ClassSymbol> trans_local;

        @Override
        public java.util.List getTypeParameters() {
            return super.getTypeParameters();
        }

        public ClassSymbol(long flags, Name name, Type type, Symbol owner) {
            super(flags, name, type, owner);
            this.members_field = null;
            this.fullname = formFullName(name, owner);
            this.flatname = formFlatName(name, owner);
            this.sourcefile = null;
            this.classfile = null;
            this.pool = null;
        }

        public ClassSymbol(long flags, Name name, Symbol owner) {
            this(flags, name, new Type.ClassType(Type.noType, null, null), owner);
            this.type.tsym = this;
        }

        @Override
        public String toString() {
            return className();
        }

        @Override
        public long flags() {
            if (this.completer != null) {
                complete();
            }
            return this.flags_field;
        }

        @Override
        public Scope members() {
            if (this.completer != null) {
                complete();
            }
            return this.members_field;
        }

        @Override
        public List<Attribute.Compound> getAnnotationMirrors() {
            if (this.completer != null) {
                complete();
            }
            return (List) Assert.checkNonNull(this.attributes_field);
        }

        @Override
        public Type erasure(Types types) {
            if (this.erasure_field == null) {
                this.erasure_field = new Type.ClassType(types.erasure(this.type.getEnclosingType()), List.m507nil(), this);
            }
            return this.erasure_field;
        }

        public String className() {
            if (this.name.isEmpty()) {
                return Log.getLocalizedString("anonymous.class", this.flatname);
            }
            return this.fullname.toString();
        }

        @Override
        public Name getQualifiedName() {
            return this.fullname;
        }

        @Override
        public Name flatName() {
            return this.flatname;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public boolean isSubClass(Symbol base, Types types) {
            if (this == base) {
                return true;
            }
            if ((base.flags() & 512) != 0) {
                Type t = this.type;
                while (t.f344tag == 10) {
                    for (List listInterfaces = types.interfaces(t); listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
                        if (((Type) listInterfaces.head).tsym.isSubClass(base, types)) {
                            return true;
                        }
                    }
                    t = types.supertype(t);
                }
                return false;
            }
            Type t2 = this.type;
            while (t2.f344tag == 10) {
                if (t2.tsym == base) {
                    return true;
                }
                t2 = types.supertype(t2);
            }
            return false;
        }

        @Override
        public void complete() throws CompletionFailure {
            try {
                super.complete();
            } catch (CompletionFailure ex) {
                this.flags_field |= 9;
                this.type = new Type.ErrorType(this, Type.noType);
                throw ex;
            }
        }

        @Override
        public List<Type> getInterfaces() {
            complete();
            if (this.type instanceof Type.ClassType) {
                Type.ClassType t = (Type.ClassType) this.type;
                if (t.interfaces_field == null) {
                    t.interfaces_field = List.m507nil();
                }
                if (t.all_interfaces_field != null) {
                    return Type.getModelTypes(t.all_interfaces_field);
                }
                return t.interfaces_field;
            }
            return List.m507nil();
        }

        @Override
        public Type getSuperclass() {
            complete();
            if (this.type instanceof Type.ClassType) {
                Type.ClassType t = (Type.ClassType) this.type;
                if (t.supertype_field == null) {
                    t.supertype_field = Type.noType;
                }
                if (t.isInterface()) {
                    return Type.noType;
                }
                return t.supertype_field.getModelType();
            }
            return Type.noType;
        }

        @Override
        public ElementKind getKind() {
            long flags = flags();
            if ((8192 & flags) != 0) {
                return ElementKind.ANNOTATION_TYPE;
            }
            if ((512 & flags) != 0) {
                return ElementKind.INTERFACE;
            }
            if ((16384 & flags) != 0) {
                return ElementKind.ENUM;
            }
            return ElementKind.CLASS;
        }

        @Override
        public NestingKind getNestingKind() {
            complete();
            if (this.owner.kind == 1) {
                return NestingKind.TOP_LEVEL;
            }
            if (this.name.isEmpty()) {
                return NestingKind.ANONYMOUS;
            }
            if (this.owner.kind == 16) {
                return NestingKind.LOCAL;
            }
            return NestingKind.MEMBER;
        }

        @Override
        @Deprecated
        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return (A) JavacElements.getAnnotation(this, (Class) cls);
        }

        @Override
        public <R, P> R accept(ElementVisitor<R, P> v, P p) {
            return v.visitType(this, p);
        }

        @Override
        public <R, P> R accept(Visitor<R, P> v, P p) {
            return v.visitClassSymbol(this, p);
        }
    }

    public static class VarSymbol extends Symbol implements VariableElement {

        public int f341adr;
        private Object data;

        public int f342pos;

        @Override
        public TypeMirror asType() {
            return super.asType();
        }

        @Override
        public java.util.List getAnnotationMirrors() {
            return super.getAnnotationMirrors();
        }

        @Override
        public Element getEnclosingElement() {
            return super.getEnclosingElement();
        }

        @Override
        public javax.lang.model.element.Name getSimpleName() {
            return super.getSimpleName();
        }

        public VarSymbol(long flags, Name name, Type type, Symbol owner) {
            super(4, flags, name, type, owner);
            this.f342pos = -1;
            this.f341adr = -1;
        }

        @Override
        public VarSymbol clone(Symbol newOwner) {
            VarSymbol v = new VarSymbol(this.flags_field, this.name, this.type, newOwner);
            v.f342pos = this.f342pos;
            v.f341adr = this.f341adr;
            v.data = this.data;
            return v;
        }

        @Override
        public String toString() {
            return this.name.toString();
        }

        @Override
        public Symbol asMemberOf(Type site, Types types) {
            return new VarSymbol(this.flags_field, this.name, types.memberType(site, this), this.owner);
        }

        @Override
        public ElementKind getKind() {
            long flags = flags();
            if ((Flags.PARAMETER & flags) != 0) {
                if (isExceptionParameter()) {
                    return ElementKind.EXCEPTION_PARAMETER;
                }
                return ElementKind.PARAMETER;
            }
            if ((16384 & flags) != 0) {
                return ElementKind.ENUM_CONSTANT;
            }
            if (this.owner.kind == 2 || this.owner.kind == 31) {
                return ElementKind.FIELD;
            }
            if (isResourceVariable()) {
                return ElementKind.RESOURCE_VARIABLE;
            }
            return ElementKind.LOCAL_VARIABLE;
        }

        @Override
        public <R, P> R accept(ElementVisitor<R, P> v, P p) {
            return v.visitVariable(this, p);
        }

        @Override
        public Object getConstantValue() {
            return Constants.decode(getConstValue(), this.type);
        }

        public void setLazyConstValue(final Env<AttrContext> env, final Attr attr, final JCTree.JCExpression initializer) {
            setData(new Callable<Object>() {
                @Override
                public Object call() {
                    return attr.attribLazyConstantValue(env, initializer, VarSymbol.this.type);
                }
            });
        }

        public boolean isExceptionParameter() {
            return this.data == ElementKind.EXCEPTION_PARAMETER;
        }

        public boolean isResourceVariable() {
            return this.data == ElementKind.RESOURCE_VARIABLE;
        }

        public Object getConstValue() {
            if (this.data == ElementKind.EXCEPTION_PARAMETER || this.data == ElementKind.RESOURCE_VARIABLE) {
                return null;
            }
            Object obj = this.data;
            if (obj instanceof Callable) {
                Callable<?> eval = (Callable) obj;
                this.data = null;
                try {
                    this.data = eval.call();
                } catch (Exception ex) {
                    throw new AssertionError(ex);
                }
            }
            return this.data;
        }

        public void setData(Object data) {
            Assert.check(!(data instanceof Env), this);
            this.data = data;
        }

        @Override
        public <R, P> R accept(Visitor<R, P> v, P p) {
            return v.visitVarSymbol(this, p);
        }
    }

    public static class MethodSymbol extends Symbol implements ExecutableElement {
        private static final Filter<Symbol> implementation_filter = new Filter<Symbol>() {
            @Override
            public boolean accepts(Symbol s) {
                return s.kind == 16 && (s.flags() & 4096) == 0;
            }
        };
        public Code code;
        public Attribute defaultValue;
        public List<VarSymbol> params;
        public List<Name> savedParameterNames;

        @Override
        public TypeMirror asType() {
            return super.asType();
        }

        @Override
        public java.util.List getAnnotationMirrors() {
            return super.getAnnotationMirrors();
        }

        @Override
        public Element getEnclosingElement() {
            return super.getEnclosingElement();
        }

        @Override
        public javax.lang.model.element.Name getSimpleName() {
            return super.getSimpleName();
        }

        @Override
        public java.util.List getTypeParameters() {
            return super.getTypeParameters();
        }

        public MethodSymbol(long flags, Name name, Type type, Symbol owner) {
            super(16, flags, name, type, owner);
            this.code = null;
            this.params = null;
            this.defaultValue = null;
            if (owner.type.f344tag == 14) {
                Assert.error(owner + "." + ((Object) name));
            }
        }

        @Override
        public MethodSymbol clone(Symbol newOwner) {
            MethodSymbol m = new MethodSymbol(this.flags_field, this.name, this.type, newOwner);
            m.code = this.code;
            return m;
        }

        @Override
        public String toString() {
            String s;
            if ((flags() & 1048576) != 0) {
                return this.owner.name.toString();
            }
            if (this.name == this.name.table.names.init) {
                s = this.owner.name.toString();
            } else {
                s = this.name.toString();
            }
            if (this.type != null) {
                if (this.type.f344tag == 16) {
                    s = "<" + ((Type.ForAll) this.type).getTypeArguments() + ">" + s;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append("(");
                sb.append(this.type.argtypes((flags() & Flags.VARARGS) != 0));
                sb.append(")");
                String s2 = sb.toString();
                return s2;
            }
            return s;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Symbol implemented(TypeSymbol c, Types types) {
            Symbol impl = null;
            for (List listInterfaces = types.interfaces(c.type); impl == null && listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
                TypeSymbol i = ((Type) listInterfaces.head).tsym;
                impl = implementedIn(i, types);
                if (impl == null) {
                    impl = implemented(i, types);
                }
            }
            return impl;
        }

        public Symbol implementedIn(TypeSymbol c, Types types) {
            Symbol impl = null;
            for (Scope.Entry e = c.members().lookup(this.name); impl == null && e.scope != null; e = e.next()) {
                if (overrides(e.f338sym, (TypeSymbol) this.owner, types, true) && types.isSameType(this.type.mo574getReturnType(), types.memberType(this.owner.type, e.f338sym).mo574getReturnType())) {
                    impl = e.f338sym;
                }
            }
            return impl;
        }

        public boolean binaryOverrides(Symbol _other, TypeSymbol origin, Types types) {
            if (isConstructor() || _other.kind != 16) {
                return false;
            }
            if (this == _other) {
                return true;
            }
            MethodSymbol other = (MethodSymbol) _other;
            if (other.isOverridableIn((TypeSymbol) this.owner) && types.asSuper(this.owner.type, other.owner) != null && types.isSameType(erasure(types), other.erasure(types))) {
                return true;
            }
            return (flags() & 1024) == 0 && other.isOverridableIn(origin) && isMemberOf(origin, types) && types.isSameType(erasure(types), other.erasure(types));
        }

        public MethodSymbol binaryImplementation(ClassSymbol origin, Types types) {
            TypeSymbol c = origin;
            while (c != null) {
                for (Scope.Entry e = c.members().lookup(this.name); e.scope != null; e = e.next()) {
                    if (e.f338sym.kind == 16 && ((MethodSymbol) e.f338sym).binaryOverrides(this, origin, types)) {
                        return (MethodSymbol) e.f338sym;
                    }
                }
                c = types.supertype(c.type).tsym;
            }
            return null;
        }

        @Override
        public boolean overrides(Symbol _other, TypeSymbol origin, Types types, boolean checkResult) {
            if (isConstructor() || _other.kind != 16) {
                return false;
            }
            if (this == _other) {
                return true;
            }
            MethodSymbol other = (MethodSymbol) _other;
            if (other.isOverridableIn((TypeSymbol) this.owner) && types.asSuper(this.owner.type, other.owner) != null) {
                Type mt = types.memberType(this.owner.type, this);
                Type ot = types.memberType(this.owner.type, other);
                if (types.isSubSignature(mt, ot) && (!checkResult || types.returnTypeSubstitutable(mt, ot))) {
                    return true;
                }
            }
            if ((flags() & 1024) != 0 || (other.flags() & 1024) == 0 || !other.isOverridableIn(origin) || !isMemberOf(origin, types)) {
                return false;
            }
            Type mt2 = types.memberType(origin.type, this);
            Type ot2 = types.memberType(origin.type, other);
            if (types.isSubSignature(mt2, ot2)) {
                return !checkResult || types.resultSubtype(mt2, ot2, Warner.noWarnings);
            }
            return false;
        }

        private boolean isOverridableIn(TypeSymbol origin) {
            int i = (int) (this.flags_field & 7);
            if (i == 0) {
                return packge() == origin.packge() && (512 & origin.flags()) == 0;
            }
            if (i != 1) {
                return i == 4 && (512 & origin.flags()) == 0;
            }
            return true;
        }

        public MethodSymbol implementation(TypeSymbol origin, Types types, boolean checkResult) {
            return implementation(origin, types, checkResult, implementation_filter);
        }

        public MethodSymbol implementation(TypeSymbol origin, Types types, boolean checkResult, Filter<Symbol> implFilter) {
            MethodSymbol res = types.implementation(this, origin, checkResult, implFilter);
            if (res != null) {
                return res;
            }
            if (types.isDerivedRaw(origin.type) && !origin.isInterface()) {
                return implementation(types.supertype(origin.type).tsym, types, checkResult);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public List<VarSymbol> params() {
            Name paramName;
            this.owner.complete();
            if (this.params == null) {
                List<Name> paramNames = this.savedParameterNames;
                this.savedParameterNames = null;
                if (paramNames == null || paramNames.size() != this.type.mo573getParameterTypes().size()) {
                    paramNames = List.m507nil();
                }
                ListBuffer<VarSymbol> buf = new ListBuffer<>();
                List list = paramNames;
                int i = 0;
                for (Type t : this.type.mo573getParameterTypes()) {
                    if (list.isEmpty()) {
                        paramName = createArgName(i, paramNames);
                    } else {
                        paramName = (Name) list.head;
                        list = list.tail;
                        if (paramName.isEmpty()) {
                            paramName = createArgName(i, paramNames);
                        }
                    }
                    buf.append(new VarSymbol(Flags.PARAMETER, paramName, t, this));
                    i++;
                }
                this.params = buf.toList();
            }
            return this.params;
        }

        private Name createArgName(int index, List<Name> exclude) {
            String prefix = "arg";
            while (true) {
                Name argName = this.name.table.fromString(prefix + index);
                if (!exclude.contains(argName)) {
                    return argName;
                }
                prefix = prefix + "$";
            }
        }

        @Override
        public Symbol asMemberOf(Type site, Types types) {
            return new MethodSymbol(this.flags_field, this.name, types.memberType(site, this), this.owner);
        }

        @Override
        public ElementKind getKind() {
            if (this.name == this.name.table.names.init) {
                return ElementKind.CONSTRUCTOR;
            }
            if (this.name == this.name.table.names.clinit) {
                return ElementKind.STATIC_INIT;
            }
            if ((flags() & 1048576) != 0) {
                return isStatic() ? ElementKind.STATIC_INIT : ElementKind.INSTANCE_INIT;
            }
            return ElementKind.METHOD;
        }

        public boolean isStaticOrInstanceInit() {
            return getKind() == ElementKind.STATIC_INIT || getKind() == ElementKind.INSTANCE_INIT;
        }

        @Override
        public Attribute getDefaultValue() {
            return this.defaultValue;
        }

        @Override
        public List<VarSymbol> getParameters() {
            return params();
        }

        @Override
        public boolean isVarArgs() {
            return (flags() & Flags.VARARGS) != 0;
        }

        @Override
        public <R, P> R accept(ElementVisitor<R, P> v, P p) {
            return v.visitExecutable(this, p);
        }

        @Override
        public <R, P> R accept(Visitor<R, P> v, P p) {
            return v.visitMethodSymbol(this, p);
        }

        @Override
        public Type getReturnType() {
            return asType().mo574getReturnType();
        }

        @Override
        public List<Type> getThrownTypes() {
            return asType().mo575getThrownTypes();
        }
    }

    public static class OperatorSymbol extends MethodSymbol {
        public int opcode;

        public OperatorSymbol(Name name, Type type, int opcode, Symbol owner) {
            super(9L, name, type, owner);
            this.opcode = opcode;
        }

        @Override
        public <R, P> R accept(Visitor<R, P> v, P p) {
            return v.visitOperatorSymbol(this, p);
        }
    }

    public static class CompletionFailure extends RuntimeException {
        private static final long serialVersionUID = 0;
        public JCDiagnostic diag;

        @Deprecated
        public String errmsg;

        public Symbol f340sym;

        public CompletionFailure(Symbol sym, String errmsg) {
            this.f340sym = sym;
            this.errmsg = errmsg;
        }

        public CompletionFailure(Symbol sym, JCDiagnostic diag) {
            this.f340sym = sym;
            this.diag = diag;
        }

        public JCDiagnostic getDiagnostic() {
            return this.diag;
        }

        @Override
        public String getMessage() {
            JCDiagnostic jCDiagnostic = this.diag;
            if (jCDiagnostic != null) {
                return jCDiagnostic.getMessage(null);
            }
            return this.errmsg;
        }

        public Object getDetailValue() {
            JCDiagnostic jCDiagnostic = this.diag;
            return jCDiagnostic != null ? jCDiagnostic : this.errmsg;
        }

        @Override
        public CompletionFailure initCause(Throwable cause) {
            super.initCause(cause);
            return this;
        }
    }
}
