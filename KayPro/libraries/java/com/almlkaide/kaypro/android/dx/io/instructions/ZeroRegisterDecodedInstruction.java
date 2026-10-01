package com.almlkaide.kaypro.android.dx.io.instructions;

import com.almlkaide.kaypro.android.dx.io.IndexType;

public final class ZeroRegisterDecodedInstruction extends DecodedInstruction {
    public ZeroRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j) {
        super(instructionCodec, i, i2, indexType, i3, j);
    }

    @Override
    public int getRegisterCount() {
        return 0;
    }

    @Override
    public DecodedInstruction withIndex(int i) {
        return new ZeroRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral());
    }
}
