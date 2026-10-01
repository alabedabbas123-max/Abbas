package com.sun.tools.javac.jvm;

import com.sun.tools.javac.code.Type;

class UninitializedType extends Type.DelegatedType {
    public static final int UNINITIALIZED_OBJECT = 23;
    public static final int UNINITIALIZED_THIS = 22;
    public final int offset;

    public static UninitializedType uninitializedThis(Type qtype) {
        return new UninitializedType(22, qtype, -1);
    }

    public static UninitializedType uninitializedObject(Type qtype, int offset) {
        return new UninitializedType(23, qtype, offset);
    }

    private UninitializedType(int tag, Type qtype, int offset) {
        super(tag, qtype);
        this.offset = offset;
    }

    Type initializedType() {
        return this.qtype;
    }
}
