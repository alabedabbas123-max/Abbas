package com.almlkaide.kaypro.android.dx.io.instructions;

import com.almlkaide.kaypro.android.dx.io.IndexType;

public final class ThreeRegisterDecodedInstruction extends DecodedInstruction {

    private final int f5048a;

    private final int f5049b;

    private final int f5050c;

    public ThreeRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5, int i6) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f5048a = i4;
        this.f5049b = i5;
        this.f5050c = i6;
    }

    @Override
    public int getRegisterCount() {
        return 3;
    }

    @Override
    public int getA() {
        return this.f5048a;
    }

    @Override
    public int getB() {
        return this.f5049b;
    }

    @Override
    public int getC() {
        return this.f5050c;
    }

    @Override
    public DecodedInstruction withIndex(int i) {
        return new ThreeRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f5048a, this.f5049b, this.f5050c);
    }
}
