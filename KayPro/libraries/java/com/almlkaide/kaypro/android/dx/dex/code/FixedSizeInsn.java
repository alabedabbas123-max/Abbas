package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;

public abstract class FixedSizeInsn extends DalvInsn {
    public FixedSizeInsn(Dop c1680Dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(c1680Dop, sourcePosition, registerSpecList);
    }

    @Override
    public final int codeSize() {
        return getOpcode().getFormat().codeSize();
    }

    @Override
    public final void writeTo(AnnotatedOutput annotatedOutput) {
        getOpcode().getFormat().writeTo(annotatedOutput, this);
    }

    @Override
    public final DalvInsn withRegisterOffset(int i) {
        return withRegisters(getRegisters().withOffset(i));
    }

    @Override
    protected final String listingString0(boolean z) {
        return getOpcode().getFormat().listingString(this, z);
    }
}
