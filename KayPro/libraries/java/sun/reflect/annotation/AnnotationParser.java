package sun.reflect.annotation;

import com.google.common.primitives.UnsignedBytes;
import java.lang.annotation.Annotation;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import sun.reflect.ConstantPool;
import sun.reflect.generics.factory.CoreReflectionFactory;
import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.parser.SignatureParser;
import sun.reflect.generics.scope.ClassScope;
import sun.reflect.generics.tree.TypeSignature;
import sun.reflect.generics.visitor.Reifier;

public class AnnotationParser {
    static final boolean $assertionsDisabled = false;
    private static final Annotation[] EMPTY_ANNOTATIONS_ARRAY = new Annotation[0];

    public static Map<Class, Annotation> parseAnnotations(byte[] rawAnnotations, ConstantPool constPool, Class container) {
        if (rawAnnotations == null) {
            return Collections.emptyMap();
        }
        try {
            return parseAnnotations2(rawAnnotations, constPool, container);
        } catch (IllegalArgumentException e) {
            throw new AnnotationFormatError(e);
        } catch (BufferUnderflowException e2) {
            throw new AnnotationFormatError("Unexpected end of annotations.");
        }
    }

    private static Map<Class, Annotation> parseAnnotations2(byte[] rawAnnotations, ConstantPool constPool, Class container) {
        Map<Class, Annotation> result = new LinkedHashMap<>();
        ByteBuffer buf = ByteBuffer.wrap(rawAnnotations);
        int numAnnotations = buf.getShort() & 65535;
        for (int i = 0; i < numAnnotations; i++) {
            Annotation a = parseAnnotation(buf, constPool, container, false);
            if (a != null) {
                Class<? extends Annotation> clsAnnotationType = a.annotationType();
                AnnotationType type = AnnotationType.getInstance(clsAnnotationType);
                if (type.retention() == RetentionPolicy.RUNTIME && result.put(clsAnnotationType, a) != null) {
                    throw new AnnotationFormatError("Duplicate annotation for class: " + clsAnnotationType + ": " + a);
                }
            }
        }
        return result;
    }

    public static Annotation[][] parseParameterAnnotations(byte[] rawAnnotations, ConstantPool constPool, Class container) {
        try {
            return parseParameterAnnotations2(rawAnnotations, constPool, container);
        } catch (IllegalArgumentException e) {
            throw new AnnotationFormatError(e);
        } catch (BufferUnderflowException e2) {
            throw new AnnotationFormatError("Unexpected end of parameter annotations.");
        }
    }

    private static Annotation[][] parseParameterAnnotations2(byte[] rawAnnotations, ConstantPool constPool, Class container) {
        ByteBuffer buf = ByteBuffer.wrap(rawAnnotations);
        int numParameters = buf.get() & UnsignedBytes.MAX_VALUE;
        Annotation[][] result = new Annotation[numParameters][];
        for (int i = 0; i < numParameters; i++) {
            int numAnnotations = buf.getShort() & 65535;
            List<Annotation> annotations = new ArrayList<>(numAnnotations);
            for (int j = 0; j < numAnnotations; j++) {
                Annotation a = parseAnnotation(buf, constPool, container, false);
                if (a != null) {
                    AnnotationType type = AnnotationType.getInstance(a.annotationType());
                    if (type.retention() == RetentionPolicy.RUNTIME) {
                        annotations.add(a);
                    }
                }
            }
            result[i] = (Annotation[]) annotations.toArray(EMPTY_ANNOTATIONS_ARRAY);
        }
        return result;
    }

    private static Annotation parseAnnotation(ByteBuffer buf, ConstantPool constPool, Class container, boolean exceptionOnMissingAnnotationClass) {
        Class<?> classAt;
        ConstantPool constantPool = constPool;
        short s = 65535;
        int typeIndex = buf.getShort() & 65535;
        String sig = "[unknown]";
        try {
            try {
                sig = constantPool.getUTF8At(typeIndex);
                classAt = parseSig(sig, container);
            } catch (IllegalArgumentException e) {
                classAt = constantPool.getClassAt(typeIndex);
            }
            try {
                AnnotationType type = AnnotationType.getInstance(classAt);
                Map<String, Class> memberTypes = type.memberTypes();
                Map<String, Object> memberValues = new LinkedHashMap<>(type.memberDefaults());
                int numMembers = buf.getShort() & 65535;
                int i = 0;
                while (i < numMembers) {
                    int memberNameIndex = buf.getShort() & s;
                    String memberName = constantPool.getUTF8At(memberNameIndex);
                    Class memberType = memberTypes.get(memberName);
                    if (memberType == null) {
                        skipMemberValue(buf);
                    } else {
                        Object value = parseMemberValue(memberType, buf, constantPool, container);
                        if (value instanceof AnnotationTypeMismatchExceptionProxy) {
                            ((AnnotationTypeMismatchExceptionProxy) value).setMember(type.members().get(memberName));
                        }
                        memberValues.put(memberName, value);
                    }
                    i++;
                    constantPool = constPool;
                    s = 65535;
                }
                return annotationForMap(classAt, memberValues);
            } catch (IllegalArgumentException e2) {
                skipAnnotation(buf, false);
                return null;
            }
        } catch (NoClassDefFoundError e3) {
            if (exceptionOnMissingAnnotationClass) {
                throw new TypeNotPresentException(sig, e3);
            }
            skipAnnotation(buf, false);
            return null;
        } catch (TypeNotPresentException e4) {
            if (exceptionOnMissingAnnotationClass) {
                throw e4;
            }
            skipAnnotation(buf, false);
            return null;
        }
    }

    public static Annotation annotationForMap(Class type, Map<String, Object> memberValues) {
        return (Annotation) Proxy.newProxyInstance(type.getClassLoader(), new Class[]{type}, new AnnotationInvocationHandler(type, memberValues));
    }

    public static Object parseMemberValue(Class memberType, ByteBuffer buf, ConstantPool constPool, Class container) {
        Object result;
        int tag = buf.get();
        if (tag == 64) {
            result = parseAnnotation(buf, constPool, container, true);
        } else {
            if (tag == 91) {
                return parseArray(memberType, buf, constPool, container);
            }
            if (tag == 99) {
                result = parseClassValue(buf, constPool, container);
            } else {
                if (tag == 101) {
                    return parseEnumValue(memberType, buf, constPool, container);
                }
                result = parseConst(tag, buf, constPool);
            }
        }
        if (!(result instanceof ExceptionProxy) && !memberType.isInstance(result)) {
            return new AnnotationTypeMismatchExceptionProxy(result.getClass() + "[" + result + "]");
        }
        return result;
    }

    private static Object parseConst(int tag, ByteBuffer buf, ConstantPool constPool) {
        int constIndex = buf.getShort() & 65535;
        if (tag == 70) {
            return Float.valueOf(constPool.getFloatAt(constIndex));
        }
        if (tag == 83) {
            return Short.valueOf((short) constPool.getIntAt(constIndex));
        }
        if (tag == 90) {
            return Boolean.valueOf(constPool.getIntAt(constIndex) != 0);
        }
        if (tag == 115) {
            return constPool.getUTF8At(constIndex);
        }
        if (tag == 73) {
            return Integer.valueOf(constPool.getIntAt(constIndex));
        }
        if (tag != 74) {
            switch (tag) {
                case 66:
                    return Byte.valueOf((byte) constPool.getIntAt(constIndex));
                case 67:
                    return Character.valueOf((char) constPool.getIntAt(constIndex));
                case 68:
                    return Double.valueOf(constPool.getDoubleAt(constIndex));
                default:
                    throw new AnnotationFormatError("Invalid member-value tag in annotation: " + tag);
            }
        }
        return Long.valueOf(constPool.getLongAt(constIndex));
    }

    private static Object parseClassValue(ByteBuffer buf, ConstantPool constPool, Class container) {
        int classIndex = buf.getShort() & 65535;
        try {
            try {
                String sig = constPool.getUTF8At(classIndex);
                return parseSig(sig, container);
            } catch (IllegalArgumentException e) {
                return constPool.getClassAt(classIndex);
            }
        } catch (NoClassDefFoundError e2) {
            return new TypeNotPresentExceptionProxy("[unknown]", e2);
        } catch (TypeNotPresentException e3) {
            return new TypeNotPresentExceptionProxy(e3.typeName(), e3.getCause());
        }
    }

    private static Class<?> parseSig(String sig, Class container) {
        if (sig.equals("V")) {
            return Void.TYPE;
        }
        SignatureParser parser = SignatureParser.make();
        TypeSignature typeSig = parser.parseTypeSig(sig);
        GenericsFactory factory = CoreReflectionFactory.make(container, ClassScope.make(container));
        Reifier reify = Reifier.make(factory);
        typeSig.accept(reify);
        Type result = reify.getResult();
        return toClass(result);
    }

    static Class toClass(Type o) {
        if (o instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) toClass(((GenericArrayType) o).getGenericComponentType()), 0).getClass();
        }
        return (Class) o;
    }

    private static Object parseEnumValue(Class enumType, ByteBuffer buf, ConstantPool constPool, Class container) {
        int typeNameIndex = buf.getShort() & 65535;
        String typeName = constPool.getUTF8At(typeNameIndex);
        int constNameIndex = 65535 & buf.getShort();
        String constName = constPool.getUTF8At(constNameIndex);
        if (!typeName.endsWith(";")) {
            if (!enumType.getName().equals(typeName)) {
                return new AnnotationTypeMismatchExceptionProxy(typeName + "." + constName);
            }
        } else if (enumType != parseSig(typeName, container)) {
            return new AnnotationTypeMismatchExceptionProxy(typeName + "." + constName);
        }
        try {
            return Enum.valueOf(enumType, constName);
        } catch (IllegalArgumentException e) {
            return new EnumConstantNotPresentExceptionProxy(enumType, constName);
        }
    }

    private static Object parseArray(Class arrayType, ByteBuffer buf, ConstantPool constPool, Class container) {
        int length = buf.getShort() & 65535;
        Class<?> componentType = arrayType.getComponentType();
        if (componentType == Byte.TYPE) {
            return parseByteArray(length, buf, constPool);
        }
        if (componentType == Character.TYPE) {
            return parseCharArray(length, buf, constPool);
        }
        if (componentType == Double.TYPE) {
            return parseDoubleArray(length, buf, constPool);
        }
        if (componentType == Float.TYPE) {
            return parseFloatArray(length, buf, constPool);
        }
        if (componentType == Integer.TYPE) {
            return parseIntArray(length, buf, constPool);
        }
        if (componentType == Long.TYPE) {
            return parseLongArray(length, buf, constPool);
        }
        if (componentType == Short.TYPE) {
            return parseShortArray(length, buf, constPool);
        }
        if (componentType == Boolean.TYPE) {
            return parseBooleanArray(length, buf, constPool);
        }
        if (componentType == String.class) {
            return parseStringArray(length, buf, constPool);
        }
        if (componentType == Class.class) {
            return parseClassArray(length, buf, constPool, container);
        }
        if (componentType.isEnum()) {
            return parseEnumArray(length, componentType, buf, constPool, container);
        }
        return parseAnnotationArray(length, componentType, buf, constPool, container);
    }

    private static Object parseByteArray(int length, ByteBuffer buf, ConstantPool constPool) {
        byte[] result = new byte[length];
        boolean typeMismatch = false;
        int tag = 0;
        for (int i = 0; i < length; i++) {
            tag = buf.get();
            if (tag == 66) {
                int index = buf.getShort() & 65535;
                result[i] = (byte) constPool.getIntAt(index);
            } else {
                skipMemberValue(tag, buf);
                typeMismatch = true;
            }
        }
        return typeMismatch ? exceptionProxy(tag) : result;
    }

    private static Object parseCharArray(int length, ByteBuffer buf, ConstantPool constPool) {
        char[] result = new char[length];
        boolean typeMismatch = false;
        byte tag = 0;
        for (int i = 0; i < length; i++) {
            tag = buf.get();
            if (tag == 67) {
                int index = buf.getShort() & 65535;
                result[i] = (char) constPool.getIntAt(index);
            } else {
                skipMemberValue(tag, buf);
                typeMismatch = true;
            }
        }
        return typeMismatch ? exceptionProxy(tag) : result;
    }

    private static Object parseDoubleArray(int length, ByteBuffer buf, ConstantPool constPool) {
        double[] result = new double[length];
        boolean typeMismatch = false;
        int tag = 0;
        for (int i = 0; i < length; i++) {
            tag = buf.get();
            if (tag == 68) {
                int index = buf.getShort() & 65535;
                result[i] = constPool.getDoubleAt(index);
            } else {
                skipMemberValue(tag, buf);
                typeMismatch = true;
            }
        }
        return typeMismatch ? exceptionProxy(tag) : result;
    }

    private static Object parseFloatArray(int length, ByteBuffer buf, ConstantPool constPool) {
        float[] result = new float[length];
        boolean typeMismatch = false;
        int tag = 0;
        for (int i = 0; i < length; i++) {
            tag = buf.get();
            if (tag == 70) {
                int index = buf.getShort() & 65535;
                result[i] = constPool.getFloatAt(index);
            } else {
                skipMemberValue(tag, buf);
                typeMismatch = true;
            }
        }
        return typeMismatch ? exceptionProxy(tag) : result;
    }

    private static Object parseIntArray(int length, ByteBuffer buf, ConstantPool constPool) {
        int[] result = new int[length];
        boolean typeMismatch = false;
        int tag = 0;
        for (int i = 0; i < length; i++) {
            tag = buf.get();
            if (tag == 73) {
                int index = buf.getShort() & 65535;
                result[i] = constPool.getIntAt(index);
            } else {
                skipMemberValue(tag, buf);
                typeMismatch = true;
            }
        }
        return typeMismatch ? exceptionProxy(tag) : result;
    }

    private static Object parseLongArray(int length, ByteBuffer buf, ConstantPool constPool) {
        long[] result = new long[length];
        boolean typeMismatch = false;
        int tag = 0;
        for (int i = 0; i < length; i++) {
            tag = buf.get();
            if (tag == 74) {
                int index = buf.getShort() & 65535;
                result[i] = constPool.getLongAt(index);
            } else {
                skipMemberValue(tag, buf);
                typeMismatch = true;
            }
        }
        return typeMismatch ? exceptionProxy(tag) : result;
    }

    private static Object parseShortArray(int length, ByteBuffer buf, ConstantPool constPool) {
        short[] result = new short[length];
        boolean typeMismatch = false;
        int tag = 0;
        for (int i = 0; i < length; i++) {
            tag = buf.get();
            if (tag == 83) {
                int index = buf.getShort() & 65535;
                result[i] = (short) constPool.getIntAt(index);
            } else {
                skipMemberValue(tag, buf);
                typeMismatch = true;
            }
        }
        return typeMismatch ? exceptionProxy(tag) : result;
    }

    private static Object parseBooleanArray(int length, ByteBuffer buf, ConstantPool constPool) {
        boolean[] result = new boolean[length];
        boolean typeMismatch = false;
        int tag = 0;
        for (int i = 0; i < length; i++) {
            tag = buf.get();
            if (tag == 90) {
                int index = buf.getShort() & 65535;
                result[i] = constPool.getIntAt(index) != 0;
            } else {
                skipMemberValue(tag, buf);
                typeMismatch = true;
            }
        }
        return typeMismatch ? exceptionProxy(tag) : result;
    }

    private static Object parseStringArray(int length, ByteBuffer buf, ConstantPool constPool) {
        String[] result = new String[length];
        boolean typeMismatch = false;
        int tag = 0;
        for (int i = 0; i < length; i++) {
            tag = buf.get();
            if (tag == 115) {
                int index = buf.getShort() & 65535;
                result[i] = constPool.getUTF8At(index);
            } else {
                skipMemberValue(tag, buf);
                typeMismatch = true;
            }
        }
        return typeMismatch ? exceptionProxy(tag) : result;
    }

    private static Object parseClassArray(int length, ByteBuffer buf, ConstantPool constPool, Class container) {
        Object[] result = new Class[length];
        boolean typeMismatch = false;
        int tag = 0;
        for (int i = 0; i < length; i++) {
            tag = buf.get();
            if (tag == 99) {
                result[i] = parseClassValue(buf, constPool, container);
            } else {
                skipMemberValue(tag, buf);
                typeMismatch = true;
            }
        }
        return typeMismatch ? exceptionProxy(tag) : result;
    }

    private static Object parseEnumArray(int length, Class enumType, ByteBuffer buf, ConstantPool constPool, Class container) {
        Object[] result = (Object[]) Array.newInstance((Class<?>) enumType, length);
        boolean typeMismatch = false;
        int tag = 0;
        for (int i = 0; i < length; i++) {
            tag = buf.get();
            if (tag == 101) {
                result[i] = parseEnumValue(enumType, buf, constPool, container);
            } else {
                skipMemberValue(tag, buf);
                typeMismatch = true;
            }
        }
        return typeMismatch ? exceptionProxy(tag) : result;
    }

    private static Object parseAnnotationArray(int length, Class annotationType, ByteBuffer buf, ConstantPool constPool, Class container) {
        Object[] result = (Object[]) Array.newInstance((Class<?>) annotationType, length);
        boolean typeMismatch = false;
        int tag = 0;
        for (int i = 0; i < length; i++) {
            tag = buf.get();
            if (tag == 64) {
                result[i] = parseAnnotation(buf, constPool, container, true);
            } else {
                skipMemberValue(tag, buf);
                typeMismatch = true;
            }
        }
        return typeMismatch ? exceptionProxy(tag) : result;
    }

    private static ExceptionProxy exceptionProxy(int tag) {
        return new AnnotationTypeMismatchExceptionProxy("Array with component tag: " + tag);
    }

    private static void skipAnnotation(ByteBuffer buf, boolean complete) {
        if (complete) {
            buf.getShort();
        }
        int numMembers = buf.getShort() & 65535;
        for (int i = 0; i < numMembers; i++) {
            buf.getShort();
            skipMemberValue(buf);
        }
    }

    private static void skipMemberValue(ByteBuffer buf) {
        int tag = buf.get();
        skipMemberValue(tag, buf);
    }

    private static void skipMemberValue(int tag, ByteBuffer buf) {
        if (tag == 64) {
            skipAnnotation(buf, true);
            return;
        }
        if (tag == 91) {
            skipArray(buf);
        } else if (tag == 101) {
            buf.getInt();
        } else {
            buf.getShort();
        }
    }

    private static void skipArray(ByteBuffer buf) {
        int length = buf.getShort() & 65535;
        for (int i = 0; i < length; i++) {
            skipMemberValue(buf);
        }
    }
}
