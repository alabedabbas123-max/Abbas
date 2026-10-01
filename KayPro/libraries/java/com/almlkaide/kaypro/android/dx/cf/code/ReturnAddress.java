package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class ReturnAddress implements TypeBearer {
    private final int subroutineAddress;

    public ReturnAddress(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("subroutineAddress < 0");
        }
        this.subroutineAddress = i;
    }

    public String toString() {
        return new StringBuffer().append(new StringBuffer().append("<addr:").append(Hex.m7225u2(this.subroutineAddress)).toString()).append(">").toString();
    }

    @Override
    public String toHuman() {
        return toString();
    }

    @Override
    public Type getType() {
        return Type.RETURN_ADDRESS;
    }

    @Override
    public TypeBearer getFrameType() {
        return this;
    }

    @Override
    public int getBasicType() {
        return Type.RETURN_ADDRESS.getBasicType();
    }

    @Override
    public int getBasicFrameType() {
        return Type.RETURN_ADDRESS.getBasicFrameType();
    }

    @Override
    public boolean isConstant() {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReturnAddress) && this.subroutineAddress == ((ReturnAddress) obj).subroutineAddress;
    }

    public int hashCode() {
        return this.subroutineAddress;
    }

    public int getSubroutineAddress() {
        return this.subroutineAddress;
    }
}
