package sun.reflect.generics.reflectiveObjects;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class ParameterizedTypeImpl implements ParameterizedType {
    private Type[] actualTypeArguments;
    private Type ownerType;
    private Class<?> rawType;

    private ParameterizedTypeImpl(Class<?> rawType, Type[] actualTypeArguments, Type ownerType) {
        this.actualTypeArguments = actualTypeArguments;
        this.rawType = rawType;
        if (ownerType != null) {
            this.ownerType = ownerType;
        } else {
            this.ownerType = rawType.getDeclaringClass();
        }
        validateConstructorArguments();
    }

    private void validateConstructorArguments() {
        if (this.rawType.getTypeParameters().length != this.actualTypeArguments.length) {
            throw new MalformedParameterizedTypeException();
        }
        for (int i = 0; i < this.actualTypeArguments.length; i++) {
        }
    }

    public static ParameterizedTypeImpl make(Class<?> rawType, Type[] actualTypeArguments, Type ownerType) {
        return new ParameterizedTypeImpl(rawType, actualTypeArguments, ownerType);
    }

    @Override
    public Type[] getActualTypeArguments() {
        return (Type[]) this.actualTypeArguments.clone();
    }

    @Override
    public Class<?> getRawType() {
        return this.rawType;
    }

    @Override
    public Type getOwnerType() {
        return this.ownerType;
    }

    public boolean equals(Object o) {
        if (!(o instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType that = (ParameterizedType) o;
        if (this == that) {
            return true;
        }
        Type thatOwner = that.getOwnerType();
        Type thatRawType = that.getRawType();
        Type type = this.ownerType;
        if (type == null) {
            if (thatOwner != null) {
                return false;
            }
        } else if (!type.equals(thatOwner)) {
            return false;
        }
        Class<?> cls = this.rawType;
        if (cls == null) {
            if (thatRawType != null) {
                return false;
            }
        } else if (!cls.equals(thatRawType)) {
            return false;
        }
        return Arrays.equals(this.actualTypeArguments, that.getActualTypeArguments());
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.actualTypeArguments);
        Type type = this.ownerType;
        int iHashCode2 = iHashCode ^ (type == null ? 0 : type.hashCode());
        Class<?> cls = this.rawType;
        return iHashCode2 ^ (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Type type = this.ownerType;
        if (type != null) {
            if (type instanceof Class) {
                sb.append(((Class) type).getName());
            } else {
                sb.append(type.toString());
            }
            sb.append(".");
            if (this.ownerType instanceof ParameterizedTypeImpl) {
                sb.append(this.rawType.getName().replace(((ParameterizedTypeImpl) this.ownerType).rawType.getName() + "$", ""));
            } else {
                sb.append(this.rawType.getName());
            }
        } else {
            sb.append(this.rawType.getName());
        }
        Type[] typeArr = this.actualTypeArguments;
        if (typeArr != null && typeArr.length > 0) {
            sb.append("<");
            boolean first = true;
            for (Type t : this.actualTypeArguments) {
                if (!first) {
                    sb.append(", ");
                }
                if (t instanceof Class) {
                    sb.append(((Class) t).getName());
                } else {
                    sb.append(t.toString());
                }
                first = false;
            }
            sb.append(">");
        }
        return sb.toString();
    }
}
