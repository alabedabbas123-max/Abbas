package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Type;

public final class CstMethodHandle extends TypedConstant {
    public static final int METHOD_HANDLE_TYPE_INSTANCE_GET = 3;
    public static final int METHOD_HANDLE_TYPE_INSTANCE_PUT = 2;
    public static final int METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR = 6;
    public static final int METHOD_HANDLE_TYPE_INVOKE_DIRECT = 7;
    public static final int METHOD_HANDLE_TYPE_INVOKE_INSTANCE = 5;
    public static final int METHOD_HANDLE_TYPE_INVOKE_INTERFACE = 8;
    public static final int METHOD_HANDLE_TYPE_INVOKE_STATIC = 4;
    public static final int METHOD_HANDLE_TYPE_STATIC_GET = 1;
    public static final int METHOD_HANDLE_TYPE_STATIC_PUT = 0;
    private static final String[] TYPE_NAMES = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};

    private final Constant f5076ref;
    private final int type;

    public static CstMethodHandle make(int i, Constant constant) {
        if (isAccessor(i)) {
            if (!(constant instanceof CstFieldRef)) {
                throw new IllegalArgumentException(new StringBuffer().append("ref has wrong type: ").append(constant.getClass()).toString());
            }
        } else if (isInvocation(i)) {
            if (!(constant instanceof CstBaseMethodRef)) {
                throw new IllegalArgumentException(new StringBuffer().append("ref has wrong type: ").append(constant.getClass()).toString());
            }
        } else {
            throw new IllegalArgumentException(new StringBuffer().append("type is out of range: ").append(i).toString());
        }
        return new CstMethodHandle(i, constant);
    }

    CstMethodHandle(int i, Constant constant) {
        this.type = i;
        this.f5076ref = constant;
    }

    public Constant getRef() {
        return this.f5076ref;
    }

    public int getMethodHandleType() {
        return this.type;
    }

    public static boolean isAccessor(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public boolean isAccessor() {
        return isAccessor(this.type);
    }

    public static boolean isInvocation(int i) {
        switch (i) {
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

    public boolean isInvocation() {
        return isInvocation(this.type);
    }

    public static String getMethodHandleTypeName(int i) {
        return TYPE_NAMES[i];
    }

    @Override
    public boolean isCategory2() {
        return false;
    }

    @Override
    protected int compareTo0(Constant constant) {
        CstMethodHandle cstMethodHandle = (CstMethodHandle) constant;
        return getMethodHandleType() == cstMethodHandle.getMethodHandleType() ? getRef().compareTo2(cstMethodHandle.getRef()) : Integer.compare(getMethodHandleType(), cstMethodHandle.getMethodHandleType());
    }

    public String toString() {
        return new StringBuffer().append(new StringBuffer().append("method-handle{").append(toHuman()).toString()).append("}").toString();
    }

    @Override
    public String typeName() {
        return "method handle";
    }

    @Override
    public String toHuman() {
        return new StringBuffer().append(new StringBuffer().append(getMethodHandleTypeName(this.type)).append(",").toString()).append(this.f5076ref.toString()).toString();
    }

    @Override
    public Type getType() {
        return Type.METHOD_HANDLE;
    }
}
