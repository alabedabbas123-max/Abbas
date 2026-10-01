package sun.reflect.generics.reflectiveObjects;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public class GenericArrayTypeImpl implements GenericArrayType {
    private Type genericComponentType;

    private GenericArrayTypeImpl(Type ct) {
        this.genericComponentType = ct;
    }

    public static GenericArrayTypeImpl make(Type ct) {
        return new GenericArrayTypeImpl(ct);
    }

    @Override
    public Type getGenericComponentType() {
        return this.genericComponentType;
    }

    public String toString() {
        Type componentType = getGenericComponentType();
        StringBuilder sb = new StringBuilder();
        if (componentType instanceof Class) {
            sb.append(((Class) componentType).getName());
        } else {
            sb.append(componentType.toString());
        }
        sb.append("[]");
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (!(o instanceof GenericArrayType)) {
            return false;
        }
        GenericArrayType that = (GenericArrayType) o;
        Type thatComponentType = that.getGenericComponentType();
        Type type = this.genericComponentType;
        if (type == null) {
            return thatComponentType == null;
        }
        return type.equals(thatComponentType);
    }

    public int hashCode() {
        Type type = this.genericComponentType;
        if (type == null) {
            return 0;
        }
        return type.hashCode();
    }
}
