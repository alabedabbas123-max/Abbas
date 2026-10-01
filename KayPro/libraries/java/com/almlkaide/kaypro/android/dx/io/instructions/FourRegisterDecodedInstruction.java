package com.almlkaide.kaypro.android.dx.io.instructions;

import com.almlkaide.kaypro.android.dx.io.IndexType;

public final class FourRegisterDecodedInstruction extends DecodedInstruction {

    private final int f5041a;

    private final int f5042b;

    private final int f5043c;

    private final int f5044d;

    public FourRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5, int i6, int i7) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f5041a = i4;
        this.f5042b = i5;
        this.f5043c = i6;
        this.f5044d = i7;
    }

    @Override
    public int getRegisterCount() {
        return 4;
    }

    @Override
    public int getA() {
        return this.f5041a;
    }

    @Override
    public int getB() {
        return this.f5042b;
    }

    @Override
    public int getC() {
        return this.f5043c;
    }

    @Override
    public int getD() {
        return this.f5044d;
    }

    @Override
    public DecodedInstruction withIndex(int i) {
        return new FourRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f5041a, this.f5042b, this.f5043c, this.f5044d);
    }
}
