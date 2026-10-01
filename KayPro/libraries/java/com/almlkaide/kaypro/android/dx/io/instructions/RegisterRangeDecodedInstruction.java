package com.almlkaide.kaypro.android.dx.io.instructions;

import com.almlkaide.kaypro.android.dx.io.IndexType;

public final class RegisterRangeDecodedInstruction extends DecodedInstruction {

    private final int f5047a;
    private final int registerCount;

    public RegisterRangeDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f5047a = i4;
        this.registerCount = i5;
    }

    @Override
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override
    public int getA() {
        return this.f5047a;
    }

    @Override
    public DecodedInstruction withIndex(int i) {
        return new RegisterRangeDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f5047a, this.registerCount);
    }
}
