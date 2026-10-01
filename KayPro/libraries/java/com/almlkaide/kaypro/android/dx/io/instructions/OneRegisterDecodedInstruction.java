package com.almlkaide.kaypro.android.dx.io.instructions;

import com.almlkaide.kaypro.android.dx.io.IndexType;

public final class OneRegisterDecodedInstruction extends DecodedInstruction {

    private final int f5046a;

    public OneRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f5046a = i4;
    }

    @Override
    public int getRegisterCount() {
        return 1;
    }

    @Override
    public int getA() {
        return this.f5046a;
    }

    @Override
    public DecodedInstruction withIndex(int i) {
        return new OneRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f5046a);
    }
}
