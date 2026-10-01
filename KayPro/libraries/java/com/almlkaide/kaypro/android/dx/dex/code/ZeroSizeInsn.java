package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;

public abstract class ZeroSizeInsn extends DalvInsn {
    @Override
    public final void writeTo(AnnotatedOutput annotatedOutput) {
    }

    public ZeroSizeInsn(SourcePosition sourcePosition) {
        super(Dops.SPECIAL_FORMAT, sourcePosition, RegisterSpecList.EMPTY);
    }

    @Override
    public final int codeSize() {
        return 0;
    }

    @Override
    public final DalvInsn withOpcode(Dop c1680Dop) {
        throw new RuntimeException("unsupported");
    }

    @Override
    public DalvInsn withRegisterOffset(int i) {
        return withRegisters(getRegisters().withOffset(i));
    }
}
