package com.almlkaide.kaypro.android.dx.io.instructions;

import com.almlkaide.kaypro.android.dx.io.IndexType;

public class InvokePolymorphicDecodedInstruction extends DecodedInstruction {
    private final int protoIndex;
    private final int[] registers;

    public InvokePolymorphicDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, int[] iArr) {
        super(instructionCodec, i, i2, indexType, 0, 0);
        if (i3 != ((short) i3)) {
            throw new IllegalArgumentException(new StringBuffer().append("protoIndex doesn't fit in a short: ").append(i3).toString());
        }
        this.protoIndex = i3;
        this.registers = iArr;
    }

    @Override
    public int getRegisterCount() {
        return this.registers.length;
    }

    @Override
    public DecodedInstruction withIndex(int i) {
        throw new UnsupportedOperationException(new StringBuffer().append("use withProtoIndex to update both the method and proto indices for").append(" invoke-polymorphic").toString());
    }

    @Override
    public DecodedInstruction withProtoIndex(int i, int i2) {
        return new InvokePolymorphicDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), i2, this.registers);
    }

    @Override
    public int getC() {
        if (this.registers.length > 0) {
            return this.registers[0];
        }
        return 0;
    }

    @Override
    public int getD() {
        if (this.registers.length > 1) {
            return this.registers[1];
        }
        return 0;
    }

    @Override
    public int getE() {
        if (this.registers.length > 2) {
            return this.registers[2];
        }
        return 0;
    }

    public int getF() {
        if (this.registers.length > 3) {
            return this.registers[3];
        }
        return 0;
    }

    public int getG() {
        if (this.registers.length > 4) {
            return this.registers[4];
        }
        return 0;
    }

    @Override
    public short getProtoIndex() {
        return (short) this.protoIndex;
    }
}
