package com.almlkaide.kaypro.android.dx.io.instructions;

import com.almlkaide.kaypro.android.dx.io.IndexType;

public final class PackedSwitchPayloadDecodedInstruction extends DecodedInstruction {
    private final int firstKey;
    private final int[] targets;

    public PackedSwitchPayloadDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, int[] iArr) {
        super(instructionCodec, i, 0, (IndexType) null, 0, 0L);
        this.firstKey = i2;
        this.targets = iArr;
    }

    @Override
    public int getRegisterCount() {
        return 0;
    }

    public int getFirstKey() {
        return this.firstKey;
    }

    public int[] getTargets() {
        return this.targets;
    }

    @Override
    public DecodedInstruction withIndex(int i) {
        throw new UnsupportedOperationException("no index in instruction");
    }
}
