package sun.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class UnsafeFieldAccessorFactory {
    UnsafeFieldAccessorFactory() {
    }

    static FieldAccessor newFieldAccessor(Field field, boolean override) {
        Class<?> type = field.getType();
        boolean isStatic = Modifier.isStatic(field.getModifiers());
        boolean isFinal = Modifier.isFinal(field.getModifiers());
        boolean isVolatile = Modifier.isVolatile(field.getModifiers());
        boolean isReadOnly = false;
        boolean isQualified = isFinal || isVolatile;
        if (isFinal && (isStatic || !override)) {
            isReadOnly = true;
        }
        if (isStatic) {
            UnsafeFieldAccessorImpl.unsafe.ensureClassInitialized(field.getDeclaringClass());
            if (!isQualified) {
                if (type == Boolean.TYPE) {
                    return new UnsafeStaticBooleanFieldAccessorImpl(field);
                }
                if (type == Byte.TYPE) {
                    return new UnsafeStaticByteFieldAccessorImpl(field);
                }
                if (type == Short.TYPE) {
                    return new UnsafeStaticShortFieldAccessorImpl(field);
                }
                if (type == Character.TYPE) {
                    return new UnsafeStaticCharacterFieldAccessorImpl(field);
                }
                if (type == Integer.TYPE) {
                    return new UnsafeStaticIntegerFieldAccessorImpl(field);
                }
                if (type == Long.TYPE) {
                    return new UnsafeStaticLongFieldAccessorImpl(field);
                }
                if (type == Float.TYPE) {
                    return new UnsafeStaticFloatFieldAccessorImpl(field);
                }
                if (type == Double.TYPE) {
                    return new UnsafeStaticDoubleFieldAccessorImpl(field);
                }
                return new UnsafeStaticObjectFieldAccessorImpl(field);
            }
            if (type == Boolean.TYPE) {
                return new UnsafeQualifiedStaticBooleanFieldAccessorImpl(field, isReadOnly);
            }
            if (type == Byte.TYPE) {
                return new UnsafeQualifiedStaticByteFieldAccessorImpl(field, isReadOnly);
            }
            if (type == Short.TYPE) {
                return new UnsafeQualifiedStaticShortFieldAccessorImpl(field, isReadOnly);
            }
            if (type == Character.TYPE) {
                return new UnsafeQualifiedStaticCharacterFieldAccessorImpl(field, isReadOnly);
            }
            if (type == Integer.TYPE) {
                return new UnsafeQualifiedStaticIntegerFieldAccessorImpl(field, isReadOnly);
            }
            if (type == Long.TYPE) {
                return new UnsafeQualifiedStaticLongFieldAccessorImpl(field, isReadOnly);
            }
            if (type == Float.TYPE) {
                return new UnsafeQualifiedStaticFloatFieldAccessorImpl(field, isReadOnly);
            }
            if (type == Double.TYPE) {
                return new UnsafeQualifiedStaticDoubleFieldAccessorImpl(field, isReadOnly);
            }
            return new UnsafeQualifiedStaticObjectFieldAccessorImpl(field, isReadOnly);
        }
        if (!isQualified) {
            if (type == Boolean.TYPE) {
                return new UnsafeBooleanFieldAccessorImpl(field);
            }
            if (type == Byte.TYPE) {
                return new UnsafeByteFieldAccessorImpl(field);
            }
            if (type == Short.TYPE) {
                return new UnsafeShortFieldAccessorImpl(field);
            }
            if (type == Character.TYPE) {
                return new UnsafeCharacterFieldAccessorImpl(field);
            }
            if (type == Integer.TYPE) {
                return new UnsafeIntegerFieldAccessorImpl(field);
            }
            if (type == Long.TYPE) {
                return new UnsafeLongFieldAccessorImpl(field);
            }
            if (type == Float.TYPE) {
                return new UnsafeFloatFieldAccessorImpl(field);
            }
            if (type == Double.TYPE) {
                return new UnsafeDoubleFieldAccessorImpl(field);
            }
            return new UnsafeObjectFieldAccessorImpl(field);
        }
        if (type == Boolean.TYPE) {
            return new UnsafeQualifiedBooleanFieldAccessorImpl(field, isReadOnly);
        }
        if (type == Byte.TYPE) {
            return new UnsafeQualifiedByteFieldAccessorImpl(field, isReadOnly);
        }
        if (type == Short.TYPE) {
            return new UnsafeQualifiedShortFieldAccessorImpl(field, isReadOnly);
        }
        if (type == Character.TYPE) {
            return new UnsafeQualifiedCharacterFieldAccessorImpl(field, isReadOnly);
        }
        if (type == Integer.TYPE) {
            return new UnsafeQualifiedIntegerFieldAccessorImpl(field, isReadOnly);
        }
        if (type == Long.TYPE) {
            return new UnsafeQualifiedLongFieldAccessorImpl(field, isReadOnly);
        }
        if (type == Float.TYPE) {
            return new UnsafeQualifiedFloatFieldAccessorImpl(field, isReadOnly);
        }
        if (type == Double.TYPE) {
            return new UnsafeQualifiedDoubleFieldAccessorImpl(field, isReadOnly);
        }
        return new UnsafeQualifiedObjectFieldAccessorImpl(field, isReadOnly);
    }
}
