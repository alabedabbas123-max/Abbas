package sun.reflect.generics.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import sun.reflect.generics.scope.Scope;
import sun.reflect.generics.tree.FieldTypeSignature;

public class CoreReflectionFactory implements GenericsFactory {
    static final boolean $assertionsDisabled = false;
    private GenericDeclaration decl;
    private Scope scope;

    private CoreReflectionFactory(GenericDeclaration d, Scope s) {
        this.decl = d;
        this.scope = s;
    }

    private GenericDeclaration getDecl() {
        return this.decl;
    }

    private Scope getScope() {
        return this.scope;
    }

    private ClassLoader getDeclsLoader() {
        GenericDeclaration genericDeclaration = this.decl;
        if (genericDeclaration instanceof Class) {
            return ((Class) genericDeclaration).getClassLoader();
        }
        if (genericDeclaration instanceof Method) {
            return ((Method) genericDeclaration).getDeclaringClass().getClassLoader();
        }
        return ((Constructor) genericDeclaration).getDeclaringClass().getClassLoader();
    }

    public static CoreReflectionFactory make(GenericDeclaration d, Scope s) {
        return new CoreReflectionFactory(d, s);
    }

    @Override
    public TypeVariable<?> makeTypeVariable(String name, FieldTypeSignature[] bounds) {
        return TypeVariableImpl.make(getDecl(), name, bounds, this);
    }

    @Override
    public WildcardType makeWildcard(FieldTypeSignature[] ubs, FieldTypeSignature[] lbs) {
        return WildcardTypeImpl.make(ubs, lbs, this);
    }

    @Override
    public ParameterizedType makeParameterizedType(Type declaration, Type[] typeArgs, Type owner) {
        return ParameterizedTypeImpl.make((Class) declaration, typeArgs, owner);
    }

    @Override
    public TypeVariable<?> findTypeVariable(String name) {
        return getScope().lookup(name);
    }

    @Override
    public Type makeNamedType(String name) {
        try {
            return Class.forName(name, false, getDeclsLoader());
        } catch (ClassNotFoundException c) {
            throw new TypeNotPresentException(name, c);
        }
    }

    @Override
    public Type makeArrayType(Type componentType) {
        return GenericArrayTypeImpl.make(componentType);
    }

    @Override
    public Type makeByte() {
        return Byte.TYPE;
    }

    @Override
    public Type makeBool() {
        return Boolean.TYPE;
    }

    @Override
    public Type makeShort() {
        return Short.TYPE;
    }

    @Override
    public Type makeChar() {
        return Character.TYPE;
    }

    @Override
    public Type makeInt() {
        return Integer.TYPE;
    }

    @Override
    public Type makeLong() {
        return Long.TYPE;
    }

    @Override
    public Type makeFloat() {
        return Float.TYPE;
    }

    @Override
    public Type makeDouble() {
        return Double.TYPE;
    }

    @Override
    public Type makeVoid() {
        return Void.TYPE;
    }
}
