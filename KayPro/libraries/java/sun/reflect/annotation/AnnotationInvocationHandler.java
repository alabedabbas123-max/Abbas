package sun.reflect.annotation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Map;

class AnnotationInvocationHandler implements InvocationHandler, Serializable {
    static final boolean $assertionsDisabled = false;
    private volatile transient Method[] memberMethods = null;
    private final Map<String, Object> memberValues;
    private final Class type;

    AnnotationInvocationHandler(Class type, Map<String, Object> memberValues) {
        this.type = type;
        this.memberValues = memberValues;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        String member = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (member.equals("equals") && parameterTypes.length == 1 && parameterTypes[0] == Object.class) {
            return equalsImpl(args[0]);
        }
        if (member.equals("toString")) {
            return toStringImpl();
        }
        if (member.equals("hashCode")) {
            return Integer.valueOf(hashCodeImpl());
        }
        if (member.equals("annotationType")) {
            return this.type;
        }
        Object result = this.memberValues.get(member);
        if (result == null) {
            throw new IncompleteAnnotationException(this.type, member);
        }
        if (result instanceof ExceptionProxy) {
            throw ((ExceptionProxy) result).generateException();
        }
        if (result.getClass().isArray() && Array.getLength(result) != 0) {
            return cloneArray(result);
        }
        return result;
    }

    private Object cloneArray(Object array) {
        Class<?> cls = array.getClass();
        if (cls == byte[].class) {
            byte[] byteArray = (byte[]) array;
            return byteArray.clone();
        }
        if (cls == char[].class) {
            char[] charArray = (char[]) array;
            return charArray.clone();
        }
        if (cls == double[].class) {
            double[] doubleArray = (double[]) array;
            return doubleArray.clone();
        }
        if (cls == float[].class) {
            float[] floatArray = (float[]) array;
            return floatArray.clone();
        }
        if (cls == int[].class) {
            int[] intArray = (int[]) array;
            return intArray.clone();
        }
        if (cls == long[].class) {
            long[] longArray = (long[]) array;
            return longArray.clone();
        }
        if (cls == short[].class) {
            short[] shortArray = (short[]) array;
            return shortArray.clone();
        }
        if (cls == boolean[].class) {
            boolean[] booleanArray = (boolean[]) array;
            return booleanArray.clone();
        }
        Object[] objectArray = (Object[]) array;
        return objectArray.clone();
    }

    private String toStringImpl() {
        StringBuffer result = new StringBuffer(128);
        result.append('@');
        result.append(this.type.getName());
        result.append('(');
        boolean firstMember = true;
        for (Map.Entry<String, Object> e : this.memberValues.entrySet()) {
            if (firstMember) {
                firstMember = false;
            } else {
                result.append(", ");
            }
            result.append(e.getKey());
            result.append('=');
            result.append(memberValueToString(e.getValue()));
        }
        result.append(')');
        return result.toString();
    }

    private static String memberValueToString(Object value) {
        Class<?> cls = value.getClass();
        if (!cls.isArray()) {
            return value.toString();
        }
        if (cls == byte[].class) {
            return Arrays.toString((byte[]) value);
        }
        if (cls == char[].class) {
            return Arrays.toString((char[]) value);
        }
        if (cls == double[].class) {
            return Arrays.toString((double[]) value);
        }
        if (cls == float[].class) {
            return Arrays.toString((float[]) value);
        }
        if (cls == int[].class) {
            return Arrays.toString((int[]) value);
        }
        if (cls == long[].class) {
            return Arrays.toString((long[]) value);
        }
        if (cls == short[].class) {
            return Arrays.toString((short[]) value);
        }
        if (cls == boolean[].class) {
            return Arrays.toString((boolean[]) value);
        }
        return Arrays.toString((Object[]) value);
    }

    private Boolean equalsImpl(Object o) throws IllegalAccessException, InvocationTargetException {
        Object hisValue;
        if (o == this) {
            return true;
        }
        if (!this.type.isInstance(o)) {
            return false;
        }
        for (Method memberMethod : getMemberMethods()) {
            String member = memberMethod.getName();
            Object ourValue = this.memberValues.get(member);
            AnnotationInvocationHandler hisHandler = asOneOfUs(o);
            if (hisHandler != null) {
                hisValue = hisHandler.memberValues.get(member);
            } else {
                try {
                    hisValue = memberMethod.invoke(o, new Object[0]);
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                } catch (InvocationTargetException e2) {
                    return false;
                }
            }
            if (!memberValueEquals(ourValue, hisValue)) {
                return false;
            }
        }
        return true;
    }

    private AnnotationInvocationHandler asOneOfUs(Object o) {
        if (Proxy.isProxyClass(o.getClass())) {
            InvocationHandler handler = Proxy.getInvocationHandler(o);
            if (handler instanceof AnnotationInvocationHandler) {
                return (AnnotationInvocationHandler) handler;
            }
            return null;
        }
        return null;
    }

    private static boolean memberValueEquals(Object v1, Object v2) {
        Class<?> cls = v1.getClass();
        if (!cls.isArray()) {
            return v1.equals(v2);
        }
        if ((v1 instanceof Object[]) && (v2 instanceof Object[])) {
            return Arrays.equals((Object[]) v1, (Object[]) v2);
        }
        if (v2.getClass() != cls) {
            return false;
        }
        if (cls == byte[].class) {
            return Arrays.equals((byte[]) v1, (byte[]) v2);
        }
        if (cls == char[].class) {
            return Arrays.equals((char[]) v1, (char[]) v2);
        }
        if (cls == double[].class) {
            return Arrays.equals((double[]) v1, (double[]) v2);
        }
        if (cls == float[].class) {
            return Arrays.equals((float[]) v1, (float[]) v2);
        }
        if (cls == int[].class) {
            return Arrays.equals((int[]) v1, (int[]) v2);
        }
        if (cls == long[].class) {
            return Arrays.equals((long[]) v1, (long[]) v2);
        }
        if (cls == short[].class) {
            return Arrays.equals((short[]) v1, (short[]) v2);
        }
        return Arrays.equals((boolean[]) v1, (boolean[]) v2);
    }

    private Method[] getMemberMethods() {
        if (this.memberMethods == null) {
            this.memberMethods = (Method[]) AccessController.doPrivileged(new PrivilegedAction<Method[]>() {
                @Override
                public Method[] run() {
                    Method[] mm = AnnotationInvocationHandler.this.type.getDeclaredMethods();
                    AccessibleObject.setAccessible(mm, true);
                    return mm;
                }
            });
        }
        return this.memberMethods;
    }

    private int hashCodeImpl() {
        int result = 0;
        for (Map.Entry<String, Object> e : this.memberValues.entrySet()) {
            result += (e.getKey().hashCode() * 127) ^ memberValueHashCode(e.getValue());
        }
        return result;
    }

    private static int memberValueHashCode(Object value) {
        Class<?> cls = value.getClass();
        if (!cls.isArray()) {
            return value.hashCode();
        }
        if (cls == byte[].class) {
            return Arrays.hashCode((byte[]) value);
        }
        if (cls == char[].class) {
            return Arrays.hashCode((char[]) value);
        }
        if (cls == double[].class) {
            return Arrays.hashCode((double[]) value);
        }
        if (cls == float[].class) {
            return Arrays.hashCode((float[]) value);
        }
        if (cls == int[].class) {
            return Arrays.hashCode((int[]) value);
        }
        if (cls == long[].class) {
            return Arrays.hashCode((long[]) value);
        }
        if (cls == short[].class) {
            return Arrays.hashCode((short[]) value);
        }
        if (cls == boolean[].class) {
            return Arrays.hashCode((boolean[]) value);
        }
        return Arrays.hashCode((Object[]) value);
    }

    private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
        s.defaultReadObject();
        try {
            AnnotationType annotationType = AnnotationType.getInstance(this.type);
            Map<String, Class> memberTypes = annotationType.memberTypes();
            for (Map.Entry<String, Object> memberValue : this.memberValues.entrySet()) {
                String name = memberValue.getKey();
                Class memberType = memberTypes.get(name);
                if (memberType != null) {
                    Object value = memberValue.getValue();
                    if (!memberType.isInstance(value) && !(value instanceof ExceptionProxy)) {
                        memberValue.setValue(new AnnotationTypeMismatchExceptionProxy(value.getClass() + "[" + value + "]").setMember(annotationType.members().get(name)));
                    }
                }
            }
        } catch (IllegalArgumentException e) {
        }
    }
}
