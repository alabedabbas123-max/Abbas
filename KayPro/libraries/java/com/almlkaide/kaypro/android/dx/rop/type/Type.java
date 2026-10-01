package com.almlkaide.kaypro.android.dx.rop.type;

import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class Type implements TypeBearer, Comparable<Type> {
    public static final int BT_ADDR = 10;
    public static final int BT_BOOLEAN = 1;
    public static final int BT_BYTE = 2;
    public static final int BT_CHAR = 3;
    public static final int BT_COUNT = 11;
    public static final int BT_DOUBLE = 4;
    public static final int BT_FLOAT = 5;
    public static final int BT_INT = 6;
    public static final int BT_LONG = 7;
    public static final int BT_OBJECT = 9;
    public static final int BT_SHORT = 8;
    public static final int BT_VOID = 0;
    private Type arrayType;
    private final int basicType;
    private String className;
    private Type componentType;
    private final String descriptor;
    private Type initializedType;
    private final int newAt;
    private static final ConcurrentMap<String, Type> internTable = new ConcurrentHashMap(10000, 0.75f);
    public static final Type BOOLEAN = new Type("Z", 1);
    public static final Type BYTE = new Type("B", 2);
    public static final Type CHAR = new Type("C", 3);
    public static final Type DOUBLE = new Type("D", 4);
    public static final Type FLOAT = new Type("F", 5);

    public static final Type f5078INT = new Type("I", 6);
    public static final Type LONG = new Type("J", 7);
    public static final Type SHORT = new Type("S", 8);
    public static final Type VOID = new Type("V", 0);
    public static final Type KNOWN_NULL = new Type("<null>", 9);
    public static final Type RETURN_ADDRESS = new Type("<addr>", 10);
    public static final Type ANNOTATION = new Type("Ljava/lang/annotation/Annotation;", 9);
    public static final Type CLASS = new Type("Ljava/lang/Class;", 9);
    public static final Type CLONEABLE = new Type("Ljava/lang/Cloneable;", 9);
    public static final Type METHOD_HANDLE = new Type("Ljava/lang/invoke/MethodHandle;", 9);
    public static final Type METHOD_TYPE = new Type("Ljava/lang/invoke/MethodType;", 9);
    public static final Type VAR_HANDLE = new Type("Ljava/lang/invoke/VarHandle;", 9);
    public static final Type OBJECT = new Type("Ljava/lang/Object;", 9);
    public static final Type SERIALIZABLE = new Type("Ljava/io/Serializable;", 9);
    public static final Type STRING = new Type("Ljava/lang/String;", 9);
    public static final Type THROWABLE = new Type("Ljava/lang/Throwable;", 9);
    public static final Type BOOLEAN_CLASS = new Type("Ljava/lang/Boolean;", 9);
    public static final Type BYTE_CLASS = new Type("Ljava/lang/Byte;", 9);
    public static final Type CHARACTER_CLASS = new Type("Ljava/lang/Character;", 9);
    public static final Type DOUBLE_CLASS = new Type("Ljava/lang/Double;", 9);
    public static final Type FLOAT_CLASS = new Type("Ljava/lang/Float;", 9);
    public static final Type INTEGER_CLASS = new Type("Ljava/lang/Integer;", 9);
    public static final Type LONG_CLASS = new Type("Ljava/lang/Long;", 9);
    public static final Type SHORT_CLASS = new Type("Ljava/lang/Short;", 9);
    public static final Type VOID_CLASS = new Type("Ljava/lang/Void;", 9);
    public static final Type BOOLEAN_ARRAY = new Type(new StringBuffer().append("[").append(BOOLEAN.descriptor).toString(), 9);
    public static final Type BYTE_ARRAY = new Type(new StringBuffer().append("[").append(BYTE.descriptor).toString(), 9);
    public static final Type CHAR_ARRAY = new Type(new StringBuffer().append("[").append(CHAR.descriptor).toString(), 9);
    public static final Type DOUBLE_ARRAY = new Type(new StringBuffer().append("[").append(DOUBLE.descriptor).toString(), 9);
    public static final Type FLOAT_ARRAY = new Type(new StringBuffer().append("[").append(FLOAT.descriptor).toString(), 9);
    public static final Type INT_ARRAY = new Type(new StringBuffer().append("[").append(f5078INT.descriptor).toString(), 9);
    public static final Type LONG_ARRAY = new Type(new StringBuffer().append("[").append(LONG.descriptor).toString(), 9);
    public static final Type OBJECT_ARRAY = new Type(new StringBuffer().append("[").append(OBJECT.descriptor).toString(), 9);
    public static final Type SHORT_ARRAY = new Type(new StringBuffer().append("[").append(SHORT.descriptor).toString(), 9);

    @Override
    public int compareTo(Type type) {
        return compareTo2(type);
    }

    @Override
    public TypeBearer getFrameType() {
        return getFrameType();
    }

    static {
        initInterns();
    }

    private static void initInterns() {
        putIntern(BOOLEAN);
        putIntern(BYTE);
        putIntern(CHAR);
        putIntern(DOUBLE);
        putIntern(FLOAT);
        putIntern(f5078INT);
        putIntern(LONG);
        putIntern(SHORT);
        putIntern(ANNOTATION);
        putIntern(CLASS);
        putIntern(CLONEABLE);
        putIntern(METHOD_HANDLE);
        putIntern(VAR_HANDLE);
        putIntern(OBJECT);
        putIntern(SERIALIZABLE);
        putIntern(STRING);
        putIntern(THROWABLE);
        putIntern(BOOLEAN_CLASS);
        putIntern(BYTE_CLASS);
        putIntern(CHARACTER_CLASS);
        putIntern(DOUBLE_CLASS);
        putIntern(FLOAT_CLASS);
        putIntern(INTEGER_CLASS);
        putIntern(LONG_CLASS);
        putIntern(SHORT_CLASS);
        putIntern(VOID_CLASS);
        putIntern(BOOLEAN_ARRAY);
        putIntern(BYTE_ARRAY);
        putIntern(CHAR_ARRAY);
        putIntern(DOUBLE_ARRAY);
        putIntern(FLOAT_ARRAY);
        putIntern(INT_ARRAY);
        putIntern(LONG_ARRAY);
        putIntern(OBJECT_ARRAY);
        putIntern(SHORT_ARRAY);
    }

    public static Type intern(String str) {
        Type type = internTable.get(str);
        if (type == null) {
            try {
                char cCharAt = str.charAt(0);
                if (cCharAt == '[') {
                    return intern(str.substring(1)).getArrayType();
                }
                int length = str.length();
                if (cCharAt != 'L' || str.charAt(length - 1) != ';') {
                    throw new IllegalArgumentException(new StringBuffer().append("bad descriptor: ").append(str).toString());
                }
                int i = length - 1;
                for (int i2 = 1; i2 < i; i2++) {
                    switch (str.charAt(i2)) {
                        case '(':
                        case ')':
                        case '.':
                        case ';':
                        case '[':
                            throw new IllegalArgumentException(new StringBuffer().append("bad descriptor: ").append(str).toString());
                        case '/':
                            if (i2 == 1 || i2 == length - 1 || str.charAt(i2 - 1) == '/') {
                                throw new IllegalArgumentException(new StringBuffer().append("bad descriptor: ").append(str).toString());
                            }
                            break;
                    }
                }
                return putIntern(new Type(str, 9));
            } catch (IndexOutOfBoundsException e) {
                throw new IllegalArgumentException("descriptor is empty");
            } catch (NullPointerException e2) {
                throw new NullPointerException("descriptor == null");
            }
        }
        return type;
    }

    public static Type internReturnType(String str) {
        try {
            if (str.equals("V")) {
                return VOID;
            }
            return intern(str);
        } catch (NullPointerException e) {
            throw new NullPointerException("descriptor == null");
        }
    }

    public static Type internClassName(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        return str.startsWith("[") ? intern(str) : intern(new StringBuffer().append(new StringBuffer().append('L').append(str).toString()).append(';').toString());
    }

    Type(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (i < 0 || i >= 11) {
            throw new IllegalArgumentException("bad basicType");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("newAt < -1");
        }
        this.descriptor = str;
        this.basicType = i;
        this.newAt = i2;
        this.arrayType = (Type) null;
        this.componentType = (Type) null;
        this.initializedType = (Type) null;
    }

    Type(String str, int i) {
        this(str, i, -1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return false;
        }
        return this.descriptor.equals(((Type) obj).descriptor);
    }

    public int hashCode() {
        return this.descriptor.hashCode();
    }

    public int compareTo2(Type type) {
        return this.descriptor.compareTo(type.descriptor);
    }

    public String toString() {
        return this.descriptor;
    }

    @Override
    public String toHuman() {
        switch (this.basicType) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "byte";
            case 3:
                return "char";
            case 4:
                return "double";
            case 5:
                return "float";
            case 6:
                return "int";
            case 7:
                return "long";
            case 8:
                return "short";
            case 9:
                if (isArray()) {
                    return new StringBuffer().append(getComponentType().toHuman()).append("[]").toString();
                }
                return getClassName().replace("/", ".");
            default:
                return this.descriptor;
        }
    }

    @Override
    public Type getType() {
        return this;
    }

    @Override
    public Type getFrameType() {
        switch (this.basicType) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 8:
                return f5078INT;
            case 4:
            case 5:
            case 7:
            default:
                return this;
        }
    }

    @Override
    public int getBasicType() {
        return this.basicType;
    }

    @Override
    public int getBasicFrameType() {
        switch (this.basicType) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 8:
                return 6;
            case 4:
            case 5:
            case 7:
            default:
                return this.basicType;
        }
    }

    @Override
    public boolean isConstant() {
        return false;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public String getClassName() {
        if (this.className == null) {
            if (!isReference()) {
                throw new IllegalArgumentException(new StringBuffer().append("not an object type: ").append(this.descriptor).toString());
            }
            if (this.descriptor.charAt(0) == '[') {
                this.className = this.descriptor;
            } else {
                this.className = this.descriptor.substring(1, this.descriptor.length() - 1);
            }
        }
        return this.className;
    }

    public int getCategory() {
        switch (this.basicType) {
            case 4:
            case 7:
                return 2;
            case 5:
            case 6:
            default:
                return 1;
        }
    }

    public boolean isCategory1() {
        switch (this.basicType) {
            case 4:
            case 7:
                return false;
            case 5:
            case 6:
            default:
                return true;
        }
    }

    public boolean isCategory2() {
        switch (this.basicType) {
            case 4:
            case 7:
                return true;
            case 5:
            case 6:
            default:
                return false;
        }
    }

    public boolean isIntlike() {
        switch (this.basicType) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 8:
                return true;
            case 4:
            case 5:
            case 7:
            default:
                return false;
        }
    }

    public boolean isPrimitive() {
        switch (this.basicType) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public boolean isReference() {
        return this.basicType == 9;
    }

    public boolean isArray() {
        return this.descriptor.charAt(0) == '[';
    }

    public boolean isArrayOrKnownNull() {
        return isArray() || equals(KNOWN_NULL);
    }

    public boolean isUninitialized() {
        return this.newAt >= 0;
    }

    public int getNewAt() {
        return this.newAt;
    }

    public Type getInitializedType() {
        if (this.initializedType == null) {
            throw new IllegalArgumentException(new StringBuffer().append("initialized type: ").append(this.descriptor).toString());
        }
        return this.initializedType;
    }

    public Type getArrayType() {
        if (this.arrayType == null) {
            this.arrayType = putIntern(new Type(new StringBuffer().append('[').append(this.descriptor).toString(), 9));
        }
        return this.arrayType;
    }

    public Type getComponentType() {
        if (this.componentType == null) {
            if (this.descriptor.charAt(0) != '[') {
                throw new IllegalArgumentException(new StringBuffer().append("not an array type: ").append(this.descriptor).toString());
            }
            this.componentType = intern(this.descriptor.substring(1));
        }
        return this.componentType;
    }

    public Type asUninitialized(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newAt < 0");
        }
        if (!isReference()) {
            throw new IllegalArgumentException(new StringBuffer().append("not a reference type: ").append(this.descriptor).toString());
        }
        if (isUninitialized()) {
            throw new IllegalArgumentException(new StringBuffer().append("already uninitialized: ").append(this.descriptor).toString());
        }
        Type type = new Type(new StringBuffer().append(new StringBuffer().append('N').append(Hex.m7225u2(i)).toString()).append(this.descriptor).toString(), 9, i);
        type.initializedType = this;
        return putIntern(type);
    }

    private static Type putIntern(Type type) {
        Type typePutIfAbsent = internTable.putIfAbsent(type.getDescriptor(), type);
        return typePutIfAbsent != null ? typePutIfAbsent : type;
    }

    public static void clearInternTable() {
        internTable.clear();
        initInterns();
    }
}
