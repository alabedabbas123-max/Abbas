package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;

public abstract class VariableSizeInsn extends DalvInsn {
    public VariableSizeInsn(SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(Dops.SPECIAL_FORMAT, sourcePosition, registerSpecList);
    }

    @Override
    public final DalvInsn withOpcode(Dop c1680Dop) {
        throw new RuntimeException("unsupported");
    }

    @Override
    public final DalvInsn withRegisterOffset(int i) {
        return withRegisters(getRegisters().withOffset(i));
    }
}
