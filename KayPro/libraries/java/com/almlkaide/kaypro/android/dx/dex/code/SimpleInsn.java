package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;

public final class SimpleInsn extends FixedSizeInsn {
    public SimpleInsn(Dop c1680Dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(c1680Dop, sourcePosition, registerSpecList);
    }

    @Override
    public DalvInsn withOpcode(Dop c1680Dop) {
        return new SimpleInsn(c1680Dop, getPosition(), getRegisters());
    }

    @Override
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new SimpleInsn(getOpcode(), getPosition(), registerSpecList);
    }

    @Override
    protected String argString() {
        return (String) null;
    }
}
