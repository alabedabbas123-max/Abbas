package org.objectweb.asm.tree.analysis;

import org.objectweb.asm.Type;

public class BasicValue implements Value {
    public static final BasicValue DOUBLE_VALUE;
    public static final BasicValue FLOAT_VALUE;
    public static final BasicValue INT_VALUE;
    public static final BasicValue LONG_VALUE;
    public static final BasicValue REFERENCE_VALUE;
    public static final BasicValue RETURNADDRESS_VALUE;
    public static final BasicValue UNINITIALIZED_VALUE;
    private final Type type;

    static {
        _clinit_();
        UNINITIALIZED_VALUE = new BasicValue(null);
        INT_VALUE = new BasicValue(Type.INT_TYPE);
        FLOAT_VALUE = new BasicValue(Type.FLOAT_TYPE);
        LONG_VALUE = new BasicValue(Type.LONG_TYPE);
        DOUBLE_VALUE = new BasicValue(Type.DOUBLE_TYPE);
        REFERENCE_VALUE = new BasicValue(Type.getObjectType("java/lang/Object"));
        RETURNADDRESS_VALUE = new BasicValue(Type.VOID_TYPE);
    }

    public BasicValue(Type type) {
        this.type = type;
    }

    static void _clinit_() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BasicValue)) {
            return false;
        }
        if (this.type == null) {
            return ((BasicValue) obj).type == null;
        }
        return this.type.equals(((BasicValue) obj).type);
    }

    @Override
    public int getSize() {
        return (this.type == Type.LONG_TYPE || this.type == Type.DOUBLE_TYPE) ? 2 : 1;
    }

    public Type getType() {
        return this.type;
    }

    public int hashCode() {
        if (this.type == null) {
            return 0;
        }
        return this.type.hashCode();
    }

    public boolean isReference() {
        return this.type != null && (this.type.getSort() == 10 || this.type.getSort() == 9);
    }

    public String toString() {
        if (this == UNINITIALIZED_VALUE) {
            return ".";
        }
        if (this == RETURNADDRESS_VALUE) {
            return "A";
        }
        return this == REFERENCE_VALUE ? "R" : this.type.getDescriptor();
    }
}
