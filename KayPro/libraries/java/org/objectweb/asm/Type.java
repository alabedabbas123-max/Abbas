package org.objectweb.asm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.apache.commons.io.FilenameUtils;

public class Type {
    public static final int ARRAY = 9;
    public static final int BOOLEAN = 1;
    public static final Type BOOLEAN_TYPE;
    public static final int BYTE = 3;
    public static final Type BYTE_TYPE;
    public static final int CHAR = 2;
    public static final Type CHAR_TYPE;
    public static final int DOUBLE = 8;
    public static final Type DOUBLE_TYPE;
    public static final int FLOAT = 6;
    public static final Type FLOAT_TYPE;

    public static final int f6640INT = 5;
    public static final Type INT_TYPE;
    public static final int LONG = 7;
    public static final Type LONG_TYPE;
    public static final int METHOD = 11;
    public static final int OBJECT = 10;
    public static final int SHORT = 4;
    public static final Type SHORT_TYPE;
    public static final int VOID = 0;
    public static final Type VOID_TYPE;

    private final int f6641a;

    private final char[] f6642b;

    private final int f6643c;

    private final int f6644d;

    static {
        _clinit_();
        VOID_TYPE = new Type(0, null, 1443168256, 1);
        BOOLEAN_TYPE = new Type(1, null, 1509950721, 1);
        CHAR_TYPE = new Type(2, null, 1124075009, 1);
        BYTE_TYPE = new Type(3, null, 1107297537, 1);
        SHORT_TYPE = new Type(4, null, 1392510721, 1);
        INT_TYPE = new Type(5, null, 1224736769, 1);
        FLOAT_TYPE = new Type(6, null, 1174536705, 1);
        LONG_TYPE = new Type(7, null, 1241579778, 1);
        DOUBLE_TYPE = new Type(8, null, 1141048066, 1);
    }

    private Type(int i, char[] cArr, int i2, int i3) {
        this.f6641a = i;
        this.f6642b = cArr;
        this.f6643c = i2;
        this.f6644d = i3;
    }

    static void _clinit_() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Type m8990a(char[] cArr, int i) {
        int i2 = 1;
        switch (cArr[i]) {
            case 'B':
                return BYTE_TYPE;
            case 'C':
                return CHAR_TYPE;
            case 'D':
                return DOUBLE_TYPE;
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'T':
            case 'U':
            case 'W':
            case 'X':
            case 'Y':
            default:
                return new Type(11, cArr, i, cArr.length - i);
            case 'F':
                return FLOAT_TYPE;
            case 'I':
                return INT_TYPE;
            case 'J':
                return LONG_TYPE;
            case 'L':
                while (true) {
                    int i3 = i2;
                    if (cArr[i + i3] == ';') {
                        return new Type(10, cArr, i + 1, i3 - 1);
                    }
                    i2 = i3 + 1;
                }
                break;
            case 'S':
                return SHORT_TYPE;
            case 'V':
                return VOID_TYPE;
            case 'Z':
                return BOOLEAN_TYPE;
            case '[':
                while (cArr[i + i2] == '[') {
                    i2++;
                }
                if (cArr[i + i2] == 'L') {
                    do {
                        i2++;
                    } while (cArr[i + i2] != ';');
                }
                return new Type(9, cArr, i, i2 + 1);
        }
    }

    private void m8991a(StringBuffer stringBuffer) {
        if (this.f6642b == null) {
            stringBuffer.append((char) ((this.f6643c & (-16777216)) >>> 24));
        } else {
            if (this.f6641a != 10) {
                stringBuffer.append(this.f6642b, this.f6643c, this.f6644d);
                return;
            }
            stringBuffer.append('L');
            stringBuffer.append(this.f6642b, this.f6643c, this.f6644d);
            stringBuffer.append(';');
        }
    }

    private static void m8992a(StringBuffer stringBuffer, Class cls) {
        char c;
        while (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                stringBuffer.append('L');
                String name = cls.getName();
                int length = name.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = name.charAt(i);
                    if (cCharAt == '.') {
                        cCharAt = '/';
                    }
                    stringBuffer.append(cCharAt);
                }
                stringBuffer.append(';');
                return;
            }
            stringBuffer.append('[');
            cls = cls.getComponentType();
        }
        if (cls == Integer.TYPE) {
            c = 'I';
        } else if (cls == Void.TYPE) {
            c = 'V';
        } else if (cls == Boolean.TYPE) {
            c = 'Z';
        } else if (cls == Byte.TYPE) {
            c = 'B';
        } else if (cls == Character.TYPE) {
            c = 'C';
        } else if (cls == Short.TYPE) {
            c = 'S';
        } else if (cls == Double.TYPE) {
            c = 'D';
        } else {
            c = cls == Float.TYPE ? 'F' : 'J';
        }
        stringBuffer.append(c);
    }

    public static Type[] getArgumentTypes(String str) {
        int i;
        int i2 = 1;
        char[] charArray = str.toCharArray();
        int i3 = 0;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char c = charArray[i4];
            if (c == ')') {
                break;
            }
            if (c == 'L') {
                do {
                    i = i5;
                    i5 = i + 1;
                } while (charArray[i] != ';');
                i3++;
                i4 = i5;
            } else if (c != '[') {
                i3++;
                i4 = i5;
            } else {
                i4 = i5;
            }
        }
        Type[] typeArr = new Type[i3];
        int i6 = 0;
        while (charArray[i2] != ')') {
            typeArr[i6] = m8990a(charArray, i2);
            i2 += (typeArr[i6].f6641a == 10 ? 2 : 0) + typeArr[i6].f6644d;
            i6++;
        }
        return typeArr;
    }

    public static Type[] getArgumentTypes(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Type[] typeArr = new Type[parameterTypes.length];
        for (int length = parameterTypes.length - 1; length >= 0; length--) {
            typeArr[length] = getType(parameterTypes[length]);
        }
        return typeArr;
    }

    public static int getArgumentsAndReturnSizes(String str) {
        int i;
        char cCharAt;
        int i2;
        int i3 = 1;
        int i4 = 1;
        int i5 = 1;
        while (true) {
            i = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 == ')') {
                break;
            }
            if (cCharAt2 == 'L') {
                do {
                    i2 = i;
                    i = i2 + 1;
                } while (str.charAt(i2) != ';');
                i5++;
                i4 = i;
            } else if (cCharAt2 == '[') {
                while (true) {
                    cCharAt = str.charAt(i);
                    if (cCharAt != '[') {
                        break;
                    }
                    i++;
                }
                if (cCharAt == 'D' || cCharAt == 'J') {
                    i5--;
                    i4 = i;
                } else {
                    i4 = i;
                }
            } else if (cCharAt2 == 'D' || cCharAt2 == 'J') {
                i5 += 2;
                i4 = i;
            } else {
                i5++;
                i4 = i;
            }
        }
        char cCharAt3 = str.charAt(i);
        if (cCharAt3 == 'V') {
            i3 = 0;
        } else if (cCharAt3 == 'D' || cCharAt3 == 'J') {
            i3 = 2;
        }
        return (i5 << 2) | i3;
    }

    public static String getConstructorDescriptor(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (Class<?> cls : parameterTypes) {
            m8992a(stringBuffer, cls);
        }
        return stringBuffer.append(")V").toString();
    }

    public static String getDescriptor(Class cls) {
        StringBuffer stringBuffer = new StringBuffer();
        m8992a(stringBuffer, cls);
        return stringBuffer.toString();
    }

    public static String getInternalName(Class cls) {
        return cls.getName().replace(FilenameUtils.EXTENSION_SEPARATOR, '/');
    }

    public static String getMethodDescriptor(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (Class<?> cls : parameterTypes) {
            m8992a(stringBuffer, cls);
        }
        stringBuffer.append(')');
        m8992a(stringBuffer, method.getReturnType());
        return stringBuffer.toString();
    }

    public static String getMethodDescriptor(Type type, Type... typeArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (Type type2 : typeArr) {
            type2.m8991a(stringBuffer);
        }
        stringBuffer.append(')');
        type.m8991a(stringBuffer);
        return stringBuffer.toString();
    }

    public static Type getMethodType(String str) {
        return m8990a(str.toCharArray(), 0);
    }

    public static Type getMethodType(Type type, Type... typeArr) {
        return getType(getMethodDescriptor(type, typeArr));
    }

    public static Type getObjectType(String str) {
        char[] charArray = str.toCharArray();
        return new Type(charArray[0] == '[' ? 9 : 10, charArray, 0, charArray.length);
    }

    public static Type getReturnType(String str) {
        return m8990a(str.toCharArray(), str.indexOf(41) + 1);
    }

    public static Type getReturnType(Method method) {
        return getType(method.getReturnType());
    }

    public static Type getType(Class cls) {
        if (!cls.isPrimitive()) {
            return getType(getDescriptor(cls));
        }
        if (cls == Integer.TYPE) {
            return INT_TYPE;
        }
        if (cls == Void.TYPE) {
            return VOID_TYPE;
        }
        if (cls == Boolean.TYPE) {
            return BOOLEAN_TYPE;
        }
        if (cls == Byte.TYPE) {
            return BYTE_TYPE;
        }
        if (cls == Character.TYPE) {
            return CHAR_TYPE;
        }
        if (cls == Short.TYPE) {
            return SHORT_TYPE;
        }
        if (cls == Double.TYPE) {
            return DOUBLE_TYPE;
        }
        return cls == Float.TYPE ? FLOAT_TYPE : LONG_TYPE;
    }

    public static Type getType(String str) {
        return m8990a(str.toCharArray(), 0);
    }

    public static Type getType(Constructor constructor) {
        return getType(getConstructorDescriptor(constructor));
    }

    public static Type getType(Method method) {
        return getType(getMethodDescriptor(method));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return false;
        }
        Type type = (Type) obj;
        if (this.f6641a != type.f6641a) {
            return false;
        }
        if (this.f6641a < 9) {
            return true;
        }
        if (this.f6644d != type.f6644d) {
            return false;
        }
        int i = this.f6643c;
        int i2 = type.f6643c;
        int i3 = this.f6644d;
        int i4 = i;
        while (i4 < i + i3) {
            if (this.f6642b[i4] != type.f6642b[i2]) {
                return false;
            }
            i4++;
            i2++;
        }
        return true;
    }

    public Type[] getArgumentTypes() {
        return getArgumentTypes(getDescriptor());
    }

    public int getArgumentsAndReturnSizes() {
        return getArgumentsAndReturnSizes(getDescriptor());
    }

    public String getClassName() {
        switch (this.f6641a) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                StringBuffer stringBuffer = new StringBuffer(getElementType().getClassName());
                for (int dimensions = getDimensions(); dimensions > 0; dimensions--) {
                    stringBuffer.append("[]");
                }
                return stringBuffer.toString();
            case 10:
                return new String(this.f6642b, this.f6643c, this.f6644d).replace('/', FilenameUtils.EXTENSION_SEPARATOR);
            default:
                return null;
        }
    }

    public String getDescriptor() {
        StringBuffer stringBuffer = new StringBuffer();
        m8991a(stringBuffer);
        return stringBuffer.toString();
    }

    public int getDimensions() {
        int i = 1;
        while (this.f6642b[this.f6643c + i] == '[') {
            i++;
        }
        return i;
    }

    public Type getElementType() {
        return m8990a(this.f6642b, this.f6643c + getDimensions());
    }

    public String getInternalName() {
        return new String(this.f6642b, this.f6643c, this.f6644d);
    }

    public int getOpcode(int i) {
        if (i == 46 || i == 79) {
            return (this.f6642b == null ? (this.f6643c & 65280) >> 8 : 4) + i;
        }
        return (this.f6642b == null ? (this.f6643c & 16711680) >> 16 : 4) + i;
    }

    public Type getReturnType() {
        return getReturnType(getDescriptor());
    }

    public int getSize() {
        if (this.f6642b == null) {
            return this.f6643c & 255;
        }
        return 1;
    }

    public int getSort() {
        return this.f6641a;
    }

    public int hashCode() {
        int i = this.f6641a * 13;
        if (this.f6641a >= 9) {
            int i2 = this.f6643c;
            int i3 = this.f6644d;
            for (int i4 = i2; i4 < i2 + i3; i4++) {
                i = (i + this.f6642b[i4]) * 17;
            }
        }
        return i;
    }

    public String toString() {
        return getDescriptor();
    }
}
