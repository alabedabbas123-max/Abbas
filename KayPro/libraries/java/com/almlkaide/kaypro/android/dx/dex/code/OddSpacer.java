package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;

public final class OddSpacer extends VariableSizeInsn {
    public OddSpacer(SourcePosition sourcePosition) {
        super(sourcePosition, RegisterSpecList.EMPTY);
    }

    @Override
    public int codeSize() {
        return getAddress() & 1;
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput) {
        if (codeSize() != 0) {
            annotatedOutput.writeShort(InsnFormat.codeUnit(0, 0));
        }
    }

    @Override
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new OddSpacer(getPosition());
    }

    @Override
    protected String argString() {
        return (String) null;
    }

    @Override
    protected String listingString0(boolean z) {
        return codeSize() == 0 ? (String) null : "nop // spacer";
    }
}
