package com.almlkaide.kaypro.android.dx.io.instructions;

import com.almlkaide.kaypro.android.dx.io.IndexType;

public class InvokePolymorphicRangeDecodedInstruction extends DecodedInstruction {

    private final int f5045c;
    private final int protoIndex;
    private final int registerCount;

    public InvokePolymorphicRangeDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, int i4, int i5) {
        super(instructionCodec, i, i2, indexType, 0, 0);
        if (i5 != ((short) i5)) {
            throw new IllegalArgumentException(new StringBuffer().append("protoIndex doesn't fit in a short: ").append(i5).toString());
        }
        this.f5045c = i3;
        this.registerCount = i4;
        this.protoIndex = i5;
    }

    @Override
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override
    public int getC() {
        return this.f5045c;
    }

    @Override
    public DecodedInstruction withProtoIndex(int i, int i2) {
        return new InvokePolymorphicRangeDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), this.f5045c, this.registerCount, i2);
    }

    @Override
    public DecodedInstruction withIndex(int i) {
        throw new UnsupportedOperationException(new StringBuffer().append("use withProtoIndex to update both the method and proto indices for ").append("invoke-polymorphic/range").toString());
    }

    @Override
    public short getProtoIndex() {
        return (short) this.protoIndex;
    }
}
