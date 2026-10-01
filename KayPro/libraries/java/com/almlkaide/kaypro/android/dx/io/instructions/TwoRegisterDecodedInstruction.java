package com.almlkaide.kaypro.android.dx.io.instructions;

import com.almlkaide.kaypro.android.dx.io.IndexType;

public final class TwoRegisterDecodedInstruction extends DecodedInstruction {

    private final int f5051a;

    private final int f5052b;

    public TwoRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f5051a = i4;
        this.f5052b = i5;
    }

    @Override
    public int getRegisterCount() {
        return 2;
    }

    @Override
    public int getA() {
        return this.f5051a;
    }

    @Override
    public int getB() {
        return this.f5052b;
    }

    @Override
    public DecodedInstruction withIndex(int i) {
        return new TwoRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f5051a, this.f5052b);
    }
}
