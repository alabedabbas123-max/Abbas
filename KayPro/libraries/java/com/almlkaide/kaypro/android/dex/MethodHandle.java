package com.almlkaide.kaypro.android.dex;

import com.almlkaide.kaypro.android.dex.util.Unsigned;

public class MethodHandle implements Comparable<MethodHandle> {

    private final Dex f4977dex;
    private final int fieldOrMethodId;
    private final MethodHandleType methodHandleType;
    private final int unused1;
    private final int unused2;

    @Override
    public int compareTo(MethodHandle methodHandle) {
        return compareTo2(methodHandle);
    }

    public enum MethodHandleType {
        METHOD_HANDLE_TYPE_STATIC_PUT(0),
        METHOD_HANDLE_TYPE_STATIC_GET(1),
        METHOD_HANDLE_TYPE_INSTANCE_PUT(2),
        METHOD_HANDLE_TYPE_INSTANCE_GET(3),
        METHOD_HANDLE_TYPE_INVOKE_STATIC(4),
        METHOD_HANDLE_TYPE_INVOKE_INSTANCE(5),
        METHOD_HANDLE_TYPE_INVOKE_DIRECT(6),
        METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR(7),
        METHOD_HANDLE_TYPE_INVOKE_INTERFACE(8);

        private final int value;

        public static MethodHandleType valueOf(String str) {
            for (MethodHandleType methodHandleType : values()) {
                if (methodHandleType.name().equals(str)) {
                    return methodHandleType;
                }
            }
            throw new IllegalArgumentException();
        }

        MethodHandleType(int i) {
            this.value = i;
        }

        static MethodHandleType fromValue(int i) {
            for (MethodHandleType methodHandleType : values()) {
                if (methodHandleType.value == i) {
                    return methodHandleType;
                }
            }
            throw new IllegalArgumentException(String.valueOf(i));
        }

        public boolean isField() {
            if (this == METHOD_HANDLE_TYPE_STATIC_PUT || this == METHOD_HANDLE_TYPE_STATIC_GET || this == METHOD_HANDLE_TYPE_INSTANCE_PUT || this == METHOD_HANDLE_TYPE_INSTANCE_GET) {
                return true;
            }
            return false;
        }
    }

    public MethodHandle(Dex c1679Dex, MethodHandleType methodHandleType, int i, int i2, int i3) {
        this.f4977dex = c1679Dex;
        this.methodHandleType = methodHandleType;
        this.unused1 = i;
        this.fieldOrMethodId = i2;
        this.unused2 = i3;
    }

    public int compareTo2(MethodHandle methodHandle) {
        return this.methodHandleType != methodHandle.methodHandleType ? this.methodHandleType.compareTo(methodHandle.methodHandleType) : Unsigned.compare(this.fieldOrMethodId, methodHandle.fieldOrMethodId);
    }

    public MethodHandleType getMethodHandleType() {
        return this.methodHandleType;
    }

    public int getUnused1() {
        return this.unused1;
    }

    public int getFieldOrMethodId() {
        return this.fieldOrMethodId;
    }

    public int getUnused2() {
        return this.unused2;
    }

    public void writeTo(Dex.Section section) {
        section.writeUnsignedShort(this.methodHandleType.value);
        section.writeUnsignedShort(this.unused1);
        section.writeUnsignedShort(this.fieldOrMethodId);
        section.writeUnsignedShort(this.unused2);
    }

    public String toString() {
        if (this.f4977dex == null) {
            return new StringBuffer().append(new StringBuffer().append(this.methodHandleType).append(" ").toString()).append(this.fieldOrMethodId).toString();
        }
        return new StringBuffer().append(new StringBuffer().append(this.methodHandleType).append(" ").toString()).append(this.methodHandleType.isField() ? this.f4977dex.fieldIds().get(this.fieldOrMethodId) : this.f4977dex.methodIds().get(this.fieldOrMethodId)).toString();
    }
}
