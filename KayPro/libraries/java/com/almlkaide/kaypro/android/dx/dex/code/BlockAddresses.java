package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.BasicBlock;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlockList;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;

public final class BlockAddresses {
    private final CodeAddress[] ends;
    private final CodeAddress[] lasts;
    private final CodeAddress[] starts;

    public BlockAddresses(RopMethod ropMethod) {
        int maxLabel = ropMethod.getBlocks().getMaxLabel();
        this.starts = new CodeAddress[maxLabel];
        this.lasts = new CodeAddress[maxLabel];
        this.ends = new CodeAddress[maxLabel];
        setupArrays(ropMethod);
    }

    public CodeAddress getStart(BasicBlock basicBlock) {
        return this.starts[basicBlock.getLabel()];
    }

    public CodeAddress getStart(int i) {
        return this.starts[i];
    }

    public CodeAddress getLast(BasicBlock basicBlock) {
        return this.lasts[basicBlock.getLabel()];
    }

    public CodeAddress getLast(int i) {
        return this.lasts[i];
    }

    public CodeAddress getEnd(BasicBlock basicBlock) {
        return this.ends[basicBlock.getLabel()];
    }

    public CodeAddress getEnd(int i) {
        return this.ends[i];
    }

    private void setupArrays(RopMethod ropMethod) {
        BasicBlockList blocks = ropMethod.getBlocks();
        int size = blocks.size();
        for (int i = 0; i < size; i++) {
            BasicBlock basicBlockM7181get = blocks.m7181get(i);
            int label = basicBlockM7181get.getLabel();
            this.starts[label] = new CodeAddress(basicBlockM7181get.getInsns().m7183get(0).getPosition());
            SourcePosition position = basicBlockM7181get.getLastInsn().getPosition();
            this.lasts[label] = new CodeAddress(position);
            this.ends[label] = new CodeAddress(position);
        }
    }
}
