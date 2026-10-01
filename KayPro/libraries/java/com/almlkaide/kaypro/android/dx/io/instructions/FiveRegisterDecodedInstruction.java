package com.almlkaide.kaypro.android.dx.io.instructions;

import com.almlkaide.kaypro.android.dx.io.IndexType;

public final class FiveRegisterDecodedInstruction extends DecodedInstruction {

    private final int f5036a;

    private final int f5037b;

    private final int f5038c;

    private final int f5039d;

    private final int f5040e;

    public FiveRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5, int i6, int i7, int i8) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f5036a = i4;
        this.f5037b = i5;
        this.f5038c = i6;
        this.f5039d = i7;
        this.f5040e = i8;
    }

    @Override
    public int getRegisterCount() {
        return 5;
    }

    @Override
    public int getA() {
        return this.f5036a;
    }

    @Override
    public int getB() {
        return this.f5037b;
    }

    @Override
    public int getC() {
        return this.f5038c;
    }

    @Override
    public int getD() {
        return this.f5039d;
    }

    @Override
    public int getE() {
        return this.f5040e;
    }

    @Override
    public DecodedInstruction withIndex(int i) {
        return new FiveRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f5036a, this.f5037b, this.f5038c, this.f5039d, this.f5040e);
    }
}
