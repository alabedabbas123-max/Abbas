package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Prototype;
import com.almlkaide.kaypro.android.dx.rop.type.Type;

public final class CstProtoRef extends TypedConstant {
    private final Prototype prototype;

    public CstProtoRef(Prototype prototype) {
        this.prototype = prototype;
    }

    public static CstProtoRef make(CstString cstString) {
        return new CstProtoRef(Prototype.fromDescriptor(cstString.getString()));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CstProtoRef)) {
            return false;
        }
        return getPrototype().equals(((CstProtoRef) obj).getPrototype());
    }

    public int hashCode() {
        return this.prototype.hashCode();
    }

    @Override
    public boolean isCategory2() {
        return false;
    }

    @Override
    public String typeName() {
        return "proto";
    }

    @Override
    protected int compareTo0(Constant constant) {
        return this.prototype.compareTo2(((CstProtoRef) constant).getPrototype());
    }

    @Override
    public String toHuman() {
        return this.prototype.getDescriptor();
    }

    public final String toString() {
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(typeName()).append("{").toString()).append(toHuman()).toString()).append('}').toString();
    }

    public Prototype getPrototype() {
        return this.prototype;
    }

    @Override
    public Type getType() {
        return Type.METHOD_TYPE;
    }
}
