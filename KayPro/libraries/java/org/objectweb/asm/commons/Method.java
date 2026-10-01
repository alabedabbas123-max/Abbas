package org.objectweb.asm.commons;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FilenameUtils;
import org.objectweb.asm.Type;

public class Method {
    private static final Map DESCRIPTORS;
    private final String desc;
    private final String name;

    static {
        _clinit_();
        DESCRIPTORS = new HashMap();
        DESCRIPTORS.put("void", "V");
        DESCRIPTORS.put("byte", "B");
        DESCRIPTORS.put("char", "C");
        DESCRIPTORS.put("double", "D");
        DESCRIPTORS.put("float", "F");
        DESCRIPTORS.put("int", "I");
        DESCRIPTORS.put("long", "J");
        DESCRIPTORS.put("short", "S");
        DESCRIPTORS.put("boolean", "Z");
    }

    public Method(String str, String str2) {
        this.name = str;
        this.desc = str2;
    }

    public Method(String str, Type type, Type[] typeArr) {
        this(str, Type.getMethodDescriptor(type, typeArr));
    }

    static void _clinit_() {
    }

    public static Method getMethod(String str) throws IllegalArgumentException {
        return getMethod(str, false);
    }

    public static Method getMethod(String str, boolean z) throws IllegalArgumentException {
        int iIndexOf;
        String strM9020map;
        int iIndexOf2 = str.indexOf(32);
        int iIndexOf3 = str.indexOf(40, iIndexOf2) + 1;
        int iIndexOf4 = str.indexOf(41, iIndexOf3);
        if (iIndexOf2 == -1 || iIndexOf3 == -1 || iIndexOf4 == -1) {
            throw new IllegalArgumentException();
        }
        String strSubstring = str.substring(0, iIndexOf2);
        String strTrim = str.substring(iIndexOf2 + 1, iIndexOf3 - 1).trim();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        do {
            iIndexOf = str.indexOf(44, iIndexOf3);
            if (iIndexOf == -1) {
                strM9020map = m9020map(str.substring(iIndexOf3, iIndexOf4).trim(), z);
            } else {
                strM9020map = m9020map(str.substring(iIndexOf3, iIndexOf).trim(), z);
                iIndexOf3 = iIndexOf + 1;
            }
            stringBuffer.append(strM9020map);
        } while (iIndexOf != -1);
        stringBuffer.append(')');
        stringBuffer.append(m9020map(strSubstring, z));
        return new Method(strTrim, stringBuffer.toString());
    }

    public static Method getMethod(Constructor constructor) {
        return new Method("<init>", Type.getConstructorDescriptor(constructor));
    }

    public static Method getMethod(java.lang.reflect.Method method) {
        return new Method(method.getName(), Type.getMethodDescriptor(method));
    }

    private static String m9020map(String str, boolean z) {
        if ("".equals(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int iIndexOf = 0;
        while (true) {
            iIndexOf = str.indexOf("[]", iIndexOf) + 1;
            if (iIndexOf <= 0) {
                break;
            }
            stringBuffer.append('[');
        }
        String strSubstring = str.substring(0, str.length() - (stringBuffer.length() * 2));
        String str2 = (String) DESCRIPTORS.get(strSubstring);
        if (str2 != null) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append('L');
            if (strSubstring.indexOf(46) < 0) {
                if (!z) {
                    stringBuffer.append("java/lang/");
                }
                stringBuffer.append(strSubstring);
            } else {
                stringBuffer.append(strSubstring.replace(FilenameUtils.EXTENSION_SEPARATOR, '/'));
            }
            stringBuffer.append(';');
        }
        return stringBuffer.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Method)) {
            return false;
        }
        Method method = (Method) obj;
        return this.name.equals(method.name) && this.desc.equals(method.desc);
    }

    public Type[] getArgumentTypes() {
        return Type.getArgumentTypes(this.desc);
    }

    public String getDescriptor() {
        return this.desc;
    }

    public String getName() {
        return this.name;
    }

    public Type getReturnType() {
        return Type.getReturnType(this.desc);
    }

    public int hashCode() {
        return this.name.hashCode() ^ this.desc.hashCode();
    }

    public String toString() {
        return new StringBuffer().append(this.name).append(this.desc).toString();
    }
}
