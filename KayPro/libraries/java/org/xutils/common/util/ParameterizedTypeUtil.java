package org.xutils.common.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class ParameterizedTypeUtil {
    private ParameterizedTypeUtil() {
    }

    public static Type getParameterizedType(Type type, Class<?> cls, int i) {
        TypeVariable<Class<?>>[] typeParameters;
        Type[] typeArr;
        Class<?> cls2;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class<?> cls3 = (Class) parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            typeParameters = cls3.getTypeParameters();
            typeArr = actualTypeArguments;
            cls2 = cls3;
        } else {
            typeParameters = null;
            typeArr = null;
            cls2 = (Class) type;
        }
        if (cls == cls2) {
            if (typeArr != null) {
                return typeArr[i];
            }
            return Object.class;
        }
        Type[] genericInterfaces = cls2.getGenericInterfaces();
        if (genericInterfaces != null) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= genericInterfaces.length) {
                    break;
                }
                Type type2 = genericInterfaces[i3];
                if ((type2 instanceof ParameterizedType) && cls.isAssignableFrom((Class) ((ParameterizedType) type2).getRawType())) {
                    try {
                        return getTrueType(getParameterizedType(type2, cls, i), typeParameters, typeArr);
                    } catch (Throwable th) {
                        LogUtil.m9052w(th.getMessage(), th);
                    }
                }
                i2 = i3 + 1;
            }
        }
        Class<? super Object> superclass = cls2.getSuperclass();
        if (superclass != null && cls.isAssignableFrom(superclass)) {
            return getTrueType(getParameterizedType(cls2.getGenericSuperclass(), cls, i), typeParameters, typeArr);
        }
        throw new IllegalArgumentException("FindGenericType:" + type + ", declaredClass: " + cls + ", index: " + i);
    }

    private static Type getTrueType(Type type, TypeVariable<?>[] typeVariableArr, Type[] typeArr) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            String name = typeVariable.getName();
            if (typeArr != null) {
                for (int i = 0; i < typeVariableArr.length; i++) {
                    if (name.equals(typeVariableArr[i].getName())) {
                        return typeArr[i];
                    }
                }
                return typeVariable;
            }
            return typeVariable;
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof Class) {
                return Array.newInstance((Class<?>) genericComponentType, 0).getClass();
            }
            return type;
        }
        return type;
    }
}
